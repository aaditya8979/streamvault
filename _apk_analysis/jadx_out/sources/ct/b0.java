package ct;

import android.app.Activity;
import com.yk.e.AbstractC4634il;
import com.yk.e.callBack.MainMaterialCallback;
import com.yk.e.util.AdLog;
import j.l1;

/* JADX INFO: loaded from: classes11.dex */
public final class b0 extends u {
    public MainMaterialCallback F;
    public d.q G;
    public String H = "";
    public String I = "";
    public final j J = new j(this);
    public final o K = new o(this);

    @Override // ct.u
    public final void B(Activity activity, l1 l1Var) {
        this.F = l1Var;
        i.e eVar = this.f71962k;
        this.H = eVar.f63659a;
        this.I = eVar.f63661c;
        AdLog.d("appID " + this.H + ", posID " + this.I);
        this.G = new d.q(activity);
        AbstractC4634il.IL1Iii(activity.getApplicationContext(), new k0(this, activity), this.H);
    }

    @Override // ct.u
    public final void C() {
        try {
            d.q qVar = this.G;
            if (qVar != null) {
                bp.h.a(qVar.f59511c);
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }
}
