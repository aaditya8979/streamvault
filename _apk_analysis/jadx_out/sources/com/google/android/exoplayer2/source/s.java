package com.google.android.exoplayer2.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.p;
import com.google.android.exoplayer2.source.i;
import com.google.common.collect.ImmutableList;
import e7.d0;
import r7.h;
import r7.k;
import r7.y;

/* JADX INFO: compiled from: SingleSampleMediaSource.java */
/* JADX INFO: loaded from: classes9.dex */
public final class s extends com.google.android.exoplayer2.source.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r7.k f22466h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h.a f22467i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.google.android.exoplayer2.m f22468j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f22469k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.b f22470l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f22471m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c0 f22472n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final com.google.android.exoplayer2.p f22473o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public y f22474p;

    /* JADX INFO: compiled from: SingleSampleMediaSource.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h.a f22475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public com.google.android.exoplayer2.upstream.b f22476b = new com.google.android.exoplayer2.upstream.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f22477c = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public Object f22478d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public String f22479e;

        public b(h.a aVar) {
            this.f22475a = (h.a) s7.a.e(aVar);
        }

        public s a(p.l lVar, long j10) {
            return new s(this.f22479e, lVar, this.f22475a, j10, this.f22476b, this.f22477c, this.f22478d);
        }

        public b b(@Nullable com.google.android.exoplayer2.upstream.b bVar) {
            if (bVar == null) {
                bVar = new com.google.android.exoplayer2.upstream.a();
            }
            this.f22476b = bVar;
            return this;
        }
    }

    public s(@Nullable String str, p.l lVar, h.a aVar, long j10, com.google.android.exoplayer2.upstream.b bVar, boolean z10, @Nullable Object obj) {
        this.f22467i = aVar;
        this.f22469k = j10;
        this.f22470l = bVar;
        this.f22471m = z10;
        com.google.android.exoplayer2.p pVarA = new p.c().g(Uri.EMPTY).d(lVar.f22112a.toString()).e(ImmutableList.of(lVar)).f(obj).a();
        this.f22473o = pVarA;
        m.b bVarU = new m.b().e0((String) y7.g.a(lVar.f22113b, "text/x-unknown")).V(lVar.f22114c).g0(lVar.f22115d).c0(lVar.f22116e).U(lVar.f22117f);
        String str2 = lVar.f22118g;
        this.f22468j = bVarU.S(str2 == null ? str : str2).E();
        this.f22466h = new k.b().h(lVar.f22112a).b(1).a();
        this.f22472n = new d0(j10, true, false, false, null, pVarA);
    }

    @Override // com.google.android.exoplayer2.source.i
    public h a(i.b bVar, r7.b bVar2, long j10) {
        return new r(this.f22466h, this.f22467i, this.f22474p, this.f22468j, this.f22469k, this.f22470l, n(bVar), this.f22471m);
    }

    @Override // com.google.android.exoplayer2.source.i
    public void f(h hVar) {
        ((r) hVar).k();
    }

    @Override // com.google.android.exoplayer2.source.i
    public com.google.android.exoplayer2.p getMediaItem() {
        return this.f22473o;
    }

    @Override // com.google.android.exoplayer2.source.i
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // com.google.android.exoplayer2.source.a
    public void s(@Nullable y yVar) {
        this.f22474p = yVar;
        t(this.f22472n);
    }

    @Override // com.google.android.exoplayer2.source.a
    public void u() {
    }
}
