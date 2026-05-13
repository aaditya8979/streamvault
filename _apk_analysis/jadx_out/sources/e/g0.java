package e;

import android.app.Activity;
import com.vungle.ads.AdConfig;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.NativeAd;
import com.vungle.ads.VungleError;

/* JADX INFO: loaded from: classes12.dex */
public final class g0 implements InitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f60003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f60004b;

    public g0(u uVar, Activity activity) {
        this.f60004b = uVar;
        this.f60003a = activity;
    }

    @Override // com.vungle.ads.InitializationListener
    public final void onError(VungleError vungleError) {
        this.f60004b.v("Vungle init failed, InitCallback - onError: " + vungleError.getLocalizedMessage());
    }

    @Override // com.vungle.ads.InitializationListener
    public final void onSuccess() {
        NativeAd nativeAd = new NativeAd(this.f60003a.getApplicationContext(), this.f60004b.O);
        new AdConfig();
        nativeAd.setAdListener(this.f60004b.P);
        nativeAd.load(null);
    }
}
