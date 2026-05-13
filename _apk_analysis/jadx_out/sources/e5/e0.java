package e5;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.metadata.Metadata;
import com.google.android.exoplayer.metadata.icy.IcyHeaders;
import com.google.android.exoplayer.source.TrackGroup;
import com.google.android.exoplayer.source.TrackGroupArray;
import com.google.android.exoplayer.source.UnrecognizedInputFormatException;
import com.google.android.exoplayer.upstream.Loader;
import e4.t0;
import e5.b0;
import e5.h0;
import e5.n;
import e5.q;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k4.s;

/* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
/* JADX INFO: loaded from: classes11.dex */
public final class e0 implements q, k4.i, Loader.b<a>, Loader.f, h0.b {
    public static final Map<String, String> N = v();
    public static final Format O = Format.t("icy", "application/x-icy", Long.MAX_VALUE);
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public boolean G;
    public long H;
    public boolean J;
    public int K;
    public boolean L;
    public boolean M;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f60388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.exoplayer.upstream.a f60389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.exoplayer.drm.a<?> f60390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y5.m f60391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b0.a f60392f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f60393g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y5.b f60394h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final String f60395i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f60396j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f60398l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public q.a f60403q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public k4.s f60404r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public IcyHeaders f60405s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f60408v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f60409w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public d f60410x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f60411y;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Loader f60397k = new Loader("Loader:ProgressiveMediaPeriod");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a6.f f60399m = new a6.f();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Runnable f60400n = new Runnable() { // from class: e5.c0
        @Override // java.lang.Runnable
        public final void run() {
            this.f60375b.D();
        }
    };

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Runnable f60401o = new Runnable() { // from class: e5.d0
        @Override // java.lang.Runnable
        public final void run() {
            this.f60378b.C();
        }
    };

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Handler f60402p = new Handler();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public f[] f60407u = new f[0];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public h0[] f60406t = new h0[0];
    public long I = -9223372036854775807L;
    public long F = -1;
    public long E = -9223372036854775807L;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f60412z = 1;

    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    public final class a implements Loader.e, n.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f60413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final y5.o f60414b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f60415c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final k4.i f60416d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final a6.f f60417e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile boolean f60419g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f60421i;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Nullable
        public k4.u f60424l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f60425m;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final k4.r f60418f = new k4.r();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f60420h = true;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f60423k = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public y5.h f60422j = g(0);

        public a(Uri uri, com.google.android.exoplayer.upstream.a aVar, b bVar, k4.i iVar, a6.f fVar) {
            this.f60413a = uri;
            this.f60414b = new y5.o(aVar);
            this.f60415c = bVar;
            this.f60416d = iVar;
            this.f60417e = fVar;
        }

        @Override // e5.n.a
        public void a(a6.t tVar) {
            long jMax = !this.f60425m ? this.f60421i : Math.max(e0.this.x(), this.f60421i);
            int iA = tVar.a();
            k4.u uVar = (k4.u) a6.a.e(this.f60424l);
            uVar.a(tVar, iA);
            uVar.c(jMax, 1, iA, 0, null);
            this.f60425m = true;
        }

        @Override // com.google.android.exoplayer.upstream.Loader.e
        public void cancelLoad() {
            this.f60419g = true;
        }

        public final y5.h g(long j10) {
            return new y5.h(this.f60413a, j10, -1L, e0.this.f60395i, 6, (Map<String, String>) e0.N);
        }

        public final void h(long j10, long j11) {
            this.f60418f.f72918a = j10;
            this.f60421i = j11;
            this.f60420h = true;
            this.f60425m = false;
        }

        @Override // com.google.android.exoplayer.upstream.Loader.e
        public void load() throws Throwable {
            long position;
            Uri uri;
            k4.d dVar;
            int iC = 0;
            while (iC == 0 && !this.f60419g) {
                k4.d dVar2 = null;
                try {
                    position = this.f60418f.f72918a;
                    y5.h hVarG = g(position);
                    this.f60422j = hVarG;
                    long jA = this.f60414b.a(hVarG);
                    this.f60423k = jA;
                    if (jA != -1) {
                        this.f60423k = jA + position;
                    }
                    uri = (Uri) a6.a.e(this.f60414b.getUri());
                    e0.this.f60405s = IcyHeaders.b(this.f60414b.getResponseHeaders());
                    com.google.android.exoplayer.upstream.a nVar = this.f60414b;
                    if (e0.this.f60405s != null && e0.this.f60405s.f20252g != -1) {
                        nVar = new n(this.f60414b, e0.this.f60405s.f20252g, this);
                        k4.u uVarZ = e0.this.z();
                        this.f60424l = uVarZ;
                        uVarZ.d(e0.O);
                    }
                    dVar = new k4.d(nVar, position, this.f60423k);
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    k4.g gVarB = this.f60415c.b(dVar, this.f60416d, uri);
                    if (e0.this.f60405s != null && (gVarB instanceof p4.e)) {
                        ((p4.e) gVarB).f();
                    }
                    if (this.f60420h) {
                        gVarB.seek(position, this.f60421i);
                        this.f60420h = false;
                    }
                    while (iC == 0 && !this.f60419g) {
                        this.f60417e.a();
                        iC = gVarB.c(dVar, this.f60418f);
                        if (dVar.getPosition() > e0.this.f60396j + position) {
                            position = dVar.getPosition();
                            this.f60417e.b();
                            e0.this.f60402p.post(e0.this.f60401o);
                        }
                    }
                    if (iC == 1) {
                        iC = 0;
                    } else {
                        this.f60418f.f72918a = dVar.getPosition();
                    }
                    a6.k0.m(this.f60414b);
                } catch (Throwable th3) {
                    th = th3;
                    dVar2 = dVar;
                    if (iC != 1 && dVar2 != null) {
                        this.f60418f.f72918a = dVar2.getPosition();
                    }
                    a6.k0.m(this.f60414b);
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k4.g[] f60427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public k4.g f60428b;

        public b(k4.g[] gVarArr) {
            this.f60427a = gVarArr;
        }

        public void a() {
            k4.g gVar = this.f60428b;
            if (gVar != null) {
                gVar.release();
                this.f60428b = null;
            }
        }

        public k4.g b(k4.h hVar, k4.i iVar, Uri uri) throws InterruptedException, IOException {
            k4.g gVar = this.f60428b;
            if (gVar != null) {
                return gVar;
            }
            k4.g[] gVarArr = this.f60427a;
            int i10 = 0;
            if (gVarArr.length == 1) {
                this.f60428b = gVarArr[0];
            } else {
                int length = gVarArr.length;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    k4.g gVar2 = gVarArr[i10];
                    try {
                        if (gVar2.a(hVar)) {
                            this.f60428b = gVar2;
                            hVar.resetPeekPosition();
                            break;
                        }
                        continue;
                    } catch (EOFException unused) {
                    } catch (Throwable th2) {
                        hVar.resetPeekPosition();
                        throw th2;
                    }
                    hVar.resetPeekPosition();
                    i10++;
                }
                if (this.f60428b == null) {
                    throw new UnrecognizedInputFormatException("None of the available extractors (" + a6.k0.E(this.f60427a) + ") could read the stream.", uri);
                }
            }
            this.f60428b.b(iVar);
            return this.f60428b;
        }
    }

    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    public interface c {
        void onSourceInfoRefreshed(long j10, boolean z10, boolean z11);
    }

    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k4.s f60429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TrackGroupArray f60430b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean[] f60431c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean[] f60432d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean[] f60433e;

        public d(k4.s sVar, TrackGroupArray trackGroupArray, boolean[] zArr) {
            this.f60429a = sVar;
            this.f60430b = trackGroupArray;
            this.f60431c = zArr;
            int i10 = trackGroupArray.f20392b;
            this.f60432d = new boolean[i10];
            this.f60433e = new boolean[i10];
        }
    }

    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    public final class e implements i0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f60434b;

        public e(int i10) {
            this.f60434b = i10;
        }

        @Override // e5.i0
        public int b(e4.f0 f0Var, i4.e eVar, boolean z10) {
            return e0.this.M(this.f60434b, f0Var, eVar, z10);
        }

        @Override // e5.i0
        public boolean isReady() {
            return e0.this.B(this.f60434b);
        }

        @Override // e5.i0
        public void maybeThrowError() throws IOException {
            e0.this.H(this.f60434b);
        }

        @Override // e5.i0
        public int skipData(long j10) {
            return e0.this.P(this.f60434b, j10);
        }
    }

    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f60436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f60437b;

        public f(int i10, boolean z10) {
            this.f60436a = i10;
            this.f60437b = z10;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || f.class != obj.getClass()) {
                return false;
            }
            f fVar = (f) obj;
            return this.f60436a == fVar.f60436a && this.f60437b == fVar.f60437b;
        }

        public int hashCode() {
            return (this.f60436a * 31) + (this.f60437b ? 1 : 0);
        }
    }

    public e0(Uri uri, com.google.android.exoplayer.upstream.a aVar, k4.g[] gVarArr, com.google.android.exoplayer.drm.a<?> aVar2, y5.m mVar, b0.a aVar3, c cVar, y5.b bVar, @Nullable String str, int i10) {
        this.f60388b = uri;
        this.f60389c = aVar;
        this.f60390d = aVar2;
        this.f60391e = mVar;
        this.f60392f = aVar3;
        this.f60393g = cVar;
        this.f60394h = bVar;
        this.f60395i = str;
        this.f60396j = i10;
        this.f60398l = new b(gVarArr);
        aVar3.I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C() {
        if (this.M) {
            return;
        }
        ((q.a) a6.a.e(this.f60403q)).c(this);
    }

    public static Map<String, String> v() {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(map);
    }

    public final boolean A() {
        return this.I != -9223372036854775807L;
    }

    public boolean B(int i10) {
        return !R() && this.f60406t[i10].E(this.L);
    }

    public final void D() {
        int i10;
        k4.s sVar = this.f60404r;
        if (this.M || this.f60409w || !this.f60408v || sVar == null) {
            return;
        }
        boolean z10 = false;
        for (h0 h0Var : this.f60406t) {
            if (h0Var.z() == null) {
                return;
            }
        }
        this.f60399m.b();
        int length = this.f60406t.length;
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        boolean[] zArr = new boolean[length];
        this.E = sVar.getDurationUs();
        for (int i11 = 0; i11 < length; i11++) {
            Format formatZ = this.f60406t[i11].z();
            String str = formatZ.f19927j;
            boolean zL = a6.p.l(str);
            boolean z11 = zL || a6.p.n(str);
            zArr[i11] = z11;
            this.f60411y = z11 | this.f60411y;
            IcyHeaders icyHeaders = this.f60405s;
            if (icyHeaders != null) {
                if (zL || this.f60407u[i11].f60437b) {
                    Metadata metadata = formatZ.f19925h;
                    formatZ = formatZ.l(metadata == null ? new Metadata(icyHeaders) : metadata.b(icyHeaders));
                }
                if (zL && formatZ.f19923f == -1 && (i10 = icyHeaders.f20247b) != -1) {
                    formatZ = formatZ.c(i10);
                }
            }
            DrmInitData drmInitData = formatZ.f19930m;
            if (drmInitData != null) {
                formatZ = formatZ.f(this.f60390d.e(drmInitData));
            }
            trackGroupArr[i11] = new TrackGroup(formatZ);
        }
        if (this.F == -1 && sVar.getDurationUs() == -9223372036854775807L) {
            z10 = true;
        }
        this.G = z10;
        this.f60412z = z10 ? 7 : 1;
        this.f60410x = new d(sVar, new TrackGroupArray(trackGroupArr), zArr);
        this.f60409w = true;
        this.f60393g.onSourceInfoRefreshed(this.E, sVar.isSeekable(), this.G);
        ((q.a) a6.a.e(this.f60403q)).d(this);
    }

    public final void E(int i10) {
        d dVarY = y();
        boolean[] zArr = dVarY.f60433e;
        if (zArr[i10]) {
            return;
        }
        Format formatB = dVarY.f60430b.b(i10).b(0);
        this.f60392f.l(a6.p.h(formatB.f19927j), formatB, 0, null, this.H);
        zArr[i10] = true;
    }

    public final void F(int i10) {
        boolean[] zArr = y().f60431c;
        if (this.J && zArr[i10]) {
            if (this.f60406t[i10].E(false)) {
                return;
            }
            this.I = 0L;
            this.J = false;
            this.B = true;
            this.H = 0L;
            this.K = 0;
            for (h0 h0Var : this.f60406t) {
                h0Var.O();
            }
            ((q.a) a6.a.e(this.f60403q)).c(this);
        }
    }

    public void G() throws IOException {
        this.f60397k.j(this.f60391e.getMinimumLoadableRetryCount(this.f60412z));
    }

    public void H(int i10) throws IOException {
        this.f60406t[i10].G();
        G();
    }

    @Override // com.google.android.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void l(a aVar, long j10, long j11, boolean z10) {
        this.f60392f.x(aVar.f60422j, aVar.f60414b.d(), aVar.f60414b.e(), 1, -1, null, 0, null, aVar.f60421i, this.E, j10, j11, aVar.f60414b.c());
        if (z10) {
            return;
        }
        u(aVar);
        for (h0 h0Var : this.f60406t) {
            h0Var.O();
        }
        if (this.D > 0) {
            ((q.a) a6.a.e(this.f60403q)).c(this);
        }
    }

    @Override // com.google.android.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void j(a aVar, long j10, long j11) {
        k4.s sVar;
        if (this.E == -9223372036854775807L && (sVar = this.f60404r) != null) {
            boolean zIsSeekable = sVar.isSeekable();
            long jX = x();
            long j12 = jX == Long.MIN_VALUE ? 0L : jX + 10000;
            this.E = j12;
            this.f60393g.onSourceInfoRefreshed(j12, zIsSeekable, this.G);
        }
        this.f60392f.A(aVar.f60422j, aVar.f60414b.d(), aVar.f60414b.e(), 1, -1, null, 0, null, aVar.f60421i, this.E, j10, j11, aVar.f60414b.c());
        u(aVar);
        this.L = true;
        ((q.a) a6.a.e(this.f60403q)).c(this);
    }

    @Override // com.google.android.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public Loader.c g(a aVar, long j10, long j11, IOException iOException, int i10) {
        boolean z10;
        a aVar2;
        Loader.c cVarG;
        u(aVar);
        long jB = this.f60391e.b(this.f60412z, j11, iOException, i10);
        if (jB == -9223372036854775807L) {
            cVarG = Loader.f21019g;
        } else {
            int iW = w();
            if (iW > this.K) {
                aVar2 = aVar;
                z10 = true;
            } else {
                z10 = false;
                aVar2 = aVar;
            }
            cVarG = t(aVar2, iW) ? Loader.g(z10, jB) : Loader.f21018f;
        }
        this.f60392f.D(aVar.f60422j, aVar.f60414b.d(), aVar.f60414b.e(), 1, -1, null, 0, null, aVar.f60421i, this.E, j10, j11, aVar.f60414b.c(), iOException, !cVarG.c());
        return cVarG;
    }

    public final k4.u L(f fVar) {
        int length = this.f60406t.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (fVar.equals(this.f60407u[i10])) {
                return this.f60406t[i10];
            }
        }
        h0 h0Var = new h0(this.f60394h, this.f60402p.getLooper(), this.f60390d);
        h0Var.V(this);
        int i11 = length + 1;
        f[] fVarArr = (f[]) Arrays.copyOf(this.f60407u, i11);
        fVarArr[length] = fVar;
        this.f60407u = (f[]) a6.k0.j(fVarArr);
        h0[] h0VarArr = (h0[]) Arrays.copyOf(this.f60406t, i11);
        h0VarArr[length] = h0Var;
        this.f60406t = (h0[]) a6.k0.j(h0VarArr);
        return h0Var;
    }

    public int M(int i10, e4.f0 f0Var, i4.e eVar, boolean z10) {
        if (R()) {
            return -3;
        }
        E(i10);
        int iK = this.f60406t[i10].K(f0Var, eVar, z10, this.L, this.H);
        if (iK == -3) {
            F(i10);
        }
        return iK;
    }

    public void N() {
        if (this.f60409w) {
            for (h0 h0Var : this.f60406t) {
                h0Var.J();
            }
        }
        this.f60397k.l(this);
        this.f60402p.removeCallbacksAndMessages(null);
        this.f60403q = null;
        this.M = true;
        this.f60392f.J();
    }

    public final boolean O(boolean[] zArr, long j10) {
        int length = this.f60406t.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.f60406t[i10].S(j10, false) && (zArr[i10] || !this.f60411y)) {
                return false;
            }
        }
        return true;
    }

    public int P(int i10, long j10) {
        if (R()) {
            return 0;
        }
        E(i10);
        h0 h0Var = this.f60406t[i10];
        int iE = (!this.L || j10 <= h0Var.v()) ? h0Var.e(j10) : h0Var.f();
        if (iE == 0) {
            F(i10);
        }
        return iE;
    }

    public final void Q() {
        a aVar = new a(this.f60388b, this.f60389c, this.f60398l, this, this.f60399m);
        if (this.f60409w) {
            k4.s sVar = y().f60429a;
            a6.a.f(A());
            long j10 = this.E;
            if (j10 != -9223372036854775807L && this.I > j10) {
                this.L = true;
                this.I = -9223372036854775807L;
                return;
            } else {
                aVar.h(sVar.getSeekPoints(this.I).f72919a.f72925b, this.I);
                this.I = -9223372036854775807L;
            }
        }
        this.K = w();
        this.f60392f.G(aVar.f60422j, 1, -1, null, 0, null, aVar.f60421i, this.E, this.f60397k.m(aVar, this, this.f60391e.getMinimumLoadableRetryCount(this.f60412z)));
    }

    public final boolean R() {
        return this.B || A();
    }

    @Override // e5.q
    public long a(long j10, t0 t0Var) {
        k4.s sVar = y().f60429a;
        if (!sVar.isSeekable()) {
            return 0L;
        }
        s.a seekPoints = sVar.getSeekPoints(j10);
        return a6.k0.x0(j10, t0Var, seekPoints.f72919a.f72924a, seekPoints.f72920b.f72924a);
    }

    @Override // e5.h0.b
    public void b(Format format) {
        this.f60402p.post(this.f60400n);
    }

    @Override // k4.i
    public void c(k4.s sVar) {
        if (this.f60405s != null) {
            sVar = new s.b(-9223372036854775807L);
        }
        this.f60404r = sVar;
        this.f60402p.post(this.f60400n);
    }

    @Override // e5.q, e5.j0
    public boolean continueLoading(long j10) {
        if (this.L || this.f60397k.h() || this.J) {
            return false;
        }
        if (this.f60409w && this.D == 0) {
            return false;
        }
        boolean zD = this.f60399m.d();
        if (this.f60397k.i()) {
            return zD;
        }
        Q();
        return true;
    }

    @Override // e5.q
    public void discardBuffer(long j10, boolean z10) {
        if (A()) {
            return;
        }
        boolean[] zArr = y().f60432d;
        int length = this.f60406t.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f60406t[i10].m(j10, z10, zArr[i10]);
        }
    }

    @Override // e5.q
    public long e(com.google.android.exoplayer.trackselection.c[] cVarArr, boolean[] zArr, i0[] i0VarArr, boolean[] zArr2, long j10) {
        com.google.android.exoplayer.trackselection.c cVar;
        d dVarY = y();
        TrackGroupArray trackGroupArray = dVarY.f60430b;
        boolean[] zArr3 = dVarY.f60432d;
        int i10 = this.D;
        int i11 = 0;
        for (int i12 = 0; i12 < cVarArr.length; i12++) {
            i0 i0Var = i0VarArr[i12];
            if (i0Var != null && (cVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((e) i0Var).f60434b;
                a6.a.f(zArr3[i13]);
                this.D--;
                zArr3[i13] = false;
                i0VarArr[i12] = null;
            }
        }
        boolean z10 = !this.A ? j10 == 0 : i10 != 0;
        for (int i14 = 0; i14 < cVarArr.length; i14++) {
            if (i0VarArr[i14] == null && (cVar = cVarArr[i14]) != null) {
                a6.a.f(cVar.length() == 1);
                a6.a.f(cVar.getIndexInTrackGroup(0) == 0);
                int iC = trackGroupArray.c(cVar.getTrackGroup());
                a6.a.f(!zArr3[iC]);
                this.D++;
                zArr3[iC] = true;
                i0VarArr[i14] = new e(iC);
                zArr2[i14] = true;
                if (!z10) {
                    h0 h0Var = this.f60406t[iC];
                    z10 = (h0Var.S(j10, true) || h0Var.x() == 0) ? false : true;
                }
            }
        }
        if (this.D == 0) {
            this.J = false;
            this.B = false;
            if (this.f60397k.i()) {
                h0[] h0VarArr = this.f60406t;
                int length = h0VarArr.length;
                while (i11 < length) {
                    h0VarArr[i11].n();
                    i11++;
                }
                this.f60397k.e();
            } else {
                h0[] h0VarArr2 = this.f60406t;
                int length2 = h0VarArr2.length;
                while (i11 < length2) {
                    h0VarArr2[i11].O();
                    i11++;
                }
            }
        } else if (z10) {
            j10 = seekToUs(j10);
            while (i11 < i0VarArr.length) {
                if (i0VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.A = true;
        return j10;
    }

    @Override // k4.i
    public void endTracks() {
        this.f60408v = true;
        this.f60402p.post(this.f60400n);
    }

    @Override // e5.q
    public void f(q.a aVar, long j10) {
        this.f60403q = aVar;
        this.f60399m.d();
        Q();
    }

    @Override // e5.q, e5.j0
    public long getBufferedPositionUs() {
        long jX;
        boolean[] zArr = y().f60431c;
        if (this.L) {
            return Long.MIN_VALUE;
        }
        if (A()) {
            return this.I;
        }
        if (this.f60411y) {
            int length = this.f60406t.length;
            jX = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                if (zArr[i10] && !this.f60406t[i10].D()) {
                    jX = Math.min(jX, this.f60406t[i10].v());
                }
            }
        } else {
            jX = Long.MAX_VALUE;
        }
        if (jX == Long.MAX_VALUE) {
            jX = x();
        }
        return jX == Long.MIN_VALUE ? this.H : jX;
    }

    @Override // e5.q, e5.j0
    public long getNextLoadPositionUs() {
        if (this.D == 0) {
            return Long.MIN_VALUE;
        }
        return getBufferedPositionUs();
    }

    @Override // e5.q
    public TrackGroupArray getTrackGroups() {
        return y().f60430b;
    }

    @Override // e5.q, e5.j0
    public boolean isLoading() {
        return this.f60397k.i() && this.f60399m.c();
    }

    @Override // e5.q
    public void maybeThrowPrepareError() throws IOException {
        G();
        if (this.L && !this.f60409w) {
            throw new ParserException("Loading finished before preparation is complete.");
        }
    }

    @Override // com.google.android.exoplayer.upstream.Loader.f
    public void onLoaderReleased() {
        for (h0 h0Var : this.f60406t) {
            h0Var.M();
        }
        this.f60398l.a();
    }

    @Override // e5.q
    public long readDiscontinuity() {
        if (!this.C) {
            this.f60392f.L();
            this.C = true;
        }
        if (!this.B) {
            return -9223372036854775807L;
        }
        if (!this.L && w() <= this.K) {
            return -9223372036854775807L;
        }
        this.B = false;
        return this.H;
    }

    @Override // e5.q, e5.j0
    public void reevaluateBuffer(long j10) {
    }

    @Override // e5.q
    public long seekToUs(long j10) {
        d dVarY = y();
        k4.s sVar = dVarY.f60429a;
        boolean[] zArr = dVarY.f60431c;
        if (!sVar.isSeekable()) {
            j10 = 0;
        }
        this.B = false;
        this.H = j10;
        if (A()) {
            this.I = j10;
            return j10;
        }
        if (this.f60412z != 7 && O(zArr, j10)) {
            return j10;
        }
        this.J = false;
        this.I = j10;
        this.L = false;
        if (this.f60397k.i()) {
            this.f60397k.e();
        } else {
            this.f60397k.f();
            for (h0 h0Var : this.f60406t) {
                h0Var.O();
            }
        }
        return j10;
    }

    public final boolean t(a aVar, int i10) {
        k4.s sVar;
        if (this.F != -1 || ((sVar = this.f60404r) != null && sVar.getDurationUs() != -9223372036854775807L)) {
            this.K = i10;
            return true;
        }
        if (this.f60409w && !R()) {
            this.J = true;
            return false;
        }
        this.B = this.f60409w;
        this.H = 0L;
        this.K = 0;
        for (h0 h0Var : this.f60406t) {
            h0Var.O();
        }
        aVar.h(0L, 0L);
        return true;
    }

    @Override // k4.i
    public k4.u track(int i10, int i11) {
        return L(new f(i10, false));
    }

    public final void u(a aVar) {
        if (this.F == -1) {
            this.F = aVar.f60423k;
        }
    }

    public final int w() {
        int iA = 0;
        for (h0 h0Var : this.f60406t) {
            iA += h0Var.A();
        }
        return iA;
    }

    public final long x() {
        long jMax = Long.MIN_VALUE;
        for (h0 h0Var : this.f60406t) {
            jMax = Math.max(jMax, h0Var.v());
        }
        return jMax;
    }

    public final d y() {
        return (d) a6.a.e(this.f60410x);
    }

    public k4.u z() {
        return L(new f(0, true));
    }
}
