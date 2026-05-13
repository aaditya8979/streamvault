package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import go.e;
import go.f;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import jn.d;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import sn.q;

/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred(parameters = 0)
@SuppressLint({"ViewConstructor"})
public final class E extends B<m> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Context f47754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 f47755i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a f47756j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final D f47757k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final p000do.l0 f47758l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.t f47759m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final i f47760n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final bn.g f47761o;

    @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.StaticBannerView$isAdDisplaying$2$1", f = "StaticBanner.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements q<Boolean, Boolean, hn.c<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f47763b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ boolean f47764c;

        public a(hn.c<? super a> cVar) {
            super(3, cVar);
        }

        public final Object a(boolean z10, boolean z11, hn.c<? super Boolean> cVar) {
            a aVar = new a(cVar);
            aVar.f47763b = z10;
            aVar.f47764c = z11;
            return aVar.invokeSuspend(bn.r.f5635a);
        }

        @Override // sn.q
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, hn.c<? super Boolean> cVar) {
            return a(bool.booleanValue(), bool2.booleanValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f47762a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            return jn.a.a(this.f47763b && this.f47764c);
        }
    }

    @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.StaticBannerView$prepareAdViewForDisplay$1", f = "StaticBanner.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f47766b;

        @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.StaticBannerView$prepareAdViewForDisplay$1$1", f = "StaticBanner.kt", l = {50}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f47768a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ E f47769b;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.E$b$a$a, reason: collision with other inner class name */
            @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.StaticBannerView$prepareAdViewForDisplay$1$1$error$1", f = "StaticBanner.kt", l = {}, m = "invokeSuspend")
            public static final class C0589a extends SuspendLambda implements sn.p<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g, hn.c<? super Boolean>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f47770a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public /* synthetic */ Object f47771b;

                public C0589a(hn.c<? super C0589a> cVar) {
                    super(2, cVar);
                }

                @Override // sn.p
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object mo2invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar, hn.c<? super Boolean> cVar) {
                    return ((C0589a) create(gVar, cVar)).invokeSuspend(bn.r.f5635a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                    C0589a c0589a = new C0589a(cVar);
                    c0589a.f47771b = obj;
                    return c0589a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    in.a.g();
                    if (this.f47770a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                    return jn.a.a(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) this.f47771b) != null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(E e10, hn.c<? super a> cVar) {
                super(2, cVar);
                this.f47769b = e10;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
                return ((a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                return new a(this.f47769b, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                m adShowListener;
                Object objG = in.a.g();
                int i10 = this.f47768a;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    go.u<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g> unrecoverableError = this.f47769b.f47756j.getUnrecoverableError();
                    C0589a c0589a = new C0589a(null);
                    this.f47768a = 1;
                    obj = f.w(unrecoverableError, c0589a, this);
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
                if (gVar != null && (adShowListener = this.f47769b.getAdShowListener()) != null) {
                    adShowListener.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.h.a(gVar));
                }
                return bn.r.f5635a;
            }
        }

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.E$b$b, reason: collision with other inner class name */
        @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.StaticBannerView$prepareAdViewForDisplay$1$2", f = "StaticBanner.kt", l = {56}, m = "invokeSuspend")
        public static final class C0590b extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f47772a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ E f47773b;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.E$b$b$a */
            public static final class a<T> implements e {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ E f47774b;

                public a(E e10) {
                    this.f47774b = e10;
                }

                @Override // go.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(bn.r rVar, hn.c<? super bn.r> cVar) {
                    m adShowListener = this.f47774b.getAdShowListener();
                    if (adShowListener != null) {
                        adShowListener.b();
                    }
                    return bn.r.f5635a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0590b(E e10, hn.c<? super C0590b> cVar) {
                super(2, cVar);
                this.f47773b = e10;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
                return ((C0590b) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                return new C0590b(this.f47773b, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objG = in.a.g();
                int i10 = this.f47772a;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    go.p<bn.r> clickthroughEvent = this.f47773b.f47756j.getClickthroughEvent();
                    a aVar = new a(this.f47773b);
                    this.f47772a = 1;
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

        public b(hn.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            b bVar = E.this.new b(cVar);
            bVar.f47766b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f47765a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            p000do.l0 l0Var = (p000do.l0) this.f47766b;
            p000do.i.d(l0Var, null, null, new a(E.this, null), 3, null);
            p000do.i.d(l0Var, null, null, new C0590b(E.this, null), 3, null);
            E e10 = E.this;
            FrameLayout frameLayoutA = e10.f47759m.a(E.this.f47754h, E.this.f47756j);
            E.this.getWatermark().a(frameLayoutA);
            e10.setAdView(frameLayoutA);
            return bn.r.f5635a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(@NotNull Context context, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar, @NotNull D d10, @NotNull p000do.l0 l0Var, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.t tVar) {
        super(context, l0Var);
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(e0Var, "watermark");
        tn.p.k(aVar, "staticWebView");
        tn.p.k(d10, "adLoader");
        tn.p.k(l0Var, "scope");
        tn.p.k(tVar, "webViewWrapper");
        this.f47754h = context;
        this.f47755i = e0Var;
        this.f47756j = aVar;
        this.f47757k = d10;
        this.f47758l = l0Var;
        this.f47759m = tVar;
        setTag("MolocoStaticBannerView");
        this.f47760n = i.f47728c;
        this.f47761o = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j
            @Override // sn.a
            public final Object invoke() {
                return E.w(this.f48154b);
            }
        });
    }

    public /* synthetic */ E(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar, D d10, p000do.l0 l0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.t tVar, int i10, tn.i iVar) {
        this(context, e0Var, aVar, d10, l0Var, (i10 & 32) != 0 ? new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.t() : tVar);
    }

    public static final go.u w(E e10) {
        return f.M(f.A(super.l(), e10.f47756j.c(), new a(null)), e10.f47758l, kotlinx.coroutines.flow.a.f73397a.c(), Boolean.FALSE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r
    public void destroy() {
        super.destroy();
        this.f47756j.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.D, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B
    @NotNull
    public D getAdLoader() {
        return this.f47757k;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
    @NotNull
    public i getCreativeType() {
        return this.f47760n;
    }

    @VisibleForTesting
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 getWatermark() {
        return this.f47755i;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    @NotNull
    public go.u<Boolean> l() {
        return (go.u) this.f47761o.getValue();
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
        p000do.g.c(this.f47758l, EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new b(null));
    }
}
