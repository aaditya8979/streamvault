package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 {
    public static final bn.r a(Modifier modifier, a.AbstractC0696a.c.EnumC0698a enumC0698a, sn.l lVar, sn.q qVar, int i10, int i11, Composer composer, int i12) {
        e(modifier, enumC0698a, lVar, qVar, composer, i10 | 1, i11);
        return bn.r.f5635a;
    }

    public static final bn.r b(sn.l lVar, MutableState mutableState, a.AbstractC0696a.c cVar) {
        tn.p.k(cVar, "it");
        d(mutableState, cVar);
        lVar.invoke(cVar);
        return bn.r.f5635a;
    }

    public static final a.AbstractC0696a.c c(MutableState<a.AbstractC0696a.c> mutableState) {
        return mutableState.getValue();
    }

    public static final void d(MutableState<a.AbstractC0696a.c> mutableState, a.AbstractC0696a.c cVar) {
        mutableState.setValue(cVar);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void e(@Nullable Modifier modifier, @NotNull final a.AbstractC0696a.c.EnumC0698a enumC0698a, @NotNull final sn.l<? super a.AbstractC0696a.c, bn.r> lVar, @NotNull final sn.q<? super Modifier, ? super Composer, ? super Integer, bn.r> qVar, @Nullable Composer composer, final int i10, final int i11) {
        int i12;
        tn.p.k(enumC0698a, "buttonType");
        tn.p.k(lVar, "onButtonRendered");
        tn.p.k(qVar, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1040306081);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changed(enumC0698a) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changed(lVar) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changed(qVar) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1040306081, i12, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.TrackableButton (TrackableButton.kt:22)");
            }
            composerStartRestartGroup.startReplaceableGroup(-334659178);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.b.a(enumC0698a), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            a.AbstractC0696a.c cVarC = c(mutableState);
            composerStartRestartGroup.startReplaceableGroup(-334654626);
            boolean zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(lVar);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new sn.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q0
                    @Override // sn.l
                    public final Object invoke(Object obj) {
                        return s0.b(lVar, mutableState, (a.AbstractC0696a.c) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            qVar.invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.modifiers.b.a(modifier, cVarC, (sn.l) objRememberedValue2), composerStartRestartGroup, Integer.valueOf((i12 >> 6) & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sn.p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r0
                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public final Object mo2invoke(Object obj, Object obj2) {
                    return s0.a(modifier2, enumC0698a, lVar, qVar, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
