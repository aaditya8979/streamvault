package f;

import android.app.Activity;
import com.facebook.ads.NativeAd;
import com.yk.e.inf.IComCallback;

/* JADX INFO: loaded from: classes5.dex */
public final class y implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f61395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f61396b;

    public y(f fVar, Activity activity) {
        this.f61396b = fVar;
        this.f61395a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f61396b.v(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        this.f61396b.F = new NativeAd(this.f61395a.getApplicationContext(), this.f61396b.G);
        NativeAd nativeAd = this.f61396b.F;
        nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(this.f61396b.H).build());
    }
}
