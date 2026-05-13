package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.h;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.b;
import d6.x1;
import d6.z0;
import e7.b0;
import e7.g0;
import e7.i0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import r7.h;
import r7.x;
import r7.y;
import s7.m0;
import s7.u;

/* JADX INFO: compiled from: SingleSampleMediaPeriod.java */
/* JADX INFO: loaded from: classes9.dex */
public final class r implements h, Loader.b<c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r7.k f22445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h.a f22446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final y f22447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.b f22448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j.a f22449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i0 f22450g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f22452i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.google.android.exoplayer2.m f22454k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f22455l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f22456m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f22457n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f22458o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList<b> f22451h = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Loader f22453j = new Loader("SingleSampleMediaPeriod");

    /* JADX INFO: compiled from: SingleSampleMediaPeriod.java */
    public final class b implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f22460b;

        public b() {
        }

        @Override // e7.b0
        public int a(z0 z0Var, DecoderInputBuffer decoderInputBuffer, int i10) {
            b();
            r rVar = r.this;
            boolean z10 = rVar.f22456m;
            if (z10 && rVar.f22457n == null) {
                this.f22459a = 2;
            }
            int i11 = this.f22459a;
            if (i11 == 2) {
                decoderInputBuffer.a(4);
                return -4;
            }
            if ((i10 & 2) != 0 || i11 == 0) {
                z0Var.f59724b = rVar.f22454k;
                this.f22459a = 1;
                return -5;
            }
            if (!z10) {
                return -3;
            }
            s7.a.e(rVar.f22457n);
            decoderInputBuffer.a(1);
            decoderInputBuffer.f21432f = 0L;
            if ((i10 & 4) == 0) {
                decoderInputBuffer.m(r.this.f22458o);
                ByteBuffer byteBuffer = decoderInputBuffer.f21430d;
                r rVar2 = r.this;
                byteBuffer.put(rVar2.f22457n, 0, rVar2.f22458o);
            }
            if ((i10 & 1) == 0) {
                this.f22459a = 2;
            }
            return -4;
        }

        public final void b() {
            if (this.f22460b) {
                return;
            }
            r.this.f22449f.h(u.i(r.this.f22454k.f21751m), r.this.f22454k, 0, null, 0L);
            this.f22460b = true;
        }

        public void c() {
            if (this.f22459a == 2) {
                this.f22459a = 1;
            }
        }

        @Override // e7.b0
        public boolean isReady() {
            return r.this.f22456m;
        }

        @Override // e7.b0
        public void maybeThrowError() throws IOException {
            r rVar = r.this;
            if (rVar.f22455l) {
                return;
            }
            rVar.f22453j.j();
        }

        @Override // e7.b0
        public int skipData(long j10) {
            b();
            if (j10 <= 0 || this.f22459a == 2) {
                return 0;
            }
            this.f22459a = 2;
            return 1;
        }
    }

    /* JADX INFO: compiled from: SingleSampleMediaPeriod.java */
    public static final class c implements Loader.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f22462a = e7.n.a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r7.k f22463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final x f22464c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public byte[] f22465d;

        public c(r7.k kVar, r7.h hVar) {
            this.f22463b = kVar;
            this.f22464c = new x(hVar);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void cancelLoad() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void load() throws IOException {
            this.f22464c.f();
            try {
                this.f22464c.a(this.f22463b);
                int i10 = 0;
                while (i10 != -1) {
                    int iC = (int) this.f22464c.c();
                    byte[] bArr = this.f22465d;
                    if (bArr == null) {
                        this.f22465d = new byte[1024];
                    } else if (iC == bArr.length) {
                        this.f22465d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    x xVar = this.f22464c;
                    byte[] bArr2 = this.f22465d;
                    i10 = xVar.read(bArr2, iC, bArr2.length - iC);
                }
            } finally {
                r7.j.a(this.f22464c);
            }
        }
    }

    public r(r7.k kVar, h.a aVar, @Nullable y yVar, com.google.android.exoplayer2.m mVar, long j10, com.google.android.exoplayer2.upstream.b bVar, j.a aVar2, boolean z10) {
        this.f22445b = kVar;
        this.f22446c = aVar;
        this.f22447d = yVar;
        this.f22454k = mVar;
        this.f22452i = j10;
        this.f22448e = bVar;
        this.f22449f = aVar2;
        this.f22455l = z10;
        this.f22450g = new i0(new g0(mVar));
    }

    @Override // com.google.android.exoplayer2.source.h
    public long b(q7.r[] rVarArr, boolean[] zArr, b0[] b0VarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            b0 b0Var = b0VarArr[i10];
            if (b0Var != null && (rVarArr[i10] == null || !zArr[i10])) {
                this.f22451h.remove(b0Var);
                b0VarArr[i10] = null;
            }
            if (b0VarArr[i10] == null && rVarArr[i10] != null) {
                b bVar = new b();
                this.f22451h.add(bVar);
                b0VarArr[i10] = bVar;
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public boolean continueLoading(long j10) {
        if (this.f22456m || this.f22453j.i() || this.f22453j.h()) {
            return false;
        }
        r7.h hVarCreateDataSource = this.f22446c.createDataSource();
        y yVar = this.f22447d;
        if (yVar != null) {
            hVarCreateDataSource.b(yVar);
        }
        c cVar = new c(this.f22445b, hVarCreateDataSource);
        this.f22449f.u(new e7.n(cVar.f22462a, this.f22445b, this.f22453j.n(cVar, this, this.f22448e.getMinimumLoadableRetryCount(1))), 1, -1, this.f22454k, 0, null, 0L, this.f22452i);
        return true;
    }

    @Override // com.google.android.exoplayer2.source.h
    public void discardBuffer(long j10, boolean z10) {
    }

    @Override // com.google.android.exoplayer2.source.h
    public long e(long j10, x1 x1Var) {
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.h
    public void f(h.a aVar, long j10) {
        aVar.c(this);
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public long getBufferedPositionUs() {
        return this.f22456m ? Long.MIN_VALUE : 0L;
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public long getNextLoadPositionUs() {
        return (this.f22456m || this.f22453j.i()) ? Long.MIN_VALUE : 0L;
    }

    @Override // com.google.android.exoplayer2.source.h
    public i0 getTrackGroups() {
        return this.f22450g;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void c(c cVar, long j10, long j11, boolean z10) {
        x xVar = cVar.f22464c;
        e7.n nVar = new e7.n(cVar.f22462a, cVar.f22463b, xVar.d(), xVar.e(), j10, j11, xVar.c());
        this.f22448e.onLoadTaskConcluded(cVar.f22462a);
        this.f22449f.o(nVar, 1, -1, null, 0, null, 0L, this.f22452i);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void d(c cVar, long j10, long j11) {
        this.f22458o = (int) cVar.f22464c.c();
        this.f22457n = (byte[]) s7.a.e(cVar.f22465d);
        this.f22456m = true;
        x xVar = cVar.f22464c;
        e7.n nVar = new e7.n(cVar.f22462a, cVar.f22463b, xVar.d(), xVar.e(), j10, j11, this.f22458o);
        this.f22448e.onLoadTaskConcluded(cVar.f22462a);
        this.f22449f.q(nVar, 1, -1, this.f22454k, 0, null, 0L, this.f22452i);
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public boolean isLoading() {
        return this.f22453j.i();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Loader.c g(c cVar, long j10, long j11, IOException iOException, int i10) {
        Loader.c cVarG;
        x xVar = cVar.f22464c;
        e7.n nVar = new e7.n(cVar.f22462a, cVar.f22463b, xVar.d(), xVar.e(), j10, j11, xVar.c());
        long jA = this.f22448e.a(new b.a(nVar, new e7.o(1, -1, this.f22454k, 0, null, 0L, m0.Q0(this.f22452i)), iOException, i10));
        boolean z10 = jA == -9223372036854775807L || i10 >= this.f22448e.getMinimumLoadableRetryCount(1);
        if (this.f22455l && z10) {
            s7.q.j("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f22456m = true;
            cVarG = Loader.f22857f;
        } else {
            cVarG = jA != -9223372036854775807L ? Loader.g(false, jA) : Loader.f22858g;
        }
        Loader.c cVar2 = cVarG;
        boolean z11 = !cVar2.c();
        this.f22449f.s(nVar, 1, -1, this.f22454k, 0, null, 0L, this.f22452i, iOException, z11);
        if (z11) {
            this.f22448e.onLoadTaskConcluded(cVar.f22462a);
        }
        return cVar2;
    }

    public void k() {
        this.f22453j.l();
    }

    @Override // com.google.android.exoplayer2.source.h
    public void maybeThrowPrepareError() {
    }

    @Override // com.google.android.exoplayer2.source.h
    public long readDiscontinuity() {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public void reevaluateBuffer(long j10) {
    }

    @Override // com.google.android.exoplayer2.source.h
    public long seekToUs(long j10) {
        for (int i10 = 0; i10 < this.f22451h.size(); i10++) {
            this.f22451h.get(i10).c();
        }
        return j10;
    }
}
