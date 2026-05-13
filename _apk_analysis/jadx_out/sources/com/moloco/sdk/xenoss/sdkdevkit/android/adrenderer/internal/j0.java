package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.webkit.WebView;
import com.ironsource.G5;
import com.safedk.android.internal.partials.MolocoAdsNetworkBridge;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 {
    public static final void a(@NotNull WebView webView, @NotNull String str) {
        tn.p.k(webView, "<this>");
        tn.p.k(str, "data");
        MolocoAdsNetworkBridge.webviewLoadDataWithBaseURL(webView, "https://appassets.androidplatform.net", str, "text/html", G5.N, null);
    }
}
