package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.jn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3519jn extends Rl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27431a;

    public C3519jn(long j10) {
        this.f27431a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3519jn) && this.f27431a == ((C3519jn) obj).f27431a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f27431a);
    }

    public final String toString() {
        return "VideoSkipped(currentPlaybackTime=" + this.f27431a + ")";
    }
}
