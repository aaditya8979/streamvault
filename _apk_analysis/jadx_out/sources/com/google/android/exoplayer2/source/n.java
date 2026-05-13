package com.google.android.exoplayer2.source;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.p;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.source.l;
import com.google.android.exoplayer2.source.m;
import com.google.android.exoplayer2.source.n;
import e6.s1;
import e7.d0;
import r7.h;
import r7.y;

/* JADX INFO: compiled from: ProgressiveMediaSource.java */
/* JADX INFO: loaded from: classes9.dex */
public final class n extends com.google.android.exoplayer2.source.a implements m.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.google.android.exoplayer2.p f22384h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p.h f22385i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h.a f22386j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l.a f22387k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.c f22388l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.b f22389m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f22390n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f22391o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f22392p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f22393q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f22394r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public y f22395s;

    /* JADX INFO: compiled from: ProgressiveMediaSource.java */
    public class a extends e7.m {
        public a(n nVar, c0 c0Var) {
            super(c0Var);
        }

        @Override // e7.m, com.google.android.exoplayer2.c0
        public c0.b k(int i10, c0.b bVar, boolean z10) {
            super.k(i10, bVar, z10);
            bVar.f21392g = true;
            return bVar;
        }

        @Override // e7.m, com.google.android.exoplayer2.c0
        public c0.d s(int i10, c0.d dVar, long j10) {
            super.s(i10, dVar, j10);
            dVar.f21413m = true;
            return dVar;
        }
    }

    /* JADX INFO: compiled from: ProgressiveMediaSource.java */
    public static final class b implements i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h.a f22396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public l.a f22397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public h6.q f22398c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public com.google.android.exoplayer2.upstream.b f22399d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f22400e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public String f22401f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public Object f22402g;

        public b(h.a aVar, l.a aVar2) {
            this(aVar, aVar2, new com.google.android.exoplayer2.drm.a(), new com.google.android.exoplayer2.upstream.a(), 1048576);
        }

        public b(h.a aVar, l.a aVar2, h6.q qVar, com.google.android.exoplayer2.upstream.b bVar, int i10) {
            this.f22396a = aVar;
            this.f22397b = aVar2;
            this.f22398c = qVar;
            this.f22399d = bVar;
            this.f22400e = i10;
        }

        public b(h.a aVar, final i6.p pVar) {
            this(aVar, new l.a() { // from class: e7.z
                @Override // com.google.android.exoplayer2.source.l.a
                public final com.google.android.exoplayer2.source.l a(s1 s1Var) {
                    return n.b.f(pVar, s1Var);
                }
            });
        }

        public static /* synthetic */ l f(i6.p pVar, s1 s1Var) {
            return new e7.a(pVar);
        }

        @Override // com.google.android.exoplayer2.source.i.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public n c(com.google.android.exoplayer2.p pVar) {
            s7.a.e(pVar.f22033c);
            p.h hVar = pVar.f22033c;
            boolean z10 = hVar.f22103h == null && this.f22402g != null;
            boolean z11 = hVar.f22100e == null && this.f22401f != null;
            if (z10 && z11) {
                pVar = pVar.b().f(this.f22402g).b(this.f22401f).a();
            } else if (z10) {
                pVar = pVar.b().f(this.f22402g).a();
            } else if (z11) {
                pVar = pVar.b().b(this.f22401f).a();
            }
            com.google.android.exoplayer2.p pVar2 = pVar;
            return new n(pVar2, this.f22396a, this.f22397b, this.f22398c.a(pVar2), this.f22399d, this.f22400e, null);
        }

        @Override // com.google.android.exoplayer2.source.i.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b a(h6.q qVar) {
            this.f22398c = (h6.q) s7.a.f(qVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // com.google.android.exoplayer2.source.i.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public b b(com.google.android.exoplayer2.upstream.b bVar) {
            this.f22399d = (com.google.android.exoplayer2.upstream.b) s7.a.f(bVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }
    }

    public n(com.google.android.exoplayer2.p pVar, h.a aVar, l.a aVar2, com.google.android.exoplayer2.drm.c cVar, com.google.android.exoplayer2.upstream.b bVar, int i10) {
        this.f22385i = (p.h) s7.a.e(pVar.f22033c);
        this.f22384h = pVar;
        this.f22386j = aVar;
        this.f22387k = aVar2;
        this.f22388l = cVar;
        this.f22389m = bVar;
        this.f22390n = i10;
        this.f22391o = true;
        this.f22392p = -9223372036854775807L;
    }

    public /* synthetic */ n(com.google.android.exoplayer2.p pVar, h.a aVar, l.a aVar2, com.google.android.exoplayer2.drm.c cVar, com.google.android.exoplayer2.upstream.b bVar, int i10, a aVar3) {
        this(pVar, aVar, aVar2, cVar, bVar, i10);
    }

    @Override // com.google.android.exoplayer2.source.i
    public h a(i.b bVar, r7.b bVar2, long j10) {
        r7.h hVarCreateDataSource = this.f22386j.createDataSource();
        y yVar = this.f22395s;
        if (yVar != null) {
            hVarCreateDataSource.b(yVar);
        }
        return new m(this.f22385i.f22096a, hVarCreateDataSource, this.f22387k.a(q()), this.f22388l, l(bVar), this.f22389m, n(bVar), this, bVar2, this.f22385i.f22100e, this.f22390n);
    }

    @Override // com.google.android.exoplayer2.source.i
    public void f(h hVar) {
        ((m) hVar).S();
    }

    @Override // com.google.android.exoplayer2.source.i
    public com.google.android.exoplayer2.p getMediaItem() {
        return this.f22384h;
    }

    @Override // com.google.android.exoplayer2.source.i
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // com.google.android.exoplayer2.source.m.b
    public void onSourceInfoRefreshed(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f22392p;
        }
        if (!this.f22391o && this.f22392p == j10 && this.f22393q == z10 && this.f22394r == z11) {
            return;
        }
        this.f22392p = j10;
        this.f22393q = z10;
        this.f22394r = z11;
        this.f22391o = false;
        v();
    }

    @Override // com.google.android.exoplayer2.source.a
    public void s(@Nullable y yVar) {
        this.f22395s = yVar;
        this.f22388l.prepare();
        this.f22388l.a((Looper) s7.a.e(Looper.myLooper()), q());
        v();
    }

    @Override // com.google.android.exoplayer2.source.a
    public void u() {
        this.f22388l.release();
    }

    public final void v() {
        c0 d0Var = new d0(this.f22392p, this.f22393q, false, this.f22394r, null, this.f22384h);
        if (this.f22391o) {
            d0Var = new a(this, d0Var);
        }
        t(d0Var);
    }
}
