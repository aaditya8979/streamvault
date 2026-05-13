package yads;

/* JADX INFO: loaded from: classes7.dex */
public final class aa0 extends ba0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f87621a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa0(boolean z10) {
        super(0);
        z90 z90Var = z90.f97434b;
        this.f87621a = z10;
    }

    @Override // yads.ba0
    public final boolean a(Object obj) {
        if (obj instanceof aa0) {
            ((aa0) obj).getClass();
            if (tn.p.f("Debug Error Indicator", "Debug Error Indicator")) {
                z90 z90Var = z90.f97434b;
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa0)) {
            return false;
        }
        aa0 aa0Var = (aa0) obj;
        aa0Var.getClass();
        if (!tn.p.f("Debug Error Indicator", "Debug Error Indicator")) {
            return false;
        }
        z90 z90Var = z90.f97434b;
        return this.f87621a == aa0Var.f87621a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f87621a) + ((z90.f97434b.hashCode() - 1222345866) * 31);
    }

    public final String toString() {
        return "Switch(text=Debug Error Indicator, switchType=" + z90.f97434b + ", initialState=" + this.f87621a + ")";
    }
}
