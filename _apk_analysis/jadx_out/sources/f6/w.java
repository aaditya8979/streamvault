package f6;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: Sonic.java */
/* JADX INFO: loaded from: classes9.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f61556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f61557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f61558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f61559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f61560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f61561f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f61562g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f61563h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final short[] f61564i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public short[] f61565j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f61566k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public short[] f61567l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f61568m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public short[] f61569n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f61570o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f61571p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f61572q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f61573r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f61574s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f61575t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f61576u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f61577v;

    public w(int i10, int i11, float f10, float f11, int i12) {
        this.f61556a = i10;
        this.f61557b = i11;
        this.f61558c = f10;
        this.f61559d = f11;
        this.f61560e = i10 / i12;
        this.f61561f = i10 / 400;
        int i13 = i10 / 65;
        this.f61562g = i13;
        int i14 = i13 * 2;
        this.f61563h = i14;
        this.f61564i = new short[i14];
        this.f61565j = new short[i14 * i11];
        this.f61567l = new short[i14 * i11];
        this.f61569n = new short[i14 * i11];
    }

    public static void p(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
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

    public final void a(float f10, int i10) {
        int i11;
        int i12;
        if (this.f61568m == i10) {
            return;
        }
        int i13 = this.f61556a;
        int i14 = (int) (i13 / f10);
        while (true) {
            if (i14 <= 16384 && i13 <= 16384) {
                break;
            }
            i14 /= 2;
            i13 /= 2;
        }
        o(i10);
        int i15 = 0;
        while (true) {
            int i16 = this.f61570o;
            if (i15 >= i16 - 1) {
                u(i16 - 1);
                return;
            }
            while (true) {
                i11 = this.f61571p;
                int i17 = (i11 + 1) * i14;
                i12 = this.f61572q;
                if (i17 <= i12 * i13) {
                    break;
                }
                this.f61567l = f(this.f61567l, this.f61568m, 1);
                int i18 = 0;
                while (true) {
                    int i19 = this.f61557b;
                    if (i18 < i19) {
                        this.f61567l[(this.f61568m * i19) + i18] = n(this.f61569n, (i19 * i15) + i18, i13, i14);
                        i18++;
                    }
                }
                this.f61572q++;
                this.f61568m++;
            }
            int i20 = i11 + 1;
            this.f61571p = i20;
            if (i20 == i13) {
                this.f61571p = 0;
                s7.a.g(i12 == i14);
                this.f61572q = 0;
            }
            i15++;
        }
    }

    public final void b(float f10) {
        int iW;
        int i10 = this.f61566k;
        if (i10 < this.f61563h) {
            return;
        }
        int i11 = 0;
        do {
            if (this.f61573r > 0) {
                iW = c(i11);
            } else {
                int iG = g(this.f61565j, i11);
                iW = ((double) f10) > 1.0d ? iG + w(this.f61565j, i11, f10, iG) : m(this.f61565j, i11, f10, iG);
            }
            i11 += iW;
        } while (this.f61563h + i11 <= i10);
        v(i11);
    }

    public final int c(int i10) {
        int iMin = Math.min(this.f61563h, this.f61573r);
        d(this.f61565j, i10, iMin);
        this.f61573r -= iMin;
        return iMin;
    }

    public final void d(short[] sArr, int i10, int i11) {
        short[] sArrF = f(this.f61567l, this.f61568m, i11);
        this.f61567l = sArrF;
        int i12 = this.f61557b;
        System.arraycopy(sArr, i10 * i12, sArrF, this.f61568m * i12, i12 * i11);
        this.f61568m += i11;
    }

    public final void e(short[] sArr, int i10, int i11) {
        int i12 = this.f61563h / i11;
        int i13 = this.f61557b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f61564i[i16] = (short) (i17 / i14);
        }
    }

    public final short[] f(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f61557b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int g(short[] sArr, int i10) {
        int iH;
        int i11 = this.f61556a;
        int i12 = i11 > 4000 ? i11 / 4000 : 1;
        if (this.f61557b == 1 && i12 == 1) {
            iH = h(sArr, i10, this.f61561f, this.f61562g);
        } else {
            e(sArr, i10, i12);
            int iH2 = h(this.f61564i, 0, this.f61561f / i12, this.f61562g / i12);
            if (i12 != 1) {
                int i13 = iH2 * i12;
                int i14 = i12 * 4;
                int i15 = i13 - i14;
                int i16 = i13 + i14;
                int i17 = this.f61561f;
                if (i15 < i17) {
                    i15 = i17;
                }
                int i18 = this.f61562g;
                if (i16 > i18) {
                    i16 = i18;
                }
                if (this.f61557b == 1) {
                    iH = h(sArr, i10, i15, i16);
                } else {
                    e(sArr, i10, 1);
                    iH = h(this.f61564i, 0, i15, i16);
                }
            } else {
                iH = iH2;
            }
        }
        int i19 = q(this.f61576u, this.f61577v) ? this.f61574s : iH;
        this.f61575t = this.f61576u;
        this.f61574s = iH;
        return i19;
    }

    public final int h(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f61557b;
        int i14 = 1;
        int i15 = 255;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int iAbs = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                iAbs += Math.abs(sArr[i13 + i18] - sArr[(i13 + i11) + i18]);
            }
            if (iAbs * i16 < i14 * i11) {
                i16 = i11;
                i14 = iAbs;
            }
            if (iAbs * i15 > i17 * i11) {
                i15 = i11;
                i17 = iAbs;
            }
            i11++;
        }
        this.f61576u = i14 / i16;
        this.f61577v = i17 / i15;
        return i16;
    }

    public void i() {
        this.f61566k = 0;
        this.f61568m = 0;
        this.f61570o = 0;
        this.f61571p = 0;
        this.f61572q = 0;
        this.f61573r = 0;
        this.f61574s = 0;
        this.f61575t = 0;
        this.f61576u = 0;
        this.f61577v = 0;
    }

    public void j(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.f61557b, this.f61568m);
        shortBuffer.put(this.f61567l, 0, this.f61557b * iMin);
        int i10 = this.f61568m - iMin;
        this.f61568m = i10;
        short[] sArr = this.f61567l;
        int i11 = this.f61557b;
        System.arraycopy(sArr, iMin * i11, sArr, 0, i10 * i11);
    }

    public int k() {
        return this.f61568m * this.f61557b * 2;
    }

    public int l() {
        return this.f61566k * this.f61557b * 2;
    }

    public final int m(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 < 0.5f) {
            i12 = (int) ((i11 * f10) / (1.0f - f10));
        } else {
            this.f61573r = (int) ((i11 * ((2.0f * f10) - 1.0f)) / (1.0f - f10));
            i12 = i11;
        }
        int i13 = i11 + i12;
        short[] sArrF = f(this.f61567l, this.f61568m, i13);
        this.f61567l = sArrF;
        int i14 = this.f61557b;
        System.arraycopy(sArr, i10 * i14, sArrF, this.f61568m * i14, i14 * i11);
        p(i12, this.f61557b, this.f61567l, this.f61568m + i11, sArr, i10 + i11, sArr, i10);
        this.f61568m += i13;
        return i12;
    }

    public final short n(short[] sArr, int i10, int i11, int i12) {
        short s10 = sArr[i10];
        short s11 = sArr[i10 + this.f61557b];
        int i13 = this.f61572q * i11;
        int i14 = this.f61571p;
        int i15 = i14 * i12;
        int i16 = (i14 + 1) * i12;
        int i17 = i16 - i13;
        int i18 = i16 - i15;
        return (short) (((s10 * i17) + ((i18 - i17) * s11)) / i18);
    }

    public final void o(int i10) {
        int i11 = this.f61568m - i10;
        short[] sArrF = f(this.f61569n, this.f61570o, i11);
        this.f61569n = sArrF;
        short[] sArr = this.f61567l;
        int i12 = this.f61557b;
        System.arraycopy(sArr, i10 * i12, sArrF, this.f61570o * i12, i12 * i11);
        this.f61568m = i10;
        this.f61570o += i11;
    }

    public final boolean q(int i10, int i11) {
        return i10 != 0 && this.f61574s != 0 && i11 <= i10 * 3 && i10 * 2 > this.f61575t * 3;
    }

    public final void r() {
        int i10 = this.f61568m;
        float f10 = this.f61558c;
        float f11 = this.f61559d;
        float f12 = f10 / f11;
        float f13 = this.f61560e * f11;
        double d10 = f12;
        if (d10 > 1.00001d || d10 < 0.99999d) {
            b(f12);
        } else {
            d(this.f61565j, 0, this.f61566k);
            this.f61566k = 0;
        }
        if (f13 != 1.0f) {
            a(f13, i10);
        }
    }

    public void s() {
        int i10;
        int i11 = this.f61566k;
        float f10 = this.f61558c;
        float f11 = this.f61559d;
        int i12 = this.f61568m + ((int) ((((i11 / (f10 / f11)) + this.f61570o) / (this.f61560e * f11)) + 0.5f));
        this.f61565j = f(this.f61565j, i11, (this.f61563h * 2) + i11);
        int i13 = 0;
        while (true) {
            i10 = this.f61563h;
            int i14 = this.f61557b;
            if (i13 >= i10 * 2 * i14) {
                break;
            }
            this.f61565j[(i14 * i11) + i13] = 0;
            i13++;
        }
        this.f61566k += i10 * 2;
        r();
        if (this.f61568m > i12) {
            this.f61568m = i12;
        }
        this.f61566k = 0;
        this.f61573r = 0;
        this.f61570o = 0;
    }

    public void t(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i10 = this.f61557b;
        int i11 = iRemaining / i10;
        short[] sArrF = f(this.f61565j, this.f61566k, i11);
        this.f61565j = sArrF;
        shortBuffer.get(sArrF, this.f61566k * this.f61557b, ((i10 * i11) * 2) / 2);
        this.f61566k += i11;
        r();
    }

    public final void u(int i10) {
        if (i10 == 0) {
            return;
        }
        short[] sArr = this.f61569n;
        int i11 = this.f61557b;
        System.arraycopy(sArr, i10 * i11, sArr, 0, (this.f61570o - i10) * i11);
        this.f61570o -= i10;
    }

    public final void v(int i10) {
        int i11 = this.f61566k - i10;
        short[] sArr = this.f61565j;
        int i12 = this.f61557b;
        System.arraycopy(sArr, i10 * i12, sArr, 0, i12 * i11);
        this.f61566k = i11;
    }

    public final int w(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 >= 2.0f) {
            i12 = (int) (i11 / (f10 - 1.0f));
        } else {
            this.f61573r = (int) ((i11 * (2.0f - f10)) / (f10 - 1.0f));
            i12 = i11;
        }
        short[] sArrF = f(this.f61567l, this.f61568m, i12);
        this.f61567l = sArrF;
        p(i12, this.f61557b, sArrF, this.f61568m, sArr, i10, sArr, i10 + i11);
        this.f61568m += i12;
        return i12;
    }
}
