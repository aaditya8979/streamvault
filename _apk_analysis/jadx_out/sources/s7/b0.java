package s7;

/* JADX INFO: compiled from: ParsableNalUnitBitArray.java */
/* JADX INFO: loaded from: classes11.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f79443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f79444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f79445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f79446d;

    public b0(byte[] bArr, int i10, int i11) {
        i(bArr, i10, i11);
    }

    public final void a() {
        int i10;
        int i11 = this.f79445c;
        a.g(i11 >= 0 && (i11 < (i10 = this.f79444b) || (i11 == i10 && this.f79446d == 0)));
    }

    public boolean b(int i10) {
        int i11 = this.f79445c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f79446d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f79444b) {
                break;
            }
            if (j(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f79444b;
        if (i13 >= i15) {
            return i13 == i15 && i14 == 0;
        }
        return true;
    }

    public boolean c() {
        int i10 = this.f79445c;
        int i11 = this.f79446d;
        int i12 = 0;
        while (this.f79445c < this.f79444b && !d()) {
            i12++;
        }
        boolean z10 = this.f79445c == this.f79444b;
        this.f79445c = i10;
        this.f79446d = i11;
        return !z10 && b((i12 * 2) + 1);
    }

    public boolean d() {
        boolean z10 = (this.f79443a[this.f79445c] & (128 >> this.f79446d)) != 0;
        k();
        return z10;
    }

    public int e(int i10) {
        int i11;
        this.f79446d += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f79446d;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f79446d = i13;
            byte[] bArr = this.f79443a;
            int i14 = this.f79445c;
            i12 |= (bArr[i14] & 255) << i13;
            if (!j(i14 + 1)) {
                i = 1;
            }
            this.f79445c = i14 + i;
        }
        byte[] bArr2 = this.f79443a;
        int i15 = this.f79445c;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f79446d = 0;
            this.f79445c = i15 + (j(i15 + 1) ? 2 : 1);
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
        this.f79443a = bArr;
        this.f79445c = i10;
        this.f79444b = i11;
        this.f79446d = 0;
        a();
    }

    public final boolean j(int i10) {
        if (2 <= i10 && i10 < this.f79444b) {
            byte[] bArr = this.f79443a;
            if (bArr[i10] == 3 && bArr[i10 - 2] == 0 && bArr[i10 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public void k() {
        int i10 = this.f79446d + 1;
        this.f79446d = i10;
        if (i10 == 8) {
            this.f79446d = 0;
            int i11 = this.f79445c;
            this.f79445c = i11 + (j(i11 + 1) ? 2 : 1);
        }
        a();
    }

    public void l(int i10) {
        int i11 = this.f79445c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f79445c = i13;
        int i14 = this.f79446d + (i10 - (i12 * 8));
        this.f79446d = i14;
        if (i14 > 7) {
            this.f79445c = i13 + 1;
            this.f79446d = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.f79445c) {
                a();
                return;
            } else if (j(i11)) {
                this.f79445c++;
                i11 += 2;
            }
        }
    }
}
