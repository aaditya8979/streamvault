package yads;

import android.app.Activity;
import android.content.Context;
import com.monetization.ads.mediation.base.prefetch.MediatedAdapterPrefetcher;
import java.util.HashMap;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
public final class rh2 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f94455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xh2 f94456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f94457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a03 f94458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qq1 f94459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MediatedAdapterPrefetcher f94460g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh2(xh2 xh2Var, Context context, a03 a03Var, qq1 qq1Var, MediatedAdapterPrefetcher mediatedAdapterPrefetcher, hn.c cVar) {
        super(2, cVar);
        this.f94456c = xh2Var;
        this.f94457d = context;
        this.f94458e = a03Var;
        this.f94459f = qq1Var;
        this.f94460g = mediatedAdapterPrefetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new rh2(this.f94456c, this.f94457d, this.f94458e, this.f94459f, this.f94460g, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((rh2) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f94455b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            mh2 mh2Var = this.f94456c.f96781d;
            Context context = this.f94457d;
            a03 a03Var = this.f94458e;
            qq1 qq1Var = this.f94459f;
            MediatedAdapterPrefetcher mediatedAdapterPrefetcher = this.f94460g;
            this.f94455b = 1;
            mh2Var.getClass();
            kotlinx.coroutines.c cVar = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.d(this), 1);
            cVar.K();
            try {
                Activity activityA = j1.a();
                if (activityA != null) {
                    context = activityA;
                }
                HashMap map = new HashMap(qq1Var.f94112c);
                if (a03Var != null) {
                    map.put("width", String.valueOf(a03Var.getWidth()));
                    map.put("height", String.valueOf(a03Var.getHeight()));
                }
                mediatedAdapterPrefetcher.prefetchAd(context, map, new lh2(mh2Var, qq1Var, cVar));
            } catch (Exception unused) {
                if (cVar.isActive()) {
                    mediatedAdapterPrefetcher.onInvalidate();
                    Result.a aVar = Result.Companion;
                    jh2 jh2Var = mh2Var.f92358a;
                    String str = qq1Var.f94111b;
                    jh2Var.getClass();
                    cVar.resumeWith(Result.m7534constructorimpl(jh2.a(str, null, null)));
                }
            }
            obj = cVar.B();
            if (obj == in.a.g()) {
                jn.f.c(this);
            }
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        return obj;
    }
}
