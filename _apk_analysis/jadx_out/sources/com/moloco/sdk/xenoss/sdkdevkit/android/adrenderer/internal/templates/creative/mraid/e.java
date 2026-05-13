package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid;

import android.graphics.Rect;
import android.webkit.WebView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import bn.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.h0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.t;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.internal.partials.MolocoAdsNetworkBridge;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p000do.i;
import p000do.l0;
import sn.p;

/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred(parameters = 0)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final WebView f48660a;

    @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.MraidJsEventSenderImpl$sendJs$1", f = "MraidJsEventSender.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48661a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f48663c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, hn.c<? super a> cVar) {
            super(2, cVar);
            this.f48663c = str;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return e.this.new a(this.f48663c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f48661a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            MolocoAdsNetworkBridge.webviewLoadUrl(e.this.f48660a, SafeDKWebAppInterface.f52902f + this.f48663c);
            return r.f5635a;
        }
    }

    public e(@NotNull WebView webView) {
        tn.p.k(webView, "webView");
        this.f48660a = webView;
    }

    public final String b(Rect rect) {
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

    public void c(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.r rVar) {
        tn.p.k(rVar, "placementType");
        k("mraidbridge.setPlacementType(" + JSONObject.quote(rVar.c()) + ')');
    }

    public void d(@NotNull h0 h0Var) {
        tn.p.k(h0Var, "screenMetrics");
        k("\n                mraidbridge.setScreenSize(" + j(h0Var.i()) + ");\n                mraidbridge.setMaxSize(" + j(h0Var.h()) + ");\n                mraidbridge.setCurrentPosition(" + b(h0Var.d()) + ");\n                mraidbridge.setDefaultPosition(" + b(h0Var.g()) + ");\n                mraidbridge.notifySizeChangeEvent(" + j(h0Var.d()) + ");\n            ");
    }

    public void e(@NotNull t tVar) {
        tn.p.k(tVar, "state");
        k("mraidbridge.setState(" + JSONObject.quote(tVar.c()) + ')');
    }

    public void f(@NotNull String str) {
        tn.p.k(str, "commandString");
        k("mraidbridge.nativeCallComplete(" + JSONObject.quote(str) + ')');
    }

    public void g(@NotNull String str, @NotNull String str2) {
        tn.p.k(str, "commandString");
        tn.p.k(str2, NotificationCompat.CATEGORY_MESSAGE);
        k("mraidbridge.notifyErrorEvent(" + JSONObject.quote(str) + ", " + JSONObject.quote(str2) + ')');
    }

    public void h(boolean z10) {
        k("mraidbridge.setIsViewable(" + z10 + ')');
    }

    public void i(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        k("mraidbridge.setSupports(" + z10 + ',' + z11 + ',' + z12 + ',' + z13 + ',' + z14 + ')');
    }

    public final String j(Rect rect) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(rect.width());
        sb2.append(',');
        sb2.append(rect.height());
        return sb2.toString();
    }

    public final void k(String str) {
        i.d(kotlinx.coroutines.d.a(com.moloco.sdk.internal.scheduling.c.a().getMain()), null, null, new a(str, null), 3, null);
    }
}
