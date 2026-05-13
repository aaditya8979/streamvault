package yads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a03 f87760a;

    public ao(a03 a03Var) {
        this.f87760a = a03Var;
    }

    public final a03 a() {
        return this.f87760a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ao) && tn.p.f(((ao) obj).f87760a, this.f87760a);
    }

    public final int hashCode() {
        return this.f87760a.hashCode();
    }

    public final String toString() {
        return this.f87760a.toString();
    }
}
