package p000do;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.p;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class f0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    public static final d d(d dVar, d dVar2, final boolean z10) {
        boolean zH = h(dVar);
        boolean zH2 = h(dVar2);
        if (!zH && !zH2) {
            return dVar.plus(dVar2);
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = dVar2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        d dVar3 = (d) dVar.fold(emptyCoroutineContext, new p() { // from class: do.c0
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo2invoke(Object obj, Object obj2) {
                return f0.e(ref$ObjectRef, z10, (d) obj, (d.b) obj2);
            }
        });
        if (zH2) {
            ref$ObjectRef.element = ((d) ref$ObjectRef.element).fold(emptyCoroutineContext, new p() { // from class: do.d0
                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public final Object mo2invoke(Object obj, Object obj2) {
                    return f0.f((d) obj, (d.b) obj2);
                }
            });
        }
        return dVar3.plus((d) ref$ObjectRef.element);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [T, kotlin.coroutines.d] */
    public static final d e(Ref$ObjectRef ref$ObjectRef, boolean z10, d dVar, d.b bVar) {
        if (!(bVar instanceof a0)) {
            return dVar.plus(bVar);
        }
        d.b bVar2 = ((d) ref$ObjectRef.element).get(bVar.getKey());
        if (bVar2 == null) {
            return dVar.plus(z10 ? ((a0) bVar).m() : (a0) bVar);
        }
        ref$ObjectRef.element = ((d) ref$ObjectRef.element).minusKey(bVar.getKey());
        return dVar.plus(((a0) bVar).c(bVar2));
    }

    public static final d f(d dVar, d.b bVar) {
        return bVar instanceof a0 ? dVar.plus(((a0) bVar).m()) : dVar.plus(bVar);
    }

    @Nullable
    public static final String g(@NotNull d dVar) {
        return null;
    }

    public static final boolean h(d dVar) {
        return ((Boolean) dVar.fold(Boolean.FALSE, new p() { // from class: do.e0
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo2invoke(Object obj, Object obj2) {
                return Boolean.valueOf(f0.i(((Boolean) obj).booleanValue(), (d.b) obj2));
            }
        })).booleanValue();
    }

    public static final boolean i(boolean z10, d.b bVar) {
        return z10 || (bVar instanceof a0);
    }

    @NotNull
    public static final d j(@NotNull l0 l0Var, @NotNull d dVar) {
        d dVarD = d(l0Var.getCoroutineContext(), dVar, true);
        return (dVarD == w0.a() || dVarD.get(c.G8) != null) ? dVarD : dVarD.plus(w0.a());
    }

    @NotNull
    public static final d k(@NotNull d dVar, @NotNull d dVar2) {
        return !h(dVar2) ? dVar.plus(dVar2) : d(dVar, dVar2, false);
    }

    @Nullable
    public static final q2<?> l(@NotNull jn.c cVar) {
        while (!(cVar instanceof e) && (cVar = cVar.getCallerFrame()) != null) {
            if (cVar instanceof q2) {
                return (q2) cVar;
            }
        }
        return null;
    }

    @Nullable
    public static final q2<?> m(@NotNull hn.c<?> cVar, @NotNull d dVar, @Nullable Object obj) {
        if (!(cVar instanceof jn.c)) {
            return null;
        }
        if (!(dVar.get(r2.f59886b) != null)) {
            return null;
        }
        q2<?> q2VarL = l((jn.c) cVar);
        if (q2VarL != null) {
            q2VarL.m1(dVar, obj);
        }
        return q2VarL;
    }
}
