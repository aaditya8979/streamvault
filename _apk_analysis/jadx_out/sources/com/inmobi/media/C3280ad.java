package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: com.inmobi.media.ad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C3280ad extends FunctionReferenceImpl implements sn.l {
    public C3280ad(C3306bd c3306bd) {
        super(1, c3306bd, C3306bd.class, "transitionToFetchFailedState", "transitionToFetchFailedState(S)V", 0);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        short sShortValue = ((Number) obj).shortValue();
        C3306bd c3306bd = (C3306bd) this.receiver;
        c3306bd.getClass();
        c3306bd.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), sShortValue);
        return bn.r.f5635a;
    }
}
