package yads;

import java.util.ArrayDeque;
import java.util.ArrayList;
import yads.kv1;
import yads.mq0;

/* JADX INFO: loaded from: classes2.dex */
public final class kv1 implements mq0, vw2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f91769i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f91770j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f91771k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public jb2 f91772l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f91774n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f91775o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f91776p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long[][] f91779s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f91780t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f91781u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f91782v;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f91768h = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bx2 f91766f = new bx2();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f91767g = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jb2 f91764d = new jb2(16);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayDeque f91765e = new ArrayDeque();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jb2 f91761a = new jb2(dy1.f89024a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb2 f91762b = new jb2(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jb2 f91763c = new jb2();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f91773m = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public pq0 f91777q = pq0.f93718a;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public jv1[] f91778r = new jv1[0];

    static {
        new rq0() { // from class: bt.c6
            @Override // yads.rq0
            public final mq0[] createExtractors() {
                return kv1.d();
            }
        };
    }

    public static /* synthetic */ e73 a(e73 e73Var) {
        return e73Var;
    }

    public static mq0[] d() {
        return new mq0[]{new kv1()};
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    @Override // yads.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(yads.nq0 r37, yads.gg2 r38) {
        /*
            Method dump skipped, instruction units count: 1774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.kv1.a(yads.nq0, yads.gg2):int");
    }

    @Override // yads.mq0
    public final void a(pq0 pq0Var) {
        this.f91777q = pq0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01d1, code lost:
    
        if (r5 != 7631467) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01d8, code lost:
    
        if (r5 == 6516589) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01dd, code lost:
    
        if (r5 != 7828084) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01e4, code lost:
    
        if (r5 != 6578553) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01e6, code lost:
    
        r3 = yads.zs1.b(r4, r2, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01f1, code lost:
    
        if (r5 != 4280916) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01f3, code lost:
    
        r3 = yads.zs1.b(r4, r2, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01fe, code lost:
    
        if (r5 != 7630703) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0200, code lost:
    
        r3 = yads.zs1.b(r4, r2, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x020b, code lost:
    
        if (r5 != 6384738) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x020d, code lost:
    
        r3 = yads.zs1.b(r4, r2, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0218, code lost:
    
        if (r5 != 7108978) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x021a, code lost:
    
        r3 = yads.zs1.b(r4, r2, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0225, code lost:
    
        if (r5 != 6776174) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0227, code lost:
    
        r3 = yads.zs1.b(r4, r2, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0230, code lost:
    
        if (r5 != 6779504) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0232, code lost:
    
        r3 = yads.zs1.b(r4, r2, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x023a, code lost:
    
        yads.ih1.a("MetadataUtil", "Skipped unknown metadata entry: " + yads.xj.a(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x024d, code lost:
    
        r2.e(r14);
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0252, code lost:
    
        r3 = yads.zs1.b(r4, r2, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x025a, code lost:
    
        r3 = yads.zs1.b(r4, r2, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0265, code lost:
    
        if (r5 == null) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0267, code lost:
    
        r12.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x026a, code lost:
    
        r6 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0276, code lost:
    
        r2.e(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0279, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x027e, code lost:
    
        if (r12.isEmpty() == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0281, code lost:
    
        r14 = new yads.ts1(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        r2.e(r6);
        r6 = r6 + r14;
        r2.e(r2.f91148b + r9);
        r12 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        r14 = r2.f91148b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
    
        if (r14 >= r6) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
    
        r14 = r2.b() + r14;
        r4 = r2.b();
        r5 = (r4 >> 24) & 255;
        r24 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:
    
        if (r5 == 169) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009e, code lost:
    
        if (r5 != 253) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a5, code lost:
    
        if (r4 != 1735291493) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        r2.e(r2.f91148b + 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
    
        if (r2.b() != 1684108385) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b7, code lost:
    
        r2.e(r2.f91148b + 8);
        r4 = r2.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c4, code lost:
    
        yads.ih1.d("MetadataUtil", "Failed to parse uint8 attribute value");
        r4 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ca, code lost:
    
        if (r4 <= 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cc, code lost:
    
        r5 = yads.zs1.f97759a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d0, code lost:
    
        if (r4 > 192) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d2, code lost:
    
        r4 = r5[r4 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d7, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d8, code lost:
    
        if (r4 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00da, code lost:
    
        r5 = new yads.y53("TCON", null, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e2, code lost:
    
        yads.ih1.d("MetadataUtil", "Failed to parse standard genre code");
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ef, code lost:
    
        if (r4 != 1684632427) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f1, code lost:
    
        r3 = yads.zs1.a(r4, r2, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fb, code lost:
    
        if (r4 != 1953655662) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fd, code lost:
    
        r3 = yads.zs1.a(r4, r2, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0107, code lost:
    
        if (r4 != 1953329263) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0109, code lost:
    
        r3 = yads.zs1.a(r4, "TBPM", r2, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0111, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0118, code lost:
    
        if (r4 != 1668311404) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011a, code lost:
    
        r5 = yads.zs1.a(r4, "TCMP", r2, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0126, code lost:
    
        if (r4 != 1668249202) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0128, code lost:
    
        r5 = yads.zs1.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0131, code lost:
    
        if (r4 != 1631670868) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0133, code lost:
    
        r3 = yads.zs1.b(r4, r2, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013d, code lost:
    
        if (r4 != 1936682605) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013f, code lost:
    
        r3 = yads.zs1.b(r4, r2, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0149, code lost:
    
        if (r4 != 1936679276) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014b, code lost:
    
        r3 = yads.zs1.b(r4, r2, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0155, code lost:
    
        if (r4 != 1936679282) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0157, code lost:
    
        r3 = yads.zs1.b(r4, r2, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0161, code lost:
    
        if (r4 != 1936679265) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0163, code lost:
    
        r3 = yads.zs1.b(r4, r2, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016d, code lost:
    
        if (r4 != 1936679791) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x016f, code lost:
    
        r3 = yads.zs1.b(r4, r2, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0179, code lost:
    
        if (r4 != 1920233063) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017b, code lost:
    
        r3 = yads.zs1.a(r4, "ITUNESADVISORY", r2, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0187, code lost:
    
        if (r4 != 1885823344) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0189, code lost:
    
        r3 = yads.zs1.a(r4, "ITUNESGAPLESS", r2, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0194, code lost:
    
        if (r4 != 1936683886) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0196, code lost:
    
        r3 = yads.zs1.b(r4, r2, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a1, code lost:
    
        if (r4 != 1953919848) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a3, code lost:
    
        r3 = yads.zs1.b(r4, r2, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ae, code lost:
    
        if (r4 != 757935405) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b0, code lost:
    
        r5 = yads.zs1.b(r14, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b6, code lost:
    
        r5 = 16777215 & r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01be, code lost:
    
        if (r5 != 6516084) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c0, code lost:
    
        r5 = yads.zs1.a(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01c6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01cc, code lost:
    
        if (r5 == 7233901) goto L131;
     */
    /* JADX WARN: Removed duplicated region for block: B:206:0x041b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(yads.vj r27) {
        /*
            Method dump skipped, instruction units count: 1524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.kv1.a(yads.vj):void");
    }

    @Override // yads.mq0
    public final boolean a(nq0 nq0Var) {
        return s13.a(nq0Var, false, false);
    }

    @Override // yads.vw2
    public final tw2 b(long j10) {
        long jMin;
        long jMin2;
        long j11;
        long j12;
        long j13;
        long j14;
        int iA;
        long j15 = j10;
        jv1[] jv1VarArr = this.f91778r;
        if (jv1VarArr.length == 0) {
            xw2 xw2Var = xw2.f96907c;
            return new tw2(xw2Var, xw2Var);
        }
        int i10 = this.f91780t;
        boolean z10 = false;
        int i11 = -1;
        if (i10 != -1) {
            n73 n73Var = jv1VarArr[i10].f91388b;
            int iB = ib3.b(n73Var.f92769f, j15, false);
            while (true) {
                if (iB < 0) {
                    iB = -1;
                    break;
                }
                if ((n73Var.f92770g[iB] & 1) != 0) {
                    break;
                }
                iB--;
            }
            if (iB == -1) {
                iB = n73Var.a(j15);
            }
            if (iB == -1) {
                xw2 xw2Var2 = xw2.f96907c;
                return new tw2(xw2Var2, xw2Var2);
            }
            long j16 = n73Var.f92769f[iB];
            jMin = n73Var.f92766c[iB];
            if (j16 >= j15 || iB >= n73Var.f92765b - 1 || (iA = n73Var.a(j15)) == -1 || iA == iB) {
                j14 = -1;
                j11 = -9223372036854775807L;
            } else {
                j11 = n73Var.f92769f[iA];
                j14 = n73Var.f92766c[iA];
            }
            long j17 = j14;
            j15 = j16;
            jMin2 = j17;
        } else {
            jMin = Long.MAX_VALUE;
            jMin2 = -1;
            j11 = -9223372036854775807L;
        }
        int i12 = 0;
        while (true) {
            jv1[] jv1VarArr2 = this.f91778r;
            if (i12 >= jv1VarArr2.length) {
                break;
            }
            if (i12 != this.f91780t) {
                n73 n73Var2 = jv1VarArr2[i12].f91388b;
                int iB2 = ib3.b(n73Var2.f92769f, j15, z10);
                while (true) {
                    if (iB2 < 0) {
                        iB2 = i11;
                        break;
                    }
                    if ((n73Var2.f92770g[iB2] & 1) != 0) {
                        break;
                    }
                    iB2--;
                }
                if (iB2 == i11) {
                    iB2 = n73Var2.a(j15);
                }
                if (iB2 == i11) {
                    j13 = jMin2;
                } else {
                    j13 = jMin2;
                    jMin = Math.min(n73Var2.f92766c[iB2], jMin);
                }
                if (j11 != -9223372036854775807L) {
                    int iB3 = ib3.b(n73Var2.f92769f, j11, false);
                    while (true) {
                        if (iB3 < 0) {
                            iB3 = -1;
                            break;
                        }
                        if ((n73Var2.f92770g[iB3] & 1) != 0) {
                            break;
                        }
                        iB3--;
                    }
                    if (iB3 == -1) {
                        iB3 = n73Var2.a(j11);
                    }
                    if (iB3 != -1) {
                        jMin2 = Math.min(n73Var2.f92766c[iB3], j13);
                        i12++;
                        z10 = false;
                        i11 = -1;
                    }
                }
                j12 = j13;
            } else {
                j12 = jMin2;
            }
            jMin2 = j12;
            i12++;
            z10 = false;
            i11 = -1;
        }
        long j18 = jMin2;
        xw2 xw2Var3 = new xw2(j15, jMin);
        return j11 == -9223372036854775807L ? new tw2(xw2Var3, xw2Var3) : new tw2(xw2Var3, new xw2(j11, j18));
    }

    @Override // yads.vw2
    public final boolean b() {
        return true;
    }

    @Override // yads.vw2
    public final long c() {
        return this.f91781u;
    }

    public final void c(long j10) {
        while (!this.f91765e.isEmpty() && ((vj) this.f91765e.peek()).f96118b == j10) {
            vj vjVar = (vj) this.f91765e.pop();
            if (vjVar.f96784a == 1836019574) {
                a(vjVar);
                this.f91765e.clear();
                this.f91768h = 2;
            } else if (!this.f91765e.isEmpty()) {
                ((vj) this.f91765e.peek()).f96120d.add(vjVar);
            }
        }
        if (this.f91768h != 2) {
            this.f91768h = 0;
            this.f91771k = 0;
        }
    }

    @Override // yads.mq0
    public final void release() {
    }

    @Override // yads.mq0
    public final void seek(long j10, long j11) {
        this.f91765e.clear();
        this.f91771k = 0;
        this.f91773m = -1;
        this.f91774n = 0;
        this.f91775o = 0;
        this.f91776p = 0;
        if (j10 == 0) {
            if (this.f91768h != 3) {
                this.f91768h = 0;
                this.f91771k = 0;
                return;
            } else {
                bx2 bx2Var = this.f91766f;
                bx2Var.f88190a.clear();
                bx2Var.f88191b = 0;
                this.f91767g.clear();
                return;
            }
        }
        for (jv1 jv1Var : this.f91778r) {
            n73 n73Var = jv1Var.f91388b;
            int iB = ib3.b(n73Var.f92769f, j11, false);
            while (true) {
                if (iB < 0) {
                    iB = -1;
                    break;
                } else if ((n73Var.f92770g[iB] & 1) != 0) {
                    break;
                } else {
                    iB--;
                }
            }
            if (iB == -1) {
                iB = n73Var.a(j11);
            }
            jv1Var.f91391e = iB;
            z83 z83Var = jv1Var.f91390d;
            if (z83Var != null) {
                z83Var.f97426b = false;
                z83Var.f97427c = 0;
            }
        }
    }
}
