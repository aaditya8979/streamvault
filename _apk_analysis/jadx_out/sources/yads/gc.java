package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class gc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jk f89908b;

    public gc(String str, jk jkVar) {
        this.f89907a = str;
        this.f89908b = jkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc)) {
            return false;
        }
        gc gcVar = (gc) obj;
        return tn.p.f(this.f89907a, gcVar.f89907a) && tn.p.f(this.f89908b, gcVar.f89908b);
    }

    public final int hashCode() {
        String str = this.f89907a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        jk jkVar = this.f89908b;
        return iHashCode + (jkVar != null ? jkVar.hashCode() : 0);
    }

    public final String toString() {
        return "AdditionalInfo(skuId=" + this.f89907a + ", attributes=" + this.f89908b + ")";
    }
}
