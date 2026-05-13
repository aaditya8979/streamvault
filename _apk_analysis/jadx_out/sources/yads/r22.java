package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class r22 implements sy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz1 f94263a;

    public /* synthetic */ r22(lu2 lu2Var) {
        this(new yz1(lu2Var));
    }

    public r22(yz1 yz1Var) {
        this.f94263a = yz1Var;
    }

    @Override // yads.sy1
    public final void a(Context context, ry1 ry1Var, mi2 mi2Var, qy1 qy1Var, xz1 xz1Var, fz1 fz1Var, hz1 hz1Var) {
        List list = ry1Var.f94647a.f88690a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oy1 oy1VarA = this.f94263a.a(context, ry1Var, mi2Var, qy1Var, xz1Var, fz1Var, (fy1) it.next());
            if (oy1VarA != null) {
                arrayList.add(oy1VarA);
            }
        }
        if (arrayList.isEmpty()) {
            hz1Var.a(h9.f90282a);
        } else {
            hz1Var.a(arrayList);
        }
    }
}
