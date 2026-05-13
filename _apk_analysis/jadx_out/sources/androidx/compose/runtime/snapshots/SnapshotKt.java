package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.SnapshotThreadLocal;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import bn.r;
import cn.f0;
import com.mgs.carparking.dbtable.VideoLookHistoryEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.a;
import sn.l;
import sn.p;
import tn.n;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0090\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0018\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0000H\u0000\u001a\b\u0010\t\u001a\u00020\bH\u0000\u001a4\u0010\u0010\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0002\u001aL\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000eH\u0002\u001aB\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bH\u0002\u001a'\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0081\bø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a1\u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u001b\u001a\u00020\b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a)\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\b\u0010\u001e\u001a\u00020\u0006H\u0002\u001a-\u0010 \u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020\b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u000bH\u0002¢\u0006\u0004\b \u0010!\u001a\u0010\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\bH\u0002\u001a \u0010%\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a \u0010%\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020&2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a3\u0010)\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0016*\u00020&2\u0006\u0010(\u001a\u00028\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b)\u0010*\u001a#\u0010)\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020&*\u00028\u00002\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b)\u0010-\u001a+\u0010)\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020&*\u00028\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b)\u0010.\u001a\b\u00100\u001a\u00020/H\u0002\u001a\u0012\u00101\u001a\u0004\u0018\u00010&2\u0006\u0010,\u001a\u00020+H\u0002\u001a-\u00102\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020&*\u00028\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010\"\u001a\u00020\bH\u0001¢\u0006\u0004\b2\u0010.\u001a5\u00104\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020&*\u00028\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010\"\u001a\u00020\b2\u0006\u00103\u001a\u00028\u0000H\u0000¢\u0006\u0004\b4\u00105\u001a-\u00106\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020&*\u00028\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010\"\u001a\u00020\bH\u0000¢\u0006\u0004\b6\u0010.\u001a%\u00107\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020&*\u00028\u00002\u0006\u0010,\u001a\u00020+H\u0000¢\u0006\u0004\b7\u0010-\u001a\u0018\u00108\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\b2\u0006\u0010,\u001a\u00020+H\u0001\u001aK\u0010:\u001a\u00028\u0001\"\b\b\u0000\u0010\u0016*\u00020&\"\u0004\b\u0001\u00109*\u00028\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010\"\u001a\u00020\b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b:\u0010;\u001aC\u0010:\u001a\u00028\u0001\"\b\b\u0000\u0010\u0016*\u00020&\"\u0004\b\u0001\u00109*\u00028\u00002\u0006\u0010,\u001a\u00020+2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b:\u0010<\u001aK\u0010=\u001a\u00028\u0001\"\b\b\u0000\u0010\u0016*\u00020&\"\u0004\b\u0001\u00109*\u00028\u00002\u0006\u0010,\u001a\u00020+2\u0006\u00103\u001a\u00028\u00002\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0080\bø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001a.\u0010C\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0018\u00010B2\u0006\u0010\t\u001a\u00020?2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020\u0002H\u0002\u001a\b\u0010D\u001a\u00020/H\u0002\u001a)\u0010E\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020&2\u0006\u0010(\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020\bH\u0001¢\u0006\u0004\bE\u0010F\u001a;\u0010G\u001a\u00028\u0001\"\b\b\u0000\u0010\u0016*\u00020&\"\u0004\b\u0001\u00109*\u00028\u00002\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\bG\u0010H\u001a\u001c\u0010K\u001a\u00020\u0002*\u00020\u00022\u0006\u0010I\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u0000H\u0000\" \u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010M\"\u0014\u0010N\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bN\u0010O\"\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020\b0P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010R\" \u0010S\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bS\u0010T\u0012\u0004\bW\u0010X\u001a\u0004\bU\u0010V\"\u0016\u0010Y\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010Z\"\u0016\u0010[\u001a\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010O\"\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^\"2\u0010b\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060`0_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010c\"&\u0010d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000b0_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010c\"4\u0010i\u001a\"\u0012\f\u0012\n g*\u0004\u0018\u00010f0f0ej\u0010\u0012\f\u0012\n g*\u0004\u0018\u00010f0f`h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010j\" \u0010k\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bk\u0010l\u0012\u0004\bo\u0010X\u001a\u0004\bm\u0010n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006p"}, d2 = {"", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "trackPinning", "handle", "Lbn/r;", "releasePinningLocked", "Landroidx/compose/runtime/snapshots/Snapshot;", "currentSnapshot", "previousSnapshot", "Lkotlin/Function1;", "", "readObserver", "", "ownsPreviousSnapshot", "createTransparentSnapshotWithNoParentReadObserver", "parentObserver", "mergeReadObserver", "mergedReadObserver", "writeObserver", "mergedWriteObserver", "T", "Lkotlin/Function0;", "block", "sync", "(Lsn/a;)Ljava/lang/Object;", "previousGlobalSnapshot", "takeNewGlobalSnapshot", "(Landroidx/compose/runtime/snapshots/Snapshot;Lsn/l;)Ljava/lang/Object;", "advanceGlobalSnapshot", "(Lsn/l;)Ljava/lang/Object;", "takeNewSnapshot", "(Lsn/l;)Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "validateOpen", "candidateSnapshot", "valid", "Landroidx/compose/runtime/snapshots/StateRecord;", "data", "r", "readable", "(Landroidx/compose/runtime/snapshots/StateRecord;ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;)Landroidx/compose/runtime/snapshots/StateRecord;", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "", "readError", "used", "writableRecord", "candidate", "overwritableRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "newWritableRecord", "newOverwritableRecord", "notifyWrite", "R", "writable", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;Lsn/l;)Ljava/lang/Object;", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Lsn/l;)Ljava/lang/Object;", "overwritable", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/StateRecord;Lsn/l;)Ljava/lang/Object;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "applyingSnapshot", "invalidSnapshots", "", "optimisticMerges", "reportReadonlySnapshotWrite", VideoLookHistoryEntry.CURRNET, "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "withCurrent", "(Landroidx/compose/runtime/snapshots/StateRecord;Lsn/l;)Ljava/lang/Object;", TypedValues.TransitionType.S_FROM, "until", "addRange", "emptyLambda", "Lsn/l;", "INVALID_SNAPSHOT", "I", "Landroidx/compose/runtime/SnapshotThreadLocal;", "threadSnapshot", "Landroidx/compose/runtime/SnapshotThreadLocal;", "lock", "Ljava/lang/Object;", "getLock", "()Ljava/lang/Object;", "getLock$annotations", "()V", "openSnapshots", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "nextSnapshotId", "Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "pinningTable", "Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "", "Lkotlin/Function2;", "", "applyObservers", "Ljava/util/List;", "globalWriteObservers", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/snapshots/GlobalSnapshot;", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/AtomicReference;", "currentGlobalSnapshot", "Ljava/util/concurrent/atomic/AtomicReference;", "snapshotInitializer", "Landroidx/compose/runtime/snapshots/Snapshot;", "getSnapshotInitializer", "()Landroidx/compose/runtime/snapshots/Snapshot;", "getSnapshotInitializer$annotations", "runtime_release"}, k = 2, mv = {1, 6, 0})
public final class SnapshotKt {
    private static final int INVALID_SNAPSHOT = 0;

    @NotNull
    private static final List<p<Set<? extends Object>, Snapshot, r>> applyObservers;

    @NotNull
    private static final AtomicReference<GlobalSnapshot> currentGlobalSnapshot;

    @NotNull
    private static final List<l<Object, r>> globalWriteObservers;
    private static int nextSnapshotId;

    @NotNull
    private static SnapshotIdSet openSnapshots;

    @NotNull
    private static final SnapshotDoubleIndexHeap pinningTable;

    @NotNull
    private static final Snapshot snapshotInitializer;

    @NotNull
    private static final l<SnapshotIdSet, r> emptyLambda = new l<SnapshotIdSet, r>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$emptyLambda$1
        @Override // sn.l
        public /* bridge */ /* synthetic */ r invoke(SnapshotIdSet snapshotIdSet) {
            invoke2(snapshotIdSet);
            return r.f5635a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull SnapshotIdSet snapshotIdSet) {
            tn.p.k(snapshotIdSet, "it");
        }
    };

    @NotNull
    private static final SnapshotThreadLocal<Snapshot> threadSnapshot = new SnapshotThreadLocal<>();

    @NotNull
    private static final Object lock = new Object();

    static {
        SnapshotIdSet.Companion companion = SnapshotIdSet.INSTANCE;
        openSnapshots = companion.getEMPTY();
        nextSnapshotId = 1;
        pinningTable = new SnapshotDoubleIndexHeap();
        applyObservers = new ArrayList();
        globalWriteObservers = new ArrayList();
        int i10 = nextSnapshotId;
        nextSnapshotId = i10 + 1;
        GlobalSnapshot globalSnapshot = new GlobalSnapshot(i10, companion.getEMPTY());
        openSnapshots = openSnapshots.set(globalSnapshot.getId());
        AtomicReference<GlobalSnapshot> atomicReference = new AtomicReference<>(globalSnapshot);
        currentGlobalSnapshot = atomicReference;
        GlobalSnapshot globalSnapshot2 = atomicReference.get();
        tn.p.j(globalSnapshot2, "currentGlobalSnapshot.get()");
        snapshotInitializer = globalSnapshot2;
    }

    @NotNull
    public static final SnapshotIdSet addRange(@NotNull SnapshotIdSet snapshotIdSet, int i10, int i11) {
        tn.p.k(snapshotIdSet, "<this>");
        while (i10 < i11) {
            snapshotIdSet = snapshotIdSet.set(i10);
            i10++;
        }
        return snapshotIdSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T advanceGlobalSnapshot(l<? super SnapshotIdSet, ? extends T> lVar) {
        T t10;
        List listJ1;
        GlobalSnapshot globalSnapshot = currentGlobalSnapshot.get();
        synchronized (getLock()) {
            tn.p.j(globalSnapshot, "previousGlobalSnapshot");
            t10 = (T) takeNewGlobalSnapshot(globalSnapshot, lVar);
        }
        Set<StateObject> modified$runtime_release = globalSnapshot.getModified$runtime_release();
        if (modified$runtime_release != null) {
            synchronized (getLock()) {
                listJ1 = f0.j1(applyObservers);
            }
            int size = listJ1.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((p) listJ1.get(i10)).mo2invoke(modified$runtime_release, globalSnapshot);
            }
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void advanceGlobalSnapshot() {
        advanceGlobalSnapshot(new l<SnapshotIdSet, r>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt.advanceGlobalSnapshot.2
            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(SnapshotIdSet snapshotIdSet) {
                invoke2(snapshotIdSet);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull SnapshotIdSet snapshotIdSet) {
                tn.p.k(snapshotIdSet, "it");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Snapshot createTransparentSnapshotWithNoParentReadObserver(Snapshot snapshot, l<Object, r> lVar, boolean z10) {
        boolean z11 = snapshot instanceof MutableSnapshot;
        if (z11 || snapshot == null) {
            return new TransparentObserverMutableSnapshot(z11 ? (MutableSnapshot) snapshot : null, lVar, null, false, z10);
        }
        return new TransparentObserverSnapshot(snapshot, lVar, false, z10);
    }

    public static /* synthetic */ Snapshot createTransparentSnapshotWithNoParentReadObserver$default(Snapshot snapshot, l lVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return createTransparentSnapshotWithNoParentReadObserver(snapshot, lVar, z10);
    }

    @NotNull
    public static final <T extends StateRecord> T current(@NotNull T t10, @NotNull Snapshot snapshot) {
        tn.p.k(t10, "r");
        tn.p.k(snapshot, "snapshot");
        T t11 = (T) readable(t10, snapshot.getId(), snapshot.getInvalid());
        if (t11 != null) {
            return t11;
        }
        readError();
        throw new KotlinNothingValueException();
    }

    @NotNull
    public static final Snapshot currentSnapshot() {
        Snapshot snapshot = threadSnapshot.get();
        if (snapshot != null) {
            return snapshot;
        }
        GlobalSnapshot globalSnapshot = currentGlobalSnapshot.get();
        tn.p.j(globalSnapshot, "currentGlobalSnapshot.get()");
        return globalSnapshot;
    }

    @NotNull
    public static final Object getLock() {
        return lock;
    }

    public static /* synthetic */ void getLock$annotations() {
    }

    @NotNull
    public static final Snapshot getSnapshotInitializer() {
        return snapshotInitializer;
    }

    public static /* synthetic */ void getSnapshotInitializer$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l<Object, r> mergedReadObserver(final l<Object, r> lVar, final l<Object, r> lVar2, boolean z10) {
        if (!z10) {
            lVar2 = null;
        }
        return (lVar == null || lVar2 == null || tn.p.f(lVar, lVar2)) ? lVar == null ? lVar2 : lVar : new l<Object, r>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt.mergedReadObserver.1
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
                tn.p.k(obj, "state");
                lVar.invoke(obj);
                lVar2.invoke(obj);
            }
        };
    }

    public static /* synthetic */ l mergedReadObserver$default(l lVar, l lVar2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return mergedReadObserver(lVar, lVar2, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l<Object, r> mergedWriteObserver(final l<Object, r> lVar, final l<Object, r> lVar2) {
        return (lVar == null || lVar2 == null || tn.p.f(lVar, lVar2)) ? lVar == null ? lVar2 : lVar : new l<Object, r>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt.mergedWriteObserver.1
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
                tn.p.k(obj, "state");
                lVar.invoke(obj);
                lVar2.invoke(obj);
            }
        };
    }

    @NotNull
    public static final <T extends StateRecord> T newOverwritableRecord(@NotNull T t10, @NotNull StateObject stateObject) {
        tn.p.k(t10, "<this>");
        tn.p.k(stateObject, "state");
        T t11 = (T) used(stateObject);
        if (t11 != null) {
            t11.setSnapshotId$runtime_release(Integer.MAX_VALUE);
            return t11;
        }
        T t12 = (T) t10.create();
        t12.setSnapshotId$runtime_release(Integer.MAX_VALUE);
        t12.setNext$runtime_release(stateObject.getFirstStateRecord());
        stateObject.prependStateRecord(t12);
        return t12;
    }

    @NotNull
    public static final <T extends StateRecord> T newWritableRecord(@NotNull T t10, @NotNull StateObject stateObject, @NotNull Snapshot snapshot) {
        tn.p.k(t10, "<this>");
        tn.p.k(stateObject, "state");
        tn.p.k(snapshot, "snapshot");
        T t11 = (T) newOverwritableRecord(t10, stateObject);
        t11.assign(t10);
        t11.setSnapshotId$runtime_release(snapshot.getId());
        return t11;
    }

    public static final void notifyWrite(@NotNull Snapshot snapshot, @NotNull StateObject stateObject) {
        tn.p.k(snapshot, "snapshot");
        tn.p.k(stateObject, "state");
        l<Object, r> writeObserver$runtime_release = snapshot.getWriteObserver$runtime_release();
        if (writeObserver$runtime_release != null) {
            writeObserver$runtime_release.invoke(stateObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<StateRecord, StateRecord> optimisticMerges(MutableSnapshot mutableSnapshot, MutableSnapshot mutableSnapshot2, SnapshotIdSet snapshotIdSet) {
        StateRecord stateRecord;
        Set<StateObject> modified$runtime_release = mutableSnapshot2.getModified$runtime_release();
        int id2 = mutableSnapshot.getId();
        if (modified$runtime_release == null) {
            return null;
        }
        SnapshotIdSet snapshotIdSetOr = mutableSnapshot2.getInvalid().set(mutableSnapshot2.getId()).or(mutableSnapshot2.getPreviousIds$runtime_release());
        HashMap map = null;
        for (StateObject stateObject : modified$runtime_release) {
            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
            StateRecord stateRecord2 = readable(firstStateRecord, id2, snapshotIdSet);
            if (stateRecord2 != null && (stateRecord = readable(firstStateRecord, id2, snapshotIdSetOr)) != null && !tn.p.f(stateRecord2, stateRecord)) {
                StateRecord stateRecord3 = readable(firstStateRecord, mutableSnapshot2.getId(), mutableSnapshot2.getInvalid());
                if (stateRecord3 == null) {
                    readError();
                    throw new KotlinNothingValueException();
                }
                StateRecord stateRecordMergeRecords = stateObject.mergeRecords(stateRecord, stateRecord2, stateRecord3);
                if (stateRecordMergeRecords == null) {
                    return null;
                }
                if (map == null) {
                    map = new HashMap();
                }
                map.put(stateRecord2, stateRecordMergeRecords);
                map = map;
            }
        }
        return map;
    }

    public static final <T extends StateRecord, R> R overwritable(@NotNull T t10, @NotNull StateObject stateObject, @NotNull T t11, @NotNull l<? super T, ? extends R> lVar) {
        Snapshot current;
        R rInvoke;
        tn.p.k(t10, "<this>");
        tn.p.k(stateObject, "state");
        tn.p.k(t11, "candidate");
        tn.p.k(lVar, "block");
        getSnapshotInitializer();
        synchronized (getLock()) {
            try {
                current = Snapshot.INSTANCE.getCurrent();
                rInvoke = lVar.invoke(overwritableRecord(t10, stateObject, current, t11));
                n.b(1);
            } catch (Throwable th2) {
                n.b(1);
                n.a(1);
                throw th2;
            }
        }
        n.a(1);
        notifyWrite(current, stateObject);
        return rInvoke;
    }

    @NotNull
    public static final <T extends StateRecord> T overwritableRecord(@NotNull T t10, @NotNull StateObject stateObject, @NotNull Snapshot snapshot, @NotNull T t11) {
        tn.p.k(t10, "<this>");
        tn.p.k(stateObject, "state");
        tn.p.k(snapshot, "snapshot");
        tn.p.k(t11, "candidate");
        if (snapshot.getReadOnly()) {
            snapshot.mo1290recordModified$runtime_release(stateObject);
        }
        int id2 = snapshot.getId();
        if (t11.getSnapshotId() == id2) {
            return t11;
        }
        T t12 = (T) newOverwritableRecord(t10, stateObject);
        t12.setSnapshotId$runtime_release(id2);
        snapshot.mo1290recordModified$runtime_release(stateObject);
        return t12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void readError() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends StateRecord> T readable(T t10, int i10, SnapshotIdSet snapshotIdSet) {
        T t11 = null;
        while (t10 != null) {
            if (valid(t10, i10, snapshotIdSet) && (t11 == null || t11.getSnapshotId() < t10.getSnapshotId())) {
                t11 = t10;
            }
            t10 = (T) t10.getNext();
        }
        if (t11 != null) {
            return t11;
        }
        return null;
    }

    @NotNull
    public static final <T extends StateRecord> T readable(@NotNull T t10, @NotNull StateObject stateObject) {
        tn.p.k(t10, "<this>");
        tn.p.k(stateObject, "state");
        return (T) readable(t10, stateObject, currentSnapshot());
    }

    @NotNull
    public static final <T extends StateRecord> T readable(@NotNull T t10, @NotNull StateObject stateObject, @NotNull Snapshot snapshot) {
        tn.p.k(t10, "<this>");
        tn.p.k(stateObject, "state");
        tn.p.k(snapshot, "snapshot");
        l<Object, r> readObserver$runtime_release = snapshot.getReadObserver$runtime_release();
        if (readObserver$runtime_release != null) {
            readObserver$runtime_release.invoke(stateObject);
        }
        T t11 = (T) readable(t10, snapshot.getId(), snapshot.getInvalid());
        if (t11 != null) {
            return t11;
        }
        readError();
        throw new KotlinNothingValueException();
    }

    public static final void releasePinningLocked(int i10) {
        pinningTable.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void reportReadonlySnapshotWrite() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    public static final <T> T sync(@NotNull a<? extends T> aVar) {
        T tInvoke;
        tn.p.k(aVar, "block");
        synchronized (getLock()) {
            try {
                tInvoke = aVar.invoke();
                n.b(1);
            } catch (Throwable th2) {
                n.b(1);
                n.a(1);
                throw th2;
            }
        }
        n.a(1);
        return tInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T takeNewGlobalSnapshot(Snapshot snapshot, l<? super SnapshotIdSet, ? extends T> lVar) {
        T tInvoke = lVar.invoke(openSnapshots.clear(snapshot.getId()));
        synchronized (getLock()) {
            int i10 = nextSnapshotId;
            nextSnapshotId = i10 + 1;
            openSnapshots = openSnapshots.clear(snapshot.getId());
            currentGlobalSnapshot.set(new GlobalSnapshot(i10, openSnapshots));
            snapshot.dispose();
            openSnapshots = openSnapshots.set(i10);
            r rVar = r.f5635a;
        }
        return tInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends Snapshot> T takeNewSnapshot(final l<? super SnapshotIdSet, ? extends T> lVar) {
        return (T) advanceGlobalSnapshot(new l<SnapshotIdSet, T>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt.takeNewSnapshot.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Incorrect return type in method signature: (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)TT; */
            @Override // sn.l
            @NotNull
            public final Snapshot invoke(@NotNull SnapshotIdSet snapshotIdSet) {
                tn.p.k(snapshotIdSet, "invalid");
                Snapshot snapshot = (Snapshot) lVar.invoke(snapshotIdSet);
                synchronized (SnapshotKt.getLock()) {
                    SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(snapshot.getId());
                    r rVar = r.f5635a;
                }
                return snapshot;
            }
        });
    }

    public static final int trackPinning(int i10, @NotNull SnapshotIdSet snapshotIdSet) {
        int iAdd;
        tn.p.k(snapshotIdSet, "invalid");
        int iLowest = snapshotIdSet.lowest(i10);
        synchronized (getLock()) {
            iAdd = pinningTable.add(iLowest);
        }
        return iAdd;
    }

    private static final StateRecord used(StateObject stateObject) {
        int iLowestOrDefault = pinningTable.lowestOrDefault(nextSnapshotId) - 1;
        SnapshotIdSet empty = SnapshotIdSet.INSTANCE.getEMPTY();
        StateRecord stateRecord = null;
        for (StateRecord firstStateRecord = stateObject.getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext()) {
            if (firstStateRecord.getSnapshotId() == 0) {
                return firstStateRecord;
            }
            if (valid(firstStateRecord, iLowestOrDefault, empty)) {
                if (stateRecord != null) {
                    return firstStateRecord.getSnapshotId() < stateRecord.getSnapshotId() ? firstStateRecord : stateRecord;
                }
                stateRecord = firstStateRecord;
            }
        }
        return null;
    }

    private static final boolean valid(int i10, int i11, SnapshotIdSet snapshotIdSet) {
        return (i11 == 0 || i11 > i10 || snapshotIdSet.get(i11)) ? false : true;
    }

    private static final boolean valid(StateRecord stateRecord, int i10, SnapshotIdSet snapshotIdSet) {
        return valid(i10, stateRecord.getSnapshotId(), snapshotIdSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateOpen(Snapshot snapshot) {
        if (!openSnapshots.get(snapshot.getId())) {
            throw new IllegalStateException("Snapshot is not open".toString());
        }
    }

    public static final <T extends StateRecord, R> R withCurrent(@NotNull T t10, @NotNull l<? super T, ? extends R> lVar) {
        tn.p.k(t10, "<this>");
        tn.p.k(lVar, "block");
        return lVar.invoke(current(t10, Snapshot.INSTANCE.getCurrent()));
    }

    public static final <T extends StateRecord, R> R writable(@NotNull T t10, @NotNull StateObject stateObject, @NotNull Snapshot snapshot, @NotNull l<? super T, ? extends R> lVar) {
        R rInvoke;
        tn.p.k(t10, "<this>");
        tn.p.k(stateObject, "state");
        tn.p.k(snapshot, "snapshot");
        tn.p.k(lVar, "block");
        synchronized (getLock()) {
            try {
                rInvoke = lVar.invoke(writableRecord(t10, stateObject, snapshot));
                n.b(1);
            } catch (Throwable th2) {
                n.b(1);
                n.a(1);
                throw th2;
            }
        }
        n.a(1);
        notifyWrite(snapshot, stateObject);
        return rInvoke;
    }

    public static final <T extends StateRecord, R> R writable(@NotNull T t10, @NotNull StateObject stateObject, @NotNull l<? super T, ? extends R> lVar) {
        Snapshot current;
        R rInvoke;
        tn.p.k(t10, "<this>");
        tn.p.k(stateObject, "state");
        tn.p.k(lVar, "block");
        getSnapshotInitializer();
        synchronized (getLock()) {
            try {
                current = Snapshot.INSTANCE.getCurrent();
                rInvoke = lVar.invoke(writableRecord(t10, stateObject, current));
                n.b(1);
            } catch (Throwable th2) {
                n.b(1);
                n.a(1);
                throw th2;
            }
        }
        n.a(1);
        notifyWrite(current, stateObject);
        return rInvoke;
    }

    @NotNull
    public static final <T extends StateRecord> T writableRecord(@NotNull T t10, @NotNull StateObject stateObject, @NotNull Snapshot snapshot) {
        tn.p.k(t10, "<this>");
        tn.p.k(stateObject, "state");
        tn.p.k(snapshot, "snapshot");
        if (snapshot.getReadOnly()) {
            snapshot.mo1290recordModified$runtime_release(stateObject);
        }
        T t11 = (T) readable(t10, snapshot.getId(), snapshot.getInvalid());
        if (t11 == null) {
            readError();
            throw new KotlinNothingValueException();
        }
        if (t11.getSnapshotId() == snapshot.getId()) {
            return t11;
        }
        T t12 = (T) newWritableRecord(t11, stateObject, snapshot);
        snapshot.mo1290recordModified$runtime_release(stateObject);
        return t12;
    }
}
