package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class w90 extends ba0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96311a;

    public w90(String str) {
        super(0);
        this.f96311a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w90) && tn.p.f(this.f96311a, ((w90) obj).f96311a);
    }

    public final int hashCode() {
        return this.f96311a.hashCode();
    }

    public final String toString() {
        return "Header(text=" + this.f96311a + ")";
    }
}
