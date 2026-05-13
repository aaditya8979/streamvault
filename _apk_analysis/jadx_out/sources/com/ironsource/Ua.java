package com.ironsource;

import com.ironsource.C3978d4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class Ua implements Ya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ta f30547a;

    public Ua(@NotNull Ta ta2) {
        tn.p.k(ta2, C3978d4.f.f31283e);
        this.f30547a = ta2;
    }

    @Override // com.ironsource.Ya
    public void a(@Nullable IronSourceError ironSourceError) {
        this.f30547a.a("Received load failed before load called");
    }

    @Override // com.ironsource.Ya
    public void a(@NotNull C4258t0 c4258t0) {
        tn.p.k(c4258t0, "adUnitCallback");
        this.f30547a.a("Received load success before load called");
    }

    @Override // com.ironsource.Ya
    public void b() {
        L2 l2A = this.f30547a.i().a(true);
        this.f30547a.a(l2A);
        Ta ta2 = this.f30547a;
        ta2.a(new Xa(ta2, l2A));
        l2A.a(this.f30547a.g());
    }

    @Override // com.ironsource.Ya
    public void c() {
        L2 l2K = this.f30547a.k();
        if (l2K != null) {
            l2K.a(false);
        }
        this.f30547a.a((L2) null);
        Ta ta2 = this.f30547a;
        ta2.a(new Va(ta2));
    }
}
