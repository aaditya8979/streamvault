package com.safedk.android.analytics.brandsafety;

import android.app.Activity;
import android.os.Bundle;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes8.dex */
public class s extends c {
    boolean V;
    boolean W;
    boolean X;
    ScheduledFuture<?> Y;
    ScheduledFuture<?> Z;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    WeakReference<Activity> f52716aa;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    boolean f52717ab;

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    long f52718ac;

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    long f52719ad;

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    float f52720ae;

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    String f52721af;

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    boolean f52722ag;

    public s(String str, long j10) {
        super(str, j10, BrandSafetyUtils.AdType.NATIVE);
        this.V = false;
        this.W = false;
        this.X = false;
        this.f52717ab = false;
        this.f52718ac = 0L;
        this.f52719ad = 0L;
        this.f52720ae = 0.0f;
        this.f52721af = null;
        this.f52722ag = false;
    }

    public s(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5) {
        this(str, str2, str3, screenShotOrientation, str4, str5, BrandSafetyUtils.AdType.NATIVE);
    }

    protected s(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5, BrandSafetyUtils.AdType adType) {
        super(str, str2, str3, screenShotOrientation, str4, adType);
        this.V = false;
        this.W = false;
        this.X = false;
        this.f52717ab = false;
        this.f52718ac = 0L;
        this.f52719ad = 0L;
        this.f52720ae = 0.0f;
        this.f52721af = null;
        this.f52722ag = false;
        this.f51884q = str5;
    }

    public s(String[] strArr, String str, int i10, String str2, Bundle bundle, String str3) {
        this(strArr, str, i10, str2, bundle, str3, BrandSafetyUtils.AdType.NATIVE);
    }

    private s(String[] strArr, String str, int i10, String str2, Bundle bundle, String str3, BrandSafetyUtils.AdType adType) {
        super(strArr, i10, bundle, null, str, null, BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED, adType);
        this.V = false;
        this.W = false;
        this.X = false;
        this.f52717ab = false;
        this.f52718ac = 0L;
        this.f52719ad = 0L;
        this.f52720ae = 0.0f;
        this.f52721af = null;
        this.f52722ag = false;
        this.f52721af = str2;
        if (str3 != null) {
            this.L = str3;
        }
    }
}
