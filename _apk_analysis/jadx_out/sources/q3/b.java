package q3;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.ads.mediation.inmobi.InMobiMediationAdapter;
import com.google.ads.mediation.inmobi.a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import n3.h;
import n3.i;
import n3.j;

/* JADX INFO: compiled from: InMobiWaterfallInterstitialAd.java */
/* JADX INFO: loaded from: classes5.dex */
public class b extends o3.b {

    /* JADX INFO: compiled from: InMobiWaterfallInterstitialAd.java */
    public class a implements a.InterfaceC0281a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f77653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MediationInterstitialAdConfiguration f77654b;

        public a(Context context, MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
            this.f77653a = context;
            this.f77654b = mediationInterstitialAdConfiguration;
        }

        @Override // com.google.ads.mediation.inmobi.a.InterfaceC0281a
        public void onInitializeError(@NonNull AdError adError) {
            Log.w(InMobiMediationAdapter.TAG, adError.toString());
            if (b.this.f76018c != null) {
                b.this.f76018c.onFailure(adError);
            }
        }

        @Override // com.google.ads.mediation.inmobi.a.InterfaceC0281a
        public void onInitializeSuccess() {
            b.this.a(this.f77653a, this.f77654b);
        }
    }

    public b(@NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, @NonNull com.google.ads.mediation.inmobi.a aVar, @NonNull n3.b bVar) {
        super(mediationAdLoadCallback, aVar, bVar);
    }

    @Override // o3.b
    public void b(@NonNull j jVar, @NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        h hVarA = i.a(mediationInterstitialAdConfiguration.getContext(), mediationInterstitialAdConfiguration.getMediationExtras(), "c_admob");
        jVar.d(hVarA.b());
        jVar.e(hVarA.a());
        jVar.b();
    }

    public void f(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        Context context = mediationInterstitialAdConfiguration.getContext();
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString("accountid");
        AdError adErrorJ = n3.d.j(string, n3.d.g(serverParameters));
        if (adErrorJ != null) {
            this.f76018c.onFailure(adErrorJ);
        } else {
            this.f76019d.b(context, string, new a(context, mediationInterstitialAdConfiguration));
        }
    }
}
