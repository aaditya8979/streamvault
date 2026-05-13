package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import bn.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d;
import go.l;
import go.u;
import go.v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import p000do.l0;
import sn.p;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final u<k> f50000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final l<d.a> f50001c;

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AdGoNextActionImpl$1", f = "AdGoNextAction.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements p<k, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50003b;

        public a(hn.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(k kVar, hn.c<? super r> cVar) {
            return ((a) create(kVar, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            a aVar = new a(cVar);
            aVar.f50003b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f50002a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            k kVar = (k) this.f50003b;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g gVarA = kVar instanceof k.a ? ((k.a) kVar).a() : kVar instanceof k.b ? ((k.b) kVar).a() : null;
            if (gVarA == null) {
                return r.f5635a;
            }
            gVarA.reset();
            return r.f5635a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull u<? extends k> uVar, @NotNull l0 l0Var) {
        tn.p.k(uVar, "currentPlaylistItem");
        tn.p.k(l0Var, "scope");
        this.f50000b = uVar;
        go.f.M(go.f.G(uVar, new a(null)), l0Var, kotlinx.coroutines.flow.a.f73397a.c(), null);
        this.f50001c = v.a(d.a.c.f50486a);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d
    @NotNull
    public u<d.a> l() {
        k value = this.f50000b.getValue();
        if (value instanceof k.a) {
            return ((k.a) value).a().l();
        }
        if (value instanceof k.b) {
            return ((k.b) value).a().l();
        }
        if (value instanceof k.c) {
            return ((k.c) value).a().l();
        }
        if (value instanceof k.d) {
            return ((k.d) value).a().l();
        }
        if (value == null) {
            return this.f50001c;
        }
        throw new NoWhenBranchMatchedException();
    }
}
