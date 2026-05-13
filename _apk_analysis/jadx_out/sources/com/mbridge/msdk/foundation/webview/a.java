package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.mbridge.msdk.activity.MBCommonActivity;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.out.BaseTrackingListener;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;

/* JADX INFO: compiled from: BackPointBrowserViewListener.java */
/* JADX INFO: loaded from: classes8.dex */
public class a implements BrowserView.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static String f38244o = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f38245a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f38247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f38248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BaseTrackingListener f38249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private BrowserView f38250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CampaignEx f38251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.click.a f38252h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Context f38253i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private JumpLoaderResult f38255k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f38258n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f38246b = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f38256l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Runnable f38257m = new RunnableC0453a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Handler f38254j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.webview.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BackPointBrowserViewListener.java */
    public class RunnableC0453a implements Runnable {
        public RunnableC0453a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q0.b(a.f38244o, "webview js！超时上限：" + a.this.f38245a + "ms");
            if (a.this.f38252h != null && a.this.f38255k != null) {
                a.this.f38255k.setSuccess(false);
                a.this.f38255k.setUrl(a.this.f38247c);
                a.this.f38255k.setType(2);
                a.this.f38255k.setExceptionMsg("linktype 8 time out");
                a.this.f38252h.a(a.this.f38255k, a.this.f38251g, 1, false);
            }
            a aVar = a.this;
            if (aVar.b(null, aVar.f38247c) && !a.this.f38256l) {
                a.this.f38256l = true;
                a aVar2 = a.this;
                aVar2.a(aVar2.f38253i, a.this.f38247c, a.this.f38251g);
            }
            if (a.this.f38249e != null) {
                a.this.f38249e.onFinishRedirection(a.this.f38251g, a.this.f38247c);
            }
        }
    }

    /* JADX INFO: compiled from: BackPointBrowserViewListener.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f38260a;

        public b(String str) {
            this.f38260a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f38252h != null && a.this.f38255k != null) {
                a.this.f38255k.setSuccess(true);
                a.this.f38255k.setUrl(this.f38260a);
                a.this.f38255k.setType(2);
                a.this.f38252h.a(a.this.f38255k, a.this.f38251g, 1, true);
            }
            if (a.this.f38249e != null) {
                a.this.f38249e.onFinishRedirection(a.this.f38251g, this.f38260a);
            }
        }
    }

    /* JADX INFO: compiled from: BackPointBrowserViewListener.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f38262a;

        public c(String str) {
            this.f38262a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f38249e != null) {
                a.this.f38249e.onFinishRedirection(a.this.f38251g, this.f38262a);
            }
            if (a.this.f38252h == null || a.this.f38255k == null) {
                return;
            }
            a.this.f38255k.setSuccess(true);
            a.this.f38255k.setUrl(this.f38262a);
            a.this.f38255k.setType(2);
            a.this.f38252h.a(a.this.f38255k, a.this.f38251g, 1, true);
        }
    }

    /* JADX INFO: compiled from: BackPointBrowserViewListener.java */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f38264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f38265b;

        public d(String str, String str2) {
            this.f38264a = str;
            this.f38265b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f38249e != null) {
                a.this.f38249e.onFinishRedirection(a.this.f38251g, this.f38264a);
            }
            if (a.this.f38252h == null || a.this.f38255k == null) {
                return;
            }
            a.this.f38255k.setSuccess(false);
            a.this.f38255k.setUrl(this.f38264a);
            a.this.f38255k.setType(2);
            a.this.f38255k.setExceptionMsg(this.f38265b);
            a.this.f38252h.a(a.this.f38255k, a.this.f38251g, 1, true);
        }
    }

    public a(Context context, CampaignEx campaignEx, com.mbridge.msdk.click.a aVar, BrowserView browserView, BaseTrackingListener baseTrackingListener) {
        this.f38245a = 10000;
        this.f38255k = null;
        this.f38253i = context;
        this.f38251g = campaignEx;
        this.f38250f = browserView;
        this.f38249e = baseTrackingListener;
        g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        gVarD = gVarD == null ? h.b().a() : gVarD;
        this.f38252h = aVar;
        this.f38255k = new JumpLoaderResult();
        this.f38245a = (int) gVarD.p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, CampaignEx campaignEx) {
        if (context == null) {
            return;
        }
        if (campaignEx != null) {
            campaignEx.getCurrentLocalRid();
        }
        try {
            int i10 = MBCommonActivity.f35333e;
            Intent intent = new Intent(context, (Class<?>) MBCommonActivity.class);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.mbridge.msdk.foundation.webview.b.f38267a.put(str, this.f38250f);
            if (u0.a.d(str)) {
                str = "https://play.google.com/store/apps/details?id=" + str.replace("market://details?id=", "");
            }
            intent.putExtra("url", str);
            q0.c("url", "webview url = " + str);
            intent.setFlags(805306368);
            intent.putExtra("mvcommon", campaignEx);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
        } catch (Exception unused) {
            u0.a(context, str, this.f38249e, campaignEx, new ArrayList());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(android.webkit.WebView r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r7 = "http"
            r0 = 1
            boolean r1 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> La5
            if (r1 == 0) goto La
            return r0
        La:
            android.net.Uri r1 = android.net.Uri.parse(r8)     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = r1.getScheme()     // Catch: java.lang.Throwable -> La5
            boolean r2 = r2.equals(r7)     // Catch: java.lang.Throwable -> La5
            java.lang.String r3 = "https"
            r4 = 0
            if (r2 != 0) goto L28
            java.lang.String r2 = r1.getScheme()     // Catch: java.lang.Throwable -> La5
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> La5
            if (r2 == 0) goto L26
            goto L28
        L26:
            r2 = r4
            goto L29
        L28:
            r2 = r0
        L29:
            if (r2 == 0) goto L2c
            return r0
        L2c:
            java.lang.String r1 = r1.getScheme()     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "intent"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> La5
            if (r1 == 0) goto L94
            android.content.Intent r1 = android.content.Intent.parseUri(r8, r0)     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = r1.getPackage()     // Catch: java.lang.Throwable -> L53
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L53
            if (r5 != 0) goto L5d
            android.content.Context r5 = r6.f38253i     // Catch: java.lang.Throwable -> L53
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L53
            android.content.Intent r2 = r5.getLaunchIntentForPackage(r2)     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L5d
            return r4
        L53:
            r2 = move-exception
            java.lang.String r5 = com.mbridge.msdk.foundation.webview.a.f38244o     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> La5
            com.mbridge.msdk.foundation.tools.q0.b(r5, r2)     // Catch: java.lang.Throwable -> La5
        L5d:
            java.lang.String r2 = "browser_fallback_url"
            java.lang.String r1 = r1.getStringExtra(r2)     // Catch: java.lang.Throwable -> L8a
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L8a
            if (r2 != 0) goto L94
            android.net.Uri r2 = android.net.Uri.parse(r8)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r5 = r2.getScheme()     // Catch: java.lang.Throwable -> L8a
            boolean r7 = r5.equals(r7)     // Catch: java.lang.Throwable -> L8a
            if (r7 != 0) goto L84
            java.lang.String r7 = r2.getScheme()     // Catch: java.lang.Throwable -> L8a
            boolean r7 = r7.equals(r3)     // Catch: java.lang.Throwable -> L8a
            if (r7 == 0) goto L82
            goto L84
        L82:
            r7 = r4
            goto L85
        L84:
            r7 = r0
        L85:
            if (r7 == 0) goto L88
            return r0
        L88:
            r8 = r1
            goto L94
        L8a:
            r7 = move-exception
            java.lang.String r1 = com.mbridge.msdk.foundation.webview.a.f38244o     // Catch: java.lang.Throwable -> La5
            java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> La5
            com.mbridge.msdk.foundation.tools.q0.b(r1, r7)     // Catch: java.lang.Throwable -> La5
        L94:
            android.content.Context r7 = r6.f38253i     // Catch: java.lang.Throwable -> La5
            boolean r7 = com.mbridge.msdk.click.c.d(r7, r8)     // Catch: java.lang.Throwable -> La5
            if (r7 == 0) goto La4
            java.lang.String r7 = com.mbridge.msdk.foundation.webview.a.f38244o     // Catch: java.lang.Throwable -> La5
            java.lang.String r8 = "openDeepLink"
            com.mbridge.msdk.foundation.tools.q0.b(r7, r8)     // Catch: java.lang.Throwable -> La5
            return r4
        La4:
            return r0
        La5:
            r7 = move-exception
            java.lang.String r8 = com.mbridge.msdk.foundation.webview.a.f38244o
            java.lang.String r7 = r7.getMessage()
            com.mbridge.msdk.foundation.tools.q0.b(r8, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.webview.a.b(android.webkit.WebView, java.lang.String):boolean");
    }

    private void c() {
        this.f38254j.removeCallbacks(this.f38257m);
    }

    private boolean c(WebView webView, String str) {
        String str2;
        try {
        } catch (Throwable th2) {
            q0.b(f38244o, th2.getMessage());
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
                q0.b(f38244o, th3.getMessage());
            }
            if (!TextUtils.isEmpty(str2) && this.f38253i.getPackageManager().getLaunchIntentForPackage(str2) != null) {
                uri2.setFlags(268435456);
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.f38253i, uri2);
                this.f38256l = true;
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
                q0.b(f38244o, th4.getMessage());
            }
            q0.b(f38244o, th2.getMessage());
            return false;
        }
        if (!com.mbridge.msdk.click.c.d(this.f38253i, str)) {
            return false;
        }
        q0.b(f38244o, "openDeepLink");
        this.f38256l = true;
        return true;
    }

    private void d() {
        this.f38254j.postDelayed(this.f38257m, this.f38245a);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(intent, com.safedk.android.utils.g.f53141o);
        context.startActivity(intent);
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void a() {
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void a(WebView webView, String str) {
        if (this.f38258n == 0) {
            this.f38258n = System.currentTimeMillis();
            if (!this.f38248d) {
                this.f38248d = true;
                d();
            }
        }
        this.f38247c = str;
        this.f38246b = true;
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void onPageFinished(WebView webView, String str) {
        q0.b(f38244o, "onPageFinished1  " + str);
        if (this.f38246b) {
            this.f38258n = 0L;
            this.f38246b = false;
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new c(str));
            if (TextUtils.isEmpty(str)) {
                return;
            }
            c();
            Uri uri = Uri.parse(str);
            if (!(uri.getScheme().equals("http") || uri.getScheme().equals("https")) || this.f38256l) {
                return;
            }
            this.f38256l = true;
            a(this.f38253i, str, this.f38251g);
        }
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (this.f38258n == 0) {
            this.f38258n = System.currentTimeMillis();
            if (!this.f38248d) {
                this.f38248d = true;
                d();
            }
            this.f38256l = false;
        }
        this.f38247c = str;
        this.f38246b = true;
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        q0.d(f38244o, str);
        c();
        com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new d(str2, str));
        if (!b(webView, str2) || this.f38256l) {
            return;
        }
        this.f38256l = true;
        a(this.f38253i, str2, this.f38251g);
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        q0.b(f38244o, "shouldOverrideUrlLoading1  " + str);
        this.f38246b = false;
        if (u0.a.b(str) && u0.a.a(this.f38253i, str, null)) {
            this.f38256l = true;
        }
        boolean zC = c(webView, str);
        if (zC) {
            this.f38258n = 0L;
            this.f38246b = false;
            c();
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new b(str));
        }
        return zC;
    }
}
