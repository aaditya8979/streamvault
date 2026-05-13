package yads;

import android.view.View;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class l12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iv f91861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yf0 f91862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y12 f91863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f91864d;

    public l12(yf0 yf0Var, y12 y12Var, Map map) {
        this.f91861a = iv.f90999a;
        this.f91862b = yf0Var;
        this.f91863c = y12Var;
        this.f91864d = map;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ l12(z12 z12Var, d4 d4Var, lu2 lu2Var, mi2 mi2Var, x51 x51Var, xz1 xz1Var, cj cjVar, d42 d42Var, h32 h32Var, v9 v9Var, l72 l72Var, fz1 fz1Var, ao1 ao1Var, my2 my2Var, t20 t20Var, yf0 yf0Var) {
        y12 y12VarA = z12Var.a();
        this(yf0Var, y12VarA, new ri(y12VarA, mi2Var, new tn1(cjVar, d4Var, x51Var, xz1Var.c(), fz1Var, ao1Var, new qn3(y12VarA), my2Var), d42Var, h32Var, v9Var, l72Var, ((iu3) lu2Var).a(), t20Var).a());
    }

    public final pi a(oi oiVar) {
        if (oiVar != null) {
            return (pi) this.f91864d.get(oiVar.f93229a);
        }
        return null;
    }

    public final void a() {
        for (pi piVar : this.f91864d.values()) {
            if (piVar != null) {
                piVar.a();
            }
        }
    }

    public final View b() {
        return this.f91863c.a();
    }
}
