package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: classes3.dex */
class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private s f33851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f33852b = false;

    public r(s sVar) {
        this.f33851a = sVar;
    }

    @JavascriptInterface
    public String getTokenForMessaging() {
        if (this.f33852b) {
            return "";
        }
        this.f33852b = true;
        return this.f33851a.b();
    }
}
