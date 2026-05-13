package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class Zc extends FunctionReferenceImpl implements sn.p {
    public Zc(C3306bd c3306bd) {
        super(2, c3306bd, C3306bd.class, "transitionToFetchedState", "transitionToFetchedState(Lcom/inmobi/media/ads/context/AdComponent;Lcom/inmobi/media/ads/network/inmobiJson/model/InMobiJsonResponse;)V", 0);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        C3844x c3844x = (C3844x) obj;
        InMobiJsonResponse inMobiJsonResponse = (InMobiJsonResponse) obj2;
        tn.p.k(c3844x, "p0");
        tn.p.k(inMobiJsonResponse, "p1");
        C3306bd c3306bd = (C3306bd) this.receiver;
        C3605n9 c3605n9 = c3306bd.f27069e;
        if (c3605n9 != null) {
            c3605n9.a("AUM-NativeFetchingState", "transitionToFetchedState");
        }
        c3306bd.f26856r.a(new Yc(c3844x, inMobiJsonResponse, c3306bd.f26854p, c3306bd.f26855q, c3306bd.f26856r), c3306bd);
        return bn.r.f5635a;
    }
}
