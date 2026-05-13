package yads;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes10.dex */
public final class bk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ak0 f88034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f88035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final im3 f88036c;

    public bk0(ak0 ak0Var, Drawable drawable, im3 im3Var) {
        this.f88034a = ak0Var;
        this.f88035b = drawable;
        this.f88036c = im3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk0)) {
            return false;
        }
        bk0 bk0Var = (bk0) obj;
        return tn.p.f(this.f88034a, bk0Var.f88034a) && tn.p.f(this.f88035b, bk0Var.f88035b) && tn.p.f(this.f88036c, bk0Var.f88036c);
    }

    public final int hashCode() {
        int iHashCode = this.f88034a.hashCode() * 31;
        Drawable drawable = this.f88035b;
        int iHashCode2 = (iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        im3 im3Var = this.f88036c;
        return iHashCode2 + (im3Var != null ? im3Var.hashCode() : 0);
    }

    public final String toString() {
        return "BatchedResponse(request=" + this.f88034a + ", drawable=" + this.f88035b + ", error=" + this.f88036c + ")";
    }
}
