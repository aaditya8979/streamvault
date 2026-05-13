package h5;

import i5.h;

/* JADX INFO: compiled from: DashWrappingSegmentIndex.java */
/* JADX INFO: loaded from: classes7.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k4.b f62975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f62976b;

    public d(k4.b bVar, long j10) {
        this.f62975a = bVar;
        this.f62976b = j10;
    }

    @Override // h5.c
    public long getDurationUs(long j10, long j11) {
        return this.f62975a.f72870d[(int) j10];
    }

    @Override // h5.c
    public long getFirstSegmentNum() {
        return 0L;
    }

    @Override // h5.c
    public int getSegmentCount(long j10) {
        return this.f62975a.f72867a;
    }

    @Override // h5.c
    public long getSegmentNum(long j10, long j11) {
        return this.f62975a.a(j10 + this.f62976b);
    }

    @Override // h5.c
    public h getSegmentUrl(long j10) {
        return new h(null, this.f62975a.f72869c[(int) j10], r0.f72868b[r8]);
    }

    @Override // h5.c
    public long getTimeUs(long j10) {
        return this.f62975a.f72871e[(int) j10] - this.f62976b;
    }

    @Override // h5.c
    public boolean isExplicit() {
        return true;
    }
}
