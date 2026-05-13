package yads;

import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class ns0 extends ut0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v22 f92922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9 f92923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f92924c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns0)) {
            return false;
        }
        ns0 ns0Var = (ns0) obj;
        return tn.p.f(this.f92922a, ns0Var.f92922a) && tn.p.f(this.f92923b, ns0Var.f92923b) && tn.p.f(this.f92924c, ns0Var.f92924c);
    }

    public final int hashCode() {
        return this.f92924c.hashCode() + ((this.f92923b.hashCode() + (this.f92922a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "FeedItem(sliderAd=" + this.f92922a + ", adResponse=" + this.f92923b + ", preloadedDivKitDesigns=" + this.f92924c + ")";
    }
}
