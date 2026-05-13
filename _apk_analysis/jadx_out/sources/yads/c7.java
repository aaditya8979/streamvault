package yads;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f88374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f88376c;

    public c7(List list, int i10, int i11) {
        this.f88374a = list;
        this.f88375b = i10;
        this.f88376c = i11;
    }

    public final List a() {
        return this.f88374a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7)) {
            return false;
        }
        c7 c7Var = (c7) obj;
        return tn.p.f(this.f88374a, c7Var.f88374a) && this.f88375b == c7Var.f88375b && this.f88376c == c7Var.f88376c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f88376c) + nd3.a(this.f88375b, this.f88374a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AdPod(items=" + this.f88374a + ", closableAdPosition=" + this.f88375b + ", rewardAdPosition=" + this.f88376c + ")";
    }
}
