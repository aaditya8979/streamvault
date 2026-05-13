package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes11.dex */
public final class io extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3580m9 f27367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p000do.p0 f27369d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io(InterfaceC3580m9 interfaceC3580m9, String str, p000do.p0 p0Var, hn.c cVar) {
        super(2, cVar);
        this.f27367b = interfaceC3580m9;
        this.f27368c = str;
        this.f27369d = p0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new io(this.f27367b, this.f27368c, this.f27369d, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((io) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f27366a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            return obj;
        }
        kotlin.c.b(obj);
        InterfaceC3580m9 interfaceC3580m9 = this.f27367b;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).c("WebResourceHandler", "Waiting for response to finish download: " + this.f27368c);
        }
        p000do.p0 p0Var = this.f27369d;
        this.f27366a = 1;
        Object objN = p0Var.N(this);
        return objN == objG ? objG : objN;
    }
}
