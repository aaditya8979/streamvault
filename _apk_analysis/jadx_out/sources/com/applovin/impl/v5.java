package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.d6;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t3;
import com.applovin.impl.u4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.ironsource.Y1;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class v5 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a3 f10542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final JSONArray f10543h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Context f10544i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a.InterfaceC0148a f10545j;

    public class a extends l6 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f10546m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ MaxAdFormat f10547n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, String str, MaxAdFormat maxAdFormat) {
            super(aVar, kVar);
            this.f10546m = str;
            this.f10547n = maxAdFormat;
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            v5.this.a(str, i10, str2);
            this.f8505a.D().a("fetchMediatedAd", str, i10, str2);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            if (i10 != 200) {
                v5.this.a(str, i10, (String) null);
                return;
            }
            JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f8703l.a());
            JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f8703l.b());
            HashMap map = new HashMap(6);
            CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), map);
            CollectionUtils.putStringIfValid("code", String.valueOf(i10), map);
            CollectionUtils.putStringIfValid("ad_unit_id", this.f10546m, map);
            CollectionUtils.putStringIfValid("ad_format", this.f10547n.getLabel(), map);
            CollectionUtils.putStringIfValid("latency_ms", String.valueOf(this.f8703l.a()), map);
            CollectionUtils.putStringIfValid("response_size", String.valueOf(this.f8703l.b()), map);
            this.f8505a.P().d(d2.f8010i0, map);
            v5.this.b(jSONObject);
        }
    }

    public v5(a3 a3Var, JSONArray jSONArray, Context context, com.applovin.impl.sdk.k kVar, a.InterfaceC0148a interfaceC0148a) {
        super("TaskFetchMediatedAd", kVar, a3Var.b());
        this.f10542g = a3Var;
        this.f10543h = jSONArray;
        this.f10544i = context;
        this.f10545j = interfaceC0148a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i10, String str2) {
        String strB = this.f10542g.b();
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.b(this.f8506b, "Unable to fetch ad for ad unit " + strB + ": server returned " + i10);
        }
        MaxErrorImpl maxErrorImpl = i10 == -1009 ? new MaxErrorImpl(-1009, str2) : i10 == -1001 ? new MaxErrorImpl(-1001, str2) : StringUtils.isValidString(str2) ? new MaxErrorImpl(-1000, str2) : new MaxErrorImpl(-1);
        HashMap map = new HashMap(5);
        CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), map);
        CollectionUtils.putStringIfValid("code", String.valueOf(i10), map);
        CollectionUtils.putStringIfValid("error_message", str2, map);
        CollectionUtils.putStringIfValid("ad_unit_id", strB, map);
        CollectionUtils.putStringIfValid("ad_format", this.f10542g.a().getLabel(), map);
        this.f8505a.P().d(d2.f8012j0, map);
        t2.a(this.f10545j, strB, maxErrorImpl);
    }

    private void a(JSONObject jSONObject) {
        f6 f6Var = new f6(this.f10542g, jSONObject, this.f10544i, this.f8505a, this.f10545j);
        long j10 = JsonUtils.getLong(jSONObject, "process_waterfall_delay_ms", -1L);
        if (j10 > 0) {
            this.f8505a.q0().a(f6Var, d6.b.MEDIATION, j10, true);
        } else {
            this.f8505a.q0().a(f6Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        try {
            r0.c(jSONObject, this.f8505a);
            r0.b(jSONObject, this.f8505a);
            r0.a(jSONObject, this.f8505a);
            l3.f(jSONObject, this.f8505a);
            l3.d(jSONObject, this.f8505a);
            l3.e(jSONObject, this.f8505a);
            l3.g(jSONObject, this.f8505a);
            this.f8505a.m().a();
            MaxAdFormat maxAdFormatA = this.f10542g.a();
            MaxAdFormat fromString = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "ad_format", null));
            if (maxAdFormatA == fromString) {
                a(jSONObject);
                return;
            }
            String strB = this.f10542g.b();
            if (fromString == null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8507c.b(this.f8506b, "Mediated ad response is missing the ad format field for ad unit " + strB);
                }
                if (jSONObject.has(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS)) {
                    HashMap map = new HashMap(3);
                    CollectionUtils.putStringIfValid("details", "Missing ad format field", map);
                    CollectionUtils.putStringIfValid("ad_unit_id", strB, map);
                    CollectionUtils.putStringIfValid("mcode", JsonUtils.getString(jSONObject, "mcode", ""), map);
                    this.f8505a.D().a(d2.f7994a1, this.f8506b, map);
                }
                this.f10545j.onAdLoadFailed(strB, MaxAdapterError.NO_FILL);
                return;
            }
            String label = fromString.getLabel();
            String label2 = maxAdFormatA.getLabel();
            String str = "Incorrect format (" + label + ") loaded for (" + label2 + ") ad. Please verify if the ad unit ID (" + strB + ") is assigned to the correct ad format.";
            if (n7.a(maxAdFormatA, fromString)) {
                com.applovin.impl.sdk.o.j(this.f8506b, str);
                a(jSONObject);
                return;
            }
            l1.a(str, new Object[0]);
            com.applovin.impl.sdk.o.h(this.f8506b, str);
            this.f10545j.onAdLoadFailed(strB, new MaxAdapterError(MaxAdapterError.INVALID_CONFIGURATION, 0, str));
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("ad_unit_id", strB);
            CollectionUtils.putStringIfValid("name", label2, mapHashMap);
            CollectionUtils.putStringIfValid("details", label, mapHashMap);
            this.f8505a.D().a(d2.S0, "incompatible_ad_format", mapHashMap);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.a(this.f8506b, "Unable to process mediated ad response for ad unit " + this.f10542g.b(), th2);
            }
            throw new RuntimeException("Unable to process ad: " + th2);
        }
    }

    private void c(JSONObject jSONObject) {
        JSONObject andResetCustomPostBodyData = this.f8505a.X().getAndResetCustomPostBodyData();
        if (andResetCustomPostBodyData == null || !n7.h(com.applovin.impl.sdk.k.o())) {
            return;
        }
        JsonUtils.putAll(jSONObject, andResetCustomPostBodyData);
    }

    private void d(JSONObject jSONObject) {
        if (((Boolean) this.f8505a.a(x4.M4)).booleanValue()) {
            u3 u3VarY = this.f8505a.Y();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            s3 s3Var = s3.f9813f;
            JsonUtils.putAll(jSONObject3, (Map<String, ?>) u3VarY.a(s3Var, t3.a.AD_UNIT_ID));
            JsonUtils.putJSONObject(jSONObject2, "arpau", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            JsonUtils.putAll(jSONObject4, (Map<String, ?>) u3VarY.a(s3Var, t3.a.AD_FORMAT));
            JsonUtils.putJSONObject(jSONObject2, "arpaf", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            JsonUtils.putAll(jSONObject5, (Map<String, ?>) u3VarY.a(s3.f9814g, t3.a.AD));
            JsonUtils.putJSONObject(jSONObject2, "ttdasipa_ms", jSONObject5);
            JsonUtils.putJSONObject(jSONObject, "mediation_stats", jSONObject2);
        }
    }

    private String e() {
        return l3.a(this.f8505a);
    }

    private void e(JSONObject jSONObject) throws JSONException {
        String strB = this.f10542g.b();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ad_unit_id", strB);
        jSONObject2.put("ad_format", this.f10542g.a().getLabel());
        Map map = CollectionUtils.map(this.f10542g.d());
        com.applovin.impl.sdk.p pVarA0 = this.f8505a.a0();
        CollectionUtils.putStringIfValid("previous_request_id", pVarA0.b(strB), map);
        CollectionUtils.putStringIfValid("previous_loaded_request_id", pVarA0.a(strB), map);
        p.a aVarC = pVarA0.c(strB);
        if (aVarC != null) {
            if (Boolean.parseBoolean(this.f8505a.n0().getExtraParameters().get("esc"))) {
                map.put("previous_winning_network", "APPLOVIN_NETWORK");
                map.put("previous_winning_network_name", "AppLovin");
            } else {
                map.put("previous_winning_network", aVarC.a());
                map.put("previous_winning_network_name", aVarC.c());
            }
            if (this.f8505a.R() != null) {
                Queue<y2> queueC = this.f8505a.R().c(strB);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (y2 y2Var : queueC) {
                    arrayList.add(y2Var.c());
                    arrayList2.add(y2Var.getNetworkName());
                }
                CollectionUtils.putStringIfValid("queued_ad_networks", qc.a(io.appmetrica.analytics.coreutils.internal.StringUtils.COMMA, arrayList), map);
                CollectionUtils.putStringIfValid("queued_ad_network_names", qc.a(io.appmetrica.analytics.coreutils.internal.StringUtils.COMMA, arrayList2), map);
            }
        }
        jSONObject2.put("extra_parameters", CollectionUtils.toJson(map));
        jSONObject.put("ad_info", jSONObject2);
    }

    private String f() {
        return l3.b(this.f8505a);
    }

    private void f(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(Y1.f30689e, new JSONArray(this.f8505a.T().a()));
            jSONObject2.put("installed", w3.b(this.f8505a));
            jSONObject2.put("initialized", this.f8505a.S().b());
            jSONObject2.put("initialized_classnames", new JSONArray((Collection) this.f8505a.S().a()));
            jSONObject2.put("loaded_classnames", new JSONArray(this.f8505a.T().c()));
            jSONObject2.put("failed_classnames", new JSONArray(this.f8505a.T().b()));
            jSONObject.put("adapters_info", jSONObject2);
        } catch (Exception e10) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.a(this.f8506b, "Failed to populate adapter classNames", e10);
            }
            throw new RuntimeException("Failed to populate classNames: " + e10);
        }
    }

    private JSONObject g() throws JSONException {
        Map mapA = this.f8505a.A().a((Map) null, false, true);
        mapA.putAll(this.f10542g.c());
        JSONObject jSONObject = new JSONObject(mapA);
        e(jSONObject);
        h(jSONObject);
        f(jSONObject);
        c(jSONObject);
        g(jSONObject);
        d(jSONObject);
        return jSONObject;
    }

    private void g(JSONObject jSONObject) {
        JsonUtils.putObject(jSONObject, "sdk_extra_parameters", new JSONObject(this.f8505a.n0().getExtraParameters()));
    }

    private Map h() {
        HashMap map = new HashMap(4);
        map.put("AppLovin-Ad-Unit-Id", this.f10542g.b());
        map.put("AppLovin-Ad-Format", this.f10542g.a().getLabel());
        Map mapD = this.f10542g.d();
        CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Attempt", mapD.get("retry_attempt"), map);
        CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Delay-Sec", mapD.get("retry_delay_sec"), map);
        return map;
    }

    private void h(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = this.f10543h;
        if (jSONArray != null) {
            jSONObject.put("signal_data", jSONArray);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        MaxAdFormat maxAdFormatA = this.f10542g.a();
        String strB = this.f10542g.b();
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.a(this.f8506b, "Fetching next ad for " + maxAdFormatA.getLabel() + " ad unit " + strB);
        }
        k2.a();
        if (((Boolean) this.f8505a.a(x4.T3)).booleanValue() && n7.k() && com.applovin.impl.sdk.o.a()) {
            this.f8507c.a(this.f8506b, "User is connected to a VPN");
        }
        this.f8505a.P().a(d2.f8008h0, maxAdFormatA, strB, (MaxError) null);
        if (((Boolean) this.f8505a.a(x4.M4)).booleanValue()) {
            u3 u3VarY = this.f8505a.Y();
            s3 s3Var = s3.f9813f;
            u3VarY.a(s3Var, t3.a(strB));
            u3VarY.a(s3Var, t3.a(maxAdFormatA));
        }
        n7.a(this.f8505a, this.f8506b);
        try {
            JSONObject jSONObjectG = g();
            HashMap map = new HashMap();
            if (!((Boolean) this.f8505a.a(x4.B5)).booleanValue() && !((Boolean) this.f8505a.a(x4.f10891z5)).booleanValue()) {
                map.put(ImpressionLog.f51754x, UUID.randomUUID().toString());
            }
            if (!((Boolean) this.f8505a.a(x4.f10769k5)).booleanValue()) {
                map.put("sdk_key", this.f8505a.i0());
            }
            if (this.f8505a.s0().c()) {
                map.put("test_mode", "1");
            }
            List listB = this.f8505a.s0().b();
            String str = this.f8505a.n0().getExtraParameters().get("fan");
            if (listB != null && !listB.isEmpty()) {
                String strA = qc.a(io.appmetrica.analytics.coreutils.internal.StringUtils.COMMA, listB);
                map.put("filter_ad_network", strA);
                if (!this.f8505a.s0().c()) {
                    map.put("fhkZsVqYC7", "1");
                }
                if (this.f8505a.s0().d()) {
                    map.put("force_ad_network", strA);
                }
            } else if (StringUtils.isValidString(str)) {
                map.put("filter_ad_network", str);
            }
            a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f8505a).c("POST").a(h()).b(f()).a(e()).b(map).a(jSONObjectG).b(((Boolean) this.f8505a.a(r3.f9767y8)).booleanValue()).a((Object) new JSONObject()).c(((Long) this.f8505a.a(r3.f9754s7)).intValue()).a(((Integer) this.f8505a.a(x4.W2)).intValue()).b(((Long) this.f8505a.a(r3.f9752r7)).intValue()).a(u4.a.a(((Integer) this.f8505a.a(x4.f10819q5)).intValue())).f(true).a(), this.f8505a, strB, maxAdFormatA);
            aVar.c(r3.f9748p7);
            aVar.b(r3.f9750q7);
            this.f8505a.q0().a(aVar);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.a(this.f8506b, "Unable to fetch ad for Ad Unit ID: " + strB, th2);
            }
            a("", 0, th2.getMessage());
        }
    }
}
