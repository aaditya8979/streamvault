package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
public final class E7 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N7 f25369a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E7(hn.c cVar, N7 n72) {
        super(2, cVar);
        this.f25369a = n72;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new E7(cVar, this.f25369a);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new E7((hn.c) obj2, this.f25369a).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        if (this.f25369a.b() == EnumC3736sg.f28127f) {
            this.f25369a.f26007p.seekTo(0L);
            N7 n72 = this.f25369a;
            n72.f26003l.set(EnumC3736sg.f28124c);
        }
        S7 s72 = this.f25369a.f26016y;
        if (s72.f26289e) {
            s72.a();
            s72.f26288d.a();
        } else {
            P4.a(s72.f26285a, new R7(s72, null));
        }
        C3776u6 c3776u6 = this.f25369a.f26015x;
        if (!c3776u6.f28231d.getAndSet(true)) {
            p000do.l0 l0Var = c3776u6.f28229b;
            long j10 = c3776u6.f28238k;
            C3726s6 c3726s6 = new C3726s6(c3776u6, null);
            tn.p.k(l0Var, "<this>");
            tn.p.k(c3726s6, "action");
            c3776u6.f28232e = p000do.i.d(l0Var, p000do.w0.c().M(), null, new C3(j10, null, c3726s6), 2, null);
            p000do.l0 l0Var2 = c3776u6.f28229b;
            long j11 = c3776u6.f28239l;
            C3751t6 c3751t6 = new C3751t6(c3776u6, null);
            tn.p.k(l0Var2, "<this>");
            tn.p.k(c3751t6, "action");
            c3776u6.f28233f = p000do.i.d(l0Var2, p000do.w0.c().M(), null, new C3(j11, null, c3751t6), 2, null);
        }
        this.f25369a.f26007p.play();
        N7 n73 = this.f25369a;
        n73.f26003l.set(EnumC3736sg.f28125d);
        N7 n74 = this.f25369a;
        n74.a(new C3470hn(n74.f26007p.getCurrentPosition()));
        return bn.r.f5635a;
    }
}
