package f;

import android.app.Activity;
import bp.n0;
import com.applovin.mediation.MaxAd;
import com.yk.e.callBack.MainBannerCallBack;
import com.yk.e.util.AdLog;
import j.p1;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends x {
    public n0 D;
    public MainBannerCallBack E;

    @Override // f.x
    public final void B(Activity activity, p1 p1Var) {
        int i10;
        int i11;
        try {
            i.e eVar = this.f71962k;
            String str = eVar.f63661c;
            this.E = p1Var;
            n0 n0Var = new n0(activity, this.f71960i, this.f71957f, str, eVar, this.f71975x, new h0(this));
            this.D = n0Var;
            n0Var.f5841v = this.f71970s;
            i.e eVar2 = this.f71962k;
            if (eVar2 == null || (i10 = eVar2.f63662d) == 0) {
                i10 = 1000;
            }
            if (eVar2 == null || (i11 = eVar2.f63663e) == 0) {
                i11 = 570;
            }
            int i12 = this.B;
            int i13 = this.C;
            n0Var.f5824e = i10;
            n0Var.f5825f = i11;
            n0Var.f5826g = i12;
            n0Var.f5827h = i13;
            n0Var.f5829j = new e0(this);
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
            n0 n0Var = this.D;
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
