package yads;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v80 f96304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f96305b;

    public w80(v80 v80Var, List list) {
        this.f96304a = v80Var;
        this.f96305b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w80)) {
            return false;
        }
        w80 w80Var = (w80) obj;
        return this.f96304a == w80Var.f96304a && tn.p.f(this.f96305b, w80Var.f96305b);
    }

    public final int hashCode() {
        int iHashCode = this.f96304a.hashCode() * 31;
        List list = this.f96305b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "DebugPanelSdkIntegrationStatusData(status=" + this.f96304a + ", messages=" + this.f96305b + ")";
    }
}
