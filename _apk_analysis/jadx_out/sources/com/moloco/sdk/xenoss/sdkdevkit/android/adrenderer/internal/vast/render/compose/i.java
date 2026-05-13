package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i f50217a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static sn.s<BoxScope, Boolean, sn.a<bn.r>, Composer, Integer, bn.r> f50218b = ComposableLambdaKt.composableLambdaInstance(-1970835476, false, a.f50219b);

    public static final class a implements sn.s<BoxScope, Boolean, sn.a<? extends bn.r>, Composer, Integer, bn.r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f50219b = new a();

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i$a$a, reason: collision with other inner class name */
        public static final class C0673a implements sn.q<Boolean, Composer, Integer, bn.r> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ sn.a<bn.r> f50220b;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i$a$a$a, reason: collision with other inner class name */
            public static final class C0674a implements sn.q<RowScope, Composer, Integer, bn.r> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f50221b;

                public C0674a(boolean z10) {
                    this.f50221b = z10;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void a(RowScope rowScope, Composer composer, int i10) {
                    tn.p.k(rowScope, "$this$TextButton");
                    if ((i10 & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-919554769, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.ComposableSingletons$PlaybackControlKt.lambda-1.<anonymous>.<anonymous>.<anonymous> (PlaybackControl.kt:55)");
                    }
                    TextKt.m1234TextfLXpl1I(this.f50221b ? "Pause" : "Play", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 0, 0, 65534);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // sn.q
                public /* bridge */ /* synthetic */ bn.r invoke(RowScope rowScope, Composer composer, Integer num) {
                    a(rowScope, composer, num.intValue());
                    return bn.r.f5635a;
                }
            }

            public C0673a(sn.a<bn.r> aVar) {
                this.f50220b = aVar;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void a(boolean z10, Composer composer, int i10) {
                int i11;
                if ((i10 & 6) == 0) {
                    i11 = i10 | (composer.changed(z10) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(170935244, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.ComposableSingletons$PlaybackControlKt.lambda-1.<anonymous>.<anonymous> (PlaybackControl.kt:54)");
                }
                ButtonKt.TextButton(this.f50220b, null, false, null, null, null, null, null, null, ComposableLambdaKt.composableLambda(composer, -919554769, true, new C0674a(z10)), composer, 805306368, 510);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ bn.r invoke(Boolean bool, Composer composer, Integer num) {
                a(bool.booleanValue(), composer, num.intValue());
                return bn.r.f5635a;
            }
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void a(BoxScope boxScope, boolean z10, sn.a<bn.r> aVar, Composer composer, int i10) {
            int i11;
            tn.p.k(boxScope, "<this>");
            tn.p.k(aVar, "onClick");
            if ((i10 & 6) == 0) {
                i11 = (composer.changed(boxScope) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= composer.changed(z10) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                i11 |= composer.changed(aVar) ? 256 : 128;
            }
            if ((i11 & 1171) == 1170 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1970835476, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.ComposableSingletons$PlaybackControlKt.lambda-1.<anonymous> (PlaybackControl.kt:48)");
            }
            CrossfadeKt.Crossfade(Boolean.valueOf(z10), PaddingKt.m411padding3ABfNKs(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottomCenter()), Dp.m3826constructorimpl(4)), null, ComposableLambdaKt.composableLambda(composer, 170935244, true, new C0673a(aVar)), composer, ((i11 >> 3) & 14) | 3072, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // sn.s
        public /* bridge */ /* synthetic */ bn.r invoke(BoxScope boxScope, Boolean bool, sn.a<? extends bn.r> aVar, Composer composer, Integer num) {
            a(boxScope, bool.booleanValue(), aVar, composer, num.intValue());
            return bn.r.f5635a;
        }
    }

    @NotNull
    public final sn.s<BoxScope, Boolean, sn.a<bn.r>, Composer, Integer, bn.r> a() {
        return f50218b;
    }
}
