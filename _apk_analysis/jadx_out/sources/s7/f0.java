package s7;

/* JADX INFO: compiled from: StandaloneMediaClock.java */
/* JADX INFO: loaded from: classes11.dex */
public final class f0 implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f79460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f79461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f79462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f79463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.google.android.exoplayer2.u f79464f = com.google.android.exoplayer2.u.f22484e;

    public f0(d dVar) {
        this.f79460b = dVar;
    }

    public void a(long j10) {
        this.f79462d = j10;
        if (this.f79461c) {
            this.f79463e = this.f79460b.elapsedRealtime();
        }
    }

    @Override // s7.s
    public void b(com.google.android.exoplayer2.u uVar) {
        if (this.f79461c) {
            a(getPositionUs());
        }
        this.f79464f = uVar;
    }

    public void c() {
        if (this.f79461c) {
            return;
        }
        this.f79463e = this.f79460b.elapsedRealtime();
        this.f79461c = true;
    }

    public void d() {
        if (this.f79461c) {
            a(getPositionUs());
            this.f79461c = false;
        }
    }

    @Override // s7.s
    public com.google.android.exoplayer2.u getPlaybackParameters() {
        return this.f79464f;
    }

    @Override // s7.s
    public long getPositionUs() {
        long j10 = this.f79462d;
        if (!this.f79461c) {
            return j10;
        }
        long jElapsedRealtime = this.f79460b.elapsedRealtime() - this.f79463e;
        com.google.android.exoplayer2.u uVar = this.f79464f;
        return j10 + (uVar.f22486b == 1.0f ? m0.w0(jElapsedRealtime) : uVar.b(jElapsedRealtime));
    }
}
