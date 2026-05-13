package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public final class qw0 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f94191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f94192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rw0 f94193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sw0 f94194e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw0(byte[] bArr, rw0 rw0Var, sw0 sw0Var, hn.c cVar) {
        super(2, cVar);
        this.f94192c = bArr;
        this.f94193d = rw0Var;
        this.f94194e = sw0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new qw0(this.f94192c, this.f94193d, this.f94194e, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((qw0) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f94191b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            byte[] bArr = this.f94192c;
            if (bArr == null) {
                return null;
            }
            hx0 hx0Var = this.f94193d.f94627b;
            sw0 sw0Var = this.f94194e;
            this.f94191b = 1;
            hw0 hw0Var = hx0Var.f90585a;
            hw0Var.getClass();
            Object objG2 = p000do.g.g(p000do.w0.b(), new gw0(hw0Var, sw0Var, bArr, null), this);
            if (objG2 != in.a.g()) {
                objG2 = bn.r.f5635a;
            }
            if (objG2 == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        return bn.r.f5635a;
    }
}
