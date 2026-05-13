package m3;

import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.google.ads.mediation.fyber.FyberMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;
import tn.t;

/* JADX INFO: compiled from: DTExchangeBannerAd.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a implements MediationBannerAd, InneractiveAdSpot.RequestListener, InneractiveAdViewEventsListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final C0875a f73935f = new C0875a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public static final String f73936g = t.b(a.class).getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> f73937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InneractiveAdSpot f73938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RelativeLayout f73939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public MediationBannerAdCallback f73940e;

    /* JADX INFO: renamed from: m3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DTExchangeBannerAd.kt */
    public static final class C0875a {
        public C0875a() {
        }

        public /* synthetic */ C0875a(tn.i iVar) {
            this();
        }
    }

    public a(@NotNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        p.k(mediationAdLoadCallback, "mediationAdLoadCallback");
        this.f73937b = mediationAdLoadCallback;
    }

    public final void a(@NotNull MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        p.k(mediationBannerAdConfiguration, "mediationBannerAdConfiguration");
        InneractiveAdManager.setMediationName(FyberMediationAdapter.f19816n);
        InneractiveAdManager.setMediationVersion(MobileAds.getVersion().toString());
        String bidResponse = mediationBannerAdConfiguration.getBidResponse();
        p.j(bidResponse, "getBidResponse(...)");
        this.f73938c = InneractiveAdSpotManager.get().createSpot();
        InneractiveAdViewUnitController inneractiveAdViewUnitController = new InneractiveAdViewUnitController();
        InneractiveAdSpot inneractiveAdSpot = this.f73938c;
        InneractiveAdSpot inneractiveAdSpot2 = null;
        if (inneractiveAdSpot == null) {
            p.C("adSpot");
            inneractiveAdSpot = null;
        }
        inneractiveAdSpot.addUnitController(inneractiveAdViewUnitController);
        this.f73939d = new RelativeLayout(mediationBannerAdConfiguration.getContext());
        InneractiveAdSpot inneractiveAdSpot3 = this.f73938c;
        if (inneractiveAdSpot3 == null) {
            p.C("adSpot");
            inneractiveAdSpot3 = null;
        }
        inneractiveAdSpot3.setRequestListener(this);
        inneractiveAdViewUnitController.setEventsListener(this);
        e.c(mediationBannerAdConfiguration.getMediationExtras());
        InneractiveAdSpot inneractiveAdSpot4 = this.f73938c;
        if (inneractiveAdSpot4 == null) {
            p.C("adSpot");
        } else {
            inneractiveAdSpot2 = inneractiveAdSpot4;
        }
        inneractiveAdSpot2.loadAd(bidResponse);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    @NotNull
    public View getView() {
        RelativeLayout relativeLayout = this.f73939d;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        p.C("wrapperView");
        return null;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdClicked(@Nullable InneractiveAdSpot inneractiveAdSpot) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f73940e;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
    public void onAdCollapsed(@Nullable InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdEnteredErrorState(@Nullable InneractiveAdSpot inneractiveAdSpot, @Nullable InneractiveUnitController.AdDisplayError adDisplayError) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
    public void onAdExpanded(@Nullable InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdImpression(@Nullable InneractiveAdSpot inneractiveAdSpot) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f73940e;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
    public void onAdResized(@Nullable InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillCloseInternalBrowser(@Nullable InneractiveAdSpot inneractiveAdSpot) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f73940e;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdClosed();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillOpenExternalApp(@Nullable InneractiveAdSpot inneractiveAdSpot) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f73940e;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
            mediationBannerAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public void onInneractiveFailedAdRequest(@Nullable InneractiveAdSpot inneractiveAdSpot, @NotNull InneractiveErrorCode inneractiveErrorCode) {
        p.k(inneractiveErrorCode, IronSourceConstants.EVENTS_ERROR_CODE);
        this.f73937b.onFailure(b.a(inneractiveErrorCode));
        if (inneractiveAdSpot != null) {
            inneractiveAdSpot.destroy();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public void onInneractiveSuccessfulAdRequest(@Nullable InneractiveAdSpot inneractiveAdSpot) {
        InneractiveAdSpot inneractiveAdSpot2 = this.f73938c;
        RelativeLayout relativeLayout = null;
        InneractiveAdSpot inneractiveAdSpot3 = null;
        InneractiveAdSpot inneractiveAdSpot4 = null;
        if (inneractiveAdSpot2 == null) {
            p.C("adSpot");
            inneractiveAdSpot2 = null;
        }
        if (!inneractiveAdSpot2.isReady()) {
            AdError adError = new AdError(106, "DT Exchange's banner ad spot is not ready.", "com.google.ads.mediation.dtexchange");
            Log.w(f73936g, adError.getMessage());
            this.f73937b.onFailure(adError);
            InneractiveAdSpot inneractiveAdSpot5 = this.f73938c;
            if (inneractiveAdSpot5 == null) {
                p.C("adSpot");
            } else {
                inneractiveAdSpot3 = inneractiveAdSpot5;
            }
            inneractiveAdSpot3.destroy();
            return;
        }
        InneractiveAdSpot inneractiveAdSpot6 = this.f73938c;
        if (inneractiveAdSpot6 == null) {
            p.C("adSpot");
            inneractiveAdSpot6 = null;
        }
        InneractiveUnitController selectedUnitController = inneractiveAdSpot6.getSelectedUnitController();
        InneractiveAdViewUnitController inneractiveAdViewUnitController = selectedUnitController instanceof InneractiveAdViewUnitController ? (InneractiveAdViewUnitController) selectedUnitController : null;
        if (inneractiveAdViewUnitController != null) {
            RelativeLayout relativeLayout2 = this.f73939d;
            if (relativeLayout2 == null) {
                p.C("wrapperView");
            } else {
                relativeLayout = relativeLayout2;
            }
            inneractiveAdViewUnitController.bindView(relativeLayout);
            this.f73940e = this.f73937b.onSuccess(this);
            return;
        }
        AdError adError2 = new AdError(105, "Unexpected controller type.", "com.google.ads.mediation.dtexchange");
        Log.w(f73936g, adError2.getMessage());
        this.f73937b.onFailure(adError2);
        InneractiveAdSpot inneractiveAdSpot7 = this.f73938c;
        if (inneractiveAdSpot7 == null) {
            p.C("adSpot");
        } else {
            inneractiveAdSpot4 = inneractiveAdSpot7;
        }
        inneractiveAdSpot4.destroy();
    }
}
