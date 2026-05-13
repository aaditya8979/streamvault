package io.appmetrica.analytics.impl;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class O4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5253y5 f65681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Fc f65682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Fc f65683c;

    public O4(@NotNull M6 m62, @NotNull Rg rg2) {
        C5162ue c5162ue = new C5162ue(m62);
        this.f65681a = new C5253y5(m62);
        this.f65682b = new Fc(c5162ue, new N4(rg2));
        this.f65683c = new Fc(c5162ue, M4.f65561a);
    }

    @NotNull
    public final List<G8> a() {
        return cn.w.p(this.f65681a, this.f65682b);
    }

    @NotNull
    public final List<G8> b() {
        return cn.v.e(this.f65683c);
    }
}
