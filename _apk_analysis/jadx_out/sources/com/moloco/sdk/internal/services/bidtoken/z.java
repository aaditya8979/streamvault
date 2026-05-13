package com.moloco.sdk.internal.services.bidtoken;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.g0;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@VisibleForTesting(otherwise = 2)
public final class z implements b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final e f47333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final l0 f47334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final y f47335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f47336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f47337f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final mo.a f47338g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public kotlinx.coroutines.g f47339h;

    @jn.d(c = "com.moloco.sdk.internal.services.bidtoken.ServerBidTokenServiceImpl$bidToken$2", f = "ServerBidTokenService.kt", l = {190, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements sn.l<hn.c<? super n>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47340a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.a f47342c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.acm.recorder.a aVar, hn.c<? super a> cVar) {
            super(1, cVar);
            this.f47342c = aVar;
        }

        @Override // sn.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(hn.c<? super n> cVar) {
            return ((a) create(cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(hn.c<?> cVar) {
            return z.this.new a(this.f47342c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f47340a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                z.this.h("[Thread: " + Thread.currentThread().getName() + "] Acquired lock, fetching status of current token");
                y yVar = z.this.f47335d;
                this.f47340a = 1;
                obj = yVar.a(this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    if (i10 == 2) {
                        kotlin.c.b(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            B b10 = (B) obj;
            z.this.f("[Thread: " + Thread.currentThread().getName() + "] bidToken status: " + b10);
            if (!b10.b()) {
                z.this.h("[Thread: " + Thread.currentThread().getName() + "] bidToken needs refresh, fetching new token");
                z zVar = z.this;
                com.moloco.sdk.acm.recorder.a aVar = this.f47342c;
                n nVarC = g.c();
                this.f47340a = 2;
                obj = zVar.c(aVar, nVarC, false, false, this);
                return obj == objG ? objG : obj;
            }
            com.moloco.sdk.acm.recorder.a aVar2 = this.f47342c;
            com.moloco.sdk.acm.b bVarE = new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.f45963v.c()).e(com.moloco.sdk.internal.client_metrics_data.d.f45971d.c(), "true").e("initial_fetch", com.ironsource.mediationsdk.metadata.a.f32683h);
            B b11 = B.f47124b;
            aVar2.b(bVarE.e("expiring", b10 != b11 ? com.ironsource.mediationsdk.metadata.a.f32683h : "true"));
            n nVarA = z.this.f47335d.a();
            if (b10 == b11) {
                z.this.f("[Thread: " + Thread.currentThread().getName() + "] bidToken is expiring, returning cached, and refreshing async");
                z.this.d(this.f47342c);
            } else {
                z.this.f("[Thread: " + Thread.currentThread().getName() + "] bidToken doesn't need refresh, returning cached");
            }
            return nVarA;
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.services.bidtoken.ServerBidTokenServiceImpl", f = "ServerBidTokenService.kt", l = {129, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173}, m = "fetchServerBidToken$moloco_sdk_release")
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f47343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f47344b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f47345c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f47346d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f47347e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f47348f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f47349g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f47351i;

        public b(hn.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f47349g = obj;
            this.f47351i |= Integer.MIN_VALUE;
            return z.this.c(null, null, false, false, this);
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.services.bidtoken.ServerBidTokenServiceImpl$fetchServerBidToken$bidTokenComponents$1", f = "ServerBidTokenService.kt", l = {174}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements sn.l<hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47352a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g0<n, com.moloco.sdk.internal.q> f47354c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g0<n, com.moloco.sdk.internal.q> g0Var, hn.c<? super c> cVar) {
            super(1, cVar);
            this.f47354c = g0Var;
        }

        @Override // sn.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(hn.c<? super bn.r> cVar) {
            return ((c) create(cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(hn.c<?> cVar) {
            return z.this.new c(this.f47354c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f47352a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                y yVar = z.this.f47335d;
                n nVar = (n) ((g0.b) this.f47354c).a();
                this.f47352a = 1;
                if (yVar.a(nVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return bn.r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.services.bidtoken.ServerBidTokenServiceImpl$refreshTokenAsyncOnExpiry$1", f = "ServerBidTokenService.kt", l = {106}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47355a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.a f47357c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.moloco.sdk.acm.recorder.a aVar, hn.c<? super d> cVar) {
            super(2, cVar);
            this.f47357c = aVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((d) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return z.this.new d(this.f47357c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f47355a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                z.this.h("[Thread: " + Thread.currentThread().getName() + "] Fetching token from server");
                z zVar = z.this;
                com.moloco.sdk.acm.recorder.a aVar = this.f47357c;
                n nVarC = g.c();
                this.f47355a = 1;
                if (zVar.c(aVar, nVarC, true, true, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            z.this.h("[Thread: " + Thread.currentThread().getName() + "] Finished fetching token from server");
            return bn.r.f5635a;
        }
    }

    public z(@NotNull e eVar, @NotNull l0 l0Var, @NotNull y yVar) {
        tn.p.k(eVar, "bidTokenApi");
        tn.p.k(l0Var, "scope");
        tn.p.k(yVar, "tokenCache");
        this.f47333b = eVar;
        this.f47334c = l0Var;
        this.f47335d = yVar;
        this.f47336e = "ServerBidTokenServiceImpl";
        this.f47337f = true;
        this.f47338g = mo.g.b(false, 1, null);
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.b0
    @Nullable
    public Object a(@NotNull com.moloco.sdk.acm.recorder.a aVar, @NotNull hn.c<? super n> cVar) {
        h("[Thread: " + Thread.currentThread().getName() + "] Fetching bidToken(), acquiring lock");
        return com.moloco.sdk.internal.utils.a.a(this.f47338g, new a(aVar, null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @androidx.annotation.VisibleForTesting(otherwise = 2)
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@org.jetbrains.annotations.NotNull com.moloco.sdk.acm.recorder.a r20, @org.jetbrains.annotations.NotNull com.moloco.sdk.internal.services.bidtoken.n r21, boolean r22, boolean r23, @org.jetbrains.annotations.NotNull hn.c<? super com.moloco.sdk.internal.services.bidtoken.n> r24) {
        /*
            Method dump skipped, instruction units count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.bidtoken.z.c(com.moloco.sdk.acm.recorder.a, com.moloco.sdk.internal.services.bidtoken.n, boolean, boolean, hn.c):java.lang.Object");
    }

    @VisibleForTesting(otherwise = 2)
    public final void d(@NotNull com.moloco.sdk.acm.recorder.a aVar) {
        tn.p.k(aVar, "metricsRecorder");
        h("[Thread: " + Thread.currentThread().getName() + "] Refreshing token async");
        com.moloco.sdk.acm.b bVar = new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.f45965x.c());
        kotlinx.coroutines.g gVar = this.f47339h;
        aVar.b(bVar.e("async", String.valueOf(gVar != null ? gVar.isActive() : false)));
        kotlinx.coroutines.g gVar2 = this.f47339h;
        if (gVar2 != null && gVar2.isActive()) {
            h("[Thread: " + Thread.currentThread().getName() + "] Async refresh already in progress. Returning");
            return;
        }
        h("[Thread: " + Thread.currentThread().getName() + "] Scheduling to fetch token from server");
        this.f47339h = p000do.i.d(this.f47334c, null, null, new d(aVar, null), 3, null);
    }

    public final void f(String str) {
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, this.f47336e, "[Thread: " + Thread.currentThread().getName() + "] " + str, false, 4, null);
    }

    public final void h(String str) {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, this.f47336e, "[Thread: " + Thread.currentThread().getName() + "][sbt] " + str, null, false, 12, null);
    }
}
