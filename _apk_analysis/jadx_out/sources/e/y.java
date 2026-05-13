package e;

import bp.r0;
import com.vungle.ads.BaseAd;
import com.vungle.ads.NativeAd;
import com.vungle.ads.NativeAdListener;
import com.vungle.ads.VungleError;
import com.yk.e.util.AdLog;
import com.yk.e.util.IDUtil;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements NativeAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f60020b;

    public y(u uVar) {
        this.f60020b = uVar;
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdClicked(BaseAd baseAd) {
        this.f60020b.M.onAdClick();
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdEnd(BaseAd baseAd) {
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
        this.f60020b.v(vungleError.getMessage() + ", " + vungleError.getErrorMessage() + ", " + vungleError.getLocalizedMessage());
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
        this.f60020b.v(vungleError.getMessage() + ", " + vungleError.getErrorMessage() + ", " + vungleError.getLocalizedMessage());
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdImpression(BaseAd baseAd) {
        u uVar = this.f60020b;
        uVar.M.onAdShow(r0.b(null, uVar.f71957f));
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdLeftApplication(BaseAd baseAd) {
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdLoaded(BaseAd baseAd) {
        if (baseAd == null || !baseAd.canPlayAd().booleanValue()) {
            this.f60020b.v("");
            return;
        }
        try {
            int dimensionPixelOffset = this.f60020b.L.getResources().getDimensionPixelOffset(IDUtil.getDimen(this.f60020b.L, "dp_135"));
            d.i iVar = new d.i(this.f60020b.L, (NativeAd) baseAd, -1, dimensionPixelOffset, -1, dimensionPixelOffset);
            bp.h.a(iVar.f59496a);
            this.f60020b.M.onAdLoaded(iVar.f59496a);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            this.f60020b.v("");
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdStart(BaseAd baseAd) {
    }
}
