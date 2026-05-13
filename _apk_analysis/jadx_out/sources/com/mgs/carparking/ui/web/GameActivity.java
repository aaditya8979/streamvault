package com.mgs.carparking.ui.web;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import com.dramarush.shortin.R;
import com.mbridge.msdk.MBridgeConstans;
import com.mgs.carparking.basecommon.ui.BarActivity;
import ed.l0;
import ic.i0;
import ic.j0;
import org.jetbrains.annotations.Nullable;
import tn.p;
import zp.n;
import zp.o;

/* JADX INFO: compiled from: GameActivity.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class GameActivity extends BarActivity {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public WebView f44971v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public ProgressBar f44972w;

    /* JADX INFO: compiled from: GameActivity.kt */
    public final class a {
        public a() {
        }

        @JavascriptInterface
        public final void addAdsFreeDays(@Nullable String str) {
            op.a aVarA = op.a.a();
            p.h(str);
            aVarA.b(new j0(str));
        }

        @JavascriptInterface
        public final void gotoBrowser(@Nullable String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                ed.a.a(GameActivity.this, str);
            } catch (Exception unused) {
            }
        }

        @JavascriptInterface
        public final void showRewardVideo() {
            op.a.a().b(new i0(""));
        }
    }

    /* JADX INFO: compiled from: GameActivity.kt */
    public static final class b extends WebChromeClient {
        public b() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            p.k(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            if (i10 == 100) {
                ProgressBar progressBar = GameActivity.this.f44972w;
                p.h(progressBar);
                progressBar.setVisibility(8);
            } else {
                ProgressBar progressBar2 = GameActivity.this.f44972w;
                p.h(progressBar2);
                progressBar2.setProgress(i10);
            }
            super.onProgressChanged(webView, i10);
        }
    }

    public final void initData(@Nullable Intent intent) {
        initWebView();
    }

    public final void initWebView() {
        WebView webView = this.f44971v;
        p.h(webView);
        WebSettings settings = webView.getSettings();
        p.j(settings, "getSettings(...)");
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("GBK");
        WebView webView2 = this.f44971v;
        p.h(webView2);
        webView2.setVerticalScrollbarOverlay(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        settings.setDisplayZoomControls(false);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        settings.setDomStorageEnabled(true);
        WebView webView3 = this.f44971v;
        p.h(webView3);
        webView3.addJavascriptInterface(new a(), "Netandroid");
        WebView webView4 = this.f44971v;
        p.h(webView4);
        webView4.setWebViewClient(new WebViewClient());
        settings.setMixedContentMode(0);
        if (!o.c(l0.F())) {
            WebView webView5 = this.f44971v;
            p.h(webView5);
            String strF = l0.F();
            p.h(strF);
            webView5.loadUrl(strF);
        }
        WebView webView6 = this.f44971v;
        p.h(webView6);
        webView6.setWebChromeClient(new b());
    }

    public final void l() {
        this.f44971v = (WebView) findViewById(R.id.webView);
        this.f44972w = (ProgressBar) findViewById(R.id.progressBar1);
    }

    @Override // com.mgs.carparking.basecommon.ui.BarActivity, com.mgs.carparking.basecommon.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        n.a(this);
        setContentView(R.layout.activity_web_game, false);
        l();
        initData(getIntent());
    }

    @Override // com.mgs.carparking.basecommon.ui.BarActivity, com.mgs.carparking.basecommon.ui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        WebView webView = this.f44971v;
        if (webView != null) {
            p.h(webView);
            webView.setWebChromeClient(null);
            WebView webView2 = this.f44971v;
            p.h(webView2);
            webView2.getSettings().setJavaScriptEnabled(false);
            WebView webView3 = this.f44971v;
            p.h(webView3);
            webView3.clearCache(true);
            this.f44971v = null;
        }
    }
}
