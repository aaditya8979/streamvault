package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.media.VastProperties;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.u2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3772u2 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3847x2 f28221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VastProperties f28222b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3772u2(AbstractC3847x2 abstractC3847x2, VastProperties vastProperties, hn.c cVar) {
        super(2, cVar);
        this.f28221a = abstractC3847x2;
        this.f28222b = vastProperties;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3772u2(this.f28221a, this.f28222b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3772u2(this.f28221a, this.f28222b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        AdEvents adEvents = this.f28221a.f27077e;
        if (adEvents != null) {
            adEvents.loaded(this.f28222b);
        }
        return bn.r.f5635a;
    }
}
