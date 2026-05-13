package v3;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import java.lang.ref.WeakReference;
import java.util.Map;
import s3.g;
import s3.i;
import s3.k;

/* JADX INFO: compiled from: MintegralWaterfallInterstitialAd.java */
/* JADX INFO: loaded from: classes3.dex */
public class c extends t3.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g f85866g;

    public c(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, s3.a aVar) {
        super(mediationInterstitialAdConfiguration, mediationAdLoadCallback, aVar);
    }

    public void a(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        String string = mediationInterstitialAdConfiguration.getServerParameters().getString("ad_unit_id");
        String string2 = mediationInterstitialAdConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        AdError adErrorG = k.g(string, string2);
        if (adErrorG != null) {
            this.f84626b.onFailure(adErrorG);
            return;
        }
        if (this.f84630f.a()) {
            i iVar = new i(string, string2);
            this.f84627c = iVar;
            Map<i, WeakReference<Object>> map = MintegralMediationAdapter.loadedSlotIdentifiers;
            WeakReference<Object> weakReference = map.get(iVar);
            if (weakReference != null && weakReference.get() != null) {
                this.f84626b.onFailure(new AdError(106, "An ad for the Mintegral slot is already loaded and is yet to be shown.", "com.google.ads.mediation.mintegral"));
                return;
            }
            map.put(this.f84627c, new WeakReference<>(this));
        }
        g gVarB = s3.e.b();
        this.f85866g = gVarB;
        gVarB.a(mediationInterstitialAdConfiguration.getContext(), string2, string);
        this.f85866g.b(this);
        this.f85866g.load();
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(@NonNull Context context) {
        this.f85866g.playVideoMute(this.f84629e ? 1 : 2);
        this.f85866g.show();
    }
}
