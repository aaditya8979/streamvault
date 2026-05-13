package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.u4;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f10295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f10297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f10298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f10299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f10300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f10301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private u4.a f10302h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f10303i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f10304j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f10305k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f10306l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f10307m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f10308n;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f10309a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f10310b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f10311c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f10312d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map f10313e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map f10314f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Map f10315g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private u4.a f10316h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f10317i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f10318j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f10319k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f10320l;

        public b a(u4.a aVar) {
            this.f10316h = aVar;
            return this;
        }

        public b a(String str) {
            this.f10312d = str;
            return this;
        }

        public b a(Map map) {
            this.f10314f = map;
            return this;
        }

        public b a(boolean z10) {
            this.f10317i = z10;
            return this;
        }

        public d a() {
            return new d(this);
        }

        public b b(String str) {
            this.f10309a = str;
            return this;
        }

        public b b(Map map) {
            this.f10313e = map;
            return this;
        }

        public b b(boolean z10) {
            this.f10320l = z10;
            return this;
        }

        public b c(String str) {
            this.f10310b = str;
            return this;
        }

        public b c(Map map) {
            this.f10315g = map;
            return this;
        }

        public b c(boolean z10) {
            this.f10318j = z10;
            return this;
        }

        public b d(String str) {
            this.f10311c = str;
            return this;
        }

        public b d(boolean z10) {
            this.f10319k = z10;
            return this;
        }
    }

    private d(b bVar) {
        this.f10295a = UUID.randomUUID().toString();
        this.f10296b = bVar.f10310b;
        this.f10297c = bVar.f10311c;
        this.f10298d = bVar.f10312d;
        this.f10299e = bVar.f10313e;
        this.f10300f = bVar.f10314f;
        this.f10301g = bVar.f10315g;
        this.f10302h = bVar.f10316h;
        this.f10303i = bVar.f10317i;
        this.f10304j = bVar.f10318j;
        this.f10305k = bVar.f10319k;
        this.f10306l = bVar.f10320l;
        this.f10307m = bVar.f10309a;
        this.f10308n = 0;
    }

    public d(JSONObject jSONObject, k kVar) throws JSONException {
        String string = JsonUtils.getString(jSONObject, "uniqueId", UUID.randomUUID().toString());
        String string2 = JsonUtils.getString(jSONObject, "communicatorRequestId", "");
        String string3 = JsonUtils.getString(jSONObject, "httpMethod", "");
        String string4 = jSONObject.getString("targetUrl");
        String string5 = JsonUtils.getString(jSONObject, "backupUrl", "");
        int i10 = jSONObject.getInt("attemptNumber");
        Map mapSynchronizedMap = JsonUtils.valueExists(jSONObject, "parameters") ? Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("parameters"))) : new HashMap();
        Map mapSynchronizedMap2 = JsonUtils.valueExists(jSONObject, "httpHeaders") ? Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("httpHeaders"))) : new HashMap();
        Map mapSynchronizedMap3 = JsonUtils.valueExists(jSONObject, "requestBody") ? Collections.synchronizedMap(JsonUtils.toStringObjectMap(jSONObject.getJSONObject("requestBody"))) : new HashMap();
        this.f10295a = string;
        this.f10296b = string3;
        this.f10307m = string2;
        this.f10297c = string4;
        this.f10298d = string5;
        this.f10299e = mapSynchronizedMap;
        this.f10300f = mapSynchronizedMap2;
        this.f10301g = mapSynchronizedMap3;
        this.f10302h = u4.a.a(jSONObject.optInt("encodingType", u4.a.DEFAULT.b()));
        this.f10303i = jSONObject.optBoolean("isEncodingEnabled", false);
        this.f10304j = jSONObject.optBoolean("gzipBodyEncoding", false);
        this.f10305k = jSONObject.optBoolean("isAllowedPreInitEvent", false);
        this.f10306l = jSONObject.optBoolean("shouldFireInWebView", false);
        this.f10308n = i10;
    }

    public static b b() {
        return new b();
    }

    public void a() {
        Map map = CollectionUtils.map(this.f10299e);
        map.put("postback_ts", String.valueOf(System.currentTimeMillis()));
        this.f10299e = map;
    }

    public int c() {
        return this.f10308n;
    }

    public String d() {
        return this.f10298d;
    }

    public String e() {
        return this.f10307m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f10295a.equals(((d) obj).f10295a);
    }

    public u4.a f() {
        return this.f10302h;
    }

    public Map g() {
        return this.f10300f;
    }

    public String h() {
        return this.f10296b;
    }

    public int hashCode() {
        return this.f10295a.hashCode();
    }

    public Map i() {
        return this.f10299e;
    }

    public Map j() {
        return this.f10301g;
    }

    public String k() {
        return this.f10297c;
    }

    public void l() {
        this.f10308n++;
    }

    public boolean m() {
        return this.f10305k;
    }

    public boolean n() {
        return this.f10303i;
    }

    public boolean o() {
        return this.f10304j;
    }

    public boolean p() {
        return this.f10306l;
    }

    public JSONObject q() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uniqueId", this.f10295a);
        jSONObject.put("communicatorRequestId", this.f10307m);
        jSONObject.put("httpMethod", this.f10296b);
        jSONObject.put("targetUrl", this.f10297c);
        jSONObject.put("backupUrl", this.f10298d);
        jSONObject.put("encodingType", this.f10302h);
        jSONObject.put("isEncodingEnabled", this.f10303i);
        jSONObject.put("gzipBodyEncoding", this.f10304j);
        jSONObject.put("isAllowedPreInitEvent", this.f10305k);
        jSONObject.put("attemptNumber", this.f10308n);
        if (this.f10299e != null) {
            jSONObject.put("parameters", new JSONObject(this.f10299e));
        }
        if (this.f10300f != null) {
            jSONObject.put("httpHeaders", new JSONObject(this.f10300f));
        }
        if (this.f10301g != null) {
            jSONObject.put("requestBody", new JSONObject(this.f10301g));
        }
        return jSONObject;
    }

    public String toString() {
        return "PostbackRequest{uniqueId='" + this.f10295a + "', communicatorRequestId='" + this.f10307m + "', httpMethod='" + this.f10296b + "', targetUrl='" + this.f10297c + "', backupUrl='" + this.f10298d + "', attemptNumber=" + this.f10308n + ", isEncodingEnabled=" + this.f10303i + ", isGzipBodyEncoding=" + this.f10304j + ", isAllowedPreInitEvent=" + this.f10305k + ", shouldFireInWebView=" + this.f10306l + '}';
    }
}
