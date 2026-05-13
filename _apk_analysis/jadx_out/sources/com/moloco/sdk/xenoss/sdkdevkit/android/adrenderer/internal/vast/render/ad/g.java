package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import android.content.Context;
import bn.r;
import cn.f0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import go.l;
import go.u;
import go.v;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AdPlaylistControllerImplKt$isLinearPlaylistItemPlayingFlow$1", f = "AdPlaylistControllerImpl.kt", l = {406}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ go.d<k> f50056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l<Boolean> f50057c;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g$a$a, reason: collision with other inner class name */
        @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AdPlaylistControllerImplKt$isLinearPlaylistItemPlayingFlow$1$1", f = "AdPlaylistControllerImpl.kt", l = {410}, m = "invokeSuspend")
        public static final class C0663a extends SuspendLambda implements p<k, hn.c<? super r>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f50058a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f50059b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l<Boolean> f50060c;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g$a$a$a, reason: collision with other inner class name */
            public static final class C0664a<T> implements go.e {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ l<Boolean> f50061b;

                public C0664a(l<Boolean> lVar) {
                    this.f50061b = lVar;
                }

                public final Object a(boolean z10, hn.c<? super r> cVar) {
                    this.f50061b.setValue(jn.a.a(z10));
                    return r.f5635a;
                }

                @Override // go.e
                public /* bridge */ /* synthetic */ Object emit(Object obj, hn.c cVar) {
                    return a(((Boolean) obj).booleanValue(), cVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0663a(l<Boolean> lVar, hn.c<? super C0663a> cVar) {
                super(2, cVar);
                this.f50060c = lVar;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(k kVar, hn.c<? super r> cVar) {
                return ((C0663a) create(kVar, cVar)).invokeSuspend(r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<r> create(Object obj, hn.c<?> cVar) {
                C0663a c0663a = new C0663a(this.f50060c, cVar);
                c0663a.f50059b = obj;
                return c0663a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objG = in.a.g();
                int i10 = this.f50058a;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    k kVar = (k) this.f50059b;
                    if (!(kVar instanceof k.c)) {
                        this.f50060c.setValue(null);
                        return r.f5635a;
                    }
                    u<Boolean> uVarIsPlaying = ((k.c) kVar).a().isPlaying();
                    C0664a c0664a = new C0664a(this.f50060c);
                    this.f50058a = 1;
                    if (uVarIsPlaying.collect(c0664a, this) == objG) {
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
        /* JADX WARN: Multi-variable type inference failed */
        public a(go.d<? extends k> dVar, l<Boolean> lVar, hn.c<? super a> cVar) {
            super(2, cVar);
            this.f50056b = dVar;
            this.f50057c = lVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return new a(this.f50056b, this.f50057c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f50055a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                go.d<k> dVar = this.f50056b;
                C0663a c0663a = new C0663a(this.f50057c, null);
                this.f50055a = 1;
                if (go.f.l(dVar, c0663a, this) == objG) {
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

    @NotNull
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a a(@NotNull n nVar, @NotNull w0 w0Var, @NotNull Context context, @NotNull b0 b0Var, int i10, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, @NotNull o oVar) {
        tn.p.k(nVar, "mraidAdData");
        tn.p.k(w0Var, "externalLinkHandler");
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(b0Var, "mraidFullscreenContentController");
        tn.p.k(aVar, "customUserEventBuilderService");
        tn.p.k(oVar, "linkHandler");
        return new f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.o.a(nVar, b0Var, i10, context, w0Var, aVar, oVar), null);
    }

    @NotNull
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a b(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, @NotNull w0 w0Var, @NotNull Context context, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar2, boolean z10, @Nullable Boolean bool, int i10, int i11, int i12, boolean z11, boolean z12, @NotNull o oVar) {
        tn.p.k(aVar, "ad");
        tn.p.k(w0Var, "externalLinkHandler");
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(aVar2, "customUserEventBuilderService");
        tn.p.k(oVar, "linkHandler");
        return new f(j.a(aVar, w0Var, context, aVar2, z10, bool, i10, i11, i12, z11, z12, oVar), new h(aVar.f(), aVar.g().i().b(), aVar.e(), null, 8, null));
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a g(List<? extends k> list, k kVar) {
        k kVar2 = (k) f0.w0(list, f0.y0(list, kVar) + 1);
        k.b bVar = kVar2 instanceof k.b ? (k.b) kVar2 : null;
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    public static final a.AbstractC0696a.c.EnumC0698a h(List<? extends k> list, k kVar, a.AbstractC0696a.c.EnumC0698a enumC0698a) {
        return (enumC0698a != a.AbstractC0696a.c.EnumC0698a.f50945c || g(list, kVar) == null) ? enumC0698a : a.AbstractC0696a.c.EnumC0698a.f50946d;
    }

    public static final a.AbstractC0696a.c i(List<? extends k> list, k kVar, a.AbstractC0696a.c cVar) {
        a.AbstractC0696a.c.EnumC0698a enumC0698aH = h(list, kVar, cVar.c());
        return enumC0698aH == cVar.c() ? cVar : a.AbstractC0696a.c.b(cVar, enumC0698aH, null, null, 6, null);
    }

    public static final go.d<Boolean> j(go.d<? extends k> dVar, l0 l0Var) {
        l lVarA = v.a(null);
        p000do.i.d(l0Var, null, null, new a(dVar, lVarA, null), 3, null);
        return lVarA;
    }
}
