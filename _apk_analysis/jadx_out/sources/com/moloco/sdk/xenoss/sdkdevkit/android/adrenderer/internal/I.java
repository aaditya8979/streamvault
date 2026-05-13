package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.I;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k;
import go.e;
import go.f;
import go.k;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.q;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
public final class I implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public static final a f47802t = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f47803u = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f47804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 f47805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final w0 f47806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l f47807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.recorder.a f47808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final p000do.l0 f47809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.d f47810h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final i f47811i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b f47812j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h f47813k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.j f47814l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.c f47815m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Set<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a> f47816n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a f47817o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i f47818p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final go.l<Boolean> f47819q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final bn.g f47820r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final go.l<Boolean> f47821s;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.TemplateFullscreenAdImpl$isAdDisplaying$2$1", f = "TemplateFullscreenAd.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements q<Boolean, Boolean, hn.c<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f47823b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ boolean f47824c;

        public b(hn.c<? super b> cVar) {
            super(3, cVar);
        }

        public final Object a(boolean z10, boolean z11, hn.c<? super Boolean> cVar) {
            b bVar = new b(cVar);
            bVar.f47823b = z10;
            bVar.f47824c = z11;
            return bVar.invokeSuspend(bn.r.f5635a);
        }

        @Override // sn.q
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, hn.c<? super Boolean> cVar) {
            return a(bool.booleanValue(), bool2.booleanValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f47822a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            boolean z10 = this.f47823b;
            boolean z11 = this.f47824c;
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("isAdDisplaying final: ");
            sb2.append(z10 && z11);
            sb2.append(", _isAdDisplaying: ");
            sb2.append(z10);
            sb2.append(", webViewIsDisplaying: ");
            sb2.append(z11);
            MolocoLogger.info$default(molocoLogger, "TemplateFullscreenAd", sb2.toString(), null, false, 12, null);
            return jn.a.a(z10 && z11);
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.TemplateFullscreenAdImpl$show$1", f = "TemplateFullscreenAd.kt", l = {119}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f47826b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d f47828d;

        @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.TemplateFullscreenAdImpl$show$1$1", f = "TemplateFullscreenAd.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements sn.p<bn.r, hn.c<? super bn.r>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f47829a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ List<kotlinx.coroutines.g> f47830b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ I f47831c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(List<? extends kotlinx.coroutines.g> list, I i10, hn.c<? super a> cVar) {
                super(2, cVar);
                this.f47830b = list;
                this.f47831c = i10;
            }

            public static final void a(I i10) {
                i10.destroy();
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(bn.r rVar, hn.c<? super bn.r> cVar) {
                return ((a) create(rVar, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                return new a(this.f47830b, this.f47831c, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                in.a.g();
                if (this.f47829a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                Iterator<T> it = this.f47830b.iterator();
                while (it.hasNext()) {
                    g.a.a((kotlinx.coroutines.g) it.next(), null, 1, null);
                }
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateFullscreenAd", "Calling close()", null, false, 12, null);
                FullscreenWebviewActivity.f48849b.a();
                Handler handler = new Handler(Looper.getMainLooper());
                final I i10 = this.f47831c;
                handler.postDelayed(new Runnable() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        I.c.a.a(i10);
                    }
                }, 1000L);
                return bn.r.f5635a;
            }
        }

        @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.TemplateFullscreenAdImpl$show$1$eventHandlers$1", f = "TemplateFullscreenAd.kt", l = {99}, m = "invokeSuspend")
        public static final class b extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f47832a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f47833b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f47834c;

            public static final class a<T> implements e {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f47835b;

                public a(d dVar) {
                    this.f47835b = dVar;
                }

                @Override // go.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(bn.r rVar, hn.c<? super bn.r> cVar) {
                    this.f47835b.b();
                    return bn.r.f5635a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(I i10, d dVar, hn.c<? super b> cVar) {
                super(2, cVar);
                this.f47833b = i10;
                this.f47834c = dVar;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
                return ((b) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                return new b(this.f47833b, this.f47834c, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objG = in.a.g();
                int i10 = this.f47832a;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    k<bn.r> kVarC = this.f47833b.f47812j.c();
                    a aVar = new a(this.f47834c);
                    this.f47832a = 1;
                    if (kVarC.collect(aVar, this) == objG) {
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

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.I$c$c, reason: collision with other inner class name */
        @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.TemplateFullscreenAdImpl$show$1$eventHandlers$2", f = "TemplateFullscreenAd.kt", l = {104}, m = "invokeSuspend")
        public static final class C0592c extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f47836a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f47837b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f47838c;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.I$c$c$a */
            public static final class a<T> implements e {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f47839b;

                public a(d dVar) {
                    this.f47839b = dVar;
                }

                @Override // go.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(bn.r rVar, hn.c<? super bn.r> cVar) {
                    this.f47839b.a();
                    return bn.r.f5635a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0592c(I i10, d dVar, hn.c<? super C0592c> cVar) {
                super(2, cVar);
                this.f47837b = i10;
                this.f47838c = dVar;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
                return ((C0592c) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                return new C0592c(this.f47837b, this.f47838c, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objG = in.a.g();
                int i10 = this.f47836a;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    go.p<bn.r> pVarC = this.f47837b.f47814l.c();
                    a aVar = new a(this.f47838c);
                    this.f47836a = 1;
                    if (pVarC.collect(aVar, this) == objG) {
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

        @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.TemplateFullscreenAdImpl$show$1$eventHandlers$3", f = "TemplateFullscreenAd.kt", l = {113}, m = "invokeSuspend")
        public static final class d extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f47840a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f47841b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f47842c;

            public static final class a<T> implements e {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f47843b;

                public a(d dVar) {
                    this.f47843b = dVar;
                }

                @Override // go.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(bn.r rVar, hn.c<? super bn.r> cVar) {
                    this.f47843b.a();
                    return bn.r.f5635a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(I i10, d dVar, hn.c<? super d> cVar) {
                super(2, cVar);
                this.f47841b = i10;
                this.f47842c = dVar;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
                return ((d) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                return new d(this.f47841b, this.f47842c, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objG = in.a.g();
                int i10 = this.f47840a;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    go.p<bn.r> pVarC = this.f47841b.f47815m.c();
                    a aVar = new a(this.f47842c);
                    this.f47840a = 1;
                    if (pVarC.collect(aVar, this) == objG) {
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
        public c(d dVar, hn.c<? super c> cVar) {
            super(2, cVar);
            this.f47828d = dVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((c) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            c cVar2 = I.this.new c(this.f47828d, cVar);
            cVar2.f47826b = obj;
            return cVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f47825a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                p000do.l0 l0Var = (p000do.l0) this.f47826b;
                List listP = cn.w.p(p000do.i.d(l0Var, null, null, new b(I.this, this.f47828d, null), 3, null), p000do.i.d(l0Var, null, null, new C0592c(I.this, this.f47828d, null), 3, null), p000do.i.d(l0Var, null, null, new d(I.this, this.f47828d, null), 3, null));
                go.p<bn.r> pVarC = I.this.f47810h.c();
                a aVar = new a(listP, I.this, null);
                this.f47825a = 1;
                if (f.l(pVarC, aVar, this) == objG) {
                    return objG;
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

    public static final class d implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.a0 f47844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ I f47845b;

        public d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.a0 a0Var, I i10) {
            this.f47844a = a0Var;
            this.f47845b = i10;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
        public void a() {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateFullscreenAd", "Skip button shown, triggering listener callback", null, false, 12, null);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.a0 a0Var = this.f47844a;
            if (a0Var != null) {
                a0Var.a();
            }
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
            tn.p.k(cVar, "internalShowError");
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.a0 a0Var = this.f47844a;
            if (a0Var != null) {
                a0Var.a(cVar);
            }
            this.f47845b.destroy();
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
        public void b() {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.a0 a0Var = this.f47844a;
            if (a0Var != null) {
                a0Var.b();
            }
        }
    }

    public I(@NotNull Context context, @NotNull String str, @NotNull com.moloco.sdk.internal.services.f0 f0Var, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, @NotNull w0 w0Var, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l lVar, @NotNull com.moloco.sdk.acm.recorder.a aVar) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(str, "adm");
        tn.p.k(f0Var, "clickthroughService");
        tn.p.k(e0Var, "watermark");
        tn.p.k(w0Var, "externalLinkHandler");
        tn.p.k(lVar, "persistentHttpRequest");
        tn.p.k(aVar, "metricsRecorder");
        this.f47804b = context;
        this.f47805c = e0Var;
        this.f47806d = w0Var;
        this.f47807e = lVar;
        this.f47808f = aVar;
        p000do.l0 l0VarA = kotlinx.coroutines.d.a(com.moloco.sdk.internal.scheduling.c.a().getMain());
        this.f47809g = l0VarA;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.d dVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.d(l0VarA);
        this.f47810h = dVar;
        i iVar = new i(l0VarA);
        this.f47811i = iVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b(f0Var, l0VarA);
        this.f47812j = bVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h hVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h(l0VarA);
        this.f47813k = hVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.j jVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.j(l0VarA);
        this.f47814l = jVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.c cVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.c(l0VarA);
        this.f47815m = cVar;
        Set<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a> setJ = cn.w0.j(dVar, bVar, iVar, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.a(aVar), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.k(w0Var), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.f(lVar), hVar, jVar, cVar);
        this.f47816n = setJ;
        this.f47817o = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a(context, str, setJ, bVar, iVar, hVar, aVar);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i iVarC = n0.f48494a.c(str);
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "TemplateFullscreenAd", "Template ad resolved creativeType: " + iVarC, false, 4, null);
        this.f47818p = iVarC;
        Boolean bool = Boolean.FALSE;
        this.f47819q = go.v.a(bool);
        this.f47820r = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t
            @Override // sn.a
            public final Object invoke() {
                return I.s(this.f48580b);
            }
        });
        this.f47821s = go.v.a(bool);
    }

    public static final go.u s(I i10) {
        return f.M(f.A(i10.f47819q, i10.f47817o.l(), new b(null)), i10.f47809g, kotlinx.coroutines.flow.a.f73397a.c(), Boolean.FALSE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r
    public void destroy() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateFullscreenAd", "destroy called", null, false, 12, null);
        this.f47817o.destroy();
        FullscreenWebviewActivity.f48849b.a();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
    @NotNull
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i getCreativeType() {
        return this.f47818p;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void i(long j10, @Nullable k.a aVar) {
        this.f47817o.i(j10, aVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    @NotNull
    public go.u<Boolean> isLoaded() {
        return this.f47817o.isLoaded();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t
    @NotNull
    public go.u<Boolean> k() {
        return this.f47821s;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    @NotNull
    public go.u<Boolean> l() {
        return (go.u) this.f47820r.getValue();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void b(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z zVar, @Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.a0 a0Var) {
        tn.p.k(zVar, "options");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateFullscreenAd", "fullscreen ad show called", null, false, 12, null);
        d dVar = new d(a0Var, this);
        this.f47805c.a(this.f47817o.y());
        this.f47817o.o(dVar);
        FullscreenWebviewActivity.f48849b.b(this.f47804b, this.f47819q, this.f47817o, this.f47808f, this.f47821s);
        p000do.i.d(this.f47809g, null, null, new c(dVar, null), 3, null);
    }
}
