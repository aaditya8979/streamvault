package com.ironsource;

import com.ironsource.C3978d4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Ja implements Ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ha f29675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f29676b;

    public Ja(@NotNull Ha ha2, boolean z10) {
        tn.p.k(ha2, C3978d4.f.f31283e);
        this.f29675a = ha2;
        this.f29676b = z10;
    }

    public /* synthetic */ Ja(Ha ha2, boolean z10, int i10, tn.i iVar) {
        this(ha2, (i10 & 2) != 0 ? false : z10);
    }

    @Override // com.ironsource.M0
    public void a(@Nullable IronSourceError ironSourceError) {
        this.f29675a.a("Received load failed before load");
    }

    @Override // com.ironsource.M0
    public void a(@NotNull C4258t0 c4258t0) {
        tn.p.k(c4258t0, "adUnitCallback");
        this.f29675a.a("Received load success before load");
    }

    @Override // com.ironsource.Ra
    public void b() {
        L2 l2A = this.f29675a.j().a(true);
        this.f29675a.a((Ra) new Ma(this.f29675a, l2A, this.f29676b));
        l2A.a(this.f29675a.g());
    }

    @Override // com.ironsource.Ra
    public void c() {
        Ha ha2 = this.f29675a;
        ha2.a((Ra) new Ka(ha2));
    }

    @Override // com.ironsource.Ra
    public void d() {
        this.f29676b = true;
    }

    @Override // com.ironsource.Ra
    public void f() {
        this.f29676b = false;
    }
}
