package l3;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;
import com.facebook.ads.ExtraHints;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import k3.e;

/* JADX INFO: compiled from: FacebookRtbBannerAd.java */
/* JADX INFO: loaded from: classes10.dex */
public class a implements MediationBannerAd, AdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationBannerAdConfiguration f73639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> f73640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AdView f73641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FrameLayout f73642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MediationBannerAdCallback f73643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f73644g;

    public a(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, e eVar) {
        this.f73639b = mediationBannerAdConfiguration;
        this.f73640c = mediationAdLoadCallback;
        this.f73644g = eVar;
    }

    public void a() {
        String placementID = FacebookMediationAdapter.getPlacementID(this.f73639b.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
            this.f73640c.onFailure(adError);
            return;
        }
        FacebookMediationAdapter.setMixedAudience(this.f73639b);
        try {
            this.f73641d = this.f73644g.c(this.f73639b.getContext(), placementID, this.f73639b.getBidResponse());
            if (!TextUtils.isEmpty(this.f73639b.getWatermark())) {
                this.f73641d.setExtraHints(new ExtraHints.Builder().mediationData(this.f73639b.getWatermark()).build());
            }
            Context context = this.f73639b.getContext();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f73639b.getAdSize().getWidthInPixels(context), -2);
            this.f73642e = new FrameLayout(context);
            this.f73641d.setLayoutParams(layoutParams);
            this.f73642e.addView(this.f73641d);
            AdView adView = this.f73641d;
            adView.loadAd(adView.buildLoadAdConfig().withAdListener(this).withBid(this.f73639b.getBidResponse()).build());
        } catch (Exception e10) {
            AdError adError2 = new AdError(111, "Failed to create banner ad: " + e10.getMessage(), FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, adError2.getMessage());
            this.f73640c.onFailure(adError2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    @NonNull
    public View getView() {
        return this.f73642e;
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad2) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f73643f;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
            this.f73643f.onAdOpened();
            this.f73643f.onAdLeftApplication();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad2) {
        this.f73643f = this.f73640c.onSuccess(this);
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad2, com.facebook.ads.AdError adError) {
        AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
        this.f73640c.onFailure(adError2);
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad2) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f73643f;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }
}
