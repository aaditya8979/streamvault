package c4;

import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.vungle.ads.VungleBannerView;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: VungleWaterfallBannerAd.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends a4.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, @NotNull com.google.ads.mediation.vungle.b bVar) {
        super(mediationAdLoadCallback, bVar);
        p.k(mediationAdLoadCallback, "mediationAdLoadCallback");
        p.k(bVar, "vungleFactory");
    }

    @Override // a4.b
    public void d(@NotNull VungleBannerView vungleBannerView, @NotNull MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        p.k(vungleBannerView, "bannerAdView");
        p.k(mediationBannerAdConfiguration, "mediationBannerAdConfiguration");
        vungleBannerView.load(null);
    }
}
