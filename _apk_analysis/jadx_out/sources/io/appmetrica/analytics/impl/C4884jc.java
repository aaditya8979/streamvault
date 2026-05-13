package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.impl.C4884jc;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.jc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4884jc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67029a = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4742e f67030b;

    public C4884jc(InterfaceC4795g0 interfaceC4795g0) {
        this.f67030b = new C4742e(new Eb(interfaceC4795g0));
    }

    public static final void b(AnrListener anrListener) {
        anrListener.onAppNotResponding();
    }

    public final void a(final AnrListener anrListener) {
        C4742e c4742e = this.f67030b;
        c4742e.f66634a.add(new InterfaceC4691c() { // from class: mh.i0
            @Override // io.appmetrica.analytics.impl.InterfaceC4691c
            public final void onAppNotResponding() {
                C4884jc.b(anrListener);
            }
        });
    }
}
