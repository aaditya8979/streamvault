package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class do3 implements fo3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fw1 f88942a;

    public do3(fw1 fw1Var) {
        this.f88942a = fw1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof do3) && tn.p.f(this.f88942a, ((do3) obj).f88942a);
    }

    public final int hashCode() {
        fw1 fw1Var = this.f88942a;
        if (fw1Var == null) {
            return 0;
        }
        return fw1Var.hashCode();
    }

    public final String toString() {
        return "Loading(preloadingListener=" + this.f88942a + ")";
    }
}
