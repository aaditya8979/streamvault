package yads;

import android.content.Context;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes4.dex */
public final class pw1 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f93813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f93814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oj1 f93815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f93816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qw1 f93817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v9 f93818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f93819h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw1(Context context, oj1 oj1Var, String str, qw1 qw1Var, v9 v9Var, boolean z10, hn.c cVar) {
        super(2, cVar);
        this.f93814c = context;
        this.f93815d = oj1Var;
        this.f93816e = str;
        this.f93817f = qw1Var;
        this.f93818g = v9Var;
        this.f93819h = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new pw1(this.f93814c, this.f93815d, this.f93816e, this.f93817f, this.f93818g, this.f93819h, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((pw1) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vn3 vn3Var;
        gw1 gw1Var;
        Object objG = in.a.g();
        int i10 = this.f93813b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            sw1 sw1VarA = sw1.f94966c.a(this.f93814c);
            if (sw1VarA.f94969b.size() != sw1VarA.f94968a) {
                if (!sw1VarA.f94969b.containsKey(this.f93815d) && this.f93816e != null) {
                    fs2 fs2Var = this.f93817f.f94195a;
                    Context context = this.f93814c;
                    String str = this.f93818g.G;
                    if (str != null) {
                        vn3.f96142c.getClass();
                        vn3Var = (vn3) vn3.f96143d.get(str);
                        if (vn3Var == null) {
                            vn3Var = vn3.f96144e;
                        }
                    } else {
                        vn3Var = vn3.f96144e;
                    }
                    tn3 tn3Var = new tn3(vn3Var);
                    fs2Var.getClass();
                    try {
                        gw1Var = new gw1(context, tn3Var, 4);
                    } catch (Throwable unused) {
                        gw1Var = null;
                    }
                    if (gw1Var == null) {
                        return bn.r.f5635a;
                    }
                    oj1 oj1Var = this.f93815d;
                    String str2 = this.f93816e;
                    boolean z10 = this.f93819h;
                    this.f93813b = 1;
                    kotlinx.coroutines.c cVar = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.d(this), 1);
                    cVar.K();
                    nw1 nw1Var = new nw1(sw1VarA, oj1Var, new ow1(z10, cVar));
                    if (sw1VarA.f94969b.size() < sw1VarA.f94968a) {
                        sw1VarA.f94969b.put(oj1Var, gw1Var);
                    }
                    gw1Var.a(str2, nw1Var);
                    if (!z10 && cVar.isActive()) {
                        Result.a aVar = Result.Companion;
                        cVar.resumeWith(Result.m7534constructorimpl(bn.r.f5635a));
                    }
                    Object objB = cVar.B();
                    if (objB == in.a.g()) {
                        jn.f.c(this);
                    }
                    if (objB == objG) {
                        return objG;
                    }
                }
            }
            return bn.r.f5635a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.c.b(obj);
        return bn.r.f5635a;
    }
}
