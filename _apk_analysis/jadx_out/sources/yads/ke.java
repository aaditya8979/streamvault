package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class ke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vd f91579a;

    public ke(vd vdVar) {
        this.f91579a = vdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ke) && tn.p.f(this.f91579a, ((ke) obj).f91579a);
    }

    public final int hashCode() {
        return this.f91579a.hashCode();
    }

    public final String toString() {
        return "Success(advertisingInfoHolder=" + this.f91579a + ")";
    }
}
