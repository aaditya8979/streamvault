package com.inmobi.media;

/* JADX INFO: loaded from: classes8.dex */
public final class L1 implements go.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M1 f25843a;

    public L1(M1 m12) {
        this.f25843a = m12;
    }

    public final bn.r a(boolean z10) {
        InterfaceC3580m9 interfaceC3580m9 = this.f25843a.f25922e;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("WindowLifecycleHandler", "startObservingVisibility - Window visibility changed: " + z10);
        }
        this.f25843a.f25920c.setValue(jn.a.a(z10));
        return bn.r.f5635a;
    }

    @Override // go.e
    public final /* bridge */ /* synthetic */ Object emit(Object obj, hn.c cVar) {
        return a(((Boolean) obj).booleanValue());
    }
}
