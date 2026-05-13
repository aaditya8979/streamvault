package d6;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.source.i;

/* JADX INFO: compiled from: MediaPeriodHolder.java */
/* JADX INFO: loaded from: classes9.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.source.h f59617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f59618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e7.b0[] f59619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f59620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f59621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i1 f59622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f59623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f59624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u1[] f59625i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q7.a0 f59626j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.google.android.exoplayer2.s f59627k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public h1 f59628l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e7.i0 f59629m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public q7.b0 f59630n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f59631o;

    public h1(u1[] u1VarArr, long j10, q7.a0 a0Var, r7.b bVar, com.google.android.exoplayer2.s sVar, i1 i1Var, q7.b0 b0Var) {
        this.f59625i = u1VarArr;
        this.f59631o = j10;
        this.f59626j = a0Var;
        this.f59627k = sVar;
        i.b bVar2 = i1Var.f59638a;
        this.f59618b = bVar2.f60899a;
        this.f59622f = i1Var;
        this.f59629m = e7.i0.f60875e;
        this.f59630n = b0Var;
        this.f59619c = new e7.b0[u1VarArr.length];
        this.f59624h = new boolean[u1VarArr.length];
        this.f59617a = e(bVar2, sVar, bVar, i1Var.f59639b, i1Var.f59641d);
    }

    public static com.google.android.exoplayer2.source.h e(i.b bVar, com.google.android.exoplayer2.s sVar, r7.b bVar2, long j10, long j11) {
        com.google.android.exoplayer2.source.h hVarH = sVar.h(bVar, bVar2, j10);
        return j11 != -9223372036854775807L ? new com.google.android.exoplayer2.source.b(hVarH, true, 0L, j11) : hVarH;
    }

    public static void u(com.google.android.exoplayer2.s sVar, com.google.android.exoplayer2.source.h hVar) {
        try {
            if (hVar instanceof com.google.android.exoplayer2.source.b) {
                sVar.z(((com.google.android.exoplayer2.source.b) hVar).f22251b);
            } else {
                sVar.z(hVar);
            }
        } catch (RuntimeException e10) {
            s7.q.d("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public void A() {
        com.google.android.exoplayer2.source.h hVar = this.f59617a;
        if (hVar instanceof com.google.android.exoplayer2.source.b) {
            long j10 = this.f59622f.f59641d;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((com.google.android.exoplayer2.source.b) hVar).k(0L, j10);
        }
    }

    public long a(q7.b0 b0Var, long j10, boolean z10) {
        return b(b0Var, j10, z10, new boolean[this.f59625i.length]);
    }

    public long b(q7.b0 b0Var, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= b0Var.f78026a) {
                break;
            }
            boolean[] zArr2 = this.f59624h;
            if (z10 || !b0Var.b(this.f59630n, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        g(this.f59619c);
        f();
        this.f59630n = b0Var;
        h();
        long jB = this.f59617a.b(b0Var.f78028c, this.f59624h, this.f59619c, zArr, j10);
        c(this.f59619c);
        this.f59621e = false;
        int i11 = 0;
        while (true) {
            e7.b0[] b0VarArr = this.f59619c;
            if (i11 >= b0VarArr.length) {
                return jB;
            }
            if (b0VarArr[i11] != null) {
                s7.a.g(b0Var.c(i11));
                if (this.f59625i[i11].getTrackType() != -2) {
                    this.f59621e = true;
                }
            } else {
                s7.a.g(b0Var.f78028c[i11] == null);
            }
            i11++;
        }
    }

    public final void c(e7.b0[] b0VarArr) {
        int i10 = 0;
        while (true) {
            u1[] u1VarArr = this.f59625i;
            if (i10 >= u1VarArr.length) {
                return;
            }
            if (u1VarArr[i10].getTrackType() == -2 && this.f59630n.c(i10)) {
                b0VarArr[i10] = new e7.l();
            }
            i10++;
        }
    }

    public void d(long j10) {
        s7.a.g(r());
        this.f59617a.continueLoading(y(j10));
    }

    public final void f() {
        if (!r()) {
            return;
        }
        int i10 = 0;
        while (true) {
            q7.b0 b0Var = this.f59630n;
            if (i10 >= b0Var.f78026a) {
                return;
            }
            boolean zC = b0Var.c(i10);
            q7.r rVar = this.f59630n.f78028c[i10];
            if (zC && rVar != null) {
                rVar.disable();
            }
            i10++;
        }
    }

    public final void g(e7.b0[] b0VarArr) {
        int i10 = 0;
        while (true) {
            u1[] u1VarArr = this.f59625i;
            if (i10 >= u1VarArr.length) {
                return;
            }
            if (u1VarArr[i10].getTrackType() == -2) {
                b0VarArr[i10] = null;
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
            q7.b0 b0Var = this.f59630n;
            if (i10 >= b0Var.f78026a) {
                return;
            }
            boolean zC = b0Var.c(i10);
            q7.r rVar = this.f59630n.f78028c[i10];
            if (zC && rVar != null) {
                rVar.enable();
            }
            i10++;
        }
    }

    public long i() {
        if (!this.f59620d) {
            return this.f59622f.f59639b;
        }
        long bufferedPositionUs = this.f59621e ? this.f59617a.getBufferedPositionUs() : Long.MIN_VALUE;
        return bufferedPositionUs == Long.MIN_VALUE ? this.f59622f.f59642e : bufferedPositionUs;
    }

    @Nullable
    public h1 j() {
        return this.f59628l;
    }

    public long k() {
        if (this.f59620d) {
            return this.f59617a.getNextLoadPositionUs();
        }
        return 0L;
    }

    public long l() {
        return this.f59631o;
    }

    public long m() {
        return this.f59622f.f59639b + this.f59631o;
    }

    public e7.i0 n() {
        return this.f59629m;
    }

    public q7.b0 o() {
        return this.f59630n;
    }

    public void p(float f10, com.google.android.exoplayer2.c0 c0Var) throws ExoPlaybackException {
        this.f59620d = true;
        this.f59629m = this.f59617a.getTrackGroups();
        q7.b0 b0VarV = v(f10, c0Var);
        i1 i1Var = this.f59622f;
        long jMax = i1Var.f59639b;
        long j10 = i1Var.f59642e;
        if (j10 != -9223372036854775807L && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        long jA = a(b0VarV, jMax, false);
        long j11 = this.f59631o;
        i1 i1Var2 = this.f59622f;
        this.f59631o = j11 + (i1Var2.f59639b - jA);
        this.f59622f = i1Var2.b(jA);
    }

    public boolean q() {
        return this.f59620d && (!this.f59621e || this.f59617a.getBufferedPositionUs() == Long.MIN_VALUE);
    }

    public final boolean r() {
        return this.f59628l == null;
    }

    public void s(long j10) {
        s7.a.g(r());
        if (this.f59620d) {
            this.f59617a.reevaluateBuffer(y(j10));
        }
    }

    public void t() {
        f();
        u(this.f59627k, this.f59617a);
    }

    public q7.b0 v(float f10, com.google.android.exoplayer2.c0 c0Var) throws ExoPlaybackException {
        q7.b0 b0VarH = this.f59626j.h(this.f59625i, n(), this.f59622f.f59638a, c0Var);
        for (q7.r rVar : b0VarH.f78028c) {
            if (rVar != null) {
                rVar.onPlaybackSpeed(f10);
            }
        }
        return b0VarH;
    }

    public void w(@Nullable h1 h1Var) {
        if (h1Var == this.f59628l) {
            return;
        }
        f();
        this.f59628l = h1Var;
        h();
    }

    public void x(long j10) {
        this.f59631o = j10;
    }

    public long y(long j10) {
        return j10 - l();
    }

    public long z(long j10) {
        return j10 + l();
    }
}
