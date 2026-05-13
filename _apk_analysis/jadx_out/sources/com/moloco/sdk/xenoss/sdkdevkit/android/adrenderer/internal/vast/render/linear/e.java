package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import bn.r;
import com.ironsource.C3978d4;
import com.moloco.sdk.service_locator.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.t;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import go.u;
import go.v;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class e implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c {
    public boolean A;
    public int B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f f50590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f50591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f50592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f50593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final w0 f50594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final o f50595g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final l0 f50596h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final go.k<d> f50597i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final go.d<d> f50598j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f50599k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final go.l<Boolean> f50600l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final u<Boolean> f50601m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final go.l<p<Long>> f50602n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final u<p<Long>> f50603o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f50604p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final String f50605q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f50606r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.b f50607s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final q f50608t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final go.l<Boolean> f50609u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final u<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> f50610v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final go.l<Boolean> f50611w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final u<Boolean> f50612x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final l f50613y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final j f50614z;

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.LinearControllerImpl$1", f = "LinearControllerImpl.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements sn.p<Boolean, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f50616b;

        public a(hn.c<? super a> cVar) {
            super(2, cVar);
        }

        public final Object a(boolean z10, hn.c<? super r> cVar) {
            return ((a) create(Boolean.valueOf(z10), cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            a aVar = e.this.new a(cVar);
            aVar.f50616b = ((Boolean) obj).booleanValue();
            return aVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo2invoke(Boolean bool, hn.c<? super r> cVar) {
            return a(bool.booleanValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f50615a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            if (this.f50616b) {
                e.this.f50613y.g(jn.a.d(e.this.C()), e.this.f50599k);
            } else {
                e.this.f50613y.f(jn.a.d(e.this.C()), e.this.f50599k);
            }
            return r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.LinearControllerImpl$onEvent$1", f = "LinearControllerImpl.kt", l = {55}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements sn.p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50618a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f50620c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d dVar, hn.c<? super b> cVar) {
            super(2, cVar);
            this.f50620c = dVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return e.this.new b(this.f50620c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f50618a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                go.k kVar = e.this.f50597i;
                d dVar = this.f50620c;
                this.f50618a = 1;
                if (kVar.emit(dVar, this) == objG) {
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

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.LinearControllerImpl$vastPrivacyIcon$1", f = "LinearControllerImpl.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements sn.q<Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, hn.c<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f50622b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f50623c;

        public c(hn.c<? super c> cVar) {
            super(3, cVar);
        }

        public final Object a(boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar, hn.c<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> cVar) {
            c cVar2 = new c(cVar);
            cVar2.f50622b = z10;
            cVar2.f50623c = jVar;
            return cVar2.invokeSuspend(r.f5635a);
        }

        @Override // sn.q
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar, hn.c<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> cVar) {
            return a(bool.booleanValue(), jVar, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f50621a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            boolean z10 = this.f50622b;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j) this.f50623c;
            if (z10) {
                return jVar;
            }
            return null;
        }
    }

    public e(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f fVar, int i10, boolean z10, @Nullable Boolean bool, int i11, boolean z11, boolean z12, @NotNull Context context, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, @NotNull w0 w0Var, @NotNull o oVar) {
        String absolutePath;
        tn.p.k(fVar, "linear");
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(aVar, "customUserEventBuilderService");
        tn.p.k(w0Var, "externalLinkHandler");
        tn.p.k(oVar, "linkHandler");
        this.f50590b = fVar;
        this.f50591c = z11;
        this.f50592d = z12;
        this.f50593e = aVar;
        this.f50594f = w0Var;
        this.f50595g = oVar;
        l0 l0VarA = kotlinx.coroutines.d.a(com.moloco.sdk.internal.scheduling.c.a().getMain());
        this.f50596h = l0VarA;
        go.k<d> kVarB = go.q.b(0, 0, null, 7, null);
        this.f50597i = kVarB;
        this.f50598j = kVarB;
        this.f50599k = fVar.g();
        go.l<Boolean> lVarA = v.a(Boolean.valueOf(z10));
        this.f50600l = lVarA;
        this.f50601m = lVarA;
        go.l<p<Long>> lVarA2 = v.a(new p(Long.valueOf(i10)));
        this.f50602n = lVarA2;
        this.f50603o = go.f.c(lVarA2);
        this.f50604p = b.g.f47660a.b().d();
        if (L()) {
            absolutePath = fVar.g();
        } else {
            absolutePath = fVar.e().getAbsolutePath();
            tn.p.j(absolutePath, "getAbsolutePath(...)");
        }
        this.f50605q = absolutePath;
        this.f50606r = fVar.c() != null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e eVarD = fVar.d();
        List<String> listB = eVarD != null ? eVarD.b() : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e eVarD2 = fVar.d();
        this.f50607s = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.b(listB, eVarD2 != null ? eVarD2.g() : null, null, 4, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e eVarD3 = fVar.d();
        a0 a0VarF = eVarD3 != null ? eVarD3.f() : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e eVarD4 = fVar.d();
        Integer numValueOf = eVarD4 != null ? Integer.valueOf(eVarD4.h()) : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e eVarD5 = fVar.d();
        Integer numValueOf2 = eVarD5 != null ? Integer.valueOf(eVarD5.d()) : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e eVarD6 = fVar.d();
        q qVarA = t.a(a0VarF, numValueOf, numValueOf2, eVarD6 != null ? eVarD6.a() : null, l0VarA, context, aVar, w0Var, new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.f
            @Override // sn.a
            public final Object invoke() {
                return e.X(this.f50624b);
            }
        }, new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.g
            @Override // sn.a
            public final Object invoke() {
                return e.Y(this.f50625b);
            }
        });
        this.f50608t = qVarA;
        Boolean bool2 = Boolean.FALSE;
        go.l<Boolean> lVarA3 = v.a(bool2);
        this.f50609u = lVarA3;
        this.f50610v = go.f.M(go.f.m(lVarA3, qVarA.O(), new c(null)), l0VarA, a.C0862a.b(kotlinx.coroutines.flow.a.f73397a, 0L, 0L, 3, null), null);
        go.l<Boolean> lVarA4 = v.a(bool2);
        this.f50611w = lVarA4;
        this.f50612x = lVarA4;
        this.f50613y = l.f50639p.a(fVar.i(), aVar);
        go.f.D(go.f.G(isPlaying(), new a(null)), l0VarA);
        this.f50614z = k.d(bool, i11, fVar.h());
    }

    public static final r X(e eVar) {
        eVar.f50607s.a(Integer.valueOf(eVar.C()), eVar.f50599k);
        return r.f5635a;
    }

    public static final r Y(e eVar) {
        eVar.f50607s.b(Integer.valueOf(eVar.C()), eVar.f50599k);
        return r.f5635a;
    }

    public int C() {
        return this.B;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m
    public void D() {
        this.f50614z.s();
    }

    public final void E() {
        this.f50609u.setValue(Boolean.FALSE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m
    public void F() {
        this.f50614z.pause();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m
    @NotNull
    public String G() {
        return this.f50605q;
    }

    public final void H() {
        if (this.f50592d) {
            T(false, i.a());
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public boolean J() {
        return this.f50606r;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m
    public boolean L() {
        return this.f50604p;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q
    @NotNull
    public u<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> O() {
        return this.f50610v;
    }

    public final void P() {
        if (this.f50591c) {
            T(false, i.a());
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m
    @NotNull
    public u<p<Long>> Q() {
        return this.f50603o;
    }

    public final kotlinx.coroutines.g S(d dVar) {
        return p000do.i.d(this.f50596h, null, null, new b(dVar, null), 3, null);
    }

    public final void T(boolean z10, a.AbstractC0696a.f fVar) {
        String strC = this.f50590b.c();
        if (strC != null) {
            if (z10) {
                this.f50613y.c(fVar, Integer.valueOf(C()), this.f50599k);
            }
            this.f50595g.a(strC);
            S(d.a.f50585a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V(int r9, int r10) {
        /*
            r8 = this;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f r0 = r8.f50590b
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e r0 = r0.d()
            if (r0 != 0) goto L9
            return
        L9:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t r1 = r0.e()
            java.lang.Long r0 = r0.c()
            boolean r2 = r1 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t.a
            r3 = 0
            if (r2 == 0) goto L20
            int r2 = r10 / 100
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t$a r1 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t.a) r1
            int r1 = r1.a()
            int r2 = r2 * r1
            goto L2d
        L20:
            boolean r2 = r1 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t.b
            if (r2 == 0) goto L2c
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t$b r1 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t.b) r1
            long r1 = r1.a()
            int r2 = (int) r1
            goto L2d
        L2c:
            r2 = r3
        L2d:
            zn.i r1 = new zn.i
            r1.<init>(r3, r10)
            int r10 = zn.n.o(r2, r1)
            go.l<java.lang.Boolean> r1 = r8.f50609u
            if (r0 != 0) goto L3d
            if (r9 < r10) goto L4d
            goto L4c
        L3d:
            long r4 = (long) r10
            long r6 = r0.longValue()
            long r6 = r6 + r4
            long r9 = (long) r9
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 > 0) goto L4d
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 > 0) goto L4d
        L4c:
            r3 = 1
        L4d:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            r1.setValue(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e.V(int, int):void");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c
    @NotNull
    public go.d<d> a() {
        return this.f50598j;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m
    public void b() {
        S(d.c.f50587a);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m
    public void c(boolean z10) {
        this.f50600l.setValue(Boolean.valueOf(z10));
        l lVar = this.f50613y;
        if (z10) {
            lVar.e(Integer.valueOf(C()), this.f50599k);
        } else {
            lVar.j(Integer.valueOf(C()), this.f50599k);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r
    public void destroy() {
        kotlinx.coroutines.d.e(this.f50596h, null, 1, null);
        this.f50608t.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m
    public void h() {
        this.A = true;
        this.f50613y.i(Integer.valueOf(C()), this.f50599k);
        String strC = this.f50590b.c();
        if (strC != null) {
            this.f50595g.c(strC);
        }
        S(d.e.f50589a);
        P();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m
    public void h(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l lVar) {
        tn.p.k(lVar, "error");
        S(new d.C0684d(lVar));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q
    public void i() {
        this.f50608t.i();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c
    @NotNull
    public u<Boolean> isPlaying() {
        return this.f50612x;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public void j(@NotNull a.AbstractC0696a.f fVar) {
        tn.p.k(fVar, C3978d4.i.L);
        T(true, fVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d
    @NotNull
    public u<d.a> l() {
        return this.f50614z.l();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r
    public void l(@NotNull a.AbstractC0696a.c cVar) {
        tn.p.k(cVar, "button");
        this.f50613y.b(cVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m
    public void m(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar) {
        Pair pairA;
        tn.p.k(iVar, "progress");
        boolean z10 = iVar instanceof i.a;
        if (z10) {
            int iA = (int) ((i.a) iVar).a();
            pairA = bn.h.a(Integer.valueOf(iA), Integer.valueOf(iA));
        } else if (iVar instanceof i.c) {
            i.c cVar = (i.c) iVar;
            pairA = bn.h.a(Integer.valueOf((int) cVar.a()), Integer.valueOf((int) cVar.b()));
        } else {
            if (!(iVar instanceof i.d)) {
                if (!tn.p.f(iVar, i.b.f50545a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            pairA = bn.h.a(0, Integer.valueOf((int) ((i.d) iVar).a()));
        }
        int iIntValue = ((Number) pairA.component1()).intValue();
        int iIntValue2 = ((Number) pairA.component2()).intValue();
        this.B = iIntValue;
        if (!this.A && !(iVar instanceof i.d)) {
            this.f50613y.d(this.f50599k, iIntValue, iIntValue2);
        }
        if (z10) {
            if (!this.A) {
                S(d.b.f50586a);
                String strC = this.f50590b.c();
                if (strC != null) {
                    this.f50595g.b(strC);
                }
                H();
            }
            this.A = false;
        }
        this.f50614z.a(iIntValue, iIntValue2);
        V(iIntValue, iIntValue2);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r
    public void o(@NotNull a.AbstractC0696a.c.EnumC0698a enumC0698a) {
        tn.p.k(enumC0698a, "buttonType");
        this.f50613y.a(enumC0698a);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m
    public void p(boolean z10) {
        this.f50611w.setValue(Boolean.valueOf(z10));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m
    @NotNull
    public u<Boolean> q() {
        return this.f50601m;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c
    public void r() {
        if (!isPlaying().getValue().booleanValue() && this.f50602n.getValue().a().longValue() == 0 && C() == 0) {
            return;
        }
        this.f50602n.setValue(new p<>(0L));
        this.f50613y.h(Integer.valueOf(C()), this.f50599k);
        this.A = false;
        this.B = 0;
        this.f50614z.I();
        E();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q
    public void u() {
        this.f50608t.u();
    }
}
