package com.moloco.sdk.internal;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import com.moloco.sdk.R$drawable;
import com.moloco.sdk.internal.ortb.model.C;
import com.moloco.sdk.internal.ortb.model.C4377a;
import com.moloco.sdk.internal.ortb.model.C4378b;
import com.moloco.sdk.internal.ortb.model.C4379c;
import com.moloco.sdk.internal.ortb.model.D;
import com.moloco.sdk.internal.ortb.model.E;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final bn.g f46059a = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.internal.g
        @Override // sn.a
        public final Object invoke() {
            return h.m();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f46060b = Color.INSTANCE.m1656getWhite0d7_KjU();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f46061c = f0.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f46062d;

    public static final class a implements sn.p<Composer, Integer, sn.c<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.a<? extends bn.r>, ? super sn.l<? super a.AbstractC0696a.c, ? extends bn.r>, ? super Boolean, ? super bn.k, ? super bn.k, ? super sn.a<? extends bn.r>, ? super Composer, ? super Integer, ? extends bn.r>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C f46063b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.u f46064c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.k f46065d;

        public a(C c10, com.moloco.sdk.internal.ortb.model.u uVar, com.moloco.sdk.internal.ortb.model.k kVar) {
            this.f46063b = c10;
            this.f46064c = uVar;
            this.f46065d = kVar;
        }

        @Composable
        public final sn.c<BoxScope, Boolean, Boolean, sn.a<bn.r>, sn.l<? super a.AbstractC0696a.c, bn.r>, Boolean, bn.k, bn.k, sn.a<bn.r>, Composer, Integer, bn.r> a(Composer composer, int i10) {
            Color colorD;
            composer.startReplaceableGroup(-1625076729);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1625076729, i10, -1, "com.moloco.sdk.internal.determineSkipCloseBehaviorFromDec.<anonymous> (AggregatedOptions.kt:241)");
            }
            float fM3826constructorimpl = Dp.m3826constructorimpl(this.f46063b.d());
            long jM3848DpSizeYgX7TsA = DpKt.m3848DpSizeYgX7TsA(fM3826constructorimpl, fM3826constructorimpl);
            com.moloco.sdk.internal.ortb.model.u uVar = this.f46064c;
            long jF = (uVar == null || (colorD = uVar.d()) == null) ? this.f46063b.f() : colorD.m1629unboximpl();
            Alignment alignmentA = h.a(this.f46063b.g(), this.f46063b.i());
            PaddingValues paddingValuesM404PaddingValues0680j_4 = PaddingKt.m404PaddingValues0680j_4(Dp.m3826constructorimpl(this.f46063b.h()));
            long sp2 = TextUnitKt.getSp(this.f46063b.d());
            TextUnitKt.m4020checkArithmeticR2X_6o(sp2);
            long jPack = TextUnitKt.pack(TextUnit.m4005getRawTypeimpl(sp2), TextUnit.m4007getValueimpl(sp2) / 2);
            long jM3929timesGh9hcWk = DpSize.m3929timesGh9hcWk(jM3848DpSizeYgX7TsA, 0.4f);
            Color colorC = this.f46063b.c();
            sn.c<BoxScope, Boolean, Boolean, sn.a<bn.r>, sn.l<? super a.AbstractC0696a.c, bn.r>, Boolean, bn.k, bn.k, sn.a<bn.r>, Composer, Integer, bn.r> cVarC = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.p.c(alignmentA, paddingValuesM404PaddingValues0680j_4, jF, jM3848DpSizeYgX7TsA, jPack, h.k(jM3929timesGh9hcWk, colorC != null ? colorC.m1629unboximpl() : h.f46060b, jF, this.f46064c, composer, 0), null, this.f46065d, composer, 0, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return cVarC;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ sn.c<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.a<? extends bn.r>, ? super sn.l<? super a.AbstractC0696a.c, ? extends bn.r>, ? super Boolean, ? super bn.k, ? super bn.k, ? super sn.a<? extends bn.r>, ? super Composer, ? super Integer, ? extends bn.r> mo2invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    public static final class b implements sn.p<Composer, Integer, sn.c<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.a<? extends bn.r>, ? super sn.l<? super a.AbstractC0696a.c, ? extends bn.r>, ? super Boolean, ? super bn.k, ? super bn.k, ? super sn.a<? extends bn.r>, ? super Composer, ? super Integer, ? extends bn.r>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f46066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C f46067c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.k f46068d;

        public b(boolean z10, C c10, com.moloco.sdk.internal.ortb.model.k kVar) {
            this.f46066b = z10;
            this.f46067c = c10;
            this.f46068d = kVar;
        }

        @Composable
        public final sn.c<BoxScope, Boolean, Boolean, sn.a<bn.r>, sn.l<? super a.AbstractC0696a.c, bn.r>, Boolean, bn.k, bn.k, sn.a<bn.r>, Composer, Integer, bn.r> a(Composer composer, int i10) {
            sn.c<BoxScope, Boolean, Boolean, sn.a<bn.r>, sn.l<? super a.AbstractC0696a.c, bn.r>, Boolean, bn.k, bn.k, sn.a<bn.r>, Composer, Integer, bn.r> cVarB;
            composer.startReplaceableGroup(1846302992);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1846302992, i10, -1, "com.moloco.sdk.internal.toCloseButton.<anonymous> (AggregatedOptions.kt:262)");
            }
            if (this.f46066b) {
                cVarB = null;
            } else {
                float fM3826constructorimpl = Dp.m3826constructorimpl(this.f46067c.d());
                long jM3848DpSizeYgX7TsA = DpKt.m3848DpSizeYgX7TsA(fM3826constructorimpl, fM3826constructorimpl);
                Alignment alignmentA = h.a(this.f46067c.g(), this.f46067c.i());
                PaddingValues paddingValuesM404PaddingValues0680j_4 = PaddingKt.m404PaddingValues0680j_4(Dp.m3826constructorimpl(this.f46067c.h()));
                long jF = this.f46067c.f();
                long sp2 = TextUnitKt.getSp(this.f46067c.d());
                TextUnitKt.m4020checkArithmeticR2X_6o(sp2);
                long jPack = TextUnitKt.pack(TextUnit.m4005getRawTypeimpl(sp2), TextUnit.m4007getValueimpl(sp2) / 2);
                Painter painterPainterResource = PainterResources_androidKt.painterResource(R$drawable.moloco_close, composer, 0);
                long jM3929timesGh9hcWk = DpSize.m3929timesGh9hcWk(jM3848DpSizeYgX7TsA, 0.45f);
                Color colorC = this.f46067c.c();
                cVarB = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d0.b(alignmentA, paddingValuesM404PaddingValues0680j_4, jF, jM3848DpSizeYgX7TsA, jPack, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d0.a(painterPainterResource, jM3929timesGh9hcWk, null, colorC != null ? colorC.m1629unboximpl() : h.f46060b, composer, 0, 4), null, this.f46068d, composer, 0, 64);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return cVarB;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ sn.c<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.a<? extends bn.r>, ? super sn.l<? super a.AbstractC0696a.c, ? extends bn.r>, ? super Boolean, ? super bn.k, ? super bn.k, ? super sn.a<? extends bn.r>, ? super Composer, ? super Integer, ? extends bn.r> mo2invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    public static final class c implements sn.p<Composer, Integer, sn.u<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.p<? super a.AbstractC0696a.c, ? super a.AbstractC0696a.c.EnumC0698a, ? extends bn.r>, ? super sn.l<? super Boolean, ? extends bn.r>, ? super Composer, ? super Integer, ? extends bn.r>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.y f46069b;

        public c(com.moloco.sdk.internal.ortb.model.y yVar) {
            this.f46069b = yVar;
        }

        @Composable
        public final sn.u<BoxScope, Boolean, Boolean, sn.p<? super a.AbstractC0696a.c, ? super a.AbstractC0696a.c.EnumC0698a, bn.r>, sn.l<? super Boolean, bn.r>, Composer, Integer, bn.r> a(Composer composer, int i10) {
            long jM3848DpSizeYgX7TsA;
            composer.startReplaceableGroup(1012987991);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1012987991, i10, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:80)");
            }
            if (this.f46069b.j().d() != null) {
                float fM3826constructorimpl = Dp.m3826constructorimpl(r1.f());
                jM3848DpSizeYgX7TsA = DpKt.m3848DpSizeYgX7TsA(fM3826constructorimpl, fM3826constructorimpl);
            } else {
                jM3848DpSizeYgX7TsA = h.f46062d;
            }
            Alignment alignmentA = h.a(this.f46069b.j().f(), this.f46069b.j().i());
            PaddingValues paddingValuesM404PaddingValues0680j_4 = PaddingKt.m404PaddingValues0680j_4(Dp.m3826constructorimpl(this.f46069b.j().h()));
            long jM3929timesGh9hcWk = DpSize.m3929timesGh9hcWk(jM3848DpSizeYgX7TsA, 0.6f);
            long jE = this.f46069b.j().e();
            Color colorC = this.f46069b.j().c();
            sn.u<BoxScope, Boolean, Boolean, sn.p<? super a.AbstractC0696a.c, ? super a.AbstractC0696a.c.EnumC0698a, bn.r>, sn.l<? super Boolean, bn.r>, Composer, Integer, bn.r> uVarG = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n.g(jM3848DpSizeYgX7TsA, jM3929timesGh9hcWk, null, colorC != null ? colorC.m1629unboximpl() : h.f46060b, alignmentA, paddingValuesM404PaddingValues0680j_4, jE, PainterResources_androidKt.painterResource(R$drawable.moloco_volume_off, composer, 0), PainterResources_androidKt.painterResource(R$drawable.moloco_volume_on, composer, 0), null, composer, 0, 516);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return uVarG;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ sn.u<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.p<? super a.AbstractC0696a.c, ? super a.AbstractC0696a.c.EnumC0698a, ? extends bn.r>, ? super sn.l<? super Boolean, ? extends bn.r>, ? super Composer, ? super Integer, ? extends bn.r> mo2invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    public static final class d implements sn.p<Composer, Integer, sn.c<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.a<? extends bn.r>, ? super sn.l<? super a.AbstractC0696a.c, ? extends bn.r>, ? super Boolean, ? super bn.k, ? super bn.k, ? super sn.a<? extends bn.r>, ? super Composer, ? super Integer, ? extends bn.r>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.y f46070b;

        public d(com.moloco.sdk.internal.ortb.model.y yVar) {
            this.f46070b = yVar;
        }

        @Composable
        public final sn.c<BoxScope, Boolean, Boolean, sn.a<bn.r>, sn.l<? super a.AbstractC0696a.c, bn.r>, Boolean, bn.k, bn.k, sn.a<bn.r>, Composer, Integer, bn.r> a(Composer composer, int i10) {
            sn.c<BoxScope, Boolean, Boolean, sn.a<bn.r>, sn.l<? super a.AbstractC0696a.c, bn.r>, Boolean, bn.k, bn.k, sn.a<bn.r>, Composer, Integer, bn.r> cVarC;
            Color colorD;
            composer.startReplaceableGroup(-474197615);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-474197615, i10, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:95)");
            }
            C cL = this.f46070b.l();
            if (cL == null) {
                cVarC = null;
            } else {
                com.moloco.sdk.internal.ortb.model.y yVar = this.f46070b;
                float fM3826constructorimpl = Dp.m3826constructorimpl(cL.d());
                long jM3848DpSizeYgX7TsA = DpKt.m3848DpSizeYgX7TsA(fM3826constructorimpl, fM3826constructorimpl);
                com.moloco.sdk.internal.ortb.model.u uVarI = yVar.i();
                long jF = (uVarI == null || (colorD = uVarI.d()) == null) ? cL.f() : colorD.m1629unboximpl();
                Alignment alignmentA = h.a(cL.g(), cL.i());
                PaddingValues paddingValuesM404PaddingValues0680j_4 = PaddingKt.m404PaddingValues0680j_4(Dp.m3826constructorimpl(cL.h()));
                long sp2 = TextUnitKt.getSp(cL.d());
                TextUnitKt.m4020checkArithmeticR2X_6o(sp2);
                long jPack = TextUnitKt.pack(TextUnit.m4005getRawTypeimpl(sp2), TextUnit.m4007getValueimpl(sp2) / 2);
                long jM3929timesGh9hcWk = DpSize.m3929timesGh9hcWk(jM3848DpSizeYgX7TsA, 0.4f);
                Color colorC = cL.c();
                cVarC = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.p.c(alignmentA, paddingValuesM404PaddingValues0680j_4, jF, jM3848DpSizeYgX7TsA, jPack, h.k(jM3929timesGh9hcWk, colorC != null ? colorC.m1629unboximpl() : h.f46060b, jF, yVar.i(), composer, 0), null, yVar.f(), composer, 0, 64);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return cVarC;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ sn.c<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.a<? extends bn.r>, ? super sn.l<? super a.AbstractC0696a.c, ? extends bn.r>, ? super Boolean, ? super bn.k, ? super bn.k, ? super sn.a<? extends bn.r>, ? super Composer, ? super Integer, ? extends bn.r> mo2invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    public static final class e implements sn.p<Composer, Integer, sn.c<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.a<? extends bn.r>, ? super sn.l<? super a.AbstractC0696a.c, ? extends bn.r>, ? super Boolean, ? super bn.k, ? super bn.k, ? super sn.a<? extends bn.r>, ? super Composer, ? super Integer, ? extends bn.r>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.y f46071b;

        public e(com.moloco.sdk.internal.ortb.model.y yVar) {
            this.f46071b = yVar;
        }

        @Composable
        public final sn.c<BoxScope, Boolean, Boolean, sn.a<bn.r>, sn.l<? super a.AbstractC0696a.c, bn.r>, Boolean, bn.k, bn.k, sn.a<bn.r>, Composer, Integer, bn.r> a(Composer composer, int i10) {
            sn.c<BoxScope, Boolean, Boolean, sn.a<bn.r>, sn.l<? super a.AbstractC0696a.c, bn.r>, Boolean, bn.k, bn.k, sn.a<bn.r>, Composer, Integer, bn.r> cVarC;
            composer.startReplaceableGroup(-606521360);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-606521360, i10, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:116)");
            }
            C cL = this.f46071b.l();
            if (cL == null) {
                cVarC = null;
            } else {
                com.moloco.sdk.internal.ortb.model.y yVar = this.f46071b;
                float fM3826constructorimpl = Dp.m3826constructorimpl(cL.d());
                long jM3848DpSizeYgX7TsA = DpKt.m3848DpSizeYgX7TsA(fM3826constructorimpl, fM3826constructorimpl);
                Alignment alignmentA = h.a(cL.g(), cL.i());
                PaddingValues paddingValuesM404PaddingValues0680j_4 = PaddingKt.m404PaddingValues0680j_4(Dp.m3826constructorimpl(cL.h()));
                long jF = cL.f();
                long sp2 = TextUnitKt.getSp(cL.d());
                TextUnitKt.m4020checkArithmeticR2X_6o(sp2);
                long jPack = TextUnitKt.pack(TextUnit.m4005getRawTypeimpl(sp2), TextUnit.m4007getValueimpl(sp2) / 2);
                Painter painterPainterResource = PainterResources_androidKt.painterResource(R$drawable.moloco_skip, composer, 0);
                long jM3929timesGh9hcWk = DpSize.m3929timesGh9hcWk(jM3848DpSizeYgX7TsA, 0.4f);
                Color colorC = cL.c();
                cVarC = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.p.c(alignmentA, paddingValuesM404PaddingValues0680j_4, jF, jM3848DpSizeYgX7TsA, jPack, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.p.a(painterPainterResource, jM3929timesGh9hcWk, null, colorC != null ? colorC.m1629unboximpl() : h.f46060b, composer, 0, 4), null, yVar.f(), composer, 0, 64);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return cVarC;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ sn.c<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.a<? extends bn.r>, ? super sn.l<? super a.AbstractC0696a.c, ? extends bn.r>, ? super Boolean, ? super bn.k, ? super bn.k, ? super sn.a<? extends bn.r>, ? super Composer, ? super Integer, ? extends bn.r> mo2invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    public static final class f implements sn.p<Composer, Integer, sn.u<? super BoxScope, ? super Boolean, ? super go.u<? extends i.a>, ? super sn.l<? super a.AbstractC0696a.c, ? extends bn.r>, ? super sn.a<? extends bn.r>, ? super Composer, ? super Integer, ? extends bn.r>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f46072b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.y f46073c;

        public f(boolean z10, com.moloco.sdk.internal.ortb.model.y yVar) {
            this.f46072b = z10;
            this.f46073c = yVar;
        }

        @Composable
        public final sn.u<BoxScope, Boolean, go.u<? extends i.a>, sn.l<? super a.AbstractC0696a.c, bn.r>, sn.a<bn.r>, Composer, Integer, bn.r> a(Composer composer, int i10) {
            sn.u<BoxScope, Boolean, go.u<? extends i.a>, sn.l<? super a.AbstractC0696a.c, bn.r>, sn.a<bn.r>, Composer, Integer, bn.r> uVarC;
            com.moloco.sdk.internal.ortb.model.i iVarG;
            composer.startReplaceableGroup(483693011);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(483693011, i10, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:134)");
            }
            if (this.f46072b || (iVarG = this.f46073c.g()) == null) {
                uVarC = null;
            } else {
                Alignment alignmentA = h.a(iVarG.e(), iVarG.i());
                PaddingValues paddingValuesM404PaddingValues0680j_4 = PaddingKt.m404PaddingValues0680j_4(Dp.m3826constructorimpl(iVarG.g()));
                String strH = iVarG.h();
                long jD = iVarG.d();
                Color colorC = iVarG.c();
                uVarC = f0.c(alignmentA, paddingValuesM404PaddingValues0680j_4, strH, jD, colorC != null ? colorC.m1629unboximpl() : f0.a(), iVarG.f(), composer, 0, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return uVarC;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ sn.u<? super BoxScope, ? super Boolean, ? super go.u<? extends i.a>, ? super sn.l<? super a.AbstractC0696a.c, ? extends bn.r>, ? super sn.a<? extends bn.r>, ? super Composer, ? super Integer, ? extends bn.r> mo2invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    public static final class g implements sn.p<Composer, Integer, sn.s<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, ? extends bn.r>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f46074b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.y f46075c;

        public g(boolean z10, com.moloco.sdk.internal.ortb.model.y yVar) {
            this.f46074b = z10;
            this.f46075c = yVar;
        }

        @Composable
        public final sn.s<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Composer, Integer, bn.r> a(Composer composer, int i10) {
            com.moloco.sdk.internal.ortb.model.z zVarK;
            composer.startReplaceableGroup(830314579);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(830314579, i10, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:152)");
            }
            sn.s<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Composer, Integer, bn.r> sVarF = (this.f46074b || (zVarK = this.f46075c.k()) == null) ? null : com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n.f(h.a(zVarK.d(), zVarK.f()), PaddingKt.m404PaddingValues0680j_4(Dp.m3826constructorimpl(zVarK.e())), zVarK.c(), composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return sVarF;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ sn.s<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, ? extends bn.r> mo2invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.h$h, reason: collision with other inner class name */
    public static final class C0558h implements sn.p<Composer, Integer, sn.t<? super BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super sn.a<? extends bn.r>, ? super sn.a<? extends bn.r>, ? super Composer, ? super Integer, ? extends bn.r>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.y f46076b;

        public C0558h(com.moloco.sdk.internal.ortb.model.y yVar) {
            this.f46076b = yVar;
        }

        @Composable
        public final sn.t<BoxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, sn.a<bn.r>, sn.a<bn.r>, Composer, Integer, bn.r> a(Composer composer, int i10) {
            composer.startReplaceableGroup(392356305);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(392356305, i10, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:166)");
            }
            D dM = this.f46076b.m();
            composer.startReplaceableGroup(-1135710031);
            sn.t<BoxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, sn.a<bn.r>, sn.a<bn.r>, Composer, Integer, bn.r> tVarI = dM == null ? null : com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.i(h.a(dM.c(), dM.e()), PaddingKt.m404PaddingValues0680j_4(Dp.m3826constructorimpl(dM.d())), composer, 0, 0);
            composer.endReplaceableGroup();
            if (tVarI == null) {
                tVarI = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.i(null, null, composer, 0, 3);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return tVarI;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ sn.t<? super BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super sn.a<? extends bn.r>, ? super sn.a<? extends bn.r>, ? super Composer, ? super Integer, ? extends bn.r> mo2invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    static {
        float f10 = 30;
        f46062d = DpKt.m3848DpSizeYgX7TsA(Dp.m3826constructorimpl(f10), Dp.m3826constructorimpl(f10));
    }

    @NotNull
    public static final Alignment a(@NotNull com.moloco.sdk.internal.ortb.model.t tVar, @NotNull E e10) {
        tn.p.k(tVar, "horizontalAlignment");
        tn.p.k(e10, "verticalAlignment");
        E e11 = E.f46300b;
        if (e10 == e11 && (tVar == com.moloco.sdk.internal.ortb.model.t.f46438b || tVar == com.moloco.sdk.internal.ortb.model.t.f46441e)) {
            return Alignment.INSTANCE.getTopStart();
        }
        if (e10 == e11 && tVar == com.moloco.sdk.internal.ortb.model.t.f46439c) {
            return Alignment.INSTANCE.getTopCenter();
        }
        if (e10 == e11 && (tVar == com.moloco.sdk.internal.ortb.model.t.f46440d || tVar == com.moloco.sdk.internal.ortb.model.t.f46442f)) {
            return Alignment.INSTANCE.getTopEnd();
        }
        E e12 = E.f46301c;
        if (e10 == e12 && (tVar == com.moloco.sdk.internal.ortb.model.t.f46438b || tVar == com.moloco.sdk.internal.ortb.model.t.f46441e)) {
            return Alignment.INSTANCE.getCenterStart();
        }
        if (e10 == e12 && tVar == com.moloco.sdk.internal.ortb.model.t.f46439c) {
            return Alignment.INSTANCE.getCenter();
        }
        if (e10 == e12 && (tVar == com.moloco.sdk.internal.ortb.model.t.f46440d || tVar == com.moloco.sdk.internal.ortb.model.t.f46442f)) {
            return Alignment.INSTANCE.getCenterEnd();
        }
        E e13 = E.f46302d;
        return (e10 == e13 && (tVar == com.moloco.sdk.internal.ortb.model.t.f46438b || tVar == com.moloco.sdk.internal.ortb.model.t.f46441e)) ? Alignment.INSTANCE.getBottomStart() : (e10 == e13 && tVar == com.moloco.sdk.internal.ortb.model.t.f46439c) ? Alignment.INSTANCE.getBottomCenter() : (e10 == e13 && (tVar == com.moloco.sdk.internal.ortb.model.t.f46440d || tVar == com.moloco.sdk.internal.ortb.model.t.f46442f)) ? Alignment.INSTANCE.getBottomEnd() : Alignment.INSTANCE.getTopStart();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n b(com.moloco.sdk.internal.ortb.model.y yVar, boolean z10) {
        com.moloco.sdk.internal.ortb.model.r rVarC;
        bn.k kVarA;
        int iE = yVar.e().e();
        sn.b bVarJ = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b.j(0L, h(z10, yVar.e(), yVar.h(), yVar.f(), yVar.i()), 1, null);
        com.moloco.sdk.internal.ortb.model.l lVarH = yVar.h();
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n(iE, bVarJ, (lVarH == null || (rVarC = lVarH.c()) == null || (kVarA = rVarC.a()) == null) ? 0 : kVarA.f(), g(yVar.e(), z10, null, 2, null), yVar.a(), yVar.c());
    }

    @NotNull
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p c() {
        return d(p());
    }

    @NotNull
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p d(@NotNull com.moloco.sdk.internal.ortb.model.y yVar) {
        tn.p.k(yVar, "<this>");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n nVarB = b(yVar, true);
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p(l(yVar, true), nVarB, nVarB);
    }

    public static final sn.p<Composer, Integer, sn.c<BoxScope, Boolean, Boolean, sn.a<bn.r>, sn.l<? super a.AbstractC0696a.c, bn.r>, Boolean, bn.k, bn.k, sn.a<bn.r>, Composer, Integer, bn.r>> f(C c10, boolean z10, com.moloco.sdk.internal.ortb.model.k kVar) {
        return new b(z10, c10, kVar);
    }

    public static /* synthetic */ sn.p g(C c10, boolean z10, com.moloco.sdk.internal.ortb.model.k kVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            kVar = null;
        }
        return f(c10, z10, kVar);
    }

    @NotNull
    public static final sn.p<Composer, Integer, sn.c<BoxScope, Boolean, Boolean, sn.a<bn.r>, sn.l<? super a.AbstractC0696a.c, bn.r>, Boolean, bn.k, bn.k, sn.a<bn.r>, Composer, Integer, bn.r>> h(boolean z10, @NotNull C c10, @Nullable com.moloco.sdk.internal.ortb.model.l lVar, @Nullable com.moloco.sdk.internal.ortb.model.k kVar, @Nullable com.moloco.sdk.internal.ortb.model.u uVar) {
        tn.p.k(c10, "close");
        return lVar == null ? f(c10, z10, kVar) : new a(c10, uVar, kVar);
    }

    @NotNull
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p i() {
        return j(p());
    }

    @NotNull
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p j(@NotNull com.moloco.sdk.internal.ortb.model.y yVar) {
        tn.p.k(yVar, "<this>");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n nVarB = b(yVar, false);
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p(l(yVar, false), nVarB, nVarB);
    }

    @Composable
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.z k(long j10, long j11, long j12, com.moloco.sdk.internal.ortb.model.u uVar, Composer composer, int i10) {
        long jM3848DpSizeYgX7TsA;
        composer.startReplaceableGroup(129538364);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(129538364, i10, -1, "com.moloco.sdk.internal.defaultMolocoSkipAfterCountdownButtonPart (AggregatedOptions.kt:188)");
        }
        composer.startReplaceableGroup(-1579296075);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.z zVarA = null;
        String lowerCase = null;
        if (uVar != null) {
            String strG = uVar.g();
            if (strG != null) {
                lowerCase = strG.toLowerCase(Locale.ROOT);
                tn.p.j(lowerCase, "toLowerCase(...)");
            }
            boolean z10 = !tn.p.f(lowerCase, "right");
            Boolean boolH = uVar.h();
            boolean zBooleanValue = boolH != null ? boolH.booleanValue() : true;
            String strF = uVar.f();
            if (strF == null) {
                strF = "play store";
            }
            Color colorD = uVar.d();
            long jM1629unboximpl = colorD != null ? colorD.m1629unboximpl() : j12;
            Color colorA = uVar.a();
            long jM1629unboximpl2 = colorA != null ? colorA.m1629unboximpl() : j11;
            Integer numC = uVar.c();
            long sp2 = numC != null ? TextUnitKt.getSp(numC.intValue()) : TextUnit.INSTANCE.m4018getUnspecifiedXSAIIZE();
            if (uVar.e() != null) {
                float fM3826constructorimpl = Dp.m3826constructorimpl(r1.intValue());
                jM3848DpSizeYgX7TsA = DpKt.m3848DpSizeYgX7TsA(fM3826constructorimpl, fM3826constructorimpl);
            } else {
                jM3848DpSizeYgX7TsA = j10;
            }
            zVarA = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.p.b(strF, null, jM3848DpSizeYgX7TsA, null, jM1629unboximpl2, z10, zBooleanValue, jM1629unboximpl, sp2, composer, 0, 10);
        }
        composer.endReplaceableGroup();
        if (zVarA == null) {
            zVarA = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.p.a(PainterResources_androidKt.painterResource(R$drawable.moloco_skip, composer, 0), j10, null, j11, composer, ((i10 << 3) & 112) | ((i10 << 6) & 7168), 4);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return zVarA;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.d0 l(com.moloco.sdk.internal.ortb.model.y yVar, boolean z10) {
        com.moloco.sdk.internal.ortb.model.r rVarC;
        bn.k kVarA;
        boolean zG = yVar.j().g();
        Boolean bool = yVar.l() == null ? null : Boolean.TRUE;
        C cL = yVar.l();
        int iE = cL != null ? cL.e() : 0;
        C4379c c4379cD = yVar.d();
        boolean z11 = c4379cD != null && c4379cD.b() && yVar.d().d();
        C4379c c4379cD2 = yVar.d();
        boolean z12 = c4379cD2 != null && c4379cD2.b();
        int iE2 = yVar.e().e();
        com.moloco.sdk.internal.ortb.model.l lVarH = yVar.h();
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.d0(zG, bool, iE, iE2, (lVarH == null || (rVarC = lVarH.c()) == null || (kVarA = rVarC.a()) == null) ? 0 : kVarA.f(), z11, z12, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n.e(0L, new c(yVar), f(yVar.e(), z10, yVar.f()), new d(yVar), new e(yVar), new f(z10, yVar), y.b(yVar.n()), new g(z10, yVar), new C0558h(yVar), null, null, 1537, null), yVar.a(), yVar.c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final com.moloco.sdk.internal.ortb.model.y m() {
        long j10 = f46061c;
        int iB = bn.k.b(30);
        com.moloco.sdk.internal.ortb.model.t tVar = com.moloco.sdk.internal.ortb.model.t.f46440d;
        E e10 = E.f46300b;
        Color color = null;
        tn.i iVar = null;
        C c10 = new C(5, 10, iB, tVar, e10, j10, color, 64, iVar);
        com.moloco.sdk.internal.ortb.model.z zVar = new com.moloco.sdk.internal.ortb.model.z(0, com.moloco.sdk.internal.ortb.model.t.f46439c, E.f46302d, j10, null);
        Object[] objArr = 0 == true ? 1 : 0;
        return new com.moloco.sdk.internal.ortb.model.y(c10, c10, zVar, new com.moloco.sdk.internal.ortb.model.x((boolean) objArr, 10, com.moloco.sdk.internal.ortb.model.t.f46438b, e10, j10, (bn.k) null, color, 96, iVar), (com.moloco.sdk.internal.ortb.model.i) null, true, new C4379c(false, false, (String) null, 6, (tn.i) null), (D) (0 == true ? 1 : 0), (com.moloco.sdk.internal.ortb.model.l) null, (com.moloco.sdk.internal.ortb.model.k) (0 == true ? 1 : 0), (C4377a) null, (C4378b) null, (com.moloco.sdk.internal.ortb.model.u) null, 7552, (tn.i) null);
    }

    public static final com.moloco.sdk.internal.ortb.model.y p() {
        return (com.moloco.sdk.internal.ortb.model.y) f46059a.getValue();
    }
}
