package yads;

import com.monetization.ads.nativeads.ExtendedNativeAdView;

/* JADX INFO: loaded from: classes12.dex */
public final class se1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f94803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f94804b = ExtendedNativeAdView.class;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zf0 f94805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ag0 f94806d;

    public se1(int i10, jy jyVar, ag0 ag0Var) {
        this.f94803a = i10;
        this.f94805c = jyVar;
        this.f94806d = ag0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se1)) {
            return false;
        }
        se1 se1Var = (se1) obj;
        return this.f94803a == se1Var.f94803a && tn.p.f(this.f94804b, se1Var.f94804b) && tn.p.f(this.f94805c, se1Var.f94805c) && tn.p.f(this.f94806d, se1Var.f94806d);
    }

    public final int hashCode() {
        return this.f94806d.hashCode() + ((this.f94805c.hashCode() + ((this.f94804b.hashCode() + (Integer.hashCode(this.f94803a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LayoutDesign(layoutId=" + this.f94803a + ", layoutViewClass=" + this.f94804b + ", designComponentBinder=" + this.f94805c + ", designConstraint=" + this.f94806d + ")";
    }
}
