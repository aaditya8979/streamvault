package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class b80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m50 f87940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t80 f87941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f87942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t50 f87943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u70 f87944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c80 f87945f;

    public b80(m50 m50Var, t80 t80Var, ArrayList arrayList, t50 t50Var, u70 u70Var, c80 c80Var) {
        this.f87940a = m50Var;
        this.f87941b = t80Var;
        this.f87942c = arrayList;
        this.f87943d = t50Var;
        this.f87944e = u70Var;
        this.f87945f = c80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b80)) {
            return false;
        }
        b80 b80Var = (b80) obj;
        return tn.p.f(this.f87940a, b80Var.f87940a) && tn.p.f(this.f87941b, b80Var.f87941b) && tn.p.f(this.f87942c, b80Var.f87942c) && tn.p.f(this.f87943d, b80Var.f87943d) && tn.p.f(this.f87944e, b80Var.f87944e) && tn.p.f(this.f87945f, b80Var.f87945f);
    }

    public final int hashCode() {
        int iHashCode = (this.f87944e.hashCode() + ((this.f87943d.hashCode() + eb.a(this.f87942c, (this.f87941b.hashCode() + (this.f87940a.hashCode() * 31)) * 31, 31)) * 31)) * 31;
        c80 c80Var = this.f87945f;
        return iHashCode + (c80Var == null ? 0 : c80Var.hashCode());
    }

    public final String toString() {
        return "DebugPanelLocalData(appData=" + this.f87940a + ", sdkData=" + this.f87941b + ", mediationNetworksData=" + this.f87942c + ", consentsData=" + this.f87943d + ", debugErrorIndicatorData=" + this.f87944e + ", logsData=" + this.f87945f + ")";
    }
}
