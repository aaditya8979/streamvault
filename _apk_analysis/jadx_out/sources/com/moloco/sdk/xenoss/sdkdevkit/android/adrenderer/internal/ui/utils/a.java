package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.TextUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f49246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f49247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f49248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f49249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f49250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final RoundedCornerShape f49251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final RoundedCornerShape f49252g;

    static {
        float fM3826constructorimpl = Dp.m3826constructorimpl(24);
        f49246a = fM3826constructorimpl;
        f49247b = Dp.m3826constructorimpl(4);
        f49248c = TextUnit.INSTANCE.m4018getUnspecifiedXSAIIZE();
        f49249d = DpKt.m3848DpSizeYgX7TsA(fM3826constructorimpl, fM3826constructorimpl);
        f49250e = Color.m1618copywmQWz5c$default(Color.INSTANCE.m1649getGray0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
        f49251f = RoundedCornerShapeKt.getCircleShape();
        f49252g = RoundedCornerShapeKt.m661RoundedCornerShape0680j_4(Dp.m3826constructorimpl(8));
    }

    public static final float a() {
        return f49247b;
    }

    public static final long b() {
        return f49249d;
    }

    public static final long c() {
        return f49248c;
    }

    public static final long d() {
        return f49250e;
    }

    @NotNull
    public static final RoundedCornerShape e() {
        return f49251f;
    }

    @NotNull
    public static final RoundedCornerShape f() {
        return f49252g;
    }
}
