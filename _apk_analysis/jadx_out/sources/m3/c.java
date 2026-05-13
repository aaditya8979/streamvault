package m3;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.google.ads.mediation.fyber.FyberMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;
import tn.t;

/* JADX INFO: compiled from: DTExchangeInterstitialAd.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class c implements MediationInterstitialAd, InneractiveAdSpot.RequestListener, InneractiveFullscreenAdEventsListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f73942e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public static final String f73943f = t.b(c.class).getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> f73944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InneractiveAdSpot f73945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public MediationInterstitialAdCallback f73946d;

    /* JADX INFO: compiled from: DTExchangeInterstitialAd.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public c(@NotNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        p.k(mediationAdLoadCallback, "mediationAdLoadCallback");
        this.f73944b = mediationAdLoadCallback;
    }

    public final void a(@NotNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        p.k(mediationInterstitialAdConfiguration, "mediationInterstitialAdConfiguration");
        InneractiveAdManager.setMediationName(FyberMediationAdapter.f19816n);
        InneractiveAdManager.setMediationVersion(MobileAds.getVersion().toString());
        String bidResponse = mediationInterstitialAdConfiguration.getBidResponse();
        p.j(bidResponse, "getBidResponse(...)");
        this.f73945c = InneractiveAdSpotManager.get().createSpot();
        InneractiveFullscreenUnitController inneractiveFullscreenUnitController = new InneractiveFullscreenUnitController();
        InneractiveAdSpot inneractiveAdSpot = this.f73945c;
        InneractiveAdSpot inneractiveAdSpot2 = null;
        if (inneractiveAdSpot == null) {
            p.C("adSpot");
            inneractiveAdSpot = null;
        }
        inneractiveAdSpot.addUnitController(inneractiveFullscreenUnitController);
        InneractiveAdSpot inneractiveAdSpot3 = this.f73945c;
        if (inneractiveAdSpot3 == null) {
            p.C("adSpot");
            inneractiveAdSpot3 = null;
        }
        inneractiveAdSpot3.setRequestListener(this);
        inneractiveFullscreenUnitController.setEventsListener(this);
        e.c(mediationInterstitialAdConfiguration.getMediationExtras());
        InneractiveAdSpot inneractiveAdSpot4 = this.f73945c;
        if (inneractiveAdSpot4 == null) {
            p.C("adSpot");
        } else {
            inneractiveAdSpot2 = inneractiveAdSpot4;
        }
        inneractiveAdSpot2.loadAd(bidResponse);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdClicked(@Nullable InneractiveAdSpot inneractiveAdSpot) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f73946d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener
    public void onAdDismissed(@Nullable InneractiveAdSpot inneractiveAdSpot) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f73946d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdEnteredErrorState(@Nullable InneractiveAdSpot inneractiveAdSpot, @Nullable InneractiveUnitController.AdDisplayError adDisplayError) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdImpression(@Nullable InneractiveAdSpot inneractiveAdSpot) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f73946d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
        MediationInterstitialAdCallback mediationInterstitialAdCallback2 = this.f73946d;
        if (mediationInterstitialAdCallback2 != null) {
            mediationInterstitialAdCallback2.reportAdImpression();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillCloseInternalBrowser(@Nullable InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillOpenExternalApp(@Nullable InneractiveAdSpot inneractiveAdSpot) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f73946d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public void onInneractiveFailedAdRequest(@Nullable InneractiveAdSpot inneractiveAdSpot, @NotNull InneractiveErrorCode inneractiveErrorCode) {
        p.k(inneractiveErrorCode, IronSourceConstants.EVENTS_ERROR_CODE);
        this.f73944b.onFailure(b.a(inneractiveErrorCode));
        if (inneractiveAdSpot != null) {
            inneractiveAdSpot.destroy();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public void onInneractiveSuccessfulAdRequest(@Nullable InneractiveAdSpot inneractiveAdSpot) {
        InneractiveAdSpot inneractiveAdSpot2 = this.f73945c;
        InneractiveAdSpot inneractiveAdSpot3 = null;
        if (inneractiveAdSpot2 == null) {
            p.C("adSpot");
            inneractiveAdSpot2 = null;
        }
        if (inneractiveAdSpot2.isReady()) {
            this.f73946d = this.f73944b.onSuccess(this);
            return;
        }
        AdError adError = new AdError(106, "DT Exchange's interstitial ad spot is not ready.", "com.google.ads.mediation.dtexchange");
        Log.w(f73943f, adError.getMessage());
        this.f73944b.onFailure(adError);
        InneractiveAdSpot inneractiveAdSpot4 = this.f73945c;
        if (inneractiveAdSpot4 == null) {
            p.C("adSpot");
        } else {
            inneractiveAdSpot3 = inneractiveAdSpot4;
        }
        inneractiveAdSpot3.destroy();
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        InneractiveAdSpot inneractiveAdSpot = this.f73945c;
        InneractiveAdSpot inneractiveAdSpot2 = null;
        if (inneractiveAdSpot == null) {
            p.C("adSpot");
            inneractiveAdSpot = null;
        }
        InneractiveUnitController selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
        InneractiveFullscreenUnitController inneractiveFullscreenUnitController = selectedUnitController instanceof InneractiveFullscreenUnitController ? (InneractiveFullscreenUnitController) selectedUnitController : null;
        if (inneractiveFullscreenUnitController != null) {
            inneractiveFullscreenUnitController.show((Activity) context);
            return;
        }
        Log.w(f73943f, "showInterstitial called, but wrong spot has been used (should not happen).");
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f73946d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
        MediationInterstitialAdCallback mediationInterstitialAdCallback2 = this.f73946d;
        if (mediationInterstitialAdCallback2 != null) {
            mediationInterstitialAdCallback2.onAdClosed();
        }
        InneractiveAdSpot inneractiveAdSpot3 = this.f73945c;
        if (inneractiveAdSpot3 == null) {
            p.C("adSpot");
        } else {
            inneractiveAdSpot2 = inneractiveAdSpot3;
        }
        inneractiveAdSpot2.destroy();
    }
}
