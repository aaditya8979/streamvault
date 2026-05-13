package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: com.inmobi.media.ld, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C3559ld extends FunctionReferenceImpl implements sn.p {
    public C3559ld(C3609nd c3609nd) {
        super(2, c3609nd, C3609nd.class, "transitionToFetchedState", "transitionToFetchedState(Lcom/inmobi/media/ads/context/AdComponent;Lcom/inmobi/media/ads/network/inmobiJson/model/InMobiJsonResponse;)V", 0);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        C3844x c3844x = (C3844x) obj;
        InMobiJsonResponse inMobiJsonResponse = (InMobiJsonResponse) obj2;
        tn.p.k(c3844x, "p0");
        tn.p.k(inMobiJsonResponse, "p1");
        C3609nd c3609nd = (C3609nd) this.receiver;
        C3605n9 c3605n9 = c3609nd.f27069e;
        if (c3605n9 != null) {
            c3605n9.a("AUM-NativeLoadResponseState", "transitionToFetchedState - validation successful, transitioning to fetched state");
        }
        c3609nd.f27692r.a(new Yc(c3844x, inMobiJsonResponse, c3609nd.f27690p, c3609nd.f27691q, c3609nd.f27692r), c3609nd);
        return bn.r.f5635a;
    }
}
