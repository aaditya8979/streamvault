package yads;

/* JADX INFO: loaded from: classes12.dex */
public final class ji2 implements yp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f91233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f91234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f91235c;

    public ji2(ny0 ny0Var, Object obj, long j10) {
        this.f91233a = ny0Var;
        this.f91234b = obj;
        this.f91235c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji2)) {
            return false;
        }
        ji2 ji2Var = (ji2) obj;
        return tn.p.f(this.f91233a, ji2Var.f91233a) && tn.p.f(this.f91234b, ji2Var.f91234b) && this.f91235c == ji2Var.f91235c;
    }

    public final int hashCode() {
        Object obj = this.f91233a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f91234b;
        return Long.hashCode(this.f91235c) + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CachedItem(params=" + this.f91233a + ", item=" + this.f91234b + ", expiresAtTimestampMillis=" + this.f91235c + ")";
    }
}
