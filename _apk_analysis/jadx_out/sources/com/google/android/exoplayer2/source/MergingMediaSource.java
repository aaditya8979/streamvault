package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.p;
import com.google.android.exoplayer2.source.i;
import com.google.common.collect.MultimapBuilder;
import com.google.common.collect.a2;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import r7.y;

/* JADX INFO: loaded from: classes9.dex */
public final class MergingMediaSource extends c<Integer> {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final com.google.android.exoplayer2.p f22230v = new p.c().d("MergingMediaSource").a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f22231k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f22232l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i[] f22233m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c0[] f22234n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList<i> f22235o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e7.d f22236p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Map<Object, Long> f22237q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a2<Object, b> f22238r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f22239s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long[][] f22240t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public IllegalMergeException f22241u;

    public static final class IllegalMergeException extends IOException {
        public static final int REASON_PERIOD_COUNT_MISMATCH = 0;
        public final int reason;

        public IllegalMergeException(int i10) {
            this.reason = i10;
        }
    }

    public static final class a extends e7.m {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long[] f22242e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long[] f22243f;

        public a(c0 c0Var, Map<Object, Long> map) {
            super(c0Var);
            int iT = c0Var.t();
            this.f22243f = new long[c0Var.t()];
            c0.d dVar = new c0.d();
            for (int i10 = 0; i10 < iT; i10++) {
                this.f22243f[i10] = c0Var.r(i10, dVar).f21415o;
            }
            int iM = c0Var.m();
            this.f22242e = new long[iM];
            c0.b bVar = new c0.b();
            for (int i11 = 0; i11 < iM; i11++) {
                c0Var.k(i11, bVar, true);
                long jLongValue = ((Long) s7.a.e(map.get(bVar.f21388c))).longValue();
                long[] jArr = this.f22242e;
                jLongValue = jLongValue == Long.MIN_VALUE ? bVar.f21390e : jLongValue;
                jArr[i11] = jLongValue;
                long j10 = bVar.f21390e;
                if (j10 != -9223372036854775807L) {
                    long[] jArr2 = this.f22243f;
                    int i12 = bVar.f21389d;
                    jArr2[i12] = jArr2[i12] - (j10 - jLongValue);
                }
            }
        }

        @Override // e7.m, com.google.android.exoplayer2.c0
        public c0.b k(int i10, c0.b bVar, boolean z10) {
            super.k(i10, bVar, z10);
            bVar.f21390e = this.f22242e[i10];
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        @Override // e7.m, com.google.android.exoplayer2.c0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.google.android.exoplayer2.c0.d s(int r5, com.google.android.exoplayer2.c0.d r6, long r7) {
            /*
                r4 = this;
                super.s(r5, r6, r7)
                long[] r7 = r4.f22243f
                r0 = r7[r5]
                r6.f21415o = r0
                r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                if (r5 == 0) goto L1e
                long r2 = r6.f21414n
                int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r5 != 0) goto L19
                goto L1e
            L19:
                long r7 = java.lang.Math.min(r2, r0)
                goto L20
            L1e:
                long r7 = r6.f21414n
            L20:
                r6.f21414n = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.MergingMediaSource.a.s(int, com.google.android.exoplayer2.c0$d, long):com.google.android.exoplayer2.c0$d");
        }
    }

    public MergingMediaSource(boolean z10, boolean z11, e7.d dVar, i... iVarArr) {
        this.f22231k = z10;
        this.f22232l = z11;
        this.f22233m = iVarArr;
        this.f22236p = dVar;
        this.f22235o = new ArrayList<>(Arrays.asList(iVarArr));
        this.f22239s = -1;
        this.f22234n = new c0[iVarArr.length];
        this.f22240t = new long[0][];
        this.f22237q = new HashMap();
        this.f22238r = MultimapBuilder.a().a().g();
    }

    public MergingMediaSource(boolean z10, boolean z11, i... iVarArr) {
        this(z10, z11, new e7.e(), iVarArr);
    }

    public MergingMediaSource(boolean z10, i... iVarArr) {
        this(z10, false, iVarArr);
    }

    public MergingMediaSource(i... iVarArr) {
        this(false, iVarArr);
    }

    public final void C() {
        c0.b bVar = new c0.b();
        for (int i10 = 0; i10 < this.f22239s; i10++) {
            long j10 = -this.f22234n[0].j(i10, bVar).q();
            int i11 = 1;
            while (true) {
                c0[] c0VarArr = this.f22234n;
                if (i11 < c0VarArr.length) {
                    this.f22240t[i10][i11] = j10 - (-c0VarArr[i11].j(i10, bVar).q());
                    i11++;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.c
    @Nullable
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public i.b w(Integer num, i.b bVar) {
        if (num.intValue() == 0) {
            return bVar;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.source.c
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(Integer num, i iVar, c0 c0Var) {
        if (this.f22241u != null) {
            return;
        }
        if (this.f22239s == -1) {
            this.f22239s = c0Var.m();
        } else if (c0Var.m() != this.f22239s) {
            this.f22241u = new IllegalMergeException(0);
            return;
        }
        if (this.f22240t.length == 0) {
            this.f22240t = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f22239s, this.f22234n.length);
        }
        this.f22235o.remove(iVar);
        this.f22234n[num.intValue()] = c0Var;
        if (this.f22235o.isEmpty()) {
            if (this.f22231k) {
                C();
            }
            c0 aVar = this.f22234n[0];
            if (this.f22232l) {
                F();
                aVar = new a(aVar, this.f22237q);
            }
            t(aVar);
        }
    }

    public final void F() {
        c0[] c0VarArr;
        c0.b bVar = new c0.b();
        for (int i10 = 0; i10 < this.f22239s; i10++) {
            int i11 = 0;
            long j10 = Long.MIN_VALUE;
            while (true) {
                c0VarArr = this.f22234n;
                if (i11 >= c0VarArr.length) {
                    break;
                }
                long jM = c0VarArr[i11].j(i10, bVar).m();
                if (jM != -9223372036854775807L) {
                    long j11 = jM + this.f22240t[i10][i11];
                    if (j10 == Long.MIN_VALUE || j11 < j10) {
                        j10 = j11;
                    }
                }
                i11++;
            }
            Object objQ = c0VarArr[0].q(i10);
            this.f22237q.put(objQ, Long.valueOf(j10));
            Iterator<b> it = this.f22238r.get(objQ).iterator();
            while (it.hasNext()) {
                it.next().k(0L, j10);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.i
    public h a(i.b bVar, r7.b bVar2, long j10) {
        int length = this.f22233m.length;
        h[] hVarArr = new h[length];
        int iF = this.f22234n[0].f(bVar.f60899a);
        for (int i10 = 0; i10 < length; i10++) {
            hVarArr[i10] = this.f22233m[i10].a(bVar.c(this.f22234n[i10].q(iF)), bVar2, j10 - this.f22240t[iF][i10]);
        }
        k kVar = new k(this.f22236p, this.f22240t[iF], hVarArr);
        if (!this.f22232l) {
            return kVar;
        }
        b bVar3 = new b(kVar, true, 0L, ((Long) s7.a.e(this.f22237q.get(bVar.f60899a))).longValue());
        this.f22238r.put(bVar.f60899a, bVar3);
        return bVar3;
    }

    @Override // com.google.android.exoplayer2.source.i
    public void f(h hVar) {
        if (this.f22232l) {
            b bVar = (b) hVar;
            Iterator<Map.Entry<Object, b>> it = this.f22238r.entries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Object, b> next = it.next();
                if (next.getValue().equals(bVar)) {
                    this.f22238r.remove(next.getKey(), next.getValue());
                    break;
                }
            }
            hVar = bVar.f22251b;
        }
        k kVar = (k) hVar;
        int i10 = 0;
        while (true) {
            i[] iVarArr = this.f22233m;
            if (i10 >= iVarArr.length) {
                return;
            }
            iVarArr[i10].f(kVar.d(i10));
            i10++;
        }
    }

    @Override // com.google.android.exoplayer2.source.i
    public com.google.android.exoplayer2.p getMediaItem() {
        i[] iVarArr = this.f22233m;
        return iVarArr.length > 0 ? iVarArr[0].getMediaItem() : f22230v;
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.i
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        IllegalMergeException illegalMergeException = this.f22241u;
        if (illegalMergeException != null) {
            throw illegalMergeException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    public void s(@Nullable y yVar) {
        super.s(yVar);
        for (int i10 = 0; i10 < this.f22233m.length; i10++) {
            B(Integer.valueOf(i10), this.f22233m[i10]);
        }
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    public void u() {
        super.u();
        Arrays.fill(this.f22234n, (Object) null);
        this.f22239s = -1;
        this.f22241u = null;
        this.f22235o.clear();
        Collections.addAll(this.f22235o, this.f22233m);
    }
}
