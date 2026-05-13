package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec;

import io.bidmachine.iab.vast.tags.VastTagName;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f50487a = new b("DisplayStarted", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f50488b = new b(VastTagName.CLICK_THROUGH, 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b[] f50489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kn.a f50490d;

    static {
        b[] bVarArrA = a();
        f50489c = bVarArrA;
        f50490d = kotlin.enums.a.a(bVarArrA);
    }

    public b(String str, int i10) {
    }

    public static final /* synthetic */ b[] a() {
        return new b[]{f50487a, f50488b};
    }

    @NotNull
    public static kn.a<b> b() {
        return f50490d;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f50489c.clone();
    }
}
