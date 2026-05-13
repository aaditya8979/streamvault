package com.fyber.inneractive.sdk.flow.nativead;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.w0;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends com.fyber.inneractive.sdk.flow.k {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f16432m = "Native";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f f16433n;

    @Override // com.fyber.inneractive.sdk.flow.k, com.fyber.inneractive.sdk.interfaces.c
    public final void cancel() {
        x xVar = this.f16414c;
        if (xVar != null) {
            ((w0) xVar).destroy();
        }
        f fVar = this.f16433n;
        if (fVar != null) {
            fVar.f16440d.clear();
            fVar.f16442f = null;
            Iterator it = fVar.f16437a.iterator();
            while (it.hasNext()) {
                ((c) it.next()).destroy();
            }
            fVar.f16437a.clear();
            this.f16433n = null;
        }
        this.f16422k.a();
        IAlog.a("%s: IAAdContentLoaderImpl : cancel load ad content retry task", IAlog.a(this));
        com.fyber.inneractive.sdk.util.r.f19556b.removeCallbacks(this.f16423l);
        this.f16412a = null;
        this.f16413b = null;
        this.f16414c = null;
        this.f16415d = null;
        this.f16416e = null;
        this.f16417f = null;
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final String e() {
        return "send_failed_native_creatives";
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final void h() {
        com.fyber.inneractive.sdk.response.e eVar = this.f16413b;
        if (eVar == null || ((com.fyber.inneractive.sdk.response.nativead.j) eVar).T.N == null) {
            return;
        }
        com.fyber.inneractive.sdk.config.global.r rVar = this.f16418g;
        InneractiveAdRequest inneractiveAdRequest = this.f16412a;
        com.fyber.inneractive.sdk.response.nativead.j jVar = (com.fyber.inneractive.sdk.response.nativead.j) this.f16413b;
        f fVar = new f(rVar, inneractiveAdRequest, jVar, jVar.T.N, this, this.f16432m);
        this.f16433n = fVar;
        com.fyber.inneractive.sdk.flow.nativead.mainasset.d dVarA = com.fyber.inneractive.sdk.flow.nativead.mainasset.e.a(fVar.f16445i, fVar.f16447k, fVar.f16444h, fVar.f16439c, fVar.f16446j, fVar);
        if (dVarA == null) {
            if (fVar.f16443g.compareAndSet(false, true)) {
                InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, com.fyber.inneractive.sdk.flow.i.NATIVE_AD_EMPTY_CONTENT);
                inneractiveInfrastructureError.setCause(new com.fyber.inneractive.sdk.flow.nativead.mainasset.a("Could not start loading main media"));
                d dVar = fVar.f16442f;
                dVar.getClass();
                com.fyber.inneractive.sdk.util.r.f19555a.execute(new com.fyber.inneractive.sdk.flow.e(new com.fyber.inneractive.sdk.flow.f(dVar.f16413b, dVar.f16412a, "send_failed_native_creatives", dVar.f16418g.b()), inneractiveInfrastructureError));
                dVar.b(inneractiveInfrastructureError);
                return;
            }
            return;
        }
        fVar.f16437a.add(dVarA);
        CopyOnWriteArrayList copyOnWriteArrayList = fVar.f16437a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = fVar.f16439c.f19428a;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            for (com.fyber.inneractive.sdk.response.nativead.f fVar2 : fVar.f16439c.f19428a) {
                if (fVar2 != null && fVar2.f19415a != 2 && fVar2.f19418d != null) {
                    arrayList.add(fVar2);
                }
            }
        }
        copyOnWriteArrayList.add(new h(arrayList, fVar.f16448l));
        Iterator it = fVar.f16437a.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b();
        }
    }
}
