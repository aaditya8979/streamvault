package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSession;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3320c1 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3371e1 f26905a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3320c1(AbstractC3371e1 abstractC3371e1, hn.c cVar) {
        super(2, cVar);
        this.f26905a = abstractC3371e1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3320c1(this.f26905a, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3320c1(this.f26905a, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        AdSession adSession = this.f26905a.f27075c;
        if (adSession != null) {
            adSession.finish();
        }
        this.f26905a.f27075c = null;
        return bn.r.f5635a;
    }
}
