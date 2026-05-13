package com.google.ads.mediation.vungle;

import android.content.Context;
import com.ironsource.C3978d4;
import com.vungle.ads.AdConfig;
import com.vungle.ads.InterstitialAd;
import com.vungle.ads.NativeAd;
import com.vungle.ads.RewardedAd;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleBannerView;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: VungleFactory.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class b {
    @NotNull
    public final AdConfig a() {
        return new AdConfig();
    }

    @NotNull
    public final VungleBannerView b(@NotNull Context context, @NotNull String str, @NotNull VungleAdSize vungleAdSize) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(str, "placementId");
        p.k(vungleAdSize, C3978d4.i.O);
        return new VungleBannerView(context, str, vungleAdSize);
    }

    @NotNull
    public final InterstitialAd c(@NotNull Context context, @NotNull String str, @NotNull AdConfig adConfig) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(str, "placementId");
        p.k(adConfig, "adConfig");
        return new InterstitialAd(context, str, adConfig);
    }

    @NotNull
    public final NativeAd d(@NotNull Context context, @NotNull String str) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(str, "placementId");
        return new NativeAd(context, str);
    }

    @NotNull
    public final RewardedAd e(@NotNull Context context, @NotNull String str, @NotNull AdConfig adConfig) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(str, "placementId");
        p.k(adConfig, "adConfig");
        return new RewardedAd(context, str, adConfig);
    }
}
