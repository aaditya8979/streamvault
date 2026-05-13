package p3;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import n3.h;
import n3.i;
import n3.j;

/* JADX INFO: compiled from: InMobiRtbInterstitialAd.java */
/* JADX INFO: loaded from: classes.dex */
public class b extends o3.b {
    public b(@NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, @NonNull com.google.ads.mediation.inmobi.a aVar, @NonNull n3.b bVar) {
        super(mediationAdLoadCallback, aVar, bVar);
    }

    @Override // o3.b
    public void b(@NonNull j jVar, @NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        h hVarA = i.a(mediationInterstitialAdConfiguration.getContext(), mediationInterstitialAdConfiguration.getMediationExtras(), "c_google");
        jVar.d(hVarA.b());
        jVar.e(hVarA.a());
        jVar.c(mediationInterstitialAdConfiguration.getBidResponse().getBytes());
    }

    public void c(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        a(mediationInterstitialAdConfiguration.getContext(), mediationInterstitialAdConfiguration);
    }
}
