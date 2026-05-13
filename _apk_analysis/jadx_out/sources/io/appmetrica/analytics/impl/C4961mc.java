package io.appmetrica.analytics.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.mc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4961mc implements InterfaceC4825h4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC4825h4
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C4986nc a(@NotNull Context context, @NotNull C4748e5 c4748e5, @NotNull Q3 q32, @NotNull C5053q4 c5053q4) {
        Cg cg2;
        C5011oc c5011oc = new C5011oc(q32.f65784b, q32.f65783a);
        Dg dg2 = new Dg(new C5085rc());
        synchronized (c4748e5) {
            cg2 = (Cg) c4748e5.a(c5011oc, c5053q4, dg2, c4748e5.f66651a);
        }
        return new C4986nc(context, cg2);
    }
}
