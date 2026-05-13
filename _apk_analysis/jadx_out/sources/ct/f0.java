package ct;

import android.app.Activity;
import com.facebook.ads.NativeBannerAd;
import com.yk.e.inf.IComCallback;

/* JADX INFO: loaded from: classes10.dex */
public final class f0 implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f59443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f59444b;

    public f0(m0 m0Var, Activity activity) {
        this.f59444b = m0Var;
        this.f59443a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f59444b.v(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        this.f59444b.H = new NativeBannerAd(this.f59443a.getApplicationContext(), this.f59444b.J);
        NativeBannerAd nativeBannerAd = this.f59444b.H;
        nativeBannerAd.loadAd(nativeBannerAd.buildLoadAdConfig().withAdListener(this.f59444b.K).build());
    }
}
