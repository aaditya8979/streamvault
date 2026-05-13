package jh;

import android.app.Activity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdPreloader;
import com.yk.e.inf.IComCallback;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f72435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f72436b;

    public d(j jVar, Activity activity) {
        this.f72436b = jVar;
        this.f72435a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f72436b.x(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        if (!InterstitialAdPreloader.isAdAvailable(this.f72436b.H)) {
            AdRequest adRequestBuild = new AdRequest.Builder().build();
            Activity activity = this.f72435a;
            j jVar = this.f72436b;
            InterstitialAd.load(activity, jVar.H, adRequestBuild, jVar.I);
            return;
        }
        AdLog.i("Preloaded interstitial ad " + this.f72436b.H + " AD_UNIT_ID is available.");
        j jVar2 = this.f72436b;
        jVar2.E = InterstitialAdPreloader.pollAd(jVar2.H);
        this.f72436b.E();
    }
}
