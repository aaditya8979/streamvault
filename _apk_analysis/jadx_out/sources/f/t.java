package f;

import android.app.Activity;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.yk.e.inf.IComCallback;

/* JADX INFO: loaded from: classes5.dex */
public final class t implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f61388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f61389b;

    public t(z zVar, Activity activity) {
        this.f61389b = zVar;
        this.f61388a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f61389b.x(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        new AdLoader.Builder(this.f61388a, this.f61389b.I).withNativeAdOptions(new NativeAdOptions.Builder().setVideoOptions(new VideoOptions.Builder().setStartMuted(false).build()).build()).forNativeAd(new r(this)).withAdListener(this.f61389b.K).withNativeAdOptions(new NativeAdOptions.Builder().setAdChoicesPlacement(2).build()).build().loadAd(new AdRequest.Builder().build());
    }
}
