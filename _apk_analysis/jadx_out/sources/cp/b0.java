package cp;

import Lil.I1I;
import android.app.Activity;
import android.view.View;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yk.e.MainSDK;
import com.yk.e.callBack.MainNativeAdCallBack;
import com.yk.e.util.AdLog;
import j.l0;
import j.s0;
import j.y1;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public final class b0 extends l0 {
    public final Activity E;
    public final MainNativeAdCallBack F;
    public int G;
    public int H;

    public b0(Activity activity, String str, MainNativeAdCallBack mainNativeAdCallBack) {
        super(activity, "信息流", str, mainNativeAdCallBack);
        this.E = activity;
        this.F = mainNativeAdCallBack;
    }

    @Override // j.l0
    public final a.a a() {
        return a.f.i();
    }

    @Override // j.l0
    public final void b(int i10, String str) {
        super.b(i10, str);
        MainNativeAdCallBack mainNativeAdCallBack = this.F;
        if (mainNativeAdCallBack != null) {
            mainNativeAdCallBack.onAdFail(i10, str);
        }
    }

    @Override // j.l0
    public final I1I f(int i10, Object... objArr) {
        m mVar = new m(this);
        s0 s0Var = new s0(this.f71907a, this.f71908b, mVar);
        I1I i1i = new I1I();
        s0Var.setLoadTimeOut(this.f71929w);
        s0Var.loadAd();
        int i11 = this.G;
        int i12 = this.H;
        s0Var.f72011b = i11;
        s0Var.f72012c = i12;
        s0Var.startLoadData((Integer) objArr[0], (JSONArray) objArr[1]);
        s0Var.setRefreshAdCache(this.f71916j);
        mVar.f59391a = s0Var;
        mVar.f59392b = this;
        mVar.f59393c = objArr.length >= 3 ? ((Boolean) objArr[2]).booleanValue() : false;
        return i1i;
    }

    @Override // j.l0
    public final void o(y1 y1Var, i.b bVar) {
        super.o(y1Var, bVar);
        try {
            ((s0) y1Var).f72014e = new n(this);
            View viewG = g(this.E, bVar.f63639e, IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW, 465, this.G, this.H, false);
            MainNativeAdCallBack mainNativeAdCallBack = this.F;
            if (mainNativeAdCallBack != null) {
                mainNativeAdCallBack.onAdLoaded(viewG);
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage());
            p(e10);
        }
    }

    @Override // j.l0
    public final int t() {
        return 11;
    }

    @Override // j.l0
    public final void y() {
        super.y();
        MainSDK.getInstance().reqNaturalAd(this.f71907a, 11, this.f71910d, this.f71908b, new g(this));
    }
}
