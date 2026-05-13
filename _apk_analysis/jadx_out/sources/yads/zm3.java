package yads;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zm3 extends z33 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ym3 f97671n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f97672o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f97673p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public cn3 f97674q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public an3 f97675r;

    @Override // yads.z33
    public final long a(jb2 jb2Var) {
        byte[] bArr = jb2Var.f91147a;
        byte b10 = bArr[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        ym3 ym3Var = this.f97671n;
        if (ym3Var == null) {
            throw new IllegalStateException();
        }
        int i10 = !ym3Var.f97241d[(b10 >> 1) & (255 >>> (8 - ym3Var.f97242e))].f88096a ? ym3Var.f97238a.f88519e : ym3Var.f97238a.f88520f;
        long j10 = this.f97673p ? (this.f97672o + i10) / 4 : 0;
        int length = bArr.length;
        int i11 = jb2Var.f91149c + 4;
        if (length < i11) {
            jb2Var.a(Arrays.copyOf(bArr, i11));
        } else {
            jb2Var.d(i11);
        }
        byte[] bArr2 = jb2Var.f91147a;
        int i12 = jb2Var.f91149c;
        bArr2[i12 - 4] = (byte) (j10 & 255);
        bArr2[i12 - 3] = (byte) ((j10 >>> 8) & 255);
        bArr2[i12 - 2] = (byte) ((j10 >>> 16) & 255);
        bArr2[i12 - 1] = (byte) ((j10 >>> 24) & 255);
        this.f97673p = true;
        this.f97672o = i10;
        return j10;
    }

    @Override // yads.z33
    public final void a(long j10) {
        this.f97382g = j10;
        this.f97673p = j10 != 0;
        cn3 cn3Var = this.f97674q;
        this.f97672o = cn3Var != null ? cn3Var.f88519e : 0;
    }

    @Override // yads.z33
    public final void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f97671n = null;
            this.f97674q = null;
            this.f97675r = null;
        }
        this.f97672o = 0;
        this.f97673p = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v48 */
    @Override // yads.z33
    public final boolean a(jb2 jb2Var, long j10, x33 x33Var) throws ob2 {
        ym3 ym3Var;
        tm3 tm3Var;
        tm3 tm3Var2;
        boolean z10;
        tm3 tm3Var3;
        if (this.f97671n != null) {
            x33Var.f96626a.getClass();
            return false;
        }
        cn3 cn3Var = this.f97674q;
        boolean z11 = true;
        if (cn3Var == null) {
            this.f97674q = dn3.a(jb2Var);
        } else {
            an3 an3Var = this.f97675r;
            if (an3Var == null) {
                this.f97675r = dn3.a(jb2Var, true, true);
            } else {
                int i10 = jb2Var.f91149c;
                byte[] bArr = new byte[i10];
                System.arraycopy(jb2Var.f91147a, 0, bArr, 0, i10);
                int i11 = cn3Var.f88515a;
                int i12 = 5;
                dn3.a(5, jb2Var, false);
                int iM = jb2Var.m() + 1;
                tm3 tm3Var4 = new tm3(jb2Var.f91147a);
                tm3Var4.b(jb2Var.f91148b * 8);
                int i13 = 0;
                while (i13 < iM) {
                    if (tm3Var4.a(24) != 5653314) {
                        tm3 tm3Var5 = tm3Var4;
                        throw new ob2("expected code book to start with [0x56, 0x43, 0x42] at " + ((tm3Var5.f95283c * 8) + tm3Var5.f95284d), null, true, 1);
                    }
                    int iA = tm3Var4.a(16);
                    int iA2 = tm3Var4.a(24);
                    long[] jArr = new long[iA2];
                    long jFloor = 0;
                    if (tm3Var4.a()) {
                        int i14 = i12;
                        tm3Var = tm3Var4;
                        int iA3 = tm3Var.a(i14) + 1;
                        int i15 = 0;
                        while (i15 < iA2) {
                            int i16 = 0;
                            for (int i17 = iA2 - i15; i17 > 0; i17 >>>= 1) {
                                i16++;
                            }
                            int iA4 = tm3Var.a(i16);
                            int i18 = 0;
                            while (i18 < iA4 && i15 < iA2) {
                                jArr[i15] = iA3;
                                i15++;
                                i18++;
                                an3Var = an3Var;
                                bArr = bArr;
                            }
                            iA3++;
                            an3Var = an3Var;
                            bArr = bArr;
                        }
                    } else {
                        boolean zA = tm3Var4.a();
                        int i19 = 0;
                        while (i19 < iA2) {
                            if (zA) {
                                if (tm3Var4.a()) {
                                    tm3Var3 = tm3Var4;
                                    jArr[i19] = tm3Var4.a(i12) + 1;
                                } else {
                                    tm3Var3 = tm3Var4;
                                    jArr[i19] = 0;
                                }
                                tm3Var2 = tm3Var3;
                                z10 = true;
                            } else {
                                int i20 = i12;
                                tm3Var2 = tm3Var4;
                                z10 = true;
                                jArr[i19] = tm3Var2.a(i20) + 1;
                            }
                            i19++;
                            tm3Var4 = tm3Var2;
                            i12 = 5;
                        }
                        tm3Var = tm3Var4;
                    }
                    an3 an3Var2 = an3Var;
                    byte[] bArr2 = bArr;
                    int iA5 = tm3Var.a(4);
                    if (iA5 > 2) {
                        throw new ob2(mg2.a("lookup type greater than 2 not decodable: ", iA5), null, true, 1);
                    }
                    if (iA5 == 1 || iA5 == 2) {
                        tm3Var.b(32);
                        tm3Var.b(32);
                        int iA6 = tm3Var.a(4) + 1;
                        tm3Var.b(1);
                        if (iA5 != 1) {
                            jFloor = ((long) iA2) * ((long) iA);
                        } else if (iA != 0) {
                            jFloor = (long) Math.floor(Math.pow(iA2, 1.0d / ((double) iA)));
                        }
                        tm3Var.b((int) (((long) iA6) * jFloor));
                    }
                    i13++;
                    tm3Var4 = tm3Var;
                    an3Var = an3Var2;
                    bArr = bArr2;
                    i12 = 5;
                    z11 = true;
                }
                an3 an3Var3 = an3Var;
                byte[] bArr3 = bArr;
                boolean z12 = z11;
                tm3 tm3Var6 = tm3Var4;
                int i21 = 6;
                int iA7 = tm3Var6.a(6) + (z12 ? 1 : 0);
                for (int i22 = 0; i22 < iA7; i22++) {
                    if (tm3Var6.a(16) != 0) {
                        throw new ob2("placeholder of time domain transforms not zeroed out", null, z12, z12 ? 1 : 0);
                    }
                }
                int iA8 = tm3Var6.a(6) + (z12 ? 1 : 0);
                int i23 = 0;
                ?? r42 = z12;
                while (true) {
                    int i24 = 3;
                    if (i23 < iA8) {
                        int iA9 = tm3Var6.a(16);
                        if (iA9 == 0) {
                            int i25 = 8;
                            tm3Var6.b(8);
                            tm3Var6.b(16);
                            tm3Var6.b(16);
                            tm3Var6.b(6);
                            tm3Var6.b(8);
                            int iA10 = tm3Var6.a(4) + r42;
                            int i26 = 0;
                            while (i26 < iA10) {
                                tm3Var6.b(i25);
                                i26++;
                                i25 = 8;
                            }
                        } else {
                            if (iA9 != r42) {
                                throw new ob2(mg2.a("floor type greater than 1 not decodable: ", iA9), null, true, 1);
                            }
                            int iA11 = tm3Var6.a(5);
                            int i27 = -1;
                            int[] iArr = new int[iA11];
                            for (int i28 = 0; i28 < iA11; i28++) {
                                int iA12 = tm3Var6.a(4);
                                iArr[i28] = iA12;
                                if (iA12 > i27) {
                                    i27 = iA12;
                                }
                            }
                            int i29 = i27 + 1;
                            int[] iArr2 = new int[i29];
                            int i30 = 0;
                            while (i30 < i29) {
                                iArr2[i30] = tm3Var6.a(i24) + 1;
                                int iA13 = tm3Var6.a(2);
                                int i31 = 8;
                                if (iA13 > 0) {
                                    tm3Var6.b(8);
                                }
                                int i32 = 0;
                                for (int i33 = 1; i32 < (i33 << iA13); i33 = 1) {
                                    tm3Var6.b(i31);
                                    i32++;
                                    i31 = 8;
                                }
                                i30++;
                                i24 = 3;
                            }
                            tm3Var6.b(2);
                            int iA14 = tm3Var6.a(4);
                            int i34 = 0;
                            int i35 = 0;
                            for (int i36 = 0; i36 < iA11; i36++) {
                                i34 += iArr2[iArr[i36]];
                                while (i35 < i34) {
                                    tm3Var6.b(iA14);
                                    i35++;
                                }
                            }
                        }
                        i23++;
                        i21 = 6;
                        r42 = 1;
                    } else {
                        int i37 = 1;
                        int iA15 = tm3Var6.a(i21) + 1;
                        int i38 = 0;
                        while (i38 < iA15) {
                            if (tm3Var6.a(16) > 2) {
                                throw new ob2("residueType greater than 2 is not decodable", null, true, 1);
                            }
                            tm3Var6.b(24);
                            tm3Var6.b(24);
                            tm3Var6.b(24);
                            int iA16 = tm3Var6.a(i21) + i37;
                            int i39 = 8;
                            tm3Var6.b(8);
                            int[] iArr3 = new int[iA16];
                            for (int i40 = 0; i40 < iA16; i40++) {
                                iArr3[i40] = ((tm3Var6.a() ? tm3Var6.a(5) : 0) * 8) + tm3Var6.a(3);
                            }
                            int i41 = 0;
                            while (i41 < iA16) {
                                int i42 = 0;
                                while (i42 < i39) {
                                    if ((iArr3[i41] & (1 << i42)) != 0) {
                                        tm3Var6.b(i39);
                                    }
                                    i42++;
                                    i39 = 8;
                                }
                                i41++;
                                i39 = 8;
                            }
                            i38++;
                            i21 = 6;
                            i37 = 1;
                        }
                        int iA17 = tm3Var6.a(i21) + i37;
                        for (int i43 = 0; i43 < iA17; i43++) {
                            int iA18 = tm3Var6.a(16);
                            if (iA18 != 0) {
                                ih1.b("VorbisUtil", "mapping type other than 0 not supported: " + iA18);
                            } else {
                                int iA19 = tm3Var6.a() ? tm3Var6.a(4) + 1 : 1;
                                if (tm3Var6.a()) {
                                    int iA20 = tm3Var6.a(8) + 1;
                                    for (int i44 = 0; i44 < iA20; i44++) {
                                        int i45 = i11 - 1;
                                        int i46 = 0;
                                        for (int i47 = i45; i47 > 0; i47 >>>= 1) {
                                            i46++;
                                        }
                                        tm3Var6.b(i46);
                                        int i48 = 0;
                                        while (i45 > 0) {
                                            i48++;
                                            i45 >>>= 1;
                                        }
                                        tm3Var6.b(i48);
                                    }
                                }
                                if (tm3Var6.a(2) != 0) {
                                    throw new ob2("to reserved bits must be zero after mapping coupling steps", null, true, 1);
                                }
                                if (iA19 > 1) {
                                    for (int i49 = 0; i49 < i11; i49++) {
                                        tm3Var6.b(4);
                                    }
                                }
                                for (int i50 = 0; i50 < iA19; i50++) {
                                    tm3Var6.b(8);
                                    tm3Var6.b(8);
                                    tm3Var6.b(8);
                                }
                            }
                        }
                        int iA21 = tm3Var6.a(6);
                        int i51 = iA21 + 1;
                        bn3[] bn3VarArr = new bn3[i51];
                        for (int i52 = 0; i52 < i51; i52++) {
                            boolean zA2 = tm3Var6.a();
                            tm3Var6.a(16);
                            tm3Var6.a(16);
                            tm3Var6.a(8);
                            bn3VarArr[i52] = new bn3(zA2);
                        }
                        if (!tm3Var6.a()) {
                            throw new ob2("framing bit after modes not set as expected", null, true, 1);
                        }
                        int i53 = 0;
                        while (iA21 > 0) {
                            i53++;
                            iA21 >>>= 1;
                        }
                        ym3Var = new ym3(cn3Var, an3Var3, bArr3, bn3VarArr, i53);
                    }
                }
            }
        }
        ym3Var = null;
        this.f97671n = ym3Var;
        if (ym3Var == null) {
            return true;
        }
        cn3 cn3Var2 = ym3Var.f97238a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cn3Var2.f88521g);
        arrayList.add(ym3Var.f97240c);
        ts1 ts1VarA = dn3.a(p51.b(ym3Var.f97239b.f87759a));
        lx0 lx0Var = new lx0();
        lx0Var.f92148k = "audio/vorbis";
        lx0Var.f92143f = cn3Var2.f88518d;
        lx0Var.f92144g = cn3Var2.f88517c;
        lx0Var.f92161x = cn3Var2.f88515a;
        lx0Var.f92162y = cn3Var2.f88516b;
        lx0Var.f92150m = arrayList;
        lx0Var.f92146i = ts1VarA;
        x33Var.f96626a = new mx0(lx0Var);
        return true;
    }
}
