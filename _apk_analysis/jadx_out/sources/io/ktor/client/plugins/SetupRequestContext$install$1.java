package io.ktor.client.plugins;

import bn.r;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import sn.l;
import sn.q;

/* JADX INFO: compiled from: HttpRequestLifecycle.kt */
/* JADX INFO: loaded from: classes6.dex */
@d(c = "io.ktor.client.plugins.SetupRequestContext$install$1", f = "HttpRequestLifecycle.kt", l = {42}, m = "invokeSuspend")
public final class SetupRequestContext$install$1 extends SuspendLambda implements q<ql.c<Object, cl.d>, Object, hn.c<? super r>, Object> {
    public final /* synthetic */ q<cl.d, l<? super hn.c<? super r>, ? extends Object>, hn.c<? super r>, Object> $handler;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: renamed from: io.ktor.client.plugins.SetupRequestContext$install$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: HttpRequestLifecycle.kt */
    public /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements l<hn.c<? super r>, Object> {
        public AnonymousClass1(Object obj) {
            super(1, obj, ql.c.class, "proceed", "proceed(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 8);
        }

        @Override // sn.l
        public final Object invoke(hn.c<? super r> cVar) {
            return SetupRequestContext$install$1.c((ql.c) this.receiver, cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SetupRequestContext$install$1(q<? super cl.d, ? super l<? super hn.c<? super r>, ? extends Object>, ? super hn.c<? super r>, ? extends Object> qVar, hn.c<? super SetupRequestContext$install$1> cVar) {
        super(3, cVar);
        this.$handler = qVar;
    }

    public static final /* synthetic */ Object c(ql.c cVar, hn.c cVar2) {
        Object objC = cVar.c(cVar2);
        return objC == in.a.g() ? objC : r.f5635a;
    }

    @Override // sn.q
    public final Object invoke(ql.c<Object, cl.d> cVar, Object obj, hn.c<? super r> cVar2) {
        SetupRequestContext$install$1 setupRequestContext$install$1 = new SetupRequestContext$install$1(this.$handler, cVar2);
        setupRequestContext$install$1.L$0 = cVar;
        return setupRequestContext$install$1.invokeSuspend(r.f5635a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to io.ktor.client.plugins.SetupRequestContext$install$1 for r5v1 'this'  java.lang.Object
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
            goto L32
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            kotlin.c.b(r6)
            java.lang.Object r6 = r5.L$0
            ql.c r6 = (ql.c) r6
            sn.q<cl.d, sn.l<? super hn.c<? super bn.r>, ? extends java.lang.Object>, hn.c<? super bn.r>, java.lang.Object> r1 = r5.$handler
            java.lang.Object r3 = r6.getContext()
            io.ktor.client.plugins.SetupRequestContext$install$1$1 r4 = new io.ktor.client.plugins.SetupRequestContext$install$1$1
            r4.<init>(r6)
            r5.label = r2
            java.lang.Object r6 = r1.invoke(r3, r4, r5)
            if (r6 != r0) goto L32
            return r0
        L32:
            bn.r r6 = bn.r.f5635a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.SetupRequestContext$install$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
