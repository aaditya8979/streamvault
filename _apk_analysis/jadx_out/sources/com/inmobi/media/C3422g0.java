package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3422g0 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3571m0 f27196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ short f27197b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3422g0(C3571m0 c3571m0, short s10, hn.c cVar) {
        super(2, cVar);
        this.f27196a = c3571m0;
        this.f27197b = s10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3422g0(this.f27196a, this.f27197b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3422g0(this.f27196a, this.f27197b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        Map mapA = AbstractC3491ik.a(this.f27196a.f27590b);
        mapA.put(IronSourceConstants.EVENTS_ERROR_CODE, jn.a.f(this.f27197b));
        Wj wj2 = Wj.f26549a;
        Wj.b("AdLoadDroppedAtSDK", mapA, EnumC3287ak.f26805a);
        return bn.r.f5635a;
    }
}
