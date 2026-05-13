package com.moloco.sdk.internal.ilrd;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import bn.r;
import cn.f0;
import com.moloco.sdk.Init$SDKInitResponse;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ilrd.f;
import com.moloco.sdk.internal.ilrd.i;
import com.moloco.sdk.internal.services.bidtoken.providers.q;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;

/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 0)
public final class e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f46188f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f46189g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final l0 f46190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IlrdEventsRepository f46191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final bn.g f46192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<f> f46193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public kotlinx.coroutines.g f46194e;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.ilrd.IlrdService$subscribe$1", f = "IlrdService.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46195a;

        public b(hn.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return e.this.new b(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f46195a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            List<f> listB = e.this.b();
            e eVar = e.this;
            for (f fVar : listB) {
                i value = fVar.getState().getValue();
                if (value instanceof i.a) {
                    MolocoLogger.warn$default(MolocoLogger.INSTANCE, "IlrdService", "Failed to subscribe to " + fVar.a() + " ILRD: " + ((i.a) value).a(), null, false, 12, null);
                } else if (value instanceof i.c) {
                    eVar.d(fVar);
                } else if (!(value instanceof i.b)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.ilrd.IlrdService$subscribeToProvider$2$1", f = "IlrdService.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements p<f.a, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f46198b;

        public c(hn.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(f.a aVar, hn.c<? super r> cVar) {
            return ((c) create(aVar, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            c cVar2 = e.this.new c(cVar);
            cVar2.f46198b = obj;
            return cVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f46197a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            f.a aVar = (f.a) this.f46198b;
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdService", "Revenue event: " + aVar, null, false, 12, null);
            e.this.f46191b.l(aVar);
            return r.f5635a;
        }
    }

    public e(@NotNull l0 l0Var, @NotNull final Context context, @NotNull IlrdEventsRepository ilrdEventsRepository, @NotNull final List<? extends Init$SDKInitResponse.SupportedNetworks> list) {
        tn.p.k(l0Var, "scope");
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(ilrdEventsRepository, "eventsRepository");
        tn.p.k(list, "supportedNetworksList");
        this.f46190a = l0Var;
        this.f46191b = ilrdEventsRepository;
        this.f46192c = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.internal.ilrd.g
            @Override // sn.a
            public final Object invoke() {
                return e.c(list, context, this);
            }
        });
        this.f46193d = Collections.synchronizedSet(new LinkedHashSet());
    }

    public static final List c(List list, Context context, e eVar) {
        ArrayList arrayList = new ArrayList();
        if (list.contains(Init$SDKInitResponse.SupportedNetworks.MAX)) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdService", "Adding AppLovin as ILRD provider", null, false, 12, null);
            arrayList.add(new com.moloco.sdk.internal.ilrd.provider.a(context, eVar.f46190a));
        }
        if (list.contains(Init$SDKInitResponse.SupportedNetworks.LEVEL_PLAY)) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdService", "Adding IronSource as ILRD provider", null, false, 12, null);
            arrayList.add(new com.moloco.sdk.internal.ilrd.provider.f(context, eVar.f46190a));
        }
        return f0.g1(arrayList);
    }

    public final List<f> b() {
        return (List) this.f46192c.getValue();
    }

    public final void d(f fVar) {
        Object objB = fVar.b();
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objB);
        if (thM7537exceptionOrNullimpl != null) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "IlrdService", "Failed to subscribe to " + fVar.a() + " ILRD: " + thM7537exceptionOrNullimpl, null, false, 12, null);
        }
        if (Result.m7540isSuccessimpl(objB)) {
            this.f46193d.add(fVar);
            go.f.D(go.f.G(fVar.c(), new c(null)), this.f46190a);
        }
    }

    @Nullable
    public final q f() {
        q qVarB;
        IlrdEventsRepository ilrdEventsRepository = this.f46191b;
        ilrdEventsRepository.t();
        com.moloco.sdk.internal.ilrd.a aVarR = ilrdEventsRepository.r();
        if (aVarR != null && (qVarB = h.b(aVarR)) != null) {
            return qVarB;
        }
        MolocoLogger.warn$default(MolocoLogger.INSTANCE, "IlrdService", "provideDataForBidToken() Session is null", null, false, 12, null);
        return null;
    }

    public final synchronized void h() {
        kotlinx.coroutines.g gVar = this.f46194e;
        if (gVar == null || !gVar.isActive()) {
            this.f46194e = p000do.i.d(this.f46190a, null, null, new b(null), 3, null);
        }
    }
}
