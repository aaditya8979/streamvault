package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.bidmachine.iab.vast.tags.VastTagName;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f49962b = new x("XmlParsing", 0, 100);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f49963c = new x(VastTagName.WRAPPER, 1, 300);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f49964d = new x("WrapperTimeout", 2, 301);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x f49965e = new x("WrapperLimit", 3, 302);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final x f49966f = new x("WrapperNoAds", 4, 303);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final x f49967g = new x(VastTagName.LINEAR, 5, 400);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final x f49968h = new x("LinearFileNotFound", 6, 401);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final x f49969i = new x("LinearNotSupportedMedia", 7, 403);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final x f49970j = new x(VastTagName.COMPANION, 8, 600);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final x f49971k = new x("Undefined", 9, TypedValues.Custom.TYPE_INT);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ x[] f49972l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ kn.a f49973m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f49974a;

    static {
        x[] xVarArrA = a();
        f49972l = xVarArrA;
        f49973m = kotlin.enums.a.a(xVarArrA);
    }

    public x(String str, int i10, int i11) {
        this.f49974a = i11;
    }

    public static final /* synthetic */ x[] a() {
        return new x[]{f49962b, f49963c, f49964d, f49965e, f49966f, f49967g, f49968h, f49969i, f49970j, f49971k};
    }

    @NotNull
    public static kn.a<x> b() {
        return f49973m;
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f49972l.clone();
    }

    public final int c() {
        return this.f49974a;
    }
}
