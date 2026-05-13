package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes11.dex */
public final class o0 {

    public static final class a implements sn.p<Composer, Integer, bn.r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f49103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f49104c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ sn.a<bn.r> f49105d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f49106e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f49107f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f49108g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ long f49109h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ long f49110i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long f49111j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Painter f49112k;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o0$a$a, reason: collision with other inner class name */
        public static final class C0643a implements sn.p<Composer, Integer, bn.r> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f49113b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Painter f49114c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f49115d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ long f49116e;

            public C0643a(long j10, Painter painter, String str, long j11) {
                this.f49113b = j10;
                this.f49114c = painter;
                this.f49115d = str;
                this.f49116e = j11;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(367056260, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.TextIconButton.<anonymous>.<anonymous>.<anonymous> (TextIconButton.kt:75)");
                }
                IconKt.m1064Iconww6aTOc(this.f49114c, this.f49115d, SizeKt.m453size6HolHcs(Modifier.INSTANCE, this.f49113b), this.f49116e, composer, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ bn.r mo2invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return bn.r.f5635a;
            }
        }

        public static final class b implements sn.p<Composer, Integer, bn.r> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f49117b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f49118c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ long f49119d;

            public b(String str, long j10, long j11) {
                this.f49117b = str;
                this.f49118c = j10;
                this.f49119d = j11;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-618324232, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.TextIconButton.<anonymous>.<anonymous>.<anonymous> (TextIconButton.kt:67)");
                }
                TextKt.m1234TextfLXpl1I(this.f49117b, OffsetKt.m400offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m3826constructorimpl(-1), 1, null), this.f49118c, this.f49119d, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 48, 0, 65520);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ bn.r mo2invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return bn.r.f5635a;
            }
        }

        public a(float f10, String str, sn.a<bn.r> aVar, boolean z10, boolean z11, String str2, long j10, long j11, long j12, Painter painter) {
            this.f49103b = f10;
            this.f49104c = str;
            this.f49105d = aVar;
            this.f49106e = z10;
            this.f49107f = z11;
            this.f49108g = str2;
            this.f49109h = j10;
            this.f49110i = j11;
            this.f49111j = j12;
            this.f49112k = painter;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1541935208, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.TextIconButton.<anonymous> (TextIconButton.kt:52)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM412paddingVpY3zN4 = PaddingKt.m412paddingVpY3zN4(SizeKt.m440heightInVpY3zN4$default(companion, this.f49103b, 0.0f, 2, null), Dp.m3826constructorimpl(10), Dp.m3826constructorimpl(6));
            Indication indicationM1253rememberRipple9IZ8Weo = RippleKt.m1253rememberRipple9IZ8Weo(true, 0.0f, 0L, composer, 6, 6);
            composer.startReplaceableGroup(1151230561);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            Modifier modifierM181clickableO2vRcR0$default = ClickableKt.m181clickableO2vRcR0$default(modifierM412paddingVpY3zN4, (MutableInteractionSource) objRememberedValue, indicationM1253rememberRipple9IZ8Weo, false, this.f49104c, Role.m3365boximpl(Role.INSTANCE.m3372getButtono7Vup1c()), this.f49105d, 4, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            boolean z10 = this.f49106e;
            boolean z11 = this.f49107f;
            String str = this.f49108g;
            long j10 = this.f49109h;
            long j11 = this.f49110i;
            long j12 = this.f49111j;
            Painter painter = this.f49112k;
            String str2 = this.f49104c;
            composer.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer, 54);
            composer.startReplaceableGroup(-1323940314);
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            sn.a<ComposeUiNode> constructor = companion2.getConstructor();
            sn.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, bn.r> qVarMaterializerOf = LayoutKt.materializerOf(modifierM181clickableO2vRcR0$default);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            composer.disableReusing();
            Composer composerM1274constructorimpl = Updater.m1274constructorimpl(composer);
            Updater.m1281setimpl(composerM1274constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1281setimpl(composerM1274constructorimpl, density, companion2.getSetDensity());
            Updater.m1281setimpl(composerM1274constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m1281setimpl(composerM1274constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            composer.enableReusing();
            qVarMaterializerOf.invoke(SkippableUpdater.m1264boximpl(SkippableUpdater.m1265constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            composer.startReplaceableGroup(-678309503);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -618324232, true, new b(str, j10, j11));
            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer, 367056260, true, new C0643a(j12, painter, str2, j10));
            if (z10) {
                composer.startReplaceableGroup(774006835);
                composableLambda.mo2invoke(composer, 6);
                if (z11) {
                    SpacerKt.Spacer(SizeKt.m457width3ABfNKs(companion, Dp.m3826constructorimpl(4)), composer, 6);
                    composableLambda2.mo2invoke(composer, 6);
                }
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(774193331);
                composer.startReplaceableGroup(717711159);
                if (z11) {
                    composableLambda2.mo2invoke(composer, 6);
                    SpacerKt.Spacer(SizeKt.m457width3ABfNKs(companion, Dp.m3826constructorimpl(4)), composer, 6);
                }
                composer.endReplaceableGroup();
                composableLambda.mo2invoke(composer, 6);
                composer.endReplaceableGroup();
            }
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ bn.r mo2invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return bn.r.f5635a;
        }
    }

    public static final bn.r a(String str, Painter painter, String str2, long j10, Shape shape, long j11, long j12, long j13, boolean z10, boolean z11, long j14, sn.a aVar, int i10, int i11, int i12, Composer composer, int i13) {
        b(str, painter, str2, j10, shape, j11, j12, j13, z10, z11, j14, aVar, composer, i10 | 1, i11, i12);
        return bn.r.f5635a;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012a  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@org.jetbrains.annotations.NotNull final java.lang.String r26, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.painter.Painter r27, @org.jetbrains.annotations.Nullable final java.lang.String r28, final long r29, @org.jetbrains.annotations.NotNull final androidx.compose.ui.graphics.Shape r31, final long r32, final long r34, final long r36, boolean r38, boolean r39, long r40, @org.jetbrains.annotations.NotNull final sn.a<bn.r> r42, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r43, final int r44, final int r45, final int r46) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o0.b(java.lang.String, androidx.compose.ui.graphics.painter.Painter, java.lang.String, long, androidx.compose.ui.graphics.Shape, long, long, long, boolean, boolean, long, sn.a, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
