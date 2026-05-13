package yads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes12.dex */
public final class y12 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f96971g = {wb.a(y12.class, "nativeAdView", "getNativeAdView()Landroid/view/View;", 0), wb.a(y12.class, "imageView", "getImageView()Landroid/widget/ImageView;", 0), wb.a(y12.class, "muteButtonView", "getMuteButtonView()Landroid/widget/CheckBox;", 0), wb.a(y12.class, "videoProgressView", "getVideoProgressView()Landroid/widget/ProgressBar;", 0), wb.a(y12.class, "customAssets", "getCustomAssets()Ljava/util/List;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lm2 f96972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lm2 f96973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lm2 f96974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lm2 f96975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lm2 f96976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f96977f;

    public y12(x12 x12Var) {
        this.f96972a = mm2.a(x12Var.e());
        this.f96973b = mm2.a(x12Var.c());
        this.f96974c = mm2.a(x12Var.d());
        this.f96975d = mm2.a(x12Var.f());
        this.f96976e = mm2.a(x12Var.b());
        this.f96977f = ki1.a(x12Var.a());
    }

    public final View a() {
        lm2 lm2Var = this.f96972a;
        KProperty kProperty = f96971g[0];
        return (View) lm2Var.f92035a.get();
    }

    public final View a(String str) {
        WeakReference weakReference = (WeakReference) this.f96977f.get(str);
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }
}
