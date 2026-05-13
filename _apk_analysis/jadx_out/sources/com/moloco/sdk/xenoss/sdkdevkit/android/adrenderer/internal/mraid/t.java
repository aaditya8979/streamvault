package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import androidx.webkit.Profile;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f48435b = new t("Loading", 0, "loading");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f48436c = new t(Profile.DEFAULT_PROFILE_NAME, 1, "default");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f48437d = new t("Resized", 2, "resized");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t f48438e = new t("Expanded", 3, "expanded");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t f48439f = new t("Hidden", 4, "hidden");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ t[] f48440g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kn.a f48441h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f48442a;

    static {
        t[] tVarArrA = a();
        f48440g = tVarArrA;
        f48441h = kotlin.enums.a.a(tVarArrA);
    }

    public t(String str, int i10, String str2) {
        this.f48442a = str2;
    }

    public static final /* synthetic */ t[] a() {
        return new t[]{f48435b, f48436c, f48437d, f48438e, f48439f};
    }

    @NotNull
    public static kn.a<t> b() {
        return f48441h;
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f48440g.clone();
    }

    @NotNull
    public final String c() {
        return this.f48442a;
    }
}
