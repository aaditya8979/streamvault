package u7;

import android.opengl.Matrix;
import com.google.android.exoplayer2.util.GlUtil;
import s7.i0;

/* JADX INFO: compiled from: FrameRotationQueue.java */
/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f85549a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f85550b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0<float[]> f85551c = new i0<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f85552d;

    public static void a(float[] fArr, float[] fArr2) {
        GlUtil.j(fArr);
        float f10 = fArr2[10];
        float f11 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
        float f12 = fArr2[10];
        fArr[0] = f12 / fSqrt;
        float f13 = fArr2[8];
        fArr[2] = f13 / fSqrt;
        fArr[8] = (-f13) / fSqrt;
        fArr[10] = f12 / fSqrt;
    }

    public static void b(float[] fArr, float[] fArr2) {
        float f10 = fArr2[0];
        float f11 = -fArr2[1];
        float f12 = -fArr2[2];
        float length = Matrix.length(f10, f11, f12);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f10 / length, f11 / length, f12 / length);
        } else {
            GlUtil.j(fArr);
        }
    }

    public boolean c(float[] fArr, long j10) {
        float[] fArrJ = this.f85551c.j(j10);
        if (fArrJ == null) {
            return false;
        }
        b(this.f85550b, fArrJ);
        if (!this.f85552d) {
            a(this.f85549a, this.f85550b);
            this.f85552d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f85549a, 0, this.f85550b, 0);
        return true;
    }

    public void d() {
        this.f85551c.c();
        this.f85552d = false;
    }

    public void e(long j10, float[] fArr) {
        this.f85551c.a(j10, fArr);
    }
}
