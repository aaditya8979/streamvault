package com.google.android.exoplayer2.source;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.p;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.source.n;
import com.google.android.exoplayer2.source.s;
import com.google.common.collect.ImmutableList;
import i6.b0;
import i6.y;
import i6.z;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import r7.h;
import r7.o;
import s7.m0;

/* JADX INFO: compiled from: DefaultMediaSourceFactory.java */
/* JADX INFO: loaded from: classes9.dex */
public final class d implements i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f22271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h.a f22272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public i.a f22273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public com.google.android.exoplayer2.upstream.b f22274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f22275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f22276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f22277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f22278h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f22279i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f22280j;

    /* JADX INFO: compiled from: DefaultMediaSourceFactory.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i6.p f22281a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<Integer, y7.p<i.a>> f22282b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set<Integer> f22283c = new HashSet();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Map<Integer, i.a> f22284d = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public h.a f22285e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public h6.q f22286f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public com.google.android.exoplayer2.upstream.b f22287g;

        public a(i6.p pVar) {
            this.f22281a = pVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ i.a k(h.a aVar) {
            return new n.b(aVar, this.f22281a);
        }

        @Nullable
        public i.a f(int i10) {
            i.a aVar = this.f22284d.get(Integer.valueOf(i10));
            if (aVar != null) {
                return aVar;
            }
            y7.p<i.a> pVarL = l(i10);
            if (pVarL == null) {
                return null;
            }
            i.a aVar2 = pVarL.get();
            h6.q qVar = this.f22286f;
            if (qVar != null) {
                aVar2.a(qVar);
            }
            com.google.android.exoplayer2.upstream.b bVar = this.f22287g;
            if (bVar != null) {
                aVar2.b(bVar);
            }
            this.f22284d.put(Integer.valueOf(i10), aVar2);
            return aVar2;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
        @androidx.annotation.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final y7.p<com.google.android.exoplayer2.source.i.a> l(int r5) {
            /*
                r4 = this;
                java.lang.Class<com.google.android.exoplayer2.source.i$a> r0 = com.google.android.exoplayer2.source.i.a.class
                java.util.Map<java.lang.Integer, y7.p<com.google.android.exoplayer2.source.i$a>> r1 = r4.f22282b
                java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
                boolean r1 = r1.containsKey(r2)
                if (r1 == 0) goto L1b
                java.util.Map<java.lang.Integer, y7.p<com.google.android.exoplayer2.source.i$a>> r0 = r4.f22282b
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r5 = r0.get(r5)
                y7.p r5 = (y7.p) r5
                return r5
            L1b:
                r1 = 0
                r7.h$a r2 = r4.f22285e
                java.lang.Object r2 = s7.a.e(r2)
                r7.h$a r2 = (r7.h.a) r2
                if (r5 == 0) goto L6b
                r3 = 1
                if (r5 == r3) goto L5b
                r3 = 2
                if (r5 == r3) goto L4b
                r3 = 3
                if (r5 == r3) goto L3a
                r0 = 4
                if (r5 == r0) goto L33
                goto L7b
            L33:
                e7.k r0 = new e7.k     // Catch: java.lang.ClassNotFoundException -> L7b
                r0.<init>()     // Catch: java.lang.ClassNotFoundException -> L7b
                r1 = r0
                goto L7b
            L3a:
                java.lang.String r2 = "com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory"
                java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L7b
                java.lang.Class r0 = r2.asSubclass(r0)     // Catch: java.lang.ClassNotFoundException -> L7b
                e7.j r2 = new e7.j     // Catch: java.lang.ClassNotFoundException -> L7b
                r2.<init>()     // Catch: java.lang.ClassNotFoundException -> L7b
                r1 = r2
                goto L7b
            L4b:
                java.lang.String r3 = "com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L7b
                java.lang.Class r0 = r3.asSubclass(r0)     // Catch: java.lang.ClassNotFoundException -> L7b
                e7.i r3 = new e7.i     // Catch: java.lang.ClassNotFoundException -> L7b
                r3.<init>()     // Catch: java.lang.ClassNotFoundException -> L7b
                goto L7a
            L5b:
                java.lang.String r3 = "com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L7b
                java.lang.Class r0 = r3.asSubclass(r0)     // Catch: java.lang.ClassNotFoundException -> L7b
                e7.h r3 = new e7.h     // Catch: java.lang.ClassNotFoundException -> L7b
                r3.<init>()     // Catch: java.lang.ClassNotFoundException -> L7b
                goto L7a
            L6b:
                java.lang.String r3 = "com.google.android.exoplayer2.source.dash.DashMediaSource$Factory"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L7b
                java.lang.Class r0 = r3.asSubclass(r0)     // Catch: java.lang.ClassNotFoundException -> L7b
                e7.g r3 = new e7.g     // Catch: java.lang.ClassNotFoundException -> L7b
                r3.<init>()     // Catch: java.lang.ClassNotFoundException -> L7b
            L7a:
                r1 = r3
            L7b:
                java.util.Map<java.lang.Integer, y7.p<com.google.android.exoplayer2.source.i$a>> r0 = r4.f22282b
                java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
                r0.put(r2, r1)
                if (r1 == 0) goto L8f
                java.util.Set<java.lang.Integer> r0 = r4.f22283c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r0.add(r5)
            L8f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.d.a.l(int):y7.p");
        }

        public void m(h.a aVar) {
            if (aVar != this.f22285e) {
                this.f22285e = aVar;
                this.f22282b.clear();
                this.f22284d.clear();
            }
        }

        public void n(h6.q qVar) {
            this.f22286f = qVar;
            Iterator<i.a> it = this.f22284d.values().iterator();
            while (it.hasNext()) {
                it.next().a(qVar);
            }
        }

        public void o(com.google.android.exoplayer2.upstream.b bVar) {
            this.f22287g = bVar;
            Iterator<i.a> it = this.f22284d.values().iterator();
            while (it.hasNext()) {
                it.next().b(bVar);
            }
        }
    }

    /* JADX INFO: compiled from: DefaultMediaSourceFactory.java */
    public static final class b implements i6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.m f22288a;

        public b(com.google.android.exoplayer2.m mVar) {
            this.f22288a = mVar;
        }

        @Override // i6.k
        public void a(i6.m mVar) {
            b0 b0VarTrack = mVar.track(0, 3);
            mVar.h(new z.b(-9223372036854775807L));
            mVar.endTracks();
            b0VarTrack.b(this.f22288a.b().e0("text/x-unknown").I(this.f22288a.f21751m).E());
        }

        @Override // i6.k
        public int b(i6.l lVar, y yVar) throws IOException {
            return lVar.skip(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }

        @Override // i6.k
        public boolean c(i6.l lVar) {
            return true;
        }

        @Override // i6.k
        public void release() {
        }

        @Override // i6.k
        public void seek(long j10, long j11) {
        }
    }

    public d(Context context, i6.p pVar) {
        this(new o.a(context), pVar);
    }

    public d(h.a aVar) {
        this(aVar, new i6.h());
    }

    public d(h.a aVar, i6.p pVar) {
        this.f22272b = aVar;
        a aVar2 = new a(pVar);
        this.f22271a = aVar2;
        aVar2.m(aVar);
        this.f22275e = -9223372036854775807L;
        this.f22276f = -9223372036854775807L;
        this.f22277g = -9223372036854775807L;
        this.f22278h = -3.4028235E38f;
        this.f22279i = -3.4028235E38f;
    }

    public static /* synthetic */ i.a e(Class cls) {
        return j(cls);
    }

    public static /* synthetic */ i.a f(Class cls, h.a aVar) {
        return k(cls, aVar);
    }

    public static /* synthetic */ i6.k[] g(com.google.android.exoplayer2.m mVar) {
        i6.k[] kVarArr = new i6.k[1];
        g7.k kVar = g7.k.f62185a;
        kVarArr[0] = kVar.a(mVar) ? new g7.l(kVar.b(mVar), mVar) : new b(mVar);
        return kVarArr;
    }

    public static i h(com.google.android.exoplayer2.p pVar, i iVar) {
        p.d dVar = pVar.f22037g;
        if (dVar.f22054b == 0 && dVar.f22055c == Long.MIN_VALUE && !dVar.f22057e) {
            return iVar;
        }
        long jW0 = m0.w0(pVar.f22037g.f22054b);
        long jW02 = m0.w0(pVar.f22037g.f22055c);
        p.d dVar2 = pVar.f22037g;
        return new ClippingMediaSource(iVar, jW0, jW02, !dVar2.f22058f, dVar2.f22056d, dVar2.f22057e);
    }

    public static i.a j(Class<? extends i.a> cls) {
        try {
            return cls.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static i.a k(Class<? extends i.a> cls, h.a aVar) {
        try {
            return cls.getConstructor(h.a.class).newInstance(aVar);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // com.google.android.exoplayer2.source.i.a
    public i c(com.google.android.exoplayer2.p pVar) {
        s7.a.e(pVar.f22033c);
        String scheme = pVar.f22033c.f22096a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            return ((i.a) s7.a.e(this.f22273c)).c(pVar);
        }
        p.h hVar = pVar.f22033c;
        int iK0 = m0.k0(hVar.f22096a, hVar.f22097b);
        i.a aVarF = this.f22271a.f(iK0);
        s7.a.j(aVarF, "No suitable media source factory found for content type: " + iK0);
        p.g.a aVarB = pVar.f22035e.b();
        if (pVar.f22035e.f22086b == -9223372036854775807L) {
            aVarB.k(this.f22275e);
        }
        if (pVar.f22035e.f22089e == -3.4028235E38f) {
            aVarB.j(this.f22278h);
        }
        if (pVar.f22035e.f22090f == -3.4028235E38f) {
            aVarB.h(this.f22279i);
        }
        if (pVar.f22035e.f22087c == -9223372036854775807L) {
            aVarB.i(this.f22276f);
        }
        if (pVar.f22035e.f22088d == -9223372036854775807L) {
            aVarB.g(this.f22277g);
        }
        p.g gVarF = aVarB.f();
        if (!gVarF.equals(pVar.f22035e)) {
            pVar = pVar.b().c(gVarF).a();
        }
        i iVarC = aVarF.c(pVar);
        ImmutableList<p.l> immutableList = ((p.h) m0.j(pVar.f22033c)).f22101f;
        if (!immutableList.isEmpty()) {
            i[] iVarArr = new i[immutableList.size() + 1];
            iVarArr[0] = iVarC;
            for (int i10 = 0; i10 < immutableList.size(); i10++) {
                if (this.f22280j) {
                    final com.google.android.exoplayer2.m mVarE = new m.b().e0(immutableList.get(i10).f22113b).V(immutableList.get(i10).f22114c).g0(immutableList.get(i10).f22115d).c0(immutableList.get(i10).f22116e).U(immutableList.get(i10).f22117f).S(immutableList.get(i10).f22118g).E();
                    n.b bVar = new n.b(this.f22272b, new i6.p() { // from class: e7.f
                        @Override // i6.p
                        public final i6.k[] createExtractors() {
                            return com.google.android.exoplayer2.source.d.g(mVarE);
                        }
                    });
                    com.google.android.exoplayer2.upstream.b bVar2 = this.f22274d;
                    if (bVar2 != null) {
                        bVar.b(bVar2);
                    }
                    iVarArr[i10 + 1] = bVar.c(com.google.android.exoplayer2.p.d(immutableList.get(i10).f22112a.toString()));
                } else {
                    s.b bVar3 = new s.b(this.f22272b);
                    com.google.android.exoplayer2.upstream.b bVar4 = this.f22274d;
                    if (bVar4 != null) {
                        bVar3.b(bVar4);
                    }
                    iVarArr[i10 + 1] = bVar3.a(immutableList.get(i10), -9223372036854775807L);
                }
            }
            iVarC = new MergingMediaSource(iVarArr);
        }
        return i(pVar, h(pVar, iVarC));
    }

    public final i i(com.google.android.exoplayer2.p pVar, i iVar) {
        s7.a.e(pVar.f22033c);
        pVar.f22033c.getClass();
        return iVar;
    }

    @Override // com.google.android.exoplayer2.source.i.a
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public d a(h6.q qVar) {
        this.f22271a.n((h6.q) s7.a.f(qVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @Override // com.google.android.exoplayer2.source.i.a
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public d b(com.google.android.exoplayer2.upstream.b bVar) {
        this.f22274d = (com.google.android.exoplayer2.upstream.b) s7.a.f(bVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f22271a.o(bVar);
        return this;
    }
}
