package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class Bc extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Cc f25208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdSessionConfiguration f25209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdSessionContext f25210c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bc(Cc cc2, AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, hn.c cVar) {
        super(2, cVar);
        this.f25208a = cc2;
        this.f25209b = adSessionConfiguration;
        this.f25210c = adSessionContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new Bc(this.f25208a, this.f25209b, this.f25210c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((Bc) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        Cc cc2 = this.f25208a;
        AdSessionConfiguration adSessionConfiguration = this.f25209b;
        tn.p.h(adSessionConfiguration);
        AdSessionContext adSessionContext = this.f25210c;
        int i10 = Cc.f25259h;
        cc2.a(adSessionConfiguration, adSessionContext);
        this.f25208a.b();
        this.f25208a.c();
        return bn.r.f5635a;
    }
}
