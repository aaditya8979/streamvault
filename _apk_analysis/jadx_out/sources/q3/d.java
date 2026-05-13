package q3;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.ads.mediation.inmobi.InMobiMediationAdapter;
import com.google.ads.mediation.inmobi.a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import n3.h;
import n3.i;
import n3.j;

/* JADX INFO: compiled from: InMobiWaterfallRewardedAd.java */
/* JADX INFO: loaded from: classes5.dex */
public class d extends o3.d {

    /* JADX INFO: compiled from: InMobiWaterfallRewardedAd.java */
    public class a implements a.InterfaceC0281a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f77659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MediationRewardedAdConfiguration f77660b;

        public a(Context context, MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
            this.f77659a = context;
            this.f77660b = mediationRewardedAdConfiguration;
        }

        @Override // com.google.ads.mediation.inmobi.a.InterfaceC0281a
        public void onInitializeError(@NonNull AdError adError) {
            Log.w(InMobiMediationAdapter.TAG, adError.toString());
            if (d.this.f76031c != null) {
                d.this.f76031c.onFailure(adError);
            }
        }

        @Override // com.google.ads.mediation.inmobi.a.InterfaceC0281a
        public void onInitializeSuccess() {
            d.this.a(this.f77659a, this.f77660b);
        }
    }

    public d(@NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, @NonNull com.google.ads.mediation.inmobi.a aVar, @NonNull n3.b bVar) {
        super(mediationAdLoadCallback, aVar, bVar);
    }

    @Override // o3.d
    public void b(@NonNull j jVar, @NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        h hVarA = i.a(mediationRewardedAdConfiguration.getContext(), mediationRewardedAdConfiguration.getMediationExtras(), "c_admob");
        jVar.d(hVarA.b());
        jVar.e(hVarA.a());
        jVar.b();
    }

    public void f(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        Context context = mediationRewardedAdConfiguration.getContext();
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        String string = serverParameters.getString("accountid");
        AdError adErrorJ = n3.d.j(string, n3.d.g(serverParameters));
        if (adErrorJ != null) {
            this.f76031c.onFailure(adErrorJ);
        } else {
            this.f76032d.b(context, string, new a(context, mediationRewardedAdConfiguration));
        }
    }
}
