package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f48068a = new f("NATIVE_AD_ORTB_RESPONSE_NULL_ERROR", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f48069b = new f("NATIVE_AD_IMAGE_ASSET_MEDIA_FETCH_ERROR", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f48070c = new f("NATIVE_AD_IMAGE_PREPARE_ASSET_UNKNOWN_ERROR", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f48071d = new f("NATIVE_AD_VIDEO_ASSET_MEDIA_NOT_ENOUGH_ERROR", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f48072e = new f("NATIVE_AD_VIDEO_ASSET_MEDIA_FETCH_ERROR", 4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ f[] f48073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kn.a f48074g;

    static {
        f[] fVarArrB = b();
        f48073f = fVarArrB;
        f48074g = kotlin.enums.a.a(fVarArrB);
    }

    public f(String str, int i10) {
    }

    public static final /* synthetic */ f[] b() {
        return new f[]{f48068a, f48069b, f48070c, f48071d, f48072e};
    }

    @NotNull
    public static kn.a<f> c() {
        return f48074g;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f48073f.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    @NotNull
    public String a() {
        return name();
    }
}
