package k;

import android.app.Activity;
import android.content.pm.PackageManager;
import com.yk.e.inf.IComCallback;
import com.yk.e.util.AdLog;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.SplashAd;
import sg.bigo.ads.api.SplashAdLoader;
import sg.bigo.ads.api.SplashAdRequest;

/* JADX INFO: loaded from: classes8.dex */
public final class w implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f72675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f72676b;

    public w(k kVar, Activity activity) {
        this.f72676b = kVar;
        this.f72675a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f72676b.v(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        SplashAdRequest.Builder builderWithSlotId = new SplashAdRequest.Builder().withSlotId(this.f72676b.F);
        Activity activity = this.f72675a;
        int i10 = 0;
        try {
            i10 = activity.getPackageManager().getApplicationInfo(activity.getPackageName(), 0).icon;
        } catch (PackageManager.NameNotFoundException e10) {
            AdLog.e(e10.getMessage(), e10);
        }
        new SplashAdLoader.Builder().withAdLoadListener((AdLoadListener<SplashAd>) new g(this)).build().loadAd(builderWithSlotId.withAppLogo(i10).withAppName(bp.r0.c(this.f72675a)).build());
    }
}
