package com.google.android.exoplayer.source.hls;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.offline.StreamKey;
import com.google.android.exoplayer.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer.source.hls.playlist.c;
import com.google.android.exoplayer.upstream.a;
import e4.e0;
import e4.k;
import e5.b;
import e5.g;
import e5.j;
import e5.l0;
import e5.r;
import j5.e;
import j5.f;
import j5.i;
import java.io.IOException;
import java.util.List;
import k5.c;
import y5.m;
import y5.q;

/* JADX INFO: loaded from: classes7.dex */
public final class HlsMediaSource extends b implements HlsPlaylistTracker.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f20512g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Uri f20513h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e f20514i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g f20515j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.google.android.exoplayer.drm.a<?> f20516k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m f20517l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f20518m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f20519n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f20520o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final HlsPlaylistTracker f20521p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public final Object f20522q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public q f20523r;

    public static final class Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f20524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public f f20525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public k5.e f20526c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public List<StreamKey> f20527d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public HlsPlaylistTracker.a f20528e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public g f20529f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public com.google.android.exoplayer.drm.a<?> f20530g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public m f20531h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f20532i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f20533j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f20534k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f20535l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @Nullable
        public Object f20536m;

        public Factory(a.InterfaceC0296a interfaceC0296a) {
            this(new j5.b(interfaceC0296a));
        }

        public Factory(e eVar) {
            this.f20524a = (e) a6.a.e(eVar);
            this.f20526c = new k5.a();
            this.f20528e = com.google.android.exoplayer.source.hls.playlist.a.f20545r;
            this.f20525b = f.f72222a;
            this.f20530g = com.google.android.exoplayer.drm.a.a();
            this.f20531h = new com.google.android.exoplayer.upstream.f();
            this.f20529f = new j();
            this.f20533j = 1;
        }

        public HlsMediaSource a(Uri uri) {
            this.f20535l = true;
            List<StreamKey> list = this.f20527d;
            if (list != null) {
                this.f20526c = new c(this.f20526c, list);
            }
            e eVar = this.f20524a;
            f fVar = this.f20525b;
            g gVar = this.f20529f;
            com.google.android.exoplayer.drm.a<?> aVar = this.f20530g;
            m mVar = this.f20531h;
            return new HlsMediaSource(uri, eVar, fVar, gVar, aVar, mVar, this.f20528e.a(eVar, mVar, this.f20526c), this.f20532i, this.f20533j, this.f20534k, this.f20536m);
        }

        public Factory b(boolean z10) {
            a6.a.f(!this.f20535l);
            this.f20532i = z10;
            return this;
        }

        public Factory c(f fVar) {
            a6.a.f(!this.f20535l);
            this.f20525b = (f) a6.a.e(fVar);
            return this;
        }

        @Deprecated
        public Factory d(int i10) {
            a6.a.f(!this.f20535l);
            this.f20531h = new com.google.android.exoplayer.upstream.f(i10);
            return this;
        }
    }

    static {
        e0.a("goog.exo.hls");
    }

    public HlsMediaSource(Uri uri, e eVar, f fVar, g gVar, com.google.android.exoplayer.drm.a<?> aVar, m mVar, HlsPlaylistTracker hlsPlaylistTracker, boolean z10, int i10, boolean z11, @Nullable Object obj) {
        this.f20513h = uri;
        this.f20514i = eVar;
        this.f20512g = fVar;
        this.f20515j = gVar;
        this.f20516k = aVar;
        this.f20517l = mVar;
        this.f20521p = hlsPlaylistTracker;
        this.f20518m = z10;
        this.f20519n = i10;
        this.f20520o = z11;
        this.f20522q = obj;
    }

    @Override // e5.r
    public e5.q b(r.a aVar, y5.b bVar, long j10) {
        return new i(this.f20512g, this.f20521p, this.f20514i, this.f20523r, this.f20516k, this.f20517l, n(aVar), bVar, this.f20515j, this.f20518m, this.f20519n, this.f20520o);
    }

    @Override // e5.r
    @Nullable
    public Object getTag() {
        return this.f20522q;
    }

    @Override // com.google.android.exoplayer.source.hls.playlist.HlsPlaylistTracker.c
    public void i(com.google.android.exoplayer.source.hls.playlist.c cVar) {
        l0 l0Var;
        long j10;
        long jB = cVar.f20603m ? k.b(cVar.f20596f) : -9223372036854775807L;
        int i10 = cVar.f20594d;
        long j11 = (i10 == 2 || i10 == 1) ? jB : -9223372036854775807L;
        long j12 = cVar.f20595e;
        j5.g gVar = new j5.g((com.google.android.exoplayer.source.hls.playlist.b) a6.a.e(this.f20521p.b()), cVar);
        if (this.f20521p.isLive()) {
            long initialStartTimeUs = cVar.f20596f - this.f20521p.getInitialStartTimeUs();
            long j13 = cVar.f20602l ? initialStartTimeUs + cVar.f20606p : -9223372036854775807L;
            List<c.a> list = cVar.f20605o;
            if (j12 != -9223372036854775807L) {
                j10 = j12;
            } else if (list.isEmpty()) {
                j10 = 0;
            } else {
                int iMax = Math.max(0, list.size() - 3);
                long j14 = cVar.f20606p - (cVar.f20601k * 2);
                while (iMax > 0 && list.get(iMax).f20612g > j14) {
                    iMax--;
                }
                j10 = list.get(iMax).f20612g;
            }
            l0Var = new l0(j11, jB, j13, cVar.f20606p, initialStartTimeUs, j10, true, !cVar.f20602l, true, gVar, this.f20522q);
        } else {
            long j15 = j12 == -9223372036854775807L ? 0L : j12;
            long j16 = cVar.f20606p;
            l0Var = new l0(j11, jB, j16, j16, 0L, j15, true, false, false, gVar, this.f20522q);
        }
        t(l0Var);
    }

    @Override // e5.r
    public void k(e5.q qVar) {
        ((i) qVar).o();
    }

    @Override // e5.r
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        this.f20521p.maybeThrowPrimaryPlaylistRefreshError();
    }

    @Override // e5.b
    public void s(@Nullable q qVar) {
        this.f20523r = qVar;
        this.f20516k.prepare();
        this.f20521p.a(this.f20513h, n(null), this);
    }

    @Override // e5.b
    public void u() {
        this.f20521p.stop();
        this.f20516k.release();
    }
}
