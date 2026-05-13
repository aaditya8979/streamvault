package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class Tc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final E0 f30506a;

    public Tc(@NotNull E0 e02) {
        tn.p.k(e02, "eventsWrapper");
        this.f30506a = e02;
    }

    public final void a() {
        this.f30506a.a(B0.OPERATIONAL_LOAD_AD, new HashMap());
    }

    public final void a(double d10) {
        this.f30506a.a(B0.OPERATIONAL_SET_CONFIGURATIONS, cn.p0.g(bn.h.a(IronSourceConstants.EVENTS_EXT1, "flooring=" + d10)));
    }

    public final void a(long j10) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j10));
        this.f30506a.a(B0.OPERATIONAL_LOAD_SUCCESS, map);
    }

    public final void a(long j10, int i10, @NotNull String str) {
        tn.p.k(str, "reason");
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        map.put("reason", str);
        map.put("duration", Long.valueOf(j10));
        this.f30506a.a(B0.OPERATIONAL_LOAD_FAILED, map);
    }

    public final void b() {
        this.f30506a.a(B0.PAUSE_AD, null);
    }

    public final void c() {
        this.f30506a.a(B0.RESUME_AD, null);
    }
}
