package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class n70 extends s70 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92761b;

    public n70(String str) {
        super("Ad Units", 0);
        this.f92761b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n70) && tn.p.f(this.f92761b, ((n70) obj).f92761b);
    }

    public final int hashCode() {
        return this.f92761b.hashCode();
    }

    public final String toString() {
        return "AdUnit(unitId=" + this.f92761b + ")";
    }
}
