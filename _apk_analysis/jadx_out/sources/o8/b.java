package o8;

import java.util.Arrays;

/* JADX INFO: compiled from: BitMatrix.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f76284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f76285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f76286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f76287e;

    public b(int i10) {
        this(i10, i10);
    }

    public b(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f76284b = i10;
        this.f76285c = i11;
        int i12 = (i10 + 31) / 32;
        this.f76286d = i12;
        this.f76287e = new int[i12 * i11];
    }

    public b(int i10, int i11, int i12, int[] iArr) {
        this.f76284b = i10;
        this.f76285c = i11;
        this.f76286d = i12;
        this.f76287e = iArr;
    }

    public final String a(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(this.f76285c * (this.f76284b + 1));
        for (int i10 = 0; i10 < this.f76285c; i10++) {
            for (int i11 = 0; i11 < this.f76284b; i11++) {
                sb2.append(d(i11, i10) ? str : str2);
            }
            sb2.append(str3);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b clone() {
        return new b(this.f76284b, this.f76285c, this.f76286d, (int[]) this.f76287e.clone());
    }

    public void c(int i10, int i11) {
        int i12 = (i11 * this.f76286d) + (i10 / 32);
        int[] iArr = this.f76287e;
        iArr[i12] = (1 << (i10 & 31)) ^ iArr[i12];
    }

    public void clear() {
        int length = this.f76287e.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f76287e[i10] = 0;
        }
    }

    public boolean d(int i10, int i11) {
        return ((this.f76287e[(i11 * this.f76286d) + (i10 / 32)] >>> (i10 & 31)) & 1) != 0;
    }

    public int[] e() {
        int length = this.f76287e.length - 1;
        while (length >= 0 && this.f76287e[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i10 = this.f76286d;
        int i11 = length / i10;
        int i12 = (length % i10) << 5;
        int i13 = 31;
        while ((this.f76287e[length] >>> i13) == 0) {
            i13--;
        }
        return new int[]{i12 + i13, i11};
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f76284b == bVar.f76284b && this.f76285c == bVar.f76285c && this.f76286d == bVar.f76286d && Arrays.equals(this.f76287e, bVar.f76287e);
    }

    public int[] f() {
        int i10 = this.f76284b;
        int i11 = this.f76285c;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < this.f76285c; i14++) {
            int i15 = 0;
            while (true) {
                int i16 = this.f76286d;
                if (i15 < i16) {
                    int i17 = this.f76287e[(i16 * i14) + i15];
                    if (i17 != 0) {
                        if (i14 < i11) {
                            i11 = i14;
                        }
                        if (i14 > i13) {
                            i13 = i14;
                        }
                        int i18 = i15 << 5;
                        if (i18 < i10) {
                            int i19 = 0;
                            while ((i17 << (31 - i19)) == 0) {
                                i19++;
                            }
                            int i20 = i19 + i18;
                            if (i20 < i10) {
                                i10 = i20;
                            }
                        }
                        if (i18 + 31 > i12) {
                            int i21 = 31;
                            while ((i17 >>> i21) == 0) {
                                i21--;
                            }
                            int i22 = i18 + i21;
                            if (i22 > i12) {
                                i12 = i22;
                            }
                        }
                    }
                    i15++;
                }
            }
        }
        if (i12 < i10 || i13 < i11) {
            return null;
        }
        return new int[]{i10, i11, (i12 - i10) + 1, (i13 - i11) + 1};
    }

    public int g() {
        return this.f76285c;
    }

    public a h(int i10, a aVar) {
        if (aVar == null || aVar.l() < this.f76284b) {
            aVar = new a(this.f76284b);
        } else {
            aVar.clear();
        }
        int i11 = i10 * this.f76286d;
        for (int i12 = 0; i12 < this.f76286d; i12++) {
            aVar.r(i12 << 5, this.f76287e[i11 + i12]);
        }
        return aVar;
    }

    public int hashCode() {
        int i10 = this.f76284b;
        return (((((((i10 * 31) + i10) * 31) + this.f76285c) * 31) + this.f76286d) * 31) + Arrays.hashCode(this.f76287e);
    }

    public int[] i() {
        int[] iArr;
        int i10 = 0;
        while (true) {
            iArr = this.f76287e;
            if (i10 >= iArr.length || iArr[i10] != 0) {
                break;
            }
            i10++;
        }
        if (i10 == iArr.length) {
            return null;
        }
        int i11 = this.f76286d;
        int i12 = i10 / i11;
        int i13 = (i10 % i11) << 5;
        int i14 = iArr[i10];
        int i15 = 0;
        while ((i14 << (31 - i15)) == 0) {
            i15++;
        }
        return new int[]{i13 + i15, i12};
    }

    public int j() {
        return this.f76284b;
    }

    public void k() {
        a aVar = new a(this.f76284b);
        a aVar2 = new a(this.f76284b);
        int i10 = (this.f76285c + 1) / 2;
        for (int i11 = 0; i11 < i10; i11++) {
            aVar = h(i11, aVar);
            int i12 = (this.f76285c - 1) - i11;
            aVar2 = h(i12, aVar2);
            aVar.p();
            aVar2.p();
            n(i11, aVar2);
            n(i12, aVar);
        }
    }

    public void l(int i10, int i11) {
        int i12 = (i11 * this.f76286d) + (i10 / 32);
        int[] iArr = this.f76287e;
        iArr[i12] = (1 << (i10 & 31)) | iArr[i12];
    }

    public void m(int i10, int i11, int i12, int i13) {
        if (i11 < 0 || i10 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i13 <= 0 || i12 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i14 = i12 + i10;
        int i15 = i13 + i11;
        if (i15 > this.f76285c || i14 > this.f76284b) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i11 < i15) {
            int i16 = this.f76286d * i11;
            for (int i17 = i10; i17 < i14; i17++) {
                int[] iArr = this.f76287e;
                int i18 = (i17 / 32) + i16;
                iArr[i18] = iArr[i18] | (1 << (i17 & 31));
            }
            i11++;
        }
    }

    public void n(int i10, a aVar) {
        int[] iArrI = aVar.i();
        int[] iArr = this.f76287e;
        int i11 = this.f76286d;
        System.arraycopy(iArrI, 0, iArr, i10 * i11, i11);
    }

    public String o(String str, String str2) {
        return a(str, str2, "\n");
    }

    public String toString() {
        return o("X ", "  ");
    }
}
