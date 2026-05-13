package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.content.Context;
import android.view.View;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.moloco.sdk.R$drawable;
import com.moloco.sdk.R$id;
import com.moloco.sdk.R$string;
import com.moloco.sdk.service_locator.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.KFunction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    public static final class a implements sn.q<i.a, Composer, Integer, bn.r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y f50257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ sn.u<BoxScope, Boolean, Boolean, sn.p<? super a.AbstractC0696a.c, ? super a.AbstractC0696a.c.EnumC0698a, bn.r>, sn.l<? super Boolean, bn.r>, Composer, Integer, bn.r> f50258c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ sn.s<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Composer, Integer, bn.r> f50259d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ sn.t<BoxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, sn.a<bn.r>, sn.a<bn.r>, Composer, Integer, bn.r> f50260e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ sn.u<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, sn.l<? super Boolean, bn.r>, sn.a<bn.r>, Composer, Integer, bn.r> f50261f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0 f50262g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i f50263h;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0676a extends FunctionReferenceImpl implements sn.a<bn.r> {
            public C0676a(Object obj) {
                super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.class, "onReplay", "onReplay()V", 0);
            }

            public final void a() {
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) this.receiver).z();
            }

            @Override // sn.a
            public /* bridge */ /* synthetic */ bn.r invoke() {
                a();
                return bn.r.f5635a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(y yVar, sn.u<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.p<? super a.AbstractC0696a.c, ? super a.AbstractC0696a.c.EnumC0698a, bn.r>, ? super sn.l<? super Boolean, bn.r>, ? super Composer, ? super Integer, bn.r> uVar, sn.s<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, bn.r> sVar, sn.t<? super BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super sn.a<bn.r>, ? super sn.a<bn.r>, ? super Composer, ? super Integer, bn.r> tVar, sn.u<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super sn.l<? super Boolean, bn.r>, ? super sn.a<bn.r>, ? super Composer, ? super Integer, bn.r> uVar2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0 c0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar) {
            this.f50257b = yVar;
            this.f50258c = uVar;
            this.f50259d = sVar;
            this.f50260e = tVar;
            this.f50261f = uVar2;
            this.f50262g = c0Var;
            this.f50263h = iVar;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void a(i.a aVar, Composer composer, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.changed(aVar) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(922799232, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastRenderer.<anonymous>.<anonymous> (VastRenderer.kt:89)");
            }
            if (aVar instanceof i.a.C0665a) {
                composer.startReplaceableGroup(1864273263);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.j jVarB = ((i.a.C0665a) aVar).b();
                y yVar = this.f50257b;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.a.e(jVarB, yVar != null ? yVar.a() : null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 384, 0);
                composer.endReplaceableGroup();
            } else if (aVar instanceof i.a.c) {
                composer.startReplaceableGroup(1864280980);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m mVarB = ((i.a.c) aVar).b();
                y yVar2 = this.f50257b;
                sn.a<bn.r> aVarC = yVar2 != null ? yVar2.c() : null;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                sn.u<BoxScope, Boolean, Boolean, sn.p<? super a.AbstractC0696a.c, ? super a.AbstractC0696a.c.EnumC0698a, bn.r>, sn.l<? super Boolean, bn.r>, Composer, Integer, bn.r> uVar = this.f50258c;
                sn.s<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Composer, Integer, bn.r> sVar = this.f50259d;
                sn.t<BoxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, sn.a<bn.r>, sn.a<bn.r>, Composer, Integer, bn.r> tVar = this.f50260e;
                sn.u<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, sn.l<? super Boolean, bn.r>, sn.a<bn.r>, Composer, Integer, bn.r> uVar2 = this.f50261f;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0 c0Var = this.f50262g;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar = this.f50263h;
                composer.startReplaceableGroup(1864292587);
                boolean zChanged = composer.changed(iVar);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new C0676a(iVar);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.l(mVarB, aVarC, modifierFillMaxSize$default, uVar, sVar, tVar, uVar2, c0Var, (sn.a) ((KFunction) objRememberedValue), composer, 384, 0);
                composer.endReplaceableGroup();
            } else if (aVar instanceof i.a.b) {
                composer.startReplaceableGroup(1864295522);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e eVarB = ((i.a.b) aVar).b();
                y yVar3 = this.f50257b;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f.d(eVarB, yVar3 != null ? yVar3.b() : null, this.f50260e, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 3072, 0);
                composer.endReplaceableGroup();
            } else if (aVar instanceof i.a.d) {
                composer.startReplaceableGroup(1958861182);
                composer.endReplaceableGroup();
            } else {
                if (aVar != null) {
                    composer.startReplaceableGroup(1864272034);
                    composer.endReplaceableGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceableGroup(1958899498);
                composer.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // sn.q
        public /* bridge */ /* synthetic */ bn.r invoke(i.a aVar, Composer composer, Integer num) {
            a(aVar, composer, num.intValue());
            return bn.r.f5635a;
        }
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements sn.l<a.AbstractC0696a.c, bn.r> {
        public b(Object obj) {
            super(1, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.class, "onButtonRendered", "onButtonRendered(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/CustomUserEventBuilderService$UserInteraction$Button;)V", 0);
        }

        public final void a(a.AbstractC0696a.c cVar) {
            tn.p.k(cVar, "p0");
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) this.receiver).l(cVar);
        }

        @Override // sn.l
        public /* bridge */ /* synthetic */ bn.r invoke(a.AbstractC0696a.c cVar) {
            a(cVar);
            return bn.r.f5635a;
        }
    }

    public /* synthetic */ class c extends FunctionReferenceImpl implements sn.a<bn.r> {
        public c(Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.class, "onCTA", "onCTA()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) this.receiver).A();
        }

        @Override // sn.a
        public /* bridge */ /* synthetic */ bn.r invoke() {
            a();
            return bn.r.f5635a;
        }
    }

    public /* synthetic */ class d extends FunctionReferenceImpl implements sn.l<a.AbstractC0696a.c, bn.r> {
        public d(Object obj) {
            super(1, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.class, "onButtonRendered", "onButtonRendered(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/CustomUserEventBuilderService$UserInteraction$Button;)V", 0);
        }

        public final void a(a.AbstractC0696a.c cVar) {
            tn.p.k(cVar, "p0");
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) this.receiver).l(cVar);
        }

        @Override // sn.l
        public /* bridge */ /* synthetic */ bn.r invoke(a.AbstractC0696a.c cVar) {
            a(cVar);
            return bn.r.f5635a;
        }
    }

    public static final class e implements sn.u<BoxScope, Boolean, go.u<? extends i.a>, sn.l<? super a.AbstractC0696a.c, ? extends bn.r>, sn.a<? extends bn.r>, Composer, Integer, bn.r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Alignment f50264b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f50265c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f50266d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f50267e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f50268f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ sn.a<bn.r> f50269g;

        public static final class a implements sn.q<AnimatedVisibilityScope, Composer, Integer, bn.r> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ sn.l<a.AbstractC0696a.c, bn.r> f50270b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ State<i.a> f50271c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f50272d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f50273e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ long f50274f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ sn.a<bn.r> f50275g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ sn.a<bn.r> f50276h;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n$e$a$a, reason: collision with other inner class name */
            public static final class C0677a implements sn.q<Modifier, Composer, Integer, bn.r> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f50277b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f50278c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f50279d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ sn.a<bn.r> f50280e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ sn.a<bn.r> f50281f;

                public C0677a(String str, String str2, long j10, sn.a<bn.r> aVar, sn.a<bn.r> aVar2) {
                    this.f50277b = str;
                    this.f50278c = str2;
                    this.f50279d = j10;
                    this.f50280e = aVar;
                    this.f50281f = aVar2;
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
                    tn.p.k(modifier, "it");
                    if ((i10 & 6) == 0) {
                        i10 |= composer.changed(modifier) ? 4 : 2;
                    }
                    if ((i10 & 19) == 18 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-832302220, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultCTAButton.<anonymous>.<anonymous>.<anonymous> (VastRenderer.kt:324)");
                    }
                    String str = this.f50277b;
                    String str2 = this.f50278c;
                    long j10 = this.f50279d;
                    composer.startReplaceableGroup(-1483987143);
                    boolean zChanged = composer.changed(this.f50280e) | composer.changed(this.f50281f);
                    final sn.a<bn.r> aVar = this.f50280e;
                    final sn.a<bn.r> aVar2 = this.f50281f;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j0
                            @Override // sn.a
                            public final Object invoke() {
                                return n.e.a.C0677a.a(aVar, aVar2);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceableGroup();
                    c0.c(modifier, str, str2, j10, (sn.a) objRememberedValue, composer, i10 & 14, 0);
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

            public static final class b implements sn.q<Modifier, Composer, Integer, bn.r> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f50282b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f50283c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f50284d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ sn.a<bn.r> f50285e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ sn.a<bn.r> f50286f;

                public b(String str, String str2, long j10, sn.a<bn.r> aVar, sn.a<bn.r> aVar2) {
                    this.f50282b = str;
                    this.f50283c = str2;
                    this.f50284d = j10;
                    this.f50285e = aVar;
                    this.f50286f = aVar2;
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
                    tn.p.k(modifier, "it");
                    if ((i10 & 6) == 0) {
                        i10 |= composer.changed(modifier) ? 4 : 2;
                    }
                    if ((i10 & 19) == 18 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1517460509, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultCTAButton.<anonymous>.<anonymous>.<anonymous> (VastRenderer.kt:341)");
                    }
                    String str = this.f50282b;
                    String str2 = this.f50283c;
                    long j10 = this.f50284d;
                    composer.startReplaceableGroup(-1483968071);
                    boolean zChanged = composer.changed(this.f50285e) | composer.changed(this.f50286f);
                    final sn.a<bn.r> aVar = this.f50285e;
                    final sn.a<bn.r> aVar2 = this.f50286f;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k0
                            @Override // sn.a
                            public final Object invoke() {
                                return n.e.a.b.a(aVar, aVar2);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceableGroup();
                    c0.c(modifier, str, str2, j10, (sn.a) objRememberedValue, composer, i10 & 14, 0);
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
            public a(sn.l<? super a.AbstractC0696a.c, bn.r> lVar, State<? extends i.a> state, String str, String str2, long j10, sn.a<bn.r> aVar, sn.a<bn.r> aVar2) {
                this.f50270b = lVar;
                this.f50271c = state;
                this.f50272d = str;
                this.f50273e = str2;
                this.f50274f = j10;
                this.f50275g = aVar;
                this.f50276h = aVar2;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void a(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i10) {
                tn.p.k(animatedVisibilityScope, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1004334236, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultCTAButton.<anonymous>.<anonymous> (VastRenderer.kt:318)");
                }
                i.a aVarC = e.c(this.f50271c);
                if (aVarC instanceof i.a.C0665a) {
                    composer.startReplaceableGroup(1203921843);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s0.e(null, a.AbstractC0696a.c.EnumC0698a.f50949g, this.f50270b, ComposableLambdaKt.composableLambda(composer, -832302220, true, new C0677a(this.f50272d, this.f50273e, this.f50274f, this.f50275g, this.f50276h)), composer, 3120, 1);
                    composer.endReplaceableGroup();
                } else if (aVarC instanceof i.a.c) {
                    composer.startReplaceableGroup(1204513075);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s0.e(null, a.AbstractC0696a.c.EnumC0698a.f50949g, this.f50270b, ComposableLambdaKt.composableLambda(composer, 1517460509, true, new b(this.f50272d, this.f50273e, this.f50274f, this.f50275g, this.f50276h)), composer, 3120, 1);
                    composer.endReplaceableGroup();
                } else if (aVarC instanceof i.a.b) {
                    composer.startReplaceableGroup(1205086575);
                    composer.endReplaceableGroup();
                } else if (aVarC instanceof i.a.d) {
                    composer.startReplaceableGroup(1205171980);
                    composer.endReplaceableGroup();
                } else {
                    if (aVarC != null) {
                        composer.startReplaceableGroup(-1485185849);
                        composer.endReplaceableGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer.startReplaceableGroup(1205206731);
                    composer.endReplaceableGroup();
                }
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

        public e(Alignment alignment, PaddingValues paddingValues, String str, String str2, long j10, sn.a<bn.r> aVar) {
            this.f50264b = alignment;
            this.f50265c = paddingValues;
            this.f50266d = str;
            this.f50267e = str2;
            this.f50268f = j10;
            this.f50269g = aVar;
        }

        public static final i.a c(State<? extends i.a> state) {
            return state.getValue();
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void b(BoxScope boxScope, boolean z10, go.u<? extends i.a> uVar, sn.l<? super a.AbstractC0696a.c, bn.r> lVar, sn.a<bn.r> aVar, Composer composer, int i10) {
            tn.p.k(boxScope, "<this>");
            tn.p.k(uVar, "currentAdPartFlow");
            tn.p.k(lVar, "onButtonRendered");
            tn.p.k(aVar, "onCTA");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(432764356, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultCTAButton.<anonymous> (VastRenderer.kt:299)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(z10, PaddingKt.padding(WindowInsetsPadding_androidKt.displayCutoutPadding(boxScope.align(Modifier.INSTANCE, this.f50264b)), this.f50265c), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, 1004334236, true, new a(lVar, SnapshotStateKt.collectAsState(uVar, null, composer, (i10 >> 6) & 14, 1), this.f50266d, this.f50267e, this.f50268f, aVar, this.f50269g)), composer, ((i10 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // sn.u
        public /* bridge */ /* synthetic */ bn.r invoke(BoxScope boxScope, Boolean bool, go.u<? extends i.a> uVar, sn.l<? super a.AbstractC0696a.c, ? extends bn.r> lVar, sn.a<? extends bn.r> aVar, Composer composer, Integer num) {
            b(boxScope, bool.booleanValue(), uVar, lVar, aVar, composer, num.intValue());
            return bn.r.f5635a;
        }
    }

    public static final class f implements sn.u<BoxScope, Boolean, Boolean, sn.p<? super a.AbstractC0696a.c, ? super a.AbstractC0696a.c.EnumC0698a, ? extends bn.r>, sn.l<? super Boolean, ? extends bn.r>, Composer, Integer, bn.r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Alignment f50287b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f50288c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Painter f50289d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Painter f50290e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ sn.a<bn.r> f50291f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ long f50292g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ long f50293h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ long f50294i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Shape f50295j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ long f50296k;

        public static final class a implements sn.q<AnimatedVisibilityScope, Composer, Integer, bn.r> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f50297b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Painter f50298c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Painter f50299d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ MutableState<a.AbstractC0696a.c> f50300e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ sn.p<a.AbstractC0696a.c, a.AbstractC0696a.c.EnumC0698a, bn.r> f50301f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ sn.l<Boolean, bn.r> f50302g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ sn.a<bn.r> f50303h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ boolean f50304i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ long f50305j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ long f50306k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ long f50307l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ Shape f50308m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final /* synthetic */ long f50309n;

            /* JADX WARN: Multi-variable type inference failed */
            public a(boolean z10, Painter painter, Painter painter2, MutableState<a.AbstractC0696a.c> mutableState, sn.p<? super a.AbstractC0696a.c, ? super a.AbstractC0696a.c.EnumC0698a, bn.r> pVar, sn.l<? super Boolean, bn.r> lVar, sn.a<bn.r> aVar, boolean z11, long j10, long j11, long j12, Shape shape, long j13) {
                this.f50297b = z10;
                this.f50298c = painter;
                this.f50299d = painter2;
                this.f50300e = mutableState;
                this.f50301f = pVar;
                this.f50302g = lVar;
                this.f50303h = aVar;
                this.f50304i = z11;
                this.f50305j = j10;
                this.f50306k = j11;
                this.f50307l = j12;
                this.f50308m = shape;
                this.f50309n = j13;
            }

            public static final bn.r a(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
                tn.p.k(semanticsPropertyReceiver, "$this$semantics");
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                SemanticsPropertiesKt.setTestTag(semanticsPropertyReceiver, str);
                return bn.r.f5635a;
            }

            public static final bn.r b(sn.l lVar, boolean z10, sn.p pVar, sn.a aVar, MutableState mutableState) {
                lVar.invoke(Boolean.valueOf(!z10));
                f.e(mutableState, new a.AbstractC0696a.c(z10 ? a.AbstractC0696a.c.EnumC0698a.f50947e : a.AbstractC0696a.c.EnumC0698a.f50948f, f.d(mutableState).d(), f.d(mutableState).e()));
                pVar.mo2invoke(f.d(mutableState), z10 ? a.AbstractC0696a.c.EnumC0698a.f50948f : a.AbstractC0696a.c.EnumC0698a.f50947e);
                if (aVar != null) {
                    aVar.invoke();
                }
                return bn.r.f5635a;
            }

            public static final bn.r c(sn.p pVar, boolean z10, MutableState mutableState, a.AbstractC0696a.c cVar) {
                tn.p.k(cVar, "it");
                f.e(mutableState, cVar);
                pVar.mo2invoke(f.d(mutableState), z10 ? a.AbstractC0696a.c.EnumC0698a.f50947e : a.AbstractC0696a.c.EnumC0698a.f50948f);
                return bn.r.f5635a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void d(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i10) {
                tn.p.k(animatedVisibilityScope, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2071462974, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultMuteButton.<anonymous>.<anonymous> (VastRenderer.kt:246)");
                }
                final String str = "mute_button";
                Painter painter = this.f50297b ? this.f50298c : this.f50299d;
                Modifier.Companion companion = Modifier.INSTANCE;
                a.AbstractC0696a.c cVarD = f.d(this.f50300e);
                composer.startReplaceableGroup(-133196587);
                boolean zChanged = composer.changed(this.f50300e) | composer.changed(this.f50301f) | composer.changed(this.f50297b);
                final sn.p<a.AbstractC0696a.c, a.AbstractC0696a.c.EnumC0698a, bn.r> pVar = this.f50301f;
                final boolean z10 = this.f50297b;
                final MutableState<a.AbstractC0696a.c> mutableState = this.f50300e;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new sn.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.l0
                        @Override // sn.l
                        public final Object invoke(Object obj) {
                            return n.f.a.c(pVar, z10, mutableState, (a.AbstractC0696a.c) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                Modifier modifierA = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.modifiers.b.a(companion, cVarD, (sn.l) objRememberedValue);
                composer.startReplaceableGroup(-133189503);
                boolean zChanged2 = composer.changed("mute_button");
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new sn.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m0
                        @Override // sn.l
                        public final Object invoke(Object obj) {
                            return n.f.a.a(str, (SemanticsPropertyReceiver) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierA, false, (sn.l) objRememberedValue2, 1, null);
                composer.startReplaceableGroup(-133183173);
                boolean zChanged3 = composer.changed(this.f50302g) | composer.changed(this.f50297b) | composer.changed(this.f50300e) | composer.changed(this.f50301f) | composer.changed(this.f50303h);
                final sn.l<Boolean, bn.r> lVar = this.f50302g;
                final boolean z11 = this.f50297b;
                final sn.p<a.AbstractC0696a.c, a.AbstractC0696a.c.EnumC0698a, bn.r> pVar2 = this.f50301f;
                final sn.a<bn.r> aVar = this.f50303h;
                final MutableState<a.AbstractC0696a.c> mutableState2 = this.f50300e;
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n0
                        @Override // sn.a
                        public final Object invoke() {
                            return n.f.a.b(lVar, z11, pVar2, aVar, mutableState2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceableGroup();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.f0.b(painter, (sn.a) objRememberedValue3, modifierSemantics$default, this.f50304i, "mute/unmute", this.f50305j, this.f50306k, this.f50307l, this.f50308m, this.f50309n, composer, 24576, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ bn.r invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
                d(animatedVisibilityScope, composer, num.intValue());
                return bn.r.f5635a;
            }
        }

        public f(Alignment alignment, PaddingValues paddingValues, Painter painter, Painter painter2, sn.a<bn.r> aVar, long j10, long j11, long j12, Shape shape, long j13) {
            this.f50287b = alignment;
            this.f50288c = paddingValues;
            this.f50289d = painter;
            this.f50290e = painter2;
            this.f50291f = aVar;
            this.f50292g = j10;
            this.f50293h = j11;
            this.f50294i = j12;
            this.f50295j = shape;
            this.f50296k = j13;
        }

        public static final a.AbstractC0696a.c d(MutableState<a.AbstractC0696a.c> mutableState) {
            return mutableState.getValue();
        }

        public static final void e(MutableState<a.AbstractC0696a.c> mutableState, a.AbstractC0696a.c cVar) {
            mutableState.setValue(cVar);
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void b(BoxScope boxScope, boolean z10, boolean z11, sn.p<? super a.AbstractC0696a.c, ? super a.AbstractC0696a.c.EnumC0698a, bn.r> pVar, sn.l<? super Boolean, bn.r> lVar, Composer composer, int i10) {
            int i11;
            tn.p.k(boxScope, "<this>");
            tn.p.k(pVar, "onButtonReplaced");
            tn.p.k(lVar, "onMuteChange");
            if ((i10 & 6) == 0) {
                i11 = (composer.changed(boxScope) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= composer.changed(z10) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                i11 |= composer.changed(z11) ? 256 : 128;
            }
            if ((i10 & 3072) == 0) {
                i11 |= composer.changed(pVar) ? 2048 : 1024;
            }
            if ((i10 & 24576) == 0) {
                i11 |= composer.changed(lVar) ? 16384 : 8192;
            }
            if ((74899 & i11) == 74898 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-545982054, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultMuteButton.<anonymous> (VastRenderer.kt:235)");
            }
            composer.startReplaceableGroup(-1304242935);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.b.a(a.AbstractC0696a.c.EnumC0698a.f50947e), null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            AnimatedVisibilityKt.AnimatedVisibility(z10, PaddingKt.padding(WindowInsetsPadding_androidKt.displayCutoutPadding(boxScope.align(Modifier.INSTANCE, this.f50287b)), this.f50288c), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, -2071462974, true, new a(z11, this.f50289d, this.f50290e, (MutableState) objRememberedValue, pVar, lVar, this.f50291f, z10, this.f50292g, this.f50293h, this.f50294i, this.f50295j, this.f50296k)), composer, ((i11 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // sn.u
        public /* bridge */ /* synthetic */ bn.r invoke(BoxScope boxScope, Boolean bool, Boolean bool2, sn.p<? super a.AbstractC0696a.c, ? super a.AbstractC0696a.c.EnumC0698a, ? extends bn.r> pVar, sn.l<? super Boolean, ? extends bn.r> lVar, Composer composer, Integer num) {
            b(boxScope, bool.booleanValue(), bool2.booleanValue(), pVar, lVar, composer, num.intValue());
            return bn.r.f5635a;
        }
    }

    public static final class g implements sn.s<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Composer, Integer, bn.r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Alignment f50310b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f50311c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f50312d;

        public static final class a implements sn.q<AnimatedVisibilityScope, Composer, Integer, bn.r> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f50313b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i f50314c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ long f50315d;

            public a(boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar, long j10) {
                this.f50313b = z10;
                this.f50314c = iVar;
                this.f50315d = j10;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void a(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i10) {
                tn.p.k(animatedVisibilityScope, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1435522410, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultProgressBar.<anonymous>.<anonymous> (VastRenderer.kt:382)");
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m.g(this.f50313b, this.f50314c, null, this.f50315d, composer, 0, 4);
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

        public g(Alignment alignment, PaddingValues paddingValues, long j10) {
            this.f50310b = alignment;
            this.f50311c = paddingValues;
            this.f50312d = j10;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void a(BoxScope boxScope, boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar, Composer composer, int i10) {
            int i11;
            tn.p.k(boxScope, "<this>");
            tn.p.k(iVar, "progress");
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
            if ((i11 & 1171) == 1170 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1967084142, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultProgressBar.<anonymous> (VastRenderer.kt:374)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(z10 || ((iVar instanceof i.c) && ((i.c) iVar).a() > 0), PaddingKt.padding(boxScope.align(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), this.f50310b), this.f50311c), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, -1435522410, true, new a(z10, iVar, this.f50312d)), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // sn.s
        public /* bridge */ /* synthetic */ bn.r invoke(BoxScope boxScope, Boolean bool, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar, Composer composer, Integer num) {
            a(boxScope, bool.booleanValue(), iVar, composer, num.intValue());
            return bn.r.f5635a;
        }
    }

    public static final class h implements sn.p<Composer, Integer, sn.u<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.p<? super a.AbstractC0696a.c, ? super a.AbstractC0696a.c.EnumC0698a, ? extends bn.r>, ? super sn.l<? super Boolean, ? extends bn.r>, ? super Composer, ? super Integer, ? extends bn.r>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f50316b = new h();

        @Composable
        public final sn.u<BoxScope, Boolean, Boolean, sn.p<? super a.AbstractC0696a.c, ? super a.AbstractC0696a.c.EnumC0698a, bn.r>, sn.l<? super Boolean, bn.r>, Composer, Integer, bn.r> a(Composer composer, int i10) {
            composer.startReplaceableGroup(1761408483);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1761408483, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:176)");
            }
            sn.u<BoxScope, Boolean, Boolean, sn.p<? super a.AbstractC0696a.c, ? super a.AbstractC0696a.c.EnumC0698a, bn.r>, sn.l<? super Boolean, bn.r>, Composer, Integer, bn.r> uVarG = n.g(0L, 0L, null, 0L, null, null, 0L, null, null, null, composer, 0, 1023);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return uVarG;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ sn.u<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.p<? super a.AbstractC0696a.c, ? super a.AbstractC0696a.c.EnumC0698a, ? extends bn.r>, ? super sn.l<? super Boolean, ? extends bn.r>, ? super Composer, ? super Integer, ? extends bn.r> mo2invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    public static final class i implements sn.p<Composer, Integer, sn.c<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.a<? extends bn.r>, ? super sn.l<? super a.AbstractC0696a.c, ? extends bn.r>, ? super Boolean, ? super bn.k, ? super bn.k, ? super sn.a<? extends bn.r>, ? super Composer, ? super Integer, ? extends bn.r>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final i f50317b = new i();

        @Composable
        public final sn.c<BoxScope, Boolean, Boolean, sn.a<bn.r>, sn.l<? super a.AbstractC0696a.c, bn.r>, Boolean, bn.k, bn.k, sn.a<bn.r>, Composer, Integer, bn.r> a(Composer composer, int i10) {
            composer.startReplaceableGroup(1728711458);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1728711458, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:177)");
            }
            sn.c<BoxScope, Boolean, Boolean, sn.a<bn.r>, sn.l<? super a.AbstractC0696a.c, bn.r>, Boolean, bn.k, bn.k, sn.a<bn.r>, Composer, Integer, bn.r> cVarB = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d0.b(null, null, 0L, 0L, 0L, null, null, null, composer, 0, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return cVarB;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ sn.c<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.a<? extends bn.r>, ? super sn.l<? super a.AbstractC0696a.c, ? extends bn.r>, ? super Boolean, ? super bn.k, ? super bn.k, ? super sn.a<? extends bn.r>, ? super Composer, ? super Integer, ? extends bn.r> mo2invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    public static final class j implements sn.p<Composer, Integer, sn.c<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.a<? extends bn.r>, ? super sn.l<? super a.AbstractC0696a.c, ? extends bn.r>, ? super Boolean, ? super bn.k, ? super bn.k, ? super sn.a<? extends bn.r>, ? super Composer, ? super Integer, ? extends bn.r>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j f50318b = new j();

        @Composable
        public final sn.c<BoxScope, Boolean, Boolean, sn.a<bn.r>, sn.l<? super a.AbstractC0696a.c, bn.r>, Boolean, bn.k, bn.k, sn.a<bn.r>, Composer, Integer, bn.r> a(Composer composer, int i10) {
            composer.startReplaceableGroup(-810694173);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-810694173, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:178)");
            }
            sn.c<BoxScope, Boolean, Boolean, sn.a<bn.r>, sn.l<? super a.AbstractC0696a.c, bn.r>, Boolean, bn.k, bn.k, sn.a<bn.r>, Composer, Integer, bn.r> cVarC = p.c(null, null, 0L, 0L, 0L, null, null, null, composer, 0, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return cVarC;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ sn.c<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.a<? extends bn.r>, ? super sn.l<? super a.AbstractC0696a.c, ? extends bn.r>, ? super Boolean, ? super bn.k, ? super bn.k, ? super sn.a<? extends bn.r>, ? super Composer, ? super Integer, ? extends bn.r> mo2invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    public static final class k implements sn.p<Composer, Integer, sn.u<? super BoxScope, ? super Boolean, ? super go.u<? extends i.a>, ? super sn.l<? super a.AbstractC0696a.c, ? extends bn.r>, ? super sn.a<? extends bn.r>, ? super Composer, ? super Integer, ? extends bn.r>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final k f50319b = new k();

        @Composable
        public final sn.u<BoxScope, Boolean, go.u<? extends i.a>, sn.l<? super a.AbstractC0696a.c, bn.r>, sn.a<bn.r>, Composer, Integer, bn.r> a(Composer composer, int i10) {
            composer.startReplaceableGroup(1097958176);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1097958176, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:180)");
            }
            sn.u<BoxScope, Boolean, go.u<? extends i.a>, sn.l<? super a.AbstractC0696a.c, bn.r>, sn.a<bn.r>, Composer, Integer, bn.r> uVarH = n.h(null, null, 0L, null, null, null, composer, 0, 63);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return uVarH;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ sn.u<? super BoxScope, ? super Boolean, ? super go.u<? extends i.a>, ? super sn.l<? super a.AbstractC0696a.c, ? extends bn.r>, ? super sn.a<? extends bn.r>, ? super Composer, ? super Integer, ? extends bn.r> mo2invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    public static final class l implements sn.p<Composer, Integer, sn.s<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, ? extends bn.r>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final l f50320b = new l();

        @Composable
        public final sn.s<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Composer, Integer, bn.r> a(Composer composer, int i10) {
            composer.startReplaceableGroup(-997547230);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-997547230, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:182)");
            }
            sn.s<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Composer, Integer, bn.r> sVarF = n.f(null, null, 0L, composer, 0, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return sVarF;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ sn.s<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, ? extends bn.r> mo2invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    public static final class m implements sn.p<Composer, Integer, sn.t<? super BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super sn.a<? extends bn.r>, ? super sn.a<? extends bn.r>, ? super Composer, ? super Integer, ? extends bn.r>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final m f50321b = new m();

        @Composable
        public final sn.t<BoxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, sn.a<bn.r>, sn.a<bn.r>, Composer, Integer, bn.r> a(Composer composer, int i10) {
            composer.startReplaceableGroup(1429360638);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1429360638, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:183)");
            }
            sn.t<BoxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, sn.a<bn.r>, sn.a<bn.r>, Composer, Integer, bn.r> tVarI = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.i(null, null, composer, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return tVarI;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ sn.t<? super BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super sn.a<? extends bn.r>, ? super sn.a<? extends bn.r>, ? super Composer, ? super Integer, ? extends bn.r> mo2invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n$n, reason: collision with other inner class name */
    public static final class C0678n implements sn.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0678n f50322b = new C0678n();

        @Composable
        public final Void a(Composer composer, int i10) {
            composer.startReplaceableGroup(-57236995);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-57236995, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:184)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return null;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo2invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    public static final class o implements sn.p<Composer, Integer, bn.r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i f50323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f50324c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ sn.p<Composer, Integer, sn.u<BoxScope, Boolean, Boolean, sn.p<? super a.AbstractC0696a.c, ? super a.AbstractC0696a.c.EnumC0698a, bn.r>, sn.l<? super Boolean, bn.r>, Composer, Integer, bn.r>> f50325d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ sn.p<Composer, Integer, sn.c<BoxScope, Boolean, Boolean, sn.a<bn.r>, sn.l<? super a.AbstractC0696a.c, bn.r>, Boolean, bn.k, bn.k, sn.a<bn.r>, Composer, Integer, bn.r>> f50326e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ sn.p<Composer, Integer, sn.c<BoxScope, Boolean, Boolean, sn.a<bn.r>, sn.l<? super a.AbstractC0696a.c, bn.r>, Boolean, bn.k, bn.k, sn.a<bn.r>, Composer, Integer, bn.r>> f50327f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ sn.p<Composer, Integer, sn.c<BoxScope, Boolean, Boolean, sn.a<bn.r>, sn.l<? super a.AbstractC0696a.c, bn.r>, Boolean, bn.k, bn.k, sn.a<bn.r>, Composer, Integer, bn.r>> f50328g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ sn.p<Composer, Integer, sn.u<BoxScope, Boolean, go.u<? extends i.a>, sn.l<? super a.AbstractC0696a.c, bn.r>, sn.a<bn.r>, Composer, Integer, bn.r>> f50329h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ y f50330i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ sn.p<Composer, Integer, sn.s<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Composer, Integer, bn.r>> f50331j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ sn.p<Composer, Integer, sn.t<BoxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, sn.a<bn.r>, sn.a<bn.r>, Composer, Integer, bn.r>> f50332k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ sn.p<Composer, Integer, sn.u<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, sn.l<? super Boolean, bn.r>, sn.a<bn.r>, Composer, Integer, bn.r>> f50333l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0 f50334m;

        public static final class a implements sn.p<Composer, Integer, bn.r> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i f50335b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f50336c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ sn.p<Composer, Integer, sn.u<BoxScope, Boolean, Boolean, sn.p<? super a.AbstractC0696a.c, ? super a.AbstractC0696a.c.EnumC0698a, bn.r>, sn.l<? super Boolean, bn.r>, Composer, Integer, bn.r>> f50337d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ sn.p<Composer, Integer, sn.c<BoxScope, Boolean, Boolean, sn.a<bn.r>, sn.l<? super a.AbstractC0696a.c, bn.r>, Boolean, bn.k, bn.k, sn.a<bn.r>, Composer, Integer, bn.r>> f50338e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ sn.p<Composer, Integer, sn.c<BoxScope, Boolean, Boolean, sn.a<bn.r>, sn.l<? super a.AbstractC0696a.c, bn.r>, Boolean, bn.k, bn.k, sn.a<bn.r>, Composer, Integer, bn.r>> f50339f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ sn.p<Composer, Integer, sn.c<BoxScope, Boolean, Boolean, sn.a<bn.r>, sn.l<? super a.AbstractC0696a.c, bn.r>, Boolean, bn.k, bn.k, sn.a<bn.r>, Composer, Integer, bn.r>> f50340g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ sn.p<Composer, Integer, sn.u<BoxScope, Boolean, go.u<? extends i.a>, sn.l<? super a.AbstractC0696a.c, bn.r>, sn.a<bn.r>, Composer, Integer, bn.r>> f50341h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ y f50342i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ sn.p<Composer, Integer, sn.s<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Composer, Integer, bn.r>> f50343j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ sn.p<Composer, Integer, sn.t<BoxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, sn.a<bn.r>, sn.a<bn.r>, Composer, Integer, bn.r>> f50344k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ sn.p<Composer, Integer, sn.u<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, sn.l<? super Boolean, bn.r>, sn.a<bn.r>, Composer, Integer, bn.r>> f50345l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0 f50346m;

            /* JADX WARN: Multi-variable type inference failed */
            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar, long j10, sn.p<? super Composer, ? super Integer, ? extends sn.u<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.p<? super a.AbstractC0696a.c, ? super a.AbstractC0696a.c.EnumC0698a, bn.r>, ? super sn.l<? super Boolean, bn.r>, ? super Composer, ? super Integer, bn.r>> pVar, sn.p<? super Composer, ? super Integer, ? extends sn.c<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.a<bn.r>, ? super sn.l<? super a.AbstractC0696a.c, bn.r>, ? super Boolean, ? super bn.k, ? super bn.k, ? super sn.a<bn.r>, ? super Composer, ? super Integer, bn.r>> pVar2, sn.p<? super Composer, ? super Integer, ? extends sn.c<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.a<bn.r>, ? super sn.l<? super a.AbstractC0696a.c, bn.r>, ? super Boolean, ? super bn.k, ? super bn.k, ? super sn.a<bn.r>, ? super Composer, ? super Integer, bn.r>> pVar3, sn.p<? super Composer, ? super Integer, ? extends sn.c<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.a<bn.r>, ? super sn.l<? super a.AbstractC0696a.c, bn.r>, ? super Boolean, ? super bn.k, ? super bn.k, ? super sn.a<bn.r>, ? super Composer, ? super Integer, bn.r>> pVar4, sn.p<? super Composer, ? super Integer, ? extends sn.u<? super BoxScope, ? super Boolean, ? super go.u<? extends i.a>, ? super sn.l<? super a.AbstractC0696a.c, bn.r>, ? super sn.a<bn.r>, ? super Composer, ? super Integer, bn.r>> pVar5, y yVar, sn.p<? super Composer, ? super Integer, ? extends sn.s<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, bn.r>> pVar6, sn.p<? super Composer, ? super Integer, ? extends sn.t<? super BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super sn.a<bn.r>, ? super sn.a<bn.r>, ? super Composer, ? super Integer, bn.r>> pVar7, sn.p<? super Composer, ? super Integer, ? extends sn.u<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super sn.l<? super Boolean, bn.r>, ? super sn.a<bn.r>, ? super Composer, ? super Integer, bn.r>> pVar8, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0 c0Var) {
                this.f50335b = iVar;
                this.f50336c = j10;
                this.f50337d = pVar;
                this.f50338e = pVar2;
                this.f50339f = pVar3;
                this.f50340g = pVar4;
                this.f50341h = pVar5;
                this.f50342i = yVar;
                this.f50343j = pVar6;
                this.f50344k = pVar7;
                this.f50345l = pVar8;
                this.f50346m = c0Var;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-791297765, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VastRenderer.kt:192)");
                }
                n.i(this.f50335b, null, this.f50336c, this.f50337d.mo2invoke(composer, 0), this.f50338e.mo2invoke(composer, 0), this.f50339f.mo2invoke(composer, 0), this.f50340g.mo2invoke(composer, 0), this.f50341h.mo2invoke(composer, 0), this.f50342i, this.f50343j.mo2invoke(composer, 0), this.f50344k.mo2invoke(composer, 0), this.f50345l.mo2invoke(composer, 0), this.f50346m, composer, 0, 0, 2);
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

        /* JADX WARN: Multi-variable type inference failed */
        public o(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar, long j10, sn.p<? super Composer, ? super Integer, ? extends sn.u<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.p<? super a.AbstractC0696a.c, ? super a.AbstractC0696a.c.EnumC0698a, bn.r>, ? super sn.l<? super Boolean, bn.r>, ? super Composer, ? super Integer, bn.r>> pVar, sn.p<? super Composer, ? super Integer, ? extends sn.c<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.a<bn.r>, ? super sn.l<? super a.AbstractC0696a.c, bn.r>, ? super Boolean, ? super bn.k, ? super bn.k, ? super sn.a<bn.r>, ? super Composer, ? super Integer, bn.r>> pVar2, sn.p<? super Composer, ? super Integer, ? extends sn.c<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.a<bn.r>, ? super sn.l<? super a.AbstractC0696a.c, bn.r>, ? super Boolean, ? super bn.k, ? super bn.k, ? super sn.a<bn.r>, ? super Composer, ? super Integer, bn.r>> pVar3, sn.p<? super Composer, ? super Integer, ? extends sn.c<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.a<bn.r>, ? super sn.l<? super a.AbstractC0696a.c, bn.r>, ? super Boolean, ? super bn.k, ? super bn.k, ? super sn.a<bn.r>, ? super Composer, ? super Integer, bn.r>> pVar4, sn.p<? super Composer, ? super Integer, ? extends sn.u<? super BoxScope, ? super Boolean, ? super go.u<? extends i.a>, ? super sn.l<? super a.AbstractC0696a.c, bn.r>, ? super sn.a<bn.r>, ? super Composer, ? super Integer, bn.r>> pVar5, y yVar, sn.p<? super Composer, ? super Integer, ? extends sn.s<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, bn.r>> pVar6, sn.p<? super Composer, ? super Integer, ? extends sn.t<? super BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super sn.a<bn.r>, ? super sn.a<bn.r>, ? super Composer, ? super Integer, bn.r>> pVar7, sn.p<? super Composer, ? super Integer, ? extends sn.u<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super sn.l<? super Boolean, bn.r>, ? super sn.a<bn.r>, ? super Composer, ? super Integer, bn.r>> pVar8, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0 c0Var) {
            this.f50323b = iVar;
            this.f50324c = j10;
            this.f50325d = pVar;
            this.f50326e = pVar2;
            this.f50327f = pVar3;
            this.f50328g = pVar4;
            this.f50329h = pVar5;
            this.f50330i = yVar;
            this.f50331j = pVar6;
            this.f50332k = pVar7;
            this.f50333l = pVar8;
            this.f50334m = c0Var;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(323893560, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous>.<anonymous>.<anonymous> (VastRenderer.kt:191)");
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.d.b(false, ComposableLambdaKt.composableLambda(composer, -791297765, true, new a(this.f50323b, this.f50324c, this.f50325d, this.f50326e, this.f50327f, this.f50328g, this.f50329h, this.f50330i, this.f50331j, this.f50332k, this.f50333l, this.f50334m)), composer, 48, 1);
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

    public static final ComposeView a(long j10, sn.p pVar, sn.p pVar2, sn.p pVar3, sn.p pVar4, sn.p pVar5, y yVar, sn.p pVar6, sn.p pVar7, sn.p pVar8, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0 c0Var, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(iVar, "adViewModel");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setId(R$id.moloco_fullscreen_ad_view_id);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(323893560, true, new o(iVar, j10, pVar, pVar2, pVar3, pVar4, pVar5, yVar, pVar6, pVar7, pVar8, c0Var)));
        return composeView;
    }

    public static final bn.r b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar, Modifier modifier, long j10, sn.u uVar, sn.c cVar, sn.c cVar2, sn.c cVar3, sn.u uVar2, y yVar, sn.s sVar, sn.t tVar, sn.u uVar3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0 c0Var, int i10, int i11, int i12, Composer composer, int i13) {
        i(iVar, modifier, j10, uVar, cVar, cVar2, cVar3, uVar2, yVar, sVar, tVar, uVar3, c0Var, composer, i10 | 1, i11, i12);
        return bn.r.f5635a;
    }

    public static final i.a c(State<? extends i.a> state) {
        return state.getValue();
    }

    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable:[androidx.compose.ui.UiComposable]][androidx.compose.ui.UiComposable:[_]][androidx.compose.ui.UiComposable:[_]][androidx.compose.ui.UiComposable:[_]][androidx.compose.ui.UiComposable:[androidx.compose.ui.UiComposable]][androidx.compose.ui.UiComposable:[androidx.compose.ui.UiComposable]][androidx.compose.ui.UiComposable:[androidx.compose.ui.UiComposable]][androidx.compose.ui.UiComposable:[androidx.compose.ui.UiComposable]]]")
    @NotNull
    public static final sn.p<Context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, View> d(final long j10, @NotNull final sn.p<? super Composer, ? super Integer, ? extends sn.u<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.p<? super a.AbstractC0696a.c, ? super a.AbstractC0696a.c.EnumC0698a, bn.r>, ? super sn.l<? super Boolean, bn.r>, ? super Composer, ? super Integer, bn.r>> pVar, @NotNull final sn.p<? super Composer, ? super Integer, ? extends sn.c<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.a<bn.r>, ? super sn.l<? super a.AbstractC0696a.c, bn.r>, ? super Boolean, ? super bn.k, ? super bn.k, ? super sn.a<bn.r>, ? super Composer, ? super Integer, bn.r>> pVar2, @NotNull final sn.p<? super Composer, ? super Integer, ? extends sn.c<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.a<bn.r>, ? super sn.l<? super a.AbstractC0696a.c, bn.r>, ? super Boolean, ? super bn.k, ? super bn.k, ? super sn.a<bn.r>, ? super Composer, ? super Integer, bn.r>> pVar3, @NotNull final sn.p<? super Composer, ? super Integer, ? extends sn.c<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.a<bn.r>, ? super sn.l<? super a.AbstractC0696a.c, bn.r>, ? super Boolean, ? super bn.k, ? super bn.k, ? super sn.a<bn.r>, ? super Composer, ? super Integer, bn.r>> pVar4, @NotNull final sn.p<? super Composer, ? super Integer, ? extends sn.u<? super BoxScope, ? super Boolean, ? super go.u<? extends i.a>, ? super sn.l<? super a.AbstractC0696a.c, bn.r>, ? super sn.a<bn.r>, ? super Composer, ? super Integer, bn.r>> pVar5, @Nullable final y yVar, @NotNull final sn.p<? super Composer, ? super Integer, ? extends sn.s<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, bn.r>> pVar6, @NotNull final sn.p<? super Composer, ? super Integer, ? extends sn.t<? super BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super sn.a<bn.r>, ? super sn.a<bn.r>, ? super Composer, ? super Integer, bn.r>> pVar7, @NotNull final sn.p<? super Composer, ? super Integer, ? extends sn.u<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super sn.l<? super Boolean, bn.r>, ? super sn.a<bn.r>, ? super Composer, ? super Integer, bn.r>> pVar8, @NotNull final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0 c0Var) {
        tn.p.k(pVar, "muteButton");
        tn.p.k(pVar2, "adCloseCountdownButton");
        tn.p.k(pVar3, "adSkipCountdownButton");
        tn.p.k(pVar4, "adSkipCountdownButtonForEndcards");
        tn.p.k(pVar5, "ctaButton");
        tn.p.k(pVar6, "progressBar");
        tn.p.k(pVar7, "vastIcon");
        tn.p.k(pVar8, "playbackControl");
        tn.p.k(c0Var, "viewVisibilityTracker");
        return new sn.p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i0
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo2invoke(Object obj, Object obj2) {
                return n.a(j10, pVar, pVar2, pVar3, pVar4, pVar5, yVar, pVar6, pVar7, pVar8, c0Var, (Context) obj, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) obj2);
            }
        };
    }

    public static /* synthetic */ sn.p e(long j10, sn.p pVar, sn.p pVar2, sn.p pVar3, sn.p pVar4, sn.p pVar5, y yVar, sn.p pVar6, sn.p pVar7, sn.p pVar8, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0 c0Var, int i10, Object obj) {
        long jM1645getBlack0d7_KjU = (i10 & 1) != 0 ? Color.INSTANCE.m1645getBlack0d7_KjU() : j10;
        sn.p pVar9 = (i10 & 2) != 0 ? h.f50316b : pVar;
        sn.p pVar10 = (i10 & 4) != 0 ? i.f50317b : pVar2;
        sn.p pVar11 = (i10 & 8) != 0 ? j.f50318b : pVar3;
        return d(jM1645getBlack0d7_KjU, pVar9, pVar10, pVar11, (i10 & 16) != 0 ? pVar11 : pVar4, (i10 & 32) != 0 ? k.f50319b : pVar5, (i10 & 64) != 0 ? null : yVar, (i10 & 128) != 0 ? l.f50320b : pVar6, (i10 & 256) != 0 ? m.f50321b : pVar7, (i10 & 512) != 0 ? C0678n.f50322b : pVar8, (i10 & 1024) != 0 ? b.h.f47664a.j() : c0Var);
    }

    @Composable
    @NotNull
    public static final sn.s<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Composer, Integer, bn.r> f(@Nullable Alignment alignment, @Nullable PaddingValues paddingValues, long j10, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(716005120);
        if ((i11 & 1) != 0) {
            alignment = Alignment.INSTANCE.getBottomCenter();
        }
        if ((i11 & 2) != 0) {
            paddingValues = PaddingKt.m404PaddingValues0680j_4(Dp.m3826constructorimpl(0));
        }
        if ((i11 & 4) != 0) {
            j10 = MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m967getPrimary0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(716005120, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultProgressBar (VastRenderer.kt:373)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, 1967084142, true, new g(alignment, paddingValues, j10));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    @Composable
    @NotNull
    public static final sn.u<BoxScope, Boolean, Boolean, sn.p<? super a.AbstractC0696a.c, ? super a.AbstractC0696a.c.EnumC0698a, bn.r>, sn.l<? super Boolean, bn.r>, Composer, Integer, bn.r> g(long j10, long j11, @Nullable Shape shape, long j12, @Nullable Alignment alignment, @Nullable PaddingValues paddingValues, long j13, @Nullable Painter painter, @Nullable Painter painter2, @Nullable sn.a<bn.r> aVar, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(447650301);
        long jB = (i11 & 1) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.b() : j10;
        long j14 = (i11 & 2) != 0 ? jB : j11;
        Shape shapeE = (i11 & 4) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.e() : shape;
        long jD = (i11 & 8) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d() : j12;
        Alignment topStart = (i11 & 16) != 0 ? Alignment.INSTANCE.getTopStart() : alignment;
        PaddingValues paddingValuesM404PaddingValues0680j_4 = (i11 & 32) != 0 ? PaddingKt.m404PaddingValues0680j_4(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.a()) : paddingValues;
        long jM967getPrimary0d7_KjU = (i11 & 64) != 0 ? MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m967getPrimary0d7_KjU() : j13;
        Painter painterPainterResource = (i11 & 128) != 0 ? PainterResources_androidKt.painterResource(R$drawable.ic_round_volume_off_24, composer, 0) : painter;
        Painter painterPainterResource2 = (i11 & 256) != 0 ? PainterResources_androidKt.painterResource(R$drawable.ic_round_volume_up_24, composer, 0) : painter2;
        sn.a<bn.r> aVar2 = (i11 & 512) != 0 ? null : aVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(447650301, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultMuteButton (VastRenderer.kt:230)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -545982054, true, new f(topStart, paddingValuesM404PaddingValues0680j_4, painterPainterResource, painterPainterResource2, aVar2, jM967getPrimary0d7_KjU, jB, j14, shapeE, jD));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    @Composable
    @NotNull
    public static final sn.u<BoxScope, Boolean, go.u<? extends i.a>, sn.l<? super a.AbstractC0696a.c, bn.r>, sn.a<bn.r>, Composer, Integer, bn.r> h(@Nullable Alignment alignment, @Nullable PaddingValues paddingValues, long j10, @Nullable String str, @Nullable String str2, @Nullable sn.a<bn.r> aVar, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-926425258);
        Alignment bottomEnd = (i11 & 1) != 0 ? Alignment.INSTANCE.getBottomEnd() : alignment;
        PaddingValues paddingValuesM404PaddingValues0680j_4 = (i11 & 2) != 0 ? PaddingKt.m404PaddingValues0680j_4(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.a()) : paddingValues;
        long jM967getPrimary0d7_KjU = (i11 & 4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m967getPrimary0d7_KjU() : j10;
        String strStringResource = (i11 & 8) != 0 ? StringResources_androidKt.stringResource(R$string.com_moloco_sdk_xenoss_player_learn_more, composer, 0) : str;
        String str3 = (i11 & 16) != 0 ? null : str2;
        sn.a<bn.r> aVar2 = (i11 & 32) != 0 ? null : aVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-926425258, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultCTAButton (VastRenderer.kt:298)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, 432764356, true, new e(bottomEnd, paddingValuesM404PaddingValues0680j_4, str3, strStringResource, jM967getPrimary0d7_KjU, aVar2));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:252:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0125  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][_][_][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(@org.jetbrains.annotations.NotNull final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i r39, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r40, long r41, @org.jetbrains.annotations.Nullable sn.u<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super sn.p<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0696a.c, ? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0696a.c.EnumC0698a, bn.r>, ? super sn.l<? super java.lang.Boolean, bn.r>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r43, @org.jetbrains.annotations.Nullable sn.c<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super sn.a<bn.r>, ? super sn.l<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0696a.c, bn.r>, ? super java.lang.Boolean, ? super bn.k, ? super bn.k, ? super sn.a<bn.r>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r44, @org.jetbrains.annotations.Nullable sn.c<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super sn.a<bn.r>, ? super sn.l<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0696a.c, bn.r>, ? super java.lang.Boolean, ? super bn.k, ? super bn.k, ? super sn.a<bn.r>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r45, @org.jetbrains.annotations.Nullable sn.c<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super sn.a<bn.r>, ? super sn.l<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0696a.c, bn.r>, ? super java.lang.Boolean, ? super bn.k, ? super bn.k, ? super sn.a<bn.r>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r46, @org.jetbrains.annotations.Nullable sn.u<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super go.u<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a>, ? super sn.l<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0696a.c, bn.r>, ? super sn.a<bn.r>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r47, @org.jetbrains.annotations.Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.y r48, @org.jetbrains.annotations.Nullable sn.s<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r49, @org.jetbrains.annotations.Nullable sn.t<? super androidx.compose.foundation.layout.BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super sn.a<bn.r>, ? super sn.a<bn.r>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r50, @org.jetbrains.annotations.Nullable sn.u<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super sn.l<? super java.lang.Boolean, bn.r>, ? super sn.a<bn.r>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r51, @org.jetbrains.annotations.NotNull final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0 r52, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r53, final int r54, final int r55, final int r56) {
        /*
            Method dump skipped, instruction units count: 1460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n.i(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, androidx.compose.ui.Modifier, long, sn.u, sn.c, sn.c, sn.c, sn.u, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.y, sn.s, sn.t, sn.u, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final boolean j(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
