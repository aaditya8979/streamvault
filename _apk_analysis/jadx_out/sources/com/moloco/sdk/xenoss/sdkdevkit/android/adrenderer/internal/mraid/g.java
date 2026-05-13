package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import android.graphics.Rect;
import android.webkit.WebView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.ironsource.sdk.controller.f;
import com.moloco.sdk.internal.g0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e0;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.internal.partials.MolocoAdsNetworkBridge;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p000do.l0;

/* JADX INFO: loaded from: classes6.dex */
@StabilityInferred(parameters = 0)
public final class g implements y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f48353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final l0 f48354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final go.k<e0> f48355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final go.p<e0> f48356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final v f48357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final WebView f48358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final go.u<Boolean> f48359h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final go.u<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> f48360i;

    public static final class a implements f0 {
        public a() {
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f0
        public boolean a(String str) {
            tn.p.k(str, "fromUrl");
            return g.this.s(str);
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidBridgeImpl$consumeMraidJsCommand$1", f = "MraidBridge.kt", l = {101}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f48362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f48363b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.g0<e0, e0.b.a> f48364c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g f48365d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.moloco.sdk.internal.g0<e0, e0.b.a> g0Var, g gVar, hn.c<? super b> cVar) {
            super(2, cVar);
            this.f48364c = g0Var;
            this.f48365d = gVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return new b(this.f48364c, this.f48365d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            e0 e0Var;
            Object objG = in.a.g();
            int i10 = this.f48363b;
            if (i10 == 0) {
                kotlin.c.b(obj);
                e0 e0Var2 = (e0) ((g0.b) this.f48364c).a();
                go.k kVar = this.f48365d.f48355d;
                this.f48362a = e0Var2;
                this.f48363b = 1;
                if (kVar.emit(e0Var2, this) == objG) {
                    return objG;
                }
                e0Var = e0Var2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e0Var = (e0) this.f48362a;
                kotlin.c.b(obj);
            }
            this.f48365d.o(e0Var);
            return bn.r.f5635a;
        }
    }

    public g(@NotNull Context context, @NotNull l0 l0Var, boolean z10) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(l0Var, "scope");
        this.f48353b = z10;
        this.f48354c = kotlinx.coroutines.d.i(l0Var, com.moloco.sdk.internal.scheduling.c.a().getMain());
        go.k<e0> kVarB = go.q.b(0, 0, null, 7, null);
        this.f48355d = kVarB;
        this.f48356e = kVarB;
        v vVar = new v(context, new a());
        this.f48357f = vVar;
        this.f48358g = vVar;
        this.f48359h = vVar.c();
        this.f48360i = vVar.getUnrecoverableError();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.y
    @Nullable
    public Object a(@NotNull String str, @NotNull hn.c<? super com.moloco.sdk.internal.g0<n, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>> cVar) {
        return this.f48357f.b(str, this.f48353b, cVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.y
    public void a(boolean z10) {
        t("mraidbridge.setIsViewable(" + z10 + ')');
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.y
    @NotNull
    public WebView c() {
        return this.f48358g;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.y
    public void d(@NotNull r rVar) {
        tn.p.k(rVar, "placementType");
        t("mraidbridge.setPlacementType(" + JSONObject.quote(rVar.c()) + ')');
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r
    public void destroy() {
        this.f48357f.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.y
    public void e(@NotNull h0 h0Var) {
        tn.p.k(h0Var, "screenMetrics");
        t("\n                mraidbridge.setScreenSize(" + r(h0Var.i()) + ");\n                mraidbridge.setMaxSize(" + r(h0Var.h()) + ");\n                mraidbridge.setCurrentPosition(" + j(h0Var.d()) + ");\n                mraidbridge.setDefaultPosition(" + j(h0Var.g()) + ")\n            ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("mraidbridge.notifySizeChangeEvent(");
        sb2.append(r(h0Var.d()));
        sb2.append(')');
        t(sb2.toString());
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.y
    public void g(@NotNull t tVar) {
        tn.p.k(tVar, "state");
        t("mraidbridge.setState(" + JSONObject.quote(tVar.c()) + ')');
    }

    public final String j(Rect rect) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(rect.left);
        sb2.append(',');
        sb2.append(rect.top);
        sb2.append(',');
        sb2.append(rect.width());
        sb2.append(',');
        sb2.append(rect.height());
        return sb2.toString();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.y
    public void j() {
        t("mraidbridge.notifyReadyEvent()");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.y
    public void k(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        t("mraidbridge.setSupports(" + z10 + ',' + z11 + ',' + z12 + ',' + z13 + ',' + z14 + ')');
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.y
    public void n(@NotNull e0 e0Var, @NotNull String str) {
        tn.p.k(e0Var, f.b.f33720g);
        tn.p.k(str, NotificationCompat.CATEGORY_MESSAGE);
        t("mraidbridge.notifyErrorEvent(" + JSONObject.quote(e0Var.b()) + ", " + JSONObject.quote(str) + ')');
    }

    public final void o(e0 e0Var) {
        t("mraidbridge.nativeCallComplete(" + JSONObject.quote(e0Var.b()) + ')');
    }

    public final String r(Rect rect) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(rect.width());
        sb2.append(',');
        sb2.append(rect.height());
        return sb2.toString();
    }

    public final boolean s(String str) {
        com.moloco.sdk.internal.g0<e0, e0.b.a> g0VarA = e0.f48343b.a(str);
        if (g0VarA instanceof g0.b) {
            p000do.i.d(this.f48354c, null, null, new b(g0VarA, this, null), 3, null);
            return true;
        }
        if (g0VarA instanceof g0.a) {
            return ((e0.b.a) ((g0.a) g0VarA).a()).a();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void t(String str) {
        MolocoAdsNetworkBridge.webviewLoadUrl(this.f48357f, SafeDKWebAppInterface.f52902f + str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.y
    @NotNull
    public go.p<e0> v() {
        return this.f48356e;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.y
    @NotNull
    public go.u<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> w() {
        return this.f48360i;
    }
}
