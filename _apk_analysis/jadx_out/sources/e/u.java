package e;

import android.app.Activity;
import com.yk.e.AbstractC4634il;
import com.yk.e.callBack.MainWdNativeAdCallback;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends c0 {
    public Activity L;
    public MainWdNativeAdCallback M;
    public String N = "";
    public String O = "";
    public final y P = new y(this);

    @Override // e.c0
    public final void B(Activity activity, j.d0 d0Var) {
        this.L = activity;
        this.M = d0Var;
        i.e eVar = this.f71962k;
        this.N = eVar.f63659a;
        this.O = eVar.f63661c;
        AdLog.d("appID " + this.N + ", posID " + this.O);
        AbstractC4634il.IL1Iii(activity.getApplicationContext(), this.N, new g0(this, activity));
    }
}
