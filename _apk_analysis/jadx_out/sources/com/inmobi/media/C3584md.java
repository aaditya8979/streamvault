package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: com.inmobi.media.md, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C3584md extends FunctionReferenceImpl implements sn.l {
    public C3584md(C3609nd c3609nd) {
        super(1, c3609nd, C3609nd.class, "transitionToFetchFailedState", "transitionToFetchFailedState(S)V", 0);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        short sShortValue = ((Number) obj).shortValue();
        C3609nd c3609nd = (C3609nd) this.receiver;
        c3609nd.getClass();
        c3609nd.a(kotlin.collections.a.o(bn.h.a(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(sShortValue))), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        return bn.r.f5635a;
    }
}
