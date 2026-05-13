package com.moloco.sdk.internal.publisher;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.material.badge.BadgeDrawable;
import com.moloco.sdk.internal.ortb.model.A;
import com.moloco.sdk.internal.ortb.model.C4380d;
import com.moloco.sdk.internal.ortb.model.C4381e;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.BannerAdShowListener;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.service_locator.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Locale;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@SuppressLint({"ViewConstructor"})
@VisibleForTesting
public final class m<L extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0> extends Banner implements p0 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public static final a f46667x = new a(null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f46668y = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f46669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.services.r f46670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f46671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f46672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f46673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0 f46674g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final sn.v<Context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a, C4381e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0, com.moloco.sdk.internal.a, com.moloco.sdk.internal.services.f0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s, B<L>> f46675h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 f46676i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final a0 f46677j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.a f46678k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.m f46679l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.services.f0 f46680m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.recorder.a f46681n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.e f46682o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public com.moloco.sdk.acm.e f46683p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final p000do.l0 f46684q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final i0<L> f46685r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s f46686s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public com.moloco.sdk.internal.publisher.c f46687t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public BannerAdShowListener f46688u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final AdLoad f46689v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final L f46690w;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements sn.l<Long, co.b> {
        public b(Object obj) {
            super(1, obj, a0.class, "calculateTimeout", "calculateTimeout-5sfh64U(J)J", 0);
        }

        public final long a(long j10) {
            return ((a0) this.receiver).a(j10);
        }

        @Override // sn.l
        public /* bridge */ /* synthetic */ co.b invoke(Long l10) {
            return co.b.f(a(l10.longValue()));
        }
    }

    public /* synthetic */ class c extends FunctionReferenceImpl implements sn.l<C4381e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k> {
        public c(Object obj) {
            super(1, obj, m.class, "recreateXenossAd", "recreateXenossAd(Lcom/moloco/sdk/internal/ortb/model/Bid;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/AdLoad;", 0);
        }

        @Override // sn.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k invoke(C4381e c4381e) {
            tn.p.k(c4381e, "p0");
            return ((m) this.receiver).d(c4381e);
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.publisher.BannerViewImpl$listenToAdDisplayState$1$1", f = "Banner.kt", l = {}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements sn.p<Boolean, hn.c<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f46692b;

        public d(hn.c<? super d> cVar) {
            super(2, cVar);
        }

        public final Object a(boolean z10, hn.c<? super Boolean> cVar) {
            return ((d) create(Boolean.valueOf(z10), cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            d dVar = new d(cVar);
            dVar.f46692b = ((Boolean) obj).booleanValue();
            return dVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo2invoke(Boolean bool, hn.c<? super Boolean> cVar) {
            return a(bool.booleanValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f46691a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            return jn.a.a(!this.f46692b);
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.publisher.BannerViewImpl$listenToAdDisplayState$1$2", f = "Banner.kt", l = {}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements sn.p<Boolean, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f46694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m<L> f46695c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i0<L> f46696d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(m<L> mVar, i0<L> i0Var, hn.c<? super e> cVar) {
            super(2, cVar);
            this.f46695c = mVar;
            this.f46696d = i0Var;
        }

        public final Object a(boolean z10, hn.c<? super bn.r> cVar) {
            return ((e) create(Boolean.valueOf(z10), cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            e eVar = new e(this.f46695c, this.f46696d, cVar);
            eVar.f46694b = ((Boolean) obj).booleanValue();
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
            if (this.f46693a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            if (this.f46694b) {
                com.moloco.sdk.acm.e eVar = this.f46695c.f46683p;
                if (eVar != null) {
                    com.moloco.sdk.acm.recorder.a aVar = this.f46695c.f46681n;
                    String strC = com.moloco.sdk.internal.client_metrics_data.d.f45970c.c();
                    String lowerCase = "BANNER".toLowerCase(Locale.ROOT);
                    tn.p.j(lowerCase, "toLowerCase(...)");
                    aVar.a(eVar.f(strC, lowerCase));
                }
                com.moloco.sdk.internal.publisher.c cVar = this.f46695c.f46687t;
                if (cVar != null) {
                    cVar.onAdShowSuccess(MolocoAdKt.createAdInfo$default(this.f46695c.f46672e, null, null, 6, null));
                }
            } else {
                com.moloco.sdk.internal.publisher.c cVar2 = this.f46695c.f46687t;
                if (cVar2 != null) {
                    cVar2.onAdHidden(MolocoAdKt.createAdInfo$default(this.f46695c.f46672e, null, null, 6, null));
                }
                kotlinx.coroutines.g gVarA = this.f46696d.a();
                if (gVarA != null) {
                    g.a.a(gVarA, null, 1, null);
                }
            }
            return bn.r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.publisher.BannerViewImpl$load$1", f = "Banner.kt", l = {}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m<L> f46698b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f46699c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AdLoad.Listener f46700d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(m<L> mVar, String str, AdLoad.Listener listener, hn.c<? super f> cVar) {
            super(2, cVar);
            this.f46698b = mVar;
            this.f46699c = str;
            this.f46700d = listener;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((f) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return new f(this.f46698b, this.f46699c, this.f46700d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f46697a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            this.f46698b.f46689v.load(this.f46699c, this.f46700d);
            return bn.r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.publisher.BannerViewImpl$recreateXenossAd$touchInterceptor$1$1", f = "Banner.kt", l = {266}, m = "invokeSuspend")
    public static final class g extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ go.p<bn.r> f46702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m<L> f46703c;

        public static final class a<T> implements go.e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m<L> f46704b;

            public a(m<L> mVar) {
                this.f46704b = mVar;
            }

            @Override // go.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(bn.r rVar, hn.c<? super bn.r> cVar) {
                this.f46704b.f46690w.b();
                return bn.r.f5635a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(go.p<bn.r> pVar, m<L> mVar, hn.c<? super g> cVar) {
            super(2, cVar);
            this.f46702b = pVar;
            this.f46703c = mVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((g) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return new g(this.f46702b, this.f46703c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f46701a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                go.p<bn.r> pVar = this.f46702b;
                a aVar = new a(this.f46703c);
                this.f46701a = 1;
                if (pVar.collect(aVar, this) == objG) {
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

    @jn.d(c = "com.moloco.sdk.internal.publisher.BannerViewImpl$recreateXenossAd$touchInterceptor$1$2$1", f = "Banner.kt", l = {274}, m = "invokeSuspend")
    public static final class h extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MotionEvent f46706b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p0 f46707c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m<L> f46708d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ go.k<bn.r> f46709e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(MotionEvent motionEvent, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p0 p0Var, m<L> mVar, go.k<bn.r> kVar, hn.c<? super h> cVar) {
            super(2, cVar);
            this.f46706b = motionEvent;
            this.f46707c = p0Var;
            this.f46708d = mVar;
            this.f46709e = kVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((h) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return new h(this.f46706b, this.f46707c, this.f46708d, this.f46709e, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f46705a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                MotionEvent motionEvent = this.f46706b;
                if (motionEvent != null) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p0 p0Var = this.f46707c;
                    m<L> mVar = this.f46708d;
                    go.k<bn.r> kVar = this.f46709e;
                    com.moloco.sdk.internal.services.f0 f0Var = mVar.f46680m;
                    String strJ = mVar.f46685r.j();
                    String strK = mVar.f46685r.k();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s sVar = mVar.f46686s;
                    this.f46705a = 1;
                    if (p0Var.a(motionEvent, f0Var, strJ, strK, sVar, kVar, (64 & 64) != 0 ? com.moloco.sdk.internal.k0.b() : null, this) == objG) {
                        return objG;
                    }
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

    public static final class i implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m<L> f46710a;

        public i(m<L> mVar) {
            this.f46710a = mVar;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
        public void a() {
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
            tn.p.k(cVar, "internalShowError");
            m<L> mVar = this.f46710a;
            mVar.i(com.moloco.sdk.internal.d0.a(mVar.f46672e, MolocoAdError.ErrorType.AD_SHOW_ERROR, cVar));
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0
        public void a(boolean z10) {
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
        public void b() {
            com.moloco.sdk.internal.publisher.c cVar = this.f46710a.f46687t;
            if (cVar != null) {
                cVar.onAdClicked(MolocoAdKt.createAdInfo$default(this.f46710a.f46672e, null, null, 6, null));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(@NotNull Context context, @NotNull com.moloco.sdk.internal.services.r rVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, @NotNull String str, boolean z10, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0 w0Var, @NotNull sn.v<? super Context, ? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a, ? super C4381e, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0, ? super com.moloco.sdk.internal.a, ? super com.moloco.sdk.internal.services.f0, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s, ? extends B<L>> vVar, @NotNull sn.l<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0, ? extends L> lVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, @NotNull a0 a0Var, @NotNull com.moloco.sdk.internal.a aVar2, @NotNull com.moloco.sdk.internal.m mVar, @NotNull com.moloco.sdk.internal.services.f0 f0Var, @NotNull com.moloco.sdk.acm.recorder.a aVar3) {
        super(context);
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(rVar, "appLifecycleTrackerService");
        tn.p.k(aVar, "customUserEventBuilderService");
        tn.p.k(str, "adUnitId");
        tn.p.k(w0Var, "externalLinkHandler");
        tn.p.k(vVar, "createXenossBannerView");
        tn.p.k(lVar, "createXenossBannerAdShowListener");
        tn.p.k(e0Var, "watermark");
        tn.p.k(a0Var, "adCreateLoadTimeoutManager");
        tn.p.k(aVar2, "viewLifecycleOwner");
        tn.p.k(mVar, "bannerSize");
        tn.p.k(f0Var, "clickthroughService");
        tn.p.k(aVar3, "metricsRecorder");
        this.f46669b = context;
        this.f46670c = rVar;
        this.f46671d = aVar;
        this.f46672e = str;
        this.f46673f = z10;
        this.f46674g = w0Var;
        this.f46675h = vVar;
        this.f46676i = e0Var;
        this.f46677j = a0Var;
        this.f46678k = aVar2;
        this.f46679l = mVar;
        this.f46680m = f0Var;
        this.f46681n = aVar3;
        com.moloco.sdk.acm.e eVarC = aVar3.c(com.moloco.sdk.internal.client_metrics_data.e.f45994q.c());
        String strC = com.moloco.sdk.internal.client_metrics_data.d.f45970c.c();
        String lowerCase = "BANNER".toLowerCase(Locale.ROOT);
        tn.p.j(lowerCase, "toLowerCase(...)");
        this.f46682o = eVarC.f(strC, lowerCase);
        p000do.l0 l0VarA = kotlinx.coroutines.d.a(com.moloco.sdk.internal.scheduling.c.a().getMain());
        this.f46684q = l0VarA;
        this.f46685r = new i0<>(null, null, null, null, null, null, false, 127, null);
        this.f46686s = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.w.a();
        this.f46689v = c0.a(l0VarA, new b(a0Var), str, new c(this), AdFormatType.BANNER, b.a.f47629a.b(), aVar3);
        this.f46690w = lVar.invoke(new i(this));
    }

    public static final bn.r a(m mVar, a.AbstractC0696a.c cVar) {
        tn.p.k(cVar, "button");
        mVar.f46686s.l(cVar);
        return bn.r.f5635a;
    }

    public static /* synthetic */ void h(m mVar, com.moloco.sdk.internal.c0 c0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c0Var = null;
        }
        mVar.i(c0Var);
    }

    public static final boolean k(m mVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p0 p0Var, go.k kVar, View view, MotionEvent motionEvent) {
        p000do.i.d(mVar.f46684q, null, null, new h(motionEvent, p0Var, mVar, kVar, null), 3, null);
        return false;
    }

    public static final A t(m mVar) {
        return mVar.f46685r.l();
    }

    public static final h0 u(m mVar) {
        return mVar.f46685r.h();
    }

    public final com.moloco.sdk.internal.publisher.c b(BannerAdShowListener bannerAdShowListener) {
        return new com.moloco.sdk.internal.publisher.c(bannerAdShowListener, this.f46670c, this.f46671d, new sn.a() { // from class: com.moloco.sdk.internal.publisher.j0
            @Override // sn.a
            public final Object invoke() {
                return m.t(this.f46658b);
            }
        }, new sn.a() { // from class: com.moloco.sdk.internal.publisher.k0
            @Override // sn.a
            public final Object invoke() {
                return m.u(this.f46660b);
            }
        }, AdFormatType.BANNER, this.f46681n);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k d(C4381e c4381e) {
        C4380d c4380dA;
        C4380d c4380dA2;
        h(this, null, 1, null);
        B<L> bInvoke = this.f46675h.invoke(this.f46669b, this.f46671d, c4381e, this.f46674g, this.f46676i, this.f46678k, this.f46680m, this.f46686s);
        i0<L> i0Var = this.f46685r;
        i0Var.d(bInvoke);
        i0Var.b(c4381e.f().f());
        i0Var.c(c4381e.d() != null ? new h0(c4381e.d(), Float.valueOf(c4381e.g())) : null);
        com.moloco.sdk.internal.ortb.model.v vVarC = c4381e.f().c();
        i0Var.i((vVarC == null || (c4380dA2 = vVarC.a()) == null) ? null : c4380dA2.a());
        com.moloco.sdk.internal.ortb.model.v vVarC2 = c4381e.f().c();
        i0Var.e((vVarC2 == null || (c4380dA = vVarC2.a()) == null) ? null : c4380dA.c());
        com.moloco.sdk.internal.ortb.model.v vVarC3 = c4381e.f().c();
        i0Var.g((vVarC3 != null ? vVarC3.a() : null) != null);
        bInvoke.setAdShowListener(this.f46690w);
        j(bInvoke);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(com.moloco.sdk.internal.n.a(this.f46679l.b()), com.moloco.sdk.internal.n.a(this.f46679l.a()));
        layoutParams.gravity = 1;
        addView(bInvoke, layoutParams);
        if (this.f46685r.n()) {
            final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p0 p0Var = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p0(this.f46669b);
            final go.k kVarB = go.q.b(0, 0, null, 7, null);
            p000do.i.d(this.f46684q, null, null, new g(kVarB, this, null), 3, null);
            p0Var.setOnTouchListener(new View.OnTouchListener() { // from class: com.moloco.sdk.internal.publisher.l0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return m.k(this.f46664b, p0Var, kVarB, view, motionEvent);
                }
            });
            addView(p0Var, new FrameLayout.LayoutParams(-1, com.moloco.sdk.internal.n.a(this.f46679l.a())));
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.j jVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.j(this.f46674g, this.f46669b, null, 0, 12, null);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = BadgeDrawable.BOTTOM_START;
        jVar.setPadding(12, 0, 0, 12);
        jVar.setPrivacyUrl("https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html");
        jVar.setOnButtonRenderedListener(new sn.l() { // from class: com.moloco.sdk.internal.publisher.m0
            @Override // sn.l
            public final Object invoke(Object obj) {
                return m.a(this.f46711b, (a.AbstractC0696a.c) obj);
            }
        });
        jVar.setLayoutParams(layoutParams2);
        addView(jVar);
        return bInvoke;
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public void destroy() {
        kotlinx.coroutines.d.e(this.f46684q, null, 1, null);
        h(this, null, 1, null);
        setAdShowListener(null);
        this.f46687t = null;
    }

    @Override // com.moloco.sdk.publisher.Banner, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.D, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public final go.u<Boolean> f(B<L> b10) {
        return (this.f46673f || b10 == null) ? isViewShown() : b10.l();
    }

    @Override // com.moloco.sdk.publisher.Banner
    @Nullable
    public BannerAdShowListener getAdShowListener() {
        return this.f46688u;
    }

    public long getCreateAdObjectStartTime() {
        return this.f46677j.b();
    }

    public final void i(com.moloco.sdk.internal.c0 c0Var) {
        com.moloco.sdk.internal.publisher.c cVar;
        com.moloco.sdk.internal.publisher.c cVar2;
        i0<L> i0Var = this.f46685r;
        kotlinx.coroutines.g gVarA = i0Var.a();
        if (gVarA != null) {
            g.a.a(gVarA, null, 1, null);
        }
        i0Var.f(null);
        boolean zBooleanValue = f(this.f46685r.m()).getValue().booleanValue();
        i0<L> i0Var2 = this.f46685r;
        B<L> bM = i0Var2.m();
        if (bM != null) {
            bM.destroy();
        }
        i0Var2.d(null);
        if (c0Var != null && (cVar2 = this.f46687t) != null) {
            cVar2.a(c0Var);
        }
        if (zBooleanValue && (cVar = this.f46687t) != null) {
            cVar.onAdHidden(MolocoAdKt.createAdInfo$default(this.f46672e, null, null, 6, null));
        }
        this.f46685r.b(null);
        this.f46685r.c(null);
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public boolean isLoaded() {
        return this.f46689v.isLoaded();
    }

    public final void j(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j jVar) {
        i0<L> i0Var = this.f46685r;
        kotlinx.coroutines.g gVarA = i0Var.a();
        if (gVarA != null) {
            g.a.a(gVarA, null, 1, null);
        }
        i0Var.f(go.f.D(go.f.G(go.f.q(f(this.f46685r.m()), new d(null)), new e(this, i0Var, null)), this.f46684q));
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public void load(@NotNull String str, @Nullable AdLoad.Listener listener) {
        tn.p.k(str, "bidResponseJson");
        this.f46681n.a(this.f46682o);
        this.f46683p = this.f46681n.c(com.moloco.sdk.internal.client_metrics_data.e.f45993p.c());
        p000do.i.d(this.f46684q, null, null, new f(this, str, listener, null), 3, null);
    }

    @Override // com.moloco.sdk.publisher.Banner, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // com.moloco.sdk.publisher.Banner
    public void setAdShowListener(@Nullable BannerAdShowListener bannerAdShowListener) {
        com.moloco.sdk.internal.publisher.c cVarB = b(bannerAdShowListener);
        this.f46687t = cVarB;
        this.f46688u = cVarB.b();
    }

    @Override // com.moloco.sdk.internal.publisher.p0
    public void setCreateAdObjectStartTime(long j10) {
        this.f46677j.setCreateAdObjectStartTime(j10);
    }
}
