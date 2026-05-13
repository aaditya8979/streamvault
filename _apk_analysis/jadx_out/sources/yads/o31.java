package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class o31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f93104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f93105b;

    public o31(int i10, int i11) {
        this.f93104a = i10;
        this.f93105b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o31)) {
            return false;
        }
        o31 o31Var = (o31) obj;
        return this.f93104a == o31Var.f93104a && this.f93105b == o31Var.f93105b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f93105b) + (Integer.hashCode(this.f93104a) * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f93104a + ", height=" + this.f93105b + ")";
    }
}
