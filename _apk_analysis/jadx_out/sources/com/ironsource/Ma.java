package com.ironsource;

import com.ironsource.AbstractC4067i3;
import com.ironsource.C3978d4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Ma implements Ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ha f29842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final L2 f29843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f29844c;

    public Ma(@NotNull Ha ha2, @NotNull L2 l22, boolean z10) {
        tn.p.k(ha2, C3978d4.f.f31283e);
        tn.p.k(l22, "currentAdUnit");
        this.f29842a = ha2;
        this.f29843b = l22;
        this.f29844c = z10;
    }

    @Override // com.ironsource.M0
    public void a(@Nullable IronSourceError ironSourceError) {
        this.f29842a.a(ironSourceError, this.f29843b, (AbstractC4067i3) new AbstractC4067i3.a(AbstractC4067i3.b.a.f31916a), false, this.f29844c, (Long) null);
    }

    @Override // com.ironsource.M0
    public void a(@NotNull C4258t0 c4258t0) {
        tn.p.k(c4258t0, "adUnitCallback");
        this.f29842a.a(c4258t0, this.f29843b, (L2) null, new AbstractC4067i3.a(AbstractC4067i3.b.C0386b.f31917a), this.f29844c, (Long) null);
    }

    @Override // com.ironsource.Ra
    public void b() {
        this.f29842a.a("Loading an ad while loading");
    }

    @Override // com.ironsource.Ra
    public void c() {
        this.f29843b.a(true);
        Ha ha2 = this.f29842a;
        ha2.a((Ra) new Ka(ha2));
    }

    @Override // com.ironsource.Ra
    public void d() {
        this.f29844c = true;
    }

    @Override // com.ironsource.Ra
    public void f() {
        this.f29844c = false;
    }
}
