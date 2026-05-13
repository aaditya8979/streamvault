package yads;

import android.content.Context;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes5.dex */
public final class g42 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f89809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j42 f89810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f89811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ry1 f89812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z30 f89813f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g42(j42 j42Var, Context context, ry1 ry1Var, z30 z30Var, hn.c cVar) {
        super(2, cVar);
        this.f89810c = j42Var;
        this.f89811d = context;
        this.f89812e = ry1Var;
        this.f89813f = z30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new g42(this.f89810c, this.f89811d, this.f89812e, this.f89813f, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((g42) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f89809b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            h62 h62Var = this.f89810c.f91095c;
            Context context = this.f89811d;
            ry1 ry1Var = this.f89812e;
            z30 z30Var = this.f89813f;
            this.f89809b = 1;
            obj = h62Var.a(true, context, ry1Var, z30Var, (hn.c) this);
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
