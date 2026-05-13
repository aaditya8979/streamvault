package j;

import com.yk.e.callBack.MainNativeAdCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdInfo f71851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f71852c;

    public e(z zVar, AdInfo adInfo) {
        this.f71852c = zVar;
        this.f71851b = adInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainNativeAdCallBack mainNativeAdCallBack = this.f71852c.f72045b;
        if (mainNativeAdCallBack != null) {
            mainNativeAdCallBack.onAdShow(this.f71851b);
        }
        MainNativeAdCallBack mainNativeAdCallBack2 = this.f71852c.f72046c.f72014e;
        if (mainNativeAdCallBack2 != null) {
            mainNativeAdCallBack2.onAdShow(this.f71851b);
        }
    }
}
