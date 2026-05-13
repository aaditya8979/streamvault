package kotlinx.coroutines;

import bn.r;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000do.u1;
import sn.l;

/* JADX INFO: compiled from: Job.kt */
/* JADX INFO: loaded from: classes6.dex */
public /* synthetic */ class JobKt__JobKt$invokeOnCompletion$1 extends FunctionReferenceImpl implements l<Throwable, r> {
    public JobKt__JobKt$invokeOnCompletion$1(Object obj) {
        super(1, obj, u1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
    }

    @Override // sn.l
    public /* bridge */ /* synthetic */ r invoke(Throwable th2) {
        invoke2(th2);
        return r.f5635a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        ((u1) this.receiver).v(th2);
    }
}
