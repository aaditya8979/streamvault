package kotlinx.coroutines.flow;

import bn.r;
import go.d;
import go.e;
import hn.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Context.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class CancellableFlowImpl<T> implements go.a<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final d<T> f73320b;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.CancellableFlowImpl$collect$2, reason: invalid class name */
    /* JADX INFO: compiled from: Context.kt */
    public static final class AnonymousClass2<T> implements e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e<T> f73321b;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(e<? super T> eVar) {
            this.f73321b = eVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // go.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r5, hn.c<? super bn.r> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.CancellableFlowImpl$collect$2$emit$1
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.CancellableFlowImpl$collect$2$emit$1 r0 = (kotlinx.coroutines.flow.CancellableFlowImpl$collect$2$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.CancellableFlowImpl$collect$2$emit$1 r0 = new kotlinx.coroutines.flow.CancellableFlowImpl$collect$2$emit$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = in.a.g()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.c.b(r6)
                goto L46
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.c.b(r6)
                kotlin.coroutines.d r6 = r0.getContext()
                p000do.t1.k(r6)
                go.e<T> r6 = r4.f73321b
                r0.label = r3
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L46
                return r1
            L46:
                bn.r r5 = bn.r.f5635a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.CancellableFlowImpl.AnonymousClass2.emit(java.lang.Object, hn.c):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CancellableFlowImpl(@NotNull d<? extends T> dVar) {
        this.f73320b = dVar;
    }

    @Override // go.d
    @Nullable
    public Object collect(@NotNull e<? super T> eVar, @NotNull c<? super r> cVar) {
        Object objCollect = this.f73320b.collect(new AnonymousClass2(eVar), cVar);
        return objCollect == in.a.g() ? objCollect : r.f5635a;
    }
}
