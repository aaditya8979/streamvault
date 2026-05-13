package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class vg0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final vg0 f96084g = new vg0(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f96085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f96086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f96087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f96088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f96089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f96090f;

    public vg0(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f96085a = f10;
        this.f96086b = f11;
        this.f96087c = f12;
        this.f96088d = f13;
        this.f96089e = f14;
        this.f96090f = f15;
    }

    public final float a() {
        return this.f96088d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vg0)) {
            return false;
        }
        vg0 vg0Var = (vg0) obj;
        return Float.compare(this.f96085a, vg0Var.f96085a) == 0 && Float.compare(this.f96086b, vg0Var.f96086b) == 0 && Float.compare(this.f96087c, vg0Var.f96087c) == 0 && Float.compare(this.f96088d, vg0Var.f96088d) == 0 && Float.compare(this.f96089e, vg0Var.f96089e) == 0 && Float.compare(this.f96090f, vg0Var.f96090f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f96090f) + ((Float.hashCode(this.f96089e) + ((Float.hashCode(this.f96088d) + ((Float.hashCode(this.f96087c) + ((Float.hashCode(this.f96086b) + (Float.hashCode(this.f96085a) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DisplayInsetsF(left=" + this.f96085a + ", top=" + this.f96086b + ", right=" + this.f96087c + ", bottom=" + this.f96088d + ", cutoutTop=" + this.f96089e + ", cutoutBottom=" + this.f96090f + ")";
    }
}
