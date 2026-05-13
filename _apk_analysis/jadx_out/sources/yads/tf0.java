package yads;

import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class tf0 extends Lambda implements sn.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p000do.k f95190b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf0(kotlinx.coroutines.c cVar) {
        super(1);
        this.f95190b = cVar;
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        if (this.f95190b.isActive()) {
            p000do.k kVar = this.f95190b;
            Result.a aVar = Result.Companion;
            kVar.resumeWith(Result.m7534constructorimpl(kotlin.c.a(th2)));
        }
        return bn.r.f5635a;
    }
}
