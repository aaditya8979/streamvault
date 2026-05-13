package e4;

import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.ExoPlaybackException;
import com.google.android.exoplayer.source.TrackGroupArray;
import e4.v0;
import e5.r;

/* JADX INFO: compiled from: PlaybackInfo.java */
/* JADX INFO: loaded from: classes11.dex */
public final class k0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final r.a f60172n = new r.a(new Object());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f60173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r.a f60174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f60175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f60176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f60177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final ExoPlaybackException f60178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f60179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TrackGroupArray f60180h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w5.e f60181i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r.a f60182j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile long f60183k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile long f60184l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile long f60185m;

    public k0(v0 v0Var, r.a aVar, long j10, long j11, int i10, @Nullable ExoPlaybackException exoPlaybackException, boolean z10, TrackGroupArray trackGroupArray, w5.e eVar, r.a aVar2, long j12, long j13, long j14) {
        this.f60173a = v0Var;
        this.f60174b = aVar;
        this.f60175c = j10;
        this.f60176d = j11;
        this.f60177e = i10;
        this.f60178f = exoPlaybackException;
        this.f60179g = z10;
        this.f60180h = trackGroupArray;
        this.f60181i = eVar;
        this.f60182j = aVar2;
        this.f60183k = j12;
        this.f60184l = j13;
        this.f60185m = j14;
    }

    public static k0 h(long j10, w5.e eVar) {
        v0 v0Var = v0.f60303a;
        r.a aVar = f60172n;
        return new k0(v0Var, aVar, j10, -9223372036854775807L, 1, null, false, TrackGroupArray.f20391e, eVar, aVar, j10, 0L, j10);
    }

    @CheckResult
    public k0 a(boolean z10) {
        return new k0(this.f60173a, this.f60174b, this.f60175c, this.f60176d, this.f60177e, this.f60178f, z10, this.f60180h, this.f60181i, this.f60182j, this.f60183k, this.f60184l, this.f60185m);
    }

    @CheckResult
    public k0 b(r.a aVar) {
        return new k0(this.f60173a, this.f60174b, this.f60175c, this.f60176d, this.f60177e, this.f60178f, this.f60179g, this.f60180h, this.f60181i, aVar, this.f60183k, this.f60184l, this.f60185m);
    }

    @CheckResult
    public k0 c(r.a aVar, long j10, long j11, long j12) {
        return new k0(this.f60173a, aVar, j10, aVar.b() ? j11 : -9223372036854775807L, this.f60177e, this.f60178f, this.f60179g, this.f60180h, this.f60181i, this.f60182j, this.f60183k, j12, j10);
    }

    @CheckResult
    public k0 d(@Nullable ExoPlaybackException exoPlaybackException) {
        return new k0(this.f60173a, this.f60174b, this.f60175c, this.f60176d, this.f60177e, exoPlaybackException, this.f60179g, this.f60180h, this.f60181i, this.f60182j, this.f60183k, this.f60184l, this.f60185m);
    }

    @CheckResult
    public k0 e(int i10) {
        return new k0(this.f60173a, this.f60174b, this.f60175c, this.f60176d, i10, this.f60178f, this.f60179g, this.f60180h, this.f60181i, this.f60182j, this.f60183k, this.f60184l, this.f60185m);
    }

    @CheckResult
    public k0 f(v0 v0Var) {
        return new k0(v0Var, this.f60174b, this.f60175c, this.f60176d, this.f60177e, this.f60178f, this.f60179g, this.f60180h, this.f60181i, this.f60182j, this.f60183k, this.f60184l, this.f60185m);
    }

    @CheckResult
    public k0 g(TrackGroupArray trackGroupArray, w5.e eVar) {
        return new k0(this.f60173a, this.f60174b, this.f60175c, this.f60176d, this.f60177e, this.f60178f, this.f60179g, trackGroupArray, eVar, this.f60182j, this.f60183k, this.f60184l, this.f60185m);
    }

    public r.a i(boolean z10, v0.c cVar, v0.b bVar) {
        if (this.f60173a.q()) {
            return f60172n;
        }
        int iA = this.f60173a.a(z10);
        int i10 = this.f60173a.n(iA, cVar).f60319i;
        int iB = this.f60173a.b(this.f60174b.f60579a);
        long j10 = -1;
        if (iB != -1 && iA == this.f60173a.f(iB, bVar).f60306c) {
            j10 = this.f60174b.f60582d;
        }
        return new r.a(this.f60173a.m(i10), j10);
    }
}
