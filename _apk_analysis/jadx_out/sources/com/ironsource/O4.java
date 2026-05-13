package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class O4 extends Eg {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Vc f30036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final yg f30037e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O4(@NotNull W0 w02, @NotNull Vc vc2, @NotNull yg ygVar) {
        super(w02, vc2);
        tn.p.k(w02, "adTools");
        tn.p.k(vc2, "outcomeReporter");
        tn.p.k(ygVar, "waterfallInstances");
        this.f30036d = vc2;
        this.f30037e = ygVar;
    }

    @Override // com.ironsource.Eg
    public void a() {
    }

    @Override // com.ironsource.Eg
    public void a(@NotNull A a10) {
        tn.p.k(a10, C4157n2.f33007p);
    }

    @Override // com.ironsource.Eg
    public void b(@NotNull A a10) {
        tn.p.k(a10, C4157n2.f33007p);
        this.f30036d.a(this.f30037e.b(), a10);
    }

    @Override // com.ironsource.Eg
    public void c(@NotNull A a10) {
        tn.p.k(a10, "instanceToShow");
    }
}
