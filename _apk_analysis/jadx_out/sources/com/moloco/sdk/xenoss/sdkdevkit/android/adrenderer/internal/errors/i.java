package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f48082a = new i("STATIC_BANNER_AD_UNKNOWN_ERROR", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f48083b = new i("STATIC_BANNER_AD_WEBVIEW_DATA_WITH_DEFAULT_BASE_URL_ERROR", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f48084c = new i("STATIC_BANNER_AD_WEBVIEW_RECEIVED_ERROR", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f48085d = new i("STATIC_BANNER_AD_WEBVIEW_RENDER_PROCESS_GONE_ERROR", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ i[] f48086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kn.a f48087f;

    static {
        i[] iVarArrB = b();
        f48086e = iVarArrB;
        f48087f = kotlin.enums.a.a(iVarArrB);
    }

    public i(String str, int i10) {
    }

    public static final /* synthetic */ i[] b() {
        return new i[]{f48082a, f48083b, f48084c, f48085d};
    }

    @NotNull
    public static kn.a<i> c() {
        return f48087f;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f48086e.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    @NotNull
    public String a() {
        return name();
    }
}
