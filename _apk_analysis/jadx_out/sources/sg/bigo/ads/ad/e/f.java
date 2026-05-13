package sg.bigo.ads.ad.e;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.w;

/* JADX INFO: loaded from: classes2.dex */
public class f extends sg.bigo.ads.ad.interstitial.k.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public h f80195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f80196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f80197e;

    public f(@NonNull Activity activity) {
        super(activity);
        this.f80196d = true;
        this.f80197e = false;
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void T() {
        super.T();
        T t10 = this.f81070y;
        if (t10 == 0) {
            return;
        }
        if (t10 instanceof h) {
            this.f80195c = (h) t10;
        }
        if (this.f80195c == null || !am()) {
            a("Illegal VPAID content.");
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.k.a
    public final void a() {
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton != null) {
            adCountDownButton.setShowCloseButtonInCountdown(false);
        }
        super.a();
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void ag() {
        if (this.f80196d) {
            d(true);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.q
    public final int ai() {
        return 2;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final void d(boolean z10) {
        if (this.A.getVisibility() == 0) {
            AdCountDownButton adCountDownButton = this.A;
            if (adCountDownButton.f80205c) {
                if (!this.f80197e) {
                    adCountDownButton.e();
                    h hVar = this.f80195c;
                    if (hVar != null) {
                        this.f80197e = true;
                        hVar.N();
                    }
                }
                super.d(true);
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.k.a, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public final void l() {
        super.l();
        w wVar = ((sg.bigo.ads.ad.interstitial.k.a) this).f81097a;
        if (wVar != null) {
            wVar.f81489c = 15;
            wVar.f81492f = true;
            wVar.f81493g = false;
        }
    }
}
