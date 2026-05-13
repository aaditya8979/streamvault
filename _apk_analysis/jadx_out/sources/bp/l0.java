package bp;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.yk.e.util.AdLog;
import com.yk.e.util.UsLocalSaveHelper;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends MaxNativeAdListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0 f5810g;

    public l0(n0 n0Var) {
        this.f5810g = n0Var;
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public final void onNativeAdClicked(MaxAd maxAd) {
        super.onNativeAdClicked(maxAd);
        this.f5810g.f5834o.onAdClick();
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public final void onNativeAdExpired(MaxAd maxAd) {
        super.onNativeAdExpired(maxAd);
        n0.c(this.f5810g, "onNativeAdExpired");
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public final void onNativeAdLoadFailed(String str, MaxError maxError) {
        super.onNativeAdLoadFailed(str, maxError);
        n0 n0Var = this.f5810g;
        if (n0Var.f5836q == 0) {
            n0Var.d("applovin native retry");
            n0 n0Var2 = this.f5810g;
            n0Var2.b(n0Var2.f5820a);
            this.f5810g.f5836q++;
            return;
        }
        n0.c(n0Var, maxError.getCode() + ", " + maxError.getMessage());
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public final void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        super.onNativeAdLoaded(maxNativeAdView, maxAd);
        try {
            n0 n0Var = this.f5810g;
            if (n0Var.f5839t) {
                return;
            }
            n0Var.f5838s = true;
            if (maxAd.getNativeAd() != null && maxAd.getNativeAd().isExpired()) {
                this.f5810g.f5835p.destroy(maxAd);
                n0 n0Var2 = this.f5810g;
                n0Var2.f5835p.loadAd(n0.a(n0Var2).f59490b);
                return;
            }
            n0 n0Var3 = this.f5810g;
            if (n0Var3.f5840u) {
                d0 d0Var = new d0();
                d0Var.f5747a = n0Var3.f5835p;
                d0Var.f5749c = maxAd;
                d0Var.f5748b = maxNativeAdView;
                m mVarA = m.a();
                String str = this.f5810g.f5821b;
                mVarA.getClass();
                try {
                    mVarA.f5813a.putIfAbsent(str, d0Var);
                    AdLog.d("OktMaxNativeCacheUtil", "putCache, cacheAdMap " + mVarA.f5813a.toString());
                } catch (Exception e10) {
                    AdLog.e(e10.getMessage(), e10);
                }
                this.f5810g.f5840u = false;
                return;
            }
            w0 w0Var = n0Var3.f5829j;
            if (w0Var != null) {
                w0Var.b(maxAd);
            }
            n0 n0Var4 = this.f5810g;
            n0Var4.f5837r = maxAd;
            double revenue = maxAd.getRevenue();
            w0 w0Var2 = n0Var4.f5829j;
            if (w0Var2 != null) {
                w0Var2.c(revenue);
            }
            h.a(maxNativeAdView);
            this.f5810g.f5834o.onAdLoaded(maxNativeAdView);
            if (!UsLocalSaveHelper.getInstance().useNativeCache() || UsLocalSaveHelper.getInstance().isClientBidding()) {
                return;
            }
            this.f5810g.d("load next max native ad");
            n0 n0Var5 = this.f5810g;
            n0Var5.f5835p.loadAd(n0.a(n0Var5).f59490b);
            this.f5810g.f5840u = true;
        } catch (Exception e11) {
            AdLog.e(e11.getMessage(), e11);
            n0.c(this.f5810g, e11.getMessage());
        }
    }
}
