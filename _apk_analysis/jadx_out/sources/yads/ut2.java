package yads;

import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ut2 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public mo.a f95789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public vt2 f95790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q61 f95791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f95792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vt2 f95793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q61 f95794g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ut2(vt2 vt2Var, q61 q61Var, hn.c cVar) {
        super(2, cVar);
        this.f95793f = vt2Var;
        this.f95794g = q61Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new ut2(this.f95793f, this.f95794g, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new ut2(this.f95793f, this.f95794g, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        mo.a aVar;
        vt2 vt2Var;
        q61 q61Var;
        mo.a aVar2;
        Object objG = in.a.g();
        int i10 = this.f95792e;
        try {
            if (i10 == 0) {
                kotlin.c.b(obj);
                this.f95793f.f96187a.a(v5.f95931j, null);
                aVar = vt2.f96186d;
                vt2Var = this.f95793f;
                q61Var = this.f95794g;
                this.f95789b = aVar;
                this.f95790c = vt2Var;
                this.f95791d = q61Var;
                this.f95792e = 1;
                if (aVar.c(null, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = this.f95789b;
                    try {
                        kotlin.c.b(obj);
                        iu2 iu2Var = (iu2) obj;
                        aVar2.d(null);
                        return iu2Var;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar = aVar2;
                        aVar.d(null);
                        throw th;
                    }
                }
                q61Var = this.f95791d;
                vt2Var = this.f95790c;
                aVar = this.f95789b;
                kotlin.c.b(obj);
            }
            vt2Var.f96187a.a(v5.f95931j);
            this.f95789b = aVar;
            this.f95790c = vt2Var;
            this.f95791d = q61Var;
            this.f95792e = 2;
            kotlinx.coroutines.c cVar = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.d(this), 1);
            cVar.K();
            cVar.P(new st2(vt2Var));
            vt2Var.f96189c.a(vt2Var.f96188b, q61Var, new tt2(cVar));
            obj = cVar.B();
            if (obj == in.a.g()) {
                jn.f.c(this);
            }
            if (obj == objG) {
                return objG;
            }
            aVar2 = aVar;
            iu2 iu2Var2 = (iu2) obj;
            aVar2.d(null);
            return iu2Var2;
        } catch (Throwable th3) {
            th = th3;
            aVar.d(null);
            throw th;
        }
    }
}
