package com.inmobi.media;

import android.view.ViewGroup;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: loaded from: classes9.dex */
public final class V6 implements go.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p000do.l0 f26482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f26483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f26484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final go.l f26485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3580m9 f26486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.g f26487f;

    public V6(long j10, ViewGroup viewGroup, InterfaceC3580m9 interfaceC3580m9, p000do.l0 l0Var, go.l lVar) {
        tn.p.k(l0Var, "coroutineScope");
        tn.p.k(viewGroup, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        tn.p.k(lVar, "visibilityStateFlow");
        this.f26482a = l0Var;
        this.f26483b = viewGroup;
        this.f26484c = j10;
        this.f26485d = lVar;
        this.f26486e = interfaceC3580m9;
    }

    public final bn.r a(boolean z10) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26486e;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("WindowLifecycleHandler", "FocusStateCollector - window focus changed: " + z10);
        }
        if (z10) {
            InterfaceC3580m9 interfaceC3580m92 = this.f26486e;
            if (interfaceC3580m92 != null) {
                ((C3605n9) interfaceC3580m92).a("WindowLifecycleHandler", "FocusStateCollector - window gained focus, stopping polling");
            }
            H6.a(this.f26487f);
            this.f26487f = null;
        } else {
            InterfaceC3580m9 interfaceC3580m93 = this.f26486e;
            if (interfaceC3580m93 != null) {
                ((C3605n9) interfaceC3580m93).a("WindowLifecycleHandler", "FocusStateCollector - window lost focus, starting polling");
            }
            this.f26487f = p000do.i.d(this.f26482a, null, null, new U6(this, null), 3, null);
        }
        boolean z11 = this.f26483b.getWindowVisibility() == 0;
        InterfaceC3580m9 interfaceC3580m94 = this.f26486e;
        if (interfaceC3580m94 != null) {
            ((C3605n9) interfaceC3580m94).a("WindowLifecycleHandler", "FocusStateCollector - setting visibility state: " + z11);
        }
        this.f26485d.setValue(jn.a.a(z11));
        return bn.r.f5635a;
    }

    @Override // go.e
    public final /* bridge */ /* synthetic */ Object emit(Object obj, hn.c cVar) {
        return a(((Boolean) obj).booleanValue());
    }
}
