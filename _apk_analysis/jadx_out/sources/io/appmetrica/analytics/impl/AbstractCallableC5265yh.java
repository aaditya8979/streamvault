package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.yh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractCallableC5265yh implements Callable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final C5240xh f68043d = new C5240xh();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5024p0 f68044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4661al f68045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f68046c;

    public AbstractCallableC5265yh(C5024p0 c5024p0, InterfaceC4661al interfaceC4661al) {
        this.f68044a = c5024p0;
        this.f68045b = interfaceC4661al;
    }

    public void a() {
        IAppMetricaService iAppMetricaService;
        try {
            if (this.f68046c) {
                return;
            }
            this.f68046c = true;
            int i10 = 0;
            do {
                C5024p0 c5024p0 = this.f68044a;
                synchronized (c5024p0) {
                    iAppMetricaService = c5024p0.f67480d;
                }
                if (iAppMetricaService != null) {
                    try {
                        a(iAppMetricaService);
                        InterfaceC4661al interfaceC4661al = this.f68045b;
                        if (interfaceC4661al == null || ((C4890ji) interfaceC4661al).a()) {
                            this.f68044a.c();
                            return;
                        }
                        return;
                    } catch (RemoteException unused) {
                    }
                }
                i10++;
                if (!c() || P1.f65730e.get()) {
                    return;
                }
            } while (i10 < 3);
        } catch (Throwable th2) {
            a(th2);
        }
    }

    public abstract void a(IAppMetricaService iAppMetricaService);

    public void a(@Nullable Throwable th2) {
    }

    public final void a(boolean z10) {
        this.f68046c = z10;
    }

    @NotNull
    public final C5024p0 b() {
        return this.f68044a;
    }

    public boolean c() {
        C5024p0 c5024p0 = this.f68044a;
        synchronized (c5024p0) {
            if (c5024p0.f67480d == null) {
                c5024p0.f67481e = new CountDownLatch(1);
                Intent intentA = c5024p0.f67484h.a(c5024p0.f67477a);
                try {
                    c5024p0.f67483g.b(c5024p0.f67477a);
                    c5024p0.f67477a.bindService(intentA, c5024p0.f67486j, 1);
                } catch (Throwable unused) {
                }
            }
        }
        this.f68044a.a(5000L);
        return true;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        a();
        return bn.r.f5635a;
    }

    public final boolean d() {
        return this.f68046c;
    }
}
