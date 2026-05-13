package com.ironsource.mediationsdk.adapter;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import tn.p;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractInterstitialAdapter<AdNetworkAdapter> extends AbstractAdUnitAdapter<AdNetworkAdapter> implements InterstitialAdapterInterface {
    public AbstractInterstitialAdapter(AdNetworkAdapter adnetworkadapter) {
        super(adnetworkadapter);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void collectInterstitialBiddingData(@NotNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @NotNull BiddingDataCallback biddingDataCallback) {
        p.k(jSONObject, "config");
        p.k(biddingDataCallback, "biddingDataCallback");
        Map<String, Object> interstitialBiddingData = getInterstitialBiddingData(jSONObject, jSONObject2);
        if (interstitialBiddingData != null) {
            biddingDataCallback.onSuccess(interstitialBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void destroyInterstitialAd(@Nullable JSONObject jSONObject) {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    @Nullable
    public Map<String, Object> getInterstitialBiddingData(@NotNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        p.k(jSONObject, "config");
        return null;
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitial(@Nullable String str, @Nullable String str2, @NotNull JSONObject jSONObject, @NotNull InterstitialSmashListener interstitialSmashListener) {
        p.k(jSONObject, "config");
        p.k(interstitialSmashListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitialForBidding(@Nullable String str, @Nullable String str2, @NotNull JSONObject jSONObject, @NotNull InterstitialSmashListener interstitialSmashListener) {
        p.k(jSONObject, "config");
        p.k(interstitialSmashListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public boolean isInterstitialReady(@NotNull JSONObject jSONObject) {
        p.k(jSONObject, "config");
        return false;
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitial(@NotNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @NotNull InterstitialSmashListener interstitialSmashListener) {
        p.k(jSONObject, "config");
        p.k(interstitialSmashListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitialForBidding(@NotNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable String str, @NotNull InterstitialSmashListener interstitialSmashListener) {
        p.k(jSONObject, "config");
        p.k(interstitialSmashListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void showInterstitial(@NotNull JSONObject jSONObject, @NotNull InterstitialSmashListener interstitialSmashListener) {
        p.k(jSONObject, "config");
        p.k(interstitialSmashListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }
}
