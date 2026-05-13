package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class u5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v5 f95555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f95556b;

    public u5(v5 v5Var, Map map) {
        this.f95555a = v5Var;
        this.f95556b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5)) {
            return false;
        }
        u5 u5Var = (u5) obj;
        return this.f95555a == u5Var.f95555a && tn.p.f(this.f95556b, u5Var.f95556b);
    }

    public final int hashCode() {
        return this.f95556b.hashCode() + (this.f95555a.hashCode() * 31);
    }

    public final String toString() {
        return "AdLoadingPhase(adLoadingPhaseType=" + this.f95555a + ", reportParameters=" + this.f95556b + ")";
    }
}
