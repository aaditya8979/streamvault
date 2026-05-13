package cp;

import Lil.I1I;
import android.app.Activity;
import android.view.View;
import com.yk.e.MainSDK;
import com.yk.e.callBack.MainWdNativeAdCallback;
import com.yk.e.object.WorldNativeImgParams;
import com.yk.e.object.WorldNativeLyParams;
import com.yk.e.object.WorldNativeTagParams;
import com.yk.e.object.WorldNativeTvParams;
import com.yk.e.util.AdLog;
import com.yk.e.util.IDUtil;
import j.l0;
import j.m2;
import j.y1;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends l0 {
    public final Activity E;
    public final MainWdNativeAdCallback F;
    public int G;
    public int H;
    public WorldNativeTvParams I;
    public WorldNativeTvParams J;
    public WorldNativeTvParams K;
    public WorldNativeImgParams L;
    public WorldNativeLyParams M;
    public WorldNativeLyParams N;
    public WorldNativeLyParams O;
    public WorldNativeTagParams P;

    public h(Activity activity, String str, MainWdNativeAdCallback mainWdNativeAdCallback) {
        super(activity, "文案信息流", str, mainWdNativeAdCallback);
        this.E = activity;
        this.F = mainWdNativeAdCallback;
    }

    @Override // j.l0
    public final a.a a() {
        if (a.j.f3437c == null) {
            synchronized (a.j.class) {
                if (a.j.f3437c == null) {
                    a.j.f3437c = new a.j();
                }
            }
        }
        return a.j.f3437c;
    }

    @Override // j.l0
    public final void b(int i10, String str) {
        super.b(i10, str);
        MainWdNativeAdCallback mainWdNativeAdCallback = this.F;
        if (mainWdNativeAdCallback != null) {
            mainWdNativeAdCallback.onAdFail(i10, str);
        }
    }

    @Override // j.l0
    public final I1I f(int i10, Object... objArr) {
        p pVar = new p(this);
        m2 m2Var = new m2(this.f71907a, this.f71908b, pVar);
        I1I i1i = new I1I();
        m2Var.setLoadTimeOut(this.f71929w);
        m2Var.loadAd();
        int i11 = this.G;
        int i12 = this.H;
        m2Var.f71941c = i11;
        m2Var.f71942d = i12;
        m2Var.f71949k = this.N;
        m2Var.f71951m = this.P;
        m2Var.f71950l = this.O;
        m2Var.f71948j = this.M;
        m2Var.f71946h = this.K;
        m2Var.f71947i = this.L;
        m2Var.f71945g = this.J;
        m2Var.f71944f = this.I;
        m2Var.startLoadData((Integer) objArr[0], (JSONArray) objArr[1]);
        m2Var.setRefreshAdCache(this.f71916j);
        pVar.f59398a = m2Var;
        pVar.f59399b = this;
        return i1i;
    }

    @Override // j.l0
    public final void o(y1 y1Var, i.b bVar) {
        super.o(y1Var, bVar);
        try {
            ((m2) y1Var).f71943e = new d0(this);
            View view = bVar.f63639e;
            int dimensionPixelOffset = this.E.getResources().getDimensionPixelOffset(IDUtil.getDimen(this.E, "dp_135"));
            View viewG = g(this.E, view, -1, dimensionPixelOffset, -1, dimensionPixelOffset, true);
            MainWdNativeAdCallback mainWdNativeAdCallback = this.F;
            if (mainWdNativeAdCallback != null) {
                mainWdNativeAdCallback.onAdLoaded(viewG);
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            p(e10);
        }
    }

    @Override // j.l0
    public final int t() {
        return 29;
    }

    @Override // j.l0
    public final void y() {
        super.y();
        MainSDK.getInstance().reqWorldNativeAd(this.f71907a, 29, this.f71910d, this.f71908b, new v(this));
    }
}
