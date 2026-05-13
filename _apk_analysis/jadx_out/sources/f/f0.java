package f;

import android.app.Activity;
import com.yk.e.AbstractC4634il;
import com.yk.e.callBack.MainBannerCallBack;
import j.p1;
import sg.bigo.ads.api.NativeAd;

/* JADX INFO: loaded from: classes5.dex */
public final class f0 extends x {
    public MainBannerCallBack D;
    public NativeAd E;
    public String F = "";
    public final g0 G = new g0(this);

    @Override // f.x
    public final void B(Activity activity, p1 p1Var) {
        this.D = p1Var;
        i.e eVar = this.f71962k;
        String str = eVar.f63659a;
        this.F = eVar.f63661c;
        AbstractC4634il.IL1Iii(activity, str, new h(this, activity));
    }
}
