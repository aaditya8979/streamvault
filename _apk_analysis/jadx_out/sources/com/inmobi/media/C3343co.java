package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.co, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3343co extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f27002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3580m9 f27003c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3343co(String str, InterfaceC3580m9 interfaceC3580m9, hn.c cVar) {
        super(2, cVar);
        this.f27002b = str;
        this.f27003c = interfaceC3580m9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3343co(this.f27002b, this.f27003c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3343co(this.f27002b, this.f27003c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objG = in.a.g();
        int i10 = this.f27001a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            return obj;
        }
        kotlin.c.b(obj);
        jo joVar = jo.f27432a;
        String str = this.f27002b;
        InterfaceC3580m9 interfaceC3580m9 = this.f27003c;
        this.f27001a = 1;
        Object objA = joVar.a(str, interfaceC3580m9, this);
        return objA == objG ? objG : objA;
    }
}
