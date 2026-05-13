package com.fyber.inneractive.sdk.player.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.h1;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e extends RelativeLayout implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g1 f19016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s0 f19018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public UnitDisplayType f19019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f19020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f19021f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n f19022g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f19023h;

    public e(Context context) {
        super(context, null, 0);
        this.f19016a = new g1();
        this.f19017b = 0;
        this.f19020e = false;
        this.f19021f = false;
        this.f19023h = false;
        this.f19017b = Math.min(com.fyber.inneractive.sdk.util.o.e(), com.fyber.inneractive.sdk.util.o.d());
    }

    public abstract void a(h1 h1Var, int i10, int i11);

    @Override // com.fyber.inneractive.sdk.player.ui.m
    public boolean a() {
        return false;
    }

    public void c() {
        this.f19023h = true;
    }

    public void d() {
        this.f19023h = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f53142p, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        boolean globalVisibleRect = isShown() && hasWindowFocus() && this.f19021f && !this.f19023h;
        if (globalVisibleRect) {
            globalVisibleRect = getGlobalVisibleRect(new Rect());
        }
        if (globalVisibleRect == this.f19020e || this.f19022g == null) {
            return;
        }
        IAlog.a("%supdateVisibility changing to %s", IAlog.a(this), Boolean.valueOf(globalVisibleRect));
        this.f19020e = globalVisibleRect;
        this.f19022g.a(globalVisibleRect);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        IAlog.a("%sGot onAttachedToWindow: mIsAttached = %s", IAlog.a(this), Boolean.valueOf(this.f19021f));
        this.f19021f = true;
        n nVar = this.f19022g;
        if (nVar != null) {
            nVar.a();
        }
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        IAlog.a("%sGot onDetachedFromWindow: mIsAttached = %s", IAlog.a(this), Boolean.valueOf(this.f19021f));
        this.f19021f = false;
        n nVar = this.f19022g;
        if (nVar != null) {
            nVar.c();
        }
        e();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (equals(view)) {
            IAlog.a("%sgot onVisibilityChanged with %d", IAlog.a(this), Integer.valueOf(i10));
            e();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        IAlog.a("%sgot onWindowFocusChanged with: %s", IAlog.a(this), Boolean.valueOf(z10));
        com.fyber.inneractive.sdk.util.r.f19556b.postDelayed(new d(this, z10), 500L);
    }

    public void setListener(n nVar) {
        this.f19022g = nVar;
    }

    public void setUnitConfig(s0 s0Var) {
        this.f19018c = s0Var;
        r0 r0Var = (r0) s0Var;
        this.f19019d = r0Var.f16097e == null ? r0Var.f16098f.f16158j : UnitDisplayType.DEFAULT;
    }
}
