package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2907jl implements KJ {
    public static byte[] A0L;
    public static String[] A0M = {"j9JFF3HN4WHOogTAo3Zp2vJcrDXalLKC", "xTu", "o", "YpEMu", "L", "xqkbJV3NP5tWtCpR6dlW7fuQWbu0Okpq", "9ZwPJyvjhOXD2", "3pAsgJTRE4XOqhE7"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public long A0A;
    public C3206or A0C;
    public H1 A0D;
    public String A0E;
    public String A0F;
    public boolean A0G;
    public boolean A0H;
    public final String A0K;
    public final C4J A0J = new C4J(1024);
    public final C4I A0I = new C4I(this.A0J.A0l());
    public long A0B = -9223372036854775807L;

    static {
        A04();
    }

    public C2907jl(String str) {
        this.A0K = str;
    }

    private int A00(C4I c4i) throws C14742i {
        int iA01 = c4i.A01();
        GA gaA02 = GB.A02(c4i, true);
        this.A0E = gaA02.A02;
        this.A05 = gaA02.A01;
        this.A02 = gaA02.A00;
        return iA01 - c4i.A01();
    }

    private int A01(C4I c4i) throws C14742i {
        int iA04;
        int i10 = 0;
        if (this.A03 != 0) {
            throw C14742i.A01(null, null);
        }
        do {
            iA04 = c4i.A04(8);
            i10 += iA04;
        } while (iA04 == 255);
        return i10;
    }

    public static long A02(C4I c4i) {
        return c4i.A04((c4i.A04(2) + 1) * 8);
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0L, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0M;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            A0M[5] = "ZyB29Ut14cj6jISqnQaPpNUB2bA7E60q";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 57);
            i13++;
        }
    }

    public static void A04() {
        A0L = new byte[]{3, 23, 6, 11, 13, 77, 15, 18, 86, 3, 79, 14, 3, 22, 15};
    }

    private void A05(int i10) {
        this.A0J.A0d(i10);
        this.A0I.A0D(this.A0J.A0l());
    }

    @RequiresNonNull({"output"})
    private void A06(C4I c4i) throws C14742i {
        if (!c4i.A0H()) {
            this.A0H = true;
            A08(c4i);
        } else if (!this.A0H) {
            return;
        }
        if (this.A00 != 0) {
            throw C14742i.A01(null, null);
        }
        if (this.A04 != 0) {
            throw C14742i.A01(null, null);
        }
        A09(c4i, A01(c4i));
        if (this.A0G) {
            c4i.A09((int) this.A09);
        }
    }

    private void A07(C4I c4i) {
        this.A03 = c4i.A04(3);
        switch (this.A03) {
            case 0:
                c4i.A09(8);
                return;
            case 1:
                c4i.A09(9);
                return;
            case 2:
            default:
                throw new IllegalStateException();
            case 3:
            case 4:
            case 5:
                c4i.A09(6);
                return;
            case 6:
            case 7:
                c4i.A09(1);
                return;
        }
    }

    @RequiresNonNull({"output"})
    private void A08(C4I c4i) throws C14742i {
        boolean zA0H;
        int iA04 = c4i.A04(1);
        this.A00 = iA04 == 1 ? c4i.A04(1) : 0;
        if (this.A00 != 0) {
            throw C14742i.A01(null, null);
        }
        if (iA04 == 1) {
            A02(c4i);
        }
        if (!c4i.A0H()) {
            throw C14742i.A01(null, null);
        }
        this.A04 = c4i.A04(6);
        int iA042 = c4i.A04(4);
        if (A0M[5].charAt(25) != 'b') {
            throw new RuntimeException();
        }
        A0M[5] = "b1jqAFGEyfNrz2WgotNy1OFmmbCQivCc";
        int iA043 = c4i.A04(3);
        if (iA042 != 0 || iA043 != 0) {
            throw C14742i.A01(null, null);
        }
        if (iA04 == 0) {
            int iA03 = c4i.A03();
            int iA00 = A00(c4i);
            c4i.A08(iA03);
            byte[] bArr = new byte[(iA00 + 7) / 8];
            c4i.A0F(bArr, 0, iA00);
            C3206or c3206orA14 = new C2D().A0y(this.A0F).A11(A03(0, 15, 91)).A0w(this.A0E).A0b(this.A02).A0m(this.A05).A12(Collections.singletonList(bArr)).A10(this.A0K).A14();
            if (!c3206orA14.equals(this.A0C)) {
                this.A0C = c3206orA14;
                this.A0A = 1024000000 / ((long) c3206orA14.A0G);
                this.A0D.A6W(c3206orA14);
            }
        } else {
            c4i.A09(((int) A02(c4i)) - A00(c4i));
        }
        A07(c4i);
        this.A0G = c4i.A0H();
        this.A09 = 0L;
        if (this.A0G) {
            if (iA04 == 1) {
                this.A09 = A02(c4i);
            } else {
                do {
                    zA0H = c4i.A0H();
                    this.A09 = (this.A09 << 8) + ((long) c4i.A04(8));
                } while (zA0H);
            }
        }
        if (c4i.A0H()) {
            c4i.A09(8);
        }
    }

    @RequiresNonNull({"output"})
    private void A09(C4I c4i, int i10) {
        int iA03 = c4i.A03();
        if ((iA03 & 7) == 0) {
            this.A0J.A0f(iA03 >> 3);
        } else {
            c4i.A0F(this.A0J.A0l(), 0, i10 * 8);
            this.A0J.A0f(0);
        }
        this.A0D.AI7(this.A0J, i10);
        if (this.A0B != -9223372036854775807L) {
            this.A0D.AIA(this.A0B, 1, i10, 0, null);
            this.A0B += this.A0A;
        }
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void A52(C4J c4j) throws C14742i {
        C3M.A02(this.A0D);
        while (c4j.A07() > 0) {
            switch (this.A08) {
                case 0:
                    if (c4j.A0I() == 86) {
                        this.A08 = 1;
                    }
                    break;
                case 1:
                    int iA0I = c4j.A0I();
                    if ((iA0I & 224) == 224) {
                        this.A07 = iA0I;
                        this.A08 = 2;
                    } else if (iA0I != 86) {
                        this.A08 = 0;
                    }
                    break;
                case 2:
                    this.A06 = ((this.A07 & (-225)) << 8) | c4j.A0I();
                    if (this.A06 > this.A0J.A0l().length) {
                        A05(this.A06);
                    }
                    this.A01 = 0;
                    this.A08 = 3;
                    break;
                case 3:
                    int iMin = Math.min(c4j.A07(), this.A06 - this.A01);
                    c4j.A0k(this.A0I.A00, this.A01, iMin);
                    this.A01 += iMin;
                    if (this.A01 == this.A06) {
                        this.A0I.A08(0);
                        A06(this.A0I);
                        this.A08 = 0;
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void A5U(GY gy, C1921Ke c1921Ke) {
        c1921Ke.A05();
        this.A0D = gy.AJh(c1921Ke.A03(), 1);
        this.A0F = c1921Ke.A04();
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void AG5() {
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void AG6(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.A0B = j10;
        }
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void AIL() {
        this.A08 = 0;
        this.A0B = -9223372036854775807L;
        this.A0H = false;
    }
}
