package fp;

/* JADX INFO: compiled from: DanmakuTimer.java */
/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f61800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f61801b;

    public long a(long j10) {
        return update(this.f61800a + j10);
    }

    public long b() {
        return this.f61801b;
    }

    public long update(long j10) {
        long j11 = j10 - this.f61800a;
        this.f61801b = j11;
        this.f61800a = j10;
        return j11;
    }
}
