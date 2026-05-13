package yads;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class gk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f90016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s41 f90017b;

    public gk0(Drawable drawable, s41 s41Var) {
        this.f90016a = drawable;
        this.f90017b = s41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gk0)) {
            return false;
        }
        gk0 gk0Var = (gk0) obj;
        return tn.p.f(this.f90016a, gk0Var.f90016a) && this.f90017b == gk0Var.f90017b;
    }

    public final int hashCode() {
        return this.f90017b.hashCode() + (this.f90016a.hashCode() * 31);
    }

    public final String toString() {
        return "DrawableResponse(drawable=" + this.f90016a + ", imageType=" + this.f90017b + ")";
    }
}
