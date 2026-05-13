package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: loaded from: classes9.dex */
public class T7 extends AbstractC3861xg {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f26348m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T7(AdConfig.ViewabilityConfig viewabilityConfig, byte b10, InterfaceC3580m9 interfaceC3580m9) {
        super(viewabilityConfig, b10, interfaceC3580m9);
        tn.p.k(C3678q7.f27941k, "visibilityChecker");
        this.f26348m = 1000;
    }

    @Override // com.inmobi.media.Sn
    public int c() {
        AdConfig.ViewabilityConfig viewabilityConfig = this.f28522l;
        return viewabilityConfig != null ? viewabilityConfig.getWebVisibilityThrottleMillis() : this.f26348m;
    }
}
