package io;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e0 f68502a = new e0("CLOSED");

    @NotNull
    public static final <N extends c<N>> N b(@NotNull N n10) {
        while (true) {
            Object objG = n10.g();
            if (objG == f68502a) {
                return n10;
            }
            c cVar = (c) objG;
            if (cVar != null) {
                n10 = (N) cVar;
            } else if (n10.m()) {
                return n10;
            }
        }
    }

    @NotNull
    public static final <S extends b0<S>> Object c(@NotNull S s10, long j10, @NotNull sn.p<? super Long, ? super S, ? extends S> pVar) {
        while (true) {
            if (s10.f68504d >= j10 && !s10.k()) {
                return c0.a(s10);
            }
            Object objG = s10.g();
            if (objG == f68502a) {
                return c0.a(f68502a);
            }
            S sMo2invoke = (S) ((c) objG);
            if (sMo2invoke == null) {
                sMo2invoke = pVar.mo2invoke(Long.valueOf(s10.f68504d + 1), s10);
                if (s10.o(sMo2invoke)) {
                    if (s10.k()) {
                        s10.n();
                    }
                }
            }
            s10 = (Object) sMo2invoke;
        }
    }
}
