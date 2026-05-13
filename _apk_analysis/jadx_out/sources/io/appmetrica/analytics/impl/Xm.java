package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class Xm implements InterfaceC4793fo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f66204a;

    public Xm(@NotNull String str, @NotNull List<String> list, int i10, @NotNull Mn mn2, @NotNull to toVar, @NotNull K2 k22) {
        List listY0 = cn.f0.Y0(cn.f0.g1(cn.f0.l1(list)), i10);
        ArrayList arrayList = new ArrayList(cn.x.x(listY0, 10));
        int i11 = 0;
        for (Object obj : listY0) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                cn.w.w();
            }
            arrayList.add(new Zm(str + '_' + i11, (String) obj, mn2, toVar, k22));
            i11 = i12;
        }
        this.f66204a = arrayList;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4793fo
    public final void a(@NotNull C4767eo c4767eo) {
        Iterator it = this.f66204a.iterator();
        while (it.hasNext()) {
            ((Zm) it.next()).a(c4767eo);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4793fo
    public final void a(@NotNull PublicLogger publicLogger) {
        Iterator it = this.f66204a.iterator();
        while (it.hasNext()) {
            ((Zm) it.next()).f65041e = publicLogger;
        }
    }
}
