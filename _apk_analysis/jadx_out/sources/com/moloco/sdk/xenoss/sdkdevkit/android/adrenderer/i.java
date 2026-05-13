package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import io.bidmachine.iab.vast.tags.VastTagName;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f47726a = new i(VastTagName.VAST, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f47727b = new i("MRAID", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f47728c = new i("STATIC", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f47729d = new i("TEMPLATE_VAST", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f47730e = new i("TEMPLATE_MRAID", 4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f47731f = new i("TEMPLATE_STATIC", 5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ i[] f47732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kn.a f47733h;

    static {
        i[] iVarArrA = a();
        f47732g = iVarArrA;
        f47733h = kotlin.enums.a.a(iVarArrA);
    }

    public i(String str, int i10) {
    }

    public static final /* synthetic */ i[] a() {
        return new i[]{f47726a, f47727b, f47728c, f47729d, f47730e, f47731f};
    }

    @NotNull
    public static kn.a<i> b() {
        return f47733h;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f47732g.clone();
    }
}
