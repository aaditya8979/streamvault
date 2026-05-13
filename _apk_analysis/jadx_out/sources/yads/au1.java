package yads;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class au1 {
    public static zt1 a(Context context) {
        mt1 mt1Var = new mt1(new pd3());
        e2 e2Var = new e2();
        ah ahVar = new ah(context);
        ub1[] ub1VarArr = new ub1[4];
        ub1 e10 = null;
        try {
            mt1Var.a(vt1.f96185b);
            e = null;
        } catch (ub1 e11) {
            e = e11;
        }
        ub1VarArr[0] = e;
        try {
            e2Var.a(context);
            e = null;
        } catch (ub1 e12) {
            e = e12;
        }
        ub1VarArr[1] = e;
        try {
            hc2.a(context);
            e = null;
        } catch (ub1 e13) {
            e = e13;
        }
        ub1VarArr[2] = e;
        try {
            ahVar.a();
        } catch (ub1 e14) {
            e10 = e14;
        }
        ub1VarArr[3] = e10;
        List listR = cn.w.r(ub1VarArr);
        return listR.isEmpty() ^ true ? new yt1(listR) : xt1.f96866a;
    }
}
