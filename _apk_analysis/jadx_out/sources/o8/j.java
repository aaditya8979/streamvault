package o8;

/* JADX INFO: compiled from: PerspectiveTransform.java */
/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f76308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f76309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f76310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f76311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f76312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f76313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f76314g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f76315h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f76316i;

    public j(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f76308a = f10;
        this.f76309b = f13;
        this.f76310c = f16;
        this.f76311d = f11;
        this.f76312e = f14;
        this.f76313f = f17;
        this.f76314g = f12;
        this.f76315h = f15;
        this.f76316i = f18;
    }

    public static j b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25) {
        return d(f18, f19, f20, f21, f22, f23, f24, f25).e(c(f10, f11, f12, f13, f14, f15, f16, f17));
    }

    public static j c(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return d(f10, f11, f12, f13, f14, f15, f16, f17).a();
    }

    public static j d(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        float f18 = ((f10 - f12) + f14) - f16;
        float f19 = ((f11 - f13) + f15) - f17;
        if (f18 == 0.0f && f19 == 0.0f) {
            return new j(f12 - f10, f14 - f12, f10, f13 - f11, f15 - f13, f11, 0.0f, 0.0f, 1.0f);
        }
        float f20 = f12 - f14;
        float f21 = f16 - f14;
        float f22 = f13 - f15;
        float f23 = f17 - f15;
        float f24 = (f20 * f23) - (f21 * f22);
        float f25 = ((f23 * f18) - (f21 * f19)) / f24;
        float f26 = ((f20 * f19) - (f18 * f22)) / f24;
        return new j((f25 * f12) + (f12 - f10), (f26 * f16) + (f16 - f10), f10, (f13 - f11) + (f25 * f13), (f17 - f11) + (f26 * f17), f11, f25, f26, 1.0f);
    }

    public j a() {
        float f10 = this.f76312e;
        float f11 = this.f76316i;
        float f12 = this.f76313f;
        float f13 = this.f76315h;
        float f14 = (f10 * f11) - (f12 * f13);
        float f15 = this.f76314g;
        float f16 = this.f76311d;
        float f17 = (f12 * f15) - (f16 * f11);
        float f18 = (f16 * f13) - (f10 * f15);
        float f19 = this.f76310c;
        float f20 = this.f76309b;
        float f21 = (f19 * f13) - (f20 * f11);
        float f22 = this.f76308a;
        return new j(f14, f17, f18, f21, (f11 * f22) - (f19 * f15), (f15 * f20) - (f13 * f22), (f20 * f12) - (f19 * f10), (f19 * f16) - (f12 * f22), (f22 * f10) - (f20 * f16));
    }

    public j e(j jVar) {
        float f10 = this.f76308a;
        float f11 = jVar.f76308a;
        float f12 = this.f76311d;
        float f13 = jVar.f76309b;
        float f14 = this.f76314g;
        float f15 = jVar.f76310c;
        float f16 = (f10 * f11) + (f12 * f13) + (f14 * f15);
        float f17 = jVar.f76311d;
        float f18 = jVar.f76312e;
        float f19 = jVar.f76313f;
        float f20 = (f10 * f17) + (f12 * f18) + (f14 * f19);
        float f21 = jVar.f76314g;
        float f22 = jVar.f76315h;
        float f23 = jVar.f76316i;
        float f24 = (f10 * f21) + (f12 * f22) + (f14 * f23);
        float f25 = this.f76309b;
        float f26 = this.f76312e;
        float f27 = this.f76315h;
        float f28 = (f25 * f11) + (f26 * f13) + (f27 * f15);
        float f29 = (f25 * f17) + (f26 * f18) + (f27 * f19);
        float f30 = (f27 * f23) + (f25 * f21) + (f26 * f22);
        float f31 = this.f76310c;
        float f32 = this.f76313f;
        float f33 = (f11 * f31) + (f13 * f32);
        float f34 = this.f76316i;
        return new j(f16, f20, f24, f28, f29, f30, (f15 * f34) + f33, (f17 * f31) + (f18 * f32) + (f19 * f34), (f31 * f21) + (f32 * f22) + (f34 * f23));
    }

    public void f(float[] fArr) {
        float f10 = this.f76308a;
        float f11 = this.f76309b;
        float f12 = this.f76310c;
        float f13 = this.f76311d;
        float f14 = this.f76312e;
        float f15 = this.f76313f;
        float f16 = this.f76314g;
        float f17 = this.f76315h;
        float f18 = this.f76316i;
        int length = fArr.length - 1;
        for (int i10 = 0; i10 < length; i10 += 2) {
            float f19 = fArr[i10];
            int i11 = i10 + 1;
            float f20 = fArr[i11];
            float f21 = (f12 * f19) + (f15 * f20) + f18;
            fArr[i10] = (((f10 * f19) + (f13 * f20)) + f16) / f21;
            fArr[i11] = (((f19 * f11) + (f20 * f14)) + f17) / f21;
        }
    }
}
