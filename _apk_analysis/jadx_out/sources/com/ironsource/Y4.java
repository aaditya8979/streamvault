package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class Y4 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f30697h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f30698i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f30699j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f30700k = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f30701l = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f30702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f30703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f30704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, String> f30705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f30706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f30707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private O9 f30708g;

    public Y4(O9 o92) {
        this(o92.e(), o92.g(), o92.a(), o92.b());
        this.f30708g = o92;
    }

    public Y4(String str, String str2, Map<String, String> map, Hc hc2) {
        this.f30704c = -1;
        this.f30703b = str;
        this.f30702a = str2;
        this.f30705d = map;
        this.f30706e = 0;
        this.f30707f = false;
        this.f30708g = null;
    }

    public void a() {
        Map<String, String> map = this.f30705d;
        if (map != null) {
            map.clear();
        }
        this.f30705d = null;
    }

    public void a(boolean z10) {
        this.f30707f = z10;
    }

    public boolean a(int i10) {
        return this.f30704c == i10;
    }

    public Map<String, String> b() {
        HashMap map = new HashMap();
        map.put("demandSourceId", this.f30703b);
        map.put("demandSourceName", this.f30702a);
        Map<String, String> map2 = this.f30705d;
        if (map2 != null) {
            map.putAll(map2);
        }
        return map;
    }

    public synchronized void b(int i10) {
        this.f30706e = i10;
    }

    public O9 c() {
        return this.f30708g;
    }

    public void c(int i10) {
        this.f30704c = i10;
    }

    public boolean d() {
        return this.f30707f;
    }

    public int e() {
        return this.f30706e;
    }

    public String f() {
        return this.f30702a;
    }

    public Map<String, String> g() {
        return this.f30705d;
    }

    public String h() {
        return this.f30703b;
    }

    public Hc i() {
        if (this.f30708g != null) {
            return c().b();
        }
        return null;
    }

    public int j() {
        return this.f30704c;
    }

    public boolean k() {
        Map<String, String> map = this.f30705d;
        if (map == null || !map.containsKey("rewarded")) {
            return false;
        }
        return Boolean.parseBoolean(this.f30705d.get("rewarded"));
    }
}
