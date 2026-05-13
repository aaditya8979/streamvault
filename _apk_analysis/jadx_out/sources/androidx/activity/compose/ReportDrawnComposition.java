package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import bn.r;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.jetbrains.annotations.NotNull;
import sn.l;

/* JADX INFO: compiled from: ReportDrawn.kt */
/* JADX INFO: loaded from: classes10.dex */
final class ReportDrawnComposition implements sn.a<r> {

    @NotNull
    private final l<sn.a<Boolean>, r> checkReporter;

    @NotNull
    private final FullyDrawnReporter fullyDrawnReporter;

    @NotNull
    private final sn.a<Boolean> predicate;

    @NotNull
    private final SnapshotStateObserver snapshotStateObserver;

    public ReportDrawnComposition(@NotNull FullyDrawnReporter fullyDrawnReporter, @NotNull sn.a<Boolean> aVar) {
        this.fullyDrawnReporter = fullyDrawnReporter;
        this.predicate = aVar;
        SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(new l<sn.a<? extends r>, r>() { // from class: androidx.activity.compose.ReportDrawnComposition$snapshotStateObserver$1
            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(sn.a<? extends r> aVar2) {
                invoke2((sn.a<r>) aVar2);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull sn.a<r> aVar2) {
                aVar2.invoke();
            }
        });
        snapshotStateObserver.start();
        this.snapshotStateObserver = snapshotStateObserver;
        this.checkReporter = new ReportDrawnComposition$checkReporter$1(this);
        fullyDrawnReporter.addOnReportDrawnListener(this);
        if (fullyDrawnReporter.isFullyDrawnReported()) {
            return;
        }
        fullyDrawnReporter.addReporter();
        observeReporter(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void observeReporter(final sn.a<Boolean> aVar) {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        this.snapshotStateObserver.observeReads(aVar, this.checkReporter, new sn.a<r>() { // from class: androidx.activity.compose.ReportDrawnComposition.observeReporter.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // sn.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ref$BooleanRef.element = aVar.invoke().booleanValue();
            }
        });
        if (ref$BooleanRef.element) {
            removeReporter();
        }
    }

    @Override // sn.a
    public /* bridge */ /* synthetic */ r invoke() {
        invoke2();
        return r.f5635a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2() {
        this.snapshotStateObserver.clear();
        this.snapshotStateObserver.stop();
    }

    public final void removeReporter() {
        this.snapshotStateObserver.clear(this.predicate);
        if (!this.fullyDrawnReporter.isFullyDrawnReported()) {
            this.fullyDrawnReporter.removeReporter();
        }
        invoke2();
    }
}
