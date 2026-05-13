package e;

import android.app.Activity;
import bp.n0;
import com.applovin.mediation.MaxAd;
import com.yk.e.callBack.MainWdNativeAdCallback;
import com.yk.e.util.AdLog;
import com.yk.e.util.IDUtil;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends c0 {
    public n0 L;
    public MainWdNativeAdCallback M;

    @Override // e.c0
    public final void B(Activity activity, j.d0 d0Var) {
        try {
            i.e eVar = this.f71962k;
            String str = eVar.f63661c;
            this.M = d0Var;
            n0 n0Var = new n0(activity, this.f71960i, this.f71957f, str, eVar, this.f71975x, new j(this));
            this.L = n0Var;
            n0Var.f5841v = this.f71970s;
            int dimensionPixelOffset = activity.getResources().getDimensionPixelOffset(IDUtil.getDimen(activity, "dp_135"));
            n0 n0Var2 = this.L;
            n0Var2.f5824e = -1;
            n0Var2.f5825f = dimensionPixelOffset;
            n0Var2.f5826g = -1;
            n0Var2.f5827h = dimensionPixelOffset;
            n0Var2.f5829j = new t(this);
            n0Var2.f5833n = true;
            n0Var2.b(activity);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            q(e10);
        }
    }

    @Override // j.n0
    public final boolean b() {
        return true;
    }

    @Override // j.n0
    public final boolean t() {
        MaxAd maxAd;
        try {
            n0 n0Var = this.L;
            if (n0Var == null || (maxAd = n0Var.f5837r) == null || maxAd.getNativeAd() == null) {
                return true;
            }
            return maxAd.getNativeAd().isExpired();
        } catch (Exception e10) {
            b.d.a(e10, new StringBuilder("isExpired error, msg = "), e10);
            return true;
        }
    }
}
