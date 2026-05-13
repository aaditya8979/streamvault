package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.C4381e;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import go.f;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import jn.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred(parameters = 0)
@SuppressLint({"ViewConstructor"})
public final class b extends B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Context f47942h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final C4381e f47943i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p f47944j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final w0 f47945k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 f47946l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.a f47947m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final p000do.l0 f47948n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.services.f0 f47949o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final s f47950p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final String f47951q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public i f47952r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o f47953s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0> f47954t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public B<m> f47955u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public B<m> f47956v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final k f47957w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final go.l<Boolean> f47958x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final go.u<Boolean> f47959y;

    public static final class a implements k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final go.l<Boolean> f47960b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final go.u<Boolean> f47961c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f47963e;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0598a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f47964a;

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
                f47964a = iArr;
            }
        }

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a$b, reason: collision with other inner class name */
        @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedBanner$adLoader$1$load$1", f = "AggregatedBanner.kt", l = {109}, m = "invokeSuspend")
        public static final class C0599b extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f47965a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f47967c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ long f47968d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ k.a f47969e;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a$b$a, reason: collision with other inner class name */
            public static final class C0600a implements k.a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ k.a f47970a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b f47971b;

                /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a$b$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C0601a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f47972a;

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
                        f47972a = iArr;
                    }
                }

                public C0600a(k.a aVar, b bVar) {
                    this.f47970a = aVar;
                    this.f47971b = bVar;
                }

                @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k.a
                public void a() {
                    k.a aVar = this.f47970a;
                    if (aVar != null) {
                        aVar.a();
                    }
                }

                @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k.a
                public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
                    tn.p.k(cVar, "internalError");
                    k.a aVar = this.f47970a;
                    if (aVar != null) {
                        aVar.a(cVar);
                    }
                }

                @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k.a
                public void b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar) {
                    tn.p.k(aVar, "timeoutError");
                    i creativeType = this.f47971b.getCreativeType();
                    switch (creativeType == null ? -1 : C0601a.f47972a[creativeType.ordinal()]) {
                        case -1:
                            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f47971b.f47951q, "creativeType is null", new Throwable(), false, 8, null);
                            return;
                        case 0:
                        default:
                            throw new NoWhenBranchMatchedException();
                        case 1:
                            k.a aVar2 = this.f47970a;
                            if (aVar2 != null) {
                                aVar2.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f48043h);
                                return;
                            }
                            return;
                        case 2:
                            k.a aVar3 = this.f47970a;
                            if (aVar3 != null) {
                                aVar3.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f48044i);
                                return;
                            }
                            return;
                        case 3:
                            k.a aVar4 = this.f47970a;
                            if (aVar4 != null) {
                                aVar4.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f48045j);
                                return;
                            }
                            return;
                        case 4:
                        case 5:
                        case 6:
                            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f47971b.f47951q, "Template creative types should not be used with AggregatedBanner. Use TemplateBannerView instead.", null, false, 12, null);
                            return;
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0599b(b bVar, long j10, k.a aVar, hn.c<? super C0599b> cVar) {
                super(2, cVar);
                this.f47967c = bVar;
                this.f47968d = j10;
                this.f47969e = aVar;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
                return ((C0599b) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                return a.this.new C0599b(this.f47967c, this.f47968d, this.f47969e, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objG = in.a.g();
                int i10 = this.f47965a;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    a aVar = a.this;
                    this.f47965a = 1;
                    if (aVar.d(this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                }
                B bannerImpl = this.f47967c.getBannerImpl();
                if (bannerImpl != null) {
                    bannerImpl.i(this.f47968d, new C0600a(this.f47969e, this.f47967c));
                }
                return bn.r.f5635a;
            }
        }

        @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedBanner$adLoader$1", f = "AggregatedBanner.kt", l = {157}, m = "prepareBanner")
        public static final class c extends ContinuationImpl {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Object f47973a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f47974b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f47976d;

            public c(hn.c<? super c> cVar) {
                super(cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f47974b = obj;
                this.f47976d |= Integer.MIN_VALUE;
                return a.this.d(this);
            }
        }

        @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedBanner$adLoader$1$prepareBanner$2", f = "AggregatedBanner.kt", l = {}, m = "invokeSuspend")
        public static final class d extends SuspendLambda implements sn.p<Boolean, hn.c<? super bn.r>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f47977a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ boolean f47978b;

            public d(hn.c<? super d> cVar) {
                super(2, cVar);
            }

            public final Object a(boolean z10, hn.c<? super bn.r> cVar) {
                return ((d) create(Boolean.valueOf(z10), cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                d dVar = a.this.new d(cVar);
                dVar.f47978b = ((Boolean) obj).booleanValue();
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
                if (this.f47977a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                a.this.f47960b.setValue(jn.a.a(this.f47978b));
                return bn.r.f5635a;
            }
        }

        @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedBanner$adLoader$1$prepareBanner$3", f = "AggregatedBanner.kt", l = {}, m = "invokeSuspend")
        public static final class e extends SuspendLambda implements sn.p<Boolean, hn.c<? super bn.r>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f47980a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ boolean f47981b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f47982c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(b bVar, hn.c<? super e> cVar) {
                super(2, cVar);
                this.f47982c = bVar;
            }

            public final Object a(boolean z10, hn.c<? super bn.r> cVar) {
                return ((e) create(Boolean.valueOf(z10), cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                e eVar = new e(this.f47982c, cVar);
                eVar.f47981b = ((Boolean) obj).booleanValue();
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
                if (this.f47980a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                this.f47982c.f47958x.setValue(jn.a.a(this.f47981b));
                return bn.r.f5635a;
            }
        }

        @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedBanner$adLoader$1$prepareBanner$crType$1", f = "AggregatedBanner.kt", l = {}, m = "invokeSuspend")
        public static final class f extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super i>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f47983a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f47984b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(b bVar, hn.c<? super f> cVar) {
                super(2, cVar);
                this.f47984b = bVar;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super i> cVar) {
                return ((f) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                return new f(this.f47984b, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                in.a.g();
                if (this.f47983a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                i iVarC = n0.f48494a.c(this.f47984b.f47943i.a());
                this.f47984b.f47952r = iVarC;
                return iVarC;
            }
        }

        public a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar) {
            this.f47963e = aVar;
            go.l<Boolean> lVarA = go.v.a(Boolean.FALSE);
            this.f47960b = lVarA;
            this.f47961c = go.f.c(lVarA);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x010f  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0141  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object d(hn.c<? super bn.r> r24) {
            /*
                Method dump skipped, instruction units count: 508
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b.a.d(hn.c):java.lang.Object");
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
        public void i(long j10, k.a aVar) {
            p000do.i.d(b.this.f47948n, null, null, new C0599b(b.this, j10, aVar, null), 3, null);
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
        public go.u<Boolean> isLoaded() {
            return this.f47961c;
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$b, reason: collision with other inner class name */
    @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedBanner$destroy$1", f = "AggregatedBanner.kt", l = {}, m = "invokeSuspend")
    public static final class C0602b extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47985a;

        public C0602b(hn.c<? super C0602b> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((C0602b) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return b.this.new C0602b(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f47985a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            b.super.destroy();
            B bannerImpl = b.this.getBannerImpl();
            if (bannerImpl != null) {
                bannerImpl.destroy();
            }
            return bn.r.f5635a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, @Nullable i iVar, @NotNull C4381e c4381e, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p pVar, @NotNull w0 w0Var, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, @NotNull com.moloco.sdk.internal.a aVar2, @NotNull p000do.l0 l0Var, @NotNull com.moloco.sdk.internal.services.f0 f0Var, @NotNull s sVar) {
        super(context, l0Var);
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(aVar, "customUserEventBuilderService");
        tn.p.k(c4381e, "bid");
        tn.p.k(pVar, "options");
        tn.p.k(w0Var, "externalLinkHandler");
        tn.p.k(e0Var, "watermark");
        tn.p.k(aVar2, "viewLifecycleOwner");
        tn.p.k(l0Var, "scope");
        tn.p.k(f0Var, "clickthroughService");
        tn.p.k(sVar, "buttonTracker");
        this.f47942h = context;
        this.f47943i = c4381e;
        this.f47944j = pVar;
        this.f47945k = w0Var;
        this.f47946l = e0Var;
        this.f47947m = aVar2;
        this.f47948n = l0Var;
        this.f47949o = f0Var;
        this.f47950p = sVar;
        this.f47951q = "AggregatedBanner";
        setTag("MolocoAggregatedBannerView");
        this.f47952r = iVar;
        this.f47957w = new a(aVar);
        go.l<Boolean> lVarA = go.v.a(Boolean.FALSE);
        this.f47958x = lVarA;
        this.f47959y = f.c(lVarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final B<?> getBannerImpl() {
        B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0> b10 = this.f47954t;
        if (b10 != null) {
            return b10;
        }
        B<m> b11 = this.f47955u;
        return b11 == null ? this.f47956v : b11;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r
    public void destroy() {
        p000do.i.d(this.f47948n, null, null, new C0602b(null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.D, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B
    @NotNull
    public k getAdLoader() {
        return this.f47957w;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B
    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o getAdShowListener() {
        return this.f47953s;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
    @Nullable
    public i getCreativeType() {
        return this.f47952r;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    @NotNull
    public go.u<Boolean> l() {
        return this.f47959y;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B
    public void s() {
        setAdView(getBannerImpl());
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B
    public void setAdShowListener(@Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o oVar) {
        this.f47953s = oVar;
        B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0> b10 = this.f47954t;
        if (b10 != null) {
            b10.setAdShowListener(oVar);
            return;
        }
        B<m> b11 = this.f47955u;
        if (b11 == null) {
            b11 = this.f47956v;
        }
        if (b11 != null) {
            b11.setAdShowListener(oVar);
        }
    }
}
