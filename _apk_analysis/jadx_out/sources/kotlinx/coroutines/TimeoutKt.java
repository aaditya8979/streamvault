package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import p000do.o2;
import p000do.s0;
import p000do.t1;
import sn.p;

/* JADX INFO: compiled from: Timeout.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class TimeoutKt {
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlinx.coroutines.TimeoutCancellationException a(long r2, @org.jetbrains.annotations.NotNull p000do.r0 r4, @org.jetbrains.annotations.NotNull kotlinx.coroutines.g r5) {
        /*
            boolean r0 = r4 instanceof p000do.t0
            if (r0 == 0) goto L7
            do.t0 r4 = (p000do.t0) r4
            goto L8
        L7:
            r4 = 0
        L8:
            if (r4 == 0) goto L18
            co.b$a r0 = co.b.f6773c
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
            long r0 = co.d.t(r2, r0)
            java.lang.String r4 = r4.h(r0)
            if (r4 != 0) goto L2e
        L18:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Timed out waiting for "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = " ms"
            r4.append(r2)
            java.lang.String r4 = r4.toString()
        L2e:
            kotlinx.coroutines.TimeoutCancellationException r2 = new kotlinx.coroutines.TimeoutCancellationException
            r2.<init>(r4, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.TimeoutKt.a(long, do.r0, kotlinx.coroutines.g):kotlinx.coroutines.TimeoutCancellationException");
    }

    public static final <U, T extends U> Object b(o2<U, ? super T> o2Var, p<? super l0, ? super hn.c<? super T>, ? extends Object> pVar) {
        t1.j(o2Var, s0.c(o2Var.f64327e.getContext()).A(o2Var.f59877f, o2Var, o2Var.getContext()));
        return jo.b.e(o2Var, o2Var, pVar);
    }

    @Nullable
    public static final <T> Object c(long j10, @NotNull p<? super l0, ? super hn.c<? super T>, ? extends Object> pVar, @NotNull hn.c<? super T> cVar) {
        if (j10 <= 0) {
            throw new TimeoutCancellationException("Timed out immediately");
        }
        Object objB = b(new o2(j10, cVar), pVar);
        if (objB == in.a.g()) {
            jn.f.c(cVar);
        }
        return objB;
    }

    @Nullable
    public static final <T> Object d(long j10, @NotNull p<? super l0, ? super hn.c<? super T>, ? extends Object> pVar, @NotNull hn.c<? super T> cVar) {
        return c(s0.d(j10), pVar, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, do.o2] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object e(long r7, @org.jetbrains.annotations.NotNull sn.p<? super p000do.l0, ? super hn.c<? super T>, ? extends java.lang.Object> r9, @org.jetbrains.annotations.NotNull hn.c<? super T> r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1 r0 = (kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1 r0 = new kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r7 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref$ObjectRef) r7
            java.lang.Object r8 = r0.L$0
            sn.p r8 = (sn.p) r8
            kotlin.c.b(r10)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L32
            goto L6b
        L32:
            r8 = move-exception
            goto L6e
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            kotlin.c.b(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L46
            return r3
        L46:
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            r0.L$0 = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            r0.L$1 = r10     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            r0.J$0 = r7     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            r0.label = r4     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            do.o2 r2 = new do.o2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            r2.<init>(r7, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            r10.element = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            java.lang.Object r7 = b(r2, r9)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            java.lang.Object r8 = in.a.g()     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            if (r7 != r8) goto L67
            jn.f.c(r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
        L67:
            if (r7 != r1) goto L6a
            return r1
        L6a:
            r10 = r7
        L6b:
            return r10
        L6c:
            r8 = move-exception
            r7 = r10
        L6e:
            kotlinx.coroutines.g r9 = r8.coroutine
            T r7 = r7.element
            if (r9 != r7) goto L75
            return r3
        L75:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.TimeoutKt.e(long, sn.p, hn.c):java.lang.Object");
    }

    @Nullable
    public static final <T> Object f(long j10, @NotNull p<? super l0, ? super hn.c<? super T>, ? extends Object> pVar, @NotNull hn.c<? super T> cVar) {
        return e(s0.d(j10), pVar, cVar);
    }
}
