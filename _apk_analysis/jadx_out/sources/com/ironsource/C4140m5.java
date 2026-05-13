package com.ironsource;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.m5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4140m5 extends L0 {
    @Override // com.ironsource.L0
    public void a() {
    }

    @Override // com.ironsource.L0
    public void a(@NotNull C4041gd c4041gd, @NotNull AdInfo adInfo) {
        tn.p.k(c4041gd, "placement");
        tn.p.k(adInfo, "adInfo");
    }

    @Override // com.ironsource.L0
    public void a(@NotNull AdapterNativeAdData adapterNativeAdData, @NotNull AdapterNativeAdViewBinder adapterNativeAdViewBinder, @NotNull AdInfo adInfo) {
        tn.p.k(adapterNativeAdData, "adapterNativeAdData");
        tn.p.k(adapterNativeAdViewBinder, "nativeAdViewBinder");
        tn.p.k(adInfo, "adInfo");
    }

    @Override // com.ironsource.L0
    public void a(@NotNull AdInfo adInfo) {
        tn.p.k(adInfo, "adInfo");
    }

    @Override // com.ironsource.L0
    public void a(@Nullable IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.L0
    public void a(@NotNull IronSourceError ironSourceError, @NotNull AdInfo adInfo) {
        tn.p.k(ironSourceError, "error");
        tn.p.k(adInfo, "adInfo");
    }

    @Override // com.ironsource.L0
    public void a(boolean z10, @NotNull AdInfo adInfo) {
        tn.p.k(adInfo, "adInfo");
    }

    @Override // com.ironsource.L0
    public void b() {
    }

    @Override // com.ironsource.L0
    public void b(@NotNull C4041gd c4041gd, @NotNull AdInfo adInfo) {
        tn.p.k(c4041gd, "placement");
        tn.p.k(adInfo, "adInfo");
    }

    @Override // com.ironsource.L0
    public void c(@NotNull AdInfo adInfo) {
        tn.p.k(adInfo, "adInfo");
    }

    @Override // com.ironsource.L0
    public void d(@NotNull AdInfo adInfo) {
        tn.p.k(adInfo, "adInfo");
    }

    @Override // com.ironsource.L0
    public void g(@NotNull AdInfo adInfo) {
        tn.p.k(adInfo, "adInfo");
    }
}
