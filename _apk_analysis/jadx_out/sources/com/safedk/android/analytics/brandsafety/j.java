package com.safedk.android.analytics.brandsafety;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;

/* JADX INFO: loaded from: classes8.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f52619a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f52620b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f52621c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f52622d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f52623e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    BrandSafetyUtils.ScreenShotOrientation f52624f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f52625g = false;

    public j(String str, String str2, long j10, int i10, int i11, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, boolean z10) {
        a(str, str2, j10, i10, i11, screenShotOrientation, z10);
    }

    public j(String str, String str2, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation) {
        a(str, str2, 0L, 0, 0, screenShotOrientation, false);
    }

    private void a(String str, String str2, long j10, int i10, int i11, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, boolean z10) {
        this.f52619a = str;
        this.f52620b = str2;
        this.f52621c = j10;
        this.f52622d = i10;
        this.f52623e = i11;
        this.f52624f = screenShotOrientation;
        this.f52625g = z10;
    }

    public float a(int i10) {
        return (this.f52622d * 100) / i10;
    }

    public String toString() {
        return "fileName=" + this.f52620b + ", hashValue=" + this.f52619a;
    }
}
