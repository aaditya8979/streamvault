package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class ll1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f92022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f92023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f92024c;

    public ll1(int i10, int i11, int i12) {
        this.f92022a = i10;
        this.f92023b = i11;
        this.f92024c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll1)) {
            return false;
        }
        ll1 ll1Var = (ll1) obj;
        return this.f92022a == ll1Var.f92022a && this.f92023b == ll1Var.f92023b && this.f92024c == ll1Var.f92024c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f92024c) + nd3.a(this.f92023b, Integer.hashCode(this.f92022a) * 31, 31);
    }

    public final String toString() {
        return "MediaFileInfo(width=" + this.f92022a + ", height=" + this.f92023b + ", bitrate=" + this.f92024c + ")";
    }
}
