package com.mbridge.msdk.config.component.wei;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebView;
import androidx.annotation.RequiresApi;
import com.ironsource.C3978d4;
import com.mbridge.msdk.config.component.base.d;
import com.mbridge.msdk.config.dynamic.baseview.webview.ComponentWebView;
import com.mbridge.msdk.config.dynamic.utils.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.events.RedirectEvent;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(api = 23)
public class WeiCpt extends com.mbridge.msdk.config.component.base.a implements d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ComponentWebView f36430m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f36431n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f36432o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.mbridge.msdk.config.component.wei.monitor.b f36433p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public com.mbridge.msdk.config.component.wei.monitor.a f36434q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public WebMessagePort f36435r;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f36425h = "1100001";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f36426i = "1100002";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f36427j = "1100003";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f36428k = "1100004";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f36429l = "SenderPortKey_";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public HashMap<String, WebMessagePort> f36436s = new HashMap<>();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ConcurrentLinkedQueue<com.mbridge.msdk.config.component.wei.model.a> f36437t = new ConcurrentLinkedQueue<>();

    public class a implements com.mbridge.msdk.config.dynamic.baseview.webview.listener.a {
        public a() {
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.a
        public void onPageFinished(WebView webView, String str) {
            WeiCpt.this.a(webView);
            WeiCpt weiCpt = WeiCpt.this;
            if (weiCpt.f36431n || weiCpt.f36432o) {
                return;
            }
            weiCpt.f36432o = true;
            weiCpt.a(weiCpt.a("905003", new HashMap()));
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.a
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            WeiCpt.this.f36434q.b(webView);
            WeiCpt.this.f36434q.a(webView);
            WeiCpt weiCpt = WeiCpt.this;
            weiCpt.a(weiCpt.a("905002", new HashMap()));
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.a
        public void onProgressChanged(WebView webView, int i10) {
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.a
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            WeiCpt weiCpt = WeiCpt.this;
            if (weiCpt.f36432o || weiCpt.f36431n) {
                return;
            }
            weiCpt.f36431n = true;
            weiCpt.a("905004", String.valueOf(i10), str);
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.a
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.a
        public void onRenderProcessGone(WebView webView) {
            WeiCpt.this.a("905005", "1100003", "WebView did crash");
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.a
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            HashMap map = new HashMap();
            map.put("action", RedirectEvent.f52809b);
            HashMap map2 = new HashMap();
            map2.put("url", str);
            map.put("data", map2);
            HashMap map3 = new HashMap();
            map3.put("js_interaction", map);
            WeiCpt weiCpt = WeiCpt.this;
            weiCpt.a(weiCpt.a("905006", map3));
            return false;
        }
    }

    public class b extends WebMessagePort.WebMessageCallback {
        public b() {
        }

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            WeiCpt.this.a(webMessage);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WebMessagePort f36440a;

        public c(WebMessagePort webMessagePort) {
            this.f36440a = webMessagePort;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f36440a.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(api = 23)
    public void a(WebView webView) {
        WebMessagePort[] webMessagePortArrCreateWebMessageChannel = webView.createWebMessageChannel();
        this.f36435r = webMessagePortArrCreateWebMessageChannel[0];
        webView.postWebMessage(new WebMessage("port_ready", new WebMessagePort[]{webMessagePortArrCreateWebMessageChannel[1]}), Uri.EMPTY);
        this.f36435r.setWebMessageCallback(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.mbridge.msdk.config.component.wei.model.a aVar) {
        if (!TextUtils.isEmpty(aVar.b())) {
            String strB = aVar.b();
            strB.hashCode();
            switch (strB) {
                case "forward":
                    if (this.f36430m.canGoForward()) {
                        this.f36430m.goForward();
                        break;
                    }
                    break;
                case "hide":
                    this.f36430m.setVisibility(8);
                    break;
                case "load":
                    c(aVar);
                    b(aVar);
                    break;
                case "show":
                    if (this.f36430m.getVisibility() != 0) {
                        this.f36430m.setVisibility(0);
                        break;
                    }
                    break;
                case "close":
                    if (this.f36430m.getParent() != null && (this.f36430m.getParent() instanceof ViewGroup)) {
                        ((ViewGroup) this.f36430m.getParent()).removeView(this.f36430m);
                        break;
                    }
                    break;
                case "evaluate_js":
                    String strA = com.mbridge.msdk.config.dynamic.baseview.webview.util.a.a(aVar.c());
                    if (!TextUtils.isEmpty(strA)) {
                        d(strA);
                        break;
                    }
                    break;
                case "refresh":
                    this.f36430m.reload();
                    break;
                case "backward":
                    if (this.f36430m.canGoBack()) {
                        this.f36430m.goBack();
                        break;
                    }
                    break;
            }
        }
        if (aVar.e() == null || aVar.e().isEmpty()) {
            return;
        }
        a(this.f36430m, aVar.e());
    }

    private void b(com.mbridge.msdk.config.component.wei.model.a aVar) {
        if (TextUtils.isEmpty(aVar.g()) && TextUtils.isEmpty(aVar.d())) {
            if (this.f36430m.hasXmlUrl()) {
                this.f36430m.loadXMLUrl();
                return;
            } else {
                a("905004", "1100001", "Input parameter error");
                return;
            }
        }
        if (TextUtils.isEmpty(aVar.g())) {
            if (TextUtils.isEmpty(aVar.d())) {
                return;
            }
            MintegralNetworkBridge.webviewLoadDataWithBaseURL(this.f36430m, "", aVar.d(), "text/html", "UTF-8", null);
        } else {
            String strF = aVar.f();
            if (TextUtils.isEmpty(strF)) {
                MintegralNetworkBridge.webviewLoadUrl(this.f36430m, aVar.g());
            } else {
                MintegralNetworkBridge.webviewLoadUrl(this.f36430m, strF);
            }
        }
    }

    private void c(com.mbridge.msdk.config.component.wei.model.a aVar) {
        this.f36434q = new com.mbridge.msdk.config.component.wei.monitor.a();
        this.f36433p = new com.mbridge.msdk.config.component.wei.monitor.b(aVar.a());
        this.f36430m.setWebViewEventListener(new a());
        if (aVar.i()) {
            this.f36433p.a(this.f36430m);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(String str) {
    }

    public void a(WebMessage webMessage) {
        if (webMessage == null) {
            return;
        }
        String data = webMessage.getData();
        if (TextUtils.isEmpty(data)) {
            return;
        }
        try {
            Map<String, Object> mapA = new e().a(data);
            String strValueOf = String.valueOf(mapA.get("action"));
            String str = "SenderPortKey_" + System.currentTimeMillis() + "_" + strValueOf;
            WebMessagePort[] ports = webMessage.getPorts();
            if (ports != null && ports.length > 0) {
                this.f36436s.put(str, ports[0]);
            }
            Map<String, Object> map = new HashMap<>();
            map.put(C3978d4.i.K, this.f36430m);
            map.put("superview", this.f36430m.getParent());
            HashMap map2 = new HashMap();
            map2.put("action", strValueOf);
            map2.put("reply_name", str);
            Object obj = mapA.get("data");
            if (obj == null) {
                obj = "";
            }
            map2.put("data", obj);
            map2.put("type", "mv");
            map.put("js_interaction", map2);
            map.put("click_x", String.valueOf(this.f36430m.getxInScreen()));
            map.put("click_y", String.valueOf(this.f36430m.getyInScreen()));
            map.put("click_time", String.valueOf(this.f36430m.getClickTimeStamp()));
            a(a("905006", map));
        } catch (Throwable th2) {
            q0.b("WebViewComponent", th2.getMessage(), th2);
        }
    }

    @RequiresApi(api = 23)
    public void a(WebView webView, List<Map<String, Object>> list) {
        WebMessagePort webMessagePort;
        for (Map<String, Object> map : list) {
            try {
                String strValueOf = String.valueOf(map.get("action"));
                WebMessage webMessage = new WebMessage(new JSONObject(com.mbridge.msdk.config.component.common.util.c.a(map)).toString());
                if (this.f36436s.containsKey(strValueOf) && (webMessagePort = this.f36436s.get(strValueOf)) != null) {
                    webMessagePort.postMessage(webMessage);
                    this.f36436s.remove(strValueOf);
                    this.f36430m.postDelayed(new c(webMessagePort), 3000L);
                    return;
                } else {
                    WebMessagePort webMessagePort2 = this.f36435r;
                    if (webMessagePort2 != null) {
                        webMessagePort2.postMessage(webMessage);
                    } else {
                        webView.postWebMessage(webMessage, Uri.EMPTY);
                    }
                }
            } catch (Throwable th2) {
                q0.b("WebViewComponent", th2.getMessage(), th2);
            }
        }
    }

    @Override // com.mbridge.msdk.config.component.base.d
    public boolean a(Map<?, ?> map) {
        String str;
        String strValueOf;
        if (map != null && !map.isEmpty()) {
            try {
                Object obj = this.f35751a.get("componentConfig");
                str = "";
                if (obj instanceof Map) {
                    Object obj2 = ((Map) obj).get("url");
                    Object obj3 = ((Map) obj).get("html_code");
                    String strValueOf2 = obj2 instanceof String ? String.valueOf(obj2) : "";
                    strValueOf = obj3 instanceof String ? String.valueOf(obj3) : "";
                    str = strValueOf2;
                } else {
                    strValueOf = "";
                }
                Object obj4 = map.get("componentConfig");
                if (obj4 instanceof Map) {
                    Object obj5 = ((Map) obj4).get("url");
                    Object obj6 = ((Map) obj4).get("html_code");
                    if (obj5 instanceof String) {
                        String str2 = (String) obj5;
                        if (!TextUtils.isEmpty(str2)) {
                            return str2.equals(str);
                        }
                    }
                    if (obj6 instanceof String) {
                        String str3 = (String) obj6;
                        return !TextUtils.isEmpty(str3) && str3.hashCode() == strValueOf.hashCode();
                    }
                }
            } catch (Throwable th2) {
                q0.b("WebViewComponent", th2.getMessage(), th2);
            }
        }
        return false;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public synchronized void b(Map<String, Object> map) {
        this.f35756f = "905001";
        com.mbridge.msdk.config.component.wei.model.a aVar = new com.mbridge.msdk.config.component.wei.model.a(map);
        this.f36437t.add(aVar);
        ViewGroup viewGroupE = e();
        if (viewGroupE == null) {
            return;
        }
        if (TextUtils.isEmpty(aVar.h())) {
            this.f36430m = (ComponentWebView) com.mbridge.msdk.config.dynamic.utils.d.a(viewGroupE, ComponentWebView.class);
        } else {
            View viewFindViewWithTag = viewGroupE.findViewWithTag(aVar.h());
            if (viewFindViewWithTag instanceof WebView) {
                this.f36430m = (ComponentWebView) viewFindViewWithTag;
            }
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        if (this.f36430m != null) {
            while (!this.f36437t.isEmpty()) {
                final com.mbridge.msdk.config.component.wei.model.a aVarPoll = this.f36437t.poll();
                if (aVarPoll != null) {
                    com.mbridge.msdk.foundation.same.threadpool.a.c().post(new Runnable() { // from class: com.mbridge.msdk.config.component.wei.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f36442b.a(aVarPoll);
                        }
                    });
                }
            }
        }
    }

    public void d(String str) {
        try {
            ComponentWebView componentWebView = this.f36430m;
            if (componentWebView == null || componentWebView.isDestroyed()) {
                return;
            }
            this.f36430m.evaluateJavascript(str, new ValueCallback() { // from class: com.mbridge.msdk.config.component.wei.a
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    WeiCpt.c((String) obj);
                }
            });
        } catch (Throwable th2) {
            q0.b("WebViewComponent", th2.getMessage());
        }
    }
}
