package com.ironsource;

import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.E0;
import com.ironsource.mediationsdk.IronSource;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class E5 implements D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final IronSource.a f29235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final E0 f29236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<D0> f29237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final C3929a9 f29238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Ab f29239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Xf f29240f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final R1 f29241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final N f29242h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final C3954bg f29243i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final Tc f29244j;

    public E5(@NotNull IronSource.a aVar, @NotNull E0.b bVar, @NotNull List<? extends D0> list, @Nullable AbstractC4244s3 abstractC4244s3) {
        tn.p.k(aVar, "adFormat");
        tn.p.k(bVar, AppLovinEventTypes.USER_COMPLETED_LEVEL);
        tn.p.k(list, "eventsInterfaces");
        this.f29235a = aVar;
        E0 e02 = new E0(aVar, bVar, this, abstractC4244s3);
        this.f29236b = e02;
        this.f29237c = cn.f0.j1(list);
        C3929a9 c3929a9 = e02.f29204e;
        tn.p.j(c3929a9, "wrapper.init");
        this.f29238d = c3929a9;
        Ab ab2 = e02.f29205f;
        tn.p.j(ab2, "wrapper.load");
        this.f29239e = ab2;
        Xf xf2 = e02.f29206g;
        tn.p.j(xf2, "wrapper.token");
        this.f29240f = xf2;
        R1 r12 = e02.f29207h;
        tn.p.j(r12, "wrapper.auction");
        this.f29241g = r12;
        N n10 = e02.f29208i;
        tn.p.j(n10, "wrapper.adInteraction");
        this.f29242h = n10;
        C3954bg c3954bg = e02.f29209j;
        tn.p.j(c3954bg, "wrapper.troubleshoot");
        this.f29243i = c3954bg;
        Tc tc2 = e02.f29210k;
        tn.p.j(tc2, "wrapper.operational");
        this.f29244j = tc2;
    }

    public /* synthetic */ E5(IronSource.a aVar, E0.b bVar, List list, AbstractC4244s3 abstractC4244s3, int i10, tn.i iVar) {
        this(aVar, bVar, (i10 & 4) != 0 ? cn.w.m() : list, (i10 & 8) != 0 ? null : abstractC4244s3);
    }

    @NotNull
    public final N a() {
        return this.f29242h;
    }

    @Override // com.ironsource.D0
    @NotNull
    public Map<String, Object> a(@NotNull B0 b02) {
        tn.p.k(b02, "event");
        HashMap map = new HashMap();
        Iterator<D0> it = this.f29237c.iterator();
        while (it.hasNext()) {
            Map<String, Object> mapA = it.next().a(b02);
            tn.p.j(mapA, "it.getEventsAdditionalDataMap(event)");
            map.putAll(mapA);
        }
        return map;
    }

    public final void a(@NotNull D0 d02) {
        tn.p.k(d02, "eventInterface");
        this.f29237c.add(d02);
    }

    public final void a(boolean z10) {
        if (z10) {
            this.f29239e.a(true);
        } else {
            if (z10) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.f29235a == IronSource.a.BANNER) {
                this.f29239e.a();
            } else {
                this.f29239e.a(false);
            }
        }
    }

    @NotNull
    public final R1 b() {
        return this.f29241g;
    }

    @NotNull
    public final List<D0> c() {
        return this.f29237c;
    }

    @NotNull
    public final C3929a9 d() {
        return this.f29238d;
    }

    @NotNull
    public final Ab e() {
        return this.f29239e;
    }

    @NotNull
    public final Tc f() {
        return this.f29244j;
    }

    @NotNull
    public final Xf g() {
        return this.f29240f;
    }

    @NotNull
    public final C3954bg h() {
        return this.f29243i;
    }
}
