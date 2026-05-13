package com.safedk.android.analytics.brandsafety;

import android.os.SystemClock;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;

/* JADX INFO: loaded from: classes8.dex */
public class RedirectDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f51830a = Long.valueOf(System.currentTimeMillis());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f51831b = Long.valueOf(SystemClock.elapsedRealtime());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f51832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BrandSafetyUtils.AdType f51833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RedirectType f51834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f51835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f51836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f51837h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RedirectDetails f51838i;

    public enum RedirectType {
        REDIRECT,
        EXPAND
    }

    public RedirectDetails(String str, BrandSafetyUtils.AdType adType, RedirectType redirectType, String str2, String str3, String str4, RedirectDetails redirectDetails) {
        this.f51832c = str;
        this.f51833d = adType;
        this.f51834e = redirectType;
        this.f51835f = str2;
        this.f51836g = str3;
        this.f51837h = str4;
        this.f51838i = redirectDetails;
    }

    public String toString() {
        return "RedirectDetails{ " + this.f51831b + ", " + this.f51832c + ", " + this.f51833d + ", " + this.f51834e + ", " + this.f51835f + ", " + this.f51836g + ", " + this.f51837h + " }";
    }
}
