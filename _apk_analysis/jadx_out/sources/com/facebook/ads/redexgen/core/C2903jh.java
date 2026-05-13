package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2903jh implements GP {
    public static String[] A02 = {"icMuAGNUwG3qooMsLkIelsXOgqR", "wZwGdqwzUfLFhHeDnVqZXfrekI2t19Nm", "6NjHclQwJEhKen4shQzzT38fKShvFJl3", "cwvHChui6ScrilPVLNLxDwwq1RZibmTM", "KGSyfhH5I6lVnEy0NkdKQy5Ija", "JgLMaajFBM7mBqcCk", "W9ygPHkeZ", ""};
    public final C4J A00;
    public final C4R A01;

    public C2903jh(C4R c4r) {
        this.A01 = c4r;
        this.A00 = new C4J();
    }

    private GN A00(C4J c4j, long j10, long j11) {
        int iA09 = -1;
        int iA092 = -1;
        long j12 = -9223372036854775807L;
        while (c4j.A07() >= 4) {
            if (C2902jg.A00(c4j.A0l(), c4j.A09()) != 442) {
                c4j.A0g(1);
            } else {
                c4j.A0g(4);
                long jA06 = KU.A06(c4j);
                if (jA06 != -9223372036854775807L) {
                    long jA062 = this.A01.A06(jA06);
                    if (jA062 > j10) {
                        return j12 == -9223372036854775807L ? GN.A04(jA062, j11) : GN.A03(((long) iA09) + j11);
                    }
                    if (A02[1].charAt(26) == 'q') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A02;
                    strArr[3] = "JRu5yfiOOmZm3e1j9KGmxzziCqUEhgmX";
                    strArr[2] = "rPvZuTIICj36zhJU166yjphfEhohU7nm";
                    if (100000 + jA062 > j10) {
                        return GN.A03(((long) c4j.A09()) + j11);
                    }
                    j12 = jA062;
                    iA09 = c4j.A09();
                }
                A01(c4j);
                iA092 = c4j.A09();
            }
        }
        return j12 != -9223372036854775807L ? GN.A05(j12, ((long) iA092) + j11) : GN.A03;
    }

    public static void A01(C4J c4j) {
        int iA00;
        int iA0A = c4j.A0A();
        if (c4j.A07() < 10) {
            c4j.A0f(iA0A);
            return;
        }
        c4j.A0g(9);
        int iA0I = c4j.A0I() & 7;
        if (c4j.A07() < iA0I) {
            c4j.A0f(iA0A);
            return;
        }
        c4j.A0g(iA0I);
        if (c4j.A07() < 4) {
            c4j.A0f(iA0A);
            return;
        }
        if (C2902jg.A00(c4j.A0l(), c4j.A09()) == 443) {
            c4j.A0g(4);
            int iA0M = c4j.A0M();
            if (c4j.A07() < iA0M) {
                c4j.A0f(iA0A);
                return;
            }
            c4j.A0g(iA0M);
        }
        while (c4j.A07() >= 4 && (iA00 = C2902jg.A00(c4j.A0l(), c4j.A09())) != 442 && iA00 != 441 && (iA00 >>> 8) == 1) {
            c4j.A0g(4);
            if (c4j.A07() < 2) {
                c4j.A0f(iA0A);
                return;
            }
            c4j.A0f(Math.min(c4j.A0A(), c4j.A09() + c4j.A0M()));
        }
    }

    @Override // com.facebook.ads.redexgen.core.GP
    public final void AFA() {
        this.A00.A0i(AbstractC15184a.A07);
    }

    @Override // com.facebook.ads.redexgen.core.GP
    public final GN AIC(InterfaceC2995lN interfaceC2995lN, long j10) throws IOException {
        long jA8f = interfaceC2995lN.A8f();
        int iMin = (int) Math.min(20000L, interfaceC2995lN.A8G() - jA8f);
        this.A00.A0d(iMin);
        interfaceC2995lN.AG9(this.A00.A0l(), 0, iMin);
        return A00(this.A00, j10, jA8f);
    }
}
