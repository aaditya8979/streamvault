package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4898k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f67079a = new HashMap();

    public final synchronized C4872j0 a(R4 r42, PublicLogger publicLogger, Xe xe2) {
        C4872j0 c4872j0;
        c4872j0 = (C4872j0) this.f67079a.get(r42.toString());
        if (c4872j0 == null) {
            C4847i0 c4847i0D = xe2.d();
            c4872j0 = new C4872j0(c4847i0D.f66948a, c4847i0D.f66949b, new C5119sl(publicLogger, "[App Environment]"));
            this.f67079a.put(r42.toString(), c4872j0);
        }
        return c4872j0;
    }

    public final synchronized void a(C4847i0 c4847i0, Xe xe2) {
        xe2.a(c4847i0).b();
    }
}
