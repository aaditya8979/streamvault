package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class tn3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vn3 f95300a;

    public /* synthetic */ tn3() {
        this(vn3.f96144e);
    }

    public tn3(vn3 vn3Var) {
        this.f95300a = vn3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tn3) && this.f95300a == ((tn3) obj).f95300a;
    }

    public final int hashCode() {
        return this.f95300a.hashCode();
    }

    public final String toString() {
        return "WebViewAdSettings(cacheMode=" + this.f95300a + ")";
    }
}
