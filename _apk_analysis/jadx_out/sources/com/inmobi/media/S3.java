package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: loaded from: classes9.dex */
public final class S3 extends T7 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f26282n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S3(AdConfig.ViewabilityConfig viewabilityConfig, InterfaceC3580m9 interfaceC3580m9) {
        super(viewabilityConfig, (byte) 1, interfaceC3580m9);
        tn.p.k(C3678q7.f27941k, "visibilityChecker");
        this.f26282n = 500;
    }

    @Override // com.inmobi.media.T7, com.inmobi.media.Sn
    public final int c() {
        AdConfig.ViewabilityConfig viewabilityConfig = this.f28522l;
        return viewabilityConfig != null ? viewabilityConfig.getCompanionVisibilityThrottleMillis() : this.f26282n;
    }
}
