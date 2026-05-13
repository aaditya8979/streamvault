package kotlinx.coroutines.flow;

import go.e;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class FlowKt__LimitKt$take$2$1<T> implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref$IntRef f73345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f73346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e<T> f73347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f73348e;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$take$2$1(Ref$IntRef ref$IntRef, int i10, e<? super T> eVar, Object obj) {
        this.f73345b = ref$IntRef;
        this.f73346c = i10;
        this.f73347d = eVar;
        this.f73348e = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // go.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(T r6, hn.c<? super bn.r> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.c.b(r7)
            goto L61
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            kotlin.c.b(r7)
            goto L51
        L38:
            kotlin.c.b(r7)
            kotlin.jvm.internal.Ref$IntRef r7 = r5.f73345b
            int r2 = r7.element
            int r2 = r2 + r4
            r7.element = r2
            int r7 = r5.f73346c
            if (r2 >= r7) goto L54
            go.e<T> r7 = r5.f73347d
            r0.label = r4
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            bn.r r6 = bn.r.f5635a
            return r6
        L54:
            go.e<T> r7 = r5.f73347d
            java.lang.Object r2 = r5.f73348e
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt__LimitKt.a(r7, r6, r2, r0)
            if (r6 != r1) goto L61
            return r1
        L61:
            bn.r r6 = bn.r.f5635a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1.emit(java.lang.Object, hn.c):java.lang.Object");
    }
}
