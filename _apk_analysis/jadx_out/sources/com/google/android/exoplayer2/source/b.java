package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.ClippingMediaSource;
import com.google.android.exoplayer2.source.h;
import d6.x1;
import d6.z0;
import e7.b0;
import e7.i0;
import java.io.IOException;
import s7.m0;
import s7.u;

/* JADX INFO: compiled from: ClippingMediaPeriod.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b implements h, h.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f22251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public h.a f22252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a[] f22253d = new a[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f22254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f22255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f22256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public ClippingMediaSource.IllegalClippingException f22257h;

    /* JADX INFO: compiled from: ClippingMediaPeriod.java */
    public final class a implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b0 f22258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f22259b;

        public a(b0 b0Var) {
            this.f22258a = b0Var;
        }

        @Override // e7.b0
        public int a(z0 z0Var, DecoderInputBuffer decoderInputBuffer, int i10) {
            if (b.this.g()) {
                return -3;
            }
            if (this.f22259b) {
                decoderInputBuffer.k(4);
                return -4;
            }
            int iA = this.f22258a.a(z0Var, decoderInputBuffer, i10);
            if (iA == -5) {
                com.google.android.exoplayer2.m mVar = (com.google.android.exoplayer2.m) s7.a.e(z0Var.f59724b);
                int i11 = mVar.C;
                if (i11 != 0 || mVar.D != 0) {
                    b bVar = b.this;
                    if (bVar.f22255f != 0) {
                        i11 = 0;
                    }
                    z0Var.f59724b = mVar.b().N(i11).O(bVar.f22256g == Long.MIN_VALUE ? mVar.D : 0).E();
                }
                return -5;
            }
            b bVar2 = b.this;
            long j10 = bVar2.f22256g;
            if (j10 == Long.MIN_VALUE || ((iA != -4 || decoderInputBuffer.f21432f < j10) && !(iA == -3 && bVar2.getBufferedPositionUs() == Long.MIN_VALUE && !decoderInputBuffer.f21431e))) {
                return iA;
            }
            decoderInputBuffer.b();
            decoderInputBuffer.k(4);
            this.f22259b = true;
            return -4;
        }

        public void b() {
            this.f22259b = false;
        }

        @Override // e7.b0
        public boolean isReady() {
            return !b.this.g() && this.f22258a.isReady();
        }

        @Override // e7.b0
        public void maybeThrowError() throws IOException {
            this.f22258a.maybeThrowError();
        }

        @Override // e7.b0
        public int skipData(long j10) {
            if (b.this.g()) {
                return -3;
            }
            return this.f22258a.skipData(j10);
        }
    }

    public b(h hVar, boolean z10, long j10, long j11) {
        this.f22251b = hVar;
        this.f22254e = z10 ? j10 : -9223372036854775807L;
        this.f22255f = j10;
        this.f22256g = j11;
    }

    public static boolean j(long j10, q7.r[] rVarArr) {
        if (j10 != 0) {
            for (q7.r rVar : rVarArr) {
                if (rVar != null) {
                    com.google.android.exoplayer2.m selectedFormat = rVar.getSelectedFormat();
                    if (!u.a(selectedFormat.f21751m, selectedFormat.f21748j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    @Override // com.google.android.exoplayer2.source.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long b(q7.r[] r13, boolean[] r14, e7.b0[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            com.google.android.exoplayer2.source.b$a[] r2 = new com.google.android.exoplayer2.source.b.a[r2]
            r0.f22253d = r2
            int r2 = r1.length
            e7.b0[] r9 = new e7.b0[r2]
            r10 = 0
            r2 = r10
        Lc:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L21
            com.google.android.exoplayer2.source.b$a[] r3 = r0.f22253d
            r4 = r1[r2]
            com.google.android.exoplayer2.source.b$a r4 = (com.google.android.exoplayer2.source.b.a) r4
            r3[r2] = r4
            if (r4 == 0) goto L1c
            e7.b0 r11 = r4.f22258a
        L1c:
            r9[r2] = r11
            int r2 = r2 + 1
            goto Lc
        L21:
            com.google.android.exoplayer2.source.h r2 = r0.f22251b
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.b(r3, r4, r5, r6, r7)
            boolean r4 = r12.g()
            if (r4 == 0) goto L43
            long r4 = r0.f22255f
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L43
            r6 = r13
            boolean r4 = j(r4, r13)
            if (r4 == 0) goto L43
            r4 = r2
            goto L48
        L43:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L48:
            r0.f22254e = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L63
            long r4 = r0.f22255f
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L61
            long r4 = r0.f22256g
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
            s7.a.g(r4)
        L67:
            int r4 = r1.length
            if (r10 >= r4) goto L8d
            r4 = r9[r10]
            if (r4 != 0) goto L73
            com.google.android.exoplayer2.source.b$a[] r4 = r0.f22253d
            r4[r10] = r11
            goto L84
        L73:
            com.google.android.exoplayer2.source.b$a[] r5 = r0.f22253d
            r6 = r5[r10]
            if (r6 == 0) goto L7d
            e7.b0 r6 = r6.f22258a
            if (r6 == r4) goto L84
        L7d:
            com.google.android.exoplayer2.source.b$a r6 = new com.google.android.exoplayer2.source.b$a
            r6.<init>(r4)
            r5[r10] = r6
        L84:
            com.google.android.exoplayer2.source.b$a[] r4 = r0.f22253d
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L67
        L8d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.b.b(q7.r[], boolean[], e7.b0[], boolean[], long):long");
    }

    @Override // com.google.android.exoplayer2.source.h.a
    public void c(h hVar) {
        if (this.f22257h != null) {
            return;
        }
        ((h.a) s7.a.e(this.f22252c)).c(this);
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public boolean continueLoading(long j10) {
        return this.f22251b.continueLoading(j10);
    }

    public final x1 d(long j10, x1 x1Var) {
        long jQ = m0.q(x1Var.f59719a, 0L, j10 - this.f22255f);
        long j11 = x1Var.f59720b;
        long j12 = this.f22256g;
        long jQ2 = m0.q(j11, 0L, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j10);
        return (jQ == x1Var.f59719a && jQ2 == x1Var.f59720b) ? x1Var : new x1(jQ, jQ2);
    }

    @Override // com.google.android.exoplayer2.source.h
    public void discardBuffer(long j10, boolean z10) {
        this.f22251b.discardBuffer(j10, z10);
    }

    @Override // com.google.android.exoplayer2.source.h
    public long e(long j10, x1 x1Var) {
        long j11 = this.f22255f;
        if (j10 == j11) {
            return j11;
        }
        return this.f22251b.e(j10, d(j10, x1Var));
    }

    @Override // com.google.android.exoplayer2.source.h
    public void f(h.a aVar, long j10) {
        this.f22252c = aVar;
        this.f22251b.f(this, j10);
    }

    public boolean g() {
        return this.f22254e != -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public long getBufferedPositionUs() {
        long bufferedPositionUs = this.f22251b.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j10 = this.f22256g;
            if (j10 == Long.MIN_VALUE || bufferedPositionUs < j10) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f22251b.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j10 = this.f22256g;
            if (j10 == Long.MIN_VALUE || nextLoadPositionUs < j10) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.source.h
    public i0 getTrackGroups() {
        return this.f22251b.getTrackGroups();
    }

    @Override // com.google.android.exoplayer2.source.q.a
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void a(h hVar) {
        ((h.a) s7.a.e(this.f22252c)).a(this);
    }

    public void i(ClippingMediaSource.IllegalClippingException illegalClippingException) {
        this.f22257h = illegalClippingException;
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public boolean isLoading() {
        return this.f22251b.isLoading();
    }

    public void k(long j10, long j11) {
        this.f22255f = j10;
        this.f22256g = j11;
    }

    @Override // com.google.android.exoplayer2.source.h
    public void maybeThrowPrepareError() throws IOException {
        ClippingMediaSource.IllegalClippingException illegalClippingException = this.f22257h;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        this.f22251b.maybeThrowPrepareError();
    }

    @Override // com.google.android.exoplayer2.source.h
    public long readDiscontinuity() {
        if (g()) {
            long j10 = this.f22254e;
            this.f22254e = -9223372036854775807L;
            long discontinuity = readDiscontinuity();
            return discontinuity != -9223372036854775807L ? discontinuity : j10;
        }
        long discontinuity2 = this.f22251b.readDiscontinuity();
        if (discontinuity2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z10 = true;
        s7.a.g(discontinuity2 >= this.f22255f);
        long j11 = this.f22256g;
        if (j11 != Long.MIN_VALUE && discontinuity2 > j11) {
            z10 = false;
        }
        s7.a.g(z10);
        return discontinuity2;
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public void reevaluateBuffer(long j10) {
        this.f22251b.reevaluateBuffer(j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    @Override // com.google.android.exoplayer2.source.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long seekToUs(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f22254e = r0
            com.google.android.exoplayer2.source.b$a[] r0 = r5.f22253d
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.b()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            com.google.android.exoplayer2.source.h r0 = r5.f22251b
            long r0 = r0.seekToUs(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L34
            long r6 = r5.f22255f
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L35
            long r6 = r5.f22256g
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L34
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L35
        L34:
            r2 = 1
        L35:
            s7.a.g(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.b.seekToUs(long):long");
    }
}
