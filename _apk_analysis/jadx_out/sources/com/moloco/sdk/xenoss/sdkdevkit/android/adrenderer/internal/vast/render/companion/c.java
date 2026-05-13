package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import bn.r;
import com.ironsource.C3978d4;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import go.k;
import go.l;
import go.q;
import go.u;
import go.v;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class c implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c f50089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Context f50090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f50091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final w0 f50092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f50093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final o f50094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final l0 f50095h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final g f50096i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public a.AbstractC0696a.f f50097j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final i f50098k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final k<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b> f50099l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final go.d<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b> f50100m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f50101n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k f50102o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> f50103p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final u<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> f50104q;

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.CompanionControllerImpl$1", f = "CompanionControllerImpl.kt", l = {108}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f50105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f50106b;

        public a(hn.c<? super a> cVar) {
            super(2, cVar);
        }

        public static final r a(c cVar) {
            cVar.f50098k.d(cVar.f50097j);
            cVar.r(b.a.f50085a);
            return r.f5635a;
        }

        public static final r a(c cVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar2) {
            cVar.t(cVar2);
            return r.f5635a;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return c.this.new a(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            c cVar;
            Object objG = in.a.g();
            int i10 = this.f50106b;
            if (i10 == 0) {
                kotlin.c.b(obj);
                c cVar2 = c.this;
                a0 a0VarE = cVar2.f50089b.e();
                Context context = c.this.f50090c;
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar = c.this.f50091d;
                w0 w0Var = c.this.f50092e;
                int iF = c.this.f50089b.f();
                int iD = c.this.f50089b.d();
                final c cVar3 = c.this;
                sn.a aVar2 = new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.d
                    @Override // sn.a
                    public final Object invoke() {
                        return c.a.a(cVar3);
                    }
                };
                final c cVar4 = c.this;
                sn.l lVar = new sn.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.f
                    @Override // sn.l
                    public final Object invoke(Object obj2) {
                        return c.a.a(cVar4, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) obj2);
                    }
                };
                boolean z10 = c.this.f50093f;
                o oVar = c.this.f50094g;
                this.f50105a = cVar2;
                this.f50106b = 1;
                Object objC = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.c(a0VarE, context, aVar, w0Var, iF, iD, aVar2, lVar, z10, oVar, this);
                if (objC == objG) {
                    return objG;
                }
                cVar = cVar2;
                obj = objC;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = (c) this.f50105a;
                kotlin.c.b(obj);
            }
            cVar.v((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k) obj);
            return r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.CompanionControllerImpl$onEvent$1", f = "CompanionControllerImpl.kt", l = {57}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50108a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b f50110c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b bVar, hn.c<? super b> cVar) {
            super(2, cVar);
            this.f50110c = bVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return c.this.new b(this.f50110c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f50108a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                k kVar = c.this.f50099l;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b bVar = this.f50110c;
                this.f50108a = 1;
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

    public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c cVar, int i10, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, w0 w0Var, boolean z10, o oVar) {
        tn.p.k(cVar, "companion");
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(aVar, "customUserEventBuilderService");
        tn.p.k(w0Var, "externalLinkHandler");
        tn.p.k(oVar, "linkHandler");
        this.f50089b = cVar;
        this.f50090c = context;
        this.f50091d = aVar;
        this.f50092e = w0Var;
        this.f50093f = z10;
        this.f50094g = oVar;
        l0 l0VarA = kotlinx.coroutines.d.a(com.moloco.sdk.internal.scheduling.c.a().getMain());
        this.f50095h = l0VarA;
        this.f50096i = h.a(i10, l0VarA);
        this.f50097j = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c.f49253a.c(Offset.INSTANCE.m1399getZeroF1C5BW0());
        this.f50098k = new i(aVar, cVar.b(), cVar.c(), null, null, 24, null);
        k<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b> kVarB = q.b(0, 0, null, 7, null);
        this.f50099l = kVarB;
        this.f50100m = kVarB;
        this.f50101n = cVar.a() != null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k kVar = this.f50102o;
        l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> lVarA = v.a(kVar != null ? kVar.l() : null);
        this.f50103p = lVarA;
        this.f50104q = lVarA;
        p000do.i.d(l0VarA, null, null, new a(null), 3, null);
    }

    public /* synthetic */ c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c cVar, int i10, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, w0 w0Var, boolean z10, o oVar, tn.i iVar) {
        this(cVar, i10, context, aVar, w0Var, z10, oVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public boolean J() {
        return this.f50101n;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.j
    @NotNull
    public u<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> K() {
        return this.f50104q;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a
    @NotNull
    public go.d<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b> a() {
        return this.f50100m;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.j
    public void b() {
        this.f50098k.a();
        r(b.c.f50087a);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r
    public void destroy() {
        kotlinx.coroutines.d.e(this.f50095h, null, 1, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k kVar = this.f50102o;
        if (kVar != null) {
            kVar.destroy();
        }
        v(null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.j
    public void i(@NotNull a.AbstractC0696a.f fVar) {
        tn.p.k(fVar, C3978d4.i.L);
        this.f50097j = fVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public void j(@NotNull a.AbstractC0696a.f fVar) {
        tn.p.k(fVar, C3978d4.i.L);
        String strA = this.f50089b.a();
        if (strA != null) {
            this.f50098k.d(fVar);
            r(b.a.f50085a);
            this.f50094g.a(strA);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d
    @NotNull
    public u<d.a> l() {
        return this.f50096i.l();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r
    public void l(@NotNull a.AbstractC0696a.c cVar) {
        tn.p.k(cVar, "button");
        this.f50098k.c(cVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r
    public void o(@NotNull a.AbstractC0696a.c.EnumC0698a enumC0698a) {
        tn.p.k(enumC0698a, "buttonType");
        this.f50098k.b(enumC0698a);
    }

    public final kotlinx.coroutines.g r(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b bVar) {
        return p000do.i.d(this.f50095h, null, null, new b(bVar, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g
    public void reset() {
        this.f50096i.reset();
    }

    public void t(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
        tn.p.k(cVar, "error");
        r(new b.d(cVar));
    }

    public final void v(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k kVar) {
        this.f50102o = kVar;
        this.f50103p.setValue(kVar != null ? kVar.l() : null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.j
    public void y() {
        r(b.C0666b.f50086a);
    }
}
