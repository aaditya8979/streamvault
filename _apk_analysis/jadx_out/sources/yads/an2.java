package yads;

import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class an2 extends Lambda implements sn.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p000do.k f87758b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an2(kotlinx.coroutines.c cVar) {
        super(1);
        this.f87758b = cVar;
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        this.f87758b.resumeWith(Result.m7534constructorimpl(Result.m7533boximpl(Result.m7534constructorimpl((j80) obj))));
        return bn.r.f5635a;
    }
}
