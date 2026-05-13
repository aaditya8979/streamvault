package com.applovin.impl;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f8137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f8138d;

    public e(String str, String str2) {
        this(str, str2, null, false);
    }

    public e(String str, String str2, Map map, boolean z10) {
        this.f8135a = str;
        this.f8136b = str2;
        this.f8137c = map;
        this.f8138d = z10;
    }

    public String a() {
        return this.f8136b;
    }

    public Map b() {
        return this.f8137c;
    }

    public String c() {
        return this.f8135a;
    }

    public boolean d() {
        return this.f8138d;
    }

    public String toString() {
        return "AdEventPostback{url='" + this.f8135a + "', backupUrl='" + this.f8136b + "', headers='" + this.f8137c + "', shouldFireInWebView='" + this.f8138d + "'}";
    }
}
