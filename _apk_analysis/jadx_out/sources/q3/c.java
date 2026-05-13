package q3;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.ads.mediation.inmobi.InMobiMediationAdapter;
import com.google.ads.mediation.inmobi.a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import n3.h;
import n3.i;
import n3.m;

/* JADX INFO: compiled from: InMobiWaterfallNativeAd.java */
/* JADX INFO: loaded from: classes5.dex */
public class c extends o3.c {

    /* JADX INFO: compiled from: InMobiWaterfallNativeAd.java */
    public class a implements a.InterfaceC0281a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f77656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f77657b;

        public a(Context context, long j10) {
            this.f77656a = context;
            this.f77657b = j10;
        }

        @Override // com.google.ads.mediation.inmobi.a.InterfaceC0281a
        public void onInitializeError(@NonNull AdError adError) {
            Log.w(InMobiMediationAdapter.TAG, adError.toString());
            if (c.this.f76023c != null) {
                c.this.f76023c.onFailure(adError);
            }
        }

        @Override // com.google.ads.mediation.inmobi.a.InterfaceC0281a
        public void onInitializeSuccess() {
            c.this.a(this.f77656a, this.f77657b);
        }
    }

    public c(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback, @NonNull com.google.ads.mediation.inmobi.a aVar, @NonNull n3.b bVar) {
        super(mediationNativeAdConfiguration, mediationAdLoadCallback, aVar, bVar);
    }

    @Override // o3.c
    public void b(m mVar) {
        h hVarA = i.a(this.f76022b.getContext(), this.f76022b.getMediationExtras(), "c_admob");
        mVar.l(hVarA.b());
        mVar.m(hVarA.a());
        mVar.i();
    }

    public void f() {
        Context context = this.f76022b.getContext();
        Bundle serverParameters = this.f76022b.getServerParameters();
        String string = serverParameters.getString("accountid");
        long jG = n3.d.g(serverParameters);
        AdError adErrorJ = n3.d.j(string, jG);
        if (adErrorJ != null) {
            this.f76023c.onFailure(adErrorJ);
        } else {
            this.f76026f.b(context, string, new a(context, jG));
        }
    }
}
