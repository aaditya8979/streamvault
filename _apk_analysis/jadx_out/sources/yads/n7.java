package yads;

/* JADX INFO: loaded from: classes12.dex */
public final class n7 extends Throwable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92760b;

    public n7(String str) {
        super(str);
        this.f92760b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n7) && tn.p.f(this.f92760b, ((n7) obj).f92760b);
    }

    public final int hashCode() {
        return this.f92760b.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "AdPresentationError(description=" + this.f92760b + ")";
    }
}
