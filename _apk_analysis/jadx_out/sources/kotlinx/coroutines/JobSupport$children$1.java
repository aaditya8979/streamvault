package kotlinx.coroutines;

import ao.k;
import bn.r;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import sn.p;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes.dex */
@jn.d(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {1003, 1005}, m = "invokeSuspend")
public final class JobSupport$children$1 extends RestrictedSuspendLambda implements p<k<? super g>, hn.c<? super r>, Object> {
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ JobSupport this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JobSupport$children$1(JobSupport jobSupport, hn.c<? super JobSupport$children$1> cVar) {
        super(2, cVar);
        this.this$0 = jobSupport;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c<r> create(Object obj, hn.c<?> cVar) {
        JobSupport$children$1 jobSupport$children$1 = new JobSupport$children$1(this.this$0, cVar);
        jobSupport$children$1.L$0 = obj;
        return jobSupport$children$1;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo2invoke(k<? super g> kVar, hn.c<? super r> cVar) {
        return ((JobSupport$children$1) create(kVar, cVar)).invokeSuspend(r.f5635a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006d -> B:27:0x0083). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0080 -> B:27:0x0083). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = in.a.g()
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2b
            if (r1 == r3) goto L27
            if (r1 != r2) goto L1f
            java.lang.Object r1 = r7.L$2
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            java.lang.Object r3 = r7.L$1
            io.p r3 = (io.p) r3
            java.lang.Object r4 = r7.L$0
            ao.k r4 = (ao.k) r4
            kotlin.c.b(r8)
            r8 = r7
            goto L83
        L1f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L27:
            kotlin.c.b(r8)
            goto L88
        L2b:
            kotlin.c.b(r8)
            java.lang.Object r8 = r7.L$0
            ao.k r8 = (ao.k) r8
            kotlinx.coroutines.JobSupport r1 = r7.this$0
            java.lang.Object r1 = r1.u0()
            boolean r4 = r1 instanceof p000do.r
            if (r4 == 0) goto L49
            do.r r1 = (p000do.r) r1
            do.s r1 = r1.f59884f
            r7.label = r3
            java.lang.Object r8 = r8.b(r1, r7)
            if (r8 != r0) goto L88
            return r0
        L49:
            boolean r3 = r1 instanceof p000do.o1
            if (r3 == 0) goto L88
            do.o1 r1 = (p000do.o1) r1
            do.z1 r1 = r1.b()
            if (r1 == 0) goto L88
            java.lang.Object r3 = r1.j()
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            tn.p.i(r3, r4)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            r4 = r8
            r8 = r7
            r6 = r3
            r3 = r1
            r1 = r6
        L65:
            boolean r5 = tn.p.f(r1, r3)
            if (r5 != 0) goto L88
            boolean r5 = r1 instanceof p000do.r
            if (r5 == 0) goto L83
            r5 = r1
            do.r r5 = (p000do.r) r5
            do.s r5 = r5.f59884f
            r8.L$0 = r4
            r8.L$1 = r3
            r8.L$2 = r1
            r8.label = r2
            java.lang.Object r5 = r4.b(r5, r8)
            if (r5 != r0) goto L83
            return r0
        L83:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r1.k()
            goto L65
        L88:
            bn.r r8 = bn.r.f5635a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport$children$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
