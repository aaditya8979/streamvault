package com.fyber.inneractive.sdk.flow.nativead;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.u0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements c, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CountDownLatch f16451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f16452b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f16454d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f16453c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f16455e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f16456f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f16457g = b.UNINITIALIZED;

    public h(ArrayList arrayList, e eVar) {
        this.f16454d = arrayList;
        this.f16452b = eVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.s
    public final void a(g gVar, Exception exc, com.fyber.inneractive.sdk.response.nativead.f fVar) throws Throwable {
        if (gVar != null) {
            this.f16456f.add(gVar);
        } else {
            this.f16455e.add(fVar);
        }
        CountDownLatch countDownLatch = this.f16451a;
        if (countDownLatch == null) {
            return;
        }
        countDownLatch.countDown();
        if (this.f16451a.getCount() == 0) {
            this.f16457g = b.LOADED;
            c();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final boolean a() {
        return this.f16457g == b.LOADING;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final void b() throws Throwable {
        com.fyber.inneractive.sdk.response.nativead.c cVar;
        String str;
        if (this.f16454d.isEmpty()) {
            this.f16457g = b.FAILED;
            c();
            return;
        }
        Iterator it = this.f16454d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.fyber.inneractive.sdk.response.nativead.f fVar = (com.fyber.inneractive.sdk.response.nativead.f) it.next();
            if (fVar == null || (cVar = fVar.f19418d) == null || (str = cVar.f19412a) == null || str.trim().isEmpty()) {
                IAlog.f("%sImage asset not downloadable. imageAssetId: %s, imageObject: %s", IAlog.a(this), Integer.valueOf(fVar.f19415a), fVar.f19418d);
                this.f16455e.add(fVar);
            } else {
                ArrayList arrayList = this.f16453c;
                if (arrayList != null) {
                    arrayList.add(new u0(new t(fVar, this), IAConfigManager.O.f15976v.f16067a, new com.fyber.inneractive.sdk.cache.d(fVar.f19418d.f19412a)));
                }
            }
        }
        ArrayList arrayList2 = this.f16453c;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            this.f16457g = b.FAILED;
            c();
            return;
        }
        this.f16457g = b.LOADING;
        this.f16451a = new CountDownLatch(this.f16453c.size());
        Iterator it2 = this.f16453c.iterator();
        while (it2.hasNext()) {
            IAConfigManager.O.f15973s.a((u0) it2.next());
        }
    }

    public final void c() throws Throwable {
        e eVar = this.f16452b;
        if (eVar != null) {
            ArrayList arrayList = this.f16456f;
            ArrayList<com.fyber.inneractive.sdk.response.nativead.f> arrayList2 = this.f16455e;
            if (!arrayList.isEmpty()) {
                eVar.f16434a.f16440d.addAll(arrayList);
            }
            if (!arrayList2.isEmpty()) {
                for (com.fyber.inneractive.sdk.response.nativead.f fVar : arrayList2) {
                    IAlog.f("%sFailed to load image asset. id: %s, imageObj: %s", f.f16435m, Integer.valueOf(fVar.f19415a), fVar.f19418d);
                }
            }
            eVar.f16434a.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final void destroy() {
        ArrayList arrayList = this.f16453c;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = this.f16453c.iterator();
            while (it.hasNext()) {
                ((u0) it.next()).f17034a = true;
            }
            this.f16453c.clear();
        }
        this.f16453c = null;
        this.f16457g = b.DESTROYED;
    }
}
