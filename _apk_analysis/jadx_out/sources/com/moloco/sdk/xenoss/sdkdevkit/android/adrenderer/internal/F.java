package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s;
import go.e;
import go.f;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import jn.d;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.q;

/* JADX INFO: loaded from: classes10.dex */
public final class F implements s<m, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f47775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 f47776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final i f47777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final p000do.l0 f47778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a f47779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final D f47780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final go.l<Boolean> f47781h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final bn.g f47782i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final go.l<Boolean> f47783j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final go.u<Boolean> f47784k;

    @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.StaticFullscreenAdImpl$isAdDisplaying$2$1", f = "StaticFullscreenAd.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements q<Boolean, Boolean, hn.c<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f47786b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ boolean f47787c;

        public a(hn.c<? super a> cVar) {
            super(3, cVar);
        }

        public final Object a(boolean z10, boolean z11, hn.c<? super Boolean> cVar) {
            a aVar = new a(cVar);
            aVar.f47786b = z10;
            aVar.f47787c = z11;
            return aVar.invokeSuspend(bn.r.f5635a);
        }

        @Override // sn.q
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, hn.c<? super Boolean> cVar) {
            return a(bool.booleanValue(), bool2.booleanValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f47785a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            return jn.a.a(this.f47786b && this.f47787c);
        }
    }

    @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.StaticFullscreenAdImpl$show$1", f = "StaticFullscreenAd.kt", l = {100}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f47789b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n f47791d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ m f47792e;

        public /* synthetic */ class a extends FunctionReferenceImpl implements sn.a<bn.r> {
            public a(Object obj) {
                super(0, obj, F.class, "onClose", "onClose()V", 0);
            }

            public final void a() {
                ((F) this.receiver).x();
            }

            @Override // sn.a
            public /* bridge */ /* synthetic */ bn.r invoke() {
                a();
                return bn.r.f5635a;
            }
        }

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F$b$b, reason: collision with other inner class name */
        @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.StaticFullscreenAdImpl$show$1$eventHandlers$1", f = "StaticFullscreenAd.kt", l = {86}, m = "invokeSuspend")
        public static final class C0591b extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f47793a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ F f47794b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ m f47795c;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F$b$b$a */
            @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.StaticFullscreenAdImpl$show$1$eventHandlers$1$error$1", f = "StaticFullscreenAd.kt", l = {}, m = "invokeSuspend")
            public static final class a extends SuspendLambda implements sn.p<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g, hn.c<? super Boolean>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f47796a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public /* synthetic */ Object f47797b;

                public a(hn.c<? super a> cVar) {
                    super(2, cVar);
                }

                @Override // sn.p
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object mo2invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar, hn.c<? super Boolean> cVar) {
                    return ((a) create(gVar, cVar)).invokeSuspend(bn.r.f5635a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                    a aVar = new a(cVar);
                    aVar.f47797b = obj;
                    return aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    in.a.g();
                    if (this.f47796a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                    return jn.a.a(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) this.f47797b) != null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0591b(F f10, m mVar, hn.c<? super C0591b> cVar) {
                super(2, cVar);
                this.f47794b = f10;
                this.f47795c = mVar;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
                return ((C0591b) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                return new C0591b(this.f47794b, this.f47795c, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                m mVar;
                Object objG = in.a.g();
                int i10 = this.f47793a;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    go.u<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g> unrecoverableError = this.f47794b.f47779f.getUnrecoverableError();
                    a aVar = new a(null);
                    this.f47793a = 1;
                    obj = f.w(unrecoverableError, aVar, this);
                    if (obj == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) obj;
                if (gVar != null && (mVar = this.f47795c) != null) {
                    mVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.h.b(gVar));
                }
                return bn.r.f5635a;
            }
        }

        @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.StaticFullscreenAdImpl$show$1$eventHandlers$2", f = "StaticFullscreenAd.kt", l = {92}, m = "invokeSuspend")
        public static final class c extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f47798a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ F f47799b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ m f47800c;

            public static final class a<T> implements e {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ m f47801b;

                public a(m mVar) {
                    this.f47801b = mVar;
                }

                @Override // go.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(bn.r rVar, hn.c<? super bn.r> cVar) {
                    m mVar = this.f47801b;
                    if (mVar != null) {
                        mVar.b();
                    }
                    return bn.r.f5635a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(F f10, m mVar, hn.c<? super c> cVar) {
                super(2, cVar);
                this.f47799b = f10;
                this.f47800c = mVar;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
                return ((c) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                return new c(this.f47799b, this.f47800c, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objG = in.a.g();
                int i10 = this.f47798a;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    go.p<bn.r> clickthroughEvent = this.f47799b.f47779f.getClickthroughEvent();
                    a aVar = new a(this.f47800c);
                    this.f47798a = 1;
                    if (clickthroughEvent.collect(aVar, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n nVar, m mVar, hn.c<? super b> cVar) {
            super(2, cVar);
            this.f47791d = nVar;
            this.f47792e = mVar;
        }

        public static final bn.r a(m mVar) {
            if (mVar != null) {
                mVar.a();
            }
            return bn.r.f5635a;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            b bVar = F.this.new b(this.f47791d, this.f47792e, cVar);
            bVar.f47789b = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00a0 A[LOOP:0: B:18:0x009a->B:20:0x00a0, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00c6 A[LOOP:1: B:26:0x00c0->B:28:0x00c6, LOOP_END] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 222
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public F(@NotNull Context context, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, @NotNull String str, @NotNull w0 w0Var, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(aVar, "customUserEventBuilderService");
        tn.p.k(str, "adm");
        tn.p.k(w0Var, "externalLinkHandler");
        tn.p.k(e0Var, "watermark");
        this.f47775b = context;
        this.f47776c = e0Var;
        this.f47777d = i.f47728c;
        p000do.l0 l0VarA = kotlinx.coroutines.d.a(com.moloco.sdk.internal.scheduling.c.a().getMain());
        this.f47778e = l0VarA;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a(context, null, new com.moloco.sdk.internal.services.t(w0Var, aVar), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.w.a(), false, null, 50, null);
        this.f47779f = aVar2;
        this.f47780g = new D(str, l0VarA, aVar2);
        Boolean bool = Boolean.FALSE;
        this.f47781h = go.v.a(bool);
        this.f47782i = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.l
            @Override // sn.a
            public final Object invoke() {
                return F.t(this.f48156b);
            }
        });
        go.l<Boolean> lVarA = go.v.a(bool);
        this.f47783j = lVarA;
        this.f47784k = lVarA;
    }

    public static final go.u t(F f10) {
        return f.M(f.A(f10.f47781h, f10.f47779f.c(), new a(null)), f10.f47778e, kotlinx.coroutines.flow.a.f73397a.c(), Boolean.FALSE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r
    public void destroy() {
        kotlinx.coroutines.d.e(this.f47778e, null, 1, null);
        this.f47779f.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
    @NotNull
    public i getCreativeType() {
        return this.f47777d;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void i(long j10, @Nullable k.a aVar) {
        this.f47780g.i(j10, aVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    @NotNull
    public go.u<Boolean> isLoaded() {
        return this.f47780g.isLoaded();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t
    @NotNull
    public go.u<Boolean> k() {
        return this.f47784k;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    @NotNull
    public go.u<Boolean> l() {
        return (go.u) this.f47782i.getValue();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void b(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n nVar, @Nullable m mVar) {
        tn.p.k(nVar, "options");
        p000do.i.d(this.f47778e, null, null, new b(nVar, mVar, null), 3, null);
    }

    public final void x() {
        this.f47781h.setValue(Boolean.FALSE);
    }
}
