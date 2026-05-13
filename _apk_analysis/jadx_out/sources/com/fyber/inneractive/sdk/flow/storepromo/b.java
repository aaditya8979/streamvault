package com.fyber.inneractive.sdk.flow.storepromo;

import android.text.TextUtils;
import android.view.View;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.storepromo.loader.f;
import com.fyber.inneractive.sdk.flow.storepromo.loader.g;
import com.fyber.inneractive.sdk.flow.storepromo.ui.c;
import com.fyber.inneractive.sdk.model.vast.v;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.response.e;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.o;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements com.fyber.inneractive.sdk.flow.storepromo.loader.b, com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f16532k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f16533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f16534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InneractiveAdRequest f16535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.controller.b f16536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.loader.b f16537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f16538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16539g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArrayList f16540h = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f16541i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f16542j = new a();

    public b(v vVar, e eVar, InneractiveAdRequest inneractiveAdRequest) {
        this.f16533a = new g(vVar, this);
        this.f16538f = vVar.f16897c;
        this.f16534b = eVar;
        this.f16535c = inneractiveAdRequest;
    }

    public final void a() {
        com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar = this.f16536d;
        if (bVar != null) {
            c cVar = bVar.f16546d;
            if (cVar != null) {
                if (cVar.f16634b != null && cVar.f16633a != null) {
                    cVar.f16636d.setAnimationListener(cVar.f16641i);
                    cVar.f16633a.setAnimation(cVar.f16636d);
                    cVar.f16633a.setVisibility(8);
                }
                if (cVar.f16634b != null) {
                    cVar.f16633a = null;
                    cVar.f16634b = null;
                }
                com.fyber.inneractive.sdk.flow.storepromo.ui.b bVar2 = cVar.f16637e;
                if (bVar2 != null) {
                    try {
                        o.f19548a.unregisterReceiver(bVar2);
                    } catch (Exception unused) {
                    }
                    cVar.f16637e = null;
                }
                cVar.f16638f = null;
                bVar.f16546d = null;
            }
            com.fyber.inneractive.sdk.flow.storepromo.controller.c cVar2 = bVar.f16545c;
            if (cVar2 != null) {
                f fVar = cVar2.f16555d;
                if (fVar != null) {
                    com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar = fVar.f16569a;
                    if (aVar != null) {
                        aVar.destroy();
                        fVar.f16569a = null;
                    }
                    fVar.f16573e = null;
                    fVar.f16572d = null;
                    fVar.f16571c = null;
                    fVar.f16574f = null;
                    fVar.f16570b = null;
                }
                com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar2 = cVar2.f16553b;
                if (aVar2 != null) {
                    aVar2.destroy();
                    cVar2.f16553b = null;
                }
                cVar2.f16557f = null;
                cVar2.f16558g = null;
                cVar2.f16554c = null;
                cVar2.f16555d = null;
                bVar.f16545c = null;
            }
            bVar.f16551i = null;
            bVar.f16547e = null;
            bVar.f16548f = null;
            bVar.f16550h = null;
            this.f16536d = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a
    public final void a(com.fyber.inneractive.sdk.network.events.b bVar, String str, String str2) {
        a(bVar.name(), str, str2);
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.loader.b
    public final void a(g1 g1Var) {
        c cVar;
        View view;
        this.f16541i = true;
        com.fyber.inneractive.sdk.flow.storepromo.loader.b bVar = this.f16537e;
        if (bVar != null) {
            bVar.a(g1Var);
        }
        com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar2 = this.f16536d;
        com.fyber.inneractive.sdk.flow.storepromo.observer.b bVar3 = new com.fyber.inneractive.sdk.flow.storepromo.observer.b((bVar2 == null || (cVar = bVar2.f16546d) == null || cVar.f16634b == null || (view = cVar.f16633a) == null || view.getParent() == null || cVar.f16634b.getVisibility() != 0) ? false : true, this.f16541i);
        Iterator it = this.f16540h.iterator();
        while (it.hasNext()) {
            ((com.fyber.inneractive.sdk.flow.storepromo.observer.a) it.next()).a(bVar3);
        }
    }

    public final void a(String str, String str2, String str3) {
        IAlog.b("StorePromoManager: reportStorePromoError: %s, msg: %s", str, str2);
        if (this.f16542j != null) {
            InneractiveAdRequest inneractiveAdRequest = this.f16535c;
            e eVar = this.f16534b;
            HashMap map = new HashMap(1);
            if (!TextUtils.isEmpty(str2)) {
                map.put("error", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                map.put("failedURL", str3);
            }
            com.fyber.inneractive.sdk.network.events.a.a(t.ERROR_STORE_PROMO_FAILURE, str, (String) null, inneractiveAdRequest, eVar, map, (Boolean) null);
            this.f16542j = null;
        }
    }
}
