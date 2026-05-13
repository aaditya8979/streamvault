package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.collect.MapMaker;
import com.google.common.collect.MapMakerInternalMap.Segment;
import com.google.common.collect.MapMakerInternalMap.h;
import com.google.common.primitives.Ints;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes5.dex */
class MapMakerInternalMap<K, V, E extends h<K, V, E>, S extends Segment<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
    public static final int CONTAINS_VALUE_RETRIES = 3;
    public static final int DRAIN_MAX = 16;
    public static final int DRAIN_THRESHOLD = 63;
    public static final int MAXIMUM_CAPACITY = 1073741824;
    public static final int MAX_SEGMENTS = 65536;
    public static final v<Object, Object, d> UNSET_WEAK_VALUE_REFERENCE = new a();
    private static final long serialVersionUID = 5;
    public final int concurrencyLevel;
    public final transient i<K, V, E, S> entryHelper;
    public transient Set<Map.Entry<K, V>> entrySet;
    public final Equivalence<Object> keyEquivalence;
    public transient Set<K> keySet;
    public final transient int segmentMask;
    public final transient int segmentShift;
    public final transient Segment<K, V, E, S>[] segments;
    public transient Collection<V> values;

    public static abstract class AbstractSerializationProxy<K, V> extends p1<K, V> implements Serializable {
        private static final long serialVersionUID = 3;
        public final int concurrencyLevel;
        public transient ConcurrentMap<K, V> delegate;
        public final Equivalence<Object> keyEquivalence;
        public final Strength keyStrength;
        public final Equivalence<Object> valueEquivalence;
        public final Strength valueStrength;

        public AbstractSerializationProxy(Strength strength, Strength strength2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, int i10, ConcurrentMap<K, V> concurrentMap) {
            this.keyStrength = strength;
            this.valueStrength = strength2;
            this.keyEquivalence = equivalence;
            this.valueEquivalence = equivalence2;
            this.concurrencyLevel = i10;
            this.delegate = concurrentMap;
        }

        @Override // com.google.common.collect.p1, com.google.common.collect.q1, com.google.common.collect.r1
        /* JADX INFO: renamed from: delegate */
        public ConcurrentMap<K, V> g() {
            return this.delegate;
        }

        public void readEntries(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            while (true) {
                Object object = objectInputStream.readObject();
                if (object == null) {
                    return;
                }
                this.delegate.put((K) object, (V) objectInputStream.readObject());
            }
        }

        public MapMaker readMapMaker(ObjectInputStream objectInputStream) throws IOException {
            return new MapMaker().g(objectInputStream.readInt()).j(this.keyStrength).k(this.valueStrength).h(this.keyEquivalence).a(this.concurrencyLevel);
        }

        public void writeMapTo(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeInt(this.delegate.size());
            for (Map.Entry<K, V> entry : this.delegate.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject(null);
        }
    }

    public static abstract class Segment<K, V, E extends h<K, V, E>, S extends Segment<K, V, E, S>> extends ReentrantLock {
        public volatile int count;

        @Weak
        public final MapMakerInternalMap<K, V, E, S> map;
        public int modCount;
        public final AtomicInteger readCount = new AtomicInteger();
        public volatile AtomicReferenceArray<E> table;
        public int threshold;

        public Segment(MapMakerInternalMap<K, V, E, S> mapMakerInternalMap, int i10) {
            this.map = mapMakerInternalMap;
            initTable(newEntryArray(i10));
        }

        public static <K, V, E extends h<K, V, E>> boolean isCollected(E e10) {
            return e10.getValue() == null;
        }

        public abstract E castForTesting(h<K, V, ?> hVar);

        public void clear() {
            if (this.count != 0) {
                lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = this.table;
                    for (int i10 = 0; i10 < atomicReferenceArray.length(); i10++) {
                        atomicReferenceArray.set(i10, null);
                    }
                    maybeClearReferenceQueues();
                    this.readCount.set(0);
                    this.modCount++;
                    this.count = 0;
                } finally {
                    unlock();
                }
            }
        }

        public <T> void clearReferenceQueue(ReferenceQueue<T> referenceQueue) {
            while (referenceQueue.poll() != null) {
            }
        }

        public boolean clearValueForTesting(K k10, int i10, v<K, V, ? extends h<K, V, ?>> vVar) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i10;
                E e10 = atomicReferenceArray.get(length);
                for (h next = e10; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.b() == i10 && key != null && this.map.keyEquivalence.equivalent(k10, key)) {
                        if (((u) next).a() != vVar) {
                            return false;
                        }
                        atomicReferenceArray.set(length, (E) removeFromChain(e10, next));
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        public boolean containsKey(Object obj, int i10) {
            try {
                boolean z10 = false;
                if (this.count == 0) {
                    return false;
                }
                h liveEntry = getLiveEntry(obj, i10);
                if (liveEntry != null) {
                    if (liveEntry.getValue() != null) {
                        z10 = true;
                    }
                }
                return z10;
            } finally {
                postReadCleanup();
            }
        }

        public boolean containsValue(Object obj) {
            try {
                if (this.count != 0) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.table;
                    int length = atomicReferenceArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        for (E next = atomicReferenceArray.get(i10); next != null; next = next.getNext()) {
                            V liveValue = getLiveValue(next);
                            if (liveValue != null && this.map.valueEquivalence().equivalent(obj, liveValue)) {
                                postReadCleanup();
                                return true;
                            }
                        }
                    }
                }
                return false;
            } finally {
                postReadCleanup();
            }
        }

        public E copyEntry(E e10, E e11) {
            return (E) this.map.entryHelper.d(self(), e10, e11);
        }

        public E copyForTesting(h<K, V, ?> hVar, h<K, V, ?> hVar2) {
            return (E) this.map.entryHelper.d(self(), castForTesting(hVar), castForTesting(hVar2));
        }

        public void drainKeyReferenceQueue(ReferenceQueue<K> referenceQueue) {
            int i10 = 0;
            do {
                Reference<? extends K> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.map.reclaimKey((h) referencePoll);
                i10++;
            } while (i10 != 16);
        }

        public void drainValueReferenceQueue(ReferenceQueue<V> referenceQueue) {
            int i10 = 0;
            do {
                Reference<? extends V> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.map.reclaimValue((v) referencePoll);
                i10++;
            } while (i10 != 16);
        }

        public void expand() {
            AtomicReferenceArray<E> atomicReferenceArray = this.table;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i10 = this.count;
            AtomicReferenceArray<E> atomicReferenceArrayNewEntryArray = newEntryArray(length << 1);
            this.threshold = (atomicReferenceArrayNewEntryArray.length() * 3) / 4;
            int length2 = atomicReferenceArrayNewEntryArray.length() - 1;
            for (int i11 = 0; i11 < length; i11++) {
                E next = atomicReferenceArray.get(i11);
                if (next != null) {
                    h next2 = next.getNext();
                    int iB = next.b() & length2;
                    if (next2 == null) {
                        atomicReferenceArrayNewEntryArray.set(iB, next);
                    } else {
                        h hVar = next;
                        while (next2 != null) {
                            int iB2 = next2.b() & length2;
                            if (iB2 != iB) {
                                hVar = next2;
                                iB = iB2;
                            }
                            next2 = next2.getNext();
                        }
                        atomicReferenceArrayNewEntryArray.set(iB, hVar);
                        while (next != hVar) {
                            int iB3 = next.b() & length2;
                            h hVarCopyEntry = copyEntry(next, (h) atomicReferenceArrayNewEntryArray.get(iB3));
                            if (hVarCopyEntry != null) {
                                atomicReferenceArrayNewEntryArray.set(iB3, hVarCopyEntry);
                            } else {
                                i10--;
                            }
                            next = next.getNext();
                        }
                    }
                }
            }
            this.table = atomicReferenceArrayNewEntryArray;
            this.count = i10;
        }

        public V get(Object obj, int i10) {
            try {
                h liveEntry = getLiveEntry(obj, i10);
                if (liveEntry == null) {
                    return null;
                }
                V v10 = (V) liveEntry.getValue();
                if (v10 == null) {
                    tryDrainReferenceQueues();
                }
                return v10;
            } finally {
                postReadCleanup();
            }
        }

        public E getEntry(Object obj, int i10) {
            if (this.count == 0) {
                return null;
            }
            for (E e10 = (E) getFirst(i10); e10 != null; e10 = (E) e10.getNext()) {
                if (e10.b() == i10) {
                    Object key = e10.getKey();
                    if (key == null) {
                        tryDrainReferenceQueues();
                    } else if (this.map.keyEquivalence.equivalent(obj, key)) {
                        return e10;
                    }
                }
            }
            return null;
        }

        public E getFirst(int i10) {
            return this.table.get(i10 & (r0.length() - 1));
        }

        public ReferenceQueue<K> getKeyReferenceQueueForTesting() {
            throw new AssertionError();
        }

        public E getLiveEntry(Object obj, int i10) {
            return (E) getEntry(obj, i10);
        }

        public V getLiveValue(E e10) {
            if (e10.getKey() == null) {
                tryDrainReferenceQueues();
                return null;
            }
            V v10 = (V) e10.getValue();
            if (v10 != null) {
                return v10;
            }
            tryDrainReferenceQueues();
            return null;
        }

        public V getLiveValueForTesting(h<K, V, ?> hVar) {
            return getLiveValue(castForTesting(hVar));
        }

        public ReferenceQueue<V> getValueReferenceQueueForTesting() {
            throw new AssertionError();
        }

        public v<K, V, E> getWeakValueReferenceForTesting(h<K, V, ?> hVar) {
            throw new AssertionError();
        }

        public void initTable(AtomicReferenceArray<E> atomicReferenceArray) {
            this.threshold = (atomicReferenceArray.length() * 3) / 4;
            this.table = atomicReferenceArray;
        }

        public void maybeClearReferenceQueues() {
        }

        public void maybeDrainReferenceQueues() {
        }

        public AtomicReferenceArray<E> newEntryArray(int i10) {
            return new AtomicReferenceArray<>(i10);
        }

        public E newEntryForTesting(K k10, int i10, h<K, V, ?> hVar) {
            return (E) this.map.entryHelper.f(self(), k10, i10, castForTesting(hVar));
        }

        public v<K, V, E> newWeakValueReferenceForTesting(h<K, V, ?> hVar, V v10) {
            throw new AssertionError();
        }

        public void postReadCleanup() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                runCleanup();
            }
        }

        public void preWriteCleanup() {
            runLockedCleanup();
        }

        public V put(K k10, int i10, V v10, boolean z10) {
            lock();
            try {
                preWriteCleanup();
                int i11 = this.count + 1;
                if (i11 > this.threshold) {
                    expand();
                    i11 = this.count + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i10;
                E e10 = atomicReferenceArray.get(length);
                for (h next = e10; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.b() == i10 && key != null && this.map.keyEquivalence.equivalent(k10, key)) {
                        V v11 = (V) next.getValue();
                        if (v11 == null) {
                            this.modCount++;
                            setValue(next, v10);
                            this.count = this.count;
                            return null;
                        }
                        if (z10) {
                            return v11;
                        }
                        this.modCount++;
                        setValue(next, v10);
                        return v11;
                    }
                }
                this.modCount++;
                h hVarF = this.map.entryHelper.f(self(), k10, i10, e10);
                setValue(hVarF, v10);
                atomicReferenceArray.set(length, (E) hVarF);
                this.count = i11;
                return null;
            } finally {
                unlock();
            }
        }

        public boolean reclaimKey(E e10, int i10) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = i10 & (atomicReferenceArray.length() - 1);
                E e11 = atomicReferenceArray.get(length);
                for (h next = e11; next != null; next = next.getNext()) {
                    if (next == e10) {
                        this.modCount++;
                        h hVarRemoveFromChain = removeFromChain(e11, next);
                        int i11 = this.count - 1;
                        atomicReferenceArray.set(length, (E) hVarRemoveFromChain);
                        this.count = i11;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        public boolean reclaimValue(K k10, int i10, v<K, V, E> vVar) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i10;
                E e10 = atomicReferenceArray.get(length);
                for (h next = e10; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.b() == i10 && key != null && this.map.keyEquivalence.equivalent(k10, key)) {
                        if (((u) next).a() != vVar) {
                            return false;
                        }
                        this.modCount++;
                        h hVarRemoveFromChain = removeFromChain(e10, next);
                        int i11 = this.count - 1;
                        atomicReferenceArray.set(length, (E) hVarRemoveFromChain);
                        this.count = i11;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        public V remove(Object obj, int i10) {
            lock();
            try {
                preWriteCleanup();
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i10;
                E e10 = atomicReferenceArray.get(length);
                for (h next = e10; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.b() == i10 && key != null && this.map.keyEquivalence.equivalent(obj, key)) {
                        V v10 = (V) next.getValue();
                        if (v10 == null && !isCollected(next)) {
                            return null;
                        }
                        this.modCount++;
                        h hVarRemoveFromChain = removeFromChain(e10, next);
                        int i11 = this.count - 1;
                        atomicReferenceArray.set(length, (E) hVarRemoveFromChain);
                        this.count = i11;
                        return v10;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
        
            if (r8.map.valueEquivalence().equivalent(r11, r4.getValue()) == false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
        
            r5 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
        
            if (isCollected(r4) == false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
        
            r8.modCount++;
            r9 = removeFromChain(r3, r4);
            r10 = r8.count - 1;
            r0.set(r1, (E) r9);
            r8.count = r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
        
            return false;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean remove(java.lang.Object r9, int r10, java.lang.Object r11) {
            /*
                r8 = this;
                r8.lock()
                r8.preWriteCleanup()     // Catch: java.lang.Throwable -> L69
                java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$h<K, V, E>> r0 = r8.table     // Catch: java.lang.Throwable -> L69
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L69
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r10
                java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L69
                com.google.common.collect.MapMakerInternalMap$h r3 = (com.google.common.collect.MapMakerInternalMap.h) r3     // Catch: java.lang.Throwable -> L69
                r4 = r3
            L16:
                r5 = 0
                if (r4 == 0) goto L65
                java.lang.Object r6 = r4.getKey()     // Catch: java.lang.Throwable -> L69
                int r7 = r4.b()     // Catch: java.lang.Throwable -> L69
                if (r7 != r10) goto L60
                if (r6 == 0) goto L60
                com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$h<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r7 = r8.map     // Catch: java.lang.Throwable -> L69
                com.google.common.base.Equivalence<java.lang.Object> r7 = r7.keyEquivalence     // Catch: java.lang.Throwable -> L69
                boolean r6 = r7.equivalent(r9, r6)     // Catch: java.lang.Throwable -> L69
                if (r6 == 0) goto L60
                java.lang.Object r9 = r4.getValue()     // Catch: java.lang.Throwable -> L69
                com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$h<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r10 = r8.map     // Catch: java.lang.Throwable -> L69
                com.google.common.base.Equivalence r10 = r10.valueEquivalence()     // Catch: java.lang.Throwable -> L69
                boolean r9 = r10.equivalent(r11, r9)     // Catch: java.lang.Throwable -> L69
                if (r9 == 0) goto L41
                r5 = r2
                goto L47
            L41:
                boolean r9 = isCollected(r4)     // Catch: java.lang.Throwable -> L69
                if (r9 == 0) goto L5c
            L47:
                int r9 = r8.modCount     // Catch: java.lang.Throwable -> L69
                int r9 = r9 + r2
                r8.modCount = r9     // Catch: java.lang.Throwable -> L69
                com.google.common.collect.MapMakerInternalMap$h r9 = r8.removeFromChain(r3, r4)     // Catch: java.lang.Throwable -> L69
                int r10 = r8.count     // Catch: java.lang.Throwable -> L69
                int r10 = r10 - r2
                r0.set(r1, r9)     // Catch: java.lang.Throwable -> L69
                r8.count = r10     // Catch: java.lang.Throwable -> L69
                r8.unlock()
                return r5
            L5c:
                r8.unlock()
                return r5
            L60:
                com.google.common.collect.MapMakerInternalMap$h r4 = r4.getNext()     // Catch: java.lang.Throwable -> L69
                goto L16
            L65:
                r8.unlock()
                return r5
            L69:
                r9 = move-exception
                r8.unlock()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.Segment.remove(java.lang.Object, int, java.lang.Object):boolean");
        }

        public boolean removeEntryForTesting(E e10) {
            int iB = e10.b();
            AtomicReferenceArray<E> atomicReferenceArray = this.table;
            int length = iB & (atomicReferenceArray.length() - 1);
            E e11 = atomicReferenceArray.get(length);
            for (h next = e11; next != null; next = next.getNext()) {
                if (next == e10) {
                    this.modCount++;
                    h hVarRemoveFromChain = removeFromChain(e11, next);
                    int i10 = this.count - 1;
                    atomicReferenceArray.set(length, (E) hVarRemoveFromChain);
                    this.count = i10;
                    return true;
                }
            }
            return false;
        }

        public E removeFromChain(E e10, E e11) {
            int i10 = this.count;
            E e12 = (E) e11.getNext();
            while (e10 != e11) {
                h hVarCopyEntry = copyEntry(e10, e12);
                if (hVarCopyEntry != null) {
                    e12 = (E) hVarCopyEntry;
                } else {
                    i10--;
                }
                e10 = (E) e10.getNext();
            }
            this.count = i10;
            return e12;
        }

        public E removeFromChainForTesting(h<K, V, ?> hVar, h<K, V, ?> hVar2) {
            return (E) removeFromChain(castForTesting(hVar), castForTesting(hVar2));
        }

        public boolean removeTableEntryForTesting(h<K, V, ?> hVar) {
            return removeEntryForTesting(castForTesting(hVar));
        }

        public V replace(K k10, int i10, V v10) {
            lock();
            try {
                preWriteCleanup();
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i10;
                E e10 = atomicReferenceArray.get(length);
                for (h next = e10; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.b() == i10 && key != null && this.map.keyEquivalence.equivalent(k10, key)) {
                        V v11 = (V) next.getValue();
                        if (v11 != null) {
                            this.modCount++;
                            setValue(next, v10);
                            return v11;
                        }
                        if (isCollected(next)) {
                            this.modCount++;
                            h hVarRemoveFromChain = removeFromChain(e10, next);
                            int i11 = this.count - 1;
                            atomicReferenceArray.set(length, (E) hVarRemoveFromChain);
                            this.count = i11;
                        }
                        return null;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        public boolean replace(K k10, int i10, V v10, V v11) {
            lock();
            try {
                preWriteCleanup();
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i10;
                E e10 = atomicReferenceArray.get(length);
                for (h next = e10; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.b() == i10 && key != null && this.map.keyEquivalence.equivalent(k10, key)) {
                        Object value = next.getValue();
                        if (value != null) {
                            if (!this.map.valueEquivalence().equivalent(v10, value)) {
                                return false;
                            }
                            this.modCount++;
                            setValue(next, v11);
                            return true;
                        }
                        if (isCollected(next)) {
                            this.modCount++;
                            h hVarRemoveFromChain = removeFromChain(e10, next);
                            int i11 = this.count - 1;
                            atomicReferenceArray.set(length, (E) hVarRemoveFromChain);
                            this.count = i11;
                        }
                        return false;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        public void runCleanup() {
            runLockedCleanup();
        }

        public void runLockedCleanup() {
            if (tryLock()) {
                try {
                    maybeDrainReferenceQueues();
                    this.readCount.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public abstract S self();

        public void setTableEntryForTesting(int i10, h<K, V, ?> hVar) {
            this.table.set(i10, (E) castForTesting(hVar));
        }

        public void setValue(E e10, V v10) {
            this.map.entryHelper.b(self(), e10, v10);
        }

        public void setValueForTesting(h<K, V, ?> hVar, V v10) {
            this.map.entryHelper.b(self(), castForTesting(hVar), v10);
        }

        public void setWeakValueReferenceForTesting(h<K, V, ?> hVar, v<K, V, ? extends h<K, V, ?>> vVar) {
            throw new AssertionError();
        }

        public void tryDrainReferenceQueues() {
            if (tryLock()) {
                try {
                    maybeDrainReferenceQueues();
                } finally {
                    unlock();
                }
            }
        }
    }

    public static final class SerializationProxy<K, V> extends AbstractSerializationProxy<K, V> {
        private static final long serialVersionUID = 3;

        public SerializationProxy(Strength strength, Strength strength2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, int i10, ConcurrentMap<K, V> concurrentMap) {
            super(strength, strength2, equivalence, equivalence2, i10, concurrentMap);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.delegate = readMapMaker(objectInputStream).i();
            readEntries(objectInputStream);
        }

        private Object readResolve() {
            return this.delegate;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            writeMapTo(objectOutputStream);
        }
    }

    public enum Strength {
        STRONG { // from class: com.google.common.collect.MapMakerInternalMap.Strength.1
            @Override // com.google.common.collect.MapMakerInternalMap.Strength
            public Equivalence<Object> defaultEquivalence() {
                return Equivalence.equals();
            }
        },
        WEAK { // from class: com.google.common.collect.MapMakerInternalMap.Strength.2
            @Override // com.google.common.collect.MapMakerInternalMap.Strength
            public Equivalence<Object> defaultEquivalence() {
                return Equivalence.identity();
            }
        };

        /* synthetic */ Strength(a aVar) {
            this();
        }

        public abstract Equivalence<Object> defaultEquivalence();
    }

    public static final class StrongKeyDummyValueSegment<K> extends Segment<K, MapMaker.Dummy, m<K>, StrongKeyDummyValueSegment<K>> {
        public StrongKeyDummyValueSegment(MapMakerInternalMap<K, MapMaker.Dummy, m<K>, StrongKeyDummyValueSegment<K>> mapMakerInternalMap, int i10) {
            super(mapMakerInternalMap, i10);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public m<K> castForTesting(h<K, MapMaker.Dummy, ?> hVar) {
            return (m) hVar;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public StrongKeyDummyValueSegment<K> self() {
            return this;
        }
    }

    public static final class StrongKeyStrongValueSegment<K, V> extends Segment<K, V, n<K, V>, StrongKeyStrongValueSegment<K, V>> {
        public StrongKeyStrongValueSegment(MapMakerInternalMap<K, V, n<K, V>, StrongKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i10) {
            super(mapMakerInternalMap, i10);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public n<K, V> castForTesting(h<K, V, ?> hVar) {
            return (n) hVar;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public StrongKeyStrongValueSegment<K, V> self() {
            return this;
        }
    }

    public static final class StrongKeyWeakValueSegment<K, V> extends Segment<K, V, o<K, V>, StrongKeyWeakValueSegment<K, V>> {
        private final ReferenceQueue<V> queueForValues;

        public StrongKeyWeakValueSegment(MapMakerInternalMap<K, V, o<K, V>, StrongKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i10) {
            super(mapMakerInternalMap, i10);
            this.queueForValues = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public o<K, V> castForTesting(h<K, V, ?> hVar) {
            return (o) hVar;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public ReferenceQueue<V> getValueReferenceQueueForTesting() {
            return this.queueForValues;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public v<K, V, o<K, V>> getWeakValueReferenceForTesting(h<K, V, ?> hVar) {
            return castForTesting((h) hVar).a();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeClearReferenceQueues() {
            clearReferenceQueue(this.queueForValues);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeDrainReferenceQueues() {
            drainValueReferenceQueue(this.queueForValues);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public v<K, V, o<K, V>> newWeakValueReferenceForTesting(h<K, V, ?> hVar, V v10) {
            return new w(this.queueForValues, v10, castForTesting((h) hVar));
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public StrongKeyWeakValueSegment<K, V> self() {
            return this;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void setWeakValueReferenceForTesting(h<K, V, ?> hVar, v<K, V, ? extends h<K, V, ?>> vVar) {
            o<K, V> oVarCastForTesting = castForTesting((h) hVar);
            v vVar2 = oVarCastForTesting.f23264c;
            oVarCastForTesting.f23264c = vVar;
            vVar2.clear();
        }
    }

    public static final class WeakKeyDummyValueSegment<K> extends Segment<K, MapMaker.Dummy, r<K>, WeakKeyDummyValueSegment<K>> {
        private final ReferenceQueue<K> queueForKeys;

        public WeakKeyDummyValueSegment(MapMakerInternalMap<K, MapMaker.Dummy, r<K>, WeakKeyDummyValueSegment<K>> mapMakerInternalMap, int i10) {
            super(mapMakerInternalMap, i10);
            this.queueForKeys = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public r<K> castForTesting(h<K, MapMaker.Dummy, ?> hVar) {
            return (r) hVar;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public ReferenceQueue<K> getKeyReferenceQueueForTesting() {
            return this.queueForKeys;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeClearReferenceQueues() {
            clearReferenceQueue(this.queueForKeys);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeDrainReferenceQueues() {
            drainKeyReferenceQueue(this.queueForKeys);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public WeakKeyDummyValueSegment<K> self() {
            return this;
        }
    }

    public static final class WeakKeyStrongValueSegment<K, V> extends Segment<K, V, s<K, V>, WeakKeyStrongValueSegment<K, V>> {
        private final ReferenceQueue<K> queueForKeys;

        public WeakKeyStrongValueSegment(MapMakerInternalMap<K, V, s<K, V>, WeakKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i10) {
            super(mapMakerInternalMap, i10);
            this.queueForKeys = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public s<K, V> castForTesting(h<K, V, ?> hVar) {
            return (s) hVar;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public ReferenceQueue<K> getKeyReferenceQueueForTesting() {
            return this.queueForKeys;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeClearReferenceQueues() {
            clearReferenceQueue(this.queueForKeys);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeDrainReferenceQueues() {
            drainKeyReferenceQueue(this.queueForKeys);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public WeakKeyStrongValueSegment<K, V> self() {
            return this;
        }
    }

    public static final class WeakKeyWeakValueSegment<K, V> extends Segment<K, V, t<K, V>, WeakKeyWeakValueSegment<K, V>> {
        private final ReferenceQueue<K> queueForKeys;
        private final ReferenceQueue<V> queueForValues;

        public WeakKeyWeakValueSegment(MapMakerInternalMap<K, V, t<K, V>, WeakKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i10) {
            super(mapMakerInternalMap, i10);
            this.queueForKeys = new ReferenceQueue<>();
            this.queueForValues = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public t<K, V> castForTesting(h<K, V, ?> hVar) {
            return (t) hVar;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public ReferenceQueue<K> getKeyReferenceQueueForTesting() {
            return this.queueForKeys;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public ReferenceQueue<V> getValueReferenceQueueForTesting() {
            return this.queueForValues;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public v<K, V, t<K, V>> getWeakValueReferenceForTesting(h<K, V, ?> hVar) {
            return castForTesting((h) hVar).a();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeClearReferenceQueues() {
            clearReferenceQueue(this.queueForKeys);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeDrainReferenceQueues() {
            drainKeyReferenceQueue(this.queueForKeys);
            drainValueReferenceQueue(this.queueForValues);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public v<K, V, t<K, V>> newWeakValueReferenceForTesting(h<K, V, ?> hVar, V v10) {
            return new w(this.queueForValues, v10, castForTesting((h) hVar));
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public WeakKeyWeakValueSegment<K, V> self() {
            return this;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void setWeakValueReferenceForTesting(h<K, V, ?> hVar, v<K, V, ? extends h<K, V, ?>> vVar) {
            t<K, V> tVarCastForTesting = castForTesting((h) hVar);
            v vVar2 = tVarCastForTesting.f23273b;
            tVarCastForTesting.f23273b = vVar;
            vVar2.clear();
        }
    }

    public class a implements v<Object, Object, d> {
        @Override // com.google.common.collect.MapMakerInternalMap.v
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public v<Object, Object, d> b(ReferenceQueue<Object> referenceQueue, d dVar) {
            return this;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.v
        public void clear() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.v
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public d a() {
            return null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.v
        public Object get() {
            return null;
        }
    }

    public static abstract class b<K, V, E extends h<K, V, E>> implements h<K, V, E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f23246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f23247b;

        public b(K k10, int i10) {
            this.f23246a = k10;
            this.f23247b = i10;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.h
        public final int b() {
            return this.f23247b;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.h
        public final K getKey() {
            return this.f23246a;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.h
        public E getNext() {
            return null;
        }
    }

    public static abstract class c<K, V, E extends h<K, V, E>> extends WeakReference<K> implements h<K, V, E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23248a;

        public c(ReferenceQueue<K> referenceQueue, K k10, int i10) {
            super(k10, referenceQueue);
            this.f23248a = i10;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.h
        public final int b() {
            return this.f23248a;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.h
        public final K getKey() {
            return get();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.h
        public E getNext() {
            return null;
        }
    }

    public static final class d implements h<Object, Object, d> {
        public d() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.h
        public int b() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.h
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public d getNext() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.h
        public Object getKey() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.h
        public Object getValue() {
            throw new AssertionError();
        }
    }

    public final class e extends MapMakerInternalMap<K, V, E, S>.g<Map.Entry<K, V>> {
        public e(MapMakerInternalMap mapMakerInternalMap) {
            super();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return c();
        }
    }

    public final class f extends l<Map.Entry<K, V>> {
        public f() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            MapMakerInternalMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = MapMakerInternalMap.this.get(key)) != null && MapMakerInternalMap.this.valueEquivalence().equivalent(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new e(MapMakerInternalMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && MapMakerInternalMap.this.remove(key, entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    public abstract class g<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f23250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f23251c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Segment<K, V, E, S> f23252d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public AtomicReferenceArray<E> f23253e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public E f23254f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public MapMakerInternalMap<K, V, E, S>.x f23255g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public MapMakerInternalMap<K, V, E, S>.x f23256h;

        public g() {
            this.f23250b = MapMakerInternalMap.this.segments.length - 1;
            a();
        }

        public final void a() {
            this.f23255g = null;
            if (d() || e()) {
                return;
            }
            while (true) {
                int i10 = this.f23250b;
                if (i10 < 0) {
                    return;
                }
                Segment<K, V, E, S>[] segmentArr = MapMakerInternalMap.this.segments;
                this.f23250b = i10 - 1;
                Segment<K, V, E, S> segment = segmentArr[i10];
                this.f23252d = segment;
                if (segment.count != 0) {
                    this.f23253e = this.f23252d.table;
                    this.f23251c = r0.length() - 1;
                    if (e()) {
                        return;
                    }
                }
            }
        }

        public boolean b(E e10) {
            boolean z10;
            try {
                Object key = e10.getKey();
                Object liveValue = MapMakerInternalMap.this.getLiveValue(e10);
                if (liveValue != null) {
                    this.f23255g = new x(key, liveValue);
                    z10 = true;
                } else {
                    z10 = false;
                }
                return z10;
            } finally {
                this.f23252d.postReadCleanup();
            }
        }

        public MapMakerInternalMap<K, V, E, S>.x c() {
            MapMakerInternalMap<K, V, E, S>.x xVar = this.f23255g;
            if (xVar == null) {
                throw new NoSuchElementException();
            }
            this.f23256h = xVar;
            a();
            return this.f23256h;
        }

        public boolean d() {
            E e10 = this.f23254f;
            if (e10 == null) {
                return false;
            }
            while (true) {
                this.f23254f = (E) e10.getNext();
                E e11 = this.f23254f;
                if (e11 == null) {
                    return false;
                }
                if (b(e11)) {
                    return true;
                }
                e10 = this.f23254f;
            }
        }

        public boolean e() {
            while (true) {
                int i10 = this.f23251c;
                if (i10 < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f23253e;
                this.f23251c = i10 - 1;
                E e10 = atomicReferenceArray.get(i10);
                this.f23254f = e10;
                if (e10 != null && (b(e10) || d())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23255g != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            j1.e(this.f23256h != null);
            MapMakerInternalMap.this.remove(this.f23256h.getKey());
            this.f23256h = null;
        }
    }

    public interface h<K, V, E extends h<K, V, E>> {
        int b();

        K getKey();

        E getNext();

        V getValue();
    }

    public interface i<K, V, E extends h<K, V, E>, S extends Segment<K, V, E, S>> {
        S a(MapMakerInternalMap<K, V, E, S> mapMakerInternalMap, int i10);

        void b(S s10, E e10, V v10);

        Strength c();

        E d(S s10, E e10, E e11);

        Strength e();

        E f(S s10, K k10, int i10, E e10);
    }

    public final class j extends MapMakerInternalMap<K, V, E, S>.g<K> {
        public j(MapMakerInternalMap mapMakerInternalMap) {
            super();
        }

        @Override // java.util.Iterator
        public K next() {
            return c().getKey();
        }
    }

    public final class k extends l<K> {
        public k() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            MapMakerInternalMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new j(MapMakerInternalMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return MapMakerInternalMap.this.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    public static abstract class l<E> extends AbstractSet<E> {
        public l() {
        }

        public /* synthetic */ l(a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return MapMakerInternalMap.a(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) MapMakerInternalMap.a(this).toArray(tArr);
        }
    }

    public static class m<K> extends b<K, MapMaker.Dummy, m<K>> {

        public static final class a<K> implements i<K, MapMaker.Dummy, m<K>, StrongKeyDummyValueSegment<K>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a<?> f23259a = new a<>();

            public static <K> a<K> h() {
                return (a<K>) f23259a;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            public Strength c() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            public Strength e() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public m<K> d(StrongKeyDummyValueSegment<K> strongKeyDummyValueSegment, m<K> mVar, m<K> mVar2) {
                return f(strongKeyDummyValueSegment, mVar.f23246a, mVar.f23247b, mVar2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public m<K> f(StrongKeyDummyValueSegment<K> strongKeyDummyValueSegment, K k10, int i10, m<K> mVar) {
                return mVar == null ? new m<>(k10, i10, null) : new b(k10, i10, mVar);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public StrongKeyDummyValueSegment<K> a(MapMakerInternalMap<K, MapMaker.Dummy, m<K>, StrongKeyDummyValueSegment<K>> mapMakerInternalMap, int i10) {
                return new StrongKeyDummyValueSegment<>(mapMakerInternalMap, i10);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void b(StrongKeyDummyValueSegment<K> strongKeyDummyValueSegment, m<K> mVar, MapMaker.Dummy dummy) {
            }
        }

        public static final class b<K> extends m<K> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final m<K> f23260c;

            public b(K k10, int i10, m<K> mVar) {
                super(k10, i10, null);
                this.f23260c = mVar;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.b, com.google.common.collect.MapMakerInternalMap.h
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public m<K> getNext() {
                return this.f23260c;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.m, com.google.common.collect.MapMakerInternalMap.h
            public /* bridge */ /* synthetic */ Object getValue() {
                return super.getValue();
            }
        }

        public m(K k10, int i10) {
            super(k10, i10);
        }

        public /* synthetic */ m(Object obj, int i10, a aVar) {
            this(obj, i10);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.h
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final MapMaker.Dummy getValue() {
            return MapMaker.Dummy.VALUE;
        }
    }

    public static class n<K, V> extends b<K, V, n<K, V>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile V f23261c;

        public static final class a<K, V> implements i<K, V, n<K, V>, StrongKeyStrongValueSegment<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a<?, ?> f23262a = new a<>();

            public static <K, V> a<K, V> h() {
                return (a<K, V>) f23262a;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            public Strength c() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            public Strength e() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public n<K, V> d(StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, n<K, V> nVar, n<K, V> nVar2) {
                n<K, V> nVarF = f(strongKeyStrongValueSegment, nVar.f23246a, nVar.f23247b, nVar2);
                nVarF.f23261c = nVar.f23261c;
                return nVarF;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public n<K, V> f(StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, K k10, int i10, n<K, V> nVar) {
                return nVar == null ? new n<>(k10, i10, null) : new b(k10, i10, nVar);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public StrongKeyStrongValueSegment<K, V> a(MapMakerInternalMap<K, V, n<K, V>, StrongKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i10) {
                return new StrongKeyStrongValueSegment<>(mapMakerInternalMap, i10);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void b(StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, n<K, V> nVar, V v10) {
                nVar.f23261c = v10;
            }
        }

        public static final class b<K, V> extends n<K, V> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final n<K, V> f23263d;

            public b(K k10, int i10, n<K, V> nVar) {
                super(k10, i10, null);
                this.f23263d = nVar;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.b, com.google.common.collect.MapMakerInternalMap.h
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public n<K, V> getNext() {
                return this.f23263d;
            }
        }

        public n(K k10, int i10) {
            super(k10, i10);
            this.f23261c = null;
        }

        public /* synthetic */ n(Object obj, int i10, a aVar) {
            this(obj, i10);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.h
        public final V getValue() {
            return this.f23261c;
        }
    }

    public static class o<K, V> extends b<K, V, o<K, V>> implements u<K, V, o<K, V>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile v<K, V, o<K, V>> f23264c;

        public static final class a<K, V> implements i<K, V, o<K, V>, StrongKeyWeakValueSegment<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a<?, ?> f23265a = new a<>();

            public static <K, V> a<K, V> h() {
                return (a<K, V>) f23265a;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            public Strength c() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            public Strength e() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public o<K, V> d(StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, o<K, V> oVar, o<K, V> oVar2) {
                if (Segment.isCollected(oVar)) {
                    return null;
                }
                o<K, V> oVarF = f(strongKeyWeakValueSegment, oVar.f23246a, oVar.f23247b, oVar2);
                oVarF.f23264c = oVar.f23264c.b(((StrongKeyWeakValueSegment) strongKeyWeakValueSegment).queueForValues, oVarF);
                return oVarF;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public o<K, V> f(StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, K k10, int i10, o<K, V> oVar) {
                return oVar == null ? new o<>(k10, i10, null) : new b(k10, i10, oVar);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public StrongKeyWeakValueSegment<K, V> a(MapMakerInternalMap<K, V, o<K, V>, StrongKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i10) {
                return new StrongKeyWeakValueSegment<>(mapMakerInternalMap, i10);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void b(StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, o<K, V> oVar, V v10) {
                v vVar = oVar.f23264c;
                oVar.f23264c = new w(((StrongKeyWeakValueSegment) strongKeyWeakValueSegment).queueForValues, v10, oVar);
                vVar.clear();
            }
        }

        public static final class b<K, V> extends o<K, V> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final o<K, V> f23266d;

            public b(K k10, int i10, o<K, V> oVar) {
                super(k10, i10, null);
                this.f23266d = oVar;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.b, com.google.common.collect.MapMakerInternalMap.h
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public o<K, V> getNext() {
                return this.f23266d;
            }
        }

        public o(K k10, int i10) {
            super(k10, i10);
            this.f23264c = MapMakerInternalMap.unsetWeakValueReference();
        }

        public /* synthetic */ o(Object obj, int i10, a aVar) {
            this(obj, i10);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.u
        public final v<K, V, o<K, V>> a() {
            return this.f23264c;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.h
        public final V getValue() {
            return this.f23264c.get();
        }
    }

    public final class p extends MapMakerInternalMap<K, V, E, S>.g<V> {
        public p(MapMakerInternalMap mapMakerInternalMap) {
            super();
        }

        @Override // java.util.Iterator
        public V next() {
            return c().getValue();
        }
    }

    public final class q extends AbstractCollection<V> {
        public q() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            MapMakerInternalMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new p(MapMakerInternalMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return MapMakerInternalMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return MapMakerInternalMap.a(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) MapMakerInternalMap.a(this).toArray(tArr);
        }
    }

    public static class r<K> extends c<K, MapMaker.Dummy, r<K>> {

        public static final class a<K> implements i<K, MapMaker.Dummy, r<K>, WeakKeyDummyValueSegment<K>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a<?> f23268a = new a<>();

            public static <K> a<K> h() {
                return (a<K>) f23268a;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            public Strength c() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            public Strength e() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public r<K> d(WeakKeyDummyValueSegment<K> weakKeyDummyValueSegment, r<K> rVar, r<K> rVar2) {
                K key = rVar.getKey();
                if (key == null) {
                    return null;
                }
                return f(weakKeyDummyValueSegment, key, rVar.f23248a, rVar2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public r<K> f(WeakKeyDummyValueSegment<K> weakKeyDummyValueSegment, K k10, int i10, r<K> rVar) {
                return rVar == null ? new r<>(((WeakKeyDummyValueSegment) weakKeyDummyValueSegment).queueForKeys, k10, i10, null) : new b(((WeakKeyDummyValueSegment) weakKeyDummyValueSegment).queueForKeys, k10, i10, rVar, null);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public WeakKeyDummyValueSegment<K> a(MapMakerInternalMap<K, MapMaker.Dummy, r<K>, WeakKeyDummyValueSegment<K>> mapMakerInternalMap, int i10) {
                return new WeakKeyDummyValueSegment<>(mapMakerInternalMap, i10);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void b(WeakKeyDummyValueSegment<K> weakKeyDummyValueSegment, r<K> rVar, MapMaker.Dummy dummy) {
            }
        }

        public static final class b<K> extends r<K> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final r<K> f23269b;

            public b(ReferenceQueue<K> referenceQueue, K k10, int i10, r<K> rVar) {
                super(referenceQueue, k10, i10, null);
                this.f23269b = rVar;
            }

            public /* synthetic */ b(ReferenceQueue referenceQueue, Object obj, int i10, r rVar, a aVar) {
                this(referenceQueue, obj, i10, rVar);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.c, com.google.common.collect.MapMakerInternalMap.h
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public r<K> getNext() {
                return this.f23269b;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.r, com.google.common.collect.MapMakerInternalMap.h
            public /* bridge */ /* synthetic */ Object getValue() {
                return super.getValue();
            }
        }

        public r(ReferenceQueue<K> referenceQueue, K k10, int i10) {
            super(referenceQueue, k10, i10);
        }

        public /* synthetic */ r(ReferenceQueue referenceQueue, Object obj, int i10, a aVar) {
            this(referenceQueue, obj, i10);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.h
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final MapMaker.Dummy getValue() {
            return MapMaker.Dummy.VALUE;
        }
    }

    public static class s<K, V> extends c<K, V, s<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile V f23270b;

        public static final class a<K, V> implements i<K, V, s<K, V>, WeakKeyStrongValueSegment<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a<?, ?> f23271a = new a<>();

            public static <K, V> a<K, V> h() {
                return (a<K, V>) f23271a;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            public Strength c() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            public Strength e() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public s<K, V> d(WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, s<K, V> sVar, s<K, V> sVar2) {
                K key = sVar.getKey();
                if (key == null) {
                    return null;
                }
                s<K, V> sVarF = f(weakKeyStrongValueSegment, key, sVar.f23248a, sVar2);
                sVarF.f23270b = sVar.f23270b;
                return sVarF;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public s<K, V> f(WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, K k10, int i10, s<K, V> sVar) {
                return sVar == null ? new s<>(((WeakKeyStrongValueSegment) weakKeyStrongValueSegment).queueForKeys, k10, i10, null) : new b(((WeakKeyStrongValueSegment) weakKeyStrongValueSegment).queueForKeys, k10, i10, sVar, null);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public WeakKeyStrongValueSegment<K, V> a(MapMakerInternalMap<K, V, s<K, V>, WeakKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i10) {
                return new WeakKeyStrongValueSegment<>(mapMakerInternalMap, i10);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void b(WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, s<K, V> sVar, V v10) {
                sVar.f23270b = v10;
            }
        }

        public static final class b<K, V> extends s<K, V> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final s<K, V> f23272c;

            public b(ReferenceQueue<K> referenceQueue, K k10, int i10, s<K, V> sVar) {
                super(referenceQueue, k10, i10, null);
                this.f23272c = sVar;
            }

            public /* synthetic */ b(ReferenceQueue referenceQueue, Object obj, int i10, s sVar, a aVar) {
                this(referenceQueue, obj, i10, sVar);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.c, com.google.common.collect.MapMakerInternalMap.h
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public s<K, V> getNext() {
                return this.f23272c;
            }
        }

        public s(ReferenceQueue<K> referenceQueue, K k10, int i10) {
            super(referenceQueue, k10, i10);
            this.f23270b = null;
        }

        public /* synthetic */ s(ReferenceQueue referenceQueue, Object obj, int i10, a aVar) {
            this(referenceQueue, obj, i10);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.h
        public final V getValue() {
            return this.f23270b;
        }
    }

    public static class t<K, V> extends c<K, V, t<K, V>> implements u<K, V, t<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile v<K, V, t<K, V>> f23273b;

        public static final class a<K, V> implements i<K, V, t<K, V>, WeakKeyWeakValueSegment<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a<?, ?> f23274a = new a<>();

            public static <K, V> a<K, V> h() {
                return (a<K, V>) f23274a;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            public Strength c() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            public Strength e() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public t<K, V> d(WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, t<K, V> tVar, t<K, V> tVar2) {
                K key = tVar.getKey();
                if (key == null || Segment.isCollected(tVar)) {
                    return null;
                }
                t<K, V> tVarF = f(weakKeyWeakValueSegment, key, tVar.f23248a, tVar2);
                tVarF.f23273b = tVar.f23273b.b(((WeakKeyWeakValueSegment) weakKeyWeakValueSegment).queueForValues, tVarF);
                return tVarF;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public t<K, V> f(WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, K k10, int i10, t<K, V> tVar) {
                return tVar == null ? new t<>(((WeakKeyWeakValueSegment) weakKeyWeakValueSegment).queueForKeys, k10, i10) : new b(((WeakKeyWeakValueSegment) weakKeyWeakValueSegment).queueForKeys, k10, i10, tVar);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public WeakKeyWeakValueSegment<K, V> a(MapMakerInternalMap<K, V, t<K, V>, WeakKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i10) {
                return new WeakKeyWeakValueSegment<>(mapMakerInternalMap, i10);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void b(WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, t<K, V> tVar, V v10) {
                v vVar = tVar.f23273b;
                tVar.f23273b = new w(((WeakKeyWeakValueSegment) weakKeyWeakValueSegment).queueForValues, v10, tVar);
                vVar.clear();
            }
        }

        public static final class b<K, V> extends t<K, V> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final t<K, V> f23275c;

            public b(ReferenceQueue<K> referenceQueue, K k10, int i10, t<K, V> tVar) {
                super(referenceQueue, k10, i10);
                this.f23275c = tVar;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.c, com.google.common.collect.MapMakerInternalMap.h
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public t<K, V> getNext() {
                return this.f23275c;
            }
        }

        public t(ReferenceQueue<K> referenceQueue, K k10, int i10) {
            super(referenceQueue, k10, i10);
            this.f23273b = MapMakerInternalMap.unsetWeakValueReference();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.u
        public final v<K, V, t<K, V>> a() {
            return this.f23273b;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.h
        public final V getValue() {
            return this.f23273b.get();
        }
    }

    public interface u<K, V, E extends h<K, V, E>> extends h<K, V, E> {
        v<K, V, E> a();
    }

    public interface v<K, V, E extends h<K, V, E>> {
        E a();

        v<K, V, E> b(ReferenceQueue<V> referenceQueue, E e10);

        void clear();

        V get();
    }

    public static final class w<K, V, E extends h<K, V, E>> extends WeakReference<V> implements v<K, V, E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Weak
        public final E f23276a;

        public w(ReferenceQueue<V> referenceQueue, V v10, E e10) {
            super(v10, referenceQueue);
            this.f23276a = e10;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.v
        public E a() {
            return this.f23276a;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.v
        public v<K, V, E> b(ReferenceQueue<V> referenceQueue, E e10) {
            return new w(referenceQueue, get(), e10);
        }
    }

    public final class x extends com.google.common.collect.b<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f23277b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public V f23278c;

        public x(K k10, V v10) {
            this.f23277b = k10;
            this.f23278c = v10;
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f23277b.equals(entry.getKey()) && this.f23278c.equals(entry.getValue());
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        public K getKey() {
            return this.f23277b;
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        public V getValue() {
            return this.f23278c;
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        public int hashCode() {
            return this.f23277b.hashCode() ^ this.f23278c.hashCode();
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        public V setValue(V v10) {
            V v11 = (V) MapMakerInternalMap.this.put(this.f23277b, v10);
            this.f23278c = v10;
            return v11;
        }
    }

    public MapMakerInternalMap(MapMaker mapMaker, i<K, V, E, S> iVar) {
        this.concurrencyLevel = Math.min(mapMaker.b(), 65536);
        this.keyEquivalence = mapMaker.d();
        this.entryHelper = iVar;
        int iMin = Math.min(mapMaker.c(), 1073741824);
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        int i13 = 1;
        while (i13 < this.concurrencyLevel) {
            i12++;
            i13 <<= 1;
        }
        this.segmentShift = 32 - i12;
        this.segmentMask = i13 - 1;
        this.segments = newSegmentArray(i13);
        int i14 = iMin / i13;
        while (i11 < (i13 * i14 < iMin ? i14 + 1 : i14)) {
            i11 <<= 1;
        }
        while (true) {
            Segment<K, V, E, S>[] segmentArr = this.segments;
            if (i10 >= segmentArr.length) {
                return;
            }
            segmentArr[i10] = createSegment(i11);
            i10++;
        }
    }

    public static <E> ArrayList<E> a(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        Iterators.a(arrayList, collection.iterator());
        return arrayList;
    }

    public static <K, V> MapMakerInternalMap<K, V, ? extends h<K, V, ?>, ?> create(MapMaker mapMaker) {
        Strength strengthE = mapMaker.e();
        Strength strength = Strength.STRONG;
        if (strengthE == strength && mapMaker.f() == strength) {
            return new MapMakerInternalMap<>(mapMaker, n.a.h());
        }
        if (mapMaker.e() == strength && mapMaker.f() == Strength.WEAK) {
            return new MapMakerInternalMap<>(mapMaker, o.a.h());
        }
        Strength strengthE2 = mapMaker.e();
        Strength strength2 = Strength.WEAK;
        if (strengthE2 == strength2 && mapMaker.f() == strength) {
            return new MapMakerInternalMap<>(mapMaker, s.a.h());
        }
        if (mapMaker.e() == strength2 && mapMaker.f() == strength2) {
            return new MapMakerInternalMap<>(mapMaker, t.a.h());
        }
        throw new AssertionError();
    }

    public static <K> MapMakerInternalMap<K, MapMaker.Dummy, ? extends h<K, MapMaker.Dummy, ?>, ?> createWithDummyValues(MapMaker mapMaker) {
        Strength strengthE = mapMaker.e();
        Strength strength = Strength.STRONG;
        if (strengthE == strength && mapMaker.f() == strength) {
            return new MapMakerInternalMap<>(mapMaker, m.a.h());
        }
        Strength strengthE2 = mapMaker.e();
        Strength strength2 = Strength.WEAK;
        if (strengthE2 == strength2 && mapMaker.f() == strength) {
            return new MapMakerInternalMap<>(mapMaker, r.a.h());
        }
        if (mapMaker.f() == strength2) {
            throw new IllegalArgumentException("Map cannot have both weak and dummy values");
        }
        throw new AssertionError();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializationProxy");
    }

    public static int rehash(int i10) {
        int i11 = i10 + ((i10 << 15) ^ (-12931));
        int i12 = i11 ^ (i11 >>> 10);
        int i13 = i12 + (i12 << 3);
        int i14 = i13 ^ (i13 >>> 6);
        int i15 = i14 + (i14 << 2) + (i14 << 14);
        return i15 ^ (i15 >>> 16);
    }

    public static <K, V, E extends h<K, V, E>> v<K, V, E> unsetWeakValueReference() {
        return (v<K, V, E>) UNSET_WEAK_VALUE_REFERENCE;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (Segment<K, V, E, S> segment : this.segments) {
            segment.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int iHash = hash(obj);
        return segmentFor(iHash).containsKey(obj, iHash);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        boolean z10 = false;
        if (obj == null) {
            return false;
        }
        Segment<K, V, E, S>[] segmentArr = this.segments;
        long j10 = -1;
        int i10 = 0;
        while (i10 < 3) {
            long j11 = 0;
            int length = segmentArr.length;
            for (?? r10 = z10; r10 < length; r10++) {
                Segment<K, V, E, S> segment = segmentArr[r10];
                int i11 = segment.count;
                AtomicReferenceArray<E> atomicReferenceArray = segment.table;
                for (?? r13 = z10; r13 < atomicReferenceArray.length(); r13++) {
                    for (E next = atomicReferenceArray.get(r13); next != null; next = next.getNext()) {
                        V liveValue = segment.getLiveValue(next);
                        if (liveValue != null && valueEquivalence().equivalent(obj, liveValue)) {
                            return true;
                        }
                    }
                }
                j11 += (long) segment.modCount;
                z10 = false;
            }
            if (j11 == j10) {
                return false;
            }
            i10++;
            j10 = j11;
            z10 = false;
        }
        return z10;
    }

    public E copyEntry(E e10, E e11) {
        return (E) segmentFor(e10.b()).copyEntry(e10, e11);
    }

    public Segment<K, V, E, S> createSegment(int i10) {
        return this.entryHelper.a(this, i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        f fVar = new f();
        this.entrySet = fVar;
        return fVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int iHash = hash(obj);
        return segmentFor(iHash).get(obj, iHash);
    }

    public E getEntry(Object obj) {
        if (obj == null) {
            return null;
        }
        int iHash = hash(obj);
        return (E) segmentFor(iHash).getEntry(obj, iHash);
    }

    public V getLiveValue(E e10) {
        if (e10.getKey() == null) {
            return null;
        }
        return (V) e10.getValue();
    }

    public int hash(Object obj) {
        return rehash(this.keyEquivalence.hash(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        Segment<K, V, E, S>[] segmentArr = this.segments;
        long j10 = 0;
        for (int i10 = 0; i10 < segmentArr.length; i10++) {
            if (segmentArr[i10].count != 0) {
                return false;
            }
            j10 += (long) segmentArr[i10].modCount;
        }
        if (j10 == 0) {
            return true;
        }
        for (int i11 = 0; i11 < segmentArr.length; i11++) {
            if (segmentArr[i11].count != 0) {
                return false;
            }
            j10 -= (long) segmentArr[i11].modCount;
        }
        return j10 == 0;
    }

    public boolean isLiveForTesting(h<K, V, ?> hVar) {
        return segmentFor(hVar.b()).getLiveValueForTesting(hVar) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        k kVar = new k();
        this.keySet = kVar;
        return kVar;
    }

    public Strength keyStrength() {
        return this.entryHelper.c();
    }

    public final Segment<K, V, E, S>[] newSegmentArray(int i10) {
        return new Segment[i10];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        y7.l.m(k10);
        y7.l.m(v10);
        int iHash = hash(k10);
        return segmentFor(iHash).put(k10, iHash, v10, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k10, V v10) {
        y7.l.m(k10);
        y7.l.m(v10);
        int iHash = hash(k10);
        return segmentFor(iHash).put(k10, iHash, v10, true);
    }

    public void reclaimKey(E e10) {
        int iB = e10.b();
        segmentFor(iB).reclaimKey(e10, iB);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void reclaimValue(v<K, V, E> vVar) {
        h hVarA = vVar.a();
        int iB = hVarA.b();
        segmentFor(iB).reclaimValue(hVarA.getKey(), iB, vVar);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int iHash = hash(obj);
        return segmentFor(iHash).remove(obj, iHash);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int iHash = hash(obj);
        return segmentFor(iHash).remove(obj, iHash, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k10, V v10) {
        y7.l.m(k10);
        y7.l.m(v10);
        int iHash = hash(k10);
        return segmentFor(iHash).replace(k10, iHash, v10);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k10, V v10, V v11) {
        y7.l.m(k10);
        y7.l.m(v11);
        if (v10 == null) {
            return false;
        }
        int iHash = hash(k10);
        return segmentFor(iHash).replace(k10, iHash, v10, v11);
    }

    public Segment<K, V, E, S> segmentFor(int i10) {
        return this.segments[(i10 >>> this.segmentShift) & this.segmentMask];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j10 = 0;
        for (Segment<K, V, E, S> segment : this.segments) {
            j10 += (long) segment.count;
        }
        return Ints.m(j10);
    }

    public Equivalence<Object> valueEquivalence() {
        return this.entryHelper.e().defaultEquivalence();
    }

    public Strength valueStrength() {
        return this.entryHelper.e();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.values;
        if (collection != null) {
            return collection;
        }
        q qVar = new q();
        this.values = qVar;
        return qVar;
    }

    public Object writeReplace() {
        return new SerializationProxy(this.entryHelper.c(), this.entryHelper.e(), this.keyEquivalence, this.entryHelper.e().defaultEquivalence(), this.concurrencyLevel, this);
    }
}
