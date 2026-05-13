package com.inmobi.media;

import android.os.Build;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.CrashConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC3345d0 {
    public static String a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        C3476i4 c3476i4 = Y3.f26611a;
        tn.p.k(RootConfig.class, "clazz");
        C3476i4 c3476i42 = Y3.f26611a;
        jSONObject.put("root", ((RootConfig) c3476i42.a(RootConfig.class)).getLastUpdateTimeStamp());
        tn.p.k(AdConfig.class, "clazz");
        jSONObject.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, ((AdConfig) c3476i42.a(AdConfig.class)).getLastUpdateTimeStamp());
        tn.p.k(TelemetryConfig.class, "clazz");
        jSONObject.put("telemetry", ((TelemetryConfig) c3476i42.a(TelemetryConfig.class)).getLastUpdateTimeStamp());
        tn.p.k(CrashConfig.class, "clazz");
        jSONObject.put("crashReporting", ((CrashConfig) c3476i42.a(CrashConfig.class)).getLastUpdateTimeStamp());
        tn.p.k(SignalsConfig.class, "clazz");
        jSONObject.put("signals", ((SignalsConfig) c3476i42.a(SignalsConfig.class)).getLastUpdateTimeStamp());
        String string = jSONObject.toString();
        tn.p.j(string, "toString(...)");
        return string;
    }

    public static void a(AdResponse adResponse, C3605n9 c3605n9) {
        try {
            boolean logEnabled = adResponse.getAdSets().get(0).getLogEnabled();
            c3605n9.a("AdLogResponseHandler", "server side logger lever - " + logEnabled);
            c3605n9.a(logEnabled);
        } catch (JSONException e10) {
            c3605n9.a("AdLogResponseHandler", "error while setting server-side lever", e10);
            c3605n9.a(false);
        }
    }

    public static void a(String str, String str2, AdResponse adResponse, C3605n9 c3605n9) {
        tn.p.k(adResponse, "adResponse");
        if (c3605n9 == null) {
            return;
        }
        try {
            int i10 = 0;
            AdSet adSet = adResponse.getAdSets().get(0);
            String requestId = adResponse.getRequestId();
            tn.p.k("requestID", "key");
            tn.p.k(requestId, "value");
            Gh gh2 = c3605n9.f27675a;
            if (gh2 != null) {
                gh2.a("requestID", requestId);
            }
            String strValueOf = String.valueOf(adResponse.getPlacementId());
            tn.p.k("placementID", "key");
            tn.p.k(strValueOf, "value");
            Gh gh3 = c3605n9.f27675a;
            if (gh3 != null) {
                gh3.a("placementID", strValueOf);
            }
            String strValueOf2 = String.valueOf(str);
            tn.p.k("adType", "key");
            tn.p.k(strValueOf2, "value");
            Gh gh4 = c3605n9.f27675a;
            if (gh4 != null) {
                gh4.a("adType", strValueOf2);
            }
            String strValueOf3 = String.valueOf(str2);
            tn.p.k("placementType", "key");
            tn.p.k(strValueOf3, "value");
            Gh gh5 = c3605n9.f27675a;
            if (gh5 != null) {
                gh5.a("placementType", strValueOf3);
            }
            String strValueOf4 = String.valueOf(A1.f25129a);
            tn.p.k("bundleID", "key");
            tn.p.k(strValueOf4, "value");
            Gh gh6 = c3605n9.f27675a;
            if (gh6 != null) {
                gh6.a("bundleID", strValueOf4);
            }
            C3850x5.f28483a.getClass();
            String str3 = (String) C3850x5.f28491i.getSecond();
            tn.p.k("deviceOSVersion", "key");
            tn.p.k(str3, "value");
            Gh gh7 = c3605n9.f27675a;
            if (gh7 != null) {
                gh7.a("deviceOSVersion", str3);
            }
            String strM = C3850x5.m();
            tn.p.k("networkType", "key");
            tn.p.k(strM, "value");
            Gh gh8 = c3605n9.f27675a;
            if (gh8 != null) {
                gh8.a("networkType", strM);
            }
            String str4 = Build.MODEL;
            tn.p.j(str4, "MODEL");
            tn.p.k("deviceModel", "key");
            tn.p.k(str4, "value");
            Gh gh9 = c3605n9.f27675a;
            if (gh9 != null) {
                gh9.a("deviceModel", str4);
            }
            String strValueOf5 = String.valueOf(Ji.f25749c);
            tn.p.k("publisherID", "key");
            tn.p.k(strValueOf5, "value");
            Gh gh10 = c3605n9.f27675a;
            if (gh10 != null) {
                gh10.a("publisherID", strValueOf5);
            }
            tn.p.k("sdkVersion", "key");
            tn.p.k("11.1.0", "value");
            Gh gh11 = c3605n9.f27675a;
            if (gh11 != null) {
                gh11.a("sdkVersion", "11.1.0");
            }
            String strValueOf6 = String.valueOf(Ki.f25816b);
            tn.p.k("tpName", "key");
            tn.p.k(strValueOf6, "value");
            Gh gh12 = c3605n9.f27675a;
            if (gh12 != null) {
                gh12.a("tpName", strValueOf6);
            }
            String strValueOf7 = String.valueOf(Ki.f25815a);
            tn.p.k("tpVersion", "key");
            tn.p.k(strValueOf7, "value");
            Gh gh13 = c3605n9.f27675a;
            if (gh13 != null) {
                gh13.a("tpVersion", strValueOf7);
            }
            tn.p.k("source", "key");
            tn.p.k("sdk_android", "value");
            Gh gh14 = c3605n9.f27675a;
            if (gh14 != null) {
                gh14.a("source", "sdk_android");
            }
            String strA = Ki.a();
            tn.p.k("mkVersion", "key");
            tn.p.k(strA, "value");
            Gh gh15 = c3605n9.f27675a;
            if (gh15 != null) {
                gh15.a("mkVersion", strA);
            }
            String strC = Ji.c();
            tn.p.k("webViewUserAgent", "key");
            tn.p.k(strC, "value");
            Gh gh16 = c3605n9.f27675a;
            if (gh16 != null) {
                gh16.a("webViewUserAgent", strC);
            }
            String strValueOf8 = String.valueOf(adSet.isPod());
            tn.p.k("sdkAdPod", "key");
            tn.p.k(strValueOf8, "value");
            Gh gh17 = c3605n9.f27675a;
            if (gh17 != null) {
                gh17.a("sdkAdPod", strValueOf8);
            }
            String strValueOf9 = String.valueOf(adSet.getLogEnabled());
            tn.p.k("isServerSideLogging", "key");
            tn.p.k(strValueOf9, "value");
            Gh gh18 = c3605n9.f27675a;
            if (gh18 != null) {
                gh18.a("isServerSideLogging", strValueOf9);
            }
            String transactionId = adSet.getTransactionId();
            if (transactionId == null) {
                transactionId = "Not Set";
            }
            tn.p.k("transactionID", "key");
            tn.p.k(transactionId, "value");
            Gh gh19 = c3605n9.f27675a;
            if (gh19 != null) {
                gh19.a("transactionID", transactionId);
            }
            String strA2 = a();
            tn.p.k("configData", "key");
            tn.p.k(strA2, "value");
            Gh gh20 = c3605n9.f27675a;
            if (gh20 != null) {
                gh20.a("configData", strA2);
            }
            if (adSet.isPod()) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (adSet.getAds().isEmpty()) {
                    c3605n9.b("AdLogResponseHandler", "no ads. cannot update vitals");
                } else {
                    for (Object obj : adSet.getAds()) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            cn.w.w();
                        }
                        com.inmobi.media.ads.network.common.model.Ad ad2 = (com.inmobi.media.ads.network.common.model.Ad) obj;
                        arrayList.add(i10, ad2.getCreativeId());
                        arrayList2.add(i10, ad2.getImpressionId());
                        i10 = i11;
                    }
                    String strD0 = cn.f0.D0(arrayList, " , ", null, null, 0, null, null, 62, null);
                    tn.p.k("creativeID", "key");
                    tn.p.k(strD0, "value");
                    Gh gh21 = c3605n9.f27675a;
                    if (gh21 != null) {
                        gh21.a("creativeID", strD0);
                    }
                    String strD02 = cn.f0.D0(arrayList2, " , ", null, null, 0, null, null, 62, null);
                    tn.p.k("impressionID", "key");
                    tn.p.k(strD02, "value");
                    Gh gh22 = c3605n9.f27675a;
                    if (gh22 != null) {
                        gh22.a("impressionID", strD02);
                    }
                }
            } else if (adSet.getAds().isEmpty()) {
                c3605n9.b("AdLogResponseHandler", "no ads. cannot update vitals");
            } else {
                com.inmobi.media.ads.network.common.model.Ad ad3 = adSet.getAds().get(0);
                String creativeId = ad3.getCreativeId();
                tn.p.k("creativeID", "key");
                tn.p.k(creativeId, "value");
                Gh gh23 = c3605n9.f27675a;
                if (gh23 != null) {
                    gh23.a("creativeID", creativeId);
                }
                String impressionId = ad3.getImpressionId();
                tn.p.k("impressionID", "key");
                tn.p.k(impressionId, "value");
                Gh gh24 = c3605n9.f27675a;
                if (gh24 != null) {
                    gh24.a("impressionID", impressionId);
                }
            }
        } catch (JSONException e10) {
            c3605n9.a("AdLogResponseHandler", "error while update vitals", e10);
        }
        a(adResponse, c3605n9);
    }
}
