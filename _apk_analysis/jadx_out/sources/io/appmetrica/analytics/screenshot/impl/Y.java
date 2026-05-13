package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Y implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5303g f68419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f68420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f68421c;

    public Y() {
        this(null, null, null, 7, null);
    }

    public Y(@NotNull C5303g c5303g, @NotNull c0 c0Var, @NotNull r rVar) {
        this.f68419a = c5303g;
        this.f68420b = c0Var;
        this.f68421c = rVar;
    }

    public /* synthetic */ Y(C5303g c5303g, c0 c0Var, r rVar, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? new C5303g() : c5303g, (i10 & 2) != 0 ? new c0() : c0Var, (i10 & 4) != 0 ? new r() : rVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Q fromModel(@NotNull W w10) {
        Q q10 = new Q();
        C5301e c5301e = w10.f68413a;
        q10.f68406a = c5301e != null ? this.f68419a.fromModel(c5301e) : null;
        a0 a0Var = w10.f68414b;
        q10.f68407b = a0Var != null ? this.f68420b.fromModel(a0Var) : null;
        C5312p c5312p = w10.f68415c;
        q10.f68408c = c5312p != null ? this.f68421c.fromModel(c5312p) : null;
        return q10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W toModel(@NotNull Q q10) {
        C5301e c5301e;
        a0 a0Var;
        N n10 = q10.f68406a;
        if (n10 != null) {
            this.f68419a.getClass();
            c5301e = new C5301e(n10.f68397a);
        } else {
            c5301e = null;
        }
        P p10 = q10.f68407b;
        if (p10 != null) {
            this.f68420b.getClass();
            a0Var = new a0(p10.f68403a, p10.f68404b);
        } else {
            a0Var = null;
        }
        O o10 = q10.f68408c;
        return new W(c5301e, a0Var, o10 != null ? this.f68421c.toModel(o10) : null);
    }
}
