package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid;

import android.content.Context;
import android.webkit.WebView;
import androidx.compose.runtime.internal.StabilityInferred;
import bn.r;
import bo.a0;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.t;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.u;
import com.safedk.android.internal.partials.MolocoAdsNetworkBridge;
import go.f;
import go.l;
import go.v;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p000do.i;
import p000do.l0;
import sn.p;

/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred(parameters = 0)
public final class b implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f48636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final WebView f48637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b f48638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final l0 f48639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final e f48640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.c f48641f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public t f48642g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final u f48643h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final l<e0.f> f48644i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final go.u<e0.f> f48645j;

    @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.MraidCommunicationHubImpl$handleMraidJsCommandSetOrientationProperties$1", f = "MraidCommunicationHub.kt", l = {168}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48646a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f48648c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p f48649d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p pVar, hn.c<? super a> cVar) {
            super(2, cVar);
            this.f48648c = z10;
            this.f48649d = pVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return b.this.new a(this.f48648c, this.f48649d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f48646a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                l lVar = b.this.f48644i;
                e0.f fVar = new e0.f(this.f48648c, this.f48649d);
                this.f48646a = 1;
                if (lVar.emit(fVar, this) == objG) {
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

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.b$b, reason: collision with other inner class name */
    @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.MraidCommunicationHubImpl$startListeningToVisualMetricsChanges$1", f = "MraidCommunicationHub.kt", l = {}, m = "invokeSuspend")
    public static final class C0624b extends SuspendLambda implements p<Boolean, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f48651b;

        public C0624b(hn.c<? super C0624b> cVar) {
            super(2, cVar);
        }

        public final Object a(boolean z10, hn.c<? super r> cVar) {
            return ((C0624b) create(Boolean.valueOf(z10), cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            C0624b c0624b = b.this.new C0624b(cVar);
            c0624b.f48651b = ((Boolean) obj).booleanValue();
            return c0624b;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo2invoke(Boolean bool, hn.c<? super r> cVar) {
            return a(bool.booleanValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f48650a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            b.this.f48640e.h(this.f48651b);
            return r.f5635a;
        }
    }

    @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.MraidCommunicationHubImpl$startListeningToVisualMetricsChanges$2", f = "MraidCommunicationHub.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements p<u.a, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f48654b;

        public c(hn.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(u.a aVar, hn.c<? super r> cVar) {
            return ((c) create(aVar, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            c cVar2 = b.this.new c(cVar);
            cVar2.f48654b = obj;
            return cVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f48653a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            b.this.f48640e.d(((u.a) this.f48654b).a());
            return r.f5635a;
        }
    }

    public b(@NotNull Context context, @NotNull WebView webView, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b bVar) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(webView, "webView");
        tn.p.k(bVar, "clickthroughEventHandler");
        this.f48636a = context;
        this.f48637b = webView;
        this.f48638c = bVar;
        l0 l0VarA = kotlinx.coroutines.d.a(com.moloco.sdk.internal.scheduling.c.a().getMain());
        this.f48639d = l0VarA;
        this.f48640e = new e(webView);
        this.f48641f = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.c(context, this);
        this.f48642g = t.f48436c;
        this.f48643h = new u(webView, context, l0VarA);
        l<e0.f> lVarA = v.a(new e0.f(true, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p.f48427d));
        this.f48644i = lVarA;
        this.f48645j = lVarA;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a
    public void a() {
        if (this.f48642g == t.f48438e) {
            this.f48642g = t.f48436c;
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a
    public void a(@NotNull String str) throws JSONException {
        tn.p.k(str, "url");
        JSONObject jSONObject = new JSONObject();
        String strD = d(str);
        jSONObject.put("event", "clickthrough");
        jSONObject.put("contentType", "mraid");
        jSONObject.put("url", strD);
        try {
            this.f48638c.a(jSONObject);
            this.f48640e.f("open");
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "TAG", "Ad clicked: " + strD, false, 4, null);
        } catch (Exception unused) {
            this.f48640e.g("open", "Can't open links when mraid container is not visible to the user");
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a
    public void a(boolean z10, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p pVar) {
        tn.p.k(pVar, "forceOrientation");
        i.d(this.f48639d, null, null, new a(z10, pVar, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a
    public void b() {
        MolocoAdsNetworkBridge.onAddedJavascriptInterface(this.f48637b, this.f48641f, "AndroidMraid");
    }

    public final String d(String str) {
        return a0.W(str, "itms-apps://", false, 2, null) ? a0.S(str, "itms-apps://", "https://", false, 4, null) : str;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a
    public void d() {
        this.f48642g = t.f48436c;
        this.f48640e.i(false, false, false, false, true);
        this.f48640e.e(this.f48642g);
        this.f48640e.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.r.f48431c);
        this.f48640e.d(this.f48643h.s().getValue().a());
        f();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a
    @NotNull
    public go.u<e0.f> e() {
        return this.f48645j;
    }

    public final void f() {
        f.D(f.G(this.f48643h.x(), new C0624b(null)), this.f48639d);
        f.D(f.G(this.f48643h.s(), new c(null)), this.f48639d);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a
    public void remove() {
        this.f48637b.removeJavascriptInterface("AndroidMraid");
    }
}
