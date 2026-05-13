package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class rj2 implements qf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f94471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f94472b;

    public rj2(Context context, je3 je3Var) {
        this.f94471a = context.getApplicationContext();
        this.f94472b = a(je3Var);
    }

    public static List a(je3 je3Var) {
        b20 b20Var = je3Var.f91194a;
        long j10 = b20Var.f87888i;
        List list = b20Var.f87883d;
        ArrayList<x73> arrayList = new ArrayList();
        for (Object obj : list) {
            if (tn.p.f("progress", ((x73) obj).f96651a)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (x73 x73Var : arrayList) {
            xc3 xc3Var = x73Var.f96653c;
            qj2 qj2Var = null;
            if (xc3Var != null) {
                wc3 wc3Var = wc3.f96349b;
                wc3 wc3Var2 = xc3Var.f96711b;
                Long lValueOf = wc3Var == wc3Var2 ? Long.valueOf((long) xc3Var.f96712c) : wc3.f96350c == wc3Var2 ? Long.valueOf((long) ((xc3Var.f96712c / 100) * j10)) : null;
                if (lValueOf != null) {
                    qj2Var = new qj2(x73Var.f96652b, lValueOf.longValue());
                }
            }
            if (qj2Var != null) {
                arrayList2.add(qj2Var);
            }
        }
        return cn.f0.j1(arrayList2);
    }

    @Override // yads.qf3
    public final void a(long j10, long j11) {
        Iterator it = this.f94472b.iterator();
        while (it.hasNext()) {
            qj2 qj2Var = (qj2) it.next();
            if (qj2Var.f94053b <= j11) {
                di3 di3VarA = di3.f88863c.a(this.f94471a);
                di3VarA.f88866b.a(new bd2(di3VarA.f88865a, qj2Var.f94052a, new om3()));
                it.remove();
            }
        }
    }
}
