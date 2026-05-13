package com.ironsource;

import com.ironsource.AbstractC4067i3;
import com.ironsource.C3978d4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class Na implements Ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ha f29894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final L2 f29895b;

    public Na(@NotNull Ha ha2, @NotNull L2 l22) {
        tn.p.k(ha2, C3978d4.f.f31283e);
        tn.p.k(l22, "currentAdUnit");
        this.f29894a = ha2;
        this.f29895b = l22;
    }

    @Override // com.ironsource.M0
    public void a(@Nullable IronSourceError ironSourceError) {
        this.f29894a.a("Received load failed while paused");
    }

    @Override // com.ironsource.M0
    public void a(@NotNull C4258t0 c4258t0) {
        tn.p.k(c4258t0, "adUnitCallback");
        this.f29894a.a("Received load success while paused");
    }

    @Override // com.ironsource.Ra
    public void b() {
        this.f29894a.a("Loading a loaded ad");
    }

    @Override // com.ironsource.Ra
    public void c() {
        this.f29895b.a(true);
        Ha ha2 = this.f29894a;
        ha2.a((Ra) new Ka(ha2));
    }

    @Override // com.ironsource.Ra
    public void d() {
    }

    @Override // com.ironsource.Ra
    public void f() {
        this.f29894a.a(this.f29895b, new AbstractC4067i3.a(AbstractC4067i3.b.c.f31918a));
    }
}
