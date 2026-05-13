package yads;

import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.div.core.view2.Div2View;

/* JADX INFO: loaded from: classes11.dex */
public final class st0 implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hi2 f94925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oh0 f94926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final io2 f94927c;

    public st0(hi2 hi2Var, oh0 oh0Var, at1 at1Var) {
        this.f94925a = hi2Var;
        this.f94926b = oh0Var;
        this.f94927c = at1Var;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        ExtendedNativeAdView extendedNativeAdView = (ExtendedNativeAdView) viewGroup;
        try {
            extendedNativeAdView.removeAllViews();
            Div2View div2View = this.f94925a.f90430b;
            nk3.a(div2View);
            wg0.a(div2View).a(this.f94926b);
            extendedNativeAdView.addView(div2View);
        } catch (Throwable th2) {
            boolean z10 = ad1.f87661a;
            this.f94927c.reportError("Failed to bind DivKit Feed Preloaded Ad", th2);
        }
    }

    @Override // yads.zf0
    public final void c() {
        Div2View div2View = this.f94925a.f90430b;
        wg0.a(div2View).a(null);
        nk3.a(div2View);
    }
}
