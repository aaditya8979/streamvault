package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class qu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u41 f94153a;

    public qu0(u41 u41Var) {
        this.f94153a = u41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qu0) && tn.p.f(this.f94153a, ((qu0) obj).f94153a);
    }

    public final int hashCode() {
        u41 u41Var = this.f94153a;
        if (u41Var == null) {
            return 0;
        }
        return u41Var.hashCode();
    }

    public final String toString() {
        return "FeedbackValue(imageValue=" + this.f94153a + ")";
    }
}
