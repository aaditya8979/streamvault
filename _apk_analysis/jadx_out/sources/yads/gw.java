package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class gw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fw f90134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f90135b;

    public gw(fw fwVar, String str) {
        this.f90134a = fwVar;
        this.f90135b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw)) {
            return false;
        }
        gw gwVar = (gw) obj;
        return this.f90134a == gwVar.f90134a && tn.p.f(this.f90135b, gwVar.f90135b);
    }

    public final int hashCode() {
        int iHashCode = this.f90134a.hashCode() * 31;
        String str = this.f90135b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CloseButtonValue(type=" + this.f90134a + ", text=" + this.f90135b + ")";
    }
}
