package androidx.activity;

import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import bn.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FullyDrawnReporter.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class FullyDrawnReporter {

    @NotNull
    private final Executor executor;

    @NotNull
    private final Object lock;

    @GuardedBy("lock")
    @NotNull
    private final List<sn.a<r>> onReportCallbacks;

    @NotNull
    private final sn.a<r> reportFullyDrawn;

    @GuardedBy("lock")
    private boolean reportPosted;

    @NotNull
    private final Runnable reportRunnable;

    @GuardedBy("lock")
    private boolean reportedFullyDrawn;

    @GuardedBy("lock")
    private int reporterCount;

    public FullyDrawnReporter(@NotNull Executor executor, @NotNull sn.a<r> aVar) {
        tn.p.k(executor, "executor");
        tn.p.k(aVar, "reportFullyDrawn");
        this.executor = executor;
        this.reportFullyDrawn = aVar;
        this.lock = new Object();
        this.onReportCallbacks = new ArrayList();
        this.reportRunnable = new Runnable() { // from class: androidx.activity.p
            @Override // java.lang.Runnable
            public final void run() {
                FullyDrawnReporter.reportRunnable$lambda$2(this.f4035b);
            }
        };
    }

    private final void postWhenReportersAreDone() {
        if (this.reportPosted || this.reporterCount != 0) {
            return;
        }
        this.reportPosted = true;
        this.executor.execute(this.reportRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportRunnable$lambda$2(FullyDrawnReporter fullyDrawnReporter) {
        tn.p.k(fullyDrawnReporter, "this$0");
        synchronized (fullyDrawnReporter.lock) {
            fullyDrawnReporter.reportPosted = false;
            if (fullyDrawnReporter.reporterCount == 0 && !fullyDrawnReporter.reportedFullyDrawn) {
                fullyDrawnReporter.reportFullyDrawn.invoke();
                fullyDrawnReporter.fullyDrawnReported();
            }
            r rVar = r.f5635a;
        }
    }

    public final void addOnReportDrawnListener(@NotNull sn.a<r> aVar) {
        boolean z10;
        tn.p.k(aVar, "callback");
        synchronized (this.lock) {
            if (this.reportedFullyDrawn) {
                z10 = true;
            } else {
                this.onReportCallbacks.add(aVar);
                z10 = false;
            }
        }
        if (z10) {
            aVar.invoke();
        }
    }

    public final void addReporter() {
        synchronized (this.lock) {
            if (!this.reportedFullyDrawn) {
                this.reporterCount++;
            }
            r rVar = r.f5635a;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void fullyDrawnReported() {
        synchronized (this.lock) {
            this.reportedFullyDrawn = true;
            Iterator<T> it = this.onReportCallbacks.iterator();
            while (it.hasNext()) {
                ((sn.a) it.next()).invoke();
            }
            this.onReportCallbacks.clear();
            r rVar = r.f5635a;
        }
    }

    public final boolean isFullyDrawnReported() {
        boolean z10;
        synchronized (this.lock) {
            z10 = this.reportedFullyDrawn;
        }
        return z10;
    }

    public final void removeOnReportDrawnListener(@NotNull sn.a<r> aVar) {
        tn.p.k(aVar, "callback");
        synchronized (this.lock) {
            this.onReportCallbacks.remove(aVar);
            r rVar = r.f5635a;
        }
    }

    public final void removeReporter() {
        int i10;
        synchronized (this.lock) {
            if (!this.reportedFullyDrawn && (i10 = this.reporterCount) > 0) {
                this.reporterCount = i10 - 1;
                postWhenReportersAreDone();
            }
            r rVar = r.f5635a;
        }
    }
}
