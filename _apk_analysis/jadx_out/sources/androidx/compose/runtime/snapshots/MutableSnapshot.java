package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import bn.h;
import bn.r;
import cn.f0;
import cn.w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import sn.l;
import tn.n;
import tn.p;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010#\n\u0002\b!\b\u0017\u0018\u00002\u00020\u0001BE\b\u0000\u0012\u0006\u00100\u001a\u00020 \u0012\u0006\u0010h\u001a\u00020%\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\bi\u0010jJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J8\u0010\n\u001a\u00020\u00002\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016J\u001e\u0010\u000e\u001a\u00020\u00012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H\u0016J\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0017\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u001a\u0010\u0016J\u000f\u0010\u001d\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001c\u0010\u0016J\u000f\u0010\u001f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001e\u0010\u0016J5\u0010)\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 2\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#\u0018\u00010\"2\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b'\u0010(J'\u0010/\u001a\u00028\u0000\"\u0004\b\u0000\u0010*2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+H\u0080\bø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0002H\u0000¢\u0006\u0004\b-\u0010\u0016J\u0017\u00103\u001a\u00020\u00022\u0006\u00100\u001a\u00020 H\u0000¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u00022\u0006\u00100\u001a\u00020 H\u0000¢\u0006\u0004\b4\u00102J\u0017\u0010:\u001a\u00020\u00022\u0006\u00107\u001a\u000206H\u0000¢\u0006\u0004\b8\u00109J\u000f\u0010<\u001a\u00020\u0002H\u0000¢\u0006\u0004\b;\u0010\u0016J\u0017\u0010@\u001a\u00020\u00022\u0006\u0010=\u001a\u00020%H\u0000¢\u0006\u0004\b>\u0010?J\u0017\u0010E\u001a\u00020\u00022\u0006\u0010B\u001a\u00020AH\u0010¢\u0006\u0004\bC\u0010DR(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\b\u0010F\u001a\u0004\bG\u0010HR(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\t\u0010F\u001a\u0004\bI\u0010HR:\u0010L\u001a\n\u0012\u0004\u0012\u00020A\u0018\u00010J2\u000e\u0010K\u001a\n\u0012\u0004\u0012\u00020A\u0018\u00010J8\u0010@VX\u0090\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010R\u001a\u00020%8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010?R\"\u0010W\u001a\u0002068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u00109R\u0016\u0010=\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010\\R\"\u0010]\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u0014\u0010d\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010`R\u0014\u0010g\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006k"}, d2 = {"Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "Lbn/r;", "abandon", "", "hasPendingChanges", "Lkotlin/Function1;", "", "readObserver", "writeObserver", "takeNestedMutableSnapshot", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "apply", "dispose", "takeNestedSnapshot", "snapshot", "nestedActivated$runtime_release", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "nestedActivated", "nestedDeactivated$runtime_release", "nestedDeactivated", "notifyObjectsInitialized$runtime_release", "()V", "notifyObjectsInitialized", "closeLocked$runtime_release", "closeLocked", "releasePinnedSnapshotsForCloseLocked$runtime_release", "releasePinnedSnapshotsForCloseLocked", "validateNotApplied$runtime_release", "validateNotApplied", "validateNotAppliedOrPinned$runtime_release", "validateNotAppliedOrPinned", "", "snapshotId", "", "Landroidx/compose/runtime/snapshots/StateRecord;", "optimisticMerges", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalidSnapshots", "innerApplyLocked$runtime_release", "(ILjava/util/Map;Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "innerApplyLocked", "T", "Lkotlin/Function0;", "block", "advance$runtime_release", "(Lsn/a;)Ljava/lang/Object;", "advance", "id", "recordPrevious$runtime_release", "(I)V", "recordPrevious", "recordPreviousPinnedSnapshot$runtime_release", "recordPreviousPinnedSnapshot", "", "handles", "recordPreviousPinnedSnapshots$runtime_release", "([I)V", "recordPreviousPinnedSnapshots", "releasePreviouslyPinnedSnapshotsLocked$runtime_release", "releasePreviouslyPinnedSnapshotsLocked", "snapshots", "recordPreviousList$runtime_release", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "recordPreviousList", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "recordModified$runtime_release", "(Landroidx/compose/runtime/snapshots/StateObject;)V", "recordModified", "Lsn/l;", "getReadObserver$runtime_release", "()Lsn/l;", "getWriteObserver$runtime_release", "", "<set-?>", "modified", "Ljava/util/Set;", "getModified$runtime_release", "()Ljava/util/Set;", "setModified", "(Ljava/util/Set;)V", "previousIds", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getPreviousIds$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setPreviousIds$runtime_release", "previousPinnedSnapshots", "[I", "getPreviousPinnedSnapshots$runtime_release", "()[I", "setPreviousPinnedSnapshots$runtime_release", "I", "applied", "Z", "getApplied$runtime_release", "()Z", "setApplied$runtime_release", "(Z)V", "getReadOnly", "readOnly", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "root", "invalid", "<init>", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;Lsn/l;Lsn/l;)V", "runtime_release"}, k = 1, mv = {1, 6, 0})
public class MutableSnapshot extends Snapshot {
    public static final int $stable = 8;
    private boolean applied;

    @Nullable
    private Set<StateObject> modified;

    @NotNull
    private SnapshotIdSet previousIds;

    @NotNull
    private int[] previousPinnedSnapshots;

    @Nullable
    private final l<Object, r> readObserver;
    private int snapshots;

    @Nullable
    private final l<Object, r> writeObserver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableSnapshot(int i10, @NotNull SnapshotIdSet snapshotIdSet, @Nullable l<Object, r> lVar, @Nullable l<Object, r> lVar2) {
        super(i10, snapshotIdSet, null);
        p.k(snapshotIdSet, "invalid");
        this.readObserver = lVar;
        this.writeObserver = lVar2;
        this.previousIds = SnapshotIdSet.INSTANCE.getEMPTY();
        this.previousPinnedSnapshots = new int[0];
        this.snapshots = 1;
    }

    private final void abandon() {
        Set<StateObject> modified$runtime_release = getModified$runtime_release();
        if (modified$runtime_release != null) {
            validateNotApplied$runtime_release();
            setModified(null);
            int id2 = getId();
            Iterator<StateObject> it = modified$runtime_release.iterator();
            while (it.hasNext()) {
                for (StateRecord firstStateRecord = it.next().getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext()) {
                    if (firstStateRecord.getSnapshotId() == id2 || f0.i0(this.previousIds, Integer.valueOf(firstStateRecord.getSnapshotId()))) {
                        firstStateRecord.setSnapshotId$runtime_release(0);
                    }
                }
            }
        }
        closeAndReleasePinning$runtime_release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MutableSnapshot takeNestedMutableSnapshot$default(MutableSnapshot mutableSnapshot, l lVar, l lVar2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedMutableSnapshot");
        }
        if ((i10 & 1) != 0) {
            lVar = null;
        }
        if ((i10 & 2) != 0) {
            lVar2 = null;
        }
        return mutableSnapshot.takeNestedMutableSnapshot(lVar, lVar2);
    }

    public final <T> T advance$runtime_release(@NotNull a<? extends T> block) {
        p.k(block, "block");
        recordPrevious$runtime_release(getId());
        T tInvoke = block.invoke();
        if (!getApplied() && !getDisposed()) {
            int id2 = getId();
            synchronized (SnapshotKt.getLock()) {
                try {
                    int i10 = SnapshotKt.nextSnapshotId;
                    SnapshotKt.nextSnapshotId = i10 + 1;
                    setId$runtime_release(i10);
                    SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getId());
                    r rVar = r.f5635a;
                    n.b(1);
                } catch (Throwable th2) {
                    n.b(1);
                    n.a(1);
                    throw th2;
                }
            }
            n.a(1);
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid(), id2 + 1, getId()));
        }
        return tInvoke;
    }

    public final void advance$runtime_release() {
        recordPrevious$runtime_release(getId());
        r rVar = r.f5635a;
        if (getApplied() || getDisposed()) {
            return;
        }
        int id2 = getId();
        synchronized (SnapshotKt.getLock()) {
            int i10 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = i10 + 1;
            setId$runtime_release(i10);
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getId());
        }
        setInvalid$runtime_release(SnapshotKt.addRange(getInvalid(), id2 + 1, getId()));
    }

    @NotNull
    public SnapshotApplyResult apply() {
        Map<StateRecord, ? extends StateRecord> mapOptimisticMerges;
        Pair pairA;
        Set<StateObject> modified$runtime_release = getModified$runtime_release();
        if (modified$runtime_release != null) {
            Object obj = SnapshotKt.currentGlobalSnapshot.get();
            p.j(obj, "currentGlobalSnapshot.get()");
            mapOptimisticMerges = SnapshotKt.optimisticMerges((MutableSnapshot) obj, this, SnapshotKt.openSnapshots.clear(((GlobalSnapshot) SnapshotKt.currentGlobalSnapshot.get()).getId()));
        } else {
            mapOptimisticMerges = null;
        }
        synchronized (SnapshotKt.getLock()) {
            SnapshotKt.validateOpen(this);
            if (modified$runtime_release == null || modified$runtime_release.size() == 0) {
                closeLocked$runtime_release();
                GlobalSnapshot globalSnapshot = (GlobalSnapshot) SnapshotKt.currentGlobalSnapshot.get();
                p.j(globalSnapshot, "previousGlobalSnapshot");
                SnapshotKt.takeNewGlobalSnapshot(globalSnapshot, SnapshotKt.emptyLambda);
                Set<StateObject> modified$runtime_release2 = globalSnapshot.getModified$runtime_release();
                pairA = (modified$runtime_release2 == null || !(modified$runtime_release2.isEmpty() ^ true)) ? h.a(w.m(), null) : h.a(f0.j1(SnapshotKt.applyObservers), modified$runtime_release2);
            } else {
                GlobalSnapshot globalSnapshot2 = (GlobalSnapshot) SnapshotKt.currentGlobalSnapshot.get();
                SnapshotApplyResult snapshotApplyResultInnerApplyLocked$runtime_release = innerApplyLocked$runtime_release(SnapshotKt.nextSnapshotId, mapOptimisticMerges, SnapshotKt.openSnapshots.clear(globalSnapshot2.getId()));
                if (!p.f(snapshotApplyResultInnerApplyLocked$runtime_release, SnapshotApplyResult.Success.INSTANCE)) {
                    return snapshotApplyResultInnerApplyLocked$runtime_release;
                }
                closeLocked$runtime_release();
                p.j(globalSnapshot2, "previousGlobalSnapshot");
                SnapshotKt.takeNewGlobalSnapshot(globalSnapshot2, SnapshotKt.emptyLambda);
                Set<StateObject> modified$runtime_release3 = globalSnapshot2.getModified$runtime_release();
                setModified(null);
                globalSnapshot2.setModified(null);
                pairA = h.a(f0.j1(SnapshotKt.applyObservers), modified$runtime_release3);
            }
            List list = (List) pairA.component1();
            Set set = (Set) pairA.component2();
            this.applied = true;
            if (set != null && (!set.isEmpty())) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((sn.p) list.get(i10)).mo2invoke(set, this);
                }
            }
            if (modified$runtime_release != null && (!modified$runtime_release.isEmpty())) {
                int size2 = list.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    ((sn.p) list.get(i11)).mo2invoke(modified$runtime_release, this);
                }
            }
            synchronized (SnapshotKt.getLock()) {
                releasePinnedSnapshotsForCloseLocked$runtime_release();
                r rVar = r.f5635a;
            }
            return SnapshotApplyResult.Success.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void closeLocked$runtime_release() {
        SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.clear(getId()).andNot(this.previousIds);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (getDisposed()) {
            return;
        }
        super.dispose();
        mo1289nestedDeactivated$runtime_release(this);
    }

    /* JADX INFO: renamed from: getApplied$runtime_release, reason: from getter */
    public final boolean getApplied() {
        return this.applied;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @Nullable
    public Set<StateObject> getModified$runtime_release() {
        return this.modified;
    }

    @NotNull
    /* JADX INFO: renamed from: getPreviousIds$runtime_release, reason: from getter */
    public final SnapshotIdSet getPreviousIds() {
        return this.previousIds;
    }

    @NotNull
    /* JADX INFO: renamed from: getPreviousPinnedSnapshots$runtime_release, reason: from getter */
    public final int[] getPreviousPinnedSnapshots() {
        return this.previousPinnedSnapshots;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @Nullable
    public l<Object, r> getReadObserver$runtime_release() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    public Snapshot getRoot() {
        return this;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @Nullable
    public l<Object, r> getWriteObserver$runtime_release() {
        return this.writeObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        Set<StateObject> modified$runtime_release = getModified$runtime_release();
        return modified$runtime_release != null && (modified$runtime_release.isEmpty() ^ true);
    }

    @NotNull
    public final SnapshotApplyResult innerApplyLocked$runtime_release(int snapshotId, @Nullable Map<StateRecord, ? extends StateRecord> optimisticMerges, @NotNull SnapshotIdSet invalidSnapshots) {
        StateRecord stateRecord;
        StateRecord stateRecordMergeRecords;
        p.k(invalidSnapshots, "invalidSnapshots");
        SnapshotIdSet snapshotIdSetOr = getInvalid().set(getId()).or(this.previousIds);
        Set<StateObject> modified$runtime_release = getModified$runtime_release();
        p.h(modified$runtime_release);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (StateObject stateObject : modified$runtime_release) {
            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
            StateRecord stateRecord2 = SnapshotKt.readable(firstStateRecord, snapshotId, invalidSnapshots);
            if (stateRecord2 != null && (stateRecord = SnapshotKt.readable(firstStateRecord, getId(), snapshotIdSetOr)) != null && !p.f(stateRecord2, stateRecord)) {
                StateRecord stateRecord3 = SnapshotKt.readable(firstStateRecord, getId(), getInvalid());
                if (stateRecord3 == null) {
                    SnapshotKt.readError();
                    throw new KotlinNothingValueException();
                }
                if (optimisticMerges == null || (stateRecordMergeRecords = optimisticMerges.get(stateRecord2)) == null) {
                    stateRecordMergeRecords = stateObject.mergeRecords(stateRecord, stateRecord2, stateRecord3);
                }
                if (stateRecordMergeRecords == null) {
                    return new SnapshotApplyResult.Failure(this);
                }
                if (!p.f(stateRecordMergeRecords, stateRecord3)) {
                    if (p.f(stateRecordMergeRecords, stateRecord2)) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(h.a(stateObject, stateRecord2.create()));
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(stateObject);
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(!p.f(stateRecordMergeRecords, stateRecord) ? h.a(stateObject, stateRecordMergeRecords) : h.a(stateObject, stateRecord.create()));
                    }
                }
            }
        }
        if (arrayList != null) {
            advance$runtime_release();
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Pair pair = (Pair) arrayList.get(i10);
                StateObject stateObject2 = (StateObject) pair.component1();
                StateRecord stateRecord4 = (StateRecord) pair.component2();
                stateRecord4.setSnapshotId$runtime_release(getId());
                synchronized (SnapshotKt.getLock()) {
                    stateRecord4.setNext$runtime_release(stateObject2.getFirstStateRecord());
                    stateObject2.prependStateRecord(stateRecord4);
                    r rVar = r.f5635a;
                }
            }
        }
        if (arrayList2 != null) {
            modified$runtime_release.removeAll(arrayList2);
        }
        return SnapshotApplyResult.Success.INSTANCE;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: nestedActivated$runtime_release */
    public void mo1288nestedActivated$runtime_release(@NotNull Snapshot snapshot) {
        p.k(snapshot, "snapshot");
        this.snapshots++;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: nestedDeactivated$runtime_release */
    public void mo1289nestedDeactivated$runtime_release(@NotNull Snapshot snapshot) {
        p.k(snapshot, "snapshot");
        int i10 = this.snapshots;
        if (!(i10 > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i11 = i10 - 1;
        this.snapshots = i11;
        if (i11 != 0 || this.applied) {
            return;
        }
        abandon();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        if (this.applied || getDisposed()) {
            return;
        }
        advance$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: recordModified$runtime_release */
    public void mo1290recordModified$runtime_release(@NotNull StateObject state) {
        p.k(state, "state");
        Set<StateObject> modified$runtime_release = getModified$runtime_release();
        if (modified$runtime_release == null) {
            modified$runtime_release = new HashSet<>();
            setModified(modified$runtime_release);
        }
        modified$runtime_release.add(state);
    }

    public final void recordPrevious$runtime_release(int id2) {
        synchronized (SnapshotKt.getLock()) {
            this.previousIds = this.previousIds.set(id2);
            r rVar = r.f5635a;
        }
    }

    public final void recordPreviousList$runtime_release(@NotNull SnapshotIdSet snapshots) {
        p.k(snapshots, "snapshots");
        synchronized (SnapshotKt.getLock()) {
            this.previousIds = this.previousIds.or(snapshots);
            r rVar = r.f5635a;
        }
    }

    public final void recordPreviousPinnedSnapshot$runtime_release(int id2) {
        if (id2 >= 0) {
            this.previousPinnedSnapshots = cn.p.A(this.previousPinnedSnapshots, id2);
        }
    }

    public final void recordPreviousPinnedSnapshots$runtime_release(@NotNull int[] handles) {
        p.k(handles, "handles");
        if (handles.length == 0) {
            return;
        }
        int[] iArr = this.previousPinnedSnapshots;
        if (iArr.length == 0) {
            this.previousPinnedSnapshots = handles;
        } else {
            this.previousPinnedSnapshots = cn.p.B(iArr, handles);
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void releasePinnedSnapshotsForCloseLocked$runtime_release() {
        releasePreviouslyPinnedSnapshotsLocked$runtime_release();
        super.releasePinnedSnapshotsForCloseLocked$runtime_release();
    }

    public final void releasePreviouslyPinnedSnapshotsLocked$runtime_release() {
        int length = this.previousPinnedSnapshots.length;
        for (int i10 = 0; i10 < length; i10++) {
            SnapshotKt.releasePinningLocked(this.previousPinnedSnapshots[i10]);
        }
    }

    public final void setApplied$runtime_release(boolean z10) {
        this.applied = z10;
    }

    public void setModified(@Nullable Set<StateObject> set) {
        this.modified = set;
    }

    public final void setPreviousIds$runtime_release(@NotNull SnapshotIdSet snapshotIdSet) {
        p.k(snapshotIdSet, "<set-?>");
        this.previousIds = snapshotIdSet;
    }

    public final void setPreviousPinnedSnapshots$runtime_release(@NotNull int[] iArr) {
        p.k(iArr, "<set-?>");
        this.previousPinnedSnapshots = iArr;
    }

    @NotNull
    public MutableSnapshot takeNestedMutableSnapshot(@Nullable l<Object, r> lVar, @Nullable l<Object, r> lVar2) {
        NestedMutableSnapshot nestedMutableSnapshot;
        validateNotDisposed$runtime_release();
        validateNotAppliedOrPinned$runtime_release();
        recordPrevious$runtime_release(getId());
        synchronized (SnapshotKt.getLock()) {
            int i10 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = i10 + 1;
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(i10);
            SnapshotIdSet invalid = getInvalid();
            setInvalid$runtime_release(invalid.set(i10));
            nestedMutableSnapshot = new NestedMutableSnapshot(i10, SnapshotKt.addRange(invalid, getId() + 1, i10), SnapshotKt.mergedReadObserver$default(lVar, getReadObserver$runtime_release(), false, 4, null), SnapshotKt.mergedWriteObserver(lVar2, getWriteObserver$runtime_release()), this);
        }
        if (!getApplied() && !getDisposed()) {
            int id2 = getId();
            synchronized (SnapshotKt.getLock()) {
                int i11 = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId = i11 + 1;
                setId$runtime_release(i11);
                SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getId());
                r rVar = r.f5635a;
            }
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid(), id2 + 1, getId()));
        }
        return nestedMutableSnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    public Snapshot takeNestedSnapshot(@Nullable l<Object, r> lVar) {
        NestedReadonlySnapshot nestedReadonlySnapshot;
        validateNotDisposed$runtime_release();
        validateNotAppliedOrPinned$runtime_release();
        int id2 = getId();
        recordPrevious$runtime_release(getId());
        synchronized (SnapshotKt.getLock()) {
            int i10 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = i10 + 1;
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(i10);
            nestedReadonlySnapshot = new NestedReadonlySnapshot(i10, SnapshotKt.addRange(getInvalid(), id2 + 1, i10), lVar, this);
        }
        if (!getApplied() && !getDisposed()) {
            int id3 = getId();
            synchronized (SnapshotKt.getLock()) {
                int i11 = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId = i11 + 1;
                setId$runtime_release(i11);
                SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getId());
                r rVar = r.f5635a;
            }
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid(), id3 + 1, getId()));
        }
        return nestedReadonlySnapshot;
    }

    public final void validateNotApplied$runtime_release() {
        if (!(!this.applied)) {
            throw new IllegalStateException("Unsupported operation on a snapshot that has been applied".toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void validateNotAppliedOrPinned$runtime_release() {
        /*
            r3 = this;
            boolean r0 = r3.applied
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L11
            int r0 = androidx.compose.runtime.snapshots.Snapshot.access$getPinningTrackingHandle$p(r3)
            if (r0 < 0) goto Le
            r0 = r2
            goto Lf
        Le:
            r0 = r1
        Lf:
            if (r0 == 0) goto L12
        L11:
            r1 = r2
        L12:
            if (r1 == 0) goto L15
            return
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unsupported operation on a disposed or applied snapshot"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.MutableSnapshot.validateNotAppliedOrPinned$runtime_release():void");
    }
}
