package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3473i1 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3547l1 f27319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f27320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F2 f27321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f27322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f27323e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3473i1(AbstractC3547l1 abstractC3547l1, String str, F2 f22, String str2, String str3, hn.c cVar) {
        super(2, cVar);
        this.f27319a = abstractC3547l1;
        this.f27320b = str;
        this.f27321c = f22;
        this.f27322d = str2;
        this.f27323e = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3473i1(this.f27319a, this.f27320b, this.f27321c, this.f27322d, this.f27323e, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((C3473i1) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        try {
            com.inmobi.media.ads.network.common.model.Ad adB = this.f27319a.b(0);
            if (adB == null || !tn.p.f(adB.getImpressionId(), this.f27320b)) {
                C3605n9 c3605n9 = this.f27319a.f27513i;
                if (c3605n9 != null) {
                    tn.p.j("l1", "<get-TAG>(...)");
                    c3605n9.c("l1", "Returning blob as empty string");
                }
                ((GestureDetectorOnGestureListenerC3337ci) this.f27321c).c(this.f27322d, this.f27323e, "");
            } else {
                String webVast = adB.getWebVast();
                ((GestureDetectorOnGestureListenerC3337ci) this.f27321c).c(this.f27322d, this.f27323e, webVast);
                C3605n9 c3605n92 = this.f27319a.f27513i;
                if (c3605n92 != null) {
                    tn.p.j("l1", "<get-TAG>(...)");
                    c3605n92.c("l1", "Returning blob " + webVast);
                }
            }
        } catch (Exception e10) {
            C3605n9 c3605n93 = this.f27319a.f27513i;
            if (c3605n93 != null) {
                tn.p.j("l1", "<get-TAG>(...)");
                c3605n93.a("l1", "Exception while getBlob", e10);
            }
            bn.g gVar = P9.f26117a;
            AbstractC3481i9.a(e10);
        }
        return bn.r.f5635a;
    }
}
