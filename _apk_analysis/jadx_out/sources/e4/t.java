package e4;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.ExoPlaybackException;
import com.google.android.exoplayer.IllegalSeekPositionException;
import com.google.android.exoplayer.source.TrackGroupArray;
import com.ironsource.C3978d4;
import e4.d;
import e4.n0;
import e4.o0;
import e4.v0;
import e5.r;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: ExoPlayerImpl.java */
/* JADX INFO: loaded from: classes7.dex */
public final class t extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w5.e f60219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0[] f60220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w5.d f60221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f60222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d0 f60223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f60224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArrayList<d.a> f60225h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v0.b f60226i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayDeque<Runnable> f60227j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e5.r f60228k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f60229l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f60230m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f60231n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f60232o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f60233p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f60234q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f60235r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f60236s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public l0 f60237t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public t0 f60238u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public k0 f60239v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f60240w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f60241x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f60242y;

    /* JADX INFO: compiled from: ExoPlayerImpl.java */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            t.this.D(message);
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImpl.java */
    public static final class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k0 f60244b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList<d.a> f60245c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final w5.d f60246d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f60247e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f60248f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f60249g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f60250h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f60251i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f60252j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f60253k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f60254l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f60255m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f60256n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final boolean f60257o;

        public b(k0 k0Var, k0 k0Var2, CopyOnWriteArrayList<d.a> copyOnWriteArrayList, w5.d dVar, boolean z10, int i10, int i11, boolean z11, boolean z12, boolean z13) {
            this.f60244b = k0Var;
            this.f60245c = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
            this.f60246d = dVar;
            this.f60247e = z10;
            this.f60248f = i10;
            this.f60249g = i11;
            this.f60250h = z11;
            this.f60256n = z12;
            this.f60257o = z13;
            this.f60251i = k0Var2.f60177e != k0Var.f60177e;
            ExoPlaybackException exoPlaybackException = k0Var2.f60178f;
            ExoPlaybackException exoPlaybackException2 = k0Var.f60178f;
            this.f60252j = (exoPlaybackException == exoPlaybackException2 || exoPlaybackException2 == null) ? false : true;
            this.f60253k = k0Var2.f60173a != k0Var.f60173a;
            this.f60254l = k0Var2.f60179g != k0Var.f60179g;
            this.f60255m = k0Var2.f60181i != k0Var.f60181i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(n0.b bVar) {
            bVar.j(this.f60244b.f60173a, this.f60249g);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(n0.b bVar) {
            bVar.onPositionDiscontinuity(this.f60248f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(n0.b bVar) {
            bVar.b(this.f60244b.f60178f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l(n0.b bVar) {
            k0 k0Var = this.f60244b;
            bVar.e(k0Var.f60180h, k0Var.f60181i.f86340c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(n0.b bVar) {
            bVar.onLoadingChanged(this.f60244b.f60179g);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(n0.b bVar) {
            bVar.onPlayerStateChanged(this.f60256n, this.f60244b.f60177e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void p(n0.b bVar) {
            bVar.onIsPlayingChanged(this.f60244b.f60177e == 3);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f60253k || this.f60249g == 0) {
                t.G(this.f60245c, new d.b() { // from class: e4.u
                    @Override // e4.d.b
                    public final void a(n0.b bVar) {
                        this.f60265a.i(bVar);
                    }
                });
            }
            if (this.f60247e) {
                t.G(this.f60245c, new d.b() { // from class: e4.v
                    @Override // e4.d.b
                    public final void a(n0.b bVar) {
                        this.f60302a.j(bVar);
                    }
                });
            }
            if (this.f60252j) {
                t.G(this.f60245c, new d.b() { // from class: e4.w
                    @Override // e4.d.b
                    public final void a(n0.b bVar) {
                        this.f60324a.k(bVar);
                    }
                });
            }
            if (this.f60255m) {
                this.f60246d.d(this.f60244b.f60181i.f86341d);
                t.G(this.f60245c, new d.b() { // from class: e4.x
                    @Override // e4.d.b
                    public final void a(n0.b bVar) {
                        this.f60329a.l(bVar);
                    }
                });
            }
            if (this.f60254l) {
                t.G(this.f60245c, new d.b() { // from class: e4.y
                    @Override // e4.d.b
                    public final void a(n0.b bVar) {
                        this.f60334a.m(bVar);
                    }
                });
            }
            if (this.f60251i) {
                t.G(this.f60245c, new d.b() { // from class: e4.z
                    @Override // e4.d.b
                    public final void a(n0.b bVar) {
                        this.f60335a.n(bVar);
                    }
                });
            }
            if (this.f60257o) {
                t.G(this.f60245c, new d.b() { // from class: e4.a0
                    @Override // e4.d.b
                    public final void a(n0.b bVar) {
                        this.f60035a.p(bVar);
                    }
                });
            }
            if (this.f60250h) {
                t.G(this.f60245c, new d.b() { // from class: e4.b0
                    @Override // e4.d.b
                    public final void a(n0.b bVar) {
                        bVar.onSeekProcessed();
                    }
                });
            }
        }
    }

    @SuppressLint({"HandlerLeak"})
    public t(p0[] p0VarArr, w5.d dVar, g0 g0Var, y5.c cVar, a6.c cVar2, Looper looper) {
        a6.m.f("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.11.7] [" + a6.k0.f3578e + C3978d4.j.f31385e);
        a6.a.f(p0VarArr.length > 0);
        this.f60220c = (p0[]) a6.a.e(p0VarArr);
        this.f60221d = (w5.d) a6.a.e(dVar);
        this.f60229l = false;
        this.f60231n = 0;
        this.f60232o = false;
        this.f60225h = new CopyOnWriteArrayList<>();
        w5.e eVar = new w5.e(new r0[p0VarArr.length], new com.google.android.exoplayer.trackselection.c[p0VarArr.length], null);
        this.f60219b = eVar;
        this.f60226i = new v0.b();
        this.f60237t = l0.f60186e;
        this.f60238u = t0.f60262g;
        this.f60230m = 0;
        a aVar = new a(looper);
        this.f60222e = aVar;
        this.f60239v = k0.h(0L, eVar);
        this.f60227j = new ArrayDeque<>();
        d0 d0Var = new d0(p0VarArr, dVar, eVar, g0Var, cVar, this.f60229l, this.f60231n, this.f60232o, aVar, cVar2);
        this.f60223f = d0Var;
        this.f60224g = new Handler(d0Var.r());
    }

    public static void G(CopyOnWriteArrayList<d.a> copyOnWriteArrayList, d.b bVar) {
        Iterator<d.a> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
    }

    public static /* synthetic */ void K(boolean z10, boolean z11, int i10, boolean z12, int i11, boolean z13, boolean z14, n0.b bVar) {
        if (z10) {
            bVar.onPlayerStateChanged(z11, i10);
        }
        if (z12) {
            bVar.onPlaybackSuppressionReasonChanged(i11);
        }
        if (z13) {
            bVar.onIsPlayingChanged(z14);
        }
    }

    public l0 A() {
        return this.f60237t;
    }

    public final k0 B(boolean z10, boolean z11, boolean z12, int i10) {
        if (z10) {
            this.f60240w = 0;
            this.f60241x = 0;
            this.f60242y = 0L;
        } else {
            this.f60240w = getCurrentWindowIndex();
            this.f60241x = y();
            this.f60242y = getCurrentPosition();
        }
        boolean z13 = z10 || z11;
        r.a aVarI = z13 ? this.f60239v.i(this.f60232o, this.f60051a, this.f60226i) : this.f60239v.f60174b;
        long j10 = z13 ? 0L : this.f60239v.f60185m;
        return new k0(z11 ? v0.f60303a : this.f60239v.f60173a, aVarI, j10, z13 ? -9223372036854775807L : this.f60239v.f60176d, i10, z12 ? null : this.f60239v.f60178f, false, z11 ? TrackGroupArray.f20391e : this.f60239v.f60180h, z11 ? this.f60219b : this.f60239v.f60181i, aVarI, j10, 0L, j10);
    }

    public w5.d C() {
        return this.f60221d;
    }

    public void D(Message message) {
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException();
            }
            F((l0) message.obj, message.arg1 != 0);
        } else {
            k0 k0Var = (k0) message.obj;
            int i11 = message.arg1;
            int i12 = message.arg2;
            E(k0Var, i11, i12 != -1, i12);
        }
    }

    public final void E(k0 k0Var, int i10, boolean z10, int i11) {
        int i12 = this.f60233p - i10;
        this.f60233p = i12;
        if (i12 == 0) {
            if (k0Var.f60175c == -9223372036854775807L) {
                k0Var = k0Var.c(k0Var.f60174b, 0L, k0Var.f60176d, k0Var.f60184l);
            }
            k0 k0Var2 = k0Var;
            if (!this.f60239v.f60173a.q() && k0Var2.f60173a.q()) {
                this.f60241x = 0;
                this.f60240w = 0;
                this.f60242y = 0L;
            }
            int i13 = this.f60234q ? 0 : 2;
            boolean z11 = this.f60235r;
            this.f60234q = false;
            this.f60235r = false;
            W(k0Var2, z10, i11, i13, z11);
        }
    }

    public final void F(final l0 l0Var, boolean z10) {
        if (z10) {
            this.f60236s--;
        }
        if (this.f60236s != 0 || this.f60237t.equals(l0Var)) {
            return;
        }
        this.f60237t = l0Var;
        O(new d.b() { // from class: e4.r
            @Override // e4.d.b
            public final void a(n0.b bVar) {
                bVar.a(l0Var);
            }
        });
    }

    public final void O(final d.b bVar) {
        final CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(this.f60225h);
        P(new Runnable() { // from class: e4.s
            @Override // java.lang.Runnable
            public final void run() {
                t.G(copyOnWriteArrayList, bVar);
            }
        });
    }

    public final void P(Runnable runnable) {
        boolean z10 = !this.f60227j.isEmpty();
        this.f60227j.addLast(runnable);
        if (z10) {
            return;
        }
        while (!this.f60227j.isEmpty()) {
            this.f60227j.peekFirst().run();
            this.f60227j.removeFirst();
        }
    }

    public final long Q(r.a aVar, long j10) {
        long jB = k.b(j10);
        this.f60239v.f60173a.h(aVar.f60579a, this.f60226i);
        return jB + this.f60226i.l();
    }

    public void R(e5.r rVar, boolean z10, boolean z11) {
        this.f60228k = rVar;
        k0 k0VarB = B(z10, z11, true, 2);
        this.f60234q = true;
        this.f60233p++;
        this.f60223f.N(rVar, z10, z11);
        W(k0VarB, false, 4, 1, false);
    }

    public void S() {
        a6.m.f("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.11.7] [" + a6.k0.f3578e + "] [" + e0.b() + C3978d4.j.f31385e);
        this.f60228k = null;
        this.f60223f.P();
        this.f60222e.removeCallbacksAndMessages(null);
        this.f60239v = B(false, false, false, 1);
    }

    public void T(final boolean z10, final int i10) {
        boolean zJ = j();
        boolean z11 = this.f60229l && this.f60230m == 0;
        boolean z12 = z10 && i10 == 0;
        if (z11 != z12) {
            this.f60223f.k0(z12);
        }
        final boolean z13 = this.f60229l != z10;
        final boolean z14 = this.f60230m != i10;
        this.f60229l = z10;
        this.f60230m = i10;
        final boolean zJ2 = j();
        final boolean z15 = zJ != zJ2;
        if (z13 || z14 || z15) {
            final int i11 = this.f60239v.f60177e;
            O(new d.b() { // from class: e4.n
                @Override // e4.d.b
                public final void a(n0.b bVar) {
                    t.K(z13, z10, i11, z14, i10, z15, zJ2, bVar);
                }
            });
        }
    }

    public void U(@Nullable final l0 l0Var) {
        if (l0Var == null) {
            l0Var = l0.f60186e;
        }
        if (this.f60237t.equals(l0Var)) {
            return;
        }
        this.f60236s++;
        this.f60237t = l0Var;
        this.f60223f.m0(l0Var);
        O(new d.b() { // from class: e4.m
            @Override // e4.d.b
            public final void a(n0.b bVar) {
                bVar.a(l0Var);
            }
        });
    }

    public final boolean V() {
        return this.f60239v.f60173a.q() || this.f60233p > 0;
    }

    public final void W(k0 k0Var, boolean z10, int i10, int i11, boolean z11) {
        boolean zJ = j();
        k0 k0Var2 = this.f60239v;
        this.f60239v = k0Var;
        P(new b(k0Var, k0Var2, this.f60225h, this.f60221d, z10, i10, i11, z11, this.f60229l, zJ != j()));
    }

    @Override // e4.n0
    public void c(n0.b bVar) {
        for (d.a aVar : this.f60225h) {
            if (aVar.f60052a.equals(bVar)) {
                aVar.b();
                this.f60225h.remove(aVar);
            }
        }
    }

    @Override // e4.n0
    public void e(n0.b bVar) {
        this.f60225h.addIfAbsent(new d.a(bVar));
    }

    @Override // e4.n0
    public long getBufferedPosition() {
        if (!isPlayingAd()) {
            return x();
        }
        k0 k0Var = this.f60239v;
        return k0Var.f60182j.equals(k0Var.f60174b) ? k.b(this.f60239v.f60183k) : getDuration();
    }

    @Override // e4.n0
    public long getContentPosition() {
        if (!isPlayingAd()) {
            return getCurrentPosition();
        }
        k0 k0Var = this.f60239v;
        k0Var.f60173a.h(k0Var.f60174b.f60579a, this.f60226i);
        k0 k0Var2 = this.f60239v;
        return k0Var2.f60176d == -9223372036854775807L ? k0Var2.f60173a.n(getCurrentWindowIndex(), this.f60051a).a() : this.f60226i.l() + k.b(this.f60239v.f60176d);
    }

    @Override // e4.n0
    public int getCurrentAdGroupIndex() {
        if (isPlayingAd()) {
            return this.f60239v.f60174b.f60580b;
        }
        return -1;
    }

    @Override // e4.n0
    public int getCurrentAdIndexInAdGroup() {
        if (isPlayingAd()) {
            return this.f60239v.f60174b.f60581c;
        }
        return -1;
    }

    @Override // e4.n0
    public long getCurrentPosition() {
        if (V()) {
            return this.f60242y;
        }
        if (this.f60239v.f60174b.b()) {
            return k.b(this.f60239v.f60185m);
        }
        k0 k0Var = this.f60239v;
        return Q(k0Var.f60174b, k0Var.f60185m);
    }

    @Override // e4.n0
    public v0 getCurrentTimeline() {
        return this.f60239v.f60173a;
    }

    @Override // e4.n0
    public TrackGroupArray getCurrentTrackGroups() {
        return this.f60239v.f60180h;
    }

    @Override // e4.n0
    public w5.c getCurrentTrackSelections() {
        return this.f60239v.f60181i.f86340c;
    }

    @Override // e4.n0
    public int getCurrentWindowIndex() {
        if (V()) {
            return this.f60240w;
        }
        k0 k0Var = this.f60239v;
        return k0Var.f60173a.h(k0Var.f60174b.f60579a, this.f60226i).f60306c;
    }

    @Override // e4.n0
    public long getDuration() {
        if (!isPlayingAd()) {
            return h();
        }
        k0 k0Var = this.f60239v;
        r.a aVar = k0Var.f60174b;
        k0Var.f60173a.h(aVar.f60579a, this.f60226i);
        return k.b(this.f60226i.b(aVar.f60580b, aVar.f60581c));
    }

    @Override // e4.n0
    public boolean getPlayWhenReady() {
        return this.f60229l;
    }

    @Override // e4.n0
    public int getPlaybackState() {
        return this.f60239v.f60177e;
    }

    @Override // e4.n0
    public int getPlaybackSuppressionReason() {
        return this.f60230m;
    }

    @Override // e4.n0
    public int getRendererType(int i10) {
        return this.f60220c[i10].getTrackType();
    }

    @Override // e4.n0
    public int getRepeatMode() {
        return this.f60231n;
    }

    @Override // e4.n0
    public boolean getShuffleModeEnabled() {
        return this.f60232o;
    }

    @Override // e4.n0
    @Nullable
    public n0.c getTextComponent() {
        return null;
    }

    @Override // e4.n0
    public long getTotalBufferedDuration() {
        return k.b(this.f60239v.f60184l);
    }

    @Override // e4.n0
    @Nullable
    public n0.d getVideoComponent() {
        return null;
    }

    @Override // e4.n0
    public boolean isPlayingAd() {
        return !V() && this.f60239v.f60174b.b();
    }

    @Override // e4.n0
    public void seekTo(int i10, long j10) {
        v0 v0Var = this.f60239v.f60173a;
        if (i10 < 0 || (!v0Var.q() && i10 >= v0Var.p())) {
            throw new IllegalSeekPositionException(v0Var, i10, j10);
        }
        this.f60235r = true;
        this.f60233p++;
        if (isPlayingAd()) {
            a6.m.h("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            this.f60222e.obtainMessage(0, 1, -1, this.f60239v).sendToTarget();
            return;
        }
        this.f60240w = i10;
        if (v0Var.q()) {
            this.f60242y = j10 == -9223372036854775807L ? 0L : j10;
            this.f60241x = 0;
        } else {
            long jB = j10 == -9223372036854775807L ? v0Var.n(i10, this.f60051a).b() : k.a(j10);
            Pair<Object, Long> pairJ = v0Var.j(this.f60051a, this.f60226i, i10, jB);
            this.f60242y = k.b(jB);
            this.f60241x = v0Var.b(pairJ.first);
        }
        this.f60223f.Z(v0Var, i10, k.a(j10));
        O(new d.b() { // from class: e4.p
            @Override // e4.d.b
            public final void a(n0.b bVar) {
                bVar.onPositionDiscontinuity(1);
            }
        });
    }

    @Override // e4.n0
    public void setPlayWhenReady(boolean z10) {
        T(z10, 0);
    }

    @Override // e4.n0
    public void setRepeatMode(final int i10) {
        if (this.f60231n != i10) {
            this.f60231n = i10;
            this.f60223f.o0(i10);
            O(new d.b() { // from class: e4.o
                @Override // e4.d.b
                public final void a(n0.b bVar) {
                    bVar.onRepeatModeChanged(i10);
                }
            });
        }
    }

    @Override // e4.n0
    public void setShuffleModeEnabled(final boolean z10) {
        if (this.f60232o != z10) {
            this.f60232o = z10;
            this.f60223f.r0(z10);
            O(new d.b() { // from class: e4.q
                @Override // e4.d.b
                public final void a(n0.b bVar) {
                    bVar.onShuffleModeEnabledChanged(z10);
                }
            });
        }
    }

    @Override // e4.n0
    public void stop(boolean z10) {
        if (z10) {
            this.f60228k = null;
        }
        k0 k0VarB = B(z10, z10, z10, 1);
        this.f60233p++;
        this.f60223f.y0(z10);
        W(k0VarB, false, 4, 1, false);
    }

    public o0 v(o0.b bVar) {
        return new o0(this.f60223f, bVar, this.f60239v.f60173a, getCurrentWindowIndex(), this.f60224g);
    }

    public Looper w() {
        return this.f60222e.getLooper();
    }

    public long x() {
        if (V()) {
            return this.f60242y;
        }
        k0 k0Var = this.f60239v;
        if (k0Var.f60182j.f60582d != k0Var.f60174b.f60582d) {
            return k0Var.f60173a.n(getCurrentWindowIndex(), this.f60051a).c();
        }
        long j10 = k0Var.f60183k;
        if (this.f60239v.f60182j.b()) {
            k0 k0Var2 = this.f60239v;
            v0.b bVarH = k0Var2.f60173a.h(k0Var2.f60182j.f60579a, this.f60226i);
            long jF = bVarH.f(this.f60239v.f60182j.f60580b);
            j10 = jF == Long.MIN_VALUE ? bVarH.f60307d : jF;
        }
        return Q(this.f60239v.f60182j, j10);
    }

    public int y() {
        if (V()) {
            return this.f60241x;
        }
        k0 k0Var = this.f60239v;
        return k0Var.f60173a.b(k0Var.f60174b.f60579a);
    }

    @Nullable
    public ExoPlaybackException z() {
        return this.f60239v.f60178f;
    }
}
