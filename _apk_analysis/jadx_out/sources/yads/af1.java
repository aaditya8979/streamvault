package yads;

/* JADX INFO: loaded from: classes5.dex */
public final class af1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f87678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f87679b;

    public af1(Integer num, Integer num2) {
        this.f87678a = num;
        this.f87679b = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af1)) {
            return false;
        }
        af1 af1Var = (af1) obj;
        return tn.p.f(this.f87678a, af1Var.f87678a) && tn.p.f(this.f87679b, af1Var.f87679b);
    }

    public final int hashCode() {
        Integer num = this.f87678a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f87679b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "LayoutParamsSize(width=" + this.f87678a + ", height=" + this.f87679b + ")";
    }
}
