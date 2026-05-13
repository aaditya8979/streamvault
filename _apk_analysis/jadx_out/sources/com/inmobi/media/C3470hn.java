package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.hn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3470hn extends Rl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27313a;

    public C3470hn(long j10) {
        this.f27313a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3470hn) && this.f27313a == ((C3470hn) obj).f27313a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f27313a);
    }

    public final String toString() {
        return "VideoResume(currentPlaybackTime=" + this.f27313a + ")";
    }
}
