package com.ironsource;

import com.ironsource.AbstractC4211q3;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class Gg<Smash extends AbstractC4211q3<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Lg<Smash> f29477a;

    public Gg(@NotNull Lg<Smash> lg2) {
        tn.p.k(lg2, "smashPicker");
        this.f29477a = lg2;
    }

    @NotNull
    public final List<Smash> a() {
        return this.f29477a.c();
    }

    public final boolean b() {
        return this.f29477a.c().isEmpty() && this.f29477a.a().isEmpty();
    }

    public final boolean c() {
        return this.f29477a.d() == 0;
    }
}
