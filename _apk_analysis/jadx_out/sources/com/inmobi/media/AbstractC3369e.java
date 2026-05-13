package com.inmobi.media;

import com.inmobi.media.AbstractC3369e;

/* JADX INFO: renamed from: com.inmobi.media.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3369e {
    public static final bn.r a(sn.a aVar, M0 m02, Eg eg2) {
        try {
            if (((Boolean) aVar.invoke()).booleanValue()) {
                Object objA = m02.a();
                if (eg2 != null) {
                    eg2.a(objA);
                }
            } else if (eg2 != null) {
                eg2.onError(new Exception("Capture Aborted: Should Capture not satisfied"));
            }
        } catch (Exception e10) {
            if (eg2 != null) {
                eg2.onError(e10);
            }
        }
        return bn.r.f5635a;
    }

    public static void a(final M0 m02, final Eg eg2, Long l10, final sn.a aVar) {
        tn.p.k(m02, "process");
        tn.p.k(aVar, "shouldProcess");
        bn.g gVar = E0.f25352a;
        long jLongValue = l10 != null ? l10.longValue() : 0L;
        sn.a aVar2 = new sn.a() { // from class: n9.q6
            @Override // sn.a
            public final Object invoke() {
                return AbstractC3369e.a(aVar, m02, eg2);
            }
        };
        tn.p.k(aVar2, "execute");
        p000do.l0 l0VarA = E0.f25356e;
        if (l0VarA == null) {
            l0VarA = kotlinx.coroutines.d.a(p000do.w0.a().plus(p000do.j2.b(null, 1, null)));
            E0.f25356e = l0VarA;
        }
        p000do.i.d(l0VarA, null, null, new D0(jLongValue, aVar2, null), 3, null);
    }

    public static final boolean a() {
        return true;
    }
}
