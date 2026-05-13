package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.b;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.e;
import com.google.android.exoplayer2.source.h;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.source.p;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.b;
import d6.x1;
import d6.z0;
import e7.g0;
import e7.i0;
import i6.b0;
import i6.y;
import i6.z;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import r7.k;
import r7.x;
import s7.a0;
import s7.m0;
import s7.u;

/* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
/* JADX INFO: loaded from: classes9.dex */
public final class m implements h, i6.m, Loader.b<a>, Loader.f, p.d {
    public static final Map<String, String> N = y();
    public static final com.google.android.exoplayer2.m O = new m.b().S("icy").e0("application/x-icy").E();
    public boolean B;
    public boolean D;
    public boolean E;
    public int F;
    public boolean G;
    public long H;
    public boolean J;
    public int K;
    public boolean L;
    public boolean M;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f22337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r7.h f22338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.c f22339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.b f22340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j.a f22341f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b.a f22342g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f22343h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r7.b f22344i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final String f22345j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f22346k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l f22348m;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public h.a f22353r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public IcyHeaders f22354s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f22357v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f22358w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f22359x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public e f22360y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public z f22361z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Loader f22347l = new Loader("ProgressiveMediaPeriod");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final s7.g f22349n = new s7.g();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Runnable f22350o = new Runnable() { // from class: e7.v
        @Override // java.lang.Runnable
        public final void run() {
            this.f60925b.H();
        }
    };

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Runnable f22351p = new Runnable() { // from class: e7.w
        @Override // java.lang.Runnable
        public final void run() {
            this.f60926b.E();
        }
    };

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Handler f22352q = m0.u();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public d[] f22356u = new d[0];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p[] f22355t = new p[0];
    public long I = -9223372036854775807L;
    public long A = -9223372036854775807L;
    public int C = 1;

    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    public final class a implements Loader.e, e.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f22363b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final x f22364c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final l f22365d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final i6.m f22366e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final s7.g f22367f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile boolean f22369h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f22371j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Nullable
        public b0 f22373l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f22374m;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final y f22368g = new y();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f22370i = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f22362a = e7.n.a();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public r7.k f22372k = g(0);

        public a(Uri uri, r7.h hVar, l lVar, i6.m mVar, s7.g gVar) {
            this.f22363b = uri;
            this.f22364c = new x(hVar);
            this.f22365d = lVar;
            this.f22366e = mVar;
            this.f22367f = gVar;
        }

        @Override // com.google.android.exoplayer2.source.e.a
        public void a(a0 a0Var) {
            long jMax = !this.f22374m ? this.f22371j : Math.max(m.this.A(true), this.f22371j);
            int iA = a0Var.a();
            b0 b0Var = (b0) s7.a.e(this.f22373l);
            b0Var.e(a0Var, iA);
            b0Var.c(jMax, 1, iA, 0, null);
            this.f22374m = true;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void cancelLoad() {
            this.f22369h = true;
        }

        public final r7.k g(long j10) {
            return new k.b().h(this.f22363b).g(j10).f(m.this.f22345j).b(6).e(m.N).a();
        }

        public final void h(long j10, long j11) {
            this.f22368g.f63944a = j10;
            this.f22371j = j11;
            this.f22370i = true;
            this.f22374m = false;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void load() throws IOException {
            int iB = 0;
            while (iB == 0 && !this.f22369h) {
                try {
                    long j10 = this.f22368g.f63944a;
                    r7.k kVarG = g(j10);
                    this.f22372k = kVarG;
                    long jA = this.f22364c.a(kVarG);
                    if (jA != -1) {
                        jA += j10;
                        m.this.M();
                    }
                    long j11 = jA;
                    m.this.f22354s = IcyHeaders.b(this.f22364c.getResponseHeaders());
                    r7.f eVar = this.f22364c;
                    if (m.this.f22354s != null && m.this.f22354s.f21907g != -1) {
                        eVar = new com.google.android.exoplayer2.source.e(this.f22364c, m.this.f22354s.f21907g, this);
                        b0 b0VarB = m.this.B();
                        this.f22373l = b0VarB;
                        b0VarB.b(m.O);
                    }
                    long currentInputPosition = j10;
                    this.f22365d.a(eVar, this.f22363b, this.f22364c.getResponseHeaders(), j10, j11, this.f22366e);
                    if (m.this.f22354s != null) {
                        this.f22365d.disableSeekingOnMp3Streams();
                    }
                    if (this.f22370i) {
                        this.f22365d.seek(currentInputPosition, this.f22371j);
                        this.f22370i = false;
                    }
                    while (true) {
                        long j12 = currentInputPosition;
                        while (iB == 0 && !this.f22369h) {
                            try {
                                this.f22367f.a();
                                iB = this.f22365d.b(this.f22368g);
                                currentInputPosition = this.f22365d.getCurrentInputPosition();
                                if (currentInputPosition > m.this.f22346k + j12) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.f22367f.c();
                        m.this.f22352q.post(m.this.f22351p);
                    }
                    if (iB == 1) {
                        iB = 0;
                    } else if (this.f22365d.getCurrentInputPosition() != -1) {
                        this.f22368g.f63944a = this.f22365d.getCurrentInputPosition();
                    }
                    r7.j.a(this.f22364c);
                } catch (Throwable th2) {
                    if (iB != 1 && this.f22365d.getCurrentInputPosition() != -1) {
                        this.f22368g.f63944a = this.f22365d.getCurrentInputPosition();
                    }
                    r7.j.a(this.f22364c);
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    public interface b {
        void onSourceInfoRefreshed(long j10, boolean z10, boolean z11);
    }

    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    public final class c implements e7.b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22376a;

        public c(int i10) {
            this.f22376a = i10;
        }

        @Override // e7.b0
        public int a(z0 z0Var, DecoderInputBuffer decoderInputBuffer, int i10) {
            return m.this.R(this.f22376a, z0Var, decoderInputBuffer, i10);
        }

        @Override // e7.b0
        public boolean isReady() {
            return m.this.D(this.f22376a);
        }

        @Override // e7.b0
        public void maybeThrowError() throws IOException {
            m.this.L(this.f22376a);
        }

        @Override // e7.b0
        public int skipData(long j10) {
            return m.this.V(this.f22376a, j10);
        }
    }

    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f22379b;

        public d(int i10, boolean z10) {
            this.f22378a = i10;
            this.f22379b = z10;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f22378a == dVar.f22378a && this.f22379b == dVar.f22379b;
        }

        public int hashCode() {
            return (this.f22378a * 31) + (this.f22379b ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i0 f22380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f22381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean[] f22382c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean[] f22383d;

        public e(i0 i0Var, boolean[] zArr) {
            this.f22380a = i0Var;
            this.f22381b = zArr;
            int i10 = i0Var.f60877b;
            this.f22382c = new boolean[i10];
            this.f22383d = new boolean[i10];
        }
    }

    public m(Uri uri, r7.h hVar, l lVar, com.google.android.exoplayer2.drm.c cVar, b.a aVar, com.google.android.exoplayer2.upstream.b bVar, j.a aVar2, b bVar2, r7.b bVar3, @Nullable String str, int i10) {
        this.f22337b = uri;
        this.f22338c = hVar;
        this.f22339d = cVar;
        this.f22342g = aVar;
        this.f22340e = bVar;
        this.f22341f = aVar2;
        this.f22343h = bVar2;
        this.f22344i = bVar3;
        this.f22345j = str;
        this.f22346k = i10;
        this.f22348m = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E() {
        if (this.M) {
            return;
        }
        ((h.a) s7.a.e(this.f22353r)).a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() {
        this.G = true;
    }

    public static Map<String, String> y() {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(map);
    }

    public final long A(boolean z10) {
        long jMax = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.f22355t.length; i10++) {
            if (z10 || ((e) s7.a.e(this.f22360y)).f22382c[i10]) {
                jMax = Math.max(jMax, this.f22355t[i10].t());
            }
        }
        return jMax;
    }

    public b0 B() {
        return Q(new d(0, true));
    }

    public final boolean C() {
        return this.I != -9223372036854775807L;
    }

    public boolean D(int i10) {
        return !X() && this.f22355t[i10].D(this.L);
    }

    public final void H() {
        if (this.M || this.f22358w || !this.f22357v || this.f22361z == null) {
            return;
        }
        for (p pVar : this.f22355t) {
            if (pVar.z() == null) {
                return;
            }
        }
        this.f22349n.c();
        int length = this.f22355t.length;
        g0[] g0VarArr = new g0[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            com.google.android.exoplayer2.m mVarE = (com.google.android.exoplayer2.m) s7.a.e(this.f22355t[i10].z());
            String str = mVarE.f21751m;
            boolean zL = u.l(str);
            boolean z10 = zL || u.o(str);
            zArr[i10] = z10;
            this.f22359x = z10 | this.f22359x;
            IcyHeaders icyHeaders = this.f22354s;
            if (icyHeaders != null) {
                if (zL || this.f22356u[i10].f22379b) {
                    Metadata metadata = mVarE.f21749k;
                    mVarE = mVarE.b().X(metadata == null ? new Metadata(icyHeaders) : metadata.b(icyHeaders)).E();
                }
                if (zL && mVarE.f21745g == -1 && mVarE.f21746h == -1 && icyHeaders.f21902b != -1) {
                    mVarE = mVarE.b().G(icyHeaders.f21902b).E();
                }
            }
            g0VarArr[i10] = new g0(Integer.toString(i10), mVarE.c(this.f22339d.d(mVarE)));
        }
        this.f22360y = new e(new i0(g0VarArr), zArr);
        this.f22358w = true;
        ((h.a) s7.a.e(this.f22353r)).c(this);
    }

    public final void I(int i10) {
        w();
        e eVar = this.f22360y;
        boolean[] zArr = eVar.f22383d;
        if (zArr[i10]) {
            return;
        }
        com.google.android.exoplayer2.m mVarC = eVar.f22380a.b(i10).c(0);
        this.f22341f.h(u.i(mVarC.f21751m), mVarC, 0, null, this.H);
        zArr[i10] = true;
    }

    public final void J(int i10) {
        w();
        boolean[] zArr = this.f22360y.f22381b;
        if (this.J && zArr[i10]) {
            if (this.f22355t[i10].D(false)) {
                return;
            }
            this.I = 0L;
            this.J = false;
            this.E = true;
            this.H = 0L;
            this.K = 0;
            for (p pVar : this.f22355t) {
                pVar.N();
            }
            ((h.a) s7.a.e(this.f22353r)).a(this);
        }
    }

    public void K() throws IOException {
        this.f22347l.k(this.f22340e.getMinimumLoadableRetryCount(this.C));
    }

    public void L(int i10) throws IOException {
        this.f22355t[i10].G();
        K();
    }

    public final void M() {
        this.f22352q.post(new Runnable() { // from class: e7.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f60927b.F();
            }
        });
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void c(a aVar, long j10, long j11, boolean z10) {
        x xVar = aVar.f22364c;
        e7.n nVar = new e7.n(aVar.f22362a, aVar.f22372k, xVar.d(), xVar.e(), j10, j11, xVar.c());
        this.f22340e.onLoadTaskConcluded(aVar.f22362a);
        this.f22341f.o(nVar, 1, -1, null, 0, null, aVar.f22371j, this.A);
        if (z10) {
            return;
        }
        for (p pVar : this.f22355t) {
            pVar.N();
        }
        if (this.F > 0) {
            ((h.a) s7.a.e(this.f22353r)).a(this);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void d(a aVar, long j10, long j11) {
        z zVar;
        if (this.A == -9223372036854775807L && (zVar = this.f22361z) != null) {
            boolean zIsSeekable = zVar.isSeekable();
            long jA = A(true);
            long j12 = jA == Long.MIN_VALUE ? 0L : jA + 10000;
            this.A = j12;
            this.f22343h.onSourceInfoRefreshed(j12, zIsSeekable, this.B);
        }
        x xVar = aVar.f22364c;
        e7.n nVar = new e7.n(aVar.f22362a, aVar.f22372k, xVar.d(), xVar.e(), j10, j11, xVar.c());
        this.f22340e.onLoadTaskConcluded(aVar.f22362a);
        this.f22341f.q(nVar, 1, -1, null, 0, null, aVar.f22371j, this.A);
        this.L = true;
        ((h.a) s7.a.e(this.f22353r)).a(this);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public Loader.c g(a aVar, long j10, long j11, IOException iOException, int i10) {
        boolean z10;
        a aVar2;
        Loader.c cVarG;
        x xVar = aVar.f22364c;
        e7.n nVar = new e7.n(aVar.f22362a, aVar.f22372k, xVar.d(), xVar.e(), j10, j11, xVar.c());
        long jA = this.f22340e.a(new b.a(nVar, new e7.o(1, -1, null, 0, null, m0.Q0(aVar.f22371j), m0.Q0(this.A)), iOException, i10));
        if (jA == -9223372036854775807L) {
            cVarG = Loader.f22858g;
        } else {
            int iZ = z();
            if (iZ > this.K) {
                aVar2 = aVar;
                z10 = true;
            } else {
                z10 = false;
                aVar2 = aVar;
            }
            cVarG = x(aVar2, iZ) ? Loader.g(z10, jA) : Loader.f22857f;
        }
        boolean z11 = !cVarG.c();
        this.f22341f.s(nVar, 1, -1, null, 0, null, aVar.f22371j, this.A, iOException, z11);
        if (z11) {
            this.f22340e.onLoadTaskConcluded(aVar.f22362a);
        }
        return cVarG;
    }

    public final b0 Q(d dVar) {
        int length = this.f22355t.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (dVar.equals(this.f22356u[i10])) {
                return this.f22355t[i10];
            }
        }
        p pVarK = p.k(this.f22344i, this.f22339d, this.f22342g);
        pVarK.T(this);
        int i11 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.f22356u, i11);
        dVarArr[length] = dVar;
        this.f22356u = (d[]) m0.k(dVarArr);
        p[] pVarArr = (p[]) Arrays.copyOf(this.f22355t, i11);
        pVarArr[length] = pVarK;
        this.f22355t = (p[]) m0.k(pVarArr);
        return pVarK;
    }

    public int R(int i10, z0 z0Var, DecoderInputBuffer decoderInputBuffer, int i11) {
        if (X()) {
            return -3;
        }
        I(i10);
        int iK = this.f22355t[i10].K(z0Var, decoderInputBuffer, i11, this.L);
        if (iK == -3) {
            J(i10);
        }
        return iK;
    }

    public void S() {
        if (this.f22358w) {
            for (p pVar : this.f22355t) {
                pVar.J();
            }
        }
        this.f22347l.m(this);
        this.f22352q.removeCallbacksAndMessages(null);
        this.f22353r = null;
        this.M = true;
    }

    public final boolean T(boolean[] zArr, long j10) {
        int length = this.f22355t.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.f22355t[i10].Q(j10, false) && (zArr[i10] || !this.f22359x)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final void G(z zVar) {
        this.f22361z = this.f22354s == null ? zVar : new z.b(-9223372036854775807L);
        this.A = zVar.getDurationUs();
        boolean z10 = !this.G && zVar.getDurationUs() == -9223372036854775807L;
        this.B = z10;
        this.C = z10 ? 7 : 1;
        this.f22343h.onSourceInfoRefreshed(this.A, zVar.isSeekable(), this.B);
        if (this.f22358w) {
            return;
        }
        H();
    }

    public int V(int i10, long j10) {
        if (X()) {
            return 0;
        }
        I(i10);
        p pVar = this.f22355t[i10];
        int iY = pVar.y(j10, this.L);
        pVar.U(iY);
        if (iY == 0) {
            J(i10);
        }
        return iY;
    }

    public final void W() {
        a aVar = new a(this.f22337b, this.f22338c, this.f22348m, this, this.f22349n);
        if (this.f22358w) {
            s7.a.g(C());
            long j10 = this.A;
            if (j10 != -9223372036854775807L && this.I > j10) {
                this.L = true;
                this.I = -9223372036854775807L;
                return;
            }
            aVar.h(((z) s7.a.e(this.f22361z)).getSeekPoints(this.I).f63945a.f63839b, this.I);
            for (p pVar : this.f22355t) {
                pVar.R(this.I);
            }
            this.I = -9223372036854775807L;
        }
        this.K = z();
        this.f22341f.u(new e7.n(aVar.f22362a, aVar.f22372k, this.f22347l.n(aVar, this, this.f22340e.getMinimumLoadableRetryCount(this.C))), 1, -1, null, 0, null, aVar.f22371j, this.A);
    }

    public final boolean X() {
        return this.E || C();
    }

    @Override // com.google.android.exoplayer2.source.p.d
    public void a(com.google.android.exoplayer2.m mVar) {
        this.f22352q.post(this.f22350o);
    }

    @Override // com.google.android.exoplayer2.source.h
    public long b(q7.r[] rVarArr, boolean[] zArr, e7.b0[] b0VarArr, boolean[] zArr2, long j10) {
        q7.r rVar;
        w();
        e eVar = this.f22360y;
        i0 i0Var = eVar.f22380a;
        boolean[] zArr3 = eVar.f22382c;
        int i10 = this.F;
        int i11 = 0;
        for (int i12 = 0; i12 < rVarArr.length; i12++) {
            e7.b0 b0Var = b0VarArr[i12];
            if (b0Var != null && (rVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((c) b0Var).f22376a;
                s7.a.g(zArr3[i13]);
                this.F--;
                zArr3[i13] = false;
                b0VarArr[i12] = null;
            }
        }
        boolean z10 = !this.D ? j10 == 0 : i10 != 0;
        for (int i14 = 0; i14 < rVarArr.length; i14++) {
            if (b0VarArr[i14] == null && (rVar = rVarArr[i14]) != null) {
                s7.a.g(rVar.length() == 1);
                s7.a.g(rVar.getIndexInTrackGroup(0) == 0);
                int iC = i0Var.c(rVar.getTrackGroup());
                s7.a.g(!zArr3[iC]);
                this.F++;
                zArr3[iC] = true;
                b0VarArr[i14] = new c(iC);
                zArr2[i14] = true;
                if (!z10) {
                    p pVar = this.f22355t[iC];
                    z10 = (pVar.Q(j10, true) || pVar.w() == 0) ? false : true;
                }
            }
        }
        if (this.F == 0) {
            this.J = false;
            this.E = false;
            if (this.f22347l.i()) {
                p[] pVarArr = this.f22355t;
                int length = pVarArr.length;
                while (i11 < length) {
                    pVarArr[i11].p();
                    i11++;
                }
                this.f22347l.e();
            } else {
                p[] pVarArr2 = this.f22355t;
                int length2 = pVarArr2.length;
                while (i11 < length2) {
                    pVarArr2[i11].N();
                    i11++;
                }
            }
        } else if (z10) {
            j10 = seekToUs(j10);
            while (i11 < b0VarArr.length) {
                if (b0VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.D = true;
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public boolean continueLoading(long j10) {
        if (this.L || this.f22347l.h() || this.J) {
            return false;
        }
        if (this.f22358w && this.F == 0) {
            return false;
        }
        boolean zE = this.f22349n.e();
        if (this.f22347l.i()) {
            return zE;
        }
        W();
        return true;
    }

    @Override // com.google.android.exoplayer2.source.h
    public void discardBuffer(long j10, boolean z10) {
        w();
        if (C()) {
            return;
        }
        boolean[] zArr = this.f22360y.f22382c;
        int length = this.f22355t.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f22355t[i10].o(j10, z10, zArr[i10]);
        }
    }

    @Override // com.google.android.exoplayer2.source.h
    public long e(long j10, x1 x1Var) {
        w();
        if (!this.f22361z.isSeekable()) {
            return 0L;
        }
        z.a seekPoints = this.f22361z.getSeekPoints(j10);
        return x1Var.a(j10, seekPoints.f63945a.f63838a, seekPoints.f63946b.f63838a);
    }

    @Override // i6.m
    public void endTracks() {
        this.f22357v = true;
        this.f22352q.post(this.f22350o);
    }

    @Override // com.google.android.exoplayer2.source.h
    public void f(h.a aVar, long j10) {
        this.f22353r = aVar;
        this.f22349n.e();
        W();
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public long getBufferedPositionUs() {
        long jA;
        w();
        if (this.L || this.F == 0) {
            return Long.MIN_VALUE;
        }
        if (C()) {
            return this.I;
        }
        if (this.f22359x) {
            int length = this.f22355t.length;
            jA = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                e eVar = this.f22360y;
                if (eVar.f22381b[i10] && eVar.f22382c[i10] && !this.f22355t[i10].C()) {
                    jA = Math.min(jA, this.f22355t[i10].t());
                }
            }
        } else {
            jA = Long.MAX_VALUE;
        }
        if (jA == Long.MAX_VALUE) {
            jA = A(false);
        }
        return jA == Long.MIN_VALUE ? this.H : jA;
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.h
    public i0 getTrackGroups() {
        w();
        return this.f22360y.f22380a;
    }

    @Override // i6.m
    public void h(final z zVar) {
        this.f22352q.post(new Runnable() { // from class: e7.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f60928b.G(zVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public boolean isLoading() {
        return this.f22347l.i() && this.f22349n.d();
    }

    @Override // com.google.android.exoplayer2.source.h
    public void maybeThrowPrepareError() throws IOException {
        K();
        if (this.L && !this.f22358w) {
            throw ParserException.createForMalformedContainer("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.f
    public void onLoaderReleased() {
        for (p pVar : this.f22355t) {
            pVar.L();
        }
        this.f22348m.release();
    }

    @Override // com.google.android.exoplayer2.source.h
    public long readDiscontinuity() {
        if (!this.E) {
            return -9223372036854775807L;
        }
        if (!this.L && z() <= this.K) {
            return -9223372036854775807L;
        }
        this.E = false;
        return this.H;
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public void reevaluateBuffer(long j10) {
    }

    @Override // com.google.android.exoplayer2.source.h
    public long seekToUs(long j10) {
        w();
        boolean[] zArr = this.f22360y.f22381b;
        if (!this.f22361z.isSeekable()) {
            j10 = 0;
        }
        int i10 = 0;
        this.E = false;
        this.H = j10;
        if (C()) {
            this.I = j10;
            return j10;
        }
        if (this.C != 7 && T(zArr, j10)) {
            return j10;
        }
        this.J = false;
        this.I = j10;
        this.L = false;
        if (this.f22347l.i()) {
            p[] pVarArr = this.f22355t;
            int length = pVarArr.length;
            while (i10 < length) {
                pVarArr[i10].p();
                i10++;
            }
            this.f22347l.e();
        } else {
            this.f22347l.f();
            p[] pVarArr2 = this.f22355t;
            int length2 = pVarArr2.length;
            while (i10 < length2) {
                pVarArr2[i10].N();
                i10++;
            }
        }
        return j10;
    }

    @Override // i6.m
    public b0 track(int i10, int i11) {
        return Q(new d(i10, false));
    }

    public final void w() {
        s7.a.g(this.f22358w);
        s7.a.e(this.f22360y);
        s7.a.e(this.f22361z);
    }

    public final boolean x(a aVar, int i10) {
        z zVar;
        if (this.G || !((zVar = this.f22361z) == null || zVar.getDurationUs() == -9223372036854775807L)) {
            this.K = i10;
            return true;
        }
        if (this.f22358w && !X()) {
            this.J = true;
            return false;
        }
        this.E = this.f22358w;
        this.H = 0L;
        this.K = 0;
        for (p pVar : this.f22355t) {
            pVar.N();
        }
        aVar.h(0L, 0L);
        return true;
    }

    public final int z() {
        int iA = 0;
        for (p pVar : this.f22355t) {
            iA += pVar.A();
        }
        return iA;
    }
}
