package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.h;
import com.ironsource.mediationsdk.logger.IronSourceError;
import d6.x1;
import d6.z0;
import e7.b0;
import e7.g0;
import e7.i0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: compiled from: MergingMediaPeriod.java */
/* JADX INFO: loaded from: classes9.dex */
public final class k implements h, h.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h[] f22321b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e7.d f22323d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public h.a f22326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public i0 f22327h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public q f22329j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList<h> f22324e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap<g0, g0> f22325f = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IdentityHashMap<b0, Integer> f22322c = new IdentityHashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h[] f22328i = new h[0];

    /* JADX INFO: compiled from: MergingMediaPeriod.java */
    public static final class a implements q7.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q7.r f22330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g0 f22331b;

        public a(q7.r rVar, g0 g0Var) {
            this.f22330a = rVar;
            this.f22331b = g0Var;
        }

        @Override // q7.r
        public void disable() {
            this.f22330a.disable();
        }

        @Override // q7.r
        public void enable() {
            this.f22330a.enable();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f22330a.equals(aVar.f22330a) && this.f22331b.equals(aVar.f22331b);
        }

        @Override // q7.u
        public com.google.android.exoplayer2.m getFormat(int i10) {
            return this.f22330a.getFormat(i10);
        }

        @Override // q7.u
        public int getIndexInTrackGroup(int i10) {
            return this.f22330a.getIndexInTrackGroup(i10);
        }

        @Override // q7.r
        public com.google.android.exoplayer2.m getSelectedFormat() {
            return this.f22330a.getSelectedFormat();
        }

        @Override // q7.u
        public g0 getTrackGroup() {
            return this.f22331b;
        }

        @Override // q7.r, q7.u
        public int getType() {
            return this.f22330a.getType();
        }

        public int hashCode() {
            return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f22331b.hashCode()) * 31) + this.f22330a.hashCode();
        }

        @Override // q7.u
        public int indexOf(int i10) {
            return this.f22330a.indexOf(i10);
        }

        @Override // q7.u
        public int length() {
            return this.f22330a.length();
        }

        @Override // q7.r
        public void onDiscontinuity() {
            this.f22330a.onDiscontinuity();
        }

        @Override // q7.r
        public void onPlayWhenReadyChanged(boolean z10) {
            this.f22330a.onPlayWhenReadyChanged(z10);
        }

        @Override // q7.r
        public void onPlaybackSpeed(float f10) {
            this.f22330a.onPlaybackSpeed(f10);
        }

        @Override // q7.r
        public void onRebuffer() {
            this.f22330a.onRebuffer();
        }
    }

    /* JADX INFO: compiled from: MergingMediaPeriod.java */
    public static final class b implements h, h.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h f22332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f22333c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public h.a f22334d;

        public b(h hVar, long j10) {
            this.f22332b = hVar;
            this.f22333c = j10;
        }

        @Override // com.google.android.exoplayer2.source.h
        public long b(q7.r[] rVarArr, boolean[] zArr, b0[] b0VarArr, boolean[] zArr2, long j10) {
            b0[] b0VarArr2 = new b0[b0VarArr.length];
            int i10 = 0;
            while (true) {
                b0 b0VarB = null;
                if (i10 >= b0VarArr.length) {
                    break;
                }
                c cVar = (c) b0VarArr[i10];
                if (cVar != null) {
                    b0VarB = cVar.b();
                }
                b0VarArr2[i10] = b0VarB;
                i10++;
            }
            long jB = this.f22332b.b(rVarArr, zArr, b0VarArr2, zArr2, j10 - this.f22333c);
            for (int i11 = 0; i11 < b0VarArr.length; i11++) {
                b0 b0Var = b0VarArr2[i11];
                if (b0Var == null) {
                    b0VarArr[i11] = null;
                } else {
                    b0 b0Var2 = b0VarArr[i11];
                    if (b0Var2 == null || ((c) b0Var2).b() != b0Var) {
                        b0VarArr[i11] = new c(b0Var, this.f22333c);
                    }
                }
            }
            return jB + this.f22333c;
        }

        @Override // com.google.android.exoplayer2.source.h.a
        public void c(h hVar) {
            ((h.a) s7.a.e(this.f22334d)).c(this);
        }

        @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
        public boolean continueLoading(long j10) {
            return this.f22332b.continueLoading(j10 - this.f22333c);
        }

        @Override // com.google.android.exoplayer2.source.h
        public void discardBuffer(long j10, boolean z10) {
            this.f22332b.discardBuffer(j10 - this.f22333c, z10);
        }

        @Override // com.google.android.exoplayer2.source.h
        public long e(long j10, x1 x1Var) {
            return this.f22332b.e(j10 - this.f22333c, x1Var) + this.f22333c;
        }

        @Override // com.google.android.exoplayer2.source.h
        public void f(h.a aVar, long j10) {
            this.f22334d = aVar;
            this.f22332b.f(this, j10 - this.f22333c);
        }

        @Override // com.google.android.exoplayer2.source.q.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void a(h hVar) {
            ((h.a) s7.a.e(this.f22334d)).a(this);
        }

        @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
        public long getBufferedPositionUs() {
            long bufferedPositionUs = this.f22332b.getBufferedPositionUs();
            if (bufferedPositionUs == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f22333c + bufferedPositionUs;
        }

        @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
        public long getNextLoadPositionUs() {
            long nextLoadPositionUs = this.f22332b.getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f22333c + nextLoadPositionUs;
        }

        @Override // com.google.android.exoplayer2.source.h
        public i0 getTrackGroups() {
            return this.f22332b.getTrackGroups();
        }

        @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
        public boolean isLoading() {
            return this.f22332b.isLoading();
        }

        @Override // com.google.android.exoplayer2.source.h
        public void maybeThrowPrepareError() throws IOException {
            this.f22332b.maybeThrowPrepareError();
        }

        @Override // com.google.android.exoplayer2.source.h
        public long readDiscontinuity() {
            long discontinuity = this.f22332b.readDiscontinuity();
            if (discontinuity == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f22333c + discontinuity;
        }

        @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
        public void reevaluateBuffer(long j10) {
            this.f22332b.reevaluateBuffer(j10 - this.f22333c);
        }

        @Override // com.google.android.exoplayer2.source.h
        public long seekToUs(long j10) {
            return this.f22332b.seekToUs(j10 - this.f22333c) + this.f22333c;
        }
    }

    /* JADX INFO: compiled from: MergingMediaPeriod.java */
    public static final class c implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b0 f22335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f22336b;

        public c(b0 b0Var, long j10) {
            this.f22335a = b0Var;
            this.f22336b = j10;
        }

        @Override // e7.b0
        public int a(z0 z0Var, DecoderInputBuffer decoderInputBuffer, int i10) {
            int iA = this.f22335a.a(z0Var, decoderInputBuffer, i10);
            if (iA == -4) {
                decoderInputBuffer.f21432f = Math.max(0L, decoderInputBuffer.f21432f + this.f22336b);
            }
            return iA;
        }

        public b0 b() {
            return this.f22335a;
        }

        @Override // e7.b0
        public boolean isReady() {
            return this.f22335a.isReady();
        }

        @Override // e7.b0
        public void maybeThrowError() throws IOException {
            this.f22335a.maybeThrowError();
        }

        @Override // e7.b0
        public int skipData(long j10) {
            return this.f22335a.skipData(j10 - this.f22336b);
        }
    }

    public k(e7.d dVar, long[] jArr, h... hVarArr) {
        this.f22323d = dVar;
        this.f22321b = hVarArr;
        this.f22329j = dVar.a(new q[0]);
        for (int i10 = 0; i10 < hVarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f22321b[i10] = new b(hVarArr[i10], j10);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.exoplayer2.source.h
    public long b(q7.r[] rVarArr, boolean[] zArr, b0[] b0VarArr, boolean[] zArr2, long j10) {
        Integer num;
        int[] iArr = new int[rVarArr.length];
        int[] iArr2 = new int[rVarArr.length];
        int i10 = 0;
        while (true) {
            if (i10 >= rVarArr.length) {
                break;
            }
            b0 b0Var = b0VarArr[i10];
            num = b0Var != null ? this.f22322c.get(b0Var) : null;
            iArr[i10] = num == null ? -1 : num.intValue();
            iArr2[i10] = -1;
            q7.r rVar = rVarArr[i10];
            if (rVar != null) {
                g0 g0Var = (g0) s7.a.e(this.f22325f.get(rVar.getTrackGroup()));
                int i11 = 0;
                while (true) {
                    h[] hVarArr = this.f22321b;
                    if (i11 >= hVarArr.length) {
                        break;
                    }
                    if (hVarArr[i11].getTrackGroups().c(g0Var) != -1) {
                        iArr2[i10] = i11;
                        break;
                    }
                    i11++;
                }
            }
            i10++;
        }
        this.f22322c.clear();
        int length = rVarArr.length;
        b0[] b0VarArr2 = new b0[length];
        b0[] b0VarArr3 = new b0[rVarArr.length];
        Object[] objArr = new q7.r[rVarArr.length];
        ArrayList arrayList = new ArrayList(this.f22321b.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < this.f22321b.length) {
            for (int i13 = 0; i13 < rVarArr.length; i13++) {
                b0VarArr3[i13] = iArr[i13] == i12 ? b0VarArr[i13] : num;
                if (iArr2[i13] == i12) {
                    q7.r rVar2 = (q7.r) s7.a.e(rVarArr[i13]);
                    objArr[i13] = new a(rVar2, (g0) s7.a.e(this.f22325f.get(rVar2.getTrackGroup())));
                } else {
                    objArr[i13] = num;
                }
            }
            int i14 = i12;
            ArrayList arrayList2 = arrayList;
            Object[] objArr2 = objArr;
            long jB = this.f22321b[i12].b(objArr, zArr, b0VarArr3, zArr2, j11);
            if (i14 == 0) {
                j11 = jB;
            } else if (jB != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < rVarArr.length; i15++) {
                if (iArr2[i15] == i14) {
                    b0 b0Var2 = (b0) s7.a.e(b0VarArr3[i15]);
                    b0VarArr2[i15] = b0VarArr3[i15];
                    this.f22322c.put(b0Var2, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr[i15] == i14) {
                    s7.a.g(b0VarArr3[i15] == 0);
                }
            }
            if (z10) {
                arrayList2.add(this.f22321b[i14]);
            }
            i12 = i14 + 1;
            arrayList = arrayList2;
            objArr = objArr2;
            num = null;
        }
        System.arraycopy(b0VarArr2, 0, b0VarArr, 0, length);
        h[] hVarArr2 = (h[]) arrayList.toArray(new h[0]);
        this.f22328i = hVarArr2;
        this.f22329j = this.f22323d.a(hVarArr2);
        return j11;
    }

    @Override // com.google.android.exoplayer2.source.h.a
    public void c(h hVar) {
        this.f22324e.remove(hVar);
        if (!this.f22324e.isEmpty()) {
            return;
        }
        int i10 = 0;
        for (h hVar2 : this.f22321b) {
            i10 += hVar2.getTrackGroups().f60877b;
        }
        g0[] g0VarArr = new g0[i10];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            h[] hVarArr = this.f22321b;
            if (i11 >= hVarArr.length) {
                this.f22327h = new i0(g0VarArr);
                ((h.a) s7.a.e(this.f22326g)).c(this);
                return;
            }
            i0 trackGroups = hVarArr[i11].getTrackGroups();
            int i13 = trackGroups.f60877b;
            int i14 = 0;
            while (i14 < i13) {
                g0 g0VarB = trackGroups.b(i14);
                g0 g0VarB2 = g0VarB.b(i11 + StringUtils.PROCESS_POSTFIX_DELIMITER + g0VarB.f60867c);
                this.f22325f.put(g0VarB2, g0VarB);
                g0VarArr[i12] = g0VarB2;
                i14++;
                i12++;
            }
            i11++;
        }
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public boolean continueLoading(long j10) {
        if (this.f22324e.isEmpty()) {
            return this.f22329j.continueLoading(j10);
        }
        int size = this.f22324e.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f22324e.get(i10).continueLoading(j10);
        }
        return false;
    }

    public h d(int i10) {
        h hVar = this.f22321b[i10];
        return hVar instanceof b ? ((b) hVar).f22332b : hVar;
    }

    @Override // com.google.android.exoplayer2.source.h
    public void discardBuffer(long j10, boolean z10) {
        for (h hVar : this.f22328i) {
            hVar.discardBuffer(j10, z10);
        }
    }

    @Override // com.google.android.exoplayer2.source.h
    public long e(long j10, x1 x1Var) {
        h[] hVarArr = this.f22328i;
        return (hVarArr.length > 0 ? hVarArr[0] : this.f22321b[0]).e(j10, x1Var);
    }

    @Override // com.google.android.exoplayer2.source.h
    public void f(h.a aVar, long j10) {
        this.f22326g = aVar;
        Collections.addAll(this.f22324e, this.f22321b);
        for (h hVar : this.f22321b) {
            hVar.f(this, j10);
        }
    }

    @Override // com.google.android.exoplayer2.source.q.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void a(h hVar) {
        ((h.a) s7.a.e(this.f22326g)).a(this);
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public long getBufferedPositionUs() {
        return this.f22329j.getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public long getNextLoadPositionUs() {
        return this.f22329j.getNextLoadPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.h
    public i0 getTrackGroups() {
        return (i0) s7.a.e(this.f22327h);
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public boolean isLoading() {
        return this.f22329j.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.h
    public void maybeThrowPrepareError() throws IOException {
        for (h hVar : this.f22321b) {
            hVar.maybeThrowPrepareError();
        }
    }

    @Override // com.google.android.exoplayer2.source.h
    public long readDiscontinuity() {
        long j10 = -9223372036854775807L;
        for (h hVar : this.f22328i) {
            long discontinuity = hVar.readDiscontinuity();
            if (discontinuity == -9223372036854775807L) {
                if (j10 != -9223372036854775807L && hVar.seekToUs(j10) != j10) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j10 == -9223372036854775807L) {
                for (h hVar2 : this.f22328i) {
                    if (hVar2 == hVar) {
                        break;
                    }
                    if (hVar2.seekToUs(discontinuity) != discontinuity) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j10 = discontinuity;
            } else if (discontinuity != j10) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public void reevaluateBuffer(long j10) {
        this.f22329j.reevaluateBuffer(j10);
    }

    @Override // com.google.android.exoplayer2.source.h
    public long seekToUs(long j10) {
        long jSeekToUs = this.f22328i[0].seekToUs(j10);
        int i10 = 1;
        while (true) {
            h[] hVarArr = this.f22328i;
            if (i10 >= hVarArr.length) {
                return jSeekToUs;
            }
            if (hVarArr[i10].seekToUs(jSeekToUs) != jSeekToUs) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }
}
