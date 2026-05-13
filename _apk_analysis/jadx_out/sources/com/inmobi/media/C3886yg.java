package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.yg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3886yg extends Tn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28594a;

    public C3886yg(int i10) {
        this.f28594a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3886yg) && this.f28594a == ((C3886yg) obj).f28594a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f28594a);
    }

    public final String toString() {
        return "PollingVisibilityTrackerConfig(pollingIntervalInMillis=" + this.f28594a + ")";
    }
}
