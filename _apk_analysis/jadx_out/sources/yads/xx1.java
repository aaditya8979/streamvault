package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class xx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f96918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f96919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f96920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f96921d;

    public xx1(int i10, int i11, int i12, int i13) {
        this.f96918a = i10;
        this.f96919b = i11;
        this.f96920c = i12;
        this.f96921d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx1)) {
            return false;
        }
        xx1 xx1Var = (xx1) obj;
        return this.f96918a == xx1Var.f96918a && this.f96919b == xx1Var.f96919b && this.f96920c == xx1Var.f96920c && this.f96921d == xx1Var.f96921d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f96921d) + nd3.a(this.f96920c, nd3.a(this.f96919b, Integer.hashCode(this.f96918a) * 31, 31), 31);
    }

    public final String toString() {
        return "MuteControlResources(mutedResourceId=" + this.f96918a + ", unmutedResourceId=" + this.f96919b + ", mutedContentDescriptionId=" + this.f96920c + ", unmutedContentDescriptionId=" + this.f96921d + ")";
    }
}
