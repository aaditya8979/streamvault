package kotlinx.coroutines.flow;

import bn.r;
import go.d;
import go.e;
import go.f;
import hn.c;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.jetbrains.annotations.NotNull;
import sn.p;
import sn.q;

/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class FlowKt__LimitKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    public static final class a<T> implements d<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f73338b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p f73339c;

        public a(d dVar, p pVar) {
            this.f73338b = dVar;
            this.f73339c = pVar;
        }

        @Override // go.d
        public Object collect(e<? super T> eVar, c<? super r> cVar) {
            Object objCollect = this.f73338b.collect(new FlowKt__LimitKt$dropWhile$1$1(new Ref$BooleanRef(), eVar, this.f73339c), cVar);
            return objCollect == in.a.g() ? objCollect : r.f5635a;
        }
    }

    @NotNull
    public static final <T> d<T> b(@NotNull d<? extends T> dVar, @NotNull p<? super T, ? super c<? super Boolean>, ? extends Object> pVar) {
        return new a(dVar, pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object c(go.e<? super T> r4, T r5, java.lang.Object r6, hn.c<? super bn.r> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r6 = r0.L$0
            kotlin.c.b(r7)
            goto L41
        L33:
            kotlin.c.b(r7)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r4 = r4.emit(r5, r0)
            if (r4 != r1) goto L41
            return r1
        L41:
            kotlinx.coroutines.flow.internal.AbortFlowException r4 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt.c(go.e, java.lang.Object, java.lang.Object, hn.c):java.lang.Object");
    }

    @NotNull
    public static final <T> d<T> d(@NotNull d<? extends T> dVar, int i10) {
        if (i10 > 0) {
            return new FlowKt__LimitKt$take$$inlined$unsafeFlow$1(dVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " should be positive").toString());
    }

    @NotNull
    public static final <T> d<T> e(@NotNull d<? extends T> dVar, @NotNull p<? super T, ? super c<? super Boolean>, ? extends Object> pVar) {
        return new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(dVar, pVar);
    }

    @NotNull
    public static final <T, R> d<R> f(@NotNull d<? extends T> dVar, @NotNull q<? super e<? super R>, ? super T, ? super c<? super Boolean>, ? extends Object> qVar) {
        return f.z(new FlowKt__LimitKt$transformWhile$1(dVar, qVar, null));
    }
}
