package com.mbridge.msdk.mbsignalcommon.commonwebview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.webview.ProgressBar;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class CommonWebView extends LinearLayout {
    public static int DEFAULT_JUMP_TIMEOUT = 10000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f38826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f38827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ToolBar f38828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ToolBar f38829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ProgressBar f38830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private RelativeLayout f38831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View.OnClickListener f38832g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.commonwebview.b f38833h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.commonwebview.a f38834i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BaseWebView f38835j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View.OnClickListener f38836k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View.OnClickListener f38837l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View.OnClickListener f38838m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View.OnClickListener f38839n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Handler f38840o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f38841p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private WebViewClient f38842q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f38843r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private i f38844s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f38845t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Runnable f38846u;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q0.b("CommonWebView", "webview js!！超时上限：" + CommonWebView.this.f38841p + "ms");
            if (CommonWebView.this.f38844s != null) {
                CommonWebView.this.f38845t = false;
                CommonWebView.this.f38844s.a(CommonWebView.this.f38843r);
            }
        }
    }

    public class b extends WebViewClient {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f53141o, webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f53141o, webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            q0.c("CommonWebView", "newProgress! 开始! = " + str);
            CommonWebView.this.f38830e.setVisible(true);
            CommonWebView.this.f38830e.setProgressState(5);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (webView != null) {
                try {
                    ViewGroup viewGroup = (ViewGroup) webView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(webView);
                    }
                    if (webView instanceof WindVaneWebView) {
                        ((WindVaneWebView) webView).release();
                    } else {
                        webView.destroy();
                    }
                } catch (Throwable th2) {
                    q0.b("CommonWebView", th2.getMessage());
                }
            }
            return true;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f53141o, webView, webResourceRequest, super.shouldInterceptRequest(webView, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f53141o, webView, str, super.shouldInterceptRequest(webView, str));
        }
    }

    public class c extends WebChromeClient {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                CommonWebView.this.f38830e.setVisible(false);
            }
        }

        public c() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            q0.c("CommonWebView", "newProgress! = " + i10);
            if (i10 == 100) {
                CommonWebView.this.f38830e.setProgressState(7);
                new Handler().postDelayed(new a(), 200L);
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseWebView baseWebView = CommonWebView.this.f38835j;
            if (baseWebView != null) {
                baseWebView.stopLoading();
                String str = (String) view.getTag();
                if (TextUtils.equals(str, ToolBar.BACKWARD)) {
                    CommonWebView.this.f38829d.getItem(ToolBar.FORWARD).setEnabled(true);
                    if (CommonWebView.this.f38835j.canGoBack()) {
                        CommonWebView.this.f38835j.goBack();
                    }
                    CommonWebView.this.f38829d.getItem(ToolBar.BACKWARD).setEnabled(CommonWebView.this.f38835j.canGoBack());
                    if (CommonWebView.this.f38836k != null) {
                        CommonWebView.this.f38836k.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, ToolBar.FORWARD)) {
                    CommonWebView.this.f38829d.getItem(ToolBar.BACKWARD).setEnabled(true);
                    if (CommonWebView.this.f38835j.canGoForward()) {
                        CommonWebView.this.f38835j.goForward();
                    }
                    CommonWebView.this.f38829d.getItem(ToolBar.FORWARD).setEnabled(CommonWebView.this.f38835j.canGoForward());
                    if (CommonWebView.this.f38837l != null) {
                        CommonWebView.this.f38837l.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, ToolBar.REFRESH)) {
                    CommonWebView.this.f38829d.getItem(ToolBar.BACKWARD).setEnabled(CommonWebView.this.f38835j.canGoBack());
                    CommonWebView.this.f38829d.getItem(ToolBar.FORWARD).setEnabled(CommonWebView.this.f38835j.canGoForward());
                    CommonWebView.this.f38835j.reload();
                    if (CommonWebView.this.f38838m != null) {
                        CommonWebView.this.f38838m.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, ToolBar.EXITS)) {
                    if (CommonWebView.this.f38832g != null) {
                        CommonWebView.this.f38832g.onClick(view);
                    }
                } else if (TextUtils.equals(str, ToolBar.OPEN_BY_BROWSER)) {
                    if (CommonWebView.this.f38839n != null) {
                        CommonWebView.this.f38839n.onClick(view);
                    }
                    com.mbridge.msdk.click.c.c(CommonWebView.this.getContext(), CommonWebView.this.f38835j.getUrl());
                }
            }
        }
    }

    public class e extends WebViewClient {
        public e() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f53141o, webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f53141o, webView, str);
        }

        public boolean safedk_CommonWebView$e_shouldOverrideUrlLoading_c8af97742a2adb21698558eb32e0e266(WebView webView, String str) {
            CommonWebView.this.f38829d.getItem(ToolBar.BACKWARD).setEnabled(true);
            CommonWebView.this.f38829d.getItem(ToolBar.FORWARD).setEnabled(false);
            return false;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f53141o, webView, webResourceRequest, super.shouldInterceptRequest(webView, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f53141o, webView, str, super.shouldInterceptRequest(webView, str));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbsignalcommon/commonwebview/CommonWebView$e;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean zSafedk_CommonWebView$e_shouldOverrideUrlLoading_c8af97742a2adb21698558eb32e0e266 = safedk_CommonWebView$e_shouldOverrideUrlLoading_c8af97742a2adb21698558eb32e0e266(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f53141o, webView, str, zSafedk_CommonWebView$e_shouldOverrideUrlLoading_c8af97742a2adb21698558eb32e0e266);
            return zSafedk_CommonWebView$e_shouldOverrideUrlLoading_c8af97742a2adb21698558eb32e0e266;
        }
    }

    public class f extends WebViewClient {
        public f() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f53141o, webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f53141o, webView, str);
        }

        public boolean safedk_CommonWebView$f_shouldOverrideUrlLoading_e22e3dde4870eea386a2fe1c3e296548(WebView webView, String str) {
            if (u0.a.b(str)) {
                u0.a.a(CommonWebView.this.getContext(), str, null);
            }
            return CommonWebView.this.a(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f53141o, webView, webResourceRequest, super.shouldInterceptRequest(webView, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f53141o, webView, str, super.shouldInterceptRequest(webView, str));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbsignalcommon/commonwebview/CommonWebView$f;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean zSafedk_CommonWebView$f_shouldOverrideUrlLoading_e22e3dde4870eea386a2fe1c3e296548 = safedk_CommonWebView$f_shouldOverrideUrlLoading_e22e3dde4870eea386a2fe1c3e296548(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f53141o, webView, str, zSafedk_CommonWebView$f_shouldOverrideUrlLoading_e22e3dde4870eea386a2fe1c3e296548);
            return zSafedk_CommonWebView$f_shouldOverrideUrlLoading_e22e3dde4870eea386a2fe1c3e296548;
        }
    }

    public class g extends WebViewClient {
        public g() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f53141o, webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbsignalcommon/commonwebview/CommonWebView$g;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
            CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f53141o, webView, str);
            safedk_CommonWebView$g_onPageFinished_5e1dde7865f8c88d4c576c22f58d79e4(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            CommonWebView.this.f38843r = str;
            if (CommonWebView.this.f38845t) {
                return;
            }
            CommonWebView.this.f38845t = true;
            CommonWebView.this.c();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            CommonWebView.this.f38845t = false;
            CommonWebView.this.a();
        }

        public void safedk_CommonWebView$g_onPageFinished_5e1dde7865f8c88d4c576c22f58d79e4(WebView webView, String str) {
            CommonWebView.this.f38845t = false;
            CommonWebView.this.a();
        }

        public boolean safedk_CommonWebView$g_shouldOverrideUrlLoading_9914e364f799338377518c1a04af695c(WebView webView, String str) {
            CommonWebView.this.f38843r = str;
            if (CommonWebView.this.f38845t) {
                CommonWebView.this.a();
            }
            CommonWebView.this.f38845t = true;
            CommonWebView.this.c();
            return false;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f53141o, webView, webResourceRequest, super.shouldInterceptRequest(webView, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f53141o, webView, str, super.shouldInterceptRequest(webView, str));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbsignalcommon/commonwebview/CommonWebView$g;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean zSafedk_CommonWebView$g_shouldOverrideUrlLoading_9914e364f799338377518c1a04af695c = safedk_CommonWebView$g_shouldOverrideUrlLoading_9914e364f799338377518c1a04af695c(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f53141o, webView, str, zSafedk_CommonWebView$g_shouldOverrideUrlLoading_9914e364f799338377518c1a04af695c);
            return zSafedk_CommonWebView$g_shouldOverrideUrlLoading_9914e364f799338377518c1a04af695c;
        }
    }

    public interface h {
        void a();
    }

    public interface i {
        void a(String str);
    }

    public CommonWebView(Context context) {
        super(context);
        this.f38846u = new a();
        init();
    }

    public CommonWebView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38846u = new a();
        init();
    }

    public CommonWebView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f38846u = new a();
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f38840o.removeCallbacks(this.f38846u);
    }

    private void a(ArrayList<ToolBar.b> arrayList, boolean z10) {
        if (this.f38828c != null) {
            return;
        }
        ToolBar.a aVar = new ToolBar.a();
        aVar.a(40);
        aVar.b(80);
        ToolBar toolBar = new ToolBar(getContext(), aVar, arrayList);
        this.f38828c = toolBar;
        toolBar.setBackgroundColor(Color.argb(153, 255, 255, 255));
        if (!z10) {
            this.f38828c.setLayoutParams(new LinearLayout.LayoutParams(-1, this.f38826a));
            addView(this.f38828c, 0);
        } else {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.f38826a);
            layoutParams.addRule(10);
            this.f38828c.setLayoutParams(layoutParams);
            this.f38831f.addView(this.f38828c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(WebView webView, String str) {
        String str2;
        try {
        } catch (Throwable th2) {
            q0.b("CommonWebView", th2.getMessage());
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri uri = Uri.parse(str);
        if (uri.getScheme().equals("http") || uri.getScheme().equals("https")) {
            return false;
        }
        if (uri.getScheme().equals("intent")) {
            Intent uri2 = Intent.parseUri(str, 1);
            try {
                str2 = uri2.getPackage();
            } catch (Throwable th3) {
                q0.b("CommonWebView", th3.getMessage());
            }
            if (!TextUtils.isEmpty(str2) && getContext().getPackageManager().getLaunchIntentForPackage(str2) != null) {
                uri2.setComponent(null);
                uri2.setSelector(null);
                uri2.setFlags(268435456);
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(getContext(), uri2);
                return true;
            }
            try {
                String stringExtra = uri2.getStringExtra("browser_fallback_url");
                if (!TextUtils.isEmpty(stringExtra)) {
                    Uri uri3 = Uri.parse(str);
                    if (uri3.getScheme().equals("http") || uri3.getScheme().equals("https")) {
                        MintegralNetworkBridge.webviewLoadUrl(webView, stringExtra);
                        return false;
                    }
                    str = stringExtra;
                }
            } catch (Throwable th4) {
                q0.b("CommonWebView", th4.getMessage());
            }
            q0.b("CommonWebView", th2.getMessage());
            return false;
        }
        if (com.mbridge.msdk.click.c.d(getContext(), str)) {
            q0.b("CommonWebView", "openDeepLink");
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return !(str.startsWith("http") || str.startsWith("https"));
    }

    private void b() {
        if (this.f38829d != null) {
            return;
        }
        this.f38829d = new ToolBar(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.f38827b);
        layoutParams.bottomMargin = 0;
        this.f38829d.setLayoutParams(layoutParams);
        this.f38829d.setBackgroundColor(-1);
        this.f38829d.setOnItemClickListener(new d());
        addWebViewClient(new e());
        addView(this.f38829d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f38840o.postDelayed(this.f38846u, this.f38841p);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(intent, com.safedk.android.utils.g.f53141o);
        context.startActivity(intent);
    }

    public void addWebChromeClient(WebChromeClient webChromeClient) {
        this.f38834i.a(webChromeClient);
    }

    public void addWebViewClient(WebViewClient webViewClient) {
        this.f38833h.a(webViewClient);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f53141o, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public View findToolBarButton(String str) {
        ToolBar toolBar;
        ToolBar toolBar2 = this.f38828c;
        View item = toolBar2 != null ? toolBar2.getItem(str) : null;
        return (item != null || (toolBar = this.f38829d) == null) ? item : toolBar.getItem(str);
    }

    public String getUrl() {
        BaseWebView baseWebView = this.f38835j;
        return baseWebView == null ? "" : baseWebView.getUrl();
    }

    public WebView getWebView() {
        return this.f38835j;
    }

    public void hideCustomizedToolBar() {
        ToolBar toolBar = this.f38828c;
        if (toolBar != null) {
            toolBar.setVisibility(8);
        }
    }

    public void hideDefaultToolBar() {
        ToolBar toolBar = this.f38829d;
        if (toolBar != null) {
            toolBar.setVisibility(8);
        }
    }

    public void hideToolBarButton(String str) {
        View viewFindToolBarButton = findToolBarButton(str);
        if (viewFindToolBarButton != null) {
            viewFindToolBarButton.setVisibility(8);
        }
    }

    public void hideToolBarTitle() {
        this.f38828c.hideTitle();
    }

    public void init() {
        setOrientation(1);
        setGravity(17);
        this.f38831f = new RelativeLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        addView(this.f38831f, layoutParams);
        this.f38826a = v0.a(getContext(), 40.0f);
        this.f38827b = v0.a(getContext(), 40.0f);
        this.f38833h = new com.mbridge.msdk.mbsignalcommon.commonwebview.b();
        this.f38834i = new com.mbridge.msdk.mbsignalcommon.commonwebview.a();
        initWebview();
    }

    public void initWebview() {
        try {
            if (this.f38835j == null) {
                this.f38835j = new BaseWebView(getContext());
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(10);
            this.f38835j.setLayoutParams(layoutParams);
            BaseWebView baseWebView = this.f38835j;
            com.mbridge.msdk.mbsignalcommon.base.b bVar = baseWebView.mWebViewClient;
            baseWebView.setWebViewClient(this.f38833h);
            this.f38835j.setWebChromeClient(this.f38834i);
            addWebViewClient(bVar);
        } catch (Throwable th2) {
            q0.b("CommonWebView", "webview is error", th2);
        }
        this.f38831f.addView(this.f38835j);
    }

    public void loadUrl(String str) {
        MintegralNetworkBridge.webviewLoadUrl(this.f38835j, str);
        if (this.f38842q != null) {
            c();
        }
    }

    public void onBackwardClicked(View.OnClickListener onClickListener) {
        this.f38836k = onClickListener;
    }

    public void onForwardClicked(View.OnClickListener onClickListener) {
        this.f38837l = onClickListener;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void onOpenByBrowserClicked(View.OnClickListener onClickListener) {
        this.f38839n = onClickListener;
    }

    public void onRefreshClicked(View.OnClickListener onClickListener) {
        this.f38838m = onClickListener;
    }

    public void removeWebChromeClient(WebChromeClient webChromeClient) {
        this.f38834i.b(webChromeClient);
    }

    public void removeWebViewClient(WebViewClient webViewClient) {
        this.f38833h.b(webViewClient);
    }

    public void setCustomizedToolBarFloating() {
        ((ViewGroup) this.f38828c.getParent()).removeView(this.f38828c);
        this.f38831f.addView(this.f38828c);
    }

    public void setCustomizedToolBarUnfloating() {
        ((ViewGroup) this.f38828c.getParent()).removeView(this.f38828c);
        addView(this.f38828c, 0);
    }

    public void setExitsClickListener(View.OnClickListener onClickListener) {
        this.f38832g = onClickListener;
    }

    public void setPageLoadTimtout(int i10) {
        this.f38841p = i10;
        if (this.f38840o == null) {
            this.f38840o = new Handler(Looper.getMainLooper());
        }
        if (this.f38842q == null) {
            g gVar = new g();
            this.f38842q = gVar;
            addWebViewClient(gVar);
        }
    }

    public void setPageLoadTimtoutListener(i iVar) {
        this.f38844s = iVar;
    }

    public void setToolBarTitle(String str) {
        this.f38828c.setTitle(str);
    }

    public void setToolBarTitle(String str, int i10) {
        this.f38828c.setTitle(str, i10);
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        addWebChromeClient(webChromeClient);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        addWebViewClient(webViewClient);
    }

    public void showCustomizedToolBar() {
        ToolBar toolBar = this.f38828c;
        if (toolBar != null) {
            toolBar.setVisibility(0);
        }
    }

    public void showDefaultToolBar() {
        ToolBar toolBar = this.f38829d;
        if (toolBar != null) {
            toolBar.setVisibility(0);
        }
    }

    public void showToolBarButton(String str) {
        View viewFindToolBarButton = findToolBarButton(str);
        if (viewFindToolBarButton != null) {
            viewFindToolBarButton.setVisibility(0);
        }
    }

    public void showToolBarTitle() {
        this.f38828c.showTitle();
    }

    public void useCustomizedToolBar(ArrayList<ToolBar.b> arrayList) {
        a(arrayList, false);
    }

    public void useCustomizedToolBar(ArrayList<ToolBar.b> arrayList, boolean z10) {
        a(arrayList, z10);
    }

    public void useDeeplink() {
        addWebViewClient(new f());
    }

    public void useDefaultToolBar() {
        b();
    }

    public void useProgressBar() {
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f38830e = progressBar;
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        addWebViewClient(new b());
        addWebChromeClient(new c());
        addView(this.f38830e);
        this.f38830e.initResource(true);
    }
}
