package yads;

/* JADX INFO: loaded from: classes12.dex */
public final class la {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f91916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f91917b;

    public la(int i10, int i11) {
        this.f91916a = i10;
        this.f91917b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la)) {
            return false;
        }
        la laVar = (la) obj;
        return this.f91916a == laVar.f91916a && this.f91917b == laVar.f91917b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f91917b) + (Integer.hashCode(this.f91916a) * 31);
    }

    public final String toString() {
        return "AdSize(width=" + this.f91916a + ", height=" + this.f91917b + ")";
    }
}
