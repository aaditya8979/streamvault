package yads;

import android.content.Context;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes2.dex */
public final class tn extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f95285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zn f95286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hp f95287d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn(zn znVar, hp hpVar, hn.c cVar) {
        super(2, cVar);
        this.f95286c = znVar;
        this.f95287d = hpVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new tn(this.f95286c, this.f95287d, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new tn(this.f95286c, this.f95287d, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f95285b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            zn znVar = this.f95286c;
            fh2 fh2Var = znVar.f97688m;
            Context context = znVar.f97676a;
            hp hpVar = this.f95287d;
            this.f95285b = 1;
            obj = fh2Var.a(context, hpVar, this);
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
