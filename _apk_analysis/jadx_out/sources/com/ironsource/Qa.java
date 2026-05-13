package com.ironsource;

import com.ironsource.AbstractC4067i3;
import com.ironsource.C3978d4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class Qa implements Ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ha f30291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final L2 f30292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final L2 f30293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f30294d;

    public Qa(@NotNull Ha ha2, @NotNull L2 l22, @NotNull L2 l23, long j10) {
        tn.p.k(ha2, C3978d4.f.f31283e);
        tn.p.k(l22, "currentAdUnit");
        tn.p.k(l23, "reloadingAdUnit");
        this.f30291a = ha2;
        this.f30292b = l22;
        this.f30293c = l23;
        this.f30294d = j10;
    }

    @Override // com.ironsource.M0
    public void a(@Nullable IronSourceError ironSourceError) {
        this.f30291a.a(ironSourceError, this.f30292b, (AbstractC4067i3) new AbstractC4067i3.c(this.f30291a.p().a() - this.f30294d, AbstractC4067i3.d.c.f31923a), true, false, Long.valueOf(this.f30294d));
    }

    @Override // com.ironsource.M0
    public void a(@NotNull C4258t0 c4258t0) {
        tn.p.k(c4258t0, "adUnitCallback");
        this.f30291a.a(c4258t0, this.f30293c, this.f30292b, (AbstractC4067i3) new AbstractC4067i3.c(this.f30291a.p().a() - this.f30294d, AbstractC4067i3.d.C0387d.f31924a), false, Long.valueOf(this.f30294d));
    }

    @Override // com.ironsource.Ra
    public void b() {
        this.f30291a.a("Loading an ad while reloading after timer finished");
    }

    @Override // com.ironsource.Ra
    public void c() {
        this.f30292b.a(true);
        this.f30293c.a(true);
        Ha ha2 = this.f30291a;
        ha2.a((Ra) new Ka(ha2));
    }

    @Override // com.ironsource.Ra
    public void d() {
        Ha ha2 = this.f30291a;
        ha2.a((Ra) new Na(ha2, this.f30292b));
    }

    @Override // com.ironsource.Ra
    public void f() {
    }
}
