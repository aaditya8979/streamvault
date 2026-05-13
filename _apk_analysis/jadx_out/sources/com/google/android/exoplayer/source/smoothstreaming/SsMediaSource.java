package com.google.android.exoplayer.source.smoothstreaming;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import b5.e;
import com.google.android.exoplayer.offline.StreamKey;
import com.google.android.exoplayer.source.smoothstreaming.a;
import com.google.android.exoplayer.source.smoothstreaming.b;
import com.google.android.exoplayer.source.smoothstreaming.manifest.SsManifestParser;
import com.google.android.exoplayer.source.smoothstreaming.manifest.a;
import com.google.android.exoplayer.upstream.Loader;
import com.google.android.exoplayer.upstream.a;
import com.google.android.exoplayer.upstream.f;
import com.google.android.exoplayer.upstream.g;
import e4.e0;
import e4.k;
import e5.b0;
import e5.j;
import e5.l0;
import e5.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import y5.m;
import y5.n;
import y5.q;

/* JADX INFO: loaded from: classes7.dex */
public final class SsMediaSource extends e5.b implements Loader.b<g<com.google.android.exoplayer.source.smoothstreaming.manifest.a>> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f20648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Uri f20649h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a.InterfaceC0296a f20650i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b.a f20651j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e5.g f20652k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.google.android.exoplayer.drm.a<?> f20653l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m f20654m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f20655n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b0.a f20656o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g.a<? extends com.google.android.exoplayer.source.smoothstreaming.manifest.a> f20657p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList<c> f20658q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public final Object f20659r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public com.google.android.exoplayer.upstream.a f20660s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Loader f20661t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public n f20662u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public q f20663v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f20664w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public com.google.android.exoplayer.source.smoothstreaming.manifest.a f20665x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Handler f20666y;

    public static final class Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b.a f20667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final a.InterfaceC0296a f20668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public g.a<? extends com.google.android.exoplayer.source.smoothstreaming.manifest.a> f20669c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public List<StreamKey> f20670d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public e5.g f20671e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public com.google.android.exoplayer.drm.a<?> f20672f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public m f20673g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f20674h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f20675i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public Object f20676j;

        public Factory(b.a aVar, @Nullable a.InterfaceC0296a interfaceC0296a) {
            this.f20667a = (b.a) a6.a.e(aVar);
            this.f20668b = interfaceC0296a;
            this.f20672f = com.google.android.exoplayer.drm.a.a();
            this.f20673g = new f();
            this.f20674h = 30000L;
            this.f20671e = new j();
        }

        public Factory(a.InterfaceC0296a interfaceC0296a) {
            this(new a.C0292a(interfaceC0296a), interfaceC0296a);
        }

        public SsMediaSource a(Uri uri) {
            this.f20675i = true;
            if (this.f20669c == null) {
                this.f20669c = new SsManifestParser();
            }
            List<StreamKey> list = this.f20670d;
            if (list != null) {
                this.f20669c = new e(this.f20669c, list);
            }
            return new SsMediaSource(null, (Uri) a6.a.e(uri), this.f20668b, this.f20669c, this.f20667a, this.f20671e, this.f20672f, this.f20673g, this.f20674h, this.f20676j);
        }

        public Factory b(long j10) {
            a6.a.f(!this.f20675i);
            this.f20674h = j10;
            return this;
        }

        public Factory c(m mVar) {
            a6.a.f(!this.f20675i);
            this.f20673g = mVar;
            return this;
        }

        @Deprecated
        public Factory d(int i10) {
            return c(new f(i10));
        }
    }

    static {
        e0.a("goog.exo.smoothstreaming");
    }

    public SsMediaSource(@Nullable com.google.android.exoplayer.source.smoothstreaming.manifest.a aVar, @Nullable Uri uri, @Nullable a.InterfaceC0296a interfaceC0296a, @Nullable g.a<? extends com.google.android.exoplayer.source.smoothstreaming.manifest.a> aVar2, b.a aVar3, e5.g gVar, com.google.android.exoplayer.drm.a<?> aVar4, m mVar, long j10, @Nullable Object obj) {
        a6.a.f(aVar == null || !aVar.f20737d);
        this.f20665x = aVar;
        this.f20649h = uri == null ? null : m5.a.a(uri);
        this.f20650i = interfaceC0296a;
        this.f20657p = aVar2;
        this.f20651j = aVar3;
        this.f20652k = gVar;
        this.f20653l = aVar4;
        this.f20654m = mVar;
        this.f20655n = j10;
        this.f20656o = n(null);
        this.f20659r = obj;
        this.f20648g = aVar != null;
        this.f20658q = new ArrayList<>();
    }

    public final void A() {
        if (this.f20665x.f20737d) {
            this.f20666y.postDelayed(new Runnable() { // from class: l5.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f73687b.B();
                }
            }, Math.max(0L, (this.f20664w + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    public final void B() {
        if (this.f20661t.h()) {
            return;
        }
        g gVar = new g(this.f20660s, this.f20649h, 4, this.f20657p);
        this.f20656o.H(gVar.f21150a, gVar.f21151b, this.f20661t.m(gVar, this, this.f20654m.getMinimumLoadableRetryCount(gVar.f21151b)));
    }

    @Override // e5.r
    public e5.q b(r.a aVar, y5.b bVar, long j10) {
        c cVar = new c(this.f20665x, this.f20651j, this.f20663v, this.f20652k, this.f20653l, this.f20654m, n(aVar), this.f20662u, bVar);
        this.f20658q.add(cVar);
        return cVar;
    }

    @Override // e5.r
    @Nullable
    public Object getTag() {
        return this.f20659r;
    }

    @Override // e5.r
    public void k(e5.q qVar) {
        ((c) qVar).j();
        this.f20658q.remove(qVar);
    }

    @Override // e5.r
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        this.f20662u.maybeThrowError();
    }

    @Override // e5.b
    public void s(@Nullable q qVar) {
        this.f20663v = qVar;
        this.f20653l.prepare();
        if (this.f20648g) {
            this.f20662u = new n.a();
            z();
            return;
        }
        this.f20660s = this.f20650i.createDataSource();
        Loader loader = new Loader("Loader:Manifest");
        this.f20661t = loader;
        this.f20662u = loader;
        this.f20666y = new Handler();
        B();
    }

    @Override // e5.b
    public void u() {
        this.f20665x = this.f20648g ? this.f20665x : null;
        this.f20660s = null;
        this.f20664w = 0L;
        Loader loader = this.f20661t;
        if (loader != null) {
            loader.k();
            this.f20661t = null;
        }
        Handler handler = this.f20666y;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f20666y = null;
        }
        this.f20653l.release();
    }

    @Override // com.google.android.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void l(g<com.google.android.exoplayer.source.smoothstreaming.manifest.a> gVar, long j10, long j11, boolean z10) {
        this.f20656o.y(gVar.f21150a, gVar.d(), gVar.b(), gVar.f21151b, j10, j11, gVar.a());
    }

    @Override // com.google.android.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void j(g<com.google.android.exoplayer.source.smoothstreaming.manifest.a> gVar, long j10, long j11) {
        this.f20656o.B(gVar.f21150a, gVar.d(), gVar.b(), gVar.f21151b, j10, j11, gVar.a());
        this.f20665x = gVar.c();
        this.f20664w = j10 - j11;
        z();
        A();
    }

    @Override // com.google.android.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Loader.c g(g<com.google.android.exoplayer.source.smoothstreaming.manifest.a> gVar, long j10, long j11, IOException iOException, int i10) {
        long jB = this.f20654m.b(4, j11, iOException, i10);
        Loader.c cVarG = jB == -9223372036854775807L ? Loader.f21019g : Loader.g(false, jB);
        this.f20656o.E(gVar.f21150a, gVar.d(), gVar.b(), gVar.f21151b, j10, j11, gVar.a(), iOException, !cVarG.c());
        return cVarG;
    }

    public final void z() {
        l0 l0Var;
        for (int i10 = 0; i10 < this.f20658q.size(); i10++) {
            this.f20658q.get(i10).k(this.f20665x);
        }
        long jMax = Long.MIN_VALUE;
        long jMax2 = Long.MAX_VALUE;
        for (a.b bVar : this.f20665x.f20739f) {
            if (bVar.f20755k > 0) {
                jMax2 = Math.min(jMax2, bVar.e(0));
                jMax = Math.max(jMax, bVar.e(bVar.f20755k - 1) + bVar.c(bVar.f20755k - 1));
            }
        }
        if (jMax2 == Long.MAX_VALUE) {
            long j10 = this.f20665x.f20737d ? -9223372036854775807L : 0L;
            com.google.android.exoplayer.source.smoothstreaming.manifest.a aVar = this.f20665x;
            boolean z10 = aVar.f20737d;
            l0Var = new l0(j10, 0L, 0L, 0L, true, z10, z10, aVar, this.f20659r);
        } else {
            com.google.android.exoplayer.source.smoothstreaming.manifest.a aVar2 = this.f20665x;
            if (aVar2.f20737d) {
                long j11 = aVar2.f20741h;
                if (j11 != -9223372036854775807L && j11 > 0) {
                    jMax2 = Math.max(jMax2, jMax - j11);
                }
                long j12 = jMax2;
                long j13 = jMax - j12;
                long jA = j13 - k.a(this.f20655n);
                if (jA < 5000000) {
                    jA = Math.min(5000000L, j13 / 2);
                }
                l0Var = new l0(-9223372036854775807L, j13, j12, jA, true, true, true, this.f20665x, this.f20659r);
            } else {
                long j14 = aVar2.f20740g;
                long j15 = j14 != -9223372036854775807L ? j14 : jMax - jMax2;
                l0Var = new l0(jMax2 + j15, j15, jMax2, 0L, true, false, false, this.f20665x, this.f20659r);
            }
        }
        t(l0Var);
    }
}
