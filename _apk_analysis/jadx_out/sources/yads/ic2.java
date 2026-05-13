package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class ic2 implements m93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ul0 f90756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ib2 f90757b = new ib2(new byte[10]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f90758c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f90759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y63 f90760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f90761f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f90762g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f90763h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f90764i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f90765j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f90766k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f90767l;

    public ic2(ul0 ul0Var) {
        this.f90756a = ul0Var;
    }

    @Override // yads.m93
    public final void a() {
        this.f90758c = 0;
        this.f90759d = 0;
        this.f90763h = false;
        this.f90756a.a();
    }

    @Override // yads.m93
    public final void a(int i10, jb2 jb2Var) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (this.f90760e == null) {
            throw new IllegalStateException();
        }
        int i16 = 2;
        int i17 = 3;
        int i18 = -1;
        int i19 = 0;
        if ((i10 & 1) != 0) {
            int i20 = this.f90758c;
            if (i20 != 0 && i20 != 1) {
                if (i20 == 2) {
                    ih1.d("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i20 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f90765j != -1) {
                        ih1.d("PesReader", "Unexpected start indicator: expected " + this.f90765j + " more bytes");
                    }
                    this.f90756a.b();
                }
            }
            this.f90758c = 1;
            this.f90759d = 0;
        }
        int i21 = i10;
        while (true) {
            int i22 = jb2Var.f91149c;
            int i23 = jb2Var.f91148b;
            int i24 = i22 - i23;
            if (i24 <= 0) {
                return;
            }
            int i25 = this.f90758c;
            if (i25 == 0) {
                i11 = i16;
                i12 = i17;
                i13 = i18;
                i14 = i19;
                jb2Var.e(i24 + i23);
            } else if (i25 == 1) {
                i12 = i17;
                int i26 = i19;
                if (a(9, jb2Var, this.f90757b.f90733a)) {
                    this.f90757b.b(i26);
                    int iA = this.f90757b.a(24);
                    if (iA != 1) {
                        kf1.a("Unexpected start code prefix: ", iA, "PesReader");
                        i13 = -1;
                        this.f90765j = -1;
                        i15 = 0;
                        i11 = 2;
                    } else {
                        this.f90757b.c(8);
                        int iA2 = this.f90757b.a(16);
                        this.f90757b.c(5);
                        this.f90766k = this.f90757b.e();
                        i11 = 2;
                        this.f90757b.c(2);
                        this.f90761f = this.f90757b.e();
                        this.f90762g = this.f90757b.e();
                        this.f90757b.c(6);
                        int iA3 = this.f90757b.a(8);
                        this.f90764i = iA3;
                        if (iA2 == 0) {
                            this.f90765j = -1;
                            i13 = -1;
                        } else {
                            int i27 = (iA2 - 3) - iA3;
                            this.f90765j = i27;
                            if (i27 < 0) {
                                ih1.d("PesReader", "Found negative packet payload size: " + this.f90765j);
                                i13 = -1;
                                this.f90765j = -1;
                            } else {
                                i13 = -1;
                            }
                        }
                        i15 = 2;
                    }
                    this.f90758c = i15;
                    i14 = 0;
                    this.f90759d = 0;
                } else {
                    i14 = i26;
                    i13 = -1;
                    i11 = 2;
                }
            } else if (i25 != i16) {
                if (i25 != i17) {
                    throw new IllegalStateException();
                }
                int i28 = this.f90765j;
                int i29 = i28 == i18 ? i19 : i24 - i28;
                if (i29 > 0) {
                    i24 -= i29;
                    jb2Var.d(i23 + i24);
                }
                this.f90756a.a(jb2Var);
                int i30 = this.f90765j;
                if (i30 != i18) {
                    int i31 = i30 - i24;
                    this.f90765j = i31;
                    if (i31 == 0) {
                        this.f90756a.b();
                        this.f90758c = 1;
                        this.f90759d = i19;
                    }
                }
                i11 = i16;
                i12 = i17;
                i13 = i18;
                i14 = i19;
            } else if (a(Math.min(10, this.f90764i), jb2Var, this.f90757b.f90733a) && a(this.f90764i, jb2Var, (byte[]) null)) {
                this.f90757b.b(i19);
                this.f90767l = -9223372036854775807L;
                if (this.f90761f) {
                    this.f90757b.c(4);
                    long jA = ((long) this.f90757b.a(i17)) << 30;
                    this.f90757b.c(1);
                    long jA2 = ((long) (this.f90757b.a(15) << 15)) | jA;
                    this.f90757b.c(1);
                    long jA3 = jA2 | ((long) this.f90757b.a(15));
                    this.f90757b.c(1);
                    if (!this.f90763h && this.f90762g) {
                        this.f90757b.c(4);
                        long jA4 = ((long) this.f90757b.a(i17)) << 30;
                        this.f90757b.c(1);
                        long jA5 = ((long) (this.f90757b.a(15) << 15)) | jA4;
                        this.f90757b.c(1);
                        long jA6 = jA5 | ((long) this.f90757b.a(15));
                        this.f90757b.c(1);
                        this.f90760e.b(jA6);
                        this.f90763h = true;
                    }
                    this.f90767l = this.f90760e.b(jA3);
                }
                i21 |= this.f90766k ? 4 : 0;
                this.f90756a.a(i21, this.f90767l);
                this.f90758c = 3;
                this.f90759d = 0;
                i19 = 0;
                i18 = -1;
                i17 = 3;
                i16 = 2;
            } else {
                i12 = i17;
                i13 = i18;
                i14 = i19;
                i11 = 2;
            }
            i19 = i14;
            i18 = i13;
            i17 = i12;
            i16 = i11;
        }
    }

    @Override // yads.m93
    public final void a(y63 y63Var, pq0 pq0Var, l93 l93Var) {
        this.f90760e = y63Var;
        this.f90756a.a(pq0Var, l93Var);
    }

    public final boolean a(int i10, jb2 jb2Var, byte[] bArr) {
        int iMin = Math.min(jb2Var.f91149c - jb2Var.f91148b, i10 - this.f90759d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            jb2Var.e(jb2Var.f91148b + iMin);
        } else {
            jb2Var.a(bArr, this.f90759d, iMin);
        }
        int i11 = this.f90759d + iMin;
        this.f90759d = i11;
        return i11 == i10;
    }
}
