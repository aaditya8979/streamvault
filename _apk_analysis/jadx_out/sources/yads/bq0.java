package yads;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes3.dex */
public final class bq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f88111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f88112b;

    public bq0(int i10, RectF rectF) {
        this.f88111a = i10;
        this.f88112b = rectF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq0)) {
            return false;
        }
        bq0 bq0Var = (bq0) obj;
        return this.f88111a == bq0Var.f88111a && tn.p.f(this.f88112b, bq0Var.f88112b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f88111a) * 31;
        RectF rectF = this.f88112b;
        return iHashCode + (rectF == null ? 0 : rectF.hashCode());
    }

    public final String toString() {
        return "Exposure(exposedPercentage=" + this.f88111a + ", visibleRectangle=" + this.f88112b + ")";
    }
}
