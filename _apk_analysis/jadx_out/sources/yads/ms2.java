package yads;

import android.util.SparseArray;
import java.io.EOFException;
import yads.ks2;

/* JADX INFO: loaded from: classes9.dex */
public final class ms2 implements m73 {
    public mx0 A;
    public mx0 B;
    public boolean C;
    public boolean D;
    public long E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final is2 f92531a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sk0 f92534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ok0 f92535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ls2 f92536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public mx0 f92537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public mk0 f92538h;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f92546p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f92547q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f92548r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f92549s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f92553w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f92556z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final js2 f92532b = new js2();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f92539i = 1000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f92540j = new int[1000];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long[] f92541k = new long[1000];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long[] f92544n = new long[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f92543m = new int[1000];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f92542l = new int[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public l73[] f92545o = new l73[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f23 f92533c = new f23(new iz() { // from class: bt.p6
        @Override // yads.iz
        public final void accept(Object obj) {
            ((ks2) obj).f91714b.release();
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f92550t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f92551u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f92552v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f92555y = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f92554x = true;

    public ms2(qe qeVar, sk0 sk0Var, ok0 ok0Var) {
        this.f92534d = sk0Var;
        this.f92535e = ok0Var;
        this.f92531a = new is2(qeVar);
    }

    public static ms2 a(qe qeVar) {
        return new ms2(qeVar, null, null);
    }

    public static ms2 a(qe qeVar, sk0 sk0Var, ok0 ok0Var) {
        sk0Var.getClass();
        ok0Var.getClass();
        return new ms2(qeVar, sk0Var, ok0Var);
    }

    public final int a(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.f92544n[i10];
            if (j11 > j10) {
                break;
            }
            if (!z10 || (this.f92543m[i10] & 1) != 0) {
                i12 = i13;
                if (j11 == j10) {
                    break;
                }
            }
            i10++;
            if (i10 == this.f92539i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public final synchronized int a(long j10, boolean z10) {
        int iE = e(this.f92549s);
        int i10 = this.f92549s;
        int i11 = this.f92546p;
        if (i10 != i11 && j10 >= this.f92544n[iE]) {
            if (j10 > this.f92552v && z10) {
                return i11 - i10;
            }
            int iA = a(iE, i11 - i10, j10, true);
            if (iA == -1) {
                return 0;
            }
            return iA;
        }
        return 0;
    }

    @Override // yads.m73
    public final int a(l30 l30Var, int i10, boolean z10) throws EOFException {
        is2 is2Var = this.f92531a;
        hs2 hs2Var = is2Var.f90973f;
        if (hs2Var.f90529c == null) {
            pe peVarA = ((ib0) is2Var.f90968a).a();
            hs2 hs2Var2 = new hs2(is2Var.f90969b, is2Var.f90973f.f90528b);
            hs2Var.f90529c = peVarA;
            hs2Var.f90530d = hs2Var2;
        }
        int iMin = Math.min(i10, (int) (is2Var.f90973f.f90528b - is2Var.f90974g));
        hs2 hs2Var3 = is2Var.f90973f;
        pe peVar = hs2Var3.f90529c;
        int i11 = l30Var.read(peVar.f93560a, ((int) (is2Var.f90974g - hs2Var3.f90527a)) + peVar.f93561b, iMin);
        if (i11 == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j10 = is2Var.f90974g + ((long) i11);
        is2Var.f90974g = j10;
        hs2 hs2Var4 = is2Var.f90973f;
        if (j10 != hs2Var4.f90528b) {
            return i11;
        }
        is2Var.f90973f = hs2Var4.f90530d;
        return i11;
    }

    public final int a(nx0 nx0Var, sa0 sa0Var, int i10, boolean z10) {
        int i11;
        boolean z11 = (i10 & 2) != 0;
        js2 js2Var = this.f92532b;
        synchronized (this) {
            sa0Var.f94750e = false;
            int i12 = this.f92549s;
            i11 = -5;
            if (i12 != this.f92546p) {
                mx0 mx0Var = ((ks2) this.f92533c.c(this.f92547q + i12)).f91713a;
                if (!z11 && mx0Var == this.f92537g) {
                    int iE = e(this.f92549s);
                    mk0 mk0Var = this.f92538h;
                    if (mk0Var != null && mk0Var.getState() != 4 && ((this.f92543m[iE] & 1073741824) != 0 || !this.f92538h.a())) {
                        sa0Var.f94750e = true;
                        i11 = -3;
                    }
                    int i13 = this.f92543m[iE];
                    sa0Var.f94912b = i13;
                    long j10 = this.f92544n[iE];
                    sa0Var.f94751f = j10;
                    if (j10 < this.f92550t) {
                        sa0Var.f94912b = i13 | Integer.MIN_VALUE;
                    }
                    js2Var.f91345a = this.f92542l[iE];
                    js2Var.f91346b = this.f92541k[iE];
                    js2Var.f91347c = this.f92545o[iE];
                    i11 = -4;
                }
                a(mx0Var, nx0Var);
            } else {
                if (!z10 && !this.f92553w) {
                    mx0 mx0Var2 = this.B;
                    if (mx0Var2 == null || (!z11 && mx0Var2 == this.f92537g)) {
                        i11 = -3;
                    } else {
                        a(mx0Var2, nx0Var);
                    }
                }
                sa0Var.f94912b = 4;
                i11 = -4;
            }
        }
        if (i11 == -4 && !sa0Var.b(4)) {
            boolean z12 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                if (z12) {
                    is2 is2Var = this.f92531a;
                    is2.a(is2Var.f90972e, sa0Var, this.f92532b, is2Var.f90970c);
                } else {
                    is2 is2Var2 = this.f92531a;
                    is2Var2.f90972e = is2.a(is2Var2.f90972e, sa0Var, this.f92532b, is2Var2.f90970c);
                }
            }
            if (!z12) {
                this.f92549s++;
            }
        }
        return i11;
    }

    public final long a(int i10) {
        this.f92551u = Math.max(this.f92551u, d(i10));
        this.f92546p -= i10;
        int i11 = this.f92547q + i10;
        this.f92547q = i11;
        int i12 = this.f92548r + i10;
        this.f92548r = i12;
        int i13 = this.f92539i;
        if (i12 >= i13) {
            this.f92548r = i12 - i13;
        }
        int i14 = this.f92549s - i10;
        this.f92549s = i14;
        if (i14 < 0) {
            this.f92549s = 0;
        }
        this.f92533c.b(i11);
        if (this.f92546p != 0) {
            return this.f92541k[this.f92548r];
        }
        int i15 = this.f92548r;
        if (i15 == 0) {
            i15 = this.f92539i;
        }
        int i16 = i15 - 1;
        return this.f92541k[i16] + ((long) this.f92542l[i16]);
    }

    public final void a() {
        long jA;
        is2 is2Var = this.f92531a;
        synchronized (this) {
            int i10 = this.f92546p;
            jA = i10 == 0 ? -1L : a(i10);
        }
        is2Var.a(jA);
    }

    @Override // yads.m73
    public final void a(int i10, jb2 jb2Var) {
        is2 is2Var = this.f92531a;
        while (i10 > 0) {
            hs2 hs2Var = is2Var.f90973f;
            if (hs2Var.f90529c == null) {
                pe peVarA = ((ib0) is2Var.f90968a).a();
                hs2 hs2Var2 = new hs2(is2Var.f90969b, is2Var.f90973f.f90528b);
                hs2Var.f90529c = peVarA;
                hs2Var.f90530d = hs2Var2;
            }
            int iMin = Math.min(i10, (int) (is2Var.f90973f.f90528b - is2Var.f90974g));
            hs2 hs2Var3 = is2Var.f90973f;
            pe peVar = hs2Var3.f90529c;
            jb2Var.a(peVar.f93560a, ((int) (is2Var.f90974g - hs2Var3.f90527a)) + peVar.f93561b, iMin);
            i10 -= iMin;
            long j10 = is2Var.f90974g + ((long) iMin);
            is2Var.f90974g = j10;
            hs2 hs2Var4 = is2Var.f90973f;
            if (j10 == hs2Var4.f90528b) {
                is2Var.f90973f = hs2Var4.f90530d;
            }
        }
        is2Var.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    @Override // yads.m73
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r12, int r14, int r15, int r16, yads.l73 r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.f92556z
            if (r0 == 0) goto L13
            yads.mx0 r0 = r8.A
            if (r0 == 0) goto Ld
            r11.a(r0)
            goto L13
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L13:
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1b
            r3 = r2
            goto L1c
        L1b:
            r3 = r1
        L1c:
            boolean r4 = r8.f92554x
            if (r4 == 0) goto L25
            if (r3 != 0) goto L23
            return
        L23:
            r8.f92554x = r1
        L25:
            long r3 = r8.E
            long r3 = r3 + r12
            boolean r1 = r8.C
            if (r1 == 0) goto L54
            long r5 = r8.f92550t
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L33
            return
        L33:
            if (r0 != 0) goto L54
            boolean r0 = r8.D
            if (r0 != 0) goto L50
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Overriding unexpected non-sync sample for format: "
            r0.<init>(r1)
            yads.mx0 r1 = r8.B
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "SampleQueue"
            yads.ih1.d(r1, r0)
            r8.D = r2
        L50:
            r0 = r14 | 1
            r5 = r0
            goto L55
        L54:
            r5 = r14
        L55:
            yads.is2 r0 = r8.f92531a
            long r0 = r0.f90974g
            r6 = r15
            long r9 = (long) r6
            long r0 = r0 - r9
            r2 = r16
            long r9 = (long) r2
            long r9 = r0 - r9
            r0 = r11
            r1 = r3
            r3 = r5
            r4 = r9
            r7 = r17
            r0.a(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ms2.a(long, int, int, int, yads.l73):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00e7 A[Catch: all -> 0x0152, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:8:0x001a, B:9:0x001f, B:10:0x0020, B:14:0x0029, B:19:0x0075, B:21:0x0079, B:23:0x0084, B:25:0x009a, B:27:0x00a2, B:28:0x00a5, B:29:0x00aa, B:30:0x00ab, B:32:0x00b3, B:35:0x00c2, B:36:0x00d3, B:37:0x00d8, B:38:0x00d9, B:39:0x00de, B:41:0x00e7, B:22:0x0082, B:17:0x005c), top: B:47:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(long r8, int r10, long r11, int r13, yads.l73 r14) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ms2.a(long, int, long, int, yads.l73):void");
    }

    public final void a(long j10, boolean z10, boolean z11) {
        long jA;
        int i10;
        is2 is2Var = this.f92531a;
        synchronized (this) {
            int i11 = this.f92546p;
            jA = -1;
            if (i11 != 0) {
                long[] jArr = this.f92544n;
                int i12 = this.f92548r;
                if (j10 >= jArr[i12]) {
                    if (z11 && (i10 = this.f92549s) != i11) {
                        i11 = i10 + 1;
                    }
                    int iA = a(i12, i11, j10, z10);
                    if (iA != -1) {
                        jA = a(iA);
                    }
                }
            }
        }
        is2Var.a(jA);
    }

    @Override // yads.m73
    public final void a(mx0 mx0Var) {
        mx0 mx0Var2;
        if (this.E == 0 || mx0Var.f92614q == Long.MAX_VALUE) {
            mx0Var2 = mx0Var;
        } else {
            lx0 lx0Var = new lx0(mx0Var);
            lx0Var.f92152o = mx0Var.f92614q + this.E;
            mx0Var2 = new mx0(lx0Var);
        }
        boolean z10 = false;
        this.f92556z = false;
        this.A = mx0Var;
        synchronized (this) {
            this.f92555y = false;
            if (!ib3.a(mx0Var2, this.B)) {
                if (this.f92533c.f89463b.size() != 0) {
                    SparseArray sparseArray = this.f92533c.f89463b;
                    if (((ks2) sparseArray.valueAt(sparseArray.size() - 1)).f91713a.equals(mx0Var2)) {
                        SparseArray sparseArray2 = this.f92533c.f89463b;
                        this.B = ((ks2) sparseArray2.valueAt(sparseArray2.size() - 1)).f91713a;
                    }
                    mx0 mx0Var3 = this.B;
                    this.C = ht1.a(mx0Var3.f92610m, mx0Var3.f92607j);
                    this.D = false;
                    z10 = true;
                }
                this.B = mx0Var2;
                mx0 mx0Var32 = this.B;
                this.C = ht1.a(mx0Var32.f92610m, mx0Var32.f92607j);
                this.D = false;
                z10 = true;
            }
        }
        ls2 ls2Var = this.f92536f;
        if (ls2Var == null || !z10) {
            return;
        }
        ek2 ek2Var = (ek2) ls2Var;
        ek2Var.f89300q.post(ek2Var.f89298o);
    }

    public final void a(mx0 mx0Var, nx0 nx0Var) {
        mx0 mx0Var2;
        mx0 mx0Var3 = this.f92537g;
        boolean z10 = mx0Var3 == null;
        kk0 kk0Var = z10 ? null : mx0Var3.f92613p;
        this.f92537g = mx0Var;
        kk0 kk0Var2 = mx0Var.f92613p;
        sk0 sk0Var = this.f92534d;
        if (sk0Var != null) {
            int iA = sk0Var.a(mx0Var);
            lx0 lx0Var = new lx0(mx0Var);
            lx0Var.D = iA;
            mx0Var2 = new mx0(lx0Var);
        } else {
            mx0Var2 = mx0Var;
        }
        nx0Var.f93035b = mx0Var2;
        nx0Var.f93034a = this.f92538h;
        if (this.f92534d == null) {
            return;
        }
        if (z10 || !ib3.a(kk0Var, kk0Var2)) {
            mk0 mk0Var = this.f92538h;
            mk0 mk0VarB = this.f92534d.b(this.f92535e, mx0Var);
            this.f92538h = mk0VarB;
            nx0Var.f93034a = mk0VarB;
            if (mk0Var != null) {
                mk0Var.a(this.f92535e);
            }
        }
    }

    public final synchronized boolean a(boolean z10) {
        mx0 mx0Var;
        int i10 = this.f92549s;
        boolean z11 = false;
        if (i10 == this.f92546p) {
            if (z10 || this.f92553w || ((mx0Var = this.B) != null && mx0Var != this.f92537g)) {
                z11 = true;
            }
            return z11;
        }
        if (((ks2) this.f92533c.c(this.f92547q + i10)).f91713a != this.f92537g) {
            return true;
        }
        int iE = e(this.f92549s);
        mk0 mk0Var = this.f92538h;
        if (mk0Var == null || mk0Var.getState() == 4 || ((this.f92543m[iE] & 1073741824) == 0 && this.f92538h.a())) {
            z11 = true;
        }
        return z11;
    }

    public final synchronized long b() {
        return this.f92552v;
    }

    public final long b(int i10) {
        int i11 = this.f92547q;
        int i12 = this.f92546p;
        int i13 = (i11 + i12) - i10;
        if (i13 < 0 || i13 > i12 - this.f92549s) {
            throw new IllegalArgumentException();
        }
        int i14 = i12 - i13;
        this.f92546p = i14;
        this.f92552v = Math.max(this.f92551u, d(i14));
        this.f92553w = i13 == 0 && this.f92553w;
        this.f92533c.a(i10);
        int i15 = this.f92546p;
        if (i15 == 0) {
            return 0L;
        }
        int iE = e(i15 - 1);
        return this.f92541k[iE] + ((long) this.f92542l[iE]);
    }

    public final void b(boolean z10) {
        is2 is2Var = this.f92531a;
        is2Var.a(is2Var.f90971d);
        is2Var.f90971d.a(is2Var.f90969b, 0L);
        hs2 hs2Var = is2Var.f90971d;
        is2Var.f90972e = hs2Var;
        is2Var.f90973f = hs2Var;
        is2Var.f90974g = 0L;
        ((ib0) is2Var.f90968a).c();
        this.f92546p = 0;
        this.f92547q = 0;
        this.f92548r = 0;
        this.f92549s = 0;
        this.f92554x = true;
        this.f92550t = Long.MIN_VALUE;
        this.f92551u = Long.MIN_VALUE;
        this.f92552v = Long.MIN_VALUE;
        this.f92553w = false;
        f23 f23Var = this.f92533c;
        for (int i10 = 0; i10 < f23Var.f89463b.size(); i10++) {
            f23Var.f89464c.accept(f23Var.f89463b.valueAt(i10));
        }
        f23Var.f89462a = -1;
        f23Var.f89463b.clear();
        if (z10) {
            this.A = null;
            this.B = null;
            this.f92555y = true;
        }
    }

    public final synchronized boolean b(long j10, boolean z10) {
        e();
        int iE = e(this.f92549s);
        int i10 = this.f92549s;
        int i11 = this.f92546p;
        if (i10 != i11 && j10 >= this.f92544n[iE] && (j10 <= this.f92552v || z10)) {
            int iA = a(iE, i11 - i10, j10, true);
            if (iA == -1) {
                return false;
            }
            this.f92550t = j10;
            this.f92549s += iA;
            return true;
        }
        return false;
    }

    public final synchronized mx0 c() {
        return this.f92555y ? null : this.B;
    }

    public final void c(int i10) {
        is2 is2Var = this.f92531a;
        long jB = b(i10);
        if (jB > is2Var.f90974g) {
            throw new IllegalArgumentException();
        }
        is2Var.f90974g = jB;
        if (jB != 0) {
            hs2 hs2Var = is2Var.f90971d;
            if (jB != hs2Var.f90527a) {
                while (is2Var.f90974g > hs2Var.f90528b) {
                    hs2Var = hs2Var.f90530d;
                }
                hs2 hs2Var2 = hs2Var.f90530d;
                hs2Var2.getClass();
                is2Var.a(hs2Var2);
                hs2 hs2Var3 = new hs2(is2Var.f90969b, hs2Var.f90528b);
                hs2Var.f90530d = hs2Var3;
                if (is2Var.f90974g == hs2Var.f90528b) {
                    hs2Var = hs2Var3;
                }
                is2Var.f90973f = hs2Var;
                if (is2Var.f90972e == hs2Var2) {
                    is2Var.f90972e = hs2Var3;
                    return;
                }
                return;
            }
        }
        is2Var.a(is2Var.f90971d);
        hs2 hs2Var4 = new hs2(is2Var.f90969b, is2Var.f90974g);
        is2Var.f90971d = hs2Var4;
        is2Var.f90972e = hs2Var4;
        is2Var.f90973f = hs2Var4;
    }

    public final long d(int i10) {
        long jMax = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int iE = e(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            jMax = Math.max(jMax, this.f92544n[iE]);
            if ((this.f92543m[iE] & 1) != 0) {
                break;
            }
            iE--;
            if (iE == -1) {
                iE = this.f92539i - 1;
            }
        }
        return jMax;
    }

    public final void d() {
        mk0 mk0Var = this.f92538h;
        if (mk0Var != null) {
            mk0Var.a(this.f92535e);
            this.f92538h = null;
            this.f92537g = null;
        }
    }

    public final int e(int i10) {
        int i11 = this.f92548r + i10;
        int i12 = this.f92539i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    public final synchronized void e() {
        this.f92549s = 0;
        is2 is2Var = this.f92531a;
        is2Var.f90972e = is2Var.f90971d;
    }
}
