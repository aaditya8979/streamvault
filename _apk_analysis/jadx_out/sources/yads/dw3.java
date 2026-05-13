package yads;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class dw3 extends ka {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WebView f89011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Long f89012h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f89013i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f89014j;

    public dw3(String str, String str2, Map map) {
        super(str);
        this.f89012h = null;
        this.f89013i = map;
        this.f89014j = str2;
    }

    @Override // yads.ka
    public final void a(wv3 wv3Var, ia iaVar) {
        JSONObject jSONObject = new JSONObject();
        Map mapUnmodifiableMap = Collections.unmodifiableMap(iaVar.f90718d);
        for (String str : mapUnmodifiableMap.keySet()) {
            md3 md3Var = (md3) mapUnmodifiableMap.get(str);
            md3Var.getClass();
            JSONObject jSONObject2 = new JSONObject();
            lw3.a(jSONObject2, "vendorKey", md3Var.f92328a);
            lw3.a(jSONObject2, "resourceUrl", md3Var.f92329b.toString());
            lw3.a(jSONObject2, "verificationParameters", md3Var.f92330c);
            lw3.a(jSONObject, str, jSONObject2);
        }
        a(wv3Var, iaVar, jSONObject);
    }

    @Override // yads.ka
    public final void b() {
        this.f91524b.clear();
        new Handler().postDelayed(new zv3(this), Math.max(4000 - (this.f89012h == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f89012h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f89011g = null;
    }

    @Override // yads.ka
    public final void c() {
        WebView webView = new WebView(fx3.f89722b.f89723a);
        this.f89011g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f89011g.getSettings().setAllowContentAccess(false);
        this.f89011g.getSettings().setAllowFileAccess(false);
        this.f89011g.setWebViewClient(new yv3(this));
        this.f91524b = new hw3(this.f89011g);
        ix3.a(this.f89011g, this.f89014j);
        for (String str : this.f89013i.keySet()) {
            String externalForm = ((md3) this.f89013i.get(str)).f92329b.toExternalForm();
            WebView webView2 = this.f89011g;
            if (externalForm != null && !TextUtils.isEmpty(str)) {
                ix3.a(webView2, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", externalForm).replace("%INJECTION_ID%", str));
            }
        }
        this.f89012h = Long.valueOf(System.nanoTime());
    }
}
