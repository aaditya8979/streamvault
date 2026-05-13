package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class li1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f91977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f91978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i73[] f91979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f91980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[][][] f91981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i73 f91982f;

    public li1(int[] iArr, i73[] i73VarArr, int[] iArr2, int[][][] iArr3, i73 i73Var) {
        this.f91978b = iArr;
        this.f91979c = i73VarArr;
        this.f91981e = iArr3;
        this.f91980d = iArr2;
        this.f91982f = i73Var;
        this.f91977a = iArr.length;
    }

    public final int a(int i10, int i11) {
        int i12 = this.f91979c[i10].a(i11).f90268b;
        int[] iArr = new int[i12];
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i12; i15++) {
            if ((this.f91981e[i10][i11][i15] & 7) == 4) {
                iArr[i14] = i15;
                i14++;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, i14);
        int iMin = 16;
        int i16 = 0;
        String str = null;
        boolean z10 = false;
        while (i13 < iArrCopyOf.length) {
            String str2 = this.f91979c[i10].a(i11).f90271e[iArrCopyOf[i13]].f92610m;
            int i17 = i16 + 1;
            if (i16 == 0) {
                str = str2;
            } else {
                z10 |= !ib3.a(str, str2);
            }
            iMin = Math.min(iMin, this.f91981e[i10][i11][i13] & 24);
            i13++;
            i16 = i17;
        }
        return z10 ? Math.min(iMin, this.f91980d[i10]) : iMin;
    }
}
