package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.webkit.WebViewClientCompat;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.g0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;

/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 0)
@SuppressLint({"SetJavaScriptEnabled", "ViewConstructor"})
public final class v extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.i0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f48459f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f48460g = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final w f48461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final go.u<Boolean> f48462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final go.u<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> f48463e;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidWebView$loadHtml$2", f = "MraidWebView.kt", l = {65}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements sn.p<l0, hn.c<? super com.moloco.sdk.internal.g0<n, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f48465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ v f48466c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f48467d;

        @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidWebView$loadHtml$2$1", f = "MraidWebView.kt", l = {90}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements sn.p<l0, hn.c<? super com.moloco.sdk.internal.g0<n, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f48468a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f48469b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ v f48470c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f48471d;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.v$b$a$a, reason: collision with other inner class name */
            @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidWebView$loadHtml$2$1$1", f = "MraidWebView.kt", l = {}, m = "invokeSuspend")
            public static final class C0613a extends SuspendLambda implements sn.q<Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d, hn.c<? super Pair<? extends Boolean, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f48472a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public /* synthetic */ boolean f48473b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public /* synthetic */ Object f48474c;

                public C0613a(hn.c<? super C0613a> cVar) {
                    super(3, cVar);
                }

                public final Object a(boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar, hn.c<? super Pair<Boolean, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>> cVar) {
                    C0613a c0613a = new C0613a(cVar);
                    c0613a.f48473b = z10;
                    c0613a.f48474c = dVar;
                    return c0613a.invokeSuspend(bn.r.f5635a);
                }

                @Override // sn.q
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar, hn.c<? super Pair<? extends Boolean, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>> cVar) {
                    return a(bool.booleanValue(), dVar, cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    in.a.g();
                    if (this.f48472a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                    boolean z10 = this.f48473b;
                    return bn.h.a(jn.a.a(z10), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) this.f48474c);
                }
            }

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.v$b$a$b, reason: collision with other inner class name */
            @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidWebView$loadHtml$2$1$2", f = "MraidWebView.kt", l = {}, m = "invokeSuspend")
            public static final class C0614b extends SuspendLambda implements sn.p<Pair<? extends Boolean, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>, hn.c<? super Boolean>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f48475a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public /* synthetic */ Object f48476b;

                public C0614b(hn.c<? super C0614b> cVar) {
                    super(2, cVar);
                }

                @Override // sn.p
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object mo2invoke(Pair<Boolean, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> pair, hn.c<? super Boolean> cVar) {
                    return ((C0614b) create(pair, cVar)).invokeSuspend(bn.r.f5635a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                    C0614b c0614b = new C0614b(cVar);
                    c0614b.f48476b = obj;
                    return c0614b;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    in.a.g();
                    if (this.f48475a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                    Pair pair = (Pair) this.f48476b;
                    return jn.a.a(((Boolean) pair.component1()).booleanValue() || ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) pair.component2()) != null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z10, v vVar, String str, hn.c<? super a> cVar) {
                super(2, cVar);
                this.f48469b = z10;
                this.f48470c = vVar;
                this.f48471d = str;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(l0 l0Var, hn.c<? super com.moloco.sdk.internal.g0<n, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>> cVar) {
                return ((a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                return new a(this.f48469b, this.f48470c, this.f48471d, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objG = in.a.g();
                int i10 = this.f48468a;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    try {
                        if (this.f48469b) {
                            Context context = this.f48470c.getContext();
                            tn.p.j(context, "getContext(...)");
                            j0.a(this.f48470c, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.x(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.s(context), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.u(), null, 4, null).a(this.f48471d));
                        } else {
                            j0.a(this.f48470c, this.f48471d);
                        }
                        go.d dVarA = go.f.A(this.f48470c.f48461c.e(), this.f48470c.f48461c.c(), new C0613a(null));
                        C0614b c0614b = new C0614b(null);
                        this.f48468a = 1;
                        obj = go.f.w(dVarA, c0614b, this);
                        if (obj == objG) {
                            return objG;
                        }
                    } catch (Exception e10) {
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, "MraidWebView", e10.toString(), null, false, 12, null);
                        return new g0.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f48053c);
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                }
                Pair pair = (Pair) obj;
                boolean zBooleanValue = ((Boolean) pair.component1()).booleanValue();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) pair.component2();
                return dVar != null ? new g0.a(dVar) : zBooleanValue ? new g0.b(new n(null, 1, null)) : new g0.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f48054d);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, v vVar, String str, hn.c<? super b> cVar) {
            super(2, cVar);
            this.f48465b = z10;
            this.f48466c = vVar;
            this.f48467d = str;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super com.moloco.sdk.internal.g0<n, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return new b(this.f48465b, this.f48466c, this.f48467d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f48464a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                kotlin.coroutines.d main = com.moloco.sdk.internal.scheduling.c.a().getMain();
                a aVar = new a(this.f48465b, this.f48466c, this.f48467d, null);
                this.f48464a = 1;
                obj = p000do.g.g(main, aVar, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(@NotNull Context context, @NotNull f0 f0Var) {
        super(context);
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(f0Var, "mraidJsCommandUrlSource");
        WebView.setWebContentsDebuggingEnabled(false);
        setScrollBarStyle(0);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setScrollContainer(false);
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setMediaPlaybackRequiresUserGesture(true);
        setVisibility(8);
        w wVar = new w(context, f0Var);
        setWebViewClient(wVar);
        this.f48461c = wVar;
        this.f48462d = wVar.e();
        this.f48463e = wVar.c();
    }

    @Nullable
    public final Object b(@NotNull String str, boolean z10, @NotNull hn.c<? super com.moloco.sdk.internal.g0<n, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>> cVar) {
        return kotlinx.coroutines.d.f(new b(z10, this, str, null), cVar);
    }

    @NotNull
    public final go.u<Boolean> c() {
        return this.f48462d;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.i0, android.webkit.WebView
    public void destroy() {
        super.destroy();
        setWebViewClient(new WebViewClientCompat());
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.i0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.D, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @NotNull
    public final go.u<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> getUnrecoverableError() {
        return this.f48463e;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.i0, android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }
}
