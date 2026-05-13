package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.C4228r4;
import com.ironsource.Ne;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class NetworkSettings {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f32690r = "customNetwork";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f32691s = "customNetworkPackage";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f32692t = "customNetworkAdapterName";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f32695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private JSONObject f32696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private JSONObject f32697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private JSONObject f32698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private JSONObject f32699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f32700h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f32701i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f32702j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f32703k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f32704l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f32705m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f32706n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f32707o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f32708p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f32709q;

    public NetworkSettings(NetworkSettings networkSettings) {
        this.f32693a = networkSettings.getProviderName();
        this.f32703k = networkSettings.getProviderName();
        this.f32694b = networkSettings.getProviderTypeForReflection();
        this.f32696d = networkSettings.getRewardedVideoSettings();
        this.f32697e = networkSettings.getInterstitialSettings();
        this.f32698f = networkSettings.getBannerSettings();
        this.f32699g = networkSettings.getNativeAdSettings();
        this.f32695c = networkSettings.getApplicationSettings();
        this.f32704l = networkSettings.getRewardedVideoPriority();
        this.f32705m = networkSettings.getInterstitialPriority();
        this.f32706n = networkSettings.getBannerPriority();
        this.f32707o = networkSettings.getNativeAdPriority();
        this.f32708p = networkSettings.getProviderDefaultInstance();
        this.f32709q = networkSettings.getProviderNetworkKey();
    }

    public NetworkSettings(String str) {
        this.f32693a = str;
        this.f32703k = str;
        this.f32694b = str;
        this.f32708p = str;
        this.f32709q = str;
        this.f32696d = IronSourceVideoBridge.jsonObjectInit();
        this.f32697e = IronSourceVideoBridge.jsonObjectInit();
        this.f32698f = IronSourceVideoBridge.jsonObjectInit();
        this.f32699g = IronSourceVideoBridge.jsonObjectInit();
        this.f32695c = IronSourceVideoBridge.jsonObjectInit();
        this.f32704l = -1;
        this.f32705m = -1;
        this.f32706n = -1;
        this.f32707o = -1;
    }

    public NetworkSettings(String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        this.f32693a = str;
        this.f32703k = str;
        this.f32694b = str2;
        this.f32708p = str3;
        this.f32709q = str4;
        this.f32696d = jSONObject2;
        this.f32697e = jSONObject3;
        this.f32698f = jSONObject4;
        this.f32699g = jSONObject5;
        this.f32695c = jSONObject;
        this.f32704l = -1;
        this.f32705m = -1;
        this.f32706n = -1;
        this.f32707o = -1;
    }

    public String getAdSourceNameForEvents() {
        return this.f32701i;
    }

    public JSONObject getApplicationSettings() {
        return this.f32695c;
    }

    public int getBannerPriority() {
        return this.f32706n;
    }

    public JSONObject getBannerSettings() {
        return this.f32698f;
    }

    public String getCustomNetwork() {
        JSONObject jSONObject = this.f32695c;
        if (jSONObject != null) {
            return jSONObject.optString("customNetwork");
        }
        return null;
    }

    public String getCustomNetworkAdapterName(IronSource.a aVar) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        if (aVar == null && (jSONObject5 = this.f32695c) != null) {
            return jSONObject5.optString(f32692t);
        }
        if (aVar.equals(IronSource.a.REWARDED_VIDEO) && (jSONObject4 = this.f32696d) != null) {
            return jSONObject4.optString(f32692t);
        }
        if (aVar.equals(IronSource.a.INTERSTITIAL) && (jSONObject3 = this.f32697e) != null) {
            return jSONObject3.optString(f32692t);
        }
        if (aVar.equals(IronSource.a.BANNER) && (jSONObject2 = this.f32698f) != null) {
            return jSONObject2.optString(f32692t);
        }
        if (!aVar.equals(IronSource.a.NATIVE_AD) || (jSONObject = this.f32699g) == null) {
            return null;
        }
        return jSONObject.optString(f32692t);
    }

    public String getCustomNetworkPackage() {
        JSONObject jSONObject = this.f32695c;
        return jSONObject != null ? jSONObject.optString(f32691s, "") : "";
    }

    public int getInstanceType(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return getRewardedVideoSettings().optInt("instanceType");
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return getInterstitialSettings().optInt("instanceType");
        }
        if (aVar == IronSource.a.BANNER) {
            return getBannerSettings().optInt("instanceType");
        }
        if (aVar == IronSource.a.NATIVE_AD) {
            return getNativeAdSettings().optInt("instanceType");
        }
        return 1;
    }

    public int getInterstitialPriority() {
        return this.f32705m;
    }

    public JSONObject getInterstitialSettings() {
        return this.f32697e;
    }

    public int getMaxAdsPerSession(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return getRewardedVideoSettings().optInt(Ne.f29925e2, 99);
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return getInterstitialSettings().optInt(Ne.f29925e2, 99);
        }
        if (aVar == IronSource.a.BANNER) {
            return getBannerSettings().optInt(Ne.f29925e2, 99);
        }
        if (aVar == IronSource.a.NATIVE_AD) {
            return getNativeAdSettings().optInt(Ne.f29925e2, 99);
        }
        return 99;
    }

    public int getNativeAdPriority() {
        return this.f32707o;
    }

    public JSONObject getNativeAdSettings() {
        return this.f32699g;
    }

    public String getProviderDefaultInstance() {
        return this.f32708p;
    }

    public String getProviderInstanceName() {
        return this.f32703k;
    }

    public String getProviderName() {
        return this.f32693a;
    }

    public String getProviderNetworkKey() {
        return this.f32709q;
    }

    public String getProviderTypeForReflection() {
        return this.f32694b;
    }

    public int getRewardedVideoPriority() {
        return this.f32704l;
    }

    public JSONObject getRewardedVideoSettings() {
        return this.f32696d;
    }

    public String getSubProviderId() {
        return this.f32700h;
    }

    public boolean isBidder(IronSource.a aVar) {
        return !isCustomNetwork() && getInstanceType(aVar) == 2;
    }

    public boolean isCustomNetwork() {
        return !TextUtils.isEmpty(getCustomNetwork());
    }

    public boolean isIronSource() {
        return getProviderTypeForReflection().equalsIgnoreCase("IronSource");
    }

    public boolean isMultipleInstances() {
        return this.f32702j;
    }

    public void setAdSourceNameForEvents(String str) {
        this.f32701i = str;
    }

    public void setApplicationSettings(JSONObject jSONObject) {
        this.f32695c = jSONObject;
    }

    public void setBannerPriority(int i10) {
        this.f32706n = i10;
    }

    public void setBannerSettings(String str, Object obj) {
        try {
            this.f32698f.put(str, obj);
        } catch (JSONException e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void setBannerSettings(JSONObject jSONObject) {
        this.f32698f = jSONObject;
    }

    public void setInterstitialPriority(int i10) {
        this.f32705m = i10;
    }

    public void setInterstitialSettings(String str, Object obj) {
        try {
            this.f32697e.put(str, obj);
        } catch (JSONException e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void setInterstitialSettings(JSONObject jSONObject) {
        this.f32697e = jSONObject;
    }

    public void setIsMultipleInstances(boolean z10) {
        this.f32702j = z10;
    }

    public void setNativeAdPriority(int i10) {
        this.f32707o = i10;
    }

    public void setNativeAdSettings(String str, Object obj) {
        try {
            this.f32699g.put(str, obj);
        } catch (JSONException e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void setNativeAdSettings(JSONObject jSONObject) {
        this.f32699g = jSONObject;
    }

    public void setProviderNetworkKey(String str) {
        this.f32709q = str;
    }

    public void setRewardedVideoPriority(int i10) {
        this.f32704l = i10;
    }

    public void setRewardedVideoSettings(String str, Object obj) {
        try {
            this.f32696d.put(str, obj);
        } catch (JSONException e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void setRewardedVideoSettings(JSONObject jSONObject) {
        this.f32696d = jSONObject;
    }

    public void setSubProviderId(String str) {
        this.f32700h = str;
    }

    public boolean shouldEarlyInit() {
        JSONObject jSONObject = this.f32695c;
        if (jSONObject != null) {
            return jSONObject.optBoolean(IronSourceConstants.EARLY_INIT_FIELD);
        }
        return false;
    }
}
