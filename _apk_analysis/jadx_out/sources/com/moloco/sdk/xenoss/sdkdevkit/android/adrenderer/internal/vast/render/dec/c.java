package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import bn.r;
import cn.w;
import com.ironsource.C3978d4;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.o0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.t;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import go.k;
import go.u;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;
import tn.i;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
public final class c implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final o0 f50491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final w0 f50492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final o f50493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final l0 f50494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final g f50495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final d f50496g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final k<b> f50497h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final go.d<b> f50498i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f50499j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final String f50500k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final v0 f50501l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final q f50502m;

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.DECControllerImpl$onEvent$1", f = "DECControllerImpl.kt", l = {60}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50503a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f50505c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, hn.c<? super a> cVar) {
            super(2, cVar);
            this.f50505c = bVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return c.this.new a(this.f50505c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f50503a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                k kVar = c.this.f50497h;
                b bVar = this.f50505c;
                this.f50503a = 1;
                if (kVar.emit(bVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f5635a;
        }
    }

    public c(o0 o0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e eVar, int i10, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, w0 w0Var, o oVar) {
        tn.p.k(o0Var, ImpressionLog.L);
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(aVar, "customUserEventBuilderService");
        tn.p.k(w0Var, "externalLinkHandler");
        tn.p.k(oVar, "linkHandler");
        this.f50491b = o0Var;
        this.f50492c = w0Var;
        this.f50493d = oVar;
        l0 l0VarA = kotlinx.coroutines.d.a(com.moloco.sdk.internal.scheduling.c.a().getMain());
        this.f50494e = l0VarA;
        this.f50495f = h.a(i10, l0VarA);
        this.f50496g = new d(aVar, w.q(o0Var.e()), w.q(o0Var.j()), w.q(o0Var.k()), null, null, 48, null);
        k<b> kVarB = go.q.b(0, 0, null, 7, null);
        this.f50497h = kVarB;
        this.f50498i = kVarB;
        this.f50499j = o0Var.f() != null;
        this.f50500k = o0Var.c();
        this.f50501l = new v0(o0Var.d(), o0Var.h(), o0Var.g(), o0Var.i());
        this.f50502m = t.a(eVar != null ? eVar.f() : null, eVar != null ? Integer.valueOf(eVar.h()) : null, eVar != null ? Integer.valueOf(eVar.d()) : null, eVar != null ? eVar.a() : null, l0VarA, context, aVar, w0Var, null, null);
    }

    public /* synthetic */ c(o0 o0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e eVar, int i10, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, w0 w0Var, o oVar, i iVar) {
        this(o0Var, eVar, i10, context, aVar, w0Var, oVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public boolean J() {
        return this.f50499j;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e
    @NotNull
    public v0 M() {
        return this.f50501l;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q
    @NotNull
    public u<j> O() {
        return this.f50502m.O();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a
    @NotNull
    public go.d<b> a() {
        return this.f50498i;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e
    public void b() {
        this.f50496g.a();
        r(b.f50487a);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r
    public void destroy() {
        kotlinx.coroutines.d.e(this.f50494e, null, 1, null);
        this.f50502m.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e
    @Nullable
    public String g() {
        return this.f50500k;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q
    public void i() {
        this.f50502m.i();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public void j(@NotNull a.AbstractC0696a.f fVar) {
        tn.p.k(fVar, C3978d4.i.L);
        String strF = this.f50491b.f();
        if (strF != null) {
            this.f50496g.d(fVar);
            this.f50493d.a(strF);
            r(b.f50488b);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d
    @NotNull
    public u<d.a> l() {
        return this.f50495f.l();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r
    public void l(@NotNull a.AbstractC0696a.c cVar) {
        tn.p.k(cVar, "button");
        this.f50496g.c(cVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r
    public void o(@NotNull a.AbstractC0696a.c.EnumC0698a enumC0698a) {
        tn.p.k(enumC0698a, "buttonType");
        this.f50496g.b(enumC0698a);
    }

    public final kotlinx.coroutines.g r(b bVar) {
        return p000do.i.d(this.f50494e, null, null, new a(bVar, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g
    public void reset() {
        this.f50495f.reset();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a
    public void t() {
        this.f50496g.e();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q
    public void u() {
        this.f50502m.u();
    }
}
