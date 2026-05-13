package yads;

import com.yandex.mobile.ads.common.ImpressionData;

/* JADX INFO: loaded from: classes4.dex */
public final class lr3 implements ImpressionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j5 f92074a;

    public lr3(j5 j5Var) {
        this.f92074a = j5Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof lr3) && tn.p.f(((lr3) obj).f92074a, this.f92074a);
    }

    @Override // com.yandex.mobile.ads.common.ImpressionData
    public final String getRawData() {
        return this.f92074a.f91096b;
    }

    public final int hashCode() {
        return this.f92074a.f91096b.hashCode();
    }
}
