package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.h;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.p;
import com.google.android.exoplayer2.s;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.h;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.w;
import com.google.android.exoplayer2.y;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import d6.b1;
import d6.h1;
import d6.i1;
import d6.o1;
import d6.u1;
import d6.v1;
import d6.x1;
import e6.s1;
import e7.i0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import q7.a0;
import s7.m0;

/* JADX INFO: compiled from: ExoPlayerImplInternal.java */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements Handler.Callback, h.a, a0.a, s.d, h.a, w.a {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;

    @Nullable
    public h L;
    public long M;
    public int N;
    public boolean O;

    @Nullable
    public ExoPlaybackException P;
    public long Q;
    public long R = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y[] f21686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<y> f21687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u1[] f21688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q7.a0 f21689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q7.b0 f21690f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b1 f21691g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r7.d f21692h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s7.m f21693i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HandlerThread f21694j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Looper f21695k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c0.d f21696l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c0.b f21697m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f21698n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f21699o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.google.android.exoplayer2.h f21700p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList<d> f21701q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final s7.d f21702r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f21703s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r f21704t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final s f21705u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final o f21706v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f21707w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public x1 f21708x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public o1 f21709y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public e f21710z;

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public class a implements y.a {
        public a() {
        }

        @Override // com.google.android.exoplayer2.y.a
        public void onSleep() {
            l.this.I = true;
        }

        @Override // com.google.android.exoplayer2.y.a
        public void onWakeup() {
            l.this.f21693i.sendEmptyMessage(2);
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<s.c> f21712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e7.c0 f21713b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f21714c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f21715d;

        public b(List<s.c> list, e7.c0 c0Var, int i10, long j10) {
            this.f21712a = list;
            this.f21713b = c0Var;
            this.f21714c = i10;
            this.f21715d = j10;
        }

        public /* synthetic */ b(List list, e7.c0 c0Var, int i10, long j10, a aVar) {
            this(list, c0Var, i10, j10);
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f21717b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f21718c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e7.c0 f21719d;
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static final class d implements Comparable<d> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final w f21720b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f21721c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f21722d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public Object f21723e;

        public d(w wVar) {
            this.f21720b = wVar;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            Object obj = this.f21723e;
            if ((obj == null) != (dVar.f21723e == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i10 = this.f21721c - dVar.f21721c;
            return i10 != 0 ? i10 : m0.n(this.f21722d, dVar.f21722d);
        }

        public void b(int i10, long j10, Object obj) {
            this.f21721c = i10;
            this.f21722d = j10;
            this.f21723e = obj;
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f21724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public o1 f21725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f21726c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f21727d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f21728e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f21729f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f21730g;

        public e(o1 o1Var) {
            this.f21725b = o1Var;
        }

        public void b(int i10) {
            this.f21724a |= i10 > 0;
            this.f21726c += i10;
        }

        public void c(int i10) {
            this.f21724a = true;
            this.f21729f = true;
            this.f21730g = i10;
        }

        public void d(o1 o1Var) {
            this.f21724a |= this.f21725b != o1Var;
            this.f21725b = o1Var;
        }

        public void e(int i10) {
            if (this.f21727d && this.f21728e != 5) {
                s7.a.a(i10 == 5);
                return;
            }
            this.f21724a = true;
            this.f21727d = true;
            this.f21728e = i10;
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public interface f {
        void a(e eVar);
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i.b f21731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f21732b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f21733c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f21734d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f21735e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f21736f;

        public g(i.b bVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f21731a = bVar;
            this.f21732b = j10;
            this.f21733c = j11;
            this.f21734d = z10;
            this.f21735e = z11;
            this.f21736f = z12;
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c0 f21737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f21738b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f21739c;

        public h(c0 c0Var, int i10, long j10) {
            this.f21737a = c0Var;
            this.f21738b = i10;
            this.f21739c = j10;
        }
    }

    public l(y[] yVarArr, q7.a0 a0Var, q7.b0 b0Var, b1 b1Var, r7.d dVar, int i10, boolean z10, e6.a aVar, x1 x1Var, o oVar, long j10, boolean z11, Looper looper, s7.d dVar2, f fVar, s1 s1Var) {
        this.f21703s = fVar;
        this.f21686b = yVarArr;
        this.f21689e = a0Var;
        this.f21690f = b0Var;
        this.f21691g = b1Var;
        this.f21692h = dVar;
        this.F = i10;
        this.G = z10;
        this.f21708x = x1Var;
        this.f21706v = oVar;
        this.f21707w = j10;
        this.Q = j10;
        this.B = z11;
        this.f21702r = dVar2;
        this.f21698n = b1Var.getBackBufferDurationUs();
        this.f21699o = b1Var.retainBackBufferFromKeyframe();
        o1 o1VarJ = o1.j(b0Var);
        this.f21709y = o1VarJ;
        this.f21710z = new e(o1VarJ);
        this.f21688d = new u1[yVarArr.length];
        for (int i11 = 0; i11 < yVarArr.length; i11++) {
            yVarArr[i11].d(i11, s1Var);
            this.f21688d[i11] = yVarArr[i11].getCapabilities();
        }
        this.f21700p = new com.google.android.exoplayer2.h(this, dVar2);
        this.f21701q = new ArrayList<>();
        this.f21687c = Sets.h();
        this.f21696l = new c0.d();
        this.f21697m = new c0.b();
        a0Var.c(this, dVar);
        this.O = true;
        Handler handler = new Handler(looper);
        this.f21704t = new r(aVar, handler);
        this.f21705u = new s(this, aVar, handler, s1Var);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f21694j = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f21695k = looper2;
        this.f21693i = dVar2.createHandler(looper2, this);
    }

    public static boolean L(boolean z10, i.b bVar, long j10, i.b bVar2, c0.b bVar3, long j11) {
        if (!z10 && j10 == j11 && bVar.f60899a.equals(bVar2.f60899a)) {
            return (bVar.b() && bVar3.t(bVar.f60900b)) ? (bVar3.k(bVar.f60900b, bVar.f60901c) == 4 || bVar3.k(bVar.f60900b, bVar.f60901c) == 2) ? false : true : bVar2.b() && bVar3.t(bVar2.f60900b);
        }
        return false;
    }

    public static boolean N(y yVar) {
        return yVar.getState() != 0;
    }

    public static boolean P(o1 o1Var, c0.b bVar) {
        i.b bVar2 = o1Var.f59666b;
        c0 c0Var = o1Var.f59665a;
        return c0Var.u() || c0Var.l(bVar2.f60899a, bVar).f21392g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean Q() {
        return Boolean.valueOf(this.A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(w wVar) {
        try {
            k(wVar);
        } catch (ExoPlaybackException e10) {
            s7.q.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    public static void q0(c0 c0Var, d dVar, c0.d dVar2, c0.b bVar) {
        int i10 = c0Var.r(c0Var.l(dVar.f21723e, bVar).f21389d, dVar2).f21417q;
        Object obj = c0Var.k(i10, bVar, true).f21388c;
        long j10 = bVar.f21390e;
        dVar.b(i10, j10 != -9223372036854775807L ? j10 - 1 : Long.MAX_VALUE, obj);
    }

    public static boolean r0(d dVar, c0 c0Var, c0 c0Var2, int i10, boolean z10, c0.d dVar2, c0.b bVar) {
        Object obj = dVar.f21723e;
        if (obj == null) {
            Pair<Object, Long> pairU0 = u0(c0Var, new h(dVar.f21720b.h(), dVar.f21720b.d(), dVar.f21720b.f() == Long.MIN_VALUE ? -9223372036854775807L : m0.w0(dVar.f21720b.f())), false, i10, z10, dVar2, bVar);
            if (pairU0 == null) {
                return false;
            }
            dVar.b(c0Var.f(pairU0.first), ((Long) pairU0.second).longValue(), pairU0.first);
            if (dVar.f21720b.f() == Long.MIN_VALUE) {
                q0(c0Var, dVar, dVar2, bVar);
            }
            return true;
        }
        int iF = c0Var.f(obj);
        if (iF == -1) {
            return false;
        }
        if (dVar.f21720b.f() == Long.MIN_VALUE) {
            q0(c0Var, dVar, dVar2, bVar);
            return true;
        }
        dVar.f21721c = iF;
        c0Var2.l(dVar.f21723e, bVar);
        if (bVar.f21392g && c0Var2.r(bVar.f21389d, dVar2).f21416p == c0Var2.f(dVar.f21723e)) {
            Pair<Object, Long> pairN = c0Var.n(dVar2, bVar, c0Var.l(dVar.f21723e, bVar).f21389d, dVar.f21722d + bVar.q());
            dVar.b(c0Var.f(pairN.first), ((Long) pairN.second).longValue(), pairN.first);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.l.g t0(com.google.android.exoplayer2.c0 r30, d6.o1 r31, @androidx.annotation.Nullable com.google.android.exoplayer2.l.h r32, com.google.android.exoplayer2.r r33, int r34, boolean r35, com.google.android.exoplayer2.c0.d r36, com.google.android.exoplayer2.c0.b r37) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.l.t0(com.google.android.exoplayer2.c0, d6.o1, com.google.android.exoplayer2.l$h, com.google.android.exoplayer2.r, int, boolean, com.google.android.exoplayer2.c0$d, com.google.android.exoplayer2.c0$b):com.google.android.exoplayer2.l$g");
    }

    public static m[] u(q7.r rVar) {
        int length = rVar != null ? rVar.length() : 0;
        m[] mVarArr = new m[length];
        for (int i10 = 0; i10 < length; i10++) {
            mVarArr[i10] = rVar.getFormat(i10);
        }
        return mVarArr;
    }

    @Nullable
    public static Pair<Object, Long> u0(c0 c0Var, h hVar, boolean z10, int i10, boolean z11, c0.d dVar, c0.b bVar) {
        Pair<Object, Long> pairN;
        Object objV0;
        c0 c0Var2 = hVar.f21737a;
        if (c0Var.u()) {
            return null;
        }
        c0 c0Var3 = c0Var2.u() ? c0Var : c0Var2;
        try {
            pairN = c0Var3.n(dVar, bVar, hVar.f21738b, hVar.f21739c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (c0Var.equals(c0Var3)) {
            return pairN;
        }
        if (c0Var.f(pairN.first) != -1) {
            return (c0Var3.l(pairN.first, bVar).f21392g && c0Var3.r(bVar.f21389d, dVar).f21416p == c0Var3.f(pairN.first)) ? c0Var.n(dVar, bVar, c0Var.l(pairN.first, bVar).f21389d, hVar.f21739c) : pairN;
        }
        if (z10 && (objV0 = v0(dVar, bVar, i10, z11, pairN.first, c0Var3, c0Var)) != null) {
            return c0Var.n(dVar, bVar, c0Var.l(objV0, bVar).f21389d, -9223372036854775807L);
        }
        return null;
    }

    @Nullable
    public static Object v0(c0.d dVar, c0.b bVar, int i10, boolean z10, Object obj, c0 c0Var, c0 c0Var2) {
        int iF = c0Var.f(obj);
        int iM = c0Var.m();
        int iH = iF;
        int iF2 = -1;
        for (int i11 = 0; i11 < iM && iF2 == -1; i11++) {
            iH = c0Var.h(iH, bVar, dVar, i10, z10);
            if (iH == -1) {
                break;
            }
            iF2 = c0Var2.f(c0Var.q(iH));
        }
        if (iF2 == -1) {
            return null;
        }
        return c0Var2.q(iF2);
    }

    public final long A(long j10) {
        h1 h1VarJ = this.f21704t.j();
        if (h1VarJ == null) {
            return 0L;
        }
        return Math.max(0L, j10 - h1VarJ.y(this.M));
    }

    public final long A0(i.b bVar, long j10, boolean z10) throws ExoPlaybackException {
        return B0(bVar, j10, this.f21704t.p() != this.f21704t.q(), z10);
    }

    public final void B(com.google.android.exoplayer2.source.h hVar) {
        if (this.f21704t.v(hVar)) {
            this.f21704t.y(this.M);
            S();
        }
    }

    public final long B0(i.b bVar, long j10, boolean z10, boolean z11) throws ExoPlaybackException {
        f1();
        this.D = false;
        if (z11 || this.f21709y.f59669e == 3) {
            W0(2);
        }
        h1 h1VarP = this.f21704t.p();
        h1 h1VarJ = h1VarP;
        while (h1VarJ != null && !bVar.equals(h1VarJ.f59622f.f59638a)) {
            h1VarJ = h1VarJ.j();
        }
        if (z10 || h1VarP != h1VarJ || (h1VarJ != null && h1VarJ.z(j10) < 0)) {
            for (y yVar : this.f21686b) {
                l(yVar);
            }
            if (h1VarJ != null) {
                while (this.f21704t.p() != h1VarJ) {
                    this.f21704t.b();
                }
                this.f21704t.z(h1VarJ);
                h1VarJ.x(1000000000000L);
                o();
            }
        }
        if (h1VarJ != null) {
            this.f21704t.z(h1VarJ);
            if (!h1VarJ.f59620d) {
                h1VarJ.f59622f = h1VarJ.f59622f.b(j10);
            } else if (h1VarJ.f59621e) {
                long jSeekToUs = h1VarJ.f59617a.seekToUs(j10);
                h1VarJ.f59617a.discardBuffer(jSeekToUs - this.f21698n, this.f21699o);
                j10 = jSeekToUs;
            }
            p0(j10);
            S();
        } else {
            this.f21704t.f();
            p0(j10);
        }
        D(false);
        this.f21693i.sendEmptyMessage(2);
        return j10;
    }

    public final void C(IOException iOException, int i10) {
        ExoPlaybackException exoPlaybackExceptionCreateForSource = ExoPlaybackException.createForSource(iOException, i10);
        h1 h1VarP = this.f21704t.p();
        if (h1VarP != null) {
            exoPlaybackExceptionCreateForSource = exoPlaybackExceptionCreateForSource.copyWithMediaPeriodId(h1VarP.f59622f.f59638a);
        }
        s7.q.d("ExoPlayerImplInternal", "Playback error", exoPlaybackExceptionCreateForSource);
        e1(false, false);
        this.f21709y = this.f21709y.e(exoPlaybackExceptionCreateForSource);
    }

    public final void C0(w wVar) throws ExoPlaybackException {
        if (wVar.f() == -9223372036854775807L) {
            D0(wVar);
            return;
        }
        if (this.f21709y.f59665a.u()) {
            this.f21701q.add(new d(wVar));
            return;
        }
        d dVar = new d(wVar);
        c0 c0Var = this.f21709y.f59665a;
        if (!r0(dVar, c0Var, c0Var, this.F, this.G, this.f21696l, this.f21697m)) {
            wVar.j(false);
        } else {
            this.f21701q.add(dVar);
            Collections.sort(this.f21701q);
        }
    }

    public final void D(boolean z10) {
        h1 h1VarJ = this.f21704t.j();
        i.b bVar = h1VarJ == null ? this.f21709y.f59666b : h1VarJ.f59622f.f59638a;
        boolean z11 = !this.f21709y.f59675k.equals(bVar);
        if (z11) {
            this.f21709y = this.f21709y.b(bVar);
        }
        o1 o1Var = this.f21709y;
        o1Var.f59680p = h1VarJ == null ? o1Var.f59682r : h1VarJ.i();
        this.f21709y.f59681q = z();
        if ((z11 || z10) && h1VarJ != null && h1VarJ.f59620d) {
            h1(h1VarJ.n(), h1VarJ.o());
        }
    }

    public final void D0(w wVar) throws ExoPlaybackException {
        if (wVar.c() != this.f21695k) {
            this.f21693i.obtainMessage(15, wVar).sendToTarget();
            return;
        }
        k(wVar);
        int i10 = this.f21709y.f59669e;
        if (i10 == 3 || i10 == 2) {
            this.f21693i.sendEmptyMessage(2);
        }
    }

    public final void E(c0 c0Var, boolean z10) throws Throwable {
        int i10;
        int i11;
        boolean z11;
        g gVarT0 = t0(c0Var, this.f21709y, this.L, this.f21704t, this.F, this.G, this.f21696l, this.f21697m);
        i.b bVar = gVarT0.f21731a;
        long j10 = gVarT0.f21733c;
        boolean z12 = gVarT0.f21734d;
        long jA0 = gVarT0.f21732b;
        boolean z13 = (this.f21709y.f59666b.equals(bVar) && jA0 == this.f21709y.f59682r) ? false : true;
        h hVar = null;
        try {
            if (gVarT0.f21735e) {
                if (this.f21709y.f59669e != 1) {
                    W0(4);
                }
                n0(false, false, false, true);
            }
            try {
                if (z13) {
                    i11 = 4;
                    z11 = false;
                    if (!c0Var.u()) {
                        for (h1 h1VarP = this.f21704t.p(); h1VarP != null; h1VarP = h1VarP.j()) {
                            if (h1VarP.f59622f.f59638a.equals(bVar)) {
                                h1VarP.f59622f = this.f21704t.r(c0Var, h1VarP.f59622f);
                                h1VarP.A();
                            }
                        }
                        jA0 = A0(bVar, jA0, z12);
                    }
                } else {
                    try {
                        i11 = 4;
                        z11 = false;
                        if (!this.f21704t.F(c0Var, this.M, w())) {
                            y0(false);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        i10 = 4;
                        o1 o1Var = this.f21709y;
                        h hVar2 = hVar;
                        k1(c0Var, bVar, o1Var.f59665a, o1Var.f59666b, gVarT0.f21736f ? jA0 : -9223372036854775807L);
                        if (z13 || j10 != this.f21709y.f59667c) {
                            o1 o1Var2 = this.f21709y;
                            Object obj = o1Var2.f59666b.f60899a;
                            c0 c0Var2 = o1Var2.f59665a;
                            this.f21709y = I(bVar, jA0, j10, this.f21709y.f59668d, z13 && z10 && !c0Var2.u() && !c0Var2.l(obj, this.f21697m).f21392g, c0Var.f(obj) == -1 ? i10 : 3);
                        }
                        o0();
                        s0(c0Var, this.f21709y.f59665a);
                        this.f21709y = this.f21709y.i(c0Var);
                        if (!c0Var.u()) {
                            this.L = hVar2;
                        }
                        D(false);
                        throw th;
                    }
                }
                o1 o1Var3 = this.f21709y;
                k1(c0Var, bVar, o1Var3.f59665a, o1Var3.f59666b, gVarT0.f21736f ? jA0 : -9223372036854775807L);
                if (z13 || j10 != this.f21709y.f59667c) {
                    o1 o1Var4 = this.f21709y;
                    Object obj2 = o1Var4.f59666b.f60899a;
                    c0 c0Var3 = o1Var4.f59665a;
                    this.f21709y = I(bVar, jA0, j10, this.f21709y.f59668d, (!z13 || !z10 || c0Var3.u() || c0Var3.l(obj2, this.f21697m).f21392g) ? z11 : true, c0Var.f(obj2) == -1 ? i11 : 3);
                }
                o0();
                s0(c0Var, this.f21709y.f59665a);
                this.f21709y = this.f21709y.i(c0Var);
                if (!c0Var.u()) {
                    this.L = null;
                }
                D(z11);
            } catch (Throwable th3) {
                th = th3;
                hVar = null;
            }
        } catch (Throwable th4) {
            th = th4;
            i10 = 4;
        }
    }

    public final void E0(final w wVar) {
        Looper looperC = wVar.c();
        if (looperC.getThread().isAlive()) {
            this.f21702r.createHandler(looperC, null).post(new Runnable() { // from class: d6.w0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f59709b.R(wVar);
                }
            });
        } else {
            s7.q.i("TAG", "Trying to send message on a dead thread.");
            wVar.j(false);
        }
    }

    public final void F(com.google.android.exoplayer2.source.h hVar) throws ExoPlaybackException {
        if (this.f21704t.v(hVar)) {
            h1 h1VarJ = this.f21704t.j();
            h1VarJ.p(this.f21700p.getPlaybackParameters().f22486b, this.f21709y.f59665a);
            h1(h1VarJ.n(), h1VarJ.o());
            if (h1VarJ == this.f21704t.p()) {
                p0(h1VarJ.f59622f.f59639b);
                o();
                o1 o1Var = this.f21709y;
                i.b bVar = o1Var.f59666b;
                long j10 = h1VarJ.f59622f.f59639b;
                this.f21709y = I(bVar, j10, o1Var.f59667c, j10, false, 5);
            }
            S();
        }
    }

    public final void F0(long j10) {
        for (y yVar : this.f21686b) {
            if (yVar.getStream() != null) {
                G0(yVar, j10);
            }
        }
    }

    public final void G(u uVar, float f10, boolean z10, boolean z11) throws ExoPlaybackException {
        if (z10) {
            if (z11) {
                this.f21710z.b(1);
            }
            this.f21709y = this.f21709y.f(uVar);
        }
        l1(uVar.f22486b);
        for (y yVar : this.f21686b) {
            if (yVar != null) {
                yVar.setPlaybackSpeed(f10, uVar.f22486b);
            }
        }
    }

    public final void G0(y yVar, long j10) {
        yVar.setCurrentStreamFinal();
        if (yVar instanceof g7.p) {
            ((g7.p) yVar).H(j10);
        }
    }

    public final void H(u uVar, boolean z10) throws ExoPlaybackException {
        G(uVar, uVar.f22486b, true, z10);
    }

    public final void H0(boolean z10, @Nullable AtomicBoolean atomicBoolean) {
        if (this.H != z10) {
            this.H = z10;
            if (!z10) {
                for (y yVar : this.f21686b) {
                    if (!N(yVar) && this.f21687c.remove(yVar)) {
                        yVar.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    @CheckResult
    public final o1 I(i.b bVar, long j10, long j11, long j12, boolean z10, int i10) {
        List<Metadata> listOf;
        i0 i0Var;
        q7.b0 b0Var;
        this.O = (!this.O && j10 == this.f21709y.f59682r && bVar.equals(this.f21709y.f59666b)) ? false : true;
        o0();
        o1 o1Var = this.f21709y;
        i0 i0Var2 = o1Var.f59672h;
        q7.b0 b0Var2 = o1Var.f59673i;
        List<Metadata> list = o1Var.f59674j;
        if (this.f21705u.s()) {
            h1 h1VarP = this.f21704t.p();
            i0 i0VarN = h1VarP == null ? i0.f60875e : h1VarP.n();
            q7.b0 b0VarO = h1VarP == null ? this.f21690f : h1VarP.o();
            ImmutableList<Metadata> immutableListS = s(b0VarO.f78028c);
            if (h1VarP != null) {
                i1 i1Var = h1VarP.f59622f;
                if (i1Var.f59640c != j11) {
                    h1VarP.f59622f = i1Var.a(j11);
                }
            }
            i0Var = i0VarN;
            b0Var = b0VarO;
            listOf = immutableListS;
        } else if (bVar.equals(this.f21709y.f59666b)) {
            listOf = list;
            i0Var = i0Var2;
            b0Var = b0Var2;
        } else {
            i0Var = i0.f60875e;
            b0Var = this.f21690f;
            listOf = ImmutableList.of();
        }
        if (z10) {
            this.f21710z.e(i10);
        }
        return this.f21709y.c(bVar, j10, j11, j12, z(), i0Var, b0Var, listOf);
    }

    public final void I0(b bVar) throws Throwable {
        this.f21710z.b(1);
        if (bVar.f21714c != -1) {
            this.L = new h(new d6.s1(bVar.f21712a, bVar.f21713b), bVar.f21714c, bVar.f21715d);
        }
        E(this.f21705u.C(bVar.f21712a, bVar.f21713b), false);
    }

    public final boolean J(y yVar, h1 h1Var) {
        h1 h1VarJ = h1Var.j();
        return h1Var.f59622f.f59643f && h1VarJ.f59620d && ((yVar instanceof g7.p) || (yVar instanceof com.google.android.exoplayer2.metadata.a) || yVar.getReadingPositionUs() >= h1VarJ.m());
    }

    public void J0(List<s.c> list, int i10, long j10, e7.c0 c0Var) {
        this.f21693i.obtainMessage(17, new b(list, c0Var, i10, j10, null)).sendToTarget();
    }

    public final boolean K() {
        h1 h1VarQ = this.f21704t.q();
        if (!h1VarQ.f59620d) {
            return false;
        }
        int i10 = 0;
        while (true) {
            y[] yVarArr = this.f21686b;
            if (i10 >= yVarArr.length) {
                return true;
            }
            y yVar = yVarArr[i10];
            e7.b0 b0Var = h1VarQ.f59619c[i10];
            if (yVar.getStream() != b0Var || (b0Var != null && !yVar.hasReadStreamToEnd() && !J(yVar, h1VarQ))) {
                break;
            }
            i10++;
        }
        return false;
    }

    public final void K0(boolean z10) {
        if (z10 == this.J) {
            return;
        }
        this.J = z10;
        if (z10 || !this.f21709y.f59679o) {
            return;
        }
        this.f21693i.sendEmptyMessage(2);
    }

    public final void L0(boolean z10) throws ExoPlaybackException {
        this.B = z10;
        o0();
        if (!this.C || this.f21704t.q() == this.f21704t.p()) {
            return;
        }
        y0(true);
        D(false);
    }

    public final boolean M() {
        h1 h1VarJ = this.f21704t.j();
        return (h1VarJ == null || h1VarJ.k() == Long.MIN_VALUE) ? false : true;
    }

    public void M0(boolean z10, int i10) {
        this.f21693i.obtainMessage(1, z10 ? 1 : 0, i10).sendToTarget();
    }

    public final void N0(boolean z10, int i10, boolean z11, int i11) throws ExoPlaybackException {
        this.f21710z.b(z11 ? 1 : 0);
        this.f21710z.c(i11);
        this.f21709y = this.f21709y.d(z10, i10);
        this.D = false;
        c0(z10);
        if (!Z0()) {
            f1();
            j1();
            return;
        }
        int i12 = this.f21709y.f59669e;
        if (i12 == 3) {
            c1();
            this.f21693i.sendEmptyMessage(2);
        } else if (i12 == 2) {
            this.f21693i.sendEmptyMessage(2);
        }
    }

    public final boolean O() {
        h1 h1VarP = this.f21704t.p();
        long j10 = h1VarP.f59622f.f59642e;
        return h1VarP.f59620d && (j10 == -9223372036854775807L || this.f21709y.f59682r < j10 || !Z0());
    }

    public void O0(u uVar) {
        this.f21693i.obtainMessage(4, uVar).sendToTarget();
    }

    public final void P0(u uVar) throws ExoPlaybackException {
        this.f21700p.b(uVar);
        H(this.f21700p.getPlaybackParameters(), true);
    }

    public void Q0(int i10) {
        this.f21693i.obtainMessage(11, i10, 0).sendToTarget();
    }

    public final void R0(int i10) throws ExoPlaybackException {
        this.F = i10;
        if (!this.f21704t.G(this.f21709y.f59665a, i10)) {
            y0(true);
        }
        D(false);
    }

    public final void S() {
        boolean zY0 = Y0();
        this.E = zY0;
        if (zY0) {
            this.f21704t.j().d(this.M);
        }
        g1();
    }

    public final void S0(x1 x1Var) {
        this.f21708x = x1Var;
    }

    public final void T() {
        this.f21710z.d(this.f21709y);
        if (this.f21710z.f21724a) {
            this.f21703s.a(this.f21710z);
            this.f21710z = new e(this.f21709y);
        }
    }

    public void T0(boolean z10) {
        this.f21693i.obtainMessage(12, z10 ? 1 : 0, 0).sendToTarget();
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0045, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0074, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U(long r8, long r10) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.l.U(long, long):void");
    }

    public final void U0(boolean z10) throws ExoPlaybackException {
        this.G = z10;
        if (!this.f21704t.H(this.f21709y.f59665a, z10)) {
            y0(true);
        }
        D(false);
    }

    public final void V() throws ExoPlaybackException {
        i1 i1VarO;
        this.f21704t.y(this.M);
        if (this.f21704t.D() && (i1VarO = this.f21704t.o(this.M, this.f21709y)) != null) {
            h1 h1VarG = this.f21704t.g(this.f21688d, this.f21689e, this.f21691g.getAllocator(), this.f21705u, i1VarO, this.f21690f);
            h1VarG.f59617a.f(this, i1VarO.f59639b);
            if (this.f21704t.p() == h1VarG) {
                p0(i1VarO.f59639b);
            }
            D(false);
        }
        if (!this.E) {
            S();
        } else {
            this.E = M();
            g1();
        }
    }

    public final void V0(e7.c0 c0Var) throws Throwable {
        this.f21710z.b(1);
        E(this.f21705u.D(c0Var), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W() throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r14 = this;
            r0 = 0
            r1 = 1
            r2 = r0
        L3:
            boolean r3 = r14.X0()
            if (r3 == 0) goto L61
            if (r2 == 0) goto Le
            r14.T()
        Le:
            com.google.android.exoplayer2.r r2 = r14.f21704t
            d6.h1 r2 = r2.b()
            java.lang.Object r2 = s7.a.e(r2)
            d6.h1 r2 = (d6.h1) r2
            d6.o1 r3 = r14.f21709y
            com.google.android.exoplayer2.source.i$b r3 = r3.f59666b
            java.lang.Object r3 = r3.f60899a
            d6.i1 r4 = r2.f59622f
            com.google.android.exoplayer2.source.i$b r4 = r4.f59638a
            java.lang.Object r4 = r4.f60899a
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L45
            d6.o1 r3 = r14.f21709y
            com.google.android.exoplayer2.source.i$b r3 = r3.f59666b
            int r4 = r3.f60900b
            r5 = -1
            if (r4 != r5) goto L45
            d6.i1 r4 = r2.f59622f
            com.google.android.exoplayer2.source.i$b r4 = r4.f59638a
            int r6 = r4.f60900b
            if (r6 != r5) goto L45
            int r3 = r3.f60903e
            int r4 = r4.f60903e
            if (r3 == r4) goto L45
            r3 = r1
            goto L46
        L45:
            r3 = r0
        L46:
            d6.i1 r2 = r2.f59622f
            com.google.android.exoplayer2.source.i$b r5 = r2.f59638a
            long r10 = r2.f59639b
            long r8 = r2.f59640c
            r12 = r3 ^ 1
            r13 = 0
            r4 = r14
            r6 = r10
            d6.o1 r2 = r4.I(r5, r6, r8, r10, r12, r13)
            r14.f21709y = r2
            r14.o0()
            r14.j1()
            r2 = r1
            goto L3
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.l.W():void");
    }

    public final void W0(int i10) {
        o1 o1Var = this.f21709y;
        if (o1Var.f59669e != i10) {
            if (i10 != 2) {
                this.R = -9223372036854775807L;
            }
            this.f21709y = o1Var.g(i10);
        }
    }

    public final void X() {
        h1 h1VarQ = this.f21704t.q();
        if (h1VarQ == null) {
            return;
        }
        int i10 = 0;
        if (h1VarQ.j() != null && !this.C) {
            if (K()) {
                if (h1VarQ.j().f59620d || this.M >= h1VarQ.j().m()) {
                    q7.b0 b0VarO = h1VarQ.o();
                    h1 h1VarC = this.f21704t.c();
                    q7.b0 b0VarO2 = h1VarC.o();
                    c0 c0Var = this.f21709y.f59665a;
                    k1(c0Var, h1VarC.f59622f.f59638a, c0Var, h1VarQ.f59622f.f59638a, -9223372036854775807L);
                    if (h1VarC.f59620d && h1VarC.f59617a.readDiscontinuity() != -9223372036854775807L) {
                        F0(h1VarC.m());
                        return;
                    }
                    for (int i11 = 0; i11 < this.f21686b.length; i11++) {
                        boolean zC = b0VarO.c(i11);
                        boolean zC2 = b0VarO2.c(i11);
                        if (zC && !this.f21686b[i11].isCurrentStreamFinal()) {
                            boolean z10 = this.f21688d[i11].getTrackType() == -2;
                            v1 v1Var = b0VarO.f78027b[i11];
                            v1 v1Var2 = b0VarO2.f78027b[i11];
                            if (!zC2 || !v1Var2.equals(v1Var) || z10) {
                                G0(this.f21686b[i11], h1VarC.m());
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!h1VarQ.f59622f.f59646i && !this.C) {
            return;
        }
        while (true) {
            y[] yVarArr = this.f21686b;
            if (i10 >= yVarArr.length) {
                return;
            }
            y yVar = yVarArr[i10];
            e7.b0 b0Var = h1VarQ.f59619c[i10];
            if (b0Var != null && yVar.getStream() == b0Var && yVar.hasReadStreamToEnd()) {
                long j10 = h1VarQ.f59622f.f59642e;
                G0(yVar, (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? -9223372036854775807L : h1VarQ.l() + h1VarQ.f59622f.f59642e);
            }
            i10++;
        }
    }

    public final boolean X0() {
        h1 h1VarP;
        h1 h1VarJ;
        return Z0() && !this.C && (h1VarP = this.f21704t.p()) != null && (h1VarJ = h1VarP.j()) != null && this.M >= h1VarJ.m() && h1VarJ.f59623g;
    }

    public final void Y() throws ExoPlaybackException {
        h1 h1VarQ = this.f21704t.q();
        if (h1VarQ == null || this.f21704t.p() == h1VarQ || h1VarQ.f59623g || !l0()) {
            return;
        }
        o();
    }

    public final boolean Y0() {
        if (!M()) {
            return false;
        }
        h1 h1VarJ = this.f21704t.j();
        long jA = A(h1VarJ.k());
        long jY = h1VarJ == this.f21704t.p() ? h1VarJ.y(this.M) : h1VarJ.y(this.M) - h1VarJ.f59622f.f59639b;
        boolean zShouldContinueLoading = this.f21691g.shouldContinueLoading(jY, jA, this.f21700p.getPlaybackParameters().f22486b);
        if (zShouldContinueLoading || jA >= 500000) {
            return zShouldContinueLoading;
        }
        if (this.f21698n <= 0 && !this.f21699o) {
            return zShouldContinueLoading;
        }
        this.f21704t.p().f59617a.discardBuffer(this.f21709y.f59682r, false);
        return this.f21691g.shouldContinueLoading(jY, jA, this.f21700p.getPlaybackParameters().f22486b);
    }

    public final void Z() throws Throwable {
        E(this.f21705u.i(), true);
    }

    public final boolean Z0() {
        o1 o1Var = this.f21709y;
        return o1Var.f59676l && o1Var.f59677m == 0;
    }

    public final void a0(c cVar) throws Throwable {
        this.f21710z.b(1);
        E(this.f21705u.v(cVar.f21716a, cVar.f21717b, cVar.f21718c, cVar.f21719d), false);
    }

    public final boolean a1(boolean z10) {
        if (this.K == 0) {
            return O();
        }
        if (!z10) {
            return false;
        }
        o1 o1Var = this.f21709y;
        if (!o1Var.f59671g) {
            return true;
        }
        long targetLiveOffsetUs = b1(o1Var.f59665a, this.f21704t.p().f59622f.f59638a) ? this.f21706v.getTargetLiveOffsetUs() : -9223372036854775807L;
        h1 h1VarJ = this.f21704t.j();
        return (h1VarJ.q() && h1VarJ.f59622f.f59646i) || (h1VarJ.f59622f.f59638a.b() && !h1VarJ.f59620d) || this.f21691g.shouldStartPlayback(z(), this.f21700p.getPlaybackParameters().f22486b, this.D, targetLiveOffsetUs);
    }

    @Override // com.google.android.exoplayer2.w.a
    public synchronized void b(w wVar) {
        if (!this.A && this.f21694j.isAlive()) {
            this.f21693i.obtainMessage(14, wVar).sendToTarget();
            return;
        }
        s7.q.i("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        wVar.j(false);
    }

    public final void b0() {
        for (h1 h1VarP = this.f21704t.p(); h1VarP != null; h1VarP = h1VarP.j()) {
            for (q7.r rVar : h1VarP.o().f78028c) {
                if (rVar != null) {
                    rVar.onDiscontinuity();
                }
            }
        }
    }

    public final boolean b1(c0 c0Var, i.b bVar) {
        if (bVar.b() || c0Var.u()) {
            return false;
        }
        c0Var.r(c0Var.l(bVar.f60899a, this.f21697m).f21389d, this.f21696l);
        if (!this.f21696l.i()) {
            return false;
        }
        c0.d dVar = this.f21696l;
        return dVar.f21410j && dVar.f21407g != -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.h.a
    public void c(com.google.android.exoplayer2.source.h hVar) {
        this.f21693i.obtainMessage(8, hVar).sendToTarget();
    }

    public final void c0(boolean z10) {
        for (h1 h1VarP = this.f21704t.p(); h1VarP != null; h1VarP = h1VarP.j()) {
            for (q7.r rVar : h1VarP.o().f78028c) {
                if (rVar != null) {
                    rVar.onPlayWhenReadyChanged(z10);
                }
            }
        }
    }

    public final void c1() throws ExoPlaybackException {
        this.D = false;
        this.f21700p.f();
        for (y yVar : this.f21686b) {
            if (N(yVar)) {
                yVar.start();
            }
        }
    }

    public final void d0() {
        for (h1 h1VarP = this.f21704t.p(); h1VarP != null; h1VarP = h1VarP.j()) {
            for (q7.r rVar : h1VarP.o().f78028c) {
                if (rVar != null) {
                    rVar.onRebuffer();
                }
            }
        }
    }

    public void d1() {
        this.f21693i.obtainMessage(6).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.source.q.a
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public void a(com.google.android.exoplayer2.source.h hVar) {
        this.f21693i.obtainMessage(9, hVar).sendToTarget();
    }

    public final void e1(boolean z10, boolean z11) {
        n0(z10 || !this.H, false, true, false);
        this.f21710z.b(z11 ? 1 : 0);
        this.f21691g.onStopped();
        W0(1);
    }

    @Override // com.google.android.exoplayer2.h.a
    public void f(u uVar) {
        this.f21693i.obtainMessage(16, uVar).sendToTarget();
    }

    public void f0() {
        this.f21693i.obtainMessage(0).sendToTarget();
    }

    public final void f1() throws ExoPlaybackException {
        this.f21700p.g();
        for (y yVar : this.f21686b) {
            if (N(yVar)) {
                q(yVar);
            }
        }
    }

    public final void g0() {
        this.f21710z.b(1);
        n0(false, false, false, true);
        this.f21691g.onPrepared();
        W0(this.f21709y.f59665a.u() ? 4 : 2);
        this.f21705u.w(this.f21692h.getTransferListener());
        this.f21693i.sendEmptyMessage(2);
    }

    public final void g1() {
        h1 h1VarJ = this.f21704t.j();
        boolean z10 = this.E || (h1VarJ != null && h1VarJ.f59617a.isLoading());
        o1 o1Var = this.f21709y;
        if (z10 != o1Var.f59671g) {
            this.f21709y = o1Var.a(z10);
        }
    }

    public synchronized boolean h0() {
        if (!this.A && this.f21694j.isAlive()) {
            this.f21693i.sendEmptyMessage(7);
            m1(new y7.p() { // from class: d6.v0
                @Override // y7.p
                public final Object get() {
                    return this.f59705b.Q();
                }
            }, this.f21707w);
            return this.A;
        }
        return true;
    }

    public final void h1(i0 i0Var, q7.b0 b0Var) {
        this.f21691g.a(this.f21686b, i0Var, b0Var.f78028c);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        int i10;
        h1 h1VarQ;
        try {
            switch (message.what) {
                case 0:
                    g0();
                    break;
                case 1:
                    N0(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    m();
                    break;
                case 3:
                    z0((h) message.obj);
                    break;
                case 4:
                    P0((u) message.obj);
                    break;
                case 5:
                    S0((x1) message.obj);
                    break;
                case 6:
                    e1(false, true);
                    break;
                case 7:
                    i0();
                    return true;
                case 8:
                    F((com.google.android.exoplayer2.source.h) message.obj);
                    break;
                case 9:
                    B((com.google.android.exoplayer2.source.h) message.obj);
                    break;
                case 10:
                    m0();
                    break;
                case 11:
                    R0(message.arg1);
                    break;
                case 12:
                    U0(message.arg1 != 0);
                    break;
                case 13:
                    H0(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    C0((w) message.obj);
                    break;
                case 15:
                    E0((w) message.obj);
                    break;
                case 16:
                    H((u) message.obj, false);
                    break;
                case 17:
                    I0((b) message.obj);
                    break;
                case 18:
                    i((b) message.obj, message.arg1);
                    break;
                case 19:
                    a0((c) message.obj);
                    break;
                case 20:
                    j0(message.arg1, message.arg2, (e7.c0) message.obj);
                    break;
                case 21:
                    V0((e7.c0) message.obj);
                    break;
                case 22:
                    Z();
                    break;
                case 23:
                    L0(message.arg1 != 0);
                    break;
                case 24:
                    K0(message.arg1 == 1);
                    break;
                case 25:
                    j();
                    break;
                default:
                    return false;
            }
        } catch (ExoPlaybackException e10) {
            e = e10;
            if (e.type == 1 && (h1VarQ = this.f21704t.q()) != null) {
                e = e.copyWithMediaPeriodId(h1VarQ.f59622f.f59638a);
            }
            if (e.isRecoverable && this.P == null) {
                s7.q.j("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.P = e;
                s7.m mVar = this.f21693i;
                mVar.a(mVar.obtainMessage(25, e));
            } else {
                ExoPlaybackException exoPlaybackException = this.P;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.P;
                }
                s7.q.d("ExoPlayerImplInternal", "Playback error", e);
                e1(true, false);
                this.f21709y = this.f21709y.e(e);
            }
        } catch (ParserException e11) {
            int i11 = e11.dataType;
            if (i11 == 1) {
                i10 = e11.contentIsMalformed ? 3001 : 3003;
            } else {
                if (i11 == 4) {
                    i10 = e11.contentIsMalformed ? 3002 : 3004;
                }
                C(e11, i);
            }
            i = i10;
            C(e11, i);
        } catch (DrmSession.DrmSessionException e12) {
            C(e12, e12.errorCode);
        } catch (BehindLiveWindowException e13) {
            C(e13, 1002);
        } catch (DataSourceException e14) {
            C(e14, e14.reason);
        } catch (IOException e15) {
            C(e15, 2000);
        } catch (RuntimeException e16) {
            ExoPlaybackException exoPlaybackExceptionCreateForUnexpected = ExoPlaybackException.createForUnexpected(e16, ((e16 instanceof IllegalStateException) || (e16 instanceof IllegalArgumentException)) ? 1004 : 1000);
            s7.q.d("ExoPlayerImplInternal", "Playback error", exoPlaybackExceptionCreateForUnexpected);
            e1(true, false);
            this.f21709y = this.f21709y.e(exoPlaybackExceptionCreateForUnexpected);
        }
        T();
        return true;
    }

    public final void i(b bVar, int i10) throws Throwable {
        this.f21710z.b(1);
        s sVar = this.f21705u;
        if (i10 == -1) {
            i10 = sVar.q();
        }
        E(sVar.f(i10, bVar.f21712a, bVar.f21713b), false);
    }

    public final void i0() {
        n0(true, false, true, false);
        this.f21691g.onReleased();
        W0(1);
        this.f21694j.quit();
        synchronized (this) {
            this.A = true;
            notifyAll();
        }
    }

    public final void i1() throws ExoPlaybackException, IOException {
        if (this.f21709y.f59665a.u() || !this.f21705u.s()) {
            return;
        }
        V();
        X();
        Y();
        W();
    }

    public final void j() throws ExoPlaybackException {
        y0(true);
    }

    public final void j0(int i10, int i11, e7.c0 c0Var) throws Throwable {
        this.f21710z.b(1);
        E(this.f21705u.A(i10, i11, c0Var), false);
    }

    public final void j1() throws ExoPlaybackException {
        h1 h1VarP = this.f21704t.p();
        if (h1VarP == null) {
            return;
        }
        long discontinuity = h1VarP.f59620d ? h1VarP.f59617a.readDiscontinuity() : -9223372036854775807L;
        if (discontinuity != -9223372036854775807L) {
            p0(discontinuity);
            if (discontinuity != this.f21709y.f59682r) {
                o1 o1Var = this.f21709y;
                this.f21709y = I(o1Var.f59666b, discontinuity, o1Var.f59667c, discontinuity, true, 5);
            }
        } else {
            long jH = this.f21700p.h(h1VarP != this.f21704t.q());
            this.M = jH;
            long jY = h1VarP.y(jH);
            U(this.f21709y.f59682r, jY);
            this.f21709y.f59682r = jY;
        }
        this.f21709y.f59680p = this.f21704t.j().i();
        this.f21709y.f59681q = z();
        o1 o1Var2 = this.f21709y;
        if (o1Var2.f59676l && o1Var2.f59669e == 3 && b1(o1Var2.f59665a, o1Var2.f59666b) && this.f21709y.f59678n.f22486b == 1.0f) {
            float adjustedPlaybackSpeed = this.f21706v.getAdjustedPlaybackSpeed(t(), z());
            if (this.f21700p.getPlaybackParameters().f22486b != adjustedPlaybackSpeed) {
                this.f21700p.b(this.f21709y.f59678n.e(adjustedPlaybackSpeed));
                G(this.f21709y.f59678n, this.f21700p.getPlaybackParameters().f22486b, false, false);
            }
        }
    }

    public final void k(w wVar) throws ExoPlaybackException {
        if (wVar.i()) {
            return;
        }
        try {
            wVar.g().handleMessage(wVar.getType(), wVar.e());
        } finally {
            wVar.j(true);
        }
    }

    public void k0(int i10, int i11, e7.c0 c0Var) {
        this.f21693i.obtainMessage(20, i10, i11, c0Var).sendToTarget();
    }

    public final void k1(c0 c0Var, i.b bVar, c0 c0Var2, i.b bVar2, long j10) {
        if (!b1(c0Var, bVar)) {
            u uVar = bVar.b() ? u.f22484e : this.f21709y.f59678n;
            if (this.f21700p.getPlaybackParameters().equals(uVar)) {
                return;
            }
            this.f21700p.b(uVar);
            return;
        }
        c0Var.r(c0Var.l(bVar.f60899a, this.f21697m).f21389d, this.f21696l);
        this.f21706v.a((p.g) m0.j(this.f21696l.f21412l));
        if (j10 != -9223372036854775807L) {
            this.f21706v.setTargetLiveOffsetOverrideUs(v(c0Var, bVar.f60899a, j10));
            return;
        }
        if (m0.c(c0Var2.u() ? null : c0Var2.r(c0Var2.l(bVar2.f60899a, this.f21697m).f21389d, this.f21696l).f21402b, this.f21696l.f21402b)) {
            return;
        }
        this.f21706v.setTargetLiveOffsetOverrideUs(-9223372036854775807L);
    }

    public final void l(y yVar) throws ExoPlaybackException {
        if (N(yVar)) {
            this.f21700p.a(yVar);
            q(yVar);
            yVar.disable();
            this.K--;
        }
    }

    public final boolean l0() throws ExoPlaybackException {
        h1 h1VarQ = this.f21704t.q();
        q7.b0 b0VarO = h1VarQ.o();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            y[] yVarArr = this.f21686b;
            if (i10 >= yVarArr.length) {
                return !z10;
            }
            y yVar = yVarArr[i10];
            if (N(yVar)) {
                boolean z11 = yVar.getStream() != h1VarQ.f59619c[i10];
                if (!b0VarO.c(i10) || z11) {
                    if (!yVar.isCurrentStreamFinal()) {
                        yVar.e(u(b0VarO.f78028c[i10]), h1VarQ.f59619c[i10], h1VarQ.m(), h1VarQ.l());
                    } else if (yVar.isEnded()) {
                        l(yVar);
                    } else {
                        z10 = true;
                    }
                }
            }
            i10++;
        }
    }

    public final void l1(float f10) {
        for (h1 h1VarP = this.f21704t.p(); h1VarP != null; h1VarP = h1VarP.j()) {
            for (q7.r rVar : h1VarP.o().f78028c) {
                if (rVar != null) {
                    rVar.onPlaybackSpeed(f10);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() throws com.google.android.exoplayer2.ExoPlaybackException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.l.m():void");
    }

    public final void m0() throws ExoPlaybackException {
        float f10 = this.f21700p.getPlaybackParameters().f22486b;
        h1 h1VarQ = this.f21704t.q();
        boolean z10 = true;
        for (h1 h1VarP = this.f21704t.p(); h1VarP != null && h1VarP.f59620d; h1VarP = h1VarP.j()) {
            q7.b0 b0VarV = h1VarP.v(f10, this.f21709y.f59665a);
            if (!b0VarV.a(h1VarP.o())) {
                if (z10) {
                    h1 h1VarP2 = this.f21704t.p();
                    boolean z11 = this.f21704t.z(h1VarP2);
                    boolean[] zArr = new boolean[this.f21686b.length];
                    long jB = h1VarP2.b(b0VarV, this.f21709y.f59682r, z11, zArr);
                    o1 o1Var = this.f21709y;
                    boolean z12 = (o1Var.f59669e == 4 || jB == o1Var.f59682r) ? false : true;
                    o1 o1Var2 = this.f21709y;
                    this.f21709y = I(o1Var2.f59666b, jB, o1Var2.f59667c, o1Var2.f59668d, z12, 5);
                    if (z12) {
                        p0(jB);
                    }
                    boolean[] zArr2 = new boolean[this.f21686b.length];
                    int i10 = 0;
                    while (true) {
                        y[] yVarArr = this.f21686b;
                        if (i10 >= yVarArr.length) {
                            break;
                        }
                        y yVar = yVarArr[i10];
                        boolean zN = N(yVar);
                        zArr2[i10] = zN;
                        e7.b0 b0Var = h1VarP2.f59619c[i10];
                        if (zN) {
                            if (b0Var != yVar.getStream()) {
                                l(yVar);
                            } else if (zArr[i10]) {
                                yVar.resetPosition(this.M);
                            }
                        }
                        i10++;
                    }
                    p(zArr2);
                } else {
                    this.f21704t.z(h1VarP);
                    if (h1VarP.f59620d) {
                        h1VarP.a(b0VarV, Math.max(h1VarP.f59622f.f59639b, h1VarP.y(this.M)), false);
                    }
                }
                D(true);
                if (this.f21709y.f59669e != 4) {
                    S();
                    j1();
                    this.f21693i.sendEmptyMessage(2);
                    return;
                }
                return;
            }
            if (h1VarP == h1VarQ) {
                z10 = false;
            }
        }
    }

    public final synchronized void m1(y7.p<Boolean> pVar, long j10) {
        long jElapsedRealtime = this.f21702r.elapsedRealtime() + j10;
        boolean z10 = false;
        while (!pVar.get().booleanValue() && j10 > 0) {
            try {
                this.f21702r.onThreadBlocked();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j10 = jElapsedRealtime - this.f21702r.elapsedRealtime();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final void n(int i10, boolean z10) throws ExoPlaybackException {
        y yVar = this.f21686b[i10];
        if (N(yVar)) {
            return;
        }
        h1 h1VarQ = this.f21704t.q();
        boolean z11 = h1VarQ == this.f21704t.p();
        q7.b0 b0VarO = h1VarQ.o();
        v1 v1Var = b0VarO.f78027b[i10];
        m[] mVarArrU = u(b0VarO.f78028c[i10]);
        boolean z12 = Z0() && this.f21709y.f59669e == 3;
        boolean z13 = !z10 && z12;
        this.K++;
        this.f21687c.add(yVar);
        yVar.c(v1Var, mVarArrU, h1VarQ.f59619c[i10], this.M, z13, z11, h1VarQ.m(), h1VarQ.l());
        yVar.handleMessage(11, new a());
        this.f21700p.c(yVar);
        if (z12) {
            yVar.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2 A[PHI: r4 r5 r7
      0x00a2: PHI (r4v3 com.google.android.exoplayer2.source.i$b) = (r4v2 com.google.android.exoplayer2.source.i$b), (r4v9 com.google.android.exoplayer2.source.i$b) binds: [B:30:0x0079, B:32:0x009e] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r5v2 long) = (r5v1 long), (r5v5 long) binds: [B:30:0x0079, B:32:0x009e] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r7v3 long) = (r7v2 long), (r7v5 long) binds: [B:30:0x0079, B:32:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n0(boolean r29, boolean r30, boolean r31, boolean r32) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.l.n0(boolean, boolean, boolean, boolean):void");
    }

    public final void o() throws ExoPlaybackException {
        p(new boolean[this.f21686b.length]);
    }

    public final void o0() {
        h1 h1VarP = this.f21704t.p();
        this.C = h1VarP != null && h1VarP.f59622f.f59645h && this.B;
    }

    @Override // com.google.android.exoplayer2.s.d
    public void onPlaylistUpdateRequested() {
        this.f21693i.sendEmptyMessage(22);
    }

    @Override // q7.a0.a
    public void onTrackSelectionsInvalidated() {
        this.f21693i.sendEmptyMessage(10);
    }

    public final void p(boolean[] zArr) throws ExoPlaybackException {
        h1 h1VarQ = this.f21704t.q();
        q7.b0 b0VarO = h1VarQ.o();
        for (int i10 = 0; i10 < this.f21686b.length; i10++) {
            if (!b0VarO.c(i10) && this.f21687c.remove(this.f21686b[i10])) {
                this.f21686b[i10].reset();
            }
        }
        for (int i11 = 0; i11 < this.f21686b.length; i11++) {
            if (b0VarO.c(i11)) {
                n(i11, zArr[i11]);
            }
        }
        h1VarQ.f59623g = true;
    }

    public final void p0(long j10) throws ExoPlaybackException {
        h1 h1VarP = this.f21704t.p();
        long jZ = h1VarP == null ? j10 + 1000000000000L : h1VarP.z(j10);
        this.M = jZ;
        this.f21700p.d(jZ);
        for (y yVar : this.f21686b) {
            if (N(yVar)) {
                yVar.resetPosition(this.M);
            }
        }
        b0();
    }

    public final void q(y yVar) throws ExoPlaybackException {
        if (yVar.getState() == 2) {
            yVar.stop();
        }
    }

    public void r(long j10) {
        this.Q = j10;
    }

    public final ImmutableList<Metadata> s(q7.r[] rVarArr) {
        ImmutableList.a aVar = new ImmutableList.a();
        boolean z10 = false;
        for (q7.r rVar : rVarArr) {
            if (rVar != null) {
                Metadata metadata = rVar.getFormat(0).f21749k;
                if (metadata == null) {
                    aVar.a(new Metadata(new Metadata.Entry[0]));
                } else {
                    aVar.a(metadata);
                    z10 = true;
                }
            }
        }
        return z10 ? aVar.m() : ImmutableList.of();
    }

    public final void s0(c0 c0Var, c0 c0Var2) {
        if (c0Var.u() && c0Var2.u()) {
            return;
        }
        for (int size = this.f21701q.size() - 1; size >= 0; size--) {
            if (!r0(this.f21701q.get(size), c0Var, c0Var2, this.F, this.G, this.f21696l, this.f21697m)) {
                this.f21701q.get(size).f21720b.j(false);
                this.f21701q.remove(size);
            }
        }
        Collections.sort(this.f21701q);
    }

    public final long t() {
        o1 o1Var = this.f21709y;
        return v(o1Var.f59665a, o1Var.f59666b.f60899a, o1Var.f59682r);
    }

    public final long v(c0 c0Var, Object obj, long j10) {
        c0Var.r(c0Var.l(obj, this.f21697m).f21389d, this.f21696l);
        c0.d dVar = this.f21696l;
        if (dVar.f21407g != -9223372036854775807L && dVar.i()) {
            c0.d dVar2 = this.f21696l;
            if (dVar2.f21410j) {
                return m0.w0(dVar2.d() - this.f21696l.f21407g) - (j10 + this.f21697m.q());
            }
        }
        return -9223372036854775807L;
    }

    public final long w() {
        h1 h1VarQ = this.f21704t.q();
        if (h1VarQ == null) {
            return 0L;
        }
        long jL = h1VarQ.l();
        if (!h1VarQ.f59620d) {
            return jL;
        }
        int i10 = 0;
        while (true) {
            y[] yVarArr = this.f21686b;
            if (i10 >= yVarArr.length) {
                return jL;
            }
            if (N(yVarArr[i10]) && this.f21686b[i10].getStream() == h1VarQ.f59619c[i10]) {
                long readingPositionUs = this.f21686b[i10].getReadingPositionUs();
                if (readingPositionUs == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jL = Math.max(readingPositionUs, jL);
            }
            i10++;
        }
    }

    public final void w0(long j10, long j11) {
        this.f21693i.sendEmptyMessageAtTime(2, j10 + j11);
    }

    public final Pair<i.b, Long> x(c0 c0Var) {
        if (c0Var.u()) {
            return Pair.create(o1.k(), 0L);
        }
        Pair<Object, Long> pairN = c0Var.n(this.f21696l, this.f21697m, c0Var.e(this.G), -9223372036854775807L);
        i.b bVarB = this.f21704t.B(c0Var, pairN.first, 0L);
        long jLongValue = ((Long) pairN.second).longValue();
        if (bVarB.b()) {
            c0Var.l(bVarB.f60899a, this.f21697m);
            jLongValue = bVarB.f60901c == this.f21697m.n(bVarB.f60900b) ? this.f21697m.j() : 0L;
        }
        return Pair.create(bVarB, Long.valueOf(jLongValue));
    }

    public void x0(c0 c0Var, int i10, long j10) {
        this.f21693i.obtainMessage(3, new h(c0Var, i10, j10)).sendToTarget();
    }

    public Looper y() {
        return this.f21695k;
    }

    public final void y0(boolean z10) throws ExoPlaybackException {
        i.b bVar = this.f21704t.p().f59622f.f59638a;
        long jB0 = B0(bVar, this.f21709y.f59682r, true, false);
        if (jB0 != this.f21709y.f59682r) {
            o1 o1Var = this.f21709y;
            this.f21709y = I(bVar, jB0, o1Var.f59667c, o1Var.f59668d, z10, 5);
        }
    }

    public final long z() {
        return A(this.f21709y.f59680p);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac A[Catch: all -> 0x0148, TryCatch #1 {all -> 0x0148, blocks: (B:22:0x00a2, B:24:0x00ac, B:27:0x00b2, B:29:0x00b8, B:30:0x00bb, B:32:0x00c1, B:34:0x00cb, B:36:0x00d3, B:40:0x00db, B:42:0x00e5, B:44:0x00f5, B:48:0x00ff, B:52:0x0111, B:56:0x011a), top: B:74:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z0(com.google.android.exoplayer2.l.h r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.l.z0(com.google.android.exoplayer2.l$h):void");
    }
}
