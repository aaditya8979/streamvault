package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class er0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e00 f89361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f89362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1 f89363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dr0 f89364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f89365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f89366f;

    public er0(e00 e00Var, long j10, h1 h1Var, dr0 dr0Var, Map map, c cVar) {
        this.f89361a = e00Var;
        this.f89362b = j10;
        this.f89363c = h1Var;
        this.f89364d = dr0Var;
        this.f89365e = map;
        this.f89366f = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er0)) {
            return false;
        }
        er0 er0Var = (er0) obj;
        return this.f89361a == er0Var.f89361a && this.f89362b == er0Var.f89362b && this.f89363c == er0Var.f89363c && tn.p.f(this.f89364d, er0Var.f89364d) && tn.p.f(this.f89365e, er0Var.f89365e) && tn.p.f(this.f89366f, er0Var.f89366f);
    }

    public final int hashCode() {
        int iHashCode = (this.f89363c.hashCode() + ((Long.hashCode(this.f89362b) + (this.f89361a.hashCode() * 31)) * 31)) * 31;
        dr0 dr0Var = this.f89364d;
        int iHashCode2 = (this.f89365e.hashCode() + ((iHashCode + (dr0Var == null ? 0 : dr0Var.hashCode())) * 31)) * 31;
        c cVar = this.f89366f;
        return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "FalseClickData(adType=" + this.f89361a + ", startTime=" + this.f89362b + ", activityInteractionType=" + this.f89363c + ", falseClick=" + this.f89364d + ", reportData=" + this.f89365e + ", abExperiments=" + this.f89366f + ")";
    }
}
