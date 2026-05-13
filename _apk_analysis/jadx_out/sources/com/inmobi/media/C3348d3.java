package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3348d3 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S2 f27010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HandlerC3425g3 f27011c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3348d3(S2 s22, HandlerC3425g3 handlerC3425g3, hn.c cVar) {
        super(2, cVar);
        this.f27010b = s22;
        this.f27011c = handlerC3425g3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3348d3(this.f27010b, this.f27011c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3348d3(this.f27010b, this.f27011c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        if (r8 == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = in.a.g()
            int r1 = r7.f27009a
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r2) goto L13
            kotlin.c.b(r8)
            goto L6e
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            kotlin.c.b(r8)
            goto L4e
        L1f:
            kotlin.c.b(r8)
            bn.g r8 = com.inmobi.media.C3823w3.f28407b
            java.lang.Object r8 = r8.getValue()
            com.inmobi.media.W2 r8 = (com.inmobi.media.W2) r8
            com.inmobi.media.S2 r1 = r7.f27010b
            int r1 = r1.f26274a
            r7.f27009a = r4
            com.inmobi.media.g9 r8 = r8.f26518a
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String[] r5 = new java.lang.String[r4]
            r5[r3] = r1
            java.lang.String r1 = "click"
            java.lang.String r6 = "id=?"
            java.lang.Object r8 = r8.a(r1, r6, r5, r7)
            java.lang.Object r1 = in.a.g()
            if (r8 != r1) goto L49
            goto L4b
        L49:
            bn.r r8 = bn.r.f5635a
        L4b:
            if (r8 != r0) goto L4e
            goto L6d
        L4e:
            java.util.List r8 = com.inmobi.media.C3823w3.f28411f
            com.inmobi.media.S2 r1 = r7.f27010b
            r8.remove(r1)
            java.util.List r8 = com.inmobi.media.C3823w3.f28411f
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L98
            bn.g r8 = com.inmobi.media.C3823w3.f28407b
            java.lang.Object r8 = r8.getValue()
            com.inmobi.media.W2 r8 = (com.inmobi.media.W2) r8
            r7.f27009a = r2
            java.lang.Object r8 = r8.a(r7)
            if (r8 != r0) goto L6e
        L6d:
            return r0
        L6e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L87
            android.os.Message r8 = android.os.Message.obtain()
            r8.what = r4
            com.inmobi.media.g3 r0 = r7.f27011c
            boolean r8 = r0.sendMessage(r8)
            java.lang.Boolean r8 = jn.a.a(r8)
            return r8
        L87:
            com.inmobi.media.w3 r8 = com.inmobi.media.C3823w3.f28406a
            java.lang.String r8 = "w3"
            java.lang.String r0 = "access$getTAG$p(...)"
            tn.p.j(r8, r0)
            java.util.concurrent.atomic.AtomicBoolean r8 = com.inmobi.media.C3823w3.f28412g
            r8.set(r3)
            bn.r r8 = bn.r.f5635a
            return r8
        L98:
            com.inmobi.media.g3 r8 = r7.f27011c
            java.util.List r0 = com.inmobi.media.C3823w3.f28411f
            java.lang.Object r0 = r0.get(r3)
            com.inmobi.media.S2 r0 = (com.inmobi.media.S2) r0
            int r1 = com.inmobi.media.HandlerC3425g3.f27198a
            android.os.Message r1 = android.os.Message.obtain()
            if (r0 == 0) goto Laf
            boolean r3 = r0.f26278e
            if (r3 != r4) goto Laf
            r2 = 3
        Laf:
            r1.what = r2
            r1.obj = r0
            r8.sendMessage(r1)
            bn.r r8 = bn.r.f5635a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3348d3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
