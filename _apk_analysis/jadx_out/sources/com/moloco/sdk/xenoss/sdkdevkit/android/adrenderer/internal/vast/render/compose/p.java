package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.TextUnit;
import com.moloco.sdk.R$drawable;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.z;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class p {
    @Composable
    @NotNull
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.z a(@Nullable Painter painter, long j10, @Nullable Shape shape, long j11, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-571269297);
        Painter painterPainterResource = (i11 & 1) != 0 ? PainterResources_androidKt.painterResource(R$drawable.ic_round_skip_next_24, composer, 0) : painter;
        long jB = (i11 & 2) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.b() : j10;
        Shape shapeE = (i11 & 4) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.e() : shape;
        long jD = (i11 & 8) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d() : j11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-571269297, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.adSkipAfterCountdownIcon (DefaultAdSkipCountdownButton.kt:54)");
        }
        z.b bVar = new z.b(painterPainterResource, "Skip", jB, shapeE, jD, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bVar;
    }

    @Composable
    @NotNull
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.z b(@Nullable String str, @Nullable Painter painter, long j10, @Nullable Shape shape, long j11, boolean z10, boolean z11, long j12, long j13, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(1328580925);
        String str2 = (i11 & 1) != 0 ? "play store" : str;
        Painter painterPainterResource = (i11 & 2) != 0 ? PainterResources_androidKt.painterResource(R$drawable.double_arrow_24, composer, 0) : painter;
        long jB = (i11 & 4) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.b() : j10;
        Shape shapeF = (i11 & 8) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.f() : shape;
        long jD = (i11 & 16) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d() : j11;
        boolean z12 = (i11 & 32) != 0 ? true : z10;
        boolean z13 = (i11 & 64) != 0 ? true : z11;
        long jM4018getUnspecifiedXSAIIZE = (i11 & 256) != 0 ? TextUnit.INSTANCE.m4018getUnspecifiedXSAIIZE() : j13;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1328580925, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.adSkipAfterCountdownTextIcon (DefaultAdSkipCountdownButton.kt:73)");
        }
        z.d dVar = new z.d(str2, painterPainterResource, str2, jB, shapeF, jD, z12, z13, j12, jM4018getUnspecifiedXSAIIZE, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return dVar;
    }

    @Composable
    @NotNull
    public static final sn.c<BoxScope, Boolean, Boolean, sn.a<bn.r>, sn.l<? super a.AbstractC0696a.c, bn.r>, Boolean, bn.k, bn.k, sn.a<bn.r>, Composer, Integer, bn.r> c(@Nullable Alignment alignment, @Nullable PaddingValues paddingValues, long j10, long j11, long j12, @Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.z zVar, @Nullable sn.a<bn.r> aVar, @Nullable com.moloco.sdk.internal.ortb.model.k kVar, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(1043664790);
        Alignment topEnd = (i11 & 1) != 0 ? Alignment.INSTANCE.getTopEnd() : alignment;
        PaddingValues paddingValuesM404PaddingValues0680j_4 = (i11 & 2) != 0 ? PaddingKt.m404PaddingValues0680j_4(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.a()) : paddingValues;
        long jM967getPrimary0d7_KjU = (i11 & 4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m967getPrimary0d7_KjU() : j10;
        long jB = (i11 & 8) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.b() : j11;
        long jC = (i11 & 16) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.c() : j12;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.z zVarA = (i11 & 32) != 0 ? a(null, 0L, null, 0L, composer, 0, 15) : zVar;
        sn.a<bn.r> aVar2 = (i11 & 64) != 0 ? null : aVar;
        com.moloco.sdk.internal.ortb.model.k kVar2 = (i11 & 128) == 0 ? kVar : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1043664790, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultAdSkipCountdownButton (DefaultAdSkipCountdownButton.kt:36)");
        }
        int i12 = i10 << 3;
        sn.c<BoxScope, Boolean, Boolean, sn.a<bn.r>, sn.l<? super a.AbstractC0696a.c, bn.r>, Boolean, bn.k, bn.k, sn.a<bn.r>, Composer, Integer, bn.r> cVarA = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.m.a(topEnd, paddingValuesM404PaddingValues0680j_4, jM967getPrimary0d7_KjU, jB, jC, zVarA, a.AbstractC0696a.c.EnumC0698a.f50945c, aVar2, kVar2, composer, (i10 & 14) | 1572864 | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (29360128 & i12) | (i12 & 234881024));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return cVarA;
    }
}
