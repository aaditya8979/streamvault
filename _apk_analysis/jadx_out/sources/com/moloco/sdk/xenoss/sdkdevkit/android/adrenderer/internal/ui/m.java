package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.z;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class m {

    public static final class a implements sn.c<BoxScope, Boolean, Boolean, sn.a<? extends bn.r>, sn.l<? super a.AbstractC0696a.c, ? extends bn.r>, Boolean, bn.k, bn.k, sn.a<? extends bn.r>, Composer, Integer, bn.r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Alignment f49043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f49044c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a.AbstractC0696a.c.EnumC0698a f49045d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ z f49046e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ sn.a<bn.r> f49047f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ long f49048g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ long f49049h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ long f49050i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.k f49051j;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.m$a$a, reason: collision with other inner class name */
        public static final class C0641a implements sn.q<AnimatedVisibilityScope, Composer, Integer, bn.r> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a.AbstractC0696a.c.EnumC0698a f49052b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ sn.l<a.AbstractC0696a.c, bn.r> f49053c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ boolean f49054d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ z f49055e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ boolean f49056f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ int f49057g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ int f49058h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ sn.a<bn.r> f49059i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ sn.a<bn.r> f49060j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ long f49061k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ long f49062l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ long f49063m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.internal.ortb.model.k f49064n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public final /* synthetic */ sn.a<bn.r> f49065o;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.m$a$a$a, reason: collision with other inner class name */
            public static final class C0642a implements sn.q<Modifier, Composer, Integer, bn.r> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f49066b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ z f49067c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f49068d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f49069e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ int f49070f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ sn.a<bn.r> f49071g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ sn.a<bn.r> f49072h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ long f49073i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ long f49074j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ long f49075k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public final /* synthetic */ com.moloco.sdk.internal.ortb.model.k f49076l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ sn.a<bn.r> f49077m;

                public C0642a(boolean z10, z zVar, boolean z11, int i10, int i11, sn.a<bn.r> aVar, sn.a<bn.r> aVar2, long j10, long j11, long j12, com.moloco.sdk.internal.ortb.model.k kVar, sn.a<bn.r> aVar3) {
                    this.f49066b = z10;
                    this.f49067c = zVar;
                    this.f49068d = z11;
                    this.f49069e = i10;
                    this.f49070f = i11;
                    this.f49071g = aVar;
                    this.f49072h = aVar2;
                    this.f49073i = j10;
                    this.f49074j = j11;
                    this.f49075k = j12;
                    this.f49076l = kVar;
                    this.f49077m = aVar3;
                }

                public static final bn.r a(sn.a aVar, sn.a aVar2) {
                    aVar.invoke();
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                    return bn.r.f5635a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void b(Modifier modifier, Composer composer, int i10) {
                    int i11;
                    tn.p.k(modifier, "modifier");
                    if ((i10 & 6) == 0) {
                        i11 = i10 | (composer.changed(modifier) ? 4 : 2);
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 19) == 18 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(936111551, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.adCountdownButton.<anonymous>.<anonymous>.<anonymous> (AdCountdownButton.kt:68)");
                    }
                    z aVar = this.f49066b ? this.f49067c : new z.a(this.f49068d, this.f49069e, this.f49070f, null);
                    composer.startReplaceableGroup(1166287030);
                    boolean zChanged = composer.changed(this.f49071g) | composer.changed(this.f49072h);
                    final sn.a<bn.r> aVar2 = this.f49071g;
                    final sn.a<bn.r> aVar3 = this.f49072h;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.l
                            @Override // sn.a
                            public final Object invoke() {
                                return m.a.C0641a.C0642a.a(aVar2, aVar3);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceableGroup();
                    y.b(aVar, modifier, (sn.a) objRememberedValue, this.f49066b, this.f49073i, this.f49074j, this.f49075k, this.f49076l, this.f49077m, composer, (i11 << 3) & 112, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // sn.q
                public /* bridge */ /* synthetic */ bn.r invoke(Modifier modifier, Composer composer, Integer num) {
                    b(modifier, composer, num.intValue());
                    return bn.r.f5635a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0641a(a.AbstractC0696a.c.EnumC0698a enumC0698a, sn.l<? super a.AbstractC0696a.c, bn.r> lVar, boolean z10, z zVar, boolean z11, int i10, int i11, sn.a<bn.r> aVar, sn.a<bn.r> aVar2, long j10, long j11, long j12, com.moloco.sdk.internal.ortb.model.k kVar, sn.a<bn.r> aVar3) {
                this.f49052b = enumC0698a;
                this.f49053c = lVar;
                this.f49054d = z10;
                this.f49055e = zVar;
                this.f49056f = z11;
                this.f49057g = i10;
                this.f49058h = i11;
                this.f49059i = aVar;
                this.f49060j = aVar2;
                this.f49061k = j10;
                this.f49062l = j11;
                this.f49063m = j12;
                this.f49064n = kVar;
                this.f49065o = aVar3;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void a(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i10) {
                tn.p.k(animatedVisibilityScope, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(762064671, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.adCountdownButton.<anonymous>.<anonymous> (AdCountdownButton.kt:63)");
                }
                s0.e(Modifier.INSTANCE, this.f49052b, this.f49053c, ComposableLambdaKt.composableLambda(composer, 936111551, true, new C0642a(this.f49054d, this.f49055e, this.f49056f, this.f49057g, this.f49058h, this.f49059i, this.f49060j, this.f49061k, this.f49062l, this.f49063m, this.f49064n, this.f49065o)), composer, 3078, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ bn.r invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
                a(animatedVisibilityScope, composer, num.intValue());
                return bn.r.f5635a;
            }
        }

        public a(Alignment alignment, PaddingValues paddingValues, a.AbstractC0696a.c.EnumC0698a enumC0698a, z zVar, sn.a<bn.r> aVar, long j10, long j11, long j12, com.moloco.sdk.internal.ortb.model.k kVar) {
            this.f49043b = alignment;
            this.f49044c = paddingValues;
            this.f49045d = enumC0698a;
            this.f49046e = zVar;
            this.f49047f = aVar;
            this.f49048g = j10;
            this.f49049h = j11;
            this.f49050i = j12;
            this.f49051j = kVar;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void a(BoxScope boxScope, boolean z10, boolean z11, sn.a<bn.r> aVar, sn.l<? super a.AbstractC0696a.c, bn.r> lVar, boolean z12, int i10, int i11, sn.a<bn.r> aVar2, Composer composer, int i12) {
            int i13;
            tn.p.k(boxScope, "<this>");
            tn.p.k(aVar, "onClick");
            tn.p.k(lVar, "onButtonRendered");
            tn.p.k(aVar2, "onTimerFinish");
            if ((i12 & 6) == 0) {
                i13 = (composer.changed(boxScope) ? 4 : 2) | i12;
            } else {
                i13 = i12;
            }
            if ((i12 & 48) == 0) {
                i13 |= composer.changed(z10) ? 32 : 16;
            }
            if ((i12 & 384) == 0) {
                i13 |= composer.changed(z11) ? 256 : 128;
            }
            if ((i12 & 3072) == 0) {
                i13 |= composer.changed(aVar) ? 2048 : 1024;
            }
            if ((i12 & 24576) == 0) {
                i13 |= composer.changed(lVar) ? 16384 : 8192;
            }
            if ((i12 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i13 |= composer.changed(z12) ? 131072 : 65536;
            }
            if ((1572864 & i12) == 0) {
                i13 |= composer.changed(i10) ? 1048576 : 524288;
            }
            if ((12582912 & i12) == 0) {
                i13 |= composer.changed(i11) ? 8388608 : 4194304;
            }
            if ((i12 & 100663296) == 0) {
                i13 |= composer.changed(aVar2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            }
            if ((306783379 & i13) == 306783378 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-201776905, i13, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.adCountdownButton.<anonymous> (AdCountdownButton.kt:56)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(z11, PaddingKt.padding(WindowInsetsPadding_androidKt.displayCutoutPadding(boxScope.align(Modifier.INSTANCE, this.f49043b)), this.f49044c), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, 762064671, true, new C0641a(this.f49045d, lVar, z10, this.f49046e, z12, i10, i11, aVar, this.f49047f, this.f49048g, this.f49049h, this.f49050i, this.f49051j, aVar2)), composer, ((i13 >> 6) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // sn.c
        public /* bridge */ /* synthetic */ bn.r invoke(BoxScope boxScope, Boolean bool, Boolean bool2, sn.a<? extends bn.r> aVar, sn.l<? super a.AbstractC0696a.c, ? extends bn.r> lVar, Boolean bool3, bn.k kVar, bn.k kVar2, sn.a<? extends bn.r> aVar2, Composer composer, Integer num) {
            a(boxScope, bool.booleanValue(), bool2.booleanValue(), aVar, lVar, bool3.booleanValue(), kVar.f(), kVar2.f(), aVar2, composer, num.intValue());
            return bn.r.f5635a;
        }
    }

    @Composable
    @NotNull
    public static final sn.c<BoxScope, Boolean, Boolean, sn.a<bn.r>, sn.l<? super a.AbstractC0696a.c, bn.r>, Boolean, bn.k, bn.k, sn.a<bn.r>, Composer, Integer, bn.r> a(@NotNull Alignment alignment, @NotNull PaddingValues paddingValues, long j10, long j11, long j12, @NotNull z zVar, @NotNull a.AbstractC0696a.c.EnumC0698a enumC0698a, @Nullable sn.a<bn.r> aVar, @Nullable com.moloco.sdk.internal.ortb.model.k kVar, @Nullable Composer composer, int i10) {
        tn.p.k(alignment, "alignment");
        tn.p.k(paddingValues, VastAttributes.PADDING);
        tn.p.k(zVar, "afterCountdownButtonPart");
        tn.p.k(enumC0698a, "buttonType");
        composer.startReplaceableGroup(-398768076);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-398768076, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.adCountdownButton (AdCountdownButton.kt:54)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -201776905, true, new a(alignment, paddingValues, enumC0698a, zVar, aVar, j10, j11, j12, kVar));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }
}
