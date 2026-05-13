package io.appmetrica.analytics.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class Dh implements InterfaceC4825h4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z4 f65157a;

    public Dh(@NotNull Z4 z42) {
        this.f65157a = z42;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4825h4
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Bg a(@NotNull Context context, @NotNull C4748e5 c4748e5, @NotNull Q3 q32, @NotNull C5053q4 c5053q4) {
        Cg cg2;
        R4 r42 = new R4(q32.f65784b, q32.f65783a);
        Dg dg2 = new Dg(this.f65157a);
        synchronized (c4748e5) {
            cg2 = (Cg) c4748e5.a(r42, c5053q4, dg2, c4748e5.f66651a);
        }
        return new Bg(context, cg2);
    }
}
