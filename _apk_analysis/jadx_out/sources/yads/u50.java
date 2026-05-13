package yads;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class u50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m50 f95557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t80 f95558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b40 f95559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d50 f95560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t50 f95561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u70 f95562f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f95563g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f95564h;

    public u50(m50 m50Var, t80 t80Var, b40 b40Var, d50 d50Var, t50 t50Var, u70 u70Var, List list, List list2) {
        this.f95557a = m50Var;
        this.f95558b = t80Var;
        this.f95559c = b40Var;
        this.f95560d = d50Var;
        this.f95561e = t50Var;
        this.f95562f = u70Var;
        this.f95563g = list;
        this.f95564h = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u50)) {
            return false;
        }
        u50 u50Var = (u50) obj;
        return tn.p.f(this.f95557a, u50Var.f95557a) && tn.p.f(this.f95558b, u50Var.f95558b) && tn.p.f(this.f95559c, u50Var.f95559c) && tn.p.f(this.f95560d, u50Var.f95560d) && tn.p.f(this.f95561e, u50Var.f95561e) && tn.p.f(this.f95562f, u50Var.f95562f) && tn.p.f(this.f95563g, u50Var.f95563g) && tn.p.f(this.f95564h, u50Var.f95564h);
    }

    public final int hashCode() {
        return this.f95564h.hashCode() + eb.a(this.f95563g, (this.f95562f.hashCode() + ((this.f95561e.hashCode() + eb.a(this.f95560d.f88759a, (this.f95559c.hashCode() + ((this.f95558b.hashCode() + (this.f95557a.hashCode() * 31)) * 31)) * 31, 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "DebugPanelData(appData=" + this.f95557a + ", sdkData=" + this.f95558b + ", networkSettingsData=" + this.f95559c + ", adaptersData=" + this.f95560d + ", consentsData=" + this.f95561e + ", debugErrorIndicatorData=" + this.f95562f + ", adUnits=" + this.f95563g + ", alerts=" + this.f95564h + ")";
    }
}
