package com.inmobi.media;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.appset.AppSetIdInfo;
import com.inmobi.media.AbstractC3765tk;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.ironsource.C3978d4;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import okio.Buffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.tk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC3765tk {
    public static String a(Map map, String str) throws JSONException {
        Map map2;
        String string;
        C3605n9 c3605n9A = Jh.a("getToken", "AB");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (map != null) {
            String str2 = (String) map.get("tp");
            if (!TextUtils.isEmpty(str2)) {
                Ki.f25816b = str2;
            }
            String str3 = (String) map.get("tp-v");
            if (!TextUtils.isEmpty(str3)) {
                Ki.f25815a = str3;
            }
        }
        a();
        if (!Ji.d()) {
            if (c3605n9A != null) {
                tn.p.j("com.inmobi.media.tk", "LOG_TAG");
                c3605n9A.b("com.inmobi.media.tk", "InMobi SDK is not initialised. Cannot fetch a token.");
            }
            a(90, jCurrentTimeMillis, c3605n9A);
            return null;
        }
        Context context = Ji.f25747a;
        C3411ff c3411ff = context != null ? new C3411ff(context, c3605n9A) : null;
        C3476i4 c3476i4 = Y3.f26611a;
        tn.p.k(RootConfig.class, "clazz");
        C3476i4 c3476i42 = Y3.f26611a;
        if (((RootConfig) c3476i42.a(RootConfig.class)).isMonetizationDisabled()) {
            a(2012, jCurrentTimeMillis, c3605n9A);
            if (c3605n9A != null) {
                tn.p.j("com.inmobi.media.tk", "LOG_TAG");
                c3605n9A.b("com.inmobi.media.tk", "Monetization disabled. cannot provide token");
            }
            return null;
        }
        tn.p.k(AdConfig.class, "clazz");
        Ak ak2 = new Ak(((AdConfig) c3476i42.a(AdConfig.class)).getIncludeIdParams());
        C3790uk c3790uk = new C3790uk(str, map);
        C3360df c3360dfA = c3411ff != null ? c3411ff.a() : null;
        tn.p.k(ak2, "uidMap");
        tn.p.k(c3790uk, "metaData");
        tn.p.k("https://www.123.com", "url");
        tn.p.k("https://www.123.com", "url");
        tn.p.k(SignalsConfig.class, "clazz");
        SignalsConfig signalsConfig = (SignalsConfig) c3476i42.a(SignalsConfig.class);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strA = AbstractC3853x8.a();
        if (strA != null) {
        }
        tn.p.k(linkedHashMap, "<this>");
        Pk pkA = Ok.a();
        String str4 = pkA.f26141a;
        if (str4 != null) {
        }
        linkedHashMap.put("is-unifid-service-used", String.valueOf(pkA.f26142b));
        AbstractC3829w9.d(linkedHashMap);
        linkedHashMap.put("d-media-volume", String.valueOf(C3850x5.f28483a.a(Ji.f25747a, false)));
        linkedHashMap.putAll(ak2.a());
        String str5 = c3790uk.f28284a;
        if (str5 != null) {
        }
        HashMap map3 = new HashMap();
        map3.putAll(X3.f26574a);
        linkedHashMap.putAll(map3);
        Map map4 = c3790uk.f28285b;
        tn.p.k(linkedHashMap, "<this>");
        if (map4 != null) {
            for (Map.Entry entry : map4.entrySet()) {
                String str6 = (String) entry.getKey();
                String str7 = (String) entry.getValue();
                if (!linkedHashMap.containsKey(str6)) {
                    linkedHashMap.put(str6, str7);
                }
            }
        }
        tn.p.k(linkedHashMap, "<this>");
        C3476i4 c3476i43 = Y3.f26611a;
        tn.p.k(SignalsConfig.class, "clazz");
        JSONObject ext = ((SignalsConfig) Y3.f26611a.a(SignalsConfig.class)).getExt();
        if (ext != null && ext.length() > 0) {
            String string2 = ext.toString();
            tn.p.j(string2, "toString(...)");
            linkedHashMap.put("im-ext", string2);
        }
        tn.p.k(linkedHashMap, "<this>");
        C3850x5 c3850x5 = C3850x5.f28483a;
        c3850x5.getClass();
        if (C3850x5.q()) {
            if (J5.f25693e) {
                string = null;
            } else {
                string = J5.f25691c;
                if (string == null) {
                    Context context2 = Ji.f25747a;
                    if (context2 == null) {
                        string = null;
                    } else {
                        ConcurrentHashMap concurrentHashMap = Ea.f25372b;
                        Ea eaA = Da.a(context2, "display_info_store");
                        tn.p.k("gesture_margin", "key");
                        string = eaA.f25373a.getString("gesture_margin", null);
                    }
                    J5.f25691c = string;
                }
            }
            if (string != null) {
                linkedHashMap.put("d-device-gesture-margins", string);
            }
        }
        AbstractC3829w9.c(linkedHashMap);
        AbstractC3829w9.e(linkedHashMap);
        AbstractC3829w9.a(linkedHashMap);
        AbstractC3829w9.b(linkedHashMap);
        linkedHashMap.put("h-user-agent", Ji.c());
        tn.p.k(linkedHashMap, "<this>");
        String str8 = Vg.f26501a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        String str9 = Vg.f26501a;
        if (str9 != null) {
            linkedHashMap2.put("u-nip", str9);
        } else {
            linkedHashMap2 = null;
        }
        if (linkedHashMap2 != null) {
            linkedHashMap.putAll(linkedHashMap2);
        }
        linkedHashMap.putAll(Tg.a());
        linkedHashMap.putAll(J5.c());
        linkedHashMap.putAll(O2.a());
        if (c3360dfA != null && (map2 = c3360dfA.f27036a) != null) {
            linkedHashMap.putAll(map2);
        }
        tn.p.k(linkedHashMap, "<this>");
        bn.g gVar = E0.f25354c;
        if (!((CopyOnWriteArrayList) gVar.getValue()).isEmpty()) {
            String string3 = new JSONArray((Collection) gVar.getValue()).toString();
            tn.p.j(string3, "toString(...)");
            linkedHashMap.put("u-r-crid", string3);
        }
        JSONObject jSONObjectA = W8.f26526c.a();
        if (jSONObjectA.length() > 0) {
            String string4 = jSONObjectA.toString();
            tn.p.j(string4, "toString(...)");
            linkedHashMap.put("audioObject", string4);
        }
        AppSetIdInfo appSetIdInfo = B1.f25190a;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        B1.a(linkedHashMap3);
        linkedHashMap.putAll(linkedHashMap3);
        if (signalsConfig.getPublisherConfig().getEnableAB()) {
            tn.p.k(linkedHashMap, "<this>");
            JSONObject jSONObjectE = Og.f26086a.e();
            if (jSONObjectE.length() > 0) {
                String string5 = jSONObjectE.toString();
                tn.p.j(string5, "toString(...)");
                linkedHashMap.put(C3978d4.i.f31348l0, string5);
            }
        }
        tn.p.k(linkedHashMap, "<this>");
        linkedHashMap.put("u-appsecure", String.valueOf((int) A1.f25134f));
        tn.p.k(linkedHashMap, "<this>");
        if (K4.e() && F3.a(K4.d())) {
            linkedHashMap.put("ik", K4.f25797f);
            linkedHashMap.put("c_data", K4.d());
            Context context3 = Ji.f25747a;
            int i10 = 1;
            if (context3 != null) {
                ConcurrentHashMap concurrentHashMap2 = Ea.f25372b;
                Ea eaA2 = Da.a(context3, "c_data_store");
                tn.p.k("akv", "key");
                i10 = eaA2.f25373a.getInt("akv", 1);
            }
            linkedHashMap.put("aKV", String.valueOf(i10));
        }
        tn.p.k(linkedHashMap, "<this>");
        JSONObject jSONObjectB = W6.b();
        if (jSONObjectB != null) {
            String string6 = jSONObjectB.toString();
            tn.p.j(string6, "toString(...)");
            linkedHashMap.put("consentObject", string6);
        }
        tn.p.k(linkedHashMap, "<this>");
        linkedHashMap.putAll(A1.f25133e);
        linkedHashMap.putAll(c3850x5.a(false));
        linkedHashMap.putAll(AbstractC3903z8.a());
        tn.p.k(linkedHashMap, "mHttpHeaders");
        linkedHashMap.put("User-Agent", Ji.c());
        tn.p.k(linkedHashMap, "payload");
        if (!W6.a()) {
            if (c3605n9A != null) {
                tn.p.j("com.inmobi.media.tk", "LOG_TAG");
                c3605n9A.b("com.inmobi.media.tk", "get Signals failed - GDPR Compliance");
            }
            a(2141, jCurrentTimeMillis, c3605n9A);
            return null;
        }
        a(jCurrentTimeMillis, c3605n9A);
        if (c3605n9A != null) {
            tn.p.j("com.inmobi.media.tk", "LOG_TAG");
            c3605n9A.a("com.inmobi.media.tk", "get signals success");
        }
        byte[] bArrEncode = Base64.encode(new Buffer().writeUtf8(F3.a(linkedHashMap)).readByteArray(), 8);
        tn.p.j(bArrEncode, "encode(...)");
        return new String(bArrEncode, bo.c.f5639b);
    }

    public static void a() {
        Runnable runnable = new Runnable() { // from class: n9.ja
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3765tk.b();
            }
        };
        Context context = Ji.f25747a;
        tn.p.k(runnable, "runnable");
        Ji.f25753g.submit(runnable);
    }

    public static void a(final int i10, final long j10, C3605n9 c3605n9) {
        if (c3605n9 != null) {
            tn.p.j("com.inmobi.media.tk", "LOG_TAG");
            c3605n9.c("com.inmobi.media.tk", "submitAdGetSignalsFailed - errorCode - " + i10 + ", startTime - " + j10);
        }
        Runnable runnable = new Runnable() { // from class: n9.ia
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3765tk.a(j10, i10);
            }
        };
        Context context = Ji.f25747a;
        tn.p.k(runnable, "runnable");
        Ji.f25753g.submit(runnable);
        if (c3605n9 != null) {
            c3605n9.a();
        }
    }

    public static final void a(long j10) {
        HashMap mapL = kotlin.collections.a.l(bn.h.a("latency", Long.valueOf(System.currentTimeMillis() - j10)), bn.h.a("networkType", C3850x5.m()), bn.h.a("plType", "AB"));
        Wj wj2 = Wj.f26549a;
        Wj.b("AdGetSignalsSucceeded", mapL, EnumC3287ak.f26805a);
    }

    public static final void a(long j10, int i10) {
        HashMap mapL = kotlin.collections.a.l(bn.h.a("latency", Long.valueOf(System.currentTimeMillis() - j10)), bn.h.a("networkType", C3850x5.m()), bn.h.a(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)), bn.h.a("plType", "AB"));
        Wj wj2 = Wj.f26549a;
        Wj.b("AdGetSignalsFailed", mapL, EnumC3287ak.f26805a);
    }

    public static void a(final long j10, C3605n9 c3605n9) {
        if (c3605n9 != null) {
            tn.p.j("com.inmobi.media.tk", "LOG_TAG");
            c3605n9.c("com.inmobi.media.tk", "submitAdGetSignalsSucceeded - startTime - " + j10);
        }
        Runnable runnable = new Runnable() { // from class: n9.ka
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3765tk.a(j10);
            }
        };
        Context context = Ji.f25747a;
        tn.p.k(runnable, "runnable");
        Ji.f25753g.submit(runnable);
        if (c3605n9 != null) {
            c3605n9.a();
        }
    }

    public static final void b() {
        HashMap mapL = kotlin.collections.a.l(bn.h.a("networkType", C3850x5.m()), bn.h.a("plType", "AB"));
        Wj wj2 = Wj.f26549a;
        Wj.b("AdGetSignalsCalled", mapL, EnumC3287ak.f26805a);
    }
}
