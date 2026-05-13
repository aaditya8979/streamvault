package com.inmobi.media;

import com.inmobi.media.C3458hb;
import com.inmobi.media.W;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.hb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3458hb extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3266a f27286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC3483ib f27287c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3458hb(C3266a c3266a, AbstractC3483ib abstractC3483ib, hn.c cVar) {
        super(2, cVar);
        this.f27286b = c3266a;
        this.f27287c = abstractC3483ib;
    }

    public static final bn.r a(AbstractC3483ib abstractC3483ib, W w10) {
        abstractC3483ib.f27349m.a(w10);
        return bn.r.f5635a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3458hb(this.f27286b, this.f27287c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3458hb(this.f27286b, this.f27287c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f27285a;
        try {
            if (i10 == 0) {
                kotlin.c.b(obj);
                C3266a c3266a = this.f27286b;
                final AbstractC3483ib abstractC3483ib = this.f27287c;
                sn.l lVar = new sn.l() { // from class: n9.v7
                    @Override // sn.l
                    public final Object invoke(Object obj2) {
                        return C3458hb.a(abstractC3483ib, (W) obj2);
                    }
                };
                this.f27285a = 1;
                obj = c3266a.a(lVar, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            AdResponse adResponse = (AdResponse) obj;
            this.f27287c.f27065a.getClass();
            AbstractC3483ib abstractC3483ib2 = this.f27287c;
            AbstractC3345d0.a("native", abstractC3483ib2.f27068d.f25737g, adResponse, abstractC3483ib2.f27069e);
            C3605n9 c3605n9 = this.f27287c.f27069e;
            if (c3605n9 != null) {
                c3605n9.a("AUM-LoadResponseState", "AdResponse Parse Success");
            }
            this.f27287c.a(adResponse);
        } catch (Y e10) {
            C3605n9 c3605n92 = this.f27287c.f27069e;
            if (c3605n92 != null) {
                c3605n92.b("AUM-LoadResponseState", "AdResponse Parse Failure " + e10);
            }
            AbstractC3483ib abstractC3483ib3 = this.f27287c;
            abstractC3483ib3.getClass();
            V v10 = e10.f26608b;
            if (v10 instanceof Pi) {
                C3571m0 c3571m0 = abstractC3483ib3.f27071g;
                p000do.i.d(c3571m0.f27589a, null, null, new C3546l0(c3571m0, null), 3, null);
                abstractC3483ib3.a(kotlin.collections.a.o(bn.h.a(IronSourceConstants.EVENTS_ERROR_CODE, (short) 0)), e10.f26607a);
            } else if (v10 instanceof J6) {
                abstractC3483ib3.a(kotlin.collections.a.o(bn.h.a(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(((J6) v10).f25698a))), e10.f26607a);
            } else if (v10 instanceof K6) {
                abstractC3483ib3.a(kotlin.collections.a.o(bn.h.a(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf((short) ((K6) v10).f25800a))), e10.f26607a);
            } else {
                if (!(v10 instanceof Ni)) {
                    throw new NoWhenBranchMatchedException();
                }
                abstractC3483ib3.a(((Ni) v10).f26047a, e10.f26607a);
            }
        }
        return bn.r.f5635a;
    }
}
