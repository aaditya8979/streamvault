package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class Z2 implements InterfaceC4164n9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3957c1 f30760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final U2 f30761b;

    public Z2(@NotNull C3957c1 c3957c1, @NotNull U2 u22) {
        tn.p.k(c3957c1, "adapterConfig");
        tn.p.k(u22, "adFormatConfigurations");
        this.f30760a = c3957c1;
        this.f30761b = u22;
    }

    @Override // com.ironsource.InterfaceC3975d1
    public boolean a() {
        return true;
    }

    @Override // com.ironsource.InterfaceC4257t
    public long b() {
        return this.f30761b.b();
    }

    @Override // com.ironsource.InterfaceC3975d1
    @NotNull
    public String c() {
        String strF = this.f30760a.f();
        tn.p.j(strF, "adapterConfig.providerName");
        return strF;
    }

    @Override // com.ironsource.InterfaceC3975d1
    public boolean d() {
        return !this.f30760a.j();
    }

    @Override // com.ironsource.InterfaceC3975d1
    @NotNull
    public String e() {
        String strA = this.f30760a.a();
        tn.p.j(strA, "adapterConfig.adSourceNameForEvents");
        return strA;
    }

    @Override // com.ironsource.InterfaceC3975d1
    @NotNull
    public EnumC4200p9 f() {
        return EnumC4200p9.f33244b.a(this.f30760a.d());
    }
}
