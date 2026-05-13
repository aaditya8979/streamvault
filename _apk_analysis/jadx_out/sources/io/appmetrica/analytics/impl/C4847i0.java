package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4847i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f66949b;

    public C4847i0(String str, long j10) {
        this.f66948a = str;
        this.f66949b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4847i0.class != obj.getClass()) {
            return false;
        }
        C4847i0 c4847i0 = (C4847i0) obj;
        if (this.f66949b != c4847i0.f66949b) {
            return false;
        }
        String str = this.f66948a;
        String str2 = c4847i0.f66948a;
        if (str != null) {
            if (str.equals(str2)) {
                return true;
            }
        } else if (str2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f66948a;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j10 = this.f66949b;
        return (iHashCode * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }
}
