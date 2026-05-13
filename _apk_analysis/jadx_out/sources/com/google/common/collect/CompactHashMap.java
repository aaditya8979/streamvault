package com.google.common.collect;

import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
class CompactHashMap<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final double HASH_FLOODING_FPP = 0.001d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f23104h = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient Object f23105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient int f23106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient int f23107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient Set<K> f23108e;
    public transient int[] entries;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient Set<Map.Entry<K, V>> f23109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient Collection<V> f23110g;
    public transient Object[] keys;
    public transient Object[] values;

    public class a extends CompactHashMap<K, V>.e<K> {
        public a() {
            super(CompactHashMap.this, null);
        }

        @Override // com.google.common.collect.CompactHashMap.e
        public K b(int i10) {
            return (K) CompactHashMap.this.g(i10);
        }
    }

    public class b extends CompactHashMap<K, V>.e<Map.Entry<K, V>> {
        public b() {
            super(CompactHashMap.this, null);
        }

        @Override // com.google.common.collect.CompactHashMap.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> b(int i10) {
            return new g(i10);
        }
    }

    public class c extends CompactHashMap<K, V>.e<V> {
        public c() {
            super(CompactHashMap.this, null);
        }

        @Override // com.google.common.collect.CompactHashMap.e
        public V b(int i10) {
            return (V) CompactHashMap.this.t(i10);
        }
    }

    public class d extends AbstractSet<Map.Entry<K, V>> {
        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map<K, V> mapDelegateOrNull = CompactHashMap.this.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return mapDelegateOrNull.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iF = CompactHashMap.this.f(entry.getKey());
            return iF != -1 && y7.i.a(CompactHashMap.this.t(iF), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return CompactHashMap.this.entrySetIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> mapDelegateOrNull = CompactHashMap.this.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return mapDelegateOrNull.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (CompactHashMap.this.needsAllocArrays()) {
                return false;
            }
            int iD = CompactHashMap.this.d();
            int iF = l1.f(entry.getKey(), entry.getValue(), iD, CompactHashMap.this.l(), CompactHashMap.this.j(), CompactHashMap.this.k(), CompactHashMap.this.m());
            if (iF == -1) {
                return false;
            }
            CompactHashMap.this.moveLastEntry(iF, iD);
            CompactHashMap.access$1210(CompactHashMap.this);
            CompactHashMap.this.incrementModCount();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    public abstract class e<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f23115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f23116c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f23117d;

        public e() {
            this.f23115b = CompactHashMap.this.f23106c;
            this.f23116c = CompactHashMap.this.firstEntryIndex();
            this.f23117d = -1;
        }

        public /* synthetic */ e(CompactHashMap compactHashMap, a aVar) {
            this();
        }

        public final void a() {
            if (CompactHashMap.this.f23106c != this.f23115b) {
                throw new ConcurrentModificationException();
            }
        }

        public abstract T b(int i10);

        public void c() {
            this.f23115b += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23116c >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f23116c;
            this.f23117d = i10;
            T tB = b(i10);
            this.f23116c = CompactHashMap.this.getSuccessor(this.f23116c);
            return tB;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            j1.e(this.f23117d >= 0);
            c();
            CompactHashMap compactHashMap = CompactHashMap.this;
            compactHashMap.remove(compactHashMap.g(this.f23117d));
            this.f23116c = CompactHashMap.this.adjustAfterRemove(this.f23116c, this.f23117d);
            this.f23117d = -1;
        }
    }

    public class f extends AbstractSet<K> {
        public f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return CompactHashMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return CompactHashMap.this.keySetIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> mapDelegateOrNull = CompactHashMap.this.delegateOrNull();
            return mapDelegateOrNull != null ? mapDelegateOrNull.keySet().remove(obj) : CompactHashMap.this.h(obj) != CompactHashMap.f23104h;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    public final class g extends com.google.common.collect.b<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f23120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f23121c;

        public g(int i10) {
            this.f23120b = (K) CompactHashMap.this.g(i10);
            this.f23121c = i10;
        }

        public final void d() {
            int i10 = this.f23121c;
            if (i10 == -1 || i10 >= CompactHashMap.this.size() || !y7.i.a(this.f23120b, CompactHashMap.this.g(this.f23121c))) {
                this.f23121c = CompactHashMap.this.f(this.f23120b);
            }
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        public K getKey() {
            return this.f23120b;
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        public V getValue() {
            Map<K, V> mapDelegateOrNull = CompactHashMap.this.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return (V) c2.a(mapDelegateOrNull.get(this.f23120b));
            }
            d();
            int i10 = this.f23121c;
            return i10 == -1 ? (V) c2.b() : (V) CompactHashMap.this.t(i10);
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        public V setValue(V v10) {
            Map<K, V> mapDelegateOrNull = CompactHashMap.this.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return (V) c2.a(mapDelegateOrNull.put(this.f23120b, v10));
            }
            d();
            int i10 = this.f23121c;
            if (i10 == -1) {
                CompactHashMap.this.put(this.f23120b, v10);
                return (V) c2.b();
            }
            V v11 = (V) CompactHashMap.this.t(i10);
            CompactHashMap.this.s(this.f23121c, v10);
            return v11;
        }
    }

    public class h extends AbstractCollection<V> {
        public h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return CompactHashMap.this.valuesIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    public CompactHashMap() {
        init(3);
    }

    public CompactHashMap(int i10) {
        init(i10);
    }

    public static /* synthetic */ int access$1210(CompactHashMap compactHashMap) {
        int i10 = compactHashMap.f23107d;
        compactHashMap.f23107d = i10 - 1;
        return i10;
    }

    public static <K, V> CompactHashMap<K, V> create() {
        return new CompactHashMap<>();
    }

    public static <K, V> CompactHashMap<K, V> createWithExpectedSize(int i10) {
        return new CompactHashMap<>(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i10 = objectInputStream.readInt();
        if (i10 < 0) {
            throw new InvalidObjectException("Invalid size: " + i10);
        }
        init(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<Map.Entry<K, V>> itEntrySetIterator = entrySetIterator();
        while (itEntrySetIterator.hasNext()) {
            Map.Entry<K, V> next = itEntrySetIterator.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    public final int a(int i10) {
        return j()[i10];
    }

    public void accessEntry(int i10) {
    }

    public int adjustAfterRemove(int i10, int i11) {
        return i10 - 1;
    }

    public int allocArrays() {
        y7.l.s(needsAllocArrays(), "Arrays already allocated");
        int i10 = this.f23106c;
        int iJ = l1.j(i10);
        this.f23105b = l1.a(iJ);
        q(iJ - 1);
        this.entries = new int[i10];
        this.keys = new Object[i10];
        this.values = new Object[i10];
        return i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (needsAllocArrays()) {
            return;
        }
        incrementModCount();
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            this.f23106c = Ints.f(size(), 3, 1073741823);
            mapDelegateOrNull.clear();
            this.f23105b = null;
            this.f23107d = 0;
            return;
        }
        Arrays.fill(k(), 0, this.f23107d, (Object) null);
        Arrays.fill(m(), 0, this.f23107d, (Object) null);
        l1.g(l());
        Arrays.fill(j(), 0, this.f23107d, 0);
        this.f23107d = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        return mapDelegateOrNull != null ? mapDelegateOrNull.containsKey(obj) : f(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f23107d; i10++) {
            if (y7.i.a(obj, t(i10))) {
                return true;
            }
        }
        return false;
    }

    public Map<K, V> convertToHashFloodingResistantImplementation() {
        Map<K, V> mapCreateHashFloodingResistantDelegate = createHashFloodingResistantDelegate(d() + 1);
        int iFirstEntryIndex = firstEntryIndex();
        while (iFirstEntryIndex >= 0) {
            mapCreateHashFloodingResistantDelegate.put(g(iFirstEntryIndex), t(iFirstEntryIndex));
            iFirstEntryIndex = getSuccessor(iFirstEntryIndex);
        }
        this.f23105b = mapCreateHashFloodingResistantDelegate;
        this.entries = null;
        this.keys = null;
        this.values = null;
        incrementModCount();
        return mapCreateHashFloodingResistantDelegate;
    }

    public Set<Map.Entry<K, V>> createEntrySet() {
        return new d();
    }

    public Map<K, V> createHashFloodingResistantDelegate(int i10) {
        return new LinkedHashMap(i10, 1.0f);
    }

    public Set<K> createKeySet() {
        return new f();
    }

    public Collection<V> createValues() {
        return new h();
    }

    public final int d() {
        return (1 << (this.f23106c & 31)) - 1;
    }

    public Map<K, V> delegateOrNull() {
        Object obj = this.f23105b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f23109f;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> setCreateEntrySet = createEntrySet();
        this.f23109f = setCreateEntrySet;
        return setCreateEntrySet;
    }

    public Iterator<Map.Entry<K, V>> entrySetIterator() {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        return mapDelegateOrNull != null ? mapDelegateOrNull.entrySet().iterator() : new b();
    }

    public final int f(Object obj) {
        if (needsAllocArrays()) {
            return -1;
        }
        int iC = v1.c(obj);
        int iD = d();
        int iH = l1.h(l(), iC & iD);
        if (iH == 0) {
            return -1;
        }
        int iB = l1.b(iC, iD);
        do {
            int i10 = iH - 1;
            int iA = a(i10);
            if (l1.b(iA, iD) == iB && y7.i.a(obj, g(i10))) {
                return i10;
            }
            iH = l1.c(iA, iD);
        } while (iH != 0);
        return -1;
    }

    public int firstEntryIndex() {
        return isEmpty() ? -1 : 0;
    }

    public final K g(int i10) {
        return (K) k()[i10];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.get(obj);
        }
        int iF = f(obj);
        if (iF == -1) {
            return null;
        }
        accessEntry(iF);
        return t(iF);
    }

    public int getSuccessor(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f23107d) {
            return i11;
        }
        return -1;
    }

    public final Object h(Object obj) {
        if (needsAllocArrays()) {
            return f23104h;
        }
        int iD = d();
        int iF = l1.f(obj, null, iD, l(), j(), k(), null);
        if (iF == -1) {
            return f23104h;
        }
        V vT = t(iF);
        moveLastEntry(iF, iD);
        this.f23107d--;
        incrementModCount();
        return vT;
    }

    public void incrementModCount() {
        this.f23106c += 32;
    }

    public void init(int i10) {
        y7.l.e(i10 >= 0, "Expected size must be >= 0");
        this.f23106c = Ints.f(i10, 1, 1073741823);
    }

    public void insertEntry(int i10, K k10, V v10, int i11, int i12) {
        p(i10, l1.d(i11, 0, i12));
        r(i10, k10);
        s(i10, v10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public final int[] j() {
        int[] iArr = this.entries;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] k() {
        Object[] objArr = this.keys;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f23108e;
        if (set != null) {
            return set;
        }
        Set<K> setCreateKeySet = createKeySet();
        this.f23108e = setCreateKeySet;
        return setCreateKeySet;
    }

    public Iterator<K> keySetIterator() {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        return mapDelegateOrNull != null ? mapDelegateOrNull.keySet().iterator() : new a();
    }

    public final Object l() {
        Object obj = this.f23105b;
        Objects.requireNonNull(obj);
        return obj;
    }

    public final Object[] m() {
        Object[] objArr = this.values;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public void moveLastEntry(int i10, int i11) {
        Object objL = l();
        int[] iArrJ = j();
        Object[] objArrK = k();
        Object[] objArrM = m();
        int size = size() - 1;
        if (i10 >= size) {
            objArrK[i10] = null;
            objArrM[i10] = null;
            iArrJ[i10] = 0;
            return;
        }
        Object obj = objArrK[size];
        objArrK[i10] = obj;
        objArrM[i10] = objArrM[size];
        objArrK[size] = null;
        objArrM[size] = null;
        iArrJ[i10] = iArrJ[size];
        iArrJ[size] = 0;
        int iC = v1.c(obj) & i11;
        int iH = l1.h(objL, iC);
        int i12 = size + 1;
        if (iH == i12) {
            l1.i(objL, iC, i10 + 1);
            return;
        }
        while (true) {
            int i13 = iH - 1;
            int i14 = iArrJ[i13];
            int iC2 = l1.c(i14, i11);
            if (iC2 == i12) {
                iArrJ[i13] = l1.d(i14, i10 + 1, i11);
                return;
            }
            iH = iC2;
        }
    }

    public final void n(int i10) {
        int iMin;
        int length = j().length;
        if (i10 <= length || (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        resizeEntries(iMin);
    }

    public boolean needsAllocArrays() {
        return this.f23105b == null;
    }

    public final int o(int i10, int i11, int i12, int i13) {
        Object objA = l1.a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            l1.i(objA, i12 & i14, i13 + 1);
        }
        Object objL = l();
        int[] iArrJ = j();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iH = l1.h(objL, i15);
            while (iH != 0) {
                int i16 = iH - 1;
                int i17 = iArrJ[i16];
                int iB = l1.b(i17, i10) | i15;
                int i18 = iB & i14;
                int iH2 = l1.h(objA, i18);
                l1.i(objA, i18, iH);
                iArrJ[i16] = l1.d(iB, iH2, i14);
                iH = l1.c(i17, i10);
            }
        }
        this.f23105b = objA;
        q(i14);
        return i14;
    }

    public final void p(int i10, int i11) {
        j()[i10] = i11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        int iO;
        int i10;
        if (needsAllocArrays()) {
            allocArrays();
        }
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.put(k10, v10);
        }
        int[] iArrJ = j();
        Object[] objArrK = k();
        Object[] objArrM = m();
        int i11 = this.f23107d;
        int i12 = i11 + 1;
        int iC = v1.c(k10);
        int iD = d();
        int i13 = iC & iD;
        int iH = l1.h(l(), i13);
        if (iH != 0) {
            int iB = l1.b(iC, iD);
            int i14 = 0;
            while (true) {
                int i15 = iH - 1;
                int i16 = iArrJ[i15];
                if (l1.b(i16, iD) == iB && y7.i.a(k10, objArrK[i15])) {
                    V v11 = (V) objArrM[i15];
                    objArrM[i15] = v10;
                    accessEntry(i15);
                    return v11;
                }
                int iC2 = l1.c(i16, iD);
                i14++;
                if (iC2 != 0) {
                    iH = iC2;
                } else {
                    if (i14 >= 9) {
                        return convertToHashFloodingResistantImplementation().put(k10, v10);
                    }
                    if (i12 > iD) {
                        iO = o(iD, l1.e(iD), iC, i11);
                    } else {
                        iArrJ[i15] = l1.d(i16, i12, iD);
                    }
                }
            }
            i10 = iD;
        } else if (i12 > iD) {
            iO = o(iD, l1.e(iD), iC, i11);
            i10 = iO;
        } else {
            l1.i(l(), i13, i12);
            i10 = iD;
        }
        n(i12);
        insertEntry(i11, k10, v10, iC, i10);
        this.f23107d = i12;
        incrementModCount();
        return null;
    }

    public final void q(int i10) {
        this.f23106c = l1.d(this.f23106c, 32 - Integer.numberOfLeadingZeros(i10), 31);
    }

    public final void r(int i10, K k10) {
        k()[i10] = k10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.remove(obj);
        }
        V v10 = (V) h(obj);
        if (v10 == f23104h) {
            return null;
        }
        return v10;
    }

    public void resizeEntries(int i10) {
        this.entries = Arrays.copyOf(j(), i10);
        this.keys = Arrays.copyOf(k(), i10);
        this.values = Arrays.copyOf(m(), i10);
    }

    public final void s(int i10, V v10) {
        m()[i10] = v10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        return mapDelegateOrNull != null ? mapDelegateOrNull.size() : this.f23107d;
    }

    public final V t(int i10) {
        return (V) m()[i10];
    }

    public void trimToSize() {
        if (needsAllocArrays()) {
            return;
        }
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            Map<K, V> mapCreateHashFloodingResistantDelegate = createHashFloodingResistantDelegate(size());
            mapCreateHashFloodingResistantDelegate.putAll(mapDelegateOrNull);
            this.f23105b = mapCreateHashFloodingResistantDelegate;
            return;
        }
        int i10 = this.f23107d;
        if (i10 < j().length) {
            resizeEntries(i10);
        }
        int iJ = l1.j(i10);
        int iD = d();
        if (iJ < iD) {
            o(iD, iJ, 0, 0);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f23110g;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionCreateValues = createValues();
        this.f23110g = collectionCreateValues;
        return collectionCreateValues;
    }

    public Iterator<V> valuesIterator() {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        return mapDelegateOrNull != null ? mapDelegateOrNull.values().iterator() : new c();
    }
}
