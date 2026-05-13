package com.moloco.sdk.internal.publisher;

import android.content.Context;
import android.view.ViewParent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.explorestack.protobuf.openrtb.LossReason;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.error.b;
import com.moloco.sdk.internal.g0;
import com.moloco.sdk.internal.m;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.Initialization;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.NativeAd;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.service_locator.b;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f46504f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f46505g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final go.u<Initialization> f46506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.services.j f46507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final b0 f46508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final sn.l<hn.c<? super com.moloco.sdk.internal.e>, Object> f46509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final kotlin.coroutines.d f46510e;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.publisher.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C0568b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46511a;

        static {
            int[] iArr = new int[Initialization.values().length];
            try {
                iArr[Initialization.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Initialization.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f46511a = iArr;
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.publisher.AdCreator", f = "AdCreator.kt", l = {TTAdConstant.VIDEO_COVER_URL_CODE}, m = "awaitAdFactoryWithTimeoutOrNull")
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f46512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f46513b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f46514c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f46515d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f46517f;

        public c(hn.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46515d = obj;
            this.f46517f |= Integer.MIN_VALUE;
            return b.this.e(null, null, null, this);
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.publisher.AdCreator$awaitAdFactoryWithTimeoutOrNull$2", f = "AdCreator.kt", l = {TTAdConstant.VIDEO_COVER_URL_CODE}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super com.moloco.sdk.internal.e>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46518a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ sn.l<hn.c<? super com.moloco.sdk.internal.e>, Object> f46519b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(sn.l<? super hn.c<? super com.moloco.sdk.internal.e>, ? extends Object> lVar, hn.c<? super d> cVar) {
            super(2, cVar);
            this.f46519b = lVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super com.moloco.sdk.internal.e> cVar) {
            return ((d) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return new d(this.f46519b, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f46518a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                sn.l<hn.c<? super com.moloco.sdk.internal.e>, Object> lVar = this.f46519b;
                this.f46518a = 1;
                obj = lVar.invoke(this);
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

    @jn.d(c = "com.moloco.sdk.internal.publisher.AdCreator$createBanner$2", f = "AdCreator.kt", l = {67}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super com.moloco.sdk.internal.g0<Banner, MolocoAdError.AdCreateError>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f46520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f46521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f46522c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f46523d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f46524e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.a f46526g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f46527h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f46528i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f46529j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.moloco.sdk.acm.recorder.a aVar, String str, String str2, String str3, hn.c<? super e> cVar) {
            super(2, cVar);
            this.f46526g = aVar;
            this.f46527h = str;
            this.f46528i = str2;
            this.f46529j = str3;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super com.moloco.sdk.internal.g0<Banner, MolocoAdError.AdCreateError>> cVar) {
            return ((e) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return b.this.new e(this.f46526g, this.f46527h, this.f46528i, this.f46529j, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objE;
            s sVar;
            com.moloco.sdk.acm.e eVar;
            String str;
            long j10;
            Object objG = in.a.g();
            int i10 = this.f46524e;
            if (i10 == 0) {
                kotlin.c.b(obj);
                s sVar2 = s.f46960a;
                long jInvoke = b.this.f46507b.invoke();
                String strF = b.this.f();
                com.moloco.sdk.acm.e eVarF = this.f46526g.c(com.moloco.sdk.internal.client_metrics_data.e.f45985h.c()).f(com.moloco.sdk.internal.client_metrics_data.d.f45970c.c(), sVar2.name()).f("initial_sdk_init_state", strF);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Creating " + sVar2 + " ad with adUnitId: " + this.f46527h, null, false, 12, null);
                b bVar = b.this;
                sn.l lVar = bVar.f46509d;
                com.moloco.sdk.acm.recorder.a aVar = this.f46526g;
                this.f46520a = sVar2;
                this.f46521b = strF;
                this.f46522c = eVarF;
                this.f46523d = jInvoke;
                this.f46524e = 1;
                objE = bVar.e(lVar, sVar2, aVar, this);
                if (objE == objG) {
                    return objG;
                }
                sVar = sVar2;
                eVar = eVarF;
                str = strF;
                j10 = jInvoke;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = this.f46523d;
                com.moloco.sdk.acm.e eVar2 = (com.moloco.sdk.acm.e) this.f46522c;
                String str2 = (String) this.f46521b;
                s sVar3 = (s) this.f46520a;
                kotlin.c.b(obj);
                eVar = eVar2;
                str = str2;
                sVar = sVar3;
                objE = obj;
            }
            com.moloco.sdk.internal.e eVar3 = (com.moloco.sdk.internal.e) objE;
            if (eVar3 != null) {
                Context contextA = com.moloco.sdk.service_locator.b.f47628a.a();
                com.moloco.sdk.internal.services.r rVarE = b.C0586b.f47632a.e();
                String str3 = this.f46527h;
                b.h hVar = b.h.f47664a;
                long j11 = j10;
                ViewParent viewParentC = eVar3.c(contextA, rVarE, str3, hVar.j(), hVar.f(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0(this.f46528i), new a0(AdFormatType.BANNER, com.moloco.sdk.internal.mediators.a.a(this.f46529j), null), hVar.i(), m.b.f46246c, this.f46526g);
                if (viewParentC != null) {
                    com.moloco.sdk.acm.recorder.a aVar2 = this.f46526g;
                    com.moloco.sdk.acm.b bVar2 = new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.f45951j.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.f45971d;
                    aVar2.b(bVar2.e(dVar.c(), "success").e(com.moloco.sdk.internal.client_metrics_data.d.f45970c.c(), sVar.name()).e("initial_sdk_init_state", str));
                    this.f46526g.a(eVar.f(dVar.c(), "success"));
                    if (viewParentC instanceof p0) {
                        ((p0) viewParentC).setCreateAdObjectStartTime(j11);
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Created " + sVar + " ad with adUnitId: " + this.f46527h, null, false, 12, null);
                    return new g0.b(viewParentC);
                }
            }
            MolocoAdError.AdCreateError adCreateErrorB = b.this.b(this.f46527h, str, eVar, sVar, this.f46526g);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdCreator", "Failed to create " + sVar + " with reason: " + adCreateErrorB, null, false, 12, null);
            return new g0.a(adCreateErrorB);
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.publisher.AdCreator$createBannerTablet$2", f = "AdCreator.kt", l = {119}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super com.moloco.sdk.internal.g0<Banner, MolocoAdError.AdCreateError>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f46530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f46531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f46532c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f46533d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f46534e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.a f46536g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f46537h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f46538i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f46539j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.moloco.sdk.acm.recorder.a aVar, String str, String str2, String str3, hn.c<? super f> cVar) {
            super(2, cVar);
            this.f46536g = aVar;
            this.f46537h = str;
            this.f46538i = str2;
            this.f46539j = str3;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super com.moloco.sdk.internal.g0<Banner, MolocoAdError.AdCreateError>> cVar) {
            return ((f) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return b.this.new f(this.f46536g, this.f46537h, this.f46538i, this.f46539j, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objE;
            s sVar;
            com.moloco.sdk.acm.e eVar;
            String str;
            long j10;
            Object objG = in.a.g();
            int i10 = this.f46534e;
            if (i10 == 0) {
                kotlin.c.b(obj);
                s sVar2 = s.f46961b;
                long jInvoke = b.this.f46507b.invoke();
                String strF = b.this.f();
                com.moloco.sdk.acm.e eVarF = this.f46536g.c(com.moloco.sdk.internal.client_metrics_data.e.f45985h.c()).f(com.moloco.sdk.internal.client_metrics_data.d.f45970c.c(), sVar2.name()).f("initial_sdk_init_state", strF);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Creating " + sVar2 + " ad with adUnitId: " + this.f46537h, null, false, 12, null);
                b bVar = b.this;
                sn.l lVar = bVar.f46509d;
                com.moloco.sdk.acm.recorder.a aVar = this.f46536g;
                this.f46530a = sVar2;
                this.f46531b = strF;
                this.f46532c = eVarF;
                this.f46533d = jInvoke;
                this.f46534e = 1;
                objE = bVar.e(lVar, sVar2, aVar, this);
                if (objE == objG) {
                    return objG;
                }
                sVar = sVar2;
                eVar = eVarF;
                str = strF;
                j10 = jInvoke;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = this.f46533d;
                com.moloco.sdk.acm.e eVar2 = (com.moloco.sdk.acm.e) this.f46532c;
                String str2 = (String) this.f46531b;
                s sVar3 = (s) this.f46530a;
                kotlin.c.b(obj);
                eVar = eVar2;
                str = str2;
                sVar = sVar3;
                objE = obj;
            }
            com.moloco.sdk.internal.e eVar3 = (com.moloco.sdk.internal.e) objE;
            if (eVar3 != null) {
                Context contextA = com.moloco.sdk.service_locator.b.f47628a.a();
                com.moloco.sdk.internal.services.r rVarE = b.C0586b.f47632a.e();
                String str3 = this.f46537h;
                b.h hVar = b.h.f47664a;
                long j11 = j10;
                ViewParent viewParentE = eVar3.e(contextA, rVarE, str3, hVar.j(), hVar.f(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0(this.f46538i), new a0(AdFormatType.BANNER, com.moloco.sdk.internal.mediators.a.a(this.f46539j), null), hVar.i(), m.c.f46247c, this.f46536g);
                if (viewParentE != null) {
                    com.moloco.sdk.acm.recorder.a aVar2 = this.f46536g;
                    com.moloco.sdk.acm.b bVar2 = new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.f45951j.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.f45971d;
                    aVar2.b(bVar2.e(dVar.c(), "success").e(com.moloco.sdk.internal.client_metrics_data.d.f45970c.c(), sVar.name()).e("initial_sdk_init_state", str));
                    this.f46536g.a(eVar.f(dVar.c(), "success"));
                    if (viewParentE instanceof p0) {
                        ((p0) viewParentE).setCreateAdObjectStartTime(j11);
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Created " + sVar + " ad with adUnitId: " + this.f46537h, null, false, 12, null);
                    return new g0.b(viewParentE);
                }
            }
            MolocoAdError.AdCreateError adCreateErrorB = b.this.b(this.f46537h, str, eVar, sVar, this.f46536g);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdCreator", "Failed to create " + sVar + " with reason: " + adCreateErrorB, null, false, 12, null);
            return new g0.a(adCreateErrorB);
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.publisher.AdCreator$createInterstitial$2", f = "AdCreator.kt", l = {261}, m = "invokeSuspend")
    public static final class g extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super com.moloco.sdk.internal.g0<InterstitialAd, MolocoAdError.AdCreateError>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f46540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f46541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f46542c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f46543d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f46544e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.a f46546g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f46547h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f46548i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f46549j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.moloco.sdk.acm.recorder.a aVar, String str, String str2, String str3, hn.c<? super g> cVar) {
            super(2, cVar);
            this.f46546g = aVar;
            this.f46547h = str;
            this.f46548i = str2;
            this.f46549j = str3;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super com.moloco.sdk.internal.g0<InterstitialAd, MolocoAdError.AdCreateError>> cVar) {
            return ((g) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return b.this.new g(this.f46546g, this.f46547h, this.f46548i, this.f46549j, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objE;
            s sVar;
            com.moloco.sdk.acm.e eVar;
            String str;
            long j10;
            Object objG = in.a.g();
            int i10 = this.f46544e;
            if (i10 == 0) {
                kotlin.c.b(obj);
                s sVar2 = s.f46965f;
                long jInvoke = b.this.f46507b.invoke();
                String strF = b.this.f();
                com.moloco.sdk.acm.e eVarF = this.f46546g.c(com.moloco.sdk.internal.client_metrics_data.e.f45985h.c()).f(com.moloco.sdk.internal.client_metrics_data.d.f45970c.c(), sVar2.name()).f("initial_sdk_init_state", strF);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Creating " + sVar2 + " ad with adUnitId: " + this.f46547h, null, false, 12, null);
                b bVar = b.this;
                sn.l lVar = bVar.f46509d;
                com.moloco.sdk.acm.recorder.a aVar = this.f46546g;
                this.f46540a = sVar2;
                this.f46541b = strF;
                this.f46542c = eVarF;
                this.f46543d = jInvoke;
                this.f46544e = 1;
                objE = bVar.e(lVar, sVar2, aVar, this);
                if (objE == objG) {
                    return objG;
                }
                sVar = sVar2;
                eVar = eVarF;
                str = strF;
                j10 = jInvoke;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = this.f46543d;
                com.moloco.sdk.acm.e eVar2 = (com.moloco.sdk.acm.e) this.f46542c;
                String str2 = (String) this.f46541b;
                s sVar3 = (s) this.f46540a;
                kotlin.c.b(obj);
                eVar = eVar2;
                str = str2;
                sVar = sVar3;
                objE = obj;
            }
            com.moloco.sdk.internal.e eVar3 = (com.moloco.sdk.internal.e) objE;
            if (eVar3 != null) {
                Context contextA = com.moloco.sdk.service_locator.b.f47628a.a();
                com.moloco.sdk.internal.services.r rVarE = b.C0586b.f47632a.e();
                String str3 = this.f46547h;
                b.h hVar = b.h.f47664a;
                long j11 = j10;
                InterstitialAd interstitialAdB = eVar3.b(contextA, rVarE, str3, hVar.j(), hVar.f(), b.i.f47671a.c(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0(this.f46548i), new a0(AdFormatType.INTERSTITIAL, com.moloco.sdk.internal.mediators.a.b(this.f46549j), null), this.f46546g);
                if (interstitialAdB != null) {
                    com.moloco.sdk.acm.recorder.a aVar2 = this.f46546g;
                    com.moloco.sdk.acm.b bVar2 = new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.f45951j.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.f45971d;
                    aVar2.b(bVar2.e(dVar.c(), "success").e(com.moloco.sdk.internal.client_metrics_data.d.f45970c.c(), sVar.name()).e("initial_sdk_init_state", str.toString()));
                    this.f46546g.a(eVar.f(dVar.c(), "success"));
                    if (interstitialAdB instanceof p0) {
                        ((p0) interstitialAdB).setCreateAdObjectStartTime(j11);
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Created " + sVar + " ad with adUnitId: " + this.f46547h, null, false, 12, null);
                    return new g0.b(interstitialAdB);
                }
            }
            MolocoAdError.AdCreateError adCreateErrorB = b.this.b(this.f46547h, str, eVar, sVar, this.f46546g);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdCreator", "Failed to create " + sVar + " with reason: " + adCreateErrorB, null, false, 12, null);
            return new g0.a(adCreateErrorB);
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.publisher.AdCreator$createMREC$2", f = "AdCreator.kt", l = {167}, m = "invokeSuspend")
    public static final class h extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super com.moloco.sdk.internal.g0<Banner, MolocoAdError.AdCreateError>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f46550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f46551b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f46552c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f46553d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f46554e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.a f46556g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f46557h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f46558i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f46559j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(com.moloco.sdk.acm.recorder.a aVar, String str, String str2, String str3, hn.c<? super h> cVar) {
            super(2, cVar);
            this.f46556g = aVar;
            this.f46557h = str;
            this.f46558i = str2;
            this.f46559j = str3;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super com.moloco.sdk.internal.g0<Banner, MolocoAdError.AdCreateError>> cVar) {
            return ((h) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return b.this.new h(this.f46556g, this.f46557h, this.f46558i, this.f46559j, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objE;
            s sVar;
            com.moloco.sdk.acm.e eVar;
            String str;
            long j10;
            Object objG = in.a.g();
            int i10 = this.f46554e;
            if (i10 == 0) {
                kotlin.c.b(obj);
                s sVar2 = s.f46962c;
                long jA = b.this.f46507b.a();
                String strF = b.this.f();
                com.moloco.sdk.acm.e eVarF = this.f46556g.c(com.moloco.sdk.internal.client_metrics_data.e.f45985h.c()).f(com.moloco.sdk.internal.client_metrics_data.d.f45970c.c(), sVar2.name()).f("initial_sdk_init_state", strF);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Creating " + sVar2 + " ad with adUnitId: " + this.f46557h, null, false, 12, null);
                b bVar = b.this;
                sn.l lVar = bVar.f46509d;
                com.moloco.sdk.acm.recorder.a aVar = this.f46556g;
                this.f46550a = sVar2;
                this.f46551b = strF;
                this.f46552c = eVarF;
                this.f46553d = jA;
                this.f46554e = 1;
                objE = bVar.e(lVar, sVar2, aVar, this);
                if (objE == objG) {
                    return objG;
                }
                sVar = sVar2;
                eVar = eVarF;
                str = strF;
                j10 = jA;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = this.f46553d;
                com.moloco.sdk.acm.e eVar2 = (com.moloco.sdk.acm.e) this.f46552c;
                String str2 = (String) this.f46551b;
                s sVar3 = (s) this.f46550a;
                kotlin.c.b(obj);
                eVar = eVar2;
                str = str2;
                sVar = sVar3;
                objE = obj;
            }
            com.moloco.sdk.internal.e eVar3 = (com.moloco.sdk.internal.e) objE;
            if (eVar3 != null) {
                Context contextA = com.moloco.sdk.service_locator.b.f47628a.a();
                com.moloco.sdk.internal.services.r rVarE = b.C0586b.f47632a.e();
                String str3 = this.f46557h;
                b.h hVar = b.h.f47664a;
                long j11 = j10;
                ViewParent viewParentA = eVar3.a(contextA, rVarE, str3, hVar.j(), hVar.f(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0(this.f46558i), new a0(AdFormatType.MREC, com.moloco.sdk.internal.mediators.a.a(this.f46559j), null), hVar.i(), m.a.f46245c, this.f46556g);
                if (viewParentA != null) {
                    com.moloco.sdk.acm.recorder.a aVar2 = this.f46556g;
                    com.moloco.sdk.acm.b bVar2 = new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.f45951j.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.f45971d;
                    aVar2.b(bVar2.e(dVar.c(), "success").e(com.moloco.sdk.internal.client_metrics_data.d.f45970c.c(), sVar.name()).e("initial_sdk_init_state", str.toString()));
                    this.f46556g.a(eVar.f(dVar.c(), "success"));
                    if (viewParentA instanceof p0) {
                        ((p0) viewParentA).setCreateAdObjectStartTime(j11);
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Created " + sVar + " ad with adUnitId: " + this.f46557h, null, false, 12, null);
                    return new g0.b(viewParentA);
                }
            }
            MolocoAdError.AdCreateError adCreateErrorB = b.this.b(this.f46557h, str, eVar, sVar, this.f46556g);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdCreator", "Failed to create " + sVar + " with reason: " + adCreateErrorB, null, false, 12, null);
            return new g0.a(adCreateErrorB);
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.publisher.AdCreator$createNativeAd$2", f = "AdCreator.kt", l = {LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE}, m = "invokeSuspend")
    public static final class i extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super com.moloco.sdk.internal.g0<NativeAd, MolocoAdError.AdCreateError>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f46560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f46561b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f46562c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f46563d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f46564e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.a f46566g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f46567h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f46568i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f46569j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(com.moloco.sdk.acm.recorder.a aVar, String str, String str2, String str3, hn.c<? super i> cVar) {
            super(2, cVar);
            this.f46566g = aVar;
            this.f46567h = str;
            this.f46568i = str2;
            this.f46569j = str3;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super com.moloco.sdk.internal.g0<NativeAd, MolocoAdError.AdCreateError>> cVar) {
            return ((i) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return b.this.new i(this.f46566g, this.f46567h, this.f46568i, this.f46569j, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objE;
            s sVar;
            com.moloco.sdk.acm.e eVar;
            String str;
            long j10;
            Object objG = in.a.g();
            int i10 = this.f46564e;
            if (i10 == 0) {
                kotlin.c.b(obj);
                s sVar2 = s.f46963d;
                long jA = b.this.f46507b.a();
                String strF = b.this.f();
                com.moloco.sdk.acm.e eVarF = this.f46566g.c(com.moloco.sdk.internal.client_metrics_data.e.f45985h.c()).f(com.moloco.sdk.internal.client_metrics_data.d.f45970c.c(), sVar2.name()).f("initial_sdk_init_state", strF);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Creating " + sVar2 + " ad with adUnitId: " + this.f46567h, null, false, 12, null);
                b bVar = b.this;
                sn.l lVar = bVar.f46509d;
                com.moloco.sdk.acm.recorder.a aVar = this.f46566g;
                this.f46560a = sVar2;
                this.f46561b = strF;
                this.f46562c = eVarF;
                this.f46563d = jA;
                this.f46564e = 1;
                objE = bVar.e(lVar, sVar2, aVar, this);
                if (objE == objG) {
                    return objG;
                }
                sVar = sVar2;
                eVar = eVarF;
                str = strF;
                j10 = jA;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = this.f46563d;
                com.moloco.sdk.acm.e eVar2 = (com.moloco.sdk.acm.e) this.f46562c;
                String str2 = (String) this.f46561b;
                s sVar3 = (s) this.f46560a;
                kotlin.c.b(obj);
                eVar = eVar2;
                str = str2;
                sVar = sVar3;
                objE = obj;
            }
            com.moloco.sdk.internal.e eVar3 = (com.moloco.sdk.internal.e) objE;
            if (eVar3 != null) {
                Context contextA = com.moloco.sdk.service_locator.b.f47628a.a();
                com.moloco.sdk.internal.services.r rVarE = b.C0586b.f47632a.e();
                com.moloco.sdk.internal.services.b0 b0VarI = b.e.f47645a.i();
                String str3 = this.f46567h;
                b.h hVar = b.h.f47664a;
                long j11 = j10;
                NativeAd nativeAdF = eVar3.f(contextA, rVarE, b0VarI, str3, hVar.j(), hVar.f(), b.i.f47671a.c(), hVar.i(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0(this.f46568i), new a0(AdFormatType.NATIVE, com.moloco.sdk.internal.mediators.a.c(this.f46569j), null), hVar.h(), this.f46566g);
                if (nativeAdF != null) {
                    com.moloco.sdk.acm.recorder.a aVar2 = this.f46566g;
                    com.moloco.sdk.acm.b bVar2 = new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.f45951j.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.f45971d;
                    aVar2.b(bVar2.e(dVar.c(), "success").e(com.moloco.sdk.internal.client_metrics_data.d.f45970c.c(), sVar.name()).e("initial_sdk_init_state", str.toString()));
                    this.f46566g.a(eVar.f(dVar.c(), "success"));
                    if (nativeAdF instanceof p0) {
                        ((p0) nativeAdF).setCreateAdObjectStartTime(j11);
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Created " + sVar + " ad with adUnitId: " + this.f46567h, null, false, 12, null);
                    return new g0.b(nativeAdF);
                }
            }
            MolocoAdError.AdCreateError adCreateErrorB = b.this.b(this.f46567h, str, eVar, sVar, this.f46566g);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdCreator", "Failed to create " + sVar + " with reason: " + adCreateErrorB, null, false, 12, null);
            return new g0.a(adCreateErrorB);
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.publisher.AdCreator$createRewardedInterstitial$2", f = "AdCreator.kt", l = {308}, m = "invokeSuspend")
    public static final class j extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super com.moloco.sdk.internal.g0<RewardedInterstitialAd, MolocoAdError.AdCreateError>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f46570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f46571b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f46572c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f46573d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f46574e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.a f46576g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f46577h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f46578i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f46579j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(com.moloco.sdk.acm.recorder.a aVar, String str, String str2, String str3, hn.c<? super j> cVar) {
            super(2, cVar);
            this.f46576g = aVar;
            this.f46577h = str;
            this.f46578i = str2;
            this.f46579j = str3;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super com.moloco.sdk.internal.g0<RewardedInterstitialAd, MolocoAdError.AdCreateError>> cVar) {
            return ((j) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return b.this.new j(this.f46576g, this.f46577h, this.f46578i, this.f46579j, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objE;
            s sVar;
            com.moloco.sdk.acm.e eVar;
            String str;
            long j10;
            Object objG = in.a.g();
            int i10 = this.f46574e;
            if (i10 == 0) {
                kotlin.c.b(obj);
                s sVar2 = s.f46966g;
                long jInvoke = b.this.f46507b.invoke();
                String strF = b.this.f();
                com.moloco.sdk.acm.e eVarF = this.f46576g.c(com.moloco.sdk.internal.client_metrics_data.e.f45985h.c()).f(com.moloco.sdk.internal.client_metrics_data.d.f45970c.c(), sVar2.name()).f("initial_sdk_init_state", strF);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Creating " + sVar2 + " ad with adUnitId: " + this.f46577h, null, false, 12, null);
                b bVar = b.this;
                sn.l lVar = bVar.f46509d;
                com.moloco.sdk.acm.recorder.a aVar = this.f46576g;
                this.f46570a = sVar2;
                this.f46571b = strF;
                this.f46572c = eVarF;
                this.f46573d = jInvoke;
                this.f46574e = 1;
                objE = bVar.e(lVar, sVar2, aVar, this);
                if (objE == objG) {
                    return objG;
                }
                sVar = sVar2;
                eVar = eVarF;
                str = strF;
                j10 = jInvoke;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = this.f46573d;
                com.moloco.sdk.acm.e eVar2 = (com.moloco.sdk.acm.e) this.f46572c;
                String str2 = (String) this.f46571b;
                s sVar3 = (s) this.f46570a;
                kotlin.c.b(obj);
                eVar = eVar2;
                str = str2;
                sVar = sVar3;
                objE = obj;
            }
            com.moloco.sdk.internal.e eVar3 = (com.moloco.sdk.internal.e) objE;
            if (eVar3 != null) {
                Context contextA = com.moloco.sdk.service_locator.b.f47628a.a();
                com.moloco.sdk.internal.services.r rVarE = b.C0586b.f47632a.e();
                String str3 = this.f46577h;
                b.h hVar = b.h.f47664a;
                long j11 = j10;
                RewardedInterstitialAd rewardedInterstitialAdD = eVar3.d(contextA, rVarE, str3, hVar.j(), hVar.f(), b.i.f47671a.c(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0(this.f46578i), new a0(AdFormatType.REWARDED, com.moloco.sdk.internal.mediators.a.b(this.f46579j), null), this.f46576g, b.c.f47639a.b());
                if (rewardedInterstitialAdD != null) {
                    com.moloco.sdk.acm.recorder.a aVar2 = this.f46576g;
                    com.moloco.sdk.acm.b bVar2 = new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.f45951j.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.f45971d;
                    aVar2.b(bVar2.e(dVar.c(), "success").e(com.moloco.sdk.internal.client_metrics_data.d.f45970c.c(), sVar.name()).e("initial_sdk_init_state", str));
                    this.f46576g.a(eVar.f(dVar.c(), "success"));
                    if (rewardedInterstitialAdD instanceof p0) {
                        ((p0) rewardedInterstitialAdD).setCreateAdObjectStartTime(j11);
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Created " + sVar + " ad with adUnitId: " + this.f46577h, null, false, 12, null);
                    return new g0.b(rewardedInterstitialAdD);
                }
            }
            MolocoAdError.AdCreateError adCreateErrorB = b.this.b(this.f46577h, str, eVar, sVar, this.f46576g);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdCreator", "Failed to create " + sVar + " with reason: " + adCreateErrorB, null, false, 12, null);
            return new g0.a(adCreateErrorB);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull go.u<? extends Initialization> uVar, @NotNull com.moloco.sdk.internal.services.j jVar, @NotNull b0 b0Var, @NotNull sn.l<? super hn.c<? super com.moloco.sdk.internal.e>, ? extends Object> lVar) {
        tn.p.k(uVar, "initializationState");
        tn.p.k(jVar, "timeProviderService");
        tn.p.k(b0Var, "adCreatorConfiguration");
        tn.p.k(lVar, "awaitAdFactory");
        this.f46506a = uVar;
        this.f46507b = jVar;
        this.f46508c = b0Var;
        this.f46509d = lVar;
        this.f46510e = com.moloco.sdk.internal.scheduling.c.a().getDefault();
    }

    public final MolocoAdError.AdCreateError b(String str, String str2, com.moloco.sdk.acm.e eVar, s sVar, com.moloco.sdk.acm.recorder.a aVar) {
        com.moloco.sdk.acm.b bVar = new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.f45951j.c());
        com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.f45971d;
        com.moloco.sdk.acm.b bVarE = bVar.e(dVar.c(), "failure").e("initial_sdk_init_state", str2).e(com.moloco.sdk.internal.client_metrics_data.d.f45970c.c(), sVar.name());
        Initialization value = this.f46506a.getValue();
        int i10 = value == null ? -1 : C0568b.f46511a[value.ordinal()];
        if (i10 == -1) {
            com.moloco.sdk.internal.error.b bVarF = b.C0586b.f47632a.f();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CREATE_");
            String upperCase = sVar.name().toUpperCase(Locale.ROOT);
            tn.p.j(upperCase, "toUpperCase(...)");
            sb2.append(upperCase);
            sb2.append("_AD_FAILED_SDK_INIT_NOT_COMPLETED");
            b.a.a(bVarF, sb2.toString(), null, 2, null);
            com.moloco.sdk.acm.e eVarF = eVar.f(dVar.c(), "failure");
            com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.f45969b;
            aVar.a(eVarF.f(dVar2.c(), "sdk_init_not_completed"));
            aVar.b(bVarE.e(dVar2.c(), "sdk_init_not_completed"));
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "AdCreator", "Cannot retrieve AdFactory as SDK init was not called or not completed", null, false, 12, null);
            return MolocoAdError.AdCreateError.SDK_INIT_WAS_NOT_COMPLETED;
        }
        if (i10 == 1) {
            b.a.a(b.C0586b.f47632a.f(), "UNABLE_TO_CREATE_AD", null, 2, null);
            com.moloco.sdk.acm.e eVarF2 = eVar.f(dVar.c(), "failure");
            com.moloco.sdk.internal.client_metrics_data.d dVar3 = com.moloco.sdk.internal.client_metrics_data.d.f45969b;
            aVar.a(eVarF2.f(dVar3.c(), "unable_to_create_ad"));
            aVar.b(bVarE.e(dVar3.c(), "unable_to_create_ad"));
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "AdCreator", "Could not find the adUnitId that was requested for load: " + str, null, false, 12, null);
            return MolocoAdError.AdCreateError.UNABLE_TO_CREATE_AD;
        }
        if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        com.moloco.sdk.internal.error.b bVarF2 = b.C0586b.f47632a.f();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("CREATE_");
        String upperCase2 = sVar.name().toUpperCase(Locale.ROOT);
        tn.p.j(upperCase2, "toUpperCase(...)");
        sb3.append(upperCase2);
        sb3.append("_AD_FAILED_SDK_INIT_FAILED");
        b.a.a(bVarF2, sb3.toString(), null, 2, null);
        com.moloco.sdk.acm.e eVarF3 = eVar.f(dVar.c(), "failure");
        com.moloco.sdk.internal.client_metrics_data.d dVar4 = com.moloco.sdk.internal.client_metrics_data.d.f45969b;
        aVar.a(eVarF3.f(dVar4.c(), "sdk_init_failed"));
        aVar.b(bVarE.e(dVar4.c(), "sdk_init_failed"));
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "AdCreator", "Cannot create AdFactory as SDK init was failure", null, false, 12, null);
        return MolocoAdError.AdCreateError.SDK_INIT_FAILED;
    }

    @Nullable
    public final Object d(@NotNull String str, @NotNull String str2, @NotNull com.moloco.sdk.acm.recorder.a aVar, @Nullable String str3, @NotNull hn.c<? super com.moloco.sdk.internal.g0<Banner, MolocoAdError.AdCreateError>> cVar) {
        return p000do.g.g(this.f46510e, new e(aVar, str2, str3, str, null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @android.annotation.SuppressLint({"RestrictedApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(sn.l<? super hn.c<? super com.moloco.sdk.internal.e>, ? extends java.lang.Object> r19, com.moloco.sdk.internal.publisher.s r20, com.moloco.sdk.acm.recorder.a r21, hn.c<? super com.moloco.sdk.internal.e> r22) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.b.e(sn.l, com.moloco.sdk.internal.publisher.s, com.moloco.sdk.acm.recorder.a, hn.c):java.lang.Object");
    }

    public final String f() {
        String strName;
        Initialization value = this.f46506a.getValue();
        if (value != null && (strName = value.name()) != null) {
            String lowerCase = strName.toLowerCase(Locale.ROOT);
            tn.p.j(lowerCase, "toLowerCase(...)");
            if (lowerCase != null) {
                return lowerCase;
            }
        }
        return "not_invoked_or_in_progress";
    }

    @Nullable
    public final Object i(@NotNull String str, @NotNull String str2, @NotNull com.moloco.sdk.acm.recorder.a aVar, @Nullable String str3, @NotNull hn.c<? super com.moloco.sdk.internal.g0<Banner, MolocoAdError.AdCreateError>> cVar) {
        return p000do.g.g(this.f46510e, new f(aVar, str2, str3, str, null), cVar);
    }

    @Nullable
    public final Object j(@NotNull String str, @NotNull String str2, @NotNull com.moloco.sdk.acm.recorder.a aVar, @Nullable String str3, @NotNull hn.c<? super com.moloco.sdk.internal.g0<InterstitialAd, MolocoAdError.AdCreateError>> cVar) {
        return p000do.g.g(this.f46510e, new g(aVar, str2, str3, str, null), cVar);
    }

    @Nullable
    public final Object l(@NotNull String str, @NotNull String str2, @NotNull com.moloco.sdk.acm.recorder.a aVar, @Nullable String str3, @NotNull hn.c<? super com.moloco.sdk.internal.g0<Banner, MolocoAdError.AdCreateError>> cVar) {
        return p000do.g.g(this.f46510e, new h(aVar, str2, str3, str, null), cVar);
    }

    @Nullable
    public final Object m(@NotNull String str, @NotNull String str2, @NotNull com.moloco.sdk.acm.recorder.a aVar, @Nullable String str3, @NotNull hn.c<? super com.moloco.sdk.internal.g0<NativeAd, MolocoAdError.AdCreateError>> cVar) {
        return p000do.g.g(this.f46510e, new i(aVar, str2, str3, str, null), cVar);
    }

    @Nullable
    public final Object n(@NotNull String str, @NotNull String str2, @NotNull com.moloco.sdk.acm.recorder.a aVar, @Nullable String str3, @NotNull hn.c<? super com.moloco.sdk.internal.g0<RewardedInterstitialAd, MolocoAdError.AdCreateError>> cVar) {
        return p000do.g.g(this.f46510e, new j(aVar, str2, str3, str, null), cVar);
    }
}
