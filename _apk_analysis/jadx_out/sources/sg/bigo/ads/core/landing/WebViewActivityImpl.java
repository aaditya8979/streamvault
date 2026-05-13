package sg.bigo.ads.core.landing;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.IntRange;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.Z7;
import com.safedk.android.utils.Logger;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.api.core.BaseAdActivityImpl;
import sg.bigo.ads.api.core.d;
import sg.bigo.ads.common.e.a;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.core.h.c;
import sg.bigo.ads.core.h.e;

/* JADX INFO: loaded from: classes5.dex */
public class WebViewActivityImpl extends BaseAdActivityImpl implements View.OnClickListener {

    @Nullable
    public ImageView A;

    @Nullable
    public WebView B;
    public String C;
    public long D;
    public d E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f84042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f84043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AtomicBoolean f84044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f84045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f84046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f84047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private FileChooser f84048g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a.AbstractC1012a f84049h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b f84050i;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public TextView f84051x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public ProgressBar f84052y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public ImageView f84053z;

    public class CustomWebChromeClient extends c {
        private CustomWebChromeClient() {
        }

        public /* synthetic */ CustomWebChromeClient(WebViewActivityImpl webViewActivityImpl, byte b10) {
            this();
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            super.onProgressChanged(webView, i10);
            WebViewActivityImpl webViewActivityImpl = WebViewActivityImpl.this;
            if (webViewActivityImpl.f84052y != null && !webViewActivityImpl.c()) {
                WebViewActivityImpl.this.f84052y.setProgress(i10);
            }
            WebViewActivityImpl.this.a(i10);
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            WebViewActivityImpl.this.b(str);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            if (WebViewActivityImpl.this.f84048g == null) {
                WebViewActivityImpl webViewActivityImpl = WebViewActivityImpl.this;
                webViewActivityImpl.f84048g = new FileChooser(webViewActivityImpl.L);
            }
            FileChooser fileChooser = WebViewActivityImpl.this.f84048g;
            sg.bigo.ads.common.t.a.a(0, 3, "FileChooser", "onShowFileChooser");
            ValueCallback<Uri[]> valueCallback2 = fileChooser.f84041c;
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue(null);
            }
            fileChooser.f84041c = valueCallback;
            fileChooser.a(fileChooserParams.getAcceptTypes());
            return true;
        }

        @Keep
        public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
            if (WebViewActivityImpl.this.f84048g == null) {
                WebViewActivityImpl webViewActivityImpl = WebViewActivityImpl.this;
                webViewActivityImpl.f84048g = new FileChooser(webViewActivityImpl.L);
            }
            WebViewActivityImpl.this.f84048g.openFileChooser(valueCallback, str, str2);
        }
    }

    public class a extends sg.bigo.ads.core.h.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f84057b;

        private a() {
        }

        public /* synthetic */ a(WebViewActivityImpl webViewActivityImpl, byte b10) {
            this();
        }

        private void a(WebView webView, String str) {
            onPageFinished(webView, str);
            WebViewActivityImpl.this.b(0);
        }

        private boolean a(WebView webView, String str, boolean z10) {
            boolean zA;
            if (WebViewActivityImpl.this.f84042a) {
                return true;
            }
            sg.bigo.ads.common.t.a.a(0, 3, "WebView", "shouldOverrideUrlLoading url= " + str + ", isRedirectOnStart=" + z10);
            if (z10 && this.f84057b > 1) {
                WebViewActivityImpl.this.c(str);
            }
            if (sg.bigo.ads.core.landing.a.a(str)) {
                boolean zA2 = a(str);
                if (zA2 && z10) {
                    a(webView, str);
                }
                return zA2;
            }
            if (str.startsWith("intent://")) {
                try {
                    Intent uri = Intent.parseUri(str, 1);
                    Uri data = uri.getData();
                    if (data != null && WebViewActivityImpl.this.a(data)) {
                        if (z10) {
                            a(webView, str);
                        }
                        return true;
                    }
                    uri.addCategory("android.intent.category.BROWSABLE");
                    uri.setComponent(null);
                    uri.setSelector(null);
                    if (safedk_Activity_startActivityIfNeeded_1fa5b5a8a78954a2b40c04a0ca5c037b(WebViewActivityImpl.this.L, uri, -1)) {
                        if (z10) {
                            a(webView, str);
                        }
                        return true;
                    }
                    sg.bigo.ads.common.t.a.b("WebView", "queryIntentActivities: null");
                    String stringExtra = uri.getStringExtra("browser_fallback_url");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        if (sg.bigo.ads.core.landing.a.a(stringExtra)) {
                            zA = a(stringExtra);
                            if (zA && z10) {
                                a(webView, stringExtra);
                            }
                        } else {
                            zA = false;
                        }
                        if (!zA) {
                            webView.loadUrl(stringExtra);
                        }
                        return true;
                    }
                } catch (Exception e10) {
                    sg.bigo.ads.common.t.a.a(0, "WebView", "shouldOverrideUrlLoading: " + e10.getMessage());
                }
            } else if (!URLUtil.isValidUrl(str)) {
                if (WebViewActivityImpl.this.e(str) && z10) {
                    a(webView, str);
                }
                return true;
            }
            String strD = WebViewActivityImpl.this.d(str);
            if (str.equals(strD)) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            webView.loadUrl(strD);
            return true;
        }

        private boolean a(String str) {
            WebViewActivityImpl.this.E = new d();
            WebViewActivityImpl webViewActivityImpl = WebViewActivityImpl.this;
            webViewActivityImpl.E.f81848f = webViewActivityImpl.f84047f;
            Uri uri = Uri.parse(str);
            Activity activity = WebViewActivityImpl.this.L;
            Activity activity2 = WebViewActivityImpl.this.L;
            WebViewActivityImpl webViewActivityImpl2 = WebViewActivityImpl.this;
            boolean zA = sg.bigo.ads.core.landing.a.a(uri, activity, activity2, webViewActivityImpl2.E, webViewActivityImpl2.f84045d, WebViewActivityImpl.this.f84046e, WebViewActivityImpl.this.f84047f);
            WebViewActivityImpl webViewActivityImpl3 = WebViewActivityImpl.this;
            webViewActivityImpl3.a(webViewActivityImpl3.E);
            return zA;
        }

        public static boolean safedk_Activity_startActivityIfNeeded_1fa5b5a8a78954a2b40c04a0ca5c037b(Activity activity, Intent intent, int i10) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityIfNeeded(Landroid/content/Intent;I)Z");
            if (intent == null) {
                return false;
            }
            return activity.startActivityIfNeeded(intent, i10);
        }

        @Override // sg.bigo.ads.core.h.d
        public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
            sg.bigo.ads.core.d.b.a(3002, 10105, "The render process was gone.");
            WebViewActivityImpl.this.b(0);
        }

        @Override // sg.bigo.ads.core.h.d, android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            ProgressBar progressBar = WebViewActivityImpl.this.f84052y;
            if (progressBar != null) {
                progressBar.setAlpha(0.0f);
            }
            sg.bigo.ads.common.t.a.a(0, 3, "WebView", "onPageFinished  ".concat(String.valueOf(str)));
            WebViewActivityImpl.this.a(str);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            boolean z10 = false;
            sg.bigo.ads.common.t.a.a(0, 3, "WebView", "onPageStarted ".concat(String.valueOf(str)));
            ProgressBar progressBar = WebViewActivityImpl.this.f84052y;
            if (progressBar != null) {
                progressBar.animate().alpha(1.0f).setDuration(100L).setListener(null);
                WebViewActivityImpl.this.f84052y.setProgress(0);
            }
            WebViewActivityImpl webViewActivityImpl = WebViewActivityImpl.this;
            if (webViewActivityImpl.D < 0) {
                z10 = true;
                webViewActivityImpl.D = SystemClock.elapsedRealtime();
            }
            WebViewActivityImpl.this.a(str, z10);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            sg.bigo.ads.common.t.a.b("WebView", "onReceivedError: " + i10 + Z7.f30794r + str);
            WebViewActivityImpl.this.a(i10, str, str2);
        }

        @Override // sg.bigo.ads.core.h.d, android.webkit.WebViewClient
        @TargetApi(23)
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceRequest.isForMainFrame()) {
                onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
            }
        }

        @Override // sg.bigo.ads.core.h.d, android.webkit.WebViewClient
        @TargetApi(23)
        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest.isForMainFrame()) {
                onReceivedError(webView, webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase(), webResourceRequest.getUrl().toString());
            }
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            this.f84057b++;
            WebViewActivityImpl webViewActivityImpl = WebViewActivityImpl.this;
            return a(webView, str, !(webViewActivityImpl.D >= 0 && webViewActivityImpl.f84043b));
        }
    }

    public class b implements View.OnTouchListener, e.a {
        private b() {
        }

        public /* synthetic */ b(WebViewActivityImpl webViewActivityImpl, byte b10) {
            this();
        }

        @Override // sg.bigo.ads.core.h.e.a
        public final void a(MotionEvent motionEvent) {
            onTouch(WebViewActivityImpl.this.B, motionEvent);
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                WebViewActivityImpl.a(WebViewActivityImpl.this);
            }
            return WebViewActivityImpl.this.a(motionEvent);
        }
    }

    public WebViewActivityImpl(@NonNull Activity activity) {
        super(activity);
        this.D = -1L;
        this.f84042a = false;
        this.f84043b = false;
        this.f84044c = new AtomicBoolean(true);
        this.f84045d = false;
        this.f84046e = null;
        this.f84049h = new a.AbstractC1012a() { // from class: sg.bigo.ads.core.landing.WebViewActivityImpl.1
            @Override // sg.bigo.ads.common.e.a.AbstractC1012a
            public final void a(boolean z10) {
                if (z10) {
                    WebViewActivityImpl.this.ac();
                } else {
                    WebViewActivityImpl.this.ae();
                }
            }
        };
        this.f84050i = new b(this, (byte) 0);
        Intent intent = this.L.getIntent();
        if (intent == null) {
            this.C = "";
            return;
        }
        this.C = intent.getStringExtra("url");
        this.f84045d = intent.getBooleanExtra("try_gp_inline", false);
        this.f84046e = intent.getStringExtra("gp_inline_ad_bundle");
        this.f84047f = intent.getBooleanExtra("gp_inline_real_launch", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Uri uri) {
        d dVar = new d();
        this.E = dVar;
        boolean z10 = this.f84047f;
        dVar.f81848f = z10;
        Activity activity = this.L;
        boolean zA = sg.bigo.ads.core.landing.a.a(uri, activity, activity, dVar, "", this.f84045d, this.f84046e, z10);
        d dVar2 = this.E;
        if ((dVar2.f81844b == 0 && dVar2.f81845c == 0 && dVar2.f81846d < 0) ? false : true) {
            a(dVar2);
        }
        return zA;
    }

    public static /* synthetic */ boolean a(WebViewActivityImpl webViewActivityImpl) {
        webViewActivityImpl.f84043b = true;
        return true;
    }

    private void c(int i10) {
        if (this.B == null || !v()) {
            d(i10);
        } else {
            this.B.goBack();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(String str) {
        return a(Uri.parse(str));
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    @CallSuper
    public void F() {
        WebView webView = this.B;
        if (webView != null) {
            sg.bigo.ads.common.e.a.b(webView, this.f84049h);
            WebView webView2 = this.B;
            if (webView2 instanceof e) {
                ((e) webView2).setOnWebViewTouchListener(null);
            } else {
                webView2.setOnTouchListener(null);
            }
            this.B.destroy();
            this.B = null;
        }
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    @CallSuper
    public void T() {
        if (TextUtils.isEmpty(this.C)) {
            sg.bigo.ads.common.t.a.a(0, "WebView", "url is null.");
            b(0);
            return;
        }
        aF();
        o(a());
        try {
            b();
        } catch (RuntimeException unused) {
        }
        s();
        if (q.a((CharSequence) this.C) || e(this.C)) {
            b(0);
        } else {
            t();
        }
    }

    public int a() {
        return R.layout.bigo_ad_activity_webview;
    }

    public void a(@IntRange(from = 0, to = 100) int i10) {
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void a(int i10, int i11, Intent intent) {
        String dataString;
        FileChooser fileChooser = this.f84048g;
        if (fileChooser != null) {
            Uri[] uriArr = (i11 != -1 || i10 != 101 || intent == null || intent.getData() == null || (dataString = intent.getDataString()) == null) ? null : new Uri[]{Uri.parse(dataString)};
            ValueCallback<Uri[]> valueCallback = fileChooser.f84041c;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(uriArr);
                fileChooser.f84041c = null;
            }
        }
    }

    public void a(int i10, String str, String str2) {
    }

    public void a(String str) {
    }

    public void a(String str, boolean z10) {
    }

    public void a(@NonNull d dVar) {
    }

    public boolean a(MotionEvent motionEvent) {
        return false;
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    @Deprecated
    public final void aG() {
        d(0);
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void ac() {
        if (this.f84044c.compareAndSet(true, false)) {
            d();
        }
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void ae() {
        if (this.f84044c.compareAndSet(false, true)) {
            e();
        }
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void ag() {
        c(1);
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void ah() {
    }

    public void b() {
        this.f84052y = (ProgressBar) p(R.id.inter_webview_progress_bar);
        this.f84051x = (TextView) p(R.id.inter_webview_title);
        this.A = (ImageView) p(R.id.inter_webview_back);
        this.f84053z = (ImageView) p(R.id.inter_webview_close);
        ImageView imageView = this.A;
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
        ImageView imageView2 = this.f84053z;
        if (imageView2 != null) {
            imageView2.setOnClickListener(this);
        }
        WebView webViewR = r();
        this.B = webViewR;
        if (webViewR != null) {
            byte b10 = 0;
            webViewR.setWebViewClient(new a(this, b10));
            this.B.setWebChromeClient(new CustomWebChromeClient(this, b10));
            u.a(this.B, (ViewGroup) p(R.id.inter_webview_container), new ViewGroup.LayoutParams(-1, -1), -1);
            WebView webView = this.B;
            if (webView instanceof e) {
                ((e) webView).setOnWebViewTouchListener(this.f84050i);
            } else {
                webView.setOnTouchListener(this.f84050i);
            }
            sg.bigo.ads.common.e.a.a(this.B, this.f84049h);
        }
    }

    public void b(int i10) {
        this.f84042a = true;
        e(i10);
        WebView webView = this.B;
        if (webView != null) {
            webView.stopLoading();
        }
        super.aG();
    }

    public void b(String str) {
        TextView textView = this.f84051x;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void c(String str) {
        sg.bigo.ads.common.t.a.a(0, 3, "WebView", "onAutoRedirectStart url= ".concat(String.valueOf(str)));
    }

    public boolean c() {
        return false;
    }

    public String d(String str) {
        return str;
    }

    @CallSuper
    public void d() {
        WebView webView = this.B;
        if (webView != null) {
            webView.onResume();
        }
    }

    public void d(int i10) {
        b(i10);
    }

    @CallSuper
    public void e() {
        WebView webView = this.B;
        if (webView != null) {
            webView.onPause();
        }
    }

    public void e(int i10) {
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void g(boolean z10) {
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof String) {
            if (tag.equals(sg.bigo.ads.common.utils.a.a(this.L, R.string.bigo_ad_tag_close, new Object[0]))) {
                d(3);
            } else if (tag.equals(sg.bigo.ads.common.utils.a.a(this.L, R.string.bigo_ad_tag_back, new Object[0]))) {
                c(2);
            }
        }
    }

    @Nullable
    public WebView r() {
        return e.a(this.L);
    }

    public void s() {
    }

    public void t() {
        WebView webView = this.B;
        if (webView != null) {
            webView.loadUrl(this.C);
        }
    }

    public boolean v() {
        WebView webView = this.B;
        return webView != null && webView.canGoBack();
    }
}
