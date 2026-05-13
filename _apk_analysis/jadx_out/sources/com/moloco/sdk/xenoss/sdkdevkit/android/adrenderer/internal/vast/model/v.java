package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import io.bidmachine.iab.vast.tags.VastTagName;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f49944a = new v("CreativeView", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f49945b = new v("Start", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f49946c = new v("FirstQuartile", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f49947d = new v("Midpoint", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v f49948e = new v("ThirdQuartile", 4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v f49949f = new v("Complete", 5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v f49950g = new v(VastTagName.MUTE, 6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v f49951h = new v("UnMute", 7);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v f49952i = new v("Pause", 8);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final v f49953j = new v("Rewind", 9);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final v f49954k = new v("Resume", 10);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final v f49955l = new v("CloseLinear", 11);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final v f49956m = new v("Skip", 12);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final v f49957n = new v(VastTagName.PROGRESS, 13);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ v[] f49958o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ kn.a f49959p;

    static {
        v[] vVarArrA = a();
        f49958o = vVarArrA;
        f49959p = kotlin.enums.a.a(vVarArrA);
    }

    public v(String str, int i10) {
    }

    public static final /* synthetic */ v[] a() {
        return new v[]{f49944a, f49945b, f49946c, f49947d, f49948e, f49949f, f49950g, f49951h, f49952i, f49953j, f49954k, f49955l, f49956m, f49957n};
    }

    @NotNull
    public static kn.a<v> b() {
        return f49959p;
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f49958o.clone();
    }
}
