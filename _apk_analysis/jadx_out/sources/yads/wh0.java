package yads;

/* JADX INFO: loaded from: classes5.dex */
public final class wh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xh0 f96392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f96393b;

    public wh0(xh0 xh0Var, String str) {
        this.f96392a = xh0Var;
        this.f96393b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wh0)) {
            return false;
        }
        wh0 wh0Var = (wh0) obj;
        return this.f96392a == wh0Var.f96392a && tn.p.f(this.f96393b, wh0Var.f96393b);
    }

    public final int hashCode() {
        return this.f96393b.hashCode() + (this.f96392a.hashCode() * 31);
    }

    public final String toString() {
        return "DivKitAsset(type=" + this.f96392a + ", assetName=" + this.f96393b + ")";
    }
}
