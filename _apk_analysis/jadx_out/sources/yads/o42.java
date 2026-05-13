package yads;

import android.content.Context;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes9.dex */
public final class o42 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f93121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f93122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q42 f93123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d4 f93124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f93125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ry1 f93126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mi2 f93127h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z30 f93128i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o42(q42 q42Var, d4 d4Var, Context context, ry1 ry1Var, mi2 mi2Var, z30 z30Var, hn.c cVar) {
        super(2, cVar);
        this.f93123d = q42Var;
        this.f93124e = d4Var;
        this.f93125f = context;
        this.f93126g = ry1Var;
        this.f93127h = mi2Var;
        this.f93128i = z30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        o42 o42Var = new o42(this.f93123d, this.f93124e, this.f93125f, this.f93126g, this.f93127h, this.f93128i, cVar);
        o42Var.f93122c = obj;
        return o42Var;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((o42) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM7534constructorimpl;
        Object objG = in.a.g();
        int i10 = this.f93121b;
        try {
            if (i10 == 0) {
                kotlin.c.b(obj);
                q42 q42Var = this.f93123d;
                d4 d4Var = this.f93124e;
                Context context = this.f93125f;
                ry1 ry1Var = this.f93126g;
                mi2 mi2Var = this.f93127h;
                z30 z30Var = this.f93128i;
                Result.a aVar = Result.Companion;
                j42 j42Var = q42Var.f93886b;
                this.f93121b = 1;
                j42Var.getClass();
                obj = p000do.g.g(p000do.w0.b(), new i42(d4Var, j42Var, context, ry1Var, z30Var, mi2Var, null), this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            objM7534constructorimpl = Result.m7534constructorimpl((ry1) obj);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
            return null;
        }
        return objM7534constructorimpl;
    }
}
