package androidx.work.impl;

import androidx.annotation.RestrictTo;
import androidx.work.Configuration;
import androidx.work.ExistingWorkPolicy;
import androidx.work.Operation;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import androidx.work.impl.utils.EnqueueRunnable;
import androidx.work.impl.utils.EnqueueUtilsKt;
import androidx.work.impl.utils.futures.SettableFuture;
import bn.r;
import cn.f0;
import cn.v;
import com.safedk.android.utils.i;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: WorkerUpdater.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aD\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002\u001a\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0000\u001a\u001c\u0010\u0016\u001a\u00020\u0015*\u00020\u00102\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007\u001a\u0014\u0010\u001a\u001a\u00020\u0019*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u0002¨\u0006\u001b"}, d2 = {"Landroidx/work/impl/Processor;", "processor", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/Configuration;", i.f53156c, "", "Landroidx/work/impl/Scheduler;", "schedulers", "Landroidx/work/impl/model/WorkSpec;", "newWorkSpec", "", "", "tags", "Landroidx/work/WorkManager$UpdateResult;", "updateWorkImpl", "Landroidx/work/impl/WorkManagerImpl;", "Landroidx/work/WorkRequest;", "workRequest", "Lc8/i;", "name", "Landroidx/work/Operation;", "enqueueUniquelyNamedPeriodic", "Landroidx/work/impl/OperationImpl;", "message", "Lbn/r;", "failWorkTypeChanged", "work-runtime_release"}, k = 2, mv = {1, 7, 1})
public final class WorkerUpdater {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final Operation enqueueUniquelyNamedPeriodic(@NotNull final WorkManagerImpl workManagerImpl, @NotNull final String str, @NotNull final WorkRequest workRequest) {
        p.k(workManagerImpl, "<this>");
        p.k(str, "name");
        p.k(workRequest, "workRequest");
        final OperationImpl operationImpl = new OperationImpl();
        final sn.a<r> aVar = new sn.a<r>() { // from class: androidx.work.impl.WorkerUpdater$enqueueUniquelyNamedPeriodic$enqueueNew$1
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
                new EnqueueRunnable(new WorkContinuationImpl(workManagerImpl, str, ExistingWorkPolicy.KEEP, v.e(workRequest)), operationImpl).run();
            }
        };
        workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor().execute(new Runnable() { // from class: androidx.work.impl.f
            @Override // java.lang.Runnable
            public final void run() {
                WorkerUpdater.enqueueUniquelyNamedPeriodic$lambda$3(workManagerImpl, str, operationImpl, aVar, workRequest);
            }
        });
        return operationImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueueUniquelyNamedPeriodic$lambda$3(WorkManagerImpl workManagerImpl, String str, OperationImpl operationImpl, sn.a aVar, WorkRequest workRequest) {
        p.k(workManagerImpl, "$this_enqueueUniquelyNamedPeriodic");
        p.k(str, "$name");
        p.k(operationImpl, "$operation");
        p.k(aVar, "$enqueueNew");
        p.k(workRequest, "$workRequest");
        WorkSpecDao workSpecDao = workManagerImpl.getWorkDatabase().workSpecDao();
        List<WorkSpec.IdAndState> workSpecIdAndStatesForName = workSpecDao.getWorkSpecIdAndStatesForName(str);
        if (workSpecIdAndStatesForName.size() > 1) {
            failWorkTypeChanged(operationImpl, "Can't apply UPDATE policy to the chains of work.");
            return;
        }
        WorkSpec.IdAndState idAndState = (WorkSpec.IdAndState) f0.v0(workSpecIdAndStatesForName);
        if (idAndState == null) {
            aVar.invoke();
            return;
        }
        WorkSpec workSpec = workSpecDao.getWorkSpec(idAndState.id);
        if (workSpec == null) {
            operationImpl.markState(new Operation.State.FAILURE(new IllegalStateException("WorkSpec with " + idAndState.id + ", that matches a name \"" + str + "\", wasn't found")));
            return;
        }
        if (!workSpec.isPeriodic()) {
            failWorkTypeChanged(operationImpl, "Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
            return;
        }
        if (idAndState.state == WorkInfo.State.CANCELLED) {
            workSpecDao.delete(idAndState.id);
            aVar.invoke();
            return;
        }
        WorkSpec workSpec2 = workRequest.getWorkSpec();
        WorkSpec workSpecCopy = workSpec2.copy((1048574 & 1) != 0 ? workSpec2.id : idAndState.id, (1048574 & 2) != 0 ? workSpec2.state : null, (1048574 & 4) != 0 ? workSpec2.workerClassName : null, (1048574 & 8) != 0 ? workSpec2.inputMergerClassName : null, (1048574 & 16) != 0 ? workSpec2.input : null, (1048574 & 32) != 0 ? workSpec2.output : null, (1048574 & 64) != 0 ? workSpec2.initialDelay : 0L, (1048574 & 128) != 0 ? workSpec2.intervalDuration : 0L, (1048574 & 256) != 0 ? workSpec2.flexDuration : 0L, (1048574 & 512) != 0 ? workSpec2.constraints : null, (1048574 & 1024) != 0 ? workSpec2.runAttemptCount : 0, (1048574 & 2048) != 0 ? workSpec2.backoffPolicy : null, (1048574 & 4096) != 0 ? workSpec2.backoffDelayDuration : 0L, (1048574 & 8192) != 0 ? workSpec2.lastEnqueueTime : 0L, (1048574 & 16384) != 0 ? workSpec2.minimumRetentionDuration : 0L, (1048574 & 32768) != 0 ? workSpec2.scheduleRequestedAt : 0L, (1048574 & 65536) != 0 ? workSpec2.expedited : false, (131072 & 1048574) != 0 ? workSpec2.outOfQuotaPolicy : null, (1048574 & 262144) != 0 ? workSpec2.periodCount : 0, (1048574 & 524288) != 0 ? workSpec2.generation : 0);
        try {
            Processor processor = workManagerImpl.getProcessor();
            p.j(processor, "processor");
            WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
            p.j(workDatabase, "workDatabase");
            Configuration configuration = workManagerImpl.getConfiguration();
            p.j(configuration, i.f53156c);
            List<Scheduler> schedulers = workManagerImpl.getSchedulers();
            p.j(schedulers, "schedulers");
            updateWorkImpl(processor, workDatabase, configuration, schedulers, workSpecCopy, workRequest.getTags());
            operationImpl.markState(Operation.SUCCESS);
        } catch (Throwable th2) {
            operationImpl.markState(new Operation.State.FAILURE(th2));
        }
    }

    private static final void failWorkTypeChanged(OperationImpl operationImpl, String str) {
        operationImpl.markState(new Operation.State.FAILURE(new UnsupportedOperationException(str)));
    }

    private static final WorkManager.UpdateResult updateWorkImpl(Processor processor, final WorkDatabase workDatabase, Configuration configuration, final List<? extends Scheduler> list, final WorkSpec workSpec, final Set<String> set) {
        final String str = workSpec.id;
        final WorkSpec workSpec2 = workDatabase.workSpecDao().getWorkSpec(str);
        if (workSpec2 == null) {
            throw new IllegalArgumentException("Worker with " + str + " doesn't exist");
        }
        if (workSpec2.state.isFinished()) {
            return WorkManager.UpdateResult.NOT_APPLIED;
        }
        if (workSpec2.isPeriodic() ^ workSpec.isPeriodic()) {
            WorkerUpdater$updateWorkImpl$type$1 workerUpdater$updateWorkImpl$type$1 = new l<WorkSpec, String>() { // from class: androidx.work.impl.WorkerUpdater$updateWorkImpl$type$1
                @Override // sn.l
                @NotNull
                public final String invoke(@NotNull WorkSpec workSpec3) {
                    p.k(workSpec3, "spec");
                    return workSpec3.isPeriodic() ? "Periodic" : "OneTime";
                }
            };
            throw new UnsupportedOperationException("Can't update " + workerUpdater$updateWorkImpl$type$1.invoke(workSpec2) + " Worker to " + workerUpdater$updateWorkImpl$type$1.invoke(workSpec) + " Worker. Update operation must preserve worker's type.");
        }
        final boolean zIsEnqueued = processor.isEnqueued(str);
        if (!zIsEnqueued) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((Scheduler) it.next()).cancel(str);
            }
        }
        workDatabase.runInTransaction(new Runnable() { // from class: androidx.work.impl.d
            @Override // java.lang.Runnable
            public final void run() {
                WorkerUpdater.updateWorkImpl$lambda$1(workDatabase, workSpec, workSpec2, list, str, set, zIsEnqueued);
            }
        });
        if (!zIsEnqueued) {
            Schedulers.schedule(configuration, workDatabase, list);
        }
        return zIsEnqueued ? WorkManager.UpdateResult.APPLIED_FOR_NEXT_RUN : WorkManager.UpdateResult.APPLIED_IMMEDIATELY;
    }

    @NotNull
    public static final c8.i<WorkManager.UpdateResult> updateWorkImpl(@NotNull final WorkManagerImpl workManagerImpl, @NotNull final WorkRequest workRequest) {
        p.k(workManagerImpl, "<this>");
        p.k(workRequest, "workRequest");
        final SettableFuture settableFutureCreate = SettableFuture.create();
        workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor().execute(new Runnable() { // from class: androidx.work.impl.e
            @Override // java.lang.Runnable
            public final void run() {
                WorkerUpdater.updateWorkImpl$lambda$2(settableFutureCreate, workManagerImpl, workRequest);
            }
        });
        p.j(settableFutureCreate, "future");
        return settableFutureCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateWorkImpl$lambda$1(WorkDatabase workDatabase, WorkSpec workSpec, WorkSpec workSpec2, List list, String str, Set set, boolean z10) {
        p.k(workDatabase, "$workDatabase");
        p.k(workSpec, "$newWorkSpec");
        p.k(workSpec2, "$oldWorkSpec");
        p.k(list, "$schedulers");
        p.k(str, "$workSpecId");
        p.k(set, "$tags");
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        WorkTagDao workTagDao = workDatabase.workTagDao();
        workSpecDao.updateWorkSpec(EnqueueUtilsKt.wrapInConstraintTrackingWorkerIfNeeded(list, workSpec.copy((1048574 & 1) != 0 ? workSpec.id : null, (1048574 & 2) != 0 ? workSpec.state : workSpec2.state, (1048574 & 4) != 0 ? workSpec.workerClassName : null, (1048574 & 8) != 0 ? workSpec.inputMergerClassName : null, (1048574 & 16) != 0 ? workSpec.input : null, (1048574 & 32) != 0 ? workSpec.output : null, (1048574 & 64) != 0 ? workSpec.initialDelay : 0L, (1048574 & 128) != 0 ? workSpec.intervalDuration : 0L, (1048574 & 256) != 0 ? workSpec.flexDuration : 0L, (1048574 & 512) != 0 ? workSpec.constraints : null, (1048574 & 1024) != 0 ? workSpec.runAttemptCount : workSpec2.runAttemptCount, (1048574 & 2048) != 0 ? workSpec.backoffPolicy : null, (1048574 & 4096) != 0 ? workSpec.backoffDelayDuration : 0L, (1048574 & 8192) != 0 ? workSpec.lastEnqueueTime : workSpec2.lastEnqueueTime, (1048574 & 16384) != 0 ? workSpec.minimumRetentionDuration : 0L, (1048574 & 32768) != 0 ? workSpec.scheduleRequestedAt : 0L, (1048574 & 65536) != 0 ? workSpec.expedited : false, (131072 & 1048574) != 0 ? workSpec.outOfQuotaPolicy : null, (1048574 & 262144) != 0 ? workSpec.periodCount : 0, (1048574 & 524288) != 0 ? workSpec.generation : workSpec2.getGeneration() + 1)));
        workTagDao.deleteByWorkSpecId(str);
        workTagDao.insertTags(str, set);
        if (z10) {
            return;
        }
        workSpecDao.markWorkSpecScheduled(str, -1L);
        workDatabase.workProgressDao().delete(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateWorkImpl$lambda$2(SettableFuture settableFuture, WorkManagerImpl workManagerImpl, WorkRequest workRequest) {
        p.k(workManagerImpl, "$this_updateWorkImpl");
        p.k(workRequest, "$workRequest");
        if (settableFuture.isCancelled()) {
            return;
        }
        try {
            Processor processor = workManagerImpl.getProcessor();
            p.j(processor, "processor");
            WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
            p.j(workDatabase, "workDatabase");
            Configuration configuration = workManagerImpl.getConfiguration();
            p.j(configuration, i.f53156c);
            List<Scheduler> schedulers = workManagerImpl.getSchedulers();
            p.j(schedulers, "schedulers");
            settableFuture.set(updateWorkImpl(processor, workDatabase, configuration, schedulers, workRequest.getWorkSpec(), workRequest.getTags()));
        } catch (Throwable th2) {
            settableFuture.setException(th2);
        }
    }
}
