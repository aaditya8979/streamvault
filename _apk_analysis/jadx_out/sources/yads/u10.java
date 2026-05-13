package yads;

import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: classes10.dex */
public final class u10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f95475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f95476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f95477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f95478d;

    public /* synthetic */ u10(View view, float f10, float f11, float f12, float f13) {
        this(view, f10, f11, f12, f13, new RectF(), new Path());
    }

    public u10(View view, float f10, float f11, float f12, float f13, RectF rectF, Path path) {
        this.f95475a = view;
        this.f95476b = rectF;
        this.f95477c = path;
        this.f95478d = a(f10, f11, f12, f13);
    }

    public static float[] a(float f10, float f11, float f12, float f13) {
        if (f10 > 0.0f || f11 > 0.0f || f12 > 0.0f || f13 > 0.0f) {
            return new float[]{f10, f10, f11, f11, f12, f12, f13, f13};
        }
        return null;
    }

    public final void a() {
        if (this.f95478d != null) {
            int measuredWidth = this.f95475a.getMeasuredWidth();
            int measuredHeight = this.f95475a.getMeasuredHeight();
            int paddingLeft = this.f95475a.getPaddingLeft();
            int paddingTop = this.f95475a.getPaddingTop();
            int paddingRight = measuredWidth - this.f95475a.getPaddingRight();
            int paddingBottom = measuredHeight - this.f95475a.getPaddingBottom();
            if (paddingLeft >= paddingRight || paddingTop >= paddingBottom) {
                return;
            }
            this.f95476b.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
            this.f95477c.reset();
            this.f95477c.addRoundRect(this.f95476b, this.f95478d, Path.Direction.CW);
        }
    }
}
