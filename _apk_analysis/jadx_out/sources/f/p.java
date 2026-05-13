package f;

import android.app.Activity;
import com.vungle.ads.AdConfig;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.NativeAd;
import com.vungle.ads.VungleError;

/* JADX INFO: loaded from: classes5.dex */
public final class p implements InitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f61385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f61386b;

    public p(i iVar, Activity activity) {
        this.f61386b = iVar;
        this.f61385a = activity;
    }

    @Override // com.vungle.ads.InitializationListener
    public final void onError(VungleError vungleError) {
        this.f61386b.x("Vungle init failed, InitCallback - onError: " + vungleError.getLocalizedMessage());
    }

    @Override // com.vungle.ads.InitializationListener
    public final void onSuccess() {
        NativeAd nativeAd = new NativeAd(this.f61385a.getApplicationContext(), this.f61386b.G);
        new AdConfig();
        nativeAd.setAdListener(this.f61386b.H);
        nativeAd.load(null);
    }
}
