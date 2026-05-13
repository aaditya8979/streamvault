package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3522k1 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3547l1 f27437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f27438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27439c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3522k1(AbstractC3547l1 abstractC3547l1, String str, String str2, hn.c cVar) {
        super(2, cVar);
        this.f27437a = abstractC3547l1;
        this.f27438b = str;
        this.f27439c = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3522k1(this.f27437a, this.f27438b, this.f27439c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((C3522k1) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        com.inmobi.media.ads.network.common.model.Ad adB = this.f27437a.b(0);
        if (adB == null || !tn.p.f(adB.getImpressionId(), this.f27438b)) {
            C3605n9 c3605n9 = this.f27437a.f27513i;
            if (c3605n9 != null) {
                tn.p.j("l1", "<get-TAG>(...)");
                c3605n9.b("l1", "Impression ID is null for saveBlob");
            }
        } else {
            this.f27437a.a(adB, this.f27439c);
            C3605n9 c3605n92 = this.f27437a.f27513i;
            if (c3605n92 != null) {
                tn.p.j("l1", "<get-TAG>(...)");
                c3605n92.c("l1", "Updated blob " + this.f27439c);
            }
        }
        return bn.r.f5635a;
    }
}
