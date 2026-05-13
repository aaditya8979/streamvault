package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.h;
import com.google.android.exoplayer2.source.i;
import d6.x1;
import e7.b0;
import e7.i0;
import java.io.IOException;
import s7.m0;

/* JADX INFO: compiled from: MaskingMediaPeriod.java */
/* JADX INFO: loaded from: classes9.dex */
public final class f implements h, h.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i.b f22294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f22295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r7.b f22296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f22297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h f22298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public h.a f22299g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public a f22300h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f22301i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f22302j = -9223372036854775807L;

    /* JADX INFO: compiled from: MaskingMediaPeriod.java */
    public interface a {
        void a(i.b bVar, IOException iOException);

        void b(i.b bVar);
    }

    public f(i.b bVar, r7.b bVar2, long j10) {
        this.f22294b = bVar;
        this.f22296d = bVar2;
        this.f22295c = j10;
    }

    @Override // com.google.android.exoplayer2.source.h
    public long b(q7.r[] rVarArr, boolean[] zArr, b0[] b0VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.f22302j;
        if (j12 == -9223372036854775807L || j10 != this.f22295c) {
            j11 = j10;
        } else {
            this.f22302j = -9223372036854775807L;
            j11 = j12;
        }
        return ((h) m0.j(this.f22298f)).b(rVarArr, zArr, b0VarArr, zArr2, j11);
    }

    @Override // com.google.android.exoplayer2.source.h.a
    public void c(h hVar) {
        ((h.a) m0.j(this.f22299g)).c(this);
        a aVar = this.f22300h;
        if (aVar != null) {
            aVar.b(this.f22294b);
        }
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public boolean continueLoading(long j10) {
        h hVar = this.f22298f;
        return hVar != null && hVar.continueLoading(j10);
    }

    public void d(i.b bVar) {
        long jI = i(this.f22295c);
        h hVarA = ((i) s7.a.e(this.f22297e)).a(bVar, this.f22296d, jI);
        this.f22298f = hVarA;
        if (this.f22299g != null) {
            hVarA.f(this, jI);
        }
    }

    @Override // com.google.android.exoplayer2.source.h
    public void discardBuffer(long j10, boolean z10) {
        ((h) m0.j(this.f22298f)).discardBuffer(j10, z10);
    }

    @Override // com.google.android.exoplayer2.source.h
    public long e(long j10, x1 x1Var) {
        return ((h) m0.j(this.f22298f)).e(j10, x1Var);
    }

    @Override // com.google.android.exoplayer2.source.h
    public void f(h.a aVar, long j10) {
        this.f22299g = aVar;
        h hVar = this.f22298f;
        if (hVar != null) {
            hVar.f(this, i(this.f22295c));
        }
    }

    public long g() {
        return this.f22302j;
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public long getBufferedPositionUs() {
        return ((h) m0.j(this.f22298f)).getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public long getNextLoadPositionUs() {
        return ((h) m0.j(this.f22298f)).getNextLoadPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.h
    public i0 getTrackGroups() {
        return ((h) m0.j(this.f22298f)).getTrackGroups();
    }

    public long h() {
        return this.f22295c;
    }

    public final long i(long j10) {
        long j11 = this.f22302j;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public boolean isLoading() {
        h hVar = this.f22298f;
        return hVar != null && hVar.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.q.a
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void a(h hVar) {
        ((h.a) m0.j(this.f22299g)).a(this);
    }

    public void k(long j10) {
        this.f22302j = j10;
    }

    public void l() {
        if (this.f22298f != null) {
            ((i) s7.a.e(this.f22297e)).f(this.f22298f);
        }
    }

    public void m(i iVar) {
        s7.a.g(this.f22297e == null);
        this.f22297e = iVar;
    }

    @Override // com.google.android.exoplayer2.source.h
    public void maybeThrowPrepareError() throws IOException {
        try {
            h hVar = this.f22298f;
            if (hVar != null) {
                hVar.maybeThrowPrepareError();
            } else {
                i iVar = this.f22297e;
                if (iVar != null) {
                    iVar.maybeThrowSourceInfoRefreshError();
                }
            }
        } catch (IOException e10) {
            a aVar = this.f22300h;
            if (aVar == null) {
                throw e10;
            }
            if (this.f22301i) {
                return;
            }
            this.f22301i = true;
            aVar.a(this.f22294b, e10);
        }
    }

    @Override // com.google.android.exoplayer2.source.h
    public long readDiscontinuity() {
        return ((h) m0.j(this.f22298f)).readDiscontinuity();
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public void reevaluateBuffer(long j10) {
        ((h) m0.j(this.f22298f)).reevaluateBuffer(j10);
    }

    @Override // com.google.android.exoplayer2.source.h
    public long seekToUs(long j10) {
        return ((h) m0.j(this.f22298f)).seekToUs(j10);
    }
}
