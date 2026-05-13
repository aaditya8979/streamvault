package jl;

import jl.c;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: OutgoingContent.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class d {
    public static final boolean a(@NotNull c cVar) {
        p.k(cVar, "<this>");
        if (cVar instanceof c.AbstractC0854c) {
            return true;
        }
        if (cVar instanceof c.b) {
            return a(((c.b) cVar).d());
        }
        return false;
    }
}
