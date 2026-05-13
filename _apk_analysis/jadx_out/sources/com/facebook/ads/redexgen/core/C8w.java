package com.facebook.ads.redexgen.core;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8w, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C8w {
    public static String[] A0M = {"T7VAgrMlNjunoCY92EX", "RGUT9owbnhx8phDbzrCYMg", "CVNC8QX", "fBdqcrRV46KfIZmPA23V4p", "8FvZMHzhr", "kMgSgwu", "1eJdCrNjGcKHTUWf60z", "EzFxZEW8JHF4ThmiFQVxs9z"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public short[] A0A;
    public short[] A0B;
    public short[] A0C;
    public final float A0D;
    public final float A0E;
    public final float A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final short[] A0L;

    public C8w(int i10, int i11, float f10, float f11, int i12) {
        this.A0H = i10;
        this.A0G = i11;
        this.A0F = f10;
        this.A0D = f11;
        this.A0E = i10 / i12;
        this.A0K = i10 / 400;
        this.A0I = i10 / 65;
        this.A0J = this.A0I * 2;
        this.A0L = new short[this.A0J];
        this.A0A = new short[this.A0J * i11];
        this.A0B = new short[this.A0J * i11];
        this.A0C = new short[this.A0J * i11];
    }

    private int A00(int i10) {
        int iMin = Math.min(this.A0J, this.A09);
        A0D(this.A0A, i10, iMin);
        this.A09 -= iMin;
        return iMin;
    }

    private int A01(short[] sArr, int i10) {
        int iA04;
        int i11 = this.A0H > 4000 ? this.A0H / 4000 : 1;
        int i12 = this.A0G;
        if (A0M[4].length() != 9) {
            throw new RuntimeException();
        }
        A0M[5] = "ihqHcMR";
        if (i12 == 1 && i11 == 1) {
            iA04 = A04(sArr, i10, this.A0K, this.A0I);
        } else {
            A0E(sArr, i10, i11);
            iA04 = A04(this.A0L, 0, this.A0K / i11, this.A0I / i11);
            if (i11 != 1) {
                int i13 = iA04 * i11;
                int i14 = i13 - (i11 * 4);
                int i15 = (i11 * 4) + i13;
                if (i14 < this.A0K) {
                    i14 = this.A0K;
                }
                if (i15 > this.A0I) {
                    i15 = this.A0I;
                }
                if (this.A0G == 1) {
                    iA04 = A04(sArr, i10, i14, i15);
                } else {
                    A0E(sArr, i10, 1);
                    iA04 = A04(this.A0L, 0, i14, i15);
                }
            }
        }
        int i16 = A0F(this.A02, this.A01) ? this.A08 : iA04;
        this.A07 = this.A02;
        if (A0M[5].length() != 7) {
            throw new RuntimeException();
        }
        String[] strArr = A0M;
        strArr[6] = "cTOoGT7MMdDrVmklJ8r";
        strArr[0] = "keLDEQoIXNVpWb6w58r";
        this.A08 = iA04;
        return i16;
    }

    private int A02(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 < 0.5f) {
            i12 = (int) ((i11 * f10) / (1.0f - f10));
        } else {
            i12 = i11;
            this.A09 = (int) ((i11 * ((2.0f * f10) - 1.0f)) / (1.0f - f10));
        }
        this.A0B = A0G(this.A0B, this.A05, i11 + i12);
        System.arraycopy(sArr, this.A0G * i10, this.A0B, this.A05 * this.A0G, this.A0G * i11);
        A0C(i12, this.A0G, this.A0B, this.A05 + i11, sArr, i10 + i11, sArr, i10);
        this.A05 += i11 + i12;
        return i12;
    }

    private int A03(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 >= 2.0f) {
            i12 = (int) (i11 / (f10 - 1.0f));
        } else {
            this.A09 = (int) ((i11 * (2.0f - f10)) / (f10 - 1.0f));
            i12 = i11;
        }
        this.A0B = A0G(this.A0B, this.A05, i12);
        A0C(i12, this.A0G, this.A0B, this.A05, sArr, i10, sArr, i10 + i11);
        this.A05 += i12;
        return i12;
    }

    private int A04(short[] sArr, int i10, int i11, int i12) {
        int i13 = 0;
        int i14 = 255;
        int i15 = 1;
        int i16 = 0;
        int i17 = i10 * this.A0G;
        while (i11 <= i12) {
            int iAbs = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                iAbs += Math.abs(sArr[i17 + i18] - sArr[(i17 + i11) + i18]);
            }
            if (iAbs * i13 < i15 * i11) {
                i15 = iAbs;
                i13 = i11;
            }
            if (iAbs * i14 > i16 * i11) {
                i16 = iAbs;
                i14 = i11;
            }
            i11++;
        }
        this.A02 = i15 / i13;
        this.A01 = i16 / i14;
        return i13;
    }

    private short A05(short[] sArr, int i10, int i11, int i12) {
        short s10 = sArr[i10];
        short s11 = sArr[this.A0G + i10];
        int i13 = this.A03 * i11;
        int i14 = this.A04 * i12;
        int i15 = (this.A04 + 1) * i12;
        int i16 = i15 - i13;
        int i17 = i15 - i14;
        return (short) (((i16 * s10) + ((i17 - i16) * s11)) / i17);
    }

    private void A06() {
        int i10 = this.A05;
        float f10 = this.A0F / this.A0D;
        float f11 = this.A0E * this.A0D;
        if (f10 > 1.00001d || f10 < 0.99999d) {
            A07(f10);
        } else {
            A0D(this.A0A, 0, this.A00);
            this.A00 = 0;
        }
        if (f11 != 1.0f) {
            A08(f11, i10);
        }
    }

    private void A07(float f10) {
        if (this.A00 < this.A0J) {
            return;
        }
        int i10 = this.A00;
        if (A0M[4].length() != 9) {
            throw new RuntimeException();
        }
        A0M[4] = "1EAucAhfj";
        int iA03 = 0;
        do {
            if (this.A09 > 0) {
                iA03 += A00(iA03);
            } else {
                int iA01 = A01(this.A0A, iA03);
                if (f10 > 1.0d) {
                    iA03 += A03(this.A0A, iA03, f10, iA01) + iA01;
                } else {
                    int iA02 = A02(this.A0A, iA03, f10, iA01);
                    if (A0M[4].length() != 9) {
                        iA03 += iA02;
                    } else {
                        String[] strArr = A0M;
                        strArr[7] = "LI3iTvxeiLHfC3eQqEyHhGd";
                        strArr[2] = "DQqtHf8";
                        iA03 += iA02;
                    }
                }
            }
        } while (this.A0J + iA03 <= i10);
        A0B(iA03);
    }

    private void A08(float f10, int i10) {
        if (this.A05 == i10) {
            return;
        }
        int i11 = (int) (this.A0H / f10);
        int i12 = this.A0H;
        while (true) {
            if (i11 > 16384 || i12 > 16384) {
                i11 /= 2;
                if (A0M[4].length() != 9) {
                    break;
                }
                A0M[4] = "8yLWj9SnB";
                i12 /= 2;
            } else {
                A09(i10);
                String[] strArr = A0M;
                if (strArr[3].length() == strArr[1].length()) {
                    String[] strArr2 = A0M;
                    strArr2[3] = "6iwvuS4pXw8rJ8Q1q7RXek";
                    strArr2[1] = "P2j6LGlMYimVuvOXYheyMm";
                    int i13 = 0;
                    while (true) {
                        if (i13 >= this.A06 - 1) {
                            A0A(this.A06 - 1);
                            return;
                        }
                        while ((this.A04 + 1) * i11 > this.A03 * i12) {
                            this.A0B = A0G(this.A0B, this.A05, 1);
                            for (int i14 = 0; i14 < this.A0G; i14++) {
                                this.A0B[(this.A05 * this.A0G) + i14] = A05(this.A0C, (this.A0G * i13) + i14, i12, i11);
                            }
                            this.A03++;
                            this.A05++;
                        }
                        this.A04++;
                        if (this.A04 == i12) {
                            this.A04 = 0;
                            C3M.A08(this.A03 == i11);
                            this.A03 = 0;
                        }
                        i13++;
                    }
                }
            }
        }
        throw new RuntimeException();
    }

    private void A09(int i10) {
        int i11 = this.A05 - i10;
        this.A0C = A0G(this.A0C, this.A06, i11);
        System.arraycopy(this.A0B, this.A0G * i10, this.A0C, this.A06 * this.A0G, this.A0G * i11);
        this.A05 = i10;
        this.A06 += i11;
    }

    private void A0A(int i10) {
        if (i10 == 0) {
            return;
        }
        System.arraycopy(this.A0C, this.A0G * i10, this.A0C, 0, (this.A06 - i10) * this.A0G);
        this.A06 -= i10;
    }

    private void A0B(int i10) {
        int i11 = this.A00 - i10;
        System.arraycopy(this.A0A, this.A0G * i10, this.A0A, 0, this.A0G * i11);
        this.A00 = i11;
    }

    public static void A0C(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr2[i18] * (i10 - i19)) + (sArr3[i17] * i19)) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    private void A0D(short[] sArr, int i10, int i11) {
        this.A0B = A0G(this.A0B, this.A05, i11);
        System.arraycopy(sArr, this.A0G * i10, this.A0B, this.A05 * this.A0G, this.A0G * i11);
        this.A05 += i11;
    }

    private void A0E(short[] sArr, int i10, int i11) {
        int i12 = this.A0J / i11;
        int i13 = this.A0G * i11;
        int i14 = i10 * this.A0G;
        for (int i15 = 0; i15 < i12; i15++) {
            int i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                i16 += sArr[(i15 * i13) + i14 + i17];
            }
            int i18 = i16 / i13;
            String[] strArr = A0M;
            if (strArr[6].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            A0M[4] = "fFYg0yxzP";
            this.A0L[i15] = (short) i18;
        }
    }

    private boolean A0F(int i10, int i11) {
        return i10 != 0 && this.A08 != 0 && i11 <= i10 * 3 && i10 * 2 > this.A07 * 3;
    }

    private short[] A0G(short[] sArr, int i10, int i11) {
        int length = sArr.length / this.A0G;
        if (i10 + i11 <= length) {
            return sArr;
        }
        return Arrays.copyOf(sArr, this.A0G * (((length * 3) / 2) + i11));
    }

    public final int A0H() {
        return this.A05 * this.A0G * 2;
    }

    public final int A0I() {
        return this.A00 * this.A0G * 2;
    }

    public final void A0J() {
        this.A00 = 0;
        this.A05 = 0;
        this.A06 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A09 = 0;
        this.A08 = 0;
        this.A07 = 0;
        this.A02 = 0;
        this.A01 = 0;
    }

    public final void A0K() {
        int i10 = this.A00;
        int i11 = this.A05 + ((int) ((((i10 / (this.A0F / this.A0D)) + this.A06) / (this.A0E * this.A0D)) + 0.5f));
        this.A0A = A0G(this.A0A, this.A00, (this.A0J * 2) + i10);
        for (int i12 = 0; i12 < this.A0J * 2 * this.A0G; i12++) {
            this.A0A[(this.A0G * i10) + i12] = 0;
        }
        this.A00 += this.A0J * 2;
        A06();
        if (this.A05 > i11) {
            this.A05 = i11;
        }
        this.A00 = 0;
        this.A09 = 0;
        this.A06 = 0;
    }

    public final void A0L(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.A0G, this.A05);
        shortBuffer.put(this.A0B, 0, this.A0G * iMin);
        this.A05 -= iMin;
        System.arraycopy(this.A0B, this.A0G * iMin, this.A0B, 0, this.A05 * this.A0G);
    }

    public final void A0M(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining() / this.A0G;
        int i10 = this.A0G * iRemaining * 2;
        this.A0A = A0G(this.A0A, this.A00, iRemaining);
        shortBuffer.get(this.A0A, this.A00 * this.A0G, i10 / 2);
        this.A00 += iRemaining;
        A06();
    }
}
