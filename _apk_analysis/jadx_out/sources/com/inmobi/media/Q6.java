package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdResponse;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: loaded from: classes8.dex */
public final class Q6 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ R6 f26171b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q6(R6 r62, hn.c cVar) {
        super(2, cVar);
        this.f26171b = r62;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new Q6(this.f26171b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new Q6(this.f26171b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f26170a;
        try {
            if (i10 == 0) {
                kotlin.c.b(obj);
                C3319c0 c3319c0 = this.f26171b.f27070f;
                c3319c0.getClass();
                c3319c0.f26900c = SystemClock.elapsedRealtime();
                Integer num = this.f26171b.f26234m.f27687d;
                long jIntValue = num != null ? num.intValue() : 15000;
                P6 p62 = new P6(this.f26171b, null);
                this.f26170a = 1;
                obj = TimeoutKt.c(jIntValue, p62, this);
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
            this.f26171b.f27065a.getClass();
            R6 r62 = this.f26171b;
            AbstractC3345d0.a("native", r62.f27068d.f25737g, adResponse, r62.f27069e);
            C3605n9 c3605n9 = this.f26171b.f27069e;
            if (c3605n9 != null) {
                c3605n9.a("AUM-FetchingState", "AdResponse Parse Success");
            }
            this.f26171b.a(adResponse);
        } catch (Y e10) {
            C3605n9 c3605n92 = this.f26171b.f27069e;
            if (c3605n92 != null) {
                c3605n92.b("AUM-FetchingState", "AdResponse Parse Failure " + e10);
            }
            this.f26171b.a(e10);
        } catch (TimeoutCancellationException unused) {
            C3605n9 c3605n93 = this.f26171b.f27069e;
            if (c3605n93 != null) {
                c3605n93.b("AUM-FetchingState", "Ad fetch timed out");
            }
            this.f26171b.a(new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT), new J6((short) 2138)));
        }
        return bn.r.f5635a;
    }
}
