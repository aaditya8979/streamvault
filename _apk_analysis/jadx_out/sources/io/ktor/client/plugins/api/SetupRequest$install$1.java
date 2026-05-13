package io.ktor.client.plugins.api;

import bn.r;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ql.c;
import sn.p;
import sn.q;

/* JADX INFO: compiled from: CommonHooks.kt */
/* JADX INFO: loaded from: classes11.dex */
@d(c = "io.ktor.client.plugins.api.SetupRequest$install$1", f = "CommonHooks.kt", l = {24}, m = "invokeSuspend")
public final class SetupRequest$install$1 extends SuspendLambda implements q<c<Object, cl.d>, Object, hn.c<? super r>, Object> {
    public final /* synthetic */ p<cl.d, hn.c<? super r>, Object> $handler;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SetupRequest$install$1(p<? super cl.d, ? super hn.c<? super r>, ? extends Object> pVar, hn.c<? super SetupRequest$install$1> cVar) {
        super(3, cVar);
        this.$handler = pVar;
    }

    @Override // sn.q
    public final Object invoke(c<Object, cl.d> cVar, Object obj, hn.c<? super r> cVar2) {
        SetupRequest$install$1 setupRequest$install$1 = new SetupRequest$install$1(this.$handler, cVar2);
        setupRequest$install$1.L$0 = cVar;
        return setupRequest$install$1.invokeSuspend(r.f5635a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to io.ktor.client.plugins.api.SetupRequest$install$1 for r3v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = in.a.g()
            int r1 = r3.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.c.b(r4)
            goto L2d
        Lf:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L17:
            kotlin.c.b(r4)
            java.lang.Object r4 = r3.L$0
            ql.c r4 = (ql.c) r4
            sn.p<cl.d, hn.c<? super bn.r>, java.lang.Object> r1 = r3.$handler
            java.lang.Object r4 = r4.getContext()
            r3.label = r2
            java.lang.Object r4 = r1.mo2invoke(r4, r3)
            if (r4 != r0) goto L2d
            return r0
        L2d:
            bn.r r4 = bn.r.f5635a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.api.SetupRequest$install$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
