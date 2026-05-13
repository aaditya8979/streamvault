package bp;

import android.app.Activity;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.yk.e.inf.IComCallback;
import com.yk.e.util.AdLog;
import com.yk.e.util.UsLocalSaveHelper;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f5784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f5785b;

    public j(n0 n0Var, Activity activity) {
        this.f5785b = n0Var;
        this.f5784a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        n0.c(this.f5785b, str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        d0 d0Var;
        m mVarA = m.a();
        String str = this.f5785b.f5821b;
        synchronized (mVarA) {
            d0 d0Var2 = null;
            try {
                d0Var = (d0) mVarA.f5813a.get(str);
                if (d0Var != null) {
                    try {
                        AdLog.d("OktMaxNativeCacheUtil", "has cache, adPlcId " + str);
                        mVarA.f5813a.remove(str);
                    } catch (Exception e10) {
                        e = e10;
                        d0Var2 = d0Var;
                        AdLog.e(e.getMessage(), e);
                        d0Var = d0Var2;
                    }
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
        this.f5785b.d("useNativeCache " + UsLocalSaveHelper.getInstance().useNativeCache());
        if (d0Var != null && UsLocalSaveHelper.getInstance().useNativeCache()) {
            n0 n0Var = this.f5785b;
            n0Var.f5835p = d0Var.f5747a;
            MaxAd maxAd = d0Var.f5749c;
            n0Var.f5837r = maxAd;
            boolean zIsExpired = maxAd.getNativeAd() == null ? true : this.f5785b.f5837r.getNativeAd().isExpired();
            this.f5785b.d("nativeCache isExpired = " + zIsExpired);
            MaxNativeAdLoader maxNativeAdLoader = this.f5785b.f5835p;
            if (maxNativeAdLoader != null && !zIsExpired) {
                maxNativeAdLoader.setRevenueListener(new m0(this));
                n0 n0Var2 = this.f5785b;
                n0Var2.f5835p.setNativeAdListener(n0Var2.f5843x);
                this.f5785b.f5843x.onNativeAdLoaded(d0Var.f5748b, d0Var.f5749c);
                return;
            }
        }
        n0 n0Var3 = this.f5785b;
        n0Var3.f5835p = new MaxNativeAdLoader(n0Var3.f5842w, this.f5784a);
        this.f5785b.f5835p.setRevenueListener(new e(this));
        n0 n0Var4 = this.f5785b;
        n0Var4.f5835p.setNativeAdListener(n0Var4.f5843x);
        n0 n0Var5 = this.f5785b;
        n0Var5.f5835p.setPlacement(n0Var5.f5821b);
        n0 n0Var6 = this.f5785b;
        n0Var6.f5835p.loadAd(n0.a(n0Var6).f59490b);
    }
}
