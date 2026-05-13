package com.inmobi.media;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.ii, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3489ii extends WebViewRenderProcessClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3580m9 f27357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3589mi f27358b;

    public C3489ii(InterfaceC3580m9 interfaceC3580m9, C3589mi c3589mi) {
        this.f27357a = interfaceC3580m9;
        this.f27358b = c3589mi;
    }

    public final void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        Gh gh2;
        tn.p.k(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        InterfaceC3580m9 interfaceC3580m9 = this.f27357a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("RenderViewRenderProcessClient", "onRenderProcessResponsive " + webView + com.ironsource.Z7.f30794r + webViewRenderProcess);
        }
        C3589mi c3589mi = this.f27358b;
        if (c3589mi != null) {
            Map mapA = c3589mi.a();
            mapA.put("creativeId", c3589mi.f27631a.f27236g);
            int i10 = c3589mi.f27635e + 1;
            c3589mi.f27635e = i10;
            mapA.put("count", Integer.valueOf(i10));
            String strA = c3589mi.a("RenderProcessResponsive");
            Wj wj2 = Wj.f26549a;
            Wj.b(strA, mapA, EnumC3287ak.f26805a);
        }
        InterfaceC3580m9 interfaceC3580m92 = this.f27357a;
        if (interfaceC3580m92 == null || (gh2 = ((C3605n9) interfaceC3580m92).f27675a) == null) {
            return;
        }
        gh2.a();
    }

    public final void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        Gh gh2;
        tn.p.k(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        InterfaceC3580m9 interfaceC3580m9 = this.f27357a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("RenderViewRenderProcessClient", "onRenderProcessUnresponsive " + webView + com.ironsource.Z7.f30794r + webViewRenderProcess);
        }
        C3589mi c3589mi = this.f27358b;
        if (c3589mi != null) {
            Map mapA = c3589mi.a();
            mapA.put("creativeId", c3589mi.f27631a.f27236g);
            int i10 = c3589mi.f27634d + 1;
            c3589mi.f27634d = i10;
            mapA.put("count", Integer.valueOf(i10));
            String strA = c3589mi.a("RenderProcessUnResponsive");
            Wj wj2 = Wj.f26549a;
            Wj.b(strA, mapA, EnumC3287ak.f26805a);
        }
        InterfaceC3580m9 interfaceC3580m92 = this.f27357a;
        if (interfaceC3580m92 == null || (gh2 = ((C3605n9) interfaceC3580m92).f27675a) == null) {
            return;
        }
        gh2.a();
    }
}
