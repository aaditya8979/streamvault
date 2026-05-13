package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class r70 extends s70 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94317b;

    public r70(String str) {
        super(str, 0);
        this.f94317b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r70) && tn.p.f(this.f94317b, ((r70) obj).f94317b);
    }

    public final int hashCode() {
        return this.f94317b.hashCode();
    }

    public final String toString() {
        return "MediationNetwork(network=" + this.f94317b + ")";
    }
}
