package com.inmobi.media;

/* JADX INFO: loaded from: classes6.dex */
public final class F6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f25415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f25416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25418d;

    public F6(float f10, float f11, int i10, int i11) {
        this.f25415a = f10;
        this.f25416b = f11;
        this.f25417c = i10;
        this.f25418d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F6)) {
            return false;
        }
        F6 f62 = (F6) obj;
        return Float.compare(this.f25415a, f62.f25415a) == 0 && Float.compare(this.f25416b, f62.f25416b) == 0 && this.f25417c == f62.f25417c && this.f25418d == f62.f25418d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25418d) + AbstractC3414fi.a(this.f25417c, (Float.hashCode(this.f25416b) + (Float.hashCode(this.f25415a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "ExposureRectangle(x=" + this.f25415a + ", y=" + this.f25416b + ", width=" + this.f25417c + ", height=" + this.f25418d + ")";
    }
}
