package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f18010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f18011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j f18012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f18013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f18014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f18015f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f18016g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18017h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18018i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j f18019j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f18020k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f18021l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f18022m;

    public abstract long a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar);

    public void a(long j10) {
        this.f18016g = j10;
    }

    public void a(boolean z10) {
        if (z10) {
            this.f18019j = new j();
            this.f18015f = 0L;
            this.f18017h = 0;
        } else {
            this.f18017h = 1;
        }
        this.f18014e = -1L;
        this.f18016g = 0L;
    }

    public abstract boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, long j10, j jVar);
}
