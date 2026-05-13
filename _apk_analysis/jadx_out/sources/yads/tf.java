package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes2.dex */
public final class tf extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f95188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vf f95189c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf(vf vfVar, hn.c cVar) {
        super(2, cVar);
        this.f95189c = vfVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new tf(this.f95189c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new tf(this.f95189c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0051 -> B:11:0x0021). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = in.a.g()
            int r1 = r10.f95188b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L1d
        Lf:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L17:
            kotlin.c.b(r11)
            r1 = r0
            r0 = r10
            goto L3c
        L1d:
            kotlin.c.b(r11)
            r11 = r10
        L21:
            yads.vf r1 = r11.f95189c
            yads.jf r4 = r1.f96073e
            long r5 = r1.f96070b
            r11.f95188b = r3
            kotlin.coroutines.d r1 = r4.f91202a
            yads.if r7 = new yads.if
            r8 = 0
            r7.<init>(r4, r5, r8)
            java.lang.Object r1 = p000do.g.g(r1, r7, r11)
            if (r1 != r0) goto L38
            return r0
        L38:
            r9 = r0
            r0 = r11
            r11 = r1
            r1 = r9
        L3c:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L54
            yads.vf r11 = r0.f95189c
            long r4 = r11.f96069a
            r0.f95188b = r2
            java.lang.Object r11 = p000do.s0.a(r4, r0)
            if (r11 != r1) goto L51
            return r1
        L51:
            r11 = r0
            r0 = r1
            goto L21
        L54:
            yads.vf r11 = r0.f95189c
            yads.vf.a(r11)
            bn.r r11 = bn.r.f5635a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.tf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
