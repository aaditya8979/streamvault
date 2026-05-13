package yads;

import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class h11 extends zn {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ma2 f90194w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final hm2 f90195x;

    public /* synthetic */ h11(Context context, d4 d4Var, lu2 lu2Var, w5 w5Var) {
        this(context, d4Var, lu2Var, w5Var, z10.a((rm0) ((iu3) lu2Var).a()), new ma2(), hm2.f90465b.a());
    }

    public h11(Context context, d4 d4Var, lu2 lu2Var, w5 w5Var, p000do.l0 l0Var, ma2 ma2Var, hm2 hm2Var) {
        super(context, w5Var, d4Var, lu2Var, l0Var);
        this.f90194w = ma2Var;
        this.f90195x = hm2Var;
    }

    @Override // yads.zn
    public final pn a(String str, String str2) {
        JSONObject jSONObjectA;
        Context context = this.f97676a;
        d4 d4Var = this.f97678c;
        at1 at1VarA = ((iu3) this.f97679d).a();
        ey2.f89408a.getClass();
        j4 j4Var = new j4(context, d4Var, at1VarA, str, str2, this, this, dy2.a(context), new u02(new b12(context, at1VarA)), new c12());
        g9 g9Var = this.f97678c.f88744e;
        String strOptString = null;
        String str3 = g9Var != null ? g9Var.f89884h : null;
        this.f90194w.getClass();
        if (str3 != null && (jSONObjectA = ge1.a(str3)) != null && jSONObjectA.has("response")) {
            strOptString = jSONObjectA.optString("response");
        }
        if (strOptString != null) {
            hm2 hm2Var = this.f90195x;
            hm2Var.getClass();
            synchronized (hm2.f90466c) {
                hm2Var.f90468a.put(j4Var, strOptString);
                bn.r rVar = bn.r.f5635a;
            }
        }
        return j4Var;
    }
}
