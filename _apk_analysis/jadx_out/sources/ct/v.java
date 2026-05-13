package ct;

import android.app.Activity;
import android.view.View;
import com.mbridge.msdk.out.MBNativeAdvancedHandler;
import com.yk.e.AbstractC4634il;
import com.yk.e.callBack.MainMaterialCallback;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import j.l1;

/* JADX INFO: loaded from: classes9.dex */
public final class v extends u {
    public Activity F;
    public MainMaterialCallback G;
    public MBNativeAdvancedHandler H;
    public View I;
    public String J = "";
    public String K = "";
    public String L = "";
    public String M = "";
    public final g0 N = new g0(this);
    public final c0 O = new c0(this);

    @Override // ct.u
    public final void B(Activity activity, l1 l1Var) {
        this.F = activity;
        this.G = l1Var;
        try {
            i.e eVar = this.f71962k;
            String str = eVar.f63660b;
            this.J = str;
            String str2 = eVar.f63659a;
            this.K = str2;
            String str3 = eVar.f63661c;
            this.L = str3;
            String str4 = eVar.f63664f;
            this.M = str4;
            AdLog.i("appKey " + str + ", appID " + str2 + ", placementId " + str3 + ", unitID " + str4);
            AbstractC4634il.IL1Iii(activity.getApplicationContext(), this.K, this.J, new p0(this, activity));
            Constant.addFragmentListener(activity, new o0(this));
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            v(e10.getMessage());
        }
    }

    @Override // ct.u
    public final void C() {
        try {
            View view = this.I;
            if (view != null) {
                bp.h.a(view);
            }
            MBNativeAdvancedHandler mBNativeAdvancedHandler = this.H;
            if (mBNativeAdvancedHandler != null) {
                mBNativeAdvancedHandler.release();
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }
}
