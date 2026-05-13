package l;

import android.app.Activity;
import com.yk.e.AbstractC4634il;
import com.yk.e.callBack.MainNativeAdCallBack;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes11.dex */
public final class z extends r {
    public Activity B;
    public MainNativeAdCallBack C;
    public int D;
    public int E;
    public String F = "";
    public String G = "";
    public final g0 H = new g0(this);

    @Override // l.r
    public final void B(Activity activity, int i10, int i11, j.z zVar) {
        this.B = activity;
        this.C = zVar;
        this.D = i10;
        this.E = i11;
        i.e eVar = this.f71962k;
        this.F = eVar.f63659a;
        this.G = eVar.f63661c;
        AdLog.d("appID " + this.F + ", posID " + this.G);
        AbstractC4634il.IL1Iii(activity.getApplicationContext(), this.F, new h0(this, activity));
    }
}
