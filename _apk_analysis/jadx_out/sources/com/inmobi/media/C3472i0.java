package com.inmobi.media;

import android.os.SystemClock;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3472i0 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G f27317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3571m0 f27318b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3472i0(G g10, C3571m0 c3571m0, hn.c cVar) {
        super(2, cVar);
        this.f27317a = g10;
        this.f27318b = c3571m0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3472i0(this.f27317a, this.f27318b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3472i0(this.f27317a, this.f27318b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        Map mapA = AbstractC3491ik.a(this.f27317a);
        C3571m0 c3571m0 = this.f27318b;
        mapA.put("networkType", C3850x5.m());
        long j10 = c3571m0.f27591c.f26903f;
        p000do.l0 l0Var = AbstractC3492il.f27361a;
        mapA.put("latency", jn.a.e(SystemClock.elapsedRealtime() - j10));
        Wj wj2 = Wj.f26549a;
        Wj.b("ParseSuccess", mapA, EnumC3287ak.f26805a);
        return bn.r.f5635a;
    }
}
