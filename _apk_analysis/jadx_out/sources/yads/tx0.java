package yads;

import android.opengl.Matrix;

/* JADX INFO: loaded from: classes2.dex */
public final class tx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f95413a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f95414b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n63 f95415c = new n63();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f95416d;

    public static void a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f10 = fArr2[10];
        float f11 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        float f12 = fArr2[10] / fSqrt;
        fArr[0] = f12;
        float f13 = fArr2[8];
        fArr[2] = f13 / fSqrt;
        fArr[8] = (-f13) / fSqrt;
        fArr[10] = f12;
    }

    public final void a(long j10, float[] fArr) {
        Object objA;
        n63 n63Var = this.f95415c;
        synchronized (n63Var) {
            objA = n63Var.a(j10, true);
        }
        float[] fArr2 = (float[]) objA;
        if (fArr2 == null) {
            return;
        }
        float[] fArr3 = this.f95414b;
        float f10 = fArr2[0];
        float f11 = -fArr2[1];
        float f12 = -fArr2[2];
        float length = Matrix.length(f10, f11, f12);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr3, 0, (float) Math.toDegrees(length), f10 / length, f11 / length, f12 / length);
        } else {
            Matrix.setIdentityM(fArr3, 0);
        }
        if (!this.f95416d) {
            a(this.f95413a, this.f95414b);
            this.f95416d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f95413a, 0, this.f95414b, 0);
    }
}
