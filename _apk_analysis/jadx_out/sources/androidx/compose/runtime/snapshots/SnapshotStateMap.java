package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import bn.r;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.n;
import tn.p;
import un.e;

/* JADX INFO: compiled from: SnapshotStateMap.kt */
/* JADX INFO: loaded from: classes5.dex */
@Stable
@Metadata(bv = {}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010'\n\u0002\b\u0004\n\u0002\u0010&\n\u0002\b\t\n\u0002\u0010#\n\u0002\b\u0006\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00020\u0004:\u0001OB\u0007¢\u0006\u0004\bN\u0010HJ6\u0010\t\u001a\u00028\u0002\"\u0004\b\u0002\u0010\u00052\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00028\u00020\u0006H\u0082\b¢\u0006\u0004\b\t\u0010\nJ6\u0010\u000b\u001a\u00028\u0002\"\u0004\b\u0002\u0010\u00052\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00028\u00020\u0006H\u0082\b¢\u0006\u0004\b\u000b\u0010\nJ6\u0010\f\u001a\u00028\u0002\"\u0004\b\u0002\u0010\u00052\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0004\u0012\u00028\u00020\u0006H\u0082\b¢\u0006\u0004\b\f\u0010\nJ5\u0010\u000f\u001a\u00020\u000e2*\u0010\b\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r0\u0006H\u0082\bJ\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u001a\u0010\u0018\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0013\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0014H\u0016J\b\u0010\u001b\u001a\u00020\u000eH\u0016J!\u0010\u001c\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010 \u001a\u00020\u000e2\u0014\u0010\u001f\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001eH\u0016J\u0019\u0010!\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b!\u0010\u0019J\u0017\u0010#\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00028\u0001H\u0000¢\u0006\u0004\b\"\u0010\u0016J3\u0010(\u001a\u00020\u00142\u001e\u0010%\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$\u0012\u0004\u0012\u00020\u00140\u0006H\u0080\bø\u0001\u0000¢\u0006\u0004\b&\u0010'J3\u0010+\u001a\u00020\u00142\u001e\u0010%\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010)\u0012\u0004\u0012\u00020\u00140\u0006H\u0080\bø\u0001\u0000¢\u0006\u0004\b*\u0010'J3\u0010-\u001a\u00020\u00142\u001e\u0010%\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010)\u0012\u0004\u0012\u00020\u00140\u0006H\u0080\bø\u0001\u0000¢\u0006\u0004\b,\u0010'R$\u0010/\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u00108\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R,\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R \u00108\u001a\b\u0012\u0004\u0012\u00028\u0000038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\b9\u00107R \u0010;\u001a\b\u0012\u0004\u0012\u00028\u00010:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010B\u001a\u00020?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010D\u001a\u00020?8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bC\u0010AR&\u0010I\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078@X\u0080\u0004¢\u0006\f\u0012\u0004\bG\u0010H\u001a\u0004\bE\u0010FR&\u0010M\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001e8AX\u0080\u0004¢\u0006\f\u0012\u0004\bL\u0010H\u001a\u0004\bJ\u0010K\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006P"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "Landroidx/compose/runtime/snapshots/StateObject;", "R", "Lkotlin/Function1;", "Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;", "block", "withCurrent", "(Lsn/l;)Ljava/lang/Object;", "writable", "mutate", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Lbn/r;", "update", "Landroidx/compose/runtime/snapshots/StateRecord;", "value", "prependStateRecord", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "clear", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", TypedValues.TransitionType.S_FROM, "putAll", "remove", "removeValue$runtime_release", "removeValue", "", "predicate", "removeIf$runtime_release", "(Lsn/l;)Z", "removeIf", "", "any$runtime_release", "any", "all$runtime_release", "all", "<set-?>", "firstStateRecord", "Landroidx/compose/runtime/snapshots/StateRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "", "entries", "Ljava/util/Set;", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "", "values", "Ljava/util/Collection;", "getValues", "()Ljava/util/Collection;", "", "getSize", "()I", "size", "getModification$runtime_release", "modification", "getReadable$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;", "getReadable$runtime_release$annotations", "()V", "readable", "getDebuggerDisplayValue", "()Ljava/util/Map;", "getDebuggerDisplayValue$annotations", "debuggerDisplayValue", "<init>", "StateMapStateRecord", "runtime_release"}, k = 1, mv = {1, 6, 0})
public final class SnapshotStateMap<K, V> implements Map<K, V>, StateObject, e {

    @NotNull
    private StateRecord firstStateRecord = new StateMapStateRecord(ExtensionsKt.persistentHashMapOf());

    @NotNull
    private final Set<Map.Entry<K, V>> entries = new SnapshotMapEntrySet(this);

    @NotNull
    private final Set<K> keys = new SnapshotMapKeySet(this);

    @NotNull
    private final Collection<V> values = new SnapshotMapValueSet(this);

    /* JADX INFO: compiled from: SnapshotStateMap.kt */
    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u001d\b\u0000\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b¢\u0006\u0004\b\u0016\u0010\u000eJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016R.\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/runtime/snapshots/StateRecord;", "value", "Lbn/r;", "assign", "create", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "map", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "getMap$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "setMap$runtime_release", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;)V", "", "modification", "I", "getModification$runtime_release", "()I", "setModification$runtime_release", "(I)V", "<init>", "runtime_release"}, k = 1, mv = {1, 6, 0})
    public static final class StateMapStateRecord<K, V> extends StateRecord {

        @NotNull
        private PersistentMap<K, ? extends V> map;
        private int modification;

        public StateMapStateRecord(@NotNull PersistentMap<K, ? extends V> persistentMap) {
            p.k(persistentMap, "map");
            this.map = persistentMap;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(@NotNull StateRecord stateRecord) {
            p.k(stateRecord, "value");
            StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) stateRecord;
            synchronized (SnapshotStateMapKt.sync) {
                this.map = stateMapStateRecord.map;
                this.modification = stateMapStateRecord.modification;
                r rVar = r.f5635a;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @NotNull
        public StateRecord create() {
            return new StateMapStateRecord(this.map);
        }

        @NotNull
        public final PersistentMap<K, V> getMap$runtime_release() {
            return this.map;
        }

        /* JADX INFO: renamed from: getModification$runtime_release, reason: from getter */
        public final int getModification() {
            return this.modification;
        }

        public final void setMap$runtime_release(@NotNull PersistentMap<K, ? extends V> persistentMap) {
            p.k(persistentMap, "<set-?>");
            this.map = persistentMap;
        }

        public final void setModification$runtime_release(int i10) {
            this.modification = i10;
        }
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getReadable$runtime_release$annotations() {
    }

    private final <R> R mutate(l<? super Map<K, V>, ? extends R> block) {
        Snapshot.Companion companion;
        PersistentMap<K, V> map$runtime_release;
        int modification;
        R rInvoke;
        Snapshot current;
        boolean z10;
        do {
            synchronized (SnapshotStateMapKt.sync) {
                try {
                    StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) getFirstStateRecord();
                    companion = Snapshot.INSTANCE;
                    StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) SnapshotKt.current(stateMapStateRecord, companion.getCurrent());
                    map$runtime_release = stateMapStateRecord2.getMap$runtime_release();
                    modification = stateMapStateRecord2.getModification();
                    r rVar = r.f5635a;
                    n.b(1);
                } catch (Throwable th2) {
                    n.b(1);
                    n.a(1);
                    throw th2;
                }
            }
            n.a(1);
            p.h(map$runtime_release);
            PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            rInvoke = block.invoke(builder);
            PersistentMap<K, V> persistentMapBuild = builder.build();
            if (p.f(persistentMapBuild, map$runtime_release)) {
                break;
            }
            synchronized (SnapshotStateMapKt.sync) {
                try {
                    StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) getFirstStateRecord();
                    SnapshotKt.getSnapshotInitializer();
                    synchronized (SnapshotKt.getLock()) {
                        try {
                            current = companion.getCurrent();
                            StateMapStateRecord stateMapStateRecord4 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord3, this, current);
                            if (stateMapStateRecord4.getModification() == modification) {
                                stateMapStateRecord4.setMap$runtime_release(persistentMapBuild);
                                stateMapStateRecord4.setModification$runtime_release(stateMapStateRecord4.getModification() + 1);
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            n.b(1);
                        } finally {
                        }
                    }
                    n.a(1);
                    SnapshotKt.notifyWrite(current, this);
                    n.b(1);
                } catch (Throwable th3) {
                    n.b(1);
                    n.a(1);
                    throw th3;
                }
            }
            n.a(1);
        } while (!z10);
        return rInvoke;
    }

    private final void update(l<? super PersistentMap<K, ? extends V>, ? extends PersistentMap<K, ? extends V>> lVar) {
        Snapshot current;
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) getFirstStateRecord();
        Snapshot.Companion companion = Snapshot.INSTANCE;
        StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) SnapshotKt.current(stateMapStateRecord, companion.getCurrent());
        PersistentMap<K, ? extends V> persistentMapInvoke = lVar.invoke(stateMapStateRecord2.getMap$runtime_release());
        if (persistentMapInvoke != stateMapStateRecord2.getMap$runtime_release()) {
            synchronized (SnapshotStateMapKt.sync) {
                try {
                    StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) getFirstStateRecord();
                    SnapshotKt.getSnapshotInitializer();
                    synchronized (SnapshotKt.getLock()) {
                        try {
                            current = companion.getCurrent();
                            StateMapStateRecord stateMapStateRecord4 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord3, this, current);
                            stateMapStateRecord4.setMap$runtime_release(persistentMapInvoke);
                            stateMapStateRecord4.setModification$runtime_release(stateMapStateRecord4.getModification() + 1);
                            n.b(1);
                        } catch (Throwable th2) {
                            n.b(1);
                            n.a(1);
                            throw th2;
                        }
                    }
                    n.a(1);
                    SnapshotKt.notifyWrite(current, this);
                    n.b(1);
                } catch (Throwable th3) {
                    n.b(1);
                    n.a(1);
                    throw th3;
                }
            }
            n.a(1);
        }
    }

    private final <R> R withCurrent(l<? super StateMapStateRecord<K, V>, ? extends R> block) {
        return block.invoke(SnapshotKt.current((StateMapStateRecord) getFirstStateRecord(), Snapshot.INSTANCE.getCurrent()));
    }

    private final <R> R writable(l<? super StateMapStateRecord<K, V>, ? extends R> block) {
        Snapshot current;
        R rInvoke;
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) getFirstStateRecord();
        SnapshotKt.getSnapshotInitializer();
        synchronized (SnapshotKt.getLock()) {
            try {
                current = Snapshot.INSTANCE.getCurrent();
                rInvoke = block.invoke(SnapshotKt.writableRecord(stateMapStateRecord, this, current));
                n.b(1);
            } catch (Throwable th2) {
                n.b(1);
                n.a(1);
                throw th2;
            }
        }
        n.a(1);
        SnapshotKt.notifyWrite(current, this);
        return rInvoke;
    }

    public final boolean all$runtime_release(@NotNull l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        p.k(predicate, "predicate");
        Iterator<E> it = ((ImmutableSet) getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator();
        while (it.hasNext()) {
            if (!predicate.invoke((Map.Entry) it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final boolean any$runtime_release(@NotNull l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        p.k(predicate, "predicate");
        Iterator<E> it = ((ImmutableSet) getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator();
        while (it.hasNext()) {
            if (predicate.invoke((Map.Entry) it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public void clear() {
        Snapshot current;
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) getFirstStateRecord();
        Snapshot.Companion companion = Snapshot.INSTANCE;
        StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) SnapshotKt.current(stateMapStateRecord, companion.getCurrent());
        stateMapStateRecord2.getMap$runtime_release();
        PersistentMap<K, V> persistentMapPersistentHashMapOf = ExtensionsKt.persistentHashMapOf();
        if (persistentMapPersistentHashMapOf != stateMapStateRecord2.getMap$runtime_release()) {
            synchronized (SnapshotStateMapKt.sync) {
                StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) getFirstStateRecord();
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    current = companion.getCurrent();
                    StateMapStateRecord stateMapStateRecord4 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord3, this, current);
                    stateMapStateRecord4.setMap$runtime_release(persistentMapPersistentHashMapOf);
                    stateMapStateRecord4.setModification$runtime_release(stateMapStateRecord4.getModification() + 1);
                }
                SnapshotKt.notifyWrite(current, this);
            }
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return getReadable$runtime_release().getMap$runtime_release().containsKey(key);
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return getReadable$runtime_release().getMap$runtime_release().containsValue(value);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    @Nullable
    public V get(Object key) {
        return getReadable$runtime_release().getMap$runtime_release().get(key);
    }

    @NotNull
    public final Map<K, V> getDebuggerDisplayValue() {
        return ((StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) getFirstStateRecord(), Snapshot.INSTANCE.getCurrent())).getMap$runtime_release();
    }

    @NotNull
    public Set<Map.Entry<K, V>> getEntries() {
        return this.entries;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @NotNull
    public StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    @NotNull
    public Set<K> getKeys() {
        return this.keys;
    }

    public final int getModification$runtime_release() {
        return getReadable$runtime_release().getModification();
    }

    @NotNull
    public final StateMapStateRecord<K, V> getReadable$runtime_release() {
        return (StateMapStateRecord) SnapshotKt.readable((StateMapStateRecord) getFirstStateRecord(), this);
    }

    public int getSize() {
        return getReadable$runtime_release().getMap$runtime_release().size();
    }

    @NotNull
    public Collection<V> getValues() {
        return this.values;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return getReadable$runtime_release().getMap$runtime_release().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@NotNull StateRecord stateRecord) {
        p.k(stateRecord, "value");
        this.firstStateRecord = (StateMapStateRecord) stateRecord;
    }

    @Override // java.util.Map
    @Nullable
    public V put(K key, V value) {
        Snapshot.Companion companion;
        PersistentMap<K, V> map$runtime_release;
        int modification;
        V vPut;
        Snapshot current;
        boolean z10;
        do {
            synchronized (SnapshotStateMapKt.sync) {
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) getFirstStateRecord();
                companion = Snapshot.INSTANCE;
                StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) SnapshotKt.current(stateMapStateRecord, companion.getCurrent());
                map$runtime_release = stateMapStateRecord2.getMap$runtime_release();
                modification = stateMapStateRecord2.getModification();
                r rVar = r.f5635a;
            }
            p.h(map$runtime_release);
            PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            vPut = builder.put(key, value);
            PersistentMap<K, V> persistentMapBuild = builder.build();
            if (p.f(persistentMapBuild, map$runtime_release)) {
                break;
            }
            synchronized (SnapshotStateMapKt.sync) {
                StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) getFirstStateRecord();
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    current = companion.getCurrent();
                    StateMapStateRecord stateMapStateRecord4 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord3, this, current);
                    z10 = true;
                    if (stateMapStateRecord4.getModification() == modification) {
                        stateMapStateRecord4.setMap$runtime_release(persistentMapBuild);
                        stateMapStateRecord4.setModification$runtime_release(stateMapStateRecord4.getModification() + 1);
                    } else {
                        z10 = false;
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            }
        } while (!z10);
        return vPut;
    }

    @Override // java.util.Map
    public void putAll(@NotNull Map<? extends K, ? extends V> map) {
        Snapshot.Companion companion;
        PersistentMap<K, V> map$runtime_release;
        int modification;
        Snapshot current;
        boolean z10;
        p.k(map, TypedValues.TransitionType.S_FROM);
        do {
            synchronized (SnapshotStateMapKt.sync) {
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) getFirstStateRecord();
                companion = Snapshot.INSTANCE;
                StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) SnapshotKt.current(stateMapStateRecord, companion.getCurrent());
                map$runtime_release = stateMapStateRecord2.getMap$runtime_release();
                modification = stateMapStateRecord2.getModification();
                r rVar = r.f5635a;
            }
            p.h(map$runtime_release);
            PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            builder.putAll(map);
            PersistentMap<K, V> persistentMapBuild = builder.build();
            if (p.f(persistentMapBuild, map$runtime_release)) {
                return;
            }
            synchronized (SnapshotStateMapKt.sync) {
                StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) getFirstStateRecord();
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    current = companion.getCurrent();
                    StateMapStateRecord stateMapStateRecord4 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord3, this, current);
                    z10 = true;
                    if (stateMapStateRecord4.getModification() == modification) {
                        stateMapStateRecord4.setMap$runtime_release(persistentMapBuild);
                        stateMapStateRecord4.setModification$runtime_release(stateMapStateRecord4.getModification() + 1);
                    } else {
                        z10 = false;
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            }
        } while (!z10);
    }

    @Override // java.util.Map
    @Nullable
    public V remove(Object key) {
        Snapshot.Companion companion;
        PersistentMap<K, V> map$runtime_release;
        int modification;
        V vRemove;
        Snapshot current;
        boolean z10;
        do {
            synchronized (SnapshotStateMapKt.sync) {
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) getFirstStateRecord();
                companion = Snapshot.INSTANCE;
                StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) SnapshotKt.current(stateMapStateRecord, companion.getCurrent());
                map$runtime_release = stateMapStateRecord2.getMap$runtime_release();
                modification = stateMapStateRecord2.getModification();
                r rVar = r.f5635a;
            }
            p.h(map$runtime_release);
            PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            vRemove = builder.remove(key);
            PersistentMap<K, V> persistentMapBuild = builder.build();
            if (p.f(persistentMapBuild, map$runtime_release)) {
                break;
            }
            synchronized (SnapshotStateMapKt.sync) {
                StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) getFirstStateRecord();
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    current = companion.getCurrent();
                    StateMapStateRecord stateMapStateRecord4 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord3, this, current);
                    z10 = true;
                    if (stateMapStateRecord4.getModification() == modification) {
                        stateMapStateRecord4.setMap$runtime_release(persistentMapBuild);
                        stateMapStateRecord4.setModification$runtime_release(stateMapStateRecord4.getModification() + 1);
                    } else {
                        z10 = false;
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            }
        } while (!z10);
        return vRemove;
    }

    public final boolean removeIf$runtime_release(@NotNull l<? super Map.Entry<K, V>, Boolean> predicate) {
        PersistentMap<K, V> map$runtime_release;
        int modification;
        Snapshot current;
        boolean z10;
        p.k(predicate, "predicate");
        boolean z11 = false;
        do {
            synchronized (SnapshotStateMapKt.sync) {
                try {
                    StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) getFirstStateRecord(), Snapshot.INSTANCE.getCurrent());
                    map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                    modification = stateMapStateRecord.getModification();
                    r rVar = r.f5635a;
                    n.b(1);
                } catch (Throwable th2) {
                    n.b(1);
                    n.a(1);
                    throw th2;
                }
            }
            n.a(1);
            p.h(map$runtime_release);
            PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            for (Map.Entry<K, V> entry : entrySet()) {
                if (predicate.invoke(entry).booleanValue()) {
                    builder.remove(entry.getKey());
                    z11 = true;
                }
            }
            r rVar2 = r.f5635a;
            PersistentMap<K, V> persistentMapBuild = builder.build();
            if (p.f(persistentMapBuild, map$runtime_release)) {
                break;
            }
            synchronized (SnapshotStateMapKt.sync) {
                try {
                    StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) getFirstStateRecord();
                    SnapshotKt.getSnapshotInitializer();
                    synchronized (SnapshotKt.getLock()) {
                        try {
                            current = Snapshot.INSTANCE.getCurrent();
                            StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                            if (stateMapStateRecord3.getModification() == modification) {
                                stateMapStateRecord3.setMap$runtime_release(persistentMapBuild);
                                stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification() + 1);
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            n.b(1);
                        } finally {
                        }
                    }
                    n.a(1);
                    SnapshotKt.notifyWrite(current, this);
                    n.b(1);
                } catch (Throwable th3) {
                    n.b(1);
                    n.a(1);
                    throw th3;
                }
            }
            n.a(1);
        } while (!z10);
        return z11;
    }

    public final boolean removeValue$runtime_release(V value) {
        Object next;
        Iterator<T> it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (p.f(((Map.Entry) next).getValue(), value)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return false;
        }
        remove(entry.getKey());
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }
}
