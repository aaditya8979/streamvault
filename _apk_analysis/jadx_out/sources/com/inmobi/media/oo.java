package com.inmobi.media;

import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class oo {
    public static boolean a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail, String str) {
        tn.p.k(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        tn.p.k(str, "source");
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        Map mapO = kotlin.collections.a.o(bn.h.a("source", str), bn.h.a("isCrashed", Boolean.valueOf(renderProcessGoneDetail != null ? renderProcessGoneDetail.didCrash() : false)));
        Wj wj2 = Wj.f26549a;
        Wj.b("WebViewRenderProcessGoneEvent", mapO, EnumC3287ak.f26805a);
        webView.destroy();
        return true;
    }
}
