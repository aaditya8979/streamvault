package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.b4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3297b4 extends AbstractC3650p4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f26834c;

    public C3297b4(int i10, long j10, String str) {
        tn.p.k(str, "configType");
        this.f26832a = str;
        this.f26833b = i10;
        this.f26834c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3297b4)) {
            return false;
        }
        C3297b4 c3297b4 = (C3297b4) obj;
        return tn.p.f(this.f26832a, c3297b4.f26832a) && this.f26833b == c3297b4.f26833b && this.f26834c == c3297b4.f26834c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f26834c) + AbstractC3414fi.a(this.f26833b, this.f26832a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ConfigFailure(configType=" + this.f26832a + ", errorCode=" + this.f26833b + ", lastUpdatedTimestamp=" + this.f26834c + ")";
    }
}
