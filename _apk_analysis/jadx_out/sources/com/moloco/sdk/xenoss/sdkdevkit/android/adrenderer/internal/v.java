package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.ortb.model.C4381e;
import com.moloco.sdk.service_locator.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 1)
public final class v {

    public /* synthetic */ class a extends FunctionReferenceImpl implements sn.l<hn.c<? super com.moloco.sdk.internal.g0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n, d>>, Object> {
        public a(Object obj) {
            super(1, obj, b.class, "loadAndReadyMraid", "loadAndReadyMraid(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // sn.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(hn.c<? super com.moloco.sdk.internal.g0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n, d>> cVar) {
            return ((b) this.receiver).f0(cVar);
        }
    }

    public static final class b extends e {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ go.l<Boolean> f49293o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, w0 w0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.y yVar, go.l<Boolean> lVar, String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.r rVar) {
            super(context, str, rVar, null, null, null, w0Var, false, yVar, 184, null);
            this.f49293o = lVar;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e
        public void p0() {
            super.p0();
            this.f49293o.setValue(Boolean.FALSE);
        }
    }

    public /* synthetic */ class c extends FunctionReferenceImpl implements sn.a<bn.r> {
        public c(Object obj) {
            super(0, obj, b.class, "closeFullscreenAdRepresentation", "closeFullscreenAdRepresentation()V", 0);
        }

        public final void a() {
            ((b) this.receiver).p0();
        }

        @Override // sn.a
        public /* bridge */ /* synthetic */ bn.r invoke() {
            a();
            return bn.r.f5635a;
        }
    }

    @NotNull
    public s<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.d0> a(@NotNull Context context, @NotNull C4381e c4381e, boolean z10, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, @NotNull com.moloco.sdk.acm.recorder.a aVar) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(c4381e, "bid");
        tn.p.k(e0Var, "watermark");
        tn.p.k(aVar, "metricsRecorder");
        return b0.b(context, c4381e, b.g.f47660a.b().d(), e0Var, aVar, null, null, 96, null);
    }

    @NotNull
    public s<m, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n> b(@NotNull Context context, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, @NotNull String str, @NotNull w0 w0Var, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(aVar, "customUserEventBuilderService");
        tn.p.k(str, "adm");
        tn.p.k(w0Var, "externalLinkHandler");
        tn.p.k(e0Var, "watermark");
        return p.a(context, aVar, str, w0Var, e0Var);
    }

    @NotNull
    public s<m, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n> c(@NotNull Context context, @NotNull p000do.l0 l0Var, @NotNull C4381e c4381e, @NotNull w0 w0Var, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, @NotNull go.l<Boolean> lVar, boolean z10, @NotNull com.moloco.sdk.acm.recorder.a aVar) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(l0Var, "scope");
        tn.p.k(c4381e, "bid");
        tn.p.k(w0Var, "externalLinkHandler");
        tn.p.k(e0Var, "watermark");
        tn.p.k(lVar, "isAdDisplaying");
        tn.p.k(aVar, "metricsRecorder");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.y yVarA = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.z.a(context, l0Var, z10);
        b bVar = new b(context, w0Var, yVarA, lVar, c4381e.a(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.r.f48431c);
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a.a(context, e0Var, new x(l0Var, c4381e, b.a.f47629a.a(), new a(bVar)), bVar, new k(true, new c(bVar), l0Var, bn.k.b(zn.n.e(0, 0)), yVarA.c(), yVarA.v(), null, 64, null), MraidActivity.f48292g, c4381e.c(), aVar);
    }
}
