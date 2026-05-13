package com.ironsource.mediationsdk.adapter;

import bn.r;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import tn.p;

/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractRewardedVideoAdapter<AdNetworkAdapter> extends AbstractAdUnitAdapter<AdNetworkAdapter> implements RewardedVideoAdapterInterface {
    public AbstractRewardedVideoAdapter(AdNetworkAdapter adnetworkadapter) {
        super(adnetworkadapter);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void collectRewardedVideoBiddingData(@NotNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @NotNull BiddingDataCallback biddingDataCallback) {
        r rVar;
        p.k(jSONObject, "config");
        p.k(biddingDataCallback, "biddingDataCallback");
        Map<String, Object> rewardedVideoBiddingData = getRewardedVideoBiddingData(jSONObject, jSONObject2);
        if (rewardedVideoBiddingData != null) {
            biddingDataCallback.onSuccess(rewardedVideoBiddingData);
            rVar = r.f5635a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void destroyRewardedVideoAd(@Nullable JSONObject jSONObject) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    @Nullable
    public Map<String, Object> getRewardedVideoBiddingData(@NotNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        p.k(jSONObject, "config");
        return null;
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initAndLoadRewardedVideo(@Nullable String str, @Nullable String str2, @NotNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @NotNull RewardedVideoSmashListener rewardedVideoSmashListener) {
        p.k(jSONObject, "config");
        p.k(rewardedVideoSmashListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoForDemandOnly(@Nullable String str, @Nullable String str2, @NotNull JSONObject jSONObject, @NotNull RewardedVideoSmashListener rewardedVideoSmashListener) {
        p.k(jSONObject, "config");
        p.k(rewardedVideoSmashListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoWithCallback(@Nullable String str, @Nullable String str2, @NotNull JSONObject jSONObject, @NotNull RewardedVideoSmashListener rewardedVideoSmashListener) {
        p.k(jSONObject, "config");
        p.k(rewardedVideoSmashListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public boolean isRewardedVideoAvailable(@NotNull JSONObject jSONObject) {
        p.k(jSONObject, "config");
        return false;
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideo(@NotNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @NotNull RewardedVideoSmashListener rewardedVideoSmashListener) {
        p.k(jSONObject, "config");
        p.k(rewardedVideoSmashListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideoForBidding(@NotNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable String str, @NotNull RewardedVideoSmashListener rewardedVideoSmashListener) {
        p.k(jSONObject, "config");
        p.k(rewardedVideoSmashListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void showRewardedVideo(@NotNull JSONObject jSONObject, @NotNull RewardedVideoSmashListener rewardedVideoSmashListener) {
        p.k(jSONObject, "config");
        p.k(rewardedVideoSmashListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }
}
