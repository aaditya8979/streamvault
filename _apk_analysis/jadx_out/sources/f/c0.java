package f;

import bp.r0;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdListener;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements NativeAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f61369b;

    public c0(f fVar) {
        this.f61369b = fVar;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad2) {
        this.f61369b.E.onAdClick();
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad2) {
        try {
            f fVar = this.f61369b;
            NativeAd nativeAd = fVar.F;
            if (nativeAd != null && nativeAd == ad2) {
                if (nativeAd.isAdInvalidated()) {
                    this.f61369b.v("nativeAd is invalidated");
                    return;
                } else {
                    this.f61369b.D.runOnUiThread(new n(this));
                    return;
                }
            }
            fVar.v("nativeAd is null or nativeAd != ad");
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            this.f61369b.x(e10.getMessage());
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad2, AdError adError) {
        this.f61369b.x(adError.getErrorCode() + ", " + adError.getErrorMessage());
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad2) {
        f fVar = this.f61369b;
        fVar.E.onAdShow(r0.b(ad2, fVar.f71957f));
    }

    @Override // com.facebook.ads.NativeAdListener
    public final void onMediaDownloaded(Ad ad2) {
    }
}
