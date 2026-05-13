package com.ironsource.mediationsdk;

import android.content.Context;
import com.ironsource.Y7;
import com.unity3d.mediation.LevelPlayAdSize;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes11.dex */
public class ISBannerSize {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f32320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Y7 f32321e;
    public static final ISBannerSize BANNER = l.a("BANNER", Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50);
    public static final ISBannerSize LARGE = l.a(l.f32636b, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 90);
    public static final ISBannerSize RECTANGLE = l.a(l.f32637c, 300, 250);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ISBannerSize f32316f = l.a();
    public static final ISBannerSize SMART = l.a(l.f32639e, 0, 0);

    public ISBannerSize(int i10, int i11) {
        this("CUSTOM", i10, i11);
    }

    public ISBannerSize(String str, int i10, int i11) {
        this.f32319c = str;
        this.f32317a = i10;
        this.f32318b = i11;
        this.f32321e = new Y7(i10, i11);
    }

    public static int getMaximalAdaptiveHeight(int i10) {
        return l.b(i10);
    }

    public void a(Y7 y72) {
        if (l.a(y72, this.f32317a, this.f32318b)) {
            this.f32321e = y72;
        }
    }

    public String getDescription() {
        return this.f32319c;
    }

    public int getHeight() {
        return this.f32318b;
    }

    public int getWidth() {
        return this.f32317a;
    }

    public boolean isAdaptive() {
        return this.f32320d;
    }

    public boolean isSmart() {
        return this.f32319c.equals(l.f32639e);
    }

    public void setAdaptive(boolean z10) {
        this.f32320d = z10;
    }

    public LevelPlayAdSize toLevelPlayAdSize(Context context) {
        if (isAdaptive()) {
            return LevelPlayAdSize.createAdaptiveAdSize(context, Integer.valueOf(this.f32321e.d()));
        }
        String description = getDescription();
        description.hashCode();
        switch (description) {
            case "RECTANGLE":
            case "MEDIUM_RECTANGLE":
                return LevelPlayAdSize.MEDIUM_RECTANGLE;
            case "LARGE":
                return LevelPlayAdSize.LARGE;
            case "BANNER":
                return LevelPlayAdSize.BANNER;
            case "CUSTOM":
                return LevelPlayAdSize.createCustomSize(this.f32317a, this.f32318b);
            default:
                return LevelPlayAdSize.BANNER;
        }
    }
}
