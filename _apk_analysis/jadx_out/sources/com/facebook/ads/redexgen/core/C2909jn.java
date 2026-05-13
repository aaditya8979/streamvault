package com.facebook.ads.redexgen.core;

import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2909jn implements KJ {
    public static byte[] A0E;
    public static String[] A0F = {"InS58bT42EZESXm9qvWYUvire34TyqEd", "0QsKXE5Mty2kdKkFlxzakLoeZj9v1JPl", "NRhrqdNeBR4CDjsc7Q9NAC", "KBnn09jRwf0uKhIPK3OJ0VUHuR4AgDGD", "Nq6SUzmzwDzIZ8w7Fc8GQLnhk8OKIhKk", "EhougHeDeIMt7rS1ZxwR1ONoVKreOkGZ", "d5GlJf2nLv2o9PLs5SG9FlMqVuWi5Y0h", "iroqlmoe0TAfPMqOpys1zY2UwesgA9Cl"};
    public long A01;
    public H1 A02;
    public KR A03;
    public String A04;
    public boolean A05;
    public final KX A0C;
    public final boolean[] A0D = new boolean[3];
    public final KS A0B = new KS(32, 128);
    public final KS A09 = new KS(33, 128);
    public final KS A07 = new KS(34, 128);
    public final KS A08 = new KS(39, 128);
    public final KS A0A = new KS(40, 128);
    public long A00 = -9223372036854775807L;
    public final C4J A06 = new C4J();

    static {
        A03();
    }

    public C2909jn(KX kx) {
        this.A0C = kx;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.core.C3206or A00(java.lang.String r22, com.facebook.ads.redexgen.core.KS r23, com.facebook.ads.redexgen.core.KS r24, com.facebook.ads.redexgen.core.KS r25) {
        /*
            Method dump skipped, instruction units count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2909jn.A00(java.lang.String, com.facebook.ads.redexgen.X.KS, com.facebook.ads.redexgen.X.KS, com.facebook.ads.redexgen.X.KS):com.facebook.ads.redexgen.X.or");
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 115);
        }
        return new String(bArrCopyOfRange);
    }

    @EnsuresNonNull({"output", "sampleReader"})
    private void A02() {
        C3M.A02(this.A02);
    }

    public static void A03() {
        A0E = new byte[]{7, 125, 121, 122, 29, ExifInterface.START_CODE, 46, 43, ExifInterface.START_CODE, 61, 93, 102, 109, 112, 120, 109, 107, 124, 109, 108, 40, 105, 123, 120, 109, 107, 124, 87, 122, 105, 124, 97, 103, 87, 97, 108, 107, 40, 126, 105, 100, 125, 109, 50, 40, 63, 32, 45, 44, 38, 102, 33, 44, 63, ExifInterface.START_CODE};
    }

    @RequiresNonNull({"output", "sampleReader"})
    private void A04(long j10, int i10, int i11, long j11) {
        this.A03.A05(j10, i10, this.A05);
        if (!this.A05) {
            this.A0B.A04(i11);
            this.A09.A04(i11);
            this.A07.A04(i11);
            if (this.A0B.A03() && this.A09.A03() && this.A07.A03()) {
                this.A02.A6W(A00(this.A04, this.A0B, this.A09, this.A07));
                this.A05 = true;
            }
        }
        KS ks2 = this.A08;
        if (A0F[2].length() == 29) {
            throw new RuntimeException();
        }
        A0F[7] = "vr6kqTkennNRVlA9BYLGssdVYhiLrcAb";
        if (ks2.A04(i11)) {
            this.A06.A0j(this.A08.A01, AbstractC1830Gq.A02(this.A08.A01, this.A08.A00));
            this.A06.A0g(5);
            this.A0C.A02(j11, this.A06);
        }
        if (this.A0A.A04(i11)) {
            this.A06.A0j(this.A0A.A01, AbstractC1830Gq.A02(this.A0A.A01, this.A0A.A00));
            this.A06.A0g(5);
            this.A0C.A02(j11, this.A06);
        }
    }

    @RequiresNonNull({"sampleReader"})
    private void A05(long j10, int i10, int i11, long j11) {
        this.A03.A04(j10, i10, i11, j11, this.A05);
        if (!this.A05) {
            this.A0B.A01(i11);
            this.A09.A01(i11);
            this.A07.A01(i11);
        }
        this.A08.A01(i11);
        String[] strArr = A0F;
        if (strArr[4].charAt(1) == strArr[6].charAt(1)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0F;
        strArr2[3] = "1KFxNiiYNj5YwxcZPXf7qOLOZg48Utfw";
        strArr2[0] = "AJhXWbHH6DfoOyxWmdhumfQDrV4Rkjlm";
        this.A0A.A01(i11);
    }

    public static void A06(C1832Gs c1832Gs) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (c1832Gs.A0A()) {
                    int iMin = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        c1832Gs.A03();
                    }
                    for (int i13 = 0; i13 < iMin; i13++) {
                        c1832Gs.A03();
                        String[] strArr = A0F;
                        if (strArr[1].charAt(22) == strArr[5].charAt(22)) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A0F;
                        strArr2[1] = "RIQaKQF3d2DPjAKRmkcEP1Qw2m8MXhOp";
                        strArr2[5] = "Zvlj8YgWRgjcS6ffkQSgKy13bXSJEEo8";
                    }
                } else {
                    c1832Gs.A04();
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    public static void A07(C1832Gs c1832Gs) {
        int iA04 = c1832Gs.A04();
        boolean zA0A = false;
        int i10 = 0;
        for (int i11 = 0; i11 < iA04; i11++) {
            if (i11 != 0) {
                zA0A = c1832Gs.A0A();
            }
            if (zA0A) {
                c1832Gs.A06();
                c1832Gs.A04();
                for (int i12 = 0; i12 <= i10; i12++) {
                    if (c1832Gs.A0A()) {
                        c1832Gs.A06();
                    }
                }
            } else {
                int iA042 = c1832Gs.A04();
                int iA043 = c1832Gs.A04();
                i10 = iA042 + iA043;
                for (int i13 = 0; i13 < iA042; i13++) {
                    c1832Gs.A04();
                    c1832Gs.A06();
                }
                for (int i14 = 0; i14 < iA043; i14++) {
                    c1832Gs.A04();
                    c1832Gs.A06();
                }
            }
        }
    }

    @RequiresNonNull({"sampleReader"})
    private void A08(byte[] bArr, int i10, int i11) {
        this.A03.A06(bArr, i10, i11);
        if (!this.A05) {
            this.A0B.A02(bArr, i10, i11);
            this.A09.A02(bArr, i10, i11);
            this.A07.A02(bArr, i10, i11);
        }
        this.A08.A02(bArr, i10, i11);
        this.A0A.A02(bArr, i10, i11);
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void A52(C4J c4j) {
        A02();
        while (c4j.A07() > 0) {
            int iA09 = c4j.A09();
            int iA0A = c4j.A0A();
            byte[] bArrA0l = c4j.A0l();
            this.A01 += (long) c4j.A07();
            this.A02.AI7(c4j, c4j.A07());
            while (iA09 < iA0A) {
                int iA04 = AbstractC1830Gq.A04(bArrA0l, iA09, iA0A, this.A0D);
                if (iA04 == iA0A) {
                    A08(bArrA0l, iA09, iA0A);
                    return;
                }
                int iA00 = AbstractC1830Gq.A00(bArrA0l, iA04);
                int i10 = iA04 - iA09;
                if (A0F[7].charAt(7) != 'e') {
                    throw new RuntimeException();
                }
                String[] strArr = A0F;
                strArr[1] = "NnhvxMiSCkNhwXkURhMspTAR6cceqM1j";
                strArr[5] = "7ARxjazDMsknrtTfPy5OOEp3py29nWBE";
                if (i10 > 0) {
                    A08(bArrA0l, iA09, iA04);
                }
                int i11 = iA0A - iA04;
                long j10 = this.A01 - ((long) i11);
                A04(j10, i11, i10 < 0 ? -i10 : 0, this.A00);
                A05(j10, i11, iA00, this.A00);
                iA09 = iA04 + 3;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void A5U(GY gy, C1921Ke c1921Ke) {
        c1921Ke.A05();
        this.A04 = c1921Ke.A04();
        this.A02 = gy.AJh(c1921Ke.A03(), 2);
        this.A03 = new KR(this.A02);
        this.A0C.A03(gy, c1921Ke);
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void AG5() {
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void AG6(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.A00 = j10;
        }
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void AIL() {
        this.A01 = 0L;
        this.A00 = -9223372036854775807L;
        AbstractC1830Gq.A0H(this.A0D);
        this.A0B.A00();
        this.A09.A00();
        this.A07.A00();
        this.A08.A00();
        this.A0A.A00();
        if (this.A03 != null) {
            this.A03.A03();
        }
    }
}
