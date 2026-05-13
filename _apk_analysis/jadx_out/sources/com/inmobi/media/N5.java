package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class N5 implements B2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mc f25987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Nl f25988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3312bj f25989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicInteger f25990d;

    public N5(Mc mc2, Nl nl2, C3312bj c3312bj, C3312bj c3312bj2) {
        tn.p.k(mc2, "nativeBeaconMacroData");
        tn.p.k(nl2, "nativeBeaconTrackerData");
        tn.p.k(c3312bj, "progressReceivedBeacons");
        tn.p.k(c3312bj2, "progressTriggeredBeacons");
        this.f25987a = mc2;
        this.f25988b = nl2;
        this.f25989c = c3312bj2;
        this.f25990d = new AtomicInteger(-1);
        if (nl2.f26053c.isEmpty()) {
            return;
        }
        c3312bj.a(Te.f26356a);
    }

    @Override // com.inmobi.media.B2
    public final void a(C2 c22) {
        tn.p.k(Te.f26356a, "beaconExtras");
        int i10 = this.f25987a.f25955e;
        int i11 = this.f25990d.get();
        if (i10 <= this.f25990d.getAndSet(i10)) {
            return;
        }
        ArrayList arrayList = this.f25988b.f26053c;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            int i12 = i11 + 1;
            int i13 = ((M5) obj).f25930a;
            if (i12 <= i13 && i13 <= i10) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        this.f25989c.a(Te.f26356a);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            String strA = Oc.a(((M5) it.next()).f25931b, this.f25987a, kotlin.collections.a.j());
            C3823w3 c3823w3 = C3823w3.f28406a;
            tn.p.k(strA, "url");
            C3823w3.a(strA, false, null);
        }
    }
}
