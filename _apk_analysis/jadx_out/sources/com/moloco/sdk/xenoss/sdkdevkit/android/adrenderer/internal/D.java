package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.g0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k;
import jn.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.i;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class D implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f47744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final p000do.l0 f47745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a f47746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f47747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final go.l<Boolean> f47748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final go.u<Boolean> f47749g;

    @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.StaticAdLoad$load$1", f = "StaticAdLoad.kt", l = {23}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47750a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f47752c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k.a f47753d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j10, k.a aVar, hn.c<? super a> cVar) {
            super(2, cVar);
            this.f47752c = j10;
            this.f47753d = aVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return D.this.new a(this.f47752c, this.f47753d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f47750a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar = D.this.f47746d;
                String str = D.this.f47744b;
                long j10 = this.f47752c;
                this.f47750a = 1;
                obj = aVar.b(str, j10, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            com.moloco.sdk.internal.g0 g0Var = (com.moloco.sdk.internal.g0) obj;
            if (g0Var instanceof g0.b) {
                D.this.f47748f.setValue(jn.a.a(true));
                k.a aVar2 = this.f47753d;
                if (aVar2 != null) {
                    aVar2.a();
                }
            } else {
                if (!(g0Var instanceof g0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                k.a aVar3 = this.f47753d;
                if (aVar3 != null) {
                    aVar3.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((g0.a) g0Var).a());
                }
            }
            return bn.r.f5635a;
        }
    }

    public D(@NotNull String str, @NotNull p000do.l0 l0Var, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar) {
        tn.p.k(str, "adm");
        tn.p.k(l0Var, "scope");
        tn.p.k(aVar, "staticWebView");
        this.f47744b = str;
        this.f47745c = l0Var;
        this.f47746d = aVar;
        this.f47747e = "StaticAdLoad";
        go.l<Boolean> lVarA = go.v.a(Boolean.FALSE);
        this.f47748f = lVarA;
        this.f47749g = lVarA;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void i(long j10, @Nullable k.a aVar) {
        i.d(this.f47745c, null, null, new a(j10, aVar, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    @NotNull
    public go.u<Boolean> isLoaded() {
        return this.f47749g;
    }
}
