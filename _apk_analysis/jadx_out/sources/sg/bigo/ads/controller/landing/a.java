package sg.bigo.ads.controller.landing;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.SystemClock;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.ironsource.Z7;
import sg.bigo.ads.a.a;
import sg.bigo.ads.api.core.b;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.api.core.b f83424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final b.InterfaceC1008b f83425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f83426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f83427d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f83428e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public sg.bigo.ads.core.h.e f83429f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f83430g;

    /* JADX INFO: renamed from: sg.bigo.ads.controller.landing.a$a, reason: collision with other inner class name */
    public interface InterfaceC1039a {
        void a(String str);

        void a(String str, long j10, boolean z10, int i10);
    }

    public a(@NonNull sg.bigo.ads.api.core.b bVar) {
        this.f83424a = bVar;
        b.InterfaceC1008b interfaceC1008bN = bVar.N();
        this.f83425b = interfaceC1008bN;
        this.f83426c = interfaceC1008bN.f();
    }

    public static /* synthetic */ void a(a aVar, Context context, final String str, int i10, final InterfaceC1039a interfaceC1039a) {
        if (i10 == 0) {
            aVar.a(context, str, interfaceC1039a);
            return;
        }
        if (i10 != 2) {
            sg.bigo.ads.common.t.a.a(0, "Preload", "PreloadLand: error open type.");
            return;
        }
        aVar.f83430g = SystemClock.elapsedRealtime();
        a.C0956a c0956a = new a.C0956a();
        c0956a.f79752a = str;
        sg.bigo.ads.a.a aVarA = c0956a.a();
        sg.bigo.ads.a.c.a(context, aVarA.f79745a, new a.b() { // from class: sg.bigo.ads.controller.landing.a.1
            @Override // sg.bigo.ads.a.a.b
            public final void a(Context context2, String str2, final int i11, String str3) {
                sg.bigo.ads.common.t.a.a(0, 3, "Preload", "Preload by chrome tabs failed, using webView.");
                a.this.a(context2, str2, new InterfaceC1039a() { // from class: sg.bigo.ads.controller.landing.a.1.1
                    @Override // sg.bigo.ads.controller.landing.a.InterfaceC1039a
                    public final void a(String str4) {
                        InterfaceC1039a interfaceC1039a2 = interfaceC1039a;
                        if (interfaceC1039a2 != null) {
                            interfaceC1039a2.a(str4);
                        }
                    }

                    @Override // sg.bigo.ads.controller.landing.a.InterfaceC1039a
                    public final void a(String str4, long j10, boolean z10, int i12) {
                        InterfaceC1039a interfaceC1039a2 = interfaceC1039a;
                        if (interfaceC1039a2 != null) {
                            interfaceC1039a2.a(str4, j10, z10, e.a(i11));
                        }
                    }
                });
            }

            @Override // sg.bigo.ads.a.a.b
            public final void a(String str2, String str3, String str4) {
                InterfaceC1039a interfaceC1039a2 = interfaceC1039a;
                if (interfaceC1039a2 != null) {
                    interfaceC1039a2.a(str, SystemClock.elapsedRealtime() - a.this.f83430g, true, 2);
                }
            }
        });
    }

    public final void a() {
        sg.bigo.ads.common.t.a.a(0, 3, "Preload", "recycleLandWebView isPreloadWebViewReady=" + this.f83427d);
        sg.bigo.ads.core.h.e eVar = this.f83429f;
        if (eVar != null) {
            eVar.destroy();
            this.f83429f = null;
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void a(Context context, final String str, @NonNull final InterfaceC1039a interfaceC1039a) {
        this.f83430g = SystemClock.elapsedRealtime();
        interfaceC1039a.a(str);
        sg.bigo.ads.core.h.e eVarA = sg.bigo.ads.core.h.e.a(context);
        this.f83429f = eVarA;
        if (eVarA == null) {
            return;
        }
        eVarA.setWebChromeClient(new sg.bigo.ads.core.h.c());
        this.f83429f.setWebViewClient(new sg.bigo.ads.core.h.d() { // from class: sg.bigo.ads.controller.landing.a.2
            @Override // sg.bigo.ads.core.h.d
            public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
                a.this.f83429f = null;
                interfaceC1039a.a(str, SystemClock.elapsedRealtime() - a.this.f83430g, false, 0);
            }

            @Override // sg.bigo.ads.core.h.d, android.webkit.WebViewClient
            public final void onPageFinished(WebView webView, String str2) {
                super.onPageFinished(webView, str2);
                sg.bigo.ads.common.t.a.a(0, 3, "Preload", "onPageFinished: url=" + webView.getUrl());
                interfaceC1039a.a(str2, SystemClock.elapsedRealtime() - a.this.f83430g, true, 0);
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView, int i10, String str2, String str3) {
                super.onReceivedError(webView, i10, str2, str3);
                sg.bigo.ads.common.t.a.b("Preload", "onReceivedError: " + i10 + Z7.f30794r + str2);
                interfaceC1039a.a(str, SystemClock.elapsedRealtime() - a.this.f83430g, false, 0);
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
        });
        this.f83429f.setLeft(0);
        this.f83429f.setTop(0);
        this.f83429f.setRight(sg.bigo.ads.common.utils.e.b(context));
        this.f83429f.setBottom(sg.bigo.ads.common.utils.e.c(context) - sg.bigo.ads.common.utils.e.a(context, 55));
        this.f83429f.loadUrl(str);
    }

    public final boolean b() {
        int i10 = this.f83426c;
        return i10 == 3 || i10 == 4;
    }
}
