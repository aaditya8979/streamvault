package com.inmobi.media;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public final class E8 implements Vf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F8 f25370a;

    public E8(F8 f82) {
        this.f25370a = f82;
    }

    @Override // com.inmobi.media.Vf
    public final Object a(Xf xf2, hn.c cVar) {
        WeakReference weakReference = (WeakReference) this.f25370a.f27355b.get(xf2.f26595a.f26255h);
        InterfaceC3412fg interfaceC3412fg = weakReference != null ? (InterfaceC3412fg) weakReference.get() : null;
        if (!AbstractC3283ag.a(xf2)) {
            Object objA = this.f25370a.a(xf2, interfaceC3412fg, cVar);
            return objA == in.a.g() ? objA : bn.r.f5635a;
        }
        F8 f82 = this.f25370a;
        f82.getClass();
        AbstractC3487ig.a(xf2, interfaceC3412fg);
        Object objA2 = f82.f27354a.f27793a.a("pings", "id=?", new String[]{xf2.f26595a.f26249b}, cVar);
        if (objA2 != in.a.g()) {
            objA2 = bn.r.f5635a;
        }
        if (objA2 != in.a.g()) {
            objA2 = bn.r.f5635a;
        }
        return objA2 == in.a.g() ? objA2 : bn.r.f5635a;
    }
}
