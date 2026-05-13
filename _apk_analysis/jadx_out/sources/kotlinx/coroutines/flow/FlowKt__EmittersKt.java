package kotlinx.coroutines.flow;

import bn.r;
import go.d;
import go.e;
import go.x;
import hn.c;
import org.jetbrains.annotations.NotNull;
import sn.p;
import sn.q;

/* JADX INFO: compiled from: Emitters.kt */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class FlowKt__EmittersKt {
    public static final void b(@NotNull e<?> eVar) {
        if (eVar instanceof x) {
            throw ((x) eVar).f62665b;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object c(go.e<? super T> r4, sn.q<? super go.e<? super T>, ? super java.lang.Throwable, ? super hn.c<? super bn.r>, ? extends java.lang.Object> r5, java.lang.Throwable r6, hn.c<? super bn.r> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.L$0
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            kotlin.c.b(r7)     // Catch: java.lang.Throwable -> L47
            goto L44
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.c.b(r7)
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L47
            r0.label = r3     // Catch: java.lang.Throwable -> L47
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L47
            if (r4 != r1) goto L44
            return r1
        L44:
            bn.r r4 = bn.r.f5635a
            return r4
        L47:
            r4 = move-exception
            if (r6 == 0) goto L4f
            if (r6 == r4) goto L4f
            bn.d.a(r4, r6)
        L4f:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt.c(go.e, sn.q, java.lang.Throwable, hn.c):java.lang.Object");
    }

    @NotNull
    public static final <T> d<T> d(@NotNull d<? extends T> dVar, @NotNull q<? super e<? super T>, ? super Throwable, ? super c<? super r>, ? extends Object> qVar) {
        return new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(dVar, qVar);
    }

    @NotNull
    public static final <T> d<T> e(@NotNull d<? extends T> dVar, @NotNull p<? super e<? super T>, ? super c<? super r>, ? extends Object> pVar) {
        return new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(pVar, dVar);
    }
}
