package a4;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.ads.mediation.vungle.c;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.vungle.ads.AdConfig;
import com.vungle.ads.BaseAd;
import com.vungle.ads.InterstitialAd;
import com.vungle.ads.InterstitialAdListener;
import com.vungle.ads.VungleError;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: VungleAppOpenAd.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class a implements MediationAppOpenAd, InterstitialAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> f3487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.google.ads.mediation.vungle.b f3488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterstitialAd f3489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public MediationAppOpenAdCallback f3490e;

    /* JADX INFO: renamed from: a4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: VungleAppOpenAd.kt */
    public static final class C0000a implements c.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Bundle f3492b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MediationAppOpenAdConfiguration f3493c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f3494d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f3495e;

        public C0000a(Bundle bundle, MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, Context context, String str) {
            this.f3492b = bundle;
            this.f3493c = mediationAppOpenAdConfiguration;
            this.f3494d = context;
            this.f3495e = str;
        }

        @Override // com.google.ads.mediation.vungle.c.a
        public void onInitializeError(AdError adError) {
            p.k(adError, "error");
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            a.this.f3487b.onFailure(adError);
        }

        @Override // com.google.ads.mediation.vungle.c.a
        public void onInitializeSuccess() {
            AdConfig adConfigA = a.this.f3488c.a();
            if (this.f3492b.containsKey("adOrientation")) {
                adConfigA.setAdOrientation(this.f3492b.getInt("adOrientation", 2));
            }
            a.this.f(adConfigA, this.f3493c);
            a aVar = a.this;
            com.google.ads.mediation.vungle.b bVar = aVar.f3488c;
            Context context = this.f3494d;
            String str = this.f3495e;
            p.h(str);
            aVar.f3489d = bVar.c(context, str, adConfigA);
            InterstitialAd interstitialAd = a.this.f3489d;
            InterstitialAd interstitialAd2 = null;
            if (interstitialAd == null) {
                p.C("appOpenAd");
                interstitialAd = null;
            }
            interstitialAd.setAdListener(a.this);
            InterstitialAd interstitialAd3 = a.this.f3489d;
            if (interstitialAd3 == null) {
                p.C("appOpenAd");
            } else {
                interstitialAd2 = interstitialAd3;
            }
            interstitialAd2.load(a.this.e(this.f3493c));
        }
    }

    public a(@NotNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback, @NotNull com.google.ads.mediation.vungle.b bVar) {
        p.k(mediationAdLoadCallback, "mediationAdLoadCallback");
        p.k(bVar, "vungleFactory");
        this.f3487b = mediationAdLoadCallback;
        this.f3488c = bVar;
    }

    @Nullable
    public abstract String e(@NotNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration);

    public abstract void f(@NotNull AdConfig adConfig, @NotNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration);

    public final void g(@NotNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        p.k(mediationAppOpenAdConfiguration, "mediationAppOpenAdConfiguration");
        Bundle mediationExtras = mediationAppOpenAdConfiguration.getMediationExtras();
        p.j(mediationExtras, "getMediationExtras(...)");
        Bundle serverParameters = mediationAppOpenAdConfiguration.getServerParameters();
        p.j(serverParameters, "getServerParameters(...)");
        String string = serverParameters.getString("appid");
        if (string == null || string.length() == 0) {
            AdError adError = new AdError(101, "Failed to load app open ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            this.f3487b.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString("placementID");
        if (string2 == null || string2.length() == 0) {
            AdError adError2 = new AdError(101, "Failed to load app open ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError2.toString());
            this.f3487b.onFailure(adError2);
        } else {
            Context context = mediationAppOpenAdConfiguration.getContext();
            p.j(context, "getContext(...)");
            c cVarA = c.a();
            p.h(string);
            cVarA.b(string, context, new C0000a(mediationExtras, mediationAppOpenAdConfiguration, context, string2));
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdClicked(@NotNull BaseAd baseAd) {
        p.k(baseAd, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f3490e;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.reportAdClicked();
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdEnd(@NotNull BaseAd baseAd) {
        p.k(baseAd, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f3490e;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdClosed();
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToLoad(@NotNull BaseAd baseAd, @NotNull VungleError vungleError) {
        p.k(baseAd, "baseAd");
        p.k(vungleError, "adError");
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        p.j(adError, "getAdError(...)");
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        this.f3487b.onFailure(adError);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToPlay(@NotNull BaseAd baseAd, @NotNull VungleError vungleError) {
        p.k(baseAd, "baseAd");
        p.k(vungleError, "adError");
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        p.j(adError, "getAdError(...)");
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f3490e;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdFailedToShow(adError);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdImpression(@NotNull BaseAd baseAd) {
        p.k(baseAd, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f3490e;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.reportAdImpression();
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLeftApplication(@NotNull BaseAd baseAd) {
        p.k(baseAd, "baseAd");
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLoaded(@NotNull BaseAd baseAd) {
        p.k(baseAd, "baseAd");
        this.f3490e = this.f3487b.onSuccess(this);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdStart(@NotNull BaseAd baseAd) {
        p.k(baseAd, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f3490e;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdOpened();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public void showAd(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        InterstitialAd interstitialAd = this.f3489d;
        InterstitialAd interstitialAd2 = null;
        if (interstitialAd == null) {
            p.C("appOpenAd");
            interstitialAd = null;
        }
        if (interstitialAd.canPlayAd().booleanValue()) {
            InterstitialAd interstitialAd3 = this.f3489d;
            if (interstitialAd3 == null) {
                p.C("appOpenAd");
            } else {
                interstitialAd2 = interstitialAd3;
            }
            interstitialAd2.play(context);
            return;
        }
        AdError adError = new AdError(107, "Failed to show app open ad from Liftoff Monetize.", VungleMediationAdapter.ERROR_DOMAIN);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f3490e;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdFailedToShow(adError);
        }
    }
}
