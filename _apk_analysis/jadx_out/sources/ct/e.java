package ct;

import android.app.Activity;
import com.yk.e.AbstractC4634il;
import com.yk.e.callBack.MainMaterialCallback;
import com.yk.e.util.AdLog;
import j.l1;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends u {
    public Activity F;
    public MainMaterialCallback G;
    public d.i H;
    public String I = "";
    public String J = "";
    public final m K = new m(this);
    public final s L = new s(this);

    @Override // ct.u
    public final void B(Activity activity, l1 l1Var) {
        this.F = activity;
        this.G = l1Var;
        i.e eVar = this.f71962k;
        this.I = eVar.f63659a;
        this.J = eVar.f63661c;
        AdLog.d("appID " + this.I + ", posID " + this.J);
        AbstractC4634il.IL1Iii(activity.getApplicationContext(), this.I, new r0(this, activity));
    }

    @Override // ct.u
    public final void C() {
        try {
            d.i iVar = this.H;
            if (iVar != null) {
                bp.h.a(iVar.f59496a);
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }
}
