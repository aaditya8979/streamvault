package yads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class m52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qu3 f92270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k52 f92271b;

    public /* synthetic */ m52(Context context, ru3 ru3Var) {
        this(ru3Var.a(context), new k52());
    }

    public m52(qu3 qu3Var, k52 k52Var) {
        this.f92270a = qu3Var;
        this.f92271b = k52Var;
    }

    public final void a() {
        List listG1;
        qu3 qu3Var = this.f92270a;
        if (qu3Var != null) {
            synchronized (qu3Var.f94160b) {
                listG1 = cn.f0.g1(qu3Var.f94161c);
                qu3Var.f94161c.clear();
                bn.r rVar = bn.r.f5635a;
            }
            Iterator it = listG1.iterator();
            while (it.hasNext()) {
                qu3Var.f94159a.a((ld3) it.next());
            }
        }
    }
}
