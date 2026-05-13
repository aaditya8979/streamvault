package com.ironsource;

import com.ironsource.C3978d4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class Va implements Ya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ta f30602a;

    public Va(@NotNull Ta ta2) {
        tn.p.k(ta2, C3978d4.f.f31283e);
        this.f30602a = ta2;
    }

    @Override // com.ironsource.Ya
    public void a(@Nullable IronSourceError ironSourceError) {
        this.f30602a.a("Received load failed on a destroyed ad");
    }

    @Override // com.ironsource.Ya
    public void a(@NotNull C4258t0 c4258t0) {
        tn.p.k(c4258t0, "adUnitCallback");
        this.f30602a.a("Received load success on a destroyed ad");
    }

    @Override // com.ironsource.Ya
    public void b() {
        this.f30602a.a("Loading a destroyed ad");
    }

    @Override // com.ironsource.Ya
    public void c() {
        this.f30602a.a("Destroying a destroyed ad");
    }
}
