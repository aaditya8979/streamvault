package f9;

import java.lang.reflect.Array;

/* JADX INFO: compiled from: BarcodeMatrix.java */
/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b[] f61596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f61597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f61598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f61599d;

    public a(int i10, int i11) {
        b[] bVarArr = new b[i10];
        this.f61596a = bVarArr;
        int length = bVarArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            this.f61596a[i12] = new b(((i11 + 4) * 17) + 1);
        }
        this.f61599d = i11 * 17;
        this.f61598c = i10;
        this.f61597b = -1;
    }

    public b a() {
        return this.f61596a[this.f61597b];
    }

    public byte[][] b(int i10, int i11) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.f61598c * i11, this.f61599d * i10);
        int i12 = this.f61598c * i11;
        for (int i13 = 0; i13 < i12; i13++) {
            bArr[(i12 - i13) - 1] = this.f61596a[i13 / i11].b(i10);
        }
        return bArr;
    }

    public void c() {
        this.f61597b++;
    }
}
