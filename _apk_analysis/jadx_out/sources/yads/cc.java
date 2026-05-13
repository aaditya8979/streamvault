package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class cc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f88407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f88408b;

    public cc(long j10, long j11) {
        this.f88407a = j10;
        this.f88408b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc)) {
            return false;
        }
        cc ccVar = (cc) obj;
        return this.f88407a == ccVar.f88407a && this.f88408b == ccVar.f88408b;
    }

    public final int hashCode() {
        return (((int) this.f88407a) * 31) + ((int) this.f88408b);
    }
}
