package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class l implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f48771a = new l("UNKNOWN_ERROR", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f48772b = new l("WEBVIEW_DATA_WITH_DEFAULT_BASE_URL_ERROR", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f48773c = new l("WEBVIEW_RECEIVED_ERROR", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f48774d = new l("WEBVIEW_REQUIRED_CONTENT_HTTP_ERROR", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f48775e = new l("WEBVIEW_RENDER_PROCESS_GONE_ERROR", 4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l f48776f = new l("WEBVIEW_TIMEOUT_ERROR", 5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l f48777g = new l("WEBVIEW_NOT_AVAILABLE_ERROR", 6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ l[] f48778h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kn.a f48779i;

    static {
        l[] lVarArrB = b();
        f48778h = lVarArrB;
        f48779i = kotlin.enums.a.a(lVarArrB);
    }

    public l(String str, int i10) {
    }

    public static final /* synthetic */ l[] b() {
        return new l[]{f48771a, f48772b, f48773c, f48774d, f48775e, f48776f, f48777g};
    }

    @NotNull
    public static kn.a<l> c() {
        return f48779i;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f48778h.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    @NotNull
    public String a() {
        return name();
    }
}
