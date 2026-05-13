package sg.bigo.ads.core.g.a;

import android.content.Context;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.internal.SafeDKWebAppInterface;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.core.t;
import sg.bigo.ads.common.i;
import sg.bigo.ads.common.n.d;
import sg.bigo.ads.core.g.e;
import sg.bigo.ads.core.g.f;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends sg.bigo.ads.core.h.b implements sg.bigo.ads.core.g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public e f83985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public a f83986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f83987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t f83988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.common.ac.a f83989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AtomicBoolean f83990f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f83991k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final f f83992l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f83993m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f83994n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f83995o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f83996p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    private final i f83997q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final AtomicBoolean f83998r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f83999s;

    public interface a {
        void a();
    }

    public b(Context context, String str, int i10, int i11, @NonNull f fVar, @Nullable String str2, int i12, t tVar) {
        super(context);
        this.f83997q = new i();
        this.f83990f = new AtomicBoolean(false);
        this.f83999s = true;
        this.f83991k = str;
        this.f83995o = i10;
        this.f83996p = i11;
        this.f83992l = fVar;
        this.f83993m = str2;
        this.f83994n = i12;
        this.f83988d = tVar;
        this.f83998r = new AtomicBoolean(false);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setMediaPlaybackRequiresUserGesture(true);
        setScrollContainer(false);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setBackgroundColor(0);
        this.f83989e = new sg.bigo.ads.common.ac.a(getContext());
        setOnTouchListener(new View.OnTouchListener() { // from class: sg.bigo.ads.core.g.a.b.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                b.this.f83990f.set(false);
                b.this.f83989e.onTouchEvent(motionEvent);
                return false;
            }
        });
        setWebViewClient(new c(str) { // from class: sg.bigo.ads.core.g.a.b.2
            @Override // sg.bigo.ads.core.g.a.c, sg.bigo.ads.core.h.d
            public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
                b bVar = b.this;
                sg.bigo.ads.common.t.a.a(0, "VPAIDWebView", (renderProcessGoneDetail == null || !renderProcessGoneDetail.didCrash()) ? "Render process is gone" : "Render process has crashed");
                a aVar = bVar.f83986b;
                if (aVar != null) {
                    aVar.a();
                }
            }

            @Override // sg.bigo.ads.core.h.d, android.webkit.WebViewClient
            public final void onPageFinished(@NonNull WebView webView, @NonNull String str3) {
                super.onPageFinished(webView, str3);
                sg.bigo.ads.common.t.a.a(0, "VPAIDWebView", "onPageFinished: ".concat(String.valueOf(str3)));
                if (b.this.f83998r.compareAndSet(false, true)) {
                    final b bVar = b.this;
                    final ValueCallback<String> valueCallback = new ValueCallback<String>() { // from class: sg.bigo.ads.core.g.a.b.2.1
                        @Override // android.webkit.ValueCallback
                        public final /* synthetic */ void onReceiveValue(String str4) {
                            String str5 = str4;
                            b.this.f83988d.b(1);
                            b.this.f83988d.f81911a = str5 != null ? str5 : "";
                            StringBuilder sb2 = new StringBuilder("handshakeVersion: ");
                            if (str5 == null) {
                                str5 = "";
                            }
                            sb2.append(str5);
                            sg.bigo.ads.common.t.a.a(0, 3, "VPAIDWebView", sb2.toString());
                        }
                    };
                    bVar.f83988d.a(1);
                    bVar.evaluateJavascript("window.vpaidwrapper.handshakeVersion('2.0')", new ValueCallback<String>() { // from class: sg.bigo.ads.core.g.a.b.6
                        @Override // android.webkit.ValueCallback
                        public final /* bridge */ /* synthetic */ void onReceiveValue(String str4) {
                            valueCallback.onReceiveValue(str4);
                        }
                    });
                    b.this.b();
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(@NonNull WebView webView, int i13, @NonNull String str3, @NonNull String str4) {
                sg.bigo.ads.common.t.a.a(0, "VPAIDWebView", "Error: ".concat(String.valueOf(str3)));
                super.onReceivedError(webView, i13, str3, str4);
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
            @Override // android.webkit.WebViewClient
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean shouldOverrideUrlLoading(@androidx.annotation.NonNull android.webkit.WebView r11, java.lang.String r12) {
                /*
                    Method dump skipped, instruction units count: 1148
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.core.g.a.b.AnonymousClass2.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
            }
        });
        setWebChromeClient(new sg.bigo.ads.core.h.c() { // from class: sg.bigo.ads.core.g.a.b.3
            @Override // android.webkit.WebChromeClient
            public final boolean onConsoleMessage(@NonNull ConsoleMessage consoleMessage) {
                return super.onConsoleMessage(consoleMessage);
            }
        });
        d.a(this.f83987c);
        if (this.f83987c == null) {
            this.f83987c = new Runnable() { // from class: sg.bigo.ads.core.g.a.b.4
                @Override // java.lang.Runnable
                public final void run() {
                    if (b.this.f83985a != null) {
                        b.this.f83985a.a("vpaid prepare timeout");
                    }
                }
            };
        }
        d.a(3, this.f83987c, 15000L);
        loadDataWithBaseURL("http://127.0.0.1/", "<html lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\">\n<head>\n    <meta charset=\"UTF-8\">\n    <title>VPAID AD</title>\n    <script>\n        window.onload = function() {\n            tryToPrepareAd();\n        }\n\n        document.onreadystatechange = function() {\n            tryToPrepareAd();\n        }\n\n        function tryToPrepareAd() {\n            if (document.readyState != \"complete\") {\n                return;\n            }\n\n            if (window.vpaidwrapper && window.vpaidwrapper.isVPAIDCreativeReady()) {\n                return;\n            }\n\n            window.vpaidframe = document.getElementById(\"vpaid-iframe\");\n            if (window.vpaidframe) {\n                var fn = window.vpaidframe.contentWindow['getVPAIDAd'];\n                var vpaidDiv = document.getElementById(\"vpaid-container\");\n                var vpaidframeDoc = window.vpaidframe.contentDocument || window.vpaidframe.contentWindow.document;\n                var slot = vpaidframeDoc.getElementById(\"slot\");\n                var videoSlot = document.getElementById(\"video-slot\");\n                var vpaidwrapper;\n                if (fn && typeof fn == 'function') {\n                    vpaidwrapper = new VPAIDWrapper(fn(), vpaidDiv, slot, videoSlot)\n                } else {\n                    vpaidwrapper = new VPAIDWrapper();\n                }\n                window.vpaidwrapper = vpaidwrapper;\n            }\n        }\n    </script>\n    <script src=\"vpaid.js\" type=\"text/javascript\"></script>\n</head>\n\n<body style=\"display: flex; justify-content: center; align-items: center;\">\n<div id=\"ad-container\">\n    <video height=\"100%\" id=\"video-slot\" muted playsinline width=\"100%\"></video>\n</div>\n<div id=\"vpaid-container\"\n     style=\"position: absolute; width: 100%; height: 100%; margin: 0px; padding: 0px; border: none;\">\n    <iframe frameborder=\"0\" height=\"100%\" id=\"vpaid-iframe\" marginheight=\"0\" marginwidth=\"0\"\n            scrolling=\"no\"\n            src=\"vpaid_iframe.html\"\n            style=\"margin: 0px; padding: 0px; border: none;\"\n            width=\"100%\"></iframe>\n</div>\n</body>\n</html>", "text/html", "UTF-8", null);
        setLayoutParams((i12 == 1 || i12 == 4) ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-1, -2, 17));
    }

    private void a(int i10, int i11) {
        t tVar = this.f83988d;
        if (tVar == null || !tVar.f81920j) {
            return;
        }
        a("window.vpaidwrapper.resizeAd(" + sg.bigo.ads.common.utils.e.c(getContext(), i10) + ", " + sg.bigo.ads.common.utils.e.c(getContext(), i11) + ", " + JSONObject.quote(this.f83992l.f84015d) + ")");
    }

    @Nullable
    private String b(@NonNull String str) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final String[] strArr = new String[1];
        evaluateJavascript(str, new ValueCallback<String>() { // from class: sg.bigo.ads.core.g.a.b.5
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(String str2) {
                countDownLatch.countDown();
                strArr[0] = str2;
            }
        });
        try {
            countDownLatch.await(1L, TimeUnit.SECONDS);
        } catch (Exception unused) {
        }
        return strArr[0];
    }

    private void b(int i10, int i11) {
        setMeasuredDimension(i10, i11);
        a(i10, i11);
    }

    @Override // sg.bigo.ads.api.c.a
    public final void a() {
        a("window.vpaidwrapper.pauseAd()");
    }

    public final void a(@NonNull String str) {
        if (!this.f83998r.get()) {
            sg.bigo.ads.common.t.a.a(0, "VPAIDWebView", "Injecting Javascript into VPAID WebView error, creative no ready:\n\t".concat(String.valueOf(str)));
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "VPAIDWebView", "Injecting Javascript into VPAID WebView:\n\t".concat(String.valueOf(str)));
            loadUrl(SafeDKWebAppInterface.f52902f.concat(String.valueOf(str)));
        }
    }

    public final void b() {
        a("tryToPrepareAd()");
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f83993m;
            if (str == null) {
                str = "";
            }
            jSONObject.putOpt(VastTagName.AD_PARAMETERS, str);
        } catch (JSONException unused) {
        }
        this.f83988d.a(2);
        a("window.vpaidwrapper.initAd(" + sg.bigo.ads.common.utils.e.c(getContext(), measuredWidth) + ", " + sg.bigo.ads.common.utils.e.c(getContext(), measuredHeight) + ", " + JSONObject.quote(this.f83992l.f84015d) + ", -1, " + jSONObject + ")");
    }

    @Override // sg.bigo.ads.core.h.e, android.webkit.WebView
    public final void destroy() {
        super.destroy();
        setWebChromeClient(null);
        setWebViewClient(null);
    }

    @Override // sg.bigo.ads.core.h.e, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            this.f83997q.f82224b = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f83997q.f82223a = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        return this.f83999s && super.dispatchTouchEvent(motionEvent);
    }

    public final String getAdCompanions() {
        return b("window.vpaidwrapper.getAdCompanions()");
    }

    public final int getAdDuration() {
        return (int) sg.bigo.ads.core.g.d.b(b("window.vpaidwrapper.getAdDuration()"));
    }

    public final boolean getAdExpanded() {
        return sg.bigo.ads.core.g.d.c(b("window.vpaidwrapper.getAdExpanded()"));
    }

    public final int getAdHeight() {
        return sg.bigo.ads.core.g.d.a(b("window.vpaidwrapper.getAdHeight()"));
    }

    public final boolean getAdIcons() {
        return sg.bigo.ads.core.g.d.c(b("window.vpaidwrapper.getAdIcons()"));
    }

    public final boolean getAdLinear() {
        return sg.bigo.ads.core.g.d.c(b("window.vpaidwrapper.getAdLinear()"));
    }

    public final int getAdRemainingTime() {
        return (int) sg.bigo.ads.core.g.d.b(b("window.vpaidwrapper.getAdRemainingTime()"));
    }

    public final boolean getAdSkippableState() {
        return sg.bigo.ads.core.g.d.c(b("window.vpaidwrapper.getAdSkippableState()"));
    }

    public final float getAdVolume() {
        return sg.bigo.ads.core.g.d.b(b("window.vpaidwrapper.getAdVolume()"));
    }

    public final int getAdWidth() {
        return sg.bigo.ads.core.g.d.a(b("window.vpaidwrapper.getAdWidth()"));
    }

    @NonNull
    public final i getClickPoints() {
        return this.f83997q;
    }

    @Nullable
    public final e getVPAIDEvenListener() {
        return this.f83985a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
    
        if (r0 != 4) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac A[PHI: r0 r3
      0x00ac: PHI (r0v10 int) = (r0v9 int), (r0v11 int) binds: [B:36:0x00aa, B:33:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r3v6 int) = (r3v5 int), (r3v8 int) binds: [B:36:0x00aa, B:33:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.core.g.a.b.onMeasure(int, int):void");
    }

    public final void setAdVolume(float f10) {
        a("window.vpaidwrapper.setAdVolume(" + f10 + ")");
    }

    public final void setOnRenderProcessGoneListener(@Nullable a aVar) {
        this.f83986b = aVar;
    }

    public final void setVPAIDClickable(boolean z10) {
        this.f83999s = z10;
    }

    public final void setVPAIDEvenListener(@Nullable e eVar) {
        this.f83985a = eVar;
    }
}
