package yads;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.yandex.mobile.ads.R$drawable;
import yads.tu0;

/* JADX INFO: loaded from: classes2.dex */
public final class tu0 extends hk3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w31 f95355c;

    public tu0(ImageView imageView, w31 w31Var) {
        super(imageView);
        this.f95355c = w31Var;
    }

    public static final void a(tu0 tu0Var, Drawable drawable) {
        if (drawable != null) {
            ImageView imageView = (ImageView) tu0Var.b();
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
                return;
            }
            return;
        }
        ImageView imageView2 = (ImageView) tu0Var.b();
        if (imageView2 != null) {
            imageView2.setImageDrawable(ContextCompat.getDrawable(imageView2.getContext(), R$drawable.monetization_ads_internal_default_adtune_feedback_icon));
        }
    }

    public final void a(u41 u41Var) {
        this.f95355c.a(u41Var, new t31() { // from class: bt.ra
            @Override // yads.t31
            public final void a(Drawable drawable) {
                tu0.a(this.f6266a, drawable);
            }
        });
    }

    @Override // yads.hk3
    public final /* bridge */ /* synthetic */ boolean a(View view, Object obj) {
        return true;
    }

    @Override // yads.hk3
    public final void b(View view, Object obj) {
        ImageView imageView = (ImageView) view;
        u41 u41Var = ((qu0) obj).f94153a;
        if (u41Var == null) {
            return;
        }
        imageView.setForeground(null);
        imageView.setBackground(null);
        a(u41Var);
    }
}
