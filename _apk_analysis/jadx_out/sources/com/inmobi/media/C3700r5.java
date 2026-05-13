package com.inmobi.media;

import com.inmobi.media.C3700r5;

/* JADX INFO: renamed from: com.inmobi.media.r5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3700r5 implements InterfaceC3338cj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Fc f28029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC3721s1 f28030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC3828w8 f28031c;

    public C3700r5(Fc fc2, AbstractC3721s1 abstractC3721s1, InterfaceC3828w8 interfaceC3828w8) {
        this.f28029a = fc2;
        this.f28030b = abstractC3721s1;
        this.f28031c = interfaceC3828w8;
    }

    public C3700r5(InterfaceC3828w8 interfaceC3828w8) {
        this.f28029a = null;
        this.f28030b = null;
        this.f28031c = interfaceC3828w8;
    }

    public static final bn.r a(C3700r5 c3700r5, Throwable th2) {
        InterfaceC3580m9 interfaceC3580m9C;
        InterfaceC3828w8 interfaceC3828w8 = c3700r5.f28031c;
        if (interfaceC3828w8 != null && (interfaceC3580m9C = interfaceC3828w8.c()) != null) {
            ((C3605n9) interfaceC3580m9C).a();
        }
        InterfaceC3828w8 interfaceC3828w82 = c3700r5.f28031c;
        F3.a(interfaceC3828w82 != null ? interfaceC3828w82.a() : null);
        c3700r5.f28030b = null;
        c3700r5.f28031c = null;
        c3700r5.f28029a = null;
        return bn.r.f5635a;
    }

    @Override // com.inmobi.media.InterfaceC3338cj
    public final void a() {
        p000do.l0 l0VarA;
        kotlinx.coroutines.g gVarD;
        InterfaceC3580m9 interfaceC3580m9C;
        InterfaceC3828w8 interfaceC3828w8 = this.f28031c;
        if (interfaceC3828w8 != null && (interfaceC3580m9C = interfaceC3828w8.c()) != null) {
            ((C3605n9) interfaceC3580m9C).a("AUM-DestroyedState", "Initialize Called");
        }
        InterfaceC3828w8 interfaceC3828w82 = this.f28031c;
        if (interfaceC3828w82 == null || (l0VarA = interfaceC3828w82.a()) == null || (gVarD = p000do.i.d(l0VarA, null, null, new C3676q5(this, null), 3, null)) == null) {
            return;
        }
        gVarD.f(new sn.l() { // from class: n9.da
            @Override // sn.l
            public final Object invoke(Object obj) {
                return C3700r5.a(this.f75340b, (Throwable) obj);
            }
        });
    }

    @Override // com.inmobi.media.InterfaceC3338cj
    public final void c() {
    }
}
