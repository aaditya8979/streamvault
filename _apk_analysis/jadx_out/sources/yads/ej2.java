package yads;

import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import android.widget.ProgressBar;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ej2 extends Animation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f89275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f89276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f89277c;

    public ej2(ProgressBar progressBar, int i10, int i11) {
        this.f89275a = i10;
        this.f89276b = i11;
        this.f89277c = new WeakReference(progressBar);
        setInterpolator(new LinearInterpolator());
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation transformation) {
        ProgressBar progressBar = (ProgressBar) this.f89277c.get();
        if (progressBar != null) {
            super.applyTransformation(f10, transformation);
            progressBar.setProgress(Math.round(((this.f89276b - r5) * f10) + this.f89275a));
        }
    }
}
