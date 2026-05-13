package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class by2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88195a;

    public by2(String str) {
        this.f88195a = str;
    }

    public final String a() {
        return this.f88195a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof by2) && tn.p.f(this.f88195a, ((by2) obj).f88195a);
    }

    public final int hashCode() {
        return this.f88195a.hashCode();
    }

    public final String toString() {
        return "SessionParameters(token=" + this.f88195a + ")";
    }
}
