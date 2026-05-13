package androidx.work.impl.workers;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.WorkConstraintsCallback;
import androidx.work.impl.constraints.WorkConstraintsTrackerImpl;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import bn.r;
import c8.i;
import cn.v;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: ConstraintTrackingWorker.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\"\u0010#J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\u0016\u0010\f\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R8\u0010\u0019\u001a&\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00060\u0006 \u0018*\u0012\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR(\u0010\u001c\u001a\u0004\u0018\u00010\u00012\b\u0010\u001b\u001a\u0004\u0018\u00010\u00018G@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/ListenableWorker;", "Landroidx/work/impl/constraints/WorkConstraintsCallback;", "Lbn/r;", "setupAndRunConstraintTrackingWork", "Lc8/i;", "Landroidx/work/ListenableWorker$Result;", "startWork", "onStopped", "", "Landroidx/work/impl/model/WorkSpec;", "workSpecs", "onAllConstraintsMet", "onAllConstraintsNotMet", "Landroidx/work/WorkerParameters;", "workerParameters", "Landroidx/work/WorkerParameters;", "", "lock", "Ljava/lang/Object;", "", "areConstraintsUnmet", "Z", "Landroidx/work/impl/utils/futures/SettableFuture;", "kotlin.jvm.PlatformType", "future", "Landroidx/work/impl/utils/futures/SettableFuture;", "<set-?>", "delegate", "Landroidx/work/ListenableWorker;", "getDelegate", "()Landroidx/work/ListenableWorker;", "Landroid/content/Context;", "appContext", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ConstraintTrackingWorker extends ListenableWorker implements WorkConstraintsCallback {
    private volatile boolean areConstraintsUnmet;

    @Nullable
    private ListenableWorker delegate;
    private final SettableFuture<ListenableWorker.Result> future;

    @NotNull
    private final Object lock;

    @NotNull
    private final WorkerParameters workerParameters;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        p.k(context, "appContext");
        p.k(workerParameters, "workerParameters");
        this.workerParameters = workerParameters;
        this.lock = new Object();
        this.future = SettableFuture.create();
    }

    private final void setupAndRunConstraintTrackingWork() {
        if (this.future.isCancelled()) {
            return;
        }
        String string = getInputData().getString(ConstraintTrackingWorkerKt.ARGUMENT_CLASS_NAME);
        Logger logger = Logger.get();
        p.j(logger, "get()");
        if (string == null || string.length() == 0) {
            logger.error(ConstraintTrackingWorkerKt.TAG, "No worker to delegate to.");
            SettableFuture<ListenableWorker.Result> settableFuture = this.future;
            p.j(settableFuture, "future");
            ConstraintTrackingWorkerKt.setFailed(settableFuture);
            return;
        }
        ListenableWorker listenableWorkerCreateWorkerWithDefaultFallback = getWorkerFactory().createWorkerWithDefaultFallback(getApplicationContext(), string, this.workerParameters);
        this.delegate = listenableWorkerCreateWorkerWithDefaultFallback;
        if (listenableWorkerCreateWorkerWithDefaultFallback == null) {
            logger.debug(ConstraintTrackingWorkerKt.TAG, "No worker to delegate to.");
            SettableFuture<ListenableWorker.Result> settableFuture2 = this.future;
            p.j(settableFuture2, "future");
            ConstraintTrackingWorkerKt.setFailed(settableFuture2);
            return;
        }
        WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance(getApplicationContext());
        p.j(workManagerImpl, "getInstance(applicationContext)");
        WorkSpecDao workSpecDao = workManagerImpl.getWorkDatabase().workSpecDao();
        String string2 = getId().toString();
        p.j(string2, "id.toString()");
        WorkSpec workSpec = workSpecDao.getWorkSpec(string2);
        if (workSpec == null) {
            SettableFuture<ListenableWorker.Result> settableFuture3 = this.future;
            p.j(settableFuture3, "future");
            ConstraintTrackingWorkerKt.setFailed(settableFuture3);
            return;
        }
        Trackers trackers = workManagerImpl.getTrackers();
        p.j(trackers, "workManagerImpl.trackers");
        WorkConstraintsTrackerImpl workConstraintsTrackerImpl = new WorkConstraintsTrackerImpl(trackers, this);
        workConstraintsTrackerImpl.replace(v.e(workSpec));
        String string3 = getId().toString();
        p.j(string3, "id.toString()");
        if (!workConstraintsTrackerImpl.areAllConstraintsMet(string3)) {
            logger.debug(ConstraintTrackingWorkerKt.TAG, "Constraints not met for delegate " + string + ". Requesting retry.");
            SettableFuture<ListenableWorker.Result> settableFuture4 = this.future;
            p.j(settableFuture4, "future");
            ConstraintTrackingWorkerKt.setRetry(settableFuture4);
            return;
        }
        logger.debug(ConstraintTrackingWorkerKt.TAG, "Constraints met for delegate " + string);
        try {
            ListenableWorker listenableWorker = this.delegate;
            p.h(listenableWorker);
            final i<ListenableWorker.Result> iVarStartWork = listenableWorker.startWork();
            p.j(iVarStartWork, "delegate!!.startWork()");
            iVarStartWork.addListener(new Runnable() { // from class: r.b
                @Override // java.lang.Runnable
                public final void run() {
                    ConstraintTrackingWorker.setupAndRunConstraintTrackingWork$lambda$2(this.f78500b, iVarStartWork);
                }
            }, getBackgroundExecutor());
        } catch (Throwable th2) {
            logger.debug(ConstraintTrackingWorkerKt.TAG, "Delegated worker " + string + " threw exception in startWork.", th2);
            synchronized (this.lock) {
                if (!this.areConstraintsUnmet) {
                    SettableFuture<ListenableWorker.Result> settableFuture5 = this.future;
                    p.j(settableFuture5, "future");
                    ConstraintTrackingWorkerKt.setFailed(settableFuture5);
                } else {
                    logger.debug(ConstraintTrackingWorkerKt.TAG, "Constraints were unmet, Retrying.");
                    SettableFuture<ListenableWorker.Result> settableFuture6 = this.future;
                    p.j(settableFuture6, "future");
                    ConstraintTrackingWorkerKt.setRetry(settableFuture6);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupAndRunConstraintTrackingWork$lambda$2(ConstraintTrackingWorker constraintTrackingWorker, i iVar) {
        p.k(constraintTrackingWorker, "this$0");
        p.k(iVar, "$innerFuture");
        synchronized (constraintTrackingWorker.lock) {
            if (constraintTrackingWorker.areConstraintsUnmet) {
                SettableFuture<ListenableWorker.Result> settableFuture = constraintTrackingWorker.future;
                p.j(settableFuture, "future");
                ConstraintTrackingWorkerKt.setRetry(settableFuture);
            } else {
                constraintTrackingWorker.future.setFuture(iVar);
            }
            r rVar = r.f5635a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startWork$lambda$0(ConstraintTrackingWorker constraintTrackingWorker) {
        p.k(constraintTrackingWorker, "this$0");
        constraintTrackingWorker.setupAndRunConstraintTrackingWork();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    @Nullable
    public final ListenableWorker getDelegate() {
        return this.delegate;
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void onAllConstraintsMet(@NotNull List<WorkSpec> list) {
        p.k(list, "workSpecs");
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void onAllConstraintsNotMet(@NotNull List<WorkSpec> list) {
        p.k(list, "workSpecs");
        Logger.get().debug(ConstraintTrackingWorkerKt.TAG, "Constraints changed for " + list);
        synchronized (this.lock) {
            this.areConstraintsUnmet = true;
            r rVar = r.f5635a;
        }
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.delegate;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        listenableWorker.stop();
    }

    @Override // androidx.work.ListenableWorker
    @NotNull
    public i<ListenableWorker.Result> startWork() {
        getBackgroundExecutor().execute(new Runnable() { // from class: r.a
            @Override // java.lang.Runnable
            public final void run() {
                ConstraintTrackingWorker.startWork$lambda$0(this.f78499b);
            }
        });
        SettableFuture<ListenableWorker.Result> settableFuture = this.future;
        p.j(settableFuture, "future");
        return settableFuture;
    }
}
