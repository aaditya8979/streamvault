package t4;

import com.google.android.exoplayer.Format;
import t4.h0;

/* JADX INFO: compiled from: MpegAudioReader.java */
/* JADX INFO: loaded from: classes4.dex */
public final class s implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a6.t f84920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k4.q f84921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f84923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k4.u f84924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f84925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f84926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f84927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f84928i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f84929j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f84930k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f84931l;

    public s() {
        this(null);
    }

    public s(String str) {
        this.f84925f = 0;
        a6.t tVar = new a6.t(4);
        this.f84920a = tVar;
        tVar.f3620a[0] = -1;
        this.f84921b = new k4.q();
        this.f84922c = str;
    }

    @Override // t4.m
    public void a(a6.t tVar) {
        while (tVar.a() > 0) {
            int i10 = this.f84925f;
            if (i10 == 0) {
                c(tVar);
            } else if (i10 == 1) {
                e(tVar);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                d(tVar);
            }
        }
    }

    @Override // t4.m
    public void b(k4.i iVar, h0.d dVar) {
        dVar.a();
        this.f84923d = dVar.b();
        this.f84924e = iVar.track(dVar.c(), 1);
    }

    public final void c(a6.t tVar) {
        byte[] bArr = tVar.f3620a;
        int iD = tVar.d();
        for (int iC = tVar.c(); iC < iD; iC++) {
            byte b10 = bArr[iC];
            boolean z10 = (b10 & 255) == 255;
            boolean z11 = this.f84928i && (b10 & 224) == 224;
            this.f84928i = z10;
            if (z11) {
                tVar.L(iC + 1);
                this.f84928i = false;
                this.f84920a.f3620a[1] = bArr[iC];
                this.f84926g = 2;
                this.f84925f = 1;
                return;
            }
        }
        tVar.L(iD);
    }

    public final void d(a6.t tVar) {
        int iMin = Math.min(tVar.a(), this.f84930k - this.f84926g);
        this.f84924e.a(tVar, iMin);
        int i10 = this.f84926g + iMin;
        this.f84926g = i10;
        int i11 = this.f84930k;
        if (i10 < i11) {
            return;
        }
        this.f84924e.c(this.f84931l, 1, i11, 0, null);
        this.f84931l += this.f84929j;
        this.f84926g = 0;
        this.f84925f = 0;
    }

    public final void e(a6.t tVar) {
        int iMin = Math.min(tVar.a(), 4 - this.f84926g);
        tVar.h(this.f84920a.f3620a, this.f84926g, iMin);
        int i10 = this.f84926g + iMin;
        this.f84926g = i10;
        if (i10 < 4) {
            return;
        }
        this.f84920a.L(0);
        if (!k4.q.e(this.f84920a.j(), this.f84921b)) {
            this.f84926g = 0;
            this.f84925f = 1;
            return;
        }
        k4.q qVar = this.f84921b;
        this.f84930k = qVar.f72913c;
        if (!this.f84927h) {
            long j10 = ((long) qVar.f72917g) * 1000000;
            int i11 = qVar.f72914d;
            this.f84929j = j10 / ((long) i11);
            this.f84924e.d(Format.q(this.f84923d, qVar.f72912b, null, -1, 4096, qVar.f72915e, i11, null, null, 0, this.f84922c));
            this.f84927h = true;
        }
        this.f84920a.L(0);
        this.f84924e.a(this.f84920a, 4);
        this.f84925f = 2;
    }

    @Override // t4.m
    public void packetFinished() {
    }

    @Override // t4.m
    public void packetStarted(long j10, int i10) {
        this.f84931l = j10;
    }

    @Override // t4.m
    public void seek() {
        this.f84925f = 0;
        this.f84926g = 0;
        this.f84928i = false;
    }
}
