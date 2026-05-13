package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class zk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zk f97640e = new zk(-1, -1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f97641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f97642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f97643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f97644d;

    public zk(int i10, int i11, int i12) {
        this.f97641a = i10;
        this.f97642b = i11;
        this.f97643c = i12;
        this.f97644d = ib3.e(i12) ? ib3.b(i12, i11) : -1;
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f97641a + ", channelCount=" + this.f97642b + ", encoding=" + this.f97643c + ']';
    }
}
