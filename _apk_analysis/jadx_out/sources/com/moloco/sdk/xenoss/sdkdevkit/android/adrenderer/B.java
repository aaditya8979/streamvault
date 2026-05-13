package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;

/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 0)
public abstract class B<T extends m> extends FrameLayout implements q, k, j, r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final l0 f47686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public T f47687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public View f47688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final bn.g f47689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final go.l<Boolean> f47690f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final bn.g f47691g;

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.XenossBannerView$isAdDisplaying$2$1", f = "XenossBannerView.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements sn.q<Boolean, Boolean, hn.c<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f47693b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ boolean f47694c;

        public a(hn.c<? super a> cVar) {
            super(3, cVar);
        }

        public final Object a(boolean z10, boolean z11, hn.c<? super Boolean> cVar) {
            a aVar = new a(cVar);
            aVar.f47693b = z10;
            aVar.f47694c = z11;
            return aVar.invokeSuspend(bn.r.f5635a);
        }

        @Override // sn.q
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, hn.c<? super Boolean> cVar) {
            return a(bool.booleanValue(), bool2.booleanValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f47692a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            return jn.a.a(this.f47693b && this.f47694c);
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.XenossBannerView$load$1", f = "XenossBannerView.kt", l = {59}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ B<T> f47696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f47697c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k.a f47698d;

        @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.XenossBannerView$load$1$1", f = "XenossBannerView.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements sn.p<Boolean, hn.c<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f47699a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ boolean f47700b;

            public a(hn.c<? super a> cVar) {
                super(2, cVar);
            }

            public final Object a(boolean z10, hn.c<? super Boolean> cVar) {
                return ((a) create(Boolean.valueOf(z10), cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                a aVar = new a(cVar);
                aVar.f47700b = ((Boolean) obj).booleanValue();
                return aVar;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo2invoke(Boolean bool, hn.c<? super Boolean> cVar) {
                return a(bool.booleanValue(), cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                in.a.g();
                if (this.f47699a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                return jn.a.a(this.f47700b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(B<T> b10, long j10, k.a aVar, hn.c<? super b> cVar) {
            super(2, cVar);
            this.f47696b = b10;
            this.f47697c = j10;
            this.f47698d = aVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return new b(this.f47696b, this.f47697c, this.f47698d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f47695a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                this.f47696b.getAdLoader().i(this.f47697c, this.f47698d);
                go.u<Boolean> uVarIsLoaded = this.f47696b.isLoaded();
                a aVar = new a(null);
                this.f47695a = 1;
                if (go.f.w(uVarIsLoaded, aVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            this.f47696b.s();
            return bn.r.f5635a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(@NotNull Context context, @NotNull l0 l0Var) {
        super(context);
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(l0Var, "scope");
        this.f47686b = l0Var;
        this.f47689e = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g
            @Override // sn.a
            public final Object invoke() {
                return B.l(this.f47722b);
            }
        });
        this.f47690f = go.v.a(Boolean.FALSE);
        this.f47691g = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
            @Override // sn.a
            public final Object invoke() {
                return B.j(this.f47725b);
            }
        });
    }

    @VisibleForTesting(otherwise = 4)
    public static /* synthetic */ void getAdView$annotations() {
    }

    public static final go.u j(B b10) {
        return go.f.M(go.f.A(b10.isLoaded(), b10.f47690f, new a(null)), b10.f47686b, kotlinx.coroutines.flow.a.f73397a.c(), Boolean.FALSE);
    }

    public static final go.u l(B b10) {
        return b10.getAdLoader().isLoaded();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r
    public void destroy() {
        kotlinx.coroutines.d.e(this.f47686b, null, 1, null);
        setAdView(null);
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.D, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @NotNull
    public abstract k getAdLoader();

    @Nullable
    public T getAdShowListener() {
        return this.f47687c;
    }

    @Nullable
    public final View getAdView() {
        return this.f47688d;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
    @Nullable
    public abstract /* synthetic */ i getCreativeType();

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void i(long j10, @Nullable k.a aVar) {
        p000do.i.d(this.f47686b, null, null, new b(this, j10, aVar, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    @NotNull
    public go.u<Boolean> isLoaded() {
        return (go.u) this.f47689e.getValue();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    @NotNull
    public go.u<Boolean> l() {
        return (go.u) this.f47691g.getValue();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NotNull View view, int i10) {
        tn.p.k(view, "changedView");
        super.onVisibilityChanged(view, i10);
        this.f47690f.setValue(Boolean.valueOf(i10 == 0));
    }

    public abstract void s();

    public void setAdShowListener(@Nullable T t10) {
        this.f47687c = t10;
    }

    public final void setAdView(@Nullable View view) {
        View view2 = this.f47688d;
        this.f47688d = view;
        removeAllViews();
        ComposeView composeView = view2 instanceof ComposeView ? (ComposeView) view2 : null;
        if (composeView != null) {
            composeView.disposeComposition();
        }
        if (view != null) {
            addView(view, new ViewGroup.LayoutParams(-1, -1));
        }
    }
}
