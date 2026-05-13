package yads;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: loaded from: classes2.dex */
public final class ly implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y00 f92172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f92173b;

    public ly(y00 y00Var, int i10) {
        this.f92172a = y00Var;
        this.f92173b = i10;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        ExtendedNativeAdView extendedNativeAdView = (ExtendedNativeAdView) viewGroup;
        y00 y00Var = this.f92172a;
        ny nyVar = new ny(y00Var, this.f92173b, new gy1());
        ImageView imageViewA = nyVar.a(extendedNativeAdView, my.f92634b, y00Var.f96948b);
        ImageView imageViewA2 = nyVar.a(extendedNativeAdView, my.f92635c, y00Var.f96949c);
        if (imageViewA != null) {
            imageViewA.setId(R$id.favicon);
        }
        if (imageViewA2 != null) {
            imageViewA2.setId(R$id.icon);
        }
    }

    @Override // yads.zf0
    public final void c() {
    }
}
