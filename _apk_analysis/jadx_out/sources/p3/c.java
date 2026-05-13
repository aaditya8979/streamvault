package p3;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import n3.h;
import n3.i;
import n3.m;

/* JADX INFO: compiled from: InMobiRtbNativeAd.java */
/* JADX INFO: loaded from: classes.dex */
public class c extends o3.c {
    public c(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback, @NonNull com.google.ads.mediation.inmobi.a aVar, @NonNull n3.b bVar) {
        super(mediationNativeAdConfiguration, mediationAdLoadCallback, aVar, bVar);
    }

    @Override // o3.c
    public void b(m mVar) {
        h hVarA = i.a(this.f76022b.getContext(), this.f76022b.getMediationExtras(), "c_google");
        mVar.l(hVarA.b());
        mVar.m(hVarA.a());
        mVar.j(this.f76022b.getBidResponse().getBytes());
    }

    public void c() {
        a(this.f76022b.getContext(), n3.d.g(this.f76022b.getServerParameters()));
    }
}
