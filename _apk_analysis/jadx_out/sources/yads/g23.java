package yads;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.view.MotionEvent;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes.dex */
public final class g23 implements GLSurfaceView.Renderer, b73, va2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ps2 f89784a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f89787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f89788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f89789f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f89790g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f89791h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i23 f89794k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f89785b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f89786c = new float[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f89792i = new float[16];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f89793j = new float[16];

    public g23(i23 i23Var, ps2 ps2Var) {
        this.f89794k = i23Var;
        float[] fArr = new float[16];
        this.f89787d = fArr;
        float[] fArr2 = new float[16];
        this.f89788e = fArr2;
        float[] fArr3 = new float[16];
        this.f89789f = fArr3;
        this.f89784a = ps2Var;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.f89791h = 3.1415927f;
    }

    @Override // yads.va2
    public final synchronized void a(float[] fArr, float f10) {
        float[] fArr2 = this.f89787d;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f11 = -f10;
        this.f89791h = f11;
        Matrix.setRotateM(this.f89788e, 0, -this.f89790g, (float) Math.cos(f11), (float) Math.sin(this.f89791h), 0.0f);
    }

    public final boolean a(MotionEvent motionEvent) {
        return this.f89794k.performClick();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        synchronized (this) {
            Matrix.multiplyMM(this.f89793j, 0, this.f89787d, 0, this.f89789f, 0);
            Matrix.multiplyMM(this.f89792i, 0, this.f89788e, 0, this.f89793j, 0);
        }
        Matrix.multiplyMM(this.f89786c, 0, this.f89785b, 0, this.f89792i, 0);
        this.f89784a.a(this.f89786c);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        GLES20.glViewport(0, 0, i10, i11);
        float f10 = i10 / i11;
        Matrix.perspectiveM(this.f89785b, 0, f10 > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f10))) * 2.0d) : 90.0f, f10, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.f89794k.b(this.f89784a.a());
    }
}
