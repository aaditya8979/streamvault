package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class K9 implements InterfaceC4164n9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3957c1 f29730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final H9 f29731b;

    public K9(@NotNull C3957c1 c3957c1, @NotNull H9 h92) {
        tn.p.k(c3957c1, "adapterConfig");
        tn.p.k(h92, "adFormatConfigurations");
        this.f29730a = c3957c1;
        this.f29731b = h92;
    }

    @Override // com.ironsource.InterfaceC3975d1
    public boolean a() {
        return true;
    }

    @Override // com.ironsource.InterfaceC4257t
    public long b() {
        return this.f29731b.e();
    }

    @Override // com.ironsource.InterfaceC3975d1
    @NotNull
    public String c() {
        String strF = this.f29730a.f();
        tn.p.j(strF, "adapterConfig.providerName");
        return strF;
    }

    @Override // com.ironsource.InterfaceC3975d1
    public boolean d() {
        return !this.f29730a.j();
    }

    @Override // com.ironsource.InterfaceC3975d1
    @NotNull
    public String e() {
        String strA = this.f29730a.a();
        tn.p.j(strA, "adapterConfig.adSourceNameForEvents");
        return strA;
    }

    @Override // com.ironsource.InterfaceC3975d1
    @NotNull
    public EnumC4200p9 f() {
        return EnumC4200p9.f33244b.a(this.f29730a.d());
    }
}
