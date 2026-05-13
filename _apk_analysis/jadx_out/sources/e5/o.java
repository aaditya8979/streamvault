package e5;

import androidx.annotation.Nullable;
import com.google.android.exoplayer.source.TrackGroupArray;
import e4.t0;
import e5.q;
import e5.r;
import java.io.IOException;

/* JADX INFO: compiled from: MaskingMediaPeriod.java */
/* JADX INFO: loaded from: classes12.dex */
public final class o implements q, q.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f60557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r.a f60558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y5.b f60559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public q f60560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public q.a f60561f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f60562g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public a f60563h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f60564i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f60565j = -9223372036854775807L;

    /* JADX INFO: compiled from: MaskingMediaPeriod.java */
    public interface a {
        void a(r.a aVar, IOException iOException);
    }

    public o(r rVar, r.a aVar, y5.b bVar, long j10) {
        this.f60558c = aVar;
        this.f60559d = bVar;
        this.f60557b = rVar;
        this.f60562g = j10;
    }

    @Override // e5.q
    public long a(long j10, t0 t0Var) {
        return ((q) a6.k0.i(this.f60560e)).a(j10, t0Var);
    }

    public void b(r.a aVar) {
        long jH = h(this.f60562g);
        q qVarB = this.f60557b.b(aVar, this.f60559d, jH);
        this.f60560e = qVarB;
        if (this.f60561f != null) {
            qVarB.f(this, jH);
        }
    }

    @Override // e5.q, e5.j0
    public boolean continueLoading(long j10) {
        q qVar = this.f60560e;
        return qVar != null && qVar.continueLoading(j10);
    }

    @Override // e5.q.a
    public void d(q qVar) {
        ((q.a) a6.k0.i(this.f60561f)).d(this);
    }

    @Override // e5.q
    public void discardBuffer(long j10, boolean z10) {
        ((q) a6.k0.i(this.f60560e)).discardBuffer(j10, z10);
    }

    @Override // e5.q
    public long e(com.google.android.exoplayer.trackselection.c[] cVarArr, boolean[] zArr, i0[] i0VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.f60565j;
        if (j12 == -9223372036854775807L || j10 != this.f60562g) {
            j11 = j10;
        } else {
            this.f60565j = -9223372036854775807L;
            j11 = j12;
        }
        return ((q) a6.k0.i(this.f60560e)).e(cVarArr, zArr, i0VarArr, zArr2, j11);
    }

    @Override // e5.q
    public void f(q.a aVar, long j10) {
        this.f60561f = aVar;
        q qVar = this.f60560e;
        if (qVar != null) {
            qVar.f(this, h(this.f60562g));
        }
    }

    public long g() {
        return this.f60562g;
    }

    @Override // e5.q, e5.j0
    public long getBufferedPositionUs() {
        return ((q) a6.k0.i(this.f60560e)).getBufferedPositionUs();
    }

    @Override // e5.q, e5.j0
    public long getNextLoadPositionUs() {
        return ((q) a6.k0.i(this.f60560e)).getNextLoadPositionUs();
    }

    @Override // e5.q
    public TrackGroupArray getTrackGroups() {
        return ((q) a6.k0.i(this.f60560e)).getTrackGroups();
    }

    public final long h(long j10) {
        long j11 = this.f60565j;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    @Override // e5.j0.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void c(q qVar) {
        ((q.a) a6.k0.i(this.f60561f)).c(this);
    }

    @Override // e5.q, e5.j0
    public boolean isLoading() {
        q qVar = this.f60560e;
        return qVar != null && qVar.isLoading();
    }

    public void j(long j10) {
        this.f60565j = j10;
    }

    public void k() {
        q qVar = this.f60560e;
        if (qVar != null) {
            this.f60557b.k(qVar);
        }
    }

    @Override // e5.q
    public void maybeThrowPrepareError() throws IOException {
        try {
            q qVar = this.f60560e;
            if (qVar != null) {
                qVar.maybeThrowPrepareError();
            } else {
                this.f60557b.maybeThrowSourceInfoRefreshError();
            }
        } catch (IOException e10) {
            a aVar = this.f60563h;
            if (aVar == null) {
                throw e10;
            }
            if (this.f60564i) {
                return;
            }
            this.f60564i = true;
            aVar.a(this.f60558c, e10);
        }
    }

    @Override // e5.q
    public long readDiscontinuity() {
        return ((q) a6.k0.i(this.f60560e)).readDiscontinuity();
    }

    @Override // e5.q, e5.j0
    public void reevaluateBuffer(long j10) {
        ((q) a6.k0.i(this.f60560e)).reevaluateBuffer(j10);
    }

    @Override // e5.q
    public long seekToUs(long j10) {
        return ((q) a6.k0.i(this.f60560e)).seekToUs(j10);
    }
}
