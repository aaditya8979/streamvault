package com.inmobi.media;

import com.inmobi.media.C3333ce;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.ce, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3333ce extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3759te f26927a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3333ce(C3759te c3759te, hn.c cVar) {
        super(2, cVar);
        this.f26927a = c3759te;
    }

    public static final bn.r a(C3759te c3759te, short s10) {
        InterfaceC3580m9 interfaceC3580m9L = c3759te.l();
        if (interfaceC3580m9L != null) {
            ((C3605n9) interfaceC3580m9L).a("NativeRenderedState", "onAssetClickEvent " + ((int) s10));
        }
        ((Sc) c3759te.f28184b.f28271m.getValue()).a(s10);
        return bn.r.f5635a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3333ce(this.f26927a, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3333ce(this.f26927a, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        Ug ug2 = (Ug) this.f26927a.f28184b.f28273o.getValue();
        final C3759te c3759te = this.f26927a;
        Sg sg2 = c3759te.f28184b.f28261c;
        sn.l lVar = new sn.l() { // from class: n9.x5
            @Override // sn.l
            public final Object invoke(Object obj2) {
                return C3333ce.a(c3759te, ((Short) obj2).shortValue());
            }
        };
        ug2.getClass();
        Ug.a(sg2, lVar);
        return bn.r.f5635a;
    }
}
