package s6;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.m;
import java.util.ArrayList;
import java.util.Arrays;
import s6.i0;
import s7.m0;
import s7.v;

/* JADX INFO: compiled from: H264Reader.java */
/* JADX INFO: loaded from: classes9.dex */
public final class p implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f79293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f79294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f79295c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f79299g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f79301i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i6.b0 f79302j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f79303k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f79304l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f79306n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f79300h = new boolean[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f79296d = new u(7, 128);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f79297e = new u(8, 128);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u f79298f = new u(6, 128);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f79305m = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final s7.a0 f79307o = new s7.a0();

    /* JADX INFO: compiled from: H264Reader.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i6.b0 f79308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f79309b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f79310c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray<v.c> f79311d = new SparseArray<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final SparseArray<v.b> f79312e = new SparseArray<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final s7.b0 f79313f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte[] f79314g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f79315h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f79316i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f79317j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f79318k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f79319l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public a f79320m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public a f79321n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f79322o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public long f79323p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public long f79324q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f79325r;

        /* JADX INFO: compiled from: H264Reader.java */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f79326a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f79327b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public v.c f79328c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f79329d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f79330e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public int f79331f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f79332g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public boolean f79333h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public boolean f79334i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public boolean f79335j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public boolean f79336k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public int f79337l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public int f79338m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public int f79339n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public int f79340o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public int f79341p;

            public a() {
            }

            public void b() {
                this.f79327b = false;
                this.f79326a = false;
            }

            public final boolean c(a aVar) {
                int i10;
                int i11;
                int i12;
                boolean z10;
                if (!this.f79326a) {
                    return false;
                }
                if (!aVar.f79326a) {
                    return true;
                }
                v.c cVar = (v.c) s7.a.i(this.f79328c);
                v.c cVar2 = (v.c) s7.a.i(aVar.f79328c);
                return (this.f79331f == aVar.f79331f && this.f79332g == aVar.f79332g && this.f79333h == aVar.f79333h && (!this.f79334i || !aVar.f79334i || this.f79335j == aVar.f79335j) && (((i10 = this.f79329d) == (i11 = aVar.f79329d) || (i10 != 0 && i11 != 0)) && (((i12 = cVar.f79559l) != 0 || cVar2.f79559l != 0 || (this.f79338m == aVar.f79338m && this.f79339n == aVar.f79339n)) && ((i12 != 1 || cVar2.f79559l != 1 || (this.f79340o == aVar.f79340o && this.f79341p == aVar.f79341p)) && (z10 = this.f79336k) == aVar.f79336k && (!z10 || this.f79337l == aVar.f79337l))))) ? false : true;
            }

            public boolean d() {
                int i10;
                return this.f79327b && ((i10 = this.f79330e) == 7 || i10 == 2);
            }

            public void e(v.c cVar, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
                this.f79328c = cVar;
                this.f79329d = i10;
                this.f79330e = i11;
                this.f79331f = i12;
                this.f79332g = i13;
                this.f79333h = z10;
                this.f79334i = z11;
                this.f79335j = z12;
                this.f79336k = z13;
                this.f79337l = i14;
                this.f79338m = i15;
                this.f79339n = i16;
                this.f79340o = i17;
                this.f79341p = i18;
                this.f79326a = true;
                this.f79327b = true;
            }

            public void f(int i10) {
                this.f79330e = i10;
                this.f79327b = true;
            }
        }

        public b(i6.b0 b0Var, boolean z10, boolean z11) {
            this.f79308a = b0Var;
            this.f79309b = z10;
            this.f79310c = z11;
            this.f79320m = new a();
            this.f79321n = new a();
            byte[] bArr = new byte[128];
            this.f79314g = bArr;
            this.f79313f = new s7.b0(bArr, 0, 0);
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
            throw new UnsupportedOperationException("Method not decompiled: s6.p.b.a(byte[], int, int):void");
        }

        public boolean b(long j10, int i10, boolean z10, boolean z11) {
            boolean z12 = false;
            if (this.f79316i == 9 || (this.f79310c && this.f79321n.c(this.f79320m))) {
                if (z10 && this.f79322o) {
                    d(i10 + ((int) (j10 - this.f79317j)));
                }
                this.f79323p = this.f79317j;
                this.f79324q = this.f79319l;
                this.f79325r = false;
                this.f79322o = true;
            }
            if (this.f79309b) {
                z11 = this.f79321n.d();
            }
            boolean z13 = this.f79325r;
            int i11 = this.f79316i;
            if (i11 == 5 || (z11 && i11 == 1)) {
                z12 = true;
            }
            boolean z14 = z13 | z12;
            this.f79325r = z14;
            return z14;
        }

        public boolean c() {
            return this.f79310c;
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
            long j10 = this.f79324q;
            if (j10 == -9223372036854775807L) {
                return;
            }
            boolean z10 = this.f79325r;
            this.f79308a.c(j10, z10 ? 1 : 0, (int) (this.f79317j - this.f79323p), i10, null);
        }

        public void e(v.b bVar) {
            this.f79312e.append(bVar.f79545a, bVar);
        }

        public void f(v.c cVar) {
            this.f79311d.append(cVar.f79551d, cVar);
        }

        public void g() {
            this.f79318k = false;
            this.f79322o = false;
            this.f79321n.b();
        }

        public void h(long j10, int i10, long j11) {
            this.f79316i = i10;
            this.f79319l = j11;
            this.f79317j = j10;
            if (!this.f79309b || i10 != 1) {
                if (!this.f79310c) {
                    return;
                }
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            }
            a aVar = this.f79320m;
            this.f79320m = this.f79321n;
            this.f79321n = aVar;
            aVar.b();
            this.f79315h = 0;
            this.f79318k = true;
        }
    }

    public p(d0 d0Var, boolean z10, boolean z11) {
        this.f79293a = d0Var;
        this.f79294b = z10;
        this.f79295c = z11;
    }

    @Override // s6.m
    public void a(s7.a0 a0Var) {
        c();
        int iE = a0Var.e();
        int iF = a0Var.f();
        byte[] bArrD = a0Var.d();
        this.f79299g += (long) a0Var.a();
        this.f79302j.e(a0Var, a0Var.a());
        while (true) {
            int iC = s7.v.c(bArrD, iE, iF, this.f79300h);
            if (iC == iF) {
                e(bArrD, iE, iF);
                return;
            }
            int iF2 = s7.v.f(bArrD, iC);
            int i10 = iC - iE;
            if (i10 > 0) {
                e(bArrD, iE, iC);
            }
            int i11 = iF - iC;
            long j10 = this.f79299g - ((long) i11);
            d(j10, i11, i10 < 0 ? -i10 : 0, this.f79305m);
            f(j10, iF2, this.f79305m);
            iE = iC + 3;
        }
    }

    @Override // s6.m
    public void b(i6.m mVar, i0.d dVar) {
        dVar.a();
        this.f79301i = dVar.b();
        i6.b0 b0VarTrack = mVar.track(dVar.c(), 2);
        this.f79302j = b0VarTrack;
        this.f79303k = new b(b0VarTrack, this.f79294b, this.f79295c);
        this.f79293a.b(mVar, dVar);
    }

    public final void c() {
        s7.a.i(this.f79302j);
        m0.j(this.f79303k);
    }

    public final void d(long j10, int i10, int i11, long j11) {
        if (!this.f79304l || this.f79303k.c()) {
            this.f79296d.b(i11);
            this.f79297e.b(i11);
            if (this.f79304l) {
                if (this.f79296d.c()) {
                    u uVar = this.f79296d;
                    this.f79303k.f(s7.v.l(uVar.f79411d, 3, uVar.f79412e));
                    this.f79296d.d();
                } else if (this.f79297e.c()) {
                    u uVar2 = this.f79297e;
                    this.f79303k.e(s7.v.j(uVar2.f79411d, 3, uVar2.f79412e));
                    this.f79297e.d();
                }
            } else if (this.f79296d.c() && this.f79297e.c()) {
                ArrayList arrayList = new ArrayList();
                u uVar3 = this.f79296d;
                arrayList.add(Arrays.copyOf(uVar3.f79411d, uVar3.f79412e));
                u uVar4 = this.f79297e;
                arrayList.add(Arrays.copyOf(uVar4.f79411d, uVar4.f79412e));
                u uVar5 = this.f79296d;
                v.c cVarL = s7.v.l(uVar5.f79411d, 3, uVar5.f79412e);
                u uVar6 = this.f79297e;
                v.b bVarJ = s7.v.j(uVar6.f79411d, 3, uVar6.f79412e);
                this.f79302j.b(new m.b().S(this.f79301i).e0("video/avc").I(s7.e.a(cVarL.f79548a, cVarL.f79549b, cVarL.f79550c)).j0(cVarL.f79553f).Q(cVarL.f79554g).a0(cVarL.f79555h).T(arrayList).E());
                this.f79304l = true;
                this.f79303k.f(cVarL);
                this.f79303k.e(bVarJ);
                this.f79296d.d();
                this.f79297e.d();
            }
        }
        if (this.f79298f.b(i11)) {
            u uVar7 = this.f79298f;
            this.f79307o.N(this.f79298f.f79411d, s7.v.q(uVar7.f79411d, uVar7.f79412e));
            this.f79307o.P(4);
            this.f79293a.a(j11, this.f79307o);
        }
        if (this.f79303k.b(j10, i10, this.f79304l, this.f79306n)) {
            this.f79306n = false;
        }
    }

    public final void e(byte[] bArr, int i10, int i11) {
        if (!this.f79304l || this.f79303k.c()) {
            this.f79296d.a(bArr, i10, i11);
            this.f79297e.a(bArr, i10, i11);
        }
        this.f79298f.a(bArr, i10, i11);
        this.f79303k.a(bArr, i10, i11);
    }

    public final void f(long j10, int i10, long j11) {
        if (!this.f79304l || this.f79303k.c()) {
            this.f79296d.e(i10);
            this.f79297e.e(i10);
        }
        this.f79298f.e(i10);
        this.f79303k.h(j10, i10, j11);
    }

    @Override // s6.m
    public void packetFinished() {
    }

    @Override // s6.m
    public void packetStarted(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f79305m = j10;
        }
        this.f79306n |= (i10 & 2) != 0;
    }

    @Override // s6.m
    public void seek() {
        this.f79299g = 0L;
        this.f79306n = false;
        this.f79305m = -9223372036854775807L;
        s7.v.a(this.f79300h);
        this.f79296d.d();
        this.f79297e.d();
        this.f79298f.d();
        b bVar = this.f79303k;
        if (bVar != null) {
            bVar.g();
        }
    }
}
