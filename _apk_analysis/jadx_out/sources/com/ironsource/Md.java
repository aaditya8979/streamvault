package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class Md implements InterfaceC4164n9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3957c1 f29845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Zd f29846b;

    public Md(@NotNull C3957c1 c3957c1, @NotNull Zd zd2) {
        tn.p.k(c3957c1, "adapterConfig");
        tn.p.k(zd2, "adFormatConfigurations");
        this.f29845a = c3957c1;
        this.f29846b = zd2;
    }

    @Override // com.ironsource.InterfaceC3975d1
    public boolean a() {
        return true;
    }

    @Override // com.ironsource.InterfaceC4257t
    public long b() {
        return this.f29846b.i();
    }

    @Override // com.ironsource.InterfaceC3975d1
    @NotNull
    public String c() {
        String strF = this.f29845a.f();
        tn.p.j(strF, "adapterConfig.providerName");
        return strF;
    }

    @Override // com.ironsource.InterfaceC3975d1
    public boolean d() {
        return !this.f29845a.j();
    }

    @Override // com.ironsource.InterfaceC3975d1
    @NotNull
    public String e() {
        String strA = this.f29845a.a();
        tn.p.j(strA, "adapterConfig.adSourceNameForEvents");
        return strA;
    }

    @Override // com.ironsource.InterfaceC3975d1
    @NotNull
    public EnumC4200p9 f() {
        return EnumC4200p9.f33244b.a(this.f29845a.d());
    }
}
