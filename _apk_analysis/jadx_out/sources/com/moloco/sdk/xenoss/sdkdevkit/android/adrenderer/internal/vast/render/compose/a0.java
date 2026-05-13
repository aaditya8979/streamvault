package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final sn.s<BoxScope, Boolean, sn.a<bn.r>, Composer, Integer, bn.r> f50139a = i.f50217a.a();

    public static final class a implements sn.u<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, sn.l<? super Boolean, ? extends bn.r>, sn.a<? extends bn.r>, Composer, Integer, bn.r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ sn.s<BoxScope, Boolean, sn.a<bn.r>, Composer, Integer, bn.r> f50140b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(sn.s<? super BoxScope, ? super Boolean, ? super sn.a<bn.r>, ? super Composer, ? super Integer, bn.r> sVar) {
            this.f50140b = sVar;
        }

        public static final bn.r a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar, sn.a aVar, sn.l lVar, boolean z10) {
            if (iVar instanceof i.a) {
                aVar.invoke();
            } else {
                lVar.invoke(Boolean.valueOf(!z10));
            }
            return bn.r.f5635a;
        }

        @Composable
        public final void b(BoxScope boxScope, final boolean z10, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar, final sn.l<? super Boolean, bn.r> lVar, final sn.a<bn.r> aVar, Composer composer, int i10) {
            int i11;
            tn.p.k(boxScope, "<this>");
            tn.p.k(iVar, "progress");
            tn.p.k(lVar, "onShouldPlay");
            tn.p.k(aVar, "onShouldReplay");
            if ((i10 & 6) == 0) {
                i11 = (composer.changed(boxScope) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= composer.changed(z10) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                i11 |= composer.changed(iVar) ? 256 : 128;
            }
            if ((i10 & 3072) == 0) {
                i11 |= composer.changed(lVar) ? 2048 : 1024;
            }
            if ((i10 & 24576) == 0) {
                i11 |= composer.changed(aVar) ? 16384 : 8192;
            }
            if ((74899 & i11) == 74898 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1901828083, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultPlaybackControl.<anonymous> (PlaybackControl.kt:32)");
            }
            composer.startReplaceableGroup(263769922);
            boolean zChanged = composer.changed(iVar) | composer.changed(aVar) | composer.changed(lVar) | composer.changed(z10);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.z
                    @Override // sn.a
                    public final Object invoke() {
                        return a0.a.a(iVar, aVar, lVar, z10);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            this.f50140b.invoke(boxScope, Boolean.valueOf(z10), (sn.a) objRememberedValue, composer, Integer.valueOf(i11 & 126));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // sn.u
        public /* bridge */ /* synthetic */ bn.r invoke(BoxScope boxScope, Boolean bool, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar, sn.l<? super Boolean, ? extends bn.r> lVar, sn.a<? extends bn.r> aVar, Composer composer, Integer num) {
            b(boxScope, bool.booleanValue(), iVar, lVar, aVar, composer, num.intValue());
            return bn.r.f5635a;
        }
    }

    @Composable
    @NotNull
    public static final sn.u<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, sn.l<? super Boolean, bn.r>, sn.a<bn.r>, Composer, Integer, bn.r> a(@Nullable sn.s<? super BoxScope, ? super Boolean, ? super sn.a<bn.r>, ? super Composer, ? super Integer, bn.r> sVar, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(718660168);
        if ((i11 & 1) != 0) {
            sVar = f50139a;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(718660168, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultPlaybackControl (PlaybackControl.kt:30)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, 1901828083, true, new a(sVar));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }
}
