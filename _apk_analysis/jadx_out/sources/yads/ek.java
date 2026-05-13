package yads;

import android.util.Pair;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ek {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f89282a = ib3.c("OpusHead");

    public static int a(jb2 jb2Var) {
        int iM = jb2Var.m();
        int i10 = iM & 127;
        while ((iM & 128) == 128) {
            iM = jb2Var.m();
            i10 = (i10 << 7) | (iM & 127);
        }
        return i10;
    }

    public static Pair a(int i10, int i11, jb2 jb2Var) throws ob2 {
        Integer num;
        f73 f73Var;
        Pair pairCreate;
        int i12;
        int i13;
        byte[] bArr;
        int i14 = jb2Var.f91148b;
        while (i14 - i10 < i11) {
            jb2Var.e(i14);
            int iB = jb2Var.b();
            qq0.a("childAtomSize must be positive", iB > 0);
            if (jb2Var.b() == 1936289382) {
                int i15 = i14 + 8;
                int i16 = 0;
                int i17 = -1;
                String strA = null;
                Integer numValueOf = null;
                while (i15 - i14 < iB) {
                    jb2Var.e(i15);
                    int iB2 = jb2Var.b();
                    int iB3 = jb2Var.b();
                    if (iB3 == 1718775137) {
                        numValueOf = Integer.valueOf(jb2Var.b());
                    } else if (iB3 == 1935894637) {
                        jb2Var.e(jb2Var.f91148b + 4);
                        strA = jb2Var.a(4, bu.f88145c);
                    } else if (iB3 == 1935894633) {
                        i17 = i15;
                        i16 = iB2;
                    }
                    i15 += iB2;
                }
                if ("cenc".equals(strA) || "cbc1".equals(strA) || "cens".equals(strA) || "cbcs".equals(strA)) {
                    qq0.a("frma atom is mandatory", numValueOf != null);
                    qq0.a("schi atom is mandatory", i17 != -1);
                    int i18 = i17 + 8;
                    while (true) {
                        if (i18 - i17 >= i16) {
                            num = numValueOf;
                            f73Var = null;
                            break;
                        }
                        jb2Var.e(i18);
                        int iB4 = jb2Var.b();
                        if (jb2Var.b() == 1952804451) {
                            int iB5 = (jb2Var.b() >> 24) & 255;
                            jb2Var.e(jb2Var.f91148b + 1);
                            if (iB5 == 0) {
                                jb2Var.e(jb2Var.f91148b + 1);
                                i12 = 0;
                                i13 = 0;
                            } else {
                                int iM = jb2Var.m();
                                int i19 = (iM & 240) >> 4;
                                i12 = iM & 15;
                                i13 = i19;
                            }
                            boolean z10 = jb2Var.m() == 1;
                            int iM2 = jb2Var.m();
                            byte[] bArr2 = new byte[16];
                            jb2Var.a(bArr2, 0, 16);
                            if (z10 && iM2 == 0) {
                                int iM3 = jb2Var.m();
                                byte[] bArr3 = new byte[iM3];
                                jb2Var.a(bArr3, 0, iM3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = numValueOf;
                            f73Var = new f73(z10, strA, iM2, bArr2, i13, i12, bArr);
                        } else {
                            i18 += iB4;
                        }
                    }
                    qq0.a("tenc atom is mandatory", f73Var != null);
                    int i20 = ib3.f90737a;
                    pairCreate = Pair.create(num, f73Var);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i14 += iB;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x07af  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x07b7  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0798 A[EDGE_INSN: B:354:0x0798->B:304:0x0798 BREAK  A[LOOP:6: B:287:0x0738->B:303:0x078f], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList a(yads.vj r47, yads.zy0 r48, long r49, yads.kk0 r51, boolean r52, boolean r53, yads.wy0 r54) {
        /*
            Method dump skipped, instruction units count: 2205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ek.a(yads.vj, yads.zy0, long, yads.kk0, boolean, boolean, yads.wy0):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:232:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0679  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static yads.bk a(yads.jb2 r47, int r48, int r49, java.lang.String r50, yads.kk0 r51, boolean r52) throws yads.ob2 {
        /*
            Method dump skipped, instruction units count: 2825
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ek.a(yads.jb2, int, int, java.lang.String, yads.kk0, boolean):yads.bk");
    }

    public static zj a(int i10, jb2 jb2Var) {
        jb2Var.e(i10 + 12);
        jb2Var.e(jb2Var.f91148b + 1);
        a(jb2Var);
        jb2Var.e(jb2Var.f91148b + 2);
        int iM = jb2Var.m();
        if ((iM & 128) != 0) {
            jb2Var.e(jb2Var.f91148b + 2);
        }
        if ((iM & 64) != 0) {
            jb2Var.e(jb2Var.f91148b + jb2Var.m());
        }
        if ((iM & 32) != 0) {
            jb2Var.e(jb2Var.f91148b + 2);
        }
        jb2Var.e(jb2Var.f91148b + 1);
        a(jb2Var);
        String strA = ht1.a(jb2Var.m());
        if ("audio/mpeg".equals(strA) || "audio/vnd.dts".equals(strA) || "audio/vnd.dts.hd".equals(strA)) {
            return new zj(strA, null, -1L, -1L);
        }
        jb2Var.e(jb2Var.f91148b + 4);
        long jN = jb2Var.n();
        long jN2 = jb2Var.n();
        jb2Var.e(jb2Var.f91148b + 1);
        int iA = a(jb2Var);
        byte[] bArr = new byte[iA];
        jb2Var.a(bArr, 0, iA);
        if (jN2 <= 0) {
            jN2 = -1;
        }
        return new zj(strA, bArr, jN2, jN > 0 ? jN : -1L);
    }
}
