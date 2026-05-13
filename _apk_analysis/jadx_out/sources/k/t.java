package k;

import android.app.Activity;
import com.facebook.ads.InterstitialAd;
import com.yk.e.inf.IComCallback;

/* JADX INFO: loaded from: classes8.dex */
public final class t implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f72669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f72670b;

    public t(l0 l0Var, Activity activity) {
        this.f72670b = l0Var;
        this.f72669a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f72670b.v(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        this.f72670b.E = new InterstitialAd(this.f72669a.getApplicationContext(), this.f72670b.F);
        InterstitialAd interstitialAd = this.f72670b.E;
        interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withAdListener(this.f72670b.G).build());
    }
}
