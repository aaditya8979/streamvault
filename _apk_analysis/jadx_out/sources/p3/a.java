package p3;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import n3.e;
import n3.h;
import n3.i;

/* JADX INFO: compiled from: InMobiRtbBannerAd.java */
/* JADX INFO: loaded from: classes.dex */
public class a extends o3.a {
    public a(@NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, @NonNull com.google.ads.mediation.inmobi.a aVar, @NonNull n3.b bVar) {
        super(mediationAdLoadCallback, aVar, bVar);
    }

    @Override // o3.a
    public void b(@NonNull e eVar, @NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        h hVarA = i.a(mediationBannerAdConfiguration.getContext(), mediationBannerAdConfiguration.getMediationExtras(), "c_google");
        eVar.f(hVarA.b());
        eVar.g(hVarA.a());
        eVar.c(mediationBannerAdConfiguration.getBidResponse().getBytes());
    }

    public void c(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        Context context = mediationBannerAdConfiguration.getContext();
        AdSize adSizeB = n3.d.b(context, mediationBannerAdConfiguration.getAdSize());
        if (adSizeB == null) {
            adSizeB = mediationBannerAdConfiguration.getAdSize();
        }
        a(context, adSizeB, mediationBannerAdConfiguration);
    }
}
