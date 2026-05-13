package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.qf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C4223qf extends Eg {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Vc f33359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final yg f33360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final G f33361f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4223qf(@NotNull W0 w02, @NotNull Vc vc2, @NotNull yg ygVar, @NotNull G g10) {
        super(w02, vc2);
        tn.p.k(w02, "adTools");
        tn.p.k(vc2, "outcomeReporter");
        tn.p.k(ygVar, "waterfallInstances");
        tn.p.k(g10, "adInstanceLoadStrategy");
        this.f33359d = vc2;
        this.f33360e = ygVar;
        this.f33361f = g10;
    }

    @Override // com.ironsource.Eg
    public void a() {
        A a10 = this.f33361f.c().a();
        if (a10 != null) {
            this.f33359d.a(this.f33360e.b(), a10);
        }
    }

    @Override // com.ironsource.Eg
    public void a(@NotNull A a10) {
        A a11;
        tn.p.k(a10, C4157n2.f33007p);
        if (this.f33361f.a(a10)) {
            this.f33359d.a(this.f33360e.b(), a10);
        } else {
            if (!this.f33361f.a() || (a11 = this.f33361f.c().a()) == null) {
                return;
            }
            this.f33359d.a(this.f33360e.b(), a11);
        }
    }

    @Override // com.ironsource.Eg
    public void b(@NotNull A a10) {
        tn.p.k(a10, C4157n2.f33007p);
    }

    @Override // com.ironsource.Eg
    public void c(@NotNull A a10) {
        tn.p.k(a10, "instanceToShow");
        this.f33359d.a(this.f33360e.b(), a10);
    }
}
