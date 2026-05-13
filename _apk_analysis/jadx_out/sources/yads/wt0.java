package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class wt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96493a;

    public wt0(String str) {
        this.f96493a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wt0) && tn.p.f(this.f96493a, ((wt0) obj).f96493a);
    }

    public final int hashCode() {
        return this.f96493a.hashCode();
    }

    public final String toString() {
        return "FeedSessionData(value=" + this.f96493a + ")";
    }
}
