package yads;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f91816a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static yads.k0 a(yads.ib2 r9) {
        /*
            r0 = 16
            int r1 = r9.a(r0)
            int r0 = r9.a(r0)
            r2 = 4
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r3) goto L18
            r0 = 24
            int r0 = r9.a(r0)
            r3 = 7
            goto L19
        L18:
            r3 = r2
        L19:
            int r0 = r0 + r3
            r3 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r3) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r3 = r9.a(r1)
            r4 = 3
            if (r3 != r4) goto L32
        L29:
            r9.a(r1)
            boolean r3 = r9.e()
            if (r3 != 0) goto L29
        L32:
            r3 = 10
            int r3 = r9.a(r3)
            boolean r5 = r9.e()
            if (r5 == 0) goto L47
            int r5 = r9.a(r4)
            if (r5 <= 0) goto L47
            r9.c(r1)
        L47:
            boolean r5 = r9.e()
            r6 = 48000(0xbb80, float:6.7262E-41)
            r7 = 44100(0xac44, float:6.1797E-41)
            if (r5 == 0) goto L55
            r5 = r6
            goto L56
        L55:
            r5 = r7
        L56:
            int r9 = r9.a(r2)
            r8 = 0
            if (r5 != r7) goto L66
            r7 = 13
            if (r9 != r7) goto L66
            int[] r1 = yads.l0.f91816a
            r8 = r1[r9]
            goto L92
        L66:
            if (r5 != r6) goto L92
            int[] r6 = yads.l0.f91816a
            r7 = 14
            if (r9 >= r7) goto L92
            r8 = r6[r9]
            int r3 = r3 % 5
            r6 = 1
            r7 = 8
            if (r3 == r6) goto L8c
            r6 = 11
            if (r3 == r1) goto L87
            if (r3 == r4) goto L8c
            if (r3 == r2) goto L80
            goto L92
        L80:
            if (r9 == r4) goto L90
            if (r9 == r7) goto L90
            if (r9 != r6) goto L92
            goto L90
        L87:
            if (r9 == r7) goto L90
            if (r9 != r6) goto L92
            goto L90
        L8c:
            if (r9 == r4) goto L90
            if (r9 != r7) goto L92
        L90:
            int r8 = r8 + 1
        L92:
            yads.k0 r9 = new yads.k0
            r9.<init>(r5, r0, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.l0.a(yads.ib2):yads.k0");
    }

    public static void a(int i10, jb2 jb2Var) {
        jb2Var.c(7);
        byte[] bArr = jb2Var.f91147a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i10 >> 16) & 255);
        bArr[5] = (byte) ((i10 >> 8) & 255);
        bArr[6] = (byte) (i10 & 255);
    }
}
