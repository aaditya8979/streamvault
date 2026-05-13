package com.ironsource;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class Yb extends L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InternalNativeAdListener f30736a;

    public Yb(@NotNull InternalNativeAdListener internalNativeAdListener) {
        tn.p.k(internalNativeAdListener, "mNativeAdListener");
        this.f30736a = internalNativeAdListener;
    }

    @Override // com.ironsource.L0
    public void a(@NotNull C4041gd c4041gd, @Nullable AdInfo adInfo) {
        tn.p.k(c4041gd, "placement");
        this.f30736a.onNativeAdClicked(adInfo);
    }

    @Override // com.ironsource.L0
    public void a(@NotNull AdapterNativeAdData adapterNativeAdData, @NotNull AdapterNativeAdViewBinder adapterNativeAdViewBinder, @Nullable AdInfo adInfo) {
        tn.p.k(adapterNativeAdData, "adapterNativeAdData");
        tn.p.k(adapterNativeAdViewBinder, "nativeAdViewBinder");
        this.f30736a.onNativeAdLoaded(adInfo, adapterNativeAdData, adapterNativeAdViewBinder);
    }

    @Override // com.ironsource.L0
    public void a(@Nullable IronSourceError ironSourceError) {
        this.f30736a.onNativeAdLoadFailed(ironSourceError);
    }

    @Override // com.ironsource.L0
    public void d(@Nullable AdInfo adInfo) {
        this.f30736a.onNativeAdImpression(adInfo);
    }
}
