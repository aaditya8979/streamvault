package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.mbridge.msdk.MBridgeConstans;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import p000do.s0;

/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 0)
public final class u implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final View f48443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final l0 f48444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public kotlinx.coroutines.g f48445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final View.OnLayoutChangeListener f48446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final go.l<Boolean> f48447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final go.u<Boolean> f48448g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final h0 f48449h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final go.l<a> f48450i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final go.u<a> f48451j;

    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final h0 f48452a;

        public a(@NotNull h0 h0Var) {
            tn.p.k(h0Var, "value");
            this.f48452a = h0Var;
        }

        @NotNull
        public final h0 a() {
            return this.f48452a;
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidViewVisualMetricsTracker$layoutChangeListener$1$1", f = "MraidViewVisualMetricsTracker.kt", l = {41}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48453a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f48455c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f48456d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f48457e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f48458f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, int i11, int i12, int i13, hn.c<? super b> cVar) {
            super(2, cVar);
            this.f48455c = i10;
            this.f48456d = i11;
            this.f48457e = i12;
            this.f48458f = i13;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return u.this.new b(this.f48455c, this.f48456d, this.f48457e, this.f48458f, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f48453a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                this.f48453a = 1;
                if (s0.a(200L, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            u.this.y();
            u.this.i(this.f48455c, this.f48456d, this.f48457e, this.f48458f);
            return bn.r.f5635a;
        }
    }

    public u(@NotNull View view, @NotNull Context context, @NotNull l0 l0Var) {
        tn.p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(l0Var, "scope");
        this.f48443b = view;
        this.f48444c = kotlinx.coroutines.d.i(l0Var, com.moloco.sdk.internal.scheduling.c.a().getMain());
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.i0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                u.o(this.f48376b, view2, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        };
        this.f48446e = onLayoutChangeListener;
        view.addOnLayoutChangeListener(onLayoutChangeListener);
        go.l<Boolean> lVarA = go.v.a(Boolean.FALSE);
        this.f48447f = lVarA;
        this.f48448g = lVarA;
        h0 h0Var = new h0(context);
        this.f48449h = h0Var;
        go.l<a> lVarA2 = go.v.a(new a(h0Var));
        this.f48450i = lVarA2;
        this.f48451j = lVarA2;
    }

    public static final void o(u uVar, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        kotlinx.coroutines.g gVar = uVar.f48445d;
        if (gVar != null) {
            g.a.a(gVar, null, 1, null);
        }
        uVar.f48445d = p000do.i.d(uVar.f48444c, null, null, uVar.new b(i10, i11, i12, i13, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r
    public void destroy() {
        kotlinx.coroutines.g gVar = this.f48445d;
        if (gVar != null) {
            g.a.a(gVar, null, 1, null);
        }
        this.f48443b.removeOnLayoutChangeListener(this.f48446e);
    }

    public final void i(int i10, int i11, int i12, int i13) {
        Rect rect = new Rect(i10, i11, i12, i13);
        int iWidth = rect.width();
        int iHeight = rect.height();
        h0 h0Var = this.f48449h;
        h0Var.b(i10, i11, iWidth, iHeight);
        h0Var.e(i10, i11, iWidth, iHeight);
        h0Var.f(i10, i11, iWidth, iHeight);
        h0Var.a(iWidth, iHeight);
        this.f48450i.setValue(new a(this.f48449h));
    }

    @NotNull
    public final go.u<a> s() {
        return this.f48451j;
    }

    @NotNull
    public final go.u<Boolean> x() {
        return this.f48448g;
    }

    public final void y() {
        this.f48447f.setValue(Boolean.valueOf(this.f48443b.isShown()));
    }
}
