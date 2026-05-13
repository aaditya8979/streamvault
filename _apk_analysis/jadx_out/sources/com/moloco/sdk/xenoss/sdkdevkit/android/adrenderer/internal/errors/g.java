package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f48075a = new g("STATIC_AD_UNKNOWN_ERROR", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f48076b = new g("STATIC_AD_WEBVIEW_DATA_WITH_DEFAULT_BASE_URL_ERROR", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f48077c = new g("STATIC_AD_WEBVIEW_RECEIVED_ERROR", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f48078d = new g("STATIC_AD_WEBVIEW_RENDER_PROCESS_GONE_ERROR", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ g[] f48079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kn.a f48080f;

    static {
        g[] gVarArrB = b();
        f48079e = gVarArrB;
        f48080f = kotlin.enums.a.a(gVarArrB);
    }

    public g(String str, int i10) {
    }

    public static final /* synthetic */ g[] b() {
        return new g[]{f48075a, f48076b, f48077c, f48078d};
    }

    @NotNull
    public static kn.a<g> c() {
        return f48080f;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f48079e.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    @NotNull
    public String a() {
        return name();
    }
}
