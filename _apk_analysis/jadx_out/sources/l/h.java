package l;

import android.app.Activity;
import com.yk.e.callBack.MainNativeAdCallBack;
import com.yk.e.inf.IComCallback;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.NativeAdLoader;
import sg.bigo.ads.api.NativeAdRequest;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f73599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f73600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f73601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MainNativeAdCallBack f73602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f73603e;

    public h(w wVar, Activity activity, int i10, int i11, j.z zVar) {
        this.f73603e = wVar;
        this.f73599a = activity;
        this.f73600b = i10;
        this.f73601c = i11;
        this.f73602d = zVar;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f73603e.v(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        new NativeAdLoader.Builder().withAdLoadListener((AdLoadListener<NativeAd>) new d0(this)).build().loadAd(new NativeAdRequest.Builder().withSlotId(this.f73603e.D).build());
    }
}
