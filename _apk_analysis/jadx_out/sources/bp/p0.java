package bp;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.ironsource.Z7;
import com.yk.e.object.ThirdAdLifeListener;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 extends ThirdAdLifeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0 f5853a;

    public p0(n0 n0Var) {
        this.f5853a = n0Var;
    }

    @Override // com.yk.e.object.LifeListener
    public final void onDestroy() {
        d0 d0Var;
        this.f5853a.getClass();
        n0 n0Var = this.f5853a;
        MaxNativeAdLoader maxNativeAdLoader = n0Var.f5835p;
        if (maxNativeAdLoader != null) {
            maxNativeAdLoader.destroy(n0Var.f5837r);
            this.f5853a.f5835p.destroy();
        }
        m mVarA = m.a();
        String str = this.f5853a.f5821b;
        synchronized (mVarA) {
            try {
                d0Var = (d0) mVarA.f5813a.get(str);
            } catch (Exception e10) {
                AdLog.e(e10.getMessage(), e10);
            }
            if (d0Var != null) {
                MaxAd maxAd = d0Var.f5749c;
                MaxNativeAdLoader maxNativeAdLoader2 = d0Var.f5747a;
                maxNativeAdLoader2.destroy(maxAd);
                maxNativeAdLoader2.destroy();
                mVarA.f5813a.remove(str);
                AdLog.d("OktMaxNativeCacheUtil", "destroy " + str + Z7.f30794r + mVarA.f5813a.toString());
            }
        }
    }
}
