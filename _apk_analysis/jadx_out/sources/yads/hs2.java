package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class hs2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f90527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f90528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public pe f90529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public hs2 f90530d;

    public hs2(int i10, long j10) {
        a(i10, j10);
    }

    public final void a(int i10, long j10) {
        if (this.f90529c != null) {
            throw new IllegalStateException();
        }
        this.f90527a = j10;
        this.f90528b = j10 + ((long) i10);
    }
}
