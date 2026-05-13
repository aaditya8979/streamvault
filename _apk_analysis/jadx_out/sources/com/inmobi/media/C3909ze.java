package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.ze, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3909ze extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ae f28639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdSessionConfiguration f28640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdSessionContext f28641c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3909ze(Ae ae2, AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, hn.c cVar) {
        super(2, cVar);
        this.f28639a = ae2;
        this.f28640b = adSessionConfiguration;
        this.f28641c = adSessionContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3909ze(this.f28639a, this.f28640b, this.f28641c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((C3909ze) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        Ae ae2 = this.f28639a;
        AdSessionConfiguration adSessionConfiguration = this.f28640b;
        tn.p.h(adSessionConfiguration);
        AdSessionContext adSessionContext = this.f28641c;
        int i10 = Ae.f25161i;
        ae2.a(adSessionConfiguration, adSessionContext);
        this.f28639a.b();
        this.f28639a.c();
        return bn.r.f5635a;
    }
}
