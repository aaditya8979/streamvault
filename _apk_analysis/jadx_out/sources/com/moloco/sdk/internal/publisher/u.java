package com.moloco.sdk.internal.publisher;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.A;
import com.moloco.sdk.internal.ortb.model.C4379c;
import com.moloco.sdk.internal.ortb.model.C4381e;
import com.moloco.sdk.internal.publisher.u;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.FullscreenAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.service_locator.b;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Locale;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
public final class u<T extends AdShowListener> implements FullscreenAd<T>, p0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public static final a f46971v = new a(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f46972w = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f46973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.services.r f46974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f46975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f46976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l f46977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0 f46978g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final sn.l<com.moloco.sdk.internal.ortb.model.y, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p> f46979h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final q0<T> f46980i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final AdFormatType f46981j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 f46982k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final a0 f46983l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.recorder.a f46984m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final p000do.l0 f46985n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.e f46986o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public com.moloco.sdk.acm.e f46987p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final AdLoad f46988q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p f46989r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public C4379c f46990s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public sn.l<? super Boolean, bn.r> f46991t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public sn.a<bn.r> f46992u;

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
            super(1, obj, u.class, "recreateXenossAd", "recreateXenossAd(Lcom/moloco/sdk/internal/ortb/model/Bid;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/AdLoad;", 0);
        }

        @Override // sn.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k invoke(C4381e c4381e) {
            tn.p.k(c4381e, "p0");
            return ((u) this.receiver).e(c4381e);
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.publisher.FullscreenAdImpl$listenToAdDisplayState$1$1", f = "FullscreenAdImpl.kt", l = {269, 271}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j f46994b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x0 f46995c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ u<T> f46996d;

        @jn.d(c = "com.moloco.sdk.internal.publisher.FullscreenAdImpl$listenToAdDisplayState$1$1$1", f = "FullscreenAdImpl.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements sn.p<Boolean, hn.c<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f46997a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ boolean f46998b;

            public a(hn.c<? super a> cVar) {
                super(2, cVar);
            }

            public final Object a(boolean z10, hn.c<? super Boolean> cVar) {
                return ((a) create(Boolean.valueOf(z10), cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                a aVar = new a(cVar);
                aVar.f46998b = ((Boolean) obj).booleanValue();
                return aVar;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo2invoke(Boolean bool, hn.c<? super Boolean> cVar) {
                return a(bool.booleanValue(), cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                in.a.g();
                if (this.f46997a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                return jn.a.a(this.f46998b);
            }
        }

        @jn.d(c = "com.moloco.sdk.internal.publisher.FullscreenAdImpl$listenToAdDisplayState$1$1$2", f = "FullscreenAdImpl.kt", l = {}, m = "invokeSuspend")
        public static final class b extends SuspendLambda implements sn.p<Boolean, hn.c<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f46999a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ boolean f47000b;

            public b(hn.c<? super b> cVar) {
                super(2, cVar);
            }

            public final Object a(boolean z10, hn.c<? super Boolean> cVar) {
                return ((b) create(Boolean.valueOf(z10), cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                b bVar = new b(cVar);
                bVar.f47000b = ((Boolean) obj).booleanValue();
                return bVar;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo2invoke(Boolean bool, hn.c<? super Boolean> cVar) {
                return a(bool.booleanValue(), cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                in.a.g();
                if (this.f46999a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                return jn.a.a(!this.f47000b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j jVar, x0 x0Var, u<? super T> uVar, hn.c<? super d> cVar) {
            super(2, cVar);
            this.f46994b = jVar;
            this.f46995c = x0Var;
            this.f46996d = uVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((d) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return new d(this.f46994b, this.f46995c, this.f46996d, cVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = in.a.g()
                int r1 = r6.f46993a
                r2 = 6
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L20
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L14
                kotlin.c.b(r7)
                goto L5c
            L14:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1c:
                kotlin.c.b(r7)
                goto L37
            L20:
                kotlin.c.b(r7)
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j r7 = r6.f46994b
                go.u r7 = r7.l()
                com.moloco.sdk.internal.publisher.u$d$a r1 = new com.moloco.sdk.internal.publisher.u$d$a
                r1.<init>(r5)
                r6.f46993a = r4
                java.lang.Object r7 = go.f.w(r7, r1, r6)
                if (r7 != r0) goto L37
                return r0
            L37:
                com.moloco.sdk.internal.publisher.x0 r7 = r6.f46995c
                if (r7 == 0) goto L48
                com.moloco.sdk.internal.publisher.u<T extends com.moloco.sdk.publisher.AdShowListener> r1 = r6.f46996d
                java.lang.String r1 = com.moloco.sdk.internal.publisher.u.u(r1)
                com.moloco.sdk.publisher.MolocoAd r1 = com.moloco.sdk.publisher.MolocoAdKt.createAdInfo$default(r1, r5, r5, r2, r5)
                r7.onAdShowSuccess(r1)
            L48:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j r7 = r6.f46994b
                go.u r7 = r7.l()
                com.moloco.sdk.internal.publisher.u$d$b r1 = new com.moloco.sdk.internal.publisher.u$d$b
                r1.<init>(r5)
                r6.f46993a = r3
                java.lang.Object r7 = go.f.w(r7, r1, r6)
                if (r7 != r0) goto L5c
                return r0
            L5c:
                com.moloco.sdk.internal.publisher.x0 r7 = r6.f46995c
                if (r7 == 0) goto L6d
                com.moloco.sdk.internal.publisher.u<T extends com.moloco.sdk.publisher.AdShowListener> r0 = r6.f46996d
                java.lang.String r0 = com.moloco.sdk.internal.publisher.u.u(r0)
                com.moloco.sdk.publisher.MolocoAd r0 = com.moloco.sdk.publisher.MolocoAdKt.createAdInfo$default(r0, r5, r5, r2, r5)
                r7.onAdHidden(r0)
            L6d:
                bn.r r7 = bn.r.f5635a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.u.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.publisher.FullscreenAdImpl$load$1", f = "FullscreenAdImpl.kt", l = {}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47001a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ u<T> f47002b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f47003c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AdLoad.Listener f47004d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(u<? super T> uVar, String str, AdLoad.Listener listener, hn.c<? super e> cVar) {
            super(2, cVar);
            this.f47002b = uVar;
            this.f47003c = str;
            this.f47004d = listener;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((e) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return new e(this.f47002b, this.f47003c, this.f47004d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f47001a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            this.f47002b.f46988q.load(this.f47003c, this.f47004d);
            return bn.r.f5635a;
        }
    }

    public static final class f implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u<T> f47005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x0 f47006b;

        /* JADX WARN: Multi-variable type inference failed */
        public f(u<? super T> uVar, x0 x0Var) {
            this.f47005a = uVar;
            this.f47006b = x0Var;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
        public void a() {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "FullscreenAdImpl", "Ad skip button shown, triggering callback", null, false, 12, null);
            sn.a<bn.r> aVarS = this.f47005a.s();
            if (aVarS != null) {
                aVarS.invoke();
            }
            x0 x0Var = this.f47006b;
            if (x0Var != null) {
                x0Var.a();
            }
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
            tn.p.k(cVar, "internalShowError");
            u<T> uVar = this.f47005a;
            uVar.j(com.moloco.sdk.internal.d0.a(uVar.f46976e, MolocoAdError.ErrorType.AD_SHOW_ERROR, cVar));
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0
        public void a(boolean z10) {
            String strC;
            C4379c c4379c = this.f47005a.f46990s;
            if (c4379c != null) {
                u<T> uVar = this.f47005a;
                if (c4379c.b() && ((!z10 || c4379c.d()) && (strC = c4379c.c()) != null)) {
                    uVar.f46977f.a(strC);
                }
            }
            sn.l<Boolean, bn.r> lVarW = this.f47005a.w();
            if (lVarW != null) {
                lVarW.invoke(Boolean.valueOf(z10));
            }
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
        public void b() {
            x0 x0Var = this.f47006b;
            if (x0Var != null) {
                x0Var.onAdClicked(MolocoAdKt.createAdInfo$default(this.f47005a.f46976e, null, null, 6, null));
            }
        }
    }

    public static final class g implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u<T> f47007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x0 f47008b;

        /* JADX WARN: Multi-variable type inference failed */
        public g(u<? super T> uVar, x0 x0Var) {
            this.f47007a = uVar;
            this.f47008b = x0Var;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
        public void a() {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "FullscreenAdImpl", "Template ad skip button shown, triggering reward callback", null, false, 12, null);
            sn.a<bn.r> aVarS = this.f47007a.s();
            if (aVarS != null) {
                aVarS.invoke();
            }
            x0 x0Var = this.f47008b;
            if (x0Var != null) {
                x0Var.a();
            }
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
            tn.p.k(cVar, "internalShowError");
            u<T> uVar = this.f47007a;
            uVar.j(com.moloco.sdk.internal.d0.a(uVar.f46976e, MolocoAdError.ErrorType.AD_SHOW_ERROR, cVar));
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
        public void b() {
            x0 x0Var = this.f47008b;
            if (x0Var != null) {
                x0Var.onAdClicked(MolocoAdKt.createAdInfo$default(this.f47007a.f46976e, null, null, 6, null));
            }
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.publisher.FullscreenAdImpl$show$2", f = "FullscreenAdImpl.kt", l = {}, m = "invokeSuspend")
    public static final class h extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ T f47010b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ u<T> f47011c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(T t10, u<? super T> uVar, hn.c<? super h> cVar) {
            super(2, cVar);
            this.f47010b = t10;
            this.f47011c = uVar;
        }

        public static final A a(u uVar) {
            return uVar.t();
        }

        public static final h0 b(u uVar) {
            return uVar.a();
        }

        public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i c(u uVar) {
            return uVar.q();
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((h) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return new h(this.f47010b, this.f47011c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f47009a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j jVar = null;
            if (this.f47010b != null) {
                q0 q0Var = this.f47011c.f46980i;
                T t10 = this.f47010b;
                com.moloco.sdk.internal.services.r rVar = this.f47011c.f46974c;
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar = this.f47011c.f46975d;
                final u<T> uVar = this.f47011c;
                sn.a aVar2 = new sn.a() { // from class: com.moloco.sdk.internal.publisher.r0
                    @Override // sn.a
                    public final Object invoke() {
                        return u.h.a(uVar);
                    }
                };
                final u<T> uVar2 = this.f47011c;
                sn.a aVar3 = new sn.a() { // from class: com.moloco.sdk.internal.publisher.s0
                    @Override // sn.a
                    public final Object invoke() {
                        return u.h.b(uVar2);
                    }
                };
                AdFormatType adFormatType = this.f47011c.f46981j;
                com.moloco.sdk.acm.recorder.a aVar4 = this.f47011c.f46984m;
                final u<T> uVar3 = this.f47011c;
                q0Var.d(new com.moloco.sdk.internal.publisher.e(t10, rVar, aVar, aVar2, aVar3, adFormatType, aVar4, new sn.a() { // from class: com.moloco.sdk.internal.publisher.t0
                    @Override // sn.a
                    public final Object invoke() {
                        return u.h.c(uVar3);
                    }
                }));
            } else {
                this.f47011c.f46980i.d(null);
            }
            x0 x0VarI = this.f47011c.f46980i.i();
            if (this.f47011c.f46980i.a() instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b0) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s<?, ?> sVarA = this.f47011c.f46980i.a();
                if (sVarA instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b0) {
                    jVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b0) sVarA;
                }
            } else {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s<?, ?> sVarA2 = this.f47011c.f46980i.a();
                if (sVarA2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v) {
                    jVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v) sVarA2;
                }
            }
            if (jVar == null || !this.f47011c.isLoaded()) {
                if (x0VarI != null) {
                    x0VarI.a(com.moloco.sdk.internal.d0.a(this.f47011c.f46976e, MolocoAdError.ErrorType.AD_SHOW_ERROR_NOT_LOADED, com.moloco.sdk.internal.o.f46251d));
                }
                return bn.r.f5635a;
            }
            if (jVar.l().getValue().booleanValue()) {
                if (x0VarI != null) {
                    x0VarI.a(com.moloco.sdk.internal.d0.a(this.f47011c.f46976e, MolocoAdError.ErrorType.AD_SHOW_ERROR_ALREADY_DISPLAYING, com.moloco.sdk.internal.o.f46252e));
                }
                return bn.r.f5635a;
            }
            this.f47011c.k(jVar, x0VarI);
            if (jVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b0) {
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b0) jVar).b(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z(), this.f47011c.o(x0VarI));
            } else if (jVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v) {
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v) jVar).b(this.f47011c.f46989r, this.f47011c.d(x0VarI));
            }
            return bn.r.f5635a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u(@NotNull Context context, @NotNull com.moloco.sdk.internal.services.r rVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, @NotNull String str, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l lVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0 w0Var, @NotNull sn.l<? super com.moloco.sdk.internal.ortb.model.y, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p> lVar2, @NotNull q0<T> q0Var, @NotNull AdFormatType adFormatType, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, @NotNull a0 a0Var, @NotNull com.moloco.sdk.acm.recorder.a aVar2) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(rVar, "appLifecycleTrackerService");
        tn.p.k(aVar, "customUserEventBuilderService");
        tn.p.k(str, "adUnitId");
        tn.p.k(lVar, "persistentHttpRequest");
        tn.p.k(w0Var, "externalLinkHandler");
        tn.p.k(lVar2, "generateAggregatedOptions");
        tn.p.k(q0Var, "adDataHolder");
        tn.p.k(adFormatType, "adFormatType");
        tn.p.k(e0Var, "watermark");
        tn.p.k(a0Var, "adCreateLoadTimeoutManager");
        tn.p.k(aVar2, "metricsRecorder");
        this.f46973b = context;
        this.f46974c = rVar;
        this.f46975d = aVar;
        this.f46976e = str;
        this.f46977f = lVar;
        this.f46978g = w0Var;
        this.f46979h = lVar2;
        this.f46980i = q0Var;
        this.f46981j = adFormatType;
        this.f46982k = e0Var;
        this.f46983l = a0Var;
        this.f46984m = aVar2;
        p000do.l0 l0VarA = kotlinx.coroutines.d.a(com.moloco.sdk.internal.scheduling.c.a().getMain());
        this.f46985n = l0VarA;
        com.moloco.sdk.acm.e eVarC = aVar2.c(com.moloco.sdk.internal.client_metrics_data.e.f45994q.c());
        String strC = com.moloco.sdk.internal.client_metrics_data.d.f45970c.c();
        String lowerCase = adFormatType.name().toLowerCase(Locale.ROOT);
        tn.p.j(lowerCase, "toLowerCase(...)");
        this.f46986o = eVarC.f(strC, lowerCase);
        this.f46988q = c0.a(l0VarA, new b(a0Var), str, new c(this), adFormatType, b.a.f47629a.b(), aVar2);
        this.f46989r = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p) lVar2.invoke(null);
    }

    public static /* synthetic */ void h(u uVar, com.moloco.sdk.internal.c0 c0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c0Var = null;
        }
        uVar.j(c0Var);
    }

    @Nullable
    public final h0 a() {
        return this.f46980i.h();
    }

    public final f d(x0 x0Var) {
        return new f(this, x0Var);
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public void destroy() {
        kotlinx.coroutines.d.e(this.f46985n, null, 1, null);
        h(this, null, 1, null);
        this.f46991t = null;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k e(C4381e c4381e) {
        com.moloco.sdk.internal.ortb.model.y yVarE;
        h(this, null, 1, null);
        com.moloco.sdk.internal.ortb.model.w wVarA = c4381e.f().a();
        if (wVarA != null ? tn.p.f(wVarA.a(), Boolean.TRUE) : false) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.a0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z> sVarC = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u.c(this.f46973b, c4381e.a(), new com.moloco.sdk.internal.services.t(this.f46978g, this.f46975d), this.f46982k, this.f46984m);
            q0<T> q0Var = this.f46980i;
            q0Var.e(sVarC);
            com.moloco.sdk.internal.ortb.model.f fVarF = c4381e.f();
            q0Var.b(fVarF != null ? fVarF.f() : null);
            q0Var.c(c4381e.d() != null ? new h0(c4381e.d(), Float.valueOf(c4381e.g())) : null);
            return sVarC;
        }
        sn.l<com.moloco.sdk.internal.ortb.model.y, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p> lVar = this.f46979h;
        com.moloco.sdk.internal.ortb.model.f fVarF2 = c4381e.f();
        this.f46989r = lVar.invoke(fVarF2 != null ? fVarF2.e() : null);
        com.moloco.sdk.internal.ortb.model.f fVarF3 = c4381e.f();
        this.f46990s = (fVarF3 == null || (yVarE = fVarF3.e()) == null) ? null : yVarE.d();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s<?, ?> sVarB = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u.b(this.f46973b, this.f46975d, null, c4381e, this.f46978g, this.f46982k, this.f46984m, 4, null);
        q0<T> q0Var2 = this.f46980i;
        q0Var2.e(sVarB);
        com.moloco.sdk.internal.ortb.model.f fVarF4 = c4381e.f();
        q0Var2.b(fVarF4 != null ? fVarF4.f() : null);
        q0Var2.c(c4381e.d() != null ? new h0(c4381e.d(), Float.valueOf(c4381e.g())) : null);
        return sVarB;
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public boolean isLoaded() {
        return this.f46988q.isLoaded();
    }

    public final void j(com.moloco.sdk.internal.c0 c0Var) {
        go.u<Boolean> uVarL;
        q0<T> q0Var = this.f46980i;
        kotlinx.coroutines.g gVarG = q0Var.g();
        if (gVarG != null) {
            g.a.a(gVarG, null, 1, null);
        }
        q0Var.f(null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s<?, ?> sVarA = this.f46980i.a();
        boolean z10 = (sVarA == null || (uVarL = sVarA.l()) == null || !uVarL.getValue().booleanValue()) ? false : true;
        q0<T> q0Var2 = this.f46980i;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s<?, ?> sVarA2 = q0Var2.a();
        if (sVarA2 != null) {
            sVarA2.destroy();
        }
        q0Var2.e(null);
        q0<T> q0Var3 = this.f46980i;
        x0 x0VarI = q0Var3.i();
        q0Var3.d(null);
        if (c0Var != null && x0VarI != null) {
            x0VarI.a(c0Var);
        }
        if (z10 && x0VarI != null) {
            x0VarI.onAdHidden(MolocoAdKt.createAdInfo$default(this.f46976e, null, null, 6, null));
        }
        this.f46980i.b(null);
        this.f46980i.c(null);
    }

    public final void k(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j jVar, x0 x0Var) {
        q0<T> q0Var = this.f46980i;
        kotlinx.coroutines.g gVarG = q0Var.g();
        if (gVarG != null) {
            g.a.a(gVarG, null, 1, null);
        }
        q0Var.f(p000do.i.d(this.f46985n, null, null, new d(jVar, x0Var, this, null), 3, null));
    }

    public final void l(@Nullable sn.a<bn.r> aVar) {
        this.f46992u = aVar;
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public void load(@NotNull String str, @Nullable AdLoad.Listener listener) {
        tn.p.k(str, "bidResponseJson");
        this.f46984m.a(this.f46986o);
        this.f46987p = this.f46984m.c(com.moloco.sdk.internal.client_metrics_data.e.f45993p.c());
        p000do.i.d(this.f46985n, null, null, new e(this, str, listener, null), 3, null);
    }

    public final void m(@Nullable sn.l<? super Boolean, bn.r> lVar) {
        this.f46991t = lVar;
    }

    public final g o(x0 x0Var) {
        return new g(this, x0Var);
    }

    @Nullable
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i q() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s<?, ?> sVarA = this.f46980i.a();
        if (sVarA != null) {
            return sVarA.getCreativeType();
        }
        return null;
    }

    @Nullable
    public final sn.a<bn.r> s() {
        return this.f46992u;
    }

    @Override // com.moloco.sdk.internal.publisher.p0
    public void setCreateAdObjectStartTime(long j10) {
        this.f46983l.setCreateAdObjectStartTime(j10);
    }

    @Override // com.moloco.sdk.publisher.FullscreenAd
    public void show(@Nullable T t10) {
        com.moloco.sdk.acm.e eVar = this.f46987p;
        if (eVar != null) {
            com.moloco.sdk.acm.recorder.a aVar = this.f46984m;
            String strC = com.moloco.sdk.internal.client_metrics_data.d.f45970c.c();
            String lowerCase = this.f46981j.name().toLowerCase(Locale.ROOT);
            tn.p.j(lowerCase, "toLowerCase(...)");
            aVar.a(eVar.f(strC, lowerCase));
        }
        com.moloco.sdk.acm.recorder.a aVar2 = this.f46984m;
        com.moloco.sdk.acm.b bVar = new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.A.c());
        String strC2 = com.moloco.sdk.internal.client_metrics_data.d.f45970c.c();
        String lowerCase2 = this.f46981j.name().toLowerCase(Locale.ROOT);
        tn.p.j(lowerCase2, "toLowerCase(...)");
        aVar2.b(bVar.e(strC2, lowerCase2));
        p000do.i.d(this.f46985n, null, null, new h(t10, this, null), 3, null);
    }

    @Nullable
    public final A t() {
        return this.f46980i.j();
    }

    @Nullable
    public final sn.l<Boolean, bn.r> w() {
        return this.f46991t;
    }

    @Nullable
    public final Boolean y() {
        go.u<Boolean> uVarK;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s<?, ?> sVarA = this.f46980i.a();
        if (sVarA == null || (uVarK = sVarA.k()) == null) {
            return null;
        }
        return uVarK.getValue();
    }
}
