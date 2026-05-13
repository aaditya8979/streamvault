package io.ktor.client.plugins;

import bn.r;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import sn.q;

/* JADX INFO: compiled from: BodyProgress.kt */
/* JADX INFO: loaded from: classes3.dex */
@d(c = "io.ktor.client.plugins.AfterRenderHook$install$1", f = "BodyProgress.kt", l = {65, 66}, m = "invokeSuspend")
public final class AfterRenderHook$install$1 extends SuspendLambda implements q<ql.c<Object, cl.d>, Object, hn.c<? super r>, Object> {
    public final /* synthetic */ q<cl.d, jl.c, hn.c<? super jl.c>, Object> $handler;
    private /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AfterRenderHook$install$1(q<? super cl.d, ? super jl.c, ? super hn.c<? super jl.c>, ? extends Object> qVar, hn.c<? super AfterRenderHook$install$1> cVar) {
        super(3, cVar);
        this.$handler = qVar;
    }

    @Override // sn.q
    public final Object invoke(ql.c<Object, cl.d> cVar, Object obj, hn.c<? super r> cVar2) {
        AfterRenderHook$install$1 afterRenderHook$install$1 = new AfterRenderHook$install$1(this.$handler, cVar2);
        afterRenderHook$install$1.L$0 = cVar;
        afterRenderHook$install$1.L$1 = obj;
        return afterRenderHook$install$1.invokeSuspend(r.f5635a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to io.ktor.client.plugins.AfterRenderHook$install$1 for r6v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = in.a.g()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.c.b(r7)
            goto L57
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            java.lang.Object r1 = r6.L$0
            ql.c r1 = (ql.c) r1
            kotlin.c.b(r7)
            goto L44
        L22:
            kotlin.c.b(r7)
            java.lang.Object r7 = r6.L$0
            r1 = r7
            ql.c r1 = (ql.c) r1
            java.lang.Object r7 = r6.L$1
            boolean r4 = r7 instanceof jl.c
            if (r4 != 0) goto L33
            bn.r r7 = bn.r.f5635a
            return r7
        L33:
            sn.q<cl.d, jl.c, hn.c<? super jl.c>, java.lang.Object> r4 = r6.$handler
            java.lang.Object r5 = r1.getContext()
            r6.L$0 = r1
            r6.label = r3
            java.lang.Object r7 = r4.invoke(r5, r7, r6)
            if (r7 != r0) goto L44
            return r0
        L44:
            jl.c r7 = (jl.c) r7
            if (r7 != 0) goto L4b
            bn.r r7 = bn.r.f5635a
            return r7
        L4b:
            r3 = 0
            r6.L$0 = r3
            r6.label = r2
            java.lang.Object r7 = r1.d(r7, r6)
            if (r7 != r0) goto L57
            return r0
        L57:
            bn.r r7 = bn.r.f5635a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.AfterRenderHook$install$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
