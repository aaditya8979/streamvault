package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebSettings;
import androidx.compose.runtime.internal.StabilityInferred;
import bn.h;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.g0;
import com.moloco.sdk.internal.services.f0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.i0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import go.f;
import go.p;
import go.u;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import jn.d;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.q;
import tn.i;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
@SuppressLint({"SetJavaScriptEnabled", "ViewConstructor"})
public final class a extends i0 implements r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final l0 f48537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final f0 f48538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final s f48539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f48540f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final c f48541g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final u<g> f48542h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final p<bn.r> f48543i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final u<Boolean> f48544j;

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a$a, reason: collision with other inner class name */
    @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticWebView$loadHtml$2", f = "StaticWebView.kt", l = {113}, m = "invokeSuspend")
    public static final class C0617a extends SuspendLambda implements sn.p<l0, hn.c<? super g0<bn.r, g>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48545a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f48547c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f48548d;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a$a$a, reason: collision with other inner class name */
        @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticWebView$loadHtml$2$isLoadOperationTimedOut$1", f = "StaticWebView.kt", l = {119}, m = "invokeSuspend")
        public static final class C0618a extends SuspendLambda implements sn.p<l0, hn.c<? super Pair<? extends Boolean, ? extends g>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f48549a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f48550b;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a$a$a$a, reason: collision with other inner class name */
            @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticWebView$loadHtml$2$isLoadOperationTimedOut$1$1", f = "StaticWebView.kt", l = {}, m = "invokeSuspend")
            public static final class C0619a extends SuspendLambda implements q<Boolean, g, hn.c<? super Pair<? extends Boolean, ? extends g>>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f48551a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public /* synthetic */ boolean f48552b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public /* synthetic */ Object f48553c;

                public C0619a(hn.c<? super C0619a> cVar) {
                    super(3, cVar);
                }

                public final Object a(boolean z10, g gVar, hn.c<? super Pair<Boolean, ? extends g>> cVar) {
                    C0619a c0619a = new C0619a(cVar);
                    c0619a.f48552b = z10;
                    c0619a.f48553c = gVar;
                    return c0619a.invokeSuspend(bn.r.f5635a);
                }

                @Override // sn.q
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, g gVar, hn.c<? super Pair<? extends Boolean, ? extends g>> cVar) {
                    return a(bool.booleanValue(), gVar, cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    in.a.g();
                    if (this.f48551a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                    boolean z10 = this.f48552b;
                    return h.a(jn.a.a(z10), (g) this.f48553c);
                }
            }

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a$a$a$b */
            @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticWebView$loadHtml$2$isLoadOperationTimedOut$1$2", f = "StaticWebView.kt", l = {}, m = "invokeSuspend")
            public static final class b extends SuspendLambda implements sn.p<Pair<? extends Boolean, ? extends g>, hn.c<? super Boolean>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f48554a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public /* synthetic */ Object f48555b;

                public b(hn.c<? super b> cVar) {
                    super(2, cVar);
                }

                @Override // sn.p
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object mo2invoke(Pair<Boolean, ? extends g> pair, hn.c<? super Boolean> cVar) {
                    return ((b) create(pair, cVar)).invokeSuspend(bn.r.f5635a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                    b bVar = new b(cVar);
                    bVar.f48555b = obj;
                    return bVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    in.a.g();
                    if (this.f48554a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                    Pair pair = (Pair) this.f48555b;
                    return jn.a.a(((Boolean) pair.component1()).booleanValue() || ((g) pair.component2()) != null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0618a(a aVar, hn.c<? super C0618a> cVar) {
                super(2, cVar);
                this.f48550b = aVar;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(l0 l0Var, hn.c<? super Pair<Boolean, ? extends g>> cVar) {
                return ((C0618a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                return new C0618a(this.f48550b, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objG = in.a.g();
                int i10 = this.f48549a;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    go.d dVarA = f.A(this.f48550b.f48541g.u(), this.f48550b.f48541g.s(), new C0619a(null));
                    b bVar = new b(null);
                    this.f48549a = 1;
                    obj = f.w(dVarA, bVar, this);
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
        public C0617a(String str, long j10, hn.c<? super C0617a> cVar) {
            super(2, cVar);
            this.f48547c = str;
            this.f48548d = j10;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super g0<bn.r, g>> cVar) {
            return ((C0617a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return a.this.new C0617a(this.f48547c, this.f48548d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f48545a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                try {
                    a aVar = a.this;
                    j0.a(aVar, aVar.getHtmlCssFixer().a(this.f48547c));
                    long j10 = this.f48548d;
                    C0618a c0618a = new C0618a(a.this, null);
                    this.f48545a = 1;
                    obj = TimeoutKt.f(j10, c0618a, this);
                    if (obj == objG) {
                        return objG;
                    }
                } catch (Exception e10) {
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, "StaticWebView", "loadHtml", e10, false, 8, null);
                    return new g0.a(g.f48076b);
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            if (obj == null) {
                a.this.f48541g.e();
            }
            boolean zBooleanValue = a.this.f48541g.u().getValue().booleanValue();
            g value = a.this.f48541g.s().getValue();
            return value != null ? new g0.a(value) : zBooleanValue ? new g0.b(bn.r.f5635a) : new g0.a(g.f48075a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, @NotNull l0 l0Var, @NotNull f0 f0Var, @NotNull s sVar, boolean z10, @NotNull c cVar) {
        super(context);
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(l0Var, "scope");
        tn.p.k(f0Var, "clickthroughService");
        tn.p.k(sVar, "buttonTracker");
        tn.p.k(cVar, "webViewClientImpl");
        this.f48537c = l0Var;
        this.f48538d = f0Var;
        this.f48539e = sVar;
        this.f48540f = z10;
        this.f48541g = cVar;
        setWebViewClient(cVar);
        setScrollBarStyle(0);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        setBackgroundColor(0);
        setVisibility(8);
        this.f48542h = cVar.s();
        this.f48543i = cVar.j();
        this.f48544j = cVar.v();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a(Context context, l0 l0Var, f0 f0Var, s sVar, boolean z10, c cVar, int i10, i iVar) {
        l0 l0VarA = (i10 & 2) != 0 ? kotlinx.coroutines.d.a(com.moloco.sdk.internal.scheduling.c.a().getMain()) : l0Var;
        this(context, l0VarA, f0Var, sVar, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? new c(l0VarA, f0Var, sVar) : cVar);
    }

    @Nullable
    public final Object b(@NotNull String str, long j10, @NotNull hn.c<? super g0<bn.r, g>> cVar) {
        return p000do.g.g(com.moloco.sdk.internal.scheduling.c.a().getMain(), new C0617a(str, j10, null), cVar);
    }

    @NotNull
    public final u<Boolean> c() {
        return this.f48544j;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.i0, android.webkit.WebView
    public void destroy() {
        super.destroy();
        kotlinx.coroutines.d.e(this.f48537c, null, 1, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.i0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.D, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @NotNull
    public final p<bn.r> getClickthroughEvent() {
        return this.f48543i;
    }

    @NotNull
    public final u<g> getUnrecoverableError() {
        return this.f48542h;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r
    public void l(@NotNull a.AbstractC0696a.c cVar) {
        tn.p.k(cVar, "button");
        this.f48541g.l(cVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r
    public void o(@NotNull a.AbstractC0696a.c.EnumC0698a enumC0698a) {
        tn.p.k(enumC0698a, "buttonType");
        this.f48541g.o(enumC0698a);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.i0, android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        tn.p.k(motionEvent, "event");
        if (this.f48540f) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            this.f48541g.b(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a(cn.r.V(iArr), cn.r.o0(iArr), getHeight(), getWidth(), (int) (motionEvent.getX() + cn.r.V(iArr)), (int) (motionEvent.getY() + cn.r.o0(iArr))));
        }
        return super.onTouchEvent(motionEvent);
    }
}
