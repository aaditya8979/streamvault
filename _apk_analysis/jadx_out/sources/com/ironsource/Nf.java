package com.ironsource;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class Nf implements LevelPlayRewardedAdListener {
    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdClicked(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        Dd.a().a(new C4041gd(0, levelPlayAdInfo.getPlacementName(), false, "", 0, null), Pf.f30178a.a(levelPlayAdInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdClosed(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        Dd.a().b(Pf.f30178a.a(levelPlayAdInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdDisplayFailed(@NotNull LevelPlayAdError levelPlayAdError, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdError, "error");
        tn.p.k(levelPlayAdInfo, "adInfo");
        Dd ddA = Dd.a();
        Pf pf2 = Pf.f30178a;
        ddA.a(pf2.a(levelPlayAdError), pf2.a(levelPlayAdInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdDisplayed(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        Dd.a().c(Pf.f30178a.a(levelPlayAdInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdLoadFailed(@NotNull LevelPlayAdError levelPlayAdError) {
        tn.p.k(levelPlayAdError, "error");
        Dd.a().a(Pf.f30178a.a(levelPlayAdError));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdLoaded(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        Dd.a().d(Pf.f30178a.a(levelPlayAdInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdRewarded(@NotNull LevelPlayReward levelPlayReward, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayReward, "reward");
        tn.p.k(levelPlayAdInfo, "adInfo");
        Dd.a().b(new C4041gd(0, levelPlayAdInfo.getPlacementName(), false, levelPlayReward.getName(), levelPlayReward.getAmount(), null), Pf.f30178a.a(levelPlayAdInfo));
    }
}
