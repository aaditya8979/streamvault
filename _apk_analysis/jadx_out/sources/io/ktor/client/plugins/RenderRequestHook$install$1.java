package io.ktor.client.plugins;

import bn.r;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import sn.q;

/* JADX INFO: compiled from: HttpPlainText.kt */
/* JADX INFO: loaded from: classes6.dex */
@d(c = "io.ktor.client.plugins.RenderRequestHook$install$1", f = "HttpPlainText.kt", l = {155, 156}, m = "invokeSuspend")
public final class RenderRequestHook$install$1 extends SuspendLambda implements q<ql.c<Object, cl.d>, Object, hn.c<? super r>, Object> {
    public final /* synthetic */ q<cl.d, Object, hn.c<? super jl.c>, Object> $handler;
    private /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RenderRequestHook$install$1(q<? super cl.d, Object, ? super hn.c<? super jl.c>, ? extends Object> qVar, hn.c<? super RenderRequestHook$install$1> cVar) {
        super(3, cVar);
        this.$handler = qVar;
    }

    @Override // sn.q
    public final Object invoke(ql.c<Object, cl.d> cVar, Object obj, hn.c<? super r> cVar2) {
        RenderRequestHook$install$1 renderRequestHook$install$1 = new RenderRequestHook$install$1(this.$handler, cVar2);
        renderRequestHook$install$1.L$0 = cVar;
        renderRequestHook$install$1.L$1 = obj;
        return renderRequestHook$install$1.invokeSuspend(r.f5635a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to io.ktor.client.plugins.RenderRequestHook$install$1 for r6v1 'this'  java.lang.Object
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
            goto L4d
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            java.lang.Object r1 = r6.L$0
            ql.c r1 = (ql.c) r1
            kotlin.c.b(r7)
            goto L3d
        L22:
            kotlin.c.b(r7)
            java.lang.Object r7 = r6.L$0
            r1 = r7
            ql.c r1 = (ql.c) r1
            java.lang.Object r7 = r6.L$1
            sn.q<cl.d, java.lang.Object, hn.c<? super jl.c>, java.lang.Object> r4 = r6.$handler
            java.lang.Object r5 = r1.getContext()
            r6.L$0 = r1
            r6.label = r3
            java.lang.Object r7 = r4.invoke(r5, r7, r6)
            if (r7 != r0) goto L3d
            return r0
        L3d:
            jl.c r7 = (jl.c) r7
            if (r7 == 0) goto L4d
            r3 = 0
            r6.L$0 = r3
            r6.label = r2
            java.lang.Object r7 = r1.d(r7, r6)
            if (r7 != r0) goto L4d
            return r0
        L4d:
            bn.r r7 = bn.r.f5635a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.RenderRequestHook$install$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
