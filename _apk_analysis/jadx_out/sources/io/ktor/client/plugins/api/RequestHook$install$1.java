package io.ktor.client.plugins.api;

import al.k;
import bn.r;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ql.c;
import sn.q;

/* JADX INFO: compiled from: KtorCallContexts.kt */
/* JADX INFO: loaded from: classes3.dex */
@d(c = "io.ktor.client.plugins.api.RequestHook$install$1", f = "KtorCallContexts.kt", l = {53}, m = "invokeSuspend")
public final class RequestHook$install$1 extends SuspendLambda implements q<c<Object, cl.d>, Object, hn.c<? super r>, Object> {
    public final /* synthetic */ sn.r<k, cl.d, Object, hn.c<? super r>, Object> $handler;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RequestHook$install$1(sn.r<? super k, ? super cl.d, Object, ? super hn.c<? super r>, ? extends Object> rVar, hn.c<? super RequestHook$install$1> cVar) {
        super(3, cVar);
        this.$handler = rVar;
    }

    @Override // sn.q
    public final Object invoke(c<Object, cl.d> cVar, Object obj, hn.c<? super r> cVar2) {
        RequestHook$install$1 requestHook$install$1 = new RequestHook$install$1(this.$handler, cVar2);
        requestHook$install$1.L$0 = cVar;
        return requestHook$install$1.invokeSuspend(r.f5635a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to io.ktor.client.plugins.api.RequestHook$install$1 for r5v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = in.a.g()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.c.b(r6)
            goto L36
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            kotlin.c.b(r6)
            java.lang.Object r6 = r5.L$0
            ql.c r6 = (ql.c) r6
            sn.r<al.k, cl.d, java.lang.Object, hn.c<? super bn.r>, java.lang.Object> r1 = r5.$handler
            al.k r3 = new al.k
            r3.<init>()
            java.lang.Object r4 = r6.getContext()
            java.lang.Object r6 = r6.b()
            r5.label = r2
            java.lang.Object r6 = r1.invoke(r3, r4, r6, r5)
            if (r6 != r0) goto L36
            return r0
        L36:
            bn.r r6 = bn.r.f5635a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.api.RequestHook$install$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
