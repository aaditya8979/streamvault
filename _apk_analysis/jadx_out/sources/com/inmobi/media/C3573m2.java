package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.m2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3573m2 implements go.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3722s2 f27592a;

    public C3573m2(p000do.l0 l0Var, AbstractC3722s2 abstractC3722s2) {
        this.f27592a = abstractC3722s2;
    }

    @Override // go.e
    public final Object emit(Object obj, hn.c cVar) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        this.f27592a.getClass();
        this.f27592a.f28089e.set(zBooleanValue);
        AbstractC3722s2 abstractC3722s2 = this.f27592a;
        if (abstractC3722s2.f28089e.get()) {
            C3836wg c3836wg = abstractC3722s2.c().f25231a;
            c3836wg.f28447f.set(false);
            c3836wg.a();
        } else {
            C3836wg c3836wg2 = abstractC3722s2.c().f25231a;
            c3836wg2.f28443b.setValue(Mn.f25977a);
            c3836wg2.f28447f.set(true);
            H6.a(c3836wg2.f28446e);
            c3836wg2.f28446e = null;
        }
        AbstractC3722s2 abstractC3722s22 = this.f27592a;
        if (abstractC3722s22.f28089e.get()) {
            abstractC3722s22.f28091g.a();
        } else {
            abstractC3722s22.f28091g.b();
        }
        return bn.r.f5635a;
    }
}
