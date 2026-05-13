package k6;

import i6.a0;
import i6.b0;
import i6.l;
import i6.z;
import java.io.IOException;
import java.util.Arrays;
import s7.m0;

/* JADX INFO: compiled from: ChunkReader.java */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f72990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f72991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f72992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f72993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f72994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f72995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f72996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f72997h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f72998i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f72999j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long[] f73000k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f73001l;

    public e(int i10, int i11, long j10, int i12, b0 b0Var) {
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        s7.a.a(z10);
        this.f72993d = j10;
        this.f72994e = i12;
        this.f72990a = b0Var;
        this.f72991b = d(i10, i11 == 2 ? 1667497984 : 1651965952);
        this.f72992c = i11 == 2 ? d(i10, 1650720768) : -1;
        this.f73000k = new long[512];
        this.f73001l = new int[512];
    }

    public static int d(int i10, int i11) {
        return (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48) | i11;
    }

    public void a() {
        this.f72997h++;
    }

    public void b(long j10) {
        if (this.f72999j == this.f73001l.length) {
            long[] jArr = this.f73000k;
            this.f73000k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f73001l;
            this.f73001l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f73000k;
        int i10 = this.f72999j;
        jArr2[i10] = j10;
        this.f73001l[i10] = this.f72998i;
        this.f72999j = i10 + 1;
    }

    public void c() {
        this.f73000k = Arrays.copyOf(this.f73000k, this.f72999j);
        this.f73001l = Arrays.copyOf(this.f73001l, this.f72999j);
    }

    public final long e(int i10) {
        return (this.f72993d * ((long) i10)) / ((long) this.f72994e);
    }

    public long f() {
        return e(this.f72997h);
    }

    public long g() {
        return e(1);
    }

    public final a0 h(int i10) {
        return new a0(((long) this.f73001l[i10]) * g(), this.f73000k[i10]);
    }

    public z.a i(long j10) {
        int iG = (int) (j10 / g());
        int iH = m0.h(this.f73001l, iG, true, true);
        if (this.f73001l[iH] == iG) {
            return new z.a(h(iH));
        }
        a0 a0VarH = h(iH);
        int i10 = iH + 1;
        return i10 < this.f73000k.length ? new z.a(a0VarH, h(i10)) : new z.a(a0VarH);
    }

    public boolean j(int i10) {
        return this.f72991b == i10 || this.f72992c == i10;
    }

    public void k() {
        this.f72998i++;
    }

    public boolean l() {
        return Arrays.binarySearch(this.f73001l, this.f72997h) >= 0;
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
    public boolean m(l lVar) throws IOException {
        int i10 = this.f72996g;
        int iF = i10 - this.f72990a.f(lVar, i10, false);
        this.f72996g = iF;
        boolean z10 = iF == 0;
        if (z10) {
            if (this.f72995f > 0) {
                this.f72990a.c(f(), l() ? 1 : 0, this.f72995f, 0, null);
            }
            a();
        }
        return z10;
    }

    public void n(int i10) {
        this.f72995f = i10;
        this.f72996g = i10;
    }

    public void o(long j10) {
        if (this.f72999j == 0) {
            this.f72997h = 0;
        } else {
            this.f72997h = this.f73001l[m0.i(this.f73000k, j10, true, true)];
        }
    }
}
