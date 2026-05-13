package yads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nl1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ll1 f92883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jq f92884b;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ nl1(Context context) {
        ll1 ll1VarA = new nm2(context).a();
        this(ll1VarA, new jq(ll1VarA));
    }

    public nl1(ll1 ll1Var, jq jqVar) {
        this.f92883a = ll1Var;
        this.f92884b = jqVar;
    }

    public final kl1 a(List list) {
        Iterator it = list.iterator();
        double d10 = -1.0d;
        kl1 kl1Var = null;
        while (it.hasNext()) {
            kl1 kl1Var2 = (kl1) it.next();
            double d11 = tn.p.f("video/mp4", kl1Var2.f91641d) ? 1.5d : 1.0d;
            jq jqVar = this.f92884b;
            jqVar.getClass();
            int i10 = kl1Var2.f91646i;
            if (i10 == 0) {
                int i11 = kl1Var2.f91645h * kl1Var2.f91644g;
                ll1 ll1Var = jqVar.f91328a;
                i10 = (int) ((i11 / (ll1Var.f92022a * ll1Var.f92023b)) * ll1Var.f92024c);
            }
            int i12 = this.f92883a.f92024c;
            double dAbs = d11 / ((((int) Math.max(0.0d, i10)) < 100 ? 10.0d : ((double) ((int) Math.abs(i12 - r9))) / ((double) i12)) + 1.0d);
            if (dAbs > d10) {
                kl1Var = kl1Var2;
                d10 = dAbs;
            }
        }
        return kl1Var;
    }
}
