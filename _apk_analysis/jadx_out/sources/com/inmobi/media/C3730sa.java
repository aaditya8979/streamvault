package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: renamed from: com.inmobi.media.sa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3730sa extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC3631oa f28108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref$IntRef f28109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref$IntRef f28110d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3730sa(ViewTreeObserverOnGlobalLayoutListenerC3631oa viewTreeObserverOnGlobalLayoutListenerC3631oa, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, hn.c cVar) {
        super(2, cVar);
        this.f28108b = viewTreeObserverOnGlobalLayoutListenerC3631oa;
        this.f28109c = ref$IntRef;
        this.f28110d = ref$IntRef2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3730sa(this.f28108b, this.f28109c, this.f28110d, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((C3730sa) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f28107a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            p000do.t tVar = this.f28108b.f27771e;
            this.f28107a = 1;
            if (tVar.N(this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        Ref$IntRef ref$IntRef = this.f28109c;
        ViewTreeObserverOnGlobalLayoutListenerC3631oa viewTreeObserverOnGlobalLayoutListenerC3631oa = this.f28108b;
        ref$IntRef.element = viewTreeObserverOnGlobalLayoutListenerC3631oa.f27769c;
        this.f28110d.element = viewTreeObserverOnGlobalLayoutListenerC3631oa.f27770d;
        return bn.r.f5635a;
    }
}
