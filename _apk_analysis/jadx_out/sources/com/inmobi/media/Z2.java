package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes9.dex */
public final class Z2 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W2 f26680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdConfig.ImaiConfig f26681c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z2(W2 w22, AdConfig.ImaiConfig imaiConfig, hn.c cVar) {
        super(2, cVar);
        this.f26680b = w22;
        this.f26681c = imaiConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new Z2(this.f26680b, this.f26681c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new Z2(this.f26680b, this.f26681c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f26679a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            W2 w22 = this.f26680b;
            int maxEventBatch = this.f26681c.getMaxEventBatch();
            int pingInterval = this.f26681c.getPingInterval();
            this.f26679a = 1;
            obj = w22.a(maxEventBatch, pingInterval, this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        tn.p.i(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.inmobi.ads.core.Click>");
        return tn.y.c(obj);
    }
}
