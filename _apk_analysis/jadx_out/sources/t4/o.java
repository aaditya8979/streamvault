package t4;

import a6.q;
import android.util.SparseArray;
import com.google.android.exoplayer.Format;
import java.util.ArrayList;
import java.util.Arrays;
import t4.h0;

/* JADX INFO: compiled from: H264Reader.java */
/* JADX INFO: loaded from: classes9.dex */
public final class o implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f84818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f84819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f84820c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f84824g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f84826i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k4.u f84827j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f84828k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f84829l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f84830m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f84831n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f84825h = new boolean[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f84821d = new t(7, 128);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f84822e = new t(8, 128);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f84823f = new t(6, 128);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a6.t f84832o = new a6.t();

    /* JADX INFO: compiled from: H264Reader.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k4.u f84833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f84834b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f84835c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray<q.b> f84836d = new SparseArray<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final SparseArray<q.a> f84837e = new SparseArray<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final a6.u f84838f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte[] f84839g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f84840h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f84841i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f84842j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f84843k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f84844l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public a f84845m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public a f84846n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f84847o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public long f84848p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public long f84849q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f84850r;

        /* JADX INFO: compiled from: H264Reader.java */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f84851a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f84852b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public q.b f84853c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f84854d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f84855e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public int f84856f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f84857g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public boolean f84858h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public boolean f84859i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public boolean f84860j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public boolean f84861k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public int f84862l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public int f84863m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public int f84864n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public int f84865o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public int f84866p;

            public a() {
            }

            public void b() {
                this.f84852b = false;
                this.f84851a = false;
            }

            public final boolean c(a aVar) {
                boolean z10;
                boolean z11;
                if (this.f84851a) {
                    if (!aVar.f84851a || this.f84856f != aVar.f84856f || this.f84857g != aVar.f84857g || this.f84858h != aVar.f84858h) {
                        return true;
                    }
                    if (this.f84859i && aVar.f84859i && this.f84860j != aVar.f84860j) {
                        return true;
                    }
                    int i10 = this.f84854d;
                    int i11 = aVar.f84854d;
                    if (i10 != i11 && (i10 == 0 || i11 == 0)) {
                        return true;
                    }
                    int i12 = this.f84853c.f3613k;
                    if (i12 == 0 && aVar.f84853c.f3613k == 0 && (this.f84863m != aVar.f84863m || this.f84864n != aVar.f84864n)) {
                        return true;
                    }
                    if ((i12 == 1 && aVar.f84853c.f3613k == 1 && (this.f84865o != aVar.f84865o || this.f84866p != aVar.f84866p)) || (z10 = this.f84861k) != (z11 = aVar.f84861k)) {
                        return true;
                    }
                    if (z10 && z11 && this.f84862l != aVar.f84862l) {
                        return true;
                    }
                }
                return false;
            }

            public boolean d() {
                int i10;
                return this.f84852b && ((i10 = this.f84855e) == 7 || i10 == 2);
            }

            public void e(q.b bVar, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
                this.f84853c = bVar;
                this.f84854d = i10;
                this.f84855e = i11;
                this.f84856f = i12;
                this.f84857g = i13;
                this.f84858h = z10;
                this.f84859i = z11;
                this.f84860j = z12;
                this.f84861k = z13;
                this.f84862l = i14;
                this.f84863m = i15;
                this.f84864n = i16;
                this.f84865o = i17;
                this.f84866p = i18;
                this.f84851a = true;
                this.f84852b = true;
            }

            public void f(int i10) {
                this.f84855e = i10;
                this.f84852b = true;
            }
        }

        public b(k4.u uVar, boolean z10, boolean z11) {
            this.f84833a = uVar;
            this.f84834b = z10;
            this.f84835c = z11;
            this.f84845m = new a();
            this.f84846n = new a();
            byte[] bArr = new byte[128];
            this.f84839g = bArr;
            this.f84838f = new a6.u(bArr, 0, 0);
            g();
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0152  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(byte[] r24, int r25, int r26) {
            /*
                Method dump skipped, instruction units count: 414
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: t4.o.b.a(byte[], int, int):void");
        }

        public boolean b(long j10, int i10, boolean z10, boolean z11) {
            boolean z12 = false;
            if (this.f84841i == 9 || (this.f84835c && this.f84846n.c(this.f84845m))) {
                if (z10 && this.f84847o) {
                    d(i10 + ((int) (j10 - this.f84842j)));
                }
                this.f84848p = this.f84842j;
                this.f84849q = this.f84844l;
                this.f84850r = false;
                this.f84847o = true;
            }
            if (this.f84834b) {
                z11 = this.f84846n.d();
            }
            boolean z13 = this.f84850r;
            int i11 = this.f84841i;
            if (i11 == 5 || (z11 && i11 == 1)) {
                z12 = true;
            }
            boolean z14 = z13 | z12;
            this.f84850r = z14;
            return z14;
        }

        public boolean c() {
            return this.f84835c;
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
            boolean z10 = this.f84850r;
            this.f84833a.c(this.f84849q, z10 ? 1 : 0, (int) (this.f84842j - this.f84848p), i10, null);
        }

        public void e(q.a aVar) {
            this.f84837e.append(aVar.f3600a, aVar);
        }

        public void f(q.b bVar) {
            this.f84836d.append(bVar.f3606d, bVar);
        }

        public void g() {
            this.f84843k = false;
            this.f84847o = false;
            this.f84846n.b();
        }

        public void h(long j10, int i10, long j11) {
            this.f84841i = i10;
            this.f84844l = j11;
            this.f84842j = j10;
            if (!this.f84834b || i10 != 1) {
                if (!this.f84835c) {
                    return;
                }
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            }
            a aVar = this.f84845m;
            this.f84845m = this.f84846n;
            this.f84846n = aVar;
            aVar.b();
            this.f84840h = 0;
            this.f84843k = true;
        }
    }

    public o(b0 b0Var, boolean z10, boolean z11) {
        this.f84818a = b0Var;
        this.f84819b = z10;
        this.f84820c = z11;
    }

    @Override // t4.m
    public void a(a6.t tVar) {
        int iC = tVar.c();
        int iD = tVar.d();
        byte[] bArr = tVar.f3620a;
        this.f84824g += (long) tVar.a();
        this.f84827j.a(tVar, tVar.a());
        while (true) {
            int iC2 = a6.q.c(bArr, iC, iD, this.f84825h);
            if (iC2 == iD) {
                d(bArr, iC, iD);
                return;
            }
            int iF = a6.q.f(bArr, iC2);
            int i10 = iC2 - iC;
            if (i10 > 0) {
                d(bArr, iC, iC2);
            }
            int i11 = iD - iC2;
            long j10 = this.f84824g - ((long) i11);
            c(j10, i11, i10 < 0 ? -i10 : 0, this.f84830m);
            e(j10, iF, this.f84830m);
            iC = iC2 + 3;
        }
    }

    @Override // t4.m
    public void b(k4.i iVar, h0.d dVar) {
        dVar.a();
        this.f84826i = dVar.b();
        k4.u uVarTrack = iVar.track(dVar.c(), 2);
        this.f84827j = uVarTrack;
        this.f84828k = new b(uVarTrack, this.f84819b, this.f84820c);
        this.f84818a.b(iVar, dVar);
    }

    public final void c(long j10, int i10, int i11, long j11) {
        if (!this.f84829l || this.f84828k.c()) {
            this.f84821d.b(i11);
            this.f84822e.b(i11);
            if (this.f84829l) {
                if (this.f84821d.c()) {
                    t tVar = this.f84821d;
                    this.f84828k.f(a6.q.i(tVar.f84935d, 3, tVar.f84936e));
                    this.f84821d.d();
                } else if (this.f84822e.c()) {
                    t tVar2 = this.f84822e;
                    this.f84828k.e(a6.q.h(tVar2.f84935d, 3, tVar2.f84936e));
                    this.f84822e.d();
                }
            } else if (this.f84821d.c() && this.f84822e.c()) {
                ArrayList arrayList = new ArrayList();
                t tVar3 = this.f84821d;
                arrayList.add(Arrays.copyOf(tVar3.f84935d, tVar3.f84936e));
                t tVar4 = this.f84822e;
                arrayList.add(Arrays.copyOf(tVar4.f84935d, tVar4.f84936e));
                t tVar5 = this.f84821d;
                q.b bVarI = a6.q.i(tVar5.f84935d, 3, tVar5.f84936e);
                t tVar6 = this.f84822e;
                q.a aVarH = a6.q.h(tVar6.f84935d, 3, tVar6.f84936e);
                this.f84827j.d(Format.C(this.f84826i, "video/avc", a6.d.c(bVarI.f3603a, bVarI.f3604b, bVarI.f3605c), -1, -1, bVarI.f3607e, bVarI.f3608f, -1.0f, arrayList, -1, bVarI.f3609g, null));
                this.f84829l = true;
                this.f84828k.f(bVarI);
                this.f84828k.e(aVarH);
                this.f84821d.d();
                this.f84822e.d();
            }
        }
        if (this.f84823f.b(i11)) {
            t tVar7 = this.f84823f;
            this.f84832o.J(this.f84823f.f84935d, a6.q.k(tVar7.f84935d, tVar7.f84936e));
            this.f84832o.L(4);
            this.f84818a.a(j11, this.f84832o);
        }
        if (this.f84828k.b(j10, i10, this.f84829l, this.f84831n)) {
            this.f84831n = false;
        }
    }

    public final void d(byte[] bArr, int i10, int i11) {
        if (!this.f84829l || this.f84828k.c()) {
            this.f84821d.a(bArr, i10, i11);
            this.f84822e.a(bArr, i10, i11);
        }
        this.f84823f.a(bArr, i10, i11);
        this.f84828k.a(bArr, i10, i11);
    }

    public final void e(long j10, int i10, long j11) {
        if (!this.f84829l || this.f84828k.c()) {
            this.f84821d.e(i10);
            this.f84822e.e(i10);
        }
        this.f84823f.e(i10);
        this.f84828k.h(j10, i10, j11);
    }

    @Override // t4.m
    public void packetFinished() {
    }

    @Override // t4.m
    public void packetStarted(long j10, int i10) {
        this.f84830m = j10;
        this.f84831n |= (i10 & 2) != 0;
    }

    @Override // t4.m
    public void seek() {
        a6.q.a(this.f84825h);
        this.f84821d.d();
        this.f84822e.d();
        this.f84823f.d();
        this.f84828k.g();
        this.f84824g = 0L;
        this.f84831n = false;
    }
}
