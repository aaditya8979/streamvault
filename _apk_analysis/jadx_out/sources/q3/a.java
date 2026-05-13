package q3;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.ads.mediation.inmobi.InMobiMediationAdapter;
import com.google.ads.mediation.inmobi.a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import n3.e;
import n3.g;
import n3.h;
import n3.i;

/* JADX INFO: compiled from: InMobiWaterfallBannerAd.java */
/* JADX INFO: loaded from: classes5.dex */
public class a extends o3.a {

    /* JADX INFO: renamed from: q3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: InMobiWaterfallBannerAd.java */
    public class C0929a implements a.InterfaceC0281a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f77649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdSize f77650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MediationBannerAdConfiguration f77651c;

        public C0929a(Context context, AdSize adSize, MediationBannerAdConfiguration mediationBannerAdConfiguration) {
            this.f77649a = context;
            this.f77650b = adSize;
            this.f77651c = mediationBannerAdConfiguration;
        }

        @Override // com.google.ads.mediation.inmobi.a.InterfaceC0281a
        public void onInitializeError(@NonNull AdError adError) {
            Log.w(InMobiMediationAdapter.TAG, adError.toString());
            a.this.f76012b.onFailure(adError);
        }

        @Override // com.google.ads.mediation.inmobi.a.InterfaceC0281a
        public void onInitializeSuccess() {
            a.this.a(this.f77649a, this.f77650b, this.f77651c);
        }
    }

    public a(@NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, @NonNull com.google.ads.mediation.inmobi.a aVar, @NonNull n3.b bVar) {
        super(mediationAdLoadCallback, aVar, bVar);
    }

    @Override // o3.a
    public void b(@NonNull e eVar, @NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        h hVarA = i.a(mediationBannerAdConfiguration.getContext(), mediationBannerAdConfiguration.getMediationExtras(), "c_admob");
        eVar.f(hVarA.b());
        eVar.g(hVarA.a());
        eVar.b();
    }

    public void e(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        Context context = mediationBannerAdConfiguration.getContext();
        AdSize adSizeB = n3.d.b(context, mediationBannerAdConfiguration.getAdSize());
        if (adSizeB == null) {
            AdError adErrorA = g.a(102, String.format("The requested banner size: %s is not supported by InMobi SDK.", mediationBannerAdConfiguration.getAdSize()));
            Log.e(InMobiMediationAdapter.TAG, adErrorA.toString());
            this.f76012b.onFailure(adErrorA);
            return;
        }
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        String string = serverParameters.getString("accountid");
        AdError adErrorJ = n3.d.j(string, n3.d.g(serverParameters));
        if (adErrorJ != null) {
            this.f76012b.onFailure(adErrorJ);
        } else {
            this.f76013c.b(context, string, new C0929a(context, adSizeB, mediationBannerAdConfiguration));
        }
    }
}
