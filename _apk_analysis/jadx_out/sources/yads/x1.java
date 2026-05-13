package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f96585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4 f96586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z9 f96587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lu2 f96588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w02 f96589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f96590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qf0 f96591g;

    public x1(v9 v9Var, d4 d4Var, z9 z9Var, lu2 lu2Var, w02 w02Var, int i10, qf0 qf0Var) {
        this.f96585a = v9Var;
        this.f96586b = d4Var;
        this.f96587c = z9Var;
        this.f96588d = lu2Var;
        this.f96589e = w02Var;
        this.f96590f = i10;
        this.f96591g = qf0Var;
    }

    public /* synthetic */ x1(v9 v9Var, d4 d4Var, z9 z9Var, lu2 lu2Var, w02 w02Var, int i10, qf0 qf0Var, int i11) {
        this(v9Var, d4Var, z9Var, lu2Var, (i11 & 16) != 0 ? null : w02Var, (i11 & 32) != 0 ? 0 : i10, (i11 & 64) != 0 ? null : qf0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return tn.p.f(this.f96585a, x1Var.f96585a) && tn.p.f(this.f96586b, x1Var.f96586b) && tn.p.f(this.f96587c, x1Var.f96587c) && tn.p.f(this.f96588d, x1Var.f96588d) && tn.p.f(this.f96589e, x1Var.f96589e) && this.f96590f == x1Var.f96590f && tn.p.f(this.f96591g, x1Var.f96591g);
    }

    public final int hashCode() {
        int iHashCode = (this.f96588d.hashCode() + ((this.f96587c.hashCode() + ((this.f96586b.hashCode() + (this.f96585a.hashCode() * 31)) * 31)) * 31)) * 31;
        w02 w02Var = this.f96589e;
        int iA = nd3.a(this.f96590f, (iHashCode + (w02Var == null ? 0 : w02Var.hashCode())) * 31, 31);
        qf0 qf0Var = this.f96591g;
        return iA + (qf0Var != null ? qf0Var.hashCode() : 0);
    }

    public final String toString() {
        return "AdActivityData(adResponse=" + this.f96585a + ", adConfiguration=" + this.f96586b + ", adResultReceiver=" + this.f96587c + ", sdkEnvironmentModule=" + this.f96588d + ", nativeAd=" + this.f96589e + ", requestedOrientation=" + this.f96590f + ", delegatedActivityLaunchInfo=" + this.f96591g + ")";
    }
}
