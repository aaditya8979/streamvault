package s7;

import androidx.annotation.Nullable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: compiled from: ParsableByteArray.java */
/* JADX INFO: loaded from: classes11.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f79438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f79439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f79440c;

    public a0() {
        this.f79438a = m0.f79492f;
    }

    public a0(int i10) {
        this.f79438a = new byte[i10];
        this.f79440c = i10;
    }

    public a0(byte[] bArr) {
        this.f79438a = bArr;
        this.f79440c = bArr.length;
    }

    public a0(byte[] bArr, int i10) {
        this.f79438a = bArr;
        this.f79440c = i10;
    }

    public String A(int i10) {
        return B(i10, y7.c.f87337c);
    }

    public String B(int i10, Charset charset) {
        String str = new String(this.f79438a, this.f79439b, i10, charset);
        this.f79439b += i10;
        return str;
    }

    public int C() {
        return (D() << 21) | (D() << 14) | (D() << 7) | D();
    }

    public int D() {
        byte[] bArr = this.f79438a;
        int i10 = this.f79439b;
        this.f79439b = i10 + 1;
        return bArr[i10] & 255;
    }

    public int E() {
        byte[] bArr = this.f79438a;
        int i10 = this.f79439b;
        int i11 = i10 + 1;
        int i12 = (bArr[i11] & 255) | ((bArr[i10] & 255) << 8);
        this.f79439b = i11 + 1 + 2;
        return i12;
    }

    public long F() {
        byte[] bArr = this.f79438a;
        int i10 = this.f79439b;
        int i11 = i10 + 1;
        long j10 = (((long) bArr[i10]) & 255) << 24;
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 16) | ((((long) bArr[i12]) & 255) << 8);
        this.f79439b = i13 + 1;
        return j11 | (((long) bArr[i13]) & 255);
    }

    public int G() {
        byte[] bArr = this.f79438a;
        int i10 = this.f79439b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = ((bArr[i10] & 255) << 16) | ((bArr[i11] & 255) << 8);
        this.f79439b = i12 + 1;
        return (bArr[i12] & 255) | i13;
    }

    public int H() {
        int iN = n();
        if (iN >= 0) {
            return iN;
        }
        throw new IllegalStateException("Top bit not zero: " + iN);
    }

    public long I() {
        long jW = w();
        if (jW >= 0) {
            return jW;
        }
        throw new IllegalStateException("Top bit not zero: " + jW);
    }

    public int J() {
        byte[] bArr = this.f79438a;
        int i10 = this.f79439b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & 255) << 8;
        this.f79439b = i11 + 1;
        return (bArr[i11] & 255) | i12;
    }

    public long K() {
        int i10;
        int i11;
        long j10 = this.f79438a[this.f79439b];
        int i12 = 7;
        while (true) {
            if (i12 < 0) {
                break;
            }
            int i13 = 1 << i12;
            if ((((long) i13) & j10) != 0) {
                i12--;
            } else if (i12 < 6) {
                j10 &= (long) (i13 - 1);
                i11 = 7 - i12;
            } else if (i12 == 7) {
                i11 = 1;
            }
        }
        i11 = 0;
        if (i11 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j10);
        }
        for (i10 = 1; i10 < i11; i10++) {
            byte b10 = this.f79438a[this.f79439b + i10];
            if ((b10 & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j10);
            }
            j10 = (j10 << 6) | ((long) (b10 & 63));
        }
        this.f79439b += i11;
        return j10;
    }

    public void L(int i10) {
        N(b() < i10 ? new byte[i10] : this.f79438a, i10);
    }

    public void M(byte[] bArr) {
        N(bArr, bArr.length);
    }

    public void N(byte[] bArr, int i10) {
        this.f79438a = bArr;
        this.f79440c = i10;
        this.f79439b = 0;
    }

    public void O(int i10) {
        a.a(i10 >= 0 && i10 <= this.f79438a.length);
        this.f79440c = i10;
    }

    public void P(int i10) {
        a.a(i10 >= 0 && i10 <= this.f79440c);
        this.f79439b = i10;
    }

    public void Q(int i10) {
        P(this.f79439b + i10);
    }

    public int a() {
        return this.f79440c - this.f79439b;
    }

    public int b() {
        return this.f79438a.length;
    }

    public void c(int i10) {
        if (i10 > b()) {
            this.f79438a = Arrays.copyOf(this.f79438a, i10);
        }
    }

    public byte[] d() {
        return this.f79438a;
    }

    public int e() {
        return this.f79439b;
    }

    public int f() {
        return this.f79440c;
    }

    public char g() {
        byte[] bArr = this.f79438a;
        int i10 = this.f79439b;
        return (char) ((bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8));
    }

    public int h() {
        return this.f79438a[this.f79439b] & 255;
    }

    public void i(z zVar, int i10) {
        j(zVar.f79571a, 0, i10);
        zVar.p(0);
    }

    public void j(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f79438a, this.f79439b, bArr, i10, i11);
        this.f79439b += i11;
    }

    @Nullable
    public String k(char c10) {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f79439b;
        while (i10 < this.f79440c && this.f79438a[i10] != c10) {
            i10++;
        }
        byte[] bArr = this.f79438a;
        int i11 = this.f79439b;
        String strB = m0.B(bArr, i11, i10 - i11);
        this.f79439b = i10;
        if (i10 < this.f79440c) {
            this.f79439b = i10 + 1;
        }
        return strB;
    }

    public double l() {
        return Double.longBitsToDouble(w());
    }

    public float m() {
        return Float.intBitsToFloat(n());
    }

    public int n() {
        byte[] bArr = this.f79438a;
        int i10 = this.f79439b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = ((bArr[i10] & 255) << 24) | ((bArr[i11] & 255) << 16);
        int i14 = i12 + 1;
        int i15 = i13 | ((bArr[i12] & 255) << 8);
        this.f79439b = i14 + 1;
        return (bArr[i14] & 255) | i15;
    }

    public int o() {
        byte[] bArr = this.f79438a;
        int i10 = this.f79439b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (((bArr[i10] & 255) << 24) >> 8) | ((bArr[i11] & 255) << 8);
        this.f79439b = i12 + 1;
        return (bArr[i12] & 255) | i13;
    }

    @Nullable
    public String p() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f79439b;
        while (i10 < this.f79440c && !m0.p0(this.f79438a[i10])) {
            i10++;
        }
        int i11 = this.f79439b;
        if (i10 - i11 >= 3) {
            byte[] bArr = this.f79438a;
            if (bArr[i11] == -17 && bArr[i11 + 1] == -69 && bArr[i11 + 2] == -65) {
                this.f79439b = i11 + 3;
            }
        }
        byte[] bArr2 = this.f79438a;
        int i12 = this.f79439b;
        String strB = m0.B(bArr2, i12, i10 - i12);
        this.f79439b = i10;
        int i13 = this.f79440c;
        if (i10 == i13) {
            return strB;
        }
        byte[] bArr3 = this.f79438a;
        if (bArr3[i10] == 13) {
            int i14 = i10 + 1;
            this.f79439b = i14;
            if (i14 == i13) {
                return strB;
            }
        }
        int i15 = this.f79439b;
        if (bArr3[i15] == 10) {
            this.f79439b = i15 + 1;
        }
        return strB;
    }

    public int q() {
        byte[] bArr = this.f79438a;
        int i10 = this.f79439b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (bArr[i10] & 255) | ((bArr[i11] & 255) << 8);
        int i14 = i12 + 1;
        int i15 = i13 | ((bArr[i12] & 255) << 16);
        this.f79439b = i14 + 1;
        return ((bArr[i14] & 255) << 24) | i15;
    }

    public long r() {
        byte[] bArr = this.f79438a;
        int i10 = this.f79439b;
        int i11 = i10 + 1;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8) | ((((long) bArr[i12]) & 255) << 16);
        int i14 = i13 + 1;
        long j12 = j11 | ((((long) bArr[i13]) & 255) << 24);
        int i15 = i14 + 1;
        long j13 = j12 | ((((long) bArr[i14]) & 255) << 32);
        int i16 = i15 + 1;
        long j14 = j13 | ((((long) bArr[i15]) & 255) << 40);
        int i17 = i16 + 1;
        long j15 = j14 | ((((long) bArr[i16]) & 255) << 48);
        this.f79439b = i17 + 1;
        return j15 | ((((long) bArr[i17]) & 255) << 56);
    }

    public short s() {
        byte[] bArr = this.f79438a;
        int i10 = this.f79439b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.f79439b = i11 + 1;
        return (short) (((bArr[i11] & 255) << 8) | i12);
    }

    public long t() {
        byte[] bArr = this.f79438a;
        int i10 = this.f79439b;
        int i11 = i10 + 1;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8) | ((((long) bArr[i12]) & 255) << 16);
        this.f79439b = i13 + 1;
        return j11 | ((((long) bArr[i13]) & 255) << 24);
    }

    public int u() {
        int iQ = q();
        if (iQ >= 0) {
            return iQ;
        }
        throw new IllegalStateException("Top bit not zero: " + iQ);
    }

    public int v() {
        byte[] bArr = this.f79438a;
        int i10 = this.f79439b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.f79439b = i11 + 1;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public long w() {
        byte[] bArr = this.f79438a;
        int i10 = this.f79439b;
        int i11 = i10 + 1;
        long j10 = (((long) bArr[i10]) & 255) << 56;
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 48) | ((((long) bArr[i12]) & 255) << 40);
        int i14 = i13 + 1;
        long j12 = j11 | ((((long) bArr[i13]) & 255) << 32);
        int i15 = i14 + 1;
        long j13 = j12 | ((((long) bArr[i14]) & 255) << 24);
        int i16 = i15 + 1;
        long j14 = j13 | ((((long) bArr[i15]) & 255) << 16);
        int i17 = i16 + 1;
        long j15 = j14 | ((((long) bArr[i16]) & 255) << 8);
        this.f79439b = i17 + 1;
        return j15 | (((long) bArr[i17]) & 255);
    }

    @Nullable
    public String x() {
        return k((char) 0);
    }

    public String y(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f79439b;
        int i12 = (i11 + i10) - 1;
        String strB = m0.B(this.f79438a, i11, (i12 >= this.f79440c || this.f79438a[i12] != 0) ? i10 : i10 - 1);
        this.f79439b += i10;
        return strB;
    }

    public short z() {
        byte[] bArr = this.f79438a;
        int i10 = this.f79439b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & 255) << 8;
        this.f79439b = i11 + 1;
        return (short) ((bArr[i11] & 255) | i12);
    }
}
