package com.inmobi.media;

import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class Nc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mc f26033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lc f26034b;

    public Nc(C3542kl c3542kl, C3319c0 c3319c0, C3838wi c3838wi) {
        tn.p.k(c3319c0, "adLifecycleData");
        tn.p.k(c3838wi, "responseBeaconData");
        ArrayList arrayList = null;
        this.f26033a = new Mc(c3319c0, c3542kl != null ? c3542kl.f27492a : null, c3542kl != null ? c3542kl.f27493b : null);
        if (c3542kl != null) {
            ArrayList arrayList2 = c3542kl.f27495d;
            arrayList = new ArrayList();
            for (Object obj : arrayList2) {
                String str = ((C3809ve) obj).f28365b;
                tn.p.k(str, "type");
                if (tn.p.f(str, VastTagName.IMPRESSION)) {
                    arrayList.add(obj);
                }
            }
        }
        this.f26034b = new Lc(this.f26033a, new Pc(c3838wi, arrayList));
    }

    public final void a(short s10, List list) {
        tn.p.k(list, "trackers");
        this.f26034b.f25869c.a(new Fo(cn.p0.g(bn.h.a("[EVENTTYPE]", String.valueOf((int) s10))), list));
    }
}
