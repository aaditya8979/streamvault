package yads;

import com.ironsource.C3978d4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class jj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w41 f91236a;

    public /* synthetic */ jj() {
        this(new w41());
    }

    public jj(w41 w41Var) {
        this.f91236a = w41Var;
    }

    public final ArrayList a(List list, Map map) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oi oiVar = (oi) it.next();
            Object obj = oiVar.f93231c;
            String str = oiVar.f93230b;
            if (tn.p.f("image", str) && (obj instanceof u41)) {
                this.f91236a.getClass();
                if (w41.a((u41) obj, map)) {
                    arrayList.add(oiVar);
                }
            } else {
                if (tn.p.f(C3978d4.i.I0, str) && (obj instanceof on1)) {
                    on1 on1Var = (on1) obj;
                    if (on1Var.f93293c != null) {
                        tn.p.i(obj, "null cannot be cast to non-null type com.monetization.ads.network.model.MediaValue");
                        List list2 = on1Var.f93293c;
                        u41 u41Var = list2 != null ? (u41) cn.f0.v0(list2) : null;
                        sd3 sd3Var = on1Var.f93292b;
                        oj1 oj1Var = on1Var.f93291a;
                        if (sd3Var == null && oj1Var == null) {
                            if (u41Var != null) {
                                this.f91236a.getClass();
                                if (w41.a(u41Var, map)) {
                                }
                            }
                        }
                        arrayList.add(oiVar);
                    }
                }
                arrayList.add(oiVar);
            }
        }
        return arrayList;
    }
}
