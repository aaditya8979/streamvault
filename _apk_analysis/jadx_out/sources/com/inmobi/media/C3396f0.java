package com.inmobi.media;

import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3396f0 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3571m0 f27126a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3396f0(C3571m0 c3571m0, hn.c cVar) {
        super(2, cVar);
        this.f27126a = c3571m0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3396f0(this.f27126a, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3396f0(this.f27126a, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        Map mapA = AbstractC3491ik.a(this.f27126a.f27590b);
        mapA.put("networkType", C3850x5.m());
        Wj wj2 = Wj.f26549a;
        Wj.b("AdLoadCalled", mapA, EnumC3287ak.f26805a);
        return bn.r.f5635a;
    }
}
