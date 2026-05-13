package io.ktor.client.plugins.api;

import al.l;
import bn.r;
import io.ktor.client.call.HttpClientCall;
import io.ktor.utils.io.a;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ql.c;
import sn.q;
import sn.s;

/* JADX INFO: compiled from: KtorCallContexts.kt */
/* JADX INFO: loaded from: classes8.dex */
@d(c = "io.ktor.client.plugins.api.TransformResponseBodyHook$install$1", f = "KtorCallContexts.kt", l = {113, 120}, m = "invokeSuspend")
public final class TransformResponseBodyHook$install$1 extends SuspendLambda implements q<c<dl.d, HttpClientCall>, dl.d, hn.c<? super r>, Object> {
    public final /* synthetic */ s<l, dl.c, a, rl.a, hn.c<Object>, Object> $handler;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TransformResponseBodyHook$install$1(s<? super l, ? super dl.c, ? super a, ? super rl.a, ? super hn.c<Object>, ? extends Object> sVar, hn.c<? super TransformResponseBodyHook$install$1> cVar) {
        super(3, cVar);
        this.$handler = sVar;
    }

    @Override // sn.q
    public final Object invoke(c<dl.d, HttpClientCall> cVar, dl.d dVar, hn.c<? super r> cVar2) {
        TransformResponseBodyHook$install$1 transformResponseBodyHook$install$1 = new TransformResponseBodyHook$install$1(this.$handler, cVar2);
        transformResponseBodyHook$install$1.L$0 = cVar;
        return transformResponseBodyHook$install$1.invokeSuspend(r.f5635a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to io.ktor.client.plugins.api.TransformResponseBodyHook$install$1 for r11v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = in.a.g()
            int r1 = r11.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L27
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            kotlin.c.b(r12)
            goto Lac
        L13:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1b:
            java.lang.Object r1 = r11.L$1
            rl.a r1 = (rl.a) r1
            java.lang.Object r3 = r11.L$0
            ql.c r3 = (ql.c) r3
            kotlin.c.b(r12)
            goto L66
        L27:
            kotlin.c.b(r12)
            java.lang.Object r12 = r11.L$0
            ql.c r12 = (ql.c) r12
            java.lang.Object r1 = r12.b()
            dl.d r1 = (dl.d) r1
            rl.a r10 = r1.a()
            java.lang.Object r7 = r1.b()
            boolean r1 = r7 instanceof io.ktor.utils.io.a
            if (r1 != 0) goto L43
            bn.r r12 = bn.r.f5635a
            return r12
        L43:
            sn.s<al.l, dl.c, io.ktor.utils.io.a, rl.a, hn.c<java.lang.Object>, java.lang.Object> r4 = r11.$handler
            al.l r5 = new al.l
            r5.<init>()
            java.lang.Object r1 = r12.getContext()
            io.ktor.client.call.HttpClientCall r1 = (io.ktor.client.call.HttpClientCall) r1
            dl.c r6 = r1.e()
            r11.L$0 = r12
            r11.L$1 = r10
            r11.label = r3
            r8 = r10
            r9 = r11
            java.lang.Object r1 = r4.invoke(r5, r6, r7, r8, r9)
            if (r1 != r0) goto L63
            return r0
        L63:
            r3 = r12
            r12 = r1
            r1 = r10
        L66:
            if (r12 != 0) goto L6b
            bn.r r12 = bn.r.f5635a
            return r12
        L6b:
            boolean r4 = r12 instanceof jl.b
            if (r4 != 0) goto L99
            kotlin.reflect.KClass r4 = r1.getType()
            boolean r4 = r4.isInstance(r12)
            if (r4 == 0) goto L7a
            goto L99
        L7a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "transformResponseBody returned "
            r2.append(r3)
            r2.append(r12)
            java.lang.String r12 = " but expected value of type "
            r2.append(r12)
            r2.append(r1)
            java.lang.String r12 = r2.toString()
            r0.<init>(r12)
            throw r0
        L99:
            dl.d r4 = new dl.d
            r4.<init>(r1, r12)
            r12 = 0
            r11.L$0 = r12
            r11.L$1 = r12
            r11.label = r2
            java.lang.Object r12 = r3.d(r4, r11)
            if (r12 != r0) goto Lac
            return r0
        Lac:
            bn.r r12 = bn.r.f5635a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.api.TransformResponseBodyHook$install$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
