package com.moloco.sdk.internal.publisher.nativead.ui;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import bn.r;
import com.moloco.sdk.R$drawable;
import com.moloco.sdk.internal.publisher.nativead.ui.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.f0;
import org.jetbrains.annotations.NotNull;
import sn.l;
import sn.q;
import sn.s;
import tn.p;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f46907a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static s<BoxScope, Boolean, sn.a<r>, Composer, Integer, r> f46908b = ComposableLambdaKt.composableLambdaInstance(1019496058, false, a.f46909b);

    public static final class a implements s<BoxScope, Boolean, sn.a<? extends r>, Composer, Integer, r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f46909b = new a();

        /* JADX INFO: renamed from: com.moloco.sdk.internal.publisher.nativead.ui.b$a$a, reason: collision with other inner class name */
        public static final class C0578a implements q<Boolean, Composer, Integer, r> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ sn.a<r> f46910b;

            public C0578a(sn.a<r> aVar) {
                this.f46910b = aVar;
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
                    ComposerKt.traceEventStart(1776469658, i11, -1, "com.moloco.sdk.internal.publisher.nativead.ui.ComposableSingletons$NativeVideoPlaybackControlUIKt.lambda-1.<anonymous>.<anonymous> (NativeVideoPlaybackControlUI.kt:30)");
                }
                f0.b(PainterResources_androidKt.painterResource(z10 ? R$drawable.moloco_twotone_pause_24 : R$drawable.moloco_twotone_play_arrow_24, composer, 0), this.f46910b, null, false, "play/pause", Color.INSTANCE.m1656getWhite0d7_KjU(), 0L, 0L, null, 0L, composer, 221184, 972);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ r invoke(Boolean bool, Composer composer, Integer num) {
                a(bool.booleanValue(), composer, num.intValue());
                return r.f5635a;
            }
        }

        public static final r a(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
            p.k(semanticsPropertyReceiver, "$this$semantics");
            SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
            SemanticsPropertiesKt.setTestTag(semanticsPropertyReceiver, str);
            return r.f5635a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void b(BoxScope boxScope, boolean z10, sn.a<r> aVar, Composer composer, int i10) {
            int i11;
            p.k(boxScope, "<this>");
            p.k(aVar, "onClick");
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
                ComposerKt.traceEventStart(1019496058, i11, -1, "com.moloco.sdk.internal.publisher.nativead.ui.ComposableSingletons$NativeVideoPlaybackControlUIKt.lambda-1.<anonymous> (NativeVideoPlaybackControlUI.kt:17)");
            }
            final String str = "playback_control_button";
            Modifier modifierM411padding3ABfNKs = PaddingKt.m411padding3ABfNKs(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottomCenter()), Dp.m3826constructorimpl(4));
            composer.startReplaceableGroup(277443603);
            boolean zChanged = composer.changed("playback_control_button");
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new l() { // from class: com.moloco.sdk.internal.publisher.nativead.ui.a
                    @Override // sn.l
                    public final Object invoke(Object obj) {
                        return b.a.a(str, (SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            CrossfadeKt.Crossfade(Boolean.valueOf(z10), SemanticsModifierKt.semantics$default(modifierM411padding3ABfNKs, false, (l) objRememberedValue, 1, null), null, ComposableLambdaKt.composableLambda(composer, 1776469658, true, new C0578a(aVar)), composer, ((i11 >> 3) & 14) | 3072, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // sn.s
        public /* bridge */ /* synthetic */ r invoke(BoxScope boxScope, Boolean bool, sn.a<? extends r> aVar, Composer composer, Integer num) {
            b(boxScope, bool.booleanValue(), aVar, composer, num.intValue());
            return r.f5635a;
        }
    }

    @NotNull
    public final s<BoxScope, Boolean, sn.a<r>, Composer, Integer, r> a() {
        return f46908b;
    }
}
