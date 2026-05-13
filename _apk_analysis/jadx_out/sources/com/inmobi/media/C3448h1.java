package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C3448h1;
import com.inmobi.media.W;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3448h1 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC3547l1 f27269b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3448h1(AbstractC3547l1 abstractC3547l1, hn.c cVar) {
        super(2, cVar);
        this.f27269b = abstractC3547l1;
    }

    public static final bn.r a(AbstractC3547l1 abstractC3547l1, W w10) {
        AbstractC3547l1.a(abstractC3547l1, w10);
        return bn.r.f5635a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3448h1(this.f27269b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3448h1(this.f27269b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f27268a;
        try {
            if (i10 != 0) {
                try {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                } catch (Throwable th2) {
                    this.f27269b.b((byte) 0);
                    throw th2;
                }
            } else {
                kotlin.c.b(obj);
                Yn yn2 = new Yn(this.f27269b.G(), this.f27269b.f27513i);
                final AbstractC3547l1 abstractC3547l1 = this.f27269b;
                sn.l lVar = new sn.l() { // from class: n9.t7
                    @Override // sn.l
                    public final Object invoke(Object obj2) {
                        return C3448h1.a(abstractC3547l1, (W) obj2);
                    }
                };
                this.f27268a = 1;
                obj = yn2.a(lVar, this);
                if (obj == objG) {
                    return objG;
                }
            }
            AdResponse adResponse = (AdResponse) obj;
            AbstractC3547l1 abstractC3547l12 = this.f27269b;
            C3605n9 c3605n9 = abstractC3547l12.f27513i;
            if (c3605n9 != null) {
                C3795v0 c3795v0 = abstractC3547l12.f27516l;
                AbstractC3345d0.a(c3795v0.f28305e, c3795v0.f28306f, adResponse, c3605n9);
            }
            this.f27269b.a(adResponse);
        } catch (Y e10) {
            AbstractC3547l1.a(this.f27269b, e10);
        } catch (Throwable th3) {
            C3605n9 c3605n92 = this.f27269b.f27513i;
            if (c3605n92 != null) {
                tn.p.j("l1", "<get-TAG>(...)");
                c3605n92.a("l1", "doAdLoadWork: " + th3);
            }
            bn.g gVar = P9.f26117a;
            P9.a(new L2(th3));
            AbstractC3547l1 abstractC3547l13 = this.f27269b;
            abstractC3547l13.getClass();
            abstractC3547l13.b(kotlin.collections.a.o(bn.h.a(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2363)));
            abstractC3547l13.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (short) 0);
        }
        this.f27269b.b((byte) 0);
        return bn.r.f5635a;
    }
}
