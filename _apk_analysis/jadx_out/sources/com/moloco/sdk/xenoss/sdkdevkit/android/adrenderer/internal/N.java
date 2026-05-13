package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.g0;
import com.moloco.sdk.internal.ortb.model.C4381e;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.N;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import jn.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@VisibleForTesting
public final class N implements s<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.d0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f47896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C4381e f47897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 f47898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.recorder.a f47899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final i f47900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final p000do.l0 f47901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final K f47902h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final go.l<Boolean> f47903i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final go.u<Boolean> f47904j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final go.l<Boolean> f47905k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final go.u<Boolean> f47906l;

    @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastFullscreenAdImpl$show$1", f = "VastFullscreenAd.kt", l = {95}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47907a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 f47909c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.d0 f47910d;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.N$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0597a extends FunctionReferenceImpl implements sn.a<bn.r> {
            public C0597a(Object obj) {
                super(0, obj, N.class, "onClose", "onClose()V", 0);
            }

            public final void a() {
                ((N) this.receiver).x();
            }

            @Override // sn.a
            public /* bridge */ /* synthetic */ bn.r invoke() {
                a();
                return bn.r.f5635a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 c0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.d0 d0Var, hn.c<? super a> cVar) {
            super(2, cVar);
            this.f47909c = c0Var;
            this.f47910d = d0Var;
        }

        public static final bn.r a(N n10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 c0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar) {
            n10.l(bVar, c0Var);
            return bn.r.f5635a;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return N.this.new a(this.f47909c, this.f47910d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f47907a;
            try {
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    com.moloco.sdk.internal.g0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c> g0VarC = N.this.f47902h.c();
                    if (g0VarC instanceof g0.a) {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((g0.a) g0VarC).a();
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 c0Var = this.f47909c;
                        if (c0Var != null) {
                            c0Var.a(cVar);
                        }
                        return bn.r.f5635a;
                    }
                    if (!(g0VarC instanceof g0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) ((g0.b) g0VarC).a();
                    if (!aVar.g().e().exists()) {
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, "VastFullscreenAdImpl", "VAST ad media file does not exist", null, false, 12, null);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 c0Var2 = this.f47909c;
                        if (c0Var2 != null) {
                            c0Var2.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l.f48123d);
                        }
                        return bn.r.f5635a;
                    }
                    VastActivity.a aVar2 = VastActivity.f49298d;
                    Context context = N.this.f47896b;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.d0 d0Var = this.f47910d;
                    C0597a c0597a = new C0597a(N.this);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var = N.this.f47898d;
                    String strC = N.this.f47897c.c();
                    com.moloco.sdk.acm.recorder.a aVar3 = N.this.f47899e;
                    final N n10 = N.this;
                    final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 c0Var3 = this.f47909c;
                    sn.l<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, bn.r> lVar = new sn.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a0
                        @Override // sn.l
                        public final Object invoke(Object obj2) {
                            return N.a.a(n10, c0Var3, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) obj2);
                        }
                    };
                    this.f47907a = 1;
                    if (aVar2.a(aVar, context, d0Var, c0597a, e0Var, strC, aVar3, lVar, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                }
                N.this.f47903i.setValue(jn.a.a(false));
                return bn.r.f5635a;
            } catch (Throwable th2) {
                N.this.f47903i.setValue(jn.a.a(false));
                throw th2;
            }
        }
    }

    public N(@NotNull Context context, @NotNull C4381e c4381e, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.h hVar, @NotNull s0 s0Var, boolean z10, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, @NotNull com.moloco.sdk.acm.recorder.a aVar) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(c4381e, "bid");
        tn.p.k(hVar, "loadVast");
        tn.p.k(s0Var, "decLoader");
        tn.p.k(e0Var, "watermark");
        tn.p.k(aVar, "metricsRecorder");
        this.f47896b = context;
        this.f47897c = c4381e;
        this.f47898d = e0Var;
        this.f47899e = aVar;
        this.f47900f = i.f47726a;
        p000do.l0 l0VarA = kotlinx.coroutines.d.a(com.moloco.sdk.internal.scheduling.c.a().getMain());
        this.f47901g = l0VarA;
        this.f47902h = new K(c4381e, l0VarA, hVar, s0Var, z10);
        Boolean bool = Boolean.FALSE;
        go.l<Boolean> lVarA = go.v.a(bool);
        this.f47903i = lVarA;
        this.f47904j = lVarA;
        go.l<Boolean> lVarA2 = go.v.a(bool);
        this.f47905k = lVarA2;
        this.f47906l = lVarA2;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r
    public void destroy() {
        kotlinx.coroutines.d.e(this.f47901g, null, 1, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
    @NotNull
    public i getCreativeType() {
        return this.f47900f;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void i(long j10, @Nullable k.a aVar) {
        this.f47902h.i(j10, aVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    @NotNull
    public go.u<Boolean> isLoaded() {
        return this.f47902h.isLoaded();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t
    @NotNull
    public go.u<Boolean> k() {
        return this.f47906l;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    @NotNull
    public go.u<Boolean> l() {
        return this.f47904j;
    }

    @VisibleForTesting
    public final void l(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar, @Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 c0Var) {
        tn.p.k(bVar, "event");
        if (tn.p.f(bVar, b.g.f49996a)) {
            y();
            return;
        }
        if (tn.p.f(bVar, b.C0658b.f49991a)) {
            y();
            return;
        }
        if (tn.p.f(bVar, b.d.f49993a)) {
            y();
            return;
        }
        if (tn.p.f(bVar, b.i.f49998a)) {
            if (c0Var != null) {
                c0Var.a(true);
                return;
            }
            return;
        }
        if (tn.p.f(bVar, b.j.f49999a)) {
            if (c0Var != null) {
                c0Var.a();
                return;
            }
            return;
        }
        if (tn.p.f(bVar, b.c.f49992a)) {
            if (c0Var != null) {
                c0Var.a(false);
            }
        } else if (tn.p.f(bVar, b.a.f49990a)) {
            if (c0Var != null) {
                c0Var.b();
            }
        } else if (bVar instanceof b.f) {
            if (c0Var != null) {
                c0Var.a(((b.f) bVar).a());
            }
        } else if (!tn.p.f(bVar, b.h.f49997a) && !tn.p.f(bVar, b.e.f49994a)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void b(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.d0 d0Var, @Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 c0Var) {
        tn.p.k(d0Var, "options");
        p000do.i.d(this.f47901g, null, null, new a(c0Var, d0Var, null), 3, null);
    }

    public final void x() {
        this.f47905k.setValue(Boolean.TRUE);
        this.f47903i.setValue(Boolean.FALSE);
    }

    public final void y() {
        this.f47903i.setValue(Boolean.TRUE);
    }
}
