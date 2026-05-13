package com.ironsource.adapters.ironsource.nativeAd;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C3978d4;
import com.ironsource.C4228r4;
import com.ironsource.E8;
import com.ironsource.Q6;
import com.ironsource.adapters.ironsource.IronSourceAdapter;
import com.ironsource.adapters.ironsource.nativeAd.IronSourceNativeAdAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import tn.p;

/* JADX INFO: loaded from: classes2.dex */
public final class IronSourceNativeAdAdapter extends AbstractNativeAdAdapter<IronSourceAdapter> {

    @Nullable
    private E8 nativeAd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IronSourceNativeAdAdapter(@NotNull IronSourceAdapter ironSourceAdapter) {
        super(ironSourceAdapter);
        p.k(ironSourceAdapter, Q6.G1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadNativeAdForBidding$lambda$0(IronSourceNativeAdAdapter ironSourceNativeAdAdapter, JSONObject jSONObject, NativeAdSmashListener nativeAdSmashListener, String str) {
        p.k(ironSourceNativeAdAdapter, "this$0");
        p.k(jSONObject, "$config");
        p.k(nativeAdSmashListener, "$listener");
        try {
            E8 e8A = E8.f29245j.a();
            e8A.a(new IronSourceNativeAdListener(new IronSourceNativeAdViewBinder(e8A, ironSourceNativeAdAdapter.getNativeAdProperties(jSONObject)), nativeAdSmashListener));
            Activity currentActiveActivity = ContextProvider.getInstance().getCurrentActiveActivity();
            JSONObject jSONObjectPrepareLoadParams = ironSourceNativeAdAdapter.prepareLoadParams(jSONObject, str);
            p.j(currentActiveActivity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            e8A.a(currentActiveActivity, jSONObjectPrepareLoadParams);
            ironSourceNativeAdAdapter.nativeAd = e8A;
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            nativeAdSmashListener.onNativeAdLoadFailed(new IronSourceError(510, "IronSourceAdapter loadNativeAd exception " + e10.getMessage()));
        }
    }

    private final JSONObject prepareLoadParams(JSONObject jSONObject, String str) throws JSONException {
        JSONObject jSONObjectPut = IronSourceVideoBridge.jsonObjectInit().put("demandSourceName", getAdapter().getDemandSourceName(jSONObject)).put(C3978d4.f31198s, "2").put("inAppBidding", true).put(getAdapter().ADM_KEY, d.b().a(str));
        HashMap<String, String> initParams = getAdapter().getInitParams();
        p.j(initParams, "extraParams");
        for (Map.Entry<String, String> entry : initParams.entrySet()) {
            jSONObjectPut.put(entry.getKey(), entry.getValue());
        }
        p.j(jSONObjectPut, "loadParams");
        return jSONObjectPut;
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void destroyNativeAd(@NotNull JSONObject jSONObject) {
        p.k(jSONObject, "config");
        E8 e82 = this.nativeAd;
        if (e82 != null) {
            e82.a();
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    @Nullable
    public Map<String, Object> getNativeAdBiddingData(@NotNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        p.k(jSONObject, "config");
        return new HashMap();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void initNativeAdForBidding(@Nullable String str, @Nullable String str2, @NotNull JSONObject jSONObject, @NotNull NativeAdSmashListener nativeAdSmashListener) {
        p.k(jSONObject, "config");
        p.k(nativeAdSmashListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        getAdapter().initSDK(str, jSONObject);
        nativeAdSmashListener.onNativeAdInitSuccess();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void loadNativeAdForBidding(@NotNull final JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable final String str, @NotNull final NativeAdSmashListener nativeAdSmashListener) {
        p.k(jSONObject, "config");
        p.k(nativeAdSmashListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        postOnUIThread(new Runnable() { // from class: q9.a
            @Override // java.lang.Runnable
            public final void run() {
                IronSourceNativeAdAdapter.loadNativeAdForBidding$lambda$0(this.f78199b, jSONObject, nativeAdSmashListener, str);
            }
        });
    }
}
