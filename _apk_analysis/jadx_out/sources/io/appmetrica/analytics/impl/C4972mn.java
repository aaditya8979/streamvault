package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.mn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C4972mn implements InterfaceC4969mk, InterfaceC5207w9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fa f67308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ll f67309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f67310c = new AtomicBoolean(false);

    public C4972mn(@NotNull Fa fa2, @NotNull Ll ll2) {
        this.f67308a = fa2;
        this.f67309b = ll2;
        Objects.toString(fa2.b());
    }

    public void a() {
    }

    public final void a(@NotNull NetworkTask networkTask) {
        C5009oa.I.getClass();
        NetworkServiceLocator.getInstance().getNetworkCore().startTask(networkTask);
    }

    public final void b() {
        if (this.f67310c.get()) {
            return;
        }
        g();
    }

    public final void c() {
        if (this.f67310c.get()) {
            return;
        }
        f();
        a();
    }

    @NotNull
    public final Fa d() {
        return this.f67308a;
    }

    public final boolean e() {
        return this.f67310c.get();
    }

    public void f() {
        this.f67309b.a();
    }

    public void g() {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4969mk
    public final void onCreate() {
        this.f67310c.compareAndSet(true, false);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4969mk
    public final void onDestroy() {
        if (this.f67310c.compareAndSet(false, true)) {
            a();
        }
    }
}
