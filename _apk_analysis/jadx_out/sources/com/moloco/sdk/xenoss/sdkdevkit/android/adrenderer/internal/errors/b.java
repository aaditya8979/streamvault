package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f48048a = new b("FULLSCREEN_AD_SHOW_FAILED_NO_SUPPORTED_TYPE", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ b[] f48049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kn.a f48050c;

    static {
        b[] bVarArrB = b();
        f48049b = bVarArrB;
        f48050c = kotlin.enums.a.a(bVarArrB);
    }

    public b(String str, int i10) {
    }

    public static final /* synthetic */ b[] b() {
        return new b[]{f48048a};
    }

    @NotNull
    public static kn.a<b> c() {
        return f48050c;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f48049b.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    @NotNull
    public String a() {
        return name();
    }
}
