package yads;

/* JADX INFO: loaded from: classes8.dex */
public final class x61 implements a71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96644a;

    public x61(String str) {
        this.f96644a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x61) && tn.p.f(this.f96644a, ((x61) obj).f96644a);
    }

    public final int hashCode() {
        return this.f96644a.hashCode();
    }

    public final String toString() {
        return "Failure(message=" + this.f96644a + ")";
    }
}
