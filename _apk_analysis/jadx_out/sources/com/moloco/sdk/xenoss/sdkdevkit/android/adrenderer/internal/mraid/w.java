package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.webkit.WebViewAssetLoader;
import androidx.webkit.WebViewClientCompat;
import com.moloco.sdk.internal.MolocoLogger;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.vungle.ads.internal.ui.AdActivity;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 0)
public final class w extends WebViewClientCompat {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f48477h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f48478i = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final f0 f48479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final WebViewAssetLoader f48480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final go.l<Boolean> f48481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final go.u<Boolean> f48482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final go.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> f48483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final go.u<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> f48484g;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        public final Uri a(WebResourceRequest webResourceRequest) {
            String string;
            Uri url = webResourceRequest.getUrl();
            if (url == null || (string = url.toString()) == null) {
                string = "";
            }
            Uri uri = Uri.parse(bo.a0.Q(string, "mraid.js", "com.moloco.sdk.xenoss.sdkdevkit.mraid.js", true));
            tn.p.j(uri, "parse(...)");
            return uri;
        }
    }

    public w(@NotNull Context context, @NotNull f0 f0Var) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(f0Var, "mraidJsCommandsSource");
        this.f48479b = f0Var;
        WebViewAssetLoader webViewAssetLoaderBuild = new WebViewAssetLoader.Builder().addPathHandler("/", new WebViewAssetLoader.AssetsPathHandler(context.getApplicationContext())).build();
        tn.p.j(webViewAssetLoaderBuild, "build(...)");
        this.f48480c = webViewAssetLoaderBuild;
        go.l<Boolean> lVarA = go.v.a(Boolean.FALSE);
        this.f48481d = lVarA;
        this.f48482e = lVarA;
        go.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> lVarA2 = go.v.a(null);
        this.f48483f = lVarA2;
        this.f48484g = go.f.c(lVarA2);
    }

    @NotNull
    public final go.u<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> c() {
        return this.f48484g;
    }

    @NotNull
    public final go.u<Boolean> e() {
        return this.f48482e;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.D, webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(@Nullable WebView webView, @Nullable String str) {
        Logger.d("MolocoAds|SafeDK: Execution> Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/w;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.D, webView, str);
        safedk_w_onPageFinished_575dba7d2c324d2abfe09b46ebd2b7dc(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(@Nullable WebView webView, @Nullable String str, @Nullable Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f48481d.setValue(Boolean.FALSE);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(@Nullable WebView webView, int i10, @Nullable String str, @Nullable String str2) {
        super.onReceivedError(webView, i10, str, str2);
        this.f48483f.setValue(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f48051a);
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "MraidWebViewClient", "onReceivedError " + str, null, false, 12, null);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(@Nullable WebView webView, @Nullable RenderProcessGoneDetail renderProcessGoneDetail) {
        this.f48483f.setValue(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f48052b);
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "MraidWebViewClient", "onRenderProcessGone", null, false, 12, null);
        return true;
    }

    public void safedk_w_onPageFinished_575dba7d2c324d2abfe09b46ebd2b7dc(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f48481d.setValue(Boolean.TRUE);
    }

    @Nullable
    public WebResourceResponse safedk_w_shouldInterceptRequest_126c77200afd135907aed0e5966dc9de(WebView webView, WebResourceRequest webResourceRequest) {
        tn.p.k(webResourceRequest, AdActivity.REQUEST_KEY_EXTRA);
        return this.f48480c.shouldInterceptRequest(f48477h.a(webResourceRequest));
    }

    public boolean safedk_w_shouldOverrideUrlLoading_bdd489450093ec7e983c22492b153241(WebView webView, String str) {
        if (str == null) {
            return false;
        }
        return this.f48479b.a(str);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(@Nullable WebView webView, @NotNull WebResourceRequest webResourceRequest) {
        Logger.d("MolocoAds|SafeDK: Execution> Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/w;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.D, webView, webResourceRequest, safedk_w_shouldInterceptRequest_126c77200afd135907aed0e5966dc9de(webView, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.D, webView, str, super.shouldInterceptRequest(webView, str));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(@Nullable WebView webView, @Nullable String str) {
        Logger.d("MolocoAds|SafeDK: Execution> Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/w;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_w_shouldOverrideUrlLoading_bdd489450093ec7e983c22492b153241 = safedk_w_shouldOverrideUrlLoading_bdd489450093ec7e983c22492b153241(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.D, webView, str, zSafedk_w_shouldOverrideUrlLoading_bdd489450093ec7e983c22492b153241);
        return zSafedk_w_shouldOverrideUrlLoading_bdd489450093ec7e983c22492b153241;
    }
}
