package yads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class dc1 extends po {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Context f88812w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final yo2 f88813x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Map f88814y;

    public dc1(Context context, String str, yo2 yo2Var, Map map, c71 c71Var) {
        super(context, str, c71Var);
        this.f88812w = context;
        this.f88813x = yo2Var;
        this.f88814y = map;
    }

    @Override // yads.po, yads.po2
    public final im3 a(im3 im3Var) {
        boolean z10 = ad1.f87661a;
        return im3Var;
    }

    @Override // yads.po2
    public final vp2 a(e82 e82Var) {
        if (200 != e82Var.f89157a) {
            return new vp2(new h4(m4.f92243e, e82Var));
        }
        j80 j80Var = (j80) this.f88813x.a(e82Var);
        return j80Var != null ? new vp2(j80Var, v11.a(e82Var)) : new vp2(new h4(m4.f92241c, e82Var));
    }

    @Override // yads.po2
    public final Map d() {
        HashMap map = new HashMap();
        Context context = this.f88812w;
        Object obj = dw2.f89000j;
        nt2 nt2VarA = cw2.a().a(context);
        if (nt2VarA != null && nt2VarA.f92986z) {
            u11 u11Var = u11.f95481c;
            map.put("encrypted-request", "1");
        }
        map.putAll(this.f88814y);
        return map;
    }
}
