package yads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import yads.h93;
import yads.mq0;

/* JADX INFO: loaded from: classes10.dex */
public final class h93 implements mq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f90308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f90309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f90310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jb2 f90311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseIntArray f90312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k93 f90313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SparseArray f90314g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SparseBooleanArray f90315h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SparseBooleanArray f90316i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e93 f90317j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d93 f90318k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public pq0 f90319l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f90320m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f90321n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f90322o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f90323p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public m93 f90324q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f90325r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f90326s;

    static {
        new rq0() { // from class: bt.i2
            @Override // yads.rq0
            public final mq0[] createExtractors() {
                return h93.a();
            }
        };
    }

    public h93(int i10) {
        this(new y63(0L), new jf0());
    }

    public h93(y63 y63Var, jf0 jf0Var) {
        this.f90313f = (k93) ni.a(jf0Var);
        this.f90309b = 112800;
        this.f90308a = 1;
        this.f90310c = Collections.singletonList(y63Var);
        this.f90311d = new jb2(0, new byte[9400]);
        this.f90315h = new SparseBooleanArray();
        this.f90316i = new SparseBooleanArray();
        this.f90314g = new SparseArray();
        this.f90312e = new SparseIntArray();
        this.f90317j = new e93();
        this.f90319l = pq0.f93718a;
        this.f90326s = -1;
        b();
    }

    public static mq0[] a() {
        return new mq0[]{new h93(0)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [yads.m93] */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [int] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // yads.mq0
    public final int a(nq0 nq0Var, gg2 gg2Var) throws ob2, EOFException, InterruptedIOException {
        ld0 ld0Var;
        ?? r32;
        ?? r15;
        int i10;
        ld0 ld0Var2;
        long j10;
        boolean z10;
        boolean z11;
        gg2 gg2Var2;
        long j11;
        long j12;
        ld0 ld0Var3 = (ld0) nq0Var;
        long j13 = ld0Var3.f91937c;
        if (this.f90321n) {
            if (j13 != -1 && this.f90308a != 2) {
                e93 e93Var = this.f90317j;
                if (!e93Var.f89175d) {
                    int i11 = this.f90326s;
                    if (i11 <= 0) {
                        e93Var.f89174c.a(ib3.f90742f);
                        e93Var.f89175d = true;
                        ld0Var3.f91940f = 0;
                    } else if (!e93Var.f89177f) {
                        int iMin = (int) Math.min(e93Var.f89172a, j13);
                        long j14 = j13 - ((long) iMin);
                        if (ld0Var3.f91938d != j14) {
                            gg2Var.f89980a = j14;
                            return 1;
                        }
                        e93Var.f89174c.c(iMin);
                        ld0Var3.f91940f = 0;
                        ld0Var3.b(e93Var.f89174c.f91147a, 0, iMin, false);
                        jb2 jb2Var = e93Var.f89174c;
                        int i12 = jb2Var.f91148b;
                        int i13 = jb2Var.f91149c;
                        int i14 = i13 - 188;
                        while (true) {
                            if (i14 < i12) {
                                j12 = -9223372036854775807L;
                                break;
                            }
                            byte[] bArr = jb2Var.f91147a;
                            int i15 = -4;
                            int i16 = 0;
                            while (true) {
                                if (i15 > 4) {
                                    break;
                                }
                                int i17 = (i15 * 188) + i14;
                                if (i17 < i12 || i17 >= i13 || bArr[i17] != 71) {
                                    i16 = 0;
                                } else {
                                    i16++;
                                    if (i16 == 5) {
                                        long jA = n93.a(i14, i11, jb2Var);
                                        if (jA != -9223372036854775807L) {
                                            j12 = jA;
                                            break;
                                        }
                                    }
                                }
                                i15++;
                            }
                            i14--;
                        }
                        e93Var.f89179h = j12;
                        e93Var.f89177f = true;
                    } else if (e93Var.f89179h == -9223372036854775807L) {
                        e93Var.f89174c.a(ib3.f90742f);
                        e93Var.f89175d = true;
                        ld0Var3.f91940f = 0;
                    } else if (e93Var.f89176e) {
                        long j15 = e93Var.f89178g;
                        if (j15 == -9223372036854775807L) {
                            e93Var.f89174c.a(ib3.f90742f);
                            e93Var.f89175d = true;
                            ld0Var3.f91940f = 0;
                        } else {
                            long jB = e93Var.f89173b.b(e93Var.f89179h) - e93Var.f89173b.b(j15);
                            e93Var.f89180i = jB;
                            if (jB < 0) {
                                ih1.d("TsDurationReader", "Invalid duration: " + e93Var.f89180i + ". Using TIME_UNSET instead.");
                                e93Var.f89180i = -9223372036854775807L;
                            }
                            e93Var.f89174c.a(ib3.f90742f);
                            e93Var.f89175d = true;
                            ld0Var3.f91940f = 0;
                        }
                    } else {
                        int iMin2 = (int) Math.min(e93Var.f89172a, j13);
                        long j16 = 0;
                        if (ld0Var3.f91938d != j16) {
                            gg2Var.f89980a = j16;
                            return 1;
                        }
                        e93Var.f89174c.c(iMin2);
                        ld0Var3.f91940f = 0;
                        ld0Var3.b(e93Var.f89174c.f91147a, 0, iMin2, false);
                        jb2 jb2Var2 = e93Var.f89174c;
                        int i18 = jb2Var2.f91148b;
                        int i19 = jb2Var2.f91149c;
                        while (true) {
                            if (i18 >= i19) {
                                j11 = -9223372036854775807L;
                                break;
                            }
                            if (jb2Var2.f91147a[i18] == 71) {
                                long jA2 = n93.a(i18, i11, jb2Var2);
                                if (jA2 != -9223372036854775807L) {
                                    j11 = jA2;
                                    break;
                                }
                            }
                            i18++;
                        }
                        e93Var.f89178g = j11;
                        e93Var.f89176e = true;
                    }
                    return 0;
                }
            }
            if (this.f90322o) {
                ld0Var2 = ld0Var3;
                j10 = 0;
                z10 = false;
                z11 = true;
            } else {
                this.f90322o = true;
                e93 e93Var2 = this.f90317j;
                long j17 = e93Var2.f89180i;
                if (j17 != -9223372036854775807L) {
                    ld0Var2 = ld0Var3;
                    j10 = 0;
                    z11 = true;
                    d93 d93Var = new d93(e93Var2.f89173b, j17, j13, this.f90326s, this.f90309b);
                    this.f90318k = d93Var;
                    this.f90319l.a(d93Var.f95311a);
                    z10 = false;
                } else {
                    ld0Var2 = ld0Var3;
                    j10 = 0;
                    z10 = false;
                    z11 = true;
                    this.f90319l.a(new uw2(j17, 0L));
                }
            }
            if (this.f90323p) {
                this.f90323p = z10;
                seek(j10, j10);
                ld0Var = ld0Var2;
                if (ld0Var.f91938d != j10) {
                    gg2Var.f89980a = j10;
                    return z11 ? 1 : 0;
                }
                gg2Var2 = gg2Var;
            } else {
                gg2Var2 = gg2Var;
                ld0Var = ld0Var2;
            }
            d93 d93Var2 = this.f90318k;
            r32 = z10;
            r15 = z11;
            if (d93Var2 != null) {
                r32 = z10;
                r15 = z11;
                if (d93Var2.f95313c != null) {
                    return d93Var2.a(ld0Var, gg2Var2);
                }
            }
        } else {
            ld0Var = ld0Var3;
            r32 = 0;
            r15 = 1;
        }
        jb2 jb2Var3 = this.f90311d;
        byte[] bArr2 = jb2Var3.f91147a;
        int i20 = jb2Var3.f91148b;
        if (9400 - i20 < 188) {
            int i21 = jb2Var3.f91149c - i20;
            if (i21 > 0) {
                System.arraycopy(bArr2, i20, bArr2, r32, i21);
            }
            jb2 jb2Var4 = this.f90311d;
            jb2Var4.f91147a = bArr2;
            jb2Var4.f91149c = i21;
            jb2Var4.f91148b = r32;
        }
        while (true) {
            jb2 jb2Var5 = this.f90311d;
            int i22 = jb2Var5.f91149c;
            int i23 = jb2Var5.f91148b;
            if (i22 - i23 >= 188) {
                byte[] bArr3 = jb2Var5.f91147a;
                int i24 = i23;
                while (i24 < i22 && bArr3[i24] != 71) {
                    i24++;
                }
                this.f90311d.e(i24);
                int i25 = i24 + 188;
                if (i25 > i22) {
                    int i26 = (i24 - i23) + this.f90325r;
                    this.f90325r = i26;
                    i10 = 2;
                    if (this.f90308a == 2 && i26 > 376) {
                        throw new ob2("Cannot find sync byte. Most likely not a Transport Stream.", null, r15, r15);
                    }
                } else {
                    i10 = 2;
                    this.f90325r = r32;
                }
                jb2 jb2Var6 = this.f90311d;
                int i27 = jb2Var6.f91149c;
                if (i25 > i27) {
                    return r32;
                }
                int iB = jb2Var6.b();
                if ((8388608 & iB) != 0) {
                    this.f90311d.e(i25);
                    return r32;
                }
                ?? r92 = (4194304 & iB) != 0 ? r15 : r32;
                int i28 = (2096896 & iB) >> 8;
                ?? r82 = (iB & 32) != 0 ? r15 : r32;
                ?? r42 = (iB & 16) != 0 ? (m93) this.f90314g.get(i28) : 0;
                if (r42 == 0) {
                    this.f90311d.e(i25);
                    return r32;
                }
                if (this.f90308a != i10) {
                    int i29 = iB & 15;
                    int i30 = this.f90312e.get(i28, i29 - 1);
                    this.f90312e.put(i28, i29);
                    if (i30 == i29) {
                        this.f90311d.e(i25);
                        return r32;
                    }
                    if (i29 != ((i30 + r15) & 15)) {
                        r42.a();
                    }
                }
                if (r82 != 0) {
                    int iM = this.f90311d.m();
                    r92 = (r92 == true ? 1 : 0) | ((this.f90311d.m() & 64) != 0 ? i10 : r32);
                    jb2 jb2Var7 = this.f90311d;
                    jb2Var7.e(jb2Var7.f91148b + (iM - r15));
                }
                boolean z12 = this.f90321n;
                if (this.f90308a == i10 || z12 || !this.f90316i.get(i28, r32)) {
                    this.f90311d.d(i25);
                    r42.a(r92, this.f90311d);
                    this.f90311d.d(i27);
                }
                if (this.f90308a != i10 && !z12 && this.f90321n && j13 != -1) {
                    this.f90323p = r15;
                }
                this.f90311d.e(i25);
                return r32;
            }
            int i31 = ld0Var.read(bArr2, i22, 9400 - i22);
            if (i31 == -1) {
                return -1;
            }
            this.f90311d.d(i22 + i31);
        }
    }

    @Override // yads.mq0
    public final void a(pq0 pq0Var) {
        this.f90319l = pq0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // yads.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(yads.nq0 r7) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r6 = this;
            yads.jb2 r0 = r6.f90311d
            byte[] r0 = r0.f91147a
            yads.ld0 r7 = (yads.ld0) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.b(r0, r1, r2, r1)
            r2 = r1
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L29
            r3 = r1
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r2 = r2 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.a(r2)
            r7 = 1
            return r7
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.h93.a(yads.nq0):boolean");
    }

    public final void b() {
        this.f90315h.clear();
        this.f90314g.clear();
        ((jf0) this.f90313f).getClass();
        SparseArray sparseArray = new SparseArray();
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f90314g.put(sparseArray.keyAt(i10), (m93) sparseArray.valueAt(i10));
        }
        this.f90314g.put(0, new sw2(new f93(this)));
        this.f90324q = null;
    }

    @Override // yads.mq0
    public final void release() {
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    @Override // yads.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void seek(long r9, long r11) {
        /*
            r8 = this;
            int r9 = r8.f90308a
            r10 = 2
            if (r9 == r10) goto L76
            java.util.List r9 = r8.f90310c
            int r9 = r9.size()
            r10 = 0
            r0 = r10
        Ld:
            r1 = 0
            if (r0 >= r9) goto L47
            java.util.List r3 = r8.f90310c
            java.lang.Object r3 = r3.get(r0)
            yads.y63 r3 = (yads.y63) r3
            monitor-enter(r3)
            long r4 = r3.f97015b     // Catch: java.lang.Throwable -> L44
            monitor-exit(r3)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L28
            r4 = 1
            goto L29
        L28:
            r4 = r10
        L29:
            if (r4 != 0) goto L3c
            long r4 = r3.a()
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L41
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 == 0) goto L41
            int r1 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r1 == 0) goto L41
            goto L3e
        L3c:
            if (r4 == 0) goto L41
        L3e:
            r3.c(r11)
        L41:
            int r0 = r0 + 1
            goto Ld
        L44:
            r9 = move-exception
            monitor-exit(r3)
            throw r9
        L47:
            int r9 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r9 == 0) goto L52
            yads.d93 r9 = r8.f90318k
            if (r9 == 0) goto L52
            r9.a(r11)
        L52:
            yads.jb2 r9 = r8.f90311d
            r9.c(r10)
            android.util.SparseIntArray r9 = r8.f90312e
            r9.clear()
            r9 = r10
        L5d:
            android.util.SparseArray r11 = r8.f90314g
            int r11 = r11.size()
            if (r9 >= r11) goto L73
            android.util.SparseArray r11 = r8.f90314g
            java.lang.Object r11 = r11.valueAt(r9)
            yads.m93 r11 = (yads.m93) r11
            r11.a()
            int r9 = r9 + 1
            goto L5d
        L73:
            r8.f90325r = r10
            return
        L76:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.h93.seek(long, long):void");
    }
}
