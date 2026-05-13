package s6;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.m;
import java.util.Collections;
import s6.i0;
import s7.m0;

/* JADX INFO: compiled from: H265Reader.java */
/* JADX INFO: loaded from: classes10.dex */
public final class q implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f79342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f79343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i6.b0 f79344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f79345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f79346e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f79353l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f79347f = new boolean[3];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u f79348g = new u(32, 128);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u f79349h = new u(33, 128);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u f79350i = new u(34, 128);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u f79351j = new u(39, 128);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u f79352k = new u(40, 128);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f79354m = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final s7.a0 f79355n = new s7.a0();

    /* JADX INFO: compiled from: H265Reader.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i6.b0 f79356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f79357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f79358c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f79359d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f79360e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f79361f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f79362g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f79363h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f79364i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f79365j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f79366k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f79367l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f79368m;

        public a(i6.b0 b0Var) {
            this.f79356a = b0Var;
        }

        public static boolean b(int i10) {
            return (32 <= i10 && i10 <= 35) || i10 == 39;
        }

        public static boolean c(int i10) {
            return i10 < 32 || i10 == 40;
        }

        public void a(long j10, int i10, boolean z10) {
            if (this.f79365j && this.f79362g) {
                this.f79368m = this.f79358c;
                this.f79365j = false;
            } else if (this.f79363h || this.f79362g) {
                if (z10 && this.f79364i) {
                    d(i10 + ((int) (j10 - this.f79357b)));
                }
                this.f79366k = this.f79357b;
                this.f79367l = this.f79360e;
                this.f79368m = this.f79358c;
                this.f79364i = true;
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
            long j10 = this.f79367l;
            if (j10 == -9223372036854775807L) {
                return;
            }
            boolean z10 = this.f79368m;
            this.f79356a.c(j10, z10 ? 1 : 0, (int) (this.f79357b - this.f79366k), i10, null);
        }

        public void e(byte[] bArr, int i10, int i11) {
            if (this.f79361f) {
                int i12 = this.f79359d;
                int i13 = (i10 + 2) - i12;
                if (i13 >= i11) {
                    this.f79359d = i12 + (i11 - i10);
                } else {
                    this.f79362g = (bArr[i13] & 128) != 0;
                    this.f79361f = false;
                }
            }
        }

        public void f() {
            this.f79361f = false;
            this.f79362g = false;
            this.f79363h = false;
            this.f79364i = false;
            this.f79365j = false;
        }

        public void g(long j10, int i10, int i11, long j11, boolean z10) {
            this.f79362g = false;
            this.f79363h = false;
            this.f79360e = j11;
            this.f79359d = 0;
            this.f79357b = j10;
            if (!c(i11)) {
                if (this.f79364i && !this.f79365j) {
                    if (z10) {
                        d(i10);
                    }
                    this.f79364i = false;
                }
                if (b(i11)) {
                    this.f79363h = !this.f79365j;
                    this.f79365j = true;
                }
            }
            boolean z11 = i11 >= 16 && i11 <= 21;
            this.f79358c = z11;
            this.f79361f = z11 || i11 <= 9;
        }
    }

    public q(d0 d0Var) {
        this.f79342a = d0Var;
    }

    public static com.google.android.exoplayer2.m f(@Nullable String str, u uVar, u uVar2, u uVar3) {
        int i10 = uVar.f79412e;
        byte[] bArr = new byte[uVar2.f79412e + i10 + uVar3.f79412e];
        System.arraycopy(uVar.f79411d, 0, bArr, 0, i10);
        System.arraycopy(uVar2.f79411d, 0, bArr, uVar.f79412e, uVar2.f79412e);
        System.arraycopy(uVar3.f79411d, 0, bArr, uVar.f79412e + uVar2.f79412e, uVar3.f79412e);
        s7.b0 b0Var = new s7.b0(uVar2.f79411d, 0, uVar2.f79412e);
        b0Var.l(44);
        int iE = b0Var.e(3);
        b0Var.k();
        int iE2 = b0Var.e(2);
        boolean zD = b0Var.d();
        int iE3 = b0Var.e(5);
        int i11 = 0;
        for (int i12 = 0; i12 < 32; i12++) {
            if (b0Var.d()) {
                i11 |= 1 << i12;
            }
        }
        int[] iArr = new int[6];
        for (int i13 = 0; i13 < 6; i13++) {
            iArr[i13] = b0Var.e(8);
        }
        int iE4 = b0Var.e(8);
        int i14 = 0;
        for (int i15 = 0; i15 < iE; i15++) {
            if (b0Var.d()) {
                i14 += 89;
            }
            if (b0Var.d()) {
                i14 += 8;
            }
        }
        b0Var.l(i14);
        if (iE > 0) {
            b0Var.l((8 - iE) * 2);
        }
        b0Var.h();
        int iH = b0Var.h();
        if (iH == 3) {
            b0Var.k();
        }
        int iH2 = b0Var.h();
        int iH3 = b0Var.h();
        if (b0Var.d()) {
            int iH4 = b0Var.h();
            int iH5 = b0Var.h();
            int iH6 = b0Var.h();
            int iH7 = b0Var.h();
            iH2 -= ((iH == 1 || iH == 2) ? 2 : 1) * (iH4 + iH5);
            iH3 -= (iH == 1 ? 2 : 1) * (iH6 + iH7);
        }
        b0Var.h();
        b0Var.h();
        int iH8 = b0Var.h();
        for (int i16 = b0Var.d() ? 0 : iE; i16 <= iE; i16++) {
            b0Var.h();
            b0Var.h();
            b0Var.h();
        }
        b0Var.h();
        b0Var.h();
        b0Var.h();
        b0Var.h();
        b0Var.h();
        b0Var.h();
        if (b0Var.d() && b0Var.d()) {
            g(b0Var);
        }
        b0Var.l(2);
        if (b0Var.d()) {
            b0Var.l(8);
            b0Var.h();
            b0Var.h();
            b0Var.k();
        }
        h(b0Var);
        if (b0Var.d()) {
            for (int i17 = 0; i17 < b0Var.h(); i17++) {
                b0Var.l(iH8 + 4 + 1);
            }
        }
        b0Var.l(2);
        float f10 = 1.0f;
        if (b0Var.d()) {
            if (b0Var.d()) {
                int iE5 = b0Var.e(8);
                if (iE5 == 255) {
                    int iE6 = b0Var.e(16);
                    int iE7 = b0Var.e(16);
                    if (iE6 != 0 && iE7 != 0) {
                        f10 = iE6 / iE7;
                    }
                } else {
                    float[] fArr = s7.v.f79532b;
                    if (iE5 < fArr.length) {
                        f10 = fArr[iE5];
                    } else {
                        s7.q.i("H265Reader", "Unexpected aspect_ratio_idc value: " + iE5);
                    }
                }
            }
            if (b0Var.d()) {
                b0Var.k();
            }
            if (b0Var.d()) {
                b0Var.l(4);
                if (b0Var.d()) {
                    b0Var.l(24);
                }
            }
            if (b0Var.d()) {
                b0Var.h();
                b0Var.h();
            }
            b0Var.k();
            if (b0Var.d()) {
                iH3 *= 2;
            }
        }
        return new m.b().S(str).e0("video/hevc").I(s7.e.c(iE2, zD, iE3, i11, iArr, iE4)).j0(iH2).Q(iH3).a0(f10).T(Collections.singletonList(bArr)).E();
    }

    public static void g(s7.b0 b0Var) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (b0Var.d()) {
                    int iMin = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        b0Var.g();
                    }
                    for (int i13 = 0; i13 < iMin; i13++) {
                        b0Var.g();
                    }
                } else {
                    b0Var.h();
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    public static void h(s7.b0 b0Var) {
        int iH = b0Var.h();
        boolean zD = false;
        int i10 = 0;
        for (int i11 = 0; i11 < iH; i11++) {
            if (i11 != 0) {
                zD = b0Var.d();
            }
            if (zD) {
                b0Var.k();
                b0Var.h();
                for (int i12 = 0; i12 <= i10; i12++) {
                    if (b0Var.d()) {
                        b0Var.k();
                    }
                }
            } else {
                int iH2 = b0Var.h();
                int iH3 = b0Var.h();
                int i13 = iH2 + iH3;
                for (int i14 = 0; i14 < iH2; i14++) {
                    b0Var.h();
                    b0Var.k();
                }
                for (int i15 = 0; i15 < iH3; i15++) {
                    b0Var.h();
                    b0Var.k();
                }
                i10 = i13;
            }
        }
    }

    @Override // s6.m
    public void a(s7.a0 a0Var) {
        c();
        while (a0Var.a() > 0) {
            int iE = a0Var.e();
            int iF = a0Var.f();
            byte[] bArrD = a0Var.d();
            this.f79353l += (long) a0Var.a();
            this.f79344c.e(a0Var, a0Var.a());
            while (iE < iF) {
                int iC = s7.v.c(bArrD, iE, iF, this.f79347f);
                if (iC == iF) {
                    e(bArrD, iE, iF);
                    return;
                }
                int iE2 = s7.v.e(bArrD, iC);
                int i10 = iC - iE;
                if (i10 > 0) {
                    e(bArrD, iE, iC);
                }
                int i11 = iF - iC;
                long j10 = this.f79353l - ((long) i11);
                d(j10, i11, i10 < 0 ? -i10 : 0, this.f79354m);
                i(j10, i11, iE2, this.f79354m);
                iE = iC + 3;
            }
        }
    }

    @Override // s6.m
    public void b(i6.m mVar, i0.d dVar) {
        dVar.a();
        this.f79343b = dVar.b();
        i6.b0 b0VarTrack = mVar.track(dVar.c(), 2);
        this.f79344c = b0VarTrack;
        this.f79345d = new a(b0VarTrack);
        this.f79342a.b(mVar, dVar);
    }

    public final void c() {
        s7.a.i(this.f79344c);
        m0.j(this.f79345d);
    }

    public final void d(long j10, int i10, int i11, long j11) {
        this.f79345d.a(j10, i10, this.f79346e);
        if (!this.f79346e) {
            this.f79348g.b(i11);
            this.f79349h.b(i11);
            this.f79350i.b(i11);
            if (this.f79348g.c() && this.f79349h.c() && this.f79350i.c()) {
                this.f79344c.b(f(this.f79343b, this.f79348g, this.f79349h, this.f79350i));
                this.f79346e = true;
            }
        }
        if (this.f79351j.b(i11)) {
            u uVar = this.f79351j;
            this.f79355n.N(this.f79351j.f79411d, s7.v.q(uVar.f79411d, uVar.f79412e));
            this.f79355n.Q(5);
            this.f79342a.a(j11, this.f79355n);
        }
        if (this.f79352k.b(i11)) {
            u uVar2 = this.f79352k;
            this.f79355n.N(this.f79352k.f79411d, s7.v.q(uVar2.f79411d, uVar2.f79412e));
            this.f79355n.Q(5);
            this.f79342a.a(j11, this.f79355n);
        }
    }

    public final void e(byte[] bArr, int i10, int i11) {
        this.f79345d.e(bArr, i10, i11);
        if (!this.f79346e) {
            this.f79348g.a(bArr, i10, i11);
            this.f79349h.a(bArr, i10, i11);
            this.f79350i.a(bArr, i10, i11);
        }
        this.f79351j.a(bArr, i10, i11);
        this.f79352k.a(bArr, i10, i11);
    }

    public final void i(long j10, int i10, int i11, long j11) {
        this.f79345d.g(j10, i10, i11, j11, this.f79346e);
        if (!this.f79346e) {
            this.f79348g.e(i11);
            this.f79349h.e(i11);
            this.f79350i.e(i11);
        }
        this.f79351j.e(i11);
        this.f79352k.e(i11);
    }

    @Override // s6.m
    public void packetFinished() {
    }

    @Override // s6.m
    public void packetStarted(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f79354m = j10;
        }
    }

    @Override // s6.m
    public void seek() {
        this.f79353l = 0L;
        this.f79354m = -9223372036854775807L;
        s7.v.a(this.f79347f);
        this.f79348g.d();
        this.f79349h.d();
        this.f79350i.d();
        this.f79351j.d();
        this.f79352k.d();
        a aVar = this.f79345d;
        if (aVar != null) {
            aVar.f();
        }
    }
}
