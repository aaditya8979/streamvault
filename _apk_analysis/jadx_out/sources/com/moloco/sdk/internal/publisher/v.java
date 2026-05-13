package com.moloco.sdk.internal.publisher;

import androidx.annotation.VisibleForTesting;
import androidx.compose.material.TextFieldImplKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.Init$SDKInitResponse;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.Initialization;
import com.moloco.sdk.publisher.MediationInfo;
import com.moloco.sdk.publisher.MolocoInitStatus;
import com.moloco.sdk.service_locator.b;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
public final class v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f47014f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f47015g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final MolocoInitStatus f47016h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final MolocoInitStatus f47017i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.services.j f47018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final go.l<Initialization> f47019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final go.u<Initialization> f47020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Init$SDKInitResponse f47021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final go.l<com.moloco.sdk.internal.e> f47022e;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final MolocoInitStatus a() {
            return v.f47016h;
        }

        @NotNull
        public final MolocoInitStatus b(@NotNull String str) {
            tn.p.k(str, "errorMessage");
            return new MolocoInitStatus(Initialization.FAILURE, str);
        }

        @NotNull
        public final MolocoInitStatus c() {
            return v.f47017i;
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.publisher.InitializationHandler", f = "InitializationHandler.kt", l = {85}, m = "awaitAdFactory")
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f47023a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f47025c;

        public b(hn.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f47023a = obj;
            this.f47025c |= Integer.MIN_VALUE;
            return v.this.d(this);
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.publisher.InitializationHandler$awaitAdFactory$adFactory$1", f = "InitializationHandler.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements sn.p<com.moloco.sdk.internal.e, hn.c<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f47027b;

        public c(hn.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(com.moloco.sdk.internal.e eVar, hn.c<? super Boolean> cVar) {
            return ((c) create(eVar, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            c cVar2 = new c(cVar);
            cVar2.f47027b = obj;
            return cVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f47026a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            return jn.a.a(((com.moloco.sdk.internal.e) this.f47027b) != null);
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.publisher.InitializationHandler", f = "InitializationHandler.kt", l = {TextFieldImplKt.AnimationDuration, 153, 183, 184, 192}, m = "handleInitializationResult")
    public static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f47028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f47029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f47030c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f47031d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f47032e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f47033f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f47034g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f47036i;

        public d(hn.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f47034g = obj;
            this.f47036i |= Integer.MIN_VALUE;
            return v.this.c(null, 0L, null, null, null, this);
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.publisher.InitializationHandler", f = "InitializationHandler.kt", l = {112, 116, 120}, m = MobileAdsBridgeBase.initializeMethodName)
    public static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f47037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f47038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f47039c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f47040d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f47042f;

        public e(hn.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f47040d = obj;
            this.f47042f |= Integer.MIN_VALUE;
            return v.this.e(null, null, null, null, this);
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.publisher.InitializationHandler$startInitialization$2", f = "InitializationHandler.kt", l = {134, 138}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super com.moloco.sdk.internal.g0<Init$SDKInitResponse, com.moloco.sdk.internal.services.init.i>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f47043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f47044b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f47045c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.a f47046d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ v f47047e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f47048f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ MediationInfo f47049g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.services.init.m f47050h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.moloco.sdk.acm.recorder.a aVar, v vVar, String str, MediationInfo mediationInfo, com.moloco.sdk.internal.services.init.m mVar, hn.c<? super f> cVar) {
            super(2, cVar);
            this.f47046d = aVar;
            this.f47047e = vVar;
            this.f47048f = str;
            this.f47049g = mediationInfo;
            this.f47050h = mVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super com.moloco.sdk.internal.g0<Init$SDKInitResponse, com.moloco.sdk.internal.services.init.i>> cVar) {
            return ((f) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return new f(this.f47046d, this.f47047e, this.f47048f, this.f47049g, this.f47050h, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            com.moloco.sdk.acm.e eVar;
            long j10;
            Object objG = in.a.g();
            int i10 = this.f47045c;
            if (i10 == 0) {
                kotlin.c.b(obj);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "InitializationHandler", "startInitialization switch to Dispatchers.IO", null, false, 12, null);
                com.moloco.sdk.acm.e eVarC = this.f47046d.c(com.moloco.sdk.internal.client_metrics_data.e.f45979b.c());
                long jA = this.f47047e.l().a();
                com.moloco.sdk.internal.services.init.j jVarC = b.f.f47654a.c();
                String str = this.f47048f;
                MediationInfo mediationInfo = this.f47049g;
                this.f47043a = eVarC;
                this.f47044b = jA;
                this.f47045c = 1;
                obj = jVarC.a(str, mediationInfo, this);
                if (obj == objG) {
                    return objG;
                }
                eVar = eVarC;
                j10 = jA;
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.moloco.sdk.internal.g0 g0Var = (com.moloco.sdk.internal.g0) this.f47043a;
                    kotlin.c.b(obj);
                    return g0Var;
                }
                j10 = this.f47044b;
                com.moloco.sdk.acm.e eVar2 = (com.moloco.sdk.acm.e) this.f47043a;
                kotlin.c.b(obj);
                eVar = eVar2;
            }
            com.moloco.sdk.internal.g0 g0Var2 = (com.moloco.sdk.internal.g0) obj;
            long jA2 = this.f47047e.l().a() - j10;
            v vVar = this.f47047e;
            com.moloco.sdk.internal.services.init.m mVar = this.f47050h;
            com.moloco.sdk.acm.recorder.a aVar = this.f47046d;
            this.f47043a = g0Var2;
            this.f47045c = 2;
            return vVar.c(g0Var2, jA2, mVar, aVar, eVar, this) == objG ? objG : g0Var2;
        }
    }

    static {
        Initialization initialization = Initialization.SUCCESS;
        f47016h = new MolocoInitStatus(initialization, "Already Initialized");
        f47017i = new MolocoInitStatus(initialization, "Initialized");
    }

    public v(@NotNull com.moloco.sdk.internal.services.j jVar) {
        tn.p.k(jVar, "timeProviderService");
        this.f47018a = jVar;
        go.l<Initialization> lVarA = go.v.a(null);
        this.f47019b = lVarA;
        this.f47020c = go.f.c(lVarA);
        this.f47022e = go.v.a(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0107 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0252 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.moloco.sdk.internal.g0<com.moloco.sdk.Init$SDKInitResponse, com.moloco.sdk.internal.services.init.i> r24, long r25, com.moloco.sdk.internal.services.init.m r27, com.moloco.sdk.acm.recorder.a r28, com.moloco.sdk.acm.e r29, hn.c<? super bn.r> r30) {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.v.c(com.moloco.sdk.internal.g0, long, com.moloco.sdk.internal.services.init.m, com.moloco.sdk.acm.recorder.a, com.moloco.sdk.acm.e, hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@org.jetbrains.annotations.NotNull hn.c<? super com.moloco.sdk.internal.e> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.moloco.sdk.internal.publisher.v.b
            if (r0 == 0) goto L13
            r0 = r12
            com.moloco.sdk.internal.publisher.v$b r0 = (com.moloco.sdk.internal.publisher.v.b) r0
            int r1 = r0.f47025c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f47025c = r1
            goto L18
        L13:
            com.moloco.sdk.internal.publisher.v$b r0 = new com.moloco.sdk.internal.publisher.v$b
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f47023a
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f47025c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.c.b(r12)
            goto L53
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L31:
            kotlin.c.b(r12)
            com.moloco.sdk.internal.MolocoLogger r4 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            r7 = 0
            r8 = 0
            r9 = 12
            r10 = 0
            java.lang.String r5 = "InitializationHandler"
            java.lang.String r6 = "Moloco SDK awaiting init to receive AdFactory"
            com.moloco.sdk.internal.MolocoLogger.info$default(r4, r5, r6, r7, r8, r9, r10)
            go.l<com.moloco.sdk.internal.e> r12 = r11.f47022e
            com.moloco.sdk.internal.publisher.v$c r2 = new com.moloco.sdk.internal.publisher.v$c
            r4 = 0
            r2.<init>(r4)
            r0.f47025c = r3
            java.lang.Object r12 = go.f.w(r12, r2, r0)
            if (r12 != r1) goto L53
            return r1
        L53:
            java.lang.String r0 = "null cannot be cast to non-null type com.moloco.sdk.internal.AdFactory"
            tn.p.i(r12, r0)
            com.moloco.sdk.internal.e r12 = (com.moloco.sdk.internal.e) r12
            com.moloco.sdk.internal.MolocoLogger r0 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            java.lang.String r1 = "InitializationHandler"
            java.lang.String r2 = "Moloco SDK init completed, AdFactory received"
            com.moloco.sdk.internal.MolocoLogger.info$default(r0, r1, r2, r3, r4, r5, r6)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.v.d(hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(@org.jetbrains.annotations.NotNull java.lang.String r17, @org.jetbrains.annotations.NotNull com.moloco.sdk.publisher.MediationInfo r18, @org.jetbrains.annotations.NotNull com.moloco.sdk.internal.services.init.m r19, @org.jetbrains.annotations.NotNull com.moloco.sdk.acm.recorder.a r20, @org.jetbrains.annotations.NotNull hn.c<? super com.moloco.sdk.internal.g0<com.moloco.sdk.Init$SDKInitResponse, com.moloco.sdk.internal.services.init.i>> r21) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.v.e(java.lang.String, com.moloco.sdk.publisher.MediationInfo, com.moloco.sdk.internal.services.init.m, com.moloco.sdk.acm.recorder.a, hn.c):java.lang.Object");
    }

    @VisibleForTesting(otherwise = 5)
    @Nullable
    public final Object g(@NotNull hn.c<? super bn.r> cVar) {
        this.f47021d = null;
        this.f47022e.setValue(null);
        this.f47019b.setValue(null);
        Object objA = b.f.f47654a.c().a(cVar);
        return objA == in.a.g() ? objA : bn.r.f5635a;
    }

    public final Object h(String str, MediationInfo mediationInfo, com.moloco.sdk.internal.services.init.m mVar, com.moloco.sdk.acm.recorder.a aVar, hn.c<? super com.moloco.sdk.internal.g0<Init$SDKInitResponse, com.moloco.sdk.internal.services.init.i>> cVar) {
        return p000do.g.g(com.moloco.sdk.internal.scheduling.c.a().getIo(), new f(aVar, this, str, mediationInfo, mVar, null), cVar);
    }

    public final boolean i() {
        return m();
    }

    @NotNull
    public final go.u<Initialization> j() {
        return this.f47020c;
    }

    @Nullable
    public final Init$SDKInitResponse k() {
        return this.f47021d;
    }

    @NotNull
    public final com.moloco.sdk.internal.services.j l() {
        return this.f47018a;
    }

    public final boolean m() {
        try {
            b.i.f47671a.c();
            return true;
        } catch (IllegalStateException unused) {
            return false;
        }
    }
}
