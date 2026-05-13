package io.bidmachine.util.taskmanager.coroutine;

import bn.r;
import hn.c;
import in.a;
import io.bidmachine.util.taskmanager.BaseTaskManager;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import jn.d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.i;
import p000do.l0;
import p000do.s0;
import sn.p;

/* JADX INFO: compiled from: CoroutineTaskManager.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017B\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0006\u0010\n\u001a\u00020\tR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lio/bidmachine/util/taskmanager/coroutine/CoroutineTaskManager;", "Lio/bidmachine/util/taskmanager/BaseTaskManager;", "Ljava/lang/Runnable;", "task", "", "delayMs", "Lbn/r;", "scheduleTask", "cancelTask", "", "getScheduledTaskCount", "Ldo/l0;", "coroutineScope", "Ldo/l0;", "getCoroutineScope", "()Ldo/l0;", "", "Lkotlinx/coroutines/g;", "jobMap", "Ljava/util/Map;", "Lkotlin/coroutines/d;", "coroutineContext", "<init>", "(Lkotlin/coroutines/d;)V", "(Ldo/l0;)V", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1})
public class CoroutineTaskManager extends BaseTaskManager {

    @NotNull
    private final l0 coroutineScope;

    @NotNull
    private final Map<Runnable, g> jobMap;

    /* JADX INFO: renamed from: io.bidmachine.util.taskmanager.coroutine.CoroutineTaskManager$scheduleTask$1, reason: invalid class name */
    /* JADX INFO: compiled from: CoroutineTaskManager.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Ldo/l0;", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @d(c = "io.bidmachine.util.taskmanager.coroutine.CoroutineTaskManager$scheduleTask$1", f = "CoroutineTaskManager.kt", l = {30}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public final /* synthetic */ long $delayMs;
        public final /* synthetic */ Runnable $task;
        private /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ CoroutineTaskManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j10, CoroutineTaskManager coroutineTaskManager, Runnable runnable, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$delayMs = j10;
            this.this$0 = coroutineTaskManager;
            this.$task = runnable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$delayMs, this.this$0, this.$task, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
            return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                l0 l0Var = (l0) this.L$0;
                long j10 = this.$delayMs;
                if (j10 > 0) {
                    this.L$0 = l0Var;
                    this.label = 1;
                    if (s0.a(j10, this) == objG) {
                        return objG;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            try {
                this.$task.run();
                r rVar = r.f5635a;
            } catch (Throwable unused) {
            }
            this.this$0.cancel(this.$task);
            return r.f5635a;
        }
    }

    public CoroutineTaskManager(@NotNull l0 l0Var) {
        tn.p.k(l0Var, "coroutineScope");
        this.coroutineScope = l0Var;
        this.jobMap = new ConcurrentHashMap();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CoroutineTaskManager(@NotNull kotlin.coroutines.d dVar) {
        this(kotlinx.coroutines.d.a(dVar));
        tn.p.k(dVar, "coroutineContext");
    }

    @Override // io.bidmachine.util.taskmanager.BaseTaskManager
    public void cancelTask(@NotNull Runnable runnable) throws Throwable {
        tn.p.k(runnable, "task");
        g gVarRemove = this.jobMap.remove(runnable);
        if (gVarRemove != null) {
            g.a.a(gVarRemove, null, 1, null);
        }
    }

    @Override // io.bidmachine.util.taskmanager.BaseTaskManager, io.bidmachine.util.taskmanager.TaskManager
    public /* bridge */ /* synthetic */ void execute(@NotNull Runnable runnable) throws Throwable {
        super.execute(runnable);
    }

    @Override // io.bidmachine.util.taskmanager.BaseTaskManager, io.bidmachine.util.taskmanager.TaskManager
    public /* bridge */ /* synthetic */ boolean executeSafely(@NotNull Runnable runnable) {
        return super.executeSafely(runnable);
    }

    @NotNull
    public final l0 getCoroutineScope() {
        return this.coroutineScope;
    }

    public final int getScheduledTaskCount() {
        return this.jobMap.size();
    }

    @Override // io.bidmachine.util.taskmanager.BaseTaskManager, io.bidmachine.util.taskmanager.TaskManager
    public /* bridge */ /* synthetic */ void schedule(@NotNull Runnable runnable, long j10, @NotNull TimeUnit timeUnit) throws Throwable {
        super.schedule(runnable, j10, timeUnit);
    }

    @Override // io.bidmachine.util.taskmanager.BaseTaskManager, io.bidmachine.util.taskmanager.TaskManager
    public /* bridge */ /* synthetic */ boolean scheduleSafely(@NotNull Runnable runnable, long j10) {
        return super.scheduleSafely(runnable, j10);
    }

    @Override // io.bidmachine.util.taskmanager.BaseTaskManager, io.bidmachine.util.taskmanager.TaskManager
    public /* bridge */ /* synthetic */ boolean scheduleSafely(@NotNull Runnable runnable, long j10, @NotNull TimeUnit timeUnit) {
        return super.scheduleSafely(runnable, j10, timeUnit);
    }

    @Override // io.bidmachine.util.taskmanager.BaseTaskManager
    public void scheduleTask(@NotNull Runnable runnable, long j10) throws Throwable {
        tn.p.k(runnable, "task");
        g gVarD = i.d(this.coroutineScope, null, CoroutineStart.LAZY, new AnonymousClass1(j10, this, runnable, null), 1, null);
        this.jobMap.put(runnable, gVarD);
        gVarD.start();
    }
}
