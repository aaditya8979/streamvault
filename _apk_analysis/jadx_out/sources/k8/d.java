package k8;

/* JADX INFO: compiled from: LuminanceSource.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f73016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f73017b;

    public d(int i10, int i11) {
        this.f73016a = i10;
        this.f73017b = i11;
    }

    public final int a() {
        return this.f73017b;
    }

    public abstract byte[] b();

    public abstract byte[] c(int i10, byte[] bArr);

    public final int d() {
        return this.f73016a;
    }

    public boolean e() {
        return false;
    }

    public d f() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        int i10 = this.f73016a;
        byte[] bArrC = new byte[i10];
        StringBuilder sb2 = new StringBuilder(this.f73017b * (i10 + 1));
        for (int i11 = 0; i11 < this.f73017b; i11++) {
            bArrC = c(i11, bArrC);
            for (int i12 = 0; i12 < this.f73016a; i12++) {
                int i13 = bArrC[i12] & 255;
                sb2.append(i13 < 64 ? '#' : i13 < 128 ? '+' : i13 < 192 ? '.' : ' ');
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
