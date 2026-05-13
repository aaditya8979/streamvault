package f4;

import android.view.Surface;
import androidx.annotation.Nullable;
import b6.i;
import b6.q;
import com.google.android.exoplayer.ExoPlaybackException;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.metadata.Metadata;
import com.google.android.exoplayer.source.TrackGroupArray;
import e4.l0;
import e4.n0;
import e4.v0;
import e5.b0;
import e5.r;
import f4.b;
import g4.e;
import j4.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import w4.d;
import y5.c;

/* JADX INFO: compiled from: AnalyticsCollector.java */
/* JADX INFO: loaded from: classes10.dex */
public class a implements n0.b, d, com.google.android.exoplayer.audio.a, q, b0, c.a, f, i, e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a6.c f61438c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n0 f61441f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArraySet<f4.b> f61437b = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f61440e = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v0.c f61439d = new v0.c();

    /* JADX INFO: renamed from: f4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AnalyticsCollector.java */
    public static final class C0759a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r.a f61442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v0 f61443b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f61444c;

        public C0759a(r.a aVar, v0 v0Var, int i10) {
            this.f61442a = aVar;
            this.f61443b = v0Var;
            this.f61444c = i10;
        }
    }

    /* JADX INFO: compiled from: AnalyticsCollector.java */
    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public C0759a f61448d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public C0759a f61449e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public C0759a f61450f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f61452h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList<C0759a> f61445a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashMap<r.a, C0759a> f61446b = new HashMap<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final v0.b f61447c = new v0.b();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public v0 f61451g = v0.f60303a;

        @Nullable
        public C0759a b() {
            return this.f61449e;
        }

        @Nullable
        public C0759a c() {
            if (this.f61445a.isEmpty()) {
                return null;
            }
            return this.f61445a.get(r0.size() - 1);
        }

        @Nullable
        public C0759a d(r.a aVar) {
            return this.f61446b.get(aVar);
        }

        @Nullable
        public C0759a e() {
            if (this.f61445a.isEmpty() || this.f61451g.q() || this.f61452h) {
                return null;
            }
            return this.f61445a.get(0);
        }

        @Nullable
        public C0759a f() {
            return this.f61450f;
        }

        public boolean g() {
            return this.f61452h;
        }

        public void h(int i10, r.a aVar) {
            int iB = this.f61451g.b(aVar.f60579a);
            boolean z10 = iB != -1;
            v0 v0Var = z10 ? this.f61451g : v0.f60303a;
            if (z10) {
                i10 = this.f61451g.f(iB, this.f61447c).f60306c;
            }
            C0759a c0759a = new C0759a(aVar, v0Var, i10);
            this.f61445a.add(c0759a);
            this.f61446b.put(aVar, c0759a);
            this.f61448d = this.f61445a.get(0);
            if (this.f61445a.size() != 1 || this.f61451g.q()) {
                return;
            }
            this.f61449e = this.f61448d;
        }

        public boolean i(r.a aVar) {
            C0759a c0759aRemove = this.f61446b.remove(aVar);
            if (c0759aRemove == null) {
                return false;
            }
            this.f61445a.remove(c0759aRemove);
            C0759a c0759a = this.f61450f;
            if (c0759a != null && aVar.equals(c0759a.f61442a)) {
                this.f61450f = this.f61445a.isEmpty() ? null : this.f61445a.get(0);
            }
            if (this.f61445a.isEmpty()) {
                return true;
            }
            this.f61448d = this.f61445a.get(0);
            return true;
        }

        public void j(int i10) {
            this.f61449e = this.f61448d;
        }

        public void k(r.a aVar) {
            this.f61450f = this.f61446b.get(aVar);
        }

        public void l() {
            this.f61452h = false;
            this.f61449e = this.f61448d;
        }

        public void m() {
            this.f61452h = true;
        }

        public void n(v0 v0Var) {
            for (int i10 = 0; i10 < this.f61445a.size(); i10++) {
                C0759a c0759aP = p(this.f61445a.get(i10), v0Var);
                this.f61445a.set(i10, c0759aP);
                this.f61446b.put(c0759aP.f61442a, c0759aP);
            }
            C0759a c0759a = this.f61450f;
            if (c0759a != null) {
                this.f61450f = p(c0759a, v0Var);
            }
            this.f61451g = v0Var;
            this.f61449e = this.f61448d;
        }

        @Nullable
        public C0759a o(int i10) {
            C0759a c0759a = null;
            for (int i11 = 0; i11 < this.f61445a.size(); i11++) {
                C0759a c0759a2 = this.f61445a.get(i11);
                int iB = this.f61451g.b(c0759a2.f61442a.f60579a);
                if (iB != -1 && this.f61451g.f(iB, this.f61447c).f60306c == i10) {
                    if (c0759a != null) {
                        return null;
                    }
                    c0759a = c0759a2;
                }
            }
            return c0759a;
        }

        public final C0759a p(C0759a c0759a, v0 v0Var) {
            int iB = v0Var.b(c0759a.f61442a.f60579a);
            if (iB == -1) {
                return c0759a;
            }
            return new C0759a(c0759a.f61442a, v0Var, v0Var.f(iB, this.f61447c).f60306c);
        }
    }

    public a(a6.c cVar) {
        this.f61438c = (a6.c) a6.a.e(cVar);
    }

    public final b.a A() {
        return z(this.f61440e.b());
    }

    public final b.a B() {
        return z(this.f61440e.c());
    }

    public final b.a C(int i10, @Nullable r.a aVar) {
        a6.a.e(this.f61441f);
        if (aVar != null) {
            C0759a c0759aD = this.f61440e.d(aVar);
            return c0759aD != null ? z(c0759aD) : y(v0.f60303a, i10, aVar);
        }
        v0 currentTimeline = this.f61441f.getCurrentTimeline();
        if (!(i10 < currentTimeline.p())) {
            currentTimeline = v0.f60303a;
        }
        return y(currentTimeline, i10, null);
    }

    public final b.a D() {
        return z(this.f61440e.e());
    }

    public final b.a E() {
        return z(this.f61440e.f());
    }

    public final void F() {
        if (this.f61440e.g()) {
            return;
        }
        b.a aVarD = D();
        this.f61440e.m();
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().F(aVarD);
        }
    }

    public final void G() {
        for (C0759a c0759a : new ArrayList(this.f61440e.f61445a)) {
            u(c0759a.f61444c, c0759a.f61442a);
        }
    }

    public void H(n0 n0Var) {
        a6.a.f(this.f61441f == null || this.f61440e.f61445a.isEmpty());
        this.f61441f = (n0) a6.a.e(n0Var);
    }

    @Override // e4.n0.b
    public final void a(l0 l0Var) {
        b.a aVarD = D();
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().u(aVarD, l0Var);
        }
    }

    @Override // e4.n0.b
    public final void b(ExoPlaybackException exoPlaybackException) {
        b.a aVarA = A();
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().w(aVarA, exoPlaybackException);
        }
    }

    @Override // e5.b0
    public final void c(int i10, @Nullable r.a aVar, b0.b bVar, b0.c cVar) {
        b.a aVarC = C(i10, aVar);
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().o(aVarC, bVar, cVar);
        }
    }

    @Override // e5.b0
    public final void d(int i10, r.a aVar) {
        this.f61440e.k(aVar);
        b.a aVarC = C(i10, aVar);
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().m(aVarC);
        }
    }

    @Override // e4.n0.b
    public final void e(TrackGroupArray trackGroupArray, w5.c cVar) {
        b.a aVarD = D();
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().a(aVarD, trackGroupArray, cVar);
        }
    }

    @Override // e5.b0
    public final void f(int i10, @Nullable r.a aVar, b0.c cVar) {
        b.a aVarC = C(i10, aVar);
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().J(aVarC, cVar);
        }
    }

    @Override // e5.b0
    public final void g(int i10, @Nullable r.a aVar, b0.c cVar) {
        b.a aVarC = C(i10, aVar);
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().M(aVarC, cVar);
        }
    }

    @Override // j4.f
    public final void h() {
        b.a aVarE = E();
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().z(aVarE);
        }
    }

    @Override // com.google.android.exoplayer.audio.a
    public final void i(i4.d dVar) {
        b.a aVarD = D();
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().v(aVarD, 1, dVar);
        }
    }

    @Override // e4.n0.b
    public final void j(v0 v0Var, int i10) {
        this.f61440e.n(v0Var);
        b.a aVarD = D();
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().E(aVarD, i10);
        }
    }

    @Override // w4.d
    public final void k(Metadata metadata) {
        b.a aVarD = D();
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().h(aVarD, metadata);
        }
    }

    @Override // com.google.android.exoplayer.audio.a
    public final void l(Format format) {
        b.a aVarE = E();
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().t(aVarE, 1, format);
        }
    }

    @Override // j4.f
    public final void m() {
        b.a aVarA = A();
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().r(aVarA);
        }
    }

    @Override // e5.b0
    public final void n(int i10, @Nullable r.a aVar, b0.b bVar, b0.c cVar, IOException iOException, boolean z10) {
        b.a aVarC = C(i10, aVar);
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().f(aVarC, bVar, cVar, iOException, z10);
        }
    }

    @Override // e5.b0
    public final void o(int i10, @Nullable r.a aVar, b0.b bVar, b0.c cVar) {
        b.a aVarC = C(i10, aVar);
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().k(aVarC, bVar, cVar);
        }
    }

    @Override // com.google.android.exoplayer.audio.a
    public final void onAudioDecoderInitialized(String str, long j10, long j11) {
        b.a aVarE = E();
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().G(aVarE, 1, str, j11);
        }
    }

    @Override // com.google.android.exoplayer.audio.a
    public final void onAudioSessionId(int i10) {
        b.a aVarE = E();
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().l(aVarE, i10);
        }
    }

    @Override // com.google.android.exoplayer.audio.a
    public final void onAudioSinkUnderrun(int i10, long j10, long j11) {
        b.a aVarE = E();
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().j(aVarE, i10, j10, j11);
        }
    }

    @Override // y5.c.a
    public final void onBandwidthSample(int i10, long j10, long j11) {
        b.a aVarB = B();
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().q(aVarB, i10, j10, j11);
        }
    }

    @Override // j4.f
    public final void onDrmKeysLoaded() {
        b.a aVarE = E();
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().y(aVarE);
        }
    }

    @Override // j4.f
    public final void onDrmKeysRestored() {
        b.a aVarE = E();
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().b(aVarE);
        }
    }

    @Override // j4.f
    public final void onDrmSessionManagerError(Exception exc) {
        b.a aVarE = E();
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().d(aVarE, exc);
        }
    }

    @Override // b6.q
    public final void onDroppedFrames(int i10, long j10) {
        b.a aVarA = A();
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().s(aVarA, i10, j10);
        }
    }

    @Override // e4.n0.b
    public void onIsPlayingChanged(boolean z10) {
        b.a aVarD = D();
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().c(aVarD, z10);
        }
    }

    @Override // e4.n0.b
    public final void onLoadingChanged(boolean z10) {
        b.a aVarD = D();
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().g(aVarD, z10);
        }
    }

    @Override // e4.n0.b
    public void onPlaybackSuppressionReasonChanged(int i10) {
        b.a aVarD = D();
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().B(aVarD, i10);
        }
    }

    @Override // e4.n0.b
    public final void onPlayerStateChanged(boolean z10, int i10) {
        b.a aVarD = D();
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().C(aVarD, z10, i10);
        }
    }

    @Override // e4.n0.b
    public final void onPositionDiscontinuity(int i10) {
        this.f61440e.j(i10);
        b.a aVarD = D();
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().L(aVarD, i10);
        }
    }

    @Override // b6.i
    public final void onRenderedFirstFrame() {
    }

    @Override // b6.q
    public final void onRenderedFirstFrame(@Nullable Surface surface) {
        b.a aVarE = E();
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().i(aVarE, surface);
        }
    }

    @Override // e4.n0.b
    public final void onRepeatModeChanged(int i10) {
        b.a aVarD = D();
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().K(aVarD, i10);
        }
    }

    @Override // e4.n0.b
    public final void onSeekProcessed() {
        if (this.f61440e.g()) {
            this.f61440e.l();
            b.a aVarD = D();
            Iterator<f4.b> it = this.f61437b.iterator();
            while (it.hasNext()) {
                it.next().n(aVarD);
            }
        }
    }

    @Override // e4.n0.b
    public final void onShuffleModeEnabledChanged(boolean z10) {
        b.a aVarD = D();
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().D(aVarD, z10);
        }
    }

    @Override // b6.i
    public void onSurfaceSizeChanged(int i10, int i11) {
        b.a aVarE = E();
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().A(aVarE, i10, i11);
        }
    }

    @Override // b6.q
    public final void onVideoDecoderInitialized(String str, long j10, long j11) {
        b.a aVarE = E();
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().G(aVarE, 2, str, j11);
        }
    }

    @Override // b6.q
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        b.a aVarE = E();
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().I(aVarE, i10, i11, i12, f10);
        }
    }

    @Override // g4.e
    public void onVolumeChanged(float f10) {
        b.a aVarE = E();
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().x(aVarE, f10);
        }
    }

    @Override // b6.q
    public final void p(i4.d dVar) {
        b.a aVarA = A();
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().N(aVarA, 2, dVar);
        }
    }

    @Override // e5.b0
    public final void q(int i10, r.a aVar) {
        this.f61440e.h(i10, aVar);
        b.a aVarC = C(i10, aVar);
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().H(aVarC);
        }
    }

    @Override // com.google.android.exoplayer.audio.a
    public final void r(i4.d dVar) {
        b.a aVarA = A();
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().N(aVarA, 1, dVar);
        }
    }

    @Override // b6.q
    public final void s(i4.d dVar) {
        b.a aVarD = D();
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().v(aVarD, 2, dVar);
        }
    }

    @Override // b6.q
    public final void t(Format format) {
        b.a aVarE = E();
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().t(aVarE, 2, format);
        }
    }

    @Override // e5.b0
    public final void u(int i10, r.a aVar) {
        b.a aVarC = C(i10, aVar);
        if (this.f61440e.i(aVar)) {
            Iterator<f4.b> it = this.f61437b.iterator();
            while (it.hasNext()) {
                it.next().e(aVarC);
            }
        }
    }

    @Override // e5.b0
    public final void v(int i10, @Nullable r.a aVar, b0.b bVar, b0.c cVar) {
        b.a aVarC = C(i10, aVar);
        Iterator<f4.b> it = this.f61437b.iterator();
        while (it.hasNext()) {
            it.next().p(aVarC, bVar, cVar);
        }
    }

    public void x(f4.b bVar) {
        this.f61437b.add(bVar);
    }

    public b.a y(v0 v0Var, int i10, @Nullable r.a aVar) {
        if (v0Var.q()) {
            aVar = null;
        }
        r.a aVar2 = aVar;
        long jElapsedRealtime = this.f61438c.elapsedRealtime();
        boolean z10 = v0Var == this.f61441f.getCurrentTimeline() && i10 == this.f61441f.getCurrentWindowIndex();
        long jA = 0;
        if (aVar2 != null && aVar2.b()) {
            if (z10 && this.f61441f.getCurrentAdGroupIndex() == aVar2.f60580b && this.f61441f.getCurrentAdIndexInAdGroup() == aVar2.f60581c) {
                jA = this.f61441f.getCurrentPosition();
            }
        } else if (z10) {
            jA = this.f61441f.getContentPosition();
        } else if (!v0Var.q()) {
            jA = v0Var.n(i10, this.f61439d).a();
        }
        return new b.a(jElapsedRealtime, v0Var, i10, aVar2, jA, this.f61441f.getCurrentPosition(), this.f61441f.getTotalBufferedDuration());
    }

    public final b.a z(@Nullable C0759a c0759a) {
        a6.a.e(this.f61441f);
        if (c0759a == null) {
            int currentWindowIndex = this.f61441f.getCurrentWindowIndex();
            C0759a c0759aO = this.f61440e.o(currentWindowIndex);
            if (c0759aO == null) {
                v0 currentTimeline = this.f61441f.getCurrentTimeline();
                if (!(currentWindowIndex < currentTimeline.p())) {
                    currentTimeline = v0.f60303a;
                }
                return y(currentTimeline, currentWindowIndex, null);
            }
            c0759a = c0759aO;
        }
        return y(c0759a.f61443b, c0759a.f61444c, c0759a.f61442a);
    }
}
