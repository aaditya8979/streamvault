package com.applovin.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class p4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f9530c;

    public p4(String str, String str2, Context context) {
        this.f9528a = str.replace("android.permission.", "");
        this.f9529b = str2;
        this.f9530c = o0.a(str, context);
    }

    public String a() {
        return this.f9529b;
    }

    public String b() {
        return this.f9528a;
    }

    public boolean c() {
        return this.f9530c;
    }
}
