package com.fyber.inneractive.sdk.flow.storepromo.controller;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.endcard.k;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.response.e;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements com.fyber.inneractive.sdk.flow.storepromo.loader.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InneractiveAdRequest f16543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f16544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f16545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.ui.c f16546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.loader.b f16547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.b f16548f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f16549g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a f16550h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public k f16551i;

    public b(com.fyber.inneractive.sdk.flow.storepromo.model.c cVar, com.fyber.inneractive.sdk.flow.storepromo.b bVar, com.fyber.inneractive.sdk.flow.storepromo.loader.b bVar2, com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar, e eVar, InneractiveAdRequest inneractiveAdRequest) {
        this.f16550h = aVar;
        this.f16545c = new c(cVar, this, this);
        this.f16548f = bVar;
        this.f16543a = inneractiveAdRequest;
        this.f16544b = eVar;
        this.f16547e = bVar2;
    }

    public final void a() {
        com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar = this.f16546d;
        if (cVar != null) {
            if (cVar.f16634b != null && cVar.f16633a != null) {
                cVar.f16636d.setAnimationListener(cVar.f16641i);
                cVar.f16633a.setAnimation(cVar.f16636d);
                cVar.f16633a.setVisibility(8);
            }
            k kVar = this.f16551i;
            if (kVar == null || kVar.f16325b.a() == null || kVar.f16325b.a().f().b() == null) {
                return;
            }
            IAlog.a("%sonStorePromoDismissed restoring endcard focus", IAlog.a(kVar));
            kVar.f16325b.a().f().b().requestFocus();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.loader.a
    public final void a(com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar, com.fyber.inneractive.sdk.flow.storepromo.model.c cVar) {
        this.f16546d = new com.fyber.inneractive.sdk.flow.storepromo.ui.c(IAConfigManager.O.f15976v.a(), aVar, this.f16548f);
        u uVar = u.VAST_EVENT_SP_LOADED;
        InneractiveAdRequest inneractiveAdRequest = this.f16543a;
        e eVar = this.f16544b;
        String str = cVar.f16624h;
        w wVar = new w(uVar, inneractiveAdRequest, eVar);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("templateURL", str);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", "templateURL", str);
        }
        wVar.f17081f.put(jSONObject);
        wVar.a((String) null);
        IAlog.a("StorePromoController: onContentLoadedSuccess", new Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a
    public final void a(com.fyber.inneractive.sdk.network.events.b bVar, String str, String str2) {
        this.f16549g = true;
        a();
        com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar = this.f16550h;
        if (aVar != null) {
            aVar.a(bVar, str, str2);
        }
    }
}
