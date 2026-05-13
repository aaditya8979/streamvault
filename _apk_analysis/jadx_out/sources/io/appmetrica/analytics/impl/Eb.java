package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Eb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class Eb implements InterfaceC4691c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4795g0 f65191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final En f65192b = new En();

    public Eb(@NotNull InterfaceC4795g0 interfaceC4795g0) {
        this.f65191a = interfaceC4795g0;
    }

    public static final void a(Eb eb2, V v10) {
        eb2.f65191a.a(v10);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4691c
    public final void onAppNotResponding() {
        StackTraceElement[] stackTraceElementArrB;
        En en2 = this.f65192b;
        Thread threadA = en2.f65222a.a();
        try {
            stackTraceElementArrB = en2.f65222a.b();
            if (stackTraceElementArrB == null) {
                try {
                    stackTraceElementArrB = threadA.getStackTrace();
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            stackTraceElementArrB = null;
        }
        final V v10 = new V((C5246xn) en2.f65223b.apply(threadA, stackTraceElementArrB), en2.a(threadA, null), en2.f65224c.a());
        ((A9) C4696c4.l().f66453c.a()).f64970b.post(new Runnable() { // from class: mh.b
            @Override // java.lang.Runnable
            public final void run() {
                Eb.a(this.f74251b, v10);
            }
        });
    }
}
