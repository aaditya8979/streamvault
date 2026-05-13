package com.ironsource.adapters.ironsource.nativeAd;

import com.ironsource.G8;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes7.dex */
public final class IronSourceNativeAdData extends AdapterNativeAdData {

    @Nullable
    private final String advertiser;

    @Nullable
    private final String body;

    @Nullable
    private final String callToAction;

    @Nullable
    private final NativeAdDataInterface.Image icon;

    @Nullable
    private final String title;

    public IronSourceNativeAdData(@NotNull G8 g82) {
        p.k(g82, "nativeAdData");
        this.title = g82.n();
        this.advertiser = g82.h();
        this.body = g82.i();
        this.callToAction = g82.j();
        this.icon = new NativeAdDataInterface.Image(g82.k(), null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public String getAdvertiser() {
        return this.advertiser;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public String getBody() {
        return this.body;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public String getCallToAction() {
        return this.callToAction;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public NativeAdDataInterface.Image getIcon() {
        return this.icon;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public String getTitle() {
        return this.title;
    }
}
