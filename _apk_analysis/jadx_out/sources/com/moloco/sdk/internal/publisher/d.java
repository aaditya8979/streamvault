package com.moloco.sdk.internal.publisher;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.A;
import com.moloco.sdk.internal.ortb.model.B;
import com.moloco.sdk.internal.ortb.model.C4381e;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoAdErrorKt;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.service_locator.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k;
import java.util.List;
import java.util.Locale;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
@VisibleForTesting
public final class d implements AdLoad {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final a f46585p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f46586q = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final sn.l<Long, co.b> f46587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f46588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final sn.l<C4381e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k> f46589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.ortb.a f46590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final n0 f46591f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final AdFormatType f46592g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.services.l f46593h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.recorder.a f46594i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final p000do.l0 f46595j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f46596k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public String f46597l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public com.moloco.sdk.internal.ortb.model.g f46598m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.e f46599n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public kotlinx.coroutines.g f46600o;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.publisher.AdLoadImpl$load$2", f = "AdLoad.kt", l = {99}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46601a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f46603c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AdLoad.Listener f46604d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f46605e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, AdLoad.Listener listener, long j10, hn.c<? super b> cVar) {
            super(2, cVar);
            this.f46603c = str;
            this.f46604d = listener;
            this.f46605e = j10;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return d.this.new b(this.f46603c, this.f46604d, this.f46605e, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            com.moloco.sdk.internal.ortb.model.f fVarF;
            com.moloco.sdk.internal.ortb.model.f fVarF2;
            Object objG = in.a.g();
            int i10 = this.f46601a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                d dVar = d.this;
                String str = this.f46603c;
                this.f46601a = 1;
                obj = dVar.e(str, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            String str2 = (String) obj;
            if (str2 == null) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdLoadImpl", "Could not pre-process the bid response. Failing the load() call.", null, false, 12, null);
                AdLoad.Listener listener = this.f46604d;
                if (listener != null) {
                    listener.onAdLoadFailed(MolocoAdErrorKt.createAdErrorInfo(d.this.f46588c, MolocoAdError.ErrorType.AD_BID_PARSE_ERROR));
                }
                com.moloco.sdk.acm.recorder.a aVar = d.this.f46594i;
                com.moloco.sdk.acm.e eVarF = d.this.f46599n.f(com.moloco.sdk.internal.client_metrics_data.d.f45971d.c(), "failure");
                com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.f45969b;
                String strC = dVar2.c();
                MolocoAdError.ErrorType errorType = MolocoAdError.ErrorType.AD_BID_PARSE_ERROR;
                com.moloco.sdk.acm.e eVarF2 = eVarF.f(strC, String.valueOf(errorType.getErrorCode()));
                com.moloco.sdk.internal.client_metrics_data.d dVar3 = com.moloco.sdk.internal.client_metrics_data.d.f45970c;
                String strC2 = dVar3.c();
                String strName = d.this.f46592g.name();
                Locale locale = Locale.ROOT;
                String lowerCase = strName.toLowerCase(locale);
                tn.p.j(lowerCase, "toLowerCase(...)");
                aVar.a(eVarF2.f(strC2, lowerCase));
                com.moloco.sdk.acm.recorder.a aVar2 = d.this.f46594i;
                com.moloco.sdk.acm.b bVarE = new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.f45954m.c()).e(dVar2.c(), String.valueOf(errorType.getErrorCode()));
                String strC3 = dVar3.c();
                String lowerCase2 = d.this.f46592g.name().toLowerCase(locale);
                tn.p.j(lowerCase2, "toLowerCase(...)");
                aVar2.b(bVarE.e(strC3, lowerCase2));
                return bn.r.f5635a;
            }
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.info$default(molocoLogger, "AdLoad", "Processed the bidResponse, proceeding with the load() call.", null, false, 12, null);
            w0 w0VarA = e0.a(this.f46604d, d.this.f46599n, d.this.f46592g, d.this.f46594i);
            if (tn.p.f(d.this.f46597l, str2)) {
                if (d.this.isLoaded()) {
                    A aF = null;
                    MolocoAd molocoAdCreateAdInfo$default = MolocoAdKt.createAdInfo$default(d.this.f46588c, null, null, 6, null);
                    long j10 = this.f46605e;
                    d dVar4 = d.this;
                    C4381e c4381eB = dVar4.b(dVar4.f46598m);
                    w0VarA.b(molocoAdCreateAdInfo$default, j10, (c4381eB == null || (fVarF2 = c4381eB.f()) == null) ? null : fVarF2.f());
                    d dVar5 = d.this;
                    C4381e c4381eB2 = dVar5.b(dVar5.f46598m);
                    if (c4381eB2 != null && (fVarF = c4381eB2.f()) != null) {
                        aF = fVarF.f();
                    }
                    w0VarA.a(molocoAdCreateAdInfo$default, aF);
                    return bn.r.f5635a;
                }
                kotlinx.coroutines.g gVar = d.this.f46600o;
                if (gVar != null && gVar.isActive()) {
                    MolocoLogger.info$default(molocoLogger, "AdLoad", "Already loading ad " + d.this.f46592g + ' ' + d.this.f46588c + ". Returning", null, false, 12, null);
                    return bn.r.f5635a;
                }
            }
            d.this.i(str2, this.f46605e, w0VarA);
            return bn.r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.publisher.AdLoadImpl", f = "AdLoad.kt", l = {162}, m = "processBidResponse")
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f46606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f46607b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f46609d;

        public c(hn.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46607b = obj;
            this.f46609d |= Integer.MIN_VALUE;
            return d.this.e(null, this);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.publisher.d$d, reason: collision with other inner class name */
    @jn.d(c = "com.moloco.sdk.internal.publisher.AdLoadImpl$startLoadJob$1", f = "AdLoad.kt", l = {183}, m = "invokeSuspend")
    public static final class C0569d extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f46611b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f46613d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f46614e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ w0 f46615f;

        /* JADX INFO: renamed from: com.moloco.sdk.internal.publisher.d$d$a */
        public static final class a implements k.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f46616a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w0 f46617b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ C4381e f46618c;

            /* JADX INFO: renamed from: com.moloco.sdk.internal.publisher.d$d$a$a, reason: collision with other inner class name */
            @jn.d(c = "com.moloco.sdk.internal.publisher.AdLoadImpl$startLoadJob$1$2$onLoad$1", f = "AdLoad.kt", l = {}, m = "invokeSuspend")
            public static final class C0570a extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f46619a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f46620b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ w0 f46621c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ C4381e f46622d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0570a(d dVar, w0 w0Var, C4381e c4381e, hn.c<? super C0570a> cVar) {
                    super(2, cVar);
                    this.f46620b = dVar;
                    this.f46621c = w0Var;
                    this.f46622d = c4381e;
                }

                @Override // sn.p
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
                    return ((C0570a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                    return new C0570a(this.f46620b, this.f46621c, this.f46622d, cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    com.moloco.sdk.internal.ortb.model.f fVarF;
                    in.a.g();
                    if (this.f46619a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                    this.f46620b.f46596k = true;
                    w0 w0Var = this.f46621c;
                    MolocoAd molocoAdCreateAdInfo = MolocoAdKt.createAdInfo(this.f46620b.f46588c, jn.a.c(this.f46622d.g()), this.f46622d.e());
                    d dVar = this.f46620b;
                    C4381e c4381eB = dVar.b(dVar.f46598m);
                    w0Var.a(molocoAdCreateAdInfo, (c4381eB == null || (fVarF = c4381eB.f()) == null) ? null : fVarF.f());
                    return bn.r.f5635a;
                }
            }

            /* JADX INFO: renamed from: com.moloco.sdk.internal.publisher.d$d$a$b */
            @jn.d(c = "com.moloco.sdk.internal.publisher.AdLoadImpl$startLoadJob$1$2$onLoadError$1", f = "AdLoad.kt", l = {}, m = "invokeSuspend")
            public static final class b extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f46623a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f46624b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ w0 f46625c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c f46626d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(d dVar, w0 w0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar, hn.c<? super b> cVar2) {
                    super(2, cVar2);
                    this.f46624b = dVar;
                    this.f46625c = w0Var;
                    this.f46626d = cVar;
                }

                @Override // sn.p
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
                    return ((b) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                    return new b(this.f46624b, this.f46625c, this.f46626d, cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    com.moloco.sdk.internal.ortb.model.f fVarF;
                    in.a.g();
                    if (this.f46623a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                    this.f46624b.f46596k = false;
                    w0 w0Var = this.f46625c;
                    com.moloco.sdk.internal.c0 c0VarA = com.moloco.sdk.internal.d0.a(this.f46624b.f46588c, MolocoAdError.ErrorType.AD_LOAD_FAILED, this.f46626d);
                    d dVar = this.f46624b;
                    C4381e c4381eB = dVar.b(dVar.f46598m);
                    w0Var.c(c0VarA, (c4381eB == null || (fVarF = c4381eB.f()) == null) ? null : fVarF.f());
                    return bn.r.f5635a;
                }
            }

            /* JADX INFO: renamed from: com.moloco.sdk.internal.publisher.d$d$a$c */
            @jn.d(c = "com.moloco.sdk.internal.publisher.AdLoadImpl$startLoadJob$1$2$onLoadTimeout$1", f = "AdLoad.kt", l = {}, m = "invokeSuspend")
            public static final class c extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f46627a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f46628b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ w0 f46629c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a f46630d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(d dVar, w0 w0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar, hn.c<? super c> cVar) {
                    super(2, cVar);
                    this.f46628b = dVar;
                    this.f46629c = w0Var;
                    this.f46630d = aVar;
                }

                @Override // sn.p
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
                    return ((c) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                    return new c(this.f46628b, this.f46629c, this.f46630d, cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    com.moloco.sdk.internal.ortb.model.f fVarF;
                    in.a.g();
                    if (this.f46627a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                    this.f46628b.f46596k = false;
                    w0 w0Var = this.f46629c;
                    com.moloco.sdk.internal.c0 c0VarA = com.moloco.sdk.internal.d0.a(this.f46628b.f46588c, MolocoAdError.ErrorType.AD_LOAD_TIMEOUT_ERROR, this.f46630d);
                    d dVar = this.f46628b;
                    C4381e c4381eB = dVar.b(dVar.f46598m);
                    w0Var.c(c0VarA, (c4381eB == null || (fVarF = c4381eB.f()) == null) ? null : fVarF.f());
                    return bn.r.f5635a;
                }
            }

            public a(d dVar, w0 w0Var, C4381e c4381e) {
                this.f46616a = dVar;
                this.f46617b = w0Var;
                this.f46618c = c4381e;
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k.a
            public void a() {
                p000do.i.d(this.f46616a.f46595j, null, null, new C0570a(this.f46616a, this.f46617b, this.f46618c, null), 3, null);
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k.a
            public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
                tn.p.k(cVar, "internalError");
                p000do.i.d(this.f46616a.f46595j, null, null, new b(this.f46616a, this.f46617b, cVar, null), 3, null);
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k.a
            public void b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar) {
                tn.p.k(aVar, "timeoutError");
                p000do.i.d(this.f46616a.f46595j, null, null, new c(this.f46616a, this.f46617b, aVar, null), 3, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0569d(String str, long j10, w0 w0Var, hn.c<? super C0569d> cVar) {
            super(2, cVar);
            this.f46613d = str;
            this.f46614e = j10;
            this.f46615f = w0Var;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((C0569d) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            C0569d c0569d = d.this.new C0569d(this.f46613d, this.f46614e, this.f46615f, cVar);
            c0569d.f46611b = obj;
            return c0569d;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00cc  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00f6  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 295
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.d.C0569d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull p000do.l0 l0Var, @NotNull sn.l<? super Long, co.b> lVar, @NotNull String str, @NotNull sn.l<? super C4381e, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k> lVar2, @NotNull com.moloco.sdk.internal.ortb.a aVar, @NotNull n0 n0Var, @NotNull AdFormatType adFormatType, @NotNull com.moloco.sdk.internal.services.l lVar3, @NotNull com.moloco.sdk.acm.recorder.a aVar2) {
        tn.p.k(l0Var, "scope");
        tn.p.k(lVar, "timeout");
        tn.p.k(str, "adUnitId");
        tn.p.k(lVar2, "recreateXenossAdLoader");
        tn.p.k(aVar, "parseBidResponse");
        tn.p.k(n0Var, "adLoadPreprocessor");
        tn.p.k(adFormatType, "adFormatType");
        tn.p.k(lVar3, "webViewChecker");
        tn.p.k(aVar2, "metricsRecorder");
        this.f46587b = lVar;
        this.f46588c = str;
        this.f46589d = lVar2;
        this.f46590e = aVar;
        this.f46591f = n0Var;
        this.f46592g = adFormatType;
        this.f46593h = lVar3;
        this.f46594i = aVar2;
        this.f46595j = kotlinx.coroutines.d.i(l0Var, com.moloco.sdk.internal.scheduling.c.a().getMain());
        this.f46599n = aVar2.c(com.moloco.sdk.internal.client_metrics_data.e.f45987j.c());
    }

    public final C4381e b(com.moloco.sdk.internal.ortb.model.g gVar) {
        List<B> listC;
        B b10;
        List<C4381e> listC2;
        if (gVar == null || (listC = gVar.c()) == null || (b10 = listC.get(0)) == null || (listC2 = b10.c()) == null) {
            return null;
        }
        return listC2.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r5, hn.c<? super java.lang.String> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.moloco.sdk.internal.publisher.d.c
            if (r0 == 0) goto L13
            r0 = r6
            com.moloco.sdk.internal.publisher.d$c r0 = (com.moloco.sdk.internal.publisher.d.c) r0
            int r1 = r0.f46609d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46609d = r1
            goto L18
        L13:
            com.moloco.sdk.internal.publisher.d$c r0 = new com.moloco.sdk.internal.publisher.d$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f46607b
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f46609d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f46606a
            java.lang.String r5 = (java.lang.String) r5
            kotlin.c.b(r6)
            goto L45
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.c.b(r6)
            com.moloco.sdk.internal.publisher.n0 r6 = r4.f46591f
            r0.f46606a = r5
            r0.f46609d = r3
            java.lang.Object r6 = r6.a(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L4a
            return r6
        L4a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.d.e(java.lang.String, hn.c):java.lang.Object");
    }

    public final void i(String str, long j10, w0 w0Var) {
        kotlinx.coroutines.g gVar = this.f46600o;
        if (gVar != null) {
            g.a.a(gVar, null, 1, null);
        }
        this.f46600o = p000do.i.d(this.f46595j, null, null, new C0569d(str, j10, w0Var, null), 3, null);
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public boolean isLoaded() {
        return this.f46596k;
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public void load(@NotNull String str, @Nullable AdLoad.Listener listener) {
        tn.p.k(str, "bidResponseJson");
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(this.f46593h.a());
        if (thM7537exceptionOrNullimpl != null) {
            MolocoLogger.INSTANCE.error("AdLoad", "WebView Error: " + thM7537exceptionOrNullimpl.getMessage(), thM7537exceptionOrNullimpl, true);
            if (listener != null) {
                listener.onAdLoadFailed(MolocoAdErrorKt.createAdErrorInfo(this.f46588c, MolocoAdError.ErrorType.AD_LOAD_WEBVIEW_FAILED));
                return;
            }
            return;
        }
        long jA = b.h.f47664a.h().a();
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "AdLoadImpl", "load() called with bidResponseJson: " + str, false, 4, null);
        this.f46599n.d();
        com.moloco.sdk.acm.recorder.a aVar = this.f46594i;
        com.moloco.sdk.acm.b bVar = new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.f45952k.c());
        String strC = com.moloco.sdk.internal.client_metrics_data.d.f45970c.c();
        String lowerCase = this.f46592g.name().toLowerCase(Locale.ROOT);
        tn.p.j(lowerCase, "toLowerCase(...)");
        aVar.b(bVar.e(strC, lowerCase));
        p000do.i.d(this.f46595j, null, null, new b(str, listener, jA, null), 3, null);
    }
}
