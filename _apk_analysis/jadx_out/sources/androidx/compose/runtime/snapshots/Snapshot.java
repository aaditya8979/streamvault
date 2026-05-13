package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.ExperimentalComposeApi;
import androidx.compose.runtime.InternalComposeApi;
import androidx.compose.runtime.internal.StabilityInferred;
import bn.r;
import cn.f0;
import com.mgs.carparking.dbtable.VideoLookHistoryEntry;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import sn.l;
import tn.i;
import tn.n;
import tn.p;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010#\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 T2\u00020\u0001:\u0001TB\u0019\b\u0004\u0012\u0006\u00107\u001a\u00020+\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\bR\u0010SJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0006\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H&J\b\u0010\b\u001a\u00020\u0007H&J'\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0086\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\n\u0010\u000e\u001a\u0004\u0018\u00010\u0000H\u0011J\u0012\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0000H\u0011J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0000H\u0007J\u0012\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000H\u0007J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0000H ¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0000H ¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H ¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010 \u001a\u00020\u0002H ¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\"\u001a\u00020\u0002H\u0000¢\u0006\u0004\b!\u0010\u001fJ\u000f\u0010$\u001a\u00020\u0002H\u0010¢\u0006\u0004\b#\u0010\u001fJ\u000f\u0010&\u001a\u00020\u0002H\u0010¢\u0006\u0004\b%\u0010\u001fJ\u000f\u0010(\u001a\u00020\u0002H\u0000¢\u0006\u0004\b'\u0010\u001fJ\u000f\u0010*\u001a\u00020\u0002H\u0000¢\u0006\u0004\b)\u0010\u001fJ\u000f\u0010.\u001a\u00020+H\u0000¢\u0006\u0004\b,\u0010-R\"\u00100\u001a\u00020/8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R*\u00107\u001a\u00020+2\u0006\u00106\u001a\u00020+8\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010-\"\u0004\b:\u0010;R\"\u0010<\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u00108R\u0014\u0010E\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010G\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\bF\u0010?R\u0015\u0010I\u001a\u00020\u00078À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\bH\u0010?R\"\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048 X \u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\"\u0010M\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048 X \u0004¢\u0006\u0006\u001a\u0004\bL\u0010KR\u001c\u0010Q\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010N8 X \u0004¢\u0006\u0006\u001a\u0004\bO\u0010P\u0082\u0001\u0004UVWX\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006Y"}, d2 = {"Landroidx/compose/runtime/snapshots/Snapshot;", "", "Lbn/r;", "dispose", "Lkotlin/Function1;", "readObserver", "takeNestedSnapshot", "", "hasPendingChanges", "T", "Lkotlin/Function0;", "block", "enter", "(Lsn/a;)Ljava/lang/Object;", "makeCurrent", "snapshot", "restoreCurrent", "unsafeEnter", "oldSnapshot", "unsafeLeave", "nestedActivated$runtime_release", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "nestedActivated", "nestedDeactivated$runtime_release", "nestedDeactivated", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "recordModified$runtime_release", "(Landroidx/compose/runtime/snapshots/StateObject;)V", "recordModified", "notifyObjectsInitialized$runtime_release", "()V", "notifyObjectsInitialized", "closeAndReleasePinning$runtime_release", "closeAndReleasePinning", "closeLocked$runtime_release", "closeLocked", "releasePinnedSnapshotsForCloseLocked$runtime_release", "releasePinnedSnapshotsForCloseLocked", "validateNotDisposed$runtime_release", "validateNotDisposed", "releasePinnedSnapshotLocked$runtime_release", "releasePinnedSnapshotLocked", "", "takeoverPinnedSnapshot$runtime_release", "()I", "takeoverPinnedSnapshot", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getInvalid$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setInvalid$runtime_release", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "<set-?>", "id", "I", "getId", "setId$runtime_release", "(I)V", "disposed", "Z", "getDisposed$runtime_release", "()Z", "setDisposed$runtime_release", "(Z)V", "pinningTrackingHandle", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "root", "getReadOnly", "readOnly", "isPinned$runtime_release", "isPinned", "getReadObserver$runtime_release", "()Lsn/l;", "getWriteObserver$runtime_release", "writeObserver", "", "getModified$runtime_release", "()Ljava/util/Set;", "modified", "<init>", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)V", VastTagName.COMPANION, "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/ReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/TransparentObserverSnapshot;", "runtime_release"}, k = 1, mv = {1, 6, 0})
public abstract class Snapshot {
    private boolean disposed;
    private int id;

    @NotNull
    private SnapshotIdSet invalid;
    private int pinningTrackingHandle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: Snapshot.kt */
    @Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b&\u0010'J\u001e\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002J6\u0010\t\u001a\u00020\b2\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002J'\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000eJQ\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0005H\u0001J9\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0002\b\u0014H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0015\u0010\u000eJ&\u0010\u001a\u001a\u00020\u00192\u001e\u0010\u0018\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0017\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u0016J\u001a\u0010\u001b\u001a\u00020\u00192\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\u001c\u001a\u00020\u0003J\u0006\u0010\u001d\u001a\u00020\u0003J\b\u0010\u001f\u001a\u00020\u001eH\u0007J\n\u0010 \u001a\u0004\u0018\u00010\u0005H\u0001J\u0012\u0010\"\u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0005H\u0001R\u0011\u0010%\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006("}, d2 = {"Landroidx/compose/runtime/snapshots/Snapshot$Companion;", "", "Lkotlin/Function1;", "Lbn/r;", "readObserver", "Landroidx/compose/runtime/snapshots/Snapshot;", "takeSnapshot", "writeObserver", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "takeMutableSnapshot", "T", "Lkotlin/Function0;", "block", "global", "(Lsn/a;)Ljava/lang/Object;", "R", "withMutableSnapshot", "observe", "(Lsn/l;Lsn/l;Lsn/a;)Ljava/lang/Object;", "createNonObservableSnapshot", "Landroidx/compose/runtime/DisallowComposableCalls;", "withoutReadObservation", "Lkotlin/Function2;", "", "observer", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "registerApplyObserver", "registerGlobalWriteObserver", "notifyObjectsInitialized", "sendApplyNotifications", "", "openSnapshotCount", "removeCurrent", "previous", "restoreCurrent", "getCurrent", "()Landroidx/compose/runtime/snapshots/Snapshot;", VideoLookHistoryEntry.CURRNET, "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object observe$default(Companion companion, l lVar, l lVar2, a aVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                lVar = null;
            }
            if ((i10 & 2) != 0) {
                lVar2 = null;
            }
            return companion.observe(lVar, lVar2, aVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MutableSnapshot takeMutableSnapshot$default(Companion companion, l lVar, l lVar2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                lVar = null;
            }
            if ((i10 & 2) != 0) {
                lVar2 = null;
            }
            return companion.takeMutableSnapshot(lVar, lVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Snapshot takeSnapshot$default(Companion companion, l lVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                lVar = null;
            }
            return companion.takeSnapshot(lVar);
        }

        @NotNull
        public final Snapshot createNonObservableSnapshot() {
            return SnapshotKt.createTransparentSnapshotWithNoParentReadObserver$default((Snapshot) SnapshotKt.threadSnapshot.get(), null, false, 6, null);
        }

        @NotNull
        public final Snapshot getCurrent() {
            return SnapshotKt.currentSnapshot();
        }

        public final <T> T global(@NotNull a<? extends T> block) {
            p.k(block, "block");
            Snapshot snapshotRemoveCurrent = removeCurrent();
            T tInvoke = block.invoke();
            Snapshot.INSTANCE.restoreCurrent(snapshotRemoveCurrent);
            return tInvoke;
        }

        public final void notifyObjectsInitialized() {
            SnapshotKt.currentSnapshot().notifyObjectsInitialized$runtime_release();
        }

        public final <T> T observe(@Nullable l<Object, r> readObserver, @Nullable l<Object, r> writeObserver, @NotNull a<? extends T> block) {
            Snapshot transparentObserverMutableSnapshot;
            p.k(block, "block");
            if (readObserver == null && writeObserver == null) {
                return block.invoke();
            }
            Snapshot snapshot = (Snapshot) SnapshotKt.threadSnapshot.get();
            if (snapshot == null || (snapshot instanceof MutableSnapshot)) {
                transparentObserverMutableSnapshot = new TransparentObserverMutableSnapshot(snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null, readObserver, writeObserver, true, false);
            } else {
                if (readObserver == null) {
                    return block.invoke();
                }
                transparentObserverMutableSnapshot = snapshot.takeNestedSnapshot(readObserver);
            }
            try {
                Snapshot snapshotMakeCurrent = transparentObserverMutableSnapshot.makeCurrent();
                try {
                    return block.invoke();
                } finally {
                    transparentObserverMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                }
            } finally {
                transparentObserverMutableSnapshot.dispose();
            }
        }

        @InternalComposeApi
        public final int openSnapshotCount() {
            return f0.g1(SnapshotKt.openSnapshots).size();
        }

        @NotNull
        public final ObserverHandle registerApplyObserver(@NotNull final sn.p<? super Set<? extends Object>, ? super Snapshot, r> pVar) {
            p.k(pVar, "observer");
            SnapshotKt.advanceGlobalSnapshot(SnapshotKt.emptyLambda);
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.applyObservers.add(pVar);
            }
            return new ObserverHandle() { // from class: androidx.compose.runtime.snapshots.Snapshot$Companion$registerApplyObserver$2
                @Override // androidx.compose.runtime.snapshots.ObserverHandle
                public final void dispose() {
                    sn.p<Set<? extends Object>, Snapshot, r> pVar2 = pVar;
                    synchronized (SnapshotKt.getLock()) {
                        SnapshotKt.applyObservers.remove(pVar2);
                        r rVar = r.f5635a;
                    }
                }
            };
        }

        @NotNull
        public final ObserverHandle registerGlobalWriteObserver(@NotNull final l<Object, r> lVar) {
            p.k(lVar, "observer");
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.globalWriteObservers.add(lVar);
            }
            SnapshotKt.advanceGlobalSnapshot();
            return new ObserverHandle() { // from class: androidx.compose.runtime.snapshots.Snapshot$Companion$registerGlobalWriteObserver$2
                @Override // androidx.compose.runtime.snapshots.ObserverHandle
                public final void dispose() {
                    l<Object, r> lVar2 = lVar;
                    synchronized (SnapshotKt.getLock()) {
                        SnapshotKt.globalWriteObservers.remove(lVar2);
                    }
                    SnapshotKt.advanceGlobalSnapshot();
                }
            };
        }

        @Nullable
        public final Snapshot removeCurrent() {
            Snapshot snapshot = (Snapshot) SnapshotKt.threadSnapshot.get();
            if (snapshot != null) {
                SnapshotKt.threadSnapshot.set(null);
            }
            return snapshot;
        }

        public final void restoreCurrent(@Nullable Snapshot snapshot) {
            if (snapshot != null) {
                SnapshotKt.threadSnapshot.set(snapshot);
            }
        }

        public final void sendApplyNotifications() {
            boolean z10;
            synchronized (SnapshotKt.getLock()) {
                z10 = false;
                if (((GlobalSnapshot) SnapshotKt.currentGlobalSnapshot.get()).getModified$runtime_release() != null) {
                    if (!r1.isEmpty()) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                SnapshotKt.advanceGlobalSnapshot();
            }
        }

        @NotNull
        public final MutableSnapshot takeMutableSnapshot(@Nullable l<Object, r> lVar, @Nullable l<Object, r> lVar2) {
            MutableSnapshot mutableSnapshotTakeNestedMutableSnapshot;
            Snapshot snapshotCurrentSnapshot = SnapshotKt.currentSnapshot();
            MutableSnapshot mutableSnapshot = snapshotCurrentSnapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshotCurrentSnapshot : null;
            if (mutableSnapshot == null || (mutableSnapshotTakeNestedMutableSnapshot = mutableSnapshot.takeNestedMutableSnapshot(lVar, lVar2)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
            }
            return mutableSnapshotTakeNestedMutableSnapshot;
        }

        @NotNull
        public final Snapshot takeSnapshot(@Nullable l<Object, r> lVar) {
            return SnapshotKt.currentSnapshot().takeNestedSnapshot(lVar);
        }

        public final <R> R withMutableSnapshot(@NotNull a<? extends R> block) {
            p.k(block, "block");
            MutableSnapshot mutableSnapshotTakeMutableSnapshot$default = takeMutableSnapshot$default(this, null, null, 3, null);
            try {
                Snapshot snapshotMakeCurrent = mutableSnapshotTakeMutableSnapshot$default.makeCurrent();
                try {
                    R rInvoke = block.invoke();
                    n.b(1);
                    mutableSnapshotTakeMutableSnapshot$default.restoreCurrent(snapshotMakeCurrent);
                    n.a(1);
                    mutableSnapshotTakeMutableSnapshot$default.apply().check();
                    return rInvoke;
                } catch (Throwable th2) {
                    n.b(1);
                    mutableSnapshotTakeMutableSnapshot$default.restoreCurrent(snapshotMakeCurrent);
                    n.a(1);
                    throw th2;
                }
            } finally {
                n.b(1);
                mutableSnapshotTakeMutableSnapshot$default.dispose();
                n.a(1);
            }
        }

        public final <T> T withoutReadObservation(@NotNull a<? extends T> block) {
            p.k(block, "block");
            Snapshot snapshotCreateNonObservableSnapshot = createNonObservableSnapshot();
            try {
                Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
                try {
                    return block.invoke();
                } finally {
                    n.b(1);
                    snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    n.a(1);
                }
            } finally {
                n.b(1);
                snapshotCreateNonObservableSnapshot.dispose();
                n.a(1);
            }
        }
    }

    private Snapshot(int i10, SnapshotIdSet snapshotIdSet) {
        this.invalid = snapshotIdSet;
        this.id = i10;
        this.pinningTrackingHandle = i10 != 0 ? SnapshotKt.trackPinning(i10, getInvalid()) : -1;
    }

    public /* synthetic */ Snapshot(int i10, SnapshotIdSet snapshotIdSet, i iVar) {
        this(i10, snapshotIdSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Snapshot takeNestedSnapshot$default(Snapshot snapshot, l lVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedSnapshot");
        }
        if ((i10 & 1) != 0) {
            lVar = null;
        }
        return snapshot.takeNestedSnapshot(lVar);
    }

    public final void closeAndReleasePinning$runtime_release() {
        synchronized (SnapshotKt.getLock()) {
            closeLocked$runtime_release();
            releasePinnedSnapshotsForCloseLocked$runtime_release();
            r rVar = r.f5635a;
        }
    }

    public void closeLocked$runtime_release() {
        SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.clear(getId());
    }

    public void dispose() {
        this.disposed = true;
        synchronized (SnapshotKt.getLock()) {
            releasePinnedSnapshotLocked$runtime_release();
            r rVar = r.f5635a;
        }
    }

    public final <T> T enter(@NotNull a<? extends T> block) {
        p.k(block, "block");
        Snapshot snapshotMakeCurrent = makeCurrent();
        try {
            return block.invoke();
        } finally {
            n.b(1);
            restoreCurrent(snapshotMakeCurrent);
            n.a(1);
        }
    }

    /* JADX INFO: renamed from: getDisposed$runtime_release, reason: from getter */
    public final boolean getDisposed() {
        return this.disposed;
    }

    public int getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: getInvalid$runtime_release, reason: from getter */
    public SnapshotIdSet getInvalid() {
        return this.invalid;
    }

    @Nullable
    public abstract Set<StateObject> getModified$runtime_release();

    @Nullable
    public abstract l<Object, r> getReadObserver$runtime_release();

    public abstract boolean getReadOnly();

    @NotNull
    public abstract Snapshot getRoot();

    @Nullable
    public abstract l<Object, r> getWriteObserver$runtime_release();

    public abstract boolean hasPendingChanges();

    public final boolean isPinned$runtime_release() {
        return this.pinningTrackingHandle >= 0;
    }

    @Nullable
    public Snapshot makeCurrent() {
        Snapshot snapshot = (Snapshot) SnapshotKt.threadSnapshot.get();
        SnapshotKt.threadSnapshot.set(this);
        return snapshot;
    }

    /* JADX INFO: renamed from: nestedActivated$runtime_release */
    public abstract void mo1288nestedActivated$runtime_release(@NotNull Snapshot snapshot);

    /* JADX INFO: renamed from: nestedDeactivated$runtime_release */
    public abstract void mo1289nestedDeactivated$runtime_release(@NotNull Snapshot snapshot);

    public abstract void notifyObjectsInitialized$runtime_release();

    /* JADX INFO: renamed from: recordModified$runtime_release */
    public abstract void mo1290recordModified$runtime_release(@NotNull StateObject state);

    public final void releasePinnedSnapshotLocked$runtime_release() {
        int i10 = this.pinningTrackingHandle;
        if (i10 >= 0) {
            SnapshotKt.releasePinningLocked(i10);
            this.pinningTrackingHandle = -1;
        }
    }

    public void releasePinnedSnapshotsForCloseLocked$runtime_release() {
        releasePinnedSnapshotLocked$runtime_release();
    }

    public void restoreCurrent(@Nullable Snapshot snapshot) {
        SnapshotKt.threadSnapshot.set(snapshot);
    }

    public final void setDisposed$runtime_release(boolean z10) {
        this.disposed = z10;
    }

    public void setId$runtime_release(int i10) {
        this.id = i10;
    }

    public void setInvalid$runtime_release(@NotNull SnapshotIdSet snapshotIdSet) {
        p.k(snapshotIdSet, "<set-?>");
        this.invalid = snapshotIdSet;
    }

    @NotNull
    public abstract Snapshot takeNestedSnapshot(@Nullable l<Object, r> lVar);

    public final int takeoverPinnedSnapshot$runtime_release() {
        int i10 = this.pinningTrackingHandle;
        this.pinningTrackingHandle = -1;
        return i10;
    }

    @ExperimentalComposeApi
    @Nullable
    public final Snapshot unsafeEnter() {
        return makeCurrent();
    }

    @ExperimentalComposeApi
    public final void unsafeLeave(@Nullable Snapshot snapshot) {
        if (SnapshotKt.threadSnapshot.get() == this) {
            restoreCurrent(snapshot);
            return;
        }
        throw new IllegalStateException(("Cannot leave snapshot; " + this + " is not the current snapshot").toString());
    }

    public final void validateNotDisposed$runtime_release() {
        if (!(!this.disposed)) {
            throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
        }
    }
}
