package com.inmobi.media;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.yc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3882yc implements B2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mc f28578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sn.a f28579b;

    public C3882yc(Mc mc2, sn.a aVar) {
        tn.p.k(mc2, "nativeBeaconMacroData");
        tn.p.k(aVar, "getBeacons");
        this.f28578a = mc2;
        this.f28579b = aVar;
    }

    @Override // com.inmobi.media.B2
    public final void a(C2 c22) {
        tn.p.k(c22, "beaconExtras");
        boolean z10 = c22 instanceof Fo;
        List listO0 = cn.f0.O0((Collection) this.f28579b.invoke(), z10 ? ((Fo) c22).f25487b : cn.w.m());
        if (listO0.isEmpty()) {
            return;
        }
        Map mapJ = z10 ? ((Fo) c22).f25486a : kotlin.collections.a.j();
        Iterator it = listO0.iterator();
        while (it.hasNext()) {
            String strA = Oc.a((String) it.next(), this.f28578a, mapJ);
            C3823w3 c3823w3 = C3823w3.f28406a;
            tn.p.k(strA, "url");
            C3823w3.a(strA, false, null);
        }
    }
}
