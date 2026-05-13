package androidx.compose.runtime.snapshots;

import bn.r;
import cn.f0;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016J4\u0010\t\u001a\u00020\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016J\u000f\u0010\f\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0012\u0010\u0010J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016¨\u0006\u001d"}, d2 = {"Landroidx/compose/runtime/snapshots/GlobalSnapshot;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Lkotlin/Function1;", "", "Lbn/r;", "readObserver", "Landroidx/compose/runtime/snapshots/Snapshot;", "takeNestedSnapshot", "writeObserver", "takeNestedMutableSnapshot", "notifyObjectsInitialized$runtime_release", "()V", "notifyObjectsInitialized", "snapshot", "", "nestedDeactivated$runtime_release", "(Landroidx/compose/runtime/snapshots/Snapshot;)Ljava/lang/Void;", "nestedDeactivated", "nestedActivated$runtime_release", "nestedActivated", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "apply", "dispose", "", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "<init>", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "runtime_release"}, k = 1, mv = {1, 6, 0})
public final class GlobalSnapshot extends MutableSnapshot {
    public GlobalSnapshot(int i10, @NotNull SnapshotIdSet snapshotIdSet) {
        l<Object, r> lVar;
        p.k(snapshotIdSet, "invalid");
        synchronized (SnapshotKt.getLock()) {
            final List listJ1 = SnapshotKt.globalWriteObservers.isEmpty() ^ true ? f0.j1(SnapshotKt.globalWriteObservers) : null;
            if (listJ1 != null) {
                lVar = (l) f0.U0(listJ1);
                if (lVar == null) {
                    lVar = new l<Object, r>() { // from class: androidx.compose.runtime.snapshots.GlobalSnapshot$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // sn.l
                        public /* bridge */ /* synthetic */ r invoke(Object obj) {
                            invoke2(obj);
                            return r.f5635a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull Object obj) {
                            p.k(obj, "state");
                            List<l<Object, r>> list = listJ1;
                            int size = list.size();
                            for (int i11 = 0; i11 < size; i11++) {
                                list.get(i11).invoke(obj);
                            }
                        }
                    };
                }
            } else {
                lVar = null;
            }
        }
        super(i10, snapshotIdSet, null, lVar);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    @NotNull
    public SnapshotApplyResult apply() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        synchronized (SnapshotKt.getLock()) {
            releasePinnedSnapshotLocked$runtime_release();
            r rVar = r.f5635a;
        }
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    /* JADX INFO: renamed from: nestedActivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo1288nestedActivated$runtime_release(@NotNull Snapshot snapshot) {
        p.k(snapshot, "snapshot");
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    /* JADX INFO: renamed from: nestedDeactivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo1289nestedDeactivated$runtime_release(@NotNull Snapshot snapshot) {
        p.k(snapshot, "snapshot");
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        SnapshotKt.advanceGlobalSnapshot();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    @NotNull
    public MutableSnapshot takeNestedMutableSnapshot(@Nullable final l<Object, r> lVar, @Nullable final l<Object, r> lVar2) {
        return (MutableSnapshot) SnapshotKt.takeNewSnapshot(new l<SnapshotIdSet, MutableSnapshot>() { // from class: androidx.compose.runtime.snapshots.GlobalSnapshot.takeNestedMutableSnapshot.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            @NotNull
            public final MutableSnapshot invoke(@NotNull SnapshotIdSet snapshotIdSet) {
                int i10;
                p.k(snapshotIdSet, "invalid");
                synchronized (SnapshotKt.getLock()) {
                    i10 = SnapshotKt.nextSnapshotId;
                    SnapshotKt.nextSnapshotId = i10 + 1;
                }
                return new MutableSnapshot(i10, snapshotIdSet, lVar, lVar2);
            }
        });
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    public Snapshot takeNestedSnapshot(@Nullable final l<Object, r> lVar) {
        return SnapshotKt.takeNewSnapshot(new l<SnapshotIdSet, ReadonlySnapshot>() { // from class: androidx.compose.runtime.snapshots.GlobalSnapshot.takeNestedSnapshot.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            @NotNull
            public final ReadonlySnapshot invoke(@NotNull SnapshotIdSet snapshotIdSet) {
                int i10;
                p.k(snapshotIdSet, "invalid");
                synchronized (SnapshotKt.getLock()) {
                    i10 = SnapshotKt.nextSnapshotId;
                    SnapshotKt.nextSnapshotId = i10 + 1;
                }
                return new ReadonlySnapshot(i10, snapshotIdSet, lVar);
            }
        });
    }
}
