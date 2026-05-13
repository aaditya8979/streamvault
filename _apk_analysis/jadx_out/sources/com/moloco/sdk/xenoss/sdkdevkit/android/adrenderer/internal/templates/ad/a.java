package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r;
import com.safedk.android.internal.partials.MolocoAdsNetworkBridge;
import go.f;
import go.l;
import go.u;
import go.v;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Set;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.q;
import tn.p;

/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 0)
public final class a implements k, j, r {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final C0620a f48581p = new C0620a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f48582q = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Set<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a> f48583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b f48584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final i f48585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final h f48586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.recorder.a f48587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final l0 f48588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final g f48589h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a f48590i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b f48591j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.a f48592k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final bn.g f48593l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final l<Boolean> f48594m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final bn.g f48595n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a f48596o;

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a$a, reason: collision with other inner class name */
    public static final class C0620a {
        public C0620a() {
        }

        public /* synthetic */ C0620a(tn.i iVar) {
            this();
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.WebviewAd$isAdDisplaying$2$1", f = "WebviewAd.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements q<Boolean, Boolean, hn.c<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f48598b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ boolean f48599c;

        public b(hn.c<? super b> cVar) {
            super(3, cVar);
        }

        public final Object a(boolean z10, boolean z11, hn.c<? super Boolean> cVar) {
            b bVar = new b(cVar);
            bVar.f48598b = z10;
            bVar.f48599c = z11;
            return bVar.invokeSuspend(bn.r.f5635a);
        }

        @Override // sn.q
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, hn.c<? super Boolean> cVar) {
            return a(bool.booleanValue(), bool2.booleanValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f48597a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            return jn.a.a(this.f48598b && this.f48599c);
        }
    }

    public static final class c implements k.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k.a f48601b;

        public c(k.a aVar) {
            this.f48601b = aVar;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k.a
        public void a() {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "WebviewAd", "Ad load successful, start collecting playlist item displaying events", null, false, 12, null);
            a.this.y().d(a.this.x());
            k.a aVar = this.f48601b;
            if (aVar != null) {
                aVar.a();
            }
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k.a
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
            p.k(cVar, "internalError");
            k.a aVar = this.f48601b;
            if (aVar != null) {
                aVar.a(cVar);
            }
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k.a
        public void b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar) {
            p.k(aVar, "timeoutError");
            k.a aVar2 = this.f48601b;
            if (aVar2 != null) {
                aVar2.b(aVar);
            }
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.WebviewAd$show$1", f = "WebviewAd.kt", l = {80}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48602a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a0 f48604c;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a$d$a, reason: collision with other inner class name */
        @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.WebviewAd$show$1$error$1", f = "WebviewAd.kt", l = {}, m = "invokeSuspend")
        public static final class C0621a extends SuspendLambda implements sn.p<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l, hn.c<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f48605a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f48606b;

            public C0621a(hn.c<? super C0621a> cVar) {
                super(2, cVar);
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l lVar, hn.c<? super Boolean> cVar) {
                return ((C0621a) create(lVar, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                C0621a c0621a = new C0621a(cVar);
                c0621a.f48606b = obj;
                return c0621a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                in.a.g();
                if (this.f48605a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                return jn.a.a(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l) this.f48606b) != null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a0 a0Var, hn.c<? super d> cVar) {
            super(2, cVar);
            this.f48604c = a0Var;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((d) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return a.this.new d(this.f48604c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f48602a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                a.this.f48594m.setValue(jn.a.a(true));
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "WebviewAd", "Ad show called, isAdDisplaying: " + ((Boolean) a.this.f48594m.getValue()).booleanValue(), null, false, 12, null);
                u<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l> unrecoverableError = a.this.y().getUnrecoverableError();
                C0621a c0621a = new C0621a(null);
                this.f48602a = 1;
                obj = f.w(unrecoverableError, c0621a, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l lVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l) obj;
            if (lVar != null) {
                a0 a0Var = this.f48604c;
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "WebviewAd", "Ad show error: " + lVar, null, false, 12, null);
                a0Var.a(lVar);
            }
            return bn.r.f5635a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull Context context, @NotNull final String str, @NotNull Set<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a> set, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b bVar, @NotNull i iVar, @NotNull h hVar, @NotNull com.moloco.sdk.acm.recorder.a aVar) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(str, "adm");
        p.k(set, "eventHandlers");
        p.k(bVar, "clickthroughEventHandler");
        p.k(iVar, "contentLoadedHandler");
        p.k(hVar, "playListItemDisplayingEventHandler");
        p.k(aVar, "metricsRecorder");
        this.f48583b = set;
        this.f48584c = bVar;
        this.f48585d = iVar;
        this.f48586e = hVar;
        this.f48587f = aVar;
        this.f48588g = kotlinx.coroutines.d.a(com.moloco.sdk.internal.scheduling.c.a().getMain());
        g gVar = new g(set, aVar);
        this.f48589h = gVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b bVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b(context, iVar, hVar, aVar, null, 16, null);
        MolocoAdsNetworkBridge.onAddedJavascriptInterface(bVar2, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a(gVar), "AndroidTemplateBridge");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.b bVar3 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.b(context, bVar2, bVar);
        this.f48590i = bVar3;
        bVar3.b();
        this.f48591j = bVar2;
        this.f48592k = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.d(bVar2, aVar);
        this.f48593l = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.b
            @Override // sn.a
            public final Object invoke() {
                return a.j(str, this);
            }
        });
        this.f48594m = v.a(Boolean.FALSE);
        this.f48595n = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.c
            @Override // sn.a
            public final Object invoke() {
                return a.q(this.f48609b);
            }
        });
        this.f48596o = s();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a j(String str, a aVar) {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a(str, aVar.f48588g, aVar.f48591j);
    }

    public static final u q(a aVar) {
        return f.M(f.A(aVar.f48594m, aVar.f48591j.b(), new b(null)), aVar.f48588g, kotlinx.coroutines.flow.a.f73397a.c(), Boolean.FALSE);
    }

    @NotNull
    public final u<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b> A() {
        return this.f48591j.getOrientation$moloco_sdk_release();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r
    public void destroy() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "WebviewAd", "Ad destroy called", null, false, 12, null);
        this.f48594m.setValue(Boolean.FALSE);
        this.f48590i.remove();
        this.f48591j.destroy();
        kotlinx.coroutines.d.e(this.f48588g, null, 1, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void i(long j10, @Nullable k.a aVar) {
        s().i(j10, new c(aVar));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    @NotNull
    public u<Boolean> isLoaded() {
        return this.f48596o.isLoaded();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    @NotNull
    public u<Boolean> l() {
        return (u) this.f48595n.getValue();
    }

    public void o(@NotNull a0 a0Var) {
        p.k(a0Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        p000do.i.d(this.f48588g, null, null, new d(a0Var, null), 3, null);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a s() {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a) this.f48593l.getValue();
    }

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a x() {
        return this.f48590i;
    }

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b y() {
        return this.f48591j;
    }

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.a z() {
        return this.f48592k;
    }
}
