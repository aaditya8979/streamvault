package a6;

/* JADX INFO: compiled from: ParsableNalUnitBitArray.java */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f3623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3626d;

    public u(byte[] bArr, int i10, int i11) {
        i(bArr, i10, i11);
    }

    public final void a() {
        int i10;
        int i11 = this.f3625c;
        a.f(i11 >= 0 && (i11 < (i10 = this.f3624b) || (i11 == i10 && this.f3626d == 0)));
    }

    public boolean b(int i10) {
        int i11 = this.f3625c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f3626d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f3624b) {
                break;
            }
            if (j(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f3624b;
        if (i13 >= i15) {
            return i13 == i15 && i14 == 0;
        }
        return true;
    }

    public boolean c() {
        int i10 = this.f3625c;
        int i11 = this.f3626d;
        int i12 = 0;
        while (this.f3625c < this.f3624b && !d()) {
            i12++;
        }
        boolean z10 = this.f3625c == this.f3624b;
        this.f3625c = i10;
        this.f3626d = i11;
        return !z10 && b((i12 * 2) + 1);
    }

    public boolean d() {
        boolean z10 = (this.f3623a[this.f3625c] & (128 >> this.f3626d)) != 0;
        k();
        return z10;
    }

    public int e(int i10) {
        int i11;
        this.f3626d += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f3626d;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f3626d = i13;
            byte[] bArr = this.f3623a;
            int i14 = this.f3625c;
            i12 |= (bArr[i14] & 255) << i13;
            if (!j(i14 + 1)) {
                i = 1;
            }
            this.f3625c = i14 + i;
        }
        byte[] bArr2 = this.f3623a;
        int i15 = this.f3625c;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f3626d = 0;
            this.f3625c = i15 + (j(i15 + 1) ? 2 : 1);
        }
        a();
        return i16;
    }

    public final int f() {
        int i10 = 0;
        while (!d()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? e(i10) : 0);
    }

    public int g() {
        int iF = f();
        return (iF % 2 == 0 ? -1 : 1) * ((iF + 1) / 2);
    }

    public int h() {
        return f();
    }

    public void i(byte[] bArr, int i10, int i11) {
        this.f3623a = bArr;
        this.f3625c = i10;
        this.f3624b = i11;
        this.f3626d = 0;
        a();
    }

    public final boolean j(int i10) {
        if (2 <= i10 && i10 < this.f3624b) {
            byte[] bArr = this.f3623a;
            if (bArr[i10] == 3 && bArr[i10 - 2] == 0 && bArr[i10 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public void k() {
        int i10 = this.f3626d + 1;
        this.f3626d = i10;
        if (i10 == 8) {
            this.f3626d = 0;
            int i11 = this.f3625c;
            this.f3625c = i11 + (j(i11 + 1) ? 2 : 1);
        }
        a();
    }

    public void l(int i10) {
        int i11 = this.f3625c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f3625c = i13;
        int i14 = this.f3626d + (i10 - (i12 * 8));
        this.f3626d = i14;
        if (i14 > 7) {
            this.f3625c = i13 + 1;
            this.f3626d = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.f3625c) {
                a();
                return;
            } else if (j(i11)) {
                this.f3625c++;
                i11 += 2;
            }
        }
    }
}
