package com.applovin.impl;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class o4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f9444b;

    private o4(String str, Map map) {
        this.f9443a = str;
        this.f9444b = map;
    }

    public static o4 a(String str) {
        return a(str, null);
    }

    public static o4 a(String str, Map map) {
        return new o4(str, map);
    }

    public Map a() {
        return this.f9444b;
    }

    public String b() {
        return this.f9443a;
    }

    public String toString() {
        return "PendingReward{result='" + this.f9443a + "'params='" + this.f9444b + "'}";
    }
}
