package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.snapshots.Snapshot;
import bn.r;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.h;
import tn.n;
import tn.p;
import un.d;

/* JADX INFO: compiled from: SnapshotStateList.kt */
/* JADX INFO: loaded from: classes5.dex */
@Stable
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b#\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001OB\u0007¢\u0006\u0004\bN\u0010EJ0\u0010\b\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00042\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00028\u00010\u0005H\u0082\b¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00042\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00028\u00010\u0005H\u0082\b¢\u0006\u0004\b\n\u0010\tJ\"\u0010\f\u001a\u00020\u000b2\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u000b0\u0005H\u0002J0\u0010\r\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00042\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00010\u0005H\u0082\b¢\u0006\u0004\b\r\u0010\tJ)\u0010\u0010\u001a\u00020\u000f2\u001e\u0010\u0007\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\u0005H\u0082\bJ)\u0010\u0011\u001a\u00020\u000b2\u001e\u0010\u0007\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\u0005H\u0082\bJ\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u001a\u001a\u00020\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016J\u0018\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001f\u0010 J\b\u0010!\u001a\u00020\u000bH\u0016J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0096\u0002J\u0017\u0010$\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b$\u0010 J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u001e\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u001bH\u0016J\u0017\u0010*\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b*\u0010\u0017J\u001f\u0010*\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b*\u0010+J\u001e\u0010,\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016J\u0016\u0010,\u001a\u00020\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016J\b\u0010-\u001a\u00020\u000fH\u0016J\u0017\u0010.\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b.\u0010\u0017J\u0016\u0010/\u001a\u00020\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016J\u0017\u00100\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b0\u0010\u001eJ\u0016\u00101\u001a\u00020\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016J \u00102\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b2\u00103J\u0016\u00104\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u001bJ-\u00109\u001a\u00020\u001b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u00105\u001a\u00020\u001b2\u0006\u00106\u001a\u00020\u001bH\u0000¢\u0006\u0004\b7\u00108R$\u0010;\u001a\u00020\u00122\u0006\u0010:\u001a\u00020\u00128\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R \u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068@X\u0080\u0004¢\u0006\f\u0012\u0004\bD\u0010E\u001a\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010@R \u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000I8AX\u0080\u0004¢\u0006\f\u0012\u0004\bL\u0010E\u001a\u0004\bJ\u0010K¨\u0006P"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList;", "T", "", "Landroidx/compose/runtime/snapshots/StateObject;", "R", "Lkotlin/Function1;", "Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;", "block", "writable", "(Lsn/l;)Ljava/lang/Object;", "withCurrent", "", "mutateBoolean", "mutate", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Lbn/r;", "update", "conditionalUpdate", "Landroidx/compose/runtime/snapshots/StateRecord;", "value", "prependStateRecord", "element", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "", "iterator", "lastIndexOf", "", "listIterator", "fromIndex", "toIndex", "subList", ImpressionLog.f51742l, "(ILjava/lang/Object;)V", "addAll", "clear", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "removeRange", "start", "end", "retainAllInRange$runtime_release", "(Ljava/util/Collection;II)I", "retainAllInRange", "<set-?>", "firstStateRecord", "Landroidx/compose/runtime/snapshots/StateRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "getModification$runtime_release", "()I", "modification", "getReadable$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;", "getReadable$runtime_release$annotations", "()V", "readable", "getSize", "size", "", "getDebuggerDisplayValue", "()Ljava/util/List;", "getDebuggerDisplayValue$annotations", "debuggerDisplayValue", "<init>", "StateListStateRecord", "runtime_release"}, k = 1, mv = {1, 6, 0})
public final class SnapshotStateList<T> implements List<T>, StateObject, d {

    @NotNull
    private StateRecord firstStateRecord = new StateListStateRecord(ExtensionsKt.persistentListOf());

    /* JADX INFO: compiled from: SnapshotStateList.kt */
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0017\b\u0000\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016R(\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;", "T", "Landroidx/compose/runtime/snapshots/StateRecord;", "value", "Lbn/r;", "assign", "create", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "list", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "getList$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "setList$runtime_release", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)V", "", "modification", "I", "getModification$runtime_release", "()I", "setModification$runtime_release", "(I)V", "<init>", "runtime_release"}, k = 1, mv = {1, 6, 0})
    public static final class StateListStateRecord<T> extends StateRecord {

        @NotNull
        private PersistentList<? extends T> list;
        private int modification;

        public StateListStateRecord(@NotNull PersistentList<? extends T> persistentList) {
            p.k(persistentList, "list");
            this.list = persistentList;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(@NotNull StateRecord stateRecord) {
            p.k(stateRecord, "value");
            synchronized (SnapshotStateListKt.sync) {
                this.list = ((StateListStateRecord) stateRecord).list;
                this.modification = ((StateListStateRecord) stateRecord).modification;
                r rVar = r.f5635a;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @NotNull
        public StateRecord create() {
            return new StateListStateRecord(this.list);
        }

        @NotNull
        public final PersistentList<T> getList$runtime_release() {
            return this.list;
        }

        /* JADX INFO: renamed from: getModification$runtime_release, reason: from getter */
        public final int getModification() {
            return this.modification;
        }

        public final void setList$runtime_release(@NotNull PersistentList<? extends T> persistentList) {
            p.k(persistentList, "<set-?>");
            this.list = persistentList;
        }

        public final void setModification$runtime_release(int i10) {
            this.modification = i10;
        }
    }

    private final boolean conditionalUpdate(l<? super PersistentList<? extends T>, ? extends PersistentList<? extends T>> lVar) {
        Snapshot.Companion companion;
        int modification;
        PersistentList<T> list$runtime_release;
        boolean z10;
        Snapshot current;
        do {
            synchronized (SnapshotStateListKt.sync) {
                try {
                    StateListStateRecord stateListStateRecord = (StateListStateRecord) getFirstStateRecord();
                    companion = Snapshot.INSTANCE;
                    StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.current(stateListStateRecord, companion.getCurrent());
                    modification = stateListStateRecord2.getModification();
                    list$runtime_release = stateListStateRecord2.getList$runtime_release();
                    r rVar = r.f5635a;
                    n.b(1);
                } catch (Throwable th2) {
                    n.b(1);
                    n.a(1);
                    throw th2;
                }
            }
            n.a(1);
            p.h(list$runtime_release);
            PersistentList<? extends T> persistentListInvoke = lVar.invoke(list$runtime_release);
            z10 = false;
            if (p.f(persistentListInvoke, list$runtime_release)) {
                return false;
            }
            synchronized (SnapshotStateListKt.sync) {
                try {
                    StateListStateRecord stateListStateRecord3 = (StateListStateRecord) getFirstStateRecord();
                    SnapshotKt.getSnapshotInitializer();
                    synchronized (SnapshotKt.getLock()) {
                        try {
                            current = companion.getCurrent();
                            StateListStateRecord stateListStateRecord4 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord3, this, current);
                            if (stateListStateRecord4.getModification() == modification) {
                                stateListStateRecord4.setList$runtime_release(persistentListInvoke);
                                stateListStateRecord4.setModification$runtime_release(stateListStateRecord4.getModification() + 1);
                                z10 = true;
                            }
                            n.b(1);
                        } catch (Throwable th3) {
                            n.b(1);
                            n.a(1);
                            throw th3;
                        }
                    }
                    n.a(1);
                    SnapshotKt.notifyWrite(current, this);
                    n.b(1);
                } catch (Throwable th4) {
                    n.b(1);
                    n.a(1);
                    throw th4;
                }
            }
            n.a(1);
        } while (!z10);
        return true;
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getReadable$runtime_release$annotations() {
    }

    private final <R> R mutate(l<? super List<T>, ? extends R> block) {
        Snapshot.Companion companion;
        int modification;
        PersistentList<T> list$runtime_release;
        R rInvoke;
        Snapshot current;
        boolean z10;
        do {
            synchronized (SnapshotStateListKt.sync) {
                try {
                    StateListStateRecord stateListStateRecord = (StateListStateRecord) getFirstStateRecord();
                    companion = Snapshot.INSTANCE;
                    StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.current(stateListStateRecord, companion.getCurrent());
                    modification = stateListStateRecord2.getModification();
                    list$runtime_release = stateListStateRecord2.getList$runtime_release();
                    r rVar = r.f5635a;
                    n.b(1);
                } catch (Throwable th2) {
                    n.b(1);
                    n.a(1);
                    throw th2;
                }
            }
            n.a(1);
            p.h(list$runtime_release);
            PersistentList.Builder<T> builder = list$runtime_release.builder();
            rInvoke = block.invoke(builder);
            PersistentList<T> persistentListBuild = builder.build();
            if (p.f(persistentListBuild, list$runtime_release)) {
                break;
            }
            synchronized (SnapshotStateListKt.sync) {
                try {
                    StateListStateRecord stateListStateRecord3 = (StateListStateRecord) getFirstStateRecord();
                    SnapshotKt.getSnapshotInitializer();
                    synchronized (SnapshotKt.getLock()) {
                        try {
                            current = companion.getCurrent();
                            StateListStateRecord stateListStateRecord4 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord3, this, current);
                            if (stateListStateRecord4.getModification() == modification) {
                                stateListStateRecord4.setList$runtime_release(persistentListBuild);
                                stateListStateRecord4.setModification$runtime_release(stateListStateRecord4.getModification() + 1);
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

    private final boolean mutateBoolean(l<? super List<T>, Boolean> lVar) {
        Snapshot.Companion companion;
        int modification;
        PersistentList<T> list$runtime_release;
        Boolean boolInvoke;
        Snapshot current;
        boolean z10;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateListStateRecord stateListStateRecord = (StateListStateRecord) getFirstStateRecord();
                companion = Snapshot.INSTANCE;
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.current(stateListStateRecord, companion.getCurrent());
                modification = stateListStateRecord2.getModification();
                list$runtime_release = stateListStateRecord2.getList$runtime_release();
                r rVar = r.f5635a;
            }
            p.h(list$runtime_release);
            PersistentList.Builder<T> builder = list$runtime_release.builder();
            boolInvoke = lVar.invoke(builder);
            PersistentList<T> persistentListBuild = builder.build();
            if (p.f(persistentListBuild, list$runtime_release)) {
                break;
            }
            synchronized (SnapshotStateListKt.sync) {
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) getFirstStateRecord();
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    current = companion.getCurrent();
                    StateListStateRecord stateListStateRecord4 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord3, this, current);
                    z10 = true;
                    if (stateListStateRecord4.getModification() == modification) {
                        stateListStateRecord4.setList$runtime_release(persistentListBuild);
                        stateListStateRecord4.setModification$runtime_release(stateListStateRecord4.getModification() + 1);
                    } else {
                        z10 = false;
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            }
        } while (!z10);
        return boolInvoke.booleanValue();
    }

    private final void update(l<? super PersistentList<? extends T>, ? extends PersistentList<? extends T>> lVar) {
        Snapshot.Companion companion;
        int modification;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean z10;
        do {
            synchronized (SnapshotStateListKt.sync) {
                try {
                    StateListStateRecord stateListStateRecord = (StateListStateRecord) getFirstStateRecord();
                    companion = Snapshot.INSTANCE;
                    StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.current(stateListStateRecord, companion.getCurrent());
                    modification = stateListStateRecord2.getModification();
                    list$runtime_release = stateListStateRecord2.getList$runtime_release();
                    r rVar = r.f5635a;
                    n.b(1);
                } catch (Throwable th2) {
                    n.b(1);
                    n.a(1);
                    throw th2;
                }
            }
            n.a(1);
            p.h(list$runtime_release);
            PersistentList<? extends T> persistentListInvoke = lVar.invoke(list$runtime_release);
            if (p.f(persistentListInvoke, list$runtime_release)) {
                return;
            }
            synchronized (SnapshotStateListKt.sync) {
                try {
                    StateListStateRecord stateListStateRecord3 = (StateListStateRecord) getFirstStateRecord();
                    SnapshotKt.getSnapshotInitializer();
                    synchronized (SnapshotKt.getLock()) {
                        try {
                            current = companion.getCurrent();
                            StateListStateRecord stateListStateRecord4 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord3, this, current);
                            if (stateListStateRecord4.getModification() == modification) {
                                stateListStateRecord4.setList$runtime_release(persistentListInvoke);
                                stateListStateRecord4.setModification$runtime_release(stateListStateRecord4.getModification() + 1);
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            n.b(1);
                        } catch (Throwable th3) {
                            n.b(1);
                            n.a(1);
                            throw th3;
                        }
                    }
                    n.a(1);
                    SnapshotKt.notifyWrite(current, this);
                    n.b(1);
                } catch (Throwable th4) {
                    n.b(1);
                    n.a(1);
                    throw th4;
                }
            }
            n.a(1);
        } while (!z10);
    }

    private final <R> R withCurrent(l<? super StateListStateRecord<T>, ? extends R> block) {
        return block.invoke(SnapshotKt.current((StateListStateRecord) getFirstStateRecord(), Snapshot.INSTANCE.getCurrent()));
    }

    private final <R> R writable(l<? super StateListStateRecord<T>, ? extends R> block) {
        Snapshot current;
        R rInvoke;
        StateListStateRecord stateListStateRecord = (StateListStateRecord) getFirstStateRecord();
        SnapshotKt.getSnapshotInitializer();
        synchronized (SnapshotKt.getLock()) {
            try {
                current = Snapshot.INSTANCE.getCurrent();
                rInvoke = block.invoke(SnapshotKt.writableRecord(stateListStateRecord, this, current));
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

    @Override // java.util.List
    public void add(int index, T element) {
        Snapshot.Companion companion;
        int modification;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean z10;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateListStateRecord stateListStateRecord = (StateListStateRecord) getFirstStateRecord();
                companion = Snapshot.INSTANCE;
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.current(stateListStateRecord, companion.getCurrent());
                modification = stateListStateRecord2.getModification();
                list$runtime_release = stateListStateRecord2.getList$runtime_release();
                r rVar = r.f5635a;
            }
            p.h(list$runtime_release);
            PersistentList<T> persistentListAdd = list$runtime_release.add(index, element);
            if (p.f(persistentListAdd, list$runtime_release)) {
                return;
            }
            synchronized (SnapshotStateListKt.sync) {
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) getFirstStateRecord();
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    current = companion.getCurrent();
                    StateListStateRecord stateListStateRecord4 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord3, this, current);
                    z10 = true;
                    if (stateListStateRecord4.getModification() == modification) {
                        stateListStateRecord4.setList$runtime_release(persistentListAdd);
                        stateListStateRecord4.setModification$runtime_release(stateListStateRecord4.getModification() + 1);
                    } else {
                        z10 = false;
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            }
        } while (!z10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T element) {
        Snapshot.Companion companion;
        int modification;
        PersistentList<T> list$runtime_release;
        boolean z10;
        Snapshot current;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateListStateRecord stateListStateRecord = (StateListStateRecord) getFirstStateRecord();
                companion = Snapshot.INSTANCE;
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.current(stateListStateRecord, companion.getCurrent());
                modification = stateListStateRecord2.getModification();
                list$runtime_release = stateListStateRecord2.getList$runtime_release();
                r rVar = r.f5635a;
            }
            p.h(list$runtime_release);
            PersistentList<T> persistentListAdd = list$runtime_release.add(element);
            z10 = false;
            if (p.f(persistentListAdd, list$runtime_release)) {
                return false;
            }
            synchronized (SnapshotStateListKt.sync) {
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) getFirstStateRecord();
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    current = companion.getCurrent();
                    StateListStateRecord stateListStateRecord4 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord3, this, current);
                    if (stateListStateRecord4.getModification() == modification) {
                        stateListStateRecord4.setList$runtime_release(persistentListAdd);
                        stateListStateRecord4.setModification$runtime_release(stateListStateRecord4.getModification() + 1);
                        z10 = true;
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            }
        } while (!z10);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(final int index, @NotNull final Collection<? extends T> elements) {
        p.k(elements, "elements");
        return mutateBoolean(new l<List<T>, Boolean>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateList.addAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull List<T> list) {
                p.k(list, "it");
                return Boolean.valueOf(list.addAll(index, elements));
            }
        });
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(@NotNull Collection<? extends T> elements) {
        Snapshot.Companion companion;
        int modification;
        PersistentList<T> list$runtime_release;
        boolean z10;
        Snapshot current;
        p.k(elements, "elements");
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateListStateRecord stateListStateRecord = (StateListStateRecord) getFirstStateRecord();
                companion = Snapshot.INSTANCE;
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.current(stateListStateRecord, companion.getCurrent());
                modification = stateListStateRecord2.getModification();
                list$runtime_release = stateListStateRecord2.getList$runtime_release();
                r rVar = r.f5635a;
            }
            p.h(list$runtime_release);
            PersistentList<T> persistentListAddAll = list$runtime_release.addAll(elements);
            z10 = false;
            if (p.f(persistentListAddAll, list$runtime_release)) {
                return false;
            }
            synchronized (SnapshotStateListKt.sync) {
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) getFirstStateRecord();
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    current = companion.getCurrent();
                    StateListStateRecord stateListStateRecord4 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord3, this, current);
                    if (stateListStateRecord4.getModification() == modification) {
                        stateListStateRecord4.setList$runtime_release(persistentListAddAll);
                        stateListStateRecord4.setModification$runtime_release(stateListStateRecord4.getModification() + 1);
                        z10 = true;
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            }
        } while (!z10);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        Snapshot current;
        synchronized (SnapshotStateListKt.sync) {
            StateListStateRecord stateListStateRecord = (StateListStateRecord) getFirstStateRecord();
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord, this, current);
                stateListStateRecord2.setList$runtime_release(ExtensionsKt.persistentListOf());
                stateListStateRecord2.setModification$runtime_release(stateListStateRecord2.getModification() + 1);
            }
            SnapshotKt.notifyWrite(current, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object element) {
        return getReadable$runtime_release().getList$runtime_release().contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        p.k(elements, "elements");
        return getReadable$runtime_release().getList$runtime_release().containsAll(elements);
    }

    @Override // java.util.List
    public T get(int index) {
        return getReadable$runtime_release().getList$runtime_release().get(index);
    }

    @NotNull
    public final List<T> getDebuggerDisplayValue() {
        return ((StateListStateRecord) SnapshotKt.current((StateListStateRecord) getFirstStateRecord(), Snapshot.INSTANCE.getCurrent())).getList$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @NotNull
    public StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    public final int getModification$runtime_release() {
        return ((StateListStateRecord) SnapshotKt.current((StateListStateRecord) getFirstStateRecord(), Snapshot.INSTANCE.getCurrent())).getModification();
    }

    @NotNull
    public final StateListStateRecord<T> getReadable$runtime_release() {
        return (StateListStateRecord) SnapshotKt.readable((StateListStateRecord) getFirstStateRecord(), this);
    }

    public int getSize() {
        return getReadable$runtime_release().getList$runtime_release().size();
    }

    @Override // java.util.List
    public int indexOf(Object element) {
        return getReadable$runtime_release().getList$runtime_release().indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return getReadable$runtime_release().getList$runtime_release().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object element) {
        return getReadable$runtime_release().getList$runtime_release().lastIndexOf(element);
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<T> listIterator() {
        return new StateListIterator(this, 0);
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<T> listIterator(int index) {
        return new StateListIterator(this, index);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@NotNull StateRecord stateRecord) {
        p.k(stateRecord, "value");
        stateRecord.setNext$runtime_release(getFirstStateRecord());
        this.firstStateRecord = (StateListStateRecord) stateRecord;
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i10) {
        return removeAt(i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object element) {
        Snapshot.Companion companion;
        int modification;
        PersistentList<T> list$runtime_release;
        boolean z10;
        Snapshot current;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateListStateRecord stateListStateRecord = (StateListStateRecord) getFirstStateRecord();
                companion = Snapshot.INSTANCE;
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.current(stateListStateRecord, companion.getCurrent());
                modification = stateListStateRecord2.getModification();
                list$runtime_release = stateListStateRecord2.getList$runtime_release();
                r rVar = r.f5635a;
            }
            p.h(list$runtime_release);
            PersistentList<T> persistentListRemove = list$runtime_release.remove(element);
            z10 = false;
            if (p.f(persistentListRemove, list$runtime_release)) {
                return false;
            }
            synchronized (SnapshotStateListKt.sync) {
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) getFirstStateRecord();
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    current = companion.getCurrent();
                    StateListStateRecord stateListStateRecord4 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord3, this, current);
                    if (stateListStateRecord4.getModification() == modification) {
                        stateListStateRecord4.setList$runtime_release(persistentListRemove);
                        stateListStateRecord4.setModification$runtime_release(stateListStateRecord4.getModification() + 1);
                        z10 = true;
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            }
        } while (!z10);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Snapshot.Companion companion;
        int modification;
        PersistentList<T> list$runtime_release;
        boolean z10;
        Snapshot current;
        p.k(elements, "elements");
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateListStateRecord stateListStateRecord = (StateListStateRecord) getFirstStateRecord();
                companion = Snapshot.INSTANCE;
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.current(stateListStateRecord, companion.getCurrent());
                modification = stateListStateRecord2.getModification();
                list$runtime_release = stateListStateRecord2.getList$runtime_release();
                r rVar = r.f5635a;
            }
            p.h(list$runtime_release);
            PersistentList<T> persistentListRemoveAll = list$runtime_release.removeAll((Collection<? extends T>) elements);
            z10 = false;
            if (p.f(persistentListRemoveAll, list$runtime_release)) {
                return false;
            }
            synchronized (SnapshotStateListKt.sync) {
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) getFirstStateRecord();
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    current = companion.getCurrent();
                    StateListStateRecord stateListStateRecord4 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord3, this, current);
                    if (stateListStateRecord4.getModification() == modification) {
                        stateListStateRecord4.setList$runtime_release(persistentListRemoveAll);
                        stateListStateRecord4.setModification$runtime_release(stateListStateRecord4.getModification() + 1);
                        z10 = true;
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            }
        } while (!z10);
        return true;
    }

    public T removeAt(int index) {
        Snapshot.Companion companion;
        int modification;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean z10;
        T t10 = get(index);
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateListStateRecord stateListStateRecord = (StateListStateRecord) getFirstStateRecord();
                companion = Snapshot.INSTANCE;
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.current(stateListStateRecord, companion.getCurrent());
                modification = stateListStateRecord2.getModification();
                list$runtime_release = stateListStateRecord2.getList$runtime_release();
                r rVar = r.f5635a;
            }
            p.h(list$runtime_release);
            PersistentList<T> persistentListRemoveAt = list$runtime_release.removeAt(index);
            if (p.f(persistentListRemoveAt, list$runtime_release)) {
                break;
            }
            synchronized (SnapshotStateListKt.sync) {
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) getFirstStateRecord();
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    current = companion.getCurrent();
                    StateListStateRecord stateListStateRecord4 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord3, this, current);
                    z10 = true;
                    if (stateListStateRecord4.getModification() == modification) {
                        stateListStateRecord4.setList$runtime_release(persistentListRemoveAt);
                        stateListStateRecord4.setModification$runtime_release(stateListStateRecord4.getModification() + 1);
                    } else {
                        z10 = false;
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            }
        } while (!z10);
        return t10;
    }

    public final void removeRange(int i10, int i11) {
        Snapshot.Companion companion;
        int modification;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean z10;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateListStateRecord stateListStateRecord = (StateListStateRecord) getFirstStateRecord();
                companion = Snapshot.INSTANCE;
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.current(stateListStateRecord, companion.getCurrent());
                modification = stateListStateRecord2.getModification();
                list$runtime_release = stateListStateRecord2.getList$runtime_release();
                r rVar = r.f5635a;
            }
            p.h(list$runtime_release);
            PersistentList.Builder<T> builder = list$runtime_release.builder();
            builder.subList(i10, i11).clear();
            PersistentList<T> persistentListBuild = builder.build();
            if (p.f(persistentListBuild, list$runtime_release)) {
                return;
            }
            synchronized (SnapshotStateListKt.sync) {
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) getFirstStateRecord();
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    current = companion.getCurrent();
                    StateListStateRecord stateListStateRecord4 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord3, this, current);
                    z10 = true;
                    if (stateListStateRecord4.getModification() == modification) {
                        stateListStateRecord4.setList$runtime_release(persistentListBuild);
                        stateListStateRecord4.setModification$runtime_release(stateListStateRecord4.getModification() + 1);
                    } else {
                        z10 = false;
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            }
        } while (!z10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(@NotNull final Collection<? extends Object> elements) {
        p.k(elements, "elements");
        return mutateBoolean(new l<List<T>, Boolean>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateList.retainAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull List<T> list) {
                p.k(list, "it");
                return Boolean.valueOf(list.retainAll(elements));
            }
        });
    }

    public final int retainAllInRange$runtime_release(@NotNull Collection<? extends T> elements, int start, int end) {
        Snapshot.Companion companion;
        int modification;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean z10;
        p.k(elements, "elements");
        int size = size();
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateListStateRecord stateListStateRecord = (StateListStateRecord) getFirstStateRecord();
                companion = Snapshot.INSTANCE;
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.current(stateListStateRecord, companion.getCurrent());
                modification = stateListStateRecord2.getModification();
                list$runtime_release = stateListStateRecord2.getList$runtime_release();
                r rVar = r.f5635a;
            }
            p.h(list$runtime_release);
            PersistentList.Builder<T> builder = list$runtime_release.builder();
            builder.subList(start, end).retainAll(elements);
            PersistentList<T> persistentListBuild = builder.build();
            if (p.f(persistentListBuild, list$runtime_release)) {
                break;
            }
            synchronized (SnapshotStateListKt.sync) {
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) getFirstStateRecord();
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    current = companion.getCurrent();
                    StateListStateRecord stateListStateRecord4 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord3, this, current);
                    z10 = true;
                    if (stateListStateRecord4.getModification() == modification) {
                        stateListStateRecord4.setList$runtime_release(persistentListBuild);
                        stateListStateRecord4.setModification$runtime_release(stateListStateRecord4.getModification() + 1);
                    } else {
                        z10 = false;
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            }
        } while (!z10);
        return size - size();
    }

    @Override // java.util.List
    public T set(int index, T element) {
        Snapshot.Companion companion;
        int modification;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean z10;
        T t10 = get(index);
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateListStateRecord stateListStateRecord = (StateListStateRecord) getFirstStateRecord();
                companion = Snapshot.INSTANCE;
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.current(stateListStateRecord, companion.getCurrent());
                modification = stateListStateRecord2.getModification();
                list$runtime_release = stateListStateRecord2.getList$runtime_release();
                r rVar = r.f5635a;
            }
            p.h(list$runtime_release);
            PersistentList<T> persistentList = list$runtime_release.set(index, element);
            if (p.f(persistentList, list$runtime_release)) {
                break;
            }
            synchronized (SnapshotStateListKt.sync) {
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) getFirstStateRecord();
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    current = companion.getCurrent();
                    StateListStateRecord stateListStateRecord4 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord3, this, current);
                    z10 = true;
                    if (stateListStateRecord4.getModification() == modification) {
                        stateListStateRecord4.setList$runtime_release(persistentList);
                        stateListStateRecord4.setModification$runtime_release(stateListStateRecord4.getModification() + 1);
                    } else {
                        z10 = false;
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            }
        } while (!z10);
        return t10;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    @NotNull
    public List<T> subList(int fromIndex, int toIndex) {
        if ((fromIndex >= 0 && fromIndex <= toIndex) && toIndex <= size()) {
            return new SubList(this, fromIndex, toIndex);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return h.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        p.k(tArr, "array");
        return (T[]) h.b(this, tArr);
    }
}
