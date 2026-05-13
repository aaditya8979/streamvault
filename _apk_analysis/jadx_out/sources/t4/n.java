package t4;

import android.util.Pair;
import com.google.android.exoplayer.Format;
import java.util.Arrays;
import t4.h0;

/* JADX INFO: compiled from: H262Reader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class n implements m {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final double[] f84796q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f84797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k4.u f84798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f84799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f84800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j0 f84801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a6.t f84802f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f84803g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f84804h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f84805i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f84806j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f84807k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f84808l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f84809m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f84810n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f84811o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f84812p;

    /* JADX INFO: compiled from: H262Reader.java */
    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final byte[] f84813e = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f84814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f84815b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f84816c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f84817d;

        public a(int i10) {
            this.f84817d = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f84814a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f84817d;
                int length = bArr2.length;
                int i13 = this.f84815b;
                if (length < i13 + i12) {
                    this.f84817d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f84817d, this.f84815b, i12);
                this.f84815b += i12;
            }
        }

        public boolean b(int i10, int i11) {
            if (this.f84814a) {
                int i12 = this.f84815b - i11;
                this.f84815b = i12;
                if (this.f84816c != 0 || i10 != 181) {
                    this.f84814a = false;
                    return true;
                }
                this.f84816c = i12;
            } else if (i10 == 179) {
                this.f84814a = true;
            }
            byte[] bArr = f84813e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f84814a = false;
            this.f84815b = 0;
            this.f84816c = 0;
        }
    }

    public n() {
        this(null);
    }

    public n(j0 j0Var) {
        this.f84801e = j0Var;
        this.f84803g = new boolean[4];
        this.f84804h = new a(128);
        if (j0Var != null) {
            this.f84805i = new t(178, 128);
            this.f84802f = new a6.t();
        } else {
            this.f84805i = null;
            this.f84802f = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<com.google.android.exoplayer.Format, java.lang.Long> c(t4.n.a r20, java.lang.String r21) {
        /*
            r0 = r20
            byte[] r1 = r0.f84817d
            int r2 = r0.f84815b
            byte[] r1 = java.util.Arrays.copyOf(r1, r2)
            r2 = 4
            r3 = r1[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = 5
            r5 = r1[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r6 = 6
            r6 = r1[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r3 = r3 << r2
            int r7 = r5 >> 4
            r13 = r3 | r7
            r3 = r5 & 15
            int r3 = r3 << 8
            r14 = r3 | r6
            r3 = 7
            r5 = r1[r3]
            r5 = r5 & 240(0xf0, float:3.36E-43)
            int r5 = r5 >> r2
            r6 = 2
            if (r5 == r6) goto L43
            r6 = 3
            if (r5 == r6) goto L3d
            if (r5 == r2) goto L37
            r2 = 1065353216(0x3f800000, float:1.0)
        L34:
            r18 = r2
            goto L4b
        L37:
            int r2 = r14 * 121
            float r2 = (float) r2
            int r5 = r13 * 100
            goto L48
        L3d:
            int r2 = r14 * 16
            float r2 = (float) r2
            int r5 = r13 * 9
            goto L48
        L43:
            int r2 = r14 * 4
            float r2 = (float) r2
            int r5 = r13 * 3
        L48:
            float r5 = (float) r5
            float r2 = r2 / r5
            goto L34
        L4b:
            r10 = 0
            r11 = -1
            r12 = -1
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.util.List r16 = java.util.Collections.singletonList(r1)
            r17 = -1
            r19 = 0
            java.lang.String r9 = "video/mpeg2"
            r8 = r21
            com.google.android.exoplayer.Format r2 = com.google.android.exoplayer.Format.C(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r5 = 0
            r3 = r1[r3]
            r3 = r3 & 15
            int r3 = r3 + (-1)
            if (r3 < 0) goto L8e
            double[] r7 = t4.n.f84796q
            int r8 = r7.length
            if (r3 >= r8) goto L8e
            r5 = r7[r3]
            int r0 = r0.f84816c
            int r0 = r0 + 9
            r0 = r1[r0]
            r1 = r0 & 96
            int r1 = r1 >> r4
            r0 = r0 & 31
            if (r1 == r0) goto L87
            double r3 = (double) r1
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r7
            int r0 = r0 + 1
            double r0 = (double) r0
            double r3 = r3 / r0
            double r5 = r5 * r3
        L87:
            r0 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r0 = r0 / r5
            long r5 = (long) r0
        L8e:
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            android.util.Pair r0 = android.util.Pair.create(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.n.c(t4.n$a, java.lang.String):android.util.Pair");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // t4.m
    public void a(a6.t tVar) {
        int i10;
        int iC = tVar.c();
        int iD = tVar.d();
        byte[] bArr = tVar.f3620a;
        this.f84806j += (long) tVar.a();
        this.f84798b.a(tVar, tVar.a());
        while (true) {
            int iC2 = a6.q.c(bArr, iC, iD, this.f84803g);
            if (iC2 == iD) {
                break;
            }
            int i11 = iC2 + 3;
            int i12 = tVar.f3620a[i11] & 255;
            int i13 = iC2 - iC;
            if (!this.f84799c) {
                if (i13 > 0) {
                    this.f84804h.a(bArr, iC, iC2);
                }
                if (this.f84804h.b(i12, i13 < 0 ? -i13 : 0)) {
                    Pair<Format, Long> pairC = c(this.f84804h, this.f84797a);
                    this.f84798b.d((Format) pairC.first);
                    this.f84800d = ((Long) pairC.second).longValue();
                    this.f84799c = true;
                }
            }
            if (this.f84801e != null) {
                if (i13 > 0) {
                    this.f84805i.a(bArr, iC, iC2);
                    i10 = 0;
                } else {
                    i10 = -i13;
                }
                if (this.f84805i.b(i10)) {
                    t tVar2 = this.f84805i;
                    this.f84802f.J(this.f84805i.f84935d, a6.q.k(tVar2.f84935d, tVar2.f84936e));
                    this.f84801e.a(this.f84810n, this.f84802f);
                }
                if (i12 == 178 && tVar.f3620a[iC2 + 2] == 1) {
                    this.f84805i.e(i12);
                }
            }
            if (i12 == 0 || i12 == 179) {
                int i14 = iD - iC2;
                if (this.f84807k && this.f84812p && this.f84799c) {
                    this.f84798b.c(this.f84810n, this.f84811o ? 1 : 0, ((int) (this.f84806j - this.f84809m)) - i14, i14, null);
                }
                boolean z10 = this.f84807k;
                if (!z10 || this.f84812p) {
                    this.f84809m = this.f84806j - ((long) i14);
                    long j10 = this.f84808l;
                    if (j10 == -9223372036854775807L) {
                        j10 = z10 ? this.f84810n + this.f84800d : 0L;
                    }
                    this.f84810n = j10;
                    this.f84811o = false;
                    this.f84808l = -9223372036854775807L;
                    this.f84807k = true;
                }
                this.f84812p = i12 == 0;
            } else if (i12 == 184) {
                this.f84811o = true;
            }
            iC = i11;
        }
        if (!this.f84799c) {
            this.f84804h.a(bArr, iC, iD);
        }
        if (this.f84801e != null) {
            this.f84805i.a(bArr, iC, iD);
        }
    }

    @Override // t4.m
    public void b(k4.i iVar, h0.d dVar) {
        dVar.a();
        this.f84797a = dVar.b();
        this.f84798b = iVar.track(dVar.c(), 2);
        j0 j0Var = this.f84801e;
        if (j0Var != null) {
            j0Var.b(iVar, dVar);
        }
    }

    @Override // t4.m
    public void packetFinished() {
    }

    @Override // t4.m
    public void packetStarted(long j10, int i10) {
        this.f84808l = j10;
    }

    @Override // t4.m
    public void seek() {
        a6.q.a(this.f84803g);
        this.f84804h.c();
        if (this.f84801e != null) {
            this.f84805i.d();
        }
        this.f84806j = 0L;
        this.f84807k = false;
    }
}
