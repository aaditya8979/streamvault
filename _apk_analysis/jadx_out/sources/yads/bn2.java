package yads;

import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public final class bn2 extends Lambda implements sn.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p000do.k f88095b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn2(kotlinx.coroutines.c cVar) {
        super(1);
        this.f88095b = cVar;
    }

    @Override // sn.l
    public final Object invoke(Object obj) throws im3 {
        im3 im3Var = (im3) obj;
        if (im3Var.getCause() instanceof SerializationException) {
            throw im3Var;
        }
        p000do.k kVar = this.f88095b;
        Result.a aVar = Result.Companion;
        kVar.resumeWith(Result.m7534constructorimpl(Result.m7533boximpl(Result.m7534constructorimpl(kotlin.c.a(im3Var)))));
        return bn.r.f5635a;
    }
}
