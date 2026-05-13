package yads;

import android.content.Context;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public final class th2 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f95227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xh2 f95228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f95229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e00 f95230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a03 f95231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f95232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f95233h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th2(long j10, Context context, e00 e00Var, a03 a03Var, xh2 xh2Var, List list, hn.c cVar) {
        super(2, cVar);
        this.f95228c = xh2Var;
        this.f95229d = context;
        this.f95230e = e00Var;
        this.f95231f = a03Var;
        this.f95232g = list;
        this.f95233h = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        xh2 xh2Var = this.f95228c;
        return new th2(this.f95233h, this.f95229d, this.f95230e, this.f95231f, xh2Var, this.f95232g, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((th2) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f95227b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            xh2 xh2Var = this.f95228c;
            Context context = this.f95229d;
            e00 e00Var = this.f95230e;
            a03 a03Var = this.f95231f;
            List list = this.f95232g;
            long j10 = this.f95233h;
            this.f95227b = 1;
            obj = xh2.a(j10, context, e00Var, a03Var, xh2Var, list, this);
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
