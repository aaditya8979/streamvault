package com.inmobi.media;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: com.inmobi.media.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3796v1 extends Animation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f28313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f28314c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Camera f28316e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f28312a = 90.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f28315d = true;

    public C3796v1(float f10, float f11) {
        this.f28313b = f10;
        this.f28314c = f11;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation transformation) {
        tn.p.k(transformation, "t");
        float f11 = ((this.f28312a - 0.0f) * f10) + 0.0f;
        float f12 = this.f28313b;
        float f13 = this.f28314c;
        Camera camera = this.f28316e;
        Matrix matrix = transformation.getMatrix();
        if (camera != null) {
            camera.save();
            if (this.f28315d) {
                camera.translate(0.0f, 0.0f, f10 * 0.0f);
            } else {
                camera.translate(0.0f, 0.0f, (1.0f - f10) * 0.0f);
            }
            camera.rotateY(f11);
            camera.getMatrix(matrix);
            camera.restore();
        }
        matrix.preTranslate(-f12, -f13);
        matrix.postTranslate(f12, f13);
    }

    @Override // android.view.animation.Animation
    public final void initialize(int i10, int i11, int i12, int i13) {
        super.initialize(i10, i11, i12, i13);
        this.f28316e = new Camera();
    }
}
