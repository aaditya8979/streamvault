package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONException;

/* JADX INFO: renamed from: com.inmobi.media.qa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3681qa extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3805va f27956a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3681qa(C3805va c3805va, hn.c cVar) {
        super(2, cVar);
        this.f27956a = c3805va;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3681qa(this.f27956a, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3681qa(this.f27956a, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws JSONException {
        in.a.g();
        kotlin.c.b(obj);
        InterfaceC3580m9 interfaceC3580m9 = this.f27956a.f28356c;
        if (interfaceC3580m9 != null) {
            String str = AbstractC3830wa.f28425a;
            tn.p.j(str, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str, "destroyVideoPlayer is called");
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f27956a.f28354a;
        gestureDetectorOnGestureListenerC3337ci.f26940a1 = null;
        C3803v8 c3803v8 = gestureDetectorOnGestureListenerC3337ci.Y0;
        if (c3803v8 != null) {
            c3803v8.a();
        }
        return bn.r.f5635a;
    }
}
