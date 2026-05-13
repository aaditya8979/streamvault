package yads;

import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class sf0 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p000do.k f94809b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf0(kotlinx.coroutines.c cVar) {
        super(0);
        this.f94809b = cVar;
    }

    @Override // sn.a
    public final Object invoke() {
        if (this.f94809b.isActive()) {
            p000do.k kVar = this.f94809b;
            Result.a aVar = Result.Companion;
            kVar.resumeWith(Result.m7534constructorimpl(Result.m7533boximpl(Result.m7534constructorimpl(bn.r.f5635a))));
        }
        return bn.r.f5635a;
    }
}
