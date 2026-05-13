package com.ironsource;

import com.ironsource.C3978d4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class Xa implements Ya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ta f30668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final L2 f30669b;

    public Xa(@NotNull Ta ta2, @NotNull L2 l22) {
        tn.p.k(ta2, C3978d4.f.f31283e);
        tn.p.k(l22, "adUnit");
        this.f30668a = ta2;
        this.f30669b = l22;
    }

    @Override // com.ironsource.Ya
    public void a(@Nullable IronSourceError ironSourceError) {
        this.f30668a.a(ironSourceError);
        this.f30669b.a(false);
        this.f30668a.a((L2) null);
        Ta ta2 = this.f30668a;
        ta2.a(new Va(ta2));
    }

    @Override // com.ironsource.Ya
    public void a(@NotNull C4258t0 c4258t0) {
        tn.p.k(c4258t0, "adUnitCallback");
        this.f30668a.a(c4258t0, this.f30669b);
        Ta ta2 = this.f30668a;
        ta2.a(new Wa(ta2, this.f30669b));
    }

    @Override // com.ironsource.Ya
    public void b() {
        this.f30668a.a("Loading an ad while loading");
    }

    @Override // com.ironsource.Ya
    public void c() {
        this.f30669b.a(true);
        this.f30668a.a((L2) null);
        Ta ta2 = this.f30668a;
        ta2.a(new Va(ta2));
    }
}
