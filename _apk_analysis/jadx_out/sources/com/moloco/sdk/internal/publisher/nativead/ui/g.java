package com.moloco.sdk.internal.publisher.nativead.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.ComposeView;
import bn.r;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.y;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.p;
import sn.q;

/* JADX INFO: loaded from: classes6.dex */
@StabilityInferred(parameters = 0)
@SuppressLint({"ViewConstructor"})
public final class g extends FrameLayout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f46916e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f46917f = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a f46918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.a f46919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public ComposeView f46920d;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public static final class b implements q<Modifier, Composer, Integer, r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e0 f46921b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f46922c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ sn.a<r> f46923d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ c0 f46924e;

        public static final class a implements p<Composer, Integer, r> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f46925b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ sn.a<r> f46926c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Modifier f46927d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ c0 f46928e;

            public a(g gVar, sn.a<r> aVar, Modifier modifier, c0 c0Var) {
                this.f46925b = gVar;
                this.f46926c = aVar;
                this.f46927d = modifier;
                this.f46928e = c0Var;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1035844210, i10, -1, "com.moloco.sdk.internal.publisher.nativead.ui.NativeAdVideoContainer.videoView.<anonymous>.<anonymous> (NativeAdVideoContainer.kt:57)");
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar = this.f46925b.f46918b;
                long jM1645getBlack0d7_KjU = Color.INSTANCE.m1645getBlack0d7_KjU();
                sn.a<r> aVar2 = this.f46926c;
                y yVar = new y(aVar2, aVar2, aVar2);
                n.i(aVar, this.f46927d, jM1645getBlack0d7_KjU, h.a(composer, 0), null, null, null, null, yVar, null, null, a0.a(i.a(), composer, 6, 0), this.f46928e, composer, 818110848, 0, 1088);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo2invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return r.f5635a;
            }
        }

        public b(e0 e0Var, g gVar, sn.a<r> aVar, c0 c0Var) {
            this.f46921b = e0Var;
            this.f46922c = gVar;
            this.f46923d = aVar;
            this.f46924e = c0Var;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void a(Modifier modifier, Composer composer, int i10) {
            tn.p.k(modifier, "modifier");
            if ((i10 & 6) == 0) {
                i10 |= composer.changed(modifier) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1867022133, i10, -1, "com.moloco.sdk.internal.publisher.nativead.ui.NativeAdVideoContainer.videoView.<anonymous> (NativeAdVideoContainer.kt:56)");
            }
            this.f46921b.a(ComposableLambdaKt.composableLambda(composer, 1035844210, true, new a(this.f46922c, this.f46923d, modifier, this.f46924e)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // sn.q
        public /* bridge */ /* synthetic */ r invoke(Modifier modifier, Composer composer, Integer num) {
            a(modifier, composer, num.intValue());
            return r.f5635a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@NotNull Context context, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar, @NotNull c0 c0Var, @NotNull com.moloco.sdk.internal.a aVar2, @NotNull e0 e0Var, @Nullable sn.a<r> aVar3) {
        super(context);
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(aVar, "vastAdController");
        tn.p.k(c0Var, "viewVisibilityTracker");
        tn.p.k(aVar2, "viewLifecycleOwner");
        tn.p.k(e0Var, "watermark");
        this.f46918b = aVar;
        this.f46919c = aVar2;
        ComposeView composeViewA = c.a(context, ComposableLambdaKt.composableLambdaInstance(1867022133, true, new b(e0Var, this, aVar3, c0Var)));
        addView(composeViewA, new ViewGroup.LayoutParams(-1, -1));
        this.f46920d = composeViewA;
    }

    @VisibleForTesting
    public static /* synthetic */ void getVideoView$annotations() {
    }

    public final void b() {
        this.f46918b.destroy();
        c();
    }

    public final void c() {
        removeAllViews();
        ComposeView composeView = this.f46920d;
        if (composeView != null) {
            composeView.disposeComposition();
        }
        this.f46920d = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.D, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public final ComposeView getVideoView() {
        return this.f46920d;
    }

    @Override // android.view.ViewGroup, android.view.View
    @VisibleForTesting(otherwise = 4)
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "VideoContainer", "onAttachedToWindow", null, false, 12, null);
        this.f46919c.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    @VisibleForTesting(otherwise = 4)
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "VideoContainer", "onDetachedFromWindow", null, false, 12, null);
        this.f46919c.b(this);
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
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            this.f46919c.d(this);
        } else {
            this.f46919c.c(this);
        }
    }

    public final void setVideoView(@Nullable ComposeView composeView) {
        this.f46920d = composeView;
    }
}
