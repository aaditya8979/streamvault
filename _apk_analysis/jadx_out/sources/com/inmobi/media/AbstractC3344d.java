package com.inmobi.media;

import com.inmobi.media.AbstractC3344d;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.inmobi.media.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3344d {
    public static void a(final sn.a aVar) {
        tn.p.k(aVar, "execute");
        bn.g gVar = E0.f25352a;
        sn.a aVar2 = new sn.a() { // from class: n9.n6
            @Override // sn.a
            public final Object invoke() {
                return AbstractC3344d.b(aVar);
            }
        };
        tn.p.k(aVar2, "execute");
        p000do.l0 l0VarA = E0.f25357f;
        if (l0VarA == null) {
            tn.p.k("AdQualityComponent-aqBeacon", "name");
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new B9("AdQualityComponent-aqBeacon", false));
            tn.p.j(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
            l0VarA = kotlinx.coroutines.d.a(p000do.l1.c(executorServiceNewSingleThreadExecutor).plus(p000do.j2.b(null, 1, null)));
            E0.f25357f = l0VarA;
        }
        p000do.i.d(l0VarA, null, null, new C0(aVar2, null), 3, null);
    }

    public static final bn.r b(sn.a aVar) {
        aVar.invoke();
        return bn.r.f5635a;
    }
}
