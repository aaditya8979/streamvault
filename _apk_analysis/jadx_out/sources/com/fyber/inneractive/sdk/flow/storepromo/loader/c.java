package com.fyber.inneractive.sdk.flow.storepromo.loader;

import com.safedk.android.internal.partials.DTExchangeNetworkBridge;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f16564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f16565b;

    public c(d dVar, String str) {
        this.f16565b = dVar;
        this.f16564a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = this.f16565b.f16566a;
        String str = this.f16564a;
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar = fVar.f16569a;
        if (aVar != null) {
            try {
                DTExchangeNetworkBridge.webviewLoadDataWithBaseURL(aVar, null, str, "text/html", "UTF-8", null);
            } catch (Throwable th2) {
                if (fVar.f16573e != null) {
                    fVar.f16573e.a(com.fyber.inneractive.sdk.network.events.b.WEB_VIEW_CRASH_ERROR, "Unable to load data: " + th2.getMessage(), "");
                }
            }
        }
    }
}
