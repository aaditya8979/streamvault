package com.fyber.inneractive.sdk.player.exoplayer2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f17234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.source.v f17236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f17237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f17238f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f17239g;

    public a(int i10) {
        this.f17233a = i10;
    }

    public final int a(p pVar, com.fyber.inneractive.sdk.player.exoplayer2.decoder.c cVar, boolean z10) {
        int iA = this.f17236d.a(pVar, cVar, z10);
        if (iA == -4) {
            if (cVar.b(4)) {
                this.f17238f = true;
                return this.f17239g ? -4 : -3;
            }
            cVar.f17382d += this.f17237e;
        } else if (iA == -5) {
            o oVar = pVar.f18474a;
            long j10 = oVar.f18470w;
            if (j10 != Long.MAX_VALUE) {
                pVar.f18474a = new o(oVar.f18448a, oVar.f18452e, oVar.f18453f, oVar.f18450c, oVar.f18449b, oVar.f18454g, oVar.f18457j, oVar.f18458k, oVar.f18459l, oVar.f18460m, oVar.f18461n, oVar.f18463p, oVar.f18462o, oVar.f18464q, oVar.f18465r, oVar.f18466s, oVar.f18467t, oVar.f18468u, oVar.f18469v, oVar.f18471x, oVar.f18472y, oVar.f18473z, j10 + this.f17237e, oVar.f18455h, oVar.f18456i, oVar.f18451d);
            }
        }
        return iA;
    }

    public abstract void a(int i10, Object obj);

    public abstract void a(long j10, long j11);

    public abstract void a(boolean z10, long j10);

    public void a(o[] oVarArr) {
    }

    public final void c() {
        if (this.f17235c != 1) {
            throw new IllegalStateException();
        }
        this.f17235c = 0;
        this.f17236d = null;
        this.f17239g = false;
        g();
    }

    public com.fyber.inneractive.sdk.player.exoplayer2.util.h d() {
        return null;
    }

    public abstract boolean e();

    public abstract boolean f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract void j();
}
