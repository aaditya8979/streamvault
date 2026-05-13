package com.inmobi.media;

import android.app.ApplicationExitInfo;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3846x1 extends SuspendLambda implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3871y1 f28476a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3846x1(C3871y1 c3871y1, hn.c cVar) {
        super(1, cVar);
        this.f28476a = c3871y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(hn.c cVar) {
        return new C3846x1(this.f28476a, cVar);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return new C3846x1(this.f28476a, (hn.c) obj).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        C3871y1 c3871y1 = this.f28476a;
        List<ApplicationExitInfo> historicalProcessExitReasons = c3871y1.f28561e.getHistoricalProcessExitReasons(c3871y1.f28558b.getPackageName(), 0, 10);
        tn.p.j(historicalProcessExitReasons, "getHistoricalProcessExitReasons(...)");
        Ea ea2 = this.f28476a.f28562f;
        ea2.getClass();
        tn.p.k("exitReasonTimestamp", "key");
        long j10 = ea2.f25373a.getLong("exitReasonTimestamp", 0L);
        C3871y1 c3871y12 = this.f28476a;
        long timestamp = j10;
        for (ApplicationExitInfo applicationExitInfo : historicalProcessExitReasons) {
            if (applicationExitInfo.getTimestamp() > j10) {
                long j11 = c3871y12.f28559c;
                C3821w1 c3821w1 = new C3821w1(c3871y12, applicationExitInfo, null);
                p000do.l0 l0Var = AbstractC3492il.f27361a;
                tn.p.k(c3821w1, "runnable");
                p000do.i.d(AbstractC3492il.f27361a, null, null, new C3417fl(j11, null, c3821w1), 3, null);
                if (applicationExitInfo.getTimestamp() > timestamp) {
                    timestamp = applicationExitInfo.getTimestamp();
                }
            }
        }
        this.f28476a.f28562f.a("exitReasonTimestamp", timestamp, false);
        return bn.r.f5635a;
    }
}
