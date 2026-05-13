package wb;

import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* JADX INFO: compiled from: ShapeBuilder.java */
/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GradientDrawable f86356a = new GradientDrawable();

    public static a i() {
        return new a();
    }

    public a a(GradientDrawable.Orientation orientation, int i10, int i11, int i12) {
        return b(orientation, i10, i11, i12);
    }

    public final a b(GradientDrawable.Orientation orientation, int i10, int i11, int i12) {
        this.f86356a.setOrientation(orientation);
        this.f86356a.setColors(new int[]{i10, i11, i12});
        return this;
    }

    public a c(GradientDrawable.Orientation orientation, int... iArr) {
        this.f86356a.setOrientation(orientation);
        this.f86356a.setColors(iArr);
        return this;
    }

    public a d(float f10, float f11, float f12, float f13) {
        this.f86356a.setCornerRadii(new float[]{f10, f10, f11, f11, f13, f13, f12, f12});
        return this;
    }

    public a e(int i10, int i11) {
        this.f86356a.setStroke(i10, i11);
        return this;
    }

    public a f(int i10) {
        this.f86356a.setShape(i10);
        return this;
    }

    public GradientDrawable g() {
        return this.f86356a;
    }

    public void h(View view) {
        g();
        view.setBackground(this.f86356a);
    }

    public a j(float f10) {
        this.f86356a.setCornerRadius(f10);
        return this;
    }

    public a k(int i10) {
        this.f86356a.setColor(i10);
        return this;
    }
}
