package e4;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.ExoPlaybackException;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.source.TrackGroupArray;
import e4.i;
import e4.o0;
import e4.v0;
import e5.q;
import e5.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import w5.d;

/* JADX INFO: compiled from: ExoPlayerImplInternal.java */
/* JADX INFO: loaded from: classes11.dex */
public final class d0 implements Handler.Callback, q.a, d.a, r.b, i.a, o0.a {
    public boolean A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public e F;
    public long G;
    public int H;
    public boolean I;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0[] f60054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q0[] f60055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w5.d f60056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w5.e f60057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g0 f60058f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y5.c f60059g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a6.l f60060h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HandlerThread f60061i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Handler f60062j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v0.c f60063k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v0.b f60064l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f60065m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f60066n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i f60067o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList<c> f60069q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a6.c f60070r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public k0 f60073u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public e5.r f60074v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p0[] f60075w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f60076x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f60077y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f60078z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j0 f60071s = new j0();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public t0 f60072t = t0.f60262g;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f60068p = new d();

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e5.r f60079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v0 f60080b;

        public b(e5.r rVar, v0 v0Var) {
            this.f60079a = rVar;
            this.f60080b = v0Var;
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static final class c implements Comparable<c> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o0 f60081b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f60082c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f60083d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public Object f60084e;

        public c(o0 o0Var) {
            this.f60081b = o0Var;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            Object obj = this.f60084e;
            if ((obj == null) != (cVar.f60084e == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i10 = this.f60082c - cVar.f60082c;
            return i10 != 0 ? i10 : a6.k0.o(this.f60083d, cVar.f60083d);
        }

        public void b(int i10, long j10, Object obj) {
            this.f60082c = i10;
            this.f60083d = j10;
            this.f60084e = obj;
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public k0 f60085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f60086b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f60087c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f60088d;

        public d() {
        }

        public boolean d(k0 k0Var) {
            return k0Var != this.f60085a || this.f60086b > 0 || this.f60087c;
        }

        public void e(int i10) {
            this.f60086b += i10;
        }

        public void f(k0 k0Var) {
            this.f60085a = k0Var;
            this.f60086b = 0;
            this.f60087c = false;
        }

        public void g(int i10) {
            if (this.f60087c && this.f60088d != 4) {
                a6.a.a(i10 == 4);
            } else {
                this.f60087c = true;
                this.f60088d = i10;
            }
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v0 f60089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f60090b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f60091c;

        public e(v0 v0Var, int i10, long j10) {
            this.f60089a = v0Var;
            this.f60090b = i10;
            this.f60091c = j10;
        }
    }

    public d0(p0[] p0VarArr, w5.d dVar, w5.e eVar, g0 g0Var, y5.c cVar, boolean z10, int i10, boolean z11, Handler handler, a6.c cVar2) {
        this.f60054b = p0VarArr;
        this.f60056d = dVar;
        this.f60057e = eVar;
        this.f60058f = g0Var;
        this.f60059g = cVar;
        this.f60077y = z10;
        this.B = i10;
        this.C = z11;
        this.f60062j = handler;
        this.f60070r = cVar2;
        this.f60065m = g0Var.getBackBufferDurationUs();
        this.f60066n = g0Var.retainBackBufferFromKeyframe();
        this.f60073u = k0.h(-9223372036854775807L, eVar);
        this.f60055c = new q0[p0VarArr.length];
        for (int i11 = 0; i11 < p0VarArr.length; i11++) {
            p0VarArr[i11].setIndex(i11);
            this.f60055c[i11] = p0VarArr[i11].getCapabilities();
        }
        this.f60067o = new i(this, cVar2);
        this.f60069q = new ArrayList<>();
        this.f60075w = new p0[0];
        this.f60063k = new v0.c();
        this.f60064l = new v0.b();
        dVar.b(this, cVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f60061i = handlerThread;
        handlerThread.start();
        this.f60060h = cVar2.createHandler(handlerThread.getLooper(), this);
        this.I = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(o0 o0Var) {
        try {
            h(o0Var);
        } catch (ExoPlaybackException e10) {
            a6.m.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    public static Format[] o(com.google.android.exoplayer.trackselection.c cVar) {
        int length = cVar != null ? cVar.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i10 = 0; i10 < length; i10++) {
            formatArr[i10] = cVar.getFormat(i10);
        }
        return formatArr;
    }

    public final boolean A() {
        h0 h0VarO = this.f60071s.o();
        if (!h0VarO.f60124d) {
            return false;
        }
        int i10 = 0;
        while (true) {
            p0[] p0VarArr = this.f60054b;
            if (i10 >= p0VarArr.length) {
                return true;
            }
            p0 p0Var = p0VarArr[i10];
            e5.i0 i0Var = h0VarO.f60123c[i10];
            if (p0Var.getStream() != i0Var || (i0Var != null && !p0Var.hasReadStreamToEnd())) {
                break;
            }
            i10++;
        }
        return false;
    }

    public final void A0() throws ExoPlaybackException {
        this.f60067o.g();
        for (p0 p0Var : this.f60075w) {
            m(p0Var);
        }
    }

    public final boolean B() {
        h0 h0VarI = this.f60071s.i();
        return (h0VarI == null || h0VarI.k() == Long.MIN_VALUE) ? false : true;
    }

    public final void B0() {
        h0 h0VarI = this.f60071s.i();
        boolean z10 = this.A || (h0VarI != null && h0VarI.f60121a.isLoading());
        k0 k0Var = this.f60073u;
        if (z10 != k0Var.f60179g) {
            this.f60073u = k0Var.a(z10);
        }
    }

    public final boolean C() {
        h0 h0VarN = this.f60071s.n();
        long j10 = h0VarN.f60126f.f60145e;
        return h0VarN.f60124d && (j10 == -9223372036854775807L || this.f60073u.f60185m < j10);
    }

    public final void C0(TrackGroupArray trackGroupArray, w5.e eVar) {
        this.f60058f.a(this.f60054b, trackGroupArray, eVar.f86340c);
    }

    public final void D0() throws ExoPlaybackException, IOException {
        e5.r rVar = this.f60074v;
        if (rVar == null) {
            return;
        }
        if (this.E > 0) {
            rVar.maybeThrowSourceInfoRefreshError();
            return;
        }
        I();
        K();
        J();
    }

    public final void E() {
        boolean zV0 = v0();
        this.A = zV0;
        if (zV0) {
            this.f60071s.i().d(this.G);
        }
        B0();
    }

    public final void E0() throws ExoPlaybackException {
        h0 h0VarN = this.f60071s.n();
        if (h0VarN == null) {
            return;
        }
        long discontinuity = h0VarN.f60124d ? h0VarN.f60121a.readDiscontinuity() : -9223372036854775807L;
        if (discontinuity != -9223372036854775807L) {
            T(discontinuity);
            if (discontinuity != this.f60073u.f60185m) {
                k0 k0Var = this.f60073u;
                this.f60073u = g(k0Var.f60174b, discontinuity, k0Var.f60176d);
                this.f60068p.g(4);
            }
        } else {
            long jH = this.f60067o.h(h0VarN != this.f60071s.o());
            this.G = jH;
            long jY = h0VarN.y(jH);
            H(this.f60073u.f60185m, jY);
            this.f60073u.f60185m = jY;
        }
        this.f60073u.f60183k = this.f60071s.i().i();
        this.f60073u.f60184l = s();
    }

    public final void F() {
        if (this.f60068p.d(this.f60073u)) {
            this.f60062j.obtainMessage(0, this.f60068p.f60086b, this.f60068p.f60087c ? this.f60068p.f60088d : -1, this.f60073u).sendToTarget();
            this.f60068p.f(this.f60073u);
        }
    }

    public final void F0(@Nullable h0 h0Var) throws ExoPlaybackException {
        h0 h0VarN = this.f60071s.n();
        if (h0VarN == null || h0Var == h0VarN) {
            return;
        }
        boolean[] zArr = new boolean[this.f60054b.length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            p0[] p0VarArr = this.f60054b;
            if (i10 >= p0VarArr.length) {
                this.f60073u = this.f60073u.g(h0VarN.n(), h0VarN.o());
                l(zArr, i11);
                return;
            }
            p0 p0Var = p0VarArr[i10];
            zArr[i10] = p0Var.getState() != 0;
            if (h0VarN.o().c(i10)) {
                i11++;
            }
            if (zArr[i10] && (!h0VarN.o().c(i10) || (p0Var.isCurrentStreamFinal() && p0Var.getStream() == h0Var.f60123c[i10]))) {
                i(p0Var);
            }
            i10++;
        }
    }

    public final void G() throws IOException {
        if (this.f60071s.i() != null) {
            for (p0 p0Var : this.f60075w) {
                if (!p0Var.hasReadStreamToEnd()) {
                    return;
                }
            }
        }
        this.f60074v.maybeThrowSourceInfoRefreshError();
    }

    public final void G0(float f10) {
        for (h0 h0VarN = this.f60071s.n(); h0VarN != null; h0VarN = h0VarN.j()) {
            for (com.google.android.exoplayer.trackselection.c cVar : h0VarN.o().f86340c.b()) {
                if (cVar != null) {
                    cVar.onPlaybackSpeed(f10);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x004b, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x007a, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(long r8, long r10) throws com.google.android.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.d0.H(long, long):void");
    }

    public final void I() throws ExoPlaybackException, IOException {
        this.f60071s.t(this.G);
        if (this.f60071s.z()) {
            i0 i0VarM = this.f60071s.m(this.G, this.f60073u);
            if (i0VarM == null) {
                G();
            } else {
                h0 h0VarF = this.f60071s.f(this.f60055c, this.f60056d, this.f60058f.getAllocator(), this.f60074v, i0VarM, this.f60057e);
                h0VarF.f60121a.f(this, i0VarM.f60142b);
                if (this.f60071s.n() == h0VarF) {
                    T(h0VarF.m());
                }
                v(false);
            }
        }
        if (!this.A) {
            E();
        } else {
            this.A = B();
            B0();
        }
    }

    public final void J() throws ExoPlaybackException {
        boolean z10 = false;
        while (u0()) {
            if (z10) {
                F();
            }
            h0 h0VarN = this.f60071s.n();
            if (h0VarN == this.f60071s.o()) {
                i0();
            }
            h0 h0VarA = this.f60071s.a();
            F0(h0VarN);
            i0 i0Var = h0VarA.f60126f;
            this.f60073u = g(i0Var.f60141a, i0Var.f60142b, i0Var.f60143c);
            this.f60068p.g(h0VarN.f60126f.f60146f ? 0 : 3);
            E0();
            z10 = true;
        }
    }

    public final void K() throws ExoPlaybackException {
        h0 h0VarO = this.f60071s.o();
        if (h0VarO == null) {
            return;
        }
        int i10 = 0;
        if (h0VarO.j() == null) {
            if (!h0VarO.f60126f.f60147g) {
                return;
            }
            while (true) {
                p0[] p0VarArr = this.f60054b;
                if (i10 >= p0VarArr.length) {
                    return;
                }
                p0 p0Var = p0VarArr[i10];
                e5.i0 i0Var = h0VarO.f60123c[i10];
                if (i0Var != null && p0Var.getStream() == i0Var && p0Var.hasReadStreamToEnd()) {
                    p0Var.setCurrentStreamFinal();
                }
                i10++;
            }
        } else {
            if (!A() || !h0VarO.j().f60124d) {
                return;
            }
            w5.e eVarO = h0VarO.o();
            h0 h0VarB = this.f60071s.b();
            w5.e eVarO2 = h0VarB.o();
            if (h0VarB.f60121a.readDiscontinuity() != -9223372036854775807L) {
                i0();
                return;
            }
            int i11 = 0;
            while (true) {
                p0[] p0VarArr2 = this.f60054b;
                if (i11 >= p0VarArr2.length) {
                    return;
                }
                p0 p0Var2 = p0VarArr2[i11];
                if (eVarO.c(i11) && !p0Var2.isCurrentStreamFinal()) {
                    com.google.android.exoplayer.trackselection.c cVarA = eVarO2.f86340c.a(i11);
                    boolean zC = eVarO2.c(i11);
                    boolean z10 = this.f60055c[i11].getTrackType() == 6;
                    r0 r0Var = eVarO.f86339b[i11];
                    r0 r0Var2 = eVarO2.f86339b[i11];
                    if (zC && r0Var2.equals(r0Var) && !z10) {
                        p0Var2.d(o(cVarA), h0VarB.f60123c[i11], h0VarB.l());
                    } else {
                        p0Var2.setCurrentStreamFinal();
                    }
                }
                i11++;
            }
        }
    }

    public final void L() {
        for (h0 h0VarN = this.f60071s.n(); h0VarN != null; h0VarN = h0VarN.j()) {
            for (com.google.android.exoplayer.trackselection.c cVar : h0VarN.o().f86340c.b()) {
                if (cVar != null) {
                    cVar.onDiscontinuity();
                }
            }
        }
    }

    @Override // e5.j0.a
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void c(e5.q qVar) {
        this.f60060h.obtainMessage(10, qVar).sendToTarget();
    }

    public void N(e5.r rVar, boolean z10, boolean z11) {
        this.f60060h.obtainMessage(0, z10 ? 1 : 0, z11 ? 1 : 0, rVar).sendToTarget();
    }

    public final void O(e5.r rVar, boolean z10, boolean z11) {
        this.E++;
        S(false, true, z10, z11, true);
        this.f60058f.onPrepared();
        this.f60074v = rVar;
        t0(2);
        rVar.a(this, this.f60059g.getTransferListener());
        this.f60060h.sendEmptyMessage(2);
    }

    public synchronized void P() {
        if (!this.f60076x && this.f60061i.isAlive()) {
            this.f60060h.sendEmptyMessage(7);
            boolean z10 = false;
            while (!this.f60076x) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void Q() {
        S(true, true, true, true, false);
        this.f60058f.onReleased();
        t0(1);
        this.f60061i.quit();
        synchronized (this) {
            this.f60076x = true;
            notifyAll();
        }
    }

    public final void R() throws ExoPlaybackException {
        h0 h0Var;
        boolean[] zArr;
        float f10 = this.f60067o.getPlaybackParameters().f60187a;
        h0 h0VarO = this.f60071s.o();
        boolean z10 = true;
        for (h0 h0VarN = this.f60071s.n(); h0VarN != null && h0VarN.f60124d; h0VarN = h0VarN.j()) {
            w5.e eVarV = h0VarN.v(f10, this.f60073u.f60173a);
            if (!eVarV.a(h0VarN.o())) {
                if (z10) {
                    h0 h0VarN2 = this.f60071s.n();
                    boolean zU = this.f60071s.u(h0VarN2);
                    boolean[] zArr2 = new boolean[this.f60054b.length];
                    long jB = h0VarN2.b(eVarV, this.f60073u.f60185m, zU, zArr2);
                    k0 k0Var = this.f60073u;
                    if (k0Var.f60177e == 4 || jB == k0Var.f60185m) {
                        h0Var = h0VarN2;
                        zArr = zArr2;
                    } else {
                        k0 k0Var2 = this.f60073u;
                        h0Var = h0VarN2;
                        zArr = zArr2;
                        this.f60073u = g(k0Var2.f60174b, jB, k0Var2.f60176d);
                        this.f60068p.g(4);
                        T(jB);
                    }
                    boolean[] zArr3 = new boolean[this.f60054b.length];
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        p0[] p0VarArr = this.f60054b;
                        if (i10 >= p0VarArr.length) {
                            break;
                        }
                        p0 p0Var = p0VarArr[i10];
                        boolean z11 = p0Var.getState() != 0;
                        zArr3[i10] = z11;
                        e5.i0 i0Var = h0Var.f60123c[i10];
                        if (i0Var != null) {
                            i11++;
                        }
                        if (z11) {
                            if (i0Var != p0Var.getStream()) {
                                i(p0Var);
                            } else if (zArr[i10]) {
                                p0Var.resetPosition(this.G);
                            }
                        }
                        i10++;
                    }
                    this.f60073u = this.f60073u.g(h0Var.n(), h0Var.o());
                    l(zArr3, i11);
                } else {
                    this.f60071s.u(h0VarN);
                    if (h0VarN.f60124d) {
                        h0VarN.a(eVarV, Math.max(h0VarN.f60126f.f60142b, h0VarN.y(this.G)), false);
                    }
                }
                v(true);
                if (this.f60073u.f60177e != 4) {
                    E();
                    E0();
                    this.f60060h.sendEmptyMessage(2);
                    return;
                }
                return;
            }
            if (h0VarN == h0VarO) {
                z10 = false;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S(boolean r27, boolean r28, boolean r29, boolean r30, boolean r31) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.d0.S(boolean, boolean, boolean, boolean, boolean):void");
    }

    public final void T(long j10) throws ExoPlaybackException {
        h0 h0VarN = this.f60071s.n();
        if (h0VarN != null) {
            j10 = h0VarN.z(j10);
        }
        this.G = j10;
        this.f60067o.d(j10);
        for (p0 p0Var : this.f60075w) {
            p0Var.resetPosition(this.G);
        }
        L();
    }

    public final boolean U(c cVar) {
        Object obj = cVar.f60084e;
        if (obj == null) {
            Pair<Object, Long> pairW = W(new e(cVar.f60081b.g(), cVar.f60081b.h(), k.a(cVar.f60081b.e())), false);
            if (pairW == null) {
                return false;
            }
            cVar.b(this.f60073u.f60173a.b(pairW.first), ((Long) pairW.second).longValue(), pairW.first);
            return true;
        }
        int iB = this.f60073u.f60173a.b(obj);
        if (iB == -1) {
            return false;
        }
        cVar.f60082c = iB;
        return true;
    }

    public final void V() {
        for (int size = this.f60069q.size() - 1; size >= 0; size--) {
            if (!U(this.f60069q.get(size))) {
                this.f60069q.get(size).f60081b.j(false);
                this.f60069q.remove(size);
            }
        }
        Collections.sort(this.f60069q);
    }

    @Nullable
    public final Pair<Object, Long> W(e eVar, boolean z10) {
        Pair<Object, Long> pairJ;
        Object objX;
        v0 v0Var = this.f60073u.f60173a;
        v0 v0Var2 = eVar.f60089a;
        if (v0Var.q()) {
            return null;
        }
        if (v0Var2.q()) {
            v0Var2 = v0Var;
        }
        try {
            pairJ = v0Var2.j(this.f60063k, this.f60064l, eVar.f60090b, eVar.f60091c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (v0Var == v0Var2 || v0Var.b(pairJ.first) != -1) {
            return pairJ;
        }
        if (z10 && (objX = X(pairJ.first, v0Var2, v0Var)) != null) {
            return q(v0Var, v0Var.h(objX, this.f60064l).f60306c, -9223372036854775807L);
        }
        return null;
    }

    @Nullable
    public final Object X(Object obj, v0 v0Var, v0 v0Var2) {
        int iB = v0Var.b(obj);
        int i10 = v0Var.i();
        int iD = iB;
        int iB2 = -1;
        for (int i11 = 0; i11 < i10 && iB2 == -1; i11++) {
            iD = v0Var.d(iD, this.f60064l, this.f60063k, this.B, this.C);
            if (iD == -1) {
                break;
            }
            iB2 = v0Var2.b(v0Var.m(iD));
        }
        if (iB2 == -1) {
            return null;
        }
        return v0Var2.m(iB2);
    }

    public final void Y(long j10, long j11) {
        this.f60060h.removeMessages(2);
        this.f60060h.sendEmptyMessageAtTime(2, j10 + j11);
    }

    public void Z(v0 v0Var, int i10, long j10) {
        this.f60060h.obtainMessage(3, new e(v0Var, i10, j10)).sendToTarget();
    }

    @Override // e4.i.a
    public void a(l0 l0Var) {
        h0(l0Var, false);
    }

    public final void a0(boolean z10) throws ExoPlaybackException {
        r.a aVar = this.f60071s.n().f60126f.f60141a;
        long jD0 = d0(aVar, this.f60073u.f60185m, true);
        if (jD0 != this.f60073u.f60185m) {
            this.f60073u = g(aVar, jD0, this.f60073u.f60176d);
            if (z10) {
                this.f60068p.g(4);
            }
        }
    }

    @Override // e5.r.b
    public void b(e5.r rVar, v0 v0Var) {
        this.f60060h.obtainMessage(8, new b(rVar, v0Var)).sendToTarget();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b0(e4.d0.e r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.d0.b0(e4.d0$e):void");
    }

    public final long c0(r.a aVar, long j10) throws ExoPlaybackException {
        return d0(aVar, j10, this.f60071s.n() != this.f60071s.o());
    }

    @Override // e5.q.a
    public void d(e5.q qVar) {
        this.f60060h.obtainMessage(9, qVar).sendToTarget();
    }

    public final long d0(r.a aVar, long j10, boolean z10) throws ExoPlaybackException {
        A0();
        this.f60078z = false;
        k0 k0Var = this.f60073u;
        if (k0Var.f60177e != 1 && !k0Var.f60173a.q()) {
            t0(2);
        }
        h0 h0VarN = this.f60071s.n();
        h0 h0VarA = h0VarN;
        while (true) {
            if (h0VarA == null) {
                break;
            }
            if (aVar.equals(h0VarA.f60126f.f60141a) && h0VarA.f60124d) {
                this.f60071s.u(h0VarA);
                break;
            }
            h0VarA = this.f60071s.a();
        }
        if (z10 || h0VarN != h0VarA || (h0VarA != null && h0VarA.z(j10) < 0)) {
            for (p0 p0Var : this.f60075w) {
                i(p0Var);
            }
            this.f60075w = new p0[0];
            h0VarN = null;
            if (h0VarA != null) {
                h0VarA.x(0L);
            }
        }
        if (h0VarA != null) {
            F0(h0VarN);
            if (h0VarA.f60125e) {
                long jSeekToUs = h0VarA.f60121a.seekToUs(j10);
                h0VarA.f60121a.discardBuffer(jSeekToUs - this.f60065m, this.f60066n);
                j10 = jSeekToUs;
            }
            T(j10);
            E();
        } else {
            this.f60071s.e(true);
            this.f60073u = this.f60073u.g(TrackGroupArray.f20391e, this.f60057e);
            T(j10);
        }
        v(false);
        this.f60060h.sendEmptyMessage(2);
        return j10;
    }

    @Override // e4.o0.a
    public synchronized void e(o0 o0Var) {
        if (!this.f60076x && this.f60061i.isAlive()) {
            this.f60060h.obtainMessage(15, o0Var).sendToTarget();
            return;
        }
        a6.m.h("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        o0Var.j(false);
    }

    public final void e0(o0 o0Var) throws ExoPlaybackException {
        if (o0Var.e() == -9223372036854775807L) {
            f0(o0Var);
            return;
        }
        if (this.f60074v == null || this.E > 0) {
            this.f60069q.add(new c(o0Var));
            return;
        }
        c cVar = new c(o0Var);
        if (!U(cVar)) {
            o0Var.j(false);
        } else {
            this.f60069q.add(cVar);
            Collections.sort(this.f60069q);
        }
    }

    public final void f0(o0 o0Var) throws ExoPlaybackException {
        if (o0Var.c().getLooper() != this.f60060h.getLooper()) {
            this.f60060h.obtainMessage(16, o0Var).sendToTarget();
            return;
        }
        h(o0Var);
        int i10 = this.f60073u.f60177e;
        if (i10 == 3 || i10 == 2) {
            this.f60060h.sendEmptyMessage(2);
        }
    }

    public final k0 g(r.a aVar, long j10, long j11) {
        this.I = true;
        return this.f60073u.c(aVar, j10, j11, s());
    }

    public final void g0(final o0 o0Var) {
        Handler handlerC = o0Var.c();
        if (handlerC.getLooper().getThread().isAlive()) {
            handlerC.post(new Runnable() { // from class: e4.c0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f60049b.D(o0Var);
                }
            });
        } else {
            a6.m.h("TAG", "Trying to send message on a dead thread.");
            o0Var.j(false);
        }
    }

    public final void h(o0 o0Var) throws ExoPlaybackException {
        if (o0Var.i()) {
            return;
        }
        try {
            o0Var.f().handleMessage(o0Var.getType(), o0Var.d());
        } finally {
            o0Var.j(true);
        }
    }

    public final void h0(l0 l0Var, boolean z10) {
        this.f60060h.obtainMessage(17, z10 ? 1 : 0, 0, l0Var).sendToTarget();
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d0  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean handleMessage(android.os.Message r6) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.d0.handleMessage(android.os.Message):boolean");
    }

    public final void i(p0 p0Var) throws ExoPlaybackException {
        this.f60067o.a(p0Var);
        m(p0Var);
        p0Var.disable();
    }

    public final void i0() {
        for (p0 p0Var : this.f60054b) {
            if (p0Var.getStream() != null) {
                p0Var.setCurrentStreamFinal();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0145 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() throws com.google.android.exoplayer.ExoPlaybackException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.d0.j():void");
    }

    public final void j0(boolean z10, @Nullable AtomicBoolean atomicBoolean) {
        if (this.D != z10) {
            this.D = z10;
            if (!z10) {
                for (p0 p0Var : this.f60054b) {
                    if (p0Var.getState() == 0) {
                        p0Var.reset();
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

    public final void k(int i10, boolean z10, int i11) throws ExoPlaybackException {
        h0 h0VarN = this.f60071s.n();
        p0 p0Var = this.f60054b[i10];
        this.f60075w[i11] = p0Var;
        if (p0Var.getState() == 0) {
            w5.e eVarO = h0VarN.o();
            r0 r0Var = eVarO.f86339b[i10];
            Format[] formatArrO = o(eVarO.f86340c.a(i10));
            boolean z11 = this.f60077y && this.f60073u.f60177e == 3;
            p0Var.e(r0Var, formatArrO, h0VarN.f60123c[i10], this.G, !z10 && z11, h0VarN.l());
            this.f60067o.c(p0Var);
            if (z11) {
                p0Var.start();
            }
        }
    }

    public void k0(boolean z10) {
        this.f60060h.obtainMessage(1, z10 ? 1 : 0, 0).sendToTarget();
    }

    public final void l(boolean[] zArr, int i10) throws ExoPlaybackException {
        this.f60075w = new p0[i10];
        w5.e eVarO = this.f60071s.n().o();
        for (int i11 = 0; i11 < this.f60054b.length; i11++) {
            if (!eVarO.c(i11)) {
                this.f60054b[i11].reset();
            }
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f60054b.length; i13++) {
            if (eVarO.c(i13)) {
                k(i13, zArr[i13], i12);
                i12++;
            }
        }
    }

    public final void l0(boolean z10) throws ExoPlaybackException {
        this.f60078z = false;
        this.f60077y = z10;
        if (!z10) {
            A0();
            E0();
            return;
        }
        int i10 = this.f60073u.f60177e;
        if (i10 == 3) {
            x0();
            this.f60060h.sendEmptyMessage(2);
        } else if (i10 == 2) {
            this.f60060h.sendEmptyMessage(2);
        }
    }

    public final void m(p0 p0Var) throws ExoPlaybackException {
        if (p0Var.getState() == 2) {
            p0Var.stop();
        }
    }

    public void m0(l0 l0Var) {
        this.f60060h.obtainMessage(4, l0Var).sendToTarget();
    }

    public final String n(ExoPlaybackException exoPlaybackException) {
        if (exoPlaybackException.type != 1) {
            return "Playback error.";
        }
        return "Renderer error: index=" + exoPlaybackException.rendererIndex + ", type=" + a6.k0.a0(this.f60054b[exoPlaybackException.rendererIndex].getTrackType()) + ", format=" + exoPlaybackException.rendererFormat + ", rendererSupport=" + q0.f(exoPlaybackException.rendererFormatSupport);
    }

    public final void n0(l0 l0Var) {
        this.f60067o.b(l0Var);
        h0(this.f60067o.getPlaybackParameters(), true);
    }

    public void o0(int i10) {
        this.f60060h.obtainMessage(12, i10, 0).sendToTarget();
    }

    @Override // w5.d.a
    public void onTrackSelectionsInvalidated() {
        this.f60060h.sendEmptyMessage(11);
    }

    public final long p() {
        h0 h0VarO = this.f60071s.o();
        if (h0VarO == null) {
            return 0L;
        }
        long jL = h0VarO.l();
        if (!h0VarO.f60124d) {
            return jL;
        }
        int i10 = 0;
        while (true) {
            p0[] p0VarArr = this.f60054b;
            if (i10 >= p0VarArr.length) {
                return jL;
            }
            if (p0VarArr[i10].getState() != 0 && this.f60054b[i10].getStream() == h0VarO.f60123c[i10]) {
                long readingPositionUs = this.f60054b[i10].getReadingPositionUs();
                if (readingPositionUs == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jL = Math.max(readingPositionUs, jL);
            }
            i10++;
        }
    }

    public final void p0(int i10) throws ExoPlaybackException {
        this.B = i10;
        if (!this.f60071s.C(i10)) {
            a0(true);
        }
        v(false);
    }

    public final Pair<Object, Long> q(v0 v0Var, int i10, long j10) {
        return v0Var.j(this.f60063k, this.f60064l, i10, j10);
    }

    public final void q0(t0 t0Var) {
        this.f60072t = t0Var;
    }

    public Looper r() {
        return this.f60061i.getLooper();
    }

    public void r0(boolean z10) {
        this.f60060h.obtainMessage(13, z10 ? 1 : 0, 0).sendToTarget();
    }

    public final long s() {
        return t(this.f60073u.f60183k);
    }

    public final void s0(boolean z10) throws ExoPlaybackException {
        this.C = z10;
        if (!this.f60071s.D(z10)) {
            a0(true);
        }
        v(false);
    }

    public final long t(long j10) {
        h0 h0VarI = this.f60071s.i();
        if (h0VarI == null) {
            return 0L;
        }
        return Math.max(0L, j10 - h0VarI.y(this.G));
    }

    public final void t0(int i10) {
        k0 k0Var = this.f60073u;
        if (k0Var.f60177e != i10) {
            this.f60073u = k0Var.e(i10);
        }
    }

    public final void u(e5.q qVar) {
        if (this.f60071s.s(qVar)) {
            this.f60071s.t(this.G);
            E();
        }
    }

    public final boolean u0() {
        h0 h0VarN;
        h0 h0VarJ;
        if (!this.f60077y || (h0VarN = this.f60071s.n()) == null || (h0VarJ = h0VarN.j()) == null) {
            return false;
        }
        return (h0VarN != this.f60071s.o() || A()) && this.G >= h0VarJ.m();
    }

    public final void v(boolean z10) {
        h0 h0VarI = this.f60071s.i();
        r.a aVar = h0VarI == null ? this.f60073u.f60174b : h0VarI.f60126f.f60141a;
        boolean z11 = !this.f60073u.f60182j.equals(aVar);
        if (z11) {
            this.f60073u = this.f60073u.b(aVar);
        }
        k0 k0Var = this.f60073u;
        k0Var.f60183k = h0VarI == null ? k0Var.f60185m : h0VarI.i();
        this.f60073u.f60184l = s();
        if ((z11 || z10) && h0VarI != null && h0VarI.f60124d) {
            C0(h0VarI.n(), h0VarI.o());
        }
    }

    public final boolean v0() {
        if (!B()) {
            return false;
        }
        return this.f60058f.shouldContinueLoading(t(this.f60071s.i().k()), this.f60067o.getPlaybackParameters().f60187a);
    }

    public final void w(e5.q qVar) throws ExoPlaybackException {
        if (this.f60071s.s(qVar)) {
            h0 h0VarI = this.f60071s.i();
            h0VarI.p(this.f60067o.getPlaybackParameters().f60187a, this.f60073u.f60173a);
            C0(h0VarI.n(), h0VarI.o());
            if (h0VarI == this.f60071s.n()) {
                T(h0VarI.f60126f.f60142b);
                F0(null);
            }
            E();
        }
    }

    public final boolean w0(boolean z10) {
        if (this.f60075w.length == 0) {
            return C();
        }
        if (!z10) {
            return false;
        }
        if (!this.f60073u.f60179g) {
            return true;
        }
        h0 h0VarI = this.f60071s.i();
        return (h0VarI.q() && h0VarI.f60126f.f60147g) || this.f60058f.shouldStartPlayback(s(), this.f60067o.getPlaybackParameters().f60187a, this.f60078z);
    }

    public final void x(l0 l0Var, boolean z10) throws ExoPlaybackException {
        this.f60062j.obtainMessage(1, z10 ? 1 : 0, 0, l0Var).sendToTarget();
        G0(l0Var.f60187a);
        for (p0 p0Var : this.f60054b) {
            if (p0Var != null) {
                p0Var.c(l0Var.f60187a);
            }
        }
    }

    public final void x0() throws ExoPlaybackException {
        this.f60078z = false;
        this.f60067o.f();
        for (p0 p0Var : this.f60075w) {
            p0Var.start();
        }
    }

    public final void y() {
        if (this.f60073u.f60177e != 1) {
            t0(4);
        }
        S(false, false, true, false, true);
    }

    public void y0(boolean z10) {
        this.f60060h.obtainMessage(6, z10 ? 1 : 0, 0).sendToTarget();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0118 A[LOOP:0: B:48:0x0118->B:62:0x0118, LOOP_START, PHI: r12
      0x0118: PHI (r12v20 e4.h0) = (r12v17 e4.h0), (r12v21 e4.h0) binds: [B:47:0x0116, B:62:0x0118] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(e4.d0.b r12) throws com.google.android.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.d0.z(e4.d0$b):void");
    }

    public final void z0(boolean z10, boolean z11, boolean z12) {
        S(z10 || !this.D, true, z11, z11, z11);
        this.f60068p.e(this.E + (z12 ? 1 : 0));
        this.E = 0;
        this.f60058f.onStopped();
        t0(1);
    }
}
