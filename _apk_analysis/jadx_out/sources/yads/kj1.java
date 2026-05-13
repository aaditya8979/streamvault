package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class kj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f91608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lj1 f91609b;

    public kj1(int i10, lj1 lj1Var) {
        this.f91608a = i10;
        this.f91609b = lj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kj1)) {
            return false;
        }
        kj1 kj1Var = (kj1) obj;
        return this.f91608a == kj1Var.f91608a && this.f91609b == kj1Var.f91609b;
    }

    public final int hashCode() {
        return this.f91609b.hashCode() + (Integer.hashCode(this.f91608a) * 31);
    }

    public final String toString() {
        return "MeasuredSizeSpec(value=" + this.f91608a + ", mode=" + this.f91609b + ")";
    }
}
