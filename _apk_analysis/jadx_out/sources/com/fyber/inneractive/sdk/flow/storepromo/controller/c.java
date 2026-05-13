package com.fyber.inneractive.sdk.flow.storepromo.controller;

import com.fyber.inneractive.sdk.flow.storepromo.loader.f;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements com.fyber.inneractive.sdk.flow.storepromo.loader.a, com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.a, com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.storepromo.controller.webview.b f16552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a f16553b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f16555d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.loader.a f16557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f16558g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16556e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.b f16554c = new com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.b(this);

    public c(com.fyber.inneractive.sdk.flow.storepromo.model.c cVar, com.fyber.inneractive.sdk.flow.storepromo.loader.a aVar, b bVar) {
        this.f16557f = aVar;
        this.f16558g = bVar;
        this.f16552a = new com.fyber.inneractive.sdk.flow.storepromo.controller.webview.b(this, aVar);
        this.f16555d = new f(cVar, this);
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a
    public final void a() {
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a
    public final void a(int i10, g1 g1Var) {
        if (i10 == 0) {
            b bVar = this.f16558g;
            if (bVar != null) {
                IAlog.a("StorePromoView: onClick: type: " + a.CLOSE, new Object[0]);
                bVar.a();
                return;
            }
            return;
        }
        b bVar2 = this.f16558g;
        if (bVar2 != null) {
            a aVar = a.INSTALL;
            IAlog.a("StorePromoView: onClick: type: " + aVar, new Object[0]);
            if (aVar == a.CLOSE) {
                bVar2.a();
                return;
            }
            com.fyber.inneractive.sdk.flow.storepromo.loader.b bVar3 = bVar2.f16547e;
            if (bVar3 != null) {
                bVar3.a(g1Var);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.loader.a
    public final void a(com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar, com.fyber.inneractive.sdk.flow.storepromo.model.c cVar) {
        IAlog.a("StorePromoWebViewController: onContentLoadedSuccess: content is loaded successfully", new Object[0]);
        this.f16556e = true;
        this.f16553b = aVar;
        aVar.setWebViewClient(this.f16552a);
        com.fyber.inneractive.sdk.flow.storepromo.loader.a aVar2 = this.f16557f;
        if (aVar2 != null) {
            aVar2.a(this.f16553b, cVar);
            this.f16557f = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a
    public final void a(com.fyber.inneractive.sdk.network.events.b bVar, String str, String str2) {
        this.f16556e = false;
        com.fyber.inneractive.sdk.flow.storepromo.loader.a aVar = this.f16557f;
        if (aVar != null) {
            aVar.a(bVar, str, str2);
            this.f16557f = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.a
    public final void a(String str, HashMap map) {
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar = this.f16553b;
        if (aVar == null) {
            IAlog.b("StorePromoWebViewController: onCommandReceived: command: %s the webview is null", str);
            return;
        }
        g1 lastClickedLocation = aVar.getLastClickedLocation();
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.b bVar = this.f16554c;
        if (bVar != null) {
            bVar.a(str, map, lastClickedLocation);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a
    public final void a(HashMap map) {
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a
    public final void b() {
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar = this.f16553b;
        if (aVar != null) {
            aVar.a("DTStorePromoBridge.nativeCallComplete()");
        }
    }
}
