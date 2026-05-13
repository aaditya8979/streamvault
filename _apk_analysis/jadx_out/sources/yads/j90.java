package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class j90 implements m90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91130a;

    public j90(String str) {
        this.f91130a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j90) && tn.p.f(this.f91130a, ((j90) obj).f91130a);
    }

    public final int hashCode() {
        return this.f91130a.hashCode();
    }

    public final String toString() {
        return "Message(text=" + this.f91130a + ")";
    }
}
