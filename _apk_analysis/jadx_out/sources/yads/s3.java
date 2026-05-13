package yads;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes12.dex */
public final class s3 extends WebViewClient {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f94693d = {wb.a(s3.class, GAMConfig.KEY_CONTEXT, "getContext()Landroid/content/Context;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lm2 f94694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io3 f94695b = cs2.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final db3 f94696c = new db3();

    public s3(Context context) {
        this.f94694a = mm2.a(context);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        lm2 lm2Var = this.f94694a;
        KProperty kProperty = f94693d[0];
        Object obj = (Context) lm2Var.f92035a.get();
        t3 t3Var = obj instanceof t3 ? (t3) obj : null;
        if (t3Var != null) {
            ((t1) t3Var).a(8);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        lm2 lm2Var = this.f94694a;
        KProperty kProperty = f94693d[0];
        Object obj = (Context) lm2Var.f92035a.get();
        t3 t3Var = obj instanceof t3 ? (t3) obj : null;
        if (t3Var != null) {
            ((t1) t3Var).a(0);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (this.f94695b.a(webView.getContext(), sslError)) {
            sslErrorHandler.proceed();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r9, java.lang.String r10) {
        /*
            r8 = this;
            r0 = 0
            if (r10 == 0) goto L5a
            int r1 = r10.length()
            if (r1 <= 0) goto L5a
            int r1 = r10.length()
            if (r1 != 0) goto L10
            goto L4a
        L10:
            kotlin.text.Regex r1 = new kotlin.text.Regex
            java.lang.String r2 = "http(s?)://"
            r1.<init>(r2)
            java.lang.String r2 = ""
            java.lang.String r1 = r1.replaceFirst(r10, r2)
            yads.za3 r2 = yads.ab3.f87637c
            r2.getClass()
            r2 = 4
            yads.ab3[] r3 = new yads.ab3[r2]
            yads.ab3 r4 = yads.ab3.f87638d
            r3[r0] = r4
            yads.ab3 r4 = yads.ab3.f87639e
            r5 = 1
            r3[r5] = r4
            yads.ab3 r4 = yads.ab3.f87640f
            r5 = 2
            r3[r5] = r4
            yads.ab3 r4 = yads.ab3.f87641g
            r6 = 3
            r3[r6] = r4
            r4 = r0
        L39:
            if (r4 >= r2) goto L4a
            r6 = r3[r4]
            java.lang.String r6 = r6.f87643b
            r7 = 0
            boolean r6 = bo.a0.W(r1, r6, r0, r5, r7)
            if (r6 == 0) goto L47
            goto L50
        L47:
            int r4 = r4 + 1
            goto L39
        L4a:
            boolean r1 = android.webkit.URLUtil.isNetworkUrl(r10)
            if (r1 != 0) goto L5a
        L50:
            yads.db3 r0 = r8.f94696c
            android.content.Context r9 = r9.getContext()
            boolean r0 = r0.a(r9, r10)
        L5a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.s3.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }
}
