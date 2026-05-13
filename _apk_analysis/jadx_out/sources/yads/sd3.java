package yads;

import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class sd3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f94800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mj3 f94801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u41 f94802c;

    public sd3(List list, mj3 mj3Var, u41 u41Var) {
        this.f94800a = list;
        this.f94801b = mj3Var;
        this.f94802c = u41Var;
    }

    public final je3 a() {
        return (je3) cn.f0.t0(this.f94800a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd3)) {
            return false;
        }
        sd3 sd3Var = (sd3) obj;
        return tn.p.f(this.f94800a, sd3Var.f94800a) && tn.p.f(this.f94801b, sd3Var.f94801b) && tn.p.f(this.f94802c, sd3Var.f94802c);
    }

    public final int hashCode() {
        int iHashCode = this.f94800a.hashCode() * 31;
        mj3 mj3Var = this.f94801b;
        int iHashCode2 = (iHashCode + (mj3Var == null ? 0 : mj3Var.hashCode())) * 31;
        u41 u41Var = this.f94802c;
        return iHashCode2 + (u41Var != null ? u41Var.hashCode() : 0);
    }

    public final String toString() {
        return "Video(videoAdsInfo=" + this.f94800a + ", videoSettings=" + this.f94801b + ", preview=" + this.f94802c + ")";
    }
}
