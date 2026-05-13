package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class e61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final co2 f89117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final co2 f89118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final co2 f89119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final co2 f89120d;

    public e61(co2 co2Var, co2 co2Var2, co2 co2Var3, co2 co2Var4) {
        this.f89117a = co2Var;
        this.f89118b = co2Var2;
        this.f89119c = co2Var3;
        this.f89120d = co2Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e61)) {
            return false;
        }
        e61 e61Var = (e61) obj;
        return this.f89117a == e61Var.f89117a && this.f89118b == e61Var.f89118b && this.f89119c == e61Var.f89119c && this.f89120d == e61Var.f89120d;
    }

    public final int hashCode() {
        return this.f89120d.hashCode() + ((this.f89119c.hashCode() + ((this.f89118b.hashCode() + (this.f89117a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ImpressionTrackingReportTypes(impressionTrackingSuccessReportType=" + this.f89117a + ", impressionTrackingStartReportType=" + this.f89118b + ", impressionTrackingFailureReportType=" + this.f89119c + ", forcedImpressionTrackingFailureReportType=" + this.f89120d + ")";
    }
}
