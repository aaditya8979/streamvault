package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.re, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3709re extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3759te f28060b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3709re(C3759te c3759te, hn.c cVar) {
        super(2, cVar);
        this.f28060b = c3759te;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3709re(this.f28060b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3709re(this.f28060b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f28059a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            InterfaceC3580m9 interfaceC3580m9L = this.f28060b.l();
            if (interfaceC3580m9L != null) {
                ((C3605n9) interfaceC3580m9L).a("NativeRenderedState", "Track Views Attached to Telemetry Started - waiting for window state change");
            }
            go.l lVar = ((yo) this.f28060b.f28184b.f28270l.getValue()).f28614b;
            C3685qe c3685qe = new C3685qe(null);
            this.f28059a = 1;
            if (go.f.w(lVar, c3685qe, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        C3784ue c3784ue = this.f28060b.f28184b;
        c3784ue.f28260b.f28136b = true;
        c3784ue.f28264f.f26034b.f25871e.a(Te.f26356a);
        C3759te c3759te = this.f28060b;
        Wc.a(c3759te.f28184b.f28261c, c3759te.l());
        C3319c0 c3319c0 = this.f28060b.f28550a.f28472a.f27736d;
        c3319c0.getClass();
        c3319c0.f26902e = SystemClock.elapsedRealtime();
        Dc dc2 = (Dc) this.f28060b.f28184b.f28265g.f25384f.getValue();
        Sg sg2 = this.f28060b.f28184b.f28261c;
        dc2.getClass();
        tn.p.k(sg2, "publisherNativeViewData");
        Map mapA = AbstractC3491ik.a(dc2.f25313a);
        ViewGroup parentView$media_release = sg2.f26319a.getParentView$media_release();
        int i11 = 0;
        for (Pair pair : Wc.a(sg2)) {
            View view = (View) pair.component1();
            short sShortValue = ((Number) pair.component2()).shortValue();
            if (view != null && view.getVisibility() == 0 && AbstractC3818vn.a(view, parentView$media_release)) {
                i11 |= 1 << sShortValue;
            }
        }
        mapA.put("viewState", Integer.valueOf(i11));
        Wj wj2 = Wj.f26549a;
        Wj.b("ViewStateOnParentAttached", mapA, EnumC3287ak.f26805a);
        return bn.r.f5635a;
    }
}
