package e;

import bp.r0;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements NativeAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f60019b;

    public x(r rVar) {
        this.f60019b = rVar;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad2) {
        this.f60019b.M.onAdClick();
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad2) {
        try {
            r rVar = this.f60019b;
            NativeBannerAd nativeBannerAd = rVar.N;
            if (nativeBannerAd != null && nativeBannerAd == ad2) {
                if (nativeBannerAd.isAdInvalidated()) {
                    this.f60019b.v("nativeAd is invalidated");
                    return;
                } else {
                    this.f60019b.L.runOnUiThread(new a0(this));
                    return;
                }
            }
            rVar.v("nativeAd is null or nativeAd != ad");
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            this.f60019b.x(e10.getMessage());
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad2, AdError adError) {
        this.f60019b.x(adError.getErrorCode() + ", " + adError.getErrorMessage());
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad2) {
        r rVar = this.f60019b;
        rVar.M.onAdShow(r0.b(ad2, rVar.f71957f));
    }

    @Override // com.facebook.ads.NativeAdListener
    public final void onMediaDownloaded(Ad ad2) {
    }
}
