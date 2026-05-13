package io.appmetrica.analytics.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.mj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4968mj implements InterfaceC4825h4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC4825h4
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C4865ij a(@NotNull Context context, @NotNull C4748e5 c4748e5, @NotNull Q3 q32, @NotNull C5053q4 c5053q4) {
        Cg cg2;
        R4 r42 = new R4(q32.f65784b, q32.f65783a);
        synchronized (c4748e5) {
            cg2 = (Cg) c4748e5.f66651a.get(r42.toString());
        }
        return new C4865ij(cg2);
    }
}
