package com.bytedance.sdk.component.vt.ouw.vt;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class ra extends yu {
    public final transient int[] pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public final transient byte[][] f12833ra;

    public ra(ouw ouwVar, int i10) {
        super(null);
        bly.ouw(ouwVar.f12832lh, 0L, i10);
        fkw fkwVar = ouwVar.vt;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            int i14 = fkwVar.f12830lh;
            int i15 = fkwVar.vt;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            fkwVar = fkwVar.f12829le;
        }
        this.f12833ra = new byte[i13][];
        this.pno = new int[i13 * 2];
        fkw fkwVar2 = ouwVar.vt;
        int i16 = 0;
        while (i11 < i10) {
            byte[][] bArr = this.f12833ra;
            bArr[i16] = fkwVar2.ouw;
            int i17 = fkwVar2.f12830lh;
            int i18 = fkwVar2.vt;
            i11 += i17 - i18;
            if (i11 > i10) {
                i11 = i10;
            }
            int[] iArr = this.pno;
            iArr[i16] = i11;
            iArr[bArr.length + i16] = i18;
            fkwVar2.yu = true;
            i16++;
            fkwVar2 = fkwVar2.f12829le;
        }
    }

    private yu fkw() {
        return new yu(yu());
    }

    private int vt(int i10) {
        int iBinarySearch = Arrays.binarySearch(this.pno, 0, this.f12833ra.length, i10 + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c A[RETURN] */
    @Override // com.bytedance.sdk.component.vt.ouw.vt.yu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 1
            if (r12 != r11) goto L4
            return r0
        L4:
            boolean r1 = r12 instanceof com.bytedance.sdk.component.vt.ouw.vt.yu
            r2 = 0
            if (r1 == 0) goto L5d
            com.bytedance.sdk.component.vt.ouw.vt.yu r12 = (com.bytedance.sdk.component.vt.ouw.vt.yu) r12
            int r1 = r12.lh()
            int r3 = r11.lh()
            if (r1 != r3) goto L5d
            int r1 = r11.lh()
            int r3 = r11.lh()
            int r3 = r3 - r1
            if (r3 >= 0) goto L22
        L20:
            r12 = r2
            goto L5a
        L22:
            int r3 = r11.vt(r2)
            r4 = r2
            r5 = r4
        L28:
            if (r1 <= 0) goto L59
            if (r3 != 0) goto L2e
            r6 = r2
            goto L34
        L2e:
            int[] r6 = r11.pno
            int r7 = r3 + (-1)
            r6 = r6[r7]
        L34:
            int[] r7 = r11.pno
            r7 = r7[r3]
            int r7 = r7 - r6
            int r7 = r7 + r6
            int r7 = r7 - r4
            int r7 = java.lang.Math.min(r1, r7)
            int[] r8 = r11.pno
            byte[][] r9 = r11.f12833ra
            int r10 = r9.length
            int r10 = r10 + r3
            r8 = r8[r10]
            int r6 = r4 - r6
            int r6 = r6 + r8
            r8 = r9[r3]
            boolean r6 = r12.ouw(r5, r8, r6, r7)
            if (r6 != 0) goto L53
            goto L20
        L53:
            int r4 = r4 + r7
            int r5 = r5 + r7
            int r1 = r1 - r7
            int r3 = r3 + 1
            goto L28
        L59:
            r12 = r0
        L5a:
            if (r12 == 0) goto L5d
            return r0
        L5d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.vt.ouw.vt.ra.equals(java.lang.Object):boolean");
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt.yu
    public final int hashCode() {
        int i10 = this.fkw;
        if (i10 != 0) {
            return i10;
        }
        int length = this.f12833ra.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            byte[] bArr = this.f12833ra[i11];
            int[] iArr = this.pno;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        this.fkw = i12;
        return i12;
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt.yu
    public final int lh() {
        return this.pno[this.f12833ra.length - 1];
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt.yu
    public final byte ouw(int i10) {
        bly.ouw(this.pno[this.f12833ra.length - 1], i10, 1L);
        int iVt = vt(i10);
        int i11 = iVt == 0 ? 0 : this.pno[iVt - 1];
        int[] iArr = this.pno;
        byte[][] bArr = this.f12833ra;
        return bArr[iVt][(i10 - i11) + iArr[bArr.length + iVt]];
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt.yu
    public final yu ouw(int i10, int i11) {
        return fkw().ouw(i10, i11);
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt.yu
    public final String ouw() {
        return fkw().ouw();
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt.yu
    public final boolean ouw(int i10, byte[] bArr, int i11, int i12) {
        if (i10 < 0 || i10 > lh() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int iVt = vt(i10);
        while (i12 > 0) {
            int i13 = iVt == 0 ? 0 : this.pno[iVt - 1];
            int iMin = Math.min(i12, ((this.pno[iVt] - i13) + i13) - i10);
            int[] iArr = this.pno;
            byte[][] bArr2 = this.f12833ra;
            if (!bly.ouw(bArr2[iVt], (i10 - i13) + iArr[bArr2.length + iVt], bArr, i11, iMin)) {
                return false;
            }
            i10 += iMin;
            i11 += iMin;
            i12 -= iMin;
            iVt++;
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt.yu
    public final String toString() {
        return fkw().toString();
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt.yu
    public final String vt() {
        return fkw().vt();
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt.yu
    public final byte[] yu() {
        int[] iArr = this.pno;
        byte[][] bArr = this.f12833ra;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr2 = this.pno;
            int i12 = iArr2[length + i10];
            int i13 = iArr2[i10];
            System.arraycopy(this.f12833ra[i10], i12, bArr2, i11, i13 - i11);
            i10++;
            i11 = i13;
        }
        return bArr2;
    }
}
