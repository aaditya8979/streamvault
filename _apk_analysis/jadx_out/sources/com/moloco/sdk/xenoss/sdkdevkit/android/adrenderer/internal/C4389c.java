package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.C4381e;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
public final class C4389c implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f47988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f47989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C4381e f47990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final w0 f47991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 f47992f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.recorder.a f47993g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final String f47994h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public i f47995i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final p000do.l0 f47996j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public s<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.d0> f47997k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public s<m, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n> f47998l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public s<m, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n> f47999m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final v f48000n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final go.l<Boolean> f48001o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final go.u<Boolean> f48002p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final go.l<Boolean> f48003q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final go.u<Boolean> f48004r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final go.l<Boolean> f48005s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final go.u<Boolean> f48006t;

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$b */
    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedFullscreenAd$load$1", f = "AggregatedFullscreenAd.kt", l = {105}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48007a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f48009c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k.a f48010d;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$b$a */
        public static final class a implements k.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ k.a f48011a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C4389c f48012b;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$b$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0603a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f48013a;

                static {
                    int[] iArr = new int[i.values().length];
                    try {
                        iArr[i.f47726a.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[i.f47727b.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[i.f47728c.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[i.f47729d.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[i.f47730e.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[i.f47731f.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    f48013a = iArr;
                }
            }

            public a(k.a aVar, C4389c c4389c) {
                this.f48011a = aVar;
                this.f48012b = c4389c;
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k.a
            public void a() {
                k.a aVar = this.f48011a;
                if (aVar != null) {
                    aVar.a();
                }
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k.a
            public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
                tn.p.k(cVar, "internalError");
                k.a aVar = this.f48011a;
                if (aVar != null) {
                    aVar.a(cVar);
                }
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k.a
            public void b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar) {
                tn.p.k(aVar, "timeoutError");
                i creativeType = this.f48012b.getCreativeType();
                switch (creativeType == null ? -1 : C0603a.f48013a[creativeType.ordinal()]) {
                    case -1:
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f48012b.f47994h, "creativeType is null", null, false, 12, null);
                        return;
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        k.a aVar2 = this.f48011a;
                        if (aVar2 != null) {
                            aVar2.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f48040e);
                            return;
                        }
                        return;
                    case 2:
                        k.a aVar3 = this.f48011a;
                        if (aVar3 != null) {
                            aVar3.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f48041f);
                            return;
                        }
                        return;
                    case 3:
                        k.a aVar4 = this.f48011a;
                        if (aVar4 != null) {
                            aVar4.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f48042g);
                            return;
                        }
                        return;
                    case 4:
                    case 5:
                    case 6:
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f48012b.f47994h, "Template creative types should not be used with AggregatedFullscreenAd. Use TemplateFullscreenAd instead.", null, false, 12, null);
                        return;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, k.a aVar, hn.c<? super b> cVar) {
            super(2, cVar);
            this.f48009c = j10;
            this.f48010d = aVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return C4389c.this.new b(this.f48009c, this.f48010d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f48007a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                C4389c c4389c = C4389c.this;
                this.f48007a = 1;
                if (c4389c.s(this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            s sVarX = C4389c.this.x();
            if (sVarX != null) {
                sVarX.i(this.f48009c, new a(this.f48010d, C4389c.this));
            }
            return bn.r.f5635a;
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$c, reason: collision with other inner class name */
    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedFullscreenAd", f = "AggregatedFullscreenAd.kt", l = {69}, m = "prepareAd")
    public static final class C0604c extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f48014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f48015b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f48017d;

        public C0604c(hn.c<? super C0604c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f48015b = obj;
            this.f48017d |= Integer.MIN_VALUE;
            return C4389c.this.s(this);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$d */
    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedFullscreenAd$prepareAd$2", f = "AggregatedFullscreenAd.kt", l = {}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements sn.p<Boolean, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48018a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f48019b;

        public d(hn.c<? super d> cVar) {
            super(2, cVar);
        }

        public final Object a(boolean z10, hn.c<? super bn.r> cVar) {
            return ((d) create(Boolean.valueOf(z10), cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            d dVar = C4389c.this.new d(cVar);
            dVar.f48019b = ((Boolean) obj).booleanValue();
            return dVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo2invoke(Boolean bool, hn.c<? super bn.r> cVar) {
            return a(bool.booleanValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f48018a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            C4389c.this.f48001o.setValue(jn.a.a(this.f48019b));
            return bn.r.f5635a;
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$e */
    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedFullscreenAd$prepareAd$3", f = "AggregatedFullscreenAd.kt", l = {}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements sn.p<Boolean, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f48022b;

        public e(hn.c<? super e> cVar) {
            super(2, cVar);
        }

        public final Object a(boolean z10, hn.c<? super bn.r> cVar) {
            return ((e) create(Boolean.valueOf(z10), cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            e eVar = C4389c.this.new e(cVar);
            eVar.f48022b = ((Boolean) obj).booleanValue();
            return eVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo2invoke(Boolean bool, hn.c<? super bn.r> cVar) {
            return a(bool.booleanValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f48021a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            C4389c.this.f48003q.setValue(jn.a.a(this.f48022b));
            return bn.r.f5635a;
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$f */
    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedFullscreenAd$prepareAd$4", f = "AggregatedFullscreenAd.kt", l = {}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements sn.p<Boolean, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f48025b;

        public f(hn.c<? super f> cVar) {
            super(2, cVar);
        }

        public final Object a(boolean z10, hn.c<? super bn.r> cVar) {
            return ((f) create(Boolean.valueOf(z10), cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            f fVar = C4389c.this.new f(cVar);
            fVar.f48025b = ((Boolean) obj).booleanValue();
            return fVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo2invoke(Boolean bool, hn.c<? super bn.r> cVar) {
            return a(bool.booleanValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f48024a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            C4389c.this.f48005s.setValue(jn.a.a(this.f48025b));
            return bn.r.f5635a;
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$g */
    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedFullscreenAd$prepareAd$crType$1", f = "AggregatedFullscreenAd.kt", l = {}, m = "invokeSuspend")
    public static final class g extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super i>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48027a;

        public g(hn.c<? super g> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super i> cVar) {
            return ((g) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return C4389c.this.new g(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f48027a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            i iVarC = n0.f48494a.c(C4389c.this.f47990d.a());
            C4389c c4389c = C4389c.this;
            c4389c.f47995i = iVarC;
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, c4389c.f47994h, "Native ad resolved creativeType: " + iVarC, false, 4, null);
            return iVarC;
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$h */
    public /* synthetic */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48029a;

        static {
            int[] iArr = new int[i.values().length];
            try {
                iArr[i.f47726a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.f47727b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i.f47728c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[i.f47729d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[i.f47730e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[i.f47731f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f48029a = iArr;
        }
    }

    public C4389c(@NotNull Context context, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, @Nullable i iVar, @NotNull C4381e c4381e, @NotNull w0 w0Var, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, @NotNull com.moloco.sdk.acm.recorder.a aVar2) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(aVar, "customUserEventBuilderService");
        tn.p.k(c4381e, "bid");
        tn.p.k(w0Var, "externalLinkHandler");
        tn.p.k(e0Var, "watermark");
        tn.p.k(aVar2, "metricsRecorder");
        this.f47988b = context;
        this.f47989c = aVar;
        this.f47990d = c4381e;
        this.f47991e = w0Var;
        this.f47992f = e0Var;
        this.f47993g = aVar2;
        this.f47994h = "AggregatedFullscreenAd";
        this.f47995i = iVar;
        this.f47996j = kotlinx.coroutines.d.a(com.moloco.sdk.internal.scheduling.c.a().getMain());
        this.f48000n = new v();
        Boolean bool = Boolean.FALSE;
        go.l<Boolean> lVarA = go.v.a(bool);
        this.f48001o = lVarA;
        this.f48002p = lVarA;
        go.l<Boolean> lVarA2 = go.v.a(bool);
        this.f48003q = lVarA2;
        this.f48004r = lVarA2;
        go.l<Boolean> lVarA3 = go.v.a(bool);
        this.f48005s = lVarA3;
        this.f48006t = lVarA3;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r
    public void destroy() {
        kotlinx.coroutines.d.e(this.f47996j, null, 1, null);
        s<?, ?> sVarX = x();
        if (sVarX != null) {
            sVarX.destroy();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
    @Nullable
    public i getCreativeType() {
        return this.f47995i;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void i(long j10, @Nullable k.a aVar) {
        p000do.i.d(this.f47996j, null, null, new b(j10, aVar, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    @NotNull
    public go.u<Boolean> isLoaded() {
        return this.f48002p;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t
    @NotNull
    public go.u<Boolean> k() {
        return this.f48006t;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    @NotNull
    public go.u<Boolean> l() {
        return this.f48004r;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void b(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p pVar, @Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o oVar) {
        bn.r rVar;
        tn.p.k(pVar, "options");
        s<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.d0> sVar = this.f47997k;
        if (sVar != null) {
            sVar.b(pVar.c(), oVar);
            bn.r rVar2 = bn.r.f5635a;
            return;
        }
        s<m, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n> sVar2 = this.f47998l;
        if (sVar2 != null) {
            sVar2.b(pVar.a(), oVar);
            bn.r rVar3 = bn.r.f5635a;
            return;
        }
        s<m, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n> sVar3 = this.f47999m;
        if (sVar3 != null) {
            sVar3.b(pVar.b(), oVar);
            rVar = bn.r.f5635a;
        } else {
            rVar = null;
        }
        if (rVar != null || oVar == null) {
            return;
        }
        oVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.b.f48048a);
        bn.r rVar4 = bn.r.f5635a;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(hn.c<? super bn.r> r21) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C4389c.s(hn.c):java.lang.Object");
    }

    public final s<?, ?> x() {
        s<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.d0> sVar = this.f47997k;
        if (sVar != null) {
            return sVar;
        }
        s<m, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n> sVar2 = this.f47998l;
        return sVar2 == null ? this.f47999m : sVar2;
    }
}
