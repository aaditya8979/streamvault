package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 0)
@VisibleForTesting
public final class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public static sn.b<? super Context, ? super WebView, ? super Integer, ? super go.l<Boolean>, ? super sn.l<? super a.AbstractC0696a.c, bn.r>, ? super sn.a<bn.r>, ? super sn.a<bn.r>, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0, ? super Dp, ? super Boolean, ? extends View> f48380d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public static sn.a<bn.r> f48382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public static n f48383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 f48384h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public static sn.a<bn.r> f48385i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b f48388l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a f48389m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public static com.moloco.sdk.acm.recorder.a f48390n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j f48377a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static WeakReference<b0> f48378b = new WeakReference<>(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static WeakReference<Activity> f48379c = new WeakReference<>(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static sn.p<? super Composer, ? super Integer, ? extends sn.c<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.a<bn.r>, ? super sn.l<? super a.AbstractC0696a.c, bn.r>, ? super Boolean, ? super bn.k, ? super bn.k, ? super sn.a<bn.r>, ? super Composer, ? super Integer, bn.r>> f48381e = a.f48392b;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static sn.a<bn.r> f48386j = new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.h
        @Override // sn.a
        public final Object invoke() {
            return j.B();
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static sn.a<bn.r> f48387k = new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.i
        @Override // sn.a
        public final Object invoke() {
            return j.A();
        }
    };

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f48391o = 8;

    public static final class a implements sn.p<Composer, Integer, sn.c<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.a<? extends bn.r>, ? super sn.l<? super a.AbstractC0696a.c, ? extends bn.r>, ? super Boolean, ? super bn.k, ? super bn.k, ? super sn.a<? extends bn.r>, ? super Composer, ? super Integer, ? extends bn.r>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f48392b = new a();

        @Composable
        public final sn.c<BoxScope, Boolean, Boolean, sn.a<bn.r>, sn.l<? super a.AbstractC0696a.c, bn.r>, Boolean, bn.k, bn.k, sn.a<bn.r>, Composer, Integer, bn.r> a(Composer composer, int i10) {
            composer.startReplaceableGroup(-1525839088);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1525839088, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivityDataHolder.closeButton.<anonymous> (MraidActivity.kt:331)");
            }
            sn.c<BoxScope, Boolean, Boolean, sn.a<bn.r>, sn.l<? super a.AbstractC0696a.c, bn.r>, Boolean, bn.k, bn.k, sn.a<bn.r>, Composer, Integer, bn.r> cVarB = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d0.b(null, null, 0L, 0L, 0L, null, null, null, composer, 0, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return cVarB;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ sn.c<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.a<? extends bn.r>, ? super sn.l<? super a.AbstractC0696a.c, ? extends bn.r>, ? super Boolean, ? super bn.k, ? super bn.k, ? super sn.a<? extends bn.r>, ? super Composer, ? super Integer, ? extends bn.r> mo2invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    public static final bn.r A() {
        return bn.r.f5635a;
    }

    public static final bn.r B() {
        return bn.r.f5635a;
    }

    @Nullable
    public final n a() {
        return f48383g;
    }

    public final void b(@Nullable Activity activity) {
        f48379c = new WeakReference<>(activity);
    }

    public final void c(@Nullable com.moloco.sdk.acm.recorder.a aVar) {
        f48390n = aVar;
    }

    public final void d(@Nullable n nVar) {
        f48383g = nVar;
    }

    public final void e(@Nullable b0 b0Var) {
        f48378b = new WeakReference<>(b0Var);
    }

    public final void f(@Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a aVar) {
        f48389m = aVar;
    }

    public final void g(@Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b bVar) {
        f48388l = bVar;
    }

    public final void h(@Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var) {
        f48384h = e0Var;
    }

    public final void i(@Nullable sn.a<bn.r> aVar) {
        f48382f = aVar;
    }

    public final void j(@Nullable sn.b<? super Context, ? super WebView, ? super Integer, ? super go.l<Boolean>, ? super sn.l<? super a.AbstractC0696a.c, bn.r>, ? super sn.a<bn.r>, ? super sn.a<bn.r>, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0, ? super Dp, ? super Boolean, ? extends View> bVar) {
        f48380d = bVar;
    }

    public final void k(@NotNull sn.p<? super Composer, ? super Integer, ? extends sn.c<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.a<bn.r>, ? super sn.l<? super a.AbstractC0696a.c, bn.r>, ? super Boolean, ? super bn.k, ? super bn.k, ? super sn.a<bn.r>, ? super Composer, ? super Integer, bn.r>> pVar) {
        tn.p.k(pVar, "<set-?>");
        f48381e = pVar;
    }

    @Nullable
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a l() {
        return f48389m;
    }

    public final void m(@NotNull sn.a<bn.r> aVar) {
        tn.p.k(aVar, "<set-?>");
        f48387k = aVar;
    }

    @Nullable
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b n() {
        return f48388l;
    }

    public final void o(@Nullable sn.a<bn.r> aVar) {
        f48385i = aVar;
    }

    @NotNull
    public final sn.p<Composer, Integer, sn.c<BoxScope, Boolean, Boolean, sn.a<bn.r>, sn.l<? super a.AbstractC0696a.c, bn.r>, Boolean, bn.k, bn.k, sn.a<bn.r>, Composer, Integer, bn.r>> p() {
        return f48381e;
    }

    public final void q(@NotNull sn.a<bn.r> aVar) {
        tn.p.k(aVar, "<set-?>");
        f48386j = aVar;
    }

    @Nullable
    public final com.moloco.sdk.acm.recorder.a r() {
        return f48390n;
    }

    @Nullable
    public final sn.b<Context, WebView, Integer, go.l<Boolean>, sn.l<? super a.AbstractC0696a.c, bn.r>, sn.a<bn.r>, sn.a<bn.r>, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0, Dp, Boolean, View> s() {
        return f48380d;
    }

    @Nullable
    public final sn.a<bn.r> t() {
        return f48382f;
    }

    @NotNull
    public final sn.a<bn.r> u() {
        return f48387k;
    }

    @Nullable
    public final sn.a<bn.r> v() {
        return f48385i;
    }

    @NotNull
    public final sn.a<bn.r> w() {
        return f48386j;
    }

    @Nullable
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 x() {
        return f48384h;
    }

    @Nullable
    public final Activity y() {
        return f48379c.get();
    }

    @Nullable
    public final b0 z() {
        return f48378b.get();
    }
}
