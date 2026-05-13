package com.inmobi.media;

/* JADX INFO: loaded from: classes7.dex */
public final class Ai {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f25171b;

    public Ai(int i10, long j10, int i11) {
        this.f25170a = i10;
        this.f25171b = j10;
    }

    public Ai(long j10, int i10) {
        this.f25170a = i10;
        this.f25171b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ai)) {
            return false;
        }
        Ai ai2 = (Ai) obj;
        return this.f25170a == ai2.f25170a && this.f25171b == ai2.f25171b && Double.compare(1.0d, 1.0d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(1.0d) + ((Long.hashCode(this.f25171b) + (Integer.hashCode(this.f25170a) * 31)) * 31);
    }

    public final String toString() {
        return "RetryPolicy(maxRetries=" + this.f25170a + ", retryInterval=" + this.f25171b + ", delayFactor=1.0)";
    }
}
