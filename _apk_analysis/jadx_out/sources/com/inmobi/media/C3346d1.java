package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.media.InteractionType;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3346d1 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3371e1 f27006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InteractionType f27007b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3346d1(AbstractC3371e1 abstractC3371e1, InteractionType interactionType, hn.c cVar) {
        super(2, cVar);
        this.f27006a = abstractC3371e1;
        this.f27007b = interactionType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3346d1(this.f27006a, this.f27007b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3346d1(this.f27006a, this.f27007b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        MediaEvents mediaEvents = this.f27006a.f27076d;
        if (mediaEvents != null) {
            mediaEvents.adUserInteraction(this.f27007b);
        }
        return bn.r.f5635a;
    }
}
