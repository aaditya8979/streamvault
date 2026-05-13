package com.moloco.sdk.internal.publisher.nativead;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.publisher.a0;
import com.moloco.sdk.internal.publisher.e0;
import com.moloco.sdk.internal.publisher.nativead.c;
import com.moloco.sdk.internal.publisher.p0;
import com.moloco.sdk.internal.services.r;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.publisher.NativeAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;
import tn.i;

/* JADX INFO: loaded from: classes6.dex */
@StabilityInferred(parameters = 0)
public final class b implements NativeAd, p0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final a f46728q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f46729r = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f46730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final c f46731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.publisher.nativead.a f46732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final r f46733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f46734f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final w0 f46735g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final l f46736h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final a0 f46737i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.recorder.a f46738j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public NativeAd.InteractionListener f46739k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final AdFormatType f46740l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final l0 f46741m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.e f46742n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public f f46743o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public g f46744p;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.publisher.nativead.b$b, reason: collision with other inner class name */
    @jn.d(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdImpl$load$1", f = "NativeAdImpl.kt", l = {104}, m = "invokeSuspend")
    public static final class C0572b extends SuspendLambda implements p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f46745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f46746b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AdLoad.Listener f46748d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f46749e;

        /* JADX INFO: renamed from: com.moloco.sdk.internal.publisher.nativead.b$b$a */
        public /* synthetic */ class a extends FunctionReferenceImpl implements sn.a<bn.r> {
            public a(Object obj) {
                super(0, obj, b.class, "handleGeneralAdClick", "handleGeneralAdClick()V", 0);
            }

            public final void a() {
                ((b) this.receiver).handleGeneralAdClick();
            }

            @Override // sn.a
            public /* bridge */ /* synthetic */ bn.r invoke() {
                a();
                return bn.r.f5635a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0572b(AdLoad.Listener listener, String str, hn.c<? super C0572b> cVar) {
            super(2, cVar);
            this.f46748d = listener;
            this.f46749e = str;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((C0572b) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return b.this.new C0572b(this.f46748d, this.f46749e, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            com.moloco.sdk.internal.publisher.w0 w0Var;
            Object objM7542unboximpl;
            Object objG = in.a.g();
            int i10 = this.f46746b;
            if (i10 == 0) {
                kotlin.c.b(obj);
                b bVar = b.this;
                com.moloco.sdk.internal.publisher.w0 w0VarB = bVar.b(bVar.f46742n, this.f46748d);
                c cVar = b.this.f46731c;
                String str = this.f46749e;
                com.moloco.sdk.acm.e eVar = b.this.f46742n;
                this.f46745a = w0VarB;
                this.f46746b = 1;
                Object objL = cVar.l(str, eVar, w0VarB, this);
                if (objL == objG) {
                    return objG;
                }
                w0Var = w0VarB;
                objM7542unboximpl = objL;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                w0Var = (com.moloco.sdk.internal.publisher.w0) this.f46745a;
                kotlin.c.b(obj);
                objM7542unboximpl = ((Result) obj).m7542unboximpl();
            }
            Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objM7542unboximpl);
            if (thM7537exceptionOrNullimpl != null) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "NativeAdImpl", "Failed to load native ad.", thM7537exceptionOrNullimpl, false, 8, null);
                return bn.r.f5635a;
            }
            c.b bVar2 = (c.b) objM7542unboximpl;
            b bVar3 = b.this;
            bVar3.d(new f(bVar3.f46730b, bVar2.a(), bVar2.b(), bVar3.f46733e, bVar3.f46734f, bVar3.f46740l, bVar3.f46736h, bVar3.f46735g, bVar3.f46738j));
            bVar3.getAssets().e(bVar2.c());
            bVar3.getAssets().f(new a(bVar3));
            w0Var.a(MolocoAdKt.createAdInfo$default(bVar3.f46730b, jn.a.c(bVar2.a().g()), null, 4, null), bVar2.a().f().f());
            return bn.r.f5635a;
        }
    }

    public b(@NotNull String str, @NotNull c cVar, @NotNull com.moloco.sdk.internal.publisher.nativead.a aVar, @NotNull r rVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar2, @NotNull w0 w0Var, @NotNull l lVar, @NotNull a0 a0Var, @NotNull com.moloco.sdk.acm.recorder.a aVar3) {
        tn.p.k(str, "adUnitId");
        tn.p.k(cVar, "nativeAdLoader");
        tn.p.k(aVar, "assets");
        tn.p.k(rVar, "appLifecycleTrackerService");
        tn.p.k(aVar2, "customUserEventBuilderService");
        tn.p.k(w0Var, "externalLinkHandler");
        tn.p.k(lVar, "persistentHttpRequest");
        tn.p.k(a0Var, "createLoadTimeoutManager");
        tn.p.k(aVar3, "metricsRecorder");
        this.f46730b = str;
        this.f46731c = cVar;
        this.f46732d = aVar;
        this.f46733e = rVar;
        this.f46734f = aVar2;
        this.f46735g = w0Var;
        this.f46736h = lVar;
        this.f46737i = a0Var;
        this.f46738j = aVar3;
        this.f46740l = AdFormatType.NATIVE;
        this.f46741m = kotlinx.coroutines.d.a(com.moloco.sdk.internal.scheduling.c.a().getMain());
        this.f46742n = aVar3.c(com.moloco.sdk.internal.client_metrics_data.e.f45987j.c());
    }

    public final com.moloco.sdk.internal.publisher.w0 b(com.moloco.sdk.acm.e eVar, AdLoad.Listener listener) {
        return e0.a(listener, eVar, this.f46740l, this.f46738j);
    }

    public final void d(@Nullable f fVar) {
        this.f46743o = fVar;
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public void destroy() {
        kotlinx.coroutines.d.e(this.f46741m, null, 1, null);
        getAssets().c();
        setInteractionListener(null);
    }

    @Override // com.moloco.sdk.publisher.NativeAd
    @Nullable
    public NativeAd.InteractionListener getInteractionListener() {
        return this.f46739k;
    }

    @Override // com.moloco.sdk.publisher.NativeAd
    public void handleGeneralAdClick() {
        NativeAd.InteractionListener interactionListener = getInteractionListener();
        if (interactionListener != null) {
            interactionListener.onGeneralClickHandled();
        }
        f fVar = this.f46743o;
        if (fVar != null) {
            fVar.e();
        }
    }

    @Override // com.moloco.sdk.publisher.NativeAd
    public void handleImpression() {
        NativeAd.InteractionListener interactionListener = getInteractionListener();
        if (interactionListener != null) {
            interactionListener.onImpressionHandled();
        }
        f fVar = this.f46743o;
        if (fVar != null) {
            fVar.f();
        }
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public boolean isLoaded() {
        return getAssets().g() != null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public com.moloco.sdk.internal.publisher.nativead.a getAssets() {
        return this.f46732d;
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public synchronized void load(@NotNull String str, @Nullable AdLoad.Listener listener) {
        tn.p.k(str, "bidResponseJson");
        g gVar = this.f46744p;
        if (gVar != null && gVar.isActive()) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "NativeAdImpl", "load() called while another load operation is in progress. Ignoring this call.", null, false, 12, null);
        } else if (isLoaded()) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "NativeAdImpl", "load() called but ad is already loaded. Ignoring this call.", null, false, 12, null);
        } else {
            this.f46744p = p000do.i.d(this.f46741m, null, null, new C0572b(listener, str, null), 3, null);
        }
    }

    @Override // com.moloco.sdk.internal.publisher.p0
    public void setCreateAdObjectStartTime(long j10) {
        this.f46737i.setCreateAdObjectStartTime(j10);
    }

    @Override // com.moloco.sdk.publisher.NativeAd
    public void setInteractionListener(@Nullable NativeAd.InteractionListener interactionListener) {
        this.f46739k = interactionListener;
    }
}
