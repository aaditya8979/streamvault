package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.P7;
import com.ironsource.T3;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class Ne {
    public static final boolean A = false;
    public static final String A0 = "waitUntilAllProvidersFinishInit";
    public static final String A1 = "providerNetworkKey";
    public static final int B = 60;
    public static final String B0 = "sharedManagersThread";
    public static final String B1 = "spId";
    public static final int C = 10000;
    public static final String C0 = "parallelLoad";
    public static final String C1 = "mpis";
    public static final int D = 10000;
    public static final String D0 = "bidderExclusive";
    public static final String D1 = "auction";
    public static final int E = -1;
    public static final String E0 = "adapterTimeOutInSeconds";
    public static final String E1 = "auctionData";
    public static final int F = 5000;
    public static final String F0 = "atim";
    public static final String F1 = "auctioneerURL";
    public static final int G = 3;
    public static final String G0 = "bannerInterval";
    public static final String G1 = "extAuctioneerURL";
    public static final int H = 3;
    public static final String H0 = "isOneFlow";
    public static final String H1 = "objectPerWaterfall";
    public static final int I = 3;
    public static final String I0 = "expiredDurationInMinutes";
    public static final String I1 = "minTimeBeforeFirstAuction";
    public static final int J = 0;
    public static final String J0 = "server";
    public static final String J1 = "timeToWaitBeforeAuction";
    public static final int K = 2;
    public static final String K0 = "publisher";
    public static final String K1 = "timeToWaitBeforeLoad";
    public static final int L = 15;
    public static final String L0 = "console";
    public static final String L1 = "auctionRetryInterval";
    public static final long M = 10000;
    public static final String M0 = "sendUltraEvents";
    public static final String M1 = "isLoadWhileShow";
    public static final long N = 3000;
    public static final String N0 = "sendEventsToggle";
    public static final String N1 = "auctionTrials";
    public static final boolean O = false;
    public static final String O0 = "eventsCompression";
    public static final String O1 = "auctionTimeout";
    public static final boolean P = false;
    public static final String P0 = "eventsCompressionLevel";
    public static final String P1 = "auctionSavedHistory";
    public static final int Q = 30000;
    public static final String Q0 = "serverEventsURL";
    public static final String Q1 = "disableLoadWhileShowSupportFor";
    public static final int R = -1;
    public static final String R0 = "serverEventsType";
    public static final String R1 = "tokenPerAdapter";
    public static final int S = 5000;
    public static final String S0 = "backupThreshold";
    public static final String S1 = "enableAuctionFallback";
    public static final int T = 1;
    public static final String T0 = "maxNumberOfEvents";
    public static final String T1 = "timeToDeleteOldWaterfallAfterAuction";
    public static final boolean U = false;
    public static final String U0 = "maxEventsPerBatch";
    public static final String U1 = "compressAuctionRequest";
    public static final int V = 15000;
    public static final String V0 = "optOut";
    public static final String V1 = "compressAuctionResponse";
    public static final int W = 15000;
    public static final String W0 = "optIn";
    public static final String W1 = "encryptionVersion";
    public static final String X = "providerOrder";
    public static final String X0 = "triggerEvents";
    public static final String X1 = "shouldSendBannerBURLFromImpression";
    public static final String Y = "providerSettings";
    public static final String Y0 = "nonConnectivityEvents";
    public static final String Y1 = "impressionTimeout";
    public static final String Z = "configurations";
    public static final String Z0 = "shouldSendPublisherLogsOnUIThread";
    public static final String Z1 = "optInKeys";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f29911a0 = "genericParams";

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final String f29912a1 = "pixel";

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public static final String f29913a2 = "tokenGenericParams";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f29914b0 = "adUnits";

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final String f29915b1 = "pixelEventsUrl";

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public static final String f29916b2 = "compressToken";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f29917c0 = "providerLoadName";

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final String f29918c1 = "pixelEventsEnabled";

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public static final String f29919c2 = "compressExternalToken";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f29920d0 = "application";

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final String f29921d1 = "placements";

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    public static final String f29922d2 = "instanceType";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final String f29923e0 = "rewardedVideo";

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final String f29924e1 = "placementId";

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public static final String f29925e2 = "maxAdsPerSession";

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final String f29926f0 = "interstitial";

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final String f29927f1 = "placementName";

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    public static final String f29928f2 = "reward";

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final String f29929g0 = "banner";

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final String f29930g1 = "delivery";

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    public static final String f29931g2 = "name";

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final String f29932h0 = "nativeAd";

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final String f29933h1 = "isDefault";

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    public static final String f29934h2 = "amount";

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final String f29935i0 = "integration";

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final String f29936i1 = "capping";

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public static final String f29937i2 = "bannerRefreshRate";

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final String f29938j0 = "loggers";

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final String f29939j1 = "pacing";

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    public static final String f29940j2 = "protocolVersion";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final String f29941k0 = "segment";

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final String f29942k1 = "enabled";

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    public static final String f29943k2 = "adFormats";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f29944l = "appKey";

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final String f29945l0 = "events";

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final String f29946l1 = "maxImpressions";

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    public static final String f29947l2 = "adUnits";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f29948m = "userId";

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final String f29949m0 = "crashReporter";

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final String f29950m1 = "numOfSeconds";

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    public static final String f29951m2 = "rewarded";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f29952n = "response";

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final String f29953n0 = "token";

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final String f29954n1 = "unit";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f29955o = "error";

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final String f29956o0 = "external";

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final String f29957o1 = "virtualItemName";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f29958p = 3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final String f29959p0 = "mediationTypes";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final String f29960p1 = "virtualItemCount";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final boolean f29961q = false;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final String f29962q0 = "providerDefaultInstance";

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final String f29963q1 = "uuidEnabled";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final boolean f29964r = true;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final String f29965r0 = "testSuite";

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final String f29966r1 = "abt";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final boolean f29967s = true;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final String f29968s0 = "controllerUrl";

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final String f29969s1 = "delayLoadFailure";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f29970t = 2;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final String f29971t0 = "AdQuality";

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final String f29972t1 = "keysToInclude";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f29973u = 2;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final String f29974u0 = "initMode";

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final String f29975u1 = "reporterURL";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f29976v = 1;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final String f29977v0 = "adq_init_blob";

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public static final String f29978v1 = "reporterKeyword";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f29979w = 1;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final String f29980w0 = "settings";

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public static final String f29981w1 = "includeANR";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final boolean f29982x = true;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final String f29983x0 = "collectBiddingDataTimeout";

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final String f29984x1 = "timeout";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final boolean f29985y = false;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final String f29986y0 = "providers";

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final String f29987y1 = "setIgnoreDebugger";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final boolean f29988z = false;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final String f29989z0 = "parallelInit";

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public static final String f29990z1 = "adSourceName";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C4373zd f29991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Cd f29992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private T3 f29993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f29994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f29995e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private JSONObject f29996f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Context f29997g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f29998h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private P7.a f29999i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f30000j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Q5 f30001k;

    public enum a {
        NOT_SET("0"),
        CACHE("1"),
        SERVER("2");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f30006a;

        a(String str) {
            this.f30006a = str;
        }

        public String b() {
            return this.f30006a;
        }
    }

    public Ne(Context context, String str, String str2, String str3) {
        this.f29998h = a.NOT_SET;
        this.f30000j = false;
        this.f29997g = context;
        this.f29999i = Lb.O().x();
        try {
            if (TextUtils.isEmpty(str3)) {
                this.f29996f = IronSourceVideoBridge.jsonObjectInit();
            } else {
                this.f29996f = IronSourceVideoBridge.jsonObjectInit(str3);
            }
            this.f30000j = o();
            t();
            r();
            s();
            this.f29994d = TextUtils.isEmpty(str) ? "" : str;
            this.f29995e = TextUtils.isEmpty(str2) ? "" : str2;
            b(this.f29996f);
        } catch (JSONException e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            a();
        }
    }

    public Ne(Ne ne2) {
        this.f29998h = a.NOT_SET;
        this.f30000j = false;
        try {
            this.f29997g = ne2.d();
            this.f29996f = IronSourceVideoBridge.jsonObjectInit(ne2.f29996f.toString());
            this.f29994d = ne2.f29994d;
            this.f29995e = ne2.f29995e;
            this.f30000j = ne2.f30000j;
            this.f29991a = ne2.k();
            this.f29992b = ne2.l();
            this.f29993c = ne2.c();
            this.f29998h = ne2.i();
            this.f29999i = Lb.O().x();
            b(this.f29996f);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            a();
        }
    }

    private int a(JSONObject jSONObject, JSONObject jSONObject2, String str, int i10) {
        int iOptInt = 0;
        if (jSONObject.has(str)) {
            iOptInt = jSONObject.optInt(str, 0);
        } else if (jSONObject2.has(str)) {
            iOptInt = jSONObject2.optInt(str, 0);
        }
        return iOptInt == 0 ? i10 : iOptInt;
    }

    private long a(JSONObject jSONObject, JSONObject jSONObject2, String str, long j10) {
        long jOptLong = jSONObject.has(str) ? jSONObject.optLong(str, 0L) : jSONObject2.has(str) ? jSONObject2.optLong(str, 0L) : 0L;
        return jOptLong == 0 ? j10 : jOptLong;
    }

    private H1 a(JSONObject jSONObject, Boolean bool) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        boolean zOptBoolean = jSONObject.optBoolean("sendEventsToggle", false);
        boolean zOptBoolean2 = jSONObject.optBoolean("eventsCompression", false);
        int iOptInt = jSONObject.optInt("eventsCompressionLevel", -1);
        String strOptString = jSONObject.optString("serverEventsURL", "");
        String strOptString2 = jSONObject.optString("serverEventsType", "");
        int iOptInt2 = jSONObject.optInt("backupThreshold", -1);
        int iOptInt3 = jSONObject.optInt("maxNumberOfEvents", -1);
        int iOptInt4 = jSONObject.optInt("maxEventsPerBatch", 5000);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("optOut");
        if (jSONArrayOptJSONArray != null) {
            int[] iArr5 = new int[jSONArrayOptJSONArray.length()];
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                iArr5[i10] = jSONArrayOptJSONArray.optInt(i10);
            }
            iArr = iArr5;
        } else {
            iArr = null;
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("optIn");
        if (jSONArrayOptJSONArray2 != null) {
            int[] iArr6 = new int[jSONArrayOptJSONArray2.length()];
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                iArr6[i11] = jSONArrayOptJSONArray2.optInt(i11);
            }
            iArr2 = iArr6;
        } else {
            iArr2 = null;
        }
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("triggerEvents");
        if (jSONArrayOptJSONArray3 != null) {
            int[] iArr7 = new int[jSONArrayOptJSONArray3.length()];
            for (int i12 = 0; i12 < jSONArrayOptJSONArray3.length(); i12++) {
                iArr7[i12] = jSONArrayOptJSONArray3.optInt(i12);
            }
            iArr3 = iArr7;
        } else {
            iArr3 = null;
        }
        JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("nonConnectivityEvents");
        if (jSONArrayOptJSONArray4 != null) {
            int[] iArr8 = new int[jSONArrayOptJSONArray4.length()];
            for (int i13 = 0; i13 < jSONArrayOptJSONArray4.length(); i13++) {
                iArr8[i13] = jSONArrayOptJSONArray4.optInt(i13);
            }
            iArr4 = iArr8;
        } else {
            iArr4 = null;
        }
        return new H1(bool.booleanValue(), zOptBoolean, zOptBoolean2, iOptInt, strOptString, strOptString2, iOptInt2, iOptInt3, iOptInt4, iArr, iArr2, iArr3, iArr4);
    }

    public static a a(Ne ne2) {
        return ne2 != null ? ne2.i() : a.NOT_SET;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036 A[PHI: r7
      0x0036: PHI (r7v3 com.ironsource.ld) = (r7v1 com.ironsource.ld), (r7v2 com.ironsource.ld) binds: [B:10:0x0034, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.ironsource.C4059hd a(org.json.JSONObject r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            com.ironsource.hd$a r1 = new com.ironsource.hd$a
            r1.<init>()
            java.lang.String r2 = "delivery"
            r3 = 1
            boolean r2 = r10.optBoolean(r2, r3)
            r1.a(r2)
            java.lang.String r2 = "capping"
            org.json.JSONObject r2 = r10.optJSONObject(r2)
            java.lang.String r4 = "enabled"
            r5 = 0
            if (r2 == 0) goto L59
            java.lang.String r6 = "unit"
            java.lang.String r6 = r2.optString(r6)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L45
            com.ironsource.ld r7 = com.ironsource.EnumC4130ld.PER_DAY
            java.lang.String r8 = r7.toString()
            boolean r8 = r8.equals(r6)
            if (r8 == 0) goto L38
        L36:
            r0 = r7
            goto L45
        L38:
            com.ironsource.ld r7 = com.ironsource.EnumC4130ld.PER_HOUR
            java.lang.String r8 = r7.toString()
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L45
            goto L36
        L45:
            java.lang.String r6 = "maxImpressions"
            int r6 = r2.optInt(r6, r5)
            boolean r2 = r2.optBoolean(r4, r5)
            if (r2 == 0) goto L55
            if (r6 <= 0) goto L55
            r2 = r3
            goto L56
        L55:
            r2 = r5
        L56:
            r1.a(r2, r0, r6)
        L59:
            java.lang.String r0 = "pacing"
            org.json.JSONObject r10 = r10.optJSONObject(r0)
            if (r10 == 0) goto L74
            java.lang.String r0 = "numOfSeconds"
            int r0 = r10.optInt(r0, r5)
            boolean r10 = r10.optBoolean(r4, r5)
            if (r10 == 0) goto L70
            if (r0 <= 0) goto L70
            goto L71
        L70:
            r3 = r5
        L71:
            r1.a(r3, r0)
        L74:
            com.ironsource.hd r10 = r1.a()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.Ne.a(org.json.JSONObject):com.ironsource.hd");
    }

    private String a(String str) {
        try {
            JSONObject jSONObjectC = c(c(c(c(this.f29996f, "configurations"), "adFormats"), str), "adUnits");
            if (jSONObjectC == null) {
                return null;
            }
            Iterator<String> itKeys = jSONObjectC.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectC2 = c(jSONObjectC, next);
                if (jSONObjectC2 != null && jSONObjectC2.optBoolean(f29933h1)) {
                    return next;
                }
            }
            return null;
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return null;
        }
    }

    private void a() {
        this.f29996f = IronSourceVideoBridge.jsonObjectInit();
        this.f29994d = "";
        this.f29995e = "";
        this.f29991a = new C4373zd();
        this.f29992b = Cd.c();
        this.f29993c = new T3.a().a();
        this.f29999i = Lb.O().x();
        b(this.f29996f);
    }

    private boolean a(JSONObject jSONObject, JSONObject jSONObject2, String str, boolean z10) {
        return jSONObject.has(str) ? jSONObject.optBoolean(str, z10) : jSONObject2.has(str) ? jSONObject2.optBoolean(str, z10) : z10;
    }

    private int[] a(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArrayOptJSONArray.length()];
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            iArr[i10] = jSONArrayOptJSONArray.optInt(i10);
        }
        return iArr;
    }

    @NotNull
    public static C3936ag b(@Nullable Ne ne2) {
        return (ne2 == null || !ne2.q()) ? C3936ag.a() : ne2.c().b().k();
    }

    private String b() {
        return this.f30000j ? "adFormats" : "adUnits";
    }

    private JSONArray b(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        if (!this.f30000j) {
            return jSONObject.optJSONArray(str);
        }
        JSONObject jSONObjectC = c(jSONObject, str);
        String strA = a(str);
        if (jSONObjectC == null || strA == null) {
            return null;
        }
        return jSONObjectC.optJSONArray(strA);
    }

    private void b(@NotNull JSONObject jSONObject) {
        this.f30001k = new Q5(jSONObject.optJSONObject(C4306ve.f34270d));
    }

    private boolean b(String str) {
        return this.f29992b.a("Mediation") && StringUtils.toLowerCase("IronSource").equals(StringUtils.toLowerCase(str));
    }

    private com.ironsource.mediationsdk.adquality.a c(JSONObject jSONObject) {
        com.ironsource.mediationsdk.adquality.a aVar = new com.ironsource.mediationsdk.adquality.a();
        JSONObject jSONObjectC = c(jSONObject, "AdQuality");
        if (jSONObjectC != null) {
            aVar.a(jSONObjectC.optInt("initMode", 0));
            new X9().b(jSONObjectC.optString("adq_init_blob"));
        }
        return aVar;
    }

    @Nullable
    private JSONObject c(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    private Context d() {
        return this.f29997g;
    }

    private C4049h3 d(JSONObject jSONObject) {
        if (jSONObject != null) {
            int iOptInt = jSONObject.optInt("placementId", -1);
            String strOptString = jSONObject.optString("placementName", "");
            boolean zOptBoolean = jSONObject.optBoolean(f29933h1, false);
            C4059hd c4059hdA = a(jSONObject);
            if (iOptInt >= 0 && !TextUtils.isEmpty(strOptString)) {
                C4049h3 c4049h3 = new C4049h3(iOptInt, strOptString, zOptBoolean, c4059hdA);
                if (c4059hdA == null) {
                    return c4049h3;
                }
                this.f29999i.b(this.f29997g, c4049h3, IronSource.a.BANNER);
                return c4049h3;
            }
        }
        return null;
    }

    @NotNull
    private JSONObject d(JSONObject jSONObject, String str) {
        JSONObject jSONObjectC = c(jSONObject, str);
        return jSONObjectC != null ? jSONObjectC : IronSourceVideoBridge.jsonObjectInit();
    }

    private M9 e(JSONObject jSONObject) {
        if (jSONObject != null) {
            int iOptInt = jSONObject.optInt("placementId", -1);
            String strOptString = jSONObject.optString("placementName", "");
            boolean zOptBoolean = jSONObject.optBoolean(f29933h1, false);
            C4059hd c4059hdA = a(jSONObject);
            if (iOptInt >= 0 && !TextUtils.isEmpty(strOptString)) {
                M9 m92 = new M9(iOptInt, strOptString, zOptBoolean, c4059hdA);
                if (c4059hdA == null) {
                    return m92;
                }
                this.f29999i.b(this.f29997g, m92, IronSource.a.INTERSTITIAL);
                return m92;
            }
        }
        return null;
    }

    private C3950bc f(JSONObject jSONObject) {
        if (jSONObject != null) {
            int iOptInt = jSONObject.optInt("placementId", -1);
            String strOptString = jSONObject.optString("placementName", "");
            boolean zOptBoolean = jSONObject.optBoolean(f29933h1, false);
            C4059hd c4059hdA = a(jSONObject);
            if (iOptInt >= 0 && !TextUtils.isEmpty(strOptString)) {
                C3950bc c3950bc = new C3950bc(iOptInt, strOptString, zOptBoolean, c4059hdA);
                if (c4059hdA == null) {
                    return c3950bc;
                }
                this.f29999i.b(this.f29997g, c3950bc, IronSource.a.NATIVE_AD);
                return c3950bc;
            }
        }
        return null;
    }

    private C4041gd g(JSONObject jSONObject) {
        if (jSONObject != null) {
            int iOptInt = jSONObject.optInt("placementId", -1);
            String strOptString = jSONObject.optString("placementName", "");
            boolean zOptBoolean = jSONObject.optBoolean(f29933h1, false);
            String strOptString2 = jSONObject.optString("virtualItemName", "");
            int iOptInt2 = jSONObject.optInt("virtualItemCount", -1);
            C4059hd c4059hdA = a(jSONObject);
            if (iOptInt >= 0 && !TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && iOptInt2 > 0) {
                C4041gd c4041gd = new C4041gd(iOptInt, strOptString, zOptBoolean, strOptString2, iOptInt2, c4059hdA);
                if (c4059hdA == null) {
                    return c4041gd;
                }
                this.f29999i.b(this.f29997g, c4041gd, IronSource.a.REWARDED_VIDEO);
                return c4041gd;
            }
        }
        return null;
    }

    private Of h(JSONObject jSONObject) {
        Of of2 = new Of();
        JSONObject jSONObjectC = c(jSONObject, "testSuite");
        if (jSONObjectC != null) {
            of2.b(jSONObjectC.optString("controllerUrl"));
        }
        return of2;
    }

    private String m() {
        return this.f30000j ? "rewarded" : "rewardedVideo";
    }

    private boolean n() {
        JSONObject jSONObjectC;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectC2 = c(this.f29996f, "providerOrder");
        JSONArray jSONArrayNames = jSONObjectC2.names();
        if (jSONArrayNames == null) {
            return true;
        }
        JSONObject jSONObjectC3 = c(c(this.f29996f, "configurations"), b());
        for (int i10 = 0; i10 < jSONArrayNames.length(); i10++) {
            String strOptString = jSONArrayNames.optString(i10);
            JSONArray jSONArrayOptJSONArray2 = jSONObjectC2.optJSONArray(strOptString);
            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() != 0 && (jSONObjectC = c(jSONObjectC3, strOptString)) != null && ((jSONArrayOptJSONArray = jSONObjectC.optJSONArray("placements")) == null || jSONArrayOptJSONArray.length() == 0)) {
                return false;
            }
        }
        return true;
    }

    private boolean o() {
        int iOptInt;
        try {
            iOptInt = this.f29996f.optInt(f29940j2, 0);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            iOptInt = 0;
        }
        return iOptInt == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x065f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void r() {
        /*
            Method dump skipped, instruction units count: 2199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.Ne.r():void");
    }

    private void s() {
        try {
            JSONObject jSONObjectC = c(this.f29996f, "providerOrder");
            JSONArray jSONArrayB = b(jSONObjectC, m());
            JSONArray jSONArrayB2 = b(jSONObjectC, "interstitial");
            JSONArray jSONArrayB3 = b(jSONObjectC, "banner");
            JSONArray jSONArrayB4 = b(jSONObjectC, "nativeAd");
            this.f29991a = new C4373zd();
            if (jSONArrayB != null && c() != null && c().f() != null) {
                for (int i10 = 0; i10 < jSONArrayB.length(); i10++) {
                    String strOptString = jSONArrayB.optString(i10);
                    this.f29991a.d(strOptString);
                    NetworkSettings networkSettingsB = Cd.c().b(strOptString);
                    if (networkSettingsB != null) {
                        networkSettingsB.setRewardedVideoPriority(i10);
                    }
                }
            }
            if (jSONArrayB2 != null && c() != null && c().d() != null) {
                for (int i11 = 0; i11 < jSONArrayB2.length(); i11++) {
                    String strOptString2 = jSONArrayB2.optString(i11);
                    this.f29991a.b(strOptString2);
                    NetworkSettings networkSettingsB2 = Cd.c().b(strOptString2);
                    if (networkSettingsB2 != null) {
                        networkSettingsB2.setInterstitialPriority(i11);
                    }
                }
            }
            if (jSONArrayB3 != null) {
                for (int i12 = 0; i12 < jSONArrayB3.length(); i12++) {
                    String strOptString3 = jSONArrayB3.optString(i12);
                    this.f29991a.a(strOptString3);
                    NetworkSettings networkSettingsB3 = Cd.c().b(strOptString3);
                    if (networkSettingsB3 != null) {
                        networkSettingsB3.setBannerPriority(i12);
                    }
                }
            }
            if (jSONArrayB4 != null) {
                for (int i13 = 0; i13 < jSONArrayB4.length(); i13++) {
                    String strOptString4 = jSONArrayB4.optString(i13);
                    this.f29991a.c(strOptString4);
                    NetworkSettings networkSettingsB4 = Cd.c().b(strOptString4);
                    if (networkSettingsB4 != null) {
                        networkSettingsB4.setNativeAdPriority(i13);
                    }
                }
            }
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private void t() {
        JSONObject jSONObject;
        Iterator<String> it;
        Ne ne2;
        Ne ne3 = this;
        try {
            ne3.f29992b = Cd.c();
            JSONObject jSONObjectC = ne3.c(ne3.f29996f, "providerSettings");
            Iterator<String> itKeys = jSONObjectC.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject = jSONObjectC.optJSONObject(next);
                if (jSONObjectOptJSONObject != null) {
                    boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("mpis", false);
                    String strOptString = jSONObjectOptJSONObject.optString("spId", "0");
                    String strOptString2 = jSONObjectOptJSONObject.optString("adSourceName", null);
                    String strOptString3 = jSONObjectOptJSONObject.optString("providerNetworkKey", null);
                    String strOptString4 = jSONObjectOptJSONObject.optString("providerLoadName", next);
                    String strOptString5 = jSONObjectOptJSONObject.optString("providerDefaultInstance", strOptString4);
                    JSONObject jSONObjectC2 = ne3.c(jSONObjectOptJSONObject, b());
                    JSONObject jSONObjectC3 = ne3.c(jSONObjectOptJSONObject, "application");
                    JSONObject jSONObjectC4 = ne3.c(jSONObjectC2, m());
                    JSONObject jSONObjectC5 = ne3.c(jSONObjectC2, "interstitial");
                    JSONObject jSONObjectC6 = ne3.c(jSONObjectC2, "banner");
                    JSONObject jSONObjectC7 = ne3.c(jSONObjectC2, "nativeAd");
                    JSONObject jSONObjectB = IronSourceUtils.b(jSONObjectC4, jSONObjectC3);
                    JSONObject jSONObjectB2 = IronSourceUtils.b(jSONObjectC5, jSONObjectC3);
                    JSONObject jSONObjectB3 = IronSourceUtils.b(jSONObjectC6, jSONObjectC3);
                    JSONObject jSONObjectB4 = IronSourceUtils.b(jSONObjectC7, jSONObjectC3);
                    if (ne3.f29992b.a(next)) {
                        Lb.U().q().a(new C5(D5.TROUBLESHOOTING_MERGE_LOCAL_SETTINGS, (JSONObject) null));
                        NetworkSettings networkSettingsB = ne3.f29992b.b(next);
                        JSONObject rewardedVideoSettings = networkSettingsB.getRewardedVideoSettings();
                        JSONObject interstitialSettings = networkSettingsB.getInterstitialSettings();
                        JSONObject bannerSettings = networkSettingsB.getBannerSettings();
                        JSONObject nativeAdSettings = networkSettingsB.getNativeAdSettings();
                        networkSettingsB.setRewardedVideoSettings(IronSourceUtils.b(rewardedVideoSettings, jSONObjectB));
                        networkSettingsB.setInterstitialSettings(IronSourceUtils.b(interstitialSettings, jSONObjectB2));
                        networkSettingsB.setBannerSettings(IronSourceUtils.b(bannerSettings, jSONObjectB3));
                        networkSettingsB.setNativeAdSettings(IronSourceUtils.b(nativeAdSettings, jSONObjectB4));
                        networkSettingsB.setIsMultipleInstances(zOptBoolean);
                        networkSettingsB.setSubProviderId(strOptString);
                        networkSettingsB.setAdSourceNameForEvents(strOptString2);
                        networkSettingsB.setProviderNetworkKey(strOptString3);
                    } else {
                        if (ne3.b(strOptString4)) {
                            jSONObject = jSONObjectC;
                            NetworkSettings networkSettingsB2 = ne3.f29992b.b("Mediation");
                            JSONObject rewardedVideoSettings2 = networkSettingsB2.getRewardedVideoSettings();
                            JSONObject interstitialSettings2 = networkSettingsB2.getInterstitialSettings();
                            JSONObject bannerSettings2 = networkSettingsB2.getBannerSettings();
                            JSONObject nativeAdSettings2 = networkSettingsB2.getNativeAdSettings();
                            it = itKeys;
                            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(rewardedVideoSettings2.toString());
                            JSONObject jSONObjectJsonObjectInit2 = IronSourceVideoBridge.jsonObjectInit(interstitialSettings2.toString());
                            try {
                                NetworkSettings networkSettings = new NetworkSettings(next, strOptString4, strOptString5, strOptString3, jSONObjectC3, IronSourceUtils.b(jSONObjectJsonObjectInit, jSONObjectB), IronSourceUtils.b(jSONObjectJsonObjectInit2, jSONObjectB2), IronSourceUtils.b(IronSourceVideoBridge.jsonObjectInit(bannerSettings2.toString()), jSONObjectB3), IronSourceUtils.b(IronSourceVideoBridge.jsonObjectInit(nativeAdSettings2.toString()), jSONObjectB4));
                                networkSettings.setIsMultipleInstances(zOptBoolean);
                                networkSettings.setSubProviderId(strOptString);
                                networkSettings.setAdSourceNameForEvents(strOptString2);
                                ne2 = this;
                                try {
                                    ne2.f29992b.a(networkSettings);
                                } catch (Exception e10) {
                                    e = e10;
                                    C4228r4.d().a(e);
                                    IronLog.INTERNAL.error(e.toString());
                                    return;
                                }
                            } catch (Exception e11) {
                                e = e11;
                                C4228r4.d().a(e);
                                IronLog.INTERNAL.error(e.toString());
                                return;
                            }
                        } else {
                            jSONObject = jSONObjectC;
                            it = itKeys;
                            ne2 = ne3;
                            NetworkSettings networkSettings2 = new NetworkSettings(next, strOptString4, strOptString5, strOptString3, jSONObjectC3, jSONObjectB, jSONObjectB2, jSONObjectB3, jSONObjectB4);
                            networkSettings2.setIsMultipleInstances(zOptBoolean);
                            networkSettings2.setSubProviderId(strOptString);
                            networkSettings2.setAdSourceNameForEvents(strOptString2);
                            ne2.f29992b.a(networkSettings2);
                        }
                        ne3 = ne2;
                        jSONObjectC = jSONObject;
                        itKeys = it;
                    }
                }
            }
            ne3.f29992b.b();
        } catch (Exception e12) {
            e = e12;
        }
    }

    public void a(a aVar) {
        this.f29998h = aVar;
    }

    public T3 c() {
        return this.f29993c;
    }

    @Nullable
    public String e() {
        JSONObject jSONObject = this.f29996f;
        if (jSONObject == null || !jSONObject.has("error")) {
            return null;
        }
        return this.f29996f.optString("error");
    }

    public Q5 f() {
        return this.f30001k;
    }

    public C3947b9 g() {
        return new C3947b9(this.f29994d, this.f29995e);
    }

    public List<IronSource.a> h() {
        C4373zd c4373zd;
        C4373zd c4373zd2;
        C4373zd c4373zd3;
        C4373zd c4373zd4;
        if (this.f29996f == null || this.f29993c == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f29993c.f() != null && (c4373zd4 = this.f29991a) != null && !c4373zd4.d().isEmpty()) {
            arrayList.add(IronSource.a.REWARDED_VIDEO);
        }
        if (this.f29993c.d() != null && (c4373zd3 = this.f29991a) != null && !c4373zd3.b().isEmpty()) {
            arrayList.add(IronSource.a.INTERSTITIAL);
        }
        if (this.f29993c.c() != null && (c4373zd2 = this.f29991a) != null && !c4373zd2.a().isEmpty()) {
            arrayList.add(IronSource.a.BANNER);
        }
        if (this.f29993c.e() != null && (c4373zd = this.f29991a) != null && !c4373zd.c().isEmpty()) {
            arrayList.add(IronSource.a.NATIVE_AD);
        }
        return arrayList;
    }

    public a i() {
        return this.f29998h;
    }

    public JSONObject j() {
        return this.f29996f;
    }

    public C4373zd k() {
        return this.f29991a;
    }

    public Cd l() {
        return this.f29992b;
    }

    public boolean p() {
        return !TextUtils.isEmpty(c().g().b());
    }

    public boolean q() {
        JSONObject jSONObject = this.f29996f;
        return (jSONObject == null || jSONObject.has("error") || this.f29991a == null || this.f29992b == null || this.f29993c == null || !n()) ? false : true;
    }

    public String toString() {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put("appKey", this.f29994d);
            jSONObjectJsonObjectInit.put("userId", this.f29995e);
            jSONObjectJsonObjectInit.put("response", this.f29996f);
        } catch (JSONException e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return jSONObjectJsonObjectInit.toString();
    }
}
