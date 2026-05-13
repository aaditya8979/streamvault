package i9;

import k8.j;

/* JADX INFO: compiled from: AlignmentPattern.java */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f64011c;

    public a(float f10, float f11, float f12) {
        super(f10, f11);
        this.f64011c = f12;
    }

    public boolean f(float f10, float f11, float f12) {
        if (Math.abs(f11 - d()) > f10 || Math.abs(f12 - c()) > f10) {
            return false;
        }
        float fAbs = Math.abs(f10 - this.f64011c);
        return fAbs <= 1.0f || fAbs <= this.f64011c;
    }

    public a g(float f10, float f11, float f12) {
        return new a((c() + f11) / 2.0f, (d() + f10) / 2.0f, (this.f64011c + f12) / 2.0f);
    }
}
