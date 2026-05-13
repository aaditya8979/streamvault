package r3;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.ironsource.IronSourceMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.ironsource.mediationsdk.IronSource;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: IronSourceRewardedAd.java */
/* JADX INFO: loaded from: classes7.dex */
public class g implements MediationRewardedAd {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @VisibleForTesting
    public static final ConcurrentHashMap<String, WeakReference<g>> f78561e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f78562f = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediationRewardedAdCallback f78563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> f78564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f78565d;

    public g(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.f78565d = mediationRewardedAdConfiguration.getServerParameters().getString("instanceId", "0");
        this.f78564c = mediationAdLoadCallback;
    }

    public static g a(@NonNull String str) {
        ConcurrentHashMap<String, WeakReference<g>> concurrentHashMap = f78561e;
        if (concurrentHashMap.containsKey(str)) {
            return concurrentHashMap.get(str).get();
        }
        return null;
    }

    public static h b() {
        return f78562f;
    }

    public static void i(@NonNull String str) {
        f78561e.remove(str);
    }

    public MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> c() {
        return this.f78564c;
    }

    public MediationRewardedAdCallback d() {
        return this.f78563b;
    }

    public final boolean e(@NonNull Context context) {
        AdError adErrorI = a.i(context, this.f78565d);
        if (adErrorI != null) {
            h(adErrorI);
            return false;
        }
        if (a.c(this.f78565d, f78561e)) {
            return true;
        }
        h(new AdError(103, String.format("An IronSource Rewarded ad is already loading for instance ID: %s", this.f78565d), IronSourceMediationAdapter.ADAPTER_ERROR_DOMAIN));
        return false;
    }

    public final boolean f(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        if (!e(mediationRewardedAdConfiguration.getContext())) {
            return false;
        }
        f78561e.put(this.f78565d, new WeakReference<>(this));
        Log.d(d.f78555a, String.format("Loading IronSource rewarded ad with instance ID: %s", this.f78565d));
        return true;
    }

    public void g(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        if (f(mediationRewardedAdConfiguration)) {
            IronSource.loadISDemandOnlyRewardedVideo((Activity) mediationRewardedAdConfiguration.getContext(), this.f78565d);
        }
    }

    public final void h(@NonNull AdError adError) {
        Log.w(d.f78555a, adError.toString());
        this.f78564c.onFailure(adError);
    }

    public void j(@NonNull MediationRewardedAdCallback mediationRewardedAdCallback) {
        this.f78563b = mediationRewardedAdCallback;
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(@NonNull Context context) {
        Log.d(d.f78555a, String.format("Showing IronSource rewarded ad for instance ID: %s", this.f78565d));
        IronSource.showISDemandOnlyRewardedVideo(this.f78565d);
    }
}
