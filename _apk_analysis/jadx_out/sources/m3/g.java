package m3;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.google.ads.mediation.fyber.FyberMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;

/* JADX INFO: compiled from: FyberRewardedVideoRenderer.java */
/* JADX INFO: loaded from: classes11.dex */
public class g implements MediationRewardedAd, InneractiveAdSpot.RequestListener, InneractiveFullscreenAdEventsListener, InneractiveFullScreenAdRewardedListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> f73958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MediationRewardedAdCallback f73959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InneractiveAdSpot f73960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InneractiveFullscreenUnitController f73961e;

    public g(MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.f73958b = mediationAdLoadCallback;
    }

    public final void a(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        this.f73960d = f.d();
        InneractiveFullscreenUnitController inneractiveFullscreenUnitControllerA = f.a();
        this.f73961e = inneractiveFullscreenUnitControllerA;
        this.f73960d.addUnitController(inneractiveFullscreenUnitControllerA);
        this.f73960d.setRequestListener(this);
        e.c(mediationRewardedAdConfiguration.getMediationExtras());
    }

    public final boolean b(InneractiveFullscreenUnitController inneractiveFullscreenUnitController) {
        return (inneractiveFullscreenUnitController == null || inneractiveFullscreenUnitController.getSelectedContentController() == null || !(inneractiveFullscreenUnitController.getSelectedContentController() instanceof InneractiveFullscreenVideoContentController)) ? false : true;
    }

    public void c(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        String bidResponse = mediationRewardedAdConfiguration.getBidResponse();
        a(mediationRewardedAdConfiguration);
        this.f73960d.loadAd(bidResponse);
    }

    public void d(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        String string = mediationRewardedAdConfiguration.getServerParameters().getString("spotId");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Spot ID is null or empty.", "com.google.ads.mediation.dtexchange");
            Log.w(FyberMediationAdapter.f19815m, adError.getMessage());
            this.f73958b.onFailure(adError);
        } else {
            a(mediationRewardedAdConfiguration);
            this.f73960d.requestAd(new InneractiveAdRequest(string));
        }
    }

    public final void e() {
        this.f73961e.setEventsListener(this);
        this.f73961e.setRewardedListener(this);
        this.f73961e.addContentController(new InneractiveFullscreenVideoContentController());
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdClicked(@NonNull InneractiveAdSpot inneractiveAdSpot) {
        this.f73959c.reportAdClicked();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener
    public void onAdDismissed(@NonNull InneractiveAdSpot inneractiveAdSpot) {
        this.f73959c.onAdClosed();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdEnteredErrorState(@NonNull InneractiveAdSpot inneractiveAdSpot, @NonNull InneractiveUnitController.AdDisplayError adDisplayError) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdImpression(@NonNull InneractiveAdSpot inneractiveAdSpot) {
        this.f73959c.onAdOpened();
        if (b(this.f73961e)) {
            this.f73959c.onVideoStart();
        }
        this.f73959c.reportAdImpression();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener
    public void onAdRewarded(@NonNull InneractiveAdSpot inneractiveAdSpot) {
        this.f73959c.onUserEarnedReward();
        this.f73959c.onVideoComplete();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillCloseInternalBrowser(@NonNull InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillOpenExternalApp(@NonNull InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public void onInneractiveFailedAdRequest(@NonNull InneractiveAdSpot inneractiveAdSpot, @NonNull InneractiveErrorCode inneractiveErrorCode) {
        AdError adErrorA = b.a(inneractiveErrorCode);
        Log.w(FyberMediationAdapter.f19815m, adErrorA.getMessage());
        this.f73958b.onFailure(adErrorA);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public void onInneractiveSuccessfulAdRequest(@NonNull InneractiveAdSpot inneractiveAdSpot) {
        this.f73959c = this.f73958b.onSuccess(this);
        e();
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(@NonNull Context context) {
        if (!(context instanceof Activity)) {
            AdError adError = new AdError(107, "Cannot show a rewarded ad without an activity context.", "com.google.ads.mediation.dtexchange");
            Log.w(FyberMediationAdapter.f19815m, adError.getMessage());
            MediationRewardedAdCallback mediationRewardedAdCallback = this.f73959c;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onAdFailedToShow(adError);
                return;
            }
            return;
        }
        InneractiveAdSpot inneractiveAdSpot = this.f73960d;
        if (inneractiveAdSpot != null && this.f73961e != null && inneractiveAdSpot.isReady()) {
            this.f73961e.show((Activity) context);
        } else if (this.f73959c != null) {
            AdError adError2 = new AdError(106, "DT Exchange's rewarded spot is not ready.", "com.google.ads.mediation.dtexchange");
            Log.w(FyberMediationAdapter.f19815m, adError2.getMessage());
            this.f73959c.onAdFailedToShow(adError2);
        }
    }
}
