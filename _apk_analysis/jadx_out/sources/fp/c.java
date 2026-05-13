package fp;

import android.util.SparseArray;

/* JADX INFO: compiled from: BaseDanmaku.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {
    public String B;
    public boolean C;
    public e D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f61774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f61775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f61776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String[] f61777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f61778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f61779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f61780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f61781h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f61782i;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public f f61790q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f61791r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f61792s;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public m<?> f61797x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f61798y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f61799z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f61783j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f61784k = -1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f61785l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f61786m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte f61787n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f61788o = -1.0f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f61789p = -1.0f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f61793t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f61794u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f61795v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f61796w = -1;
    public int A = 0;
    public int E = b.f61772a;
    public int F = 0;
    public int G = -1;
    public i H = null;
    public int I = 0;
    public int J = -1;
    public SparseArray<Object> K = new SparseArray<>();

    public void A(long j10) {
        this.f61774a = j10;
        this.f61775b = 0L;
    }

    public void B(e eVar) {
        this.D = eVar;
    }

    public void C(boolean z10) {
        if (!z10) {
            this.f61792s = 0;
        } else {
            this.f61793t = this.H.f61806b;
            this.f61792s = 1;
        }
    }

    public int a(l lVar) {
        return lVar.i(this);
    }

    public long b() {
        i iVar = this.H;
        if (iVar != null && iVar.f61809e == this.f61795v) {
            return this.f61774a + this.f61775b;
        }
        this.f61775b = 0L;
        return this.f61774a;
    }

    public int c() {
        return this.E;
    }

    public abstract float d();

    public m<?> e() {
        return this.f61797x;
    }

    public long f() {
        return this.f61790q.f61804d;
    }

    public abstract float g();

    public abstract int getType();

    public abstract float[] h(l lVar, long j10);

    public abstract float i();

    public long j() {
        return this.f61774a;
    }

    public e k() {
        return this.D;
    }

    public abstract float l();

    public boolean m() {
        if (this.G == this.H.f61807c) {
            return true;
        }
        this.F = 0;
        return false;
    }

    public boolean n() {
        return this.G == this.H.f61807c && this.F != 0;
    }

    public boolean o() {
        e eVar = this.D;
        return eVar == null || eVar.f61800a < b();
    }

    public boolean p() {
        return this.f61788o > -1.0f && this.f61789p > -1.0f && this.f61794u == this.H.f61805a;
    }

    public boolean q() {
        i iVar = this.H;
        if (iVar != null && iVar.f61809e == this.f61795v) {
            return this.f61775b != 0;
        }
        this.f61775b = 0L;
        return false;
    }

    public boolean r() {
        e eVar = this.D;
        return eVar == null || s(eVar.f61800a);
    }

    public boolean s(long j10) {
        long jB = j10 - b();
        return jB <= 0 || jB >= this.f61790q.f61804d;
    }

    public boolean t() {
        return this.f61796w == this.H.f61810f;
    }

    public boolean u() {
        return this.f61792s == 1 && this.f61793t == this.H.f61806b;
    }

    public boolean v() {
        e eVar = this.D;
        return eVar == null || w(eVar.f61800a);
    }

    public boolean w(long j10) {
        return j10 - b() >= this.f61790q.f61804d;
    }

    public abstract void x(l lVar, float f10, float f11);

    public void y(l lVar, boolean z10) {
        lVar.g(this, z10);
        this.f61794u = this.H.f61805a;
    }

    public void z(l lVar, boolean z10) {
        lVar.l(this, z10);
        this.f61796w = this.H.f61810f;
    }
}
