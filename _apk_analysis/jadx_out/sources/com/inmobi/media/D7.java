package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class D7 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N7 f25302a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D7(hn.c cVar, N7 n72) {
        super(2, cVar);
        this.f25302a = n72;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new D7(cVar, this.f25302a);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new D7((hn.c) obj2, this.f25302a).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        this.f25302a.f26007p.pause();
        this.f25302a.f26015x.a();
        S7 s72 = this.f25302a.f26016y;
        s72.f26286b.setVolume(0.0f);
        s72.f26288d.a();
        N7 n72 = this.f25302a;
        n72.f26003l.set(EnumC3736sg.f28126e);
        N7 n73 = this.f25302a;
        n73.a(new Om(n73.f26007p.getCurrentPosition()));
        return bn.r.f5635a;
    }
}
