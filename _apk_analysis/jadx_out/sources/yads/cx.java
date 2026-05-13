package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class cx extends ix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88635a;

    public cx(String str) {
        super(0);
        this.f88635a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cx) && tn.p.f(this.f88635a, ((cx) obj).f88635a);
    }

    public final int hashCode() {
        String str = this.f88635a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "AdditionalConsent(value=" + this.f88635a + ")";
    }
}
