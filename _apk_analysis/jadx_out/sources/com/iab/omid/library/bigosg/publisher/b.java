package com.iab.omid.library.bigosg.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.bigosg.adsession.AdSessionContext;
import com.iab.omid.library.bigosg.adsession.VerificationScriptResource;
import com.iab.omid.library.bigosg.b.e;
import com.iab.omid.library.bigosg.d.d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebView f24080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f24081b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, VerificationScriptResource> f24082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f24083d;

    public b(Map<String, VerificationScriptResource> map, String str) {
        this.f24082c = map;
        this.f24083d = str;
    }

    @Override // com.iab.omid.library.bigosg.publisher.AdSessionStatePublisher
    public void a() {
        super.a();
        j();
    }

    @Override // com.iab.omid.library.bigosg.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.bigosg.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            com.iab.omid.library.bigosg.d.b.a(jSONObject, str, injectedResourcesMap.get(str));
        }
        a(aVar, adSessionContext, jSONObject);
    }

    @Override // com.iab.omid.library.bigosg.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new Runnable() { // from class: com.iab.omid.library.bigosg.publisher.b.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private WebView f24085b;

            {
                this.f24085b = b.this.f24080a;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f24085b.destroy();
            }
        }, Math.max(4000 - (this.f24081b == null ? 4000L : TimeUnit.MILLISECONDS.convert(d.a() - this.f24081b.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f24080a = null;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void j() {
        WebView webView = new WebView(com.iab.omid.library.bigosg.b.d.a().b());
        this.f24080a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        a(this.f24080a);
        e.a().a(this.f24080a, this.f24083d);
        for (String str : this.f24082c.keySet()) {
            e.a().a(this.f24080a, this.f24082c.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f24081b = Long.valueOf(d.a());
    }
}
