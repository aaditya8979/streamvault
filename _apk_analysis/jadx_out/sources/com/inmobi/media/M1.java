package com.inmobi.media;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes9.dex */
public final class M1 implements go.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p000do.l0 f25918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f25919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final go.l f25920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f25921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3580m9 f25922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.g f25923f;

    public M1(long j10, ViewGroup viewGroup, InterfaceC3580m9 interfaceC3580m9, p000do.l0 l0Var, go.l lVar) {
        tn.p.k(l0Var, "coroutineScope");
        tn.p.k(viewGroup, "observableView");
        tn.p.k(lVar, "visibilityStateFlow");
        this.f25918a = l0Var;
        this.f25919b = viewGroup;
        this.f25920c = lVar;
        this.f25921d = j10;
        this.f25922e = interfaceC3580m9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
    
        if (r12.collect(r13, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d6, code lost:
    
        if (r14.collect(r2, r0) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.inmobi.media.M1 r11, android.view.ViewGroup r12, p000do.l0 r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.M1.a(com.inmobi.media.M1, android.view.ViewGroup, do.l0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final bn.r a(boolean z10) {
        InterfaceC3580m9 interfaceC3580m9 = this.f25922e;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("WindowLifecycleHandler", "AttachedStateCollector - view attachment state changed: " + z10);
        }
        if (z10) {
            InterfaceC3580m9 interfaceC3580m92 = this.f25922e;
            if (interfaceC3580m92 != null) {
                ((C3605n9) interfaceC3580m92).a("WindowLifecycleHandler", "AttachedStateCollector - starting visibility observation");
            }
            this.f25923f = p000do.i.d(this.f25918a, null, null, new J1(this, null), 3, null);
        } else {
            InterfaceC3580m9 interfaceC3580m93 = this.f25922e;
            if (interfaceC3580m93 != null) {
                ((C3605n9) interfaceC3580m93).a("WindowLifecycleHandler", "AttachedStateCollector - view detached, stopping observation");
            }
            this.f25920c.setValue(jn.a.a(false));
            H6.a(this.f25923f);
            this.f25923f = null;
        }
        return bn.r.f5635a;
    }

    @Override // go.e
    public final /* bridge */ /* synthetic */ Object emit(Object obj, hn.c cVar) {
        return a(((Boolean) obj).booleanValue());
    }
}
