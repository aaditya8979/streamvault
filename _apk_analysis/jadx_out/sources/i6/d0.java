package i6;

/* JADX INFO: compiled from: VorbisBitArray.java */
/* JADX INFO: loaded from: classes7.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f63864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f63865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f63866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f63867d;

    public d0(byte[] bArr) {
        this.f63864a = bArr;
        this.f63865b = bArr.length;
    }

    public final void a() {
        int i10;
        int i11 = this.f63866c;
        s7.a.g(i11 >= 0 && (i11 < (i10 = this.f63865b) || (i11 == i10 && this.f63867d == 0)));
    }

    public int b() {
        return (this.f63866c * 8) + this.f63867d;
    }

    public boolean c() {
        boolean z10 = (((this.f63864a[this.f63866c] & 255) >> this.f63867d) & 1) == 1;
        e(1);
        return z10;
    }

    public int d(int i10) {
        int i11 = this.f63866c;
        int iMin = Math.min(i10, 8 - this.f63867d);
        int i12 = i11 + 1;
        int i13 = ((this.f63864a[i11] & 255) >> this.f63867d) & (255 >> (8 - iMin));
        while (iMin < i10) {
            i13 |= (this.f63864a[i12] & 255) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        e(i10);
        return i14;
    }

    public void e(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f63866c + i11;
        this.f63866c = i12;
        int i13 = this.f63867d + (i10 - (i11 * 8));
        this.f63867d = i13;
        if (i13 > 7) {
            this.f63866c = i12 + 1;
            this.f63867d = i13 - 8;
        }
        a();
    }
}
