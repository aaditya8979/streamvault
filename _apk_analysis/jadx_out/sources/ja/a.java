package ja;

import android.view.View;
import androidx.core.view.ViewCompat;

/* JADX INFO: compiled from: ViewHelper.java */
/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public static void a(View view) {
        view.setAlpha(1.0f);
        view.setScaleY(1.0f);
        view.setScaleX(1.0f);
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        view.setRotation(0.0f);
        view.setRotationY(0.0f);
        view.setRotationX(0.0f);
        view.setPivotY(view.getMeasuredHeight() / 2);
        view.setPivotX(view.getMeasuredWidth() / 2);
        ViewCompat.animate(view).setInterpolator(null).setStartDelay(0L);
    }
}
