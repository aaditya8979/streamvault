package k4;

/* JADX INFO: compiled from: VorbisBitArray.java */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f72930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f72931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f72932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f72933d;

    public v(byte[] bArr) {
        this.f72930a = bArr;
        this.f72931b = bArr.length;
    }

    public final void a() {
        int i10;
        int i11 = this.f72932c;
        a6.a.f(i11 >= 0 && (i11 < (i10 = this.f72931b) || (i11 == i10 && this.f72933d == 0)));
    }

    public int b() {
        return (this.f72932c * 8) + this.f72933d;
    }

    public boolean c() {
        boolean z10 = (((this.f72930a[this.f72932c] & 255) >> this.f72933d) & 1) == 1;
        e(1);
        return z10;
    }

    public int d(int i10) {
        int i11 = this.f72932c;
        int iMin = Math.min(i10, 8 - this.f72933d);
        int i12 = i11 + 1;
        int i13 = ((this.f72930a[i11] & 255) >> this.f72933d) & (255 >> (8 - iMin));
        while (iMin < i10) {
            i13 |= (this.f72930a[i12] & 255) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        e(i10);
        return i14;
    }

    public void e(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f72932c + i11;
        this.f72932c = i12;
        int i13 = this.f72933d + (i10 - (i11 * 8));
        this.f72933d = i13;
        if (i13 > 7) {
            this.f72932c = i12 + 1;
            this.f72933d = i13 - 8;
        }
        a();
    }
}
