package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import com.moloco.sdk.internal.ortb.model.C4377a;
import com.moloco.sdk.internal.ortb.model.C4378b;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.b;

/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 1)
public final class n implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final b<Context, WebView, Integer, go.l<Boolean>, sn.l<? super a.AbstractC0696a.c, bn.r>, sn.a<bn.r>, sn.a<bn.r>, e0, Dp, Boolean, View> f50923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f50924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final sn.p<Composer, Integer, sn.c<BoxScope, Boolean, Boolean, sn.a<bn.r>, sn.l<? super a.AbstractC0696a.c, bn.r>, Boolean, bn.k, bn.k, sn.a<bn.r>, Composer, Integer, bn.r>> f50925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final C4377a f50926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final C4378b f50927f;

    public static final class a implements sn.p<Composer, Integer, sn.c<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.a<? extends bn.r>, ? super sn.l<? super a.AbstractC0696a.c, ? extends bn.r>, ? super Boolean, ? super bn.k, ? super bn.k, ? super sn.a<? extends bn.r>, ? super Composer, ? super Integer, ? extends bn.r>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f50928b = new a();

        @Composable
        public final sn.c<BoxScope, Boolean, Boolean, sn.a<bn.r>, sn.l<? super a.AbstractC0696a.c, bn.r>, Boolean, bn.k, bn.k, sn.a<bn.r>, Composer, Integer, bn.r> a(Composer composer, int i10) {
            composer.startReplaceableGroup(48977993);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(48977993, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.AdWebViewOptions.<init>.<anonymous> (AdRenderingOptions.kt:27)");
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

    public n() {
        this(0, null, 0, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(int i10, @NotNull b<? super Context, ? super WebView, ? super Integer, ? super go.l<Boolean>, ? super sn.l<? super a.AbstractC0696a.c, bn.r>, ? super sn.a<bn.r>, ? super sn.a<bn.r>, ? super e0, ? super Dp, ? super Boolean, ? extends View> bVar, int i11, @NotNull sn.p<? super Composer, ? super Integer, ? extends sn.c<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.a<bn.r>, ? super sn.l<? super a.AbstractC0696a.c, bn.r>, ? super Boolean, ? super bn.k, ? super bn.k, ? super sn.a<bn.r>, ? super Composer, ? super Integer, bn.r>> pVar, @Nullable C4377a c4377a, @Nullable C4378b c4378b) {
        tn.p.k(bVar, "adWebViewRenderer");
        tn.p.k(pVar, "decClose");
        this.f50922a = i10;
        this.f50923b = bVar;
        this.f50924c = i11;
        this.f50925d = pVar;
        this.f50926e = c4377a;
        this.f50927f = c4378b;
    }

    public /* synthetic */ n(int i10, b bVar, int i11, sn.p pVar, C4377a c4377a, C4378b c4378b, int i12, tn.i iVar) {
        this((i12 & 1) != 0 ? 5 : i10, (i12 & 2) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b.j(0L, null, 3, null) : bVar, (i12 & 4) == 0 ? i11 : 5, (i12 & 8) != 0 ? a.f50928b : pVar, (i12 & 16) != 0 ? null : c4377a, (i12 & 32) != 0 ? null : c4378b);
    }

    @NotNull
    public final b<Context, WebView, Integer, go.l<Boolean>, sn.l<? super a.AbstractC0696a.c, bn.r>, sn.a<bn.r>, sn.a<bn.r>, e0, Dp, Boolean, View> a() {
        return this.f50923b;
    }

    @Nullable
    public final C4377a b() {
        return this.f50926e;
    }

    @Nullable
    public final C4378b c() {
        return this.f50927f;
    }

    public final int d() {
        return this.f50922a;
    }

    @NotNull
    public final sn.p<Composer, Integer, sn.c<BoxScope, Boolean, Boolean, sn.a<bn.r>, sn.l<? super a.AbstractC0696a.c, bn.r>, Boolean, bn.k, bn.k, sn.a<bn.r>, Composer, Integer, bn.r>> e() {
        return this.f50925d;
    }

    public final int f() {
        return this.f50924c;
    }
}
