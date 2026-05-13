package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class rr2 implements bg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nr2 f94598a;

    public rr2(nr2 nr2Var) {
        this.f94598a = nr2Var;
    }

    @Override // yads.bg0
    public final List a(Context context, v9 v9Var, w02 w02Var, kz kzVar, b2 b2Var, z30 z30Var, z3 z3Var, ir2 ir2Var, k63 k63Var, ph0 ph0Var, gi0 gi0Var, j7 j7Var) {
        ki0 ki0Var;
        ArrayList arrayList = new ArrayList();
        nr2 nr2Var = this.f94598a;
        nr2Var.getClass();
        try {
            nr2Var.f92918e.getClass();
        } catch (Throwable unused) {
        }
        if (!oi0.a(context) || gi0Var == null) {
            ki0Var = null;
        } else {
            ki0Var = new ki0(gi0Var, nr2Var.f92914a, nr2Var.f92915b, nr2.a(v9Var, w02Var, b2Var, z3Var, ir2Var, k63Var, gi0Var, j7Var), nr2Var.f92916c, ph0Var, nr2Var.f92917d);
        }
        if (ki0Var != null) {
            arrayList.add(ki0Var);
        }
        return arrayList;
    }
}
