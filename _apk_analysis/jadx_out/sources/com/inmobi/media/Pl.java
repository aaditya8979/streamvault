package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class Pl extends Rl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26143a;

    public Pl(long j10) {
        this.f26143a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Pl) && this.f26143a == ((Pl) obj).f26143a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f26143a);
    }

    public final String toString() {
        return "VideoComplete(duration=" + this.f26143a + ")";
    }
}
