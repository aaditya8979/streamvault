package j9;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: compiled from: ByteMatrix.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[][] f72355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f72356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f72357c;

    public b(int i10, int i11) {
        this.f72355a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i11, i10);
        this.f72356b = i10;
        this.f72357c = i11;
    }

    public void a(byte b10) {
        for (byte[] bArr : this.f72355a) {
            Arrays.fill(bArr, b10);
        }
    }

    public byte b(int i10, int i11) {
        return this.f72355a[i11][i10];
    }

    public byte[][] c() {
        return this.f72355a;
    }

    public int d() {
        return this.f72357c;
    }

    public int e() {
        return this.f72356b;
    }

    public void f(int i10, int i11, int i12) {
        this.f72355a[i11][i10] = (byte) i12;
    }

    public void g(int i10, int i11, boolean z10) {
        this.f72355a[i11][i10] = z10 ? (byte) 1 : (byte) 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((this.f72356b * 2 * this.f72357c) + 2);
        for (int i10 = 0; i10 < this.f72357c; i10++) {
            byte[] bArr = this.f72355a[i10];
            for (int i11 = 0; i11 < this.f72356b; i11++) {
                byte b10 = bArr[i11];
                if (b10 == 0) {
                    sb2.append(" 0");
                } else if (b10 != 1) {
                    sb2.append("  ");
                } else {
                    sb2.append(" 1");
                }
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
