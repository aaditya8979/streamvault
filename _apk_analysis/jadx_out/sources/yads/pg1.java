package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class pg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kg f93589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cv2 f93590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pr1 f93591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ez f93592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x30 f93593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final jh1 f93594f;

    public pg1(kg kgVar, cv2 cv2Var, pr1 pr1Var, ez ezVar, x30 x30Var, jh1 jh1Var) {
        this.f93589a = kgVar;
        this.f93590b = cv2Var;
        this.f93591c = pr1Var;
        this.f93592d = ezVar;
        this.f93593e = x30Var;
        this.f93594f = jh1Var;
    }

    public final b80 a() {
        t80 t80Var;
        String strD;
        String strC;
        c80 c80Var;
        m50 m50VarA = this.f93589a.a();
        cv2 cv2Var = this.f93590b;
        au1 au1Var = cv2Var.f88630b;
        Context context = cv2Var.f88629a;
        au1Var.getClass();
        zt1 zt1VarA = au1.a(context);
        boolean z10 = false;
        if (tn.p.f(zt1VarA, xt1.f96866a)) {
            t80Var = new t80(true, cn.w.m());
        } else {
            if (!(zt1VarA instanceof yt1)) {
                throw new NoWhenBranchMatchedException();
            }
            List list = ((yt1) zt1VarA).f97291a;
            ArrayList arrayList = new ArrayList(cn.x.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ub1) it.next()).getMessage());
            }
            t80Var = new t80(false, arrayList);
        }
        pr1 pr1Var = this.f93591c;
        pr1Var.getClass();
        String str = pq1.f93719d;
        ArrayList arrayListA = pr1Var.f93734a.a(mq1.a());
        ez ezVar = this.f93592d;
        boolean zA = ezVar.f89409a.a();
        Boolean boolB = ezVar.f89409a.b();
        Boolean boolD = ezVar.f89409a.d();
        String strB = ((zw) ezVar.f89410b).b();
        if ((strB != null && !bo.d0.u0(strB)) || (((strD = ((zw) ezVar.f89410b).d()) != null && !bo.d0.u0(strD)) || ((strC = ((zw) ezVar.f89410b).c()) != null && !bo.d0.u0(strC)))) {
            z10 = true;
        }
        t50 t50Var = new t50(zA, boolB, boolD, z10);
        u70 u70Var = new u70(this.f93593e.f96621a.c());
        jh1 jh1Var = this.f93594f;
        jh1Var.getClass();
        synchronized (jh1.f91226c) {
            c80Var = !eu1.f89374b ? null : new c80(jh1Var.f91227a.b(), jh1Var.f91228b.b());
        }
        return new b80(m50VarA, t80Var, arrayListA, t50Var, u70Var, c80Var);
    }
}
