package j;

import android.view.View;
import com.yk.e.callBack.MainNativeAdCallBack;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f72003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f72004c;

    public r0(z zVar, View view) {
        this.f72004c = zVar;
        this.f72003b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainNativeAdCallBack mainNativeAdCallBack = this.f72004c.f72045b;
        if (mainNativeAdCallBack != null) {
            mainNativeAdCallBack.onAdLoaded(this.f72003b);
        }
        MainNativeAdCallBack mainNativeAdCallBack2 = this.f72004c.f72046c.f72014e;
        if (mainNativeAdCallBack2 != null) {
            mainNativeAdCallBack2.onAdLoaded(this.f72003b);
        }
    }
}
