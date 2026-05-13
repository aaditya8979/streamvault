package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f65804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProtobufStateStorage f65805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S7 f65806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC4716co f65807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Jm f65808e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Vi f65809f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Ti f65810g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final A6 f65811h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public R7 f65812i;

    public Q7(Context context, ProtobufStateStorage protobufStateStorage, S7 s72, InterfaceC4716co interfaceC4716co, Jm jm2, Vi vi2, Ti ti2, A6 a62, R7 r72) {
        this.f65804a = context;
        this.f65805b = protobufStateStorage;
        this.f65806c = s72;
        this.f65807d = interfaceC4716co;
        this.f65808e = jm2;
        this.f65809f = vi2;
        this.f65810g = ti2;
        this.f65811h = a62;
        this.f65812i = r72;
    }

    @NotNull
    public final synchronized R7 a() {
        return this.f65812i;
    }

    @NotNull
    public final U7 a(@NotNull U7 u72) {
        U7 u7C;
        this.f65811h.a(this.f65804a);
        synchronized (this) {
            b(u72);
            u7C = c();
        }
        return u7C;
    }

    @NotNull
    public final U7 b() {
        this.f65811h.a(this.f65804a);
        return c();
    }

    public final synchronized boolean b(@NotNull U7 u72) {
        boolean z10;
        if (u72.a() == T7.f65925b) {
            return false;
        }
        if (tn.p.f(u72, this.f65812i.b())) {
            return false;
        }
        List listA = (List) this.f65807d.mo2invoke(this.f65812i.a(), u72);
        boolean z11 = listA != null;
        if (listA == null) {
            listA = this.f65812i.a();
        }
        if (this.f65806c.a(u72, this.f65812i.b())) {
            z10 = true;
        } else {
            u72 = (U7) this.f65812i.b();
            z10 = false;
        }
        if (z10 || z11) {
            R7 r72 = this.f65812i;
            R7 r73 = (R7) this.f65808e.mo2invoke(u72, listA);
            this.f65812i = r73;
            this.f65805b.save(r73);
            AbstractC4814gj.a("Update distribution data: %s -> %s", r72, this.f65812i);
        }
        return z10;
    }

    public final synchronized U7 c() {
        if (!this.f65810g.a()) {
            U7 u72 = (U7) this.f65809f.invoke();
            this.f65810g.b();
            if (u72 != null) {
                b(u72);
            }
        }
        return (U7) this.f65812i.b();
    }
}
