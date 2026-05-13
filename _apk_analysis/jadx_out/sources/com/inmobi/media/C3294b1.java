package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSession;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3294b1 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3371e1 f26826a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3294b1(AbstractC3371e1 abstractC3371e1, hn.c cVar) {
        super(2, cVar);
        this.f26826a = abstractC3371e1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3294b1(this.f26826a, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3294b1(this.f26826a, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        try {
            AdSession adSession = this.f26826a.f27075c;
            if (adSession != null) {
                adSession.start();
            }
        } catch (Exception e10) {
            AbstractC3371e1 abstractC3371e1 = this.f26826a;
            abstractC3371e1.f27075c = null;
            InterfaceC3580m9 interfaceC3580m9 = abstractC3371e1.f27074b;
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).a(AbstractC3371e1.f27072f, "AdSession start error " + e10);
            }
        }
        return bn.r.f5635a;
    }
}
