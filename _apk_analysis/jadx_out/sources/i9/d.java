package i9;

import k8.j;

/* JADX INFO: compiled from: FinderPattern.java */
/* JADX INFO: loaded from: classes6.dex */
public final class d extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f64023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f64024d;

    public d(float f10, float f11, float f12) {
        this(f10, f11, f12, 1);
    }

    public d(float f10, float f11, float f12, int i10) {
        super(f10, f11);
        this.f64023c = f12;
        this.f64024d = i10;
    }

    public boolean f(float f10, float f11, float f12) {
        if (Math.abs(f11 - d()) > f10 || Math.abs(f12 - c()) > f10) {
            return false;
        }
        float fAbs = Math.abs(f10 - this.f64023c);
        return fAbs <= 1.0f || fAbs <= this.f64023c;
    }

    public d g(float f10, float f11, float f12) {
        int i10 = this.f64024d;
        int i11 = i10 + 1;
        float fC = (i10 * c()) + f11;
        float f13 = i11;
        return new d(fC / f13, ((this.f64024d * d()) + f10) / f13, ((this.f64024d * this.f64023c) + f12) / f13, i11);
    }

    public int h() {
        return this.f64024d;
    }

    public float i() {
        return this.f64023c;
    }
}
