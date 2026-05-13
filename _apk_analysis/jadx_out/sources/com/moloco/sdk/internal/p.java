package com.moloco.sdk.internal;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.o0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.p0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.u0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class p {
    @NotNull
    public static final o0 a(@NotNull com.moloco.sdk.internal.ortb.model.l lVar) {
        tn.p.k(lVar, "<this>");
        com.moloco.sdk.internal.ortb.model.n nVarA = lVar.a();
        String strC = nVarA != null ? nVarA.c() : null;
        String strE = lVar.e();
        String strD = lVar.d();
        String strI = lVar.i();
        String strJ = lVar.j();
        com.moloco.sdk.internal.ortb.model.n nVarA2 = lVar.a();
        Integer numB = nVarA2 != null ? nVarA2.b() : null;
        com.moloco.sdk.internal.ortb.model.p pVarG = lVar.g();
        r0 r0VarD = pVarG != null ? d(pVarG) : null;
        com.moloco.sdk.internal.ortb.model.m mVarF = lVar.f();
        p0 p0VarB = mVarF != null ? b(mVarF) : null;
        com.moloco.sdk.internal.ortb.model.q qVarH = lVar.h();
        return new o0(strC, strE, strD, strI, strJ, numB, r0VarD, p0VarB, qVarH != null ? e(qVarH) : null);
    }

    @NotNull
    public static final p0 b(@NotNull com.moloco.sdk.internal.ortb.model.m mVar) {
        tn.p.k(mVar, "<this>");
        Integer numD = mVar.d();
        String strB = mVar.b();
        com.moloco.sdk.internal.ortb.model.o oVarC = mVar.c();
        return new p0(numD, strB, oVarC != null ? c(oVarC) : null);
    }

    @NotNull
    public static final q0 c(@NotNull com.moloco.sdk.internal.ortb.model.o oVar) {
        List listM;
        tn.p.k(oVar, "<this>");
        List<com.moloco.sdk.internal.ortb.model.s> listD = oVar.d();
        if (listD != null) {
            listM = new ArrayList(cn.x.x(listD, 10));
            Iterator<T> it = listD.iterator();
            while (it.hasNext()) {
                listM.add(((com.moloco.sdk.internal.ortb.model.s) it.next()).b());
            }
        } else {
            listM = null;
        }
        if (listM == null) {
            listM = cn.w.m();
        }
        return new q0(oVar.c(), listM);
    }

    @NotNull
    public static final r0 d(@NotNull com.moloco.sdk.internal.ortb.model.p pVar) {
        tn.p.k(pVar, "<this>");
        Integer numH = pVar.h();
        String strE = pVar.e();
        Integer numD = pVar.d();
        Integer numF = pVar.f();
        com.moloco.sdk.internal.ortb.model.o oVarC = pVar.c();
        return new r0(numH, strE, numD, numF, oVarC != null ? c(oVarC) : null, pVar.g(), pVar.b());
    }

    @NotNull
    public static final u0 e(@NotNull com.moloco.sdk.internal.ortb.model.q qVar) {
        tn.p.k(qVar, "<this>");
        Float fE = qVar.e();
        String strD = qVar.d();
        if (strD == null) {
            strD = "#FFFFFF00";
        }
        String str = strD;
        String strB = qVar.b();
        if (strB == null) {
            strB = "#FF888888";
        }
        String str2 = strB;
        Integer numF = qVar.f();
        int iIntValue = numF != null ? numF.intValue() : 12;
        Integer numC = qVar.c();
        return new u0(fE, str, str2, iIntValue, numC != null ? numC.intValue() : 9);
    }
}
