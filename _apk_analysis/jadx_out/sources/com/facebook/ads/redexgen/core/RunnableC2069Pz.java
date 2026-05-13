package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RunnableC2069Pz implements Runnable {
    public static Comparator<C2068Py> A04;
    public static byte[] A05;
    public static String[] A06 = {"ZWObiMwNkhaZGfEgqHenCxQvRQCezgXM", "iKaB5ntiNbaiz6tgW", "JplxjEE1IYbCInXXNCkbxZV0", "UEoPOy6vCmPnpiXEMXmcZKvRtDoHf0nN", "JvUlYJe7lgtJoJN1gtwvhyIs", "RcG3r4ysor4dcgCWVGn8CFYsdgQ7jZkt", "cxmAjzJ", "EyohaYHYoMvb6y9gFGiucolIeU60NsdM"};
    public static final ThreadLocal<RunnableC2069Pz> A07;
    public long A00;
    public long A01;
    public ArrayList<C15766g> A02 = new ArrayList<>();
    public ArrayList<C2068Py> A03 = new ArrayList<>();

    static {
        A03();
        A07 = new ThreadLocal<>();
        A04 = new C2067Px();
    }

    private AbstractC2076Qg A00(C15766g c15766g, int i10, long j10) {
        if (A08(c15766g, i10)) {
            return null;
        }
        QW qw = c15766g.A0r;
        try {
            c15766g.A1M();
            AbstractC2076Qg abstractC2076QgA0I = qw.A0I(i10, false, j10);
            if (abstractC2076QgA0I != null) {
                if (!abstractC2076QgA0I.A0e() || abstractC2076QgA0I.A0f()) {
                    qw.A0Z(abstractC2076QgA0I, false);
                } else {
                    qw.A0T(abstractC2076QgA0I.A0H);
                }
            }
            return abstractC2076QgA0I;
        } finally {
            c15766g.A1o(false);
        }
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 104);
        }
        return new String(bArrCopyOfRange);
    }

    private void A02() {
        C2068Py c2068Py;
        int size = this.A02.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            C15766g c15766g = this.A02.get(i11);
            if (c15766g.getWindowVisibility() == 0) {
                c15766g.A02.A04(c15766g, false);
                i10 += c15766g.A02.A00;
            }
        }
        this.A03.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            C15766g c15766g2 = this.A02.get(i13);
            if (c15766g2.getWindowVisibility() == 0) {
                C2710gJ c2710gJ = c15766g2.A02;
                int iAbs = Math.abs(c2710gJ.A01) + Math.abs(c2710gJ.A02);
                for (int i14 = 0; i14 < c2710gJ.A00 * 2; i14 += 2) {
                    if (i12 >= this.A03.size()) {
                        c2068Py = new C2068Py();
                        this.A03.add(c2068Py);
                    } else {
                        c2068Py = this.A03.get(i12);
                    }
                    int i15 = c2710gJ.A03[i14 + 1];
                    c2068Py.A04 = i15 <= iAbs;
                    c2068Py.A02 = iAbs;
                    c2068Py.A00 = i15;
                    c2068Py.A03 = c15766g2;
                    c2068Py.A01 = c2710gJ.A03[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.A03, A04);
    }

    public static void A03() {
        A05 = new byte[]{105, 109, 27, 117, 94, 72, 79, 94, 95, 27, 107, 73, 94, 93, 94, 79, 88, 83, 100, 96, 22, 102, 68, 83, 80, 83, 66, 85, 94};
    }

    private void A04(long j10) {
        for (int i10 = 0; i10 < this.A03.size(); i10++) {
            C2068Py c2068Py = this.A03.get(i10);
            if (A06[7].charAt(15) != 'g') {
                throw new RuntimeException();
            }
            A06[6] = "gpZ2KV2";
            C2068Py c2068Py2 = c2068Py;
            if (c2068Py2.A03 == null) {
                return;
            }
            A06(c2068Py2, j10);
            c2068Py2.A00();
        }
    }

    private final void A05(long j10) {
        A02();
        A04(j10);
    }

    private void A06(C2068Py c2068Py, long j10) {
        AbstractC2076Qg abstractC2076QgA00 = A00(c2068Py.A03, c2068Py.A01, c2068Py.A04 ? Long.MAX_VALUE : j10);
        if (abstractC2076QgA00 == null || abstractC2076QgA00.A09 == null || !abstractC2076QgA00.A0e() || abstractC2076QgA00.A0f()) {
            return;
        }
        C15766g c15766g = abstractC2076QgA00.A09.get();
        if (A06[3].charAt(4) != 'O') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[0] = "y01bdO2VJYUoPT1JEr7HCeGbjhjinZRt";
        strArr[5] = "ogbTL45N3M3fzw26YptkCantwmvhDLLM";
        A07(c15766g, j10);
    }

    private void A07(C15766g c15766g, long j10) {
        if (c15766g == null) {
            return;
        }
        if (c15766g.A0C && c15766g.A01.A06() != 0) {
            c15766g.A1P();
        }
        C2710gJ c2710gJ = c15766g.A02;
        c2710gJ.A04(c15766g, true);
        if (c2710gJ.A00 != 0) {
            try {
                OQ.A01(A01(0, 18, 83));
                c15766g.A0s.A05(c15766g.A04);
                for (int i10 = 0; i10 < c2710gJ.A00 * 2; i10 += 2) {
                    A00(c15766g, c2710gJ.A03[i10], j10);
                }
            } finally {
                OQ.A00();
            }
        }
    }

    public static boolean A08(C15766g c15766g, int i10) {
        int iA06 = c15766g.A01.A06();
        for (int i11 = 0; i11 < iA06; i11++) {
            AbstractC2076Qg abstractC2076QgA0F = C15766g.A0F(c15766g.A01.A0A(i11));
            if (abstractC2076QgA0F.A03 == i10 && !abstractC2076QgA0F.A0f()) {
                return true;
            }
        }
        return false;
    }

    public final void A09(C15766g c15766g) {
        this.A02.add(c15766g);
    }

    public final void A0A(C15766g c15766g) {
        this.A02.remove(c15766g);
    }

    public final void A0B(C15766g c15766g, int i10, int i11) {
        if (c15766g.isAttachedToWindow()) {
            long j10 = this.A01;
            String[] strArr = A06;
            if (strArr[0].charAt(20) != strArr[5].charAt(20)) {
                throw new RuntimeException();
            }
            A06[6] = "T8Y6UBY";
            if (j10 == 0) {
                this.A01 = c15766g.getNanoTime();
                c15766g.post(this);
            }
        }
        c15766g.A02.A03(i10, i11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            OQ.A01(A01(18, 11, 94));
            if (this.A02.isEmpty()) {
                this.A01 = 0L;
                if (A06[6].length() != 7) {
                    throw new RuntimeException();
                }
                A06[7] = "jOxF3Mzmcdx8L8GgZmI4I6pGAsyGGZV3";
                OQ.A00();
                return;
            }
            int size = this.A02.size();
            long jMax = 0;
            for (int i10 = 0; i10 < size; i10++) {
                C15766g c15766g = this.A02.get(i10);
                if (c15766g.getWindowVisibility() == 0) {
                    jMax = Math.max(c15766g.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                return;
            }
            A05(TimeUnit.MILLISECONDS.toNanos(jMax) + this.A00);
        } finally {
            this.A01 = 0L;
            OQ.A00();
        }
    }
}
