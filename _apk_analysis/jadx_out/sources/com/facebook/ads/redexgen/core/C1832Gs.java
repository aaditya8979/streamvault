package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1832Gs {
    public static String[] A04 = {"xqK2Lo9z9A1fq6AmzHgSANRckQSbvLg7", "r87Jk1TDX4QDRIaoZWvBkBULXd6iRGy1", "O8Rd55zCWOMZlt38o2yZqibVFCpM9qBW", "4N74z6RiBgc3GZHRgJ9RjrwcKA2Sbu4k", "rTO2Tuhk28L6aGO7sMrwgJqOHaARqGQ4", "wV6nIrgfSj92E7JYn8Dcxr40UnK38ksI", "xhpcFCDiO5Y2wtHgWJ12k6gPj7fKn5Nf", "gVHczwThIZ3ivnhVZg4GXcBO3FodCEeQ"};
    public int A00;
    public int A01;
    public int A02;
    public byte[] A03;

    public C1832Gs(byte[] bArr, int i10, int i11) {
        A08(bArr, i10, i11);
    }

    private int A00() {
        int i10 = 0;
        while (!A0A()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? A05(i10) : 0);
    }

    private void A01() {
        C3M.A08(this.A02 >= 0 && (this.A02 < this.A01 || (this.A02 == this.A01 && this.A00 == 0)));
        String[] strArr = A04;
        if (strArr[5].charAt(17) == strArr[0].charAt(17)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[4] = "rbUb6Xt6pPTA8n7h1lny7mpNeejrLbnq";
        strArr2[1] = "r9GQrTTZLq4j6OnUyTd1FCUw4PnbqYK4";
    }

    private boolean A02(int i10) {
        if (2 <= i10 && i10 < this.A01 && this.A03[i10] == 3 && this.A03[i10 - 2] == 0) {
            byte[] bArr = this.A03;
            String[] strArr = A04;
            if (strArr[3].charAt(14) != strArr[6].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[3] = "mTSOM4VXL5Qz6aHfzfUvwcrlrHOw2Zy6";
            strArr2[6] = "LbZWpLfoz4TupHHNd8RSjDzMBM5OqJ05";
            if (bArr[i10 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final int A03() {
        int iA00 = A00();
        return (iA00 % 2 == 0 ? -1 : 1) * ((iA00 + 1) / 2);
    }

    public final int A04() {
        return A00();
    }

    public final int A05(int i10) {
        int i11 = 0;
        this.A00 += i10;
        while (true) {
            if (this.A00 <= 8) {
                break;
            }
            this.A00 -= 8;
            i11 |= (this.A03[this.A02] & 255) << this.A00;
            int i12 = this.A02;
            if (!A02(this.A02 + 1)) {
                i = 1;
            }
            this.A02 = i12 + i;
        }
        int i13 = i11 | ((this.A03[this.A02] & 255) >> (8 - this.A00));
        int i14 = 32 - i10;
        String[] strArr = A04;
        if (strArr[5].charAt(17) == strArr[0].charAt(17)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[2] = "RXY6xLJuKIcEz3kUylWDYr6tsmitvphK";
        strArr2[7] = "WXiq34WZkyW8ugzR2g0a8ipZBHhkiRcU";
        int i15 = i13 & ((-1) >>> i14);
        if (this.A00 == 8) {
            this.A00 = 0;
            int i16 = this.A02 + (A02(this.A02 + 1) ? 2 : 1);
            String[] strArr3 = A04;
            if (strArr3[4].charAt(0) != strArr3[1].charAt(0)) {
                String[] strArr4 = A04;
                strArr4[4] = "rds4vupX8r7j5bNz4Ka4tPduGPmVtsGV";
                strArr4[1] = "rRPYe8lZfiAZtF0hvmlKmZn0YXaVPkJ6";
                this.A02 = i16;
            } else {
                String[] strArr5 = A04;
                strArr5[3] = "oP8krBIP0DDB0MHyD3CqohM2a51fTyLT";
                strArr5[6] = "8dOgzrP5xxQxSwHCAu2NrFg9fwsPMfLi";
                this.A02 = i16;
            }
        }
        A01();
        return i15;
    }

    public final void A06() {
        int i10 = this.A00 + 1;
        this.A00 = i10;
        if (i10 == 8) {
            this.A00 = 0;
            this.A02 += A02(this.A02 + 1) ? 2 : 1;
        }
        A01();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A07(int r6) {
        /*
            r5 = this;
            int r3 = r5.A02
            int r2 = r6 / 8
            int r0 = r5.A02
            int r0 = r0 + r2
            r5.A02 = r0
            int r1 = r5.A00
            int r0 = r2 * 8
            int r6 = r6 - r0
            int r1 = r1 + r6
            r5.A00 = r1
            int r1 = r5.A00
            r0 = 7
            if (r1 <= r0) goto L48
            int r0 = r5.A02
            int r0 = r0 + 1
            r5.A02 = r0
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1832Gs.A04
            r0 = 3
            r1 = r2[r0]
            r0 = 6
            r2 = r2[r0]
            r0 = 14
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L36
        L30:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L36:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1832Gs.A04
            java.lang.String r1 = "JMOXq6hG4yZwGcrVKWuSo4mZKx3jwnv0"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "8hcVzozxp8VhJG7sJROCpbfriQIXRjxB"
            r0 = 0
            r2[r0] = r1
            int r0 = r5.A00
            int r0 = r0 + (-8)
            r5.A00 = r0
        L48:
            int r3 = r3 + 1
        L4a:
            int r0 = r5.A02
            if (r3 > r0) goto L7f
            boolean r4 = r5.A02(r3)
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1832Gs.A04
            r0 = 4
            r1 = r2[r0]
            r0 = 1
            r2 = r2[r0]
            r0 = 0
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L66
            goto L30
        L66:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1832Gs.A04
            java.lang.String r1 = "ItBao4LZOiviF1HOEk7WTyNzP7shwqmG"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "at4dJT6xDps7byHlzjkGtuWM4RrUB1u7"
            r0 = 6
            r2[r0] = r1
            if (r4 == 0) goto L7c
            int r0 = r5.A02
            int r0 = r0 + 1
            r5.A02 = r0
            int r3 = r3 + 2
        L7c:
            int r3 = r3 + 1
            goto L4a
        L7f:
            r5.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1832Gs.A07(int):void");
    }

    public final void A08(byte[] bArr, int i10, int i11) {
        this.A03 = bArr;
        this.A02 = i10;
        this.A01 = i11;
        this.A00 = 0;
        A01();
    }

    public final boolean A09() {
        int i10 = this.A02;
        int i11 = this.A00;
        int i12 = 0;
        while (this.A02 < this.A01 && !A0A()) {
            i12++;
        }
        boolean z10 = this.A02 == this.A01;
        this.A02 = i10;
        this.A00 = i11;
        return !z10 && A0B((i12 * 2) + 1);
    }

    public final boolean A0A() {
        boolean z10 = (this.A03[this.A02] & (128 >> this.A00)) != 0;
        A06();
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0B(int r9) {
        /*
            r8 = this;
            int r5 = r8.A02
            int r0 = r9 / 8
            int r4 = r8.A02
            int r4 = r4 + r0
            int r3 = r8.A00
            int r3 = r3 + r9
            int r0 = r0 * 8
            int r3 = r3 - r0
            r0 = 7
            if (r3 <= r0) goto L39
            int r4 = r4 + 1
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1832Gs.A04
            r0 = 4
            r1 = r2[r0]
            r0 = 1
            r2 = r2[r0]
            r0 = 0
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L2b
        L25:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L2b:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1832Gs.A04
            java.lang.String r1 = "4R3sKytGl1afrKMjnsBwna0p74CJayfl"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "DtV04uWRet80XDEpYPrFh03isGofLap7"
            r0 = 7
            r2[r0] = r1
            int r3 = r3 + (-8)
        L39:
            int r5 = r5 + 1
        L3b:
            r7 = 1
            if (r5 > r4) goto L6e
            int r6 = r8.A01
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1832Gs.A04
            r0 = 5
            r1 = r2[r0]
            r0 = 0
            r2 = r2[r0]
            r0 = 17
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L25
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1832Gs.A04
            java.lang.String r1 = "ru8g1XQo0WAy59nUdKAzfoQ85z62h8So"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "rlk5s9hHQFi3gmvg8c7PRJF1MfkgSAIS"
            r0 = 1
            r2[r0] = r1
            if (r4 >= r6) goto L6e
            boolean r0 = r8.A02(r5)
            if (r0 == 0) goto L6c
            int r4 = r4 + 1
            int r5 = r5 + 2
        L6c:
            int r5 = r5 + r7
            goto L3b
        L6e:
            int r0 = r8.A01
            if (r4 < r0) goto L78
            int r0 = r8.A01
            if (r4 != r0) goto L79
            if (r3 != 0) goto L79
        L78:
            return r7
        L79:
            r7 = 0
            goto L78
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1832Gs.A0B(int):boolean");
    }
}
