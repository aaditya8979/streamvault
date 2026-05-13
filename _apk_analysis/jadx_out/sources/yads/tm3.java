package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class tm3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f95281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f95282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f95283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f95284d;

    public tm3(byte[] bArr) {
        this.f95281a = bArr;
        this.f95282b = bArr.length;
    }

    public final int a(int i10) {
        int i11 = this.f95283c;
        int iMin = Math.min(i10, 8 - this.f95284d);
        int i12 = i11 + 1;
        int i13 = ((this.f95281a[i11] & 255) >> this.f95284d) & (255 >> (8 - iMin));
        while (iMin < i10) {
            i13 |= (this.f95281a[i12] & 255) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        b(i10);
        return i14;
    }

    public final boolean a() {
        boolean z10 = (((this.f95281a[this.f95283c] & 255) >> this.f95284d) & 1) == 1;
        b(1);
        return z10;
    }

    public final void b(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f95283c + i11;
        this.f95283c = i12;
        int i13 = (i10 - (i11 * 8)) + this.f95284d;
        this.f95284d = i13;
        if (i13 > 7) {
            this.f95283c = i12 + 1;
            this.f95284d = i13 - 8;
        }
        int i14 = this.f95283c;
        if (i14 >= 0) {
            int i15 = this.f95282b;
            if (i14 < i15) {
                return;
            }
            if (i14 == i15 && this.f95284d == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }
}
