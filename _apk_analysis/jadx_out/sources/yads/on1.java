package yads;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class on1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oj1 f93291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sd3 f93292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f93293c;

    public on1(oj1 oj1Var, sd3 sd3Var, List list) {
        this.f93291a = oj1Var;
        this.f93292b = sd3Var;
        this.f93293c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof on1)) {
            return false;
        }
        on1 on1Var = (on1) obj;
        return tn.p.f(this.f93291a, on1Var.f93291a) && tn.p.f(this.f93292b, on1Var.f93292b) && tn.p.f(this.f93293c, on1Var.f93293c);
    }

    public final int hashCode() {
        oj1 oj1Var = this.f93291a;
        int iHashCode = (oj1Var == null ? 0 : oj1Var.hashCode()) * 31;
        sd3 sd3Var = this.f93292b;
        int iHashCode2 = (iHashCode + (sd3Var == null ? 0 : sd3Var.hashCode())) * 31;
        List list = this.f93293c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "MediaValue(media=" + this.f93291a + ", video=" + this.f93292b + ", imageValues=" + this.f93293c + ")";
    }
}
