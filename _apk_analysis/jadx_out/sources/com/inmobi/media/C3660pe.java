package com.inmobi.media;

import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.pe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3660pe extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3759te f27873b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3660pe(C3759te c3759te, hn.c cVar) {
        super(2, cVar);
        this.f27873b = c3759te;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3660pe(this.f27873b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3660pe(this.f27873b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f27872a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            InterfaceC3580m9 interfaceC3580m9L = this.f27873b.l();
            if (interfaceC3580m9L != null) {
                ((C3605n9) interfaceC3580m9L).a("NativeRenderedState", "MRC50 Tracking Started");
            }
            go.d dVarB = ((Fd) this.f27873b.f28184b.f28269k.getValue()).f25436a.b();
            C3635oe c3635oe = new C3635oe(null);
            this.f27872a = 1;
            if (go.f.w(dVarB, c3635oe, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        InterfaceC3580m9 interfaceC3580m9L2 = this.f27873b.l();
        if (interfaceC3580m9L2 != null) {
            ((C3605n9) interfaceC3580m9L2).a("NativeRenderedState", "MRC50 Event Occurred");
        }
        C3784ue c3784ue = this.f27873b.f28184b;
        c3784ue.f28260b.f28138d = true;
        Map mapA = AbstractC3491ik.a(((Dc) c3784ue.f28265g.f25384f.getValue()).f25313a);
        Wj wj2 = Wj.f26549a;
        Wj.b("MRCViewable50Rendered", mapA, EnumC3287ak.f26805a);
        this.f27873b.f28184b.f28264f.f26034b.f25873g.a(Te.f26356a);
        ((Fd) this.f27873b.f28184b.f28269k.getValue()).f25436a.a();
        return bn.r.f5635a;
    }
}
