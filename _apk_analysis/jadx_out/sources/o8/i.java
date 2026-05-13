package o8;

import com.google.zxing.NotFoundException;

/* JADX INFO: compiled from: HybridBinarizer.java */
/* JADX INFO: loaded from: classes7.dex */
public final class i extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f76307e;

    public i(k8.d dVar) {
        super(dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009a A[PHI: r5
      0x009a: PHI (r5v4 int) = (r5v3 int), (r5v7 int), (r5v7 int) binds: [B:31:0x007a, B:33:0x007e, B:34:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[][] i(byte[] r17, int r18, int r19, int r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = 8
            int r3 = r21 + (-8)
            int r4 = r20 + (-8)
            r5 = 2
            int[] r6 = new int[r5]
            r7 = 1
            r6[r7] = r0
            r8 = 0
            r6[r8] = r1
            java.lang.Class r9 = java.lang.Integer.TYPE
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r9, r6)
            int[][] r6 = (int[][]) r6
            r9 = r8
        L1c:
            if (r9 >= r1) goto Lb1
            int r10 = r9 << 3
            if (r10 <= r3) goto L23
            r10 = r3
        L23:
            r11 = r8
        L24:
            if (r11 >= r0) goto La8
            int r12 = r11 << 3
            if (r12 <= r4) goto L2b
            r12 = r4
        L2b:
            int r13 = r10 * r20
            int r13 = r13 + r12
            r12 = 255(0xff, float:3.57E-43)
            r14 = r8
            r15 = r14
            r16 = r15
            r8 = r12
        L35:
            if (r14 >= r2) goto L73
            r7 = r16
            r5 = 0
        L3a:
            if (r5 >= r2) goto L4d
            int r16 = r13 + r5
            r2 = r17[r16]
            r2 = r2 & r12
            int r15 = r15 + r2
            if (r2 >= r8) goto L45
            r8 = r2
        L45:
            if (r2 <= r7) goto L48
            r7 = r2
        L48:
            int r5 = r5 + 1
            r2 = 8
            goto L3a
        L4d:
            int r2 = r7 - r8
            r5 = 24
            if (r2 <= r5) goto L69
        L53:
            int r14 = r14 + 1
            int r13 = r13 + r20
            r2 = 8
            if (r14 >= r2) goto L69
            r5 = 0
        L5c:
            if (r5 >= r2) goto L53
            int r16 = r13 + r5
            r2 = r17[r16]
            r2 = r2 & r12
            int r15 = r15 + r2
            int r5 = r5 + 1
            r2 = 8
            goto L5c
        L69:
            r2 = 1
            int r14 = r14 + r2
            int r13 = r13 + r20
            r16 = r7
            r7 = r2
            r2 = 8
            goto L35
        L73:
            r2 = r7
            int r5 = r15 >> 6
            int r7 = r16 - r8
            r12 = 24
            if (r7 > r12) goto L9a
            int r5 = r8 / 2
            if (r9 <= 0) goto L9a
            if (r11 <= 0) goto L9a
            int r7 = r9 + (-1)
            r7 = r6[r7]
            r12 = r7[r11]
            r13 = r6[r9]
            int r14 = r11 + (-1)
            r13 = r13[r14]
            r15 = 2
            int r13 = r13 * r15
            int r12 = r12 + r13
            r7 = r7[r14]
            int r12 = r12 + r7
            int r7 = r12 / 4
            if (r8 >= r7) goto L9b
            r5 = r7
            goto L9b
        L9a:
            r15 = 2
        L9b:
            r7 = r6[r9]
            r7[r11] = r5
            int r11 = r11 + 1
            r7 = r2
            r5 = r15
            r2 = 8
            r8 = 0
            goto L24
        La8:
            r15 = r5
            r2 = r7
            int r9 = r9 + 1
            r2 = 8
            r8 = 0
            goto L1c
        Lb1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.i.i(byte[], int, int, int, int):int[][]");
    }

    public static void j(byte[] bArr, int i10, int i11, int i12, int i13, int[][] iArr, b bVar) {
        int i14 = i13 - 8;
        int i15 = i12 - 8;
        for (int i16 = 0; i16 < i11; i16++) {
            int i17 = i16 << 3;
            int i18 = i17 > i14 ? i14 : i17;
            int iK = k(i16, i11 - 3);
            for (int i19 = 0; i19 < i10; i19++) {
                int i20 = i19 << 3;
                int i21 = i20 > i15 ? i15 : i20;
                int iK2 = k(i19, i10 - 3);
                int i22 = 0;
                for (int i23 = -2; i23 <= 2; i23++) {
                    int[] iArr2 = iArr[iK + i23];
                    i22 += iArr2[iK2 - 2] + iArr2[iK2 - 1] + iArr2[iK2] + iArr2[iK2 + 1] + iArr2[2 + iK2];
                }
                l(bArr, i21, i18, i22 / 25, i12, bVar);
            }
        }
    }

    public static int k(int i10, int i11) {
        if (i10 < 2) {
            return 2;
        }
        return Math.min(i10, i11);
    }

    public static void l(byte[] bArr, int i10, int i11, int i12, int i13, b bVar) {
        int i14 = (i11 * i13) + i10;
        int i15 = 0;
        while (i15 < 8) {
            for (int i16 = 0; i16 < 8; i16++) {
                if ((bArr[i14 + i16] & 255) <= i12) {
                    bVar.l(i10 + i16, i11 + i15);
                }
            }
            i15++;
            i14 += i13;
        }
    }

    @Override // k8.a
    public k8.a a(k8.d dVar) {
        return new i(dVar);
    }

    @Override // o8.g, k8.a
    public b b() throws NotFoundException {
        b bVar = this.f76307e;
        if (bVar != null) {
            return bVar;
        }
        k8.d dVarE = e();
        int iD = dVarE.d();
        int iA = dVarE.a();
        if (iD < 40 || iA < 40) {
            this.f76307e = super.b();
        } else {
            byte[] bArrB = dVarE.b();
            int i10 = iD >> 3;
            if ((iD & 7) != 0) {
                i10++;
            }
            int i11 = i10;
            int i12 = iA >> 3;
            if ((iA & 7) != 0) {
                i12++;
            }
            int i13 = i12;
            int[][] iArrI = i(bArrB, i11, i13, iD, iA);
            b bVar2 = new b(iD, iA);
            j(bArrB, i11, i13, iD, iA, iArrI, bVar2);
            this.f76307e = bVar2;
        }
        return this.f76307e;
    }
}
