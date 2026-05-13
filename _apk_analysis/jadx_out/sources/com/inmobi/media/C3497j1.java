package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C3497j1;
import com.inmobi.media.W;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3497j1 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f27373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC3547l1 f27374c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3497j1(byte[] bArr, AbstractC3547l1 abstractC3547l1, hn.c cVar) {
        super(2, cVar);
        this.f27373b = bArr;
        this.f27374c = abstractC3547l1;
    }

    public static final bn.r a(AbstractC3547l1 abstractC3547l1, W w10) {
        AbstractC3547l1.a(abstractC3547l1, w10);
        return bn.r.f5635a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3497j1(this.f27373b, this.f27374c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3497j1(this.f27373b, this.f27374c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f27372a;
        try {
            if (i10 == 0) {
                kotlin.c.b(obj);
                byte[] bArr = this.f27373b;
                AbstractC3547l1 abstractC3547l1 = this.f27374c;
                C3266a c3266a = new C3266a(bArr, abstractC3547l1.f27516l.f28301a, abstractC3547l1.f27513i);
                final AbstractC3547l1 abstractC3547l12 = this.f27374c;
                sn.l lVar = new sn.l() { // from class: n9.a8
                    @Override // sn.l
                    public final Object invoke(Object obj2) {
                        return C3497j1.a(abstractC3547l12, (W) obj2);
                    }
                };
                this.f27372a = 1;
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
            AbstractC3547l1 abstractC3547l13 = this.f27374c;
            C3605n9 c3605n9 = abstractC3547l13.f27513i;
            if (c3605n9 != null) {
                C3795v0 c3795v0 = abstractC3547l13.f27516l;
                AbstractC3345d0.a(c3795v0.f28305e, c3795v0.f28306f, adResponse, c3605n9);
            }
            this.f27374c.a(adResponse);
        } catch (Y e10) {
            AbstractC3547l1 abstractC3547l14 = this.f27374c;
            V v10 = e10.f26608b;
            if (v10 instanceof Ni) {
                abstractC3547l14.b(((Ni) v10).f26047a);
            }
            abstractC3547l14.b(e10.f26607a, true, (short) 0);
        } catch (Throwable th2) {
            C3605n9 c3605n92 = this.f27374c.f27513i;
            if (c3605n92 != null) {
                tn.p.j("l1", "<get-TAG>(...)");
                c3605n92.a("l1", "doAdLoadWork: " + th2);
            }
            bn.g gVar = P9.f26117a;
            P9.a(new L2(th2));
            AbstractC3547l1 abstractC3547l15 = this.f27374c;
            abstractC3547l15.getClass();
            abstractC3547l15.b(kotlin.collections.a.o(bn.h.a(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2363)));
            abstractC3547l15.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (short) 0);
        }
        return bn.r.f5635a;
    }
}
