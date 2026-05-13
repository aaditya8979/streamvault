package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class fx extends ix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89714a;

    public fx(String str) {
        super(0);
        this.f89714a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fx) && tn.p.f(this.f89714a, ((fx) obj).f89714a);
    }

    public final int hashCode() {
        String str = this.f89714a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "Gdpr(value=" + this.f89714a + ")";
    }
}
