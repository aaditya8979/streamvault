package n4;

import a6.t;
import java.io.IOException;
import k4.g;
import k4.h;
import k4.i;
import k4.k;
import k4.r;
import k4.s;

/* JADX INFO: compiled from: FlvExtractor.java */
/* JADX INFO: loaded from: classes8.dex */
public final class b implements g {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final k f75100q = new k() { // from class: n4.a
        @Override // k4.k
        public final g[] createExtractors() {
            return b.g();
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i f75106f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f75108h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f75109i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f75110j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f75111k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f75112l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f75113m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f75114n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.google.android.exoplayer.extractor.flv.a f75115o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.google.android.exoplayer.extractor.flv.b f75116p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f75101a = new t(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f75102b = new t(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f75103c = new t(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f75104d = new t();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f75105e = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f75107g = 1;

    public static /* synthetic */ g[] g() {
        return new g[]{new b()};
    }

    @Override // k4.g
    public boolean a(h hVar) throws InterruptedException, IOException {
        hVar.peekFully(this.f75101a.f3620a, 0, 3);
        this.f75101a.L(0);
        if (this.f75101a.B() != 4607062) {
            return false;
        }
        hVar.peekFully(this.f75101a.f3620a, 0, 2);
        this.f75101a.L(0);
        if ((this.f75101a.E() & 250) != 0) {
            return false;
        }
        hVar.peekFully(this.f75101a.f3620a, 0, 4);
        this.f75101a.L(0);
        int iJ = this.f75101a.j();
        hVar.resetPeekPosition();
        hVar.advancePeekPosition(iJ);
        hVar.peekFully(this.f75101a.f3620a, 0, 4);
        this.f75101a.L(0);
        return this.f75101a.j() == 0;
    }

    @Override // k4.g
    public void b(i iVar) {
        this.f75106f = iVar;
    }

    @Override // k4.g
    public int c(h hVar, r rVar) throws InterruptedException, IOException {
        while (true) {
            int i10 = this.f75107g;
            if (i10 != 1) {
                if (i10 == 2) {
                    l(hVar);
                } else if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    if (j(hVar)) {
                        return 0;
                    }
                } else if (!k(hVar)) {
                    return -1;
                }
            } else if (!i(hVar)) {
                return -1;
            }
        }
    }

    public final void e() {
        if (this.f75114n) {
            return;
        }
        this.f75106f.c(new s.b(-9223372036854775807L));
        this.f75114n = true;
    }

    public final long f() {
        if (this.f75108h) {
            return this.f75109i + this.f75113m;
        }
        if (this.f75105e.d() == -9223372036854775807L) {
            return 0L;
        }
        return this.f75113m;
    }

    public final t h(h hVar) throws InterruptedException, IOException {
        if (this.f75112l > this.f75104d.b()) {
            t tVar = this.f75104d;
            tVar.J(new byte[Math.max(tVar.b() * 2, this.f75112l)], 0);
        } else {
            this.f75104d.L(0);
        }
        this.f75104d.K(this.f75112l);
        hVar.readFully(this.f75104d.f3620a, 0, this.f75112l);
        return this.f75104d;
    }

    public final boolean i(h hVar) throws InterruptedException, IOException {
        if (!hVar.readFully(this.f75102b.f3620a, 0, 9, true)) {
            return false;
        }
        this.f75102b.L(0);
        this.f75102b.M(4);
        int iY = this.f75102b.y();
        boolean z10 = (iY & 4) != 0;
        boolean z11 = (iY & 1) != 0;
        if (z10 && this.f75115o == null) {
            this.f75115o = new com.google.android.exoplayer.extractor.flv.a(this.f75106f.track(8, 1));
        }
        if (z11 && this.f75116p == null) {
            this.f75116p = new com.google.android.exoplayer.extractor.flv.b(this.f75106f.track(9, 2));
        }
        this.f75106f.endTracks();
        this.f75110j = (this.f75102b.j() - 9) + 4;
        this.f75107g = 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(k4.h r9) throws java.lang.InterruptedException, java.io.IOException {
        /*
            r8 = this;
            long r0 = r8.f()
            int r2 = r8.f75111k
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            r6 = 1
            r7 = 8
            if (r2 != r7) goto L24
            com.google.android.exoplayer.extractor.flv.a r7 = r8.f75115o
            if (r7 == 0) goto L24
            r8.e()
            com.google.android.exoplayer.extractor.flv.a r2 = r8.f75115o
            a6.t r9 = r8.h(r9)
            boolean r5 = r2.a(r9, r0)
        L22:
            r9 = r6
            goto L69
        L24:
            r7 = 9
            if (r2 != r7) goto L3a
            com.google.android.exoplayer.extractor.flv.b r7 = r8.f75116p
            if (r7 == 0) goto L3a
            r8.e()
            com.google.android.exoplayer.extractor.flv.b r2 = r8.f75116p
            a6.t r9 = r8.h(r9)
            boolean r5 = r2.a(r9, r0)
            goto L22
        L3a:
            r7 = 18
            if (r2 != r7) goto L63
            boolean r2 = r8.f75114n
            if (r2 != 0) goto L63
            n4.c r2 = r8.f75105e
            a6.t r9 = r8.h(r9)
            boolean r5 = r2.a(r9, r0)
            n4.c r9 = r8.f75105e
            long r0 = r9.d()
            int r9 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r9 == 0) goto L22
            k4.i r9 = r8.f75106f
            k4.s$b r2 = new k4.s$b
            r2.<init>(r0)
            r9.c(r2)
            r8.f75114n = r6
            goto L22
        L63:
            int r0 = r8.f75112l
            r9.skipFully(r0)
            r9 = r5
        L69:
            boolean r0 = r8.f75108h
            if (r0 != 0) goto L83
            if (r5 == 0) goto L83
            r8.f75108h = r6
            n4.c r0 = r8.f75105e
            long r0 = r0.d()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L7f
            long r0 = r8.f75113m
            long r0 = -r0
            goto L81
        L7f:
            r0 = 0
        L81:
            r8.f75109i = r0
        L83:
            r0 = 4
            r8.f75110j = r0
            r0 = 2
            r8.f75107g = r0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.b.j(k4.h):boolean");
    }

    public final boolean k(h hVar) throws InterruptedException, IOException {
        if (!hVar.readFully(this.f75103c.f3620a, 0, 11, true)) {
            return false;
        }
        this.f75103c.L(0);
        this.f75111k = this.f75103c.y();
        this.f75112l = this.f75103c.B();
        this.f75113m = this.f75103c.B();
        this.f75113m = (((long) (this.f75103c.y() << 24)) | this.f75113m) * 1000;
        this.f75103c.M(3);
        this.f75107g = 4;
        return true;
    }

    public final void l(h hVar) throws InterruptedException, IOException {
        hVar.skipFully(this.f75110j);
        this.f75110j = 0;
        this.f75107g = 3;
    }

    @Override // k4.g
    public void release() {
    }

    @Override // k4.g
    public void seek(long j10, long j11) {
        this.f75107g = 1;
        this.f75108h = false;
        this.f75110j = 0;
    }
}
