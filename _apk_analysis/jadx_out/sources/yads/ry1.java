package yads;

/* JADX INFO: loaded from: classes6.dex */
public final class ry1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d12 f94647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9 f94648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d4 f94649c;

    public ry1(v9 v9Var, d4 d4Var, d12 d12Var) {
        this.f94647a = d12Var;
        this.f94648b = v9Var;
        this.f94649c = d4Var;
    }

    public final d4 a() {
        return this.f94649c;
    }

    public final v9 b() {
        return this.f94648b;
    }

    public final d12 c() {
        return this.f94647a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ry1)) {
            return false;
        }
        ry1 ry1Var = (ry1) obj;
        return tn.p.f(this.f94647a, ry1Var.f94647a) && tn.p.f(this.f94648b, ry1Var.f94648b) && tn.p.f(this.f94649c, ry1Var.f94649c);
    }

    public final int hashCode() {
        return this.f94649c.hashCode() + ((this.f94648b.hashCode() + (this.f94647a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "NativeAdBlock(nativeAdResponse=" + this.f94647a + ", adResponse=" + this.f94648b + ", adConfiguration=" + this.f94649c + ")";
    }
}
