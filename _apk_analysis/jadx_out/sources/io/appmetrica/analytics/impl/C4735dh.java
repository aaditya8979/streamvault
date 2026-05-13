package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.dh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4735dh extends Sg {
    public C4735dh(@NotNull Y4 y42) {
        super(y42);
    }

    @Override // io.appmetrica.analytics.impl.Sg
    public final boolean a(@NotNull Q5 q52) {
        Ek ekB;
        Uk uk2;
        C4933l9 c4933l9 = this.f65880a.f66227n;
        Sk sk2 = c4933l9.f67197c;
        if (sk2.f65889g == 0) {
            ekB = sk2.f65886d.b();
            Ek ekB2 = sk2.f65887e.b();
            if ((ekB == null ? -1L : ekB.f65208d) <= (ekB2 != null ? ekB2.f65208d : -1L)) {
                ekB = ekB2;
            }
        } else {
            ekB = sk2.f65888f;
        }
        if (ekB != null) {
            uk2 = new Uk();
            uk2.f66011a = ekB.f65208d;
            long andIncrement = ekB.f65210f.getAndIncrement();
            Vk vk2 = ekB.f65206b;
            vk2.a(Vk.f66053g, Long.valueOf(ekB.f65210f.get()));
            vk2.b();
            uk2.f66012b = andIncrement;
            uk2.f66013c = TimeUnit.MILLISECONDS.toSeconds(ekB.f65214j);
            uk2.f66014d = ekB.f65207c.f65330a;
        } else {
            long j10 = q52.f65797j;
            long jA = sk2.f65884b.a();
            M6 m62 = sk2.f65883a.f66218e;
            Wk wk2 = Wk.BACKGROUND;
            m62.a(jA, wk2, j10);
            Uk uk3 = new Uk();
            uk3.f66011a = jA;
            uk3.f66014d = wk2;
            uk3.f66012b = 0L;
            uk3.f66013c = 0L;
            uk2 = uk3;
        }
        c4933l9.a(q52, uk2);
        return false;
    }
}
