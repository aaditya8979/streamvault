package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.l5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4929l5 implements InterfaceC5082r9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5207w9 f67186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f67187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f67188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f67189d;

    public C4929l5(@NotNull InterfaceC5207w9 interfaceC5207w9, @NotNull List<? extends G8> list, @NotNull List<? extends G8> list2, @NotNull R4 r42) {
        this.f67186a = interfaceC5207w9;
        this.f67187b = list;
        this.f67188c = list2;
        Objects.toString(r42);
        this.f67189d = new AtomicBoolean(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            r3 = this;
            java.util.List r0 = r3.f67188c
            boolean r1 = r0.isEmpty()
            r2 = 1
            if (r1 != 0) goto L27
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L10
            goto L27
        L10:
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r0.next()
            io.appmetrica.analytics.impl.G8 r1 = (io.appmetrica.analytics.impl.G8) r1
            boolean r1 = r1.b()
            if (r1 != 0) goto L14
            goto L4e
        L27:
            java.util.List r0 = r3.f67187b
            boolean r1 = r0.isEmpty()
            r1 = r1 ^ r2
            if (r1 == 0) goto L4e
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L37
            goto L4e
        L37:
            java.util.Iterator r0 = r0.iterator()
        L3b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4e
            java.lang.Object r1 = r0.next()
            io.appmetrica.analytics.impl.G8 r1 = (io.appmetrica.analytics.impl.G8) r1
            boolean r1 = r1.b()
            if (r1 == 0) goto L3b
            goto L4f
        L4e:
            r2 = 0
        L4f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4929l5.a():boolean");
    }

    public final void b() {
        this.f67189d.set(false);
    }

    public final void c() {
        this.f67189d.set(true);
    }

    public final void d() {
        if (this.f67189d.get()) {
            List list = this.f67188c;
            if (!list.isEmpty() && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((G8) it.next()).b()) {
                        return;
                    }
                }
            }
            ((C4972mn) this.f67186a).c();
        }
    }

    public final void e() {
        if (this.f67189d.get() && a()) {
            ((C4972mn) this.f67186a).c();
        }
    }

    public final void f() {
        if (this.f67189d.get() && a()) {
            ((C4972mn) this.f67186a).b();
        }
    }
}
