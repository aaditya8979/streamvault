package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public final class P1 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f65730e = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ga f65731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5104s6 f65732b = C4696c4.l().n();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5030p6 f65733c = new C5030p6();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final En f65734d = new En();

    public P1(C4930l6 c4930l6) {
        this.f65731a = c4930l6;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        try {
            f65730e.set(true);
            Ga ga2 = this.f65731a;
            C5246xn c5246xnApply = this.f65733c.apply(thread);
            En en2 = this.f65734d;
            Thread threadA = en2.f65222a.a();
            ArrayList arrayListA = en2.a(threadA, thread);
            if (thread != threadA) {
                StackTraceElement[] stackTraceElementArrB = null;
                try {
                    stackTraceElementArrB = en2.f65222a.b();
                    if (stackTraceElementArrB == null) {
                        stackTraceElementArrB = threadA.getStackTrace();
                    }
                } catch (SecurityException unused) {
                }
                arrayListA.add(0, (C5246xn) en2.f65223b.apply(threadA, stackTraceElementArrB));
            }
            ga2.a(th2, new V(c5246xnApply, arrayListA, this.f65732b.f67665a.a()));
        } catch (Throwable th3) {
            LoggerStorage.getMainPublicOrAnonymousLogger().error(th3, th3.getMessage(), new Object[0]);
        }
    }
}
