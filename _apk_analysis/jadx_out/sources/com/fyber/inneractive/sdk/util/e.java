package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.ironsource.G5;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f19524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.web.e f19525b;

    public e(com.fyber.inneractive.sdk.web.e eVar, String str) {
        this.f19525b = eVar;
        this.f19524a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.web.e eVar = this.f19525b;
        Object obj = this.f19524a;
        eVar.getClass();
        String str = (String) obj;
        String str2 = s.a() ? "http://" : "https://";
        if (!TextUtils.isEmpty(str) && !eVar.f19606a.isTerminated() && !eVar.f19606a.isShutdown()) {
            if (TextUtils.isEmpty(eVar.f19616k)) {
                eVar.f19617l.f19645p = str2.concat("wv.inner-active.mobi/");
            } else {
                eVar.f19617l.f19645p = str2 + eVar.f19616k;
            }
            if (eVar.f19611f) {
                return;
            }
            com.fyber.inneractive.sdk.web.i iVar = eVar.f19617l;
            com.fyber.inneractive.sdk.web.m mVar = iVar.f19631b;
            if (mVar != null) {
                DTExchangeNetworkBridge.webviewLoadDataWithBaseURL(mVar, iVar.f19645p, str, "text/html", G5.N, null);
                eVar.f19617l.f19646q = str;
            } else {
                InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.COULD_NOT_LOAD_TO_WEBVIEW);
                com.fyber.inneractive.sdk.web.g gVar = iVar.f19635f;
                if (gVar != null) {
                    gVar.a(iVar, inneractiveInfrastructureError);
                }
                iVar.b(true);
            }
        } else if (!eVar.f19606a.isTerminated() && !eVar.f19606a.isShutdown()) {
            com.fyber.inneractive.sdk.web.i iVar2 = eVar.f19617l;
            InneractiveInfrastructureError inneractiveInfrastructureError2 = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.EMPTY_FINAL_HTML);
            com.fyber.inneractive.sdk.web.g gVar2 = iVar2.f19635f;
            if (gVar2 != null) {
                gVar2.a(iVar2, inneractiveInfrastructureError2);
            }
            iVar2.b(true);
        }
        eVar.f19611f = true;
        eVar.f19606a.shutdownNow();
        Handler handler = eVar.f19607b;
        if (handler != null) {
            d dVar = eVar.f19609d;
            if (dVar != null) {
                handler.removeCallbacks(dVar);
            }
            e eVar2 = eVar.f19608c;
            if (eVar2 != null) {
                eVar.f19607b.removeCallbacks(eVar2);
            }
            eVar.f19607b = null;
        }
        eVar.f19617l.f19644o = null;
    }
}
