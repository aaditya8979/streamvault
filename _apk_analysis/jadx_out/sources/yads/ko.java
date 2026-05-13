package yads;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ko implements yj1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f91676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f91677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f91678d;

    public ko(long j10, long j11) {
        this.f91676b = j10;
        this.f91677c = j11;
        c();
    }

    public final void c() {
        this.f91678d = this.f91676b - 1;
    }

    @Override // yads.yj1
    public final boolean next() {
        long j10 = this.f91678d + 1;
        this.f91678d = j10;
        return !(j10 > this.f91677c);
    }
}
