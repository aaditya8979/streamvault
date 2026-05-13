package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.ironsource.X2;
import com.moloco.sdk.R$id;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.service_locator.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f50756a = Dp.m3826constructorimpl(12);

    public static final class a implements sn.q<i.a, Composer, Integer, bn.r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ sn.b<Context, WebView, Integer, go.l<Boolean>, sn.l<? super a.AbstractC0696a.c, bn.r>, sn.a<bn.r>, sn.a<bn.r>, e0, Dp, Boolean, View> f50757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WebView f50758c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f50759d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ go.l<Boolean> f50760e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ sn.l<a.AbstractC0696a.c, bn.r> f50761f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ sn.a<bn.r> f50762g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ sn.a<bn.r> f50763h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ e0 f50764i;

        /* JADX WARN: Multi-variable type inference failed */
        public a(sn.b<? super Context, ? super WebView, ? super Integer, ? super go.l<Boolean>, ? super sn.l<? super a.AbstractC0696a.c, bn.r>, ? super sn.a<bn.r>, ? super sn.a<bn.r>, ? super e0, ? super Dp, ? super Boolean, ? extends View> bVar, WebView webView, int i10, go.l<Boolean> lVar, sn.l<? super a.AbstractC0696a.c, bn.r> lVar2, sn.a<bn.r> aVar, sn.a<bn.r> aVar2, e0 e0Var) {
            this.f50757b = bVar;
            this.f50758c = webView;
            this.f50759d = i10;
            this.f50760e = lVar;
            this.f50761f = lVar2;
            this.f50762g = aVar;
            this.f50763h = aVar2;
            this.f50764i = e0Var;
        }

        public static final View a(sn.b bVar, WebView webView, int i10, final go.l lVar, sn.l lVar2, e0 e0Var, final sn.a aVar, final sn.a aVar2, Context context) {
            tn.p.k(context, GAMConfig.KEY_CONTEXT);
            return (View) bVar.invoke(context, webView, Integer.valueOf(i10), lVar, lVar2, new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.p
                @Override // sn.a
                public final Object invoke() {
                    return b.a.b(lVar, aVar);
                }
            }, new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.q
                @Override // sn.a
                public final Object invoke() {
                    return b.a.c(aVar2);
                }
            }, e0Var, Dp.m3824boximpl(b.a()), Boolean.TRUE);
        }

        public static final bn.r b(go.l lVar, sn.a aVar) {
            b.n(lVar, aVar);
            return bn.r.f5635a;
        }

        public static final bn.r c(sn.a aVar) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdWebViewRenderer", "Skip button shown callback triggered in MraidAdContainerScreen", null, false, 12, null);
            aVar.invoke();
            return bn.r.f5635a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void d(i.a aVar, Composer composer, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= composer.changed(aVar) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-448887432, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.MraidAdContainerScreen.<anonymous>.<anonymous> (AdWebViewRenderer.kt:241)");
            }
            if (aVar instanceof i.a.C0665a) {
                composer.startReplaceableGroup(1827067735);
                composer.endReplaceableGroup();
            } else if (aVar instanceof i.a.c) {
                composer.startReplaceableGroup(1827130231);
                composer.endReplaceableGroup();
            } else if (aVar instanceof i.a.b) {
                composer.startReplaceableGroup(-1880720211);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f.d(((i.a.b) aVar).b(), null, null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, X2.b.f30652f, 0);
                composer.endReplaceableGroup();
            } else if (aVar instanceof i.a.d) {
                composer.startReplaceableGroup(-1880710707);
                composer.startReplaceableGroup(-1880709272);
                boolean zChanged = composer.changed(this.f50757b) | composer.changed(this.f50758c) | composer.changed(this.f50759d) | composer.changed(this.f50760e) | composer.changed(this.f50761f) | composer.changed(this.f50762g) | composer.changed(this.f50763h) | composer.changed(this.f50764i);
                final sn.b<Context, WebView, Integer, go.l<Boolean>, sn.l<? super a.AbstractC0696a.c, bn.r>, sn.a<bn.r>, sn.a<bn.r>, e0, Dp, Boolean, View> bVar = this.f50757b;
                final WebView webView = this.f50758c;
                final int i11 = this.f50759d;
                final go.l<Boolean> lVar = this.f50760e;
                final sn.l<a.AbstractC0696a.c, bn.r> lVar2 = this.f50761f;
                final e0 e0Var = this.f50764i;
                final sn.a<bn.r> aVar2 = this.f50762g;
                final sn.a<bn.r> aVar3 = this.f50763h;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new sn.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.o
                        @Override // sn.l
                        public final Object invoke(Object obj) {
                            return b.a.a(bVar, webView, i11, lVar, lVar2, e0Var, aVar2, aVar3, (Context) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                AndroidView_androidKt.AndroidView((sn.l) objRememberedValue, null, null, composer, 0, 6);
                composer.endReplaceableGroup();
            } else {
                if (aVar != null) {
                    composer.startReplaceableGroup(-1880725732);
                    composer.endReplaceableGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceableGroup(1828380771);
                composer.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // sn.q
        public /* bridge */ /* synthetic */ bn.r invoke(i.a aVar, Composer composer, Integer num) {
            d(aVar, composer, num.intValue());
            return bn.r.f5635a;
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b$b, reason: collision with other inner class name */
    public static final class C0690b implements sn.p<Composer, Integer, sn.c<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.a<? extends bn.r>, ? super sn.l<? super a.AbstractC0696a.c, ? extends bn.r>, ? super Boolean, ? super bn.k, ? super bn.k, ? super sn.a<? extends bn.r>, ? super Composer, ? super Integer, ? extends bn.r>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0690b f50765b = new C0690b();

        @Composable
        public final sn.c<BoxScope, Boolean, Boolean, sn.a<bn.r>, sn.l<? super a.AbstractC0696a.c, bn.r>, Boolean, bn.k, bn.k, sn.a<bn.r>, Composer, Integer, bn.r> a(Composer composer, int i10) {
            composer.startReplaceableGroup(-349315014);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-349315014, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.defaultAdWebViewRenderer.<anonymous> (AdWebViewRenderer.kt:155)");
            }
            sn.c<BoxScope, Boolean, Boolean, sn.a<bn.r>, sn.l<? super a.AbstractC0696a.c, bn.r>, Boolean, bn.k, bn.k, sn.a<bn.r>, Composer, Integer, bn.r> cVarB = d0.b(null, null, 0L, 0L, 0L, null, null, null, composer, 0, 255);
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

    public static final class c implements sn.p<Composer, Integer, bn.r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ WebView f50766b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ go.l<Boolean> f50767c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f50768d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ sn.l<a.AbstractC0696a.c, bn.r> f50769e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ sn.a<bn.r> f50770f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ sn.a<bn.r> f50771g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ long f50772h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ sn.p<Composer, Integer, sn.c<BoxScope, Boolean, Boolean, sn.a<bn.r>, sn.l<? super a.AbstractC0696a.c, bn.r>, Boolean, bn.k, bn.k, sn.a<bn.r>, Composer, Integer, bn.r>> f50773i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ e0 f50774j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Dp f50775k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f50776l;

        public static final class a implements sn.p<Composer, Integer, bn.r> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebView f50777b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ go.l<Boolean> f50778c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ int f50779d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ sn.l<a.AbstractC0696a.c, bn.r> f50780e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ sn.a<bn.r> f50781f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ sn.a<bn.r> f50782g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ long f50783h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ sn.p<Composer, Integer, sn.c<BoxScope, Boolean, Boolean, sn.a<bn.r>, sn.l<? super a.AbstractC0696a.c, bn.r>, Boolean, bn.k, bn.k, sn.a<bn.r>, Composer, Integer, bn.r>> f50784i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ e0 f50785j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ Dp f50786k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ boolean f50787l;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b$c$a$a, reason: collision with other inner class name */
            @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.AdWebViewRendererKt$defaultAdWebViewRenderer$2$1$1$1$1$1", f = "AdWebViewRenderer.kt", l = {HideBottomViewOnScrollBehavior.EXIT_ANIMATION_DURATION}, m = "invokeSuspend")
            public static final class C0691a extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f50788a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MutableState<Boolean> f50789b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ go.l<Boolean> f50790c;

                /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b$c$a$a$a, reason: collision with other inner class name */
                public static final class C0692a<T> implements go.e {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ go.l<Boolean> f50791b;

                    public C0692a(go.l<Boolean> lVar) {
                        this.f50791b = lVar;
                    }

                    public final Object a(boolean z10, hn.c<? super bn.r> cVar) {
                        this.f50791b.setValue(jn.a.a(z10));
                        return bn.r.f5635a;
                    }

                    @Override // go.e
                    public /* bridge */ /* synthetic */ Object emit(Object obj, hn.c cVar) {
                        return a(((Boolean) obj).booleanValue(), cVar);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0691a(MutableState<Boolean> mutableState, go.l<Boolean> lVar, hn.c<? super C0691a> cVar) {
                    super(2, cVar);
                    this.f50789b = mutableState;
                    this.f50790c = lVar;
                }

                public static final boolean a(MutableState mutableState) {
                    return ((Boolean) mutableState.getValue()).booleanValue();
                }

                @Override // sn.p
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
                    return ((C0691a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                    return new C0691a(this.f50789b, this.f50790c, cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objG = in.a.g();
                    int i10 = this.f50788a;
                    if (i10 == 0) {
                        kotlin.c.b(obj);
                        final MutableState<Boolean> mutableState = this.f50789b;
                        go.d dVarSnapshotFlow = SnapshotStateKt.snapshotFlow(new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.r
                            @Override // sn.a
                            public final Object invoke() {
                                return Boolean.valueOf(b.c.a.C0691a.a(mutableState));
                            }
                        });
                        C0692a c0692a = new C0692a(this.f50790c);
                        this.f50788a = 1;
                        if (dVarSnapshotFlow.collect(c0692a, this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.c.b(obj);
                    }
                    return bn.r.f5635a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(WebView webView, go.l<Boolean> lVar, int i10, sn.l<? super a.AbstractC0696a.c, bn.r> lVar2, sn.a<bn.r> aVar, sn.a<bn.r> aVar2, long j10, sn.p<? super Composer, ? super Integer, ? extends sn.c<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.a<bn.r>, ? super sn.l<? super a.AbstractC0696a.c, bn.r>, ? super Boolean, ? super bn.k, ? super bn.k, ? super sn.a<bn.r>, ? super Composer, ? super Integer, bn.r>> pVar, e0 e0Var, Dp dp2, boolean z10) {
                this.f50777b = webView;
                this.f50778c = lVar;
                this.f50779d = i10;
                this.f50780e = lVar2;
                this.f50781f = aVar;
                this.f50782g = aVar2;
                this.f50783h = j10;
                this.f50784i = pVar;
                this.f50785j = e0Var;
                this.f50786k = dp2;
                this.f50787l = z10;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-101529568, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.defaultAdWebViewRenderer.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdWebViewRenderer.kt:162)");
                }
                composer.startReplaceableGroup(1335699884);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = b.h.f47664a.j();
                    composer.updateRememberedValue(objRememberedValue);
                }
                c0 c0Var = (c0) objRememberedValue;
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(1335704710);
                boolean zChanged = composer.changed(this.f50777b);
                WebView webView = this.f50777b;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = c0Var.a(webView);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                go.d dVar = (go.d) objRememberedValue2;
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(1335709359);
                go.l<Boolean> lVar = this.f50778c;
                Object objRememberedValue3 = composer.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(lVar.getValue(), null, 2, null);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                MutableState mutableState = (MutableState) objRememberedValue3;
                composer.endReplaceableGroup();
                bn.r rVar = bn.r.f5635a;
                composer.startReplaceableGroup(1335713196);
                boolean zChanged2 = composer.changed(mutableState) | composer.changed(this.f50778c);
                go.l<Boolean> lVar2 = this.f50778c;
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new C0691a(mutableState, lVar2, null);
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceableGroup();
                EffectsKt.LaunchedEffect(rVar, (sn.p<? super l0, ? super hn.c<? super bn.r>, ? extends Object>) objRememberedValue4, composer, 6);
                b.m(this.f50777b, this.f50779d, mutableState, this.f50780e, this.f50781f, this.f50782g, null, this.f50783h, this.f50784i.mo2invoke(composer, 0), this.f50785j, this.f50786k.m3840unboximpl(), this.f50787l, dVar, composer, 384, 0, 64);
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
        public c(WebView webView, go.l<Boolean> lVar, int i10, sn.l<? super a.AbstractC0696a.c, bn.r> lVar2, sn.a<bn.r> aVar, sn.a<bn.r> aVar2, long j10, sn.p<? super Composer, ? super Integer, ? extends sn.c<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.a<bn.r>, ? super sn.l<? super a.AbstractC0696a.c, bn.r>, ? super Boolean, ? super bn.k, ? super bn.k, ? super sn.a<bn.r>, ? super Composer, ? super Integer, bn.r>> pVar, e0 e0Var, Dp dp2, boolean z10) {
            this.f50766b = webView;
            this.f50767c = lVar;
            this.f50768d = i10;
            this.f50769e = lVar2;
            this.f50770f = aVar;
            this.f50771g = aVar2;
            this.f50772h = j10;
            this.f50773i = pVar;
            this.f50774j = e0Var;
            this.f50775k = dp2;
            this.f50776l = z10;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(553564605, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.defaultAdWebViewRenderer.<anonymous>.<anonymous>.<anonymous> (AdWebViewRenderer.kt:161)");
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.d.b(false, ComposableLambdaKt.composableLambda(composer, -101529568, true, new a(this.f50766b, this.f50767c, this.f50768d, this.f50769e, this.f50770f, this.f50771g, this.f50772h, this.f50773i, this.f50774j, this.f50775k, this.f50776l)), composer, 48, 1);
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

    public static final float a() {
        return f50756a;
    }

    public static final View b(sn.b bVar, WebView webView, int i10, final go.l lVar, sn.l lVar2, sn.a aVar, e0 e0Var, final sn.a aVar2, Context context) {
        tn.p.k(context, "it");
        return (View) bVar.invoke(context, webView, Integer.valueOf(i10), lVar, lVar2, new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.l
            @Override // sn.a
            public final Object invoke() {
                return b.r(lVar, aVar2);
            }
        }, aVar, e0Var, Dp.m3824boximpl(f50756a), Boolean.FALSE);
    }

    public static final ComposeView c(long j10, sn.p pVar, Context context, WebView webView, int i10, go.l lVar, sn.l lVar2, sn.a aVar, sn.a aVar2, e0 e0Var, Dp dp2, boolean z10) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(webView, "webView");
        tn.p.k(lVar, "canClose");
        tn.p.k(lVar2, "onButtonRendered");
        tn.p.k(aVar, "onClose");
        tn.p.k(aVar2, "onCloseOrSkipButtonShown");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setId(R$id.moloco_fullscreen_ad_view_id);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(553564605, true, new c(webView, lVar, i10, lVar2, aVar, aVar2, j10, pVar, e0Var, dp2, z10)));
        return composeView;
    }

    public static final bn.r d(Activity activity, WebView webView, int i10, sn.l lVar, sn.a aVar, sn.b bVar, e0 e0Var, sn.a aVar2, int i11, Composer composer, int i12) {
        k(activity, webView, i10, lVar, aVar, bVar, e0Var, aVar2, composer, i11 | 1);
        return bn.r.f5635a;
    }

    public static final bn.r e(Activity activity, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar, WebView webView, int i10, sn.l lVar, sn.a aVar, sn.b bVar, e0 e0Var, sn.c cVar, sn.c cVar2, sn.a aVar2, int i11, int i12, Composer composer, int i13) {
        l(activity, iVar, webView, i10, lVar, aVar, bVar, e0Var, cVar, cVar2, aVar2, composer, i11 | 1, i12);
        return bn.r.f5635a;
    }

    public static final bn.r f(WebView webView, int i10, MutableState mutableState, sn.l lVar, sn.a aVar, sn.a aVar2, Modifier modifier, long j10, sn.c cVar, e0 e0Var, float f10, boolean z10, go.d dVar, int i11, int i12, int i13, Composer composer, int i14) {
        m(webView, i10, mutableState, lVar, aVar, aVar2, modifier, j10, cVar, e0Var, f10, z10, dVar, composer, i11 | 1, i12, i13);
        return bn.r.f5635a;
    }

    public static final bn.r g(MutableState mutableState, sn.a aVar) {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdWebViewRenderer", "Countdown finished - skip button is now available", null, false, 12, null);
        mutableState.setValue(Boolean.TRUE);
        aVar.invoke();
        return bn.r.f5635a;
    }

    public static final i.a h(State<? extends i.a> state) {
        return state.getValue();
    }

    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable:[androidx.compose.ui.UiComposable]]]")
    @NotNull
    public static final sn.b<Context, WebView, Integer, go.l<Boolean>, sn.l<? super a.AbstractC0696a.c, bn.r>, sn.a<bn.r>, sn.a<bn.r>, e0, Dp, Boolean, View> i(final long j10, @NotNull final sn.p<? super Composer, ? super Integer, ? extends sn.c<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.a<bn.r>, ? super sn.l<? super a.AbstractC0696a.c, bn.r>, ? super Boolean, ? super bn.k, ? super bn.k, ? super sn.a<bn.r>, ? super Composer, ? super Integer, bn.r>> pVar) {
        tn.p.k(pVar, "adCloseCountdownButton");
        return new sn.b() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.f
            @Override // sn.b
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
                return b.c(j10, pVar, (Context) obj, (WebView) obj2, ((Integer) obj3).intValue(), (go.l) obj4, (sn.l) obj5, (sn.a) obj6, (sn.a) obj7, (e0) obj8, (Dp) obj9, ((Boolean) obj10).booleanValue());
            }
        };
    }

    public static /* synthetic */ sn.b j(long j10, sn.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = Color.INSTANCE.m1645getBlack0d7_KjU();
        }
        if ((i10 & 2) != 0) {
            pVar = C0690b.f50765b;
        }
        return i(j10, pVar);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void k(@NotNull final Activity activity, @NotNull final WebView webView, final int i10, @NotNull final sn.l<? super a.AbstractC0696a.c, bn.r> lVar, @NotNull final sn.a<bn.r> aVar, @NotNull final sn.b<? super Context, ? super WebView, ? super Integer, ? super go.l<Boolean>, ? super sn.l<? super a.AbstractC0696a.c, bn.r>, ? super sn.a<bn.r>, ? super sn.a<bn.r>, ? super e0, ? super Dp, ? super Boolean, ? extends View> bVar, @Nullable final e0 e0Var, @NotNull final sn.a<bn.r> aVar2, @Nullable Composer composer, final int i11) {
        int i12;
        int i13;
        Composer composer2;
        final go.l lVar2;
        tn.p.k(activity, "<this>");
        tn.p.k(webView, "webView");
        tn.p.k(lVar, "onButtonRendered");
        tn.p.k(aVar, "onClose");
        tn.p.k(bVar, "adWebViewRenderer");
        tn.p.k(aVar2, "onCloseOrSkipButtonShown");
        Composer composerStartRestartGroup = composer.startRestartGroup(-204806360);
        if ((i11 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(activity) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= composerStartRestartGroup.changed(webView) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= composerStartRestartGroup.changed(i10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changed(lVar) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= composerStartRestartGroup.changed(aVar) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= composerStartRestartGroup.changed(bVar) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= composerStartRestartGroup.changed(e0Var) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= composerStartRestartGroup.changed(aVar2) ? 8388608 : 4194304;
        }
        int i14 = i12;
        if ((4793491 & i14) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-204806360, i14, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.StaticAdWebViewScreen (AdWebViewRenderer.kt:298)");
            }
            Modifier modifierM164backgroundbw27NRU$default = BackgroundKt.m164backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m1645getBlack0d7_KjU(), null, 2, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            sn.a<ComposeUiNode> constructor = companion.getConstructor();
            sn.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, bn.r> qVarMaterializerOf = LayoutKt.materializerOf(modifierM164backgroundbw27NRU$default);
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
            Updater.m1281setimpl(composerM1274constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1281setimpl(composerM1274constructorimpl, density, companion.getSetDensity());
            Updater.m1281setimpl(composerM1274constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m1281setimpl(composerM1274constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            qVarMaterializerOf.invoke(SkippableUpdater.m1264boximpl(SkippableUpdater.m1265constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1609940259);
            boolean zChanged = composerStartRestartGroup.changed(i10);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = go.v.a(Boolean.valueOf(i10 == 0));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final go.l lVar3 = (go.l) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1609947848);
            boolean zChanged2 = composerStartRestartGroup.changed(bVar) | composerStartRestartGroup.changed(webView) | composerStartRestartGroup.changed(i10) | composerStartRestartGroup.changed(lVar3) | composerStartRestartGroup.changed(lVar) | composerStartRestartGroup.changed(aVar) | composerStartRestartGroup.changed(aVar2) | composerStartRestartGroup.changed(e0Var);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                i13 = i14;
                composer2 = composerStartRestartGroup;
                lVar2 = lVar3;
                sn.l lVar4 = new sn.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.g
                    @Override // sn.l
                    public final Object invoke(Object obj) {
                        return b.b(bVar, webView, i10, lVar3, lVar, aVar2, e0Var, aVar, (Context) obj);
                    }
                };
                composer2.updateRememberedValue(lVar4);
                objRememberedValue2 = lVar4;
            } else {
                composer2 = composerStartRestartGroup;
                lVar2 = lVar3;
                i13 = i14;
            }
            composer2.endReplaceableGroup();
            AndroidView_androidKt.AndroidView((sn.l) objRememberedValue2, null, null, composer2, 0, 6);
            composer2.startReplaceableGroup(1609961816);
            boolean zChanged3 = composer2.changed(lVar2) | composer2.changed(aVar);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.h
                    @Override // sn.a
                    public final Object invoke() {
                        return b.s(lVar2, aVar);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue3);
            }
            composer2.endReplaceableGroup();
            BackHandlerKt.BackHandler(false, (sn.a) objRememberedValue3, composer2, 0, 1);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.t.b(activity, composer2, i13 & 14);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new sn.p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.i
                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public final Object mo2invoke(Object obj, Object obj2) {
                    return b.d(activity, webView, i10, lVar, aVar, bVar, e0Var, aVar2, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_]]")
    public static final void l(@NotNull final Activity activity, @NotNull final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar, @NotNull final WebView webView, final int i10, @NotNull final sn.l<? super a.AbstractC0696a.c, bn.r> lVar, @NotNull final sn.a<bn.r> aVar, @NotNull final sn.b<? super Context, ? super WebView, ? super Integer, ? super go.l<Boolean>, ? super sn.l<? super a.AbstractC0696a.c, bn.r>, ? super sn.a<bn.r>, ? super sn.a<bn.r>, ? super e0, ? super Dp, ? super Boolean, ? extends View> bVar, @Nullable final e0 e0Var, @Nullable final sn.c<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.a<bn.r>, ? super sn.l<? super a.AbstractC0696a.c, bn.r>, ? super Boolean, ? super bn.k, ? super bn.k, ? super sn.a<bn.r>, ? super Composer, ? super Integer, bn.r> cVar, @Nullable final sn.c<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.a<bn.r>, ? super sn.l<? super a.AbstractC0696a.c, bn.r>, ? super Boolean, ? super bn.k, ? super bn.k, ? super sn.a<bn.r>, ? super Composer, ? super Integer, bn.r> cVar2, @NotNull final sn.a<bn.r> aVar2, @Nullable Composer composer, final int i11, final int i12) {
        int i13;
        int i14;
        Composer composer2;
        tn.p.k(activity, "<this>");
        tn.p.k(iVar, "adViewModel");
        tn.p.k(webView, "webView");
        tn.p.k(lVar, "onButtonRendered");
        tn.p.k(aVar, "onClose");
        tn.p.k(bVar, "adWebViewRenderer");
        tn.p.k(aVar2, "onCloseOrSkipButtonShown");
        Composer composerStartRestartGroup = composer.startRestartGroup(772404782);
        if ((i11 & 6) == 0) {
            i13 = (composerStartRestartGroup.changed(activity) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= composerStartRestartGroup.changed(iVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= composerStartRestartGroup.changed(webView) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= composerStartRestartGroup.changed(i10) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= composerStartRestartGroup.changed(lVar) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i13 |= composerStartRestartGroup.changed(aVar) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i13 |= composerStartRestartGroup.changed(bVar) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i13 |= composerStartRestartGroup.changed(e0Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i13 |= composerStartRestartGroup.changed(cVar) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= composerStartRestartGroup.changed(cVar2) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i14 = i12 | (composerStartRestartGroup.changed(aVar2) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i13 & 306783379) == 306783378 && (i14 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(772404782, i13, i14, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.MraidAdContainerScreen (AdWebViewRenderer.kt:223)");
            }
            Modifier modifierTestTag = TestTagKt.testTag(BackgroundKt.m164backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m1645getBlack0d7_KjU(), null, 2, null), "MraidAdContainerScreen");
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            int i15 = i13;
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            sn.a<ComposeUiNode> constructor = companion.getConstructor();
            sn.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, bn.r> qVarMaterializerOf = LayoutKt.materializerOf(modifierTestTag);
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
            Updater.m1281setimpl(composerM1274constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1281setimpl(composerM1274constructorimpl, density, companion.getSetDensity());
            Updater.m1281setimpl(composerM1274constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m1281setimpl(composerM1274constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            qVarMaterializerOf.invoke(SkippableUpdater.m1264boximpl(SkippableUpdater.m1265constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1204573178);
            boolean zChanged = composerStartRestartGroup.changed(i10);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = go.v.a(Boolean.valueOf(i10 == 0));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final go.l lVar2 = (go.l) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            State stateCollectAsState = SnapshotStateKt.collectAsState(iVar.k(), null, composerStartRestartGroup, 0, 1);
            composer2 = composerStartRestartGroup;
            CrossfadeKt.Crossfade(h(stateCollectAsState), null, null, ComposableLambdaKt.composableLambda(composer2, -448887432, true, new a(bVar, webView, i10, lVar2, lVar, aVar, aVar2, e0Var)), composer2, 3072, 6);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.f(boxScopeInstance, iVar, h(stateCollectAsState), cVar2, cVar, null, composer2, (i15 & 112) | 6 | ((i15 >> 18) & 7168) | ((i15 >> 12) & 57344), 16);
            composer2.startReplaceableGroup(1204638639);
            boolean zChanged2 = composer2.changed(lVar2) | composer2.changed(aVar);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.m
                    @Override // sn.a
                    public final Object invoke() {
                        return b.o(lVar2, aVar);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            BackHandlerKt.BackHandler(false, (sn.a) objRememberedValue2, composer2, 0, 1);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.t.b(activity, composer2, i15 & 14);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new sn.p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.n
                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public final Object mo2invoke(Object obj, Object obj2) {
                    return b.e(activity, iVar, webView, i10, lVar, aVar, bVar, e0Var, cVar, cVar2, aVar2, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0119  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(final android.webkit.WebView r36, final int r37, final androidx.compose.runtime.MutableState<java.lang.Boolean> r38, final sn.l<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0696a.c, bn.r> r39, final sn.a<bn.r> r40, final sn.a<bn.r> r41, androidx.compose.ui.Modifier r42, long r43, sn.c<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super sn.a<bn.r>, ? super sn.l<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0696a.c, bn.r>, ? super java.lang.Boolean, ? super bn.k, ? super bn.k, ? super sn.a<bn.r>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r45, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 r46, final float r47, final boolean r48, go.d<java.lang.Boolean> r49, androidx.compose.runtime.Composer r50, final int r51, final int r52, final int r53) {
        /*
            Method dump skipped, instruction units count: 1053
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b.m(android.webkit.WebView, int, androidx.compose.runtime.MutableState, sn.l, sn.a, sn.a, androidx.compose.ui.Modifier, long, sn.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0, float, boolean, go.d, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final void n(go.l<Boolean> lVar, sn.a<bn.r> aVar) {
        if (lVar.getValue().booleanValue()) {
            aVar.invoke();
        }
    }

    public static final bn.r o(go.l lVar, sn.a aVar) {
        n(lVar, aVar);
        return bn.r.f5635a;
    }

    public static final void q(go.l<Boolean> lVar, sn.a<bn.r> aVar) {
        if (lVar.getValue().booleanValue()) {
            aVar.invoke();
        }
    }

    public static final bn.r r(go.l lVar, sn.a aVar) {
        q(lVar, aVar);
        return bn.r.f5635a;
    }

    public static final bn.r s(go.l lVar, sn.a aVar) {
        q(lVar, aVar);
        return bn.r.f5635a;
    }
}
