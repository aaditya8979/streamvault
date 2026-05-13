package yads;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class ax implements t83 {
    public static ix b(rg1 rg1Var, sw swVar) {
        ix exVar;
        String str = swVar.f94959b;
        if (str == null) {
            return null;
        }
        try {
            int iOrdinal = swVar.ordinal();
            if (iOrdinal == 0) {
                exVar = new ex(((tg1) rg1Var).c(str));
            } else if (iOrdinal == 1) {
                exVar = new fx(((tg1) rg1Var).c(str));
            } else if (iOrdinal == 2) {
                exVar = new dx(((tg1) rg1Var).a(str, false));
            } else if (iOrdinal == 3) {
                exVar = new gx(((tg1) rg1Var).c(str));
            } else {
                if (iOrdinal != 4) {
                    if (iOrdinal == 5) {
                        return null;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                exVar = new hx(((tg1) rg1Var).c(str));
            }
            return exVar;
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // yads.t83
    public final ix a(rg1 rg1Var, String str) {
        sw swVar;
        tg1 tg1Var = (tg1) rg1Var;
        if (!tg1Var.a(str)) {
            str = null;
        }
        if (str != null) {
            sw.f94957d.getClass();
            sw[] swVarArrValues = sw.values();
            int length = swVarArrValues.length;
            for (int i10 = 0; i10 < length; i10++) {
                swVar = swVarArrValues[i10];
                if (tn.p.f(swVar.f94959b, str)) {
                    break;
                }
            }
            swVar = null;
        } else {
            swVar = null;
        }
        if (swVar != null) {
            return b(tg1Var, swVar);
        }
        return null;
    }

    @Override // yads.t83
    public final ix a(rg1 rg1Var, sw swVar) {
        String str = swVar.f94959b;
        if (str == null || !((tg1) rg1Var).a(str)) {
            swVar = null;
        }
        if (swVar != null) {
            return b(rg1Var, swVar);
        }
        return null;
    }
}
