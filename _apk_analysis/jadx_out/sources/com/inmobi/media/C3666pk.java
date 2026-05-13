package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.pk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3666pk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f27886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f27887c;

    public C3666pk(long j10, long j11, long j12) {
        this.f27885a = j10;
        this.f27886b = j11;
        this.f27887c = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3666pk)) {
            return false;
        }
        C3666pk c3666pk = (C3666pk) obj;
        return this.f27885a == c3666pk.f27885a && this.f27886b == c3666pk.f27886b && this.f27887c == c3666pk.f27887c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f27887c) + ((Long.hashCode(this.f27886b) + (Long.hashCode(this.f27885a) * 31)) * 31);
    }

    public final String toString() {
        return "TimeoutConfig(connectTimeoutInSec=" + this.f27885a + ", readTimeoutInSec=" + this.f27886b + ", callTimeoutInSec=" + this.f27887c + ")";
    }
}
