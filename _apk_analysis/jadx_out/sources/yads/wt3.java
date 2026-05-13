package yads;

import com.yandex.mobile.ads.rewarded.Reward;

/* JADX INFO: loaded from: classes11.dex */
public final class wt3 implements Reward {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pq2 f96494a;

    public wt3(pq2 pq2Var) {
        this.f96494a = pq2Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof wt3) && tn.p.f(((wt3) obj).f96494a, this.f96494a);
    }

    @Override // com.yandex.mobile.ads.rewarded.Reward
    public final int getAmount() {
        return ((bw2) this.f96494a).f88178a;
    }

    @Override // com.yandex.mobile.ads.rewarded.Reward
    public final String getType() {
        return ((bw2) this.f96494a).f88179b;
    }

    public final int hashCode() {
        return this.f96494a.hashCode();
    }
}
