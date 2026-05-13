package kotlinx.coroutines;

import bn.r;
import kotlin.jvm.internal.FunctionReferenceImpl;
import sn.q;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class JobSupport$onJoin$1 extends FunctionReferenceImpl implements q<JobSupport, lo.f<?>, Object, r> {
    public static final JobSupport$onJoin$1 INSTANCE = new JobSupport$onJoin$1();

    public JobSupport$onJoin$1() {
        super(3, JobSupport.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // sn.q
    public /* bridge */ /* synthetic */ r invoke(JobSupport jobSupport, lo.f<?> fVar, Object obj) {
        invoke2(jobSupport, fVar, obj);
        return r.f5635a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(JobSupport jobSupport, lo.f<?> fVar, Object obj) {
        jobSupport.S0(fVar, obj);
    }
}
