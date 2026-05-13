package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.media.VastProperties;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.v2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3797v2 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3847x2 f28317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VastProperties f28318b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3797v2(AbstractC3847x2 abstractC3847x2, VastProperties vastProperties, hn.c cVar) {
        super(2, cVar);
        this.f28317a = abstractC3847x2;
        this.f28318b = vastProperties;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3797v2(this.f28317a, this.f28318b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3797v2(this.f28317a, this.f28318b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        AdEvents adEvents = this.f28317a.f27077e;
        if (adEvents != null) {
            adEvents.loaded(this.f28318b);
        }
        return bn.r.f5635a;
    }
}
