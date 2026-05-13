package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes9.dex */
public final class Wh extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3337ci f26547b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wh(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, hn.c cVar) {
        super(2, cVar);
        this.f26547b = gestureDetectorOnGestureListenerC3337ci;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new Wh(this.f26547b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new Wh(this.f26547b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC3580m9 interfaceC3580m9;
        Object objG = in.a.g();
        int i10 = this.f26546a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            this.f26546a = 1;
            if (p000do.s0.a(1000L, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        if (!this.f26547b.isAttachedToWindow() && (interfaceC3580m9 = this.f26547b.f26958i) != null) {
            ((C3605n9) interfaceC3580m9).a();
        }
        return bn.r.f5635a;
    }
}
