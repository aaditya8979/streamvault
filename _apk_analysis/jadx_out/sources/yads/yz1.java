package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class yz1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k32 f97335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final py1 f97336b;

    public yz1(k32 k32Var, py1 py1Var) {
        this.f97335a = k32Var;
        this.f97336b = py1Var;
    }

    public /* synthetic */ yz1(lu2 lu2Var) {
        this(new k32(), new py1(lu2Var));
    }

    public final oy1 a(Context context, ry1 ry1Var, mi2 mi2Var, qy1 qy1Var, xz1 xz1Var, fz1 fz1Var, fy1 fy1Var) {
        if (fy1Var == null) {
            return null;
        }
        k32 k32Var = this.f97335a;
        cq2 cq2Var = fy1Var.f89726a;
        k32Var.getClass();
        int iOrdinal = cq2Var.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
            throw new NoWhenBranchMatchedException();
        }
        nz1 nz1Var = k32Var.f91472a;
        j72 j72VarA = xz1Var.f96941c.a(fy1Var);
        ix0 ix0Var = new ix0();
        w73 w73Var = qy1Var.f94216a;
        List list = fy1Var.f89733h;
        List list2 = ry1Var.f94647a.f88696g;
        w73Var.getClass();
        ArrayList arrayListA = w73.a(list, list2);
        w73 w73Var2 = qy1Var.f94216a;
        List list3 = fy1Var.f89732g;
        List list4 = ry1Var.f94647a.f88692c;
        w73Var2.getClass();
        ArrayList arrayListA2 = w73.a(list3, list4);
        List list5 = fy1Var.f89727b;
        l72 l72Var = new l72(list5, arrayListA, arrayListA2, fy1Var.f89728c, fy1Var.f89731f);
        py1 py1Var = this.f97336b;
        va vaVar = va.f96036b;
        py1Var.getClass();
        Object obj = h22.f90204a;
        h22 h22VarA = g22.a();
        ny1 ny1Var = new ny1(list5, h22VarA);
        up upVar = new up(ry1Var, new k12(ny1Var, ry1Var.f94648b), l72Var, j72VarA, xz1Var, new a6(ix0Var), new t12(context, ny1Var, h22VarA), py1Var.f93829a, fy1Var, vaVar);
        s02 s02Var = new s02(context, fy1Var, mi2Var, j72VarA);
        nz1Var.getClass();
        return new oy1(context, fy1Var, s02Var, mi2Var, upVar, fz1Var);
    }
}
