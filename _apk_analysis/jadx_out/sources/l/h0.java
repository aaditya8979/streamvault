package l;

import android.app.Activity;
import com.vungle.ads.AdConfig;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.NativeAd;
import com.vungle.ads.VungleError;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements InitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f73604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f73605b;

    public h0(z zVar, Activity activity) {
        this.f73605b = zVar;
        this.f73604a = activity;
    }

    @Override // com.vungle.ads.InitializationListener
    public final void onError(VungleError vungleError) {
        this.f73605b.x("Vungle init failed, InitCallback - onError: " + vungleError.getLocalizedMessage());
    }

    @Override // com.vungle.ads.InitializationListener
    public final void onSuccess() {
        NativeAd nativeAd = new NativeAd(this.f73604a.getApplicationContext(), this.f73605b.G);
        new AdConfig();
        nativeAd.setAdListener(this.f73605b.H);
        nativeAd.load(null);
    }
}
