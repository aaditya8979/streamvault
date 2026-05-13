package com.inmobi.media;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.bj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3312bj implements B2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mc f26872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sn.a f26873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f26874c;

    public C3312bj(Mc mc2, sn.a aVar) {
        tn.p.k(mc2, "vastBeaconDataModel");
        tn.p.k(aVar, "getBeacons");
        this.f26872a = mc2;
        this.f26873b = aVar;
        this.f26874c = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.B2
    public final void a(C2 c22) {
        Object obj = Te.f26356a;
        tn.p.k(obj, "beaconExtras");
        if (this.f26874c.getAndSet(true)) {
            return;
        }
        boolean z10 = obj instanceof Fo;
        Map mapJ = z10 ? ((Fo) obj).f25486a : kotlin.collections.a.j();
        List listO0 = cn.f0.O0((Collection) this.f26873b.invoke(), z10 ? ((Fo) obj).f25487b : cn.w.m());
        if (listO0.isEmpty()) {
            return;
        }
        Iterator it = listO0.iterator();
        while (it.hasNext()) {
            String strA = Oc.a((String) it.next(), this.f26872a, mapJ);
            C3823w3 c3823w3 = C3823w3.f28406a;
            tn.p.k(strA, "url");
            C3823w3.a(strA, false, null);
        }
    }
}
