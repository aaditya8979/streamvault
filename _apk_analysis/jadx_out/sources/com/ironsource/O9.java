package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class O9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f30071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f30072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f30073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f30074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C4072i8 f30075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, String> f30076f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Hc f30077g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f30078h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f30079i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f30080j;

    public O9(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13, String str3, Map<String, String> map, Hc hc2, C4072i8 c4072i8) {
        this.f30072b = str;
        this.f30073c = str2;
        this.f30071a = z10;
        this.f30074d = z11;
        this.f30076f = map;
        this.f30077g = hc2;
        this.f30075e = c4072i8;
        this.f30079i = z12;
        this.f30080j = z13;
        this.f30078h = str3;
    }

    public Map<String, String> a() {
        HashMap map = new HashMap();
        map.put("instanceId", this.f30072b);
        map.put("instanceName", this.f30073c);
        map.put("rewarded", Boolean.toString(this.f30071a));
        map.put("inAppBidding", Boolean.toString(this.f30074d));
        map.put("isOneFlow", Boolean.toString(this.f30079i));
        map.put(C3978d4.f31198s, String.valueOf(2));
        C4072i8 c4072i8 = this.f30075e;
        map.put("width", c4072i8 != null ? Integer.toString(c4072i8.c()) : "0");
        C4072i8 c4072i82 = this.f30075e;
        map.put("height", c4072i82 != null ? Integer.toString(c4072i82.a()) : "0");
        C4072i8 c4072i83 = this.f30075e;
        map.put("label", c4072i83 != null ? c4072i83.b() : "");
        map.put(C3978d4.f31202w, Boolean.toString(i()));
        if (this.f30080j) {
            map.put("isMultipleAdObjects", "true");
        }
        String str = this.f30078h;
        if (str != null) {
            map.put("adUnitId", str);
        }
        Map<String, String> map2 = this.f30076f;
        if (map2 != null) {
            map.putAll(map2);
        }
        return map;
    }

    public void a(Hc hc2) {
        this.f30077g = hc2;
    }

    public void a(String str) {
        this.f30078h = str;
    }

    public final Hc b() {
        return this.f30077g;
    }

    public String c() {
        return this.f30078h;
    }

    public Map<String, String> d() {
        return this.f30076f;
    }

    public String e() {
        return this.f30072b;
    }

    public String f() {
        return this.f30073c.replaceAll("IronSource_", "");
    }

    public String g() {
        return this.f30073c;
    }

    public C4072i8 h() {
        return this.f30075e;
    }

    public boolean i() {
        return h() != null && h().d();
    }

    public boolean j() {
        return this.f30074d;
    }

    public boolean k() {
        return j() || m();
    }

    public boolean l() {
        return this.f30080j;
    }

    public boolean m() {
        return this.f30079i;
    }

    public boolean n() {
        return this.f30071a;
    }
}
