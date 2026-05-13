package yads;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
public final class uj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f95685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s41 f95686b;

    public uj0(Drawable drawable, s41 s41Var) {
        this.f95685a = drawable;
        this.f95686b = s41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj0)) {
            return false;
        }
        uj0 uj0Var = (uj0) obj;
        return tn.p.f(this.f95685a, uj0Var.f95685a) && this.f95686b == uj0Var.f95686b;
    }

    public final int hashCode() {
        return this.f95686b.hashCode() + (this.f95685a.hashCode() * 31);
    }

    public final String toString() {
        return "CachedDrawable(drawable=" + this.f95685a + ", imageType=" + this.f95686b + ")";
    }
}
