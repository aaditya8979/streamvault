package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class dx extends ix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f89015a;

    public dx(boolean z10) {
        super(0);
        this.f89015a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dx) && this.f89015a == ((dx) obj).f89015a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f89015a);
    }

    public final String toString() {
        return "CmpPresent(value=" + this.f89015a + ")";
    }
}
