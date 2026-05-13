package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class c93 implements sp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y63 f88397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb2 f88398b = new jb2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f88399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f88400d;

    public c93(int i10, y63 y63Var, int i11) {
        this.f88399c = i10;
        this.f88397a = y63Var;
        this.f88400d = i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:
    
        if (r13 == (-9223372036854775807L)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a2, code lost:
    
        r1 = new yads.rp(-2, r13, r5 + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00af, code lost:
    
        return yads.rp.f94551d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        return r1;
     */
    @Override // yads.sp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yads.rp a(yads.ld0 r18, long r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            long r5 = r1.f91938d
            int r2 = r0.f88400d
            long r2 = (long) r2
            long r7 = r1.f91937c
            long r7 = r7 - r5
            long r2 = java.lang.Math.min(r2, r7)
            int r2 = (int) r2
            yads.jb2 r3 = r0.f88398b
            r3.c(r2)
            yads.jb2 r3 = r0.f88398b
            byte[] r3 = r3.f91147a
            r4 = 0
            r1.b(r3, r4, r2, r4)
            yads.jb2 r1 = r0.f88398b
            int r2 = r1.f91149c
            r3 = -1
            r9 = r3
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L2a:
            int r11 = r1.f91149c
            int r12 = r1.f91148b
            int r11 = r11 - r12
            r15 = 188(0xbc, float:2.63E-43)
            if (r11 < r15) goto L99
            byte[] r11 = r1.f91147a
        L35:
            if (r12 >= r2) goto L40
            r15 = r11[r12]
            r7 = 71
            if (r15 == r7) goto L40
            int r12 = r12 + 1
            goto L35
        L40:
            int r7 = r12 + 188
            if (r7 <= r2) goto L45
            goto L99
        L45:
            int r3 = r0.f88399c
            long r3 = yads.n93.a(r12, r3, r1)
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r8 == 0) goto L94
            yads.y63 r8 = r0.f88397a
            long r3 = r8.b(r3)
            int r8 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r8 <= 0) goto L79
            int r1 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r1 != 0) goto L6a
            yads.rp r7 = new yads.rp
            r2 = -1
            r1 = r7
            r1.<init>(r2, r3, r5)
            goto Laf
        L6a:
            long r12 = r5 + r9
            yads.rp r1 = new yads.rp
            r9 = 0
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r1
            r8.<init>(r9, r10, r12)
            goto Lab
        L79:
            r8 = 100000(0x186a0, double:4.94066E-319)
            long r8 = r8 + r3
            int r8 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r8 <= 0) goto L91
            long r1 = (long) r12
            long r11 = r5 + r1
            yads.rp r1 = new yads.rp
            r8 = 0
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r1
            r7.<init>(r8, r9, r11)
            goto Laf
        L91:
            long r8 = (long) r12
            r13 = r3
            r9 = r8
        L94:
            r1.e(r7)
            long r3 = (long) r7
            goto L2a
        L99:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r1 == 0) goto Lad
            long r15 = r5 + r3
            yads.rp r1 = new yads.rp
            r12 = -2
            r11 = r1
            r11.<init>(r12, r13, r15)
        Lab:
            r7 = r1
            goto Laf
        Lad:
            yads.rp r7 = yads.rp.f94551d
        Laf:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.c93.a(yads.ld0, long):yads.rp");
    }

    @Override // yads.sp
    public final void a() {
        this.f88398b.a(ib3.f90742f);
    }
}
