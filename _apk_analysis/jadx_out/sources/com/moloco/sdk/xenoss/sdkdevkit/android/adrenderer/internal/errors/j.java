package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f48088a = new j("STATIC_FULLSCREEN_AD_UNKNOWN_ERROR", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f48089b = new j("STATIC_FULLSCREEN_AD_WEBVIEW_DATA_WITH_DEFAULT_BASE_URL_ERROR", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f48090c = new j("STATIC_FULLSCREEN_AD_WEBVIEW_RECEIVED_ERROR", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f48091d = new j("STATIC_FULLSCREEN_AD_WEBVIEW_RENDER_PROCESS_GONE_ERROR", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ j[] f48092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kn.a f48093f;

    static {
        j[] jVarArrB = b();
        f48092e = jVarArrB;
        f48093f = kotlin.enums.a.a(jVarArrB);
    }

    public j(String str, int i10) {
    }

    public static final /* synthetic */ j[] b() {
        return new j[]{f48088a, f48089b, f48090c, f48091d};
    }

    @NotNull
    public static kn.a<j> c() {
        return f48093f;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f48092e.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    @NotNull
    public String a() {
        return name();
    }
}
