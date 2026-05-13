package ct;

import android.app.Activity;
import com.vungle.ads.AdConfig;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.NativeAd;
import com.vungle.ads.VungleError;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 implements InitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f59468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f59469b;

    public r0(e eVar, Activity activity) {
        this.f59469b = eVar;
        this.f59468a = activity;
    }

    @Override // com.vungle.ads.InitializationListener
    public final void onError(VungleError vungleError) {
        this.f59469b.x("Vungle init failed, InitCallback - onError: " + vungleError.getLocalizedMessage());
    }

    @Override // com.vungle.ads.InitializationListener
    public final void onSuccess() {
        NativeAd nativeAd = new NativeAd(this.f59468a.getApplicationContext(), this.f59469b.J);
        new AdConfig();
        nativeAd.setAdListener(this.f59469b.K);
        nativeAd.load(null);
    }
}
