package yads;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.ProgressBar;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes10.dex */
public final class fj2 implements t31 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f89593c = {wb.a(fj2.class, "preview", "getPreview()Landroid/widget/ImageView;", 0), wb.a(fj2.class, "progressBar", "getProgressBar()Landroid/widget/ProgressBar;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lm2 f89594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lm2 f89595b;

    public fj2(ImageView imageView, ProgressBar progressBar) {
        this.f89594a = mm2.a(imageView);
        this.f89595b = mm2.a(progressBar);
    }

    @Override // yads.t31
    public final void a(Drawable drawable) {
        if (drawable == null) {
            lm2 lm2Var = this.f89595b;
            KProperty kProperty = f89593c[1];
            ProgressBar progressBar = (ProgressBar) lm2Var.f92035a.get();
            if (progressBar != null) {
                progressBar.setVisibility(0);
                return;
            }
            return;
        }
        lm2 lm2Var2 = this.f89594a;
        KProperty[] kPropertyArr = f89593c;
        KProperty kProperty2 = kPropertyArr[0];
        ImageView imageView = (ImageView) lm2Var2.f92035a.get();
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
            return;
        }
        lm2 lm2Var3 = this.f89595b;
        KProperty kProperty3 = kPropertyArr[1];
        ProgressBar progressBar2 = (ProgressBar) lm2Var3.f92035a.get();
        if (progressBar2 != null) {
            progressBar2.setVisibility(0);
        }
    }
}
