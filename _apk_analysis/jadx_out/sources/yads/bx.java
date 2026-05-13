package yads;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class bx implements t83 {
    public static ix b(rg1 rg1Var, sw swVar) {
        ix exVar;
        String str = swVar.f94960c;
        try {
            int iOrdinal = swVar.ordinal();
            if (iOrdinal != 0) {
                boolean z10 = true;
                if (iOrdinal == 1) {
                    int iA = ((tg1) rg1Var).a(-1, str);
                    Integer numValueOf = Integer.valueOf(iA);
                    if (iA == -1) {
                        numValueOf = null;
                    }
                    exVar = new fx(numValueOf != null ? String.valueOf(numValueOf.intValue()) : null);
                } else if (iOrdinal == 2) {
                    if (((tg1) rg1Var).a(-1, str) == -1) {
                        z10 = false;
                    }
                    exVar = new dx(z10);
                } else if (iOrdinal == 3) {
                    exVar = new gx(((tg1) rg1Var).c(str));
                } else if (iOrdinal == 4) {
                    exVar = new hx(((tg1) rg1Var).c(str));
                } else {
                    if (iOrdinal != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    exVar = new cx(((tg1) rg1Var).c(str));
                }
            } else {
                exVar = new ex(((tg1) rg1Var).c(str));
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
                if (tn.p.f(swVar.f94960c, str)) {
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
        tg1 tg1Var = (tg1) rg1Var;
        if (!tg1Var.a(swVar.f94960c)) {
            swVar = null;
        }
        if (swVar != null) {
            return b(tg1Var, swVar);
        }
        return null;
    }
}
