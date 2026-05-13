package com.inmobi.media;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdInfo;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.ironsource.C3978d4;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3646p0 extends AbstractC3829w9 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ak f27818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3596n0 f27819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3666pk f27820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3360df f27821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3605n9 f27822f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3646p0(String str, Ak ak2, C3596n0 c3596n0, C3666pk c3666pk, C3360df c3360df, C3605n9 c3605n9, boolean z10) {
        super(str == null ? AdConfig.DEFAULT_AD_SERVER_URL : str);
        tn.p.k(c3596n0, "metaData");
        tn.p.k(c3666pk, "timeoutConfig");
        this.f27818b = ak2;
        this.f27819c = c3596n0;
        this.f27820d = c3666pk;
        this.f27821e = c3360df;
        this.f27822f = c3605n9;
    }

    public final Le a() throws JSONException {
        String string;
        Map map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = Ji.f25749c;
        if (str == null) {
            throw new IllegalArgumentException("Account Id cannot be null");
        }
        linkedHashMap.put("account_id", str);
        linkedHashMap.putAll(J5.c());
        String str2 = A1.f25130b;
        if (str2 != null) {
        }
        linkedHashMap.put("client-request-id", this.f27819c.f27655a);
        linkedHashMap.put("sdk-flavor", "row");
        this.f27819c.getClass();
        linkedHashMap.put("format", "unifiedSdkJson");
        String str3 = this.f27819c.f27659e;
        if (str3 != null) {
        }
        tn.p.k(linkedHashMap, "<this>");
        Pk pkA = Ok.a();
        String str4 = pkA.f26141a;
        if (str4 != null) {
        }
        linkedHashMap.put("is-unifid-service-used", String.valueOf(pkA.f26142b));
        long j10 = this.f27819c.f27657c;
        if (j10 != Long.MIN_VALUE) {
            linkedHashMap.put("im-plid", String.valueOf(j10));
        }
        AbstractC3829w9.d(linkedHashMap);
        linkedHashMap.putAll(O2.a());
        tn.p.k(linkedHashMap, "<this>");
        linkedHashMap.putAll(O2.b());
        linkedHashMap.putAll(O2.c());
        C3360df c3360df = this.f27821e;
        if (c3360df != null && (map = c3360df.f27036a) != null) {
            linkedHashMap.putAll(map);
        }
        HashMap map2 = new HashMap();
        map2.putAll(X3.f26574a);
        linkedHashMap.putAll(map2);
        String str5 = this.f27819c.f27661g;
        if (str5 != null) {
        }
        Map map3 = this.f27819c.f27660f;
        if (map3 != null) {
            linkedHashMap.putAll(map3);
        }
        this.f27819c.getClass();
        linkedHashMap.put("int-origin", "im");
        AbstractC3829w9.c(linkedHashMap);
        AbstractC3829w9.e(linkedHashMap);
        tn.p.k(linkedHashMap, "<this>");
        bn.g gVar = E0.f25354c;
        if (!((CopyOnWriteArrayList) gVar.getValue()).isEmpty()) {
            String string2 = new JSONArray((Collection) gVar.getValue()).toString();
            tn.p.j(string2, "toString(...)");
            linkedHashMap.put("u-r-crid", string2);
        }
        linkedHashMap.put("m10n_context", tn.p.f("others", this.f27819c.f27658d) ? "M10N_CONTEXT_OTHER" : "M10N_CONTEXT_ACTIVITY");
        tn.p.k(linkedHashMap, "<this>");
        C3850x5.f28483a.getClass();
        if (C3850x5.q()) {
            if (J5.f25693e) {
                string = null;
            } else {
                string = J5.f25691c;
                if (string == null) {
                    Context context = Ji.f25747a;
                    if (context == null) {
                        string = null;
                    } else {
                        ConcurrentHashMap concurrentHashMap = Ea.f25372b;
                        Ea eaA = Da.a(context, "display_info_store");
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
        tn.p.k(linkedHashMap, "<this>");
        C3476i4 c3476i4 = Y3.f26611a;
        tn.p.k(SignalsConfig.class, "clazz");
        JSONObject ext = ((SignalsConfig) Y3.f26611a.a(SignalsConfig.class)).getExt();
        if (ext != null && ext.length() > 0) {
            String string3 = ext.toString();
            tn.p.j(string3, "toString(...)");
            linkedHashMap.put("im-ext", string3);
        }
        Map map4 = this.f27819c.f27656b;
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
        AbstractC3829w9.a(linkedHashMap);
        C3596n0 c3596n0 = this.f27819c;
        tn.p.k(linkedHashMap, "<this>");
        tn.p.k(c3596n0, "metaData");
        String str8 = c3596n0.f27659e;
        if (str8 != null && AbstractC3829w9.a(str8).length() > 0) {
            String string4 = AbstractC3829w9.a(str8).toString();
            tn.p.j(string4, "toString(...)");
            linkedHashMap.put("audioObject", string4);
        }
        tn.p.k(linkedHashMap, "<this>");
        String str9 = Vg.f26501a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        String str10 = Vg.f26501a;
        if (str10 != null) {
            linkedHashMap2.put("u-nip", str10);
        } else {
            linkedHashMap2 = null;
        }
        if (linkedHashMap2 != null) {
            linkedHashMap.putAll(linkedHashMap2);
        }
        linkedHashMap.putAll(Tg.a());
        AppSetIdInfo appSetIdInfo = B1.f25190a;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        B1.a(linkedHashMap3);
        linkedHashMap.putAll(linkedHashMap3);
        tn.p.k(linkedHashMap, "<this>");
        if (K4.e() && F3.a(K4.d())) {
            linkedHashMap.put("ik", K4.f25797f);
            linkedHashMap.put("c_data", K4.d());
            Context context2 = Ji.f25747a;
            int i10 = 1;
            if (context2 != null) {
                ConcurrentHashMap concurrentHashMap2 = Ea.f25372b;
                Ea eaA2 = Da.a(context2, "c_data_store");
                tn.p.k("akv", "key");
                i10 = eaA2.f25373a.getInt("akv", 1);
            }
            linkedHashMap.put("aKV", String.valueOf(i10));
        }
        tn.p.k(linkedHashMap, "<this>");
        linkedHashMap.put("u-appsecure", String.valueOf((int) A1.f25134f));
        Ak ak2 = this.f27818b;
        HashMap mapA = ak2 != null ? ak2.a() : null;
        tn.p.k(linkedHashMap, "<this>");
        if (mapA != null) {
            for (Map.Entry entry2 : mapA.entrySet()) {
                linkedHashMap.put((String) entry2.getKey(), (String) entry2.getValue());
            }
        }
        C3476i4 c3476i42 = Y3.f26611a;
        tn.p.k(SignalsConfig.class, "clazz");
        if (((SignalsConfig) Y3.f26611a.a(SignalsConfig.class)).getPublisherConfig().getEnableMCO()) {
            tn.p.k(linkedHashMap, "<this>");
            JSONObject jSONObjectE = Og.f26086a.e();
            if (jSONObjectE.length() > 0) {
                String string5 = jSONObjectE.toString();
                tn.p.j(string5, "toString(...)");
                linkedHashMap.put(C3978d4.i.f31348l0, string5);
            }
        }
        AbstractC3829w9.b(linkedHashMap);
        boolean z10 = this.f27819c.f27662h;
        tn.p.k(linkedHashMap, "<this>");
        linkedHashMap.putAll(A1.f25133e);
        linkedHashMap.putAll(C3850x5.f28483a.a(z10));
        linkedHashMap.putAll(AbstractC3903z8.a());
        tn.p.k(linkedHashMap, "<this>");
        JSONObject jSONObjectB = W6.b();
        if (jSONObjectB != null) {
            String string6 = jSONObjectB.toString();
            tn.p.j(string6, "toString(...)");
            linkedHashMap.put("consentObject", string6);
        }
        this.f27819c.getClass();
        C3605n9 c3605n9 = this.f27822f;
        if (c3605n9 != null) {
            c3605n9.c("AdNetworkRequest", linkedHashMap.toString());
        }
        String str11 = this.f28424a;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        tn.p.k(linkedHashMap4, "mHttpHeaders");
        linkedHashMap4.put("User-Agent", Ji.c());
        return new Le(str11, linkedHashMap4, this.f27820d, new Y6(linkedHashMap), null, 48);
    }
}
