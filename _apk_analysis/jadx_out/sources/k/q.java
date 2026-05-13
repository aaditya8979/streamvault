package k;

import com.mbridge.msdk.out.MBSplashLoadListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes8.dex */
public final class q implements MBSplashLoadListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f72661b;

    public q(z0 z0Var) {
        this.f72661b = z0Var;
    }

    @Override // com.mbridge.msdk.out.MBSplashLoadListener
    public final void isSupportZoomOut(MBridgeIds mBridgeIds, boolean z10) {
        AdLog.d("isSupportZoomOut " + z10);
    }

    @Override // com.mbridge.msdk.out.MBSplashLoadListener
    public final void onLoadFailed(MBridgeIds mBridgeIds, String str, int i10) {
        this.f72661b.v(str);
    }

    @Override // com.mbridge.msdk.out.MBSplashLoadListener
    public final void onLoadSuccessed(MBridgeIds mBridgeIds, int i10) {
        this.f72661b.D.onAdLoaded();
    }
}
