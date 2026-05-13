package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class mn2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mn2 f92467b = new mn2(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f92468a;

    public mn2(boolean z10) {
        this.f92468a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && mn2.class == obj.getClass() && this.f92468a == ((mn2) obj).f92468a;
    }

    public final int hashCode() {
        return !this.f92468a ? 1 : 0;
    }
}
