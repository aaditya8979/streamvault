package p3;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import n3.h;
import n3.i;
import n3.j;

/* JADX INFO: compiled from: InMobiRtbRewardedAd.java */
/* JADX INFO: loaded from: classes.dex */
public class d extends o3.d {
    public d(@NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, @NonNull com.google.ads.mediation.inmobi.a aVar, @NonNull n3.b bVar) {
        super(mediationAdLoadCallback, aVar, bVar);
    }

    @Override // o3.d
    public void b(@NonNull j jVar, @NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        h hVarA = i.a(mediationRewardedAdConfiguration.getContext(), mediationRewardedAdConfiguration.getMediationExtras(), "c_google");
        jVar.d(hVarA.b());
        jVar.e(hVarA.a());
        jVar.c(mediationRewardedAdConfiguration.getBidResponse().getBytes());
    }

    public void c(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        a(mediationRewardedAdConfiguration.getContext(), mediationRewardedAdConfiguration);
    }
}
