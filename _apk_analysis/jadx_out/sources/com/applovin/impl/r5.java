package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.network.a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u4;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class r5 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u f9773g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f9774h;

    public class a extends l6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            r5.this.a(i10, str2);
            this.f8505a.D().a("fetchAd", str, i10, str2);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            if (i10 != 200) {
                r5.this.a(i10, MaxAdapterError.NO_FILL.getErrorMessage());
                return;
            }
            JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f8703l.a());
            JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f8703l.b());
            HashMap map = new HashMap(5);
            CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), map);
            CollectionUtils.putStringIfValid("code", String.valueOf(i10), map);
            CollectionUtils.putStringIfValid("ad_zone_id", r5.this.f9773g.e(), map);
            CollectionUtils.putStringIfValid("latency_ms", String.valueOf(this.f8703l.a()), map);
            CollectionUtils.putStringIfValid("response_size", String.valueOf(this.f8703l.b()), map);
            this.f8505a.g().d(d2.f8041y, map);
            r5.this.b(jSONObject);
        }
    }

    public r5(u uVar, String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
        this.f9773g = uVar;
        this.f9774h = kVar.b();
    }

    private Map g() {
        HashMap map = new HashMap(3);
        map.put("AppLovin-Zone-Id", this.f9773g.e());
        if (this.f9773g.f() != null) {
            map.put("AppLovin-Ad-Size", this.f9773g.f().getLabel());
        }
        if (this.f9773g.g() != null) {
            map.put("AppLovin-Ad-Type", this.f9773g.g().getLabel());
        }
        return map;
    }

    public abstract i5 a(JSONObject jSONObject);

    public void a(int i10, String str) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.b(this.f8506b, "Unable to fetch " + this.f9773g + " ad: server returned " + i10);
        }
        this.f8505a.g().a(d2.f8043z, this.f9773g, new AppLovinError(i10, str));
    }

    public void b(JSONObject jSONObject) {
        r0.c(jSONObject, this.f8505a);
        r0.b(jSONObject, this.f8505a);
        r0.a(jSONObject, this.f8505a);
        u.a(jSONObject);
        this.f8505a.q0().a(a(jSONObject));
    }

    public abstract String e();

    public abstract String f();

    public Map h() {
        HashMap map = new HashMap(4);
        map.put("zone_id", this.f9773g.e());
        if (this.f9773g.f() != null) {
            map.put("size", this.f9773g.f().getLabel());
        }
        if (this.f9773g.g() != null) {
            map.put("require", this.f9773g.g().getLabel());
        }
        return map;
    }

    @Override // java.lang.Runnable
    public void run() {
        u4.a aVarA;
        Map map;
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.a(this.f8506b, "Fetching next ad of zone: " + this.f9773g);
        }
        if (((Boolean) this.f8505a.a(x4.T3)).booleanValue() && n7.k() && com.applovin.impl.sdk.o.a()) {
            this.f8507c.a(this.f8506b, "User is connected to a VPN");
        }
        n7.a(this.f8505a, this.f8506b);
        this.f8505a.g().a(d2.f8039x, this.f9773g, (AppLovinError) null);
        try {
            JSONObject andResetCustomPostBody = this.f8505a.k().getAndResetCustomPostBody();
            String str = "POST";
            if (((Boolean) this.f8505a.a(x4.f10740h3)).booleanValue()) {
                aVarA = u4.a.a(((Integer) this.f8505a.a(x4.f10835s5)).intValue());
                JSONObject jSONObject = new JSONObject(this.f8505a.A().a(h(), false, true));
                map = new HashMap();
                if (!((Boolean) this.f8505a.a(x4.D5)).booleanValue() && !((Boolean) this.f8505a.a(x4.f10891z5)).booleanValue()) {
                    map.put(ImpressionLog.f51754x, UUID.randomUUID().toString());
                }
                if (!((Boolean) this.f8505a.a(x4.f10769k5)).booleanValue()) {
                    map.put("sdk_key", this.f8505a.i0());
                }
                JsonUtils.putAll(jSONObject, andResetCustomPostBody);
                andResetCustomPostBody = jSONObject;
            } else {
                u4.a aVarA2 = u4.a.a(((Integer) this.f8505a.a(x4.f10843t5)).intValue());
                Map mapA = n7.a(this.f8505a.A().a(h(), false, false));
                if (!((Boolean) this.f8505a.a(x4.M6)).booleanValue()) {
                    mapA.remove("video_decoders");
                }
                if (andResetCustomPostBody == null) {
                    str = "GET";
                    andResetCustomPostBody = null;
                }
                aVarA = aVarA2;
                map = mapA;
            }
            if (n7.h(a()) || n7.j(a())) {
                map.putAll(this.f8505a.k().getAndResetCustomQueryParams());
            }
            if (StringUtils.isValidString(this.f9774h)) {
                map.put("sts", this.f9774h);
            }
            a.C0156a c0156aF = com.applovin.impl.sdk.network.a.a(this.f8505a).b(f()).a(e()).b(map).c(str).a(g()).a((Object) new JSONObject()).a(((Integer) this.f8505a.a(x4.W2)).intValue()).c(((Boolean) this.f8505a.a(x4.X2)).booleanValue()).d(((Boolean) this.f8505a.a(x4.Y2)).booleanValue()).c(((Integer) this.f8505a.a(x4.V2)).intValue()).a(aVarA).f(true);
            if (andResetCustomPostBody != null) {
                c0156aF.a(andResetCustomPostBody);
                c0156aF.b(((Boolean) this.f8505a.a(x4.N5)).booleanValue());
            }
            a aVar = new a(c0156aF.a(), this.f8505a);
            aVar.c(x4.f10773l0);
            aVar.b(x4.f10782m0);
            this.f8505a.q0().a(aVar);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.a(this.f8506b, "Unable to fetch ad for zone id: " + this.f9773g, th2);
            }
            a(0, th2.getMessage());
        }
    }
}
