package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f48120a = new l("VAST_AD_EXOPLAYER_VIDEO_LAYER_ERROR", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f48121b = new l("VAST_AD_EXOPLAYER_STYLED_PLAYER_VIEW_INFLATE_EXCEPTION_ERROR", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f48122c = new l("VAST_AD_EXOPLAYER_SET_MEDIA_ITEM_EXCEPTION_ERROR", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f48123d = new l("VAST_AD_EXOPLAYER_SET_MEDIA_FILE_NOT_EXISTS_ERROR", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ l[] f48124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kn.a f48125f;

    static {
        l[] lVarArrB = b();
        f48124e = lVarArrB;
        f48125f = kotlin.enums.a.a(lVarArrB);
    }

    public l(String str, int i10) {
    }

    public static final /* synthetic */ l[] b() {
        return new l[]{f48120a, f48121b, f48122c, f48123d};
    }

    @NotNull
    public static kn.a<l> c() {
        return f48125f;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f48124e.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    @NotNull
    public String a() {
        return name();
    }
}
