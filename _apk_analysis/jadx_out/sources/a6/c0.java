package a6;

/* JADX INFO: compiled from: StandaloneMediaClock.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c0 implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f3525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f3527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f3528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e4.l0 f3529f = e4.l0.f60186e;

    public c0(c cVar) {
        this.f3525b = cVar;
    }

    public void a(long j10) {
        this.f3527d = j10;
        if (this.f3526c) {
            this.f3528e = this.f3525b.elapsedRealtime();
        }
    }

    @Override // a6.o
    public void b(e4.l0 l0Var) {
        if (this.f3526c) {
            a(getPositionUs());
        }
        this.f3529f = l0Var;
    }

    public void c() {
        if (this.f3526c) {
            return;
        }
        this.f3528e = this.f3525b.elapsedRealtime();
        this.f3526c = true;
    }

    public void d() {
        if (this.f3526c) {
            a(getPositionUs());
            this.f3526c = false;
        }
    }

    @Override // a6.o
    public e4.l0 getPlaybackParameters() {
        return this.f3529f;
    }

    @Override // a6.o
    public long getPositionUs() {
        long j10 = this.f3527d;
        if (!this.f3526c) {
            return j10;
        }
        long jElapsedRealtime = this.f3525b.elapsedRealtime() - this.f3528e;
        e4.l0 l0Var = this.f3529f;
        return j10 + (l0Var.f60187a == 1.0f ? e4.k.a(jElapsedRealtime) : l0Var.a(jElapsedRealtime));
    }
}
