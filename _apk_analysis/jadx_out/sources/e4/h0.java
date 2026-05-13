package e4;

import androidx.annotation.Nullable;
import com.google.android.exoplayer.ExoPlaybackException;
import com.google.android.exoplayer.source.TrackGroupArray;
import e5.r;

/* JADX INFO: compiled from: MediaPeriodHolder.java */
/* JADX INFO: loaded from: classes12.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e5.q f60121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f60122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e5.i0[] f60123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f60124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f60125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i0 f60126f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f60127g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q0[] f60128h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w5.d f60129i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e5.r f60130j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public h0 f60131k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TrackGroupArray f60132l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public w5.e f60133m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f60134n;

    public h0(q0[] q0VarArr, long j10, w5.d dVar, y5.b bVar, e5.r rVar, i0 i0Var, w5.e eVar) {
        this.f60128h = q0VarArr;
        this.f60134n = j10;
        this.f60129i = dVar;
        this.f60130j = rVar;
        r.a aVar = i0Var.f60141a;
        this.f60122b = aVar.f60579a;
        this.f60126f = i0Var;
        this.f60132l = TrackGroupArray.f20391e;
        this.f60133m = eVar;
        this.f60123c = new e5.i0[q0VarArr.length];
        this.f60127g = new boolean[q0VarArr.length];
        this.f60121a = e(aVar, rVar, bVar, i0Var.f60142b, i0Var.f60144d);
    }

    public static e5.q e(r.a aVar, e5.r rVar, y5.b bVar, long j10, long j11) {
        e5.q qVarB = rVar.b(aVar, bVar, j10);
        return (j11 == -9223372036854775807L || j11 == Long.MIN_VALUE) ? qVarB : new e5.c(qVarB, true, 0L, j11);
    }

    public static void u(long j10, e5.r rVar, e5.q qVar) {
        try {
            if (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) {
                rVar.k(qVar);
            } else {
                rVar.k(((e5.c) qVar).f60366b);
            }
        } catch (RuntimeException e10) {
            a6.m.d("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public long a(w5.e eVar, long j10, boolean z10) {
        return b(eVar, j10, z10, new boolean[this.f60128h.length]);
    }

    public long b(w5.e eVar, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= eVar.f86338a) {
                break;
            }
            boolean[] zArr2 = this.f60127g;
            if (z10 || !eVar.b(this.f60133m, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        g(this.f60123c);
        f();
        this.f60133m = eVar;
        h();
        w5.c cVar = eVar.f86340c;
        long jE = this.f60121a.e(cVar.b(), this.f60127g, this.f60123c, zArr, j10);
        c(this.f60123c);
        this.f60125e = false;
        int i11 = 0;
        while (true) {
            e5.i0[] i0VarArr = this.f60123c;
            if (i11 >= i0VarArr.length) {
                return jE;
            }
            if (i0VarArr[i11] != null) {
                a6.a.f(eVar.c(i11));
                if (this.f60128h[i11].getTrackType() != 6) {
                    this.f60125e = true;
                }
            } else {
                a6.a.f(cVar.a(i11) == null);
            }
            i11++;
        }
    }

    public final void c(e5.i0[] i0VarArr) {
        int i10 = 0;
        while (true) {
            q0[] q0VarArr = this.f60128h;
            if (i10 >= q0VarArr.length) {
                return;
            }
            if (q0VarArr[i10].getTrackType() == 6 && this.f60133m.c(i10)) {
                i0VarArr[i10] = new e5.k();
            }
            i10++;
        }
    }

    public void d(long j10) {
        a6.a.f(r());
        this.f60121a.continueLoading(y(j10));
    }

    public final void f() {
        if (!r()) {
            return;
        }
        int i10 = 0;
        while (true) {
            w5.e eVar = this.f60133m;
            if (i10 >= eVar.f86338a) {
                return;
            }
            boolean zC = eVar.c(i10);
            com.google.android.exoplayer.trackselection.c cVarA = this.f60133m.f86340c.a(i10);
            if (zC && cVarA != null) {
                cVarA.disable();
            }
            i10++;
        }
    }

    public final void g(e5.i0[] i0VarArr) {
        int i10 = 0;
        while (true) {
            q0[] q0VarArr = this.f60128h;
            if (i10 >= q0VarArr.length) {
                return;
            }
            if (q0VarArr[i10].getTrackType() == 6) {
                i0VarArr[i10] = null;
            }
            i10++;
        }
    }

    public final void h() {
        if (!r()) {
            return;
        }
        int i10 = 0;
        while (true) {
            w5.e eVar = this.f60133m;
            if (i10 >= eVar.f86338a) {
                return;
            }
            boolean zC = eVar.c(i10);
            com.google.android.exoplayer.trackselection.c cVarA = this.f60133m.f86340c.a(i10);
            if (zC && cVarA != null) {
                cVarA.enable();
            }
            i10++;
        }
    }

    public long i() {
        if (!this.f60124d) {
            return this.f60126f.f60142b;
        }
        long bufferedPositionUs = this.f60125e ? this.f60121a.getBufferedPositionUs() : Long.MIN_VALUE;
        return bufferedPositionUs == Long.MIN_VALUE ? this.f60126f.f60145e : bufferedPositionUs;
    }

    @Nullable
    public h0 j() {
        return this.f60131k;
    }

    public long k() {
        if (this.f60124d) {
            return this.f60121a.getNextLoadPositionUs();
        }
        return 0L;
    }

    public long l() {
        return this.f60134n;
    }

    public long m() {
        return this.f60126f.f60142b + this.f60134n;
    }

    public TrackGroupArray n() {
        return this.f60132l;
    }

    public w5.e o() {
        return this.f60133m;
    }

    public void p(float f10, v0 v0Var) throws ExoPlaybackException {
        this.f60124d = true;
        this.f60132l = this.f60121a.getTrackGroups();
        long jA = a(v(f10, v0Var), this.f60126f.f60142b, false);
        long j10 = this.f60134n;
        i0 i0Var = this.f60126f;
        this.f60134n = j10 + (i0Var.f60142b - jA);
        this.f60126f = i0Var.b(jA);
    }

    public boolean q() {
        return this.f60124d && (!this.f60125e || this.f60121a.getBufferedPositionUs() == Long.MIN_VALUE);
    }

    public final boolean r() {
        return this.f60131k == null;
    }

    public void s(long j10) {
        a6.a.f(r());
        if (this.f60124d) {
            this.f60121a.reevaluateBuffer(y(j10));
        }
    }

    public void t() {
        f();
        u(this.f60126f.f60144d, this.f60130j, this.f60121a);
    }

    public w5.e v(float f10, v0 v0Var) throws ExoPlaybackException {
        w5.e eVarE = this.f60129i.e(this.f60128h, n(), this.f60126f.f60141a, v0Var);
        for (com.google.android.exoplayer.trackselection.c cVar : eVarE.f86340c.b()) {
            if (cVar != null) {
                cVar.onPlaybackSpeed(f10);
            }
        }
        return eVarE;
    }

    public void w(@Nullable h0 h0Var) {
        if (h0Var == this.f60131k) {
            return;
        }
        f();
        this.f60131k = h0Var;
        h();
    }

    public void x(long j10) {
        this.f60134n = j10;
    }

    public long y(long j10) {
        return j10 - l();
    }

    public long z(long j10) {
        return j10 + l();
    }
}
