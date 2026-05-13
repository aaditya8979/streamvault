package com.google.ads.mediation.fyber;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fyber.inneractive.sdk.external.BidTokenProvider;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerAdapter;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class FyberMediationAdapter extends RtbAdapter implements MediationBannerAdapter, MediationInterstitialAdapter {
    public static final String KEY_MUTE_VIDEO = "muteVideo";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f19815m = "FyberMediationAdapter";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final InneractiveMediationName f19816n = InneractiveMediationName.ADMOB;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AdSize f19817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InneractiveAdSpot f19818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ViewGroup f19819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MediationBannerListener f19820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MediationInterstitialListener f19821f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WeakReference<Activity> f19822g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InneractiveAdSpot f19823h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m3.a f19824i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public m3.c f19825j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public m3.g f19826k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public m3.d f19827l;

    public class a implements OnFyberMarketplaceInitializedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MediationAdLoadCallback f19828a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MediationRewardedAdConfiguration f19829b;

        public a(MediationAdLoadCallback mediationAdLoadCallback, MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
            this.f19828a = mediationAdLoadCallback;
            this.f19829b = mediationRewardedAdConfiguration;
        }

        @Override // com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener
        public void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
            if (fyberInitStatus != OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
                AdError adErrorB = m3.b.b(fyberInitStatus);
                Log.w(FyberMediationAdapter.f19815m, adErrorB.getMessage());
                this.f19828a.onFailure(adErrorB);
            } else {
                FyberMediationAdapter.this.f19826k = new m3.g(this.f19828a);
                FyberMediationAdapter.this.f19826k.d(this.f19829b);
            }
        }
    }

    public class b implements OnFyberMarketplaceInitializedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InitializationCompleteCallback f19831a;

        public b(InitializationCompleteCallback initializationCompleteCallback) {
            this.f19831a = initializationCompleteCallback;
        }

        @Override // com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener
        public void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
            if (fyberInitStatus == OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
                this.f19831a.onInitializationSucceeded();
                return;
            }
            AdError adErrorB = m3.b.b(fyberInitStatus);
            Log.w(FyberMediationAdapter.f19815m, adErrorB.getMessage());
            this.f19831a.onInitializationFailed(adErrorB.getMessage());
        }
    }

    public class c implements OnFyberMarketplaceInitializedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bundle f19833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f19834b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AdSize f19835c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Bundle f19836d;

        public c(Bundle bundle, Context context, AdSize adSize, Bundle bundle2) {
            this.f19833a = bundle;
            this.f19834b = context;
            this.f19835c = adSize;
            this.f19836d = bundle2;
        }

        @Override // com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener
        public void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
            if (fyberInitStatus != OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
                AdError adErrorB = m3.b.b(fyberInitStatus);
                Log.w(FyberMediationAdapter.f19815m, adErrorB.getMessage());
                FyberMediationAdapter.this.f19820e.onAdFailedToLoad(FyberMediationAdapter.this, adErrorB);
                return;
            }
            String string = this.f19833a.getString("spotId");
            if (TextUtils.isEmpty(string)) {
                AdError adError = new AdError(101, "Cannot render banner ad. Please define a valid spot id on the AdMob UI.", "com.google.ads.mediation.dtexchange");
                Log.w(FyberMediationAdapter.f19815m, adError.getMessage());
                FyberMediationAdapter.this.f19820e.onAdFailedToLoad(FyberMediationAdapter.this, adError);
                return;
            }
            FyberMediationAdapter.this.f19818c = InneractiveAdSpotManager.get().createSpot();
            FyberMediationAdapter.this.f19818c.addUnitController(new InneractiveAdViewUnitController());
            FyberMediationAdapter.this.f19819d = new RelativeLayout(this.f19834b);
            FyberMediationAdapter.this.f19818c.setRequestListener(FyberMediationAdapter.this.s());
            FyberMediationAdapter.this.f19817b = this.f19835c;
            m3.e.c(this.f19836d);
            FyberMediationAdapter.this.f19818c.requestAd(new InneractiveAdRequest(string));
        }
    }

    public class d implements InneractiveAdSpot.RequestListener {
        public d() {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
            AdError adErrorA = m3.b.a(inneractiveErrorCode);
            Log.w(FyberMediationAdapter.f19815m, adErrorA.getMessage());
            FyberMediationAdapter.this.f19820e.onAdFailedToLoad(FyberMediationAdapter.this, adErrorA);
            if (inneractiveAdSpot != null) {
                inneractiveAdSpot.destroy();
            }
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
            if (!(FyberMediationAdapter.this.f19818c.getSelectedUnitController() instanceof InneractiveAdViewUnitController)) {
                AdError adError = new AdError(105, String.format("Unexpected controller type. Expected: %s. Actual: %s", InneractiveUnitController.class.getName(), FyberMediationAdapter.this.f19818c.getSelectedUnitController().getClass().getName()), "com.google.ads.mediation.dtexchange");
                Log.w(FyberMediationAdapter.f19815m, adError.getMessage());
                FyberMediationAdapter.this.f19820e.onAdFailedToLoad(FyberMediationAdapter.this, adError);
                FyberMediationAdapter.this.f19818c.destroy();
            }
            InneractiveAdViewUnitController inneractiveAdViewUnitController = (InneractiveAdViewUnitController) FyberMediationAdapter.this.f19818c.getSelectedUnitController();
            inneractiveAdViewUnitController.setEventsListener(FyberMediationAdapter.this.r());
            inneractiveAdViewUnitController.bindView(FyberMediationAdapter.this.f19819d);
            Context context = FyberMediationAdapter.this.f19819d.getContext();
            float f10 = context.getResources().getDisplayMetrics().density;
            int iRound = Math.round(inneractiveAdViewUnitController.getAdContentWidth() / f10);
            int iRound2 = Math.round(inneractiveAdViewUnitController.getAdContentHeight() / f10);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new AdSize(iRound, iRound2));
            if (MediationUtils.findClosestSize(context, FyberMediationAdapter.this.f19817b, arrayList) != null) {
                FyberMediationAdapter.this.f19820e.onAdLoaded(FyberMediationAdapter.this);
                return;
            }
            AdError adError2 = new AdError(103, String.format("The loaded ad size did not match the requested ad size. Requested ad size: %dx%d. Loaded ad size: %dx%d.", Integer.valueOf(Math.round(FyberMediationAdapter.this.f19817b.getWidthInPixels(context) / f10)), Integer.valueOf(Math.round(FyberMediationAdapter.this.f19817b.getHeightInPixels(context) / f10)), Integer.valueOf(iRound), Integer.valueOf(iRound2)), "com.google.ads.mediation.dtexchange");
            Log.w(FyberMediationAdapter.f19815m, adError2.getMessage());
            FyberMediationAdapter.this.f19820e.onAdFailedToLoad(FyberMediationAdapter.this, adError2);
        }
    }

    public class e extends InneractiveAdViewEventsListenerAdapter {
        public e() {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
            FyberMediationAdapter.this.f19820e.onAdClicked(FyberMediationAdapter.this);
            FyberMediationAdapter.this.f19820e.onAdOpened(FyberMediationAdapter.this);
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
            FyberMediationAdapter.this.f19820e.onAdClosed(FyberMediationAdapter.this);
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
            FyberMediationAdapter.this.f19820e.onAdLeftApplication(FyberMediationAdapter.this);
        }
    }

    public class f implements OnFyberMarketplaceInitializedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bundle f19840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f19841b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Bundle f19842c;

        public f(Bundle bundle, Context context, Bundle bundle2) {
            this.f19840a = bundle;
            this.f19841b = context;
            this.f19842c = bundle2;
        }

        @Override // com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener
        public void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
            if (fyberInitStatus != OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
                AdError adErrorB = m3.b.b(fyberInitStatus);
                Log.w(FyberMediationAdapter.f19815m, adErrorB.getMessage());
                FyberMediationAdapter.this.f19821f.onAdFailedToLoad(FyberMediationAdapter.this, adErrorB);
                return;
            }
            String string = this.f19840a.getString("spotId");
            if (TextUtils.isEmpty(string)) {
                AdError adError = new AdError(101, "Cannot render interstitial ad. Please define a valid spot id on the AdMob UI.", "com.google.ads.mediation.dtexchange");
                Log.w(FyberMediationAdapter.f19815m, adError.getMessage());
                FyberMediationAdapter.this.f19821f.onAdFailedToLoad(FyberMediationAdapter.this, adError);
                return;
            }
            if (!(this.f19841b instanceof Activity)) {
                AdError adError2 = new AdError(107, "Cannot request an interstitial ad without an activity context.", "com.google.ads.mediation.dtexchange");
                Log.w(FyberMediationAdapter.f19815m, adError2.getMessage());
                if (FyberMediationAdapter.this.f19821f != null) {
                    FyberMediationAdapter.this.f19821f.onAdFailedToLoad(FyberMediationAdapter.this, adError2);
                    return;
                }
                return;
            }
            FyberMediationAdapter.this.f19822g = new WeakReference((Activity) this.f19841b);
            FyberMediationAdapter.this.f19823h = InneractiveAdSpotManager.get().createSpot();
            FyberMediationAdapter.this.f19823h.addUnitController(new InneractiveFullscreenUnitController());
            FyberMediationAdapter.this.f19823h.setRequestListener(FyberMediationAdapter.this.t());
            m3.e.c(this.f19842c);
            FyberMediationAdapter.this.f19823h.requestAd(new InneractiveAdRequest(string));
        }
    }

    public class g implements InneractiveAdSpot.RequestListener {
        public g() {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
            AdError adErrorA = m3.b.a(inneractiveErrorCode);
            Log.w(FyberMediationAdapter.f19815m, adErrorA.getMessage());
            FyberMediationAdapter.this.f19821f.onAdFailedToLoad(FyberMediationAdapter.this, adErrorA);
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
            if (!(FyberMediationAdapter.this.f19823h.getSelectedUnitController() instanceof InneractiveFullscreenUnitController)) {
                AdError adError = new AdError(105, String.format("Unexpected controller type. Expected: %s. Actual: %s", InneractiveUnitController.class.getName(), FyberMediationAdapter.this.f19818c.getSelectedUnitController().getClass().getName()), "com.google.ads.mediation.dtexchange");
                Log.w(FyberMediationAdapter.f19815m, adError.getMessage());
                FyberMediationAdapter.this.f19821f.onAdFailedToLoad(FyberMediationAdapter.this, adError);
                FyberMediationAdapter.this.f19823h.destroy();
            }
            ((InneractiveFullscreenUnitController) FyberMediationAdapter.this.f19823h.getSelectedUnitController()).setEventsListener(FyberMediationAdapter.this.u());
            FyberMediationAdapter.this.f19821f.onAdLoaded(FyberMediationAdapter.this);
        }
    }

    public class h extends InneractiveFullscreenAdEventsListenerAdapter {
        public h() {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
            FyberMediationAdapter.this.f19821f.onAdClicked(FyberMediationAdapter.this);
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener
        public void onAdDismissed(InneractiveAdSpot inneractiveAdSpot) {
            FyberMediationAdapter.this.f19821f.onAdClosed(FyberMediationAdapter.this);
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
            FyberMediationAdapter.this.f19821f.onAdOpened(FyberMediationAdapter.this);
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
            FyberMediationAdapter.this.f19821f.onAdLeftApplication(FyberMediationAdapter.this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(@NonNull RtbSignalData rtbSignalData, @NonNull SignalCallbacks signalCallbacks) {
        String bidderToken = BidTokenProvider.getBidderToken();
        if (TextUtils.isEmpty(bidderToken)) {
            bidderToken = "";
        }
        signalCallbacks.onSuccess(bidderToken);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    @NonNull
    public View getBannerView() {
        return this.f19819d;
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getSDKVersionInfo() {
        String strB = m3.e.b();
        String[] strArrSplit = strB.split("\\.");
        if (strArrSplit.length >= 3) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
        }
        Log.w(f19815m, String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", strB));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getVersionInfo() {
        String strA = m3.e.a();
        String[] strArrSplit = strA.split("\\.");
        if (strArrSplit.length >= 4) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), (Integer.parseInt(strArrSplit[2]) * 100) + Integer.parseInt(strArrSplit[3]));
        }
        Log.w(f19815m, String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", strA));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(@NonNull Context context, @NonNull InitializationCompleteCallback initializationCompleteCallback, @NonNull List<MediationConfiguration> list) {
        if (m3.h.a().isInitialized()) {
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            String string = it.next().getServerParameters().getString("applicationId");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        if (hashSet.isEmpty()) {
            AdError adError = new AdError(101, "DT Exchange SDK requires an appId to be configured on the AdMob UI.", "com.google.ads.mediation.dtexchange");
            Log.w(f19815m, adError.getMessage());
            initializationCompleteCallback.onInitializationFailed(adError.getMessage());
        } else {
            String str = (String) hashSet.iterator().next();
            if (hashSet.size() > 1) {
                Log.w(f19815m, String.format("Multiple '%s' entries found: %s. Using '%s' to initialize the DT Exchange SDK.", "applicationId", hashSet, str));
            }
            InneractiveAdManager.initialize(context, str, new b(initializationCompleteCallback));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        String string = mediationRewardedAdConfiguration.getServerParameters().getString("applicationId");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "App ID is null or empty.", "com.google.ads.mediation.dtexchange");
            Log.w(f19815m, adError.getMessage());
            mediationAdLoadCallback.onFailure(adError);
        } else {
            InneractiveAdManager.setMediationName(f19816n);
            InneractiveAdManager.setMediationVersion(MobileAds.getVersion().toString());
            InneractiveAdManager.initialize(mediationRewardedAdConfiguration.getContext(), string, new a(mediationAdLoadCallback, mediationRewardedAdConfiguration));
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        m3.a aVar = new m3.a(mediationAdLoadCallback);
        this.f19824i = aVar;
        aVar.a(mediationBannerAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        m3.c cVar = new m3.c(mediationAdLoadCallback);
        this.f19825j = cVar;
        cVar.a(mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAdMapper(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<NativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        m3.d dVar = this.f19827l;
        if (dVar != null) {
            dVar.destroy();
            this.f19827l = null;
        }
        m3.d dVar2 = new m3.d(mediationAdLoadCallback);
        this.f19827l = dVar2;
        dVar2.f(mediationNativeAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.f19826k = new m3.g(mediationAdLoadCallback);
        InneractiveAdManager.setMediationName(f19816n);
        InneractiveAdManager.setMediationVersion(MobileAds.getVersion().toString());
        this.f19826k.c(mediationRewardedAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        InneractiveAdSpot inneractiveAdSpot = this.f19818c;
        if (inneractiveAdSpot != null) {
            inneractiveAdSpot.destroy();
            this.f19818c = null;
        }
        InneractiveAdSpot inneractiveAdSpot2 = this.f19823h;
        if (inneractiveAdSpot2 != null) {
            inneractiveAdSpot2.destroy();
            this.f19823h = null;
        }
        WeakReference<Activity> weakReference = this.f19822g;
        if (weakReference != null) {
            weakReference.clear();
            this.f19822g = null;
        }
        m3.d dVar = this.f19827l;
        if (dVar != null) {
            dVar.destroy();
            this.f19827l = null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
    }

    @NonNull
    public final InneractiveAdViewEventsListener r() {
        return new e();
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(@NonNull Context context, @NonNull MediationBannerListener mediationBannerListener, @NonNull Bundle bundle, @NonNull AdSize adSize, @NonNull MediationAdRequest mediationAdRequest, @Nullable Bundle bundle2) {
        this.f19820e = mediationBannerListener;
        String string = bundle.getString("applicationId");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "App ID is null or empty.", "com.google.ads.mediation.dtexchange");
            Log.w(f19815m, adError.getMessage());
            this.f19820e.onAdFailedToLoad(this, adError);
        } else {
            InneractiveAdManager.setMediationName(f19816n);
            InneractiveAdManager.setMediationVersion(MobileAds.getVersion().toString());
            InneractiveAdManager.initialize(context, string, new c(bundle, context, adSize, bundle2));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(@NonNull Context context, @NonNull MediationInterstitialListener mediationInterstitialListener, @NonNull Bundle bundle, @NonNull MediationAdRequest mediationAdRequest, @Nullable Bundle bundle2) {
        this.f19821f = mediationInterstitialListener;
        String string = bundle.getString("applicationId");
        AdError adError = new AdError(101, "App ID is null or empty.", "com.google.ads.mediation.dtexchange");
        if (TextUtils.isEmpty(string)) {
            Log.w(f19815m, adError.getMessage());
            this.f19821f.onAdFailedToLoad(this, adError);
        } else {
            InneractiveAdManager.setMediationName(f19816n);
            InneractiveAdManager.setMediationVersion(MobileAds.getVersion().toString());
            InneractiveAdManager.initialize(context, string, new f(bundle, context, bundle2));
        }
    }

    @NonNull
    public final InneractiveAdSpot.RequestListener s() {
        return new d();
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        WeakReference<Activity> weakReference = this.f19822g;
        Activity activity = weakReference == null ? null : weakReference.get();
        if (activity == null) {
            Log.w(f19815m, "showInterstitial called, but activity reference was lost.");
            this.f19821f.onAdOpened(this);
            this.f19821f.onAdClosed(this);
        } else {
            if (!(this.f19823h.getSelectedUnitController() instanceof InneractiveFullscreenUnitController)) {
                Log.w(f19815m, "showInterstitial called, but wrong spot has been used (should not happen).");
                this.f19821f.onAdOpened(this);
                this.f19821f.onAdClosed(this);
                return;
            }
            InneractiveFullscreenUnitController inneractiveFullscreenUnitController = (InneractiveFullscreenUnitController) this.f19823h.getSelectedUnitController();
            if (this.f19823h.isReady()) {
                inneractiveFullscreenUnitController.show(activity);
                return;
            }
            Log.w(f19815m, "showInterstitial called, but Ad has expired.");
            this.f19821f.onAdOpened(this);
            this.f19821f.onAdClosed(this);
        }
    }

    @NonNull
    public final InneractiveAdSpot.RequestListener t() {
        return new g();
    }

    @NonNull
    public final InneractiveFullscreenAdEventsListener u() {
        return new h();
    }
}
