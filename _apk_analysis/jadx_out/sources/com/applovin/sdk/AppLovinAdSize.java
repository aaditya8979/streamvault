package com.applovin.sdk;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class AppLovinAdSize {
    public static final int SPAN = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f11222c;
    public static final AppLovinAdSize BANNER = new AppLovinAdSize(-1, 50, "BANNER");
    public static final AppLovinAdSize LEADER = new AppLovinAdSize(-1, 90, BrandSafetyUtils.f51657n);
    public static final AppLovinAdSize MREC = new AppLovinAdSize(300, 250, BrandSafetyUtils.f51658o);
    public static final AppLovinAdSize INTERSTITIAL = new AppLovinAdSize(-1, -1, BrandSafetyUtils.f51653j);
    public static final AppLovinAdSize NATIVE = new AppLovinAdSize(-1, -1, "NATIVE");

    private AppLovinAdSize(int i10, int i11, String str) {
        this.f11221b = i10;
        this.f11222c = i11;
        this.f11220a = str;
    }

    public static AppLovinAdSize fromString(String str) {
        if ("BANNER".equalsIgnoreCase(str)) {
            return BANNER;
        }
        if (BrandSafetyUtils.f51658o.equalsIgnoreCase(str)) {
            return MREC;
        }
        if (BrandSafetyUtils.f51657n.equalsIgnoreCase(str)) {
            return LEADER;
        }
        if ("INTERSTITIAL".equalsIgnoreCase(str) || BrandSafetyUtils.f51653j.equalsIgnoreCase(str)) {
            return INTERSTITIAL;
        }
        if ("NATIVE".equalsIgnoreCase(str)) {
            return NATIVE;
        }
        throw new IllegalArgumentException("Unknown Ad Size: " + str);
    }

    public int getHeight() {
        return this.f11222c;
    }

    public String getLabel() {
        return this.f11220a.toUpperCase(Locale.ENGLISH);
    }

    public int getWidth() {
        return this.f11221b;
    }

    public String toString() {
        return getLabel();
    }
}
