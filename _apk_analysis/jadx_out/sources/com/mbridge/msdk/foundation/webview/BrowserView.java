package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes9.dex */
public class BrowserView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CampaignEx f38206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f38207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f38208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WebView f38209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ProgressBar f38210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ToolBar f38211f;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (BrowserView.this.f38209d != null) {
                BrowserView.this.f38209d.stopLoading();
            }
            String str = (String) view.getTag();
            boolean z10 = false;
            if (TextUtils.equals(str, com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD)) {
                BrowserView.this.f38211f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD).setEnabled(true);
                if (BrowserView.this.f38209d != null && BrowserView.this.f38209d.canGoBack()) {
                    BrowserView.this.f38209d.goBack();
                }
                View item = BrowserView.this.f38211f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD);
                if (BrowserView.this.f38209d != null && BrowserView.this.f38209d.canGoBack()) {
                    z10 = true;
                }
                item.setEnabled(z10);
                return;
            }
            if (TextUtils.equals(str, com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD)) {
                BrowserView.this.f38211f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD).setEnabled(true);
                if (BrowserView.this.f38209d != null && BrowserView.this.f38209d.canGoForward()) {
                    BrowserView.this.f38209d.goForward();
                }
                View item2 = BrowserView.this.f38211f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD);
                if (BrowserView.this.f38209d != null && BrowserView.this.f38209d.canGoForward()) {
                    z10 = true;
                }
                item2.setEnabled(z10);
                return;
            }
            if (!TextUtils.equals(str, com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.REFRESH)) {
                if (!TextUtils.equals(str, com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.EXITS) || BrowserView.this.f38208c == null) {
                    return;
                }
                BrowserView.this.f38208c.a();
                return;
            }
            BrowserView.this.f38211f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD).setEnabled(BrowserView.this.f38209d != null && BrowserView.this.f38209d.canGoBack());
            View item3 = BrowserView.this.f38211f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD);
            if (BrowserView.this.f38209d != null && BrowserView.this.f38209d.canGoForward()) {
                z10 = true;
            }
            item3.setEnabled(z10);
            if (BrowserView.this.f38209d != null) {
                MintegralNetworkBridge.webviewLoadUrl(BrowserView.this.f38209d, BrowserView.this.f38207b);
            }
        }
    }

    public class b extends WebViewClient {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/foundation/webview/BrowserView$b;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
            CreativeInfoManager.onResourceLoaded(g.f53141o, webView, str);
            safedk_BrowserView$b_onLoadResource_ebf16ae792b4beb708ff1eebaf51488c(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/foundation/webview/BrowserView$b;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
            CreativeInfoManager.onWebViewPageFinished(g.f53141o, webView, str);
            safedk_BrowserView$b_onPageFinished_f1e9dac2a97eb378c221bf96805bf41e(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            q0.c("BrowserView", "开始! = " + str);
            BrowserView.this.f38207b = str;
            if (BrowserView.this.f38208c != null) {
                BrowserView.this.f38208c.onPageStarted(webView, str, bitmap);
            }
            BrowserView.this.f38210e.setVisible(true);
            BrowserView.this.f38210e.setProgressState(5);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            if (BrowserView.this.f38208c != null) {
                BrowserView.this.f38208c.onReceivedError(webView, i10, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (webView != null) {
                try {
                    ViewGroup viewGroup = (ViewGroup) webView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(webView);
                    }
                    webView.destroy();
                } catch (Throwable th2) {
                    q0.b("BrowserView", th2.getMessage());
                    return true;
                }
            }
            if (BrowserView.this.f38208c != null) {
                BrowserView.this.f38208c.a();
            }
            return true;
        }

        public void safedk_BrowserView$b_onLoadResource_ebf16ae792b4beb708ff1eebaf51488c(WebView webView, String str) {
            super.onLoadResource(webView, str);
            q0.c("BrowserView", "onLoadResource 开始! = " + str);
            if (BrowserView.this.f38208c != null) {
                BrowserView.this.f38208c.a(webView, str);
            }
        }

        public void safedk_BrowserView$b_onPageFinished_f1e9dac2a97eb378c221bf96805bf41e(WebView webView, String str) {
            if (BrowserView.this.f38208c != null) {
                BrowserView.this.f38208c.onPageFinished(webView, str);
            }
        }

        public boolean safedk_BrowserView$b_shouldOverrideUrlLoading_433e38c44449c3cff3a8e0aa3ac29cf8(WebView webView, String str) {
            q0.c("BrowserView", "js大跳! = " + str);
            BrowserView.this.f38211f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD).setEnabled(true);
            BrowserView.this.f38211f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD).setEnabled(false);
            if (BrowserView.this.f38208c != null) {
                return BrowserView.this.f38208c.shouldOverrideUrlLoading(webView, str);
            }
            return false;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(g.f53141o, webView, webResourceRequest, super.shouldInterceptRequest(webView, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            return CreativeInfoManager.onWebViewResponse(g.f53141o, webView, str, super.shouldInterceptRequest(webView, str));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/foundation/webview/BrowserView$b;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean zSafedk_BrowserView$b_shouldOverrideUrlLoading_433e38c44449c3cff3a8e0aa3ac29cf8 = safedk_BrowserView$b_shouldOverrideUrlLoading_433e38c44449c3cff3a8e0aa3ac29cf8(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(g.f53141o, webView, str, zSafedk_BrowserView$b_shouldOverrideUrlLoading_433e38c44449c3cff3a8e0aa3ac29cf8);
            return zSafedk_BrowserView$b_shouldOverrideUrlLoading_433e38c44449c3cff3a8e0aa3ac29cf8;
        }
    }

    public class c extends WebChromeClient {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                BrowserView.this.f38210e.setVisible(false);
            }
        }

        public c() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            if (i10 == 100) {
                BrowserView.this.f38210e.setProgressState(7);
                new Handler().postDelayed(new a(), 200L);
            }
        }
    }

    public class d extends WebChromeClient {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                BrowserView.this.f38210e.setVisible(false);
            }
        }

        public d() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            if (i10 == 100) {
                BrowserView.this.f38210e.setProgressState(7);
                new Handler().postDelayed(new a(), 200L);
            }
        }
    }

    public interface e {
        void a();

        void a(WebView webView, String str);

        void onPageFinished(WebView webView, String str);

        void onPageStarted(WebView webView, String str, Bitmap bitmap);

        void onReceivedError(WebView webView, int i10, String str, String str2);

        boolean shouldOverrideUrlLoading(WebView webView, String str);
    }

    public BrowserView(Context context) {
        super(context);
        init();
    }

    public BrowserView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public BrowserView(Context context, CampaignEx campaignEx) {
        super(context);
        this.f38206a = campaignEx;
        init();
    }

    private void a() {
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f38210e = progressBar;
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        try {
            if (this.f38209d == null) {
                this.f38209d = getWebView();
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.weight = 1.0f;
            this.f38209d.setLayoutParams(layoutParams);
        } catch (Throwable th2) {
            q0.b("BrowserView", "webview is error", th2);
        }
        this.f38211f = new ToolBar(getContext());
        this.f38211f.setLayoutParams(new LinearLayout.LayoutParams(-1, v0.a(getContext(), 40.0f)));
        this.f38211f.setBackgroundColor(-1);
        addView(this.f38210e);
        WebView webView = this.f38209d;
        if (webView != null) {
            addView(webView);
        }
        addView(this.f38211f);
    }

    private WebView getWebView() {
        WebView webView = new WebView(getContext());
        try {
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setCacheMode(-1);
            settings.setAllowFileAccess(true);
            settings.setBuiltInZoomControls(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setDomStorageEnabled(true);
            settings.setSupportZoom(false);
            settings.setSavePassword(false);
            settings.setDatabaseEnabled(true);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            if (Build.VERSION.SDK_INT >= 26) {
                try {
                    settings.setSafeBrowsingEnabled(false);
                } catch (Throwable th2) {
                    q0.b("BrowserView", th2.getMessage());
                }
            }
            settings.setMediaPlaybackRequiresUserGesture(false);
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
            try {
                settings.setMixedContentMode(0);
            } catch (Exception e10) {
                q0.b("BrowserView", e10.getMessage());
            }
            settings.setDatabaseEnabled(true);
            String path = getContext().getDir("database", 0).getPath();
            settings.setDatabasePath(path);
            settings.setGeolocationEnabled(true);
            settings.setGeolocationDatabasePath(path);
            try {
                Method declaredMethod = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", Boolean.TYPE);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(settings, Boolean.FALSE);
            } catch (Exception e11) {
                q0.b("BrowserView", e11.getMessage());
            }
        } catch (Throwable th3) {
            q0.b("BrowserView", th3.getMessage());
        }
        webView.setDownloadListener(new com.mbridge.msdk.foundation.same.webview.a(this.f38206a));
        webView.setWebViewClient(new b());
        webView.setWebChromeClient(m0.r() <= 10 ? new c() : new d());
        return webView;
    }

    public void destroy() {
        try {
            WebView webView = this.f38209d;
            if (webView != null) {
                webView.setWebViewClient(null);
                this.f38209d.destroy();
                this.f38209d = null;
                removeAllViews();
            }
        } catch (Throwable th2) {
            q0.b("BrowserView", th2.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53141o, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public void init() {
        setOrientation(1);
        setGravity(17);
        a();
        this.f38210e.initResource(true);
        this.f38211f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD).setEnabled(false);
        this.f38211f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD).setEnabled(false);
        this.f38211f.setOnItemClickListener(new a());
    }

    public void loadUrl(String str) {
        WebView webView = this.f38209d;
        if (webView != null) {
            MintegralNetworkBridge.webviewLoadUrl(webView, str);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setListener(e eVar) {
        this.f38208c = eVar;
    }

    public void setWebView(WebView webView) {
        this.f38209d = webView;
    }
}
