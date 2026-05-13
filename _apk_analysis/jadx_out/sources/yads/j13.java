package yads;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class j13 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m13 f91073a = new m13();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bm f91074b = new bm();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bp f91075c = new bp();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l13 f91076d;

    public final void a(Drawable drawable, ImageView imageView, u41 u41Var) {
        l13 l13Var = new l13(this.f91074b, this.f91075c, this.f91073a, u41Var, drawable);
        this.f91076d = l13Var;
        imageView.addOnLayoutChangeListener(l13Var);
        if (imageView.getLayoutParams().width == -1 || imageView.getLayoutParams().height == -1 || imageView.getLayoutParams().width == -2 || imageView.getLayoutParams().height == -2) {
            imageView.setImageDrawable(drawable);
        }
    }

    public final void a(ImageView imageView) {
        imageView.removeOnLayoutChangeListener(this.f91076d);
    }
}
