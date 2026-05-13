package com.inmobi.media;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.inmobi.media.n5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3601n5 implements Vf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3651p5 f27671a;

    public C3601n5(C3651p5 c3651p5) {
        this.f27671a = c3651p5;
    }

    @Override // com.inmobi.media.Vf
    public final Object a(Xf xf2, hn.c cVar) {
        WeakReference weakReference = (WeakReference) this.f27671a.f27355b.get(xf2.f26595a.f26255h);
        InterfaceC3412fg interfaceC3412fg = weakReference != null ? (InterfaceC3412fg) weakReference.get() : null;
        if (!AbstractC3283ag.a(xf2)) {
            Object objA = this.f27671a.a(xf2, interfaceC3412fg, cVar);
            return objA == in.a.g() ? objA : bn.r.f5635a;
        }
        C3651p5 c3651p5 = this.f27671a;
        c3651p5.getClass();
        AbstractC3487ig.a(xf2, interfaceC3412fg);
        Object objA2 = c3651p5.f27354a.f27793a.a("pings", "id=?", new String[]{xf2.f26595a.f26249b}, cVar);
        if (objA2 != in.a.g()) {
            objA2 = bn.r.f5635a;
        }
        if (objA2 != in.a.g()) {
            objA2 = bn.r.f5635a;
        }
        return objA2 == in.a.g() ? objA2 : bn.r.f5635a;
    }
}
