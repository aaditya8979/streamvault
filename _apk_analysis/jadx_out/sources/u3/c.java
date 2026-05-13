package u3;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;
import s3.i;
import s3.k;

/* JADX INFO: compiled from: MintegralRtbInterstitialAd.java */
/* JADX INFO: loaded from: classes9.dex */
public class c extends t3.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s3.b f85442g;

    public c(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, s3.a aVar) {
        super(mediationInterstitialAdConfiguration, mediationAdLoadCallback, aVar);
    }

    public void a(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        String string = mediationInterstitialAdConfiguration.getServerParameters().getString("ad_unit_id");
        String string2 = mediationInterstitialAdConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        String bidResponse = mediationInterstitialAdConfiguration.getBidResponse();
        AdError adErrorH = k.h(string, string2, bidResponse);
        if (adErrorH != null) {
            this.f84626b.onFailure(adErrorH);
            return;
        }
        if (this.f84630f.a()) {
            i iVar = new i(string, string2);
            this.f84627c = iVar;
            MintegralMediationAdapter.loadedSlotIdentifiers.put(iVar, new WeakReference<>(this));
        }
        s3.b bVarA = s3.e.a();
        this.f85442g = bVarA;
        bVarA.a(mediationInterstitialAdConfiguration.getContext(), string2, string);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("watermark", mediationInterstitialAdConfiguration.getWatermark());
            this.f85442g.setExtraInfo(jSONObject);
        } catch (JSONException e10) {
            Log.w(MintegralMediationAdapter.TAG, "Failed to apply watermark to Mintegral bidding interstitial ad.", e10);
        }
        this.f85442g.b(this);
        this.f85442g.loadFromBid(bidResponse);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(@NonNull Context context) {
        this.f85442g.playVideoMute(this.f84629e ? 1 : 2);
        this.f85442g.showFromBid();
    }
}
