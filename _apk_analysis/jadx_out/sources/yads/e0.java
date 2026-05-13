package yads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e0 implements lx1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient c0 f89035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient q f89036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient d0 f89037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient n f89038e;

    public abstract n a();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lx1) {
            return ((i) this).a().equals(((i) ((lx1) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().f92668d.hashCode();
    }

    public final String toString() {
        return a().f92668d.toString();
    }
}
