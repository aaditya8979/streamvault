package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.d6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3980d6 implements InterfaceC4145ma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Qe f31450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f31451b;

    public C3980d6(@NotNull InterfaceC4180o7 interfaceC4180o7, @NotNull Qe qe2) {
        tn.p.k(interfaceC4180o7, "applicationLifecycleService");
        tn.p.k(qe2, "task");
        this.f31450a = qe2;
        interfaceC4180o7.a(this);
        f();
    }

    private final long e() {
        return System.currentTimeMillis() - this.f31451b;
    }

    private final void f() {
        this.f31451b = System.currentTimeMillis();
    }

    @Override // com.ironsource.InterfaceC4145ma
    public void a() {
        this.f31450a.a(Long.valueOf(e()));
        this.f31450a.run();
    }

    @Override // com.ironsource.InterfaceC4145ma
    public void b() {
        f();
    }

    @Override // com.ironsource.InterfaceC4145ma
    public void c() {
    }

    @Override // com.ironsource.InterfaceC4145ma
    public void d() {
    }
}
