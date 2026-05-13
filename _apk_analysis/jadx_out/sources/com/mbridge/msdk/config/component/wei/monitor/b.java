package com.mbridge.msdk.config.component.wei.monitor;

import android.webkit.WebView;
import com.iab.omid.library.mmadbridge.adsession.AdSession;

/* JADX INFO: compiled from: OMSDKWebMonitor.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AdSession f36454a;

    public b(AdSession adSession) {
        this.f36454a = adSession;
    }

    public void a(WebView webView) {
        this.f36454a.registerAdView(webView);
    }
}
