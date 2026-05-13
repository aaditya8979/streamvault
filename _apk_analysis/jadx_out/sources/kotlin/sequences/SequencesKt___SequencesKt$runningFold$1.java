package kotlin.sequences;

import ao.i;
import ao.k;
import bn.r;
import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import sn.p;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: _Sequences.kt */
/* JADX INFO: loaded from: classes.dex */
@d(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFold$1", f = "_Sequences.kt", l = {2423, 2427}, m = "invokeSuspend")
public final class SequencesKt___SequencesKt$runningFold$1<R> extends RestrictedSuspendLambda implements p<k<? super R>, c<? super r>, Object> {
    public final /* synthetic */ R $initial;
    public final /* synthetic */ p<R, T, R> $operation;
    public final /* synthetic */ i<T> $this_runningFold;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SequencesKt___SequencesKt$runningFold$1(R r10, i<? extends T> iVar, p<? super R, ? super T, ? extends R> pVar, c<? super SequencesKt___SequencesKt$runningFold$1> cVar) {
        super(2, cVar);
        this.$initial = r10;
        this.$this_runningFold = iVar;
        this.$operation = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        SequencesKt___SequencesKt$runningFold$1 sequencesKt___SequencesKt$runningFold$1 = new SequencesKt___SequencesKt$runningFold$1(this.$initial, this.$this_runningFold, this.$operation, cVar);
        sequencesKt___SequencesKt$runningFold$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningFold$1;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final Object mo2invoke(k<? super R> kVar, c<? super r> cVar) {
        return ((SequencesKt___SequencesKt$runningFold$1) create(kVar, cVar)).invokeSuspend(r.f5635a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
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
            if (r1 == 0) goto L2d
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1d
            java.lang.Object r1 = r7.L$2
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r3 = r7.L$1
            java.lang.Object r4 = r7.L$0
            ao.k r4 = (ao.k) r4
            kotlin.c.b(r8)
            r8 = r3
            goto L4c
        L1d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L25:
            java.lang.Object r1 = r7.L$0
            ao.k r1 = (ao.k) r1
            kotlin.c.b(r8)
            goto L42
        L2d:
            kotlin.c.b(r8)
            java.lang.Object r8 = r7.L$0
            r1 = r8
            ao.k r1 = (ao.k) r1
            R r8 = r7.$initial
            r7.L$0 = r1
            r7.label = r3
            java.lang.Object r8 = r1.b(r8, r7)
            if (r8 != r0) goto L42
            return r0
        L42:
            R r8 = r7.$initial
            ao.i<T> r3 = r7.$this_runningFold
            java.util.Iterator r3 = r3.iterator()
            r4 = r1
            r1 = r3
        L4c:
            r3 = r7
        L4d:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L6c
            java.lang.Object r5 = r1.next()
            sn.p<R, T, R> r6 = r3.$operation
            java.lang.Object r8 = r6.mo2invoke(r8, r5)
            r3.L$0 = r4
            r3.L$1 = r8
            r3.L$2 = r1
            r3.label = r2
            java.lang.Object r5 = r4.b(r8, r3)
            if (r5 != r0) goto L4d
            return r0
        L6c:
            bn.r r8 = bn.r.f5635a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt$runningFold$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
