package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.dj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3364dj extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public mo.a f27046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC3415fj f27047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC3338cj f27048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC3338cj f27049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC3415fj f27051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3338cj f27052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3338cj f27053h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3364dj(AbstractC3415fj abstractC3415fj, InterfaceC3338cj interfaceC3338cj, InterfaceC3338cj interfaceC3338cj2, hn.c cVar) {
        super(2, cVar);
        this.f27051f = abstractC3415fj;
        this.f27052g = interfaceC3338cj;
        this.f27053h = interfaceC3338cj2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3364dj(this.f27051f, this.f27052g, this.f27053h, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((C3364dj) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        mo.a aVar;
        InterfaceC3338cj interfaceC3338cj;
        AbstractC3415fj abstractC3415fj;
        InterfaceC3338cj interfaceC3338cj2;
        Object objG = in.a.g();
        int i10 = this.f27050e;
        if (i10 == 0) {
            kotlin.c.b(obj);
            AbstractC3415fj abstractC3415fj2 = this.f27051f;
            aVar = abstractC3415fj2.f27177b;
            interfaceC3338cj = this.f27052g;
            InterfaceC3338cj interfaceC3338cj3 = this.f27053h;
            this.f27046a = aVar;
            this.f27047b = abstractC3415fj2;
            this.f27048c = interfaceC3338cj;
            this.f27049d = interfaceC3338cj3;
            this.f27050e = 1;
            if (aVar.c(null, this) == objG) {
                return objG;
            }
            abstractC3415fj = abstractC3415fj2;
            interfaceC3338cj2 = interfaceC3338cj3;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC3338cj2 = this.f27049d;
            interfaceC3338cj = this.f27048c;
            abstractC3415fj = this.f27047b;
            aVar = this.f27046a;
            kotlin.c.b(obj);
        }
        try {
            abstractC3415fj.b(interfaceC3338cj, interfaceC3338cj2);
            return bn.r.f5635a;
        } finally {
            aVar.d(null);
        }
    }
}
