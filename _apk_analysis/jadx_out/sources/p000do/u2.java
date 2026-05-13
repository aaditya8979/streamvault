package p000do;

import bn.r;
import hn.c;
import in.a;
import io.h;
import io.i;
import jn.f;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Yield.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class u2 {
    @Nullable
    public static final Object a(@NotNull c<? super r> cVar) {
        Object objG;
        d context = cVar.getContext();
        t1.k(context);
        c cVarD = IntrinsicsKt__IntrinsicsJvmKt.d(cVar);
        h hVar = cVarD instanceof h ? (h) cVarD : null;
        if (hVar == null) {
            objG = r.f5635a;
        } else {
            if (i.d(hVar.f71039e, context)) {
                hVar.m(context, r.f5635a);
            } else {
                t2 t2Var = new t2();
                d dVarPlus = context.plus(t2Var);
                r rVar = r.f5635a;
                hVar.m(dVarPlus, rVar);
                objG = (!t2Var.f59889b || i.e(hVar)) ? a.g() : rVar;
            }
            objG = a.g();
        }
        if (objG == a.g()) {
            f.c(cVar);
        }
        return objG == a.g() ? objG : r.f5635a;
    }
}
