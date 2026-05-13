package com.ironsource;

import com.ironsource.C3978d4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Ka implements Ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ha f29732a;

    public Ka(@NotNull Ha ha2) {
        tn.p.k(ha2, C3978d4.f.f31283e);
        this.f29732a = ha2;
    }

    @Override // com.ironsource.M0
    public void a(@Nullable IronSourceError ironSourceError) {
        this.f29732a.a("Received load failed on a destroyed ad");
    }

    @Override // com.ironsource.M0
    public void a(@NotNull C4258t0 c4258t0) {
        tn.p.k(c4258t0, "adUnitCallback");
        this.f29732a.a("Received load success on a destroyed ad");
    }

    @Override // com.ironsource.Ra
    public void b() {
        this.f29732a.a("Loading a destroyed ad");
    }

    @Override // com.ironsource.Ra
    public void c() {
        this.f29732a.a("Destroying a destroyed ad");
    }

    @Override // com.ironsource.Ra
    public void d() {
        this.f29732a.a("Pausing auto refresh on a destroyed ad");
    }

    @Override // com.ironsource.Ra
    public void f() {
        this.f29732a.a("Resuming auto refresh on a destroyed ad");
    }
}
