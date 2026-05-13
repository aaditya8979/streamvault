package l;

import android.app.Activity;
import com.facebook.ads.NativeBannerAd;
import com.yk.e.inf.IComCallback;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f73607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f73608b;

    public j(y yVar, Activity activity) {
        this.f73608b = yVar;
        this.f73607a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f73608b.v(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        this.f73608b.D = new NativeBannerAd(this.f73607a.getApplicationContext(), this.f73608b.G);
        NativeBannerAd nativeBannerAd = this.f73608b.D;
        nativeBannerAd.loadAd(nativeBannerAd.buildLoadAdConfig().withAdListener(this.f73608b.H).build());
    }
}
