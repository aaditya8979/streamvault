package com.inmobi.media;

import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class Ml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mc f25975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ll f25976b;

    public Ml(C3542kl c3542kl, C3319c0 c3319c0, C3445gn c3445gn) {
        int iA;
        tn.p.k(c3542kl, "vastBeaconData");
        tn.p.k(c3319c0, "adLifecycleData");
        tn.p.k(c3445gn, "responseBeaconData");
        this.f25975a = new Mc(c3319c0, c3542kl.f27492a, c3542kl.f27493b);
        ArrayList arrayList = c3542kl.f27495d;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            C3809ve c3809ve = (C3809ve) obj;
            if (!(c3809ve instanceof O5)) {
                String str = c3809ve.f28365b;
                tn.p.k(str, "type");
                if (!tn.p.f(str, VastTagName.IMPRESSION) && !tn.p.f(str, "click")) {
                    arrayList2.add(obj);
                }
            }
        }
        ArrayList arrayList3 = c3542kl.f27495d;
        ArrayList<O5> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (obj2 instanceof O5) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList(cn.x.x(arrayList4, 10));
        for (O5 o52 : arrayList4) {
            int i10 = c3542kl.f27494c;
            tn.p.k(o52, "<this>");
            int i11 = 0;
            if (bo.a0.I(o52.f26066c, "%", false, 2, null)) {
                try {
                    i11 = Integer.parseInt(bo.f0.y1(o52.f26066c, 1));
                } catch (Exception unused) {
                }
                iA = (i10 * i11) / 100;
            } else {
                iA = Jl.a(o52.f26066c);
            }
            arrayList5.add(new M5(o52.f28364a, iA));
        }
        this.f25976b = new Ll(this.f25975a, new Nl(c3445gn, arrayList2, arrayList5));
    }
}
