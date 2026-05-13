package com.inmobi.media;

/* JADX INFO: loaded from: classes8.dex */
public final class Om extends Rl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26097a;

    public Om(long j10) {
        this.f26097a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Om) && this.f26097a == ((Om) obj).f26097a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f26097a);
    }

    public final String toString() {
        return "VideoPause(currentPlaybackTime=" + this.f26097a + ")";
    }
}
