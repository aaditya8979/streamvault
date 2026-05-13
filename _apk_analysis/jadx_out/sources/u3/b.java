package u3;

import android.util.Log;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import org.json.JSONException;
import org.json.JSONObject;
import s3.k;

/* JADX INFO: compiled from: MintegralRtbBannerAd.java */
/* JADX INFO: loaded from: classes9.dex */
public class b extends t3.b {
    public b(@NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        super(mediationAdLoadCallback);
    }

    public void b(MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        BannerSize bannerSizeA = t3.b.a(mediationBannerAdConfiguration.getAdSize(), mediationBannerAdConfiguration.getContext(), true);
        if (bannerSizeA == null) {
            AdError adErrorA = s3.d.a(102, String.format("The requested banner size: %s is not supported by Mintegral SDK.", mediationBannerAdConfiguration.getAdSize()));
            Log.e(MintegralMediationAdapter.TAG, adErrorA.toString());
            this.f84623b.onFailure(adErrorA);
            return;
        }
        String string = mediationBannerAdConfiguration.getServerParameters().getString("ad_unit_id");
        String string2 = mediationBannerAdConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        String bidResponse = mediationBannerAdConfiguration.getBidResponse();
        AdError adErrorH = k.h(string, string2, bidResponse);
        if (adErrorH != null) {
            this.f84623b.onFailure(adErrorH);
            return;
        }
        MBBannerView mBBannerViewC = s3.e.c(mediationBannerAdConfiguration.getContext());
        this.f84624c = mBBannerViewC;
        mBBannerViewC.init(bannerSizeA, string2, string);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("watermark", mediationBannerAdConfiguration.getWatermark());
            this.f84624c.setExtraInfo(jSONObject);
        } catch (JSONException e10) {
            Log.w(MintegralMediationAdapter.TAG, "Failed to apply watermark to Mintegral bidding banner ad.", e10);
        }
        this.f84624c.setLayoutParams(new FrameLayout.LayoutParams(k.b(mediationBannerAdConfiguration.getContext(), bannerSizeA.getWidth()), k.b(mediationBannerAdConfiguration.getContext(), bannerSizeA.getHeight())));
        this.f84624c.setBannerAdListener(this);
        this.f84624c.loadFromBid(bidResponse);
    }
}
