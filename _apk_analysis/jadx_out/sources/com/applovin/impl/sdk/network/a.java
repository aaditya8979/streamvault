package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.k;
import com.applovin.impl.u4;
import com.applovin.impl.x4;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f10245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f10247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f10248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final JSONObject f10249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f10250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f10251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f10252h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f10253i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f10254j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f10255k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f10256l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f10257m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f10258n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f10259o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final u4.a f10260p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f10261q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f10262r;

    /* JADX INFO: renamed from: com.applovin.impl.sdk.network.a$a, reason: collision with other inner class name */
    public static class C0156a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f10263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f10264b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f10265c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Map f10267e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public JSONObject f10268f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f10269g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f10271i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f10272j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f10273k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f10275m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f10276n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f10277o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f10278p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public u4.a f10279q;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f10270h = 1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f10274l = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Map f10266d = new HashMap();

        public C0156a(k kVar) {
            this.f10271i = ((Integer) kVar.a(x4.T2)).intValue();
            this.f10272j = ((Integer) kVar.a(x4.S2)).intValue();
            this.f10275m = ((Boolean) kVar.a(x4.f10809p3)).booleanValue();
            this.f10276n = ((Boolean) kVar.a(x4.f10769k5)).booleanValue();
            this.f10279q = u4.a.a(((Integer) kVar.a(x4.f10778l5)).intValue());
            this.f10278p = ((Boolean) kVar.a(x4.K5)).booleanValue();
        }

        public C0156a a(int i10) {
            this.f10270h = i10;
            return this;
        }

        public C0156a a(u4.a aVar) {
            this.f10279q = aVar;
            return this;
        }

        public C0156a a(Object obj) {
            this.f10269g = obj;
            return this;
        }

        public C0156a a(String str) {
            this.f10265c = str;
            return this;
        }

        public C0156a a(Map map) {
            this.f10267e = map;
            return this;
        }

        public C0156a a(JSONObject jSONObject) {
            this.f10268f = jSONObject;
            return this;
        }

        public C0156a a(boolean z10) {
            this.f10276n = z10;
            return this;
        }

        public a a() {
            return new a(this);
        }

        public C0156a b(int i10) {
            this.f10272j = i10;
            return this;
        }

        public C0156a b(String str) {
            this.f10264b = str;
            return this;
        }

        public C0156a b(Map map) {
            this.f10266d = map;
            return this;
        }

        public C0156a b(boolean z10) {
            this.f10278p = z10;
            return this;
        }

        public C0156a c(int i10) {
            this.f10271i = i10;
            return this;
        }

        public C0156a c(String str) {
            this.f10263a = str;
            return this;
        }

        public C0156a c(boolean z10) {
            this.f10273k = z10;
            return this;
        }

        public C0156a d(boolean z10) {
            this.f10274l = z10;
            return this;
        }

        public C0156a e(boolean z10) {
            this.f10275m = z10;
            return this;
        }

        public C0156a f(boolean z10) {
            this.f10277o = z10;
            return this;
        }
    }

    public a(C0156a c0156a) {
        this.f10245a = c0156a.f10264b;
        this.f10246b = c0156a.f10263a;
        this.f10247c = c0156a.f10266d;
        this.f10248d = c0156a.f10267e;
        this.f10249e = c0156a.f10268f;
        this.f10250f = c0156a.f10265c;
        this.f10251g = c0156a.f10269g;
        int i10 = c0156a.f10270h;
        this.f10252h = i10;
        this.f10253i = i10;
        this.f10254j = c0156a.f10271i;
        this.f10255k = c0156a.f10272j;
        this.f10256l = c0156a.f10273k;
        this.f10257m = c0156a.f10274l;
        this.f10258n = c0156a.f10275m;
        this.f10259o = c0156a.f10276n;
        this.f10260p = c0156a.f10279q;
        this.f10261q = c0156a.f10277o;
        this.f10262r = c0156a.f10278p;
    }

    public static C0156a a(k kVar) {
        return new C0156a(kVar);
    }

    public String a() {
        return this.f10250f;
    }

    public void a(int i10) {
        this.f10253i = i10;
    }

    public void a(String str) {
        this.f10245a = str;
    }

    public JSONObject b() {
        return this.f10249e;
    }

    public void b(String str) {
        this.f10246b = str;
    }

    public int c() {
        return this.f10252h - this.f10253i;
    }

    public Object d() {
        return this.f10251g;
    }

    public u4.a e() {
        return this.f10260p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f10245a;
        if (str == null ? aVar.f10245a != null : !str.equals(aVar.f10245a)) {
            return false;
        }
        Map map = this.f10247c;
        if (map == null ? aVar.f10247c != null : !map.equals(aVar.f10247c)) {
            return false;
        }
        Map map2 = this.f10248d;
        if (map2 == null ? aVar.f10248d != null : !map2.equals(aVar.f10248d)) {
            return false;
        }
        String str2 = this.f10250f;
        if (str2 == null ? aVar.f10250f != null : !str2.equals(aVar.f10250f)) {
            return false;
        }
        String str3 = this.f10246b;
        if (str3 == null ? aVar.f10246b != null : !str3.equals(aVar.f10246b)) {
            return false;
        }
        JSONObject jSONObject = this.f10249e;
        if (jSONObject == null ? aVar.f10249e != null : !jSONObject.equals(aVar.f10249e)) {
            return false;
        }
        Object obj2 = this.f10251g;
        if (obj2 == null ? aVar.f10251g == null : obj2.equals(aVar.f10251g)) {
            return this.f10252h == aVar.f10252h && this.f10253i == aVar.f10253i && this.f10254j == aVar.f10254j && this.f10255k == aVar.f10255k && this.f10256l == aVar.f10256l && this.f10257m == aVar.f10257m && this.f10258n == aVar.f10258n && this.f10259o == aVar.f10259o && this.f10260p == aVar.f10260p && this.f10261q == aVar.f10261q && this.f10262r == aVar.f10262r;
        }
        return false;
    }

    public String f() {
        return this.f10245a;
    }

    public Map g() {
        return this.f10248d;
    }

    public String h() {
        return this.f10246b;
    }

    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f10245a;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f10250f;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f10246b;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Object obj = this.f10251g;
        int iHashCode5 = ((((((((((((((((((((((iHashCode4 + (obj != null ? obj.hashCode() : 0)) * 31) + this.f10252h) * 31) + this.f10253i) * 31) + this.f10254j) * 31) + this.f10255k) * 31) + (this.f10256l ? 1 : 0)) * 31) + (this.f10257m ? 1 : 0)) * 31) + (this.f10258n ? 1 : 0)) * 31) + (this.f10259o ? 1 : 0)) * 31) + this.f10260p.b()) * 31) + (this.f10261q ? 1 : 0)) * 31) + (this.f10262r ? 1 : 0);
        Map map = this.f10247c;
        if (map != null) {
            iHashCode5 = (iHashCode5 * 31) + map.hashCode();
        }
        Map map2 = this.f10248d;
        if (map2 != null) {
            iHashCode5 = (iHashCode5 * 31) + map2.hashCode();
        }
        JSONObject jSONObject = this.f10249e;
        if (jSONObject == null) {
            return iHashCode5;
        }
        char[] charArray = jSONObject.toString().toCharArray();
        Arrays.sort(charArray);
        return (iHashCode5 * 31) + new String(charArray).hashCode();
    }

    public Map i() {
        return this.f10247c;
    }

    public int j() {
        return this.f10253i;
    }

    public int k() {
        return this.f10255k;
    }

    public int l() {
        return this.f10254j;
    }

    public boolean m() {
        return this.f10259o;
    }

    public boolean n() {
        return this.f10256l;
    }

    public boolean o() {
        return this.f10262r;
    }

    public boolean p() {
        return this.f10257m;
    }

    public boolean q() {
        return this.f10258n;
    }

    public boolean r() {
        return this.f10261q;
    }

    public String toString() {
        return "HttpRequest {endpoint=" + this.f10245a + ", backupEndpoint=" + this.f10250f + ", httpMethod=" + this.f10246b + ", httpHeaders=" + this.f10248d + ", body=" + this.f10249e + ", emptyResponse=" + this.f10251g + ", initialRetryAttempts=" + this.f10252h + ", retryAttemptsLeft=" + this.f10253i + ", timeoutMillis=" + this.f10254j + ", retryDelayMillis=" + this.f10255k + ", exponentialRetries=" + this.f10256l + ", retryOnAllErrors=" + this.f10257m + ", retryOnNoConnection=" + this.f10258n + ", encodingEnabled=" + this.f10259o + ", encodingType=" + this.f10260p + ", trackConnectionSpeed=" + this.f10261q + ", gzipBodyEncoding=" + this.f10262r + '}';
    }
}
