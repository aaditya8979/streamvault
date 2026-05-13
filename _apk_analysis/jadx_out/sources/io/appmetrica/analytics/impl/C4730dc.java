package io.appmetrica.analytics.impl;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.dc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4730dc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rg f66597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5107s9 f66598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5028p4 f66599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Xe f66600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final O4 f66601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C5210wc f66602f = new C5210wc();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bn.g f66603g = kotlin.b.b(new C4704cc(this));

    public C4730dc(@NotNull M6 m62, @NotNull Rg rg2, @NotNull InterfaceC5107s9 interfaceC5107s9, @NotNull C5028p4 c5028p4, @NotNull Xe xe2) {
        this.f66597a = rg2;
        this.f66598b = interfaceC5107s9;
        this.f66599c = c5028p4;
        this.f66600d = xe2;
        this.f66601e = new O4(m62, rg2);
    }

    @NotNull
    public final List<G8> a() {
        return this.f66601e.a();
    }

    @NotNull
    public final List<G8> b() {
        return cn.f0.O0(cn.v.e(this.f66601e.f65683c), cn.v.e((G8) this.f66603g.getValue()));
    }
}
