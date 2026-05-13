package yads;

import android.content.Context;
import android.webkit.WebSettings;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes12.dex */
public final class ao3 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f87770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f87771c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao3(Context context, hn.c cVar) {
        super(2, cVar);
        this.f87771c = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        ao3 ao3Var = new ao3(this.f87771c, cVar);
        ao3Var.f87770b = obj;
        return ao3Var;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        ao3 ao3Var = new ao3(this.f87771c, (hn.c) obj2);
        ao3Var.f87770b = (p000do.l0) obj;
        return ao3Var.invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM7534constructorimpl;
        in.a.g();
        kotlin.c.b(obj);
        Context context = this.f87771c;
        try {
            Result.a aVar = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(WebSettings.getDefaultUserAgent(context.getApplicationContext()));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        return Result.m7533boximpl(objM7534constructorimpl);
    }
}
