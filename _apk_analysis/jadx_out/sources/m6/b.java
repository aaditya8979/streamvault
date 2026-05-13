package m6;

import i6.k;
import i6.l;
import i6.m;
import i6.p;
import i6.y;
import i6.z;
import java.io.IOException;
import s7.a0;

/* JADX INFO: compiled from: FlvExtractor.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements k {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final p f73983q = new p() { // from class: m6.a
        @Override // i6.p
        public final k[] createExtractors() {
            return b.g();
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m f73989f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f73991h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f73992i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f73993j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f73994k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f73995l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f73996m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f73997n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.google.android.exoplayer2.extractor.flv.a f73998o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.google.android.exoplayer2.extractor.flv.b f73999p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f73984a = new a0(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f73985b = new a0(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f73986c = new a0(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a0 f73987d = new a0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f73988e = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f73990g = 1;

    public static /* synthetic */ k[] g() {
        return new k[]{new b()};
    }

    @Override // i6.k
    public void a(m mVar) {
        this.f73989f = mVar;
    }

    @Override // i6.k
    public int b(l lVar, y yVar) throws IOException {
        s7.a.i(this.f73989f);
        while (true) {
            int i10 = this.f73990g;
            if (i10 != 1) {
                if (i10 == 2) {
                    l(lVar);
                } else if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    if (j(lVar)) {
                        return 0;
                    }
                } else if (!k(lVar)) {
                    return -1;
                }
            } else if (!i(lVar)) {
                return -1;
            }
        }
    }

    @Override // i6.k
    public boolean c(l lVar) throws IOException {
        lVar.peekFully(this.f73984a.d(), 0, 3);
        this.f73984a.P(0);
        if (this.f73984a.G() != 4607062) {
            return false;
        }
        lVar.peekFully(this.f73984a.d(), 0, 2);
        this.f73984a.P(0);
        if ((this.f73984a.J() & 250) != 0) {
            return false;
        }
        lVar.peekFully(this.f73984a.d(), 0, 4);
        this.f73984a.P(0);
        int iN = this.f73984a.n();
        lVar.resetPeekPosition();
        lVar.advancePeekPosition(iN);
        lVar.peekFully(this.f73984a.d(), 0, 4);
        this.f73984a.P(0);
        return this.f73984a.n() == 0;
    }

    public final void e() {
        if (this.f73997n) {
            return;
        }
        this.f73989f.h(new z.b(-9223372036854775807L));
        this.f73997n = true;
    }

    public final long f() {
        if (this.f73991h) {
            return this.f73992i + this.f73996m;
        }
        if (this.f73988e.d() == -9223372036854775807L) {
            return 0L;
        }
        return this.f73996m;
    }

    public final a0 h(l lVar) throws IOException {
        if (this.f73995l > this.f73987d.b()) {
            a0 a0Var = this.f73987d;
            a0Var.N(new byte[Math.max(a0Var.b() * 2, this.f73995l)], 0);
        } else {
            this.f73987d.P(0);
        }
        this.f73987d.O(this.f73995l);
        lVar.readFully(this.f73987d.d(), 0, this.f73995l);
        return this.f73987d;
    }

    public final boolean i(l lVar) throws IOException {
        if (!lVar.readFully(this.f73985b.d(), 0, 9, true)) {
            return false;
        }
        this.f73985b.P(0);
        this.f73985b.Q(4);
        int iD = this.f73985b.D();
        boolean z10 = (iD & 4) != 0;
        boolean z11 = (iD & 1) != 0;
        if (z10 && this.f73998o == null) {
            this.f73998o = new com.google.android.exoplayer2.extractor.flv.a(this.f73989f.track(8, 1));
        }
        if (z11 && this.f73999p == null) {
            this.f73999p = new com.google.android.exoplayer2.extractor.flv.b(this.f73989f.track(9, 2));
        }
        this.f73989f.endTracks();
        this.f73993j = (this.f73985b.n() - 9) + 4;
        this.f73990g = 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(i6.l r10) throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r9.f()
            int r2 = r9.f73994k
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            r6 = 1
            r7 = 8
            if (r2 != r7) goto L24
            com.google.android.exoplayer2.extractor.flv.a r7 = r9.f73998o
            if (r7 == 0) goto L24
            r9.e()
            com.google.android.exoplayer2.extractor.flv.a r2 = r9.f73998o
            s7.a0 r10 = r9.h(r10)
            boolean r5 = r2.a(r10, r0)
        L22:
            r10 = r6
            goto L75
        L24:
            r7 = 9
            if (r2 != r7) goto L3a
            com.google.android.exoplayer2.extractor.flv.b r7 = r9.f73999p
            if (r7 == 0) goto L3a
            r9.e()
            com.google.android.exoplayer2.extractor.flv.b r2 = r9.f73999p
            s7.a0 r10 = r9.h(r10)
            boolean r5 = r2.a(r10, r0)
            goto L22
        L3a:
            r7 = 18
            if (r2 != r7) goto L6f
            boolean r2 = r9.f73997n
            if (r2 != 0) goto L6f
            m6.c r2 = r9.f73988e
            s7.a0 r10 = r9.h(r10)
            boolean r5 = r2.a(r10, r0)
            m6.c r10 = r9.f73988e
            long r0 = r10.d()
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 == 0) goto L22
            i6.m r10 = r9.f73989f
            i6.x r2 = new i6.x
            m6.c r7 = r9.f73988e
            long[] r7 = r7.e()
            m6.c r8 = r9.f73988e
            long[] r8 = r8.f()
            r2.<init>(r7, r8, r0)
            r10.h(r2)
            r9.f73997n = r6
            goto L22
        L6f:
            int r0 = r9.f73995l
            r10.skipFully(r0)
            r10 = r5
        L75:
            boolean r0 = r9.f73991h
            if (r0 != 0) goto L8f
            if (r5 == 0) goto L8f
            r9.f73991h = r6
            m6.c r0 = r9.f73988e
            long r0 = r0.d()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L8b
            long r0 = r9.f73996m
            long r0 = -r0
            goto L8d
        L8b:
            r0 = 0
        L8d:
            r9.f73992i = r0
        L8f:
            r0 = 4
            r9.f73993j = r0
            r0 = 2
            r9.f73990g = r0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.b.j(i6.l):boolean");
    }

    public final boolean k(l lVar) throws IOException {
        if (!lVar.readFully(this.f73986c.d(), 0, 11, true)) {
            return false;
        }
        this.f73986c.P(0);
        this.f73994k = this.f73986c.D();
        this.f73995l = this.f73986c.G();
        this.f73996m = this.f73986c.G();
        this.f73996m = (((long) (this.f73986c.D() << 24)) | this.f73996m) * 1000;
        this.f73986c.Q(3);
        this.f73990g = 4;
        return true;
    }

    public final void l(l lVar) throws IOException {
        lVar.skipFully(this.f73993j);
        this.f73993j = 0;
        this.f73990g = 3;
    }

    @Override // i6.k
    public void release() {
    }

    @Override // i6.k
    public void seek(long j10, long j11) {
        if (j10 == 0) {
            this.f73990g = 1;
            this.f73991h = false;
        } else {
            this.f73990g = 3;
        }
        this.f73993j = 0;
    }
}
