package com.moloco.sdk.internal.publisher.nativead;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import bn.r;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.moloco.sdk.internal.c0;
import com.moloco.sdk.internal.g0;
import com.moloco.sdk.internal.ortb.model.A;
import com.moloco.sdk.internal.ortb.model.C4381e;
import com.moloco.sdk.internal.publisher.a0;
import com.moloco.sdk.internal.publisher.o;
import com.moloco.sdk.internal.publisher.w0;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Locale;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import tn.p;

/* JADX INFO: loaded from: classes6.dex */
@StabilityInferred(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final a f46750k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f46751l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f46752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f46753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final o f46754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.publisher.nativead.parser.a f46755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final a0 f46756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.recorder.a f46757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.services.j f46758g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final AdFormatType f46759h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.e f46760i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.scheduling.a f46761j;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final C4381e f46762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final com.moloco.sdk.internal.publisher.nativead.model.a f46763b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final com.moloco.sdk.internal.publisher.nativead.model.d f46764c;

        public b(@NotNull C4381e c4381e, @NotNull com.moloco.sdk.internal.publisher.nativead.model.a aVar, @NotNull com.moloco.sdk.internal.publisher.nativead.model.d dVar) {
            p.k(c4381e, "bid");
            p.k(aVar, "ortbResponse");
            p.k(dVar, "preparedAssets");
            this.f46762a = c4381e;
            this.f46763b = aVar;
            this.f46764c = dVar;
        }

        @NotNull
        public final C4381e a() {
            return this.f46762a;
        }

        @NotNull
        public final com.moloco.sdk.internal.publisher.nativead.model.a b() {
            return this.f46763b;
        }

        @NotNull
        public final com.moloco.sdk.internal.publisher.nativead.model.d c() {
            return this.f46764c;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p.f(this.f46762a, bVar.f46762a) && p.f(this.f46763b, bVar.f46763b) && p.f(this.f46764c, bVar.f46764c);
        }

        public int hashCode() {
            return (((this.f46762a.hashCode() * 31) + this.f46763b.hashCode()) * 31) + this.f46764c.hashCode();
        }

        @NotNull
        public String toString() {
            return "LoadedNativeAd(bid=" + this.f46762a + ", ortbResponse=" + this.f46763b + ", preparedAssets=" + this.f46764c + ')';
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.publisher.nativead.c$c, reason: collision with other inner class name */
    @jn.d(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader", f = "NativeAdLoader.kt", l = {239}, m = "fetchAssets-8Mi8wO0")
    public static final class C0573c extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f46765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f46766b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f46767c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f46768d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f46770f;

        public C0573c(hn.c<? super C0573c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46768d = obj;
            this.f46770f |= Integer.MIN_VALUE;
            return c.this.g(null, 0L, this);
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader$fireAdLoadFailedEventOnUiThread$2", f = "NativeAdLoader.kt", l = {}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements sn.p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ w0 f46772b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c0 f46773c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ A f46774d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(w0 w0Var, c0 c0Var, A a10, hn.c<? super d> cVar) {
            super(2, cVar);
            this.f46772b = w0Var;
            this.f46773c = c0Var;
            this.f46774d = a10;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((d) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return new d(this.f46772b, this.f46773c, this.f46774d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f46771a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            this.f46772b.c(this.f46773c, this.f46774d);
            return r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader", f = "NativeAdLoader.kt", l = {189, 202, 209}, m = "handleAssetsFetching-yxL6bBk")
    public static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f46775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f46776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f46777c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f46778d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f46780f;

        public e(hn.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46778d = obj;
            this.f46780f |= Integer.MIN_VALUE;
            Object objB = c.this.b(null, null, null, 0L, this);
            return objB == in.a.g() ? objB : Result.m7533boximpl(objB);
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader$handleAssetsFetching$result$1", f = "NativeAdLoader.kt", l = {190}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements sn.p<l0, hn.c<? super g0<com.moloco.sdk.internal.publisher.nativead.model.d, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46781a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.publisher.nativead.model.a f46783c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f46784d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.moloco.sdk.internal.publisher.nativead.model.a aVar, long j10, hn.c<? super f> cVar) {
            super(2, cVar);
            this.f46783c = aVar;
            this.f46784d = j10;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super g0<com.moloco.sdk.internal.publisher.nativead.model.d, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>> cVar) {
            return ((f) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return c.this.new f(this.f46783c, this.f46784d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f46781a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                c cVar = c.this;
                com.moloco.sdk.internal.publisher.nativead.model.a aVar = this.f46783c;
                long j10 = this.f46784d;
                this.f46781a = 1;
                obj = cVar.g(aVar, j10, this);
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

    @jn.d(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader", f = "NativeAdLoader.kt", l = {143, 159}, m = "handleBidParsing-BWLJW6A")
    public static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f46785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f46786b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f46787c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f46788d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f46790f;

        public g(hn.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46788d = obj;
            this.f46790f |= Integer.MIN_VALUE;
            Object objI = c.this.i(null, null, null, this);
            return objI == in.a.g() ? objI : Result.m7533boximpl(objI);
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader", f = "NativeAdLoader.kt", l = {HideBottomViewOnScrollBehavior.EXIT_ANIMATION_DURATION}, m = "handleOrtbParsing-BWLJW6A")
    public static final class h extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f46791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f46792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f46793c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f46795e;

        public h(hn.c<? super h> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46793c = obj;
            this.f46795e |= Integer.MIN_VALUE;
            Object objJ = c.this.j(null, null, null, this);
            return objJ == in.a.g() ? objJ : Result.m7533boximpl(objJ);
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader", f = "NativeAdLoader.kt", l = {99}, m = "load-BWLJW6A")
    public static final class i extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f46796a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f46798c;

        public i(hn.c<? super i> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46796a = obj;
            this.f46798c |= Integer.MIN_VALUE;
            Object objL = c.this.l(null, null, null, this);
            return objL == in.a.g() ? objL : Result.m7533boximpl(objL);
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader$load$2", f = "NativeAdLoader.kt", l = {111, 119, 126, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE}, m = "invokeSuspend")
    public static final class j extends SuspendLambda implements sn.p<l0, hn.c<? super Result<? extends b>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f46799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f46800b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f46801c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f46802d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.e f46804f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f46805g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ w0 f46806h;

        @jn.d(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader$load$2$1", f = "NativeAdLoader.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements sn.p<l0, hn.c<? super r>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f46807a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w0 f46808b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f46809c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ C4381e f46810d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ long f46811e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(w0 w0Var, c cVar, C4381e c4381e, long j10, hn.c<? super a> cVar2) {
                super(2, cVar2);
                this.f46808b = w0Var;
                this.f46809c = cVar;
                this.f46810d = c4381e;
                this.f46811e = j10;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
                return ((a) create(l0Var, cVar)).invokeSuspend(r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<r> create(Object obj, hn.c<?> cVar) {
                return new a(this.f46808b, this.f46809c, this.f46810d, this.f46811e, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                in.a.g();
                if (this.f46807a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                this.f46808b.b(MolocoAdKt.createAdInfo(this.f46809c.f46753b, jn.a.c(this.f46810d.g()), this.f46810d.e()), this.f46811e, this.f46810d.f().f());
                return r.f5635a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(com.moloco.sdk.acm.e eVar, String str, w0 w0Var, hn.c<? super j> cVar) {
            super(2, cVar);
            this.f46804f = eVar;
            this.f46805g = str;
            this.f46806h = w0Var;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super Result<b>> cVar) {
            return ((j) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return c.this.new j(this.f46804f, this.f46805g, this.f46806h, cVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0116 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0117  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0120  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0149  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0159  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0166  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 384
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.nativead.c.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader", f = "NativeAdLoader.kt", l = {286}, m = "prepareAssets-8Mi8wO0")
    public static final class k extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f46812a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f46814c;

        public k(hn.c<? super k> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46812a = obj;
            this.f46814c |= Integer.MIN_VALUE;
            return c.this.k(null, 0L, this);
        }
    }

    public c(@NotNull Context context, @NotNull String str, @NotNull o oVar, @NotNull com.moloco.sdk.internal.publisher.nativead.parser.a aVar, @NotNull a0 a0Var, @NotNull com.moloco.sdk.acm.recorder.a aVar2, @NotNull com.moloco.sdk.internal.services.j jVar) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(str, "adUnitId");
        p.k(oVar, "bidLoader");
        p.k(aVar, "ortbResponseParser");
        p.k(a0Var, "createLoadTimeoutManager");
        p.k(aVar2, "metricsRecorder");
        p.k(jVar, "timeProvider");
        this.f46752a = context;
        this.f46753b = str;
        this.f46754c = oVar;
        this.f46755d = aVar;
        this.f46756e = a0Var;
        this.f46757f = aVar2;
        this.f46758g = jVar;
        AdFormatType adFormatType = AdFormatType.NATIVE;
        this.f46759h = adFormatType;
        com.moloco.sdk.acm.e eVarC = aVar2.c(com.moloco.sdk.internal.client_metrics_data.e.f45994q.c());
        String strC = com.moloco.sdk.internal.client_metrics_data.d.f45970c.c();
        String lowerCase = adFormatType.name().toLowerCase(Locale.ROOT);
        p.j(lowerCase, "toLowerCase(...)");
        this.f46760i = eVarC.f(strC, lowerCase);
        this.f46761j = com.moloco.sdk.internal.scheduling.c.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @androidx.annotation.VisibleForTesting
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@org.jetbrains.annotations.Nullable com.moloco.sdk.internal.ortb.model.A r21, @org.jetbrains.annotations.NotNull com.moloco.sdk.internal.publisher.nativead.model.a r22, @org.jetbrains.annotations.NotNull com.moloco.sdk.internal.publisher.w0 r23, long r24, @org.jetbrains.annotations.NotNull hn.c<? super kotlin.Result<com.moloco.sdk.internal.publisher.nativead.model.d>> r26) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.nativead.c.b(com.moloco.sdk.internal.ortb.model.A, com.moloco.sdk.internal.publisher.nativead.model.a, com.moloco.sdk.internal.publisher.w0, long, hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.moloco.sdk.internal.publisher.nativead.model.a r16, long r17, hn.c<? super com.moloco.sdk.internal.g0<com.moloco.sdk.internal.publisher.nativead.model.d, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>> r19) {
        /*
            Method dump skipped, instruction units count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.nativead.c.g(com.moloco.sdk.internal.publisher.nativead.model.a, long, hn.c):java.lang.Object");
    }

    public final Object h(w0 w0Var, c0 c0Var, A a10, hn.c<? super r> cVar) {
        Object objG = p000do.g.g(this.f46761j.getMain(), new d(w0Var, c0Var, a10, null), cVar);
        return objG == in.a.g() ? objG : r.f5635a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r12, com.moloco.sdk.acm.e r13, com.moloco.sdk.internal.publisher.w0 r14, hn.c<? super kotlin.Result<com.moloco.sdk.internal.ortb.model.C4381e>> r15) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.nativead.c.i(java.lang.String, com.moloco.sdk.acm.e, com.moloco.sdk.internal.publisher.w0, hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r12, com.moloco.sdk.internal.ortb.model.A r13, com.moloco.sdk.internal.publisher.w0 r14, hn.c<? super kotlin.Result<com.moloco.sdk.internal.publisher.nativead.model.a>> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.moloco.sdk.internal.publisher.nativead.c.h
            if (r0 == 0) goto L13
            r0 = r15
            com.moloco.sdk.internal.publisher.nativead.c$h r0 = (com.moloco.sdk.internal.publisher.nativead.c.h) r0
            int r1 = r0.f46795e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46795e = r1
            goto L18
        L13:
            com.moloco.sdk.internal.publisher.nativead.c$h r0 = new com.moloco.sdk.internal.publisher.nativead.c$h
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f46793c
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f46795e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r12 = r0.f46791a
            kotlin.c.b(r15)
            goto L66
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            kotlin.c.b(r15)
            com.moloco.sdk.internal.publisher.nativead.parser.a r15 = r11.f46755d
            java.lang.Object r12 = r15.c(r12)
            java.lang.Throwable r7 = kotlin.Result.m7537exceptionOrNullimpl(r12)
            if (r7 == 0) goto L66
            com.moloco.sdk.internal.MolocoLogger r4 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            r8 = 0
            r9 = 8
            r10 = 0
            java.lang.String r5 = "NativeAdLoader"
            java.lang.String r6 = "handleOrtbParsing"
            com.moloco.sdk.internal.MolocoLogger.error$default(r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r15 = r11.f46753b
            com.moloco.sdk.publisher.MolocoAdError$ErrorType r2 = com.moloco.sdk.publisher.MolocoAdError.ErrorType.AD_LOAD_FAILED
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f r4 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f.f48068a
            com.moloco.sdk.internal.c0 r15 = com.moloco.sdk.internal.d0.a(r15, r2, r4)
            r0.f46791a = r12
            r0.f46792b = r12
            r0.f46795e = r3
            java.lang.Object r13 = r11.h(r14, r15, r13, r0)
            if (r13 != r1) goto L66
            return r1
        L66:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.nativead.c.j(java.lang.String, com.moloco.sdk.internal.ortb.model.A, com.moloco.sdk.internal.publisher.w0, hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.util.List<? extends com.moloco.sdk.internal.publisher.nativead.model.a.AbstractC0574a> r8, long r9, hn.c<? super com.moloco.sdk.internal.g0<com.moloco.sdk.internal.publisher.nativead.model.d, com.moloco.sdk.internal.publisher.nativead.parser.b>> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.moloco.sdk.internal.publisher.nativead.c.k
            if (r0 == 0) goto L13
            r0 = r11
            com.moloco.sdk.internal.publisher.nativead.c$k r0 = (com.moloco.sdk.internal.publisher.nativead.c.k) r0
            int r1 = r0.f46814c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46814c = r1
            goto L18
        L13:
            com.moloco.sdk.internal.publisher.nativead.c$k r0 = new com.moloco.sdk.internal.publisher.nativead.c$k
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f46812a
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f46814c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.c.b(r11)
            goto L3f
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            kotlin.c.b(r11)
            android.content.Context r11 = r7.f46752a
            r0.f46814c = r3
            java.lang.Object r11 = com.moloco.sdk.internal.publisher.nativead.parser.c.b(r11, r8, r9, r0)
            if (r11 != r1) goto L3f
            return r1
        L3f:
            com.moloco.sdk.internal.g0 r11 = (com.moloco.sdk.internal.g0) r11
            boolean r8 = r11 instanceof com.moloco.sdk.internal.g0.b
            if (r8 == 0) goto L51
            com.moloco.sdk.internal.g0$b r8 = new com.moloco.sdk.internal.g0$b
            com.moloco.sdk.internal.g0$b r11 = (com.moloco.sdk.internal.g0.b) r11
            java.lang.Object r9 = r11.a()
            r8.<init>(r9)
            goto L74
        L51:
            boolean r8 = r11 instanceof com.moloco.sdk.internal.g0.a
            if (r8 == 0) goto L75
            com.moloco.sdk.internal.MolocoLogger r0 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            com.moloco.sdk.internal.g0$a r11 = (com.moloco.sdk.internal.g0.a) r11
            java.lang.Object r8 = r11.a()
            r3 = r8
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r4 = 0
            r5 = 8
            r6 = 0
            java.lang.String r1 = "NativeAdLoader"
            java.lang.String r2 = "NativeAd prepareAssets failed"
            com.moloco.sdk.internal.MolocoLogger.error$default(r0, r1, r2, r3, r4, r5, r6)
            com.moloco.sdk.internal.g0$a r8 = new com.moloco.sdk.internal.g0$a
            java.lang.Object r9 = r11.a()
            r8.<init>(r9)
        L74:
            return r8
        L75:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.nativead.c.k(java.util.List, long, hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(@org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull com.moloco.sdk.acm.e r12, @org.jetbrains.annotations.NotNull com.moloco.sdk.internal.publisher.w0 r13, @org.jetbrains.annotations.NotNull hn.c<? super kotlin.Result<com.moloco.sdk.internal.publisher.nativead.c.b>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.moloco.sdk.internal.publisher.nativead.c.i
            if (r0 == 0) goto L13
            r0 = r14
            com.moloco.sdk.internal.publisher.nativead.c$i r0 = (com.moloco.sdk.internal.publisher.nativead.c.i) r0
            int r1 = r0.f46798c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46798c = r1
            goto L18
        L13:
            com.moloco.sdk.internal.publisher.nativead.c$i r0 = new com.moloco.sdk.internal.publisher.nativead.c$i
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f46796a
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f46798c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.c.b(r14)
            goto L4e
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            kotlin.c.b(r14)
            com.moloco.sdk.internal.scheduling.a r14 = r10.f46761j
            kotlin.coroutines.d r14 = r14.getDefault()
            com.moloco.sdk.internal.publisher.nativead.c$j r2 = new com.moloco.sdk.internal.publisher.nativead.c$j
            r9 = 0
            r4 = r2
            r5 = r10
            r6 = r12
            r7 = r11
            r8 = r13
            r4.<init>(r6, r7, r8, r9)
            r0.f46798c = r3
            java.lang.Object r14 = p000do.g.g(r14, r2, r0)
            if (r14 != r1) goto L4e
            return r1
        L4e:
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r11 = r14.m7542unboximpl()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.nativead.c.l(java.lang.String, com.moloco.sdk.acm.e, com.moloco.sdk.internal.publisher.w0, hn.c):java.lang.Object");
    }
}
