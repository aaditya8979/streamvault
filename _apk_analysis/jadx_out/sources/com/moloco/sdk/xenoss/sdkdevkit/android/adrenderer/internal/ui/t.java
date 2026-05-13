package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import android.app.Activity;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.WindowInfo;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class t {

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.HideSystemUIKt$HideSystemUI$1$1", f = "HideSystemUI.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f49219b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Activity f49220c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, Activity activity, hn.c<? super a> cVar) {
            super(2, cVar);
            this.f49219b = z10;
            this.f49220c = activity;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return new a(this.f49219b, this.f49220c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f49218a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            if (this.f49219b) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h0.a(this.f49220c);
            }
            return bn.r.f5635a;
        }
    }

    public static final bn.r a(Activity activity, int i10, Composer composer, int i11) {
        b(activity, composer, i10 | 1);
        return bn.r.f5635a;
    }

    @Composable
    public static final void b(@NotNull final Activity activity, @Nullable Composer composer, final int i10) {
        int i11;
        tn.p.k(activity, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-726701488);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(activity) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-726701488, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.HideSystemUI (HideSystemUI.kt:9)");
            }
            boolean zIsWindowFocused = ((WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).isWindowFocused();
            Boolean boolValueOf = Boolean.valueOf(zIsWindowFocused);
            composerStartRestartGroup.startReplaceableGroup(-1598618285);
            boolean zChanged = composerStartRestartGroup.changed(zIsWindowFocused) | composerStartRestartGroup.changed(activity);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new a(zIsWindowFocused, activity, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(boolValueOf, (sn.p<? super p000do.l0, ? super hn.c<? super bn.r>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sn.p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g0
                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public final Object mo2invoke(Object obj, Object obj2) {
                    return t.a(activity, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
