package com.mbridge.msdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import com.mbridge.msdk.click.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.f1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.foundation.webview.b;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes6.dex */
public class DomainMBCommonActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f35322a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BrowserView.e f35323b = new a();
    public BrowserView browserView;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CampaignEx f35324c;

    public class a implements BrowserView.e {
        public a() {
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
        public void a() {
            DomainMBCommonActivity.this.finish();
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
        public void a(WebView webView, String str) {
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
        public void onPageFinished(WebView webView, String str) {
            q0.b("MBCommonActivity", "onPageFinished  " + str);
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            q0.b("MBCommonActivity", "onPageStarted  " + str);
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            q0.b("MBCommonActivity", "shouldOverrideUrlLoading  " + str);
            if (u0.a.b(str) && u0.a.a(DomainMBCommonActivity.this, str, null)) {
                DomainMBCommonActivity.this.finish();
            }
            return DomainMBCommonActivity.this.a(webView, str);
        }
    }

    private void a() {
        String stringExtra = getIntent().getStringExtra("url");
        this.f35322a = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            Toast.makeText(this, "Error: no data", 0).show();
            return;
        }
        this.f35324c = (CampaignEx) getIntent().getSerializableExtra("mvcommon");
        if (b.f38267a.containsKey(this.f35322a)) {
            BrowserView browserView = b.f38267a.get(this.f35322a);
            this.browserView = browserView;
            if (browserView != null) {
                browserView.setListener(this.f35323b);
            }
        } else {
            BrowserView browserView2 = new BrowserView(this, this.f35324c);
            this.browserView = browserView2;
            browserView2.setListener(this.f35323b);
            this.browserView.loadUrl(this.f35322a);
        }
        BrowserView browserView3 = this.browserView;
        if (browserView3 != null) {
            f1.a(browserView3);
            setContentView(this.browserView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(WebView webView, String str) {
        String str2;
        try {
        } catch (Throwable th2) {
            q0.b("MBCommonActivity", th2.getMessage());
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri uri = Uri.parse(str);
        if (uri.getScheme().equals("http") || uri.getScheme().equals("https")) {
            return false;
        }
        if (uri.getScheme().equals("intent") || uri.getScheme().equals("android-app")) {
            String stringExtra = null;
            Intent uri2 = uri.getScheme().equals("intent") ? Intent.parseUri(str, 1) : uri.getScheme().equals("android-app") ? Intent.parseUri(str, 2) : null;
            if (uri2 != null) {
                uri2.setComponent(null);
                uri2.setSelector(null);
            }
            if (uri2 == null) {
                str2 = "";
            } else {
                try {
                    str2 = uri2.getPackage();
                } catch (Throwable th3) {
                    q0.b("MBCommonActivity", th3.getMessage());
                }
            }
            if (!TextUtils.isEmpty(str2) && getPackageManager().getLaunchIntentForPackage(str2) != null) {
                if (uri2 != null) {
                    uri2.setFlags(268435456);
                }
                safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(this, uri2, 0);
                finish();
                return true;
            }
            if (uri2 != null) {
                try {
                    stringExtra = uri2.getStringExtra("browser_fallback_url");
                } catch (Throwable th4) {
                    q0.b("MBCommonActivity", th4.getMessage());
                }
            }
            if (!TextUtils.isEmpty(stringExtra)) {
                Uri uri3 = Uri.parse(str);
                if (uri3.getScheme().equals("http") || uri3.getScheme().equals("https")) {
                    MintegralNetworkBridge.webviewLoadUrl(webView, stringExtra);
                    return false;
                }
                str = stringExtra;
            }
            q0.b("MBCommonActivity", th2.getMessage());
            return false;
        }
        if (c.d(this, str)) {
            q0.b("MBCommonActivity", "openDeepLink");
            finish();
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return !(str.startsWith("http") || str.startsWith("https"));
    }

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity activity, Intent intent, int i10) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (intent == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(intent, g.f53141o);
        activity.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.activityOnTouch(g.f53141o, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        try {
            requestWindowFeature(1);
        } catch (Throwable th2) {
            q0.b("MBCommonActivity", th2.getMessage());
        }
        if (com.mbridge.msdk.foundation.controller.c.n().d() == null) {
            com.mbridge.msdk.foundation.controller.c.n().b(getApplicationContext());
        }
        com.mbridge.msdk.foundation.controller.c.n().a(this);
        a();
    }
}
