package com.unity3d.ads.adplayer;

import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.WebViewClientCompat;
import bn.h;
import bo.d0;
import cn.f0;
import cn.w;
import com.mbridge.msdk.MBridgeConstans;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.unity3d.ads.adplayer.model.ErrorReason;
import com.unity3d.ads.adplayer.model.WebViewClientError;
import com.unity3d.ads.core.domain.GetCachedAsset;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ViewExtensionsKt;
import com.vungle.ads.internal.ui.AdActivity;
import go.f;
import go.l;
import go.u;
import go.v;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.p0;
import p000do.t;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: AndroidWebViewClient.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class AndroidWebViewClient extends WebViewClientCompat {

    @NotNull
    public static final String BLANK_PAGE = "about:blank";

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final l<Boolean> _isRenderProcessGone;

    @NotNull
    private final t<List<WebViewClientError>> _onLoadFinished;

    @NotNull
    private final GetCachedAsset getCachedAsset;

    @NotNull
    private final u<Boolean> isRenderProcessGone;

    @NotNull
    private final l<List<WebViewClientError>> loadErrors;

    @NotNull
    private final p0<List<WebViewClientError>> onLoadFinished;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final l<String> webviewType;

    /* JADX INFO: compiled from: AndroidWebViewClient.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public AndroidWebViewClient(@NotNull GetCachedAsset getCachedAsset, @NotNull SendDiagnosticEvent sendDiagnosticEvent) {
        p.k(getCachedAsset, "getCachedAsset");
        p.k(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.getCachedAsset = getCachedAsset;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.loadErrors = v.a(w.m());
        t<List<WebViewClientError>> tVarC = p000do.v.c(null, 1, null);
        this._onLoadFinished = tVarC;
        this.onLoadFinished = tVarC;
        l<Boolean> lVarA = v.a(Boolean.FALSE);
        this._isRenderProcessGone = lVarA;
        this.isRenderProcessGone = f.c(lVarA);
        this.webviewType = v.a("");
    }

    @NotNull
    public final p0<List<WebViewClientError>> getOnLoadFinished() {
        return this.onLoadFinished;
    }

    @NotNull
    public final u<Boolean> isRenderProcessGone() {
        return this.isRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        CreativeInfoManager.onResourceLoaded("com.unity3d.ads", webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(@NotNull WebView webView, @NotNull String str) {
        Logger.d("UnityAds|SafeDK: Execution> Lcom/unity3d/ads/adplayer/AndroidWebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onWebViewPageFinished("com.unity3d.ads", webView, str);
        safedk_AndroidWebViewClient_onPageFinished_c32d877a4f6d9be00042295319f45cf6(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(@NotNull WebView webView, @NotNull RenderProcessGoneDetail renderProcessGoneDetail) {
        List<WebViewClientError> value;
        p.k(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        p.k(renderProcessGoneDetail, "detail");
        ViewExtensionsKt.removeViewFromParent(webView);
        webView.destroy();
        if (this._onLoadFinished.d()) {
            this._isRenderProcessGone.setValue(Boolean.TRUE);
            return true;
        }
        l<List<WebViewClientError>> lVar = this.loadErrors;
        do {
            value = lVar.getValue();
        } while (!lVar.b(value, f0.P0(value, new WebViewClientError(String.valueOf(webView.getUrl()), ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE, null, 4, null))));
        this._onLoadFinished.n(this.loadErrors.getValue());
        return true;
    }

    public void safedk_AndroidWebViewClient_onPageFinished_c32d877a4f6d9be00042295319f45cf6(WebView webView, String str) {
        List<WebViewClientError> value;
        p.k(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        p.k(str, "url");
        if (p.f(str, BLANK_PAGE)) {
            l<List<WebViewClientError>> lVar = this.loadErrors;
            do {
                value = lVar.getValue();
            } while (!lVar.b(value, f0.P0(value, new WebViewClientError(str, ErrorReason.REASON_WEB_BLANK, null, 4, null))));
        }
        super.onPageFinished(webView, str);
        this._onLoadFinished.n(this.loadErrors.getValue());
    }

    @Nullable
    public WebResourceResponse safedk_AndroidWebViewClient_shouldInterceptRequest_1bf4791435f30a5bff2fd7f264c747a0(WebView webView, WebResourceRequest webResourceRequest) {
        Map mapJ;
        Object objM7534constructorimpl;
        p.k(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        p.k(webResourceRequest, AdActivity.REQUEST_KEY_EXTRA);
        Uri url = webResourceRequest.getUrl();
        if (url == null) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        try {
            try {
                Result.a aVar = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(url.getQueryParameter("webviewType"));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
            }
            if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
                objM7534constructorimpl = null;
            }
            String str = (String) objM7534constructorimpl;
            if (!(str == null || d0.u0(str))) {
                this.webviewType.setValue(str);
            }
            if (p.f(url.getLastPathSegment(), "favicon.ico")) {
                return new WebResourceResponse("image/png", null, null);
            }
            GetCachedAsset getCachedAsset = this.getCachedAsset;
            Uri url2 = webResourceRequest.getUrl();
            p.j(url2, "request.url");
            return getCachedAsset.invoke(url2, this.webviewType.getValue());
        } catch (Throwable th3) {
            String message = th3.getMessage();
            if (message == null || (mapJ = cn.p0.g(h.a("reason", message))) == null) {
                mapJ = kotlin.collections.a.j();
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "webview_could_not_handle_intercepted_url", null, mapJ, null, null, null, 58, null);
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(@NotNull WebView webView, @NotNull WebResourceRequest webResourceRequest) {
        Logger.d("UnityAds|SafeDK: Execution> Lcom/unity3d/ads/adplayer/AndroidWebViewClient;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders("com.unity3d.ads", webView, webResourceRequest, safedk_AndroidWebViewClient_shouldInterceptRequest_1bf4791435f30a5bff2fd7f264c747a0(webView, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return CreativeInfoManager.onWebViewResponse("com.unity3d.ads", webView, str, super.shouldInterceptRequest(webView, str));
    }
}
