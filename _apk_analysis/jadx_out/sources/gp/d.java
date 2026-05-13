package gp;

import fp.l;
import fp.n;
import fp.o;
import fp.p;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;

/* JADX INFO: compiled from: DanmakuFactory.java */
/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f62717a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f62718b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p.c f62719c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f62720d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f62721e = 3800;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f62722f = 4000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public fp.f f62723g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public fp.f f62724h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public fp.f f62725i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public l f62726j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public DanmakuContext f62727k;

    public static d a() {
        return new d();
    }

    public fp.c b(int i10) {
        return e(i10, this.f62727k);
    }

    public fp.c c(int i10, float f10, float f11, float f12, float f13) {
        float f14;
        int i11 = this.f62717a;
        int i12 = this.f62718b;
        boolean zL = l(f10, f11, f12);
        fp.f fVar = this.f62723g;
        if (fVar == null) {
            fp.f fVar2 = new fp.f(this.f62721e);
            this.f62723g = fVar2;
            fVar2.a(f13);
        } else if (zL) {
            fVar.b(this.f62721e);
        }
        if (this.f62724h == null) {
            this.f62724h = new fp.f(3800L);
        }
        float f15 = 1.0f;
        if (!zL || f10 <= 0.0f) {
            f14 = 1.0f;
        } else {
            i();
            if (i11 <= 0 || i12 <= 0) {
                f14 = 1.0f;
            } else {
                f15 = f10 / i11;
                f14 = f11 / i12;
            }
            int i13 = (int) f10;
            int i14 = (int) f11;
            j(i13, i14, f15, f14);
            if (f11 > 0.0f) {
                k(i13, i14, f15, f14);
            }
        }
        if (i10 == 1) {
            return new o(this.f62723g);
        }
        if (i10 == 4) {
            return new fp.g(this.f62724h);
        }
        if (i10 == 5) {
            return new fp.h(this.f62724h);
        }
        if (i10 == 6) {
            return new n(this.f62723g);
        }
        if (i10 != 7) {
            return null;
        }
        p pVar = new p();
        j((int) f10, (int) f11, f15, f14);
        pVar.F(this.f62719c);
        return pVar;
    }

    public fp.c d(int i10, int i11, int i12, float f10, float f11) {
        return c(i10, i11, i12, f10, f11);
    }

    public fp.c e(int i10, DanmakuContext danmakuContext) {
        if (danmakuContext == null) {
            return null;
        }
        this.f62727k = danmakuContext;
        fp.a aVarB = danmakuContext.b();
        this.f62726j = aVarB;
        return d(i10, aVarB.getWidth(), this.f62726j.getHeight(), this.f62720d, danmakuContext.f74036m);
    }

    public void f(DanmakuContext danmakuContext) {
        this.f62727k = danmakuContext;
        this.f62726j = danmakuContext.b();
        e(1, danmakuContext);
    }

    public void g() {
        this.f62726j = null;
        this.f62718b = 0;
        this.f62717a = 0;
        this.f62723g = null;
        this.f62724h = null;
        this.f62725i = null;
        this.f62722f = 4000L;
    }

    public void h(float f10) {
        fp.f fVar = this.f62723g;
        if (fVar == null || this.f62724h == null) {
            return;
        }
        fVar.a(f10);
        i();
    }

    public void i() {
        fp.f fVar = this.f62723g;
        long j10 = fVar == null ? 0L : fVar.f61804d;
        fp.f fVar2 = this.f62724h;
        long j11 = fVar2 == null ? 0L : fVar2.f61804d;
        fp.f fVar3 = this.f62725i;
        long j12 = fVar3 != null ? fVar3.f61804d : 0L;
        long jMax = Math.max(j10, j11);
        this.f62722f = jMax;
        long jMax2 = Math.max(jMax, j12);
        this.f62722f = jMax2;
        long jMax3 = Math.max(3800L, jMax2);
        this.f62722f = jMax3;
        this.f62722f = Math.max(this.f62721e, jMax3);
    }

    public final void j(int i10, int i11, float f10, float f11) {
        if (this.f62719c == null) {
            this.f62719c = new p.c(i10, i11, f10, f11);
        }
        this.f62719c.update(i10, i11, f10, f11);
    }

    public final synchronized void k(int i10, int i11, float f10, float f11) {
        p.c cVar = this.f62719c;
        if (cVar != null) {
            cVar.update(i10, i11, f10, f11);
        }
    }

    public boolean l(float f10, float f11, float f12) {
        int i10 = (int) f10;
        if (this.f62717a == i10 && this.f62718b == ((int) f11) && this.f62720d == f12) {
            return false;
        }
        long j10 = (long) (((f10 * f12) / 682.0f) * 3800.0f);
        this.f62721e = j10;
        long jMin = Math.min(9000L, j10);
        this.f62721e = jMin;
        this.f62721e = Math.max(4000L, jMin);
        this.f62717a = i10;
        this.f62718b = (int) f11;
        this.f62720d = f12;
        return true;
    }
}
