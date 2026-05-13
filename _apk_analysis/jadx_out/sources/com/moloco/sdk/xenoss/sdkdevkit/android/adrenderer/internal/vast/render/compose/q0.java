package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class q0 {
    public static final bn.r a(j.a aVar, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        b(aVar, modifier, composer, i10 | 1, i11);
        return bn.r.f5635a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(@NotNull final j.a aVar, @Nullable final Modifier modifier, @Nullable Composer composer, final int i10, final int i11) {
        int i12;
        tn.p.k(aVar, "htmlResource");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1230364815);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1230364815, i12, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastResourceHtml (VastResourceHtml.kt:11)");
            }
            composerStartRestartGroup.startReplaceableGroup(-1944712831);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g0 g0Var = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g0.f48150a;
                Object obj = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g0.f48151b.get(Integer.valueOf(aVar.a()));
                if (!(obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.i0)) {
                    obj = null;
                }
                objRememberedValue = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.i0) obj;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.i0 i0Var = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.i0) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            if (i0Var == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new sn.p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o0
                        @Override // sn.p
                        /* JADX INFO: renamed from: invoke */
                        public final Object mo2invoke(Object obj2, Object obj3) {
                            return q0.a(aVar, modifier, i10, i11, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.a.d(i0Var, modifier, null, composerStartRestartGroup, (i12 & 112) | 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new sn.p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.p0
                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public final Object mo2invoke(Object obj2, Object obj3) {
                    return q0.c(aVar, modifier, i10, i11, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    public static final bn.r c(j.a aVar, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        b(aVar, modifier, composer, i10 | 1, i11);
        return bn.r.f5635a;
    }
}
