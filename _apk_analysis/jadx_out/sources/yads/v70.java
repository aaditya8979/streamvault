package yads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class v70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f95972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m50 f95973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u80 f95974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b40 f95975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d50 f95976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t50 f95977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u70 f95978g;

    public v70(List list, m50 m50Var, u80 u80Var, b40 b40Var, d50 d50Var, t50 t50Var, u70 u70Var) {
        this.f95972a = list;
        this.f95973b = m50Var;
        this.f95974c = u80Var;
        this.f95975d = b40Var;
        this.f95976e = d50Var;
        this.f95977f = t50Var;
        this.f95978g = u70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v70)) {
            return false;
        }
        v70 v70Var = (v70) obj;
        return tn.p.f(this.f95972a, v70Var.f95972a) && tn.p.f(this.f95973b, v70Var.f95973b) && tn.p.f(this.f95974c, v70Var.f95974c) && tn.p.f(this.f95975d, v70Var.f95975d) && tn.p.f(this.f95976e, v70Var.f95976e) && tn.p.f(this.f95977f, v70Var.f95977f) && tn.p.f(this.f95978g, v70Var.f95978g);
    }

    public final int hashCode() {
        return this.f95978g.hashCode() + ((this.f95977f.hashCode() + eb.a(this.f95976e.f88759a, (this.f95975d.hashCode() + ((this.f95974c.hashCode() + ((this.f95973b.hashCode() + (this.f95972a.hashCode() * 31)) * 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "DebugPanelFeedData(alertsData=" + this.f95972a + ", appData=" + this.f95973b + ", sdkIntegrationData=" + this.f95974c + ", adNetworkSettingsData=" + this.f95975d + ", adaptersData=" + this.f95976e + ", consentsData=" + this.f95977f + ", debugErrorIndicatorData=" + this.f95978g + ")";
    }
}
