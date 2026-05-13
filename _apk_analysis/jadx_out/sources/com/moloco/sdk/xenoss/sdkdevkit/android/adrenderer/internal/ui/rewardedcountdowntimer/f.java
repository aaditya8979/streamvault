package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.LayoutDirection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class f {
    public static final float a(int i10, int i11) {
        return Integer.compare(i11 ^ Integer.MIN_VALUE, 1 ^ Integer.MIN_VALUE) <= 0 ? i10 == 0 ? 0.0f : 1.0f : (((float) bn.s.c(i10)) - 1.0f) / (((float) bn.s.c(i11)) - 1.0f);
    }

    public static final bn.r b(com.moloco.sdk.internal.ortb.model.k kVar, int i10, int i11, sn.a aVar, int i12, Composer composer, int i13) {
        d(kVar, i10, i11, aVar, composer, i12 | 1);
        return bn.r.f5635a;
    }

    public static final bn.r c(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        tn.p.k(semanticsPropertyReceiver, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        SemanticsPropertiesKt.setTestTag(semanticsPropertyReceiver, str);
        return bn.r.f5635a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void d(@NotNull final com.moloco.sdk.internal.ortb.model.k kVar, final int i10, final int i11, @NotNull final sn.a<bn.r> aVar, @Nullable Composer composer, final int i12) {
        int i13;
        Composer composer2;
        tn.p.k(kVar, "countDownTimer");
        tn.p.k(aVar, "onTimerFinish");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1599911995);
        if ((i12 & 6) == 0) {
            i13 = (composerStartRestartGroup.changed(kVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= composerStartRestartGroup.changed(i10) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= composerStartRestartGroup.changed(i11) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= composerStartRestartGroup.changed(aVar) ? 2048 : 1024;
        }
        if ((i13 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1599911995, i13, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.AggregateRewardedCountDownTimer (AggregateRewardedCountDownTimer.kt:18)");
            }
            float fM3826constructorimpl = Dp.m3826constructorimpl(kVar.d());
            long jM3848DpSizeYgX7TsA = DpKt.m3848DpSizeYgX7TsA(fM3826constructorimpl, fM3826constructorimpl);
            Alignment alignmentA = com.moloco.sdk.internal.h.a(kVar.g(), kVar.h());
            long jC = kVar.c();
            long jF = kVar.f();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(alignmentA, false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            sn.a<ComposeUiNode> constructor = companion2.getConstructor();
            sn.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, bn.r> qVarMaterializerOf = LayoutKt.materializerOf(modifierFillMaxSize$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1274constructorimpl = Updater.m1274constructorimpl(composerStartRestartGroup);
            Updater.m1281setimpl(composerM1274constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1281setimpl(composerM1274constructorimpl, density, companion2.getSetDensity());
            Updater.m1281setimpl(composerM1274constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m1281setimpl(composerM1274constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            qVarMaterializerOf.invoke(SkippableUpdater.m1264boximpl(SkippableUpdater.m1265constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (kVar.i()) {
                composerStartRestartGroup.startReplaceableGroup(2067666933);
                final String str = "rewarded_countdown_timer";
                composerStartRestartGroup.startReplaceableGroup(-210384916);
                boolean zChanged = composerStartRestartGroup.changed("rewarded_countdown_timer");
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new sn.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.a
                        @Override // sn.l
                        public final Object invoke(Object obj) {
                            return f.c(str, (SemanticsPropertyReceiver) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i14 = 458752 & (i13 << 6);
                int i15 = i13 << 18;
                composer2 = composerStartRestartGroup;
                c.f(jC, jF, SemanticsModifierKt.semantics$default(companion, false, (sn.l) objRememberedValue, 1, null), 0.0f, DpSize.m3924getWidthD9Ej5fM(jM3848DpSizeYgX7TsA), aVar, null, i10, i11, composerStartRestartGroup, (234881024 & i15) | i14 | (29360128 & i15), 72);
                composer2.endReplaceableGroup();
            } else {
                composer2 = composerStartRestartGroup;
                String strE = kVar.e();
                if (strE == null || strE.length() <= 0) {
                    composer2.startReplaceableGroup(2069220715);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(2068452876);
                    final String str2 = "rewarded_countdown_timer_custom";
                    String strE2 = kVar.e();
                    composer2.startReplaceableGroup(-210357300);
                    boolean zChanged2 = composer2.changed("rewarded_countdown_timer_custom");
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new sn.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.d
                            @Override // sn.l
                            public final Object invoke(Object obj) {
                                return f.e(str2, (SemanticsPropertyReceiver) obj);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    int i16 = 458752 & (i13 << 6);
                    int i17 = i13 << 21;
                    b.h(jC, jF, SemanticsModifierKt.semantics$default(companion, false, (sn.l) objRememberedValue2, 1, null), 0.0f, DpSize.m3924getWidthD9Ej5fM(jM3848DpSizeYgX7TsA), aVar, strE2, null, i10, i11, composer2, (234881024 & i17) | i16 | (1879048192 & i17), 136);
                    composer2.endReplaceableGroup();
                }
            }
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sn.p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.e
                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public final Object mo2invoke(Object obj, Object obj2) {
                    return f.b(kVar, i10, i11, aVar, i12, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final bn.r e(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        tn.p.k(semanticsPropertyReceiver, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        SemanticsPropertiesKt.setTestTag(semanticsPropertyReceiver, str);
        return bn.r.f5635a;
    }
}
