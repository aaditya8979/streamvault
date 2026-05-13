package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f10021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f10022b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f10024d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f10025e = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f10023c = new Object();

    public e(k kVar) {
        this.f10021a = kVar;
        this.f10022b = kVar.O();
        for (com.applovin.impl.u uVar : com.applovin.impl.u.a()) {
            this.f10024d.put(uVar, new q());
            this.f10025e.put(uVar, new q());
        }
    }

    private q b(com.applovin.impl.u uVar) {
        q qVar;
        synchronized (this.f10023c) {
            qVar = (q) this.f10025e.get(uVar);
            if (qVar == null) {
                qVar = new q();
                this.f10025e.put(uVar, qVar);
            }
        }
        return qVar;
    }

    private q c(com.applovin.impl.u uVar) {
        synchronized (this.f10023c) {
            q qVarB = b(uVar);
            if (qVarB.b() > 0) {
                return qVarB;
            }
            return d(uVar);
        }
    }

    private q d(com.applovin.impl.u uVar) {
        q qVar;
        synchronized (this.f10023c) {
            qVar = (q) this.f10024d.get(uVar);
            if (qVar == null) {
                qVar = new q();
                this.f10024d.put(uVar, qVar);
            }
        }
        return qVar;
    }

    public AppLovinAdImpl a(com.applovin.impl.u uVar) {
        AppLovinAdImpl appLovinAdImplA;
        synchronized (this.f10023c) {
            appLovinAdImplA = c(uVar).a();
        }
        return appLovinAdImplA;
    }

    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f10023c) {
            d(appLovinAdImpl.getAdZone()).a(appLovinAdImpl);
            if (o.a()) {
                this.f10022b.a("AdPreloadManager", "Ad enqueued: " + appLovinAdImpl);
            }
        }
    }

    public void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f10023c) {
            c(appLovinAdImpl.getAdZone()).b(appLovinAdImpl);
        }
    }

    public AppLovinAdImpl e(com.applovin.impl.u uVar) {
        com.applovin.impl.sdk.ad.c cVar;
        synchronized (this.f10023c) {
            q qVarD = d(uVar);
            if (qVarD.b() > 0) {
                b(uVar).a(qVarD.a());
                cVar = new com.applovin.impl.sdk.ad.c(uVar, this.f10021a);
            } else {
                cVar = null;
            }
        }
        if (cVar != null) {
            if (o.a()) {
                this.f10022b.a("AdPreloadManager", "Retrieved ad of zone " + uVar + "...");
            }
        } else if (o.a()) {
            this.f10022b.a("AdPreloadManager", "Unable to retrieve ad of zone " + uVar + "...");
        }
        return cVar;
    }

    public AppLovinAdBase f(com.applovin.impl.u uVar) {
        AppLovinAdImpl appLovinAdImplD;
        synchronized (this.f10023c) {
            appLovinAdImplD = c(uVar).d();
        }
        return appLovinAdImplD;
    }
}
