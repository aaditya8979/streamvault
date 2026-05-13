package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f49887a = new i("Image", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f49888b = new i("JS", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ i[] f49889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kn.a f49890d;

    static {
        i[] iVarArrA = a();
        f49889c = iVarArrA;
        f49890d = kotlin.enums.a.a(iVarArrA);
    }

    public i(String str, int i10) {
    }

    public static final /* synthetic */ i[] a() {
        return new i[]{f49887a, f49888b};
    }

    @NotNull
    public static kn.a<i> b() {
        return f49890d;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f49889c.clone();
    }
}
