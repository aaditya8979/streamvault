package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import android.webkit.WebView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 1)
public final class m extends e implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final sn.a<bn.r> f48415o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final sn.a<bn.r> f48416p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o f48417q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s f48418r;

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidInline", f = "MraidInline.kt", l = {53}, m = "load")
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f48419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f48420b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f48422d;

        public a(hn.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f48420b = obj;
            this.f48422d |= Integer.MIN_VALUE;
            return m.this.r0(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@NotNull Context context, @NotNull String str, @NotNull sn.a<bn.r> aVar, @NotNull sn.a<bn.r> aVar2, @NotNull final sn.a<bn.r> aVar3, @NotNull sn.l<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d, bn.r> lVar, boolean z10, @NotNull w0 w0Var, @NotNull y yVar, @Nullable final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o oVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s sVar) {
        super(context, str, r.f48430b, aVar3, new sn.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.d0
            @Override // sn.l
            public final Object invoke(Object obj) {
                return m.q0(aVar3, oVar, (String) obj);
            }
        }, lVar, w0Var, z10, yVar);
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(str, "adm");
        tn.p.k(aVar, "onNeedToDetachAdViewBeforeExpand");
        tn.p.k(aVar2, "onExpandAdViewClosed");
        tn.p.k(aVar3, "onShowListenerClick");
        tn.p.k(lVar, "onError");
        tn.p.k(w0Var, "externalLinkHandler");
        tn.p.k(yVar, "mraidBridge");
        tn.p.k(sVar, "buttonTracker");
        this.f48415o = aVar;
        this.f48416p = aVar2;
        this.f48417q = oVar;
        this.f48418r = sVar;
    }

    public /* synthetic */ m(Context context, String str, sn.a aVar, sn.a aVar2, sn.a aVar3, sn.l lVar, boolean z10, w0 w0Var, y yVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o oVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s sVar, int i10, tn.i iVar) {
        this(context, str, aVar, aVar2, aVar3, lVar, z10, w0Var, yVar, (i10 & 512) != 0 ? null : oVar, (i10 & 1024) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.w.a() : sVar);
    }

    public static final bn.r q0(sn.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o oVar, String str) {
        tn.p.k(str, "url");
        aVar.invoke();
        if (oVar != null) {
            oVar.a(str);
        }
        return bn.r.f5635a;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e
    public void J() {
        super.J();
        this.f48415o.invoke();
    }

    @NotNull
    public final WebView c() {
        return C().c();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r
    public void l(@NotNull a.AbstractC0696a.c cVar) {
        tn.p.k(cVar, "button");
        this.f48418r.l(cVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r
    public void o(@NotNull a.AbstractC0696a.c.EnumC0698a enumC0698a) {
        tn.p.k(enumC0698a, "buttonType");
        this.f48418r.o(enumC0698a);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e
    public void p0() {
        super.p0();
        this.f48416p.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r0(@org.jetbrains.annotations.NotNull hn.c<? super android.webkit.WebView> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m.a
            if (r0 == 0) goto L13
            r0 = r5
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m$a r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m.a) r0
            int r1 = r0.f48422d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f48422d = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m$a r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f48420b
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f48422d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f48419a
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m) r0
            kotlin.c.b(r5)
            goto L44
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.c.b(r5)
            r0.f48419a = r4
            r0.f48422d = r3
            java.lang.Object r5 = r4.f0(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r0 = r4
        L44:
            boolean r5 = r5 instanceof com.moloco.sdk.internal.g0.b
            if (r5 == 0) goto L51
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.y r5 = r0.C()
            android.webkit.WebView r5 = r5.c()
            goto L52
        L51:
            r5 = 0
        L52:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m.r0(hn.c):java.lang.Object");
    }
}
