package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.source.i;
import java.io.IOException;
import java.util.ArrayList;
import s7.m0;

/* JADX INFO: loaded from: classes.dex */
public final class ClippingMediaSource extends t {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f22215m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f22216n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f22217o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f22218p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f22219q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList<b> f22220r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c0.d f22221s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public a f22222t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public IllegalClippingException f22223u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f22224v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f22225w;

    public static final class IllegalClippingException extends IOException {
        public static final int REASON_INVALID_PERIOD_COUNT = 0;
        public static final int REASON_NOT_SEEKABLE_TO_START = 1;
        public static final int REASON_START_EXCEEDS_END = 2;
        public final int reason;

        public IllegalClippingException(int i10) {
            super("Illegal clipping: " + a(i10));
            this.reason = i10;
        }

        public static String a(int i10) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count";
        }
    }

    public static final class a extends e7.m {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f22226e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f22227f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f22228g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f22229h;

        public a(c0 c0Var, long j10, long j11) throws IllegalClippingException {
            super(c0Var);
            boolean z10 = false;
            if (c0Var.m() != 1) {
                throw new IllegalClippingException(0);
            }
            c0.d dVarR = c0Var.r(0, new c0.d());
            long jMax = Math.max(0L, j10);
            if (!dVarR.f21413m && jMax != 0 && !dVarR.f21409i) {
                throw new IllegalClippingException(1);
            }
            long jMax2 = j11 == Long.MIN_VALUE ? dVarR.f21415o : Math.max(0L, j11);
            long j12 = dVarR.f21415o;
            if (j12 != -9223372036854775807L) {
                jMax2 = jMax2 > j12 ? j12 : jMax2;
                if (jMax > jMax2) {
                    throw new IllegalClippingException(2);
                }
            }
            this.f22226e = jMax;
            this.f22227f = jMax2;
            this.f22228g = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
            if (dVarR.f21410j && (jMax2 == -9223372036854775807L || (j12 != -9223372036854775807L && jMax2 == j12))) {
                z10 = true;
            }
            this.f22229h = z10;
        }

        @Override // e7.m, com.google.android.exoplayer2.c0
        public c0.b k(int i10, c0.b bVar, boolean z10) {
            this.f60883d.k(0, bVar, z10);
            long jQ = bVar.q() - this.f22226e;
            long j10 = this.f22228g;
            return bVar.v(bVar.f21387b, bVar.f21388c, 0, j10 == -9223372036854775807L ? -9223372036854775807L : j10 - jQ, jQ);
        }

        @Override // e7.m, com.google.android.exoplayer2.c0
        public c0.d s(int i10, c0.d dVar, long j10) {
            this.f60883d.s(0, dVar, 0L);
            long j11 = dVar.f21418r;
            long j12 = this.f22226e;
            dVar.f21418r = j11 + j12;
            dVar.f21415o = this.f22228g;
            dVar.f21410j = this.f22229h;
            long j13 = dVar.f21414n;
            if (j13 != -9223372036854775807L) {
                long jMax = Math.max(j13, j12);
                dVar.f21414n = jMax;
                long j14 = this.f22227f;
                if (j14 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j14);
                }
                dVar.f21414n = jMax - this.f22226e;
            }
            long jQ0 = m0.Q0(this.f22226e);
            long j15 = dVar.f21406f;
            if (j15 != -9223372036854775807L) {
                dVar.f21406f = j15 + jQ0;
            }
            long j16 = dVar.f21407g;
            if (j16 != -9223372036854775807L) {
                dVar.f21407g = j16 + jQ0;
            }
            return dVar;
        }
    }

    public ClippingMediaSource(i iVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
        super((i) s7.a.e(iVar));
        s7.a.a(j10 >= 0);
        this.f22215m = j10;
        this.f22216n = j11;
        this.f22217o = z10;
        this.f22218p = z11;
        this.f22219q = z12;
        this.f22220r = new ArrayList<>();
        this.f22221s = new c0.d();
    }

    @Override // com.google.android.exoplayer2.source.t
    public void I(c0 c0Var) {
        if (this.f22223u != null) {
            return;
        }
        M(c0Var);
    }

    public final void M(c0 c0Var) {
        long j10;
        long j11;
        c0Var.r(0, this.f22221s);
        long jH = this.f22221s.h();
        if (this.f22222t == null || this.f22220r.isEmpty() || this.f22218p) {
            long j12 = this.f22215m;
            long j13 = this.f22216n;
            if (this.f22219q) {
                long jF = this.f22221s.f();
                j12 += jF;
                j13 += jF;
            }
            this.f22224v = jH + j12;
            this.f22225w = this.f22216n != Long.MIN_VALUE ? jH + j13 : Long.MIN_VALUE;
            int size = this.f22220r.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f22220r.get(i10).k(this.f22224v, this.f22225w);
            }
            j10 = j12;
            j11 = j13;
        } else {
            long j14 = this.f22224v - jH;
            j11 = this.f22216n != Long.MIN_VALUE ? this.f22225w - jH : Long.MIN_VALUE;
            j10 = j14;
        }
        try {
            a aVar = new a(c0Var, j10, j11);
            this.f22222t = aVar;
            t(aVar);
        } catch (IllegalClippingException e10) {
            this.f22223u = e10;
            for (int i11 = 0; i11 < this.f22220r.size(); i11++) {
                this.f22220r.get(i11).i(this.f22223u);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.i
    public h a(i.b bVar, r7.b bVar2, long j10) {
        b bVar3 = new b(this.f22481k.a(bVar, bVar2, j10), this.f22217o, this.f22224v, this.f22225w);
        this.f22220r.add(bVar3);
        return bVar3;
    }

    @Override // com.google.android.exoplayer2.source.i
    public void f(h hVar) {
        s7.a.g(this.f22220r.remove(hVar));
        this.f22481k.f(((b) hVar).f22251b);
        if (!this.f22220r.isEmpty() || this.f22218p) {
            return;
        }
        M(((a) s7.a.e(this.f22222t)).f60883d);
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.i
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        IllegalClippingException illegalClippingException = this.f22223u;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    public void u() {
        super.u();
        this.f22223u = null;
        this.f22222t = null;
    }
}
