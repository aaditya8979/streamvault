package b4;

import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.vungle.ads.AdConfig;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: VungleRtbAppOpenAd.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends a4.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback, @NotNull com.google.ads.mediation.vungle.b bVar) {
        super(mediationAdLoadCallback, bVar);
        p.k(mediationAdLoadCallback, "mediationAdLoadCallback");
        p.k(bVar, "vungleFactory");
    }

    @Override // a4.a
    @NotNull
    public String e(@NotNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        p.k(mediationAppOpenAdConfiguration, "mediationAppOpenAdConfiguration");
        String bidResponse = mediationAppOpenAdConfiguration.getBidResponse();
        p.j(bidResponse, "getBidResponse(...)");
        return bidResponse;
    }

    @Override // a4.a
    public void f(@NotNull AdConfig adConfig, @NotNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        p.k(adConfig, "adConfig");
        p.k(mediationAppOpenAdConfiguration, "mediationAppOpenAdConfiguration");
        String watermark = mediationAppOpenAdConfiguration.getWatermark();
        p.j(watermark, "getWatermark(...)");
        if (watermark.length() > 0) {
            adConfig.setWatermark(watermark);
        }
    }
}
