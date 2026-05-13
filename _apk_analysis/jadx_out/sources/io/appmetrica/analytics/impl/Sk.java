package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class Sk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y4 f65883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rk f65884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X4 f65885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC4794g f65886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC4794g f65887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Ek f65888f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f65889g = 0;

    public Sk(Y4 y42, Rk rk2, X4 x42, C4857ia c4857ia, A2 a22) {
        this.f65883a = y42;
        this.f65885c = x42;
        this.f65886d = c4857ia;
        this.f65887e = a22;
        this.f65884b = rk2;
    }

    public static Uk a(Ek ek2, long j10) {
        Uk uk2 = new Uk();
        uk2.f66011a = ek2.f65208d;
        long andIncrement = ek2.f65210f.getAndIncrement();
        Vk vk2 = ek2.f65206b;
        vk2.a(Vk.f66053g, Long.valueOf(ek2.f65210f.get()));
        vk2.b();
        uk2.f66012b = andIncrement;
        Vk vk3 = ek2.f65206b;
        long j11 = j10 - ek2.f65209e;
        ek2.f65214j = j11;
        vk3.a(Vk.f66051e, Long.valueOf(j11));
        uk2.f66013c = TimeUnit.MILLISECONDS.toSeconds(ek2.f65214j);
        uk2.f66014d = ek2.f65207c.f65330a;
        return uk2;
    }

    public final synchronized long a() {
        Ek ek2;
        ek2 = this.f65888f;
        return ek2 == null ? 10000000000L : ek2.f65208d - 1;
    }

    public final Ek a(Q5 q52) {
        this.f65883a.f66226m.info("Start foreground session", new Object[0]);
        long j10 = q52.f65796i;
        AbstractC4794g abstractC4794g = this.f65886d;
        Fk fk2 = new Fk(j10, q52.f65797j);
        abstractC4794g.getClass();
        Ek ekA = abstractC4794g.a(fk2);
        this.f65889g = 3;
        ((C4929l5) this.f65883a.f66229p).e();
        X4 x42 = this.f65885c;
        x42.f66147a.f66227n.a(Q5.a(q52, C5009oa.I.i()), a(ekA, j10));
        return ekA;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(io.appmetrica.analytics.impl.Ek r12, io.appmetrica.analytics.impl.Q5 r13) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Sk.a(io.appmetrica.analytics.impl.Ek, io.appmetrica.analytics.impl.Q5):boolean");
    }

    public final synchronized Ek b(Q5 q52) {
        if (this.f65889g == 0) {
            Ek ekB = this.f65886d.b();
            if (a(ekB, q52)) {
                this.f65888f = ekB;
                this.f65889g = 3;
            } else {
                Ek ekB2 = this.f65887e.b();
                if (a(ekB2, q52)) {
                    this.f65888f = ekB2;
                    this.f65889g = 2;
                } else {
                    this.f65888f = null;
                    this.f65889g = 1;
                }
            }
        }
        if (this.f65889g != 1 && !a(this.f65888f, q52)) {
            this.f65889g = 1;
            this.f65888f = null;
        }
        int iA = L7.a(this.f65889g);
        if (iA == 1) {
            Ek ek2 = this.f65888f;
            long j10 = q52.f65796i;
            ek2.f65213i = j10;
            Vk vk2 = ek2.f65206b;
            vk2.a(Vk.f66050d, Long.valueOf(j10));
            vk2.b();
            return this.f65888f;
        }
        if (iA == 2) {
            return this.f65888f;
        }
        this.f65883a.f66226m.info("Start background session", new Object[0]);
        this.f65889g = 2;
        long j11 = q52.f65796i;
        AbstractC4794g abstractC4794g = this.f65887e;
        Fk fk2 = new Fk(j11, q52.f65797j);
        abstractC4794g.getClass();
        Ek ekA = abstractC4794g.a(fk2);
        if (this.f65883a.f66233t.c()) {
            X4 x42 = this.f65885c;
            x42.f66147a.f66227n.a(Q5.a(q52, C5009oa.I.i()), a(ekA, q52.f65796i));
        } else {
            int i10 = q52.f65791d;
            EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
            if (i10 == 6145) {
                X4 x43 = this.f65885c;
                x43.f66147a.f66227n.a(q52, a(ekA, j11));
                X4 x44 = this.f65885c;
                x44.f66147a.f66227n.a(Q5.a(q52, C5009oa.I.i()), a(ekA, j11));
            }
        }
        this.f65888f = ekA;
        return ekA;
    }

    public final void b(Ek ek2, Q5 q52) {
        if (ek2.f65211g && ek2.f65208d > 0) {
            X4 x42 = this.f65885c;
            Q5 q5A = Q5.a(q52, EnumC4703cb.EVENT_TYPE_ALIVE);
            Uk uk2 = new Uk();
            uk2.f66011a = ek2.f65208d;
            uk2.f66014d = ek2.f65207c.f65330a;
            long andIncrement = ek2.f65210f.getAndIncrement();
            Vk vk2 = ek2.f65206b;
            vk2.a(Vk.f66053g, Long.valueOf(ek2.f65210f.get()));
            vk2.b();
            uk2.f66012b = andIncrement;
            uk2.f66013c = TimeUnit.MILLISECONDS.toSeconds(Math.max(ek2.f65213i - ek2.f65209e, ek2.f65214j));
            x42.f66147a.f66227n.a(q5A, uk2);
            if (ek2.f65211g) {
                ek2.f65211g = false;
                Vk vk3 = ek2.f65206b;
                vk3.a(Vk.f66055i, Boolean.FALSE);
                vk3.b();
            }
        }
        PublicLogger publicLogger = this.f65883a.f66226m;
        int iOrdinal = ek2.f65207c.f65330a.ordinal();
        if (iOrdinal == 0) {
            publicLogger.info("Finish foreground session", new Object[0]);
        } else if (iOrdinal == 1) {
            publicLogger.info("Finish background session", new Object[0]);
        }
        synchronized (ek2) {
            Vk vk4 = ek2.f65206b;
            vk4.getClass();
            vk4.f66058c = new C4806gb();
            vk4.b();
            ek2.f65212h = null;
        }
    }

    public final synchronized void c(Q5 q52) {
        if (this.f65889g == 0) {
            Ek ekB = this.f65886d.b();
            if (a(ekB, q52)) {
                this.f65888f = ekB;
                this.f65889g = 3;
            } else {
                Ek ekB2 = this.f65887e.b();
                if (a(ekB2, q52)) {
                    this.f65888f = ekB2;
                    this.f65889g = 2;
                } else {
                    this.f65888f = null;
                    this.f65889g = 1;
                }
            }
        }
        int iA = L7.a(this.f65889g);
        if (iA == 0) {
            this.f65888f = a(q52);
        } else if (iA == 1) {
            b(this.f65888f, q52);
            this.f65888f = a(q52);
        } else if (iA == 2) {
            if (a(this.f65888f, q52)) {
                Ek ek2 = this.f65888f;
                long j10 = q52.f65796i;
                ek2.f65213i = j10;
                Vk vk2 = ek2.f65206b;
                vk2.a(Vk.f66050d, Long.valueOf(j10));
                vk2.b();
            } else {
                this.f65888f = a(q52);
            }
        }
    }
}
