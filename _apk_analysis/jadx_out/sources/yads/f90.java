package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class f90 implements g90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89518a;

    public f90(String str) {
        this.f89518a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f90) && tn.p.f(this.f89518a, ((f90) obj).f89518a);
    }

    public final int hashCode() {
        return this.f89518a.hashCode();
    }

    public final String toString() {
        return "OnWarningButtonClick(waring=" + this.f89518a + ")";
    }
}
