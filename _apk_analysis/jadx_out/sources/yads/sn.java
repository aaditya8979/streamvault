package yads;

import android.content.Context;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes2.dex */
public final class sn extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f94882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zn f94883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hp f94884d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn(zn znVar, hp hpVar, hn.c cVar) {
        super(2, cVar);
        this.f94883c = znVar;
        this.f94884d = hpVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new sn(this.f94883c, this.f94884d, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new sn(this.f94883c, this.f94884d, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f94882b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            zn znVar = this.f94883c;
            s01 s01Var = znVar.f97687l;
            Context context = znVar.f97676a;
            hp hpVar = this.f94884d;
            this.f94882b = 1;
            obj = s01Var.a(context, hpVar, this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        return obj;
    }
}
