package e;

import android.app.Activity;
import com.yk.e.AbstractC4634il;
import com.yk.e.callBack.MainWdNativeAdCallback;
import sg.bigo.ads.api.NativeAd;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends c0 {
    public MainWdNativeAdCallback L;
    public NativeAd M;
    public String N = "";
    public final v O = new v(this);

    @Override // e.c0
    public final void B(Activity activity, j.d0 d0Var) {
        this.L = d0Var;
        i.e eVar = this.f71962k;
        String str = eVar.f63659a;
        this.N = eVar.f63661c;
        AbstractC4634il.IL1Iii(activity, str, new o(this, activity));
    }
}
