package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class kb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f91539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f91540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f91541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f91542d;

    public kb2(byte[] bArr, int i10, int i11) {
        a(bArr, i10, i11);
    }

    public final void a() {
        int i10 = this.f91541c;
        if (i10 >= 0) {
            int i11 = this.f91540b;
            if (i10 < i11) {
                return;
            }
            if (i10 == i11 && this.f91542d == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final void a(byte[] bArr, int i10, int i11) {
        this.f91539a = bArr;
        this.f91541c = i10;
        this.f91540b = i11;
        this.f91542d = 0;
        a();
    }

    public final boolean a(int i10) {
        int i11 = this.f91541c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f91542d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f91540b) {
                break;
            }
            if (c(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f91540b;
        if (i13 >= i15) {
            return i13 == i15 && i14 == 0;
        }
        return true;
    }

    public final int b(int i10) {
        int i11;
        this.f91542d += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f91542d;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f91542d = i13;
            byte[] bArr = this.f91539a;
            int i14 = this.f91541c;
            i12 |= (bArr[i14] & 255) << i13;
            if (!c(i14 + 1)) {
                i = 1;
            }
            this.f91541c = i14 + i;
        }
        byte[] bArr2 = this.f91539a;
        int i15 = this.f91541c;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f91542d = 0;
            this.f91541c = i15 + (c(i15 + 1) ? 2 : 1);
        }
        a();
        return i16;
    }

    public final boolean b() {
        int i10 = this.f91541c;
        int i11 = this.f91542d;
        int i12 = 0;
        while (this.f91541c < this.f91540b && !c()) {
            i12++;
        }
        boolean z10 = this.f91541c == this.f91540b;
        this.f91541c = i10;
        this.f91542d = i11;
        return !z10 && a((i12 * 2) + 1);
    }

    public final boolean c() {
        boolean z10 = (this.f91539a[this.f91541c] & (128 >> this.f91542d)) != 0;
        f();
        return z10;
    }

    public final boolean c(int i10) {
        if (2 <= i10 && i10 < this.f91540b) {
            byte[] bArr = this.f91539a;
            if (bArr[i10] == 3 && bArr[i10 - 2] == 0 && bArr[i10 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        int i10 = 0;
        while (!c()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? b(i10) : 0);
    }

    public final void d(int i10) {
        int i11 = this.f91541c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f91541c = i13;
        int i14 = (i10 - (i12 * 8)) + this.f91542d;
        this.f91542d = i14;
        if (i14 > 7) {
            this.f91541c = i13 + 1;
            this.f91542d = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.f91541c) {
                a();
                return;
            } else if (c(i11)) {
                this.f91541c++;
                i11 += 2;
            }
        }
    }

    public final int e() {
        int iD = d();
        return ((iD + 1) / 2) * (iD % 2 == 0 ? -1 : 1);
    }

    public final void f() {
        int i10 = this.f91542d + 1;
        this.f91542d = i10;
        if (i10 == 8) {
            this.f91542d = 0;
            int i11 = this.f91541c;
            this.f91541c = i11 + (c(i11 + 1) ? 2 : 1);
        }
        a();
    }
}
