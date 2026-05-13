package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.RewardedAdInternal;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: RewardedAd.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\bJ\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\bR\u0014\u0010\u0016\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/vungle/ads/RewardedAd;", "Lcom/vungle/ads/BaseFullscreenAd;", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lcom/vungle/ads/internal/RewardedAdInternal;", "constructAdInternal$vungle_ads_release", "(Landroid/content/Context;)Lcom/vungle/ads/internal/RewardedAdInternal;", "constructAdInternal", "", "userId", "Lbn/r;", "setUserId", "titleText", "setAlertTitleText", "bodyText", "setAlertBodyText", "closeButtonText", "setAlertCloseButtonText", "continueButtonText", "setAlertContinueButtonText", "getRewardedAdInternal", "()Lcom/vungle/ads/internal/RewardedAdInternal;", "rewardedAdInternal", "placementId", "Lcom/vungle/ads/AdConfig;", "adConfig", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/AdConfig;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class RewardedAd extends BaseFullscreenAd {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardedAd(@NotNull Context context, @NotNull String str, @NotNull AdConfig adConfig) {
        super(context, str, adConfig);
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(str, "placementId");
        p.k(adConfig, "adConfig");
    }

    public /* synthetic */ RewardedAd(Context context, String str, AdConfig adConfig, int i10, i iVar) {
        this(context, str, (i10 & 4) != 0 ? new AdConfig() : adConfig);
    }

    private final RewardedAdInternal getRewardedAdInternal() {
        AdInternal adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        p.i(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.RewardedAdInternal");
        return (RewardedAdInternal) adInternal$vungle_ads_release;
    }

    @Override // com.vungle.ads.BaseAd
    @NotNull
    public RewardedAdInternal constructAdInternal$vungle_ads_release(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        return new RewardedAdInternal(context);
    }

    public final void setAlertBodyText(@NotNull String str) {
        p.k(str, "bodyText");
        getRewardedAdInternal().setAlertBodyText$vungle_ads_release(str);
    }

    public final void setAlertCloseButtonText(@NotNull String str) {
        p.k(str, "closeButtonText");
        getRewardedAdInternal().setAlertCloseButtonText$vungle_ads_release(str);
    }

    public final void setAlertContinueButtonText(@NotNull String str) {
        p.k(str, "continueButtonText");
        getRewardedAdInternal().setAlertContinueButtonText$vungle_ads_release(str);
    }

    public final void setAlertTitleText(@NotNull String str) {
        p.k(str, "titleText");
        getRewardedAdInternal().setAlertTitleText$vungle_ads_release(str);
    }

    public final void setUserId(@NotNull String str) {
        p.k(str, "userId");
        getRewardedAdInternal().setUserId$vungle_ads_release(str);
    }
}
