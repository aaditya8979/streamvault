package g5;

/* JADX INFO: compiled from: BaseMediaChunkIterator.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f62005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f62006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f62007d;

    public b(long j10, long j11) {
        this.f62005b = j10;
        this.f62006c = j11;
        a();
    }

    public void a() {
        this.f62007d = this.f62005b - 1;
    }
}
