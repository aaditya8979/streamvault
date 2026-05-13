package r3;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.ironsource.IronSourceMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.ironsource.mediationsdk.IronSource;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: IronSourceInterstitialAd.java */
/* JADX INFO: loaded from: classes7.dex */
public class e implements MediationInterstitialAd {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @VisibleForTesting
    public static final ConcurrentHashMap<String, WeakReference<e>> f78556e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f78557f = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediationInterstitialAdCallback f78558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> f78559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f78560d;

    public e(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        this.f78560d = mediationInterstitialAdConfiguration.getServerParameters().getString("instanceId", "0");
        this.f78559c = mediationAdLoadCallback;
    }

    public static e a(@NonNull String str) {
        ConcurrentHashMap<String, WeakReference<e>> concurrentHashMap = f78556e;
        if (concurrentHashMap.containsKey(str)) {
            return concurrentHashMap.get(str).get();
        }
        return null;
    }

    public static f c() {
        return f78557f;
    }

    public static void i(@NonNull String str) {
        f78556e.remove(str);
    }

    public MediationInterstitialAdCallback b() {
        return this.f78558b;
    }

    public MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> d() {
        return this.f78559c;
    }

    public final boolean e(@NonNull Context context) {
        AdError adErrorI = a.i(context, this.f78560d);
        if (adErrorI != null) {
            h(adErrorI);
            return false;
        }
        if (a.c(this.f78560d, f78556e)) {
            return true;
        }
        h(new AdError(103, String.format("An IronSource interstitial ad is already loading for instance ID: %s", this.f78560d), IronSourceMediationAdapter.ADAPTER_ERROR_DOMAIN));
        return false;
    }

    public final boolean f(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        if (!e(mediationInterstitialAdConfiguration.getContext())) {
            return false;
        }
        f78556e.put(this.f78560d, new WeakReference<>(this));
        Log.d(d.f78555a, String.format("Loading IronSource interstitial ad with instance ID: %s", this.f78560d));
        return true;
    }

    public void g(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        if (f(mediationInterstitialAdConfiguration)) {
            IronSource.loadISDemandOnlyInterstitial((Activity) mediationInterstitialAdConfiguration.getContext(), this.f78560d);
        }
    }

    public final void h(@NonNull AdError adError) {
        Log.e(d.f78555a, adError.toString());
        MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback = this.f78559c;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(adError);
        }
    }

    public void j(@NonNull MediationInterstitialAdCallback mediationInterstitialAdCallback) {
        this.f78558b = mediationInterstitialAdCallback;
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(@NonNull Context context) {
        IronSource.showISDemandOnlyInterstitial(this.f78560d);
    }
}
