package com.inmobi.media;

import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlinx.coroutines.g;

/* JADX INFO: loaded from: classes8.dex */
public abstract class P4 {
    public static final p000do.l0 a(p000do.l0 l0Var) {
        tn.p.k(l0Var, "<this>");
        return kotlinx.coroutines.d.a(l0Var.getCoroutineContext().plus(p000do.t1.a((kotlinx.coroutines.g) l0Var.getCoroutineContext().get(kotlinx.coroutines.g.H8))));
    }

    public static final p000do.l0 a(p000do.l0 l0Var, p000do.i0 i0Var) {
        tn.p.k(l0Var, "<this>");
        kotlinx.coroutines.g gVar = (kotlinx.coroutines.g) l0Var.getCoroutineContext().get(kotlinx.coroutines.g.H8);
        p000do.w wVarA = gVar != null ? p000do.j2.a(gVar) : p000do.j2.b(null, 1, null);
        p000do.l0 l0VarA = kotlinx.coroutines.d.a(wVarA.plus(p000do.w0.c().M()).plus(i0Var));
        return l0VarA == null ? kotlinx.coroutines.d.a(wVarA.plus(p000do.w0.c().M())) : l0VarA;
    }

    public static final kotlinx.coroutines.g a(p000do.l0 l0Var, sn.p pVar) {
        tn.p.k(l0Var, "<this>");
        tn.p.k(pVar, "block");
        return p000do.i.d(l0Var, p000do.w0.c(), null, pVar, 2, null);
    }

    public static final void a(go.k kVar, p000do.l0 l0Var, AbstractC3305bc abstractC3305bc) {
        tn.p.k(kVar, "<this>");
        tn.p.k(l0Var, "scope");
        p000do.i.d(l0Var, null, null, new O4(kVar, abstractC3305bc, null), 3, null);
    }

    public static final void a(List list) {
        tn.p.k(list, "<this>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g.a.a((kotlinx.coroutines.g) it.next(), null, 1, null);
        }
        list.clear();
    }

    public static final void a(kotlinx.coroutines.c cVar, Object obj) {
        tn.p.k(cVar, "<this>");
        if (cVar.isActive()) {
            try {
                cVar.resumeWith(Result.m7534constructorimpl(obj));
            } catch (IllegalStateException unused) {
            }
        }
    }
}
