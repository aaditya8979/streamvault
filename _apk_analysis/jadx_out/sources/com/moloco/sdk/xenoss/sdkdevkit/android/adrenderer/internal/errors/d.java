package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f48051a = new d("MRAID_WEBVIEW_CLIENT_UNRECOVERABLE_ERROR", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f48052b = new d("MRAID_WEBVIEW_CLIENT_RENDER_PROCESS_GONE_ERROR", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f48053c = new d("MRAID_WEBVIEW_LOAD_DATA_WITH_BASE_URL_ERROR", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f48054d = new d("MRAID_WEBVIEW_PAGE_DIDNT_LOAD_ERROR", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f48055e = new d("MRAID_WEBVIEW_INTERNAL_TIMEOUT_ERROR", 4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f48056f = new d("MRAID_FULLSCREEN_WEBVIEW_CLIENT_UNRECOVERABLE_ERROR", 5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f48057g = new d("MRAID_FULLSCREEN_WEBVIEW_CLIENT_RENDER_PROCESS_GONE_ERROR", 6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f48058h = new d("MRAID_FULLSCREEN_WEBVIEW_LOAD_DATA_WITH_BASE_URL_ERROR", 7);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f48059i = new d("MRAID_FULLSCREEN_WEBVIEW_PAGE_DIDNT_LOAD_ERROR", 8);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d f48060j = new d("MRAID_FULLSCREEN_AD_ACTIVITY_SHOW_FAILED_ERROR", 9);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d f48061k = new d("MRAID_BANNER_WEBVIEW_CLIENT_UNRECOVERABLE_ERROR", 10);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d f48062l = new d("MRAID_BANNER_WEBVIEW_CLIENT_RENDER_PROCESS_GONE_ERROR", 11);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d f48063m = new d("MRAID_BANNER_WEBVIEW_LOAD_DATA_WITH_BASE_URL_ERROR", 12);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final d f48064n = new d("MRAID_BANNER_WEBVIEW_PAGE_DIDNT_LOAD_ERROR", 13);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ d[] f48065o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ kn.a f48066p;

    static {
        d[] dVarArrB = b();
        f48065o = dVarArrB;
        f48066p = kotlin.enums.a.a(dVarArrB);
    }

    public d(String str, int i10) {
    }

    public static final /* synthetic */ d[] b() {
        return new d[]{f48051a, f48052b, f48053c, f48054d, f48055e, f48056f, f48057g, f48058h, f48059i, f48060j, f48061k, f48062l, f48063m, f48064n};
    }

    @NotNull
    public static kn.a<d> c() {
        return f48066p;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f48065o.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    @NotNull
    public String a() {
        return name();
    }
}
