package io;

import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.k2;

/* JADX INFO: compiled from: ThreadContext.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e0 f71285a = new e0("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final sn.p<Object, d.b, Object> f71286b = new sn.p() { // from class: io.i0
        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public final Object mo2invoke(Object obj, Object obj2) {
            return l0.d(obj, (d.b) obj2);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<k2<?>, d.b, k2<?>> f71287c = new sn.p() { // from class: io.j0
        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public final Object mo2invoke(Object obj, Object obj2) {
            return l0.e((k2) obj, (d.b) obj2);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<r0, d.b, r0> f71288d = new sn.p() { // from class: io.k0
        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public final Object mo2invoke(Object obj, Object obj2) {
            return l0.h((r0) obj, (d.b) obj2);
        }
    };

    public static final Object d(Object obj, d.b bVar) {
        if (!(bVar instanceof k2)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? bVar : Integer.valueOf(iIntValue + 1);
    }

    public static final k2<?> e(k2<?> k2Var, d.b bVar) {
        if (k2Var != null) {
            return k2Var;
        }
        if (bVar instanceof k2) {
            return (k2) bVar;
        }
        return null;
    }

    public static final void f(@NotNull kotlin.coroutines.d dVar, @Nullable Object obj) {
        if (obj == f71285a) {
            return;
        }
        if (obj instanceof r0) {
            ((r0) obj).b(dVar);
            return;
        }
        Object objFold = dVar.fold(null, f71287c);
        tn.p.i(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((k2) objFold).restoreThreadContext(dVar, obj);
    }

    @NotNull
    public static final Object g(@NotNull kotlin.coroutines.d dVar) {
        Object objFold = dVar.fold(0, f71286b);
        tn.p.h(objFold);
        return objFold;
    }

    public static final r0 h(r0 r0Var, d.b bVar) {
        if (bVar instanceof k2) {
            k2<?> k2Var = (k2) bVar;
            r0Var.a(k2Var, k2Var.updateThreadContext(r0Var.f71315a));
        }
        return r0Var;
    }

    @Nullable
    public static final Object i(@NotNull kotlin.coroutines.d dVar, @Nullable Object obj) {
        if (obj == null) {
            obj = g(dVar);
        }
        if (obj == 0) {
            return f71285a;
        }
        if (obj instanceof Integer) {
            return dVar.fold(new r0(dVar, ((Number) obj).intValue()), f71288d);
        }
        tn.p.i(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((k2) obj).updateThreadContext(dVar);
    }
}
