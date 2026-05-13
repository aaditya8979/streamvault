package s6;

import androidx.annotation.Nullable;
import java.util.Arrays;
import s6.i0;

/* JADX INFO: compiled from: H262Reader.java */
/* JADX INFO: loaded from: classes10.dex */
public final class n implements m {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final double[] f79245q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f79246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i6.b0 f79247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final k0 f79248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final s7.a0 f79249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final u f79250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f79251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f79252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f79253h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f79254i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f79255j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f79256k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f79257l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f79258m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f79259n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f79260o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f79261p;

    /* JADX INFO: compiled from: H262Reader.java */
    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final byte[] f79262e = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f79263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f79264b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f79265c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f79266d;

        public a(int i10) {
            this.f79266d = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f79263a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f79266d;
                int length = bArr2.length;
                int i13 = this.f79264b;
                if (length < i13 + i12) {
                    this.f79266d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f79266d, this.f79264b, i12);
                this.f79264b += i12;
            }
        }

        public boolean b(int i10, int i11) {
            if (this.f79263a) {
                int i12 = this.f79264b - i11;
                this.f79264b = i12;
                if (this.f79265c != 0 || i10 != 181) {
                    this.f79263a = false;
                    return true;
                }
                this.f79265c = i12;
            } else if (i10 == 179) {
                this.f79263a = true;
            }
            byte[] bArr = f79262e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f79263a = false;
            this.f79264b = 0;
            this.f79265c = 0;
        }
    }

    public n() {
        this(null);
    }

    public n(@Nullable k0 k0Var) {
        this.f79248c = k0Var;
        this.f79251f = new boolean[4];
        this.f79252g = new a(128);
        if (k0Var != null) {
            this.f79250e = new u(178, 128);
            this.f79249d = new s7.a0();
        } else {
            this.f79250e = null;
            this.f79249d = null;
        }
        this.f79257l = -9223372036854775807L;
        this.f79259n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<com.google.android.exoplayer2.m, java.lang.Long> c(s6.n.a r8, java.lang.String r9) {
        /*
            byte[] r0 = r8.f79266d
            int r1 = r8.f79264b
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            r4 = r0[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 6
            r5 = r0[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r6 = r4 >> 4
            r2 = r2 | r6
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r5
            r5 = 7
            r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L3d
            r7 = 3
            if (r6 == r7) goto L37
            if (r6 == r1) goto L31
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L44
        L31:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
            goto L42
        L37:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L42
        L3d:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
        L42:
            float r6 = (float) r6
            float r1 = r1 / r6
        L44:
            com.google.android.exoplayer2.m$b r6 = new com.google.android.exoplayer2.m$b
            r6.<init>()
            com.google.android.exoplayer2.m$b r9 = r6.S(r9)
            java.lang.String r6 = "video/mpeg2"
            com.google.android.exoplayer2.m$b r9 = r9.e0(r6)
            com.google.android.exoplayer2.m$b r9 = r9.j0(r2)
            com.google.android.exoplayer2.m$b r9 = r9.Q(r4)
            com.google.android.exoplayer2.m$b r9 = r9.a0(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            com.google.android.exoplayer2.m$b r9 = r9.T(r1)
            com.google.android.exoplayer2.m r9 = r9.E()
            r1 = 0
            r4 = r0[r5]
            r4 = r4 & 15
            int r4 = r4 + (-1)
            if (r4 < 0) goto L99
            double[] r5 = s6.n.f79245q
            int r6 = r5.length
            if (r4 >= r6) goto L99
            r1 = r5[r4]
            int r8 = r8.f79265c
            int r8 = r8 + 9
            r8 = r0[r8]
            r0 = r8 & 96
            int r0 = r0 >> r3
            r8 = r8 & 31
            if (r0 == r8) goto L92
            double r3 = (double) r0
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r5
            int r8 = r8 + 1
            double r5 = (double) r8
            double r3 = r3 / r5
            double r1 = r1 * r3
        L92:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r1 = (long) r3
        L99:
            java.lang.Long r8 = java.lang.Long.valueOf(r1)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.n.c(s6.n$a, java.lang.String):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0142  */
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
    @Override // s6.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(s7.a0 r21) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.n.a(s7.a0):void");
    }

    @Override // s6.m
    public void b(i6.m mVar, i0.d dVar) {
        dVar.a();
        this.f79246a = dVar.b();
        this.f79247b = mVar.track(dVar.c(), 2);
        k0 k0Var = this.f79248c;
        if (k0Var != null) {
            k0Var.b(mVar, dVar);
        }
    }

    @Override // s6.m
    public void packetFinished() {
    }

    @Override // s6.m
    public void packetStarted(long j10, int i10) {
        this.f79257l = j10;
    }

    @Override // s6.m
    public void seek() {
        s7.v.a(this.f79251f);
        this.f79252g.c();
        u uVar = this.f79250e;
        if (uVar != null) {
            uVar.d();
        }
        this.f79253h = 0L;
        this.f79254i = false;
        this.f79257l = -9223372036854775807L;
        this.f79259n = -9223372036854775807L;
    }
}
