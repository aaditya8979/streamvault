package i5;

/* JADX INFO: compiled from: SingleSegmentIndex.java */
/* JADX INFO: loaded from: classes8.dex */
public final class k implements h5.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f63807a;

    public k(h hVar) {
        this.f63807a = hVar;
    }

    @Override // h5.c
    public long getDurationUs(long j10, long j11) {
        return j11;
    }

    @Override // h5.c
    public long getFirstSegmentNum() {
        return 0L;
    }

    @Override // h5.c
    public int getSegmentCount(long j10) {
        return 1;
    }

    @Override // h5.c
    public long getSegmentNum(long j10, long j11) {
        return 0L;
    }

    @Override // h5.c
    public h getSegmentUrl(long j10) {
        return this.f63807a;
    }

    @Override // h5.c
    public long getTimeUs(long j10) {
        return 0L;
    }

    @Override // h5.c
    public boolean isExplicit() {
        return true;
    }
}
