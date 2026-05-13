package com.mgs.carparking.ui.web;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.dramarush.shortin.R;
import com.mbridge.msdk.MBridgeConstans;
import com.mgs.carparking.basecommon.ui.BarActivity;
import com.mgs.carparking.ui.web.WebActivity;
import ed.e;
import ed.l0;
import java.util.HashMap;
import java.util.Locale;
import me.goldze.mvvmhabit.base.BaseApplication;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;
import zp.n;
import zp.r;

/* JADX INFO: compiled from: WebActivity.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class WebActivity extends BarActivity {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public String f44975v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public String f44976w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public WebView f44977x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public ProgressBar f44978y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public TextView f44979z;

    /* JADX INFO: compiled from: WebActivity.kt */
    public final class a {
        public a() {
        }

        @JavascriptInterface
        public final void close() {
            WebActivity.this.finish();
        }

        @JavascriptInterface
        public final void payResult(int i10, int i11) {
            Log.e("payResult:", i10 + "price" + i11);
        }
    }

    /* JADX INFO: compiled from: WebActivity.kt */
    public static final class b extends WebChromeClient {
        public b() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            p.k(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            if (i10 == 100) {
                ProgressBar progressBar = WebActivity.this.f44978y;
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
            } else {
                ProgressBar progressBar2 = WebActivity.this.f44978y;
                if (progressBar2 != null) {
                    progressBar2.setProgress(i10);
                }
            }
            super.onProgressChanged(webView, i10);
        }
    }

    public static final void n(WebActivity webActivity, View view) {
        webActivity.finish();
    }

    public final void initData(@NotNull Intent intent) {
        p.k(intent, "intent");
        if (intent.getExtras() != null) {
            this.f44975v = intent.getStringExtra("web_url");
            this.f44976w = intent.getStringExtra("web_title");
        }
        TextView textView = this.f44979z;
        if (textView != null) {
            textView.setText(this.f44976w);
        }
        initWebView();
    }

    public final void initWebView() {
        WebView webView;
        WebView webView2 = this.f44977x;
        p.h(webView2);
        WebSettings settings = webView2.getSettings();
        p.j(settings, "getSettings(...)");
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("GBK");
        WebView webView3 = this.f44977x;
        if (webView3 != null) {
            webView3.setVerticalScrollbarOverlay(true);
        }
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        settings.setDisplayZoomControls(false);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        settings.setDomStorageEnabled(true);
        WebView webView4 = this.f44977x;
        if (webView4 != null) {
            webView4.addJavascriptInterface(new a(), "Netandroid");
        }
        WebView webView5 = this.f44977x;
        if (webView5 != null) {
            webView5.setWebViewClient(new WebViewClient());
        }
        settings.setMixedContentMode(0);
        ec.b.f("链接为：" + this.f44975v);
        String str = System.currentTimeMillis() + "";
        HashMap map = new HashMap();
        map.put("app_id", "filmin");
        map.put("version", "40000");
        map.put("sys_platform", "2");
        String str2 = Build.MANUFACTURER;
        p.j(str2, "MANUFACTURER");
        Locale locale = Locale.getDefault();
        p.j(locale, "getDefault(...)");
        String lowerCase = str2.toLowerCase(locale);
        p.j(lowerCase, "toLowerCase(...)");
        map.put("mob_mfr", lowerCase);
        map.put("mobmodel", Build.MODEL);
        map.put("sysrelease", Build.VERSION.RELEASE);
        map.put("device_id", ec.a.a(r.b()));
        map.put("channel_code", e.f(BaseApplication.getInstance()));
        map.put("cur_time", str + "");
        String strR = l0.R();
        p.h(strR);
        map.put("token", strR);
        String strX = e.x(e.y(str + ""));
        p.j(strX, "md5(...)");
        Locale locale2 = Locale.getDefault();
        p.j(locale2, "getDefault(...)");
        String upperCase = strX.toUpperCase(locale2);
        p.j(upperCase, "toUpperCase(...)");
        map.put("sign", upperCase);
        String str3 = this.f44975v;
        if (str3 != null && (webView = this.f44977x) != null) {
            webView.loadUrl(str3, map);
        }
        WebView webView6 = this.f44977x;
        if (webView6 != null) {
            webView6.setWebChromeClient(new b());
        }
    }

    public final void m() {
        this.f44977x = (WebView) findViewById(R.id.webView);
        this.f44978y = (ProgressBar) findViewById(R.id.progressBar1);
        ((ImageView) findViewById(R.id.web_left)).setOnClickListener(new View.OnClickListener() { // from class: dd.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WebActivity.n(this.f59742b, view);
            }
        });
        this.f44979z = (TextView) findViewById(R.id.web_title);
    }

    @Override // com.mgs.carparking.basecommon.ui.BarActivity, com.mgs.carparking.basecommon.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        n.a(this);
        setContentView(R.layout.activity_web, false);
        m();
        Intent intent = getIntent();
        p.j(intent, "getIntent(...)");
        initData(intent);
    }

    @Override // com.mgs.carparking.basecommon.ui.BarActivity, com.mgs.carparking.basecommon.ui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        WebSettings settings;
        super.onDestroy();
        WebView webView = this.f44977x;
        if (webView != null) {
            if (webView != null) {
                webView.setWebChromeClient(null);
            }
            WebView webView2 = this.f44977x;
            if (webView2 != null && (settings = webView2.getSettings()) != null) {
                settings.setJavaScriptEnabled(false);
            }
            WebView webView3 = this.f44977x;
            if (webView3 != null) {
                webView3.clearCache(true);
            }
            this.f44977x = null;
        }
    }
}
