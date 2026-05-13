package jh;

import android.app.Activity;
import com.facebook.ads.InterstitialAd;
import com.yk.e.inf.IComCallback;

/* JADX INFO: loaded from: classes10.dex */
public final class p implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f72457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f72458b;

    public p(c0 c0Var, Activity activity) {
        this.f72458b = c0Var;
        this.f72457a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f72458b.v(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        this.f72458b.D = new InterstitialAd(this.f72457a.getApplicationContext(), this.f72458b.E);
        InterstitialAd interstitialAd = this.f72458b.D;
        interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withAdListener(this.f72458b.F).build());
    }
}
