package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class ex extends ix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89396a;

    public ex(String str) {
        super(0);
        this.f89396a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ex) && tn.p.f(this.f89396a, ((ex) obj).f89396a);
    }

    public final int hashCode() {
        String str = this.f89396a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "ConsentString(value=" + this.f89396a + ")";
    }
}
