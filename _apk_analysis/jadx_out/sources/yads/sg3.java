package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class sg3 extends ug3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final be3 f94823a;

    public sg3(be3 be3Var) {
        super(0);
        this.f94823a = be3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sg3) && tn.p.f(this.f94823a, ((sg3) obj).f94823a);
    }

    public final int hashCode() {
        return this.f94823a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.f94823a + ")";
    }
}
