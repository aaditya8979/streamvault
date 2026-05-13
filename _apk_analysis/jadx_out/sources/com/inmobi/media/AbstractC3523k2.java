package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.k2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC3523k2 implements InterfaceC3338cj, InterfaceC3421g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC3721s1 f27440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3828w8 f27441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ac f27442c;

    public AbstractC3523k2(AbstractC3721s1 abstractC3721s1, InterfaceC3828w8 interfaceC3828w8, Ac ac2) {
        tn.p.k(interfaceC3828w8, "adManagerComponent");
        tn.p.k(ac2, "stateMachine");
        this.f27440a = abstractC3721s1;
        this.f27441b = interfaceC3828w8;
        this.f27442c = ac2;
    }

    @Override // com.inmobi.media.InterfaceC3338cj
    public final void c() {
    }

    @Override // com.inmobi.media.InterfaceC3421g
    public final void j() {
        this.f27442c.a(new C3700r5(this.f27441b), this);
    }
}
