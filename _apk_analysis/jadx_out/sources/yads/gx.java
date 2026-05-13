package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class gx extends ix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90145a;

    public gx(String str) {
        super(0);
        this.f90145a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gx) && tn.p.f(this.f90145a, ((gx) obj).f90145a);
    }

    public final int hashCode() {
        String str = this.f90145a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "PurposeConsents(value=" + this.f90145a + ")";
    }
}
