package com.inmobi.media;

import androidx.webkit.Profile;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes10.dex */
public final class Zh extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public mo.a f26716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GestureDetectorOnGestureListenerC3337ci f26717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f26719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3337ci f26720e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zh(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, hn.c cVar) {
        super(2, cVar);
        this.f26720e = gestureDetectorOnGestureListenerC3337ci;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        Zh zh2 = new Zh(this.f26720e, cVar);
        zh2.f26719d = obj;
        return zh2;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        Zh zh2 = new Zh(this.f26720e, (hn.c) obj2);
        zh2.f26719d = (p000do.l0) obj;
        return zh2.invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p000do.l0 l0Var;
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci;
        mo.a aVar;
        Object objG = in.a.g();
        int i10 = this.f26718c;
        if (i10 == 0) {
            kotlin.c.b(obj);
            p000do.l0 l0Var2 = (p000do.l0) this.f26719d;
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci2 = this.f26720e;
            mo.a aVar2 = gestureDetectorOnGestureListenerC3337ci2.f26990y;
            this.f26719d = l0Var2;
            this.f26716a = aVar2;
            this.f26717b = gestureDetectorOnGestureListenerC3337ci2;
            this.f26718c = 1;
            if (aVar2.c(null, this) == objG) {
                return objG;
            }
            l0Var = l0Var2;
            gestureDetectorOnGestureListenerC3337ci = gestureDetectorOnGestureListenerC3337ci2;
            aVar = aVar2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gestureDetectorOnGestureListenerC3337ci = this.f26717b;
            aVar = this.f26716a;
            l0Var = (p000do.l0) this.f26719d;
            kotlin.c.b(obj);
        }
        try {
            if (tn.p.f("Loading", gestureDetectorOnGestureListenerC3337ci.f26992z)) {
                InterfaceC3580m9 interfaceC3580m9 = gestureDetectorOnGestureListenerC3337ci.f26958i;
                if (interfaceC3580m9 != null) {
                    String str = GestureDetectorOnGestureListenerC3337ci.f26937g1;
                    tn.p.j(str, "access$getTAG$cp(...)");
                    ((C3605n9) interfaceC3580m9).a(str, "updateWebViewLoaded " + l0Var);
                }
                gestureDetectorOnGestureListenerC3337ci.getListener().g(gestureDetectorOnGestureListenerC3337ci);
                gestureDetectorOnGestureListenerC3337ci.setAndUpdateViewState(Profile.DEFAULT_PROFILE_NAME);
                InterfaceC3580m9 interfaceC3580m92 = gestureDetectorOnGestureListenerC3337ci.f26958i;
                if (interfaceC3580m92 != null) {
                    String str2 = GestureDetectorOnGestureListenerC3337ci.f26937g1;
                    tn.p.j(str2, "access$getTAG$cp(...)");
                    ((C3605n9) interfaceC3580m92).a(str2, "updateWebViewLoaded state changed to " + gestureDetectorOnGestureListenerC3337ci.getViewState());
                }
            }
            return bn.r.f5635a;
        } finally {
            aVar.d(null);
        }
    }
}
