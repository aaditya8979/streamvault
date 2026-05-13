package t4;

import com.google.android.exoplayer.Format;
import java.util.Collections;
import t4.h0;

/* JADX INFO: compiled from: H265Reader.java */
/* JADX INFO: loaded from: classes4.dex */
public final class p implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f84867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f84868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k4.u f84869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f84870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f84871e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f84878l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f84879m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f84872f = new boolean[3];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f84873g = new t(32, 128);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f84874h = new t(33, 128);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f84875i = new t(34, 128);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f84876j = new t(39, 128);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f84877k = new t(40, 128);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a6.t f84880n = new a6.t();

    /* JADX INFO: compiled from: H265Reader.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k4.u f84881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f84882b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f84883c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f84884d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f84885e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f84886f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f84887g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f84888h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f84889i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f84890j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f84891k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f84892l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f84893m;

        public a(k4.u uVar) {
            this.f84881a = uVar;
        }

        public static boolean b(int i10) {
            return (32 <= i10 && i10 <= 35) || i10 == 39;
        }

        public static boolean c(int i10) {
            return i10 < 32 || i10 == 40;
        }

        public void a(long j10, int i10, boolean z10) {
            if (this.f84890j && this.f84887g) {
                this.f84893m = this.f84883c;
                this.f84890j = false;
            } else if (this.f84888h || this.f84887g) {
                if (z10 && this.f84889i) {
                    d(i10 + ((int) (j10 - this.f84882b)));
                }
                this.f84891k = this.f84882b;
                this.f84892l = this.f84885e;
                this.f84893m = this.f84883c;
                this.f84889i = true;
            }
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
        public final void d(int i10) {
            boolean z10 = this.f84893m;
            this.f84881a.c(this.f84892l, z10 ? 1 : 0, (int) (this.f84882b - this.f84891k), i10, null);
        }

        public void e(byte[] bArr, int i10, int i11) {
            if (this.f84886f) {
                int i12 = this.f84884d;
                int i13 = (i10 + 2) - i12;
                if (i13 >= i11) {
                    this.f84884d = i12 + (i11 - i10);
                } else {
                    this.f84887g = (bArr[i13] & 128) != 0;
                    this.f84886f = false;
                }
            }
        }

        public void f() {
            this.f84886f = false;
            this.f84887g = false;
            this.f84888h = false;
            this.f84889i = false;
            this.f84890j = false;
        }

        public void g(long j10, int i10, int i11, long j11, boolean z10) {
            this.f84887g = false;
            this.f84888h = false;
            this.f84885e = j11;
            this.f84884d = 0;
            this.f84882b = j10;
            if (!c(i11)) {
                if (this.f84889i && !this.f84890j) {
                    if (z10) {
                        d(i10);
                    }
                    this.f84889i = false;
                }
                if (b(i11)) {
                    this.f84888h = !this.f84890j;
                    this.f84890j = true;
                }
            }
            boolean z11 = i11 >= 16 && i11 <= 21;
            this.f84883c = z11;
            this.f84886f = z11 || i11 <= 9;
        }
    }

    public p(b0 b0Var) {
        this.f84867a = b0Var;
    }

    public static Format e(String str, t tVar, t tVar2, t tVar3) {
        float f10;
        int i10 = tVar.f84936e;
        byte[] bArr = new byte[tVar2.f84936e + i10 + tVar3.f84936e];
        System.arraycopy(tVar.f84935d, 0, bArr, 0, i10);
        System.arraycopy(tVar2.f84935d, 0, bArr, tVar.f84936e, tVar2.f84936e);
        System.arraycopy(tVar3.f84935d, 0, bArr, tVar.f84936e + tVar2.f84936e, tVar3.f84936e);
        a6.u uVar = new a6.u(tVar2.f84935d, 0, tVar2.f84936e);
        uVar.l(44);
        int iE = uVar.e(3);
        uVar.k();
        uVar.l(88);
        uVar.l(8);
        int i11 = 0;
        for (int i12 = 0; i12 < iE; i12++) {
            if (uVar.d()) {
                i11 += 89;
            }
            if (uVar.d()) {
                i11 += 8;
            }
        }
        uVar.l(i11);
        if (iE > 0) {
            uVar.l((8 - iE) * 2);
        }
        uVar.h();
        int iH = uVar.h();
        if (iH == 3) {
            uVar.k();
        }
        int iH2 = uVar.h();
        int iH3 = uVar.h();
        if (uVar.d()) {
            int iH4 = uVar.h();
            int iH5 = uVar.h();
            int iH6 = uVar.h();
            int iH7 = uVar.h();
            iH2 -= ((iH == 1 || iH == 2) ? 2 : 1) * (iH4 + iH5);
            iH3 -= (iH == 1 ? 2 : 1) * (iH6 + iH7);
        }
        int i13 = iH2;
        int i14 = iH3;
        uVar.h();
        uVar.h();
        int iH8 = uVar.h();
        for (int i15 = uVar.d() ? 0 : iE; i15 <= iE; i15++) {
            uVar.h();
            uVar.h();
            uVar.h();
        }
        uVar.h();
        uVar.h();
        uVar.h();
        uVar.h();
        uVar.h();
        uVar.h();
        if (uVar.d() && uVar.d()) {
            f(uVar);
        }
        uVar.l(2);
        if (uVar.d()) {
            uVar.l(8);
            uVar.h();
            uVar.h();
            uVar.k();
        }
        g(uVar);
        if (uVar.d()) {
            for (int i16 = 0; i16 < uVar.h(); i16++) {
                uVar.l(iH8 + 4 + 1);
            }
        }
        uVar.l(2);
        float f11 = 1.0f;
        if (uVar.d() && uVar.d()) {
            int iE2 = uVar.e(8);
            if (iE2 == 255) {
                int iE3 = uVar.e(16);
                int iE4 = uVar.e(16);
                if (iE3 != 0 && iE4 != 0) {
                    f11 = iE3 / iE4;
                }
            } else {
                float[] fArr = a6.q.f3597b;
                if (iE2 < fArr.length) {
                    f10 = fArr[iE2];
                } else {
                    a6.m.h("H265Reader", "Unexpected aspect_ratio_idc value: " + iE2);
                }
            }
            f10 = f11;
        } else {
            f10 = f11;
        }
        return Format.C(str, "video/hevc", null, -1, -1, i13, i14, -1.0f, Collections.singletonList(bArr), -1, f10, null);
    }

    public static void f(a6.u uVar) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (uVar.d()) {
                    int iMin = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        uVar.g();
                    }
                    for (int i13 = 0; i13 < iMin; i13++) {
                        uVar.g();
                    }
                } else {
                    uVar.h();
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    public static void g(a6.u uVar) {
        int iH = uVar.h();
        boolean zD = false;
        int i10 = 0;
        for (int i11 = 0; i11 < iH; i11++) {
            if (i11 != 0) {
                zD = uVar.d();
            }
            if (zD) {
                uVar.k();
                uVar.h();
                for (int i12 = 0; i12 <= i10; i12++) {
                    if (uVar.d()) {
                        uVar.k();
                    }
                }
            } else {
                int iH2 = uVar.h();
                int iH3 = uVar.h();
                int i13 = iH2 + iH3;
                for (int i14 = 0; i14 < iH2; i14++) {
                    uVar.h();
                    uVar.k();
                }
                for (int i15 = 0; i15 < iH3; i15++) {
                    uVar.h();
                    uVar.k();
                }
                i10 = i13;
            }
        }
    }

    @Override // t4.m
    public void a(a6.t tVar) {
        while (tVar.a() > 0) {
            int iC = tVar.c();
            int iD = tVar.d();
            byte[] bArr = tVar.f3620a;
            this.f84878l += (long) tVar.a();
            this.f84869c.a(tVar, tVar.a());
            while (iC < iD) {
                int iC2 = a6.q.c(bArr, iC, iD, this.f84872f);
                if (iC2 == iD) {
                    d(bArr, iC, iD);
                    return;
                }
                int iE = a6.q.e(bArr, iC2);
                int i10 = iC2 - iC;
                if (i10 > 0) {
                    d(bArr, iC, iC2);
                }
                int i11 = iD - iC2;
                long j10 = this.f84878l - ((long) i11);
                c(j10, i11, i10 < 0 ? -i10 : 0, this.f84879m);
                h(j10, i11, iE, this.f84879m);
                iC = iC2 + 3;
            }
        }
    }

    @Override // t4.m
    public void b(k4.i iVar, h0.d dVar) {
        dVar.a();
        this.f84868b = dVar.b();
        k4.u uVarTrack = iVar.track(dVar.c(), 2);
        this.f84869c = uVarTrack;
        this.f84870d = new a(uVarTrack);
        this.f84867a.b(iVar, dVar);
    }

    public final void c(long j10, int i10, int i11, long j11) {
        this.f84870d.a(j10, i10, this.f84871e);
        if (!this.f84871e) {
            this.f84873g.b(i11);
            this.f84874h.b(i11);
            this.f84875i.b(i11);
            if (this.f84873g.c() && this.f84874h.c() && this.f84875i.c()) {
                this.f84869c.d(e(this.f84868b, this.f84873g, this.f84874h, this.f84875i));
                this.f84871e = true;
            }
        }
        if (this.f84876j.b(i11)) {
            t tVar = this.f84876j;
            this.f84880n.J(this.f84876j.f84935d, a6.q.k(tVar.f84935d, tVar.f84936e));
            this.f84880n.M(5);
            this.f84867a.a(j11, this.f84880n);
        }
        if (this.f84877k.b(i11)) {
            t tVar2 = this.f84877k;
            this.f84880n.J(this.f84877k.f84935d, a6.q.k(tVar2.f84935d, tVar2.f84936e));
            this.f84880n.M(5);
            this.f84867a.a(j11, this.f84880n);
        }
    }

    public final void d(byte[] bArr, int i10, int i11) {
        this.f84870d.e(bArr, i10, i11);
        if (!this.f84871e) {
            this.f84873g.a(bArr, i10, i11);
            this.f84874h.a(bArr, i10, i11);
            this.f84875i.a(bArr, i10, i11);
        }
        this.f84876j.a(bArr, i10, i11);
        this.f84877k.a(bArr, i10, i11);
    }

    public final void h(long j10, int i10, int i11, long j11) {
        this.f84870d.g(j10, i10, i11, j11, this.f84871e);
        if (!this.f84871e) {
            this.f84873g.e(i11);
            this.f84874h.e(i11);
            this.f84875i.e(i11);
        }
        this.f84876j.e(i11);
        this.f84877k.e(i11);
    }

    @Override // t4.m
    public void packetFinished() {
    }

    @Override // t4.m
    public void packetStarted(long j10, int i10) {
        this.f84879m = j10;
    }

    @Override // t4.m
    public void seek() {
        a6.q.a(this.f84872f);
        this.f84873g.d();
        this.f84874h.d();
        this.f84875i.d();
        this.f84876j.d();
        this.f84877k.d();
        this.f84870d.f();
        this.f84878l = 0L;
    }
}
