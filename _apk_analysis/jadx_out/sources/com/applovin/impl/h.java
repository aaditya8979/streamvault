package com.applovin.impl;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f8390d;

    public h(int i10, int i11, int i12, int i13) {
        this.f8387a = i10;
        this.f8388b = i11;
        this.f8389c = i12;
        this.f8390d = i13;
    }

    public int a() {
        return this.f8390d;
    }

    public boolean a(Object obj) {
        return obj instanceof h;
    }

    public int b() {
        return this.f8389c;
    }

    public int c() {
        return this.f8388b;
    }

    public int d() {
        return this.f8387a;
    }

    public Map e() {
        HashMap map = new HashMap(4);
        map.put("asr_num", Integer.valueOf(this.f8387a));
        map.put("air_num", Integer.valueOf(this.f8388b));
        map.put("fsr_num", Integer.valueOf(this.f8389c));
        map.put("fir_num", Integer.valueOf(this.f8390d));
        return map;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return hVar.a(this) && d() == hVar.d() && c() == hVar.c() && b() == hVar.b() && a() == hVar.a();
    }

    public int hashCode() {
        return ((((((d() + 59) * 59) + c()) * 59) + b()) * 59) + a();
    }

    public String toString() {
        return "AdRequestNumberInfo(adUnitSessionAdRequestNumber=" + d() + ", adUnitInstallAdRequestNumber=" + c() + ", adFormatSessionAdRequestNumber=" + b() + ", adFormatInstallAdRequestNumber=" + a() + ")";
    }
}
