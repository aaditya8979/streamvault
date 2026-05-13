package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.q;
import com.fyber.inneractive.sdk.player.exoplayer2.r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.EOFException;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements i, q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f17432n = z.a("FLV");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f17437e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17440h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17441i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f17442j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f17443k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f17444l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f17445m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f17433a = new n(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f17434b = new n(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f17435c = new n(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f17436d = new n();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17438f = 1;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, o oVar) throws InterruptedException, r, EOFException {
        c cVar;
        f fVar;
        a aVar;
        while (true) {
            int i10 = this.f17438f;
            boolean z10 = true;
            if (i10 != 1) {
                if (i10 == 2) {
                    bVar.a(this.f17439g);
                    this.f17439g = 0;
                    this.f17438f = 3;
                } else if (i10 != 3) {
                    if (i10 == 4) {
                        int i11 = this.f17440h;
                        if (i11 == 8 && (aVar = this.f17443k) != null) {
                            n nVarB = b(bVar);
                            long j10 = this.f17442j;
                            aVar.a(nVarB);
                            aVar.a(nVarB, j10);
                        } else if (i11 == 9 && (fVar = this.f17444l) != null) {
                            n nVarB2 = b(bVar);
                            long j11 = this.f17442j;
                            if (fVar.a(nVarB2)) {
                                fVar.a(nVarB2, j11);
                            }
                        } else if (i11 != 18 || (cVar = this.f17445m) == null) {
                            bVar.a(this.f17441i);
                            z10 = false;
                        } else {
                            cVar.a(b(bVar), this.f17442j);
                        }
                        this.f17439g = 4;
                        this.f17438f = 2;
                        if (z10) {
                            return 0;
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (!bVar.b(this.f17435c.f18794a, 0, 11, true)) {
                        return -1;
                    }
                    this.f17435c.e(0);
                    this.f17440h = this.f17435c.j();
                    this.f17441i = this.f17435c.l();
                    this.f17442j = this.f17435c.l();
                    this.f17442j = (((long) (this.f17435c.j() << 24)) | this.f17442j) * 1000;
                    n nVar = this.f17435c;
                    nVar.e(nVar.f18795b + 3);
                    this.f17438f = 4;
                }
            } else {
                if (!bVar.b(this.f17434b.f18794a, 0, 9, true)) {
                    return -1;
                }
                this.f17434b.e(0);
                n nVar2 = this.f17434b;
                nVar2.e(nVar2.f18795b + 4);
                int iJ = this.f17434b.j();
                boolean z11 = (iJ & 4) != 0;
                boolean z12 = (iJ & 1) != 0;
                if (z11 && this.f17443k == null) {
                    this.f17443k = new a(this.f17437e.a(8, 1));
                }
                if (z12 && this.f17444l == null) {
                    this.f17444l = new f(this.f17437e.a(9, 2));
                }
                if (this.f17445m == null) {
                    this.f17445m = new c();
                }
                this.f17437e.b();
                this.f17437e.a(this);
                this.f17439g = this.f17434b.b() - 5;
                this.f17438f = 2;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        return 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        this.f17438f = 1;
        this.f17439g = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(j jVar) {
        this.f17437e = jVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, EOFException {
        bVar.a(this.f17433a.f18794a, 0, 3, false);
        this.f17433a.e(0);
        if (this.f17433a.l() != f17432n) {
            return false;
        }
        bVar.a(this.f17433a.f18794a, 0, 2, false);
        this.f17433a.e(0);
        if ((this.f17433a.o() & 250) != 0) {
            return false;
        }
        bVar.a(this.f17433a.f18794a, 0, 4, false);
        this.f17433a.e(0);
        int iB = this.f17433a.b();
        bVar.f17403e = 0;
        bVar.a(iB, false);
        bVar.a(this.f17433a.f18794a, 0, 4, false);
        this.f17433a.e(0);
        return this.f17433a.b() == 0;
    }

    public final n b(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, EOFException {
        if (this.f17441i > this.f17436d.a()) {
            n nVar = this.f17436d;
            nVar.f18794a = new byte[Math.max(nVar.a() * 2, this.f17441i)];
            nVar.f18796c = 0;
            nVar.f18795b = 0;
        } else {
            this.f17436d.e(0);
        }
        this.f17436d.d(this.f17441i);
        bVar.b(this.f17436d.f18794a, 0, this.f17441i, false);
        return this.f17436d;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.f17445m.f17446b;
    }
}
