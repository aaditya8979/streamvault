package e;

import android.app.Activity;
import com.yk.e.inf.IComCallback;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.NativeAdLoader;
import sg.bigo.ads.api.NativeAdRequest;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f60013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f60014b;

    public o(h hVar, Activity activity) {
        this.f60014b = hVar;
        this.f60013a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f60014b.v(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        new NativeAdLoader.Builder().withAdLoadListener((AdLoadListener<NativeAd>) new e(this)).build().loadAd(new NativeAdRequest.Builder().withSlotId(this.f60014b.N).build());
    }
}
