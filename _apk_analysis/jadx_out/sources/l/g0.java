package l;

import bp.r0;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.BaseAd;
import com.vungle.ads.NativeAd;
import com.vungle.ads.NativeAdListener;
import com.vungle.ads.VungleError;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 implements NativeAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f73598b;

    public g0(z zVar) {
        this.f73598b = zVar;
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdClicked(BaseAd baseAd) {
        this.f73598b.C.onAdClick();
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdEnd(BaseAd baseAd) {
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
        this.f73598b.x(vungleError.getMessage() + ", " + vungleError.getErrorMessage() + ", " + vungleError.getLocalizedMessage());
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
        this.f73598b.x(vungleError.getMessage() + ", " + vungleError.getErrorMessage() + ", " + vungleError.getLocalizedMessage());
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdImpression(BaseAd baseAd) {
        z zVar = this.f73598b;
        zVar.C.onAdShow(r0.b(null, zVar.f71957f));
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdLeftApplication(BaseAd baseAd) {
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdLoaded(BaseAd baseAd) {
        int i10;
        int i11;
        if (baseAd == null || !baseAd.canPlayAd().booleanValue()) {
            this.f73598b.v("");
            return;
        }
        try {
            z zVar = this.f73598b;
            i.e eVar = zVar.f71962k;
            if (eVar == null || (i10 = eVar.f63662d) == 0) {
                i10 = IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW;
            }
            int i12 = i10;
            if (eVar == null || (i11 = eVar.f63663e) == 0) {
                i11 = 465;
            }
            d.i iVar = new d.i(zVar.B, (NativeAd) baseAd, i12, i11, zVar.D, zVar.E);
            bp.h.a(iVar.f59496a);
            this.f73598b.C.onAdLoaded(iVar.f59496a);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            this.f73598b.q(e10);
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdStart(BaseAd baseAd) {
    }
}
