package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.webkit.WebViewClientCompat;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.f0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import go.f;
import go.k;
import go.l;
import go.p;
import go.q;
import go.u;
import go.v;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import tn.i;

/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 0)
public final class c extends WebViewClientCompat implements r {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final a f48556n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f48557o = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final l0 f48558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final f0 f48559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final s f48560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final l<Boolean> f48561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final u<Boolean> f48562f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final l<Boolean> f48563g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final u<Boolean> f48564h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final l<g> f48565i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final u<g> f48566j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final k<bn.r> f48567k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final p<bn.r> f48568l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a f48569m;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.WebViewClientImpl$shouldOverrideUrlLoading$1$1$1", f = "WebViewClientImpl.kt", l = {79}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48570a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f48572c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a f48573d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a aVar, hn.c<? super b> cVar) {
            super(2, cVar);
            this.f48572c = str;
            this.f48573d = aVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return c.this.new b(this.f48572c, this.f48573d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f48570a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                f0 f0Var = c.this.f48559c;
                String str = this.f48572c;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a aVar = this.f48573d;
                s sVarF = c.this.f();
                k<bn.r> kVar = c.this.f48567k;
                this.f48570a = 1;
                if (f0Var.a(str, aVar, sVarF, kVar, this) == objG) {
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

    public c(@NotNull l0 l0Var, @NotNull f0 f0Var, @NotNull s sVar) {
        tn.p.k(l0Var, "scope");
        tn.p.k(f0Var, "clickthroughService");
        tn.p.k(sVar, "buttonTracker");
        this.f48558b = l0Var;
        this.f48559c = f0Var;
        this.f48560d = sVar;
        Boolean bool = Boolean.FALSE;
        l<Boolean> lVarA = v.a(bool);
        this.f48561e = lVarA;
        this.f48562f = lVarA;
        l<Boolean> lVarA2 = v.a(bool);
        this.f48563g = lVarA2;
        this.f48564h = f.c(lVarA2);
        l<g> lVarA3 = v.a(null);
        this.f48565i = lVarA3;
        this.f48566j = f.c(lVarA3);
        k<bn.r> kVarB = q.b(0, 0, null, 7, null);
        this.f48567k = kVarB;
        this.f48568l = kVarB;
    }

    public final void b(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a aVar) {
        tn.p.k(aVar, "adTouch");
        this.f48569m = aVar;
    }

    public final void e() {
        this.f48561e.setValue(Boolean.TRUE);
    }

    @NotNull
    public final s f() {
        return this.f48560d;
    }

    @NotNull
    public final p<bn.r> j() {
        return this.f48568l;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r
    public void l(@NotNull a.AbstractC0696a.c cVar) {
        tn.p.k(cVar, "button");
        this.f48560d.l(cVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r
    public void o(@NotNull a.AbstractC0696a.c.EnumC0698a enumC0698a) {
        tn.p.k(enumC0698a, "buttonType");
        this.f48560d.o(enumC0698a);
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.D, webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(@Nullable WebView webView, @Nullable String str) {
        Logger.d("MolocoAds|SafeDK: Execution> Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/c;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.D, webView, str);
        safedk_c_onPageFinished_9444f99215a88f43293d419eee97b07d(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(@Nullable WebView webView, int i10, @Nullable String str, @Nullable String str2) {
        super.onReceivedError(webView, i10, str, str2);
        this.f48565i.setValue(g.f48077c);
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "WebViewClientImpl", "onReceivedError " + str, null, false, 12, null);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(@Nullable WebView webView, @Nullable RenderProcessGoneDetail renderProcessGoneDetail) {
        this.f48565i.setValue(g.f48078d);
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "WebViewClientImpl", "onRenderProcessGone", null, false, 12, null);
        return true;
    }

    @NotNull
    public final u<g> s() {
        return this.f48566j;
    }

    public void safedk_c_onPageFinished_9444f99215a88f43293d419eee97b07d(WebView webView, String str) {
        super.onPageFinished(webView, str);
        l<Boolean> lVar = this.f48561e;
        Boolean bool = Boolean.TRUE;
        lVar.setValue(bool);
        this.f48563g.setValue(bool);
    }

    public boolean safedk_c_shouldOverrideUrlLoading_6981853ef9fbea81f31e8f41863c0872(WebView webView, String str) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a aVar;
        if (str == null || (aVar = this.f48569m) == null) {
            return true;
        }
        p000do.i.d(this.f48558b, null, null, new b(str, aVar, null), 3, null);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.D, webView, webResourceRequest, super.shouldInterceptRequest(webView, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.D, webView, str, super.shouldInterceptRequest(webView, str));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(@Nullable WebView webView, @Nullable String str) {
        Logger.d("MolocoAds|SafeDK: Execution> Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/c;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_c_shouldOverrideUrlLoading_6981853ef9fbea81f31e8f41863c0872 = safedk_c_shouldOverrideUrlLoading_6981853ef9fbea81f31e8f41863c0872(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.D, webView, str, zSafedk_c_shouldOverrideUrlLoading_6981853ef9fbea81f31e8f41863c0872);
        return zSafedk_c_shouldOverrideUrlLoading_6981853ef9fbea81f31e8f41863c0872;
    }

    @NotNull
    public final u<Boolean> u() {
        return this.f48562f;
    }

    @NotNull
    public final u<Boolean> v() {
        return this.f48564h;
    }
}
