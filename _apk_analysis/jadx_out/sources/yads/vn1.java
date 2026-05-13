package yads;

import android.widget.FrameLayout;
import android.widget.ImageView;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* JADX INFO: loaded from: classes9.dex */
public final class vn1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f96139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r41 f96140b;

    public /* synthetic */ vn1(v9 v9Var) {
        this(v9Var, new r41());
    }

    public vn1(v9 v9Var, r41 r41Var) {
        this.f96139a = v9Var;
        this.f96140b = r41Var;
    }

    public final ev2 a(CustomizableMediaView customizableMediaView, mi2 mi2Var, ao1 ao1Var) {
        ImageView imageView = new ImageView(customizableMediaView.getContext());
        this.f96140b.getClass();
        if (!pr0.a(customizableMediaView.getContext(), or0.f93313e)) {
            customizableMediaView.removeAllViews();
        }
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        customizableMediaView.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        return new ev2(customizableMediaView, ao1Var, new ik3(new c51(imageView, mi2Var, this.f96139a)));
    }
}
