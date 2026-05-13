package com.moloco.sdk.internal.publisher.nativead.ui;

import android.content.Context;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.MaterialThemeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import bn.r;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import sn.p;
import sn.q;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    public static final class a implements p<Composer, Integer, r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q<Modifier, Composer, Integer, r> f46911b;

        /* JADX INFO: renamed from: com.moloco.sdk.internal.publisher.nativead.ui.c$a$a, reason: collision with other inner class name */
        public static final class C0579a implements p<Composer, Integer, r> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q<Modifier, Composer, Integer, r> f46912b;

            /* JADX WARN: Multi-variable type inference failed */
            public C0579a(q<? super Modifier, ? super Composer, ? super Integer, r> qVar) {
                this.f46912b = qVar;
            }

            @Composable
            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-964093233, i10, -1, "com.moloco.sdk.internal.publisher.nativead.ui.NativeAdComposeViewWrapper.<anonymous>.<anonymous>.<anonymous> (NativeAdComposeViewWrapper.kt:15)");
                }
                this.f46912b.invoke(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo2invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return r.f5635a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(q<? super Modifier, ? super Composer, ? super Integer, r> qVar) {
            this.f46911b = qVar;
        }

        @Composable
        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1870157091, i10, -1, "com.moloco.sdk.internal.publisher.nativead.ui.NativeAdComposeViewWrapper.<anonymous>.<anonymous> (NativeAdComposeViewWrapper.kt:14)");
            }
            MaterialThemeKt.MaterialTheme(null, null, null, ComposableLambdaKt.composableLambda(composer, -964093233, true, new C0579a(this.f46911b)), composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ r mo2invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return r.f5635a;
        }
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    @NotNull
    public static final ComposeView a(@NotNull Context context, @NotNull q<? super Modifier, ? super Composer, ? super Integer, r> qVar) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(qVar, "content");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1870157091, true, new a(qVar)));
        return composeView;
    }
}
