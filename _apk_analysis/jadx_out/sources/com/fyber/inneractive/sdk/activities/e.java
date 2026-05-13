package com.fyber.inneractive.sdk.activities;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveInternalBrowserActivity f15804a;

    public e(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f15804a = inneractiveInternalBrowserActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i10) {
        this.f15804a.setTitle("Page is Loading...");
        this.f15804a.setProgress(i10 * 100);
        if (i10 == 100) {
            this.f15804a.setTitle(webView.getUrl());
        }
    }
}
