package com.ironsource.sdk.controller;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.view.InputDeviceCompat;
import com.ironsource.C3978d4;
import com.ironsource.C4026fg;
import com.ironsource.C4038ga;
import com.ironsource.C4228r4;
import com.ironsource.InterfaceC4045h;
import com.ironsource.Je;
import com.ironsource.P3;
import com.ironsource.S9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.SDKUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.safedk.android.utils.Logger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public class OpenUrlActivity extends Activity {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f33563j = "OpenUrlActivity";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f33564k = SDKUtils.generateViewId();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f33565l = SDKUtils.generateViewId();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v f33567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ProgressBar f33568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f33569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RelativeLayout f33570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f33571f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebView f33566a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Handler f33572g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f33573h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Runnable f33574i = new b();

    public class a implements View.OnSystemUiVisibilityChangeListener {
        public a() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i10) {
            if ((i10 & InputDeviceCompat.SOURCE_TOUCHSCREEN) == 0) {
                OpenUrlActivity openUrlActivity = OpenUrlActivity.this;
                openUrlActivity.f33572g.removeCallbacks(openUrlActivity.f33574i);
                OpenUrlActivity openUrlActivity2 = OpenUrlActivity.this;
                openUrlActivity2.f33572g.postDelayed(openUrlActivity2.f33574i, 500L);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            OpenUrlActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(OpenUrlActivity.this.f33573h));
        }
    }

    public class c extends WebViewClient {
        private c() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f53132f, webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/sdk/controller/OpenUrlActivity$c;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
            CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f53132f, webView, str);
            safedk_OpenUrlActivity$c_onPageFinished_9fad83dd06a646b10fca49eceda7481c(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            OpenUrlActivity.this.f33568c.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            v vVar;
            super.onReceivedError(webView, i10, str, str2);
            try {
                P3 featureFlagCatchUrlError = FeaturesManager.getInstance().getFeatureFlagCatchUrlError();
                if (featureFlagCatchUrlError.b()) {
                    if (featureFlagCatchUrlError.e() && (vVar = OpenUrlActivity.this.f33567b) != null) {
                        vVar.d(str, str2);
                    }
                    if (featureFlagCatchUrlError.d()) {
                        OpenUrlActivity.this.finish();
                    }
                }
            } catch (Throwable th2) {
                C4228r4.d().a(th2);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            com.ironsource.sdk.utils.Logger.e(OpenUrlActivity.f33563j, "Chromium process crashed - detail.didCrash():" + renderProcessGoneDetail.didCrash());
            OpenUrlActivity.this.finish();
            return true;
        }

        public void safedk_OpenUrlActivity$c_onPageFinished_9fad83dd06a646b10fca49eceda7481c(WebView webView, String str) {
            super.onPageFinished(webView, str);
            OpenUrlActivity.this.f33568c.setVisibility(4);
        }

        public boolean safedk_OpenUrlActivity$c_shouldOverrideUrlLoading_40992ed28c4c47c03c78f7969ca723df(WebView webView, String str) {
            if (!new Je(str, C4038ga.e().d(), FeaturesManager.getInstance().getFeatureFlagClickCheck().b()).a()) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            try {
                C4026fg.a(OpenUrlActivity.this, str);
                OpenUrlActivity.this.f33567b.z();
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                StringBuilder sb2 = new StringBuilder();
                if (e10 instanceof ActivityNotFoundException) {
                    sb2.append("no activity to handle url");
                } else {
                    sb2.append("activity failed to open with unspecified reason");
                }
                v vVar = OpenUrlActivity.this.f33567b;
                if (vVar != null) {
                    vVar.d(sb2.toString(), str);
                }
            }
            OpenUrlActivity.this.finish();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f53132f, webView, webResourceRequest, super.shouldInterceptRequest(webView, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f53132f, webView, str, super.shouldInterceptRequest(webView, str));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/sdk/controller/OpenUrlActivity$c;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean zSafedk_OpenUrlActivity$c_shouldOverrideUrlLoading_40992ed28c4c47c03c78f7969ca723df = safedk_OpenUrlActivity$c_shouldOverrideUrlLoading_40992ed28c4c47c03c78f7969ca723df(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f53132f, webView, str, zSafedk_OpenUrlActivity$c_shouldOverrideUrlLoading_40992ed28c4c47c03c78f7969ca723df);
            return zSafedk_OpenUrlActivity$c_shouldOverrideUrlLoading_40992ed28c4c47c03c78f7969ca723df;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f33578a = "is_store";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f33579b = "external_url";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f33580c = "secondary_web_view";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f33581d = "immersive";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f33582e = "no activity to handle url";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f33583f = "activity failed to open with unspecified reason";

        private d() {
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC4045h f33584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f33585b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f33586c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f33587d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f33588e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f33589f = false;

        public e(InterfaceC4045h interfaceC4045h) {
            this.f33584a = interfaceC4045h;
        }

        public Intent a(Context context) {
            Intent intentA = this.f33584a.a(context);
            intentA.putExtra(d.f33579b, this.f33586c);
            intentA.putExtra(d.f33580c, this.f33587d);
            intentA.putExtra(d.f33578a, this.f33588e);
            intentA.putExtra("immersive", this.f33589f);
            if (!(context instanceof Activity)) {
                intentA.setFlags(this.f33585b);
            }
            return intentA;
        }

        @NotNull
        public e a(int i10) {
            this.f33585b = i10;
            return this;
        }

        @NotNull
        public e a(String str) {
            this.f33586c = str;
            return this;
        }

        @NotNull
        public e a(boolean z10) {
            this.f33589f = z10;
            return this;
        }

        @NotNull
        public e b(boolean z10) {
            this.f33587d = z10;
            return this;
        }

        @NotNull
        public e c(boolean z10) {
            this.f33588e = z10;
            return this;
        }
    }

    private void a() {
        if (this.f33568c == null) {
            ProgressBar progressBar = new ProgressBar(new ContextThemeWrapper(this, R.style.Theme.Holo.Light.Dialog));
            this.f33568c = progressBar;
            progressBar.setId(f33565l);
        }
        if (findViewById(f33565l) == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.f33568c.setLayoutParams(layoutParams);
            this.f33568c.setVisibility(4);
            this.f33570e.addView(this.f33568c);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void b() {
        if (this.f33566a == null) {
            WebView webView = new WebView(getApplicationContext());
            this.f33566a = webView;
            webView.setId(f33564k);
            this.f33566a.getSettings().setJavaScriptEnabled(true);
            this.f33566a.setWebViewClient(new c());
            loadUrl(this.f33571f);
        }
        if (findViewById(f33564k) == null) {
            this.f33570e.addView(this.f33566a, new RelativeLayout.LayoutParams(-1, -1));
        }
        a();
        v vVar = this.f33567b;
        if (vVar != null) {
            vVar.b(true, C3978d4.i.Y);
        }
    }

    private void c() {
        WebView webView = this.f33566a;
        if (webView != null) {
            webView.destroy();
        }
    }

    private void d() {
        getWindow().addFlags(16);
    }

    private void e() {
        requestWindowFeature(1);
    }

    private void f() {
        getWindow().setFlags(1024, 1024);
    }

    private void g() {
        ViewGroup viewGroup;
        v vVar = this.f33567b;
        if (vVar != null) {
            vVar.b(false, C3978d4.i.Y);
            if (this.f33570e == null || (viewGroup = (ViewGroup) this.f33566a.getParent()) == null) {
                return;
            }
            if (viewGroup.findViewById(f33564k) != null) {
                viewGroup.removeView(this.f33566a);
            }
            if (viewGroup.findViewById(f33565l) != null) {
                viewGroup.removeView(this.f33568c);
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.f53132f, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    public void finish() {
        v vVar;
        if (this.f33569d && (vVar = this.f33567b) != null) {
            vVar.c(C3978d4.i.f31343j);
        }
        super.finish();
    }

    public void loadUrl(String str) {
        this.f33566a.stopLoading();
        this.f33566a.clearHistory();
        try {
            IronSourceNetworkBridge.webviewLoadUrl(this.f33566a, str);
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            com.ironsource.sdk.utils.Logger.e(f33563j, "OpenUrlActivity:: loadUrl: " + th2.toString());
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f33566a.canGoBack()) {
            this.f33566a.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.ironsource.sdk.utils.Logger.i(f33563j, "onCreate()");
        try {
            this.f33567b = (v) S9.b((Context) this).a().k();
            e();
            f();
            Bundle extras = getIntent().getExtras();
            this.f33571f = extras.getString(d.f33579b);
            this.f33569d = extras.getBoolean(d.f33580c);
            boolean booleanExtra = getIntent().getBooleanExtra("immersive", false);
            this.f33573h = booleanExtra;
            if (booleanExtra) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new a());
                runOnUiThread(this.f33574i);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f33570e = relativeLayout;
            setContentView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f33573h && (i10 == 25 || i10 == 24)) {
            this.f33572g.postDelayed(this.f33574i, 500L);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        g();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        b();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (this.f33573h && z10) {
            runOnUiThread(this.f33574i);
        }
    }
}
