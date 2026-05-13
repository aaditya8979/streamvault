package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class hx extends ix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90584a;

    public hx(String str) {
        super(0);
        this.f90584a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hx) && tn.p.f(this.f90584a, ((hx) obj).f90584a);
    }

    public final int hashCode() {
        String str = this.f90584a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "VendorConsents(value=" + this.f90584a + ")";
    }
}
