package e;

import android.app.Activity;
import com.facebook.ads.NativeBannerAd;
import com.yk.e.inf.IComCallback;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f60010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f60011b;

    public m(r rVar, Activity activity) {
        this.f60011b = rVar;
        this.f60010a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f60011b.v(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        this.f60011b.N = new NativeBannerAd(this.f60010a.getApplicationContext(), this.f60011b.O);
        NativeBannerAd nativeBannerAd = this.f60011b.N;
        nativeBannerAd.loadAd(nativeBannerAd.buildLoadAdConfig().withAdListener(this.f60011b.P).build());
    }
}
