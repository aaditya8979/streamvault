package com.safedk.android.internal;

import android.os.Bundle;
import com.ironsource.V2;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class d {
    public static final String A = "imageMimeTypesList";
    public static final String B = "videoMimeTypesList";
    public static final String C = "audioMimeTypesList";
    public static final String D = "maxBannerUniformPixelsPercentageToStopSampling";
    public static final String E = "minBannerUniformPixelsPercentageForUniformImage";
    public static final String F = "maxAttemptsToCaptureBannerImage";
    public static final String G = "bannerImageSamplingInterval";
    public static final String H = "bannerDimensionsMaxSize";
    public static final String I = "isBannersEnabled";
    public static final String J = "https://edge.safedk.com";
    public static final String K = "https://edge.safedk.com";
    public static final long L = 1200000;
    public static final int M = 20;
    public static final String N = "apng;bmp;gif;x-icon;x-icon;png;svg+xml;tiff";
    public static final String O = "wave;wav;x-wav;x-pn-wav;webm;ogg;";
    private static final String P = "SafeDKConfiguration";
    private static final String Q = "settings";
    private static final String R = "android";
    private static final String S = "images";
    private static final String T = "banners";
    private static final String U = "adCaching";
    private static final String V = "general";
    private static final String W = "timers";
    private static final String X = "redirectClickTimeout";
    private static final String Y = "sdkSpecificMinUniformPixelsPercentageForUniformImage";
    private static final String Z = "sdkSpecificCachedCIMaxAge";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f52933a = 300;
    private static final int aA = 5;
    private static final int aC = 25000;
    private static final boolean aE = false;
    private static final int aG = 10000;
    private static final int aI = 15000;
    private static final int aK = 15000;
    private static final int aU = 100;
    private static final float aX = 40.0f;
    private static final float aZ = 90.0f;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private static final String f52934aa = "sdkSpecificCachedCIExpiration";

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final int f52935ab = 30000;

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private static final int f52936ac = 30000;

    /* JADX INFO: renamed from: as, reason: collision with root package name */
    private static final int f52937as = 8192;
    private static final int au = 540;
    private static final float aw = 40.0f;
    private static final float ay = 90.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f52938b = 5000;

    /* JADX INFO: renamed from: bb, reason: collision with root package name */
    private static final int f52939bb = 5;

    /* JADX INFO: renamed from: bd, reason: collision with root package name */
    private static final int f52940bd = 1;

    /* JADX INFO: renamed from: bf, reason: collision with root package name */
    private static final int f52941bf = 480;

    /* JADX INFO: renamed from: bh, reason: collision with root package name */
    private static final boolean f52942bh = true;

    /* JADX INFO: renamed from: bj, reason: collision with root package name */
    private static final boolean f52943bj = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f52944c = 500;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f52945d = "minValidImageSize";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f52946e = "interstitialDimensionsMaxSize";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f52947f = "maxUniformPixelsPercentageToStopSampling";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f52948g = "maxImagesToStoreOnDevice";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f52949h = "minImageSizeToStopSampling";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f52950i = "minUniformPixelsPercentageForUniformImage";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f52951j = "awsUploadTimeout";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f52952k = "resolveUrlTimeout";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f52953l = "clickValidityTimeout";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f52954m = "interstitialActivitiesToInclude";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f52955n = "interstitialActivitiesToExclude";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f52956o = "edgeServerUrl";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f52957p = "backupEdgeServerUrl";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f52958q = "devicesWithDebugLog";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f52959r = "cachedCreativeInfoMaxAge";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f52960s = "cachedMaxNumberOfItems";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f52961t = "cachedNumberOfItemsThreshold";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f52962u = "cacheSupportingSdkUUIDs";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f52963v = "safeDKDeactivation";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f52964w = "activePercentage";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f52965x = "deactivated";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f52966y = "alwaysTakeScreenshot";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f52967z = "disableWebViewTracking";

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private boolean f52968ad = false;

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    private int f52969ae = 300;

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    private boolean f52970af = false;

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private int f52971ag = 5000;

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    private int f52972ah = 500;

    /* JADX INFO: renamed from: ai, reason: collision with root package name */
    private int f52973ai = 30000;

    /* JADX INFO: renamed from: aj, reason: collision with root package name */
    private int f52974aj = 30000;

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    private boolean f52975ak = false;

    /* JADX INFO: renamed from: al, reason: collision with root package name */
    private boolean f52976al = true;

    /* JADX INFO: renamed from: am, reason: collision with root package name */
    private boolean f52977am = false;

    /* JADX INFO: renamed from: an, reason: collision with root package name */
    private boolean f52978an = false;

    /* JADX INFO: renamed from: ao, reason: collision with root package name */
    private JSONObject f52979ao = new JSONObject();

    /* JADX INFO: renamed from: ap, reason: collision with root package name */
    private JSONObject f52980ap = new JSONObject();

    /* JADX INFO: renamed from: aq, reason: collision with root package name */
    private ArrayList<String> f52981aq = new ArrayList<>(Arrays.asList(com.safedk.android.utils.g.f53130d, com.safedk.android.utils.g.f53128b, com.safedk.android.utils.g.f53147u, com.safedk.android.utils.g.f53152z, com.safedk.android.utils.g.f53141o));

    /* JADX INFO: renamed from: ar, reason: collision with root package name */
    private boolean f52982ar = false;

    /* JADX INFO: renamed from: at, reason: collision with root package name */
    private int f52983at = 8192;
    private int av = au;
    private float ax = 40.0f;
    private float az = 90.0f;
    private int aB = 5;
    private long aD = V2.f30587h;
    private boolean aF = false;
    private int aH = 10000;
    private int aJ = 15000;
    private int aL = 15000;
    private ArrayList<String> aM = new ArrayList<>();
    private ArrayList<String> aN = new ArrayList<>();
    private String aO = "https://edge.safedk.com";
    private String aP = "https://edge.safedk.com";
    private ArrayList<String> aQ = new ArrayList<>();
    private ArrayList<String> aR = new ArrayList<>();
    private long aS = L;
    private int aT = 20;
    private int aV = 100;
    private final boolean aW = false;
    private float aY = 40.0f;

    /* JADX INFO: renamed from: ba, reason: collision with root package name */
    private float f52984ba = 90.0f;

    /* JADX INFO: renamed from: bc, reason: collision with root package name */
    private int f52985bc = 5;

    /* JADX INFO: renamed from: be, reason: collision with root package name */
    private int f52986be = 1;

    /* JADX INFO: renamed from: bg, reason: collision with root package name */
    private int f52987bg = f52941bf;

    /* JADX INFO: renamed from: bi, reason: collision with root package name */
    private boolean f52988bi = true;

    /* JADX INFO: renamed from: bk, reason: collision with root package name */
    private boolean f52989bk = true;

    /* JADX INFO: renamed from: bl, reason: collision with root package name */
    private List<String> f52990bl = Arrays.asList(N.split(";"));

    /* JADX INFO: renamed from: bm, reason: collision with root package name */
    private List<String> f52991bm = Arrays.asList(O.split(";"));

    /* JADX INFO: renamed from: bn, reason: collision with root package name */
    private boolean f52992bn = false;

    private String a(String str) {
        if (str != null && str.length() > 0) {
            try {
                URL url = new URL(str);
                String protocol = url.getProtocol();
                String host = url.getHost();
                int port = url.getPort();
                str = port == -1 ? String.format("%s://%s", protocol, host) : String.format("%s://%s:%d", protocol, host, Integer.valueOf(port));
            } catch (MalformedURLException e10) {
                Logger.e(P, "Exception sanitizing server url:" + e10.getMessage(), e10);
            }
        }
        return str;
    }

    private void a(Bundle bundle) {
        Logger.d(P, "processSdkVersionsBundle started, bundle=" + bundle.toString());
    }

    private void a(ArrayList<String> arrayList) {
        this.f52981aq.clear();
        for (String str : arrayList) {
            Logger.d(P, "Adding cacheSupportingSDKUUID " + str + " to cacheSupportedSdk List");
            this.f52981aq.add(str);
        }
    }

    private void a(JSONObject jSONObject) throws JSONException {
        Logger.d(P, "Attempting to parse sdk specific uniformity threshold. setting : " + jSONObject);
        if (jSONObject == null) {
            Logger.d(P, "Cannot parse sdk specific uniformity setting, json is null");
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            int i10 = jSONObject.getInt(next);
            String sdkPackageByPackageUUID = SdksMapping.getSdkPackageByPackageUUID(next);
            if (sdkPackageByPackageUUID != null) {
                Logger.d(P, "Parse sdk specific uniformity threshold setting identified, UUID = " + next + ", sdkPackageName = " + sdkPackageByPackageUUID + ", value = " + i10);
                com.safedk.android.analytics.brandsafety.creatives.a aVarI = CreativeInfoManager.i(sdkPackageByPackageUUID);
                if (aVarI != null) {
                    aVarI.a(AdNetworkConfiguration.SDK_SPECIFIC_MIN_UNIFORM_PIXELS_PERCENTAGE_FOR_UNIFORM_IMAGE, i10);
                    Logger.d(P, "Parse sdk specific uniformity threshold set, UUID = " + next + ", sdkPackageName = " + sdkPackageByPackageUUID + ", value = " + i10);
                }
            }
        }
    }

    private boolean a(Double d10, String str) {
        Logger.d(P, "checkActivePercent started, activePercent=" + d10 + ", userId=" + str);
        float fA = DeviceData.a("", str);
        Logger.d(P, "checkActivePercent hashValue ==" + fA);
        return ((double) fA) <= d10.doubleValue();
    }

    public boolean A() {
        return this.f52975ak;
    }

    public boolean B() {
        return this.f52970af;
    }

    public int C() {
        return this.f52971ag;
    }

    public int D() {
        return this.f52972ah;
    }

    public JSONObject E() {
        return this.f52979ao;
    }

    public JSONObject F() {
        return this.f52980ap;
    }

    public Set<String> G() {
        return new HashSet(this.aQ);
    }

    public boolean H() {
        return this.f52977am;
    }

    public int I() {
        return this.aV;
    }

    public long J() {
        return this.aS;
    }

    public int K() {
        return this.aT;
    }

    public ArrayList<String> L() {
        return this.f52981aq;
    }

    public int a() {
        return this.f52973ai;
    }

    public void a(int i10) {
        this.f52971ag = i10;
    }

    public void a(boolean z10) {
        this.f52992bn = z10;
    }

    public boolean a(Bundle bundle, boolean z10) {
        Logger.d(P, "parseSettings started , bundle : " + (bundle == null ? "null" : bundle.toString()));
        Bundle bundle2 = bundle.getBundle("settings");
        if (bundle2 == null) {
            if (z10) {
                Logger.e(P, "Settings bundle is null, cannot parse settings. Saved settings will be used");
            }
            return false;
        }
        Logger.d(P, "parseSettings starting DEACTIVATION");
        if (bundle2.containsKey(f52963v)) {
            Bundle bundle3 = bundle2.getBundle(f52963v);
            if (bundle3.containsKey(f52965x)) {
                this.f52992bn = bundle3.getBoolean(f52965x, false);
                Logger.d(P, "parseSettings deactivated " + this.f52992bn);
            } else {
                this.f52992bn = false;
            }
            if (bundle3.containsKey(f52964w)) {
                this.aV = (int) bundle3.getDouble(f52964w, 100.0d);
                Logger.d(P, "parseSettings activePercentage " + this.aV);
            } else {
                this.aV = 100;
            }
            if (!this.f52992bn && this.aV != 100) {
                Logger.d(P, "Checking active percentage");
                this.f52992bn = !a(Double.valueOf((double) this.aV), SafeDK.getInstance().getUserId());
                Logger.d(P, "After active percentage deactivated=" + this.f52992bn);
            }
        } else {
            this.f52992bn = false;
            this.aV = 100;
            Logger.d(P, "parseSettings SAFE_DK_DEACTIVATION settings block does not exist. Default configuration values will be used.");
        }
        if (bundle2 == null || !bundle2.containsKey(S)) {
            this.f52983at = 8192;
            this.av = au;
            this.ax = 40.0f;
            this.aB = 5;
            this.aD = V2.f30587h;
            Logger.d(P, "minUniformPixelsPercentageForUniformImage set to " + this.az);
            this.aF = false;
            Logger.d(P, "parseSettings IMAGES settings block does not exist. Default configuration values will be used.");
        } else {
            Bundle bundle4 = bundle2.getBundle(S);
            Logger.d(P, "parseSettings starting IMAGES : " + bundle4.toString());
            if (bundle4.containsKey(f52945d)) {
                this.f52983at = bundle4.getInt(f52945d, 8192);
                Logger.d(P, "parseSettings minValidImageSize " + this.f52983at);
            } else {
                this.f52983at = 8192;
            }
            if (bundle4.containsKey(f52946e)) {
                this.av = bundle4.getInt(f52946e, au);
                Logger.d(P, "parseSettings interstitialDimensionsMaxSize " + this.av);
            } else {
                this.av = au;
            }
            if (bundle4.containsKey(f52947f)) {
                this.ax = (float) bundle4.getDouble(f52947f, 40.0d);
                Logger.d(P, "parseSettings maxUniformPixelsPercentageToStopSampling " + this.ax);
            } else {
                this.ax = 40.0f;
            }
            if (bundle4.containsKey(f52948g)) {
                this.aB = bundle4.getInt(f52948g, 5);
                Logger.d(P, "parseSettings maxImagesToStoreOnDevice " + this.aB);
            } else {
                this.aB = 5;
            }
            if (bundle4.containsKey(f52949h)) {
                this.aD = bundle4.getInt(f52949h, 25000);
                Logger.d(P, "parseSettings minImageSizeToStopSampling " + this.aD);
            } else {
                this.aD = V2.f30587h;
            }
            if (bundle4.containsKey(f52950i)) {
                this.az = (float) bundle4.getDouble(f52950i, 90.0d);
                Logger.d(P, "parseSettings minUniformPixelsPercentageForUniformImage " + this.az);
                CreativeInfoManager.a(AdNetworkConfiguration.SDK_SPECIFIC_MIN_UNIFORM_PIXELS_PERCENTAGE_FOR_UNIFORM_IMAGE, this.az);
            }
            if (bundle4.containsKey(f52966y)) {
                this.aF = bundle4.getBoolean(f52966y, false);
                Logger.d(P, "parseSettings alwaysTakeScreenshot " + this.aF);
            } else {
                this.aF = false;
            }
            try {
                if (bundle4.containsKey(Y)) {
                    Logger.d(P, "parseSettings sdkSpecificMinUniformPixelsPercentageForUniformImage " + bundle4.getBundle(Y));
                    Bundle bundle5 = bundle4.getBundle(Y);
                    for (String str : bundle5.keySet()) {
                        Logger.d(P, "parseSettings sdkSpecificMinUniformPixelsPercentageForUniformImage key = " + str + ", value = " + bundle5.getDouble(str));
                        double d10 = bundle5.getDouble(str);
                        String sdkPackageByPackageUUID = SdksMapping.getSdkPackageByPackageUUID(str);
                        if (sdkPackageByPackageUUID != null) {
                            Logger.d(P, "parseSettings sdkSpecificMinUniformPixelsPercentageForUniformImage identified UUID = " + str + ", sdkPackageName = " + sdkPackageByPackageUUID + ", value = " + d10);
                            com.safedk.android.analytics.brandsafety.creatives.a aVarI = CreativeInfoManager.i(sdkPackageByPackageUUID);
                            if (aVarI != null) {
                                aVarI.a(AdNetworkConfiguration.SDK_SPECIFIC_MIN_UNIFORM_PIXELS_PERCENTAGE_FOR_UNIFORM_IMAGE, (float) d10);
                                Logger.d(P, "parseSettings sdkSpecificMinUniformPixelsPercentageForUniformImage UUID = " + str + ", sdkPackageName = " + sdkPackageByPackageUUID + ", value = " + ((float) d10));
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                Logger.d(P, "parseSettings sdkSpecificMinUniformPixelsPercentageForUniformImage Exception : " + th2.getMessage(), th2);
            }
        }
        Logger.d(P, "parseSettings starting BANNERS");
        if (bundle2 == null || !bundle2.containsKey(T)) {
            this.aY = 40.0f;
            this.f52984ba = 90.0f;
            this.f52985bc = 5;
            this.f52986be = 1;
            this.f52987bg = f52941bf;
            this.f52988bi = true;
            Logger.d(P, "parseSettings BANNERS settings block does not exist. Default configuration values will be used.");
        } else {
            Bundle bundle6 = bundle2.getBundle(T);
            if (bundle6.containsKey(D)) {
                this.aY = (float) bundle6.getDouble(D, 40.0d);
                Logger.d(P, "parseSettings maxBannerUniformPixelsPercentageToStopSampling " + this.aY);
            } else {
                this.aY = 40.0f;
            }
            if (bundle6.containsKey(E)) {
                this.f52984ba = (float) bundle6.getDouble(E, 90.0d);
                Logger.d(P, "parseSettings minBannerUniformPixelsPercentageForUniformImage " + this.f52984ba);
            } else {
                this.f52984ba = 90.0f;
            }
            if (bundle6.containsKey(F)) {
                this.f52985bc = bundle6.getInt(F, 5);
                Logger.d(P, "parseSettings maxAttemptsToCaptureBannerImage " + this.f52985bc);
            } else {
                this.f52985bc = 5;
            }
            if (bundle6.containsKey(G)) {
                this.f52986be = bundle6.getInt(G, 1);
                Logger.d(P, "parseSettings bannerImageSamplingInterval " + this.f52986be);
            } else {
                this.f52986be = 1;
            }
            if (bundle6.containsKey(H)) {
                this.f52987bg = bundle6.getInt(H, f52941bf);
                Logger.d(P, "parseSettings bannerDimensionsMaxSize " + this.f52987bg);
            } else {
                this.f52987bg = f52941bf;
            }
            if (bundle6.containsKey(I)) {
                this.f52988bi = bundle6.getBoolean(I, true);
                Logger.d(P, "parseSettings bannerIsEnabled " + this.f52988bi);
            } else {
                this.f52988bi = true;
            }
        }
        Logger.d(P, "parseSettings starting TIMERS");
        if (bundle2.containsKey(W)) {
            Bundle bundle7 = bundle2.getBundle(W);
            if (bundle7.containsKey(f52951j)) {
                this.aH = (int) bundle7.getDouble(f52951j, 10000.0d);
                if (z10) {
                    this.aH *= 1000;
                }
                Logger.d(P, "parseSettings awsUploadTimeout (ms) " + this.aH);
            } else {
                this.aH = 10000;
            }
            if (bundle7.containsKey(f52952k)) {
                this.aJ = (int) bundle7.getDouble(f52952k, 15000.0d);
                if (z10) {
                    this.aJ *= 1000;
                }
                Logger.d(P, "parseSettings resolveUrlTimeout (ms) " + this.aJ);
            } else {
                this.aJ = 15000;
            }
            if (bundle7.containsKey(f52953l)) {
                this.aL = ((int) bundle7.getDouble(f52953l, 15000.0d)) * 1000;
                if (z10) {
                    this.aL *= 1000;
                }
                Logger.d(P, "parseSettings clickValidityTimeout (ms) " + this.aL);
            } else {
                this.aL = 15000;
            }
            if (bundle7.containsKey(X)) {
                this.f52973ai = bundle7.getInt(X, 30) * 1000;
                Logger.d(P, "parseSettings redirectClickTimeout (ms) value is " + this.f52973ai + ", isFromServer=" + z10);
            } else {
                this.f52973ai = 30000;
            }
        } else {
            this.aH = 10000;
            this.aJ = 15000;
            this.aL = 15000;
            this.f52973ai = 30000;
            Logger.d(P, "parseSettings TIMERS settings block does not exist. Default configuration values will be used.");
        }
        Logger.d(P, "parseSettings starting ANDROID");
        if (bundle2.containsKey("android")) {
            Bundle bundle8 = bundle2.getBundle("android");
            if (bundle8.containsKey(f52954m)) {
                this.aM = bundle8.getStringArrayList(f52954m);
                Logger.d(P, "parseSettings interstitialActivitiesToInclude " + this.aM);
            }
            if (bundle8.containsKey(f52955n)) {
                this.aN = bundle8.getStringArrayList(f52955n);
                Logger.d(P, "parseSettings interstitialActivitiesToExclude " + this.aN);
            }
            if ((this.aM != null && this.aM.size() > 0) || (this.aN != null && this.aN.size() > 0)) {
                Iterator<String> it = this.aM.iterator();
                while (it.hasNext()) {
                    BrandSafetyUtils.j(it.next());
                }
                Iterator<String> it2 = this.aN.iterator();
                while (it2.hasNext()) {
                    BrandSafetyUtils.k(it2.next());
                }
            }
            if (bundle8.containsKey(f52967z)) {
                this.f52982ar = bundle8.getBoolean(f52967z, false);
                Logger.d(P, "parseSettings disableWebViewTracking " + this.f52982ar);
            }
        } else {
            Logger.d(P, "parseSettings ANDROID settings block does not exist. Default configuration values will be used.");
        }
        Logger.d(P, "parseSettings starting GENERAL");
        if (bundle2.containsKey(V)) {
            Bundle bundle9 = bundle2.getBundle(V);
            if (bundle9.containsKey(f52956o)) {
                this.aO = bundle9.getString(f52956o, "https://edge.safedk.com");
                this.aO = a(this.aO);
                Logger.d(P, "parseSettings edgeServerUrl " + this.aO);
            } else {
                this.aO = "https://edge.safedk.com";
            }
            if (bundle9.containsKey(f52957p)) {
                this.aP = bundle9.getString(f52957p, "https://edge.safedk.com");
                this.aP = a(this.aP);
                Logger.d(P, "parseSettings backupEdgeServerUrl " + this.aP);
            } else {
                this.aP = "https://edge.safedk.com";
            }
            AppLovinBridge.receiveEdgeUrls(this.aO, this.aP);
            if (bundle9.containsKey(f52958q)) {
                this.aQ = bundle9.getStringArrayList(f52958q);
                Logger.d(P, "parseSettings devicesWithDebugLog " + this.aQ);
            }
        } else {
            Logger.d(P, "parseSettings GENERAL settings block does not exist. Default configuration values will be used.");
        }
        Logger.d(P, "parseSettings starting Ad CACHING");
        if (bundle2.containsKey(U)) {
            Bundle bundle10 = bundle2.getBundle(U);
            if (bundle10.containsKey(f52959r)) {
                this.aS = (int) bundle10.getDouble(f52959r, 1200000.0d);
                Logger.d(P, "parseSettings cachedCreativeInfoMaxAge " + this.aS);
            } else {
                this.aS = L;
            }
            CreativeInfoManager.a(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_MAX_AGE, this.aS);
            if (bundle10.containsKey(f52960s)) {
                this.aT = bundle10.getInt(f52960s);
                Logger.d(P, "parseSettings cachedMaxNumberOfItems " + this.aT);
            } else {
                this.aT = 20;
            }
            if (bundle10.containsKey(f52962u)) {
                this.aR = bundle10.getStringArrayList(f52962u);
                Logger.d(P, "parseSettings cacheSupportingSdkUUIDs " + this.aR);
            }
            if (this.aR != null && this.aR.size() > 0) {
                a(this.aR);
            }
            try {
                if (bundle10.containsKey(Z)) {
                    Logger.d(P, "parseSettings sdkSpecificCachedCIMaxAge " + bundle10.getBundle(Z));
                    Bundle bundle11 = bundle10.getBundle(Z);
                    for (String str2 : bundle11.keySet()) {
                        Logger.d(P, "parseSettings sdkSpecificCachedCIMaxAge key = " + str2 + ", value = " + bundle11.getDouble(str2));
                        long j10 = (long) bundle11.getDouble(str2);
                        String sdkPackageByPackageUUID2 = SdksMapping.getSdkPackageByPackageUUID(str2);
                        if (sdkPackageByPackageUUID2 != null) {
                            Logger.d(P, "parseSettings sdkSpecificCachedCIMaxAge identified UUID = " + str2 + ", sdkPackageName = " + sdkPackageByPackageUUID2 + ", value = " + j10);
                            com.safedk.android.analytics.brandsafety.creatives.a aVarI2 = CreativeInfoManager.i(sdkPackageByPackageUUID2);
                            if (aVarI2 != null) {
                                aVarI2.a(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_MAX_AGE, j10);
                                Logger.d(P, "parseSettings sdkSpecificCachedCIMaxAge UUID = " + str2 + ", sdkPackageName = " + sdkPackageByPackageUUID2 + ", value = " + j10);
                            }
                        }
                    }
                }
            } catch (Throwable th3) {
                Logger.d(P, "parseSettings sdkSpecificCachedCreativeInfoMaxAge Exception : " + th3.getMessage(), th3);
            }
            try {
                if (bundle10.containsKey(f52934aa)) {
                    Logger.d(P, "parseSettings sdkSpecificCachedCreativeInfoMaxAge " + bundle10.getBundle(f52934aa));
                    Bundle bundle12 = bundle10.getBundle(f52934aa);
                    for (String str3 : bundle12.keySet()) {
                        Logger.d(P, "parseSettings sdkSpecificCachedCIExpirationBundle key = " + str3 + ", value = " + bundle12.getBoolean(str3));
                        boolean z11 = bundle12.getBoolean(str3);
                        String sdkPackageByPackageUUID3 = SdksMapping.getSdkPackageByPackageUUID(str3);
                        if (sdkPackageByPackageUUID3 != null) {
                            Logger.d(P, "parseSettings sdkSpecificCachedCIExpirationBundle identified UUID = " + str3 + ", sdkPackageName = " + sdkPackageByPackageUUID3 + ", value = " + z11);
                            com.safedk.android.analytics.brandsafety.creatives.a aVarI3 = CreativeInfoManager.i(sdkPackageByPackageUUID3);
                            if (aVarI3 != null) {
                                aVarI3.b(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_EXPIRATION, z11);
                                Logger.d(P, "parseSettings sdkSpecificCachedCIExpirationBundle UUID = " + str3 + ", sdkPackageName = " + sdkPackageByPackageUUID3 + ", value = " + z11);
                            }
                        }
                    }
                }
            } catch (Throwable th4) {
                Logger.d(P, "parseSettings sdkSpecificCachedCIExpirationBundle Exception : " + th4.getMessage(), th4);
            }
        } else {
            this.aS = L;
            this.aT = 20;
            Logger.d(P, "parseSettings AD_CACHING settings block does not exist. Default configuration values will be used.");
        }
        return true;
    }

    public int b() {
        return this.f52974aj;
    }

    public void b(int i10) {
        this.f52972ah = i10;
    }

    public void b(boolean z10) {
        this.f52968ad = z10;
    }

    public boolean c() {
        return this.f52982ar;
    }

    public int d() {
        return this.f52983at;
    }

    public int e() {
        return this.av;
    }

    public float f() {
        return this.ax;
    }

    public float g() {
        return this.az;
    }

    public boolean h() {
        return this.aF;
    }

    public int i() {
        return this.aB;
    }

    public long j() {
        return this.aD;
    }

    public int k() {
        return this.aH;
    }

    public int l() {
        return this.aJ;
    }

    public int m() {
        return this.aL;
    }

    public float n() {
        return this.aY;
    }

    public float o() {
        return this.f52984ba;
    }

    public int p() {
        return this.f52985bc;
    }

    public int q() {
        return this.f52986be;
    }

    public int r() {
        return this.f52987bg;
    }

    public boolean s() {
        return this.f52988bi;
    }

    public boolean t() {
        return this.f52989bk;
    }

    public List<String> u() {
        return this.f52990bl;
    }

    public List<String> v() {
        return this.f52991bm;
    }

    public boolean w() {
        return this.f52978an;
    }

    public boolean x() {
        return !this.f52992bn;
    }

    public boolean y() {
        return this.f52968ad;
    }

    public int z() {
        return this.f52969ae;
    }
}
