package com.google.android.exoplayer.source.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer.source.hls.playlist.b;
import com.google.android.exoplayer.source.hls.playlist.c;
import com.google.android.exoplayer.upstream.Loader;
import com.google.android.exoplayer.upstream.g;
import e4.k;
import e5.b0;
import j5.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import y5.m;

/* JADX INFO: compiled from: DefaultHlsPlaylistTracker.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements HlsPlaylistTracker, Loader.b<g<k5.d>> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final HlsPlaylistTracker.a f20545r = new HlsPlaylistTracker.a() { // from class: k5.b
        @Override // com.google.android.exoplayer.source.hls.playlist.HlsPlaylistTracker.a
        public final HlsPlaylistTracker a(j5.e eVar, m mVar, e eVar2) {
            return new com.google.android.exoplayer.source.hls.playlist.a(eVar, mVar, eVar2);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f20546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k5.e f20547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f20548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap<Uri, RunnableC0290a> f20549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<HlsPlaylistTracker.b> f20550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f20551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public g.a<k5.d> f20552h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public b0.a f20553i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Loader f20554j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Handler f20555k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public HlsPlaylistTracker.c f20556l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public b f20557m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public Uri f20558n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public c f20559o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f20560p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f20561q;

    /* JADX INFO: renamed from: com.google.android.exoplayer.source.hls.playlist.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DefaultHlsPlaylistTracker.java */
    public final class RunnableC0290a implements Loader.b<g<k5.d>>, Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f20562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Loader f20563c = new Loader("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final g<k5.d> f20564d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public c f20565e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f20566f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f20567g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f20568h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f20569i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f20570j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public IOException f20571k;

        public RunnableC0290a(Uri uri) {
            this.f20562b = uri;
            this.f20564d = new g<>(a.this.f20546b.createDataSource(4), uri, 4, a.this.f20552h);
        }

        public final boolean d(long j10) {
            this.f20569i = SystemClock.elapsedRealtime() + j10;
            return this.f20562b.equals(a.this.f20558n) && !a.this.y();
        }

        @Nullable
        public c f() {
            return this.f20565e;
        }

        public boolean h() {
            int i10;
            if (this.f20565e == null) {
                return false;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jMax = Math.max(30000L, k.b(this.f20565e.f20606p));
            c cVar = this.f20565e;
            return cVar.f20602l || (i10 = cVar.f20594d) == 2 || i10 == 1 || this.f20566f + jMax > jElapsedRealtime;
        }

        public void i() {
            this.f20569i = 0L;
            if (this.f20570j || this.f20563c.i() || this.f20563c.h()) {
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime >= this.f20568h) {
                k();
            } else {
                this.f20570j = true;
                a.this.f20555k.postDelayed(this, this.f20568h - jElapsedRealtime);
            }
        }

        public final void k() {
            long jM = this.f20563c.m(this.f20564d, this, a.this.f20548d.getMinimumLoadableRetryCount(this.f20564d.f21151b));
            b0.a aVar = a.this.f20553i;
            g<k5.d> gVar = this.f20564d;
            aVar.H(gVar.f21150a, gVar.f21151b, jM);
        }

        public void m() throws IOException {
            this.f20563c.maybeThrowError();
            IOException iOException = this.f20571k;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // com.google.android.exoplayer.upstream.Loader.b
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void l(g<k5.d> gVar, long j10, long j11, boolean z10) {
            a.this.f20553i.y(gVar.f21150a, gVar.d(), gVar.b(), 4, j10, j11, gVar.a());
        }

        @Override // com.google.android.exoplayer.upstream.Loader.b
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void j(g<k5.d> gVar, long j10, long j11) {
            k5.d dVarC = gVar.c();
            if (!(dVarC instanceof c)) {
                this.f20571k = new ParserException("Loaded playlist has unexpected type.");
            } else {
                r((c) dVarC, j11);
                a.this.f20553i.B(gVar.f21150a, gVar.d(), gVar.b(), 4, j10, j11, gVar.a());
            }
        }

        @Override // com.google.android.exoplayer.upstream.Loader.b
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Loader.c g(g<k5.d> gVar, long j10, long j11, IOException iOException, int i10) {
            Loader.c cVarG;
            long jA = a.this.f20548d.a(gVar.f21151b, j11, iOException, i10);
            boolean z10 = jA != -9223372036854775807L;
            boolean zD = a.this.A(this.f20562b, jA) || !z10;
            if (z10) {
                zD |= d(jA);
            }
            if (zD) {
                long jB = a.this.f20548d.b(gVar.f21151b, j11, iOException, i10);
                cVarG = jB != -9223372036854775807L ? Loader.g(false, jB) : Loader.f21019g;
            } else {
                cVarG = Loader.f21018f;
            }
            a.this.f20553i.E(gVar.f21150a, gVar.d(), gVar.b(), 4, j10, j11, gVar.a(), iOException, !cVarG.c());
            return cVarG;
        }

        public final void r(c cVar, long j10) {
            c cVar2 = this.f20565e;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f20566f = jElapsedRealtime;
            c cVarU = a.this.u(cVar2, cVar);
            this.f20565e = cVarU;
            if (cVarU != cVar2) {
                this.f20571k = null;
                this.f20567g = jElapsedRealtime;
                a.this.E(this.f20562b, cVarU);
            } else if (!cVarU.f20602l) {
                if (cVar.f20599i + ((long) cVar.f20605o.size()) < this.f20565e.f20599i) {
                    this.f20571k = new HlsPlaylistTracker.PlaylistResetException(this.f20562b);
                    a.this.A(this.f20562b, -9223372036854775807L);
                } else if (jElapsedRealtime - this.f20567g > k.b(r13.f20601k) * a.this.f20551g) {
                    this.f20571k = new HlsPlaylistTracker.PlaylistStuckException(this.f20562b);
                    long jA = a.this.f20548d.a(4, j10, this.f20571k, 1);
                    a.this.A(this.f20562b, jA);
                    if (jA != -9223372036854775807L) {
                        d(jA);
                    }
                }
            }
            c cVar3 = this.f20565e;
            this.f20568h = jElapsedRealtime + k.b(cVar3 != cVar2 ? cVar3.f20601k : cVar3.f20601k / 2);
            if (!this.f20562b.equals(a.this.f20558n) || this.f20565e.f20602l) {
                return;
            }
            i();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f20570j = false;
            k();
        }

        public void s() {
            this.f20563c.k();
        }
    }

    public a(e eVar, m mVar, k5.e eVar2) {
        this(eVar, mVar, eVar2, 3.5d);
    }

    public a(e eVar, m mVar, k5.e eVar2, double d10) {
        this.f20546b = eVar;
        this.f20547c = eVar2;
        this.f20548d = mVar;
        this.f20551g = d10;
        this.f20550f = new ArrayList();
        this.f20549e = new HashMap<>();
        this.f20561q = -9223372036854775807L;
    }

    public static c.a t(c cVar, c cVar2) {
        int i10 = (int) (cVar2.f20599i - cVar.f20599i);
        List<c.a> list = cVar.f20605o;
        if (i10 < list.size()) {
            return list.get(i10);
        }
        return null;
    }

    public final boolean A(Uri uri, long j10) {
        int size = this.f20550f.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            z10 |= !this.f20550f.get(i10).b(uri, j10);
        }
        return z10;
    }

    @Override // com.google.android.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void l(g<k5.d> gVar, long j10, long j11, boolean z10) {
        this.f20553i.y(gVar.f21150a, gVar.d(), gVar.b(), 4, j10, j11, gVar.a());
    }

    @Override // com.google.android.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void j(g<k5.d> gVar, long j10, long j11) {
        k5.d dVarC = gVar.c();
        boolean z10 = dVarC instanceof c;
        b bVarD = z10 ? b.d(dVarC.f72958a) : (b) dVarC;
        this.f20557m = bVarD;
        this.f20552h = this.f20547c.a(bVarD);
        this.f20558n = bVarD.f20575e.get(0).f20588a;
        s(bVarD.f20574d);
        RunnableC0290a runnableC0290a = this.f20549e.get(this.f20558n);
        if (z10) {
            runnableC0290a.r((c) dVarC, j11);
        } else {
            runnableC0290a.i();
        }
        this.f20553i.B(gVar.f21150a, gVar.d(), gVar.b(), 4, j10, j11, gVar.a());
    }

    @Override // com.google.android.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public Loader.c g(g<k5.d> gVar, long j10, long j11, IOException iOException, int i10) {
        long jB = this.f20548d.b(gVar.f21151b, j11, iOException, i10);
        boolean z10 = jB == -9223372036854775807L;
        this.f20553i.E(gVar.f21150a, gVar.d(), gVar.b(), 4, j10, j11, gVar.a(), iOException, z10);
        return z10 ? Loader.f21019g : Loader.g(false, jB);
    }

    public final void E(Uri uri, c cVar) {
        if (uri.equals(this.f20558n)) {
            if (this.f20559o == null) {
                this.f20560p = !cVar.f20602l;
                this.f20561q = cVar.f20596f;
            }
            this.f20559o = cVar;
            this.f20556l.i(cVar);
        }
        int size = this.f20550f.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f20550f.get(i10).onPlaylistChanged();
        }
    }

    @Override // com.google.android.exoplayer.source.hls.playlist.HlsPlaylistTracker
    public void a(Uri uri, b0.a aVar, HlsPlaylistTracker.c cVar) {
        this.f20555k = new Handler();
        this.f20553i = aVar;
        this.f20556l = cVar;
        g gVar = new g(this.f20546b.createDataSource(4), uri, 4, this.f20547c.createPlaylistParser());
        a6.a.f(this.f20554j == null);
        Loader loader = new Loader("DefaultHlsPlaylistTracker:MasterPlaylist");
        this.f20554j = loader;
        aVar.H(gVar.f21150a, gVar.f21151b, loader.m(gVar, this, this.f20548d.getMinimumLoadableRetryCount(gVar.f21151b)));
    }

    @Override // com.google.android.exoplayer.source.hls.playlist.HlsPlaylistTracker
    @Nullable
    public b b() {
        return this.f20557m;
    }

    @Override // com.google.android.exoplayer.source.hls.playlist.HlsPlaylistTracker
    public void c(HlsPlaylistTracker.b bVar) {
        this.f20550f.add(bVar);
    }

    @Override // com.google.android.exoplayer.source.hls.playlist.HlsPlaylistTracker
    public void d(HlsPlaylistTracker.b bVar) {
        this.f20550f.remove(bVar);
    }

    @Override // com.google.android.exoplayer.source.hls.playlist.HlsPlaylistTracker
    public long getInitialStartTimeUs() {
        return this.f20561q;
    }

    @Override // com.google.android.exoplayer.source.hls.playlist.HlsPlaylistTracker
    @Nullable
    public c getPlaylistSnapshot(Uri uri, boolean z10) {
        c cVarF = this.f20549e.get(uri).f();
        if (cVarF != null && z10) {
            z(uri);
        }
        return cVarF;
    }

    @Override // com.google.android.exoplayer.source.hls.playlist.HlsPlaylistTracker
    public boolean isLive() {
        return this.f20560p;
    }

    @Override // com.google.android.exoplayer.source.hls.playlist.HlsPlaylistTracker
    public boolean isSnapshotValid(Uri uri) {
        return this.f20549e.get(uri).h();
    }

    @Override // com.google.android.exoplayer.source.hls.playlist.HlsPlaylistTracker
    public void maybeThrowPlaylistRefreshError(Uri uri) throws IOException {
        this.f20549e.get(uri).m();
    }

    @Override // com.google.android.exoplayer.source.hls.playlist.HlsPlaylistTracker
    public void maybeThrowPrimaryPlaylistRefreshError() throws IOException {
        Loader loader = this.f20554j;
        if (loader != null) {
            loader.maybeThrowError();
        }
        Uri uri = this.f20558n;
        if (uri != null) {
            maybeThrowPlaylistRefreshError(uri);
        }
    }

    @Override // com.google.android.exoplayer.source.hls.playlist.HlsPlaylistTracker
    public void refreshPlaylist(Uri uri) {
        this.f20549e.get(uri).i();
    }

    public final void s(List<Uri> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = list.get(i10);
            this.f20549e.put(uri, new RunnableC0290a(uri));
        }
    }

    @Override // com.google.android.exoplayer.source.hls.playlist.HlsPlaylistTracker
    public void stop() {
        this.f20558n = null;
        this.f20559o = null;
        this.f20557m = null;
        this.f20561q = -9223372036854775807L;
        this.f20554j.k();
        this.f20554j = null;
        Iterator<RunnableC0290a> it = this.f20549e.values().iterator();
        while (it.hasNext()) {
            it.next().s();
        }
        this.f20555k.removeCallbacksAndMessages(null);
        this.f20555k = null;
        this.f20549e.clear();
    }

    public final c u(c cVar, c cVar2) {
        return !cVar2.e(cVar) ? cVar2.f20602l ? cVar.c() : cVar : cVar2.b(w(cVar, cVar2), v(cVar, cVar2));
    }

    public final int v(c cVar, c cVar2) {
        c.a aVarT;
        if (cVar2.f20597g) {
            return cVar2.f20598h;
        }
        c cVar3 = this.f20559o;
        int i10 = cVar3 != null ? cVar3.f20598h : 0;
        return (cVar == null || (aVarT = t(cVar, cVar2)) == null) ? i10 : (cVar.f20598h + aVarT.f20611f) - cVar2.f20605o.get(0).f20611f;
    }

    public final long w(c cVar, c cVar2) {
        if (cVar2.f20603m) {
            return cVar2.f20596f;
        }
        c cVar3 = this.f20559o;
        long j10 = cVar3 != null ? cVar3.f20596f : 0L;
        if (cVar == null) {
            return j10;
        }
        int size = cVar.f20605o.size();
        c.a aVarT = t(cVar, cVar2);
        return aVarT != null ? cVar.f20596f + aVarT.f20612g : ((long) size) == cVar2.f20599i - cVar.f20599i ? cVar.d() : j10;
    }

    public final boolean x(Uri uri) {
        List<b.C0291b> list = this.f20557m.f20575e;
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (uri.equals(list.get(i10).f20588a)) {
                return true;
            }
        }
        return false;
    }

    public final boolean y() {
        List<b.C0291b> list = this.f20557m.f20575e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            RunnableC0290a runnableC0290a = this.f20549e.get(list.get(i10).f20588a);
            if (jElapsedRealtime > runnableC0290a.f20569i) {
                this.f20558n = runnableC0290a.f20562b;
                runnableC0290a.i();
                return true;
            }
        }
        return false;
    }

    public final void z(Uri uri) {
        if (uri.equals(this.f20558n) || !x(uri)) {
            return;
        }
        c cVar = this.f20559o;
        if (cVar == null || !cVar.f20602l) {
            this.f20558n = uri;
            this.f20549e.get(uri).i();
        }
    }
}
