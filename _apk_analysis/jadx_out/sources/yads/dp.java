package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class dp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e00 f88943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a03 f88944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f88945c;

    public dp(e00 e00Var, a03 a03Var, Map map) {
        this.f88943a = e00Var;
        this.f88944b = a03Var;
        this.f88945c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp)) {
            return false;
        }
        dp dpVar = (dp) obj;
        return this.f88943a == dpVar.f88943a && tn.p.f(this.f88944b, dpVar.f88944b) && tn.p.f(this.f88945c, dpVar.f88945c);
    }

    public final int hashCode() {
        e00 e00Var = this.f88943a;
        int iHashCode = (e00Var == null ? 0 : e00Var.hashCode()) * 31;
        a03 a03Var = this.f88944b;
        return this.f88945c.hashCode() + ((iHashCode + (a03Var != null ? a03Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "BidderTokenRequestData(adType=" + this.f88943a + ", sizeInfo=" + this.f88944b + ", parameters=" + this.f88945c + ")";
    }
}
