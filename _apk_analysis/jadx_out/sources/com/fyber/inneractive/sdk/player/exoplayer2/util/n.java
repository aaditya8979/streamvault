package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f18794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18796c;

    public n() {
    }

    public n(int i10) {
        this.f18794a = new byte[i10];
        this.f18796c = i10;
    }

    public n(int i10, byte[] bArr) {
        this.f18794a = bArr;
        this.f18796c = i10;
    }

    public n(byte[] bArr) {
        this.f18794a = bArr;
        this.f18796c = bArr.length;
    }

    public final int a() {
        byte[] bArr = this.f18794a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public final String a(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f18795b;
        int i12 = (i11 + i10) - 1;
        String str = new String(this.f18794a, i11, (i12 >= this.f18796c || this.f18794a[i12] != 0) ? i10 : i10 - 1);
        this.f18795b += i10;
        return str;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f18794a, this.f18795b, bArr, i10, i11);
        this.f18795b += i11;
    }

    public final int b() {
        byte[] bArr = this.f18794a;
        int i10 = this.f18795b;
        int i11 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24);
        int i12 = i10 + 3;
        int i13 = i11 | ((bArr[i10 + 2] & 255) << 8);
        this.f18795b = i10 + 4;
        return (bArr[i12] & 255) | i13;
    }

    public final String b(int i10) {
        String str = new String(this.f18794a, this.f18795b, i10, Charset.defaultCharset());
        this.f18795b += i10;
        return str;
    }

    public final String c() {
        int i10 = this.f18796c;
        int i11 = this.f18795b;
        if (i10 - i11 == 0) {
            return null;
        }
        while (i11 < this.f18796c) {
            byte b10 = this.f18794a[i11];
            int i12 = z.f18822a;
            if (b10 == 10 || b10 == 13) {
                break;
            }
            i11++;
        }
        int i13 = this.f18795b;
        if (i11 - i13 >= 3) {
            byte[] bArr = this.f18794a;
            if (bArr[i13] == -17 && bArr[i13 + 1] == -69 && bArr[i13 + 2] == -65) {
                this.f18795b = i13 + 3;
            }
        }
        byte[] bArr2 = this.f18794a;
        int i14 = this.f18795b;
        String str = new String(bArr2, i14, i11 - i14);
        this.f18795b = i11;
        int i15 = this.f18796c;
        if (i11 == i15) {
            return str;
        }
        byte[] bArr3 = this.f18794a;
        if (bArr3[i11] == 13) {
            int i16 = i11 + 1;
            this.f18795b = i16;
            if (i16 == i15) {
                return str;
            }
        }
        int i17 = this.f18795b;
        if (bArr3[i17] == 10) {
            this.f18795b = i17 + 1;
        }
        return str;
    }

    public final void c(int i10) {
        this.f18794a = a() < i10 ? new byte[i10] : this.f18794a;
        this.f18796c = i10;
        this.f18795b = 0;
    }

    public final int d() {
        byte[] bArr = this.f18794a;
        int i10 = this.f18795b;
        int i11 = ((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255);
        int i12 = i10 + 3;
        int i13 = i11 | ((bArr[i10 + 2] & 255) << 16);
        this.f18795b = i10 + 4;
        return ((bArr[i12] & 255) << 24) | i13;
    }

    public final void d(int i10) {
        if (i10 < 0 || i10 > this.f18794a.length) {
            throw new IllegalArgumentException();
        }
        this.f18796c = i10;
    }

    public final long e() {
        byte[] bArr = this.f18794a;
        int i10 = this.f18795b;
        int i11 = i10 + 3;
        long j10 = (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16);
        this.f18795b = i10 + 4;
        return ((((long) bArr[i11]) & 255) << 24) | j10;
    }

    public final void e(int i10) {
        if (i10 < 0 || i10 > this.f18796c) {
            throw new IllegalArgumentException();
        }
        this.f18795b = i10;
    }

    public final int f() {
        byte[] bArr = this.f18794a;
        int i10 = this.f18795b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.f18795b = i10 + 2;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public final long g() {
        byte[] bArr = this.f18794a;
        int i10 = this.f18795b;
        int i11 = i10 + 7;
        long j10 = ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
        this.f18795b = i10 + 8;
        return (((long) bArr[i11]) & 255) | j10;
    }

    public final void h() {
        int i10 = this.f18796c;
        int i11 = this.f18795b;
        if (i10 - i11 == 0) {
            return;
        }
        while (i11 < this.f18796c && this.f18794a[i11] != 0) {
            i11++;
        }
        byte[] bArr = this.f18794a;
        int i12 = this.f18795b;
        new String(bArr, i12, i11 - i12);
        this.f18795b = i11;
        if (i11 < this.f18796c) {
            this.f18795b = i11 + 1;
        }
    }

    public final int i() {
        return (j() << 21) | (j() << 14) | (j() << 7) | j();
    }

    public final int j() {
        byte[] bArr = this.f18794a;
        int i10 = this.f18795b;
        this.f18795b = i10 + 1;
        return bArr[i10] & 255;
    }

    public final long k() {
        byte[] bArr = this.f18794a;
        int i10 = this.f18795b;
        int i11 = i10 + 3;
        long j10 = ((((long) bArr[i10]) & 255) << 24) | ((((long) bArr[i10 + 1]) & 255) << 16) | ((((long) bArr[i10 + 2]) & 255) << 8);
        this.f18795b = i10 + 4;
        return (((long) bArr[i11]) & 255) | j10;
    }

    public final int l() {
        byte[] bArr = this.f18794a;
        int i10 = this.f18795b;
        int i11 = i10 + 2;
        int i12 = ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10] & 255) << 16);
        this.f18795b = i10 + 3;
        return (bArr[i11] & 255) | i12;
    }

    public final int m() {
        int iB = b();
        if (iB >= 0) {
            return iB;
        }
        throw new IllegalStateException(com.fyber.inneractive.sdk.player.exoplayer2.m.a("Top bit not zero: ", iB));
    }

    public final long n() {
        long jG = g();
        if (jG >= 0) {
            return jG;
        }
        throw new IllegalStateException("Top bit not zero: " + jG);
    }

    public final int o() {
        byte[] bArr = this.f18794a;
        int i10 = this.f18795b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & 255) << 8;
        this.f18795b = i10 + 2;
        return (bArr[i11] & 255) | i12;
    }
}
