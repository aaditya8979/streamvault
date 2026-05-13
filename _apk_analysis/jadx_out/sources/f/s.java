package f;

import android.app.Activity;
import com.yk.e.AbstractC4634il;
import com.yk.e.callBack.MainBannerCallBack;
import com.yk.e.util.AdLog;
import j.p1;

/* JADX INFO: loaded from: classes5.dex */
public final class s extends x {
    public MainBannerCallBack D;
    public d.q E;
    public String F = "";
    public String G = "";
    public final e H = new e(this);
    public final b0 I = new b0(this);

    @Override // f.x
    public final void B(Activity activity, p1 p1Var) {
        this.D = p1Var;
        i.e eVar = this.f71962k;
        this.F = eVar.f63659a;
        this.G = eVar.f63661c;
        AdLog.d("appID " + this.F + ", posID " + this.G);
        this.E = new d.q(activity);
        AbstractC4634il.IL1Iii(activity.getApplicationContext(), new c(this, activity), this.F);
    }
}
