package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import androidx.arch.core.util.Function;
import com.applovin.impl.sdk.utils.JsonUtils;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class o7 extends com.applovin.impl.sdk.ad.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f9447n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f9448o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final x7 f9449p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final long f9450q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final b8 f9451r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final r7 f9452s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f9453t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final q7 f9454u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final l4 f9455v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Set f9456w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Set f9457x;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private JSONObject f9458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private JSONObject f9459b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.applovin.impl.sdk.k f9460c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f9461d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f9462e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f9463f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private x7 f9464g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private b8 f9465h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private r7 f9466i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private q7 f9467j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Set f9468k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Set f9469l;

        public b a(long j10) {
            this.f9461d = j10;
            return this;
        }

        public b a(b8 b8Var) {
            this.f9465h = b8Var;
            return this;
        }

        public b a(q7 q7Var) {
            this.f9467j = q7Var;
            return this;
        }

        public b a(r7 r7Var) {
            this.f9466i = r7Var;
            return this;
        }

        public b a(com.applovin.impl.sdk.k kVar) {
            if (kVar == null) {
                throw new IllegalArgumentException("No sdk specified.");
            }
            this.f9460c = kVar;
            return this;
        }

        public b a(x7 x7Var) {
            this.f9464g = x7Var;
            return this;
        }

        public b a(String str) {
            this.f9463f = str;
            return this;
        }

        public b a(Set set) {
            this.f9469l = set;
            return this;
        }

        public b a(JSONObject jSONObject) {
            if (jSONObject == null) {
                throw new IllegalArgumentException("No ad object specified.");
            }
            this.f9458a = jSONObject;
            return this;
        }

        public o7 a() {
            return new o7(this);
        }

        public b b(String str) {
            this.f9462e = str;
            return this;
        }

        public b b(Set set) {
            this.f9468k = set;
            return this;
        }

        public b b(JSONObject jSONObject) {
            if (jSONObject == null) {
                throw new IllegalArgumentException("No full ad response specified.");
            }
            this.f9459b = jSONObject;
            return this;
        }
    }

    public enum c {
        COMPANION_AD,
        VIDEO
    }

    public enum d {
        IMPRESSION,
        VIDEO_CLICK,
        COMPANION_CLICK,
        VIDEO,
        COMPANION,
        INDUSTRY_ICON_IMPRESSION,
        INDUSTRY_ICON_CLICK,
        ERROR
    }

    private o7(b bVar) {
        super(bVar.f9458a, bVar.f9459b, bVar.f9460c);
        this.f9447n = bVar.f9462e;
        this.f9449p = bVar.f9464g;
        this.f9448o = bVar.f9463f;
        this.f9451r = bVar.f9465h;
        this.f9452s = bVar.f9466i;
        this.f9454u = bVar.f9467j;
        this.f9456w = bVar.f9468k;
        this.f9457x = bVar.f9469l;
        this.f9455v = new l4(this);
        Uri uriL0 = l0();
        if (uriL0 != null) {
            this.f9453t = uriL0.toString();
        } else {
            this.f9453t = "";
        }
        this.f9450q = bVar.f9461d;
    }

    public static o7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        b bVar = new b();
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "full_response", (JSONObject) null);
        if (jSONObject2 == null) {
            return null;
        }
        bVar.f9459b = jSONObject2;
        JSONObject jSONObject3 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject2, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray()), 0, (JSONObject) null);
        if (jSONObject3 == null) {
            return null;
        }
        bVar.f9458a = jSONObject3;
        bVar.f9460c = kVar;
        bVar.f9461d = JsonUtils.getLong(jSONObject, "created_at_millis", 0L);
        bVar.f9462e = JsonUtils.getString(jSONObject, "title", "");
        bVar.f9463f = JsonUtils.getString(jSONObject, "ad_description", "");
        bVar.f9464g = x7.a(JsonUtils.getJSONObject(jSONObject, "system_info", (JSONObject) null), kVar);
        bVar.f9465h = b8.a(JsonUtils.getJSONObject(jSONObject, "video_creative", (JSONObject) null), kVar);
        bVar.f9466i = r7.a(JsonUtils.getJSONObject(jSONObject, "companion_ad", (JSONObject) null), kVar);
        bVar.f9467j = q7.a(JsonUtils.getJSONObject(jSONObject, "ad_verifications", (JSONObject) null), kVar);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "impression_trackers", new JSONArray());
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            y7 y7VarA = y7.a(JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), kVar);
            if (y7VarA != null) {
                hashSet.add(y7VarA);
            }
        }
        bVar.f9468k = hashSet;
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "error_trackers", new JSONArray());
        HashSet hashSet2 = new HashSet();
        for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
            y7 y7VarA2 = y7.a(JsonUtils.getJSONObject(jSONArray2, i11, (JSONObject) null), kVar);
            if (y7VarA2 != null) {
                hashSet2.add(y7VarA2);
            }
        }
        bVar.f9469l = hashSet2;
        o7 o7Var = new o7(bVar);
        JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONObject, "cached_ad_html_resources_urls", new JSONObject());
        Iterator<String> itKeys = jSONObject4.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String string = JsonUtils.getString(jSONObject4, next, null);
            if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string)) {
                o7Var.a(next, string);
            }
        }
        return o7Var;
    }

    private Set a(c cVar, String[] strArr) {
        r7 r7Var;
        b8 b8Var;
        if (strArr == null || strArr.length <= 0) {
            return Collections.emptySet();
        }
        Map mapD = null;
        if (cVar == c.VIDEO && (b8Var = this.f9451r) != null) {
            mapD = b8Var.e();
        } else if (cVar == c.COMPANION_AD && (r7Var = this.f9452s) != null) {
            mapD = r7Var.d();
        }
        HashSet hashSet = new HashSet();
        if (mapD != null && !mapD.isEmpty()) {
            for (String str : strArr) {
                if (mapD.containsKey(str)) {
                    hashSet.addAll((Collection) mapD.get(str));
                }
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private Set h1() {
        r7 r7Var = this.f9452s;
        return r7Var != null ? r7Var.b() : Collections.emptySet();
    }

    private String k1() {
        String stringFromAdObject = getStringFromAdObject("vimp_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace("{CLCODE}", getClCode());
        }
        return null;
    }

    private Set o1() {
        b8 b8Var = this.f9451r;
        return b8Var != null ? b8Var.b() : Collections.emptySet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List s(h5 h5Var) {
        return n7.a(h5Var.a("vimp_urls", new JSONObject()), getClCode(), null, k1(), J(), N0(), this.sdk);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public List A() {
        List listA;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return (List) h5Var.a(new Function() { // from class: com.applovin.impl.xc
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f10905a.s((h5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = n7.a(getJsonObjectFromAdObject("vimp_urls", new JSONObject()), getClCode(), null, k1(), J(), N0(), this.sdk);
        }
        return listA;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean B0() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE) && f1() != null;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean C0() {
        return getBooleanFromAdObject("vast_is_streaming", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public void E0() {
    }

    @Override // com.applovin.impl.sdk.ad.b
    public String I() {
        return this.f9453t;
    }

    public Set a(d dVar, String str) {
        return a(dVar, new String[]{str});
    }

    public Set a(d dVar, String[] strArr) {
        this.sdk.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.sdk.O().a("VastAd", "Retrieving trackers of type '" + dVar + "' and events '" + Arrays.toString(strArr) + "'...");
        }
        if (dVar == d.IMPRESSION) {
            return this.f9456w;
        }
        if (dVar == d.VIDEO_CLICK) {
            return o1();
        }
        if (dVar == d.COMPANION_CLICK) {
            return h1();
        }
        if (dVar == d.VIDEO) {
            return a(c.VIDEO, strArr);
        }
        if (dVar == d.COMPANION) {
            return a(c.COMPANION_AD, strArr);
        }
        if (dVar == d.INDUSTRY_ICON_CLICK) {
            return l1().b();
        }
        if (dVar == d.INDUSTRY_ICON_IMPRESSION) {
            return l1().f();
        }
        if (dVar == d.ERROR) {
            return this.f9457x;
        }
        this.sdk.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.sdk.O().b("VastAd", "Failed to retrieve trackers of invalid type '" + dVar + "' and events '" + Arrays.toString(strArr) + "'");
        }
        return Collections.emptySet();
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putLong(jSONObject, "created_at_millis", this.f9450q);
        JsonUtils.putString(jSONObject, "title", this.f9447n);
        JsonUtils.putString(jSONObject, "ad_description", this.f9448o);
        x7 x7Var = this.f9449p;
        if (x7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "system_info", x7Var.a());
        }
        b8 b8Var = this.f9451r;
        if (b8Var != null) {
            JsonUtils.putJSONObject(jSONObject, "video_creative", b8Var.a());
        }
        r7 r7Var = this.f9452s;
        if (r7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "companion_ad", r7Var.a());
        }
        q7 q7Var = this.f9454u;
        if (q7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "ad_verifications", q7Var.a());
        }
        if (this.f9456w != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f9456w.iterator();
            while (it.hasNext()) {
                jSONArray.put(((y7) it.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "impression_trackers", jSONArray);
        }
        if (this.f9457x != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = this.f9457x.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(((y7) it2.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "error_trackers", jSONArray2);
        }
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : l().entrySet()) {
            JsonUtils.putString(jSONObject2, (String) entry.getKey(), (String) entry.getValue());
        }
        JsonUtils.putJSONObject(jSONObject, "cached_ad_html_resources_urls", jSONObject2);
        h5 h5Var = this.synchronizedFullResponse;
        if (h5Var != null) {
            JsonUtils.putJSONObject(jSONObject, "full_response", h5Var.a());
        } else {
            synchronized (this.fullResponseLock) {
                JsonUtils.putJSONObject(jSONObject, "full_response", this.fullResponse);
            }
        }
        return jSONObject;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri c0() {
        return f1();
    }

    public void d(String str) {
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            h5Var.b("html_template", str);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html_template", str);
        }
    }

    public q7 e1() {
        return this.f9454u;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7) || !super.equals(obj)) {
            return false;
        }
        o7 o7Var = (o7) obj;
        String str = this.f9447n;
        if (str == null ? o7Var.f9447n != null : !str.equals(o7Var.f9447n)) {
            return false;
        }
        String str2 = this.f9448o;
        if (str2 == null ? o7Var.f9448o != null : !str2.equals(o7Var.f9448o)) {
            return false;
        }
        x7 x7Var = this.f9449p;
        if (x7Var == null ? o7Var.f9449p != null : !x7Var.equals(o7Var.f9449p)) {
            return false;
        }
        b8 b8Var = this.f9451r;
        if (b8Var == null ? o7Var.f9451r != null : !b8Var.equals(o7Var.f9451r)) {
            return false;
        }
        r7 r7Var = this.f9452s;
        if (r7Var == null ? o7Var.f9452s != null : !r7Var.equals(o7Var.f9452s)) {
            return false;
        }
        q7 q7Var = this.f9454u;
        if (q7Var == null ? o7Var.f9454u != null : !q7Var.equals(o7Var.f9454u)) {
            return false;
        }
        Set set = this.f9456w;
        if (set == null ? o7Var.f9456w != null : !set.equals(o7Var.f9456w)) {
            return false;
        }
        Set set2 = this.f9457x;
        Set set3 = o7Var.f9457x;
        return set2 != null ? set2.equals(set3) : set3 == null;
    }

    public Uri f1() {
        b8 b8Var = this.f9451r;
        if (b8Var != null) {
            return b8Var.c();
        }
        return null;
    }

    public r7 g1() {
        return this.f9452s;
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.e4
    public l4 getAdEventTracker() {
        return this.f9455v;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getCreatedAtMillis() {
        return this.f9450q;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        return this.fullResponse;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        List listG;
        b8 b8Var = this.f9451r;
        return (b8Var == null || (listG = b8Var.g()) == null || listG.size() <= 0) ? false : true;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f9447n;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9448o;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        x7 x7Var = this.f9449p;
        int iHashCode4 = (iHashCode3 + (x7Var != null ? x7Var.hashCode() : 0)) * 31;
        b8 b8Var = this.f9451r;
        int iHashCode5 = (iHashCode4 + (b8Var != null ? b8Var.hashCode() : 0)) * 31;
        r7 r7Var = this.f9452s;
        int iHashCode6 = (iHashCode5 + (r7Var != null ? r7Var.hashCode() : 0)) * 31;
        q7 q7Var = this.f9454u;
        int iHashCode7 = (iHashCode6 + (q7Var != null ? q7Var.hashCode() : 0)) * 31;
        Set set = this.f9456w;
        int iHashCode8 = (iHashCode7 + (set != null ? set.hashCode() : 0)) * 31;
        Set set2 = this.f9457x;
        return iHashCode8 + (set2 != null ? set2.hashCode() : 0);
    }

    public String i1() {
        return getStringFromAdObject("html_template", "");
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.e4
    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject(UnifiedMediationParams.KEY_OM_SDK_ENABLED, Boolean.TRUE) && this.f9454u != null;
    }

    public c j1() {
        return "companion_ad".equalsIgnoreCase(getStringFromAdObject("vast_first_caching_operation", "companion_ad")) ? c.COMPANION_AD : c.VIDEO;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri l0() {
        c8 c8VarQ1 = q1();
        if (c8VarQ1 != null) {
            return c8VarQ1.e();
        }
        return null;
    }

    public u7 l1() {
        b8 b8Var = this.f9451r;
        if (b8Var != null) {
            return b8Var.f();
        }
        return null;
    }

    public long m1() {
        return getLongFromAdObject("real_close_delay", 0L);
    }

    public x7 n1() {
        return this.f9449p;
    }

    public b8 p1() {
        return this.f9451r;
    }

    public c8 q1() {
        Long lF = r0.f(this.sdk);
        return this.f9451r.a(lF != null ? lF.longValue() : 0L);
    }

    public boolean r1() {
        return l1() != null;
    }

    public boolean s1() {
        return getBooleanFromAdObject("vast_immediate_ad_load", Boolean.TRUE);
    }

    public void t1() {
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            h5Var.c("vast_is_streaming");
            return;
        }
        synchronized (this.adObjectLock) {
            this.adObject.remove("vast_is_streaming");
        }
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public String toString() {
        return "VastAd{title='" + this.f9447n + "', adDescription='" + this.f9448o + "', systemInfo=" + this.f9449p + ", videoCreative=" + this.f9451r + ", companionAd=" + this.f9452s + ", adVerifications=" + this.f9454u + ", impressionTrackers=" + this.f9456w + ", errorTrackers=" + this.f9457x + '}';
    }

    public boolean u1() {
        return getBooleanFromAdObject("cache_companion_ad", Boolean.TRUE);
    }

    public boolean v1() {
        return getBooleanFromAdObject("cache_video", Boolean.TRUE);
    }

    public boolean w1() {
        return getBooleanFromAdObject("vast_fire_click_trackers_on_html_clicks", Boolean.FALSE);
    }

    public boolean x1() {
        return getBooleanFromAdObject("iopms", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean y0() {
        return getBooleanFromFullResponse("is_persisted_ad", false);
    }

    public boolean y1() {
        return getBooleanFromAdObject("iopmsfsr", Boolean.TRUE);
    }
}
