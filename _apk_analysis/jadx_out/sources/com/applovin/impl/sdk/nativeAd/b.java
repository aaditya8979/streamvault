package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.d6;
import com.applovin.impl.h6;
import com.applovin.impl.i5;
import com.applovin.impl.n7;
import com.applovin.impl.o7;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.nativeAd.a;
import com.applovin.impl.sdk.network.e;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class b extends i5 implements a.InterfaceC0155a, AppLovinAdLoadListener {
    private final List A;
    private final List B;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final JSONObject f10209g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final JSONObject f10210h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f10211i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f10212j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f10213k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f10214l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Double f10215m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f10216n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Uri f10217o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Uri f10218p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private o7 f10219q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Uri f10220r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Uri f10221s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Uri f10222t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Uri f10223u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final List f10224v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final List f10225w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final List f10226x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final List f10227y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final List f10228z;

    public b(JSONObject jSONObject, JSONObject jSONObject2, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskRenderNativeAd", kVar);
        this.f10212j = "";
        this.f10213k = "";
        this.f10214l = "";
        this.f10215m = null;
        this.f10216n = "";
        this.f10217o = null;
        this.f10218p = null;
        this.f10220r = null;
        this.f10221s = null;
        this.f10222t = null;
        this.f10223u = null;
        this.f10224v = new ArrayList();
        this.f10225w = new ArrayList();
        this.f10226x = new ArrayList();
        this.f10227y = new ArrayList();
        this.f10228z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.f10209g = jSONObject;
        this.f10210h = jSONObject2;
        this.f10211i = appLovinNativeAdLoadListener;
    }

    private void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String string = JsonUtils.getString(jSONObject, "url", null);
        if (StringUtils.isValidString(string)) {
            this.f10222t = Uri.parse(string);
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.a(this.f8506b, "Processed click destination URL: " + this.f10222t);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "fallback", null);
        if (StringUtils.isValidString(string2)) {
            this.f10223u = Uri.parse(string2);
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.a(this.f8506b, "Processed click destination backup URL: " + this.f10223u);
            }
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "clicktrackers", null);
        if (jSONArray != null) {
            if (!JsonUtils.getBoolean(this.f10209g, "use_requests_for_native_ad_click_postbacks", (Boolean) this.f8505a.a(x4.O2)).booleanValue()) {
                try {
                    this.f10224v.addAll(JsonUtils.toList(jSONArray));
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f8507c.a(this.f8506b, "Processed click tracking URLs: " + this.f10224v);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f8507c.a(this.f8506b, "Failed to render click tracking URLs", th2);
                        return;
                    }
                    return;
                }
            }
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray, i10, null);
                if (objectAtIndex instanceof String) {
                    String str = (String) objectAtIndex;
                    if (!TextUtils.isEmpty(str)) {
                        this.f10226x.add(new e.a(this.f8505a).b(str).b(false).a(false).h(f()).a());
                    }
                }
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.a(this.f8506b, "Processed click tracking requests: " + this.f10226x);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.a(this.f8506b, "Preparing native ad view components...");
        }
        try {
            appLovinNativeAdImpl.setUpNativeAdViewComponents();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.a(this.f8506b, "Successfully prepared native ad view components");
            }
            appLovinNativeAdImpl.getAdEventTracker().h();
            this.f10211i.onNativeAdLoaded(appLovinNativeAdImpl);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.a(this.f8506b, "Failed to prepare native ad view components", th2);
            }
            b(th2.getMessage());
            this.f8505a.D().a(this.f8506b, "prepareNativeComponents", th2);
        }
    }

    private void b(String str) {
        this.f10211i.onNativeAdLoadFailed(new AppLovinError(-6, str));
    }

    private void c(final AppLovinNativeAdImpl appLovinNativeAdImpl) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.nativeAd.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f10242b.b(appLovinNativeAdImpl);
            }
        });
    }

    private void e() {
        AppLovinNativeAdImpl appLovinNativeAdImplBuild = new AppLovinNativeAdImpl.Builder(JsonUtils.shallowCopy(this.f10209g), JsonUtils.shallowCopy(this.f10210h), this.f8505a).setTitle(this.f10212j).setAdvertiser(this.f10213k).setBody(this.f10214l).setCallToAction(this.f10216n).setStarRating(this.f10215m).setIconUri(this.f10217o).setMainImageUri(this.f10218p).setPrivacyIconUri(this.f10220r).setVastAd(this.f10219q).setPrivacyDestinationUri(this.f10221s).setClickDestinationUri(this.f10222t).setClickDestinationBackupUri(this.f10223u).setClickTrackingUrls(this.f10224v).setJsTrackers(this.f10225w).setClickTrackingRequests(this.f10226x).setImpressionRequests(this.f10227y).setViewableMRC50Requests(this.f10228z).setViewableMRC100Requests(this.A).setViewableVideo50Requests(this.B).build();
        appLovinNativeAdImplBuild.getAdEventTracker().e();
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.a(this.f8506b, "Starting cache task for type: " + appLovinNativeAdImplBuild.getType() + "...");
        }
        this.f8505a.q0().a((i5) new a(appLovinNativeAdImplBuild, this.f8505a, this), d6.b.CORE);
    }

    private boolean f() {
        return JsonUtils.getBoolean(this.f10209g, "fire_native_ad_postbacks_from_webview", (Boolean) this.f8505a.a(x4.N2)).booleanValue();
    }

    @Override // com.applovin.impl.sdk.nativeAd.a.InterfaceC0155a
    public void a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.a(this.f8506b, "Successfully cached and loaded ad");
        }
        c(appLovinNativeAdImpl);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.a(this.f8506b, "VAST ad rendered successfully");
        }
        this.f10219q = (o7) appLovinAd;
        e();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i10) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.b(this.f8506b, "VAST ad failed to render");
        }
        e();
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.String, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.String, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // java.lang.Runnable
    public void run() {
        ?? r32 = 0;
        String string = JsonUtils.getString(this.f10209g, "privacy_icon_url", null);
        if (URLUtil.isValidUrl(string)) {
            this.f10220r = Uri.parse(string);
        }
        String string2 = JsonUtils.getString(this.f10209g, CampaignEx.JSON_KEY_PRIVACY_URL, null);
        if (URLUtil.isValidUrl(string2)) {
            this.f10221s = Uri.parse(string2);
        }
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f10209g, "ortb_response", (JSONObject) null);
        if (jSONObject == null || jSONObject.length() == 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.b(this.f8506b, "No oRtb response provided: " + this.f10209g);
            }
            b("No oRtb response provided");
            return;
        }
        String string3 = JsonUtils.getString(jSONObject, "version", null);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "value", (JSONObject) null);
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.a(this.f8506b, "Rendering native ad for oRTB version: " + string3);
        }
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "native", jSONObject2);
        a(JsonUtils.getJSONObject(jSONObject3, "link", (JSONObject) null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject3, "assets", null);
        if (jSONArray == null || jSONArray.length() == 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.b(this.f8506b, "Unable to retrieve assets - failing ad load: " + this.f10209g);
            }
            b("Unable to retrieve assets");
            return;
        }
        String str = "";
        int i10 = 0;
        while (i10 < jSONArray.length()) {
            JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) r32);
            if (jSONObject4.has("title")) {
                this.f10212j = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "title", (JSONObject) r32), "text", r32);
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8507c.a(this.f8506b, "Processed title: " + this.f10212j);
                }
            } else if (jSONObject4.has("link")) {
                a(JsonUtils.getJSONObject(jSONObject4, "link", (JSONObject) r32));
            } else if (jSONObject4.has(ImpressionLog.f51750t)) {
                int i11 = JsonUtils.getInt(jSONObject4, "id", -1);
                JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONObject4, ImpressionLog.f51750t, (JSONObject) r32);
                int i12 = JsonUtils.getInt(jSONObject5, "type", -1);
                String string4 = JsonUtils.getString(jSONObject5, "url", r32);
                if (i12 == 1 || 3 == i11) {
                    this.f10217o = Uri.parse(string4);
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f8507c.a(this.f8506b, "Processed icon URL: " + this.f10217o);
                    }
                } else if (i12 == 3 || 2 == i11) {
                    this.f10218p = Uri.parse(string4);
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f8507c.a(this.f8506b, "Processed main image URL: " + this.f10218p);
                    }
                } else {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f8507c.k(this.f8506b, "Unrecognized image: " + jSONObject4);
                    }
                    int i13 = JsonUtils.getInt(jSONObject5, "w", -1);
                    int i14 = JsonUtils.getInt(jSONObject5, "h", -1);
                    if (i13 <= 0 || i14 <= 0) {
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f8507c.k(this.f8506b, "Skipping...");
                        }
                    } else if (i13 / i14 > 1.0d) {
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f8507c.a(this.f8506b, "Inferring main image from " + i13 + VastAttributes.HORIZONTAL_POSITION + i14 + "...");
                        }
                        this.f10218p = Uri.parse(string4);
                    } else {
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f8507c.a(this.f8506b, "Inferring icon image from " + i13 + VastAttributes.HORIZONTAL_POSITION + i14 + "...");
                        }
                        this.f10217o = Uri.parse(string4);
                    }
                }
            } else if (jSONObject4.has("video")) {
                String string5 = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "video", (JSONObject) null), "vasttag", null);
                if (StringUtils.isValidString(string5)) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f8507c.a(this.f8506b, "Processed VAST video");
                    }
                } else if (com.applovin.impl.sdk.o.a()) {
                    this.f8507c.k(this.f8506b, "Ignoring invalid \"vasttag\" for video: " + jSONObject4);
                }
                str = string5;
            } else if (jSONObject4.has("data")) {
                int i15 = JsonUtils.getInt(jSONObject4, "id", -1);
                JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject4, "data", (JSONObject) null);
                int i16 = JsonUtils.getInt(jSONObject6, "type", -1);
                String string6 = JsonUtils.getString(jSONObject6, "value", null);
                if (i16 == 1 || i15 == 8) {
                    this.f10213k = string6;
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f8507c.a(this.f8506b, "Processed advertiser: " + this.f10213k);
                    }
                } else if (i16 == 2 || i15 == 4) {
                    this.f10214l = string6;
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f8507c.a(this.f8506b, "Processed body: " + this.f10214l);
                    }
                } else if (i16 == 12 || i15 == 5) {
                    this.f10216n = string6;
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f8507c.a(this.f8506b, "Processed cta: " + this.f10216n);
                    }
                } else if (i16 == 3 || i15 == 6) {
                    double dA = n7.a(string6, -1.0d);
                    if (dA != -1.0d) {
                        this.f10215m = Double.valueOf(dA);
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f8507c.a(this.f8506b, "Processed star rating: " + this.f10215m);
                        }
                    } else if (com.applovin.impl.sdk.o.a()) {
                        this.f8507c.a(this.f8506b, "Received invalid star rating: " + string6);
                    }
                } else if (com.applovin.impl.sdk.o.a()) {
                    this.f8507c.k(this.f8506b, "Skipping unsupported data: " + jSONObject4);
                }
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.b(this.f8506b, "Unsupported asset object: " + jSONObject4);
            }
            i10++;
            r32 = 0;
        }
        String string7 = JsonUtils.getString(jSONObject3, "jstracker", null);
        if (StringUtils.isValidString(string7)) {
            this.f10225w.add(string7);
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.a(this.f8506b, "Processed jstracker: " + string7);
            }
        }
        Object obj = null;
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject3, "imptrackers", null);
        if (jSONArray2 != null) {
            int i17 = 0;
            while (i17 < jSONArray2.length()) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray2, i17, obj);
                if (objectAtIndex instanceof String) {
                    String str2 = (String) objectAtIndex;
                    if (!TextUtils.isEmpty(str2)) {
                        this.f10227y.add(new e.a(this.f8505a).b(str2).b(false).a(false).h(f()).a());
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f8507c.a(this.f8506b, "Processed imptracker URL: " + str2);
                        }
                    }
                }
                i17++;
                obj = null;
            }
        }
        ?? r33 = 0;
        JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject3, "eventtrackers", null);
        if (jSONArray3 != null) {
            int i18 = 0;
            while (i18 < jSONArray3.length()) {
                JSONObject jSONObject7 = JsonUtils.getJSONObject(jSONArray3, i18, (JSONObject) r33);
                int i19 = JsonUtils.getInt(jSONObject7, "event", -1);
                int i20 = JsonUtils.getInt(jSONObject7, "method", -1);
                String string8 = JsonUtils.getString(jSONObject7, "url", r33);
                if (!TextUtils.isEmpty(string8)) {
                    if (i20 == 1 || i20 == 2) {
                        if (i20 == 2 && string8.startsWith("<script")) {
                            this.f10225w.add(string8);
                        } else {
                            com.applovin.impl.sdk.network.e eVarA = new e.a(this.f8505a).b(string8).b(false).a(false).h(f() || i20 == 2).a();
                            if (i19 == 1) {
                                this.f10227y.add(eVarA);
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f8507c.a(this.f8506b, "Processed impression URL: " + string8);
                                }
                            } else if (i19 == 2) {
                                this.f10228z.add(eVarA);
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f8507c.a(this.f8506b, "Processed viewable MRC50 URL: " + string8);
                                }
                            } else if (i19 == 3) {
                                this.A.add(eVarA);
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f8507c.a(this.f8506b, "Processed viewable MRC100 URL: " + string8);
                                }
                            } else if (i19 == 4) {
                                this.B.add(eVarA);
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f8507c.a(this.f8506b, "Processed viewable video 50 URL: " + string8);
                                }
                            } else if (i19 == 555) {
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f8507c.a(this.f8506b, "Ignoring processing of OMID URL: " + string8);
                                }
                            } else if (com.applovin.impl.sdk.o.a()) {
                                this.f8507c.b(this.f8506b, "Unsupported event tracker: " + jSONObject7);
                            }
                        }
                    } else if (com.applovin.impl.sdk.o.a()) {
                        this.f8507c.b(this.f8506b, "Unsupported method for event tracker: " + jSONObject7);
                    }
                }
                i18++;
                r33 = 0;
            }
        }
        if (!StringUtils.isValidString(str)) {
            e();
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.a(this.f8506b, "Processing VAST video...");
        }
        this.f8505a.q0().a(h6.a(str, JsonUtils.shallowCopy(this.f10209g), JsonUtils.shallowCopy(this.f10210h), this, this.f8505a));
    }
}
