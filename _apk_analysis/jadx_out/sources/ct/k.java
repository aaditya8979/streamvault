package ct;

import android.app.Activity;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.yk.e.inf.IComCallback;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f59452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f59453b;

    public k(a0 a0Var, Activity activity) {
        this.f59453b = a0Var;
        this.f59452a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f59453b.x(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        new AdLoader.Builder(this.f59452a, this.f59453b.J).withNativeAdOptions(new NativeAdOptions.Builder().setVideoOptions(new VideoOptions.Builder().setStartMuted(false).build()).build()).forNativeAd(new d(this)).withAdListener(this.f59453b.K).withNativeAdOptions(new NativeAdOptions.Builder().setAdChoicesPlacement(2).build()).build().loadAd(new AdRequest.Builder().build());
    }
}
