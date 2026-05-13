package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.v5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3800v5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28326b;

    public C3800v5(String str, boolean z10) {
        this.f28325a = z10;
        this.f28326b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3800v5)) {
            return false;
        }
        C3800v5 c3800v5 = (C3800v5) obj;
        return this.f28325a == c3800v5.f28325a && tn.p.f(this.f28326b, c3800v5.f28326b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f28325a) * 31;
        String str = this.f28326b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "PlayStoreSnapshot(disabled=" + this.f28325a + ", version=" + this.f28326b + ")";
    }
}
