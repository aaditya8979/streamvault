package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class fu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f89676b;

    public fu0(String str, String str2) {
        this.f89675a = str;
        this.f89676b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu0)) {
            return false;
        }
        fu0 fu0Var = (fu0) obj;
        return tn.p.f(this.f89675a, fu0Var.f89675a) && tn.p.f(this.f89676b, fu0Var.f89676b);
    }

    public final int hashCode() {
        return this.f89676b.hashCode() + (this.f89675a.hashCode() * 31);
    }

    public final String toString() {
        return "Item(title=" + this.f89675a + ", url=" + this.f89676b + ")";
    }
}
