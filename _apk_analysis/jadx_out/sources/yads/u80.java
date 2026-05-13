package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class u80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f95576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w80 f95577b;

    public u80(String str, w80 w80Var) {
        this.f95576a = str;
        this.f95577b = w80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u80)) {
            return false;
        }
        u80 u80Var = (u80) obj;
        return tn.p.f(this.f95576a, u80Var.f95576a) && tn.p.f(this.f95577b, u80Var.f95577b);
    }

    public final int hashCode() {
        return this.f95577b.hashCode() + (this.f95576a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelSdkIntegrationData(sdkVersion=" + this.f95576a + ", sdkIntegrationStatusData=" + this.f95577b + ")";
    }
}
