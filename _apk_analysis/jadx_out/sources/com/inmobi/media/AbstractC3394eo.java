package com.inmobi.media;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.vungle.ads.internal.ui.AdActivity;
import java.net.URLDecoder;

/* JADX INFO: renamed from: com.inmobi.media.eo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC3394eo {
    public static WebResourceResponse a(WebResourceRequest webResourceRequest, InterfaceC3580m9 interfaceC3580m9) {
        tn.p.k(webResourceRequest, AdActivity.REQUEST_KEY_EXTRA);
        tn.p.k(webResourceRequest, "<this>");
        if (!bo.a0.J("GET", webResourceRequest.getMethod(), true)) {
            return null;
        }
        String string = webResourceRequest.getUrl().toString();
        tn.p.j(string, "toString(...)");
        return a(string, interfaceC3580m9);
    }

    public static WebResourceResponse a(String str, InterfaceC3580m9 interfaceC3580m9) {
        String strDecode;
        tn.p.k(str, "urlRaw");
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).c("IMResourceCacheManager", "shouldInterceptRequest " + str);
        }
        try {
            strDecode = URLDecoder.decode(bo.d0.s1(str).toString(), "UTF-8");
        } catch (Exception unused) {
            strDecode = null;
        }
        if (strDecode == null) {
            return null;
        }
        tn.p.k(strDecode, "url");
        if (bo.d0.c0(strDecode, "inmobicache=true", false, 2, null)) {
            return (WebResourceResponse) p000do.h.b(null, new C3343co(strDecode, interfaceC3580m9, null), 1, null);
        }
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("IMResourceCacheManager", "Cache is not enabled for URL: " + strDecode);
        }
        return null;
    }
}
