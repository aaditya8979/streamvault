package com.inmobi.media;

import android.os.SystemClock;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3447h0 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f27266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3571m0 f27267b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3447h0(C3571m0 c3571m0, Map map, hn.c cVar) {
        super(2, cVar);
        this.f27266a = map;
        this.f27267b = c3571m0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3447h0(this.f27267b, this.f27266a, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        Map map = this.f27266a;
        return new C3447h0(this.f27267b, map, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j10;
        long jElapsedRealtime;
        in.a.g();
        kotlin.c.b(obj);
        Object obj2 = this.f27266a.get(IronSourceConstants.EVENTS_ERROR_CODE);
        Short sh2 = obj2 instanceof Short ? (Short) obj2 : null;
        Map mapA = AbstractC3491ik.a(this.f27267b.f27590b);
        C3571m0 c3571m0 = this.f27267b;
        if (sh2 != null && sh2.shortValue() == 2138) {
            j10 = c3571m0.f27591c.f26900c;
            p000do.l0 l0Var = AbstractC3492il.f27361a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else if ((sh2 == null || sh2.shortValue() != 2139) && (sh2 == null || sh2.shortValue() != 2203)) {
            j10 = c3571m0.f27591c.f26898a;
            p000do.l0 l0Var2 = AbstractC3492il.f27361a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            j10 = c3571m0.f27591c.f26902e;
            p000do.l0 l0Var3 = AbstractC3492il.f27361a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        mapA.put("latency", jn.a.e(jElapsedRealtime - j10));
        mapA.putAll(this.f27266a);
        Wj wj2 = Wj.f26549a;
        Wj.b("AdLoadFailed", mapA, EnumC3287ak.f26805a);
        return bn.r.f5635a;
    }
}
