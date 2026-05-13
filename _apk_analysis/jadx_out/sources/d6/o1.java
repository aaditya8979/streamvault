package d6;

import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.i;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: compiled from: PlaybackInfo.java */
/* JADX INFO: loaded from: classes8.dex */
public final class o1 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final i.b f59664s = new i.b(new Object());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.c0 f59665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i.b f59666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f59667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f59668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f59669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final ExoPlaybackException f59670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f59671g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e7.i0 f59672h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q7.b0 f59673i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<Metadata> f59674j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i.b f59675k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f59676l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f59677m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.google.android.exoplayer2.u f59678n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f59679o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile long f59680p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile long f59681q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile long f59682r;

    public o1(com.google.android.exoplayer2.c0 c0Var, i.b bVar, long j10, long j11, int i10, @Nullable ExoPlaybackException exoPlaybackException, boolean z10, e7.i0 i0Var, q7.b0 b0Var, List<Metadata> list, i.b bVar2, boolean z11, int i11, com.google.android.exoplayer2.u uVar, long j12, long j13, long j14, boolean z12) {
        this.f59665a = c0Var;
        this.f59666b = bVar;
        this.f59667c = j10;
        this.f59668d = j11;
        this.f59669e = i10;
        this.f59670f = exoPlaybackException;
        this.f59671g = z10;
        this.f59672h = i0Var;
        this.f59673i = b0Var;
        this.f59674j = list;
        this.f59675k = bVar2;
        this.f59676l = z11;
        this.f59677m = i11;
        this.f59678n = uVar;
        this.f59680p = j12;
        this.f59681q = j13;
        this.f59682r = j14;
        this.f59679o = z12;
    }

    public static o1 j(q7.b0 b0Var) {
        com.google.android.exoplayer2.c0 c0Var = com.google.android.exoplayer2.c0.f21384b;
        i.b bVar = f59664s;
        return new o1(c0Var, bVar, -9223372036854775807L, 0L, 1, null, false, e7.i0.f60875e, b0Var, ImmutableList.of(), bVar, false, 0, com.google.android.exoplayer2.u.f22484e, 0L, 0L, 0L, false);
    }

    public static i.b k() {
        return f59664s;
    }

    @CheckResult
    public o1 a(boolean z10) {
        return new o1(this.f59665a, this.f59666b, this.f59667c, this.f59668d, this.f59669e, this.f59670f, z10, this.f59672h, this.f59673i, this.f59674j, this.f59675k, this.f59676l, this.f59677m, this.f59678n, this.f59680p, this.f59681q, this.f59682r, this.f59679o);
    }

    @CheckResult
    public o1 b(i.b bVar) {
        return new o1(this.f59665a, this.f59666b, this.f59667c, this.f59668d, this.f59669e, this.f59670f, this.f59671g, this.f59672h, this.f59673i, this.f59674j, bVar, this.f59676l, this.f59677m, this.f59678n, this.f59680p, this.f59681q, this.f59682r, this.f59679o);
    }

    @CheckResult
    public o1 c(i.b bVar, long j10, long j11, long j12, long j13, e7.i0 i0Var, q7.b0 b0Var, List<Metadata> list) {
        return new o1(this.f59665a, bVar, j11, j12, this.f59669e, this.f59670f, this.f59671g, i0Var, b0Var, list, this.f59675k, this.f59676l, this.f59677m, this.f59678n, this.f59680p, j13, j10, this.f59679o);
    }

    @CheckResult
    public o1 d(boolean z10, int i10) {
        return new o1(this.f59665a, this.f59666b, this.f59667c, this.f59668d, this.f59669e, this.f59670f, this.f59671g, this.f59672h, this.f59673i, this.f59674j, this.f59675k, z10, i10, this.f59678n, this.f59680p, this.f59681q, this.f59682r, this.f59679o);
    }

    @CheckResult
    public o1 e(@Nullable ExoPlaybackException exoPlaybackException) {
        return new o1(this.f59665a, this.f59666b, this.f59667c, this.f59668d, this.f59669e, exoPlaybackException, this.f59671g, this.f59672h, this.f59673i, this.f59674j, this.f59675k, this.f59676l, this.f59677m, this.f59678n, this.f59680p, this.f59681q, this.f59682r, this.f59679o);
    }

    @CheckResult
    public o1 f(com.google.android.exoplayer2.u uVar) {
        return new o1(this.f59665a, this.f59666b, this.f59667c, this.f59668d, this.f59669e, this.f59670f, this.f59671g, this.f59672h, this.f59673i, this.f59674j, this.f59675k, this.f59676l, this.f59677m, uVar, this.f59680p, this.f59681q, this.f59682r, this.f59679o);
    }

    @CheckResult
    public o1 g(int i10) {
        return new o1(this.f59665a, this.f59666b, this.f59667c, this.f59668d, i10, this.f59670f, this.f59671g, this.f59672h, this.f59673i, this.f59674j, this.f59675k, this.f59676l, this.f59677m, this.f59678n, this.f59680p, this.f59681q, this.f59682r, this.f59679o);
    }

    @CheckResult
    public o1 h(boolean z10) {
        return new o1(this.f59665a, this.f59666b, this.f59667c, this.f59668d, this.f59669e, this.f59670f, this.f59671g, this.f59672h, this.f59673i, this.f59674j, this.f59675k, this.f59676l, this.f59677m, this.f59678n, this.f59680p, this.f59681q, this.f59682r, z10);
    }

    @CheckResult
    public o1 i(com.google.android.exoplayer2.c0 c0Var) {
        return new o1(c0Var, this.f59666b, this.f59667c, this.f59668d, this.f59669e, this.f59670f, this.f59671g, this.f59672h, this.f59673i, this.f59674j, this.f59675k, this.f59676l, this.f59677m, this.f59678n, this.f59680p, this.f59681q, this.f59682r, this.f59679o);
    }
}
