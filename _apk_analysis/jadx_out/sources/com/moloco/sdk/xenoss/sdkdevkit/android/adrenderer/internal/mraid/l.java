package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import io.bidmachine.iab.vast.tags.VastTagName;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f48411a = new l("SkipOrClose", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f48412b = new l(VastTagName.CLICK_THROUGH, 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ l[] f48413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kn.a f48414d;

    static {
        l[] lVarArrA = a();
        f48413c = lVarArrA;
        f48414d = kotlin.enums.a.a(lVarArrA);
    }

    public l(String str, int i10) {
    }

    public static final /* synthetic */ l[] a() {
        return new l[]{f48411a, f48412b};
    }

    @NotNull
    public static kn.a<l> b() {
        return f48414d;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f48413c.clone();
    }
}
