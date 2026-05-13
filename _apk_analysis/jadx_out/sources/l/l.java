package l;

import android.app.Activity;
import bp.n0;
import com.applovin.mediation.MaxAd;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yk.e.callBack.MainNativeAdCallBack;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends r {
    public MainNativeAdCallBack B;
    public n0 C;

    @Override // l.r
    public final void B(Activity activity, int i10, int i11, j.z zVar) {
        int i12;
        int i13;
        try {
            i.e eVar = this.f71962k;
            String str = eVar.f63661c;
            this.B = zVar;
            n0 n0Var = new n0(activity, this.f71960i, this.f71957f, str, eVar, this.f71975x, new v(this));
            this.C = n0Var;
            n0Var.f5841v = this.f71970s;
            i.e eVar2 = this.f71962k;
            if (eVar2 == null || (i12 = eVar2.f63662d) == 0) {
                i12 = IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW;
            }
            if (eVar2 == null || (i13 = eVar2.f63663e) == 0) {
                i13 = 465;
            }
            n0Var.f5824e = i12;
            n0Var.f5825f = i13;
            n0Var.f5826g = i10;
            n0Var.f5827h = i11;
            n0Var.f5829j = new c0(this);
            n0Var.b(activity);
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
            n0 n0Var = this.C;
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
