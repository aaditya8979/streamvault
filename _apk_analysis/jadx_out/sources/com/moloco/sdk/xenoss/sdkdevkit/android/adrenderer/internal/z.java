package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.internal.g0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements s<m, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f50905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 f50906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final x f50907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final e f50908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b0 f50909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MraidActivity.a f50910g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final String f50911h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.recorder.a f50912i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final i f50913j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final p000do.l0 f50914k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public k.a f50915l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public m f50916m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f50917n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final go.l<Boolean> f50918o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final go.u<Boolean> f50919p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final go.l<Boolean> f50920q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final go.u<Boolean> f50921r;

    public /* synthetic */ class a extends FunctionReferenceImpl implements sn.l<d, bn.r> {
        public a(Object obj) {
            super(1, obj, z.class, "onError", "onError(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/MraidAdError;)V", 0);
        }

        public final void a(d dVar) {
            tn.p.k(dVar, "p0");
            ((z) this.receiver).o(dVar);
        }

        @Override // sn.l
        public /* bridge */ /* synthetic */ bn.r invoke(d dVar) {
            a(dVar);
            return bn.r.f5635a;
        }
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements sn.a<bn.r> {
        public b(Object obj) {
            super(0, obj, z.class, "destroy", "destroy()V", 0);
        }

        public final void a() {
            ((z) this.receiver).destroy();
        }

        @Override // sn.a
        public /* bridge */ /* synthetic */ bn.r invoke() {
            a();
            return bn.r.f5635a;
        }
    }

    public /* synthetic */ class c extends FunctionReferenceImpl implements sn.a<bn.r> {
        public c(Object obj) {
            super(0, obj, z.class, "onForciblyClosed", "onForciblyClosed()V", 0);
        }

        public final void a() {
            ((z) this.receiver).x();
        }

        @Override // sn.a
        public /* bridge */ /* synthetic */ bn.r invoke() {
            a();
            return bn.r.f5635a;
        }
    }

    public z(@NotNull Context context, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, @NotNull x xVar, @NotNull e eVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b0 b0Var, @NotNull MraidActivity.a aVar, @Nullable String str, @NotNull com.moloco.sdk.acm.recorder.a aVar2) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(e0Var, "watermark");
        tn.p.k(xVar, "mraidAdLoader");
        tn.p.k(eVar, "mraidBaseAd");
        tn.p.k(b0Var, "mraidFullscreenController");
        tn.p.k(aVar, "mraidActivity");
        tn.p.k(aVar2, "metricsRecorder");
        this.f50905b = context;
        this.f50906c = e0Var;
        this.f50907d = xVar;
        this.f50908e = eVar;
        this.f50909f = b0Var;
        this.f50910g = aVar;
        this.f50911h = str;
        this.f50912i = aVar2;
        this.f50913j = i.f47727b;
        this.f50914k = kotlinx.coroutines.d.a(com.moloco.sdk.internal.scheduling.c.a().getMain());
        Boolean bool = Boolean.FALSE;
        go.l<Boolean> lVarA = go.v.a(bool);
        this.f50918o = lVarA;
        this.f50919p = lVarA;
        go.l<Boolean> lVarA2 = go.v.a(bool);
        this.f50920q = lVarA2;
        this.f50921r = lVarA2;
    }

    public static final bn.r j(z zVar, String str) {
        tn.p.k(str, "url");
        zVar.f50909f.c(str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.i.a());
        return bn.r.f5635a;
    }

    public static final bn.r s(m mVar) {
        if (mVar != null) {
            mVar.b();
        }
        return bn.r.f5635a;
    }

    public static final bn.r t(m mVar) {
        if (mVar != null) {
            mVar.a();
        }
        return bn.r.f5635a;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r
    public void destroy() {
        kotlinx.coroutines.d.e(this.f50914k, null, 1, null);
        this.f50908e.destroy();
        this.f50918o.setValue(Boolean.FALSE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
    @NotNull
    public i getCreativeType() {
        return this.f50913j;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void i(long j10, @Nullable k.a aVar) {
        this.f50915l = aVar;
        this.f50908e.h0(new a(this));
        this.f50907d.i(j10, aVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    @NotNull
    public go.u<Boolean> isLoaded() {
        return this.f50907d.isLoaded();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t
    @NotNull
    public go.u<Boolean> k() {
        return this.f50921r;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    @NotNull
    public go.u<Boolean> l() {
        return this.f50919p;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void b(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n nVar, @Nullable final m mVar) {
        tn.p.k(nVar, "options");
        this.f50908e.b0(new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c1
            @Override // sn.a
            public final Object invoke() {
                return z.s(mVar);
            }
        });
        this.f50908e.c0(new sn.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.d1
            @Override // sn.l
            public final Object invoke(Object obj) {
                return z.j(this.f48033b, (String) obj);
            }
        });
        this.f50916m = mVar;
        this.f50917n = true;
        com.moloco.sdk.internal.g0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n, d> g0VarC = this.f50907d.c();
        if (g0VarC instanceof g0.a) {
            d dVar = (d) ((g0.a) g0VarC).a();
            if (mVar != null) {
                mVar.a(dVar);
                return;
            }
            return;
        }
        if (!(g0VarC instanceof g0.b)) {
            throw new NoWhenBranchMatchedException();
        }
        if (this.f50910g.c((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n) ((g0.b) g0VarC).a(), this.f50909f, this.f50905b, nVar, this.f50906c, new b(this), new c(this), this.f50908e.H(), new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e1
            @Override // sn.a
            public final Object invoke() {
                return z.t(mVar);
            }
        }, this.f50911h, this.f50912i)) {
            this.f50918o.setValue(Boolean.TRUE);
        } else if (mVar != null) {
            mVar.a(d.f48060j);
        }
    }

    public final void o(d dVar) {
        if (this.f50917n) {
            m mVar = this.f50916m;
            if (mVar != null) {
                mVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.e.b(dVar));
                return;
            }
            return;
        }
        k.a aVar = this.f50915l;
        if (aVar != null) {
            aVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.e.b(dVar));
        }
    }

    public final void x() {
        this.f50920q.setValue(Boolean.TRUE);
    }
}
