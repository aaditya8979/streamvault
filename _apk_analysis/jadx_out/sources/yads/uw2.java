package yads;

/* JADX INFO: loaded from: classes3.dex */
public class uw2 implements vw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f95859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tw2 f95860b;

    public uw2() {
        this(-9223372036854775807L, 0L);
    }

    public uw2(long j10, long j11) {
        this.f95859a = j10;
        this.f95860b = new tw2(j11 == 0 ? xw2.f96907c : new xw2(0L, j11));
    }

    @Override // yads.vw2
    public final tw2 b(long j10) {
        return this.f95860b;
    }

    @Override // yads.vw2
    public final boolean b() {
        return false;
    }

    @Override // yads.vw2
    public final long c() {
        return this.f95859a;
    }
}
