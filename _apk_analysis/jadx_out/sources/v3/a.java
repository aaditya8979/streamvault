package v3;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import java.lang.ref.WeakReference;
import java.util.Map;
import s3.i;
import s3.j;
import s3.k;

/* JADX INFO: compiled from: MintegralWaterfallAppOpenAd.java */
/* JADX INFO: loaded from: classes3.dex */
public class a extends t3.a {
    public a(@NonNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback, s3.a aVar) {
        super(mediationAdLoadCallback, aVar);
    }

    public void a(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        Bundle serverParameters = mediationAppOpenAdConfiguration.getServerParameters();
        String string = serverParameters.getString("ad_unit_id");
        String string2 = serverParameters.getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        AdError adErrorG = k.g(string, string2);
        if (adErrorG != null) {
            this.f84618b.onFailure(adErrorG);
            return;
        }
        if (this.f84622f.a()) {
            i iVar = new i(string, string2);
            this.f84619c = iVar;
            Map<i, WeakReference<Object>> map = MintegralMediationAdapter.loadedSlotIdentifiers;
            WeakReference<Object> weakReference = map.get(iVar);
            if (weakReference != null && weakReference.get() != null) {
                this.f84618b.onFailure(new AdError(106, "An ad for the Mintegral slot is already loaded and is yet to be shown.", "com.google.ads.mediation.mintegral"));
                return;
            }
            map.put(this.f84619c, new WeakReference<>(this));
        }
        j jVarF = s3.e.f();
        this.f84621e = jVarF;
        jVarF.b(string2, string);
        this.f84621e.c(this);
        this.f84621e.f(this);
        this.f84621e.a();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public void showAd(@NonNull Context context) {
        Activity activity = (Activity) context;
        if (this.f84621e != null) {
            RelativeLayout relativeLayout = new RelativeLayout(activity);
            ((ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content)).addView(relativeLayout);
            this.f84621e.g(relativeLayout);
        }
    }
}
