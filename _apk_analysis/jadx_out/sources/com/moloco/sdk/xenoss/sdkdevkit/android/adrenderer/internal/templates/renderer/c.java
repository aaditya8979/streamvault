package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import android.graphics.Bitmap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.webkit.WebResourceErrorCompat;
import androidx.webkit.WebViewClientCompat;
import bn.r;
import com.mbridge.msdk.MBridgeConstans;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.i;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.AdActivity;
import gl.a0;
import go.f;
import go.l;
import go.u;
import go.v;
import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import p000do.s0;
import sn.p;

/* JADX INFO: loaded from: classes6.dex */
@StabilityInferred(parameters = 0)
public final class c extends WebViewClientCompat {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final a f48704s = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f48705t = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final i f48706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.recorder.a f48707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final l0 f48708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final l<Boolean> f48709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final u<Boolean> f48710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final l<Boolean> f48711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final u<Boolean> f48712h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l> f48713i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final u<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l> f48714j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f48715k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public g f48716l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public g f48717m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final l<Boolean> f48718n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public g f48719o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public com.moloco.sdk.acm.e f48720p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public com.moloco.sdk.acm.e f48721q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public String f48722r;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebViewClientImpl$handleRetry$1", f = "TemplateWebviewClientImpl.kt", l = {244}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48723a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WebView f48725c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(WebView webView, hn.c<? super b> cVar) {
            super(2, cVar);
            this.f48725c = webView;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return c.this.new b(this.f48725c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f48723a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                long j10 = (((long) c.this.f48715k) * 1000) + 1000;
                this.f48723a = 1;
                if (s0.a(j10, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            if (((Boolean) c.this.f48709e.getValue()).booleanValue()) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", "Skip reload; content already loaded after backoff", null, false, 12, null);
                return r.f5635a;
            }
            g gVar = c.this.f48719o;
            if (gVar != null) {
                g.a.a(gVar, null, 1, null);
            }
            g gVar2 = c.this.f48717m;
            if (gVar2 != null) {
                g.a.a(gVar2, null, 1, null);
            }
            this.f48725c.reload();
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", "Reload attempt: " + c.this.f48715k, null, false, 12, null);
            return r.f5635a;
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c$c, reason: collision with other inner class name */
    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebViewClientImpl$onPageFinished$1", f = "TemplateWebviewClientImpl.kt", l = {Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE}, m = "invokeSuspend")
    public static final class C0632c extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48726a;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c$c$a */
        public static final class a<T> implements go.e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f48728b;

            public a(c cVar) {
                this.f48728b = cVar;
            }

            public final Object a(boolean z10, hn.c<? super r> cVar) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", "Webview page pending error resolution: " + z10, null, false, 12, null);
                if (!z10) {
                    this.f48728b.d();
                }
                return r.f5635a;
            }

            @Override // go.e
            public /* bridge */ /* synthetic */ Object emit(Object obj, hn.c cVar) {
                return a(((Boolean) obj).booleanValue(), cVar);
            }
        }

        public C0632c(hn.c<? super C0632c> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((C0632c) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return c.this.new C0632c(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f48726a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                l lVar = c.this.f48718n;
                a aVar = new a(c.this);
                this.f48726a = 1;
                if (lVar.collect(aVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebViewClientImpl$pageFinished$3", f = "TemplateWebviewClientImpl.kt", l = {100}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48729a;

        public static final class a<T> implements go.e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f48731b;

            public a(c cVar) {
                this.f48731b = cVar;
            }

            public final Object a(boolean z10, hn.c<? super r> cVar) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", "Content loaded event received, isSuccess: " + z10, null, false, 12, null);
                this.f48731b.f48709e.setValue(jn.a.a(z10));
                g gVar = this.f48731b.f48719o;
                if (gVar != null) {
                    g.a.a(gVar, null, 1, null);
                }
                com.moloco.sdk.acm.recorder.a aVar = this.f48731b.f48707c;
                com.moloco.sdk.acm.b bVar = new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.P.c());
                com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.f45971d;
                aVar.b(bVar.e(dVar.c(), z10 ? "success" : "failure"));
                com.moloco.sdk.acm.e eVar = this.f48731b.f48721q;
                if (eVar != null) {
                    this.f48731b.f48707c.a(eVar.f(dVar.c(), z10 ? "success" : "failure"));
                }
                if (z10) {
                    g gVar2 = this.f48731b.f48716l;
                    if (gVar2 != null) {
                        g.a.a(gVar2, null, 1, null);
                    }
                    this.f48731b.f48716l = null;
                    this.f48731b.f48715k = 0;
                }
                return r.f5635a;
            }

            @Override // go.e
            public /* bridge */ /* synthetic */ Object emit(Object obj, hn.c cVar) {
                return a(((Boolean) obj).booleanValue(), cVar);
            }
        }

        public d(hn.c<? super d> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((d) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return c.this.new d(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f48729a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                go.p<Boolean> pVarC = c.this.f48706b.c();
                a aVar = new a(c.this);
                this.f48729a = 1;
                if (pVarC.collect(aVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public c(@NotNull i iVar, @NotNull com.moloco.sdk.acm.recorder.a aVar) {
        tn.p.k(iVar, "contentLoadedEventHandler");
        tn.p.k(aVar, "metricsRecorder");
        this.f48706b = iVar;
        this.f48707c = aVar;
        this.f48708d = kotlinx.coroutines.d.a(com.moloco.sdk.internal.scheduling.c.a().getMain());
        Boolean bool = Boolean.FALSE;
        l<Boolean> lVarA = v.a(bool);
        this.f48709e = lVarA;
        this.f48710f = lVarA;
        l<Boolean> lVarA2 = v.a(bool);
        this.f48711g = lVarA2;
        this.f48712h = f.c(lVarA2);
        l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l> lVarA3 = v.a(null);
        this.f48713i = lVarA3;
        this.f48714j = f.c(lVarA3);
        this.f48718n = v.a(bool);
    }

    public static final void e(c cVar, WebResourceResponse webResourceResponse, WebView webView, String str) {
        boolean z10 = Boolean.parseBoolean(str);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", '[' + Thread.currentThread().getName() + "] Content isRequired with http error: " + z10, null, false, 12, null);
        if (!z10) {
            MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", "Content is not required, not setting unrecoverable error", null, false, 12, null);
            cVar.f48707c.b(new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.H.c()).e(com.moloco.sdk.internal.client_metrics_data.d.f45971d.c(), "failure").e(VastAttributes.REQUIRED, com.ironsource.mediationsdk.metadata.a.f32683h).e(com.moloco.sdk.internal.client_metrics_data.d.f45969b.c(), String.valueOf(webResourceResponse.getStatusCode())).e("is_loaded", String.valueOf(cVar.f48710f.getValue().booleanValue())));
        } else if (cVar.f48710f.getValue().booleanValue()) {
            cVar.f48707c.b(new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.J.c()).e(com.moloco.sdk.internal.client_metrics_data.d.f45971d.c(), "failure").e(VastAttributes.REQUIRED, "true").e(com.moloco.sdk.internal.client_metrics_data.d.f45969b.c(), String.valueOf(webResourceResponse.getStatusCode())).e("is_loaded", String.valueOf(cVar.f48710f.getValue().booleanValue())));
            MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", "Webview is already showing but received HTTP " + webResourceResponse.getStatusCode() + ", not setting unrecoverable error", null, false, 12, null);
        } else if (cVar.n(webResourceResponse.getStatusCode()) && cVar.B()) {
            cVar.j(String.valueOf(webResourceResponse.getStatusCode()), webResourceResponse.getStatusCode(), webView);
        } else {
            cVar.k(String.valueOf(webResourceResponse.getStatusCode()), webResourceResponse.getStatusCode(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l.f48774d);
            MolocoLogger.warn$default(molocoLogger, "TemplateWebViewClientImpl", "Setting unrecoverable error: " + cVar.f48714j.getValue(), null, false, 12, null);
        }
        cVar.f48718n.setValue(Boolean.FALSE);
    }

    public static final void f(c cVar, WebResourceErrorCompat webResourceErrorCompat, WebView webView, String str) {
        boolean z10 = Boolean.parseBoolean(str);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", '[' + Thread.currentThread().getName() + "] Content type with webview error is required: " + z10, null, false, 12, null);
        if (!z10) {
            MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", "Content is not required, not setting unrecoverable error", null, false, 12, null);
            cVar.f48707c.b(new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.H.c()).e(com.moloco.sdk.internal.client_metrics_data.d.f45971d.c(), "failure").e(VastAttributes.REQUIRED, com.ironsource.mediationsdk.metadata.a.f32683h).e(com.moloco.sdk.internal.client_metrics_data.d.f45969b.c(), String.valueOf(webResourceErrorCompat.getDescription())).e("status_code", String.valueOf(webResourceErrorCompat.getErrorCode())).e("is_loaded", String.valueOf(cVar.f48710f.getValue().booleanValue())));
        } else if (cVar.f48710f.getValue().booleanValue()) {
            MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", "Webview is already showing and received error: " + ((Object) webResourceErrorCompat.getDescription()), null, false, 12, null);
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.i.a(webResourceErrorCompat.getDescription().toString()).f()) {
                cVar.k(webResourceErrorCompat.getDescription().toString(), webResourceErrorCompat.getErrorCode(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l.f48773c);
            } else {
                cVar.f48707c.b(new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.J.c()).e(com.moloco.sdk.internal.client_metrics_data.d.f45971d.c(), "failure").e(VastAttributes.REQUIRED, "true").e(com.moloco.sdk.internal.client_metrics_data.d.f45969b.c(), String.valueOf(webResourceErrorCompat.getDescription())).e("status_code", String.valueOf(webResourceErrorCompat.getErrorCode())).e("is_loaded", String.valueOf(cVar.f48710f.getValue().booleanValue())));
                MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", "Webview is already showing but received " + ((Object) webResourceErrorCompat.getDescription()) + ", not setting unrecoverable error", null, false, 12, null);
            }
        } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.i.a(webResourceErrorCompat.getDescription().toString()).d()) {
            cVar.f48707c.b(new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.J.c()).e(com.moloco.sdk.internal.client_metrics_data.d.f45971d.c(), "failure").e(VastAttributes.REQUIRED, "true").e(com.moloco.sdk.internal.client_metrics_data.d.f45969b.c(), String.valueOf(webResourceErrorCompat.getDescription())).e("status_code", String.valueOf(webResourceErrorCompat.getErrorCode())).e("is_loaded", String.valueOf(cVar.f48710f.getValue().booleanValue())));
            MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", "Ignoring error: " + ((Object) webResourceErrorCompat.getDescription()) + " with code: " + webResourceErrorCompat.getErrorCode() + " since it's marked to be ignored pre load", null, false, 12, null);
        } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.i.a(webResourceErrorCompat.getDescription().toString()).e() && cVar.B()) {
            cVar.j(webResourceErrorCompat.getDescription().toString(), webResourceErrorCompat.getErrorCode(), webView);
        } else {
            cVar.k(webResourceErrorCompat.getDescription().toString(), webResourceErrorCompat.getErrorCode(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l.f48773c);
        }
        cVar.f48718n.setValue(Boolean.FALSE);
    }

    public final boolean B() {
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("retryCount: ");
        sb2.append(this.f48715k);
        sb2.append(", MAX_RETRY_LIMIT: 5, retryCount < MAX_RETRY_LIMIT: ");
        sb2.append(this.f48715k < 5);
        MolocoLogger.debug$default(molocoLogger, "TemplateWebViewClientImpl", sb2.toString(), false, 4, null);
        return this.f48715k < 5;
    }

    @NotNull
    public final u<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l> c() {
        return this.f48714j;
    }

    public final void d() {
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HTML Page finished loading is success: ");
        sb2.append(this.f48714j.getValue() == null);
        MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", sb2.toString(), null, false, 12, null);
        this.f48711g.setValue(Boolean.TRUE);
        if (this.f48714j.getValue() == null) {
            MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", "Waiting for content HTML assets to load or error out", null, false, 12, null);
            com.moloco.sdk.acm.recorder.a aVar = this.f48707c;
            com.moloco.sdk.acm.b bVar = new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.N.c());
            com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.f45971d;
            aVar.b(bVar.e(dVar.c(), "success"));
            com.moloco.sdk.acm.e eVar = this.f48720p;
            if (eVar != null) {
                this.f48707c.a(eVar.f(dVar.c(), "success"));
            }
            this.f48719o = p000do.i.d(this.f48708d, null, null, new d(null), 3, null);
            return;
        }
        MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", "Unrecoverable error occurred, not setting isLoaded to true", null, false, 12, null);
        this.f48709e.setValue(Boolean.FALSE);
        g gVar = this.f48719o;
        if (gVar != null) {
            g.a.a(gVar, null, 1, null);
        }
        g gVar2 = this.f48716l;
        if (gVar2 != null) {
            g.a.a(gVar2, null, 1, null);
        }
        this.f48716l = null;
        com.moloco.sdk.acm.recorder.a aVar2 = this.f48707c;
        com.moloco.sdk.acm.b bVar2 = new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.N.c());
        com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.f45971d;
        com.moloco.sdk.acm.b bVarE = bVar2.e(dVar2.c(), "failure");
        com.moloco.sdk.internal.client_metrics_data.d dVar3 = com.moloco.sdk.internal.client_metrics_data.d.f45969b;
        String strC = dVar3.c();
        String str = this.f48722r;
        if (str == null) {
            str = "unknown";
        }
        aVar2.b(bVarE.e(strC, str));
        com.moloco.sdk.acm.e eVar2 = this.f48720p;
        if (eVar2 != null) {
            com.moloco.sdk.acm.recorder.a aVar3 = this.f48707c;
            com.moloco.sdk.acm.e eVarF = eVar2.f(dVar2.c(), "failure");
            String strC2 = dVar3.c();
            String str2 = this.f48722r;
            aVar3.a(eVarF.f(strC2, str2 != null ? str2 : "unknown"));
        }
    }

    public final void j(String str, int i10, WebView webView) {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", "Retrying error... Attempt: " + (this.f48715k + 1), null, false, 12, null);
        this.f48715k = this.f48715k + 1;
        this.f48707c.b(new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.I.c()).e(VastAttributes.REQUIRED, "true").e(com.moloco.sdk.internal.client_metrics_data.d.f45973f.c(), String.valueOf(this.f48715k)).e(com.moloco.sdk.internal.client_metrics_data.d.f45969b.c(), String.valueOf(str)).e("status_code", String.valueOf(i10)));
        g gVar = this.f48716l;
        if (gVar != null) {
            g.a.a(gVar, null, 1, null);
        }
        this.f48716l = p000do.i.d(this.f48708d, null, null, new b(webView, null), 3, null);
    }

    public final void k(String str, int i10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l lVar) {
        MolocoLogger.warn$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", "Setting unrecoverable error with description: " + str + ", code: " + i10 + ", errorType: " + lVar, null, false, 12, null);
        this.f48707c.b(new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.H.c()).e(com.moloco.sdk.internal.client_metrics_data.d.f45971d.c(), "failure").e(VastAttributes.REQUIRED, "true").e(com.moloco.sdk.internal.client_metrics_data.d.f45969b.c(), String.valueOf(str)).e("status_code", String.valueOf(i10)).e("is_loaded", String.valueOf(this.f48710f.getValue().booleanValue())));
        this.f48722r = str;
        this.f48713i.setValue(lVar);
    }

    public final boolean n(int i10) {
        a0.a aVar = a0.f62457d;
        return i10 == aVar.U().e0() || i10 == aVar.K().e0() || i10 < 400 || i10 >= 500;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.D, webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(@Nullable WebView webView, @Nullable String str) {
        Logger.d("MolocoAds|SafeDK: Execution> Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/c;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.D, webView, str);
        safedk_c_onPageFinished_37e35284161c1e882ea7912a7faba88e(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(@Nullable WebView webView, @Nullable String str, @Nullable Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", "HTML Page started loading", null, false, 12, null);
        this.f48707c.b(new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.M.c()));
        this.f48720p = this.f48707c.c(com.moloco.sdk.internal.client_metrics_data.e.f45998u.c());
        this.f48721q = this.f48707c.c(com.moloco.sdk.internal.client_metrics_data.e.f45999v.c());
    }

    @Override // androidx.webkit.WebViewClientCompat
    public void onReceivedError(@NotNull final WebView webView, @NotNull WebResourceRequest webResourceRequest, @NotNull final WebResourceErrorCompat webResourceErrorCompat) {
        tn.p.k(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        tn.p.k(webResourceRequest, AdActivity.REQUEST_KEY_EXTRA);
        tn.p.k(webResourceErrorCompat, "error");
        this.f48718n.setValue(Boolean.TRUE);
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", "Received error: " + webResourceErrorCompat.getErrorCode() + ", with description: " + ((Object) webResourceErrorCompat.getDescription()) + " for url: " + webResourceRequest.getUrl() + " ad isLoaded: " + this.f48710f.getValue().booleanValue() + ", isPageFinished: " + this.f48712h.getValue().booleanValue(), null, false, 12, null);
        String string = webResourceRequest.getUrl().toString();
        tn.p.j(string, "toString(...)");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ContentChecker.isRequiredContent('");
        sb2.append(string);
        sb2.append("');");
        webView.evaluateJavascript(sb2.toString(), new ValueCallback() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.d
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                c.f(this.f48732a, webResourceErrorCompat, webView, (String) obj);
            }
        });
        super.onReceivedError(webView, webResourceRequest, webResourceErrorCompat);
    }

    @Override // androidx.webkit.WebViewClientCompat, android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onReceivedHttpError(@NotNull final WebView webView, @NotNull WebResourceRequest webResourceRequest, @NotNull final WebResourceResponse webResourceResponse) {
        tn.p.k(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        tn.p.k(webResourceRequest, AdActivity.REQUEST_KEY_EXTRA);
        tn.p.k(webResourceResponse, "errorResponse");
        this.f48718n.setValue(Boolean.TRUE);
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", '[' + Thread.currentThread().getName() + "] Received HTTP error: " + Integer.valueOf(webResourceResponse.getStatusCode()) + ", with description: " + webResourceResponse.getReasonPhrase() + " for url: " + webResourceRequest.getUrl(), null, false, 12, null);
        String string = webResourceRequest.getUrl().toString();
        tn.p.j(string, "toString(...)");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ContentChecker.isRequiredContent('");
        sb2.append(string);
        sb2.append("');");
        webView.evaluateJavascript(sb2.toString(), new ValueCallback() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.e
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                c.e(this.f48735a, webResourceResponse, webView, (String) obj);
            }
        });
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(@NotNull WebView webView, @Nullable RenderProcessGoneDetail renderProcessGoneDetail) {
        tn.p.k(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        this.f48707c.b(new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.H.c()).e(com.moloco.sdk.internal.client_metrics_data.d.f45971d.c(), "failure").e(com.moloco.sdk.internal.client_metrics_data.d.f45969b.c(), "render_process_gone_error").e("is_loaded", String.valueOf(this.f48710f.getValue().booleanValue())));
        this.f48713i.setValue(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l.f48775e);
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", "onRenderProcessGone", null, false, 12, null);
        this.f48718n.setValue(Boolean.FALSE);
        return true;
    }

    @NotNull
    public final u<Boolean> s() {
        return this.f48710f;
    }

    public void safedk_c_onPageFinished_37e35284161c1e882ea7912a7faba88e(WebView webView, String str) {
        super.onPageFinished(webView, str);
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", "Webview page finished loading has pending error: " + this.f48718n.getValue().booleanValue(), null, false, 12, null);
        this.f48707c.b(new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.O.c()).e("pending_error", String.valueOf(this.f48718n.getValue().booleanValue())));
        if (this.f48718n.getValue().booleanValue()) {
            this.f48717m = p000do.i.d(this.f48708d, null, null, new C0632c(null), 3, null);
        } else {
            d();
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.D, webView, webResourceRequest, super.shouldInterceptRequest(webView, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.D, webView, str, super.shouldInterceptRequest(webView, str));
    }

    @NotNull
    public final u<Boolean> u() {
        return this.f48712h;
    }
}
