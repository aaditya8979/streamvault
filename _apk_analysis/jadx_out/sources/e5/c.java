package e5;

import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.source.TrackGroupArray;
import e4.t0;
import e5.q;
import java.io.IOException;

/* JADX INFO: compiled from: ClippingMediaPeriod.java */
/* JADX INFO: loaded from: classes12.dex */
public final class c implements q, q.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f60366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public q.a f60367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a[] f60368d = new a[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f60369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f60370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f60371g;

    /* JADX INFO: compiled from: ClippingMediaPeriod.java */
    public final class a implements i0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i0 f60372b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f60373c;

        public a(i0 i0Var) {
            this.f60372b = i0Var;
        }

        public void a() {
            this.f60373c = false;
        }

        @Override // e5.i0
        public int b(e4.f0 f0Var, i4.e eVar, boolean z10) {
            if (c.this.g()) {
                return -3;
            }
            if (this.f60373c) {
                eVar.setFlags(4);
                return -4;
            }
            int iB = this.f60372b.b(f0Var, eVar, z10);
            if (iB == -5) {
                Format format = (Format) a6.a.e(f0Var.f60107c);
                int i10 = format.f19943z;
                if (i10 != 0 || format.A != 0) {
                    c cVar = c.this;
                    if (cVar.f60370f != 0) {
                        i10 = 0;
                    }
                    f0Var.f60107c = format.h(i10, cVar.f60371g == Long.MIN_VALUE ? format.A : 0);
                }
                return -5;
            }
            c cVar2 = c.this;
            long j10 = cVar2.f60371g;
            if (j10 == Long.MIN_VALUE || ((iB != -4 || eVar.f63713e < j10) && !(iB == -3 && cVar2.getBufferedPositionUs() == Long.MIN_VALUE && !eVar.f63712d))) {
                return iB;
            }
            eVar.clear();
            eVar.setFlags(4);
            this.f60373c = true;
            return -4;
        }

        @Override // e5.i0
        public boolean isReady() {
            return !c.this.g() && this.f60372b.isReady();
        }

        @Override // e5.i0
        public void maybeThrowError() throws IOException {
            this.f60372b.maybeThrowError();
        }

        @Override // e5.i0
        public int skipData(long j10) {
            if (c.this.g()) {
                return -3;
            }
            return this.f60372b.skipData(j10);
        }
    }

    public c(q qVar, boolean z10, long j10, long j11) {
        this.f60366b = qVar;
        this.f60369e = z10 ? j10 : -9223372036854775807L;
        this.f60370f = j10;
        this.f60371g = j11;
    }

    public static boolean i(long j10, com.google.android.exoplayer.trackselection.c[] cVarArr) {
        if (j10 != 0) {
            for (com.google.android.exoplayer.trackselection.c cVar : cVarArr) {
                if (cVar != null && !a6.p.l(cVar.getSelectedFormat().f19927j)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // e5.q
    public long a(long j10, t0 t0Var) {
        long j11 = this.f60370f;
        if (j10 == j11) {
            return j11;
        }
        return this.f60366b.a(j10, b(j10, t0Var));
    }

    public final t0 b(long j10, t0 t0Var) {
        long jR = a6.k0.r(t0Var.f60263a, 0L, j10 - this.f60370f);
        long j11 = t0Var.f60264b;
        long j12 = this.f60371g;
        long jR2 = a6.k0.r(j11, 0L, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j10);
        return (jR == t0Var.f60263a && jR2 == t0Var.f60264b) ? t0Var : new t0(jR, jR2);
    }

    @Override // e5.q, e5.j0
    public boolean continueLoading(long j10) {
        return this.f60366b.continueLoading(j10);
    }

    @Override // e5.q.a
    public void d(q qVar) {
        ((q.a) a6.a.e(this.f60367c)).d(this);
    }

    @Override // e5.q
    public void discardBuffer(long j10, boolean z10) {
        this.f60366b.discardBuffer(j10, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    @Override // e5.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long e(com.google.android.exoplayer.trackselection.c[] r13, boolean[] r14, e5.i0[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            e5.c$a[] r2 = new e5.c.a[r2]
            r0.f60368d = r2
            int r2 = r1.length
            e5.i0[] r9 = new e5.i0[r2]
            r10 = 0
            r2 = r10
        Lc:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L21
            e5.c$a[] r3 = r0.f60368d
            r4 = r1[r2]
            e5.c$a r4 = (e5.c.a) r4
            r3[r2] = r4
            if (r4 == 0) goto L1c
            e5.i0 r11 = r4.f60372b
        L1c:
            r9[r2] = r11
            int r2 = r2 + 1
            goto Lc
        L21:
            e5.q r2 = r0.f60366b
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.e(r3, r4, r5, r6, r7)
            boolean r4 = r12.g()
            if (r4 == 0) goto L43
            long r4 = r0.f60370f
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L43
            r6 = r13
            boolean r4 = i(r4, r13)
            if (r4 == 0) goto L43
            r4 = r2
            goto L48
        L43:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L48:
            r0.f60369e = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L63
            long r4 = r0.f60370f
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L61
            long r4 = r0.f60371g
            r6 = -9223372036854775808
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L63
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L61
            goto L63
        L61:
            r4 = r10
            goto L64
        L63:
            r4 = 1
        L64:
            a6.a.f(r4)
        L67:
            int r4 = r1.length
            if (r10 >= r4) goto L8d
            r4 = r9[r10]
            if (r4 != 0) goto L73
            e5.c$a[] r4 = r0.f60368d
            r4[r10] = r11
            goto L84
        L73:
            e5.c$a[] r5 = r0.f60368d
            r6 = r5[r10]
            if (r6 == 0) goto L7d
            e5.i0 r6 = r6.f60372b
            if (r6 == r4) goto L84
        L7d:
            e5.c$a r6 = new e5.c$a
            r6.<init>(r4)
            r5[r10] = r6
        L84:
            e5.c$a[] r4 = r0.f60368d
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L67
        L8d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.c.e(com.google.android.exoplayer.trackselection.c[], boolean[], e5.i0[], boolean[], long):long");
    }

    @Override // e5.q
    public void f(q.a aVar, long j10) {
        this.f60367c = aVar;
        this.f60366b.f(this, j10);
    }

    public boolean g() {
        return this.f60369e != -9223372036854775807L;
    }

    @Override // e5.q, e5.j0
    public long getBufferedPositionUs() {
        long bufferedPositionUs = this.f60366b.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j10 = this.f60371g;
            if (j10 == Long.MIN_VALUE || bufferedPositionUs < j10) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // e5.q, e5.j0
    public long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f60366b.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j10 = this.f60371g;
            if (j10 == Long.MIN_VALUE || nextLoadPositionUs < j10) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // e5.q
    public TrackGroupArray getTrackGroups() {
        return this.f60366b.getTrackGroups();
    }

    @Override // e5.j0.a
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void c(q qVar) {
        ((q.a) a6.a.e(this.f60367c)).c(this);
    }

    @Override // e5.q, e5.j0
    public boolean isLoading() {
        return this.f60366b.isLoading();
    }

    @Override // e5.q
    public void maybeThrowPrepareError() throws IOException {
        this.f60366b.maybeThrowPrepareError();
    }

    @Override // e5.q
    public long readDiscontinuity() {
        if (g()) {
            long j10 = this.f60369e;
            this.f60369e = -9223372036854775807L;
            long discontinuity = readDiscontinuity();
            return discontinuity != -9223372036854775807L ? discontinuity : j10;
        }
        long discontinuity2 = this.f60366b.readDiscontinuity();
        if (discontinuity2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z10 = true;
        a6.a.f(discontinuity2 >= this.f60370f);
        long j11 = this.f60371g;
        if (j11 != Long.MIN_VALUE && discontinuity2 > j11) {
            z10 = false;
        }
        a6.a.f(z10);
        return discontinuity2;
    }

    @Override // e5.q, e5.j0
    public void reevaluateBuffer(long j10) {
        this.f60366b.reevaluateBuffer(j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    @Override // e5.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long seekToUs(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f60369e = r0
            e5.c$a[] r0 = r5.f60368d
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.a()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            e5.q r0 = r5.f60366b
            long r0 = r0.seekToUs(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L34
            long r6 = r5.f60370f
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L35
            long r6 = r5.f60371g
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L34
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L35
        L34:
            r2 = 1
        L35:
            a6.a.f(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.c.seekToUs(long):long");
    }
}
