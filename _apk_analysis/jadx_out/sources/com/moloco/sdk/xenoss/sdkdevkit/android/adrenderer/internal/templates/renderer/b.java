package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.compose.runtime.internal.StabilityInferred;
import bn.r;
import cn.w;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.g0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.i;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.MolocoAdsNetworkBridge;
import go.f;
import go.k;
import go.l;
import go.u;
import go.v;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.g;
import p000do.l0;
import p000do.w0;
import sn.p;
import sn.q;

/* JADX INFO: loaded from: classes6.dex */
@StabilityInferred(parameters = 0)
@SuppressLint({"SetJavaScriptEnabled", "ViewConstructor"})
public final class b extends WebView {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final a f48667j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f48668k = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final i f48669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final h f48670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.recorder.a f48671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c f48672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final l0 f48673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b> f48674g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final u<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l> f48675h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final u<Boolean> f48676i;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$b, reason: collision with other inner class name */
    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebView$loadHtml$2", f = "TemplateWebView.kt", l = {147}, m = "invokeSuspend")
    public static final class C0626b extends SuspendLambda implements p<l0, hn.c<? super g0<r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f48677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f48678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f48679c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f48681e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f48682f;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$b$a */
        @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebView$loadHtml$2$isLoadOperationTimedOut$1", f = "TemplateWebView.kt", l = {153}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements p<l0, hn.c<? super Pair<? extends Boolean, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f48683a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f48684b;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$b$a$a, reason: collision with other inner class name */
            @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebView$loadHtml$2$isLoadOperationTimedOut$1$1", f = "TemplateWebView.kt", l = {}, m = "invokeSuspend")
            public static final class C0627a extends SuspendLambda implements q<Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l, hn.c<? super Pair<? extends Boolean, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l>>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f48685a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public /* synthetic */ boolean f48686b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public /* synthetic */ Object f48687c;

                public C0627a(hn.c<? super C0627a> cVar) {
                    super(3, cVar);
                }

                public final Object a(boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l lVar, hn.c<? super Pair<Boolean, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l>> cVar) {
                    C0627a c0627a = new C0627a(cVar);
                    c0627a.f48686b = z10;
                    c0627a.f48687c = lVar;
                    return c0627a.invokeSuspend(r.f5635a);
                }

                @Override // sn.q
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l lVar, hn.c<? super Pair<? extends Boolean, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l>> cVar) {
                    return a(bool.booleanValue(), lVar, cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    in.a.g();
                    if (this.f48685a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                    boolean z10 = this.f48686b;
                    return bn.h.a(jn.a.a(z10), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l) this.f48687c);
                }
            }

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$b$a$b, reason: collision with other inner class name */
            @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebView$loadHtml$2$isLoadOperationTimedOut$1$2", f = "TemplateWebView.kt", l = {}, m = "invokeSuspend")
            public static final class C0628b extends SuspendLambda implements p<Pair<? extends Boolean, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l>, hn.c<? super Boolean>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f48688a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public /* synthetic */ Object f48689b;

                public C0628b(hn.c<? super C0628b> cVar) {
                    super(2, cVar);
                }

                @Override // sn.p
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object mo2invoke(Pair<Boolean, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l> pair, hn.c<? super Boolean> cVar) {
                    return ((C0628b) create(pair, cVar)).invokeSuspend(r.f5635a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final hn.c<r> create(Object obj, hn.c<?> cVar) {
                    C0628b c0628b = new C0628b(cVar);
                    c0628b.f48689b = obj;
                    return c0628b;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    in.a.g();
                    if (this.f48688a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                    Pair pair = (Pair) this.f48689b;
                    return jn.a.a(((Boolean) pair.component1()).booleanValue() || ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l) pair.component2()) != null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, hn.c<? super a> cVar) {
                super(2, cVar);
                this.f48684b = bVar;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(l0 l0Var, hn.c<? super Pair<Boolean, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l>> cVar) {
                return ((a) create(l0Var, cVar)).invokeSuspend(r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<r> create(Object obj, hn.c<?> cVar) {
                return new a(this.f48684b, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objG = in.a.g();
                int i10 = this.f48683a;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    go.d dVarA = f.A(this.f48684b.f48672e.s(), this.f48684b.f48672e.c(), new C0627a(null));
                    C0628b c0628b = new C0628b(null);
                    this.f48683a = 1;
                    obj = f.w(dVarA, c0628b, this);
                    if (obj == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0626b(String str, long j10, hn.c<? super C0626b> cVar) {
            super(2, cVar);
            this.f48681e = str;
            this.f48682f = j10;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super g0<r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l>> cVar) {
            return ((C0626b) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return b.this.new C0626b(this.f48681e, this.f48682f, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            com.moloco.sdk.acm.e eVarC;
            Object objF;
            String str;
            Object objG = in.a.g();
            int i10 = this.f48679c;
            if (i10 == 0) {
                kotlin.c.b(obj);
                eVarC = b.this.f48671d.c(com.moloco.sdk.internal.client_metrics_data.e.f45995r.c());
                String strF = b.this.f();
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebView", "Loading ad in webView, with webview version: " + strF, null, false, 12, null);
                try {
                    MolocoAdsNetworkBridge.webviewLoadDataWithBaseURL(b.this, null, this.f48681e, "text/html", "UTF-8", null);
                    long j10 = this.f48682f;
                    a aVar = new a(b.this, null);
                    this.f48677a = eVarC;
                    this.f48678b = strF;
                    this.f48679c = 1;
                    objF = TimeoutKt.f(j10, aVar, this);
                    if (objF == objG) {
                        return objG;
                    }
                    str = strF;
                } catch (Exception e10) {
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, "TemplateWebView", "loadHtml failed to load the provided html", e10, false, 8, null);
                    com.moloco.sdk.acm.recorder.a aVar2 = b.this.f48671d;
                    com.moloco.sdk.acm.b bVar = new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.G.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.f45971d;
                    com.moloco.sdk.acm.b bVarE = bVar.e(dVar.c(), "failure");
                    com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.f45969b;
                    aVar2.b(bVarE.e(dVar2.c(), "invalid_url").e("webview_version", strF));
                    b.this.f48671d.a(eVarC.f(dVar.c(), "failure").f(dVar2.c(), "invalid_url").f("webview_version", strF));
                    return new g0.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l.f48772b);
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.f48678b;
                eVarC = (com.moloco.sdk.acm.e) this.f48677a;
                kotlin.c.b(obj);
                objF = obj;
            }
            if (objF == null) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "TemplateWebView", "Ad failed to load due to timeout", null, false, 12, null);
                com.moloco.sdk.acm.recorder.a aVar3 = b.this.f48671d;
                com.moloco.sdk.acm.b bVar2 = new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.G.c());
                com.moloco.sdk.internal.client_metrics_data.d dVar3 = com.moloco.sdk.internal.client_metrics_data.d.f45971d;
                com.moloco.sdk.acm.b bVarE2 = bVar2.e(dVar3.c(), "failure");
                com.moloco.sdk.internal.client_metrics_data.d dVar4 = com.moloco.sdk.internal.client_metrics_data.d.f45969b;
                aVar3.b(bVarE2.e(dVar4.c(), "timeout_error").e("webview_version", str));
                b.this.f48671d.a(eVarC.f(dVar3.c(), "failure").f(dVar4.c(), "timeout_error").f("webview_version", str));
                return new g0.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l.f48776f);
            }
            boolean zBooleanValue = b.this.f48672e.s().getValue().booleanValue();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l value = b.this.f48672e.c().getValue();
            if (value != null) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "TemplateWebView", "Ad failed to load due to unrecoverable error: " + value.name(), null, false, 12, null);
                com.moloco.sdk.acm.recorder.a aVar4 = b.this.f48671d;
                com.moloco.sdk.acm.b bVar3 = new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.G.c());
                com.moloco.sdk.internal.client_metrics_data.d dVar5 = com.moloco.sdk.internal.client_metrics_data.d.f45971d;
                com.moloco.sdk.acm.b bVarE3 = bVar3.e(dVar5.c(), "failure");
                com.moloco.sdk.internal.client_metrics_data.d dVar6 = com.moloco.sdk.internal.client_metrics_data.d.f45969b;
                aVar4.b(bVarE3.e(dVar6.c(), value.name()).e("webview_version", str));
                b.this.f48671d.a(eVarC.f(dVar5.c(), "failure").f(dVar6.c(), value.name()).f("webview_version", str));
                return new g0.a(value);
            }
            if (zBooleanValue) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebView", "Ad loaded successfully in webView", null, false, 12, null);
                com.moloco.sdk.acm.recorder.a aVar5 = b.this.f48671d;
                com.moloco.sdk.acm.b bVar4 = new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.G.c());
                com.moloco.sdk.internal.client_metrics_data.d dVar7 = com.moloco.sdk.internal.client_metrics_data.d.f45971d;
                aVar5.b(bVar4.e(dVar7.c(), "success").e("webview_version", str));
                b.this.f48671d.a(eVarC.f(dVar7.c(), "success").f("webview_version", str));
                return new g0.b(r.f5635a);
            }
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "TemplateWebView", "Ad failed to load due to unknown error", null, false, 12, null);
            com.moloco.sdk.acm.recorder.a aVar6 = b.this.f48671d;
            com.moloco.sdk.acm.b bVar5 = new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.G.c());
            com.moloco.sdk.internal.client_metrics_data.d dVar8 = com.moloco.sdk.internal.client_metrics_data.d.f45971d;
            com.moloco.sdk.acm.b bVarE4 = bVar5.e(dVar8.c(), "failure");
            com.moloco.sdk.internal.client_metrics_data.d dVar9 = com.moloco.sdk.internal.client_metrics_data.d.f45969b;
            aVar6.b(bVarE4.e(dVar9.c(), "unknown_error").e("webview_version", str));
            b.this.f48671d.a(eVarC.f(dVar8.c(), "failure").f(dVar9.c(), "unknown_error").f("webview_version", str));
            return new g0.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l.f48771a);
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebView$startCollectingPlaylistItemDisplaying$1", f = "TemplateWebView.kt", l = {83}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48690a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a f48692c;

        public static final class a<T> implements go.e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f48693b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a f48694c;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$c$a$a, reason: collision with other inner class name */
            @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebView$startCollectingPlaylistItemDisplaying$1$1$1", f = "TemplateWebView.kt", l = {}, m = "invokeSuspend")
            public static final class C0629a extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f48695a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b f48696b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ h.a f48697c;

                /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$c$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C0630a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f48698a;

                    static {
                        int[] iArr = new int[h.a.values().length];
                        try {
                            iArr[h.a.f48828d.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[h.a.f48827c.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        f48698a = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0629a(b bVar, h.a aVar, hn.c<? super C0629a> cVar) {
                    super(2, cVar);
                    this.f48696b = bVar;
                    this.f48697c = aVar;
                }

                @Override // sn.p
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
                    return ((C0629a) create(l0Var, cVar)).invokeSuspend(r.f5635a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final hn.c<r> create(Object obj, hn.c<?> cVar) {
                    return new C0629a(this.f48696b, this.f48697c, cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    in.a.g();
                    if (this.f48695a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                    WebSettings settings = this.f48696b.getSettings();
                    int i10 = C0630a.f48698a[this.f48697c.ordinal()];
                    settings.setMediaPlaybackRequiresUserGesture(i10 != 1 ? i10 != 2 ? this.f48696b.getSettings().getMediaPlaybackRequiresUserGesture() : false : true);
                    return r.f5635a;
                }
            }

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$c$a$b, reason: collision with other inner class name */
            @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebView$startCollectingPlaylistItemDisplaying$1$1", f = "TemplateWebView.kt", l = {86}, m = "emit")
            public static final class C0631b extends ContinuationImpl {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public Object f48699a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public Object f48700b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public /* synthetic */ Object f48701c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ a<T> f48702d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public int f48703e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0631b(a<? super T> aVar, hn.c<? super C0631b> cVar) {
                    super(cVar);
                    this.f48702d = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f48701c = obj;
                    this.f48703e |= Integer.MIN_VALUE;
                    return this.f48702d.emit(null, this);
                }
            }

            public a(b bVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a aVar) {
                this.f48693b = bVar;
                this.f48694c = aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // go.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a r13, hn.c<? super bn.r> r14) {
                /*
                    Method dump skipped, instruction units count: 280
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.c.a.emit(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h$a, hn.c):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a aVar, hn.c<? super c> cVar) {
            super(2, cVar);
            this.f48692c = aVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((c) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return b.this.new c(this.f48692c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f48690a;
            try {
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    k<h.a> kVarC = b.this.f48670c.c();
                    a aVar = new a(b.this, this.f48692c);
                    this.f48690a = 1;
                    if (kVarC.collect(aVar, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Exception e10) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebView", "Error collecting playlist item displaying events", e10, false, 8, null);
                return r.f5635a;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context, @NotNull i iVar, @NotNull h hVar, @NotNull com.moloco.sdk.acm.recorder.a aVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c cVar) {
        super(context);
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(iVar, "contentLoadedEventHandler");
        tn.p.k(hVar, "playListItemDisplayingEventHandler");
        tn.p.k(aVar, "metricsRecorder");
        tn.p.k(cVar, "webViewClientImpl");
        this.f48669b = iVar;
        this.f48670c = hVar;
        this.f48671d = aVar;
        this.f48672e = cVar;
        this.f48673f = kotlinx.coroutines.d.a(com.moloco.sdk.common_adapter_internal.a.f45899a.a().getMain());
        this.f48674g = v.a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.f48624d, false, 2, null));
        setWebViewClient(cVar);
        setScrollBarStyle(0);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setJavaScriptEnabled(true);
        setSaveEnabled(false);
        settings.setDomStorageEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(true);
        setBackgroundColor(0);
        this.f48675h = cVar.c();
        this.f48676i = cVar.u();
    }

    public /* synthetic */ b(Context context, i iVar, h hVar, com.moloco.sdk.acm.recorder.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c cVar, int i10, tn.i iVar2) {
        this(context, iVar, hVar, aVar, (i10 & 16) != 0 ? new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c(iVar, aVar) : cVar);
    }

    @NotNull
    public final u<Boolean> b() {
        return this.f48676i;
    }

    @SuppressLint({"WebViewApiAvailability"})
    @Nullable
    public final Object c(@NotNull String str, long j10, @NotNull hn.c<? super g0<r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l>> cVar) {
        return g.g(w0.c(), new C0626b(str, j10, null), cVar);
    }

    public final void d(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a aVar) {
        tn.p.k(aVar, "mraidCommunicationHub");
        p000do.i.d(this.f48673f, null, null, new c(aVar, null), 3, null);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        removeAllViews();
        super.destroy();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.D, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public final String f() {
        String str;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
                if (currentWebViewPackage != null && (str = currentWebViewPackage.versionName) != null) {
                    return str;
                }
                return "unknown";
            }
            PackageManager packageManager = getContext().getPackageManager();
            for (String str2 : w.p("com.google.android.webview", "com.android.webview", "com.android.chrome")) {
                PackageInfo packageInfo = packageManager.getPackageInfo(str2, 0);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebView", "Pre-O, legacy webview version: " + str2 + " → " + packageInfo.versionName, null, false, 12, null);
                String str3 = packageInfo.versionName;
                tn.p.j(str3, "versionName");
                if (str3.length() > 0) {
                    String str4 = packageInfo.versionName;
                    tn.p.j(str4, "versionName");
                    return str4;
                }
            }
            return "unknown";
        } catch (Exception e10) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "TemplateWebView", "WebView version retrieval exception", e10, false, 8, null);
            return "unknown";
        }
    }

    @NotNull
    public final u<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b> getOrientation$moloco_sdk_release() {
        return this.f48674g;
    }

    @NotNull
    public final u<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l> getUnrecoverableError() {
        return this.f48675h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebView", "onDetachedFromWindow called, cancelling viewScope", null, false, 12, null);
        kotlinx.coroutines.d.e(this.f48673f, null, 1, null);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }
}
